// Auto-generated. Do not edit manually.

package com.lolzteam.api.generated.forum

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject

// ─── OAuthApi Types ────────────────────────────────────────

@Serializable
data class OAuthTokenBody(
	@SerialName("grant_type")
	val grantType: String? = null,
	@SerialName("client_id")
	val clientId: String? = null,
	@SerialName("client_secret")
	val clientSecret: String? = null,
	val scope: JsonElement? = null,
	val code: String? = null,
	@SerialName("redirect_uri")
	val redirectUri: String? = null,
	@SerialName("refresh_token")
	val refreshToken: String? = null,
	val username: String? = null,
	val password: String? = null,
)

typealias OAuthTokenResponse = JsonElement

// ─── AssetsApi Types ────────────────────────────────────────

@Serializable
data class AssetsCssParams(
	val css: List<String>? = null,
)

typealias AssetsCssResponse = JsonElement

// ─── CategoriesApi Types ────────────────────────────────────────

@Serializable
data class CategoriesListParams(
	@SerialName("parent_category_id")
	val parentCategoryId: Int? = null,
	@SerialName("parent_forum_id")
	val parentForumId: Int? = null,
	val order: String? = null,
)

typealias CategoriesListResponse = JsonElement

typealias CategoriesGetResponse = JsonElement

// ─── ForumsApi Types ────────────────────────────────────────

@Serializable
data class ForumsListParams(
	@SerialName("parent_category_id")
	val parentCategoryId: Int? = null,
	@SerialName("parent_forum_id")
	val parentForumId: Int? = null,
	val order: String? = null,
)

typealias ForumsListResponse = JsonElement

typealias ForumsGroupedResponse = JsonElement

typealias ForumsGetResponse = JsonElement

typealias ForumsFollowersResponse = JsonElement

@Serializable
data class ForumsFollowBody(
	val post: Boolean? = null,
	val alert: Boolean? = null,
	val email: Boolean? = null,
	@SerialName("prefix_ids")
	val prefixIds: List<Int>? = null,
	@SerialName("minimal_contest_amount")
	val minimalContestAmount: Int? = null,
)

typealias ForumsFollowResponse = JsonElement

typealias ForumsUnfollowResponse = JsonElement

@Serializable
data class ForumsFollowedParams(
	val total: Boolean? = null,
)

typealias ForumsFollowedResponse = JsonElement

typealias ForumsGetFeedOptionsResponse = JsonElement

@Serializable
data class ForumsEditFeedOptionsBody(
	@SerialName("node_ids")
	val nodeIds: List<Int>? = null,
	val keywords: List<String>? = null,
)

typealias ForumsEditFeedOptionsResponse = JsonElement

// ─── LinksApi Types ────────────────────────────────────────

typealias LinksListResponse = JsonElement

typealias LinksGetResponse = JsonElement

// ─── PagesApi Types ────────────────────────────────────────

@Serializable
data class PagesListParams(
	@SerialName("parent_page_id")
	val parentPageId: Int? = null,
	val order: String? = null,
)

typealias PagesListResponse = JsonElement

typealias PagesGetResponse = JsonElement

// ─── NavigationApi Types ────────────────────────────────────────

@Serializable
data class NavigationListParams(
	val parent: Int? = null,
)

typealias NavigationListResponse = JsonElement

// ─── ThreadsApi Types ────────────────────────────────────────

@Serializable
data class ThreadsListParams(
	@SerialName("forum_id")
	val forumId: Int? = null,
	val tab: String? = null,
	val state: String? = null,
	val period: String? = null,
	val title: String? = null,
	@SerialName("title_only")
	val titleOnly: Boolean? = null,
	@SerialName("creator_user_id")
	val creatorUserId: Int? = null,
	val sticky: Boolean? = null,
	@SerialName("prefix_ids[]")
	val prefixIds: List<Int>? = null,
	@SerialName("prefix_ids_not[]")
	val prefixIdsNot: List<Int>? = null,
	@SerialName("thread_tag_id")
	val threadTagId: Int? = null,
	val page: Int? = null,
	val limit: Int? = null,
	val order: String? = null,
	val direction: String? = null,
	@SerialName("thread_create_date")
	val threadCreateDate: Int? = null,
	@SerialName("thread_update_date")
	val threadUpdateDate: Int? = null,
	@SerialName("fields_include")
	val fieldsInclude: JsonElement? = null,
)

