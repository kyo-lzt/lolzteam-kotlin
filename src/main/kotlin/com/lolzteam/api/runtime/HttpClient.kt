package com.lolzteam.api.runtime

import io.ktor.client.engine.cio.CIO
import io.ktor.client.engine.cio.endpoint
import io.ktor.client.engine.java.Java
import io.ktor.client.plugins.HttpTimeout
import io.ktor.client.request.bearerAuth
import io.ktor.client.request.forms.FormDataContent
import io.ktor.client.request.forms.MultiPartFormDataContent
import io.ktor.client.request.forms.formData
import io.ktor.client.request.request
import io.ktor.client.request.setBody
import io.ktor.client.statement.bodyAsText
import io.ktor.http.ContentType
import io.ktor.http.Headers
import io.ktor.http.HttpHeaders
import io.ktor.http.HttpMethod
import io.ktor.http.Parameters
import io.ktor.http.content.TextContent
import io.ktor.http.isSuccess
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.boolean
import kotlinx.serialization.json.booleanOrNull
import java.io.ByteArrayOutputStream
import java.io.Closeable
import java.net.Authenticator
import java.net.HttpURLConnection
import java.net.InetSocketAddress
import java.net.PasswordAuthentication
import java.net.Proxy
import java.net.URI
import java.net.URLDecoder
import java.util.UUID
import io.ktor.client.HttpClient as KtorHttpClient

data class RequestOptions(
    val method: String,
    val path: String,
    val query: JsonElement? = null,
    val body: JsonElement? = null,
    val bodyEncoding: String = "form",
    val byteArrayFields: Map<String, ByteArray> = emptyMap(),
    val isSearch: Boolean = false,
)

class LolzteamHttpClient(config: ClientConfig, httpClient: KtorHttpClient? = null) : Closeable {
    private val baseUrl: String = (config.baseUrl ?: throw ConfigException("baseUrl is required")).trimEnd('/')
    private val token: String = config.token
    private val retryConfig: RetryConfig? = config.retry
    private val onRetry: ((RetryInfo) -> Unit)? = config.onRetry
    private val rateLimiter: RateLimiter? = config.rateLimit?.let { RateLimiter(it.requestsPerMinute, maxBurst = it.requestsPerMinute.coerceAtMost(30)) }
    private val searchRateLimiter: RateLimiter? = config.searchRateLimit?.let { RateLimiter(it.requestsPerMinute, maxBurst = 1) }
    private val ownsClient: Boolean = httpClient == null
    private val socksProxy: Proxy?
    private val timeoutMs: Long
    private val client: KtorHttpClient

    internal val json: Json =
        Json {
            ignoreUnknownKeys = true
            isLenient = true
            coerceInputValues = true
        }

