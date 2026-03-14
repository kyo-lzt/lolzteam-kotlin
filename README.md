# lolzteam-kotlin

Kotlin API wrapper for Lolzteam Forum (151 endpoints) and Market (115 endpoints).

## Installation

### Gradle (Kotlin DSL)

```kotlin
dependencies {
    implementation("com.lolzteam:lolzteam-api:0.1.0")
}
```

### Gradle (Groovy)

```groovy
dependencies {
    implementation 'com.lolzteam:lolzteam-api:0.1.0'
}
```

## Usage

```kotlin
import com.lolzteam.api.generated.forum.ForumClient
import com.lolzteam.api.generated.market.MarketClient
import com.lolzteam.api.runtime.ClientConfig

// Forum API
val forum = ForumClient(ClientConfig(token = "your-token"))
val threads = forum.threads.list()
val thread = forum.threads.get(threadId = 123)
forum.close()

// Market API
val market = MarketClient(ClientConfig(token = "your-token"))
val categories = market.category.all()
market.close()
```

### Proxy

```kotlin
import com.lolzteam.api.runtime.ProxyConfig

val client = ForumClient(ClientConfig(
    token = "your-token",
    proxy = ProxyConfig(url = "http://proxy:8080"),
))
```

### Custom retry & rate limit

```kotlin
import com.lolzteam.api.runtime.RateLimitConfig
import com.lolzteam.api.runtime.RetryConfig
import kotlin.time.Duration.Companion.seconds

val client = MarketClient(ClientConfig(
    token = "your-token",
    retry = RetryConfig(maxRetries = 5, baseDelay = 2.seconds),
    rateLimit = RateLimitConfig(requestsPerMinute = 60),
))
```

## Features

- Coroutine-first (`suspend` functions)
- Auto-retry on 429/502/503 with exponential backoff
- Rate limiting (token bucket)
- Proxy support (HTTP)
- Type-safe parameters with `@Serializable` data classes
- Generated from OpenAPI 3.1.0 specs

## API Details

| | Forum | Market |
|---|---|---|
| Base URL | `https://api.lolz.live` | `https://api.lzt.market` |
| Endpoints | 151 | 115 |
| Rate limit | 300 req/min | 120 req/min |
| Auth | Bearer token | Bearer token |

## Development

```bash
# Regenerate clients from OpenAPI schemas
bun codegen/src/index.ts

# Build
./gradlew build

# Run tests
./gradlew test
```

## License

MIT
