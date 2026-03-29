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

    /**
     * Get Access Token
     *
     * Obtain an access token using various grant types.
     * 
     * Supports the following grant types:
     * - Client Credentials
     * - Authorization Code
     * - Refresh Token
     * - Password
     *
     * @param grantType Grant type.
     * @param clientId Client ID.
     * @param clientSecret Client secret.
     * @param scope Scope.
     * @param code Authorization code.
     * @param redirectUri Redirect URI.
     * @param refreshToken Refresh token.
     * @param username Account username/email.
     * @param password Account password.
     */
	suspend fun token(body: OAuthTokenBody): OAuthTokenResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/oauth/token",
			body = http.json.encodeToJsonElement(serializer(), body),
			bodyEncoding = "multipart",
		)))
	}
}


public class AssetsApi(private val http: LolzteamHttpClient) {

    /**
     * Get CSS
     *
     * Gets css rulesets for requested selectors.
     *
     * @param css The names or identifiers of the CSS selectors to retrieve.
     */
	suspend fun css(params: AssetsCssParams? = null): AssetsCssResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/css",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		)))
	}
}


public class CategoriesApi(private val http: LolzteamHttpClient) {

    /**
     * Get Categories
     *
     * List of all categories in the system.
     * 
     * Required scopes:
     * + read
     *
     * @param parentCategoryId Id of parent category. If exists, filter categories that are direct children of that category.
     * @param parentForumId Id of parent forum. If exists, filter categories that are direct children of that forum.
     * @param order Ordering of categories.
     */
	suspend fun list(params: CategoriesListParams? = null): CategoriesListResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/categories",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		)))
	}

    /**
     * Get Category
     *
     * Detail information of a category.
     * 
     * Required scopes:
     * + read
     *
     * @param categoryId Id of category.
     */
	suspend fun get(categoryId: Int): CategoriesGetResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/categories/$categoryId",
		)))
	}
}


public class ForumsApi(private val http: LolzteamHttpClient) {

    /**
     * Get Forums
     *
     * List of all forums in the system.
     * 
     * Required scopes:
     * + read
     *
     * @param parentCategoryId Id of parent category. If exists, filter forums that are direct children of that category.
     * @param parentForumId Id of parent forum. If exists, filter forums that are direct children of that forum.
     * @param order Ordering of forums.
     */
	suspend fun list(params: ForumsListParams? = null): ForumsListResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/forums",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		)))
	}

    /**
     * Get Forums Tree
     *
     * Returns grouped forums.
     * 
     * Required scopes:
     * + read
     */
	suspend fun grouped(): ForumsGroupedResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/forums/grouped",
		)))
	}

    /**
     * Get Forum
     *
     * Detail information of a forum.
     * 
     * Required scopes:
     * + read
     *
     * @param forumId Id of forum.
     */
	suspend fun get(forumId: Int): ForumsGetResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/forums/$forumId",
		)))
	}

    /**
     * Get Followers
     *
     * List of a forum's followers. For privacy reason, only the current user will be included in the list (if the user follows the specified forum).
     * 
     * Required scopes:
     * + read
     *
     * @param forumId Id of forum.
     */
	suspend fun followers(forumId: Int): ForumsFollowersResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/forums/$forumId/followers",
		)))
	}

    /**
     * Follow Forum
     *
     * Follow a forum.
     * 
     * Required scopes:
     * + post
     *
     * @param forumId Id of forum.
     * @param post Whether to receive notification for post.
     * @param alert Whether to receive notification as alert.
     * @param email Whether to receive notification as email.
     * @param prefixIds Prefix ids.
     * @param minimalContestAmount Minimal contest amount. (Only for 766 forumId)
     */
	suspend fun follow(forumId: Int, body: ForumsFollowBody? = null): ForumsFollowResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/forums/$forumId/followers",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Unfollow Forum
     *
     * Unfollow a forum.
     * 
     * Required scopes:
     * + post
     *
     * @param forumId Id of forum.
     */
	suspend fun unfollow(forumId: Int): ForumsUnfollowResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "DELETE",
			path = "/forums/$forumId/followers",
		)))
	}

    /**
     * Get Followed Forums
     *
     * List of followed forums by current user.
     * 
     * Required scopes:
     * + read
     *
     * @param total If included in the request, only the forum count is returned as forums_total.
     */
	suspend fun followed(params: ForumsFollowedParams? = null): ForumsFollowedResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/forums/followed",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		)))
	}

    /**
     * Get Feed Options
     *
     * Returns available options for the forums feed.
     * 
     * Required scopes:
     * + read
     */
	suspend fun getFeedOptions(): ForumsGetFeedOptionsResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/forums/feed/options",
		)))
	}

    /**
     * Edit Feed Options
     *
     * Edit feed options.
     * 
     * Required scopes:
     * + post
     *
     * @param nodeIds Array of forum ids to exclude from the feed.
     * @param keywords List of keywords to exclude specific threads from the feed.
     */
	suspend fun editFeedOptions(body: ForumsEditFeedOptionsBody? = null): ForumsEditFeedOptionsResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "PUT",
			path = "/forums/feed/options",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}
}


public class LinksApi(private val http: LolzteamHttpClient) {

    /**
     * Get Links Forum
     *
     * List of all link forums.
     * 
     * Required scopes:
     * + read
     */
	suspend fun list(): LinksListResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/link-forums",
		)))
	}

    /**
     * Get Link Forum
     *
     * Detail information of a link forum.
     * 
     * Required scopes:
     * + read
     *
     * @param linkId Id of link forum.
     */
	suspend fun get(linkId: Int): LinksGetResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/link-forums/$linkId",
		)))
	}
}


public class PagesApi(private val http: LolzteamHttpClient) {

    /**
     * Get Pages
     *
     * List of all pages in the system.
     * 
     * Required scopes:
     * + read
     *
     * @param parentPageId Id of parent page. If exists, filter pages that are direct children of that page.
     * @param order Ordering of pages.
     */
	suspend fun list(params: PagesListParams? = null): PagesListResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/pages",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		)))
	}

    /**
     * Get Page
     *
     * Detail information of a page.
     * 
     * Required scopes:
     * + read
     *
     * @param pageId Id of page.
     */
	suspend fun get(pageId: Int): PagesGetResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/pages/$pageId",
		)))
	}
}


public class NavigationApi(private val http: LolzteamHttpClient) {

    /**
     * Get Navigation
     *
     * List of navigation elements within the system.
     * 
     * Required scopes:
     * + read
     *
     * @param parent Id of parent element. If exists, filter elements that are direct children of that element.
     */
	suspend fun list(params: NavigationListParams? = null): NavigationListResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/navigation",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		)))
	}
}


public class ThreadsApi(private val http: LolzteamHttpClient) {

