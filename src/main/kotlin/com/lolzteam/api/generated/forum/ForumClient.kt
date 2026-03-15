// Auto-generated. Do not edit manually.

package com.lolzteam.api.generated.forum

import com.lolzteam.api.runtime.ClientConfig
import com.lolzteam.api.runtime.LolzteamHttpClient
import com.lolzteam.api.runtime.RateLimitConfig
import com.lolzteam.api.runtime.RequestOptions
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put
import kotlinx.serialization.serializer
import java.io.Closeable

public class OAuthApi(private val http: LolzteamHttpClient) {

	suspend fun token(body: OAuthTokenBody): OAuthTokenResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/oauth/token",
			body = http.json.encodeToJsonElement(serializer(), body),
			bodyEncoding = "multipart",
		))
	}
}


public class AssetsApi(private val http: LolzteamHttpClient) {

	suspend fun css(params: AssetsCssParams? = null): AssetsCssResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/css",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}
}


public class CategoriesApi(private val http: LolzteamHttpClient) {

	suspend fun list(params: CategoriesListParams? = null): CategoriesListResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/categories",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun get(categoryId: Int): CategoriesGetResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/categories/$categoryId",
		))
	}
}


public class ForumsApi(private val http: LolzteamHttpClient) {

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
			bodyEncoding = "json",
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
			bodyEncoding = "json",
		))
	}
}


public class LinksApi(private val http: LolzteamHttpClient) {

	suspend fun list(): LinksListResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/link-forums",
		))
	}

	suspend fun get(linkId: Int): LinksGetResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/link-forums/$linkId",
		))
	}
}


public class PagesApi(private val http: LolzteamHttpClient) {

	suspend fun list(params: PagesListParams? = null): PagesListResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/pages",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun get(pageId: Int): PagesGetResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/pages/$pageId",
		))
	}
}


public class NavigationApi(private val http: LolzteamHttpClient) {

	suspend fun list(params: NavigationListParams? = null): NavigationListResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/navigation",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}
}


public class ThreadsApi(private val http: LolzteamHttpClient) {

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
			bodyEncoding = "json",
		))
	}

	suspend fun createContest(body: ThreadsCreateContestBody): ThreadsCreateContestResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/contests",
			body = http.json.encodeToJsonElement(serializer(), body),
			bodyEncoding = "json",
		))
	}

	suspend fun claim(body: ThreadsClaimBody? = null): ThreadsClaimResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/claims",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
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
			bodyEncoding = "json",
		))
	}

	suspend fun delete(threadId: Int, body: ThreadsDeleteBody? = null): ThreadsDeleteResponse {
		return http.request(RequestOptions(
			method = "DELETE",
			path = "/threads/$threadId",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		))
	}

	suspend fun move(threadId: Int, body: ThreadsMoveBody? = null): ThreadsMoveResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/threads/$threadId/move",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
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
			bodyEncoding = "json",
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
			bodyEncoding = "json",
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


public class PostsApi(private val http: LolzteamHttpClient) {

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
			bodyEncoding = "json",
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
			bodyEncoding = "json",
		))
	}

	suspend fun delete(postId: Int, body: PostsDeleteBody? = null): PostsDeleteResponse {
		return http.request(RequestOptions(
			method = "DELETE",
			path = "/posts/$postId",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
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
			bodyEncoding = "json",
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
			bodyEncoding = "json",
		))
	}

	suspend fun commentsEdit(body: PostsCommentsEditBody? = null): PostsCommentsEditResponse {
		return http.request(RequestOptions(
			method = "PUT",
			path = "/posts/comments",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		))
	}

	suspend fun commentsDelete(body: PostsCommentsDeleteBody? = null): PostsCommentsDeleteResponse {
		return http.request(RequestOptions(
			method = "DELETE",
			path = "/posts/comments",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		))
	}

	suspend fun commentsReport(body: PostsCommentsReportBody? = null): PostsCommentsReportResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/posts/comments/report",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		))
	}
}