typealias ThreadsListResponse = JsonElement

@Serializable
data class ThreadsCreateBody(
	@SerialName("post_body")
	val postBody: String,
	@SerialName("forum_id")
	val forumId: Int,
	val title: String? = null,
	@SerialName("title_en")
	val titleEn: String? = null,
	@SerialName("prefix_id")
	val prefixId: List<Int>? = null,
	val tags: List<String>? = null,
	@SerialName("hide_contacts")
	val hideContacts: Boolean? = null,
	@SerialName("allow_ask_hidden_content")
	val allowAskHiddenContent: Boolean? = null,
	@SerialName("reply_group")
	val replyGroup: JsonElement? = null,
	@SerialName("comment_ignore_group")
	val commentIgnoreGroup: Boolean? = null,
	@SerialName("dont_alert_followers")
	val dontAlertFollowers: Boolean? = null,
	@SerialName("schedule_date")
	val scheduleDate: String? = null,
	@SerialName("schedule_time")
	val scheduleTime: String? = null,
	@SerialName("watch_thread_state")
	val watchThreadState: Boolean? = null,
	@SerialName("watch_thread")
	val watchThread: Boolean? = null,
	@SerialName("watch_thread_email")
	val watchThreadEmail: Boolean? = null,
)

typealias ThreadsCreateResponse = JsonElement

@Serializable
data class ThreadsCreateContestBody(
	@SerialName("post_body")
	val postBody: String,
	val title: String? = null,
	@SerialName("title_en")
	val titleEn: String? = null,
	@SerialName("contest_type")
	val contestType: String,
	@SerialName("length_value")
	val lengthValue: Int? = null,
	@SerialName("length_option")
	val lengthOption: String? = null,
	@SerialName("prize_type")
	val prizeType: String,
	@SerialName("count_winners")
	val countWinners: Int? = null,
	@SerialName("prize_data_money")
	val prizeDataMoney: Double? = null,
	@SerialName("is_money_places")
	val isMoneyPlaces: Boolean? = null,
	@SerialName("prize_data_places")
	val prizeDataPlaces: List<Double>? = null,
	@SerialName("prize_data_upgrade")
	val prizeDataUpgrade: JsonElement? = null,
	@SerialName("require_like_count")
	val requireLikeCount: Int,
	@SerialName("require_total_like_count")
	val requireTotalLikeCount: Int,
	@SerialName("secret_answer")
	val secretAnswer: String? = null,
	val tags: List<String>? = null,
	@SerialName("reply_group")
	val replyGroup: JsonElement? = null,
	@SerialName("comment_ignore_group")
	val commentIgnoreGroup: Boolean? = null,
	@SerialName("dont_alert_followers")
	val dontAlertFollowers: Boolean? = null,
	@SerialName("hide_contacts")
	val hideContacts: Boolean? = null,
	@SerialName("allow_ask_hidden_content")
	val allowAskHiddenContent: Boolean? = null,
	@SerialName("schedule_date")
	val scheduleDate: String? = null,
	@SerialName("schedule_time")
	val scheduleTime: String? = null,
	@SerialName("watch_thread_state")
	val watchThreadState: Boolean? = null,
	@SerialName("watch_thread")
	val watchThread: Boolean? = null,
	@SerialName("watch_thread_email")
	val watchThreadEmail: Boolean? = null,
)

typealias ThreadsCreateContestResponse = JsonElement