    /**
     * Get Threads
     *
     * List of threads in a forum (with pagination).
     * 
     * Required scopes:
     * + read
     *
     * @param forumId Id of the containing forum.
     * @param tab Tab to get threads from.
     * @param state Thread state. Works only if forum_id is set.
     * @param period Filter to get only threads created within the selected period. Works only if forum_id is set.
     * @param title Thread title.
     * @param titleOnly Search only in titles.
     * @param creatorUserId Filter to get only threads created by the specified user.
     * @param sticky Filter to get only sticky or non-sticky threads. By default, all threads will be included and sticky ones will be at the top of the result on the first page. In mixed mode, sticky threads are not counted towards threads_total and does not affect pagination.
     * @param prefixIds[] Filter to get only threads with the specified prefix.
     * @param prefixIdsNot[] Filter to get only threads without the specified prefix.
     * @param threadTagId Filter to get only threads with the specified tag.
     * @param page Page number of threads.
     * @param limit Number of threads in a page.
     * @param order Ordering of threads.
     * @param direction Direction of threads ordering.
     * @param threadCreateDate Filter threads by creation date. Only works with 'thread_create_date' and 'thread_create_date_reverse' ordering.
     * @param threadUpdateDate Filter threads by update date. Only works with 'thread_update_date' and 'thread_update_date_reverse' ordering.
     * @param fieldsInclude List of fields to include.
     */
	suspend fun list(params: ThreadsListParams? = null): ThreadsListResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/threads",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		)))
	}

    /**
     * Create Thread
     *
     * Create a new thread.
     * 
     * Required scopes:
     * + post
     *
     * @param postBody Content of the new thread.
     * @param forumId Id of the target forum.
     * @param title Thread title. Can be skipped if title_en set.
     * @param titleEn Thread english title. Can be skipped if title set.
     * @param prefixId Prefix ids.
     * @param tags Thread tags.
     * @param hideContacts Hide contacts.
     * @param allowAskHiddenContent Allow ask hidden content.
     * @param replyGroup Allow to reply only users with chosen or higher group.
     * @param commentIgnoreGroup Allow commenting if user can't post in thread.
     * @param dontAlertFollowers Don't alert followers about thread creation.
     * @param scheduleDate Date to schedule thread creation (format: `DD-MM-YYYY`).
     * @param scheduleTime Time to schedule thread creation (format: `HH:MM`).
     * @param watchThreadState Watch thread state.
     * @param watchThread Receive forum notifications of new posts in this thread.
     * @param watchThreadEmail Receive email notifications of new posts in this thread.
     */
	suspend fun create(body: ThreadsCreateBody? = null): ThreadsCreateResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/threads",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Create Contest
     *
     * Create a new contest.
     * 
     * Required scopes:
     * + post
     *
     * @param postBody Content of the new contest.
     * @param title Thread title. Can be skipped if title_en set.
     * @param titleEn Thread english title. Can be skipped if title set.
     * @param contestType Contest type.
     * @param lengthValue Giveaway duration value. The maximum duration is 3 days. Required if contest_type is by_finish_date.
     * @param lengthOption Giveaway duration type. The maximum duration is 3 days. Required if contest_type is by_finish_date.
     * @param prizeType Prize type.
     * @param countWinners Winner count (prize count). Optional if prize_type is money.
     * @param prizeDataMoney How much money will each winner receive. Optional if prize_type is money.
     * @param isMoneyPlaces Enable the distribution of money prizes by places. Optional if prize_type is money.
     * @param prizeDataPlaces How much money will receive each place. Required if is_money_places is 1.
     * @param prizeDataUpgrade Which upgrade will each winner receive. Required if prize_type is upgrades.
     * @param requireLikeCount Sympathies for this week.
     * @param requireTotalLikeCount Sympathies for all time.
     * @param secretAnswer Secret answer of your account.
     * @param tags Thread tags.
     * @param replyGroup Allow to reply only users with chosen or higher group.
     * @param commentIgnoreGroup Allow commenting if user can't post in thread.
     * @param dontAlertFollowers Don't alert followers about thread creation.
     * @param hideContacts Hide contacts.
     * @param allowAskHiddenContent Allow ask hidden content.
     * @param scheduleDate Date to schedule thread creation (format: `DD-MM-YYYY`).
     * @param scheduleTime Time to schedule thread creation (format: `HH:MM`).
     * @param watchThreadState Watch thread state.
     * @param watchThread Receive forum notifications of new posts in this thread.
     * @param watchThreadEmail Receive email notifications of new posts in this thread.
     */
	suspend fun createContest(body: ThreadsCreateContestBody): ThreadsCreateContestResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/contests",
			body = http.json.encodeToJsonElement(serializer(), body),
			bodyEncoding = "json",
		)))
	}

    /**
     * Create Claim
     *
     * Create a Claim.
     * 
     * Required scopes:
     * + post
     *
     * @param asResponder To whom the complaint is filed. Specify a nickname or a link to the profile.
     * @param asIsMarketDeal Did you buy account on the market?
     * @param asMarketItemId Market item id. Required if as_is_market_deal is 1.
     * @param asData Contacts and wallets of the responder. Specify the known data about the responder, if any. Optional if as_is_market_deal is 0.
     * @param asAmount Indicate the amount by which the responder deceived you.
     * @param currency Currency of Claim.
     * @param transferType The transaction took place through a guarantor or there was a transfer to the market with a hold? Required if as_is_market_deal is 0.
     * @param payClaim Pay claim fee now or later. (Only for transfer_type = notsafe)
     * @param asFundsReceipt Funds transfer receipt. Upload a receipt for the transfer of funds, use the "View receipt" button in your wallet. May be uploaded to [Imgur](https://imgur.com/upload). Write "no" if you have not paid. Required if as_is_market_deal is 0.
     * @param asTgLoginScreenshot Screenshot showing the respondent's Telegram login. If the correspondence was conducted in Telegram, upload a screenshot that will display the respondent's Telegram login against the background of your dialogue. The screenshot may be uploaded to [Imgur](https://imgur.com/upload). If the correspondence was conducted elsewhere, write "no".
     * @param tags Thread tags.
     * @param hideContacts Hide contacts.
     * @param allowAskHiddenContent Allow ask hidden content.
     * @param replyGroup Allow to reply only users with chosen or higher group.
     * @param commentIgnoreGroup Allow commenting if user can't post in thread.
     * @param dontAlertFollowers Don't alert followers about thread creation.
     * @param scheduleDate Date to schedule thread creation (format: `DD-MM-YYYY`).
     * @param scheduleTime Time to schedule thread creation (format: `HH:MM`).
     * @param watchThreadState Watch thread state.
     * @param watchThread Receive forum notifications of new posts in this thread.
     * @param watchThreadEmail Receive email notifications of new posts in this thread.
     * @param postBody You should describe what's happened. - describe the situation in a nutshell. If you wish, you can describe the situation in more detail using the "Spoiler" function. - attach screenshots of correspondence. You may upload to the site [Imgur](https://imgur.com/upload) - for convenience, use Ctrl + V when uploading screenshots to the album. - other evidence; - notify the respondent about the complaint you created, familiarize him with hidden content Describe the situation in as much detail as possible.
     */
	suspend fun claim(body: ThreadsClaimBody? = null): ThreadsClaimResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/claims",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Get Thread
     *
     * Detail information of a thread.
     * 
     * Required scopes:
     * + read
     *
     * @param threadId Id of thread.
     * @param fieldsInclude List of fields to include.
     */
	suspend fun get(threadId: Int, params: ThreadsGetParams? = null): ThreadsGetResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/threads/$threadId",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		)))
	}

    /**
     * Edit thread
     *
     * Edit a thread.
     * 
     * Required scopes:
     * + post
     *
     * @param threadId Id of thread.
     * @param title Thread title.
     * @param titleEn Thread title english.
     * @param prefixId Prefix ids. Set "0" to remove all thread prefixes.
     * @param tags Thread tags.
     * @param discussionOpen Discussion state.
     * @param hideContacts Hide contacts.
     * @param allowAskHiddenContent Allow ask hidden content.
     * @param replyGroup Allow to reply only users with chosen or higher group.
     * @param commentIgnoreGroup Allow commenting if user can't post in thread.
     */
	suspend fun edit(threadId: Int, body: ThreadsEditBody? = null): ThreadsEditResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "PUT",
			path = "/threads/$threadId",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Delete Thread
     *
     * Delete a thread.
     * 
     * Required scopes:
     * + post
     *
     * @param threadId Id of thread.
     * @param reason Reason of the thread removal.
     */
	suspend fun delete(threadId: Int, body: ThreadsDeleteBody? = null): ThreadsDeleteResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "DELETE",
			path = "/threads/$threadId",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Move Thread
     *
     * Move a thread to another forum.
     * 
     * Required scopes:
     * + post
     *
     * @param threadId Id of thread.
     * @param nodeId Forum id.
     * @param title Thread title.
     * @param titleEn Thread title english.
     * @param prefixId Prefix ids. Set "0" to remove all thread prefixes.
     * @param applyThreadPrefix Apply thread prefix.
     * @param sendAlert Send a notification to users who are followed to target node.
     */
	suspend fun move(threadId: Int, body: ThreadsMoveBody? = null): ThreadsMoveResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/threads/$threadId/move",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Bump Thread
     *
     * Bump a thread.
     * 
     * Required scopes:
     * + post
     *
     * @param threadId Id of thread.
     */
	suspend fun bump(threadId: Int): ThreadsBumpResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/threads/$threadId/bump",
		)))
	}

    /**
     * Hide Thread
     *
     * Hide a thread from your feed.
     * 
     * Required scopes:
     * + post
     *
     * @param threadId Id of thread.
     */
	suspend fun hide(threadId: Int): ThreadsHideResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/threads/$threadId/hide",
		)))
	}

    /**
     * Bookmark Thread
     *
     * Bookmark a thread.
     * 
     * Required scopes:
     * + post
     *
     * @param threadId Id of thread.
     */
	suspend fun star(threadId: Int): ThreadsStarResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/threads/$threadId/star",
		)))
	}

    /**
     * Unbookmark Thread
     *
     * Unbookmark a thread.
     * 
     * Required scopes:
     * + post
     *
     * @param threadId Id of thread.
     */
	suspend fun unstar(threadId: Int): ThreadsUnstarResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "DELETE",
			path = "/threads/$threadId/star",
		)))
	}

    /**
     * Get Thread Followers
     *
     * List of a thread's followers. For privacy reason, only the current user will be included in the list.
     * 
     * Required scopes:
     * + read
     *
     * @param threadId Id of thread.
     */
	suspend fun followers(threadId: Int): ThreadsFollowersResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/threads/$threadId/followers",
		)))
	}

    /**
     * Follow Thread
     *
     * Follow a thread.
     * 
     * Required scopes:
     * + post
     *
     * @param threadId Id of thread.
     * @param email Whether to receive notification as email.
     */
	suspend fun follow(threadId: Int, body: ThreadsFollowBody? = null): ThreadsFollowResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/threads/$threadId/followers",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Unfollow Thread
     *
     * Unfollow a thread.
     * 
     * Required scopes:
     * + post
     *
     * @param threadId Id of thread.
     */
	suspend fun unfollow(threadId: Int): ThreadsUnfollowResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "DELETE",
			path = "/threads/$threadId/followers",
		)))
	}

    /**
     * Get Followed Threads
     *
     * List of followed threads by current user.
     * 
     * Required scopes:
     * + read
     *
     * @param total If included in the request, only the thread count is returned as threads_total.
     * @param fieldsInclude List of fields to include.
     */
	suspend fun followed(params: ThreadsFollowedParams? = null): ThreadsFollowedResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/threads/followed",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		)))
	}

    /**
     * Get Navigation Elements
     *
     * List of navigation elements to reach the specified thread.
     * 
     * Required scopes:
     * + read
     *
     * @param threadId Id of thread.
     */
	suspend fun navigation(threadId: Int): ThreadsNavigationResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/threads/$threadId/navigation",
		)))
	}

    /**
     * Get Poll
     *
     * Detail information of a poll.
     * 
     * Required scopes:
     * + read
     *
     * @param threadId Id of thread.
     */
	suspend fun pollGet(threadId: Int): ThreadsPollGetResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/threads/$threadId/poll",
		)))
	}

    /**
     * Vote Poll
     *
     * Vote on a thread poll.
     * 
     * Required scopes:
     * + post
     *
     * @param threadId Id of thread.
     * @param responseId The id of the response to vote for. Can be skipped if response_ids set.
     * @param responseIds An array of ids of responses (if the poll allows multiple choices).
     */
	suspend fun pollVote(threadId: Int, body: ThreadsPollVoteBody? = null): ThreadsPollVoteResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/threads/$threadId/poll/votes",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Get Unread Threads
     *
     * List of unread threads (must be logged in).
     * 
     * Required scopes:
     * + read
     *
     * @param limit Maximum number of result threads. The limit may get decreased if the value is too large (depending on the system configuration).
     * @param forumId Id of the container forum to search for threads. Child forums of the specified forum will be included in the search.
     * @param dataLimit Number of thread data to be returned. Default value is 20.
     */
	suspend fun unread(params: ThreadsUnreadParams? = null): ThreadsUnreadResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/threads/new",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		)))
	}

    /**
     * Get Recent Threads
     *
     * List of recent threads.
     * 
     * Required scopes:
     * + read
     *
     * @param days Maximum number of days to search for threads.
     * @param limit Maximum number of result threads. The limit may get decreased if the value is too large.
     * @param forumId Id of the container forum to search for threads. Child forums of the specified forum will be included in the search.
     * @param dataLimit Number of thread data to be returned. Default value is 20.
     */
	suspend fun recent(params: ThreadsRecentParams? = null): ThreadsRecentResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/threads/recent",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		)))
	}

    /**
     * Finish Contest
     *
     * Finishes a contest.
     * 
     * Required scopes:
     * + post
     *
     * @param threadId Id of thread.
     */
	suspend fun finish(threadId: Int): ThreadsFinishResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/contests/$threadId/finish",
		)))
	}
}