public class UsersApi(private val http: LolzteamHttpClient) {

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
			bodyEncoding = "json",
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
		if (body != null) {
			val jsonBody = buildJsonObject {
				body.x?.let { put("x", it) }
				body.y?.let { put("y", it) }
				body.crop?.let { put("crop", it) }
			}
			val byteFields = buildMap {
				put("avatar", body.avatar)
			}
			return http.request(RequestOptions(
				method = "POST",
				path = "/users/$userId/avatar",
				body = jsonBody,
				bodyEncoding = "multipart",
				byteArrayFields = byteFields,
			))
		} else {
			return http.request(RequestOptions(
				method = "POST",
				path = "/users/$userId/avatar",
				bodyEncoding = "multipart",
			))
		}
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
			bodyEncoding = "json",
		))
	}

	suspend fun backgroundUpload(userId: JsonElement, body: UsersBackgroundUploadBody? = null): UsersBackgroundUploadResponse {
		if (body != null) {
			val jsonBody = buildJsonObject {
				body.x?.let { put("x", it) }
				body.y?.let { put("y", it) }
				body.crop?.let { put("crop", it) }
			}
			val byteFields = buildMap {
				put("background", body.background)
			}
			return http.request(RequestOptions(
				method = "POST",
				path = "/users/$userId/background",
				body = jsonBody,
				bodyEncoding = "multipart",
				byteArrayFields = byteFields,
			))
		} else {
			return http.request(RequestOptions(
				method = "POST",
				path = "/users/$userId/background",
				bodyEncoding = "multipart",
			))
		}
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
			bodyEncoding = "json",
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


public class ProfilePostsApi(private val http: LolzteamHttpClient) {

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
			bodyEncoding = "json",
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
			bodyEncoding = "json",
		))
	}

	suspend fun create(body: ProfilePostsCreateBody? = null): ProfilePostsCreateResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/profile-posts",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
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
			bodyEncoding = "json",
		))
	}

	suspend fun commentsEdit(body: ProfilePostsCommentsEditBody? = null): ProfilePostsCommentsEditResponse {
		return http.request(RequestOptions(
			method = "PUT",
			path = "/profile-posts/comments",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		))
	}

	suspend fun commentsDelete(body: ProfilePostsCommentsDeleteBody? = null): ProfilePostsCommentsDeleteResponse {
		return http.request(RequestOptions(
			method = "DELETE",
			path = "/profile-posts/comments",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
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
			bodyEncoding = "json",
		))
	}
}


public class ConversationsApi(private val http: LolzteamHttpClient) {

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
			bodyEncoding = "json",
		))
	}

	suspend fun update(body: ConversationsUpdateBody? = null): ConversationsUpdateResponse {
		return http.request(RequestOptions(
			method = "PUT",
			path = "/conversations",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		))
	}

	suspend fun delete(body: ConversationsDeleteBody? = null): ConversationsDeleteResponse {
		return http.request(RequestOptions(
			method = "DELETE",
			path = "/conversations",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		))
	}

	suspend fun start(body: ConversationsStartBody? = null): ConversationsStartResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/conversations/start",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		))
	}

	suspend fun save(body: ConversationsSaveBody? = null): ConversationsSaveResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/conversations/save",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
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
			bodyEncoding = "json",
		))
	}

	suspend fun search(body: ConversationsSearchBody? = null): ConversationsSearchResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/conversations/search",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
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
			bodyEncoding = "json",
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
			bodyEncoding = "json",
		))
	}

	suspend fun kick(conversationId: Int, body: ConversationsKickBody? = null): ConversationsKickResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/conversations/$conversationId/kick",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
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


public class NotificationsApi(private val http: LolzteamHttpClient) {

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
			bodyEncoding = "json",
		))
	}
}


public class TagsApi(private val http: LolzteamHttpClient) {

