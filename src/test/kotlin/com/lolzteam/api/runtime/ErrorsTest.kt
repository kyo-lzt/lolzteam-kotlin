package com.lolzteam.api.runtime

import io.ktor.http.Headers
import io.ktor.http.headersOf
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertIs
import kotlin.test.assertNull
import kotlin.test.assertTrue
import kotlin.time.Duration.Companion.seconds

class ErrorsTest {
    // ── Error hierarchy ────────────────────────────────────────────

    @Test
    fun `HttpException is LolzteamException`() {
        val e = HttpException(400, "bad", Headers.Empty)
        assertIs<LolzteamException>(e)
        assertEquals(400, e.status)
    }

    @Test
    fun `RateLimitException is HttpException`() {
        val e = RateLimitException("body", Headers.Empty)
        assertIs<HttpException>(e)
        assertIs<LolzteamException>(e)
        assertEquals(429, e.status)
    }

    @Test
    fun `AuthException is HttpException`() {
        val e = AuthException("unauth", Headers.Empty)
        assertIs<HttpException>(e)
        assertEquals(401, e.status)
    }

    @Test
    fun `NotFoundException is HttpException with status 404`() {
        val e = NotFoundException("nope", Headers.Empty)
        assertIs<HttpException>(e)
        assertEquals(404, e.status)
    }

    @Test
    fun `ServerException is HttpException`() {
        val e = ServerException(502, "bad gw", Headers.Empty)
        assertIs<HttpException>(e)
        assertEquals(502, e.status)
    }

    @Test
    fun `NetworkException is LolzteamException with cause`() {
        val cause = RuntimeException("timeout")
        val e = NetworkException(cause)
        assertIs<LolzteamException>(e)
        assertEquals(cause, e.cause)
        assertEquals("timeout", e.message)
    }

    @Test
    fun `ConfigException is LolzteamException`() {
        val e = ConfigException("bad proxy")
        assertIs<LolzteamException>(e)
        assertEquals("bad proxy", e.message)
    }

    // ── RateLimitException.retryAfter ──────────────────────────────

    @Test
    fun `RateLimitException parses Retry-After header`() {
        val headers = headersOf("Retry-After", "5")
        val e = RateLimitException("body", headers)
        assertEquals(5.seconds, e.retryAfter)
    }

    @Test
    fun `RateLimitException retryAfter null when missing`() {
        val e = RateLimitException("body", Headers.Empty)
        assertNull(e.retryAfter)
    }

    @Test
    fun `RateLimitException retryAfter null for non-numeric`() {
        val headers = headersOf("Retry-After", "Wed, 21 Oct 2025 07:28:00 GMT")
        val e = RateLimitException("body", headers)
        assertNull(e.retryAfter)
    }

    // ── createHttpException factory ────────────────────────────────

    @Test
    fun `createHttpException returns RateLimitException for 429`() {
        val e = createHttpException(429, "body", Headers.Empty)
        assertIs<RateLimitException>(e)
    }

    @Test
    fun `createHttpException returns AuthException for 401`() {
        val e = createHttpException(401, "body", Headers.Empty)
        assertIs<AuthException>(e)
    }

    @Test
    fun `createHttpException returns ForbiddenException for 403`() {
        val e = createHttpException(403, "body", Headers.Empty)
        assertIs<ForbiddenException>(e)
    }

    @Test
    fun `createHttpException returns NotFoundException for 404`() {
        val e = createHttpException(404, "body", Headers.Empty)
        assertIs<NotFoundException>(e)
    }

    @Test
    fun `createHttpException returns ServerException for 500`() {
        val e = createHttpException(500, "body", Headers.Empty)
        assertIs<ServerException>(e)
    }

    @Test
    fun `createHttpException returns ServerException for 502`() {
        val e = createHttpException(502, "body", Headers.Empty)
        assertIs<ServerException>(e)
    }

    @Test
    fun `createHttpException returns ServerException for 503`() {
        val e = createHttpException(503, "body", Headers.Empty)
        assertIs<ServerException>(e)
    }

    @Test
    fun `createHttpException returns base HttpException for 418`() {
        val e = createHttpException(418, "teapot", Headers.Empty)
        assertEquals(HttpException::class, e::class)
        assertEquals(418, e.status)
    }

    @Test
    fun `createHttpException returns base HttpException for 400`() {
        val e = createHttpException(400, "bad", Headers.Empty)
        assertEquals(HttpException::class, e::class)
    }

    // ── HttpException message format ───────────────────────────────

    @Test
    fun `HttpException message contains status code`() {
        val e = HttpException(503, "service unavailable", Headers.Empty)
        assertTrue(e.message!!.contains("503"))
    }
}
