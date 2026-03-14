package com.lolzteam.api.runtime

import io.ktor.client.HttpClient as KtorHttpClient
import io.ktor.client.engine.mock.MockEngine
import io.ktor.client.engine.mock.respond
import io.ktor.client.engine.mock.toByteArray
import io.ktor.http.HttpHeaders
import io.ktor.http.HttpStatusCode
import io.ktor.http.headersOf
import kotlinx.coroutines.test.runTest
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.buildJsonArray
import kotlinx.serialization.json.buildJsonObject
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue

class HttpClientTest {
	private fun jsonHeaders() = headersOf(HttpHeaders.ContentType, "application/json")

	@Test
	fun `sends bearer auth header`() = runTest {
		var capturedAuth: String? = null
		val engine = MockEngine { request ->
			capturedAuth = request.headers[HttpHeaders.Authorization]
			respond("""{}""", headers = jsonHeaders())
		}
		val client = LolzteamHttpClient(
			ClientConfig(token = "test-token", retry = RetryConfig(maxRetries = 0)),
			httpClient = KtorHttpClient(engine) { expectSuccess = false },
		)

		client.request(RequestOptions(method = "GET", path = "/test"))
		assertEquals("Bearer test-token", capturedAuth)
	}

	@Test
	fun `query params - booleans become 1 and 0`() = runTest {
		var capturedUrl: String? = null
		val engine = MockEngine { request ->
			capturedUrl = request.url.toString()
			respond("""{}""", headers = jsonHeaders())
		}
		val client = LolzteamHttpClient(
			ClientConfig(token = "t", retry = RetryConfig(maxRetries = 0)),
			httpClient = KtorHttpClient(engine) { expectSuccess = false },
		)

		val query = buildJsonObject {
			put("active", JsonPrimitive(true))
			put("deleted", JsonPrimitive(false))
		}
		client.request(RequestOptions(method = "GET", path = "/test", query = query))
		assertTrue(capturedUrl!!.contains("active=1"), "Expected active=1 in $capturedUrl")
		assertTrue(capturedUrl!!.contains("deleted=0"), "Expected deleted=0 in $capturedUrl")
	}

	@Test
	fun `query params - nulls are skipped`() = runTest {
		var capturedUrl: String? = null
		val engine = MockEngine { request ->
			capturedUrl = request.url.toString()
			respond("""{}""", headers = jsonHeaders())
		}
		val client = LolzteamHttpClient(
			ClientConfig(token = "t", retry = RetryConfig(maxRetries = 0)),
			httpClient = KtorHttpClient(engine) { expectSuccess = false },
		)

		val query = buildJsonObject {
			put("present", JsonPrimitive("yes"))
			put("absent", JsonNull)
		}
		client.request(RequestOptions(method = "GET", path = "/test", query = query))
		assertTrue(capturedUrl!!.contains("present=yes"), "Expected present=yes in $capturedUrl")
		assertTrue(!capturedUrl!!.contains("absent"), "Expected absent to be skipped in $capturedUrl")
	}

	@Test
	fun `query params - arrays repeat the key`() = runTest {
		var capturedUrl: String? = null
		val engine = MockEngine { request ->
			capturedUrl = request.url.toString()
			respond("""{}""", headers = jsonHeaders())
		}
		val client = LolzteamHttpClient(
			ClientConfig(token = "t", retry = RetryConfig(maxRetries = 0)),
			httpClient = KtorHttpClient(engine) { expectSuccess = false },
		)

		val query = buildJsonObject {
			put("ids", buildJsonArray {
				add(JsonPrimitive("1"))
				add(JsonPrimitive("2"))
				add(JsonPrimitive("3"))
			})
		}
		client.request(RequestOptions(method = "GET", path = "/test", query = query))
		assertTrue(capturedUrl!!.contains("ids=1"), "Expected ids=1 in $capturedUrl")
		assertTrue(capturedUrl!!.contains("ids=2"), "Expected ids=2 in $capturedUrl")
		assertTrue(capturedUrl!!.contains("ids=3"), "Expected ids=3 in $capturedUrl")
	}

	@Test
	fun `json body encoding`() = runTest {
		var capturedBody: String? = null
		var capturedContentType: String? = null
		val engine = MockEngine { request ->
			capturedBody = request.body.toByteArray().decodeToString()
			capturedContentType = request.body.contentType?.toString()
			respond("""{}""", headers = jsonHeaders())
		}
		val client = LolzteamHttpClient(
			ClientConfig(token = "t", retry = RetryConfig(maxRetries = 0)),
			httpClient = KtorHttpClient(engine) { expectSuccess = false },
		)

		val body = buildJsonObject {
			put("name", JsonPrimitive("test"))
			put("value", JsonPrimitive(42))
		}
		client.request(RequestOptions(method = "POST", path = "/test", body = body))
		assertTrue(capturedContentType?.contains("application/json") == true, "Expected JSON content type, got: $capturedContentType")
		assertTrue(capturedBody!!.contains("\"name\":\"test\""), "Expected name in body: $capturedBody")
	}