	suspend fun popular(): TagsPopularResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/tags",
		))
	}

	suspend fun list(params: TagsListParams? = null): TagsListResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/tags/list",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun get(tagId: Int, params: TagsGetParams? = null): TagsGetResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/tags/$tagId",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun find(params: TagsFindParams? = null): TagsFindResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/tags/find",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}
}


public class SearchApi(private val http: LolzteamHttpClient) {

	suspend fun all(body: SearchAllBody? = null): SearchAllResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/search",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		))
	}

	suspend fun threads(body: SearchThreadsBody? = null): SearchThreadsResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/search/threads",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		))
	}

	suspend fun posts(body: SearchPostsBody? = null): SearchPostsResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/search/posts",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		))
	}

	suspend fun users(body: SearchUsersBody? = null): SearchUsersResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/search/users",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		))
	}

	suspend fun profilePosts(body: SearchProfilePostsBody? = null): SearchProfilePostsResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/search/profile-posts",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		))
	}

	suspend fun tagged(body: SearchTaggedBody? = null): SearchTaggedResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/search/tagged",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
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


public class BatchApi(private val http: LolzteamHttpClient) {

	suspend fun execute(body: BatchExecuteBody? = null): BatchExecuteResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/batch",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		))
	}
}


public class ChatboxApi(private val http: LolzteamHttpClient) {

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
			bodyEncoding = "json",
		))
	}

	suspend fun editMessage(body: ChatboxEditMessageBody? = null): ChatboxEditMessageResponse {
		return http.request(RequestOptions(
			method = "PUT",
			path = "/chatbox/messages",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		))
	}

	suspend fun deleteMessage(body: ChatboxDeleteMessageBody? = null): ChatboxDeleteMessageResponse {
		return http.request(RequestOptions(
			method = "DELETE",
			path = "/chatbox/messages",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
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
			bodyEncoding = "json",
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
			bodyEncoding = "json",
		))
	}

	suspend fun deleteIgnore(body: ChatboxDeleteIgnoreBody? = null): ChatboxDeleteIgnoreResponse {
		return http.request(RequestOptions(
			method = "DELETE",
			path = "/chatbox/ignore",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		))
	}
}


public class FormsApi(private val http: LolzteamHttpClient) {

	suspend fun list(params: FormsListParams? = null): FormsListResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/forms",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun create(body: FormsCreateBody? = null): FormsCreateResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/forms/save",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		))
	}
}


class ForumClient(config: ClientConfig) : Closeable {
	val oAuth: OAuthApi
	val assets: AssetsApi
	val categories: CategoriesApi
	val forums: ForumsApi
	val links: LinksApi
	val pages: PagesApi
	val navigation: NavigationApi
	val threads: ThreadsApi
	val posts: PostsApi
	val users: UsersApi
	val profilePosts: ProfilePostsApi
	val conversations: ConversationsApi
	val notifications: NotificationsApi
	val tags: TagsApi
	val search: SearchApi
	val batch: BatchApi
	val chatbox: ChatboxApi
	val forms: FormsApi

	private val http: LolzteamHttpClient

	init {
		http = LolzteamHttpClient(config.copy(
			baseUrl = config.baseUrl ?: "https://prod-api.lolz.live",
			rateLimit = config.rateLimit ?: RateLimitConfig(requestsPerMinute = 300),
		))
		oAuth = OAuthApi(http)
		assets = AssetsApi(http)
		categories = CategoriesApi(http)
		forums = ForumsApi(http)
		links = LinksApi(http)
		pages = PagesApi(http)
		navigation = NavigationApi(http)
		threads = ThreadsApi(http)
		posts = PostsApi(http)
		users = UsersApi(http)
		profilePosts = ProfilePostsApi(http)
		conversations = ConversationsApi(http)
		notifications = NotificationsApi(http)
		tags = TagsApi(http)
		search = SearchApi(http)
		batch = BatchApi(http)
		chatbox = ChatboxApi(http)
		forms = FormsApi(http)
	}

	override fun close() {
		http.close()
	}
}

