package com.lolzteam.api

import com.lolzteam.api.generated.forum.ForumClient
import com.lolzteam.api.generated.market.MarketClient
import com.lolzteam.api.runtime.AuthException
import com.lolzteam.api.runtime.ClientConfig
import com.lolzteam.api.runtime.LolzteamHttpClient
import com.lolzteam.api.runtime.NotFoundException
import com.lolzteam.api.runtime.RateLimitException
import com.lolzteam.api.runtime.RequestOptions
import com.lolzteam.api.runtime.RetryConfig
import io.ktor.client.engine.mock.MockEngine
import io.ktor.client.engine.mock.respond
import io.ktor.http.HttpHeaders
import io.ktor.http.HttpStatusCode
import io.ktor.http.headersOf
import kotlinx.coroutines.test.runTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue
import kotlin.time.Duration.Companion.milliseconds
import io.ktor.client.HttpClient as KtorHttpClient

class ClientTest {
    private fun jsonHeaders() = headersOf(HttpHeaders.ContentType, "application/json")

    private fun mockClient(
        token: String = "test-token",
        baseUrl: String = "https://example.com",
        retryConfig: RetryConfig = RetryConfig(maxRetries = 0),
        engine: MockEngine,
    ): LolzteamHttpClient =
        LolzteamHttpClient(
            ClientConfig(token = token, baseUrl = baseUrl, retry = retryConfig),
            httpClient = KtorHttpClient(engine) { expectSuccess = false },
        )

    @Test
    fun `successful request sends bearer auth header`() =
        runTest {
            var capturedAuth: String? = null
            val engine =
                MockEngine { request ->
                    capturedAuth = request.headers[HttpHeaders.Authorization]
                    respond("""{"status": "ok"}""", headers = jsonHeaders())
                }
            val client = mockClient(engine = engine)
            client.request(RequestOptions(method = "GET", path = "/test"))
            assertEquals("Bearer test-token", capturedAuth)
        }

    @Test
    fun `401 throws AuthException`() =
        runTest {
            val engine =
                MockEngine {
                    respond("""{"error":"unauthorized"}""", status = HttpStatusCode.Unauthorized, headers = jsonHeaders())
                }
            val client = mockClient(engine = engine)
            assertFailsWith<AuthException> {
                client.request(RequestOptions(method = "GET", path = "/test"))
            }
        }

    @Test
    fun `404 throws NotFoundException`() =
        runTest {
            val engine =
                MockEngine {
                    respond("""{"error":"not found"}""", status = HttpStatusCode.NotFound, headers = jsonHeaders())
                }
            val client = mockClient(engine = engine)
            assertFailsWith<NotFoundException> {
                client.request(RequestOptions(method = "GET", path = "/test"))
            }
        }

    @Test
    fun `429 throws RateLimitException`() =
        runTest {
            val engine =
                MockEngine {
                    respond("""{"error":"rate limited"}""", status = HttpStatusCode.TooManyRequests, headers = jsonHeaders())
                }
            val client = mockClient(engine = engine)
            assertFailsWith<RateLimitException> {
                client.request(RequestOptions(method = "GET", path = "/test"))
            }
        }

    @Test
    fun `retry on 429 then success`() =
        runTest {
            var attempts = 0
            val engine =
                MockEngine {
                    attempts++
                    if (attempts == 1) {
                        respond(
                            """{"error":"rate limited"}""",
                            status = HttpStatusCode.TooManyRequests,
                            headers =
                            headersOf(
                                HttpHeaders.ContentType to listOf("application/json"),
                                "Retry-After" to listOf("0"),
                            ),
                        )
                    } else {
                        respond("""{"status":"ok"}""", headers = jsonHeaders())
                    }
                }
            val client =
                mockClient(
                    retryConfig = RetryConfig(maxRetries = 1, baseDelay = 10.milliseconds, maxDelay = 50.milliseconds),
                    engine = engine,
                )
            val result = client.request(RequestOptions(method = "GET", path = "/test"))
            assertEquals(2, attempts)
            assertTrue(result.toString().contains("ok"))
        }

    @Test
    fun `retry on 502 then success`() =
        runTest {
            var attempts = 0
            val engine =
                MockEngine {
                    attempts++
                    if (attempts == 1) {
                        respond("""{"error":"bad gateway"}""", status = HttpStatusCode.BadGateway, headers = jsonHeaders())
                    } else {
                        respond("""{"status":"ok"}""", headers = jsonHeaders())
                    }
                }
            val client =
                mockClient(
                    retryConfig = RetryConfig(maxRetries = 1, baseDelay = 10.milliseconds, maxDelay = 50.milliseconds),
                    engine = engine,
                )
            val result = client.request(RequestOptions(method = "GET", path = "/test"))
            assertEquals(2, attempts)
            assertTrue(result.toString().contains("ok"))
        }

    @Test
    fun `path parameter substitution`() =
        runTest {
            var capturedPath: String? = null
            val engine =
                MockEngine { request ->
                    capturedPath = request.url.encodedPath
                    respond("""{}""", headers = jsonHeaders())
                }
            val client = mockClient(engine = engine)
            client.request(RequestOptions(method = "GET", path = "/categories/42"))
            assertEquals("/categories/42", capturedPath)
        }

    @Test
    fun `ForumClient can be instantiated`() {
        val forum =
            ForumClient(
                ClientConfig(
                    token = "test-token",
                    baseUrl = "https://example.com",
                    retry = RetryConfig(maxRetries = 0),
                ),
            )
        forum.close()
    }

    @Test
    fun `MarketClient can be instantiated`() {
        val market =
            MarketClient(
                ClientConfig(
                    token = "test-token",
                    baseUrl = "https://example.com",
                    retry = RetryConfig(maxRetries = 0),
                ),
            )
        market.close()
    }
}