@Serializable
data class ThreadsClaimBody(
	@SerialName("as_responder")
	val asResponder: String,
	@SerialName("as_is_market_deal")
	val asIsMarketDeal: Boolean,
	@SerialName("as_market_item_id")
	val asMarketItemId: Int? = null,
	@SerialName("as_data")
	val asData: String? = null,
	@SerialName("as_amount")
	val asAmount: Double,
	val currency: String? = null,
	@SerialName("transfer_type")
	val transferType: String,
	@SerialName("pay_claim")
	val payClaim: String? = null,
	@SerialName("as_funds_receipt")
	val asFundsReceipt: String? = null,
	@SerialName("as_tg_login_screenshot")
	val asTgLoginScreenshot: String? = null,
	val tags: List<String>? = null,
	@SerialName("hide_contacts")
	val hideContacts: Boolean? = null,
	@SerialName("allow_ask_hidden_content")
	val allowAskHiddenContent: Boolean? = null,
	@SerialName("reply_group")
	val replyGroup: JsonElement? = null,
	@SerialName("comment_ignore_group")
	val commentIgnoreGroup: Boolean? = null,
	@SerialName("dont_alert_followers")
	val dontAlertFollowers: Boolean? = null,
	@SerialName("schedule_date")
	val scheduleDate: String? = null,
	@SerialName("schedule_time")
	val scheduleTime: String? = null,
	@SerialName("watch_thread_state")
	val watchThreadState: Boolean? = null,
	@SerialName("watch_thread")
	val watchThread: Boolean? = null,
	@SerialName("watch_thread_email")
	val watchThreadEmail: Boolean? = null,
	@SerialName("post_body")
	val postBody: String,
)

typealias ThreadsClaimResponse = JsonElement

@Serializable
data class ThreadsGetParams(
	@SerialName("fields_include")
	val fieldsInclude: JsonElement? = null,
)

typealias ThreadsGetResponse = JsonElement

@Serializable
data class ThreadsEditBody(
	val title: String? = null,
	@SerialName("title_en")
	val titleEn: String? = null,
	@SerialName("prefix_id")
	val prefixId: List<Int>? = null,
	val tags: List<String>? = null,
	@SerialName("discussion_open")
	val discussionOpen: Boolean? = null,
	@SerialName("hide_contacts")
	val hideContacts: Boolean? = null,
	@SerialName("allow_ask_hidden_content")
	val allowAskHiddenContent: Boolean? = null,
	@SerialName("reply_group")
	val replyGroup: JsonElement? = null,
	@SerialName("comment_ignore_group")
	val commentIgnoreGroup: Boolean? = null,
)

typealias ThreadsEditResponse = JsonElement

@Serializable
data class ThreadsDeleteBody(
	val reason: String? = null,
)

typealias ThreadsDeleteResponse = JsonElement

@Serializable
data class ThreadsMoveBody(
	@SerialName("node_id")
	val nodeId: String,
	val title: String? = null,
	@SerialName("title_en")
	val titleEn: String? = null,
	@SerialName("prefix_id")
	val prefixId: List<Int>? = null,
	@SerialName("apply_thread_prefix")
	val applyThreadPrefix: Boolean? = null,
	@SerialName("send_alert")
	val sendAlert: Boolean? = null,
)

typealias ThreadsMoveResponse = JsonElement

typealias ThreadsBumpResponse = JsonElement

typealias ThreadsHideResponse = JsonElement

typealias ThreadsStarResponse = JsonElement

typealias ThreadsUnstarResponse = JsonElement

typealias ThreadsFollowersResponse = JsonElement

@Serializable
data class ThreadsFollowBody(
	val email: Boolean? = null,
)

typealias ThreadsFollowResponse = JsonElement

typealias ThreadsUnfollowResponse = JsonElement

@Serializable
data class ThreadsFollowedParams(
	val total: Boolean? = null,
	@SerialName("fields_include")
	val fieldsInclude: JsonElement? = null,
)

typealias ThreadsFollowedResponse = JsonElement

typealias ThreadsNavigationResponse = JsonElement

typealias ThreadsPollGetResponse = JsonElement

@Serializable
data class ThreadsPollVoteBody(
	@SerialName("response_id")
	val responseId: Int? = null,
	@SerialName("response_ids")
	val responseIds: List<Int>? = null,
)

typealias ThreadsPollVoteResponse = JsonElement

@Serializable
data class ThreadsUnreadParams(
	val limit: Int? = null,
	@SerialName("forum_id")
	val forumId: Int? = null,
	@SerialName("data_limit")
	val dataLimit: Int? = null,
)

typealias ThreadsUnreadResponse = JsonElement

@Serializable
data class ThreadsRecentParams(
	val days: Int? = null,
	val limit: Int? = null,
	@SerialName("forum_id")
	val forumId: Int? = null,
	@SerialName("data_limit")
	val dataLimit: Int? = null,
)

typealias ThreadsRecentResponse = JsonElement

