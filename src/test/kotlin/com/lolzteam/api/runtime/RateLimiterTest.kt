package com.lolzteam.api.runtime

import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertTrue

class RateLimiterTest {
    @Test
    fun `allows requests within limit`() =
        runBlocking {
            val limiter = RateLimiter(100)
            repeat(5) {
                limiter.acquire()
            }
        }

    @Test
    fun `rate limits after burst`() =
        runBlocking {
            val limiter = RateLimiter(3)
            val start = System.currentTimeMillis()

            // Exhaust all tokens
            repeat(3) { limiter.acquire() }

            // Next acquire should delay
            limiter.acquire()
            val elapsed = System.currentTimeMillis() - start
            assertTrue(elapsed >= 500, "Should have waited for token refill, took ${elapsed}ms")
        }
}
