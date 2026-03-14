package com.lolzteam.api.runtime

import kotlinx.coroutines.delay
import kotlin.math.min
import kotlin.random.Random
import kotlin.time.Duration.Companion.milliseconds

private fun isRetryable(error: Throwable): Boolean = when (error) {
    is RateLimitException -> true
    is ServerException -> error.status == 502 || error.status == 503
    else -> false
}

private fun computeDelay(attempt: Int, config: RetryConfig, error: Throwable): Long {
    if (error is RateLimitException && error.retryAfter != null) {
        return min(error.retryAfter.inWholeMilliseconds, config.maxDelay.inWholeMilliseconds)
    }
    val exponential = config.baseDelay.inWholeMilliseconds * (1L shl attempt)
    val jitter = (Random.nextDouble() * config.baseDelay.inWholeMilliseconds).toLong()
    return min(exponential + jitter, config.maxDelay.inWholeMilliseconds)
}

suspend fun <T> withRetry(config: RetryConfig, block: suspend () -> T): T {
    var lastError: Throwable? = null
    for (attempt in 0..config.maxRetries) {
        try {
            return block()
        } catch (e: Throwable) {
            lastError = e
            if (!isRetryable(e) || attempt == config.maxRetries) {
                throw e
            }
            val delayMs = computeDelay(attempt, config, e)
            delay(delayMs)
        }
    }
    throw lastError!!
}
