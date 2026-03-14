// Auto-generated. Do not edit manually.

package com.lolzteam.api.generated.market

import com.lolzteam.api.runtime.LolzteamHttpClient
import com.lolzteam.api.runtime.RequestOptions
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.serializer

class ProfileApi(private val http: LolzteamHttpClient) {

	suspend fun claims(params: ProfileClaimsParams? = null): ProfileClaimsResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/claims",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun get(params: ProfileGetParams? = null): ProfileGetResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/me",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun edit(body: ProfileEditBody? = null): ProfileEditResponse {
		return http.request(RequestOptions(
			method = "PUT",
			path = "/me",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}
}
