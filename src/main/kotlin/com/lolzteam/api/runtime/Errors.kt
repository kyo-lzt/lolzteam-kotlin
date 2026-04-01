package com.lolzteam.api.runtime

import io.ktor.http.Headers
import kotlin.time.Duration
import kotlin.time.Duration.Companion.seconds
import kotlin.time.toKotlinDuration

sealed class LolzteamException(message: String, cause: Throwable? = null) : Exception(message, cause)

open class HttpException(
    val status: Int,
    val body: String?,
    val responseHeaders: Headers,
) : LolzteamException("HTTP $status${body?.let { ": ${it.take(200)}" } ?: ""}")

class RateLimitException(
    body: String?,
    responseHeaders: Headers,
) : HttpException(429, body, responseHeaders) {
    val retryAfter: Duration? =
        responseHeaders["Retry-After"]?.let { header ->
            header.toLongOrNull()?.seconds ?: try {
                val date = java.time.ZonedDateTime.parse(header, java.time.format.DateTimeFormatter.RFC_1123_DATE_TIME)
                val delta = java.time.Duration.between(java.time.Instant.now(), date.toInstant())
                if (delta.isNegative) null else delta.toKotlinDuration()
            } catch (_: Exception) {
                null
            }
        }
}

class AuthException(
    body: String?,
    responseHeaders: Headers,
) : HttpException(401, body, responseHeaders)

class ForbiddenException(
    body: String?,
    responseHeaders: Headers,
) : HttpException(403, body, responseHeaders)

class NotFoundException(
    body: String?,
    responseHeaders: Headers,
) : HttpException(404, body, responseHeaders)

class ServerException(
    status: Int,
    body: String?,
    responseHeaders: Headers,
) : HttpException(status, body, responseHeaders)

class NetworkException(override val cause: Throwable) : LolzteamException(cause.message ?: "Network error", cause) {
    val isTransient: Boolean
        get() =
            cause is java.net.SocketTimeoutException ||
                cause is java.net.ConnectException ||
                cause is io.ktor.client.network.sockets.ConnectTimeoutException ||
                cause is java.net.http.HttpTimeoutException
}

class RetryExhaustedError(
    val attempts: Int,
    val lastError: Throwable,
) : LolzteamException("Request failed after $attempts attempts: ${lastError.message}", lastError)

class ConfigException(message: String) : LolzteamException(message)

fun createHttpException(
    status: Int,
    body: String?,
    headers: Headers,
): HttpException =
    when (status) {
        429 -> RateLimitException(body, headers)
        401 -> AuthException(body, headers)
        403 -> ForbiddenException(body, headers)
        404 -> NotFoundException(body, headers)
        in 500..504 -> ServerException(status, body, headers)
        else -> HttpException(status, body, headers)
    }
