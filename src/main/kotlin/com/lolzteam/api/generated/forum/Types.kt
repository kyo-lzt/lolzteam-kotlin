// Auto-generated. Do not edit manually.

package com.lolzteam.api.generated.forum

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject

// ─── Component Schemas ────────────────────────────────────────

@Serializable
data class RespNotificationModel(
	@SerialName("notification_id")
	val notificationId: Long,
	@SerialName("notification_create_date")
	val notificationCreateDate: Long,
	@SerialName("content_type")
	val contentType: String,
	@SerialName("content_id")
	val contentId: Long,
	@SerialName("content_action")
	val contentAction: String,
	@SerialName("notification_is_unread")
	val notificationIsUnread: Boolean,
	@SerialName("creator_user_id")
	val creatorUserId: Long,
	@SerialName("creator_username")
	val creatorUsername: String,
	@SerialName("creator_username_html")
	val creatorUsernameHtml: String,
	@SerialName("notification_type")
	val notificationType: String,
	val links: JsonObject,
	@SerialName("notification_html")
	val notificationHtml: String,
)

@Serializable
data class RespLinkModel(
	@SerialName("link_id")
	val linkId: Long,
	@SerialName("link_title")
	val linkTitle: String,
	@SerialName("link_description")
	val linkDescription: String,
	val links: JsonObject,
	val permissions: JsonObject,
)

@Serializable
data class RespChatboxMessageModel(
	@SerialName("can_report")
	val canReport: Boolean,
	val date: Long,
	@SerialName("is_deleted")
	val isDeleted: Boolean,
	val message: String,
	@SerialName("message_id")
	val messageId: Long,
	val messageJson: String,
	val messageRaw: String,
	val room: JsonObject,
	val user: JsonObject,
)

@Serializable
data class RespUserModel(
	@SerialName("user_id")
	val userId: Long,
	val username: String,
	@SerialName("username_html")
	val usernameHtml: String,
	@SerialName("user_message_count")
	val userMessageCount: Long,
	@SerialName("user_register_date")
	val userRegisterDate: Long,
	@SerialName("user_like_count")
	val userLikeCount: Long,
	@SerialName("user_like2_count")
	val userLike2Count: Long,
	@SerialName("contest_count")
	val contestCount: Long,
	@SerialName("trophy_count")
	val trophyCount: Long,
	@SerialName("short_link")
	val shortLink: String,
	@SerialName("custom_title")
	val customTitle: String,
	@SerialName("is_banned")
	val isBanned: Long,
	@SerialName("display_banner_id")
	val displayBannerId: Long,
	@SerialName("display_icon_group_id")
	val displayIconGroupId: Long,
	val balance: String,
	val hold: String,
	val currency: String,
	@SerialName("user_email")
	val userEmail: String,
	@SerialName("user_unread_notification_count")
	val userUnreadNotificationCount: Long,
	@SerialName("user_unread_conversation_count")
	val userUnreadConversationCount: Long,
	@SerialName("conv_welcome_message")
	val convWelcomeMessage: String,
	@SerialName("user_title")
	val userTitle: String,
	@SerialName("user_deposit")
	val userDeposit: Long,
	@SerialName("user_is_valid")
	val userIsValid: Boolean,
	@SerialName("user_is_verified")
	val userIsVerified: Boolean,
	@SerialName("user_is_followed")
	val userIsFollowed: Boolean,
	@SerialName("user_last_seen_date")
	val userLastSeenDate: Long,
	val links: JsonObject,
	val permissions: JsonObject,
	@SerialName("user_is_ignored")
	val userIsIgnored: Boolean,
	@SerialName("user_is_visitor")
	val userIsVisitor: Boolean,
	@SerialName("user_group_id")
	val userGroupId: Long,
	@SerialName("curator_titles")
	val curatorTitles: List<String>,
	@SerialName("user_groups")
	val userGroups: List<JsonObject>,
	val fields: List<JsonObject>,
	@SerialName("user_timezone_offset")
	val userTimezoneOffset: Long,
	@SerialName("user_external_authentications")
	val userExternalAuthentications: List<JsonObject>,
	@SerialName("self_permissions")
	val selfPermissions: JsonObject,
	@SerialName("edit_permissions")
	val editPermissions: JsonObject,
	val birthday: JsonObject,
	@SerialName("secret_answer_rendered")
	val secretAnswerRendered: String,
	@SerialName("secret_answer_first_letter")
	val secretAnswerFirstLetter: String,
	@SerialName("user_following")
	val userFollowing: JsonObject,
	@SerialName("user_followers")
	val userFollowers: JsonObject,
	val banner: String,
)

