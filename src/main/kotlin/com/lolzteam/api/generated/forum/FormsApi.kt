// Auto-generated. Do not edit manually.

package com.lolzteam.api.generated.forum

import com.lolzteam.api.runtime.LolzteamHttpClient
import com.lolzteam.api.runtime.RequestOptions
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.serializer

class FormsApi(private val http: LolzteamHttpClient) {

	suspend fun list(params: FormsListParams? = null): FormsListResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/forms",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun create(body: FormsCreateBody? = null): FormsCreateResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/forms/save",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}
}