typealias ThreadsFinishResponse = JsonElement

// ─── PostsApi Types ────────────────────────────────────────

@Serializable
data class PostsListParams(
	@SerialName("thread_id")
	val threadId: Int? = null,
	@SerialName("page_of_post_id")
	val pageOfPostId: Int? = null,
	val page: Int? = null,
	val limit: Int? = null,
	val order: String? = null,
)

typealias PostsListResponse = JsonElement

@Serializable
data class PostsCreateBody(
	@SerialName("post_body")
	val postBody: String,
	@SerialName("thread_id")
	val threadId: Int? = null,
	@SerialName("quote_post_id")
	val quotePostId: Int? = null,
)

typealias PostsCreateResponse = JsonElement

typealias PostsGetResponse = JsonElement

@Serializable
data class PostsEditBody(
	@SerialName("post_body")
	val postBody: String? = null,
)

typealias PostsEditResponse = JsonElement

@Serializable
data class PostsDeleteBody(
	val reason: String? = null,
)

typealias PostsDeleteResponse = JsonElement

@Serializable
data class PostsLikesParams(
	val page: Int? = null,
	val limit: Int? = null,
)

typealias PostsLikesResponse = JsonElement

typealias PostsLikeResponse = JsonElement

typealias PostsUnlikeResponse = JsonElement

typealias PostsReportReasonsResponse = JsonElement

@Serializable
data class PostsReportBody(
	val message: String,
)

typealias PostsReportResponse = JsonElement

@Serializable
data class PostsCommentsGetParams(
	@SerialName("post_id")
	val postId: Int,
	val before: Int? = null,
	@SerialName("before_comment")
	val beforeComment: Int? = null,
)

typealias PostsCommentsGetResponse = JsonElement

@Serializable
data class PostsCommentsCreateBody(
	@SerialName("post_id")
	val postId: Int,
	@SerialName("comment_body")
	val commentBody: String,
)

typealias PostsCommentsCreateResponse = JsonElement

@Serializable
data class PostsCommentsEditBody(
	@SerialName("post_comment_id")
	val postCommentId: Int,
	@SerialName("comment_body")
	val commentBody: String,
)

typealias PostsCommentsEditResponse = JsonElement

@Serializable
data class PostsCommentsDeleteBody(
	@SerialName("post_comment_id")
	val postCommentId: Int,
	val reason: String? = null,
)

typealias PostsCommentsDeleteResponse = JsonElement

@Serializable
data class PostsCommentsReportBody(
	@SerialName("post_comment_id")
	val postCommentId: Int,
	val message: String,
)

typealias PostsCommentsReportResponse = JsonElement

// ─── UsersApi Types ────────────────────────────────────────

@Serializable
data class UsersListParams(
	val page: Int? = null,
	val limit: Int? = null,
	@SerialName("fields_include")
	val fieldsInclude: JsonElement? = null,
)

typealias UsersListResponse = JsonElement

typealias UsersFieldsResponse = JsonElement

@Serializable
data class UsersFindParams(
	val username: String? = null,
	@SerialName("custom_fields")
	val customFields: JsonObject? = null,
	@SerialName("fields_include")
	val fieldsInclude: JsonElement? = null,
)

typealias UsersFindResponse = JsonElement

@Serializable
data class UsersGetParams(
	@SerialName("fields_include")
	val fieldsInclude: JsonElement? = null,
)

typealias UsersGetResponse = JsonElement