@Serializable
data class RespThreadModel(
	@SerialName("thread_id")
	val threadId: Long,
	@SerialName("forum_id")
	val forumId: Long,
	@SerialName("thread_title")
	val threadTitle: String,
	@SerialName("thread_view_count")
	val threadViewCount: Long,
	@SerialName("creator_user_id")
	val creatorUserId: Long,
	@SerialName("creator_username")
	val creatorUsername: String,
	@SerialName("creator_username_html")
	val creatorUsernameHtml: String,
	@SerialName("thread_create_date")
	val threadCreateDate: Long,
	@SerialName("thread_update_date")
	val threadUpdateDate: Long,
	@SerialName("user_is_ignored")
	val userIsIgnored: Boolean,
	@SerialName("thread_post_count")
	val threadPostCount: Long,
	@SerialName("thread_is_published")
	val threadIsPublished: Boolean,
	@SerialName("thread_is_deleted")
	val threadIsDeleted: Boolean,
	@SerialName("thread_is_sticky")
	val threadIsSticky: Boolean,
	@SerialName("thread_is_closed")
	val threadIsClosed: Boolean,
	@SerialName("thread_is_followed")
	val threadIsFollowed: Boolean,
	@SerialName("thread_is_starred")
	val threadIsStarred: Boolean,
	@SerialName("first_post")
	val firstPost: JsonObject,
	@SerialName("thread_prefixes")
	val threadPrefixes: List<JsonElement>,
	@SerialName("thread_tags")
	val threadTags: JsonObject,
	val links: JsonObject,
	val permissions: JsonObject,
	@SerialName("node_title")
	val nodeTitle: String,
	val restrictions: JsonObject,
	@SerialName("last_post")
	val lastPost: JsonObject,
	val contest: JsonObject,
)

@Serializable
data class RespPostModel(
	@SerialName("post_id")
	val postId: Long,
	@SerialName("thread_id")
	val threadId: Long,
	@SerialName("poster_user_id")
	val posterUserId: Long,
	@SerialName("poster_username")
	val posterUsername: String,
	@SerialName("poster_username_html")
	val posterUsernameHtml: String,
	@SerialName("post_create_date")
	val postCreateDate: Long,
	@SerialName("post_body")
	val postBody: String,
	@SerialName("post_body_html")
	val postBodyHtml: String,
	@SerialName("post_body_plain_text")
	val postBodyPlainText: String,
	val signature: String,
	@SerialName("signature_html")
	val signatureHtml: String,
	@SerialName("signature_plain_text")
	val signaturePlainText: String,
	@SerialName("post_like_count")
	val postLikeCount: Long,
	@SerialName("user_is_ignored")
	val userIsIgnored: Boolean,
	@SerialName("post_is_published")
	val postIsPublished: Boolean,
	@SerialName("post_is_deleted")
	val postIsDeleted: Boolean,
	@SerialName("post_update_date")
	val postUpdateDate: Long,
	@SerialName("post_is_first_post")
	val postIsFirstPost: Boolean,
	val links: JsonObject,
	val permissions: JsonObject,
	@SerialName("thread_is_deleted")
	val threadIsDeleted: Boolean,
)

@Serializable
data class RespPostCommentModel(
	@SerialName("post_comment_id")
	val postCommentId: Long,
	@SerialName("post_id")
	val postId: Long,
	@SerialName("thread_id")
	val threadId: Long,
	@SerialName("poster_user_id")
	val posterUserId: Long,
	@SerialName("poster_username")
	val posterUsername: String,
	@SerialName("poster_username_html")
	val posterUsernameHtml: String,
	@SerialName("post_comment_create_date")
	val postCommentCreateDate: Long,
	@SerialName("post_comment_body")
	val postCommentBody: String,
	@SerialName("post_comment_body_html")
	val postCommentBodyHtml: String,
	@SerialName("post_comment_body_plain_text")
	val postCommentBodyPlainText: String,
	@SerialName("post_comment_like_count")
	val postCommentLikeCount: Long,
	@SerialName("user_is_ignored")
	val userIsIgnored: Boolean,
	@SerialName("post_comment_is_published")
	val postCommentIsPublished: Boolean,
	@SerialName("post_comment_is_deleted")
	val postCommentIsDeleted: Boolean,
	@SerialName("post_comment_update_date")
	val postCommentUpdateDate: Long,
	val links: JsonObject,
	val permissions: JsonObject,
)

@Serializable
data class RespProfilePostModel(
	@SerialName("profile_post_id")
	val profilePostId: Long,
	@SerialName("timeline_user_id")
	val timelineUserId: Long,
	@SerialName("poster_user_id")
	val posterUserId: Long,
	@SerialName("poster_username")
	val posterUsername: String,
	@SerialName("poster_username_html")
	val posterUsernameHtml: String,
	@SerialName("post_create_date")
	val postCreateDate: Long,
	@SerialName("post_body")
	val postBody: String,
	@SerialName("post_body_html")
	val postBodyHtml: String,
	@SerialName("post_body_plain_text")
	val postBodyPlainText: String,
	@SerialName("post_like_count")
	val postLikeCount: Long,
	@SerialName("post_comment_count")
	val postCommentCount: Long,
	@SerialName("post_comments_is_disabled")
	val postCommentsIsDisabled: Long,
	@SerialName("timeline_username")
	val timelineUsername: String,
	@SerialName("user_is_ignored")
	val userIsIgnored: Boolean,
	@SerialName("post_is_published")
	val postIsPublished: Boolean,
	@SerialName("post_is_deleted")
	val postIsDeleted: Boolean,
	@SerialName("post_is_liked")
	val postIsLiked: Boolean,
	@SerialName("post_is_sticked")
	val postIsSticked: Boolean,
	val links: JsonObject,
	val permissions: JsonObject,
	@SerialName("timeline_user")
	val timelineUser: JsonObject,
)

