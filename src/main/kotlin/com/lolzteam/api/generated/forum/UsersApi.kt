// Auto-generated. Do not edit manually.

package com.lolzteam.api.generated.forum

import com.lolzteam.api.runtime.LolzteamHttpClient
import com.lolzteam.api.runtime.RequestOptions
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.serializer

class UsersApi(private val http: LolzteamHttpClient) {

	suspend fun list(params: UsersListParams? = null): UsersListResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/users",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun fields(): UsersFieldsResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/users/fields",
		))
	}

	suspend fun find(params: UsersFindParams? = null): UsersFindResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/users/find",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun get(userId: JsonElement, params: UsersGetParams? = null): UsersGetResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/users/$userId",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun edit(userId: JsonElement, body: UsersEditBody? = null): UsersEditResponse {
		return http.request(RequestOptions(
			method = "PUT",
			path = "/users/$userId",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun claims(userId: JsonElement, params: UsersClaimsParams? = null): UsersClaimsResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/users/$userId/claims",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun avatarUpload(userId: JsonElement, body: UsersAvatarUploadBody? = null): UsersAvatarUploadResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/users/$userId/avatar",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			multipart = true,
		))
	}

	suspend fun avatarDelete(userId: JsonElement): UsersAvatarDeleteResponse {
		return http.request(RequestOptions(
			method = "DELETE",
			path = "/users/$userId/avatar",
		))
	}

	suspend fun avatarCrop(userId: JsonElement, body: UsersAvatarCropBody? = null): UsersAvatarCropResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/users/$userId/avatar/crop",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun backgroundUpload(userId: JsonElement, body: UsersBackgroundUploadBody? = null): UsersBackgroundUploadResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/users/$userId/background",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			multipart = true,
		))
	}

	suspend fun backgroundDelete(userId: JsonElement): UsersBackgroundDeleteResponse {
		return http.request(RequestOptions(
			method = "DELETE",
			path = "/users/$userId/background",
		))
	}

	suspend fun backgroundCrop(userId: JsonElement, body: UsersBackgroundCropBody): UsersBackgroundCropResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/users/$userId/background/crop",
			body = http.json.encodeToJsonElement(serializer(), body),
		))
	}

	suspend fun followers(userId: JsonElement, params: UsersFollowersParams? = null): UsersFollowersResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/users/$userId/followers",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun follow(userId: JsonElement): UsersFollowResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/users/$userId/followers",
		))
	}

	suspend fun unfollow(userId: JsonElement): UsersUnfollowResponse {
		return http.request(RequestOptions(
			method = "DELETE",
			path = "/users/$userId/followers",
		))
	}

	suspend fun followings(userId: JsonElement, params: UsersFollowingsParams? = null): UsersFollowingsResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/users/$userId/followings",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun likes(userId: JsonElement, params: UsersLikesParams? = null): UsersLikesResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/users/$userId/likes",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun ignored(params: UsersIgnoredParams? = null): UsersIgnoredResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/users/ignored",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun ignore(userId: JsonElement): UsersIgnoreResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/users/$userId/ignore",
		))
	}

	suspend fun ignoreEdit(userId: JsonElement, params: UsersIgnoreEditParams? = null): UsersIgnoreEditResponse {
		return http.request(RequestOptions(
			method = "PUT",
			path = "/users/$userId/ignore",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun unignore(userId: JsonElement): UsersUnignoreResponse {
		return http.request(RequestOptions(
			method = "DELETE",
			path = "/users/$userId/ignore",
		))
	}

	suspend fun contents(userId: JsonElement, params: UsersContentsParams? = null): UsersContentsResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/users/$userId/timeline",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun trophies(userId: JsonElement): UsersTrophiesResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/users/$userId/trophies",
		))
	}

	suspend fun secretAnswerTypes(): UsersSecretAnswerTypesResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/users/secret-answer/types",
		))
	}

	suspend fun saReset(): UsersSaResetResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/account/secret-answer/reset",
		))
	}

	suspend fun saCancelReset(): UsersSaCancelResetResponse {
		return http.request(RequestOptions(
			method = "DELETE",
			path = "/account/secret-answer/reset",
		))
	}
}
