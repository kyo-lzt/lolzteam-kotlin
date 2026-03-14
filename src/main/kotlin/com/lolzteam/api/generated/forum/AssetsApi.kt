// Auto-generated. Do not edit manually.

package com.lolzteam.api.generated.forum

import com.lolzteam.api.runtime.LolzteamHttpClient
import com.lolzteam.api.runtime.RequestOptions
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.serializer

class AssetsApi(private val http: LolzteamHttpClient) {

	suspend fun css(params: AssetsCssParams? = null): AssetsCssResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/css",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}
}