public class PostsApi(private val http: LolzteamHttpClient) {

    /**
     * Get Posts
     *
     * List of posts in a thread (with pagination).
     * 
     * Required scopes:
     * + read
     *
     * @param threadId Id of the containing thread.
     * @param pageOfPostId Id of a post, posts that are in the same page with the specified post will be returned. thread_id may be skipped.
     * @param page Page number of posts.
     * @param limit Number of posts in a page.
     * @param order Ordering of posts.
     */
	suspend fun list(params: PostsListParams? = null): PostsListResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/posts",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		)))
	}

    /**
     * Create Post
     *
     * Create a new post.
     * 
     * Required scopes:
     * + post
     *
     * @param postBody Content of the new post.
     * @param threadId Id of the target thread. quote_post_id can be skipped if this parameter is provided.
     * @param quotePostId Id of the quote post. thread_id can be skipped if this parameter is provided.
     */
	suspend fun create(body: PostsCreateBody? = null): PostsCreateResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/posts",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Get Post
     *
     * Detail information of a post.
     * 
     * Required scopes:
     * + read
     *
     * @param postId Id of post.
     */
	suspend fun get(postId: Int): PostsGetResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/posts/$postId",
		)))
	}

    /**
     * Edit Post
     *
     * Edit a post.
     * 
     * Required scopes:
     * + post
     *
     * @param postId Id of post.
     * @param postBody Content of the post.
     */
	suspend fun edit(postId: Int, body: PostsEditBody? = null): PostsEditResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "PUT",
			path = "/posts/$postId",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Delete Post
     *
     * Delete a post.
     * 
     * Required scopes:
     * + post
     *
     * @param postId Id of post.
     * @param reason Reason of the post removal.
     */
	suspend fun delete(postId: Int, body: PostsDeleteBody? = null): PostsDeleteResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "DELETE",
			path = "/posts/$postId",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Get Post Likes
     *
     * List of users who liked a post.
     * 
     * Required scopes:
     * + read
     *
     * @param postId Id of post.
     * @param page Page number of users.
     * @param limit Number of users in a page.
     */
	suspend fun likes(postId: Int, params: PostsLikesParams? = null): PostsLikesResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/posts/$postId/likes",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		)))
	}

    /**
     * Like Post
     *
     * Like a post.
     * 
     * Required scopes:
     * + post
     *
     * @param postId Id of post.
     */
	suspend fun like(postId: Int): PostsLikeResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/posts/$postId/likes",
		)))
	}

    /**
     * Unlike Post
     *
     * Unlike a post.
     * 
     * Required scopes:
     * + post
     *
     * @param postId Id of post.
     */
	suspend fun unlike(postId: Int): PostsUnlikeResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "DELETE",
			path = "/posts/$postId/likes",
		)))
	}

    /**
     * Get Post Report Reasons
     *
     * Get post report reasons.
     * 
     * Required scopes:
     * + read
     *
     * @param postId Id of post.
     */
	suspend fun reportReasons(postId: Int): PostsReportReasonsResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/posts/$postId/report",
		)))
	}

    /**
     * Report Post
     *
     * Report a post.
     * 
     * Required scopes:
     * + post
     *
     * @param postId Id of post.
     * @param message Reason of the report.
     */
	suspend fun report(postId: Int, body: PostsReportBody? = null): PostsReportResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/posts/$postId/report",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Get Post Comments
     *
     * List of post comments in a thread.
     * 
     * Required scopes:
     * + read
     *
     * @param postId Id of post.
     * @param before The time in milliseconds (e.g. 1652177794083) before last comment date.
     * @param beforeComment Comment id to get older comments.
     */
	suspend fun commentsGet(params: PostsCommentsGetParams? = null): PostsCommentsGetResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/posts/comments",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		)))
	}

    /**
     * Create Post Comment
     *
     * Create a post comment.
     * 
     * Required scopes:
     * + post
     *
     * @param postId Id of post.
     * @param commentBody Content of the a post comment.
     */
	suspend fun commentsCreate(body: PostsCommentsCreateBody? = null): PostsCommentsCreateResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/posts/comments",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Edit Post Comment
     *
     * Edit a post comment.
     * 
     * Required scopes:
     * + post
     *
     * @param postCommentId Id of post.
     * @param commentBody Content of the new post comment.
     */
	suspend fun commentsEdit(body: PostsCommentsEditBody? = null): PostsCommentsEditResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "PUT",
			path = "/posts/comments",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Delete Post Comment
     *
     * Delete a post comment.
     * 
     * Required scopes:
     * + post
     *
     * @param postCommentId Id of post comment.
     * @param reason Reason of a post comment removal.
     */
	suspend fun commentsDelete(body: PostsCommentsDeleteBody? = null): PostsCommentsDeleteResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "DELETE",
			path = "/posts/comments",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Report Post Comment
     *
     * Report a post comment.
     * 
     * Required scopes:
     * + post
     *
     * @param postCommentId Id of post comment.
     * @param message Reason of the report.
     */
	suspend fun commentsReport(body: PostsCommentsReportBody? = null): PostsCommentsReportResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/posts/comments/report",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}
}


