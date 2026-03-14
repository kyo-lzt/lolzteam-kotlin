// Auto-generated. Do not edit manually.

package com.lolzteam.api.generated.forum

import com.lolzteam.api.runtime.LolzteamHttpClient
import com.lolzteam.api.runtime.RequestOptions
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.serializer

class TagsApi(private val http: LolzteamHttpClient) {

	suspend fun popular(): TagsPopularResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/tags",
		))
	}

	suspend fun list(params: TagsListParams? = null): TagsListResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/tags/list",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun get(tagId: Int, params: TagsGetParams? = null): TagsGetResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/tags/$tagId",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun find(params: TagsFindParams? = null): TagsFindResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/tags/find",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}
}
