// Auto-generated. Do not edit manually.

package com.lolzteam.api.generated.market

import com.lolzteam.api.runtime.LolzteamHttpClient
import com.lolzteam.api.runtime.RequestOptions
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.serializer

class BatchApi(private val http: LolzteamHttpClient) {

	suspend fun batch(body: BatchBatchBody): BatchBatchResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/batch",
			body = http.json.encodeToJsonElement(serializer(), body),
		))
	}
}