@Serializable
data class UsersEditBody(
	val username: String? = null,
	@SerialName("user_title")
	val userTitle: String? = null,
	@SerialName("display_group_id")
	val displayGroupId: Int? = null,
	@SerialName("display_icon_group_id")
	val displayIconGroupId: Int? = null,
	@SerialName("display_banner_id")
	val displayBannerId: Int? = null,
	@SerialName("conv_welcome_message")
	val convWelcomeMessage: String? = null,
	@SerialName("user_dob_day")
	val userDobDay: Int? = null,
	@SerialName("user_dob_month")
	val userDobMonth: Int? = null,
	@SerialName("user_dob_year")
	val userDobYear: Int? = null,
	@SerialName("secret_answer")
	val secretAnswer: String? = null,
	@SerialName("secret_answer_type")
	val secretAnswerType: Int? = null,
	@SerialName("short_link")
	val shortLink: String? = null,
	@SerialName("language_id")
	val languageId: JsonElement? = null,
	val gender: String? = null,
	val timezone: String? = null,
	@SerialName("receive_admin_email")
	val receiveAdminEmail: Boolean? = null,
	@SerialName("activity_visible")
	val activityVisible: Boolean? = null,
	@SerialName("show_dob_date")
	val showDobDate: Boolean? = null,
	@SerialName("show_dob_year")
	val showDobYear: Boolean? = null,
	@SerialName("hide_username_change_logs")
	val hideUsernameChangeLogs: Boolean? = null,
	@SerialName("allow_view_profile")
	val allowViewProfile: String? = null,
	@SerialName("allow_post_profile")
	val allowPostProfile: String? = null,
	@SerialName("allow_send_personal_conversation")
	val allowSendPersonalConversation: String? = null,
	@SerialName("allow_invite_group")
	val allowInviteGroup: String? = null,
	@SerialName("allow_receive_news_feed")
	val allowReceiveNewsFeed: String? = null,
	val alert: JsonObject? = null,
	val fields: JsonObject? = null,
)

typealias UsersEditResponse = JsonElement

@Serializable
data class UsersClaimsParams(
	val type: String? = null,
	@SerialName("claim_state")
	val claimState: String? = null,
)

typealias UsersClaimsResponse = JsonElement

data class UsersAvatarUploadBody(
	val avatar: ByteArray,
	val x: Int? = null,
	val y: Int? = null,
	val crop: Int? = null,
)

typealias UsersAvatarUploadResponse = JsonElement

typealias UsersAvatarDeleteResponse = JsonElement

@Serializable
data class UsersAvatarCropBody(
	val x: Int? = null,
	val y: Int? = null,
	val crop: Int? = null,
)

typealias UsersAvatarCropResponse = JsonElement

data class UsersBackgroundUploadBody(
	val background: ByteArray,
	val x: Int? = null,
	val y: Int? = null,
	val crop: Int? = null,
)

typealias UsersBackgroundUploadResponse = JsonElement

typealias UsersBackgroundDeleteResponse = JsonElement

@Serializable
data class UsersBackgroundCropBody(
	val x: Int? = null,
	val y: Int? = null,
	val crop: Int? = null,
)

typealias UsersBackgroundCropResponse = JsonElement

@Serializable
data class UsersFollowersParams(
	val order: String? = null,
	val page: Int? = null,
	val limit: Int? = null,
)

typealias UsersFollowersResponse = JsonElement

typealias UsersFollowResponse = JsonElement

typealias UsersUnfollowResponse = JsonElement

@Serializable
data class UsersFollowingsParams(
	val order: String? = null,
	val page: Int? = null,
	val limit: Int? = null,
)

typealias UsersFollowingsResponse = JsonElement

@Serializable
data class UsersLikesParams(
	@SerialName("node_id")
	val nodeId: Int? = null,
	@SerialName("like_type")
	val likeType: String? = null,
	val type: String? = null,
	val page: Int? = null,
	@SerialName("content_type")
	val contentType: String? = null,
	@SerialName("search_user_id")
	val searchUserId: Int? = null,
	val stats: Boolean? = null,
)

typealias UsersLikesResponse = JsonElement

@Serializable
data class UsersIgnoredParams(
	val total: Boolean? = null,
)

typealias UsersIgnoredResponse = JsonElement

typealias UsersIgnoreResponse = JsonElement

@Serializable
data class UsersIgnoreEditParams(
	@SerialName("ignore_conversations")
	val ignoreConversations: Boolean? = null,
	@SerialName("ignore_content")
	val ignoreContent: Boolean? = null,
	@SerialName("restrict_view_profile")
	val restrictViewProfile: Boolean? = null,
)

typealias UsersIgnoreEditResponse = JsonElement

typealias UsersUnignoreResponse = JsonElement

@Serializable
data class UsersContentsParams(
	val page: Int? = null,
	val limit: Int? = null,
)

typealias UsersContentsResponse = JsonElement

typealias UsersTrophiesResponse = JsonElement

typealias UsersSecretAnswerTypesResponse = JsonElement

