package com.lolzteam.api.runtime

import io.ktor.http.Headers
import kotlinx.coroutines.test.runTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue
import kotlin.time.Duration.Companion.milliseconds

class RetryTest {
    @Test
    fun `retries on RateLimitException`() =
        runTest {
            var attempts = 0
            val result =
                withRetry(
                    RetryConfig(maxRetries = 2, baseDelay = 10.milliseconds, maxDelay = 50.milliseconds),
                    method = "GET",
                    path = "/test",
                ) {
                    attempts++
                    if (attempts < 3) throw RateLimitException("rate limited", Headers.Empty)
                    "success"
                }
            assertEquals("success", result)
            assertEquals(3, attempts)
        }

    @Test
    fun `retries on ServerException 502`() =
        runTest {
            var attempts = 0
            val result =
                withRetry(
                    RetryConfig(maxRetries = 2, baseDelay = 10.milliseconds, maxDelay = 50.milliseconds),
                    method = "GET",
                    path = "/test",
                ) {
                    attempts++
                    if (attempts < 2) throw ServerException(502, "bad gateway", Headers.Empty)
                    "ok"
                }
            assertEquals("ok", result)
            assertEquals(2, attempts)
        }

    @Test
    fun `does not retry on AuthException`() =
        runTest {
            var attempts = 0
            assertFailsWith<AuthException> {
                withRetry(RetryConfig(maxRetries = 3, baseDelay = 10.milliseconds), method = "GET", path = "/test") {
                    attempts++
                    throw AuthException(401, "unauthorized", Headers.Empty)
                }
            }
            assertEquals(1, attempts)
        }

    @Test
    fun `does not retry on NotFoundException`() =
        runTest {
            var attempts = 0
            assertFailsWith<NotFoundException> {
                withRetry(RetryConfig(maxRetries = 3, baseDelay = 10.milliseconds), method = "GET", path = "/test") {
                    attempts++
                    throw NotFoundException("not found", Headers.Empty)
                }
            }
            assertEquals(1, attempts)
        }

    @Test
    fun `throws after max retries exhausted`() =
        runTest {
            var attempts = 0
            val error =
                assertFailsWith<RetryExhaustedError> {
                    withRetry(
                        RetryConfig(maxRetries = 2, baseDelay = 10.milliseconds, maxDelay = 50.milliseconds),
                        method = "GET",
                        path = "/test",
                    ) {
                        attempts++
                        throw RateLimitException("rate limited", Headers.Empty)
                    }
                }
            assertEquals(3, attempts) // initial + 2 retries
            assertEquals(3, error.attempts)
            assertTrue(error.lastError is RateLimitException)
        }

    @Test
    fun `does not retry ServerException 500`() =
        runTest {
            var attempts = 0
            assertFailsWith<ServerException> {
                withRetry(RetryConfig(maxRetries = 3, baseDelay = 10.milliseconds), method = "GET", path = "/test") {
                    attempts++
                    throw ServerException(500, "internal", Headers.Empty)
                }
            }
            assertEquals(1, attempts)
        }

    @Test
    fun `does not retry NetworkException`() =
        runTest {
            var attempts = 0
            assertFailsWith<NetworkException> {
                withRetry(RetryConfig(maxRetries = 3, baseDelay = 10.milliseconds), method = "GET", path = "/test") {
                    attempts++
                    throw NetworkException(RuntimeException("timeout"))
                }
            }
            assertEquals(1, attempts)
        }

    @Test
    fun `retries on ServerException 503`() =
        runTest {
            var attempts = 0
            val result =
                withRetry(
                    RetryConfig(maxRetries = 2, baseDelay = 10.milliseconds, maxDelay = 50.milliseconds),
                    method = "GET",
                    path = "/test",
                ) {
                    attempts++
                    if (attempts < 2) throw ServerException(503, "unavailable", Headers.Empty)
                    "recovered"
                }
            assertEquals("recovered", result)
            assertEquals(2, attempts)
        }

    @Test
    fun `succeeds on first try`() =
        runTest {
            val result =
                withRetry(RetryConfig(maxRetries = 3, baseDelay = 10.milliseconds), method = "GET", path = "/test") {
                    42
                }
            assertEquals(42, result)
        }

    @Test
    fun `does not retry HttpException 400`() =
        runTest {
            var attempts = 0
            assertFailsWith<HttpException> {
                withRetry(RetryConfig(maxRetries = 3, baseDelay = 10.milliseconds), method = "GET", path = "/test") {
                    attempts++
                    throw HttpException(400, "bad", Headers.Empty)
                }
            }
            assertEquals(1, attempts)
        }
}
