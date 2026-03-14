// Auto-generated. Do not edit manually.

package com.lolzteam.api.generated.market

import com.lolzteam.api.runtime.LolzteamHttpClient
import com.lolzteam.api.runtime.RequestOptions
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.serializer

class CartApi(private val http: LolzteamHttpClient) {

	suspend fun get(params: CartGetParams? = null): CartGetResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/cart",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun add(body: CartAddBody): CartAddResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/cart",
			body = http.json.encodeToJsonElement(serializer(), body),
		))
	}

	suspend fun delete(body: CartDeleteBody? = null): CartDeleteResponse {
		return http.request(RequestOptions(
			method = "DELETE",
			path = "/cart",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}
}
