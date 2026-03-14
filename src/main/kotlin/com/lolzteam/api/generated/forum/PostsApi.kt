// Auto-generated. Do not edit manually.

package com.lolzteam.api.generated.forum

import com.lolzteam.api.runtime.LolzteamHttpClient
import com.lolzteam.api.runtime.RequestOptions
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.serializer

class PostsApi(private val http: LolzteamHttpClient) {

	suspend fun list(params: PostsListParams? = null): PostsListResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/posts",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun create(body: PostsCreateBody? = null): PostsCreateResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/posts",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun get(postId: Int): PostsGetResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/posts/$postId",
		))
	}

	suspend fun edit(postId: Int, body: PostsEditBody? = null): PostsEditResponse {
		return http.request(RequestOptions(
			method = "PUT",
			path = "/posts/$postId",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun delete(postId: Int, body: PostsDeleteBody? = null): PostsDeleteResponse {
		return http.request(RequestOptions(
			method = "DELETE",
			path = "/posts/$postId",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun likes(postId: Int, params: PostsLikesParams? = null): PostsLikesResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/posts/$postId/likes",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun like(postId: Int): PostsLikeResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/posts/$postId/likes",
		))
	}

	suspend fun unlike(postId: Int): PostsUnlikeResponse {
		return http.request(RequestOptions(
			method = "DELETE",
			path = "/posts/$postId/likes",
		))
	}

	suspend fun reportReasons(postId: Int): PostsReportReasonsResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/posts/$postId/report",
		))
	}

	suspend fun report(postId: Int, body: PostsReportBody? = null): PostsReportResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/posts/$postId/report",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun commentsGet(params: PostsCommentsGetParams? = null): PostsCommentsGetResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/posts/comments",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun commentsCreate(body: PostsCommentsCreateBody? = null): PostsCommentsCreateResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/posts/comments",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun commentsEdit(body: PostsCommentsEditBody? = null): PostsCommentsEditResponse {
		return http.request(RequestOptions(
			method = "PUT",
			path = "/posts/comments",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun commentsDelete(body: PostsCommentsDeleteBody? = null): PostsCommentsDeleteResponse {
		return http.request(RequestOptions(
			method = "DELETE",
			path = "/posts/comments",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun commentsReport(body: PostsCommentsReportBody? = null): PostsCommentsReportResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/posts/comments/report",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}
}
