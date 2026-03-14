package com.lolzteam.api.runtime

import kotlin.time.Duration
import kotlin.time.Duration.Companion.seconds

data class ClientConfig(
    val token: String,
    val baseUrl: String? = null,
    val proxy: ProxyConfig? = null,
    val retry: RetryConfig = RetryConfig(),
    val rateLimit: RateLimitConfig? = null,
)

data class ProxyConfig(val url: String)

data class RetryConfig(
    val maxRetries: Int = 3,
    val baseDelay: Duration = 1.seconds,
    val maxDelay: Duration = 30.seconds,
)

data class RateLimitConfig(val requestsPerMinute: Int)