public class UsersApi(private val http: LolzteamHttpClient) {

    /**
     * Get Users
     *
     * List of users (with pagination).
     * 
     * Required scopes:
     * + read
     *
     * @param page Page number of users.
     * @param limit Number of users in a page.
     * @param fieldsInclude List of fields to include.
     */
	suspend fun list(params: UsersListParams? = null): UsersListResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/users",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		)))
	}

    /**
     * Get User Fields
     *
     * List of user fields.
     * 
     * Required scopes:
     * + read
     */
	suspend fun fields(): UsersFieldsResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/users/fields",
		)))
	}

    /**
     * Find Users
     *
     * List of users filtered by username, email or custom fields.
     * 
     * Required scopes:
     * + read
     *
     * @param username Username to filter. Usernames start with the query will be returned.
     * @param customFields Custom fields to filter. Example: custom_fields[telegram]=telegramLogin.
     * @param fieldsInclude List of fields to include.
     */
	suspend fun find(params: UsersFindParams? = null): UsersFindResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/users/find",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		)))
	}

    /**
     * Get User
     *
     * Detail information of a user.
     * 
     * Required scopes:
     * + read
     * + basic
     *
     * @param userId User ID. > You can use shortlink `me` to interact with your profile.
     * @param fieldsInclude List of fields to include.
     */
	suspend fun get(userId: String, params: UsersGetParams? = null): UsersGetResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/users/$userId",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		)))
	}

    /**
     * Edit User
     *
     * Edit a user.
     * 
     * Required scopes:
     * + post
     *
     * @param userId User ID. > You can use shortlink `me` to interact with your profile.
     * @param username New username.
     * @param userTitle New custom title of the user.
     * @param displayGroupId Id of the group you want to display.
     * @param displayIconGroupId Id of the icon group you want to display.
     * @param displayBannerId Id of the banner you want to display.
     * @param convWelcomeMessage This message is shown when someone wants to write to you.
     * @param userDobDay Your date of birth (day).
     * @param userDobMonth Your date of birth (month).
     * @param userDobYear Your date of birth (year).
     * @param secretAnswer Secret answer.
     * @param secretAnswerType Secret answer type.
     * @param shortLink Profile short link.
     * @param languageId User interface language ID.
     * @param gender User gender.
     * @param timezone User timezone.
     * @param receiveAdminEmail Whether to receive admin emails.
     * @param activityVisible Whether user activity is visible.
     * @param showDobDate Show date of birth (day and month).
     * @param showDobYear Show year of birth.
     * @param hideUsernameChangeLogs Hide username change logs.
     * @param allowViewProfile Who can view your profile.
     * @param allowPostProfile Who can post on your profile.
     * @param allowSendPersonalConversation Who can send you personal conversations.
     * @param allowInviteGroup Who can invite you to groups.
     * @param allowReceiveNewsFeed Who can see your news feed.
     * @param alert Alert settings.
     * @param fields Custom user profile fields.
     */
	suspend fun edit(userId: String, body: UsersEditBody? = null): UsersEditResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "PUT",
			path = "/users/$userId",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Get User Claims
     *
     * Get user claims.
     * 
     * Required scopes:
     * + read
     *
     * @param userId User ID. > You can use shortlink `me` to interact with your profile.
     * @param type Filter claims by their type.
     * @param claimState Filter claims by their state.
     */
	suspend fun claims(userId: String, params: UsersClaimsParams? = null): UsersClaimsResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/users/$userId/claims",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		)))
	}

    /**
     * Upload Avatar
     *
     * Upload avatar for a user.
     * 
     * Required scopes:
     * + post
     *
     * @param userId User ID. > You can use shortlink `me` to interact with your profile.
     * @param avatar Binary data of the avatar.
     * @param x The starting point of the selection by width. Default value - 0
     * @param y The starting point of the selection by height. Default value - 0
     * @param crop Selection size.
     */
	suspend fun avatarUpload(userId: String, body: UsersAvatarUploadBody? = null): UsersAvatarUploadResponse {
		if (body != null) {
			val jsonBody = buildJsonObject {
				body.x?.let { put("x", it) }
				body.y?.let { put("y", it) }
				body.crop?.let { put("crop", it) }
			}
			val byteFields = buildMap {
				put("avatar", body.avatar)
			}
			return http.lenientDecode(serializer(), http.request(RequestOptions(
				method = "POST",
				path = "/users/$userId/avatar",
				body = jsonBody,
				bodyEncoding = "multipart",
				byteArrayFields = byteFields,
			)))
		} else {
			return http.lenientDecode(serializer(), http.request(RequestOptions(
				method = "POST",
				path = "/users/$userId/avatar",
				bodyEncoding = "multipart",
			)))
		}
	}

    /**
     * Delete Avatar
     *
     * Delete avatar for a user.
     * 
     * Required scopes:
     * + post
     *
     * @param userId User ID. > You can use shortlink `me` to interact with your profile.
     */
	suspend fun avatarDelete(userId: String): UsersAvatarDeleteResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "DELETE",
			path = "/users/$userId/avatar",
		)))
	}

    /**
     * Crop Avatar
     *
     * Crop avatar for a user.
     * 
     * Required scopes:
     * + post
     *
     * @param userId User ID. > You can use shortlink `me` to interact with your profile.
     * @param x The starting point of the selection by width. Default value - 0
     * @param y The starting point of the selection by height. Default value - 0
     * @param crop Selection size.
     */
	suspend fun avatarCrop(userId: String, body: UsersAvatarCropBody? = null): UsersAvatarCropResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/users/$userId/avatar/crop",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Upload Background
     *
     * Upload background for a user.
     * 
     * Required scopes:
     * + post
     *
     * @param userId User ID. > You can use shortlink `me` to interact with your profile.
     * @param background Binary data of the background. Background image must be 1920x1080 pixels
     * @param x The starting point of the selection by width. Default value - 0
     * @param y The starting point of the selection by height. Default value - 0
     * @param crop Selection size.
     */
	suspend fun backgroundUpload(userId: String, body: UsersBackgroundUploadBody? = null): UsersBackgroundUploadResponse {
		if (body != null) {
			val jsonBody = buildJsonObject {
				body.x?.let { put("x", it) }
				body.y?.let { put("y", it) }
				body.crop?.let { put("crop", it) }
			}
			val byteFields = buildMap {
				put("background", body.background)
			}
			return http.lenientDecode(serializer(), http.request(RequestOptions(
				method = "POST",
				path = "/users/$userId/background",
				body = jsonBody,
				bodyEncoding = "multipart",
				byteArrayFields = byteFields,
			)))
		} else {
			return http.lenientDecode(serializer(), http.request(RequestOptions(
				method = "POST",
				path = "/users/$userId/background",
				bodyEncoding = "multipart",
			)))
		}
	}

    /**
     * Delete Background
     *
     * Delete background for a user.
     * 
     * Required scopes:
     * + post
     *
     * @param userId User ID. > You can use shortlink `me` to interact with your profile.
     */
	suspend fun backgroundDelete(userId: String): UsersBackgroundDeleteResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "DELETE",
			path = "/users/$userId/background",
		)))
	}

    /**
     * Crop Background
     *
     * Crop background for a user.
     * 
     * Required scopes:
     * + post
     *
     * @param userId User ID. > You can use shortlink `me` to interact with your profile.
     * @param x The starting point of the selection by width. Default value - 0
     * @param y The starting point of the selection by height. Default value - 0
     * @param crop Selection size.
     */
	suspend fun backgroundCrop(userId: String, body: UsersBackgroundCropBody): UsersBackgroundCropResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/users/$userId/background/crop",
			body = http.json.encodeToJsonElement(serializer(), body),
			bodyEncoding = "json",
		)))
	}

    /**
     * Get User Followers
     *
     * List of a user's followers.
     * 
     * Required scopes:
     * + read
     *
     * @param userId User ID. > You can use shortlink `me` to interact with your profile.
     * @param order Ordering of followers.
     * @param page Page number of followers.
     * @param limit Number of followers in a page.
     */
	suspend fun followers(userId: String, params: UsersFollowersParams? = null): UsersFollowersResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/users/$userId/followers",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		)))
	}

    /**
     * Follow User
     *
     * Follow a user.
     * 
     * Required scopes:
     * + post
     *
     * @param userId User ID. > You can use shortlink `me` to interact with your profile.
     */
	suspend fun follow(userId: String): UsersFollowResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/users/$userId/followers",
		)))
	}

    /**
     * Unfollow User
     *
     * Unfollow a user.
     * 
     * Required scopes:
     * + post
     *
     * @param userId User ID. > You can use shortlink `me` to interact with your profile.
     */
	suspend fun unfollow(userId: String): UsersUnfollowResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "DELETE",
			path = "/users/$userId/followers",
		)))
	}

    /**
     * Get Followed Users By User
     *
     * List of users whom are followed by a user.
     * 
     * Required scopes:
     * + read
     *
     * @param userId User ID. > You can use shortlink `me` to interact with your profile.
     * @param order Ordering of users.
     * @param page Page number of users.
     * @param limit Number of users in a page.
     */
	suspend fun followings(userId: String, params: UsersFollowingsParams? = null): UsersFollowingsResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/users/$userId/followings",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		)))
	}

    /**
     * Get User Likes
     *
     * Get information about user likes.
     * 
     * Required scopes:
     * + read
     *
     * @param userId User ID. > You can use shortlink `me` to interact with your profile.
     * @param nodeId Filter by forum section.
     * @param likeType Like type.
     * @param type Likes type.
     * @param page Page number.
     * @param contentType Content type.
     * @param searchUserId Get only likes from specified user.
     * @param stats Show weekly statistics.
     */
	suspend fun likes(userId: String, params: UsersLikesParams? = null): UsersLikesResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/users/$userId/likes",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		)))
	}

    /**
     * Get Ignored Users
     *
     * List of ignored users of current user.
     * 
     * Required scopes:
     * + read
     *
     * @param total If included in the request, only the user count is returned as users_total.
     */
	suspend fun ignored(params: UsersIgnoredParams? = null): UsersIgnoredResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/users/ignored",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		)))
	}

    /**
     * Ignore User
     *
     * Ignore a user.
     * 
     * Required scopes:
     * + post
     *
     * @param userId User ID. > You can use shortlink `me` to interact with your profile.
     */
	suspend fun ignore(userId: String): UsersIgnoreResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/users/$userId/ignore",
		)))
	}

    /**
     * Edit Ignoring Options
     *
     * Edit ignoring options.
     * 
     * Required scopes:
     * + post
     *
     * @param userId User ID. > You can use shortlink `me` to interact with your profile.
     * @param ignoreConversations Ignore user's conversations.
     * @param ignoreContent Ignore user's content.
     * @param restrictViewProfile Restrict user from viewing your profile.
     */
	suspend fun ignoreEdit(userId: String, params: UsersIgnoreEditParams? = null): UsersIgnoreEditResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "PUT",
			path = "/users/$userId/ignore",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		)))
	}

    /**
     * Unignore User
     *
     * Stop ignoring a user.
     * 
     * Required scopes:
     * + post
     *
     * @param userId User ID. > You can use shortlink `me` to interact with your profile.
     */
	suspend fun unignore(userId: String): UsersUnignoreResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "DELETE",
			path = "/users/$userId/ignore",
		)))
	}

    /**
     * Get Contents
     *
     * List of contents created by user (with pagination).
     * 
     * Required scopes:
     * + read
     *
     * @param userId User ID. > You can use shortlink `me` to interact with your profile.
     * @param page Page number of contents.
     * @param limit Number of contents in a page.
     */
	suspend fun contents(userId: String, params: UsersContentsParams? = null): UsersContentsResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/users/$userId/timeline",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		)))
	}

    /**
     * Get Trophies
     *
     * List of user trophies.
     * 
     * Required scopes:
     * + read
     *
     * @param userId User ID. > You can use shortlink `me` to interact with your profile.
     */
	suspend fun trophies(userId: String): UsersTrophiesResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/users/$userId/trophies",
		)))
	}

    /**
     * Get Secret Answer Types
     *
     * Get available secret answer types for user account security.
     * 
     * Required scopes:
     * + read
     */
	suspend fun secretAnswerTypes(): UsersSecretAnswerTypesResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/users/secret-answer/types",
		)))
	}

    /**
     * Reset Secret Answer
     *
     * Request a reset of the secret answer for the account.
     * 
     * Required scopes:
     * + post
     */
	suspend fun saReset(): UsersSaResetResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/account/secret-answer/reset",
		)))
	}

    /**
     * Cancel Secret Answer Reset
     *
     * Cancel a pending secret answer reset request for the account.
     * 
     * Required scopes:
     * + post
     */
	suspend fun saCancelReset(): UsersSaCancelResetResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "DELETE",
			path = "/account/secret-answer/reset",
		)))
	}
}


