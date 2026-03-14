// Auto-generated. Do not edit manually.

package com.lolzteam.api.generated.market

import com.lolzteam.api.runtime.LolzteamHttpClient
import com.lolzteam.api.runtime.RequestOptions
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.serializer

class CustomDiscountsApi(private val http: LolzteamHttpClient) {

	suspend fun get(): CustomDiscountsGetResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/custom-discounts",
		))
	}

	suspend fun create(body: CustomDiscountsCreateBody? = null): CustomDiscountsCreateResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/custom-discounts",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun edit(body: CustomDiscountsEditBody? = null): CustomDiscountsEditResponse {
		return http.request(RequestOptions(
			method = "PUT",
			path = "/custom-discounts",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun delete(body: CustomDiscountsDeleteBody? = null): CustomDiscountsDeleteResponse {
		return http.request(RequestOptions(
			method = "DELETE",
			path = "/custom-discounts",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}
}