	@Test
	fun `form-encoded body with multipart flag`() = runTest {
		var capturedContentType: String? = null
		val engine = MockEngine { request ->
			capturedContentType = request.body.contentType?.toString()
			respond("""{}""", headers = jsonHeaders())
		}
		val client = LolzteamHttpClient(
			ClientConfig(token = "t", retry = RetryConfig(maxRetries = 0)),
			httpClient = KtorHttpClient(engine) { expectSuccess = false },
		)

		val body = buildJsonObject {
			put("field1", JsonPrimitive("value1"))
			put("field2", JsonPrimitive("value2"))
		}
		client.request(RequestOptions(method = "POST", path = "/test", body = body, multipart = true))
		assertTrue(
			capturedContentType?.contains("application/x-www-form-urlencoded") == true,
			"Expected form content type, got: $capturedContentType",
		)
	}

	@Test
	fun `429 throws RateLimitException`() = runTest {
		val engine = MockEngine {
			respond("""{"error": "rate limited"}""", status = HttpStatusCode.TooManyRequests, headers = jsonHeaders())
		}
		val client = LolzteamHttpClient(
			ClientConfig(token = "t", retry = RetryConfig(maxRetries = 0)),
			httpClient = KtorHttpClient(engine) { expectSuccess = false },
		)

		assertFailsWith<RateLimitException> {
			client.request(RequestOptions(method = "GET", path = "/test"))
		}
	}

	@Test
	fun `401 throws AuthException`() = runTest {
		val engine = MockEngine {
			respond("""{"error": "unauthorized"}""", status = HttpStatusCode.Unauthorized, headers = jsonHeaders())
		}
		val client = LolzteamHttpClient(
			ClientConfig(token = "t", retry = RetryConfig(maxRetries = 0)),
			httpClient = KtorHttpClient(engine) { expectSuccess = false },
		)

		assertFailsWith<AuthException> {
			client.request(RequestOptions(method = "GET", path = "/test"))
		}
	}

	@Test
	fun `404 throws NotFoundException`() = runTest {
		val engine = MockEngine {
			respond("""{"error": "not found"}""", status = HttpStatusCode.NotFound, headers = jsonHeaders())
		}
		val client = LolzteamHttpClient(
			ClientConfig(token = "t", retry = RetryConfig(maxRetries = 0)),
			httpClient = KtorHttpClient(engine) { expectSuccess = false },
		)

		assertFailsWith<NotFoundException> {
			client.request(RequestOptions(method = "GET", path = "/test"))
		}
	}

	@Test
	fun `500 throws ServerException`() = runTest {
		val engine = MockEngine {
			respond("""{"error": "server error"}""", status = HttpStatusCode.InternalServerError, headers = jsonHeaders())
		}
		val client = LolzteamHttpClient(
			ClientConfig(token = "t", retry = RetryConfig(maxRetries = 0)),
			httpClient = KtorHttpClient(engine) { expectSuccess = false },
		)

		assertFailsWith<ServerException> {
			client.request(RequestOptions(method = "GET", path = "/test"))
		}
	}

	@Test
	fun `proxy - rejects invalid URL`() {
		assertFailsWith<ConfigException> {
			LolzteamHttpClient(
				ClientConfig(token = "t", proxy = ProxyConfig(url = "not a url"), retry = RetryConfig(maxRetries = 0)),
			)
		}
	}

	@Test
	fun `proxy - rejects unsupported scheme`() {
		assertFailsWith<ConfigException> {
			LolzteamHttpClient(
				ClientConfig(token = "t", proxy = ProxyConfig(url = "ftp://proxy:8080"), retry = RetryConfig(maxRetries = 0)),
			)
		}
	}

	@Test
	fun `proxy - rejects missing host`() {
		assertFailsWith<ConfigException> {
			LolzteamHttpClient(
				ClientConfig(token = "t", proxy = ProxyConfig(url = "http://"), retry = RetryConfig(maxRetries = 0)),
			)
		}
	}

	@Test
	fun `proxy - accepts valid http proxy`() {
		val client = LolzteamHttpClient(
			ClientConfig(token = "t", proxy = ProxyConfig(url = "http://proxy:8080"), retry = RetryConfig(maxRetries = 0)),
		)
		client.close()
	}

	@Test
	fun `proxy - accepts valid socks5 proxy`() {
		val client = LolzteamHttpClient(
			ClientConfig(token = "t", proxy = ProxyConfig(url = "socks5://proxy:1080"), retry = RetryConfig(maxRetries = 0)),
		)
		client.close()
	}
}
