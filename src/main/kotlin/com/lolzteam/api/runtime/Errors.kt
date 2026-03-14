package com.lolzteam.api.runtime

import io.ktor.http.Headers
import kotlin.time.Duration
import kotlin.time.Duration.Companion.seconds

sealed class LolzteamException(message: String, cause: Throwable? = null) : Exception(message, cause)

open class HttpException(
    val status: Int,
    val body: String?,
    val responseHeaders: Headers,
) : LolzteamException("HTTP $status")

class RateLimitException(
    body: String?,
    responseHeaders: Headers,
) : HttpException(429, body, responseHeaders) {
    val retryAfter: Duration? = responseHeaders["Retry-After"]?.toLongOrNull()?.let {
        it.seconds
    }
}

class AuthException(
    status: Int,
    body: String?,
    responseHeaders: Headers,
) : HttpException(status, body, responseHeaders)

class NotFoundException(
    body: String?,
    responseHeaders: Headers,
) : HttpException(404, body, responseHeaders)

class ServerException(
    status: Int,
    body: String?,
    responseHeaders: Headers,
) : HttpException(status, body, responseHeaders)

class NetworkException(override val cause: Throwable) : LolzteamException(cause.message ?: "Network error", cause)

class ConfigException(message: String) : LolzteamException(message)

fun createHttpException(status: Int, body: String?, headers: Headers): HttpException = when (status) {
    429 -> RateLimitException(body, headers)
    401, 403 -> AuthException(status, body, headers)
    404 -> NotFoundException(body, headers)
    in 500..503 -> ServerException(status, body, headers)
    else -> HttpException(status, body, headers)
}
