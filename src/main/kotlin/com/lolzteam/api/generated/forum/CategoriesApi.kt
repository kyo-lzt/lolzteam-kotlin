// Auto-generated. Do not edit manually.

package com.lolzteam.api.generated.forum

import com.lolzteam.api.runtime.LolzteamHttpClient
import com.lolzteam.api.runtime.RequestOptions
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.serializer

class CategoriesApi(private val http: LolzteamHttpClient) {

	suspend fun list(params: CategoriesListParams? = null): CategoriesListResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/categories",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun get(categoryId: Int): CategoriesGetResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/categories/$categoryId",
		))
	}
}