typealias UsersSaResetResponse = JsonElement

typealias UsersSaCancelResetResponse = JsonElement

// ─── ProfilePostsApi Types ────────────────────────────────────────

@Serializable
data class ProfilePostsListParams(
	@SerialName("posts_user_id")
	val postsUserId: Int? = null,
	val page: Int? = null,
	val limit: Int? = null,
	@SerialName("fields_include")
	val fieldsInclude: JsonElement? = null,
)

typealias ProfilePostsListResponse = JsonElement

typealias ProfilePostsGetResponse = JsonElement

@Serializable
data class ProfilePostsEditBody(
	@SerialName("post_body")
	val postBody: String? = null,
	@SerialName("disable_comments")
	val disableComments: Boolean? = null,
)

typealias ProfilePostsEditResponse = JsonElement

@Serializable
data class ProfilePostsDeleteParams(
	val reason: String? = null,
)

typealias ProfilePostsDeleteResponse = JsonElement

typealias ProfilePostsReportReasonsResponse = JsonElement

@Serializable
data class ProfilePostsReportBody(
	val message: String,
)

typealias ProfilePostsReportResponse = JsonElement

@Serializable
data class ProfilePostsCreateBody(
	@SerialName("user_id")
	val userId: JsonElement,
	@SerialName("post_body")
	val postBody: String,
)

typealias ProfilePostsCreateResponse = JsonElement

typealias ProfilePostsStickResponse = JsonElement

typealias ProfilePostsUnstickResponse = JsonElement

typealias ProfilePostsLikesResponse = JsonElement

typealias ProfilePostsLikeResponse = JsonElement

typealias ProfilePostsUnlikeResponse = JsonElement

@Serializable
data class ProfilePostsCommentsListParams(
	@SerialName("profile_post_id")
	val profilePostId: Int,
	val before: Int? = null,
	val limit: Int? = null,
)

typealias ProfilePostsCommentsListResponse = JsonElement

@Serializable
data class ProfilePostsCommentsCreateBody(
	@SerialName("profile_post_id")
	val profilePostId: Int,
	@SerialName("comment_body")
	val commentBody: String,
)

typealias ProfilePostsCommentsCreateResponse = JsonElement

@Serializable
data class ProfilePostsCommentsEditBody(
	@SerialName("comment_id")
	val commentId: Int,
	@SerialName("comment_body")
	val commentBody: String,
)

typealias ProfilePostsCommentsEditResponse = JsonElement

@Serializable
data class ProfilePostsCommentsDeleteBody(
	@SerialName("comment_id")
	val commentId: Int,
)

typealias ProfilePostsCommentsDeleteResponse = JsonElement

typealias ProfilePostsCommentsGetResponse = JsonElement

@Serializable
data class ProfilePostsCommentsReportBody(
	val message: String,
)

typealias ProfilePostsCommentsReportResponse = JsonElement

// ─── ConversationsApi Types ────────────────────────────────────────

@Serializable
data class ConversationsListParams(
	val folder: String? = null,
	val page: Int? = null,
	val limit: Int? = null,
)

typealias ConversationsListResponse = JsonElement

@Serializable
data class ConversationsCreateBody(
	@SerialName("recipient_id")
	val recipientId: Int? = null,
	val recipients: List<String>? = null,
	@SerialName("is_group")
	val isGroup: Boolean? = null,
	val title: String? = null,
	@SerialName("open_invite")
	val openInvite: Boolean? = null,
	@SerialName("allow_edit_messages")
	val allowEditMessages: Boolean? = null,
	@SerialName("allow_sticky_messages")
	val allowStickyMessages: Boolean? = null,
	@SerialName("allow_delete_own_messages")
	val allowDeleteOwnMessages: Boolean? = null,
	@SerialName("message_body")
	val messageBody: String? = null,
)

typealias ConversationsCreateResponse = JsonElement

@Serializable
data class ConversationsUpdateBody(
	@SerialName("conversation_id")
	val conversationId: Int,
	val title: String? = null,
	@SerialName("open_invite")
	val openInvite: Boolean? = null,
	@SerialName("history_open")
	val historyOpen: Boolean? = null,
	@SerialName("allow_edit_messages")
	val allowEditMessages: Boolean? = null,
	@SerialName("allow_sticky_messages")
	val allowStickyMessages: Boolean? = null,
	@SerialName("allow_delete_own_messages")
	val allowDeleteOwnMessages: Boolean? = null,
)

