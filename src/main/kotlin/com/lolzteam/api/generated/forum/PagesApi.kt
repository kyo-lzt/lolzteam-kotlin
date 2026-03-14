// Auto-generated. Do not edit manually.

package com.lolzteam.api.generated.forum

import com.lolzteam.api.runtime.LolzteamHttpClient
import com.lolzteam.api.runtime.RequestOptions
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.serializer

class PagesApi(private val http: LolzteamHttpClient) {

	suspend fun list(params: PagesListParams? = null): PagesListResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/pages",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun get(pageId: Int): PagesGetResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/pages/$pageId",
		))
	}
}