public class ProfilePostsApi(private val http: LolzteamHttpClient) {

    /**
     * Get Profile Posts
     *
     * List of profile posts (with pagination).
     * 
     * Required scopes:
     * + read
     *
     * @param userId User ID. > You can use shortlink `me` to interact with your profile.
     * @param postsUserId Filter to get only posts from the specified user.
     * @param page Page number of contents.
     * @param limit Number of contents in a page.
     * @param fieldsInclude List of fields to include.
     */
	suspend fun list(userId: String, params: ProfilePostsListParams? = null): ProfilePostsListResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/users/$userId/profile-posts",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		)))
	}

    /**
     * Get Profile Post
     *
     * Detail information of a profile post.
     * 
     * Required scopes:
     * + read
     *
     * @param profilePostId Id of profile post.
     */
	suspend fun get(profilePostId: Int): ProfilePostsGetResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/profile-posts/$profilePostId",
		)))
	}

    /**
     * Edit Profile Post
     *
     * Edit a profile post.
     * 
     * Required scopes:
     * + post
     *
     * @param profilePostId Id of profile post.
     * @param postBody New content of the profile post.
     * @param disableComments Disable comments.
     */
	suspend fun edit(profilePostId: Int, body: ProfilePostsEditBody? = null): ProfilePostsEditResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "PUT",
			path = "/profile-posts/$profilePostId",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Delete Profile Post
     *
     * Delete a profile post.
     * 
     * Required scopes:
     * + post
     *
     * @param profilePostId Id of profile post.
     * @param reason Reason of the profile post removal.
     */
	suspend fun delete(profilePostId: Int, params: ProfilePostsDeleteParams? = null): ProfilePostsDeleteResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "DELETE",
			path = "/profile-posts/$profilePostId",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		)))
	}

    /**
     * Get Profile Post Report Reasons
     *
     * Get Profile Post Report Reasons.
     * 
     * Required scopes:
     * + read
     *
     * @param profilePostId Id of profile post.
     */
	suspend fun reportReasons(profilePostId: Int): ProfilePostsReportReasonsResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/profile-posts/$profilePostId/report",
		)))
	}

    /**
     * Report a Profile Post
     *
     * Report a profile post.
     * 
     * Required scopes:
     * + post
     *
     * @param profilePostId Id of profile post.
     * @param message Reason of the report.
     */
	suspend fun report(profilePostId: Int, body: ProfilePostsReportBody? = null): ProfilePostsReportResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/profile-posts/$profilePostId/report",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Create Profile Post
     *
     * Create a profile post on a user profile.
     * 
     * Required scopes:
     * + post
     *
     * @param postBody Content of a profile post.
     */
	suspend fun create(body: ProfilePostsCreateBody? = null): ProfilePostsCreateResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/profile-posts",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Stick Profile Post
     *
     * Stick a profile post.
     * 
     * Required scopes:
     * + post
     *
     * @param profilePostId Id of profile post.
     */
	suspend fun stick(profilePostId: Int): ProfilePostsStickResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/profile-posts/$profilePostId/stick",
		)))
	}

    /**
     * Unstick Profile Post
     *
     * Unstick a profile post.
     * 
     * Required scopes:
     * + post
     *
     * @param profilePostId Id of profile post.
     */
	suspend fun unstick(profilePostId: Int): ProfilePostsUnstickResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "DELETE",
			path = "/profile-posts/$profilePostId/stick",
		)))
	}

    /**
     * Get Profile Post Likes
     *
     * List of users who liked a profile post.
     * 
     * Required scopes:
     * + read
     *
     * @param profilePostId Id of profile post.
     */
	suspend fun likes(profilePostId: Int): ProfilePostsLikesResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/profile-posts/$profilePostId/likes",
		)))
	}

    /**
     * Like Profile Post
     *
     * Like a profile post.
     * 
     * Required scopes:
     * + post
     *
     * @param profilePostId Id of profile post.
     */
	suspend fun like(profilePostId: Int): ProfilePostsLikeResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/profile-posts/$profilePostId/likes",
		)))
	}

    /**
     * Unlike Profile Post
     *
     * Unlike a profile post.
     * 
     * Required scopes:
     * + post
     *
     * @param profilePostId Id of profile post.
     */
	suspend fun unlike(profilePostId: Int): ProfilePostsUnlikeResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "DELETE",
			path = "/profile-posts/$profilePostId/likes",
		)))
	}

    /**
     * Get Profile Post Comments
     *
     * List of comments of a profile post.
     * 
     * Required scopes:
     * + read
     *
     * @param profilePostId Id of profile post.
     * @param before Date to get older comments. Please note that this entry point does not support the page parameter but it still does support limit.
     * @param limit Number of profile posts in a page.
     */
	suspend fun commentsList(params: ProfilePostsCommentsListParams? = null): ProfilePostsCommentsListResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/profile-posts/comments",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		)))
	}

    /**
     * Create Profile Post Comment
     *
     * Create a new profile post comment.
     * 
     * Required scopes:
     * + post
     *
     * @param profilePostId Id of profile post.
     * @param commentBody Content of the new profile post comment.
     */
	suspend fun commentsCreate(body: ProfilePostsCommentsCreateBody? = null): ProfilePostsCommentsCreateResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/profile-posts/comments",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Edit Profile Post Comment
     *
     * Edit a profile post comment.
     * 
     * Required scopes:
     * + post
     *
     * @param commentId Id of profile post comment.
     * @param commentBody New content for the profile post comment.
     */
	suspend fun commentsEdit(body: ProfilePostsCommentsEditBody? = null): ProfilePostsCommentsEditResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "PUT",
			path = "/profile-posts/comments",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Delete Profile Post Comment
     *
     * Delete a profile post comment.
     * 
     * Required scopes:
     * + post
     *
     * @param commentId Id of profile post comment.
     */
	suspend fun commentsDelete(body: ProfilePostsCommentsDeleteBody? = null): ProfilePostsCommentsDeleteResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "DELETE",
			path = "/profile-posts/comments",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Get Profile Post Comment
     *
     * Detail information of a profile post comment.
     * 
     * Required scopes:
     * + read
     *
     * @param profilePostId Id of profile post.
     * @param commentId Id of profile post comment.
     */
	suspend fun commentsGet(profilePostId: Int, commentId: Int): ProfilePostsCommentsGetResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/profile-posts/$profilePostId/comments/$commentId",
		)))
	}

    /**
     * Report a Profile Post Comment
     *
     * Report a profile post comment.
     * 
     * Required scopes:
     * + post
     *
     * @param commentId Id of profile post comment.
     * @param message Reason of the report.
     */
	suspend fun commentsReport(commentId: Int, body: ProfilePostsCommentsReportBody? = null): ProfilePostsCommentsReportResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/profile-posts/comments/$commentId/report",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}
}


