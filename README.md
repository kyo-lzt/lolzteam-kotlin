# lolzteam-kotlin

[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)
[![CI](https://github.com/kyo-lzt/lolzteam-kotlin/actions/workflows/ci.yml/badge.svg)](https://github.com/kyo-lzt/lolzteam-kotlin/actions)

Kotlin API wrapper for the [Lolzteam](https://lolz.live) Forum and Market APIs. **266 endpoints** (151 Forum + 115 Market), auto-generated from OpenAPI specifications. Fully async with Kotlin coroutines.

## Features

- **Complete API coverage** -- 266 endpoints across Forum and Market clients
- **Auto-generated** -- clients and types generated from OpenAPI 3.1.0 specs, always in sync
- **Async-only** -- all methods are `suspend` functions powered by Kotlin coroutines
- **Proxy support** -- HTTP, HTTPS, and SOCKS5 via Ktor CIO engine
- **Retry logic** -- exponential backoff with jitter, respects `Retry-After` headers
- **Rate limiting** -- coroutine-safe token bucket (Mutex-based)
- **Typed exceptions** -- sealed exception hierarchy with exhaustive `when` matching
- **Type-safe** -- `kotlinx.serialization` for all request/response models

## Quick Start

Requires **JDK 17+**.

```bash
git clone https://github.com/kyo-lzt/lolzteam-kotlin.git
cd lolzteam-kotlin
./gradlew build
```

## Usage

```kotlin
import com.lolzteam.api.runtime.ClientConfig
import com.lolzteam.api.generated.forum.ForumClient
import com.lolzteam.api.generated.market.MarketClient

suspend fun main() {
    val config = ClientConfig(token = "your_token")
    val forum = ForumClient(config)
    val market = MarketClient(config)

    val threads = forum.threads.list()
    val items = market.category.all()

    forum.close()
    market.close()
}
```

Forum API groups: `oAuth`, `assets`, `categories`, `forums`, `links`, `pages`, `navigation`, `threads`, `posts`, `users`, `profilePosts`, `conversations`, `notifications`, `tags`, `search`, `batch`, `chatbox`, `forms`.

Market API groups: `category`, `list`, `managing`, `profile`, `cart`, `purchasing`, `customDiscounts`, `publishing`, `payments`, `autoPayments`, `proxy`, `imap`, `batch`.

## Configuration

```kotlin
val config = ClientConfig(
    token = "your_token",
    proxy = ProxyConfig(url = "socks5://127.0.0.1:1080"),
    retry = RetryConfig(
        maxRetries = 5,             // default: 3
        baseDelay = 1.seconds,      // default: 1s
        maxDelay = 30.seconds,      // default: 30s
    ),
    rateLimit = RateLimitConfig(
        requestsPerMinute = 200,    // default: 300 (Forum), 120 (Market)
    ),
)
```

## Retry Logic

Failed requests are retried automatically for transient errors. The delay uses exponential backoff with jitter. `Retry-After` header on 429 responses is respected.

| Status | Retried | Behavior |
|--------|---------|----------|
| 429 | Yes | Uses `Retry-After` header if present |
| 502, 503 | Yes | Exponential backoff with jitter |
| 401, 403 | No | Thrown immediately |
| 404 | No | Thrown immediately |
| Other | No | Thrown immediately |

Delay formula: `min(baseDelay * 2^attempt + random(0, baseDelay), maxDelay)`

## Proxy

Configured via `ProxyConfig`. Supported schemes: `http`, `https`, `socks5`.

```kotlin
val config = ClientConfig(
    token = "your_token",
    proxy = ProxyConfig(url = "socks5://127.0.0.1:1080"),
)
```

The proxy URL is validated at construction time. Invalid schemes throw `ConfigException`.

## Error Handling

All exceptions extend the sealed class `LolzteamException`:

```kotlin
try {
    forum.threads.list()
} catch (e: RateLimitException) {
    println("Rate limited, retry after: ${e.retryAfter}")
} catch (e: AuthException) {
    println("Auth failed: ${e.status}")
} catch (e: NotFoundException) {
    println("Not found")
} catch (e: HttpException) {
    println("HTTP ${e.status}: ${e.body}")
} catch (e: NetworkException) {
    println("Network error: ${e.cause}")
}
```

Error hierarchy:

```
LolzteamException (sealed)
├── HttpException
│   ├── RateLimitException    (429)
│   ├── AuthException         (401, 403)
│   ├── NotFoundException     (404)
│   └── ServerException       (500, 502, 503)
├── NetworkException
└── ConfigException
```

## Rate Limits

The built-in rate limiter uses a token bucket algorithm. Coroutine-safe with `Mutex`. When the bucket is empty, `acquire()` suspends the coroutine until tokens refill -- no requests are dropped.

| Client | Default limit |
|--------|---------------|
| Forum  | 300 req/min   |
| Market | 120 req/min   |

## Code Generation

Clients and types are auto-generated from OpenAPI 3.1.0 specs in `schemas/`:

```bash
./gradlew :codegen:run
```

| Input | Output |
|-------|--------|
| `schemas/forum.json` | `generated/forum/ForumClient.kt`, `Types.kt` |
| `schemas/market.json` | `generated/market/MarketClient.kt`, `Types.kt` |

Generator source is in `codegen/`.

## Project Structure

```
schemas/                        OpenAPI 3.1.0 specifications
codegen/                        Code generator (Kotlin, Gradle subproject)
src/
  main/kotlin/com/lolzteam/api/
    runtime/
      Config.kt                 ClientConfig, ProxyConfig, RetryConfig, RateLimitConfig
      HttpClient.kt             Ktor-based HTTP client
      Retry.kt                  Exponential backoff + jitter
      RateLimiter.kt            Token bucket rate limiter (coroutine-safe)
      Errors.kt                 Sealed exception hierarchy
    generated/
      forum/
        ForumClient.kt          ForumClient (18 API groups, 151 methods)
        Types.kt                Request/response types
      market/
        MarketClient.kt         MarketClient (13 API groups, 115 methods)
        Types.kt                Request/response types
  test/kotlin/                  Tests
build.gradle.kts
```

## Commands

```bash
./gradlew :codegen:run    # Generate clients from OpenAPI specs
./gradlew build           # Build the project
./gradlew test            # Run tests
./gradlew check           # Full check (lint + test)
```

## License

[MIT](LICENSE)
