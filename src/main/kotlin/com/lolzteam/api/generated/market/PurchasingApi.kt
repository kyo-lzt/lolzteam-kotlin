// Auto-generated. Do not edit manually.

package com.lolzteam.api.generated.market

import com.lolzteam.api.runtime.LolzteamHttpClient
import com.lolzteam.api.runtime.RequestOptions
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.serializer

class PurchasingApi(private val http: LolzteamHttpClient) {

	suspend fun fastBuy(itemId: Int, body: PurchasingFastBuyBody? = null): PurchasingFastBuyResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/$itemId/fast-buy",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun check(itemId: Int): PurchasingCheckResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/$itemId/check-account",
		))
	}

	suspend fun confirm(itemId: Int, body: PurchasingConfirmBody? = null): PurchasingConfirmResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/$itemId/confirm-buy",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun discountRequest(itemId: Int, body: PurchasingDiscountRequestBody? = null): PurchasingDiscountRequestResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/$itemId/discount",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun discountCancel(itemId: Int): PurchasingDiscountCancelResponse {
		return http.request(RequestOptions(
			method = "DELETE",
			path = "/$itemId/discount",
		))
	}
}
