// Auto-generated. Do not edit manually.

package com.lolzteam.api.generated.forum

import com.lolzteam.api.runtime.LolzteamHttpClient
import com.lolzteam.api.runtime.RequestOptions
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.serializer

class NotificationsApi(private val http: LolzteamHttpClient) {

	suspend fun list(params: NotificationsListParams? = null): NotificationsListResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/notifications",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun get(notificationId: Int): NotificationsGetResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/notifications/$notificationId/content",
		))
	}

	suspend fun read(body: NotificationsReadBody? = null): NotificationsReadResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/notifications/read",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}
}
