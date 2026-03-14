// Auto-generated. Do not edit manually.

package com.lolzteam.api.generated.forum

import com.lolzteam.api.runtime.LolzteamHttpClient
import com.lolzteam.api.runtime.RequestOptions
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.serializer

class OAuthApi(private val http: LolzteamHttpClient) {

	suspend fun token(body: OAuthTokenBody): OAuthTokenResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/oauth/token",
			body = http.json.encodeToJsonElement(serializer(), body),
			multipart = true,
		))
	}
}