typealias ConversationsUpdateResponse = JsonElement

@Serializable
data class ConversationsDeleteBody(
	@SerialName("conversation_id")
	val conversationId: Int,
	@SerialName("delete_type")
	val deleteType: String,
)

typealias ConversationsDeleteResponse = JsonElement

@Serializable
data class ConversationsStartBody(
	@SerialName("user_id")
	val userId: JsonElement,
)

typealias ConversationsStartResponse = JsonElement

@Serializable
data class ConversationsSaveBody(
	val link: String,
)

typealias ConversationsSaveResponse = JsonElement

typealias ConversationsGetResponse = JsonElement

@Serializable
data class ConversationsMessagesListParams(
	val page: Int? = null,
	val limit: Int? = null,
	val order: String? = null,
	val before: Int? = null,
	val after: Int? = null,
)

typealias ConversationsMessagesListResponse = JsonElement

@Serializable
data class ConversationsMessagesCreateBody(
	@SerialName("reply_message_id")
	val replyMessageId: Int? = null,
	@SerialName("message_body")
	val messageBody: String,
)

typealias ConversationsMessagesCreateResponse = JsonElement

@Serializable
data class ConversationsSearchBody(
	val q: String? = null,
	@SerialName("conversation_id")
	val conversationId: Int? = null,
	@SerialName("search_recipients")
	val searchRecipients: Boolean? = null,
)

typealias ConversationsSearchResponse = JsonElement

typealias ConversationsMessagesGetResponse = JsonElement

@Serializable
data class ConversationsMessagesEditBody(
	@SerialName("message_body")
	val messageBody: String,
)

typealias ConversationsMessagesEditResponse = JsonElement

typealias ConversationsMessagesDeleteResponse = JsonElement

@Serializable
data class ConversationsInviteBody(
	val recipients: List<String>,
)

typealias ConversationsInviteResponse = JsonElement

@Serializable
data class ConversationsKickBody(
	@SerialName("user_id")
	val userId: Int,
)

typealias ConversationsKickResponse = JsonElement

typealias ConversationsReadResponse = JsonElement

typealias ConversationsReadAllResponse = JsonElement

typealias ConversationsMessagesStickResponse = JsonElement

typealias ConversationsMessagesUnstickResponse = JsonElement

typealias ConversationsStarResponse = JsonElement

typealias ConversationsUnstarResponse = JsonElement

typealias ConversationsAlertsEnableResponse = JsonElement

typealias ConversationsAlertsDisableResponse = JsonElement

// ─── NotificationsApi Types ────────────────────────────────────────

@Serializable
data class NotificationsListParams(
	val type: String? = null,
	val page: Int? = null,
	val limit: Int? = null,
)

typealias NotificationsListResponse = JsonElement

typealias NotificationsGetResponse = JsonElement

@Serializable
data class NotificationsReadBody(
	@SerialName("notification_id")
	val notificationId: Int? = null,
)

typealias NotificationsReadResponse = JsonElement

// ─── TagsApi Types ────────────────────────────────────────

typealias TagsPopularResponse = JsonElement

@Serializable
data class TagsListParams(
	val page: Int? = null,
	val limit: Int? = null,
)

typealias TagsListResponse = JsonElement

@Serializable
data class TagsGetParams(
	val page: Int? = null,
	val limit: Int? = null,
)

typealias TagsGetResponse = JsonElement

@Serializable
data class TagsFindParams(
	val tag: String,
)

typealias TagsFindResponse = JsonElement

// ─── SearchApi Types ────────────────────────────────────────

@Serializable
data class SearchAllBody(
	val q: String? = null,
	val tag: String? = null,
	@SerialName("forum_id")
	val forumId: Int? = null,
	@SerialName("user_id")
	val userId: JsonElement? = null,
	val page: Int? = null,
	val limit: Int? = null,
)

typealias SearchAllResponse = JsonElement

@Serializable
data class SearchThreadsBody(
	val q: String? = null,
	val tag: String? = null,
	@SerialName("forum_id")
	val forumId: Int? = null,
	@SerialName("user_id")
	val userId: JsonElement? = null,
	val page: Int? = null,
	val limit: Int? = null,
	@SerialName("data_limit")
	val dataLimit: Int? = null,
)