public class ConversationsApi(private val http: LolzteamHttpClient) {

    /**
     * Get Conversations
     *
     * List of conversations (with pagination).
     * 
     * Required scopes:
     * + read
     * + conversate
     *
     * @param folder Filter conversations by folder.
     * @param page Page number of conversations.
     * @param limit Number of conversations in a page.
     */
	suspend fun list(params: ConversationsListParams? = null): ConversationsListResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/conversations",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		)))
	}

    /**
     * Create Conversation
     *
     * Create a new conversation.
     * 
     * Required scopes:
     * + post
     * + conversate
     *
     * @param recipientId Id of recipient. Required if is_group=false.
     * @param recipients List of recipients username's. Max recipients count is 10. Required if is_group=true.
     * @param isGroup Is group. Set false if personal conversation, or set true if group.
     * @param title The title of new conversation. Required if is_group=1.
     * @param openInvite Open invite.
     * @param allowEditMessages Allow edit messages.
     * @param allowStickyMessages Allow members to stick messages.
     * @param allowDeleteOwnMessages Allow members to delete their own messages.
     * @param messageBody First message. Required if is_group=false
     */
	suspend fun create(body: ConversationsCreateBody? = null): ConversationsCreateResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/conversations",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Edit Conversation
     *
     * Edit conversation.
     * 
     * Required scopes:
     * + conversate
     *
     * @param conversationId Id of conversation.
     * @param title New conversation title.
     * @param openInvite Allow members to invite others.
     * @param historyOpen Make conversation history visible to new members.
     * @param allowEditMessages Allow members to edit their own messages.
     * @param allowStickyMessages Allow members to stick messages.
     * @param allowDeleteOwnMessages Allow members to delete their own messages.
     */
	suspend fun update(body: ConversationsUpdateBody? = null): ConversationsUpdateResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "PUT",
			path = "/conversations",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Leave Conversation
     *
     * Leave the conversation.
     * 
     * Required scopes:
     * + post
     * + conversate
     *
     * @param conversationId Id of conversation.
     * @param deleteType Deletion type.
     */
	suspend fun delete(body: ConversationsDeleteBody? = null): ConversationsDeleteResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "DELETE",
			path = "/conversations",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Start Conversation
     *
     * Start a new conversation with a user.
     * 
     * Required scopes:
     * + conversate
     */
	suspend fun start(body: ConversationsStartBody? = null): ConversationsStartResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/conversations/start",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Send Content To Saved Messages
     *
     * Send content to Saved Messages.
     * 
     * Required scopes:
     * + conversate
     *
     * @param link Content url.
     */
	suspend fun save(body: ConversationsSaveBody? = null): ConversationsSaveResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/conversations/save",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Get Conversation
     *
     * Detail information of a conversation.
     * 
     * Required scopes:
     * + read
     * + conversate
     *
     * @param conversationId Id of conversation.
     */
	suspend fun get(conversationId: Int): ConversationsGetResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/conversations/$conversationId",
		)))
	}

    /**
     * Get Conversation Messages
     *
     * List of messages in a conversation (with pagination).
     * 
     * Required scopes:
     * + read
     * + conversate
     *
     * @param conversationId Id of conversation.
     * @param page Page number of messages.
     * @param limit Number of messages in a page.
     * @param order Ordering of messages.
     * @param before Date to get older messages.
     * @param after Date to get newer messages.
     */
	suspend fun messagesList(conversationId: Int, params: ConversationsMessagesListParams? = null): ConversationsMessagesListResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/conversations/$conversationId/messages",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		)))
	}

    /**
     * Create Conversation Message
     *
     * Create a new conversation message.
     * 
     * Required scopes:
     * + post
     * + conversate
     *
     * @param conversationId Id of conversation.
     * @param replyMessageId ID of the message being replied to.
     * @param messageBody Content of the new message.
     */
	suspend fun messagesCreate(conversationId: Int, body: ConversationsMessagesCreateBody? = null): ConversationsMessagesCreateResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/conversations/$conversationId/messages",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Search Conversations Messages
     *
     * Search for conversations messages or recipients.
     * 
     * Required scopes:
     * + read
     * + conversate
     *
     * @param q Search query string.
     * @param conversationId Id of conversation.
     * @param searchRecipients Search for recipients.
     */
	suspend fun search(body: ConversationsSearchBody? = null): ConversationsSearchResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/conversations/search",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Get Conversation Message
     *
     * Detail information of a message.
     * 
     * Required scopes:
     * + read
     * + conversate
     *
     * @param messageId Id of message.
     */
	suspend fun messagesGet(messageId: Int): ConversationsMessagesGetResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/conversations/messages/$messageId",
		)))
	}

    /**
     * Edit Conversation Message
     *
     * Edit a message.
     * 
     * Required scopes:
     * + post
     * + conversate
     *
     * @param conversationId Id of conversation.
     * @param messageId Id of message.
     * @param messageBody New content of the message.
     */
	suspend fun messagesEdit(conversationId: Int, messageId: Int, body: ConversationsMessagesEditBody? = null): ConversationsMessagesEditResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "PUT",
			path = "/conversations/$conversationId/messages/$messageId",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Delete Conversation Message
     *
     * Deletes a message from a conversation.
     * 
     * Required scopes:
     * + conversate
     *
     * @param conversationId Id of conversation.
     * @param messageId Id of message.
     */
	suspend fun messagesDelete(conversationId: Int, messageId: Int): ConversationsMessagesDeleteResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "DELETE",
			path = "/conversations/$conversationId/messages/$messageId",
		)))
	}

    /**
     * Invite Users to Conversation
     *
     * Invite one or more users to an existing conversation.
     * 
     * Required scopes:
     * + conversate
     * + post
     *
     * @param conversationId Id of conversation.
     * @param recipients List of recipients username's.
     */
	suspend fun invite(conversationId: Int, body: ConversationsInviteBody? = null): ConversationsInviteResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/conversations/$conversationId/invite",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Kick User from Conversation
     *
     * Kicks a user from a conversation.
     * 
     * Required scopes:
     * + conversate
     *
     * @param conversationId Id of conversation.
     * @param userId Id of user to kick from conversation.
     */
	suspend fun kick(conversationId: Int, body: ConversationsKickBody? = null): ConversationsKickResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/conversations/$conversationId/kick",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Read a Conversation
     *
     * Read a specific conversation.
     * 
     * Required scopes:
     * + conversate
     *
     * @param conversationId Id of conversation.
     */
	suspend fun read(conversationId: Int): ConversationsReadResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/conversations/$conversationId/read",
		)))
	}

    /**
     * Read All Conversations
     *
     * Mark all conversations as read.
     * 
     * Required scopes:
     * + read
     * + conversate
     */
	suspend fun readAll(): ConversationsReadAllResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/conversations/read-all",
		)))
	}

    /**
     * Stick Conversation Message
     *
     * Stick a message in a conversation.
     * 
     * Required scopes:
     * + post
     * + conversate
     *
     * @param conversationId Id of conversation.
     * @param messageId Id of message.
     */
	suspend fun messagesStick(conversationId: Int, messageId: Int): ConversationsMessagesStickResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/conversations/$conversationId/messages/$messageId/stick",
		)))
	}

    /**
     * Unstick Conversation Message
     *
     * Unstick a message in a conversation.
     * 
     * Required scopes:
     * + post
     * + conversate
     *
     * @param conversationId Id of conversation.
     * @param messageId Id of message.
     */
	suspend fun messagesUnstick(conversationId: Int, messageId: Int): ConversationsMessagesUnstickResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "DELETE",
			path = "/conversations/$conversationId/messages/$messageId/stick",
		)))
	}

    /**
     * Star Conversation
     *
     * Star conversation.
     * 
     * Required scopes:
     * + post
     * + conversate
     *
     * @param conversationId Id of conversation.
     */
	suspend fun star(conversationId: Int): ConversationsStarResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/conversations/$conversationId/star",
		)))
	}

    /**
     * Unstar Conversation
     *
     * Unstar conversation.
     * 
     * Required scopes:
     * + post
     * + conversate
     *
     * @param conversationId Id of conversation.
     */
	suspend fun unstar(conversationId: Int): ConversationsUnstarResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "DELETE",
			path = "/conversations/$conversationId/star",
		)))
	}

    /**
     * Enable Conversation Alerts
     *
     * Enable alerts for conversation.
     * 
     * Required scopes:
     * + post
     * + conversate
     *
     * @param conversationId Id of conversation.
     */
	suspend fun alertsEnable(conversationId: Int): ConversationsAlertsEnableResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/conversations/$conversationId/alerts",
		)))
	}

    /**
     * Disable Conversation Alerts
     *
     * Disable alerts for conversation.
     * 
     * Required scopes:
     * + post
     * + conversate
     *
     * @param conversationId Id of conversation.
     */
	suspend fun alertsDisable(conversationId: Int): ConversationsAlertsDisableResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "DELETE",
			path = "/conversations/$conversationId/alerts",
		)))
	}
}


