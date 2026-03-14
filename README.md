# lolzteam-kotlin

Kotlin API wrapper for Lolzteam Forum and Market (coroutines). Clients and types are generated from OpenAPI specs.

## Requirements

- JDK 17+

## Setup

```bash
git clone https://github.com/kyo-lzt/lolzteam-kotlin.git
cd lolzteam-kotlin
./gradlew build
```

## Code Generation

```bash
./gradlew :codegen:run
```

Reads schemas from `schemas/forum.json` and `schemas/market.json`, generates typed clients into:

| What | Where |
|------|-------|
| Forum types | `src/main/kotlin/com/lolzteam/generated/forum/Types.kt` |
| Market types | `src/main/kotlin/com/lolzteam/generated/market/Types.kt` |
| Forum client | `src/main/kotlin/com/lolzteam/generated/forum/ForumClient.kt` |
| Market client | `src/main/kotlin/com/lolzteam/generated/market/MarketClient.kt` |

Generator source — `codegen/` (Kotlin).

## Project Structure

```
schemas/              — OpenAPI 3.1.0 specs
codegen/              — Code generator (Kotlin, Gradle subproject)
src/main/kotlin/      — Runtime + generated clients
src/test/kotlin/      — Tests
build.gradle.kts
```

## Commands

```bash
./gradlew :codegen:run    # Generate clients from schemas
./gradlew build           # Build
./gradlew test            # Tests
./gradlew check           # Full check (lint + test)
```

## License

MIT
