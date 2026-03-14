// Auto-generated. Do not edit manually.

package com.lolzteam.api.generated.market

import com.lolzteam.api.runtime.LolzteamHttpClient
import com.lolzteam.api.runtime.RequestOptions
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.serializer

class ImapApi(private val http: LolzteamHttpClient) {

	suspend fun create(body: ImapCreateBody? = null): ImapCreateResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/imap",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun delete(body: ImapDeleteBody? = null): ImapDeleteResponse {
		return http.request(RequestOptions(
			method = "DELETE",
			path = "/imap",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}
}
