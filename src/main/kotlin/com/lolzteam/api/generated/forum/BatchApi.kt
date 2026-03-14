// Auto-generated. Do not edit manually.

package com.lolzteam.api.generated.forum

import com.lolzteam.api.runtime.LolzteamHttpClient
import com.lolzteam.api.runtime.RequestOptions
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.serializer

class BatchApi(private val http: LolzteamHttpClient) {

	suspend fun execute(body: BatchExecuteBody? = null): BatchExecuteResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/batch",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}
}