public class NotificationsApi(private val http: LolzteamHttpClient) {

    /**
     * Get Notifications
     *
     * List of notifications (both read and unread).
     * 
     * Required scopes:
     * + read
     *
     * @param type Filter notifications by their type.
     * @param page Page number of notifications.
     * @param limit Number of notifications in a page.
     */
	suspend fun list(params: NotificationsListParams? = null): NotificationsListResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/notifications",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		)))
	}

    /**
     * Get Notification
     *
     * Get associated content of notification. The response depends on the content type.
     * 
     * Required scopes:
     * + read
     *
     * @param notificationId Id of notification.
     */
	suspend fun get(notificationId: Int): NotificationsGetResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/notifications/$notificationId/content",
		)))
	}

    /**
     * Mark Notification Read
     *
     * Mark single notification or all existing notifications read.
     * 
     * Required scopes:
     * + post
     *
     * @param notificationId If notification_id is omitted, it's mark all existing notifications as read.
     */
	suspend fun read(body: NotificationsReadBody? = null): NotificationsReadResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/notifications/read",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}
}


public class TagsApi(private val http: LolzteamHttpClient) {

    /**
     * Get Popular Tags
     *
     * List of popular tags (no pagination).
     * 
     * Required scopes:
     * + read
     */
	suspend fun popular(): TagsPopularResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/tags",
		)))
	}

    /**
     * Get Tags
     *
     * List of tags.
     * 
     * Required scopes:
     * + read
     *
     * @param page Page number of tags list.
     * @param limit Number of results in a page.
     */
	suspend fun list(params: TagsListParams? = null): TagsListResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/tags/list",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		)))
	}

    /**
     * Get Tagged Content
     *
     * List of tagged contents.
     * 
     * Required scopes:
     * + read
     *
     * @param tagId Id of tag.
     * @param page Page number of tagged contents.
     * @param limit Number of tagged contents in a page.
     */
	suspend fun get(tagId: Int, params: TagsGetParams? = null): TagsGetResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/tags/$tagId",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		)))
	}

    /**
     * Get Filtered Content
     *
     * Filtered list of tags.
     * 
     * Required scopes:
     * + read
     *
     * @param tag tag to filter. Tags start with the query will be returned.
     */
	suspend fun find(params: TagsFindParams? = null): TagsFindResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/tags/find",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		)))
	}
}


