// Auto-generated. Do not edit manually.

package com.lolzteam.api.generated.forum

import com.lolzteam.api.runtime.LolzteamHttpClient
import com.lolzteam.api.runtime.RequestOptions
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.serializer

class NavigationApi(private val http: LolzteamHttpClient) {

	suspend fun list(params: NavigationListParams? = null): NavigationListResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/navigation",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}
}
