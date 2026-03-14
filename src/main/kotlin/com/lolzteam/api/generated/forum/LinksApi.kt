// Auto-generated. Do not edit manually.

package com.lolzteam.api.generated.forum

import com.lolzteam.api.runtime.LolzteamHttpClient
import com.lolzteam.api.runtime.RequestOptions
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.serializer

class LinksApi(private val http: LolzteamHttpClient) {

	suspend fun list(): LinksListResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/link-forums",
		))
	}

	suspend fun get(linkId: Int): LinksGetResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/link-forums/$linkId",
		))
	}
}