@Serializable
data class RespProfilePostCommentModel(
	@SerialName("comment_id")
	val commentId: Long,
	@SerialName("profile_post_id")
	val profilePostId: Long,
	@SerialName("comment_user_id")
	val commentUserId: Long,
	@SerialName("comment_username")
	val commentUsername: String,
	@SerialName("comment_username_html")
	val commentUsernameHtml: String,
	@SerialName("comment_create_date")
	val commentCreateDate: Long,
	@SerialName("comment_body")
	val commentBody: String,
	@SerialName("comment_body_html")
	val commentBodyHtml: String,
	@SerialName("comment_body_plain_text")
	val commentBodyPlainText: String,
	@SerialName("user_is_ignored")
	val userIsIgnored: Boolean,
	@SerialName("timeline_user_id")
	val timelineUserId: Long,
	val links: JsonObject,
	val permissions: JsonObject,
)

@Serializable
data class RespConversationModel(
	@SerialName("conversation_id")
	val conversationId: Long,
	@SerialName("conversation_title")
	val conversationTitle: String,
	@SerialName("creator_user_id")
	val creatorUserId: Long,
	@SerialName("creator_username")
	val creatorUsername: String,
	@SerialName("creator_username_html")
	val creatorUsernameHtml: String,
	@SerialName("conversation_create_date")
	val conversationCreateDate: Long,
	@SerialName("conversation_update_date")
	val conversationUpdateDate: Long,
	@SerialName("conversation_last_read_date")
	val conversationLastReadDate: Long,
	@SerialName("conversation_online_count")
	val conversationOnlineCount: Long,
	@SerialName("is_starred")
	val isStarred: Long,
	@SerialName("is_group")
	val isGroup: Long,
	@SerialName("is_unread")
	val isUnread: Long,
	val alerts: Long,
	val permissions: JsonObject,
	@SerialName("conversation_message_count")
	val conversationMessageCount: Long,
	@SerialName("conversation_is_new")
	val conversationIsNew: Boolean,
	@SerialName("creator_is_ignored")
	val creatorIsIgnored: Boolean,
	@SerialName("conversation_is_open")
	val conversationIsOpen: Boolean,
	@SerialName("conversation_is_deleted")
	val conversationIsDeleted: Boolean,
	val recipient: JsonObject,
	val recipients: List<JsonObject>,
	val links: JsonObject,
)

@Serializable
data class RespConversationMessageModel(
	@SerialName("message_id")
	val messageId: Long,
	@SerialName("conversation_id")
	val conversationId: Long,
	@SerialName("creator_user_id")
	val creatorUserId: Long,
	@SerialName("creator_username")
	val creatorUsername: String,
	@SerialName("creator_username_html")
	val creatorUsernameHtml: String,
	@SerialName("message_create_date")
	val messageCreateDate: Long,
	@SerialName("message_is_unread")
	val messageIsUnread: Long,
	@SerialName("message_need_translate")
	val messageNeedTranslate: Boolean,
	@SerialName("message_is_system")
	val messageIsSystem: Boolean,
	@SerialName("message_edit_date")
	val messageEditDate: Long,
	@SerialName("message_body")
	val messageBody: String,
	@SerialName("message_body_html")
	val messageBodyHtml: String,
	@SerialName("message_body_plain_text")
	val messageBodyPlainText: String,
	@SerialName("user_is_ignored")
	val userIsIgnored: Boolean,
	val links: JsonObject,
	val permissions: JsonObject,
)

@Serializable
data class RespSystemInfo(
	@SerialName("visitor_id")
	val visitorId: Long,
	val time: Long,
)

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

@Serializable
data class OAuthTokenResponse(
	@SerialName("access_token")
	val accessToken: String? = null,
	@SerialName("token_type")
	val tokenType: String? = null,
	@SerialName("expires_in")
	val expiresIn: Long? = null,
	@SerialName("refresh_token")
	val refreshToken: String? = null,
	val scope: String? = null,
)

// ─── AssetsApi Types ────────────────────────────────────────

@Serializable
data class AssetsCssParams(
	val css: List<String>? = null,
)