typealias SearchThreadsResponse = JsonElement

@Serializable
data class SearchPostsBody(
	val q: String? = null,
	val tag: String? = null,
	@SerialName("forum_id")
	val forumId: Int? = null,
	@SerialName("user_id")
	val userId: JsonElement? = null,
	val page: Int? = null,
	val limit: Int? = null,
	@SerialName("data_limit")
	val dataLimit: Int? = null,
)

typealias SearchPostsResponse = JsonElement

@Serializable
data class SearchUsersBody(
	val q: String? = null,
)

typealias SearchUsersResponse = JsonElement

@Serializable
data class SearchProfilePostsBody(
	val q: String? = null,
	@SerialName("user_id")
	val userId: Int? = null,
	val page: Int? = null,
	val limit: Int? = null,
)

typealias SearchProfilePostsResponse = JsonElement

@Serializable
data class SearchTaggedBody(
	val tag: String? = null,
	val tags: List<String>? = null,
	val page: Int? = null,
	val limit: Int? = null,
)

typealias SearchTaggedResponse = JsonElement

@Serializable
data class SearchResultsParams(
	val page: Int? = null,
	val limit: Int? = null,
)

typealias SearchResultsResponse = JsonElement

// ─── BatchApi Types ────────────────────────────────────────

typealias BatchExecuteBody = List<JsonObject>

typealias BatchExecuteResponse = JsonElement

// ─── ChatboxApi Types ────────────────────────────────────────

@Serializable
data class ChatboxIndexParams(
	@SerialName("room_id")
	val roomId: JsonElement? = null,
)

typealias ChatboxIndexResponse = JsonElement

@Serializable
data class ChatboxGetMessagesParams(
	@SerialName("room_id")
	val roomId: JsonElement,
	@SerialName("before_message_id")
	val beforeMessageId: Int? = null,
)

typealias ChatboxGetMessagesResponse = JsonElement

@Serializable
data class ChatboxPostMessageBody(
	@SerialName("room_id")
	val roomId: JsonElement,
	@SerialName("reply_message_id")
	val replyMessageId: Int? = null,
	val message: String,
)

typealias ChatboxPostMessageResponse = JsonElement

@Serializable
data class ChatboxEditMessageBody(
	@SerialName("message_id")
	val messageId: Int,
	val message: String,
)

typealias ChatboxEditMessageResponse = JsonElement

@Serializable
data class ChatboxDeleteMessageBody(
	@SerialName("message_id")
	val messageId: Int,
)

typealias ChatboxDeleteMessageResponse = JsonElement

@Serializable
data class ChatboxOnlineParams(
	@SerialName("room_id")
	val roomId: JsonElement,
)

typealias ChatboxOnlineResponse = JsonElement

@Serializable
data class ChatboxReportReasonsParams(
	@SerialName("message_id")
	val messageId: Int,
)

typealias ChatboxReportReasonsResponse = JsonElement

@Serializable
data class ChatboxReportBody(
	@SerialName("message_id")
	val messageId: Int,
	val reason: String,
)

typealias ChatboxReportResponse = JsonElement

@Serializable
data class ChatboxGetLeaderboardParams(
	val duration: String? = null,
)

typealias ChatboxGetLeaderboardResponse = JsonElement

typealias ChatboxGetIgnoreResponse = JsonElement

@Serializable
data class ChatboxPostIgnoreBody(
	@SerialName("user_id")
	val userId: JsonElement,
)

typealias ChatboxPostIgnoreResponse = JsonElement

@Serializable
data class ChatboxDeleteIgnoreBody(
	@SerialName("user_id")
	val userId: JsonElement,
)

typealias ChatboxDeleteIgnoreResponse = JsonElement

// ─── FormsApi Types ────────────────────────────────────────

@Serializable
data class FormsListParams(
	val page: Int? = null,
)

typealias FormsListResponse = JsonElement

@Serializable
data class FormsCreateBody(
	@SerialName("form_id")
	val formId: String? = null,
	val fields: JsonObject? = null,
)

typealias FormsCreateResponse = JsonElement

