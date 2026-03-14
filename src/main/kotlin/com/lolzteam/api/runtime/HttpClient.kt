package com.lolzteam.api.runtime

import io.ktor.client.HttpClient as KtorHttpClient
import io.ktor.client.engine.cio.CIO
import io.ktor.client.request.bearerAuth
import io.ktor.client.request.forms.FormDataContent
import io.ktor.client.request.request
import io.ktor.client.request.setBody
import io.ktor.client.statement.bodyAsText
import io.ktor.http.ContentType
import io.ktor.http.HttpMethod
import io.ktor.http.Parameters
import io.ktor.http.contentType
import io.ktor.http.isSuccess
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.boolean
import kotlinx.serialization.json.booleanOrNull
import java.io.Closeable
import java.net.URI

data class RequestOptions(
    val method: String,
    val path: String,
    val query: JsonElement? = null,
    val body: JsonElement? = null,
    val multipart: Boolean = false,
)

class LolzteamHttpClient(config: ClientConfig, httpClient: KtorHttpClient? = null) : Closeable {
    private val baseUrl: String = (config.baseUrl ?: "https://api.zelenka.guru").trimEnd('/')
    private val token: String = config.token
    private val retryConfig: RetryConfig = config.retry
    private val rateLimiter: RateLimiter? = config.rateLimit?.let { RateLimiter(it.requestsPerMinute) }

    internal val json: Json = Json {
        ignoreUnknownKeys = true
        isLenient = true
        coerceInputValues = true
    }

    private val client: KtorHttpClient = httpClient ?: run {
        if (config.proxy != null) {
            val uri = try {
                URI(config.proxy.url)
            } catch (e: Exception) {
                throw ConfigException("invalid proxy URL: ${config.proxy.url}")
            }
            val scheme = uri.scheme?.lowercase()
            if (scheme == null || scheme !in setOf("http", "https", "socks5")) {
                throw ConfigException("unsupported proxy scheme: ${scheme ?: "<none>"}")
            }
            if (uri.host.isNullOrEmpty()) {
                throw ConfigException("proxy URL has no host")
            }
        }
        KtorHttpClient(CIO) {
            engine {
                if (config.proxy != null) {
                    proxy = io.ktor.client.engine.ProxyBuilder.http(io.ktor.http.Url(config.proxy.url))
                }
            }
            expectSuccess = false
        }
    }

    suspend fun request(options: RequestOptions): JsonElement {
        rateLimiter?.acquire()
        return withRetry(retryConfig) { execute(options) }
    }

    private suspend fun execute(options: RequestOptions): JsonElement {
        var url = "$baseUrl${options.path}"
        val queryString = buildQueryString(options.query)
        if (queryString.isNotEmpty()) {
            url += "?$queryString"
        }

        val response = try {
            client.request(url) {
                method = HttpMethod.parse(options.method)
                bearerAuth(token)

                if (options.body != null && options.method != "GET") {
                    if (options.multipart) {
                        val params = Parameters.build {
                            flattenJsonToParams(options.body, this)
                        }
                        setBody(FormDataContent(params))
                    } else {
                        contentType(ContentType.Application.Json)
                        setBody(options.body.toString())
                    }
                }
            }
        } catch (e: Exception) {
            throw NetworkException(e)
        }

        val bodyText = response.bodyAsText()

        if (!response.status.isSuccess()) {
            throw createHttpException(response.status.value, bodyText, response.headers)
        }

        return json.parseToJsonElement(bodyText)
    }

    private fun buildQueryString(query: JsonElement?): String {
        if (query == null || query is JsonNull) return ""
        if (query !is JsonObject) return ""

        val parts = mutableListOf<String>()
        for ((key, value) in query) {
            appendQueryValue(parts, key, value)
        }
        return parts.joinToString("&")
    }

    private fun appendQueryValue(parts: MutableList<String>, key: String, value: JsonElement) {
        when (value) {
            is JsonNull -> {} // skip
            is JsonPrimitive -> {
                val str = if (value.booleanOrNull != null) {
                    if (value.boolean) "1" else "0"
                } else {
                    value.content
                }
                parts.add("${encode(key)}=${encode(str)}")
            }
            is JsonArray -> {
                for (item in value) {
                    appendQueryValue(parts, key, item)
                }
            }
            is JsonObject -> {} // skip nested objects
        }
    }

    private fun flattenJsonToParams(element: JsonElement, builder: io.ktor.http.ParametersBuilder) {
        if (element !is JsonObject) return
        for ((key, value) in element) {
            when (value) {
                is JsonNull -> {}
                is JsonPrimitive -> builder.append(key, value.content)
                is JsonArray -> {
                    for (item in value) {
                        if (item is JsonPrimitive) {
                            builder.append(key, item.content)
                        }
                    }
                }
                is JsonObject -> {}
            }
        }
    }

    private fun encode(value: String): String = java.net.URLEncoder.encode(value, "UTF-8")

    override fun close() {
        client.close()
    }
}
