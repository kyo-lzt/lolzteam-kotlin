// Auto-generated. Do not edit manually.

package com.lolzteam.api.generated.forum

import com.lolzteam.api.runtime.LolzteamHttpClient
import com.lolzteam.api.runtime.RequestOptions
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.serializer

class ConversationsApi(private val http: LolzteamHttpClient) {

	suspend fun list(params: ConversationsListParams? = null): ConversationsListResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/conversations",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun create(body: ConversationsCreateBody? = null): ConversationsCreateResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/conversations",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun update(body: ConversationsUpdateBody? = null): ConversationsUpdateResponse {
		return http.request(RequestOptions(
			method = "PUT",
			path = "/conversations",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun delete(body: ConversationsDeleteBody? = null): ConversationsDeleteResponse {
		return http.request(RequestOptions(
			method = "DELETE",
			path = "/conversations",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun start(body: ConversationsStartBody? = null): ConversationsStartResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/conversations/start",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun save(body: ConversationsSaveBody? = null): ConversationsSaveResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/conversations/save",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun get(conversationId: Int): ConversationsGetResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/conversations/$conversationId",
		))
	}

	suspend fun messagesList(conversationId: Int, params: ConversationsMessagesListParams? = null): ConversationsMessagesListResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/conversations/$conversationId/messages",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun messagesCreate(conversationId: Int, body: ConversationsMessagesCreateBody? = null): ConversationsMessagesCreateResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/conversations/$conversationId/messages",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun search(body: ConversationsSearchBody? = null): ConversationsSearchResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/conversations/search",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun messagesGet(messageId: Int): ConversationsMessagesGetResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/conversations/messages/$messageId",
		))
	}

	suspend fun messagesEdit(conversationId: Int, messageId: Int, body: ConversationsMessagesEditBody? = null): ConversationsMessagesEditResponse {
		return http.request(RequestOptions(
			method = "PUT",
			path = "/conversations/$conversationId/messages/$messageId",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun messagesDelete(conversationId: Int, messageId: Int): ConversationsMessagesDeleteResponse {
		return http.request(RequestOptions(
			method = "DELETE",
			path = "/conversations/$conversationId/messages/$messageId",
		))
	}

	suspend fun invite(conversationId: Int, body: ConversationsInviteBody? = null): ConversationsInviteResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/conversations/$conversationId/invite",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun kick(conversationId: Int, body: ConversationsKickBody? = null): ConversationsKickResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/conversations/$conversationId/kick",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun read(conversationId: Int): ConversationsReadResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/conversations/$conversationId/read",
		))
	}

	suspend fun readAll(): ConversationsReadAllResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/conversations/read-all",
		))
	}

	suspend fun messagesStick(conversationId: Int, messageId: Int): ConversationsMessagesStickResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/conversations/$conversationId/messages/$messageId/stick",
		))
	}

	suspend fun messagesUnstick(conversationId: Int, messageId: Int): ConversationsMessagesUnstickResponse {
		return http.request(RequestOptions(
			method = "DELETE",
			path = "/conversations/$conversationId/messages/$messageId/stick",
		))
	}

	suspend fun star(conversationId: Int): ConversationsStarResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/conversations/$conversationId/star",
		))
	}

	suspend fun unstar(conversationId: Int): ConversationsUnstarResponse {
		return http.request(RequestOptions(
			method = "DELETE",
			path = "/conversations/$conversationId/star",
		))
	}

	suspend fun alertsEnable(conversationId: Int): ConversationsAlertsEnableResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/conversations/$conversationId/alerts",
		))
	}

	suspend fun alertsDisable(conversationId: Int): ConversationsAlertsDisableResponse {
		return http.request(RequestOptions(
			method = "DELETE",
			path = "/conversations/$conversationId/alerts",
		))
	}
}
