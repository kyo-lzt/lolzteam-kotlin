// Auto-generated. Do not edit manually.

package com.lolzteam.api.generated.market

import com.lolzteam.api.runtime.LolzteamHttpClient
import com.lolzteam.api.runtime.RequestOptions
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.serializer

class ProxyApi(private val http: LolzteamHttpClient) {

	suspend fun get(): ProxyGetResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/proxy",
		))
	}

	suspend fun add(body: ProxyAddBody): ProxyAddResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/proxy",
			body = http.json.encodeToJsonElement(serializer(), body),
		))
	}

	suspend fun delete(body: ProxyDeleteBody? = null): ProxyDeleteResponse {
		return http.request(RequestOptions(
			method = "DELETE",
			path = "/proxy",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}
}
