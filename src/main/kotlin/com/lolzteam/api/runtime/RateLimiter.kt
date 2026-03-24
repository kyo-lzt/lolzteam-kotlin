package com.lolzteam.api.runtime

import kotlinx.coroutines.delay
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock

class RateLimiter(requestsPerMinute: Int) {
    init {
        if (requestsPerMinute <= 0) {
            throw ConfigException("requestsPerMinute must be greater than 0")
        }
    }

    private val maxTokens: Double = requestsPerMinute.toDouble()
    private val refillRate: Double = requestsPerMinute.toDouble() / 60_000.0
    private var tokens: Double = maxTokens
    private var lastRefill: Long = System.currentTimeMillis()
    private val mutex = Mutex()

    suspend fun acquire() {
        while (true) {
            val waitMs =
                mutex.withLock {
                    refill()
                    if (tokens >= 1.0) {
                        tokens -= 1.0
                        return
                    }
                    ((1.0 - tokens) / refillRate).toLong()
                }
            delay(maxOf(1L, waitMs))
        }
    }

    private fun refill() {
        val now = System.currentTimeMillis()
        val elapsed = now - lastRefill
        tokens = (tokens + elapsed * refillRate).coerceAtMost(maxTokens)
        lastRefill = now
    }
}
