// Auto-generated. Do not edit manually.

package com.lolzteam.api.generated.forum

import com.lolzteam.api.runtime.ClientConfig
import com.lolzteam.api.runtime.LolzteamHttpClient
import com.lolzteam.api.runtime.RateLimitConfig
import java.io.Closeable

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