public class SearchApi(private val http: LolzteamHttpClient) {

    /**
     * Search
     *
     * Search for all supported contents.
     * 
     * Required scopes:
     * + post
     *
     * @param q Search query. Can be skipped if user_id is set.
     * @param tag Tag to search for tagged contents.
     * @param forumId Id of the container forum to search for contents. Child forums of the specified forum will be included in the search.
     * @param page Page number of results.
     * @param limit Number of results in a page.
     * @param before The time in milliseconds (e.g. 1767214800) before last content date.
     */
	suspend fun all(body: SearchAllBody? = null): SearchAllResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/search",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Search Thread
     *
     * Search for threads.
     * 
     * Required scopes:
     * + post
     *
     * @param q Search query. Can be skipped if user_id is set.
     * @param tag Tag to search for tagged contents.
     * @param forumId Id of the container forum to search for contents. Child forums of the specified forum will be included in the search.
     * @param page Page number of results.
     * @param limit Number of results in a page.
     * @param dataLimit Number of thread data to be returned.
     * @param before The time in milliseconds (e.g. 1767214800) before last content date.
     */
	suspend fun threads(body: SearchThreadsBody? = null): SearchThreadsResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/search/threads",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Search Post
     *
     * Search for posts.
     * 
     * Required scopes:
     * + post
     *
     * @param q Search query. Can be skipped if user_id is set.
     * @param tag Tag to search for tagged contents.
     * @param forumId Id of the container forum to search for contents. Child forums of the specified forum will be included in the search.
     * @param page Page number of results.
     * @param limit Number of results in a page.
     * @param dataLimit Number of post data to be returned.
     * @param before The time in milliseconds (e.g. 1767214800) before last content date.
     */
	suspend fun posts(body: SearchPostsBody? = null): SearchPostsResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/search/posts",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Search Users
     *
     * Search for users.
     * 
     * Required scopes:
     * + post
     *
     * @param q Search query.
     */
	suspend fun users(body: SearchUsersBody? = null): SearchUsersResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/search/users",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Search Profile Posts
     *
     * Search for profile posts.
     * 
     * Required scopes:
     * + post
     *
     * @param q Search query. Can be skipped if user_id is set.
     * @param userId User ID to filter profile posts.
     * @param page Page number of results.
     * @param limit Number of results in a page.
     * @param before The time in milliseconds (e.g. 1767214800) before last content date.
     */
	suspend fun profilePosts(body: SearchProfilePostsBody? = null): SearchProfilePostsResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/search/profile-posts",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Search Tagged
     *
     * Search for tagged contents.
     * 
     * Required scopes:
     * + post
     *
     * @param tag Tag to search for tagged contents.
     * @param tags Array of tags to search for tagged contents.
     * @param page Page number of results.
     * @param limit Number of results in a page.
     */
	suspend fun tagged(body: SearchTaggedBody? = null): SearchTaggedResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/search/tagged",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Get Search Results
     *
     * List of search results (with pagination).
     * 
     * Required scopes:
     * + get
     *
     * @param searchId Search ID.
     * @param page Page number of results.
     * @param limit Number of results in a page.
     */
	suspend fun results(searchId: String, params: SearchResultsParams? = null): SearchResultsResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/search/$searchId/results",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		)))
	}
}


public class BatchApi(private val http: LolzteamHttpClient) {

    /**
     * Batch
     *
     * Execute multiple API requests at once (Separated by comma). Maximum batch jobs is 10.
     * 
     * Required scopes:
     * + Same as called API requests.
     */
	suspend fun execute(body: BatchExecuteBody? = null): BatchExecuteResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/batch",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}
}


public class ChatboxApi(private val http: LolzteamHttpClient) {

    /**
     * Get Chats
     *
     * Get chat rooms.
     * 
     * Required scopes:
     * + chatbox
     *
     * @param roomId Room id.
     */
	suspend fun index(params: ChatboxIndexParams? = null): ChatboxIndexResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/chatbox",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		)))
	}

    /**
     * Get Chat Messages
     *
     * Get chat messages.
     * 
     * Required scopes:
     * + chatbox
     *
     * @param roomId Room id.
     * @param beforeMessageId Message id to get older chat messages.
     */
	suspend fun getMessages(params: ChatboxGetMessagesParams? = null): ChatboxGetMessagesResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/chatbox/messages",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		)))
	}

    /**
     * Create Chat Message
     *
     * Create chat message.
     * 
     * Required scopes:
     * + chatbox
     *
     * @param roomId Room ID.
     * @param replyMessageId ID of the message being replied to.
     * @param message Content of the chat message.
     */
	suspend fun postMessage(body: ChatboxPostMessageBody? = null): ChatboxPostMessageResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/chatbox/messages",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Edit Chat Message
     *
     * Edit chat message.
     * 
     * Required scopes:
     * + chatbox
     *
     * @param messageId Message id.
     * @param message New content of the chat message.
     */
	suspend fun editMessage(body: ChatboxEditMessageBody? = null): ChatboxEditMessageResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "PUT",
			path = "/chatbox/messages",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Delete Chat Message
     *
     * Delete chat message.
     * 
     * Required scopes:
     * + chatbox
     *
     * @param messageId Message id.
     */
	suspend fun deleteMessage(body: ChatboxDeleteMessageBody? = null): ChatboxDeleteMessageResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "DELETE",
			path = "/chatbox/messages",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Get Chat Online
     *
     * Get chat Online Users.
     * 
     * Required scopes:
     * + chatbox
     *
     * @param roomId Room id.
     */
	suspend fun online(params: ChatboxOnlineParams? = null): ChatboxOnlineResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/chatbox/messages/online",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		)))
	}

    /**
     * Get Chat Message Report Reasons
     *
     * Report chat message.
     * 
     * Required scopes:
     * + chatbox
     *
     * @param messageId Message id.
     */
	suspend fun reportReasons(params: ChatboxReportReasonsParams? = null): ChatboxReportReasonsResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/chatbox/messages/report",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		)))
	}

    /**
     * Report Chat Message
     *
     * Report chat message.
     * 
     * Required scopes:
     * + chatbox
     *
     * @param messageId Message id.
     * @param reason Report reason.
     */
	suspend fun report(body: ChatboxReportBody? = null): ChatboxReportResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/chatbox/messages/report",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Get Chat Leaderboard
     *
     * Get chat leaderboard.
     * 
     * Required scopes:
     * + chatbox
     *
     * @param duration Duration.
     */
	suspend fun getLeaderboard(params: ChatboxGetLeaderboardParams? = null): ChatboxGetLeaderboardResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/chatbox/messages/leaderboard",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		)))
	}

    /**
     * Get Ignored Chat Users
     *
     * Get list of ignored chat users.
     * 
     * Required scopes:
     * + chatbox
     */
	suspend fun getIgnore(): ChatboxGetIgnoreResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/chatbox/ignore",
		)))
	}

    /**
     * Ignore Chat User
     *
     * Ignore chat user.
     * 
     * Required scopes:
     * + chatbox
     */
	suspend fun postIgnore(body: ChatboxPostIgnoreBody? = null): ChatboxPostIgnoreResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/chatbox/ignore",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Unignore Chat User
     *
     * Unignore chat user.
     * 
     * Required scopes:
     * + chatbox
     */
	suspend fun deleteIgnore(body: ChatboxDeleteIgnoreBody? = null): ChatboxDeleteIgnoreResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "DELETE",
			path = "/chatbox/ignore",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}
}


public class FormsApi(private val http: LolzteamHttpClient) {

    /**
     * Get Forms List
     *
     * Get Forms List
     *
     * @param page Page number of forms.
     */
	suspend fun list(params: FormsListParams? = null): FormsListResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/forms",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		)))
	}

    /**
     * Create Form
     *
     * Create Form.
     *
     * @param formId Form ID
     */
	suspend fun create(body: FormsCreateBody? = null): FormsCreateResponse {
		return http.lenientDecode(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/forms/save",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
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

	companion object {
		fun create(token: String): ForumClient = ForumClient(ClientConfig(token = token))
	}
}