    init {
        timeoutMs = config.timeout.inWholeMilliseconds

        if (httpClient != null) {
            socksProxy = null
            client = httpClient
        } else {
            val proxyUri =
                if (config.proxy != null) {
                    val uri =
                        try {
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
                    uri
                } else {
                    null
                }
            val proxyScheme = proxyUri?.scheme?.lowercase()
            val connectMs = (config.timeout.inWholeMilliseconds / 3).coerceIn(5_000, 15_000)

            if (proxyScheme == "socks5") {
                // java.net.http.HttpClient (used by Ktor Java engine) ignores SOCKS proxies
                // (JDK-8214516). Ktor CIO's ProxyBuilder.socks() doesn't support auth.
                // Use HttpURLConnection with explicit Proxy object for SOCKS5 instead.
                val port = if (proxyUri!!.port > 0) proxyUri.port else 1080
                socksProxy = Proxy(Proxy.Type.SOCKS, InetSocketAddress(proxyUri.host, port))

                val userInfo = proxyUri.rawUserInfo
                if (userInfo != null) {
                    val colonIdx = userInfo.indexOf(':')
                    val user =
                        if (colonIdx >= 0) {
                            URLDecoder.decode(userInfo.substring(0, colonIdx), "UTF-8")
                        } else {
                            URLDecoder.decode(userInfo, "UTF-8")
                        }
                    val pass =
                        if (colonIdx >= 0) {
                            URLDecoder.decode(userInfo.substring(colonIdx + 1), "UTF-8")
                        } else {
                            ""
                        }
                    val proxyHost = proxyUri.host
                    Authenticator.setDefault(
                        object : Authenticator() {
                            override fun getPasswordAuthentication(): PasswordAuthentication? =
                                // SocksSocketImpl in JDK 21+ calls with RequestorType.SERVER
                                // instead of PROXY, so match on host/port instead.
                                if (requestingHost == proxyHost && requestingPort == port) {
                                    PasswordAuthentication(user, pass.toCharArray())
                                } else {
                                    null
                                }
                        },
                    )
                }

                // Minimal Ktor client (unused for SOCKS5, but field must be initialized)
                client = KtorHttpClient(CIO) {
                    expectSuccess = false
                    install(HttpTimeout) {
                        requestTimeoutMillis = timeoutMs
                        connectTimeoutMillis = connectMs
                    }
                }
            } else if (proxyUri != null && proxyScheme in setOf("http", "https")) {
                socksProxy = null
                client = KtorHttpClient(Java) {
                    engine {
                        proxy = Proxy(
                            Proxy.Type.HTTP,
                            InetSocketAddress(proxyUri.host, proxyUri.port),
                        )
                        val userInfo = proxyUri.userInfo
                        if (userInfo != null) {
                            val parts = userInfo.split(":", limit = 2)
                            val user = URLDecoder.decode(parts[0], "UTF-8")
                            val pass = URLDecoder.decode(parts.getOrElse(1) { "" }, "UTF-8")
                            config {
                                authenticator(
                                    object : Authenticator() {
                                        override fun getPasswordAuthentication(): PasswordAuthentication =
                                            PasswordAuthentication(user, pass.toCharArray())
                                    },
                                )
                            }
                        }
                    }
                    expectSuccess = false
                    install(HttpTimeout) {
                        requestTimeoutMillis = timeoutMs
                        connectTimeoutMillis = connectMs
                    }
                }
            } else {
                socksProxy = null
                client = KtorHttpClient(CIO) {
                    engine {
                        endpoint {
                            connectTimeout = connectMs
                            connectAttempts = 1
                        }
                    }
                    expectSuccess = false
                    install(HttpTimeout) {
                        requestTimeoutMillis = timeoutMs
                        connectTimeoutMillis = connectMs
                    }
                }
            }
        }
    }

    fun <T> lenientDecode(
        deserializer: DeserializationStrategy<T>,
        element: JsonElement,
    ): T = json.lenientDecodeFromJsonElement(deserializer, element)

    suspend fun request(options: RequestOptions): JsonElement {
        rateLimiter?.acquire()
        if (options.isSearch) {
            searchRateLimiter?.acquire()
        }
        if (retryConfig == null) {
            return execute(options)
        }
        return withRetry(retryConfig, options.method, options.path, onRetry) { execute(options) }
    }

    suspend fun requestText(options: RequestOptions): String {
        rateLimiter?.acquire()
        if (options.isSearch) {
            searchRateLimiter?.acquire()
        }
        if (retryConfig == null) {
            return executeText(options)
        }
        return withRetry(retryConfig, options.method, options.path, onRetry) { executeText(options) }
    }

    private suspend fun execute(options: RequestOptions): JsonElement {
        if (socksProxy != null) {
            val bodyText = executeSocks5(options)
            return try {
                json.parseToJsonElement(bodyText)
            } catch (e: Exception) {
                throw NetworkException(e)
            }
        }

        var url = "$baseUrl${options.path}"
        val queryString = buildQueryString(options.query)
        if (queryString.isNotEmpty()) {
            url += "?$queryString"
        }

        val response =
            try {
                client.request(url) {
                    method = HttpMethod.parse(options.method)
                    bearerAuth(token)

                    if (options.method != "GET") {
                        when (options.bodyEncoding) {
                            "multipart" -> {
                                setBody(
                                    MultiPartFormDataContent(
                                        formData {
                                            if (options.body != null) {
                                                flattenJsonToFormParts(options.body, this)
                                            }
                                            for ((name, bytes) in options.byteArrayFields) {
                                                append(
                                                    name,
                                                    bytes,
                                                    Headers.build {
                                                        append(HttpHeaders.ContentDisposition, "filename=\"$name\"")
                                                        append(HttpHeaders.ContentType, "application/octet-stream")
                                                    },
                                                )
                                            }
                                        },
                                    ),
                                )
                            }
                            "json" -> {
                                if (options.body != null) {
                                    setBody(TextContent(options.body.toString(), ContentType.Application.Json))
                                }
                            }
                            else -> {
                                if (options.body != null) {
                                    val params =
                                        Parameters.build {
                                            flattenJsonToParams(options.body, this)
                                        }
                                    setBody(FormDataContent(params))
                                }
                            }
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

        return try {
            json.parseToJsonElement(bodyText)
        } catch (e: Exception) {
            throw NetworkException(e)
        }
    }

    private suspend fun executeText(options: RequestOptions): String {
        if (socksProxy != null) {
            return executeSocks5(options)
        }

        var url = "$baseUrl${options.path}"
        val queryString = buildQueryString(options.query)
        if (queryString.isNotEmpty()) {
            url += "?$queryString"
        }

        val response =
            try {
                client.request(url) {
                    method = HttpMethod.parse(options.method)
                    bearerAuth(token)
                }
            } catch (e: Exception) {
                throw NetworkException(e)
            }

        val bodyText = response.bodyAsText()

        if (!response.status.isSuccess()) {
            throw createHttpException(response.status.value, bodyText, response.headers)
        }

        return bodyText
    }

    /**
     * Executes a request via [HttpURLConnection] through a SOCKS5 proxy.
     * Used because [java.net.http.HttpClient] (and Ktor's Java engine) ignores SOCKS proxies
     * entirely (JDK-8214516), and Ktor CIO's ProxyBuilder.socks() doesn't support auth.
     */
    private fun executeSocks5(options: RequestOptions): String {
        var url = "$baseUrl${options.path}"
        val queryString = buildQueryString(options.query)
        if (queryString.isNotEmpty()) {
            url += "?$queryString"
        }

        var conn: HttpURLConnection? = null
        try {
            conn = URI.create(url).toURL().openConnection(socksProxy!!) as HttpURLConnection
            conn.requestMethod = options.method.uppercase()
            conn.setRequestProperty("Authorization", "Bearer $token")
            conn.instanceFollowRedirects = true

            val millis = timeoutMs.toInt()
            conn.connectTimeout = millis
            conn.readTimeout = millis

            if (options.method.uppercase() != "GET") {
                writeSocks5Body(conn, options)
            }

            val statusCode = conn.responseCode
            val inputStream =
                if (statusCode in 200..299) conn.inputStream else conn.errorStream
            val bodyText = inputStream?.readBytes()?.toString(Charsets.UTF_8) ?: ""

            if (statusCode !in 200..299) {
                val headers = Headers.build {
                    for ((key, values) in conn.headerFields) {
                        if (key != null) {
                            for (v in values) {
                                append(key, v)
                            }
                        }
                    }
                }
                throw createHttpException(statusCode, bodyText, headers)
            }

            return bodyText
        } catch (e: LolzteamException) {
            throw e
        } catch (e: Exception) {
            throw NetworkException(e)
        } finally {
            conn?.disconnect()
        }
    }

    /** Write request body to an [HttpURLConnection] for SOCKS5 requests. */
    private fun writeSocks5Body(conn: HttpURLConnection, options: RequestOptions) {
        when (options.bodyEncoding) {
            "multipart" -> {
                val boundary = UUID.randomUUID().toString()
                conn.setRequestProperty("Content-Type", "multipart/form-data; boundary=$boundary")
                val baos = ByteArrayOutputStream()
                if (options.body != null) {
                    writeSocks5MultipartFields(baos, boundary, options.body)
                }
                for ((name, bytes) in options.byteArrayFields) {
                    val header = "--$boundary\r\n" +
                        "Content-Disposition: form-data; name=\"$name\"; filename=\"$name\"\r\n" +
                        "Content-Type: application/octet-stream\r\n\r\n"
                    baos.write(header.toByteArray(Charsets.UTF_8))
                    baos.write(bytes)
                    baos.write("\r\n".toByteArray(Charsets.UTF_8))
                }
                baos.write("--$boundary--\r\n".toByteArray(Charsets.UTF_8))
                conn.doOutput = true
                conn.outputStream.use { it.write(baos.toByteArray()) }
            }
            "json" -> {
                if (options.body != null) {
                    conn.setRequestProperty("Content-Type", "application/json")
                    conn.doOutput = true
                    conn.outputStream.use {
                        it.write(options.body.toString().toByteArray(Charsets.UTF_8))
                    }
                }
            }
            else -> {
                if (options.body != null) {
                    conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded")
                    val parts = mutableListOf<String>()
                    flattenJsonToFormString(options.body, parts)
                    conn.doOutput = true
                    conn.outputStream.use {
                        it.write(parts.joinToString("&").toByteArray(Charsets.UTF_8))
                    }
                }
            }
        }
    }

    private fun writeSocks5MultipartFields(
        baos: ByteArrayOutputStream,
        boundary: String,
        element: JsonElement,
        prefix: String = "",
    ) {
        if (element !is JsonObject) return
        for ((key, value) in element) {
            val fullKey = if (prefix.isEmpty()) key else "$prefix[$key]"
            when (value) {
                is JsonNull -> {}
                is JsonPrimitive -> {
                    val str = if (value.booleanOrNull != null) {
                        if (value.boolean) "1" else "0"
                    } else {
                        value.content
                    }
                    val header = "--$boundary\r\n" +
                        "Content-Disposition: form-data; name=\"$fullKey\"\r\n\r\n"
                    baos.write(header.toByteArray(Charsets.UTF_8))
                    baos.write(str.toByteArray(Charsets.UTF_8))
                    baos.write("\r\n".toByteArray(Charsets.UTF_8))
                }
                is JsonArray -> {
                    for (item in value) {
                        if (item is JsonPrimitive) {
                            val str = if (item.booleanOrNull != null) {
                                if (item.boolean) "1" else "0"
                            } else {
                                item.content
                            }
                            val header = "--$boundary\r\n" +
                                "Content-Disposition: form-data; name=\"$fullKey\"\r\n\r\n"
                            baos.write(header.toByteArray(Charsets.UTF_8))
                            baos.write(str.toByteArray(Charsets.UTF_8))
                            baos.write("\r\n".toByteArray(Charsets.UTF_8))
                        }
                    }
                }
                is JsonObject -> writeSocks5MultipartFields(baos, boundary, value, fullKey)
            }
        }
    }

    private fun flattenJsonToFormString(
        element: JsonElement,
        parts: MutableList<String>,
        prefix: String = "",
    ) {
        if (element !is JsonObject) return
        for ((key, value) in element) {
            val fullKey = if (prefix.isEmpty()) key else "$prefix[$key]"
            when (value) {
                is JsonNull -> {}
                is JsonPrimitive -> {
                    val str = if (value.booleanOrNull != null) {
                        if (value.boolean) "1" else "0"
                    } else {
                        value.content
                    }
                    parts.add("${encode(fullKey)}=${encode(str)}")
                }
                is JsonArray -> {
                    for (item in value) {
                        if (item is JsonPrimitive) {
                            val str = if (item.booleanOrNull != null) {
                                if (item.boolean) "1" else "0"
                            } else {
                                item.content
                            }
                            parts.add("${encode(fullKey)}=${encode(str)}")
                        }
                    }
                }
                is JsonObject -> flattenJsonToFormString(value, parts, fullKey)
            }
        }
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

    private fun appendQueryValue(
        parts: MutableList<String>,
        key: String,
        value: JsonElement,
    ) {
        when (value) {
            is JsonNull -> {} // skip
            is JsonPrimitive -> {
                val str =
                    if (value.booleanOrNull != null) {
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

    private fun flattenJsonToParams(
        element: JsonElement,
        builder: io.ktor.http.ParametersBuilder,
        prefix: String = "",
    ) {
        if (element !is JsonObject) return
        for ((key, value) in element) {
            val fullKey = if (prefix.isEmpty()) key else "$prefix[$key]"
            when (value) {
                is JsonNull -> {}
                is JsonPrimitive -> {
                    val stringValue =
                        if (value.booleanOrNull != null) {
                            if (value.boolean) "1" else "0"
                        } else {
                            value.content
                        }
                    builder.append(fullKey, stringValue)
                }
                is JsonArray -> {
                    for (item in value) {
                        if (item is JsonPrimitive) {
                            val stringValue =
                                if (item.booleanOrNull != null) {
                                    if (item.boolean) "1" else "0"
                                } else {
                                    item.content
                                }
                            builder.append(fullKey, stringValue)
                        }
                    }
                }
                is JsonObject -> flattenJsonToParams(value, builder, fullKey)
            }
        }
    }

    private fun flattenJsonToFormParts(
        element: JsonElement,
        builder: io.ktor.client.request.forms.FormBuilder,
        prefix: String = "",
    ) {
        if (element !is JsonObject) return
        for ((key, value) in element) {
            val fullKey = if (prefix.isEmpty()) key else "$prefix[$key]"
            when (value) {
                is JsonNull -> {}
                is JsonPrimitive -> {
                    val stringValue =
                        if (value.booleanOrNull != null) {
                            if (value.boolean) "1" else "0"
                        } else {
                            value.content
                        }
                    builder.append(fullKey, stringValue)
                }
                is JsonArray -> {
                    for (item in value) {
                        if (item is JsonPrimitive) {
                            val stringValue =
                                if (item.booleanOrNull != null) {
                                    if (item.boolean) "1" else "0"
                                } else {
                                    item.content
                                }
                            builder.append(fullKey, stringValue)
                        }
                    }
                }
                is JsonObject -> flattenJsonToFormParts(value, builder, fullKey)
            }
        }
    }

    private fun encode(value: String): String = java.net.URLEncoder.encode(value, "UTF-8")

    override fun close() {
        if (ownsClient) {
            client.close()
        }
        if (socksProxy != null) {
            Authenticator.setDefault(null)
        }
    }
}
