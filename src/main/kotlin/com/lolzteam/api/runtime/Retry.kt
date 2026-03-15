package com.lolzteam.api.runtime

import kotlinx.coroutines.delay
import kotlin.math.min
import kotlin.random.Random
import kotlin.time.Duration.Companion.milliseconds

private fun isRetryable(error: Throwable): Boolean = when (error) {
    is RateLimitException -> true
    is ServerException -> error.status == 502 || error.status == 503 || error.status == 504
    is NetworkException -> error.isTransient
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

suspend fun <T> withRetry(
    config: RetryConfig,
    method: String,
    path: String,
    onRetry: ((RetryInfo) -> Unit)? = null,
    block: suspend () -> T,
): T {
    var lastError: Throwable? = null
    for (attempt in 0..config.maxRetries) {
        try {
            return block()
        } catch (e: Throwable) {
            lastError = e
            if (!isRetryable(e)) {
                throw e
            }
            if (attempt == config.maxRetries) {
                if (attempt == 0) throw e
                throw RetryExhaustedError(attempts = attempt + 1, lastError = e)
            }
            val delayMs = computeDelay(attempt, config, e)
            if (onRetry != null && e is LolzteamException) {
                onRetry(RetryInfo(
                    attempt = attempt,
                    delay = delayMs.milliseconds,
                    error = e,
                    method = method,
                    path = path,
                ))
            }
            delay(delayMs)
        }
    }
    throw RetryExhaustedError(attempts = config.maxRetries + 1, lastError = lastError!!)
}
