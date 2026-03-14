// Auto-generated. Do not edit manually.

package com.lolzteam.api.generated.forum

import com.lolzteam.api.runtime.LolzteamHttpClient
import com.lolzteam.api.runtime.RequestOptions
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.serializer

class ProfilePostsApi(private val http: LolzteamHttpClient) {

	suspend fun list(userId: JsonElement, params: ProfilePostsListParams? = null): ProfilePostsListResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/users/$userId/profile-posts",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun get(profilePostId: Int): ProfilePostsGetResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/profile-posts/$profilePostId",
		))
	}

	suspend fun edit(profilePostId: Int, body: ProfilePostsEditBody? = null): ProfilePostsEditResponse {
		return http.request(RequestOptions(
			method = "PUT",
			path = "/profile-posts/$profilePostId",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun delete(profilePostId: Int, params: ProfilePostsDeleteParams? = null): ProfilePostsDeleteResponse {
		return http.request(RequestOptions(
			method = "DELETE",
			path = "/profile-posts/$profilePostId",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun reportReasons(profilePostId: Int): ProfilePostsReportReasonsResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/profile-posts/$profilePostId/report",
		))
	}

	suspend fun report(profilePostId: Int, body: ProfilePostsReportBody? = null): ProfilePostsReportResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/profile-posts/$profilePostId/report",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun create(body: ProfilePostsCreateBody? = null): ProfilePostsCreateResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/profile-posts",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun stick(profilePostId: Int): ProfilePostsStickResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/profile-posts/$profilePostId/stick",
		))
	}

	suspend fun unstick(profilePostId: Int): ProfilePostsUnstickResponse {
		return http.request(RequestOptions(
			method = "DELETE",
			path = "/profile-posts/$profilePostId/stick",
		))
	}

	suspend fun likes(profilePostId: Int): ProfilePostsLikesResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/profile-posts/$profilePostId/likes",
		))
	}

	suspend fun like(profilePostId: Int): ProfilePostsLikeResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/profile-posts/$profilePostId/likes",
		))
	}

	suspend fun unlike(profilePostId: Int): ProfilePostsUnlikeResponse {
		return http.request(RequestOptions(
			method = "DELETE",
			path = "/profile-posts/$profilePostId/likes",
		))
	}

	suspend fun commentsList(params: ProfilePostsCommentsListParams? = null): ProfilePostsCommentsListResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/profile-posts/comments",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun commentsCreate(body: ProfilePostsCommentsCreateBody? = null): ProfilePostsCommentsCreateResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/profile-posts/comments",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun commentsEdit(body: ProfilePostsCommentsEditBody? = null): ProfilePostsCommentsEditResponse {
		return http.request(RequestOptions(
			method = "PUT",
			path = "/profile-posts/comments",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun commentsDelete(body: ProfilePostsCommentsDeleteBody? = null): ProfilePostsCommentsDeleteResponse {
		return http.request(RequestOptions(
			method = "DELETE",
			path = "/profile-posts/comments",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun commentsGet(profilePostId: Int, commentId: Int): ProfilePostsCommentsGetResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/profile-posts/$profilePostId/comments/$commentId",
		))
	}

	suspend fun commentsReport(commentId: Int, body: ProfilePostsCommentsReportBody? = null): ProfilePostsCommentsReportResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/profile-posts/comments/$commentId/report",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}
}
