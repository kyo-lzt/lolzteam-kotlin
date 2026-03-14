// Auto-generated. Do not edit manually.

package com.lolzteam.api.generated.forum

import com.lolzteam.api.runtime.LolzteamHttpClient
import com.lolzteam.api.runtime.RequestOptions
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.serializer

class SearchApi(private val http: LolzteamHttpClient) {

	suspend fun all(body: SearchAllBody? = null): SearchAllResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/search",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun threads(body: SearchThreadsBody? = null): SearchThreadsResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/search/threads",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun posts(body: SearchPostsBody? = null): SearchPostsResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/search/posts",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun users(body: SearchUsersBody? = null): SearchUsersResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/search/users",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun profilePosts(body: SearchProfilePostsBody? = null): SearchProfilePostsResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/search/profile-posts",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun tagged(body: SearchTaggedBody? = null): SearchTaggedResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/search/tagged",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun results(searchId: JsonElement, params: SearchResultsParams? = null): SearchResultsResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/search/$searchId/results",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}
}
