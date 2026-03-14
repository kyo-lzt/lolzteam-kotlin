// Auto-generated. Do not edit manually.

package com.lolzteam.api.generated.market

import com.lolzteam.api.runtime.LolzteamHttpClient
import com.lolzteam.api.runtime.RequestOptions
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.serializer

class AutoPaymentsApi(private val http: LolzteamHttpClient) {

	suspend fun list(): AutoPaymentsListResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/auto-payments",
		))
	}

	suspend fun create(body: AutoPaymentsCreateBody? = null): AutoPaymentsCreateResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/auto-payment",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun delete(body: AutoPaymentsDeleteBody? = null): AutoPaymentsDeleteResponse {
		return http.request(RequestOptions(
			method = "DELETE",
			path = "/auto-payment",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}
}
