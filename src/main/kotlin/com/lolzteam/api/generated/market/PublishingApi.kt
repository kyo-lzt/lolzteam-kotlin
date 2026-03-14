// Auto-generated. Do not edit manually.

package com.lolzteam.api.generated.market

import com.lolzteam.api.runtime.LolzteamHttpClient
import com.lolzteam.api.runtime.RequestOptions
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.serializer

class PublishingApi(private val http: LolzteamHttpClient) {

	suspend fun fastSell(body: PublishingFastSellBody? = null): PublishingFastSellResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/item/fast-sell",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun add(body: PublishingAddBody? = null): PublishingAddResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/item/add",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun check(itemId: Int, body: PublishingCheckBody? = null): PublishingCheckResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/$itemId/goods/check",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun external(itemId: Int, body: PublishingExternalBody? = null): PublishingExternalResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/$itemId/external-account",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}
}
