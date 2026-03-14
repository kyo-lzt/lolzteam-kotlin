// Auto-generated. Do not edit manually.

package com.lolzteam.api.generated.forum

import com.lolzteam.api.runtime.LolzteamHttpClient
import com.lolzteam.api.runtime.RequestOptions
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.serializer

class ChatboxApi(private val http: LolzteamHttpClient) {

	suspend fun index(params: ChatboxIndexParams? = null): ChatboxIndexResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/chatbox",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun getMessages(params: ChatboxGetMessagesParams? = null): ChatboxGetMessagesResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/chatbox/messages",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun postMessage(body: ChatboxPostMessageBody? = null): ChatboxPostMessageResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/chatbox/messages",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun editMessage(body: ChatboxEditMessageBody? = null): ChatboxEditMessageResponse {
		return http.request(RequestOptions(
			method = "PUT",
			path = "/chatbox/messages",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun deleteMessage(body: ChatboxDeleteMessageBody? = null): ChatboxDeleteMessageResponse {
		return http.request(RequestOptions(
			method = "DELETE",
			path = "/chatbox/messages",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun online(params: ChatboxOnlineParams? = null): ChatboxOnlineResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/chatbox/messages/online",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun reportReasons(params: ChatboxReportReasonsParams? = null): ChatboxReportReasonsResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/chatbox/messages/report",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun report(body: ChatboxReportBody? = null): ChatboxReportResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/chatbox/messages/report",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun getLeaderboard(params: ChatboxGetLeaderboardParams? = null): ChatboxGetLeaderboardResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/chatbox/messages/leaderboard",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun getIgnore(): ChatboxGetIgnoreResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/chatbox/ignore",
		))
	}

	suspend fun postIgnore(body: ChatboxPostIgnoreBody? = null): ChatboxPostIgnoreResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/chatbox/ignore",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun deleteIgnore(body: ChatboxDeleteIgnoreBody? = null): ChatboxDeleteIgnoreResponse {
		return http.request(RequestOptions(
			method = "DELETE",
			path = "/chatbox/ignore",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}
}
