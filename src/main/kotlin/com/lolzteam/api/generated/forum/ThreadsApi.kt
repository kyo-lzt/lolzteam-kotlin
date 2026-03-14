// Auto-generated. Do not edit manually.

package com.lolzteam.api.generated.forum

import com.lolzteam.api.runtime.LolzteamHttpClient
import com.lolzteam.api.runtime.RequestOptions
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.serializer

class ThreadsApi(private val http: LolzteamHttpClient) {

	suspend fun list(params: ThreadsListParams? = null): ThreadsListResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/threads",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun create(body: ThreadsCreateBody? = null): ThreadsCreateResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/threads",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun createContest(body: ThreadsCreateContestBody): ThreadsCreateContestResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/contests",
			body = http.json.encodeToJsonElement(serializer(), body),
		))
	}

	suspend fun claim(body: ThreadsClaimBody? = null): ThreadsClaimResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/claims",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun get(threadId: Int, params: ThreadsGetParams? = null): ThreadsGetResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/threads/$threadId",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun edit(threadId: Int, body: ThreadsEditBody? = null): ThreadsEditResponse {
		return http.request(RequestOptions(
			method = "PUT",
			path = "/threads/$threadId",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun delete(threadId: Int, body: ThreadsDeleteBody? = null): ThreadsDeleteResponse {
		return http.request(RequestOptions(
			method = "DELETE",
			path = "/threads/$threadId",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun move(threadId: Int, body: ThreadsMoveBody? = null): ThreadsMoveResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/threads/$threadId/move",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun bump(threadId: Int): ThreadsBumpResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/threads/$threadId/bump",
		))
	}

	suspend fun hide(threadId: Int): ThreadsHideResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/threads/$threadId/hide",
		))
	}

	suspend fun star(threadId: Int): ThreadsStarResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/threads/$threadId/star",
		))
	}

	suspend fun unstar(threadId: Int): ThreadsUnstarResponse {
		return http.request(RequestOptions(
			method = "DELETE",
			path = "/threads/$threadId/star",
		))
	}

	suspend fun followers(threadId: Int): ThreadsFollowersResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/threads/$threadId/followers",
		))
	}

	suspend fun follow(threadId: Int, body: ThreadsFollowBody? = null): ThreadsFollowResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/threads/$threadId/followers",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun unfollow(threadId: Int): ThreadsUnfollowResponse {
		return http.request(RequestOptions(
			method = "DELETE",
			path = "/threads/$threadId/followers",
		))
	}

	suspend fun followed(params: ThreadsFollowedParams? = null): ThreadsFollowedResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/threads/followed",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun navigation(threadId: Int): ThreadsNavigationResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/threads/$threadId/navigation",
		))
	}

	suspend fun pollGet(threadId: Int): ThreadsPollGetResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/threads/$threadId/poll",
		))
	}

	suspend fun pollVote(threadId: Int, body: ThreadsPollVoteBody? = null): ThreadsPollVoteResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/threads/$threadId/poll/votes",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun unread(params: ThreadsUnreadParams? = null): ThreadsUnreadResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/threads/new",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun recent(params: ThreadsRecentParams? = null): ThreadsRecentResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/threads/recent",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun finish(threadId: Int): ThreadsFinishResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/contests/$threadId/finish",
		))
	}
}
