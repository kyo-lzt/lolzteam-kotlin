// Auto-generated. Do not edit manually.

package com.lolzteam.api.generated.forum

import com.lolzteam.api.runtime.LolzteamHttpClient
import com.lolzteam.api.runtime.RequestOptions
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.serializer

class ForumsApi(private val http: LolzteamHttpClient) {

	suspend fun list(params: ForumsListParams? = null): ForumsListResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/forums",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun grouped(): ForumsGroupedResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/forums/grouped",
		))
	}

	suspend fun get(forumId: Int): ForumsGetResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/forums/$forumId",
		))
	}

	suspend fun followers(forumId: Int): ForumsFollowersResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/forums/$forumId/followers",
		))
	}

	suspend fun follow(forumId: Int, body: ForumsFollowBody? = null): ForumsFollowResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/forums/$forumId/followers",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun unfollow(forumId: Int): ForumsUnfollowResponse {
		return http.request(RequestOptions(
			method = "DELETE",
			path = "/forums/$forumId/followers",
		))
	}

	suspend fun followed(params: ForumsFollowedParams? = null): ForumsFollowedResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/forums/followed",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun getFeedOptions(): ForumsGetFeedOptionsResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/forums/feed/options",
		))
	}

	suspend fun editFeedOptions(body: ForumsEditFeedOptionsBody? = null): ForumsEditFeedOptionsResponse {
		return http.request(RequestOptions(
			method = "PUT",
			path = "/forums/feed/options",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}
}