@Serializable
data class AssetsCssResponse(
	val contents: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

// ─── CategoriesApi Types ────────────────────────────────────────

@Serializable
data class CategoriesListParams(
	@SerialName("parent_category_id")
	val parentCategoryId: Int? = null,
	@SerialName("parent_forum_id")
	val parentForumId: Int? = null,
	val order: String? = null,
)

@Serializable
data class CategoriesListResponse(
	val categories: List<JsonObject>? = null,
	@SerialName("categories_total")
	val categoriesTotal: Long? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class CategoriesGetResponse(
	val category: JsonObject? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

// ─── ForumsApi Types ────────────────────────────────────────

@Serializable
data class ForumsListParams(
	@SerialName("parent_category_id")
	val parentCategoryId: Int? = null,
	@SerialName("parent_forum_id")
	val parentForumId: Int? = null,
	val order: String? = null,
)

@Serializable
data class ForumsListResponse(
	val forums: List<JsonObject>? = null,
	@SerialName("forums_total")
	val forumsTotal: Long? = null,
	val tabs: List<JsonObject>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ForumsGroupedResponse(
	val data: JsonObject? = null,
	val tabs: List<JsonObject>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ForumsGetResponse(
	val forum: JsonObject? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ForumsFollowersResponse(
	val users: List<JsonObject>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

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

@Serializable
data class ForumsFollowResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ForumsUnfollowResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ForumsFollowedParams(
	val total: Boolean? = null,
)

@Serializable
data class ForumsFollowedResponse(
	val forums: List<JsonObject>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ForumsGetFeedOptionsResponse(
	val forums: List<JsonObject>? = null,
	@SerialName("excluded_forums_ids")
	val excludedForumsIds: List<Int>? = null,
	@SerialName("default_excluded_forums_ids")
	val defaultExcludedForumsIds: List<Int>? = null,
	val keywords: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ForumsEditFeedOptionsBody(
	@SerialName("node_ids")
	val nodeIds: List<Int>? = null,
	val keywords: List<String>? = null,
)

@Serializable
data class ForumsEditFeedOptionsResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

// ─── LinksApi Types ────────────────────────────────────────

@Serializable
data class LinksListResponse(
	@SerialName("link-forums")
	val linkForums: List<RespLinkModel>? = null,
	@SerialName("link-forums_total")
	val linkForumsTotal: Long? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class LinksGetResponse(
	@SerialName("link-forum")
	val linkForum: RespLinkModel? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

// ─── PagesApi Types ────────────────────────────────────────

@Serializable
data class PagesListParams(
	@SerialName("parent_page_id")
	val parentPageId: Int? = null,
	val order: String? = null,
)

@Serializable
data class PagesListResponse(
	val pages: List<JsonObject>? = null,
	@SerialName("pages_total")
	val pagesTotal: Long? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class PagesGetResponse(
	val page: JsonObject? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

// ─── NavigationApi Types ────────────────────────────────────────

@Serializable
data class NavigationListParams(
	val parent: Int? = null,
)

@Serializable
data class NavigationListResponse(
	val elements: List<JsonObject>? = null,
	@SerialName("elements_count")
	val elementsCount: Long? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

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

@Serializable
data class ThreadsListResponse(
	val threads: List<RespThreadModel>? = null,
	val forum: JsonObject? = null,
	@SerialName("threads_total")
	val threadsTotal: Long? = null,
	val links: JsonObject? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

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

@Serializable
data class ThreadsCreateResponse(
	val thread: RespThreadModel? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

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

@Serializable
data class ThreadsCreateContestResponse(
	val thread: RespThreadModel? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

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

@Serializable
data class ThreadsClaimResponse(
	val thread: RespThreadModel? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ThreadsGetParams(
	@SerialName("fields_include")
	val fieldsInclude: JsonElement? = null,
)

@Serializable
data class ThreadsGetResponse(
	val thread: RespThreadModel? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

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

@Serializable
data class ThreadsEditResponse(
	val thread: RespThreadModel? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ThreadsDeleteBody(
	val reason: String? = null,
)

@Serializable
data class ThreadsDeleteResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

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

@Serializable
data class ThreadsMoveResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ThreadsBumpResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ThreadsHideResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ThreadsStarResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ThreadsUnstarResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ThreadsFollowersResponse(
	val users: List<JsonObject>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ThreadsFollowBody(
	val email: Boolean? = null,
)

@Serializable
data class ThreadsFollowResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ThreadsUnfollowResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ThreadsFollowedParams(
	val total: Boolean? = null,
	@SerialName("fields_include")
	val fieldsInclude: JsonElement? = null,
)

@Serializable
data class ThreadsFollowedResponse(
	val threads: List<JsonObject>? = null,
	@SerialName("threads_total")
	val threadsTotal: Long? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ThreadsNavigationResponse(
	val elements: List<JsonObject>? = null,
	@SerialName("elements_count")
	val elementsCount: Long? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ThreadsPollGetResponse(
	val poll: JsonObject? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ThreadsPollVoteBody(
	@SerialName("response_id")
	val responseId: Int? = null,
	@SerialName("response_ids")
	val responseIds: List<Int>? = null,
)

@Serializable
data class ThreadsPollVoteResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ThreadsUnreadParams(
	val limit: Int? = null,
	@SerialName("forum_id")
	val forumId: Int? = null,
	@SerialName("data_limit")
	val dataLimit: Int? = null,
)

@Serializable
data class ThreadsUnreadResponse(
	val threads: List<RespThreadModel>? = null,
	val data: List<JsonObject>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ThreadsRecentParams(
	val days: Int? = null,
	val limit: Int? = null,
	@SerialName("forum_id")
	val forumId: Int? = null,
	@SerialName("data_limit")
	val dataLimit: Int? = null,
)

@Serializable
data class ThreadsRecentResponse(
	val threads: List<RespThreadModel>? = null,
	val data: List<JsonObject>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ThreadsFinishResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

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

@Serializable
data class PostsListResponse(
	val posts: List<RespThreadModel>? = null,
	val thread: RespThreadModel? = null,
	@SerialName("posts_total")
	val postsTotal: Long? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class PostsCreateBody(
	@SerialName("post_body")
	val postBody: String,
	@SerialName("thread_id")
	val threadId: Int? = null,
	@SerialName("quote_post_id")
	val quotePostId: Int? = null,
)

@Serializable
data class PostsCreateResponse(
	val post: RespPostModel? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class PostsGetResponse(
	val post: RespPostModel? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class PostsEditBody(
	@SerialName("post_body")
	val postBody: String? = null,
)

@Serializable
data class PostsEditResponse(
	val post: RespPostModel? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class PostsDeleteBody(
	val reason: String? = null,
)

@Serializable
data class PostsDeleteResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class PostsLikesParams(
	val page: Int? = null,
	val limit: Int? = null,
)

@Serializable
data class PostsLikesResponse(
	val users: List<JsonObject>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class PostsLikeResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class PostsUnlikeResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class PostsReportReasonsResponse(
	val reasons: List<String>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class PostsReportBody(
	val message: String,
)

@Serializable
data class PostsReportResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class PostsCommentsGetParams(
	@SerialName("post_id")
	val postId: Int,
	val before: Int? = null,
	@SerialName("before_comment")
	val beforeComment: Int? = null,
)

@Serializable
data class PostsCommentsGetResponse(
	val comments: List<RespPostCommentModel>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class PostsCommentsCreateBody(
	@SerialName("post_id")
	val postId: Int,
	@SerialName("comment_body")
	val commentBody: String,
)

@Serializable
data class PostsCommentsCreateResponse(
	val comment: JsonObject? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class PostsCommentsEditBody(
	@SerialName("post_comment_id")
	val postCommentId: Int,
	@SerialName("comment_body")
	val commentBody: String,
)

@Serializable
data class PostsCommentsEditResponse(
	val comment: JsonObject? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class PostsCommentsDeleteBody(
	@SerialName("post_comment_id")
	val postCommentId: Int,
	val reason: String? = null,
)

@Serializable
data class PostsCommentsDeleteResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class PostsCommentsReportBody(
	@SerialName("post_comment_id")
	val postCommentId: Int,
	val message: String,
)

@Serializable
data class PostsCommentsReportResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

// ─── UsersApi Types ────────────────────────────────────────

@Serializable
data class UsersListParams(
	val page: Int? = null,
	val limit: Int? = null,
	@SerialName("fields_include")
	val fieldsInclude: JsonElement? = null,
)

@Serializable
data class UsersListResponse(
	val users: List<RespUserModel>? = null,
	@SerialName("users_total")
	val usersTotal: Long? = null,
	val links: JsonObject? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class UsersFieldsResponse(
	val fields: List<JsonObject>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class UsersFindParams(
	val username: String? = null,
	@SerialName("custom_fields")
	val customFields: JsonObject? = null,
	@SerialName("fields_include")
	val fieldsInclude: JsonElement? = null,
)

@Serializable
data class UsersFindResponse(
	val users: List<RespUserModel>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class UsersGetParams(
	@SerialName("fields_include")
	val fieldsInclude: JsonElement? = null,
)

@Serializable
data class UsersGetResponse(
	val user: RespUserModel? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

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

@Serializable
data class UsersEditResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class UsersClaimsParams(
	val type: String? = null,
	@SerialName("claim_state")
	val claimState: String? = null,
)

@Serializable
data class UsersClaimsResponse(
	val claims: List<JsonObject>? = null,
	val stats: JsonObject? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

data class UsersAvatarUploadBody(
	val avatar: ByteArray,
	val x: Int? = null,
	val y: Int? = null,
	val crop: Int? = null,
)

@Serializable
data class UsersAvatarUploadResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class UsersAvatarDeleteResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class UsersAvatarCropBody(
	val x: Int? = null,
	val y: Int? = null,
	val crop: Int? = null,
)

@Serializable
data class UsersAvatarCropResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

data class UsersBackgroundUploadBody(
	val background: ByteArray,
	val x: Int? = null,
	val y: Int? = null,
	val crop: Int? = null,
)

@Serializable
data class UsersBackgroundUploadResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class UsersBackgroundDeleteResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class UsersBackgroundCropBody(
	val x: Int? = null,
	val y: Int? = null,
	val crop: Int? = null,
)

@Serializable
data class UsersBackgroundCropResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class UsersFollowersParams(
	val order: String? = null,
	val page: Int? = null,
	val limit: Int? = null,
)

@Serializable
data class UsersFollowersResponse(
	val users: List<JsonObject>? = null,
	@SerialName("users_total")
	val usersTotal: Long? = null,
	val links: JsonObject? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class UsersFollowResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class UsersUnfollowResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class UsersFollowingsParams(
	val order: String? = null,
	val page: Int? = null,
	val limit: Int? = null,
)

@Serializable
data class UsersFollowingsResponse(
	val users: List<JsonObject>? = null,
	@SerialName("users_total")
	val usersTotal: Long? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

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

@Serializable
data class UsersLikesResponse(
	val page: Long? = null,
	val perPage: Long? = null,
	val contentType: String? = null,
	val totalLikes: Long? = null,
	val likes: JsonObject? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class UsersIgnoredParams(
	val total: Boolean? = null,
)

@Serializable
data class UsersIgnoredResponse(
	val users: List<JsonObject>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class UsersIgnoreResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class UsersIgnoreEditParams(
	@SerialName("ignore_conversations")
	val ignoreConversations: Boolean? = null,
	@SerialName("ignore_content")
	val ignoreContent: Boolean? = null,
	@SerialName("restrict_view_profile")
	val restrictViewProfile: Boolean? = null,
)

@Serializable
data class UsersIgnoreEditResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class UsersUnignoreResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class UsersContentsParams(
	val page: Int? = null,
	val limit: Int? = null,
)

@Serializable
data class UsersContentsResponse(
	val data: List<JsonObject>? = null,
	@SerialName("data_total")
	val dataTotal: Long? = null,
	val user: RespUserModel? = null,
	val links: JsonObject? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class UsersTrophiesResponse(
	val trophies: List<JsonObject>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class UsersSecretAnswerTypesResponse(
	val data: List<JsonObject>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class UsersSaResetResponse(
	val success: Boolean? = null,
	@SerialName("waiting_time")
	val waitingTime: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class UsersSaCancelResetResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

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

@Serializable
data class ProfilePostsListResponse(
	@SerialName("profile_posts")
	val profilePosts: List<RespProfilePostModel>? = null,
	val totalProfilePosts: Long? = null,
	val canPostOnProfile: Boolean? = null,
	val links: JsonObject? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ProfilePostsGetResponse(
	@SerialName("profile_post")
	val profilePost: RespProfilePostModel? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ProfilePostsEditBody(
	@SerialName("post_body")
	val postBody: String? = null,
	@SerialName("disable_comments")
	val disableComments: Boolean? = null,
)

@Serializable
data class ProfilePostsEditResponse(
	@SerialName("profile_post")
	val profilePost: JsonObject? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ProfilePostsDeleteParams(
	val reason: String? = null,
)

@Serializable
data class ProfilePostsDeleteResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ProfilePostsReportReasonsResponse(
	val reasons: List<String>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ProfilePostsReportBody(
	val message: String,
)

@Serializable
data class ProfilePostsReportResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ProfilePostsCreateBody(
	@SerialName("user_id")
	val userId: JsonElement,
	@SerialName("post_body")
	val postBody: String,
)

@Serializable
data class ProfilePostsCreateResponse(
	@SerialName("profile_post")
	val profilePost: JsonObject? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ProfilePostsStickResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ProfilePostsUnstickResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ProfilePostsLikesResponse(
	val users: List<JsonObject>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ProfilePostsLikeResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ProfilePostsUnlikeResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ProfilePostsCommentsListParams(
	@SerialName("profile_post_id")
	val profilePostId: Int,
	val before: Int? = null,
	val limit: Int? = null,
)

@Serializable
data class ProfilePostsCommentsListResponse(
	val comments: List<RespProfilePostCommentModel>? = null,
	@SerialName("comments_total")
	val commentsTotal: Long? = null,
	@SerialName("profile_post")
	val profilePost: JsonObject? = null,
	@SerialName("timeline_user")
	val timelineUser: RespUserModel? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ProfilePostsCommentsCreateBody(
	@SerialName("profile_post_id")
	val profilePostId: Int,
	@SerialName("comment_body")
	val commentBody: String,
)

@Serializable
data class ProfilePostsCommentsCreateResponse(
	val comment: JsonObject? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ProfilePostsCommentsEditBody(
	@SerialName("comment_id")
	val commentId: Int,
	@SerialName("comment_body")
	val commentBody: String,
)

@Serializable
data class ProfilePostsCommentsEditResponse(
	val comment: JsonObject? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ProfilePostsCommentsDeleteBody(
	@SerialName("comment_id")
	val commentId: Int,
)

@Serializable
data class ProfilePostsCommentsDeleteResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ProfilePostsCommentsGetResponse(
	val comment: RespProfilePostCommentModel? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ProfilePostsCommentsReportBody(
	val message: String,
)

@Serializable
data class ProfilePostsCommentsReportResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

// ─── ConversationsApi Types ────────────────────────────────────────

@Serializable
data class ConversationsListParams(
	val folder: String? = null,
	val page: Int? = null,
	val limit: Int? = null,
)

@Serializable
data class ConversationsListResponse(
	val conversations: List<RespConversationModel>? = null,
	@SerialName("can_start")
	val canStart: Boolean? = null,
	val folders: List<JsonObject>? = null,
	val links: JsonObject? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

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

@Serializable
data class ConversationsCreateResponse(
	val conversation: RespConversationModel? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

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

@Serializable
data class ConversationsUpdateResponse(
	val conversation: RespConversationModel? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ConversationsDeleteBody(
	@SerialName("conversation_id")
	val conversationId: Int,
	@SerialName("delete_type")
	val deleteType: String,
)

@Serializable
data class ConversationsDeleteResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ConversationsStartBody(
	@SerialName("user_id")
	val userId: JsonElement,
)

@Serializable
data class ConversationsStartResponse(
	val conversation: RespConversationModel? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ConversationsSaveBody(
	val link: String,
)

@Serializable
data class ConversationsSaveResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ConversationsGetResponse(
	val conversation: RespConversationModel? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ConversationsMessagesListParams(
	val page: Int? = null,
	val limit: Int? = null,
	val order: String? = null,
	val before: Int? = null,
	val after: Int? = null,
)

@Serializable
data class ConversationsMessagesListResponse(
	val messages: List<RespConversationMessageModel>? = null,
	@SerialName("messages_total")
	val messagesTotal: Long? = null,
	val links: JsonObject? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ConversationsMessagesCreateBody(
	@SerialName("reply_message_id")
	val replyMessageId: Int? = null,
	@SerialName("message_body")
	val messageBody: String,
)

@Serializable
data class ConversationsMessagesCreateResponse(
	val message: RespConversationMessageModel? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ConversationsSearchBody(
	val q: String? = null,
	@SerialName("conversation_id")
	val conversationId: Int? = null,
	@SerialName("search_recipients")
	val searchRecipients: Boolean? = null,
)

@Serializable
data class ConversationsSearchResponse(
	val conversations: List<RespConversationModel>? = null,
	val recipients: Boolean? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ConversationsMessagesGetResponse(
	val message: RespConversationModel? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ConversationsMessagesEditBody(
	@SerialName("message_body")
	val messageBody: String,
)

@Serializable
data class ConversationsMessagesEditResponse(
	val message: RespConversationModel? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ConversationsMessagesDeleteResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ConversationsInviteBody(
	val recipients: List<String>,
)

@Serializable
data class ConversationsInviteResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ConversationsKickBody(
	@SerialName("user_id")
	val userId: Int,
)

@Serializable
data class ConversationsKickResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ConversationsReadResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ConversationsReadAllResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ConversationsMessagesStickResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ConversationsMessagesUnstickResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ConversationsStarResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ConversationsUnstarResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ConversationsAlertsEnableResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ConversationsAlertsDisableResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

// ─── NotificationsApi Types ────────────────────────────────────────

@Serializable
data class NotificationsListParams(
	val type: String? = null,
	val page: Int? = null,
	val limit: Int? = null,
)

@Serializable
data class NotificationsListResponse(
	val notifications: List<RespNotificationModel>? = null,
	@SerialName("notifications_total")
	val notificationsTotal: Long? = null,
	val links: JsonObject? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class NotificationsGetResponse(
	@SerialName("notification_id")
	val notificationId: Long? = null,
	val notification: RespNotificationModel? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class NotificationsReadBody(
	@SerialName("notification_id")
	val notificationId: Int? = null,
)

@Serializable
data class NotificationsReadResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

// ─── TagsApi Types ────────────────────────────────────────

@Serializable
data class TagsPopularResponse(
	val tags: JsonObject? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class TagsListParams(
	val page: Int? = null,
	val limit: Int? = null,
)

@Serializable
data class TagsListResponse(
	val tags: JsonObject? = null,
	@SerialName("tags_total")
	val tagsTotal: Long? = null,
	val links: JsonObject? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class TagsGetParams(
	val page: Int? = null,
	val limit: Int? = null,
)

@Serializable
data class TagsGetResponse(
	val tag: JsonObject? = null,
	val tagged: List<JsonObject>? = null,
	@SerialName("tagged_total")
	val taggedTotal: Long? = null,
	val links: JsonObject? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class TagsFindParams(
	val tag: String,
)

@Serializable
data class TagsFindResponse(
	val tags: List<String>? = null,
	val ids: List<Int>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

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

@Serializable
data class SearchAllResponse(
	val data: List<JsonObject>? = null,
	@SerialName("data_total")
	val dataTotal: Long? = null,
	val users: List<RespUserModel>? = null,
	val links: JsonObject? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

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

@Serializable
data class SearchThreadsResponse(
	val data: List<JsonObject>? = null,
	@SerialName("data_total")
	val dataTotal: Long? = null,
	val links: JsonObject? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

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

@Serializable
data class SearchPostsResponse(
	val data: List<JsonObject>? = null,
	@SerialName("data_total")
	val dataTotal: Long? = null,
	val links: JsonObject? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class SearchUsersBody(
	val q: String? = null,
)

@Serializable
data class SearchUsersResponse(
	val users: List<RespUserModel>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class SearchProfilePostsBody(
	val q: String? = null,
	@SerialName("user_id")
	val userId: Int? = null,
	val page: Int? = null,
	val limit: Int? = null,
)

@Serializable
data class SearchProfilePostsResponse(
	val data: List<JsonObject>? = null,
	@SerialName("data_total")
	val dataTotal: Long? = null,
	val links: JsonObject? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class SearchTaggedBody(
	val tag: String? = null,
	val tags: List<String>? = null,
	val page: Int? = null,
	val limit: Int? = null,
)

@Serializable
data class SearchTaggedResponse(
	val data: List<JsonObject>? = null,
	@SerialName("data_total")
	val dataTotal: Long? = null,
	@SerialName("search_tags")
	val searchTags: JsonObject? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class SearchResultsParams(
	val page: Int? = null,
	val limit: Int? = null,
)

@Serializable
data class SearchResultsResponse(
	val data: List<JsonObject>? = null,
	@SerialName("data_total")
	val dataTotal: Long? = null,
	@SerialName("search_tags")
	val searchTags: JsonObject? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

// ─── BatchApi Types ────────────────────────────────────────

typealias BatchExecuteBody = List<JsonObject>

@Serializable
data class BatchExecuteResponse(
	val jobs: JsonObject? = null,
)

// ─── ChatboxApi Types ────────────────────────────────────────

@Serializable
data class ChatboxIndexParams(
	@SerialName("room_id")
	val roomId: JsonElement? = null,
)

@Serializable
data class ChatboxIndexResponse(
	val rooms: List<JsonObject>? = null,
	val ban: JsonElement? = null,
	val ignore: List<JsonObject>? = null,
	val permissions: JsonObject? = null,
	val commands: List<String>? = null,
	val roomsOnline: JsonObject? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ChatboxGetMessagesParams(
	@SerialName("room_id")
	val roomId: JsonElement,
	@SerialName("before_message_id")
	val beforeMessageId: Int? = null,
)

@Serializable
data class ChatboxGetMessagesResponse(
	val messages: List<RespChatboxMessageModel>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ChatboxPostMessageBody(
	@SerialName("room_id")
	val roomId: JsonElement,
	@SerialName("reply_message_id")
	val replyMessageId: Int? = null,
	val message: String,
)

@Serializable
data class ChatboxPostMessageResponse(
	val message: RespChatboxMessageModel? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ChatboxEditMessageBody(
	@SerialName("message_id")
	val messageId: Int,
	val message: String,
)

@Serializable
data class ChatboxEditMessageResponse(
	val message: RespChatboxMessageModel? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ChatboxDeleteMessageBody(
	@SerialName("message_id")
	val messageId: Int,
)

@Serializable
data class ChatboxDeleteMessageResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ChatboxOnlineParams(
	@SerialName("room_id")
	val roomId: JsonElement,
)

@Serializable
data class ChatboxOnlineResponse(
	val users: List<JsonObject>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ChatboxReportReasonsParams(
	@SerialName("message_id")
	val messageId: Int,
)

@Serializable
data class ChatboxReportReasonsResponse(
	val reasons: List<String>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ChatboxReportBody(
	@SerialName("message_id")
	val messageId: Int,
	val reason: String,
)

@Serializable
data class ChatboxReportResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ChatboxGetLeaderboardParams(
	val duration: String? = null,
)

@Serializable
data class ChatboxGetLeaderboardResponse(
	val leaderboard: List<JsonObject>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ChatboxGetIgnoreResponse(
	val ignored: List<JsonObject>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ChatboxPostIgnoreBody(
	@SerialName("user_id")
	val userId: JsonElement,
)

@Serializable
data class ChatboxPostIgnoreResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ChatboxDeleteIgnoreBody(
	@SerialName("user_id")
	val userId: JsonElement,
)

@Serializable
data class ChatboxDeleteIgnoreResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

// ─── FormsApi Types ────────────────────────────────────────

@Serializable
data class FormsListParams(
	val page: Int? = null,
)

@Serializable
data class FormsListResponse(
	val forms: List<JsonObject>? = null,
	val formsPerPage: Long? = null,
	val page: Long? = null,
	val totalForms: Long? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class FormsCreateBody(
	@SerialName("form_id")
	val formId: String? = null,
	val fields: JsonObject? = null,
)

@Serializable
data class FormsCreateResponse(
	val message: String? = null,
	val content: JsonObject? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

