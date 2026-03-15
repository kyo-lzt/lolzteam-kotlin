// Auto-generated. Do not edit manually.

package com.lolzteam.api.generated.market

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject

// ─── Component Schemas ────────────────────────────────────────

@Serializable
data class DiscountModel(
	@SerialName("category_id")
	val categoryId: Long,
	@SerialName("discount_id")
	val discountId: Long,
	@SerialName("discount_percent")
	val discountPercent: Long,
	@SerialName("discount_user_id")
	val discountUserId: Long,
	@SerialName("max_price")
	val maxPrice: Long,
	@SerialName("min_price")
	val minPrice: Long,
	@SerialName("user_id")
	val userId: Long,
)

@Serializable
data class UserModel(
	@SerialName("active_items_count")
	val activeItemsCount: Long,
	@SerialName("activity_visible")
	val activityVisible: Boolean,
	val age: Long,
	val balance: String,
	val balances: List<JsonObject>,
	@SerialName("bump_item_period")
	val bumpItemPeriod: Long,
	@SerialName("can_edit")
	val canEdit: Boolean,
	@SerialName("can_follow")
	val canFollow: Boolean,
	@SerialName("can_ignore")
	val canIgnore: Boolean,
	@SerialName("can_post_profile")
	val canPostProfile: Boolean,
	@SerialName("can_view_profile")
	val canViewProfile: Boolean,
	@SerialName("can_view_profile_posts")
	val canViewProfilePosts: Boolean,
	@SerialName("can_warn")
	val canWarn: Boolean,
	@SerialName("contest_count")
	val contestCount: Long,
	@SerialName("conv_welcome_message")
	val convWelcomeMessage: String,
	val convertedBalance: Long,
	val convertedDeposit: Long,
	val convertedHold: Long,
	val currency: String,
	val currencyPhrase: String,
	@SerialName("custom_account_download_format")
	val customAccountDownloadFormat: String,
	@SerialName("custom_fields")
	val customFields: JsonObject,
	@SerialName("custom_title")
	val customTitle: String,
	val deposit: Long,
	val dob: JsonObject,
	@SerialName("feedback_data")
	val feedbackData: JsonObject,
	val hold: String,
	val homepage: String,
	@SerialName("imap_data")
	val imapData: JsonObject,
	@SerialName("is_admin")
	val isAdmin: Boolean,
	@SerialName("is_banned")
	val isBanned: Boolean,
	@SerialName("is_followed")
	val isFollowed: Boolean,
	@SerialName("is_ignored")
	val isIgnored: Boolean,
	@SerialName("is_moderator")
	val isModerator: Boolean,
	@SerialName("is_staff")
	val isStaff: Boolean,
	@SerialName("is_super_admin")
	val isSuperAdmin: Boolean,
	@SerialName("joined_date")
	val joinedDate: Long,
	@SerialName("last_activity")
	val lastActivity: Long,
	@SerialName("like2_count")
	val like2Count: Long,
	@SerialName("like_count")
	val likeCount: Long,
	val location: String,
	@SerialName("market_custom_title")
	val marketCustomTitle: String,
	@SerialName("max_discount_percent")
	val maxDiscountPercent: Long,
	@SerialName("message_count")
	val messageCount: Long,
	@SerialName("paid_mail_left")
	val paidMailLeft: Long,
	@SerialName("public_tags")
	val publicTags: List<JsonObject>,
	@SerialName("register_date")
	val registerDate: Long,
	val rendered: JsonObject,
	@SerialName("restore_count")
	val restoreCount: Long,
	@SerialName("restore_data")
	val restoreData: JsonObject,
	@SerialName("short_link")
	val shortLink: String,
	@SerialName("sold_items_count")
	val soldItemsCount: Long,
	val tags: List<JsonObject>,
	@SerialName("telegram_client")
	val telegramClient: JsonObject,
	@SerialName("trophy_points")
	val trophyPoints: Long,
	@SerialName("user_allow_ask_discount")
	val userAllowAskDiscount: Boolean,
	@SerialName("user_id")
	val userId: Long,
	@SerialName("user_title")
	val userTitle: String,
	val username: String,
	@SerialName("view_url")
	val viewUrl: String,
	val visible: Boolean,
	@SerialName("warning_points")
	val warningPoints: Long,
)

@Serializable
data class BalanceModel(
	val balance: String,
	@SerialName("balance_id")
	val balanceId: Long,
	@SerialName("custom_title")
	val customTitle: JsonElement,
	val fullTitle: String,
	@SerialName("merchant_id")
	val merchantId: Long,
	val title: String,
	val type: String,
	@SerialName("user_id")
	val userId: Long,
)

@Serializable
data class ExtraModel(
	val proxy: String? = null,
	@SerialName("close_item")
	val closeItem: Boolean? = null,
	val region: String? = null,
	val service: String? = null,
	val system: String? = null,
	val confirmationCode: String? = null,
	val cookies: String? = null,
	@SerialName("login_without_cookies")
	val loginWithoutCookies: Boolean? = null,
	@SerialName("cookie_login")
	val cookieLogin: Boolean? = null,
	@SerialName("mfa_file")
	val mfaFile: String? = null,
	@SerialName("dota2_mmr")
	val dota2Mmr: Long? = null,
	@SerialName("ea_games")
	val eaGames: Boolean? = null,
	@SerialName("uplay_games")
	val uplayGames: Boolean? = null,
	@SerialName("the_quarry")
	val theQuarry: Boolean? = null,
	val warframe: Boolean? = null,
	val ark: Boolean? = null,
	@SerialName("ark_ascended")
	val arkAscended: Boolean? = null,
	@SerialName("genshin_currency")
	val genshinCurrency: Long? = null,
	@SerialName("honkai_currency")
	val honkaiCurrency: Long? = null,
	@SerialName("zenless_currency")
	val zenlessCurrency: Long? = null,
	val password: String? = null,
	val telegramClient: String? = null,
	val telegramJson: String? = null,
	val checkChannels: Boolean? = null,
	val checkSpam: Boolean? = null,
	val checkHypixelBan: Boolean? = null,
)

@Serializable
data class ConfirmationCodeModel(
	val item: JsonObject,
	val codeData: JsonObject,
)

@Serializable
data class ItemListModel(
	val items: List<JsonObject>,
	val totalItems: Long,
	val totalItemsPrice: JsonElement,
	val hasNextPage: Boolean,
	val perPage: Long,
	val page: Long,
	val searchUrl: String,
	val stickyItems: List<JsonObject>,
	@SerialName("system_info")
	val systemInfo: JsonObject,
)

@Serializable
data class ItemFromListModel(
	@SerialName("item_id")
	val itemId: Long? = null,
	@SerialName("item_state")
	val itemState: String? = null,
	@SerialName("category_id")
	val categoryId: Long? = null,
	@SerialName("published_date")
	val publishedDate: Long? = null,
	val title: String? = null,
	val description: String? = null,
	val price: Long? = null,
	@SerialName("update_stat_date")
	val updateStatDate: Long? = null,
	@SerialName("refreshed_date")
	val refreshedDate: Long? = null,
	@SerialName("view_count")
	val viewCount: Long? = null,
	@SerialName("is_sticky")
	val isSticky: Long? = null,
	@SerialName("item_origin")
	val itemOrigin: String? = null,
	@SerialName("extended_guarantee")
	val extendedGuarantee: Long? = null,
	val nsb: Long? = null,
	@SerialName("allow_ask_discount")
	val allowAskDiscount: Long? = null,
	@SerialName("title_en")
	val titleEn: String? = null,
	@SerialName("description_en")
	val descriptionEn: String? = null,
	@SerialName("item_domain")
	val itemDomain: String? = null,
	@SerialName("resale_item_origin")
	val resaleItemOrigin: String? = null,
	val isIgnored: Long? = null,
	val guarantee: Boolean? = null,
	val canViewLoginData: Boolean? = null,
	val canUpdateItemStats: Boolean? = null,
	val canViewEmailLoginData: Boolean? = null,
	val showGetEmailCodeButton: Boolean? = null,
	val canOpenItem: Boolean? = null,
	val canCloseItem: Boolean? = null,
	val canEditItem: Boolean? = null,
	val canDeleteItem: Boolean? = null,
	val canStickItem: Boolean? = null,
	val canUnstickItem: Boolean? = null,
	val bumpSettings: JsonObject? = null,
	val canBumpItem: Boolean? = null,
	val canBuyItem: Boolean? = null,
	@SerialName("rub_price")
	val rubPrice: Long? = null,
	@SerialName("price_currency")
	val priceCurrency: String? = null,
	val canValidateAccount: Boolean? = null,
	val canResellItemAfterPurchase: Boolean? = null,
	val canViewAccountLink: Boolean? = null,
	val itemOriginPhrase: String? = null,
	val tags: List<String>? = null,
	@SerialName("note_text")
	val noteText: String? = null,
	@SerialName("description_html")
	val descriptionHtml: String? = null,
	@SerialName("description_html_en")
	val descriptionHtmlEn: String? = null,
	val seller: JsonObject? = null,
)

@Serializable
data class ItemModel(
	@SerialName("item_id")
	val itemId: Long,
	@SerialName("item_state")
	val itemState: String,
	@SerialName("category_id")
	val categoryId: Long,
	@SerialName("published_date")
	val publishedDate: Long,
	val title: String,
	val description: String,
	val price: Long,
	@SerialName("update_stat_date")
	val updateStatDate: Long,
	@SerialName("refreshed_date")
	val refreshedDate: Long,
	@SerialName("edit_date")
	val editDate: Long,
	@SerialName("pending_deletion_date")
	val pendingDeletionDate: Long,
	val login: String,
	@SerialName("temp_email")
	val tempEmail: String,
	@SerialName("view_count")
	val viewCount: Long,
	@SerialName("is_sticky")
	val isSticky: Long,
	val information: String,
	@SerialName("item_origin")
	val itemOrigin: String,
	@SerialName("extended_guarantee")
	val extendedGuarantee: Long,
	val nsb: Long,
	@SerialName("allow_ask_discount")
	val allowAskDiscount: Long,
	@SerialName("title_en")
	val titleEn: String,
	@SerialName("description_en")
	val descriptionEn: String,
	@SerialName("information_en")
	val informationEn: String,
	@SerialName("email_type")
	val emailType: String,
	@SerialName("email_provider")
	val emailProvider: String,
	@SerialName("item_domain")
	val itemDomain: String,
	@SerialName("resale_item_origin")
	val resaleItemOrigin: String,
	@SerialName("note_text")
	val noteText: String,
	@SerialName("content_type")
	val contentType: JsonElement,
	@SerialName("content_id")
	val contentId: JsonElement,
	@SerialName("delete_date")
	val deleteDate: Long,
	@SerialName("delete_user_id")
	val deleteUserId: Long,
	@SerialName("delete_username")
	val deleteUsername: String,
	@SerialName("delete_reason")
	val deleteReason: String,
	@SerialName("user_allow_ask_discount")
	val userAllowAskDiscount: Long,
	@SerialName("max_discount_percent")
	val maxDiscountPercent: Long,
	@SerialName("market_custom_title")
	val marketCustomTitle: String,
	@SerialName("feedback_data")
	val feedbackData: String,
	@SerialName("buyer_display_icon_group_id")
	val buyerDisplayIconGroupId: Long,
	@SerialName("buyer_uniq_banner")
	val buyerUniqBanner: String,
	@SerialName("buyer_avatar_date")
	val buyerAvatarDate: Long,
	@SerialName("buyer_user_group_id")
	val buyerUserGroupId: Long,
	@SerialName("is_fave")
	val isFave: JsonElement,
	@SerialName("in_cart")
	val inCart: JsonElement,
	@SerialName("cart_price")
	val cartPrice: JsonElement,
	val canResellItem: Boolean,
	val priceWithSellerFee: Double,
	val guarantee: JsonObject,
	val canViewLoginData: Boolean,
	val canUpdateItemStats: Boolean,
	val canReportItem: Boolean,
	val canViewItemViews: Boolean,
	val loginData: JsonObject,
	val canViewEmailLoginData: Boolean,
	val copyFormatData: JsonObject,
	val showGetEmailCodeButton: Boolean,
	val getEmailCodeDisplayLogin: JsonElement,
	val buyer: JsonObject,
	val isPersonalAccount: Boolean,
	@SerialName("rub_price")
	val rubPrice: Long,
	@SerialName("price_currency")
	val priceCurrency: String,
	val priceWithSellerFeeLabel: String,
	val canValidateAccount: Boolean,
	val canResellItemAfterPurchase: Boolean,
	val isSmallExf: Boolean,
	@SerialName("account_last_activity")
	val accountLastActivity: Long,
	val canViewAccountLink: Boolean,
	val accountLinks: List<JsonObject>,
	val accountLink: String,
	val imagePreviewLinks: List<String>,
	val canChangePassword: Boolean,
	val canChangeEmailPassword: Boolean,
	val uniqueKeyExists: Boolean,
	val itemOriginPhrase: String,
	val visitorIsAuthor: Boolean,
	val canAskDiscount: Boolean,
	val tags: JsonObject,
	val customFields: JsonObject,
	val externalAuth: List<JsonElement>,
	val isTrusted: Boolean,
	val isBirthdayToday: Boolean,
	val isIgnored: Boolean,
	val deposit: Long,
	val extraPrices: List<JsonObject>,
	val canViewAccountLoginAndTempEmail: Boolean,
	val bumpSettings: JsonObject,
	val canCheckGuarantee: Boolean,
	val canShareItem: Boolean,
	val canCheckAiPrice: Boolean,
	val aiPrice: Long,
	val aiPriceCheckDate: Long,
	val needToRequireVideoToViewLoginData: Boolean,
	val canCheckAutoBuyPrice: Boolean,
	val autoBuyPrice: Long,
	val autoBuyPriceCheckDate: Long,
	val descriptionHtml: String,
	val descriptionEnHtml: String,
	val descriptionPlain: String,
	val descriptionEnPlain: String,
	val seller: JsonObject,
)

@Serializable
data class InvoiceModel(
	@SerialName("additional_data")
	val additionalData: String,
	val amount: Long,
	val comment: String,
	@SerialName("expires_at")
	val expiresAt: Long,
	@SerialName("invoice_date")
	val invoiceDate: Long,
	@SerialName("invoice_id")
	val invoiceId: Long,
	@SerialName("is_test")
	val isTest: Boolean,
	@SerialName("merchant_id")
	val merchantId: Long,
	@SerialName("paid_date")
	val paidDate: Long,
	@SerialName("payer_user_id")
	val payerUserId: Long,
	@SerialName("payment_id")
	val paymentId: String,
	@SerialName("resend_attempts")
	val resendAttempts: Long,
	val status: String,
	val url: String,
	@SerialName("url_callback")
	val urlCallback: String,
	@SerialName("url_success")
	val urlSuccess: String,
	@SerialName("user_id")
	val userId: Long,
)

@Serializable
data class RespSystemInfo(
	@SerialName("visitor_id")
	val visitorId: Long,
	val time: Long,
	@SerialName("log_id")
	val logId: Long,
)

// ─── CategoryApi Types ────────────────────────────────────────

@Serializable
data class CategoryAllParams(
	val page: Int? = null,
	val pmin: Int? = null,
	val pmax: Int? = null,
	val title: String? = null,
	@SerialName("order_by")
	val orderBy: String? = null,
	@SerialName("tag_id[]")
	val tagId: List<Int>? = null,
	@SerialName("not_tag_id[]")
	val notTagId: List<Int>? = null,
	@SerialName("public_tag_id[]")
	val publicTagId: List<Int>? = null,
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Int>? = null,
	@SerialName("origin[]")
	val origin: JsonElement? = null,
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
	@SerialName("user_id")
	val userId: Int? = null,
	val nsb: Boolean? = null,
	val sb: Boolean? = null,
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
	val currency: String? = null,
	@SerialName("email_login_data")
	val emailLoginData: Boolean? = null,
	@SerialName("email_provider[]")
	val emailProvider: JsonElement? = null,
	@SerialName("not_email_provider[]")
	val notEmailProvider: String? = null,
	@SerialName("parse_same_item_ids")
	val parseSameItemIds: Boolean? = null,
)

@Serializable
data class CategoryAllResponse(
	val items: List<ItemFromListModel>? = null,
	val totalItems: Long? = null,
	val totalItemsPrice: JsonElement? = null,
	val hasNextPage: Boolean? = null,
	val perPage: Long? = null,
	val page: Long? = null,
	val searchUrl: String? = null,
	val stickyItems: List<ItemFromListModel>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class CategorySteamParams(
	val page: Int? = null,
	val pmin: Int? = null,
	val pmax: Int? = null,
	val title: String? = null,
	@SerialName("order_by")
	val orderBy: String? = null,
	@SerialName("tag_id[]")
	val tagId: List<Int>? = null,
	@SerialName("not_tag_id[]")
	val notTagId: List<Int>? = null,
	@SerialName("public_tag_id[]")
	val publicTagId: List<Int>? = null,
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Int>? = null,
	@SerialName("origin[]")
	val origin: JsonElement? = null,
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
	@SerialName("user_id")
	val userId: Int? = null,
	val nsb: Boolean? = null,
	val sb: Boolean? = null,
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
	val currency: String? = null,
	@SerialName("email_login_data")
	val emailLoginData: Boolean? = null,
	@SerialName("email_type[]")
	val emailType: JsonElement? = null,
	@SerialName("email_provider[]")
	val emailProvider: JsonElement? = null,
	@SerialName("not_email_provider[]")
	val notEmailProvider: String? = null,
	@SerialName("parse_same_item_ids")
	val parseSameItemIds: Boolean? = null,
	@SerialName("item_domain")
	val itemDomain: String? = null,
	@SerialName("game[]")
	val game: List<Int>? = null,
	@SerialName("hours_played")
	val hoursPlayed: JsonObject? = null,
	@SerialName("hours_played_max")
	val hoursPlayedMax: JsonObject? = null,
	val eg: JsonElement? = null,
	@SerialName("vac[]")
	val vac: List<Int>? = null,
	@SerialName("vac_skip_game_check")
	val vacSkipGameCheck: Boolean? = null,
	val rt: String? = null,
	@SerialName("trade_ban")
	val tradeBan: String? = null,
	@SerialName("trade_limit")
	val tradeLimit: String? = null,
	val daybreak: Int? = null,
	val limit: String? = null,
	val mafile: String? = null,
	val reg: Int? = null,
	@SerialName("reg_period")
	val regPeriod: String? = null,
	val lmin: Int? = null,
	val lmax: Int? = null,
	val rmin: Int? = null,
	val rmax: Int? = null,
	@SerialName("wingman_rmin")
	val wingmanRmin: Int? = null,
	@SerialName("wingman_rmax")
	val wingmanRmax: Int? = null,
	@SerialName("no_vac")
	val noVac: Boolean? = null,
	@SerialName("mm_ban")
	val mmBan: String? = null,
	@SerialName("balance_min")
	val balanceMin: Int? = null,
	@SerialName("balance_max")
	val balanceMax: Int? = null,
	@SerialName("inv_game")
	val invGame: Int? = null,
	@SerialName("inv_min")
	val invMin: Double? = null,
	@SerialName("inv_max")
	val invMax: Double? = null,
	@SerialName("friends_min")
	val friendsMin: Int? = null,
	@SerialName("friends_max")
	val friendsMax: Int? = null,
	val gmin: Int? = null,
	val gmax: Int? = null,
	@SerialName("win_count_min")
	val winCountMin: Int? = null,
	@SerialName("win_count_max")
	val winCountMax: Int? = null,
	@SerialName("medal_id[]")
	val medalId: JsonElement? = null,
	@SerialName("medal_operator_or")
	val medalOperatorOr: Boolean? = null,
	@SerialName("medal_min")
	val medalMin: Int? = null,
	@SerialName("medal_max")
	val medalMax: Int? = null,
	@SerialName("gift[]")
	val gift: JsonElement? = null,
	@SerialName("gift_min")
	val giftMin: Int? = null,
	@SerialName("gift_max")
	val giftMax: Int? = null,
	@SerialName("recently_hours_min")
	val recentlyHoursMin: Int? = null,
	@SerialName("recently_hours_max")
	val recentlyHoursMax: Int? = null,
	@SerialName("country[]")
	val country: List<String>? = null,
	@SerialName("not_country[]")
	val notCountry: List<String>? = null,
	@SerialName("cs2_profile_rank_min")
	val cs2ProfileRankMin: Int? = null,
	@SerialName("cs2_profile_rank_max")
	val cs2ProfileRankMax: Int? = null,
	@SerialName("solommr_min")
	val solommrMin: Int? = null,
	@SerialName("solommr_max")
	val solommrMax: Int? = null,
	@SerialName("d2_game_count_min")
	val d2GameCountMin: Int? = null,
	@SerialName("d2_game_count_max")
	val d2GameCountMax: Int? = null,
	@SerialName("d2_win_count_min")
	val d2WinCountMin: Int? = null,
	@SerialName("d2_win_count_max")
	val d2WinCountMax: Int? = null,
	@SerialName("d2_behavior_min")
	val d2BehaviorMin: Int? = null,
	@SerialName("d2_behavior_max")
	val d2BehaviorMax: Int? = null,
	@SerialName("faceit_lvl_min")
	val faceitLvlMin: Int? = null,
	@SerialName("faceit_lvl_max")
	val faceitLvlMax: Int? = null,
	@SerialName("points_min")
	val pointsMin: Int? = null,
	@SerialName("points_max")
	val pointsMax: Int? = null,
	@SerialName("relevant_gmin")
	val relevantGmin: Int? = null,
	@SerialName("relevant_gmax")
	val relevantGmax: Int? = null,
	@SerialName("last_trans_date")
	val lastTransDate: Int? = null,
	@SerialName("last_trans_date_period")
	val lastTransDatePeriod: String? = null,
	@SerialName("last_trans_date_later")
	val lastTransDateLater: Int? = null,
	@SerialName("last_trans_date_period_later")
	val lastTransDatePeriodLater: String? = null,
	@SerialName("no_trans")
	val noTrans: Boolean? = null,
	val trans: Boolean? = null,
	@SerialName("gifts_purchase_min")
	val giftsPurchaseMin: Double? = null,
	@SerialName("gifts_purchase_max")
	val giftsPurchaseMax: Double? = null,
	@SerialName("refunds_purchase_min")
	val refundsPurchaseMin: Double? = null,
	@SerialName("refunds_purchase_max")
	val refundsPurchaseMax: Double? = null,
	@SerialName("ingame_purchase_min")
	val ingamePurchaseMin: Double? = null,
	@SerialName("ingame_purchase_max")
	val ingamePurchaseMax: Double? = null,
	@SerialName("games_purchase_min")
	val gamesPurchaseMin: Double? = null,
	@SerialName("games_purchase_max")
	val gamesPurchaseMax: Double? = null,
	@SerialName("purchase_min")
	val purchaseMin: Double? = null,
	@SerialName("purchase_max")
	val purchaseMax: Double? = null,
	@SerialName("has_activated_keys")
	val hasActivatedKeys: String? = null,
	@SerialName("elo_min")
	val eloMin: Int? = null,
	@SerialName("elo_max")
	val eloMax: Int? = null,
	@SerialName("cs2_map_rank")
	val cs2MapRank: JsonElement? = null,
	@SerialName("cs2_map_rmin")
	val cs2MapRmin: Int? = null,
	@SerialName("cs2_map_rmax")
	val cs2MapRmax: Int? = null,
	@SerialName("has_faceit")
	val hasFaceit: String? = null,
	@SerialName("faceit_csgo_lvl_min")
	val faceitCsgoLvlMin: Int? = null,
	@SerialName("faceit_csgo_lvl_max")
	val faceitCsgoLvlMax: Int? = null,
	@SerialName("rust_deaths_min")
	val rustDeathsMin: Int? = null,
	@SerialName("rust_deaths_max")
	val rustDeathsMax: Int? = null,
	@SerialName("rust_kills_min")
	val rustKillsMin: Int? = null,
	@SerialName("rust_kills_max")
	val rustKillsMax: Int? = null,
	@SerialName("d2_last_match_date")
	val d2LastMatchDate: Int? = null,
	@SerialName("d2_last_match_date_period")
	val d2LastMatchDatePeriod: String? = null,
	@SerialName("cards_min")
	val cardsMin: Int? = null,
	@SerialName("cards_max")
	val cardsMax: Int? = null,
	@SerialName("cards_games_min")
	val cardsGamesMin: Int? = null,
	@SerialName("cards_games_max")
	val cardsGamesMax: Int? = null,
	@SerialName("skip_vac_inv")
	val skipVacInv: Boolean? = null,
)

@Serializable
data class CategorySteamResponse(
	val items: List<JsonObject>? = null,
	val totalItems: Long? = null,
	val totalItemsPrice: JsonElement? = null,
	val hasNextPage: Boolean? = null,
	val perPage: Long? = null,
	val page: Long? = null,
	val wasCached: Boolean? = null,
	val cacheTTL: Long? = null,
	val lastModified: Long? = null,
	val serverTime: Long? = null,
	val searchUrl: String? = null,
	val stickyItems: List<JsonElement>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class CategoryFortniteParams(
	val page: Int? = null,
	val pmin: Int? = null,
	val pmax: Int? = null,
	val title: String? = null,
	@SerialName("order_by")
	val orderBy: String? = null,
	@SerialName("tag_id[]")
	val tagId: List<Int>? = null,
	@SerialName("not_tag_id[]")
	val notTagId: List<Int>? = null,
	@SerialName("public_tag_id[]")
	val publicTagId: List<Int>? = null,
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Int>? = null,
	@SerialName("origin[]")
	val origin: JsonElement? = null,
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
	@SerialName("user_id")
	val userId: Int? = null,
	val nsb: Boolean? = null,
	val sb: Boolean? = null,
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
	val currency: String? = null,
	@SerialName("email_login_data")
	val emailLoginData: Boolean? = null,
	@SerialName("email_provider[]")
	val emailProvider: JsonElement? = null,
	@SerialName("email_type[]")
	val emailType: JsonElement? = null,
	@SerialName("not_email_provider[]")
	val notEmailProvider: String? = null,
	@SerialName("parse_same_item_ids")
	val parseSameItemIds: Boolean? = null,
	@SerialName("temp_email")
	val tempEmail: String? = null,
	@SerialName("item_domain")
	val itemDomain: String? = null,
	val eg: JsonElement? = null,
	val smin: Int? = null,
	val smax: Int? = null,
	val vbmin: Int? = null,
	val vbmax: Int? = null,
	@SerialName("skin[]")
	val skin: JsonElement? = null,
	@SerialName("pickaxe[]")
	val pickaxe: JsonElement? = null,
	@SerialName("glider[]")
	val glider: JsonElement? = null,
	@SerialName("dance[]")
	val dance: JsonElement? = null,
	@SerialName("change_email")
	val changeEmail: String? = null,
	@SerialName("platform[]")
	val platform: JsonElement? = null,
	@SerialName("skins_shop_min")
	val skinsShopMin: Int? = null,
	@SerialName("skins_shop_max")
	val skinsShopMax: Int? = null,
	@SerialName("pickaxes_shop_min")
	val pickaxesShopMin: Int? = null,
	@SerialName("pickaxes_shop_max")
	val pickaxesShopMax: Int? = null,
	@SerialName("dances_shop_min")
	val dancesShopMin: Int? = null,
	@SerialName("dances_shop_max")
	val dancesShopMax: Int? = null,
	@SerialName("gliders_shop_min")
	val glidersShopMin: Int? = null,
	@SerialName("gliders_shop_max")
	val glidersShopMax: Int? = null,
	@SerialName("skins_shop_vbmin")
	val skinsShopVbmin: Int? = null,
	@SerialName("skins_shop_vbmax")
	val skinsShopVbmax: Int? = null,
	@SerialName("pickaxes_shop_vbmin")
	val pickaxesShopVbmin: Int? = null,
	@SerialName("pickaxes_shop_vbmax")
	val pickaxesShopVbmax: Int? = null,
	@SerialName("dances_shop_vbmin")
	val dancesShopVbmin: Int? = null,
	@SerialName("dances_shop_vbmax")
	val dancesShopVbmax: Int? = null,
	@SerialName("gliders_shop_vbmin")
	val glidersShopVbmin: Int? = null,
	@SerialName("gliders_shop_vbmax")
	val glidersShopVbmax: Int? = null,
	val bp: String? = null,
	val lmin: Int? = null,
	val lmax: Int? = null,
	@SerialName("bp_lmin")
	val bpLmin: Int? = null,
	@SerialName("bp_lmax")
	val bpLmax: Int? = null,
	@SerialName("last_trans_date")
	val lastTransDate: Int? = null,
	@SerialName("last_trans_date_period")
	val lastTransDatePeriod: String? = null,
	@SerialName("no_trans")
	val noTrans: Boolean? = null,
	@SerialName("xbox_linkable")
	val xboxLinkable: String? = null,
	@SerialName("psn_linkable")
	val psnLinkable: String? = null,
	val daybreak: Int? = null,
	@SerialName("rl_purchases")
	val rlPurchases: Boolean? = null,
	val reg: Int? = null,
	@SerialName("reg_period")
	val regPeriod: String? = null,
	@SerialName("refund_credits_min")
	val refundCreditsMin: Int? = null,
	@SerialName("refund_credits_max")
	val refundCreditsMax: Int? = null,
	@SerialName("pickaxe_min")
	val pickaxeMin: Int? = null,
	@SerialName("pickaxe_max")
	val pickaxeMax: Int? = null,
	val dmin: Int? = null,
	val dmax: Int? = null,
	val gmin: Int? = null,
	val gmax: Int? = null,
	@SerialName("country[]")
	val country: List<String>? = null,
	@SerialName("not_country[]")
	val notCountry: List<String>? = null,
)

@Serializable
data class CategoryFortniteResponse(
	val items: List<JsonObject>? = null,
	val totalItems: Long? = null,
	val totalItemsPrice: JsonElement? = null,
	val hasNextPage: Boolean? = null,
	val perPage: Long? = null,
	val page: Long? = null,
	val wasCached: Boolean? = null,
	val cacheTTL: Long? = null,
	val lastModified: Long? = null,
	val serverTime: Long? = null,
	val searchUrl: String? = null,
	val stickyItems: List<JsonElement>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class CategoryMihoyoParams(
	val page: Int? = null,
	val pmin: Int? = null,
	val pmax: Int? = null,
	val title: String? = null,
	@SerialName("order_by")
	val orderBy: String? = null,
	@SerialName("tag_id[]")
	val tagId: List<Int>? = null,
	@SerialName("not_tag_id[]")
	val notTagId: List<Int>? = null,
	@SerialName("public_tag_id[]")
	val publicTagId: List<Int>? = null,
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Int>? = null,
	@SerialName("origin[]")
	val origin: JsonElement? = null,
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
	@SerialName("user_id")
	val userId: Int? = null,
	val nsb: Boolean? = null,
	val sb: Boolean? = null,
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
	val currency: String? = null,
	@SerialName("email_login_data")
	val emailLoginData: Boolean? = null,
	@SerialName("email_provider[]")
	val emailProvider: JsonElement? = null,
	@SerialName("not_email_provider[]")
	val notEmailProvider: String? = null,
	@SerialName("email_type[]")
	val emailType: JsonElement? = null,
	@SerialName("parse_same_item_ids")
	val parseSameItemIds: Boolean? = null,
	@SerialName("item_domain")
	val itemDomain: String? = null,
	val email: String? = null,
	val ea: String? = null,
	val region: JsonElement? = null,
	@SerialName("not_region")
	val notRegion: JsonElement? = null,
	@SerialName("genshin_character[]")
	val genshinCharacter: JsonElement? = null,
	@SerialName("genshin_character_constellations")
	val genshinCharacterConstellations: JsonObject? = null,
	@SerialName("genshin_character_constellations_max")
	val genshinCharacterConstellationsMax: JsonObject? = null,
	@SerialName("genshin_weapon[]")
	val genshinWeapon: JsonElement? = null,
	@SerialName("genshin_char_min")
	val genshinCharMin: Int? = null,
	@SerialName("genshin_char_max")
	val genshinCharMax: Int? = null,
	@SerialName("genshin_legendary_min")
	val genshinLegendaryMin: Int? = null,
	@SerialName("genshin_legendary_max")
	val genshinLegendaryMax: Int? = null,
	@SerialName("genshin_level_min")
	val genshinLevelMin: Int? = null,
	@SerialName("genshin_level_max")
	val genshinLevelMax: Int? = null,
	@SerialName("genshin_legendary_weapon_min")
	val genshinLegendaryWeaponMin: Int? = null,
	@SerialName("genshin_legendary_weapon_max")
	val genshinLegendaryWeaponMax: Int? = null,
	@SerialName("constellations_min")
	val constellationsMin: Int? = null,
	@SerialName("constellations_max")
	val constellationsMax: Int? = null,
	@SerialName("genshin_achievement_min")
	val genshinAchievementMin: Int? = null,
	@SerialName("genshin_achievement_max")
	val genshinAchievementMax: Int? = null,
	@SerialName("genshin_currency_min")
	val genshinCurrencyMin: Int? = null,
	@SerialName("genshin_currency_max")
	val genshinCurrencyMax: Int? = null,
	@SerialName("honkai_character[]")
	val honkaiCharacter: JsonElement? = null,
	@SerialName("honkai_character_eidolons")
	val honkaiCharacterEidolons: JsonObject? = null,
	@SerialName("honkai_character_eidolons_max")
	val honkaiCharacterEidolonsMax: JsonObject? = null,
	@SerialName("honkai_weapon[]")
	val honkaiWeapon: JsonElement? = null,
	@SerialName("honkai_char_min")
	val honkaiCharMin: Int? = null,
	@SerialName("honkai_char_max")
	val honkaiCharMax: Int? = null,
	@SerialName("honkai_legendary_min")
	val honkaiLegendaryMin: Int? = null,
	@SerialName("honkai_legendary_max")
	val honkaiLegendaryMax: Int? = null,
	@SerialName("honkai_level_min")
	val honkaiLevelMin: Int? = null,
	@SerialName("honkai_level_max")
	val honkaiLevelMax: Int? = null,
	@SerialName("honkai_legendary_weapon_min")
	val honkaiLegendaryWeaponMin: Int? = null,
	@SerialName("honkai_legendary_weapon_max")
	val honkaiLegendaryWeaponMax: Int? = null,
	@SerialName("eidolons_min")
	val eidolonsMin: Int? = null,
	@SerialName("eidolons_max")
	val eidolonsMax: Int? = null,
	@SerialName("honkai_achievement_min")
	val honkaiAchievementMin: Int? = null,
	@SerialName("honkai_achievement_max")
	val honkaiAchievementMax: Int? = null,
	@SerialName("honkai_currency_min")
	val honkaiCurrencyMin: Int? = null,
	@SerialName("honkai_currency_max")
	val honkaiCurrencyMax: Int? = null,
	@SerialName("zenless_character[]")
	val zenlessCharacter: JsonElement? = null,
	@SerialName("zenless_character_cinemas")
	val zenlessCharacterCinemas: JsonObject? = null,
	@SerialName("zenless_character_cinemas_max")
	val zenlessCharacterCinemasMax: JsonObject? = null,
	@SerialName("zenless_weapon[]")
	val zenlessWeapon: JsonElement? = null,
	@SerialName("zenless_legendary_min")
	val zenlessLegendaryMin: Int? = null,
	@SerialName("zenless_legendary_max")
	val zenlessLegendaryMax: Int? = null,
	@SerialName("cinemas_min")
	val cinemasMin: Int? = null,
	@SerialName("cinemas_max")
	val cinemasMax: Int? = null,
	@SerialName("zenless_legendary_weapon_min")
	val zenlessLegendaryWeaponMin: Int? = null,
	@SerialName("zenless_legendary_weapon_max")
	val zenlessLegendaryWeaponMax: Int? = null,
	@SerialName("zenless_char_min")
	val zenlessCharMin: Int? = null,
	@SerialName("zenless_char_max")
	val zenlessCharMax: Int? = null,
	@SerialName("zenless_level_min")
	val zenlessLevelMin: Int? = null,
	@SerialName("zenless_level_max")
	val zenlessLevelMax: Int? = null,
	@SerialName("zenless_achievement_min")
	val zenlessAchievementMin: Int? = null,
	@SerialName("zenless_achievement_max")
	val zenlessAchievementMax: Int? = null,
	@SerialName("zenless_currency_min")
	val zenlessCurrencyMin: Int? = null,
	@SerialName("zenless_currency_max")
	val zenlessCurrencyMax: Int? = null,
	val daybreak: Int? = null,
)

@Serializable
data class CategoryMihoyoResponse(
	val items: List<JsonObject>? = null,
	val totalItems: Long? = null,
	val totalItemsPrice: JsonElement? = null,
	val hasNextPage: Boolean? = null,
	val perPage: Long? = null,
	val page: Long? = null,
	val wasCached: Boolean? = null,
	val cacheTTL: Long? = null,
	val lastModified: Long? = null,
	val serverTime: Long? = null,
	val searchUrl: String? = null,
	val stickyItems: List<JsonElement>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class CategoryRiotParams(
	val page: Int? = null,
	val pmin: Int? = null,
	val pmax: Int? = null,
	val title: String? = null,
	@SerialName("order_by")
	val orderBy: String? = null,
	@SerialName("tag_id[]")
	val tagId: List<Int>? = null,
	@SerialName("not_tag_id[]")
	val notTagId: List<Int>? = null,
	@SerialName("public_tag_id[]")
	val publicTagId: List<Int>? = null,
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Int>? = null,
	@SerialName("origin[]")
	val origin: JsonElement? = null,
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
	@SerialName("user_id")
	val userId: Int? = null,
	val nsb: Boolean? = null,
	val sb: Boolean? = null,
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
	val currency: String? = null,
	@SerialName("email_login_data")
	val emailLoginData: Boolean? = null,
	@SerialName("email_provider[]")
	val emailProvider: JsonElement? = null,
	@SerialName("not_email_provider[]")
	val notEmailProvider: String? = null,
	@SerialName("parse_same_item_ids")
	val parseSameItemIds: Boolean? = null,
	@SerialName("email_type[]")
	val emailType: JsonElement? = null,
	@SerialName("item_domain")
	val itemDomain: String? = null,
	val rmin: Int? = null,
	val rmax: Int? = null,
	@SerialName("last_rmin")
	val lastRmin: Int? = null,
	@SerialName("last_rmax")
	val lastRmax: Int? = null,
	@SerialName("previous_rmin")
	val previousRmin: Int? = null,
	@SerialName("previous_rmax")
	val previousRmax: Int? = null,
	@SerialName("weaponSkin[]")
	val weaponSkin: List<String>? = null,
	@SerialName("buddy[]")
	val buddy: List<String>? = null,
	@SerialName("agent[]")
	val agent: List<String>? = null,
	@SerialName("champion[]")
	val champion: List<String>? = null,
	@SerialName("skin[]")
	val skin: List<String>? = null,
	@SerialName("country[]")
	val country: List<String>? = null,
	@SerialName("not_country[]")
	val notCountry: List<String>? = null,
	val daybreak: Int? = null,
	@SerialName("valorant_level_min")
	val valorantLevelMin: Int? = null,
	@SerialName("valorant_level_max")
	val valorantLevelMax: Int? = null,
	@SerialName("lol_level_min")
	val lolLevelMin: Int? = null,
	@SerialName("lol_level_max")
	val lolLevelMax: Int? = null,
	@SerialName("inv_min")
	val invMin: Int? = null,
	@SerialName("inv_max")
	val invMax: Int? = null,
	@SerialName("vp_min")
	val vpMin: Int? = null,
	@SerialName("vp_max")
	val vpMax: Int? = null,
	@SerialName("valorant_smin")
	val valorantSmin: Int? = null,
	@SerialName("valorant_smax")
	val valorantSmax: Int? = null,
	@SerialName("valorant_rank_type[]")
	val valorantRankType: JsonElement? = null,
	val amin: Int? = null,
	val amax: Int? = null,
	@SerialName("valorant_region[]")
	val valorantRegion: List<String>? = null,
	@SerialName("valorant_not_region[]")
	val valorantNotRegion: List<String>? = null,
	@SerialName("lol_region[]")
	val lolRegion: List<String>? = null,
	@SerialName("lol_not_region[]")
	val lolNotRegion: List<String>? = null,
	val knife: Boolean? = null,
	@SerialName("lol_smin")
	val lolSmin: Int? = null,
	@SerialName("lol_smax")
	val lolSmax: Int? = null,
	@SerialName("champion_min")
	val championMin: Int? = null,
	@SerialName("champion_max")
	val championMax: Int? = null,
	@SerialName("win_rate_min")
	val winRateMin: Int? = null,
	@SerialName("win_rate_max")
	val winRateMax: Int? = null,
	@SerialName("blue_min")
	val blueMin: Int? = null,
	@SerialName("blue_max")
	val blueMax: Int? = null,
	@SerialName("orange_min")
	val orangeMin: Int? = null,
	@SerialName("orange_max")
	val orangeMax: Int? = null,
	@SerialName("mythic_min")
	val mythicMin: Int? = null,
	@SerialName("mythic_max")
	val mythicMax: Int? = null,
	@SerialName("riot_min")
	val riotMin: Int? = null,
	@SerialName("riot_max")
	val riotMax: Int? = null,
	val email: String? = null,
	val tel: String? = null,
	@SerialName("valorant_knife_min")
	val valorantKnifeMin: Int? = null,
	@SerialName("valorant_knife_max")
	val valorantKnifeMax: Int? = null,
	@SerialName("rp_min")
	val rpMin: Int? = null,
	@SerialName("rp_max")
	val rpMax: Int? = null,
	@SerialName("fa_min")
	val faMin: Int? = null,
	@SerialName("fa_max")
	val faMax: Int? = null,
	@SerialName("lol_rank[]")
	val lolRank: JsonElement? = null,
)

@Serializable
data class CategoryRiotResponse(
	val items: List<JsonObject>? = null,
	val totalItems: Long? = null,
	val totalItemsPrice: JsonElement? = null,
	val hasNextPage: Boolean? = null,
	val perPage: Long? = null,
	val page: Long? = null,
	val wasCached: Boolean? = null,
	val cacheTTL: Long? = null,
	val lastModified: Long? = null,
	val serverTime: Long? = null,
	val searchUrl: String? = null,
	val stickyItems: List<JsonElement>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class CategoryTelegramParams(
	val page: Int? = null,
	val pmin: Int? = null,
	val pmax: Int? = null,
	val title: String? = null,
	@SerialName("order_by")
	val orderBy: String? = null,
	@SerialName("tag_id[]")
	val tagId: List<Int>? = null,
	@SerialName("not_tag_id[]")
	val notTagId: List<Int>? = null,
	@SerialName("public_tag_id[]")
	val publicTagId: List<Int>? = null,
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Int>? = null,
	@SerialName("origin[]")
	val origin: JsonElement? = null,
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
	@SerialName("user_id")
	val userId: Int? = null,
	val nsb: Boolean? = null,
	val sb: Boolean? = null,
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
	val currency: String? = null,
	@SerialName("email_login_data")
	val emailLoginData: Boolean? = null,
	@SerialName("email_provider[]")
	val emailProvider: JsonElement? = null,
	@SerialName("not_email_provider[]")
	val notEmailProvider: String? = null,
	@SerialName("parse_same_item_ids")
	val parseSameItemIds: Boolean? = null,
	val spam: String? = null,
	val password: String? = null,
	val premium: String? = null,
	@SerialName("premium_expiration")
	val premiumExpiration: Int? = null,
	@SerialName("premium_expiration_period")
	val premiumExpirationPeriod: String? = null,
	@SerialName("country[]")
	val country: List<String>? = null,
	@SerialName("not_country[]")
	val notCountry: List<String>? = null,
	val daybreak: Int? = null,
	@SerialName("min_channels")
	val minChannels: Int? = null,
	@SerialName("max_channels")
	val maxChannels: Int? = null,
	@SerialName("min_chats")
	val minChats: Int? = null,
	@SerialName("max_chats")
	val maxChats: Int? = null,
	@SerialName("min_conversations")
	val minConversations: Int? = null,
	@SerialName("max_conversations")
	val maxConversations: Int? = null,
	@SerialName("min_admin")
	val minAdmin: Int? = null,
	@SerialName("max_admin")
	val maxAdmin: Int? = null,
	@SerialName("min_admin_sub")
	val minAdminSub: Int? = null,
	@SerialName("max_admin_sub")
	val maxAdminSub: Int? = null,
	@SerialName("dig_min")
	val digMin: Int? = null,
	@SerialName("dig_max")
	val digMax: Int? = null,
	@SerialName("min_contacts")
	val minContacts: Int? = null,
	@SerialName("max_contacts")
	val maxContacts: Int? = null,
	@SerialName("min_stars")
	val minStars: Int? = null,
	@SerialName("max_stars")
	val maxStars: Int? = null,
	val birthday: Int? = null,
	@SerialName("birthday_period")
	val birthdayPeriod: String? = null,
	@SerialName("birthday_after")
	val birthdayAfter: Int? = null,
	@SerialName("birthday_after_period")
	val birthdayAfterPeriod: String? = null,
	@SerialName("min_id")
	val minId: Int? = null,
	@SerialName("max_id")
	val maxId: Int? = null,
	@SerialName("allow_geo_spamblock")
	val allowGeoSpamblock: Boolean? = null,
	@SerialName("min_gifts")
	val minGifts: Int? = null,
	@SerialName("max_gifts")
	val maxGifts: Int? = null,
	@SerialName("min_nft_gifts")
	val minNftGifts: Int? = null,
	@SerialName("max_nft_gifts")
	val maxNftGifts: Int? = null,
	@SerialName("min_gifts_stars")
	val minGiftsStars: Int? = null,
	@SerialName("max_gifts_stars")
	val maxGiftsStars: Int? = null,
	@SerialName("min_gifts_convert_stars")
	val minGiftsConvertStars: Int? = null,
	@SerialName("max_gifts_convert_stars")
	val maxGiftsConvertStars: Int? = null,
	@SerialName("dc_id[]")
	val dcId: List<Int>? = null,
	@SerialName("not_dc_id[]")
	val notDcId: List<Int>? = null,
	val email: String? = null,
	@SerialName("min_bots")
	val minBots: Int? = null,
	@SerialName("max_bots")
	val maxBots: Int? = null,
	@SerialName("min_bot_active_users")
	val minBotActiveUsers: Int? = null,
	@SerialName("max_bot_active_users")
	val maxBotActiveUsers: Int? = null,
)

@Serializable
data class CategoryTelegramResponse(
	val items: List<JsonObject>? = null,
	val totalItems: Long? = null,
	val totalItemsPrice: JsonElement? = null,
	val hasNextPage: Boolean? = null,
	val perPage: Long? = null,
	val page: Long? = null,
	val wasCached: Boolean? = null,
	val cacheTTL: Long? = null,
	val lastModified: Long? = null,
	val serverTime: Long? = null,
	val searchUrl: String? = null,
	val stickyItems: List<JsonElement>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class CategorySupercellParams(
	val page: Int? = null,
	val pmin: Int? = null,
	val pmax: Int? = null,
	val title: String? = null,
	@SerialName("order_by")
	val orderBy: String? = null,
	@SerialName("tag_id[]")
	val tagId: List<Int>? = null,
	@SerialName("not_tag_id[]")
	val notTagId: List<Int>? = null,
	@SerialName("public_tag_id[]")
	val publicTagId: List<Int>? = null,
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Int>? = null,
	@SerialName("origin[]")
	val origin: JsonElement? = null,
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
	@SerialName("user_id")
	val userId: Int? = null,
	val nsb: Boolean? = null,
	val sb: Boolean? = null,
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
	val currency: String? = null,
	@SerialName("email_login_data")
	val emailLoginData: Boolean? = null,
	@SerialName("email_provider[]")
	val emailProvider: JsonElement? = null,
	@SerialName("not_email_provider[]")
	val notEmailProvider: String? = null,
	@SerialName("parse_same_item_ids")
	val parseSameItemIds: Boolean? = null,
	val daybreak: Int? = null,
	@SerialName("email_type[]")
	val emailType: JsonElement? = null,
	@SerialName("item_domain")
	val itemDomain: String? = null,
	val eg: JsonElement? = null,
	val tel: String? = null,
	@SerialName("brawl_level_min")
	val brawlLevelMin: Int? = null,
	@SerialName("brawl_level_max")
	val brawlLevelMax: Int? = null,
	@SerialName("brawl_cup_min")
	val brawlCupMin: Int? = null,
	@SerialName("brawl_cup_max")
	val brawlCupMax: Int? = null,
	@SerialName("brawl_wins_min")
	val brawlWinsMin: Int? = null,
	@SerialName("brawl_wins_max")
	val brawlWinsMax: Int? = null,
	@SerialName("brawl_pass")
	val brawlPass: String? = null,
	@SerialName("brawler[]")
	val brawler: JsonElement? = null,
	@SerialName("brawlers_min")
	val brawlersMin: Int? = null,
	@SerialName("brawlers_max")
	val brawlersMax: Int? = null,
	@SerialName("legendary_brawlers_min")
	val legendaryBrawlersMin: Int? = null,
	@SerialName("legendary_brawlers_max")
	val legendaryBrawlersMax: Int? = null,
	@SerialName("royale_level_min")
	val royaleLevelMin: Int? = null,
	@SerialName("royale_level_max")
	val royaleLevelMax: Int? = null,
	@SerialName("royale_cup_min")
	val royaleCupMin: Int? = null,
	@SerialName("royale_cup_max")
	val royaleCupMax: Int? = null,
	@SerialName("royale_wins_min")
	val royaleWinsMin: Int? = null,
	@SerialName("royale_wins_max")
	val royaleWinsMax: Int? = null,
	@SerialName("king_level_min")
	val kingLevelMin: Int? = null,
	@SerialName("king_level_max")
	val kingLevelMax: Int? = null,
	@SerialName("royale_pass")
	val royalePass: String? = null,
	@SerialName("clash_level_min")
	val clashLevelMin: Int? = null,
	@SerialName("clash_level_max")
	val clashLevelMax: Int? = null,
	@SerialName("clash_cup_min")
	val clashCupMin: Int? = null,
	@SerialName("clash_cup_max")
	val clashCupMax: Int? = null,
	@SerialName("clash_wins_min")
	val clashWinsMin: Int? = null,
	@SerialName("clash_wins_max")
	val clashWinsMax: Int? = null,
	@SerialName("clash_pass")
	val clashPass: String? = null,
	@SerialName("total_heroes_level_min")
	val totalHeroesLevelMin: Int? = null,
	@SerialName("total_heroes_level_max")
	val totalHeroesLevelMax: Int? = null,
	@SerialName("total_troops_level_min")
	val totalTroopsLevelMin: Int? = null,
	@SerialName("total_troops_level_max")
	val totalTroopsLevelMax: Int? = null,
	@SerialName("total_spells_level_min")
	val totalSpellsLevelMin: Int? = null,
	@SerialName("total_spells_level_max")
	val totalSpellsLevelMax: Int? = null,
	@SerialName("total_builder_heroes_level_min")
	val totalBuilderHeroesLevelMin: Int? = null,
	@SerialName("total_builder_heroes_level_max")
	val totalBuilderHeroesLevelMax: Int? = null,
	@SerialName("total_builder_troops_level_min")
	val totalBuilderTroopsLevelMin: Int? = null,
	@SerialName("total_builder_troops_level_max")
	val totalBuilderTroopsLevelMax: Int? = null,
	@SerialName("town_hall_level_min")
	val townHallLevelMin: Int? = null,
	@SerialName("town_hall_level_max")
	val townHallLevelMax: Int? = null,
	@SerialName("builder_hall_level_min")
	val builderHallLevelMin: Int? = null,
	@SerialName("builder_hall_level_max")
	val builderHallLevelMax: Int? = null,
	@SerialName("builder_hall_cup_min")
	val builderHallCupMin: Int? = null,
	@SerialName("builder_hall_cup_max")
	val builderHallCupMax: Int? = null,
	@SerialName("creation_year_min")
	val creationYearMin: Int? = null,
	@SerialName("creation_year_max")
	val creationYearMax: Int? = null,
)

@Serializable
data class CategorySupercellResponse(
	val items: List<JsonObject>? = null,
	val totalItems: Long? = null,
	val totalItemsPrice: JsonElement? = null,
	val hasNextPage: Boolean? = null,
	val perPage: Long? = null,
	val page: Long? = null,
	val wasCached: Boolean? = null,
	val cacheTTL: Long? = null,
	val lastModified: Long? = null,
	val serverTime: Long? = null,
	val searchUrl: String? = null,
	val stickyItems: List<JsonElement>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class CategoryEaParams(
	val page: Int? = null,
	val pmin: Int? = null,
	val pmax: Int? = null,
	val title: String? = null,
	@SerialName("order_by")
	val orderBy: String? = null,
	@SerialName("tag_id[]")
	val tagId: List<Int>? = null,
	@SerialName("not_tag_id[]")
	val notTagId: List<Int>? = null,
	@SerialName("public_tag_id[]")
	val publicTagId: List<Int>? = null,
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Int>? = null,
	@SerialName("origin[]")
	val origin: JsonElement? = null,
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
	@SerialName("user_id")
	val userId: Int? = null,
	val nsb: Boolean? = null,
	val sb: Boolean? = null,
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
	val currency: String? = null,
	@SerialName("email_login_data")
	val emailLoginData: Boolean? = null,
	@SerialName("email_provider[]")
	val emailProvider: JsonElement? = null,
	@SerialName("not_email_provider[]")
	val notEmailProvider: String? = null,
	@SerialName("parse_same_item_ids")
	val parseSameItemIds: Boolean? = null,
	@SerialName("email_type[]")
	val emailType: JsonElement? = null,
	@SerialName("item_domain")
	val itemDomain: String? = null,
	@SerialName("game[]")
	val game: List<String>? = null,
	@SerialName("country[]")
	val country: List<String>? = null,
	@SerialName("not_country[]")
	val notCountry: List<String>? = null,
	val gmin: Int? = null,
	val gmax: Int? = null,
	@SerialName("al_rank_min")
	val alRankMin: Int? = null,
	@SerialName("al_rank_max")
	val alRankMax: Int? = null,
	@SerialName("al_level_min")
	val alLevelMin: Int? = null,
	@SerialName("al_level_max")
	val alLevelMax: Int? = null,
	@SerialName("has_ban")
	val hasBan: String? = null,
	@SerialName("xbox_connected")
	val xboxConnected: String? = null,
	@SerialName("steam_connected")
	val steamConnected: String? = null,
	@SerialName("psn_connected")
	val psnConnected: String? = null,
	val subscription: String? = null,
	@SerialName("subscription_length")
	val subscriptionLength: Int? = null,
	@SerialName("subscription_period")
	val subscriptionPeriod: String? = null,
	@SerialName("hours_played")
	val hoursPlayed: JsonObject? = null,
	@SerialName("hours_played_max")
	val hoursPlayedMax: JsonObject? = null,
	val transactions: String? = null,
)

@Serializable
data class CategoryEaResponse(
	val items: List<JsonObject>? = null,
	val totalItems: Long? = null,
	val totalItemsPrice: JsonElement? = null,
	val hasNextPage: Boolean? = null,
	val perPage: Long? = null,
	val page: Long? = null,
	val wasCached: Boolean? = null,
	val cacheTTL: Long? = null,
	val lastModified: Long? = null,
	val serverTime: Long? = null,
	val searchUrl: String? = null,
	val stickyItems: List<JsonElement>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class CategoryWotParams(
	val page: Int? = null,
	val pmin: Int? = null,
	val pmax: Int? = null,
	val title: String? = null,
	@SerialName("order_by")
	val orderBy: String? = null,
	@SerialName("tag_id[]")
	val tagId: List<Int>? = null,
	@SerialName("not_tag_id[]")
	val notTagId: List<Int>? = null,
	@SerialName("public_tag_id[]")
	val publicTagId: List<Int>? = null,
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Int>? = null,
	@SerialName("origin[]")
	val origin: JsonElement? = null,
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
	@SerialName("user_id")
	val userId: Int? = null,
	val nsb: Boolean? = null,
	val sb: Boolean? = null,
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
	val currency: String? = null,
	@SerialName("email_login_data")
	val emailLoginData: Boolean? = null,
	@SerialName("email_provider[]")
	val emailProvider: JsonElement? = null,
	@SerialName("not_email_provider[]")
	val notEmailProvider: String? = null,
	@SerialName("parse_same_item_ids")
	val parseSameItemIds: Boolean? = null,
	@SerialName("email_type[]")
	val emailType: JsonElement? = null,
	@SerialName("item_domain")
	val itemDomain: String? = null,
	val tel: String? = null,
	val daybreak: Int? = null,
	@SerialName("battles_min")
	val battlesMin: Int? = null,
	@SerialName("battles_max")
	val battlesMax: Int? = null,
	@SerialName("gold_min")
	val goldMin: Int? = null,
	@SerialName("gold_max")
	val goldMax: Int? = null,
	@SerialName("silver_min")
	val silverMin: Int? = null,
	@SerialName("silver_max")
	val silverMax: Int? = null,
	@SerialName("top_min")
	val topMin: Int? = null,
	@SerialName("top_max")
	val topMax: Int? = null,
	@SerialName("prem_min")
	val premMin: Int? = null,
	@SerialName("prem_max")
	val premMax: Int? = null,
	@SerialName("top_prem_min")
	val topPremMin: Int? = null,
	@SerialName("top_prem_max")
	val topPremMax: Int? = null,
	@SerialName("win_pmin")
	val winPmin: Int? = null,
	@SerialName("win_pmax")
	val winPmax: Int? = null,
	@SerialName("tank[]")
	val tank: List<Int>? = null,
	@SerialName("region[]")
	val region: JsonElement? = null,
	@SerialName("not_region[]")
	val notRegion: JsonElement? = null,
	val premium: String? = null,
	@SerialName("premium_expiration")
	val premiumExpiration: Int? = null,
	@SerialName("premium_expiration_period")
	val premiumExpirationPeriod: String? = null,
	val clan: String? = null,
	@SerialName("clan_role[]")
	val clanRole: JsonElement? = null,
	@SerialName("not_clan_role[]")
	val notClanRole: JsonElement? = null,
	@SerialName("clan_gold_min")
	val clanGoldMin: Int? = null,
	@SerialName("clan_gold_max")
	val clanGoldMax: Int? = null,
	@SerialName("clan_credits_min")
	val clanCreditsMin: Int? = null,
	@SerialName("clan_credits_max")
	val clanCreditsMax: Int? = null,
	@SerialName("clan_crystal_min")
	val clanCrystalMin: Int? = null,
	@SerialName("clan_crystal_max")
	val clanCrystalMax: Int? = null,
	@SerialName("country[]")
	val country: List<String>? = null,
	@SerialName("not_country[]")
	val notCountry: List<String>? = null,
)

@Serializable
data class CategoryWotResponse(
	val items: List<JsonObject>? = null,
	val totalItems: Long? = null,
	val totalItemsPrice: JsonElement? = null,
	val hasNextPage: Boolean? = null,
	val perPage: Long? = null,
	val page: Long? = null,
	val wasCached: Boolean? = null,
	val cacheTTL: Long? = null,
	val lastModified: Long? = null,
	val serverTime: Long? = null,
	val searchUrl: String? = null,
	val stickyItems: List<JsonElement>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class CategoryWotBlitzParams(
	val page: Int? = null,
	val pmin: Int? = null,
	val pmax: Int? = null,
	val title: String? = null,
	@SerialName("order_by")
	val orderBy: String? = null,
	@SerialName("tag_id[]")
	val tagId: List<Int>? = null,
	@SerialName("not_tag_id[]")
	val notTagId: List<Int>? = null,
	@SerialName("public_tag_id[]")
	val publicTagId: List<Int>? = null,
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Int>? = null,
	@SerialName("origin[]")
	val origin: JsonElement? = null,
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
	@SerialName("user_id")
	val userId: Int? = null,
	val nsb: Boolean? = null,
	val sb: Boolean? = null,
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
	val currency: String? = null,
	@SerialName("email_login_data")
	val emailLoginData: Boolean? = null,
	@SerialName("email_provider[]")
	val emailProvider: JsonElement? = null,
	@SerialName("not_email_provider[]")
	val notEmailProvider: String? = null,
	@SerialName("parse_same_item_ids")
	val parseSameItemIds: Boolean? = null,
	@SerialName("email_type[]")
	val emailType: JsonElement? = null,
	@SerialName("item_domain")
	val itemDomain: String? = null,
	val tel: String? = null,
	val daybreak: Int? = null,
	@SerialName("battles_min")
	val battlesMin: Int? = null,
	@SerialName("battles_max")
	val battlesMax: Int? = null,
	@SerialName("gold_min")
	val goldMin: Int? = null,
	@SerialName("gold_max")
	val goldMax: Int? = null,
	@SerialName("silver_min")
	val silverMin: Int? = null,
	@SerialName("silver_max")
	val silverMax: Int? = null,
	@SerialName("top_min")
	val topMin: Int? = null,
	@SerialName("top_max")
	val topMax: Int? = null,
	@SerialName("prem_min")
	val premMin: Int? = null,
	@SerialName("prem_max")
	val premMax: Int? = null,
	@SerialName("top_prem_min")
	val topPremMin: Int? = null,
	@SerialName("top_prem_max")
	val topPremMax: Int? = null,
	@SerialName("win_pmin")
	val winPmin: Int? = null,
	@SerialName("win_pmax")
	val winPmax: Int? = null,
	@SerialName("tank[]")
	val tank: List<Int>? = null,
	@SerialName("region[]")
	val region: JsonElement? = null,
	@SerialName("not_region[]")
	val notRegion: JsonElement? = null,
	val premium: String? = null,
	@SerialName("premium_expiration")
	val premiumExpiration: Int? = null,
	@SerialName("premium_expiration_period")
	val premiumExpirationPeriod: String? = null,
	val clan: String? = null,
	@SerialName("clan_role[]")
	val clanRole: JsonElement? = null,
	@SerialName("not_clan_role[]")
	val notClanRole: JsonElement? = null,
	@SerialName("clan_gold_min")
	val clanGoldMin: Int? = null,
	@SerialName("clan_gold_max")
	val clanGoldMax: Int? = null,
	@SerialName("clan_credits_min")
	val clanCreditsMin: Int? = null,
	@SerialName("clan_credits_max")
	val clanCreditsMax: Int? = null,
	@SerialName("clan_crystal_min")
	val clanCrystalMin: Int? = null,
	@SerialName("clan_crystal_max")
	val clanCrystalMax: Int? = null,
	@SerialName("country[]")
	val country: List<String>? = null,
	@SerialName("not_country[]")
	val notCountry: List<String>? = null,
)

@Serializable
data class CategoryWotBlitzResponse(
	val items: List<JsonObject>? = null,
	val totalItems: Long? = null,
	val totalItemsPrice: JsonElement? = null,
	val hasNextPage: Boolean? = null,
	val perPage: Long? = null,
	val page: Long? = null,
	val wasCached: Boolean? = null,
	val cacheTTL: Long? = null,
	val lastModified: Long? = null,
	val serverTime: Long? = null,
	val searchUrl: String? = null,
	val stickyItems: List<JsonElement>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class CategoryGiftsParams(
	val page: Int? = null,
	val pmin: Int? = null,
	val pmax: Int? = null,
	val title: String? = null,
	@SerialName("order_by")
	val orderBy: String? = null,
	@SerialName("tag_id[]")
	val tagId: List<Int>? = null,
	@SerialName("not_tag_id[]")
	val notTagId: List<Int>? = null,
	@SerialName("public_tag_id[]")
	val publicTagId: List<Int>? = null,
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Int>? = null,
	@SerialName("origin[]")
	val origin: JsonElement? = null,
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
	@SerialName("user_id")
	val userId: Int? = null,
	val nsb: Boolean? = null,
	val sb: Boolean? = null,
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
	val currency: String? = null,
	@SerialName("email_login_data")
	val emailLoginData: Boolean? = null,
	@SerialName("email_provider[]")
	val emailProvider: JsonElement? = null,
	@SerialName("not_email_provider[]")
	val notEmailProvider: String? = null,
	@SerialName("parse_same_item_ids")
	val parseSameItemIds: Boolean? = null,
	val subscription: String? = null,
	@SerialName("subscription_length")
	val subscriptionLength: Int? = null,
	@SerialName("subscription_period")
	val subscriptionPeriod: String? = null,
)

@Serializable
data class CategoryGiftsResponse(
	val items: List<JsonObject>? = null,
	val totalItems: Long? = null,
	val totalItemsPrice: JsonElement? = null,
	val hasNextPage: Boolean? = null,
	val perPage: Long? = null,
	val page: Long? = null,
	val wasCached: Boolean? = null,
	val cacheTTL: Long? = null,
	val lastModified: Long? = null,
	val serverTime: Long? = null,
	val searchUrl: String? = null,
	val stickyItems: List<JsonElement>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class CategoryEpicGamesParams(
	val page: Int? = null,
	val pmin: Int? = null,
	val pmax: Int? = null,
	val title: String? = null,
	@SerialName("order_by")
	val orderBy: String? = null,
	@SerialName("tag_id[]")
	val tagId: List<Int>? = null,
	@SerialName("not_tag_id[]")
	val notTagId: List<Int>? = null,
	@SerialName("public_tag_id[]")
	val publicTagId: List<Int>? = null,
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Int>? = null,
	@SerialName("origin[]")
	val origin: JsonElement? = null,
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
	@SerialName("user_id")
	val userId: Int? = null,
	val nsb: Boolean? = null,
	val sb: Boolean? = null,
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
	val currency: String? = null,
	@SerialName("email_login_data")
	val emailLoginData: Boolean? = null,
	@SerialName("email_provider[]")
	val emailProvider: JsonElement? = null,
	@SerialName("not_email_provider[]")
	val notEmailProvider: String? = null,
	@SerialName("parse_same_item_ids")
	val parseSameItemIds: Boolean? = null,
	@SerialName("email_type[]")
	val emailType: JsonElement? = null,
	@SerialName("item_domain")
	val itemDomain: String? = null,
	val eg: JsonElement? = null,
	@SerialName("game[]")
	val game: List<String>? = null,
	@SerialName("change_email")
	val changeEmail: String? = null,
	@SerialName("rl_purchases")
	val rlPurchases: Boolean? = null,
	@SerialName("balance_min")
	val balanceMin: Double? = null,
	@SerialName("balance_max")
	val balanceMax: Double? = null,
	@SerialName("rewards_balance_min")
	val rewardsBalanceMin: Double? = null,
	@SerialName("rewards_balance_max")
	val rewardsBalanceMax: Double? = null,
	val gmin: Int? = null,
	val gmax: Int? = null,
	@SerialName("country[]")
	val country: List<String>? = null,
	@SerialName("not_country[]")
	val notCountry: List<String>? = null,
	val daybreak: Int? = null,
	@SerialName("hours_played")
	val hoursPlayed: JsonObject? = null,
	@SerialName("hours_played_max")
	val hoursPlayedMax: JsonObject? = null,
)

@Serializable
data class CategoryEpicGamesResponse(
	val items: List<JsonObject>? = null,
	val totalItems: Long? = null,
	val totalItemsPrice: JsonElement? = null,
	val hasNextPage: Boolean? = null,
	val perPage: Long? = null,
	val page: Long? = null,
	val wasCached: Boolean? = null,
	val cacheTTL: Long? = null,
	val lastModified: Long? = null,
	val serverTime: Long? = null,
	val searchUrl: String? = null,
	val stickyItems: List<JsonElement>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class CategoryEscapeFromTarkovParams(
	val page: Int? = null,
	val pmin: Int? = null,
	val pmax: Int? = null,
	val title: String? = null,
	@SerialName("order_by")
	val orderBy: String? = null,
	@SerialName("tag_id[]")
	val tagId: List<Int>? = null,
	@SerialName("not_tag_id[]")
	val notTagId: List<Int>? = null,
	@SerialName("public_tag_id[]")
	val publicTagId: List<Int>? = null,
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Int>? = null,
	@SerialName("origin[]")
	val origin: JsonElement? = null,
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
	@SerialName("user_id")
	val userId: Int? = null,
	val nsb: Boolean? = null,
	val sb: Boolean? = null,
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
	val currency: String? = null,
	@SerialName("email_login_data")
	val emailLoginData: Boolean? = null,
	@SerialName("email_provider[]")
	val emailProvider: JsonElement? = null,
	@SerialName("not_email_provider[]")
	val notEmailProvider: String? = null,
	@SerialName("parse_same_item_ids")
	val parseSameItemIds: Boolean? = null,
	@SerialName("email_type[]")
	val emailType: JsonElement? = null,
	@SerialName("item_domain")
	val itemDomain: String? = null,
	val region: String? = null,
	@SerialName("version[]")
	val version: JsonElement? = null,
	val reg: Int? = null,
	@SerialName("reg_period")
	val regPeriod: String? = null,
	@SerialName("level_min")
	val levelMin: Int? = null,
	@SerialName("level_max")
	val levelMax: Int? = null,
	val pve: String? = null,
	val side: String? = null,
)

@Serializable
data class CategoryEscapeFromTarkovResponse(
	val items: List<JsonObject>? = null,
	val totalItems: Long? = null,
	val totalItemsPrice: JsonElement? = null,
	val hasNextPage: Boolean? = null,
	val perPage: Long? = null,
	val page: Long? = null,
	val wasCached: Boolean? = null,
	val cacheTTL: Long? = null,
	val lastModified: Long? = null,
	val serverTime: Long? = null,
	val searchUrl: String? = null,
	val stickyItems: List<JsonElement>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class CategorySocialClubParams(
	val page: Int? = null,
	val pmin: Int? = null,
	val pmax: Int? = null,
	val title: String? = null,
	@SerialName("order_by")
	val orderBy: String? = null,
	@SerialName("tag_id[]")
	val tagId: List<Int>? = null,
	@SerialName("not_tag_id[]")
	val notTagId: List<Int>? = null,
	@SerialName("public_tag_id[]")
	val publicTagId: List<Int>? = null,
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Int>? = null,
	@SerialName("origin[]")
	val origin: JsonElement? = null,
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
	@SerialName("user_id")
	val userId: Int? = null,
	val nsb: Boolean? = null,
	val sb: Boolean? = null,
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
	val currency: String? = null,
	@SerialName("email_login_data")
	val emailLoginData: Boolean? = null,
	@SerialName("email_provider[]")
	val emailProvider: JsonElement? = null,
	@SerialName("not_email_provider[]")
	val notEmailProvider: String? = null,
	@SerialName("parse_same_item_ids")
	val parseSameItemIds: Boolean? = null,
	val daybreak: Int? = null,
	@SerialName("level_min")
	val levelMin: Int? = null,
	@SerialName("level_max")
	val levelMax: Int? = null,
	@SerialName("cash_min")
	val cashMin: Int? = null,
	@SerialName("cash_max")
	val cashMax: Int? = null,
	@SerialName("bank_cash_min")
	val bankCashMin: Int? = null,
	@SerialName("bank_cash_max")
	val bankCashMax: Int? = null,
	@SerialName("game[]")
	val game: List<String>? = null,
)

@Serializable
data class CategorySocialClubResponse(
	val items: List<JsonObject>? = null,
	val totalItems: Long? = null,
	val totalItemsPrice: JsonElement? = null,
	val hasNextPage: Boolean? = null,
	val perPage: Long? = null,
	val page: Long? = null,
	val wasCached: Boolean? = null,
	val cacheTTL: Long? = null,
	val lastModified: Long? = null,
	val serverTime: Long? = null,
	val searchUrl: String? = null,
	val stickyItems: List<JsonElement>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class CategoryUplayParams(
	val page: Int? = null,
	val pmin: Int? = null,
	val pmax: Int? = null,
	val title: String? = null,
	@SerialName("order_by")
	val orderBy: String? = null,
	@SerialName("tag_id[]")
	val tagId: List<Int>? = null,
	@SerialName("not_tag_id[]")
	val notTagId: List<Int>? = null,
	@SerialName("public_tag_id[]")
	val publicTagId: List<Int>? = null,
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Int>? = null,
	@SerialName("origin[]")
	val origin: JsonElement? = null,
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
	@SerialName("user_id")
	val userId: Int? = null,
	val nsb: Boolean? = null,
	val sb: Boolean? = null,
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
	val currency: String? = null,
	@SerialName("email_login_data")
	val emailLoginData: Boolean? = null,
	@SerialName("email_provider[]")
	val emailProvider: JsonElement? = null,
	@SerialName("not_email_provider[]")
	val notEmailProvider: String? = null,
	@SerialName("parse_same_item_ids")
	val parseSameItemIds: Boolean? = null,
	@SerialName("email_type[]")
	val emailType: JsonElement? = null,
	@SerialName("item_domain")
	val itemDomain: String? = null,
	@SerialName("game[]")
	val game: List<String>? = null,
	@SerialName("country[]")
	val country: List<String>? = null,
	@SerialName("not_country[]")
	val notCountry: List<String>? = null,
	val daybreak: Int? = null,
	val gmin: Int? = null,
	val gmax: Int? = null,
	val subscription: String? = null,
	@SerialName("subscription_length")
	val subscriptionLength: Int? = null,
	@SerialName("subscription_period")
	val subscriptionPeriod: String? = null,
	@SerialName("r6_level_min")
	val r6LevelMin: Int? = null,
	@SerialName("r6_level_max")
	val r6LevelMax: Int? = null,
	@SerialName("r6_rank_min")
	val r6RankMin: Int? = null,
	@SerialName("r6_rank_max")
	val r6RankMax: Int? = null,
	@SerialName("r6_operators_min")
	val r6OperatorsMin: Int? = null,
	@SerialName("r6_operators_max")
	val r6OperatorsMax: Int? = null,
	@SerialName("r6_ban")
	val r6Ban: String? = null,
	@SerialName("r6_smin")
	val r6Smin: Int? = null,
	@SerialName("r6_smax")
	val r6Smax: Int? = null,
	@SerialName("r6_skin[]")
	val r6Skin: List<String>? = null,
	@SerialName("r6_operator[]")
	val r6Operator: List<String>? = null,
	@SerialName("xbox_connected")
	val xboxConnected: String? = null,
	@SerialName("psn_connected")
	val psnConnected: String? = null,
	@SerialName("steam_connected")
	val steamConnected: String? = null,
	@SerialName("balance_min")
	val balanceMin: Double? = null,
	@SerialName("balance_max")
	val balanceMax: Double? = null,
	val transactions: String? = null,
	val reg: Int? = null,
	@SerialName("reg_period")
	val regPeriod: String? = null,
)

@Serializable
data class CategoryUplayResponse(
	val items: List<JsonObject>? = null,
	val totalItems: Long? = null,
	val totalItemsPrice: JsonElement? = null,
	val hasNextPage: Boolean? = null,
	val perPage: Long? = null,
	val page: Long? = null,
	val wasCached: Boolean? = null,
	val cacheTTL: Long? = null,
	val lastModified: Long? = null,
	val serverTime: Long? = null,
	val searchUrl: String? = null,
	val stickyItems: List<JsonElement>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class CategoryDiscordParams(
	val page: Int? = null,
	val pmin: Int? = null,
	val pmax: Int? = null,
	val title: String? = null,
	@SerialName("order_by")
	val orderBy: String? = null,
	@SerialName("tag_id[]")
	val tagId: List<Int>? = null,
	@SerialName("not_tag_id[]")
	val notTagId: List<Int>? = null,
	@SerialName("public_tag_id[]")
	val publicTagId: List<Int>? = null,
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Int>? = null,
	@SerialName("origin[]")
	val origin: JsonElement? = null,
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
	@SerialName("user_id")
	val userId: Int? = null,
	val nsb: Boolean? = null,
	val sb: Boolean? = null,
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
	val currency: String? = null,
	@SerialName("email_login_data")
	val emailLoginData: Boolean? = null,
	@SerialName("email_provider[]")
	val emailProvider: JsonElement? = null,
	@SerialName("not_email_provider[]")
	val notEmailProvider: String? = null,
	@SerialName("parse_same_item_ids")
	val parseSameItemIds: Boolean? = null,
	@SerialName("email_type[]")
	val emailType: JsonElement? = null,
	@SerialName("item_domain")
	val itemDomain: String? = null,
	val tel: String? = null,
	val nitro: String? = null,
	@SerialName("nitro_type[]")
	val nitroType: JsonElement? = null,
	@SerialName("nitro_length")
	val nitroLength: Int? = null,
	@SerialName("nitro_period")
	val nitroPeriod: String? = null,
	@SerialName("boosts_min")
	val boostsMin: Int? = null,
	@SerialName("boosts_max")
	val boostsMax: Int? = null,
	val billing: String? = null,
	val gifts: String? = null,
	val transactions: String? = null,
	@SerialName("badge[]")
	val badge: JsonElement? = null,
	@SerialName("condition[]")
	val condition: JsonElement? = null,
	@SerialName("chat_min")
	val chatMin: Int? = null,
	@SerialName("chat_max")
	val chatMax: Int? = null,
	@SerialName("min_admin_members")
	val minAdminMembers: Int? = null,
	@SerialName("max_admin_members")
	val maxAdminMembers: Int? = null,
	@SerialName("min_admin")
	val minAdmin: Int? = null,
	@SerialName("max_admin")
	val maxAdmin: Int? = null,
	val reg: Int? = null,
	@SerialName("reg_period")
	val regPeriod: String? = null,
	@SerialName("language[]")
	val language: List<String>? = null,
	@SerialName("not_language[]")
	val notLanguage: List<String>? = null,
	val clans: String? = null,
	@SerialName("min_admin_clans")
	val minAdminClans: Int? = null,
	@SerialName("max_admin_clans")
	val maxAdminClans: Int? = null,
	@SerialName("min_owner_clans")
	val minOwnerClans: Int? = null,
	@SerialName("max_owner_clans")
	val maxOwnerClans: Int? = null,
	@SerialName("country[]")
	val country: List<String>? = null,
	@SerialName("not_country[]")
	val notCountry: List<String>? = null,
	@SerialName("min_servers")
	val minServers: Int? = null,
	@SerialName("max_servers")
	val maxServers: Int? = null,
	@SerialName("2fa")
	val `2fa`: String? = null,
	@SerialName("min_full_credits")
	val minFullCredits: Int? = null,
	@SerialName("max_full_credits")
	val maxFullCredits: Int? = null,
	@SerialName("min_basic_credits")
	val minBasicCredits: Int? = null,
	@SerialName("max_basic_credits")
	val maxBasicCredits: Int? = null,
	@SerialName("min_orbs")
	val minOrbs: Int? = null,
	@SerialName("max_orbs")
	val maxOrbs: Int? = null,
)

@Serializable
data class CategoryDiscordResponse(
	val items: List<JsonObject>? = null,
	val totalItems: Long? = null,
	val totalItemsPrice: JsonElement? = null,
	val hasNextPage: Boolean? = null,
	val perPage: Long? = null,
	val page: Long? = null,
	val wasCached: Boolean? = null,
	val cacheTTL: Long? = null,
	val lastModified: Long? = null,
	val serverTime: Long? = null,
	val searchUrl: String? = null,
	val stickyItems: List<JsonElement>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class CategoryTikTokParams(
	val page: Int? = null,
	val pmin: Int? = null,
	val pmax: Int? = null,
	val title: String? = null,
	@SerialName("order_by")
	val orderBy: String? = null,
	@SerialName("tag_id[]")
	val tagId: List<Int>? = null,
	@SerialName("not_tag_id[]")
	val notTagId: List<Int>? = null,
	@SerialName("public_tag_id[]")
	val publicTagId: List<Int>? = null,
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Int>? = null,
	@SerialName("origin[]")
	val origin: JsonElement? = null,
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
	@SerialName("user_id")
	val userId: Int? = null,
	val nsb: Boolean? = null,
	val sb: Boolean? = null,
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
	val currency: String? = null,
	@SerialName("email_login_data")
	val emailLoginData: Boolean? = null,
	@SerialName("email_provider[]")
	val emailProvider: JsonElement? = null,
	@SerialName("not_email_provider[]")
	val notEmailProvider: String? = null,
	@SerialName("parse_same_item_ids")
	val parseSameItemIds: Boolean? = null,
	@SerialName("email_type[]")
	val emailType: JsonElement? = null,
	@SerialName("item_domain")
	val itemDomain: String? = null,
	val tel: String? = null,
	val reg: Int? = null,
	@SerialName("reg_period")
	val regPeriod: String? = null,
	@SerialName("followers_min")
	val followersMin: Int? = null,
	@SerialName("followers_max")
	val followersMax: Int? = null,
	@SerialName("post_min")
	val postMin: Int? = null,
	@SerialName("post_max")
	val postMax: Int? = null,
	@SerialName("like_min")
	val likeMin: Int? = null,
	@SerialName("like_max")
	val likeMax: Int? = null,
	@SerialName("coins_min")
	val coinsMin: Int? = null,
	@SerialName("coins_max")
	val coinsMax: Int? = null,
	@SerialName("cookie_login")
	val cookieLogin: String? = null,
	val verified: String? = null,
	val email: String? = null,
)

@Serializable
data class CategoryTikTokResponse(
	val items: List<JsonObject>? = null,
	val totalItems: Long? = null,
	val totalItemsPrice: JsonElement? = null,
	val hasNextPage: Boolean? = null,
	val perPage: Long? = null,
	val page: Long? = null,
	val wasCached: Boolean? = null,
	val cacheTTL: Long? = null,
	val lastModified: Long? = null,
	val serverTime: Long? = null,
	val searchUrl: String? = null,
	val stickyItems: List<JsonElement>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class CategoryInstagramParams(
	val page: Int? = null,
	val pmin: Int? = null,
	val pmax: Int? = null,
	val title: String? = null,
	@SerialName("order_by")
	val orderBy: String? = null,
	@SerialName("tag_id[]")
	val tagId: List<Int>? = null,
	@SerialName("not_tag_id[]")
	val notTagId: List<Int>? = null,
	@SerialName("public_tag_id[]")
	val publicTagId: List<Int>? = null,
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Int>? = null,
	@SerialName("origin[]")
	val origin: JsonElement? = null,
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
	@SerialName("user_id")
	val userId: Int? = null,
	val nsb: Boolean? = null,
	val sb: Boolean? = null,
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
	val currency: String? = null,
	@SerialName("email_login_data")
	val emailLoginData: Boolean? = null,
	@SerialName("email_provider[]")
	val emailProvider: JsonElement? = null,
	@SerialName("not_email_provider[]")
	val notEmailProvider: String? = null,
	@SerialName("parse_same_item_ids")
	val parseSameItemIds: Boolean? = null,
	@SerialName("email_type[]")
	val emailType: JsonElement? = null,
	@SerialName("item_domain")
	val itemDomain: String? = null,
	val tel: String? = null,
	@SerialName("country[]")
	val country: List<String>? = null,
	@SerialName("not_country[]")
	val notCountry: List<String>? = null,
	val cookies: String? = null,
	@SerialName("login_without_cookies")
	val loginWithoutCookies: String? = null,
	@SerialName("followers_min")
	val followersMin: Int? = null,
	@SerialName("followers_max")
	val followersMax: Int? = null,
	@SerialName("post_min")
	val postMin: Int? = null,
	@SerialName("post_max")
	val postMax: Int? = null,
	val reg: Int? = null,
	@SerialName("reg_period")
	val regPeriod: String? = null,
)

@Serializable
data class CategoryInstagramResponse(
	val items: List<JsonObject>? = null,
	val totalItems: Long? = null,
	val totalItemsPrice: JsonElement? = null,
	val hasNextPage: Boolean? = null,
	val perPage: Long? = null,
	val page: Long? = null,
	val wasCached: Boolean? = null,
	val cacheTTL: Long? = null,
	val lastModified: Long? = null,
	val serverTime: Long? = null,
	val searchUrl: String? = null,
	val stickyItems: List<JsonElement>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class CategoryBattleNetParams(
	val page: Int? = null,
	val pmin: Int? = null,
	val pmax: Int? = null,
	val title: String? = null,
	@SerialName("order_by")
	val orderBy: String? = null,
	@SerialName("tag_id[]")
	val tagId: List<Int>? = null,
	@SerialName("not_tag_id[]")
	val notTagId: List<Int>? = null,
	@SerialName("public_tag_id[]")
	val publicTagId: List<Int>? = null,
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Int>? = null,
	@SerialName("origin[]")
	val origin: JsonElement? = null,
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
	@SerialName("user_id")
	val userId: Int? = null,
	val nsb: Boolean? = null,
	val sb: Boolean? = null,
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
	val currency: String? = null,
	@SerialName("email_login_data")
	val emailLoginData: Boolean? = null,
	@SerialName("email_provider[]")
	val emailProvider: JsonElement? = null,
	@SerialName("not_email_provider[]")
	val notEmailProvider: String? = null,
	@SerialName("parse_same_item_ids")
	val parseSameItemIds: Boolean? = null,
	@SerialName("email_type[]")
	val emailType: JsonElement? = null,
	@SerialName("item_domain")
	val itemDomain: String? = null,
	val eg: JsonElement? = null,
	@SerialName("game[]")
	val game: List<Int>? = null,
	val daybreak: Int? = null,
	@SerialName("country[]")
	val country: List<String>? = null,
	@SerialName("not_country[]")
	val notCountry: List<String>? = null,
	val tel: String? = null,
	@SerialName("edit_btag")
	val editBtag: String? = null,
	@SerialName("changeable_fn")
	val changeableFn: String? = null,
	@SerialName("real_id")
	val realId: String? = null,
	@SerialName("parent_control")
	val parentControl: String? = null,
	@SerialName("no_bans")
	val noBans: String? = null,
	@SerialName("balance_min")
	val balanceMin: Int? = null,
	@SerialName("balance_max")
	val balanceMax: Int? = null,
)

@Serializable
data class CategoryBattleNetResponse(
	val items: List<JsonObject>? = null,
	val totalItems: Long? = null,
	val totalItemsPrice: JsonElement? = null,
	val hasNextPage: Boolean? = null,
	val perPage: Long? = null,
	val page: Long? = null,
	val wasCached: Boolean? = null,
	val cacheTTL: Long? = null,
	val lastModified: Long? = null,
	val serverTime: Long? = null,
	val searchUrl: String? = null,
	val stickyItems: List<JsonElement>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class CategoryChatGPTParams(
	val page: Int? = null,
	val pmin: Int? = null,
	val pmax: Int? = null,
	val title: String? = null,
	@SerialName("order_by")
	val orderBy: String? = null,
	@SerialName("tag_id[]")
	val tagId: List<Int>? = null,
	@SerialName("not_tag_id[]")
	val notTagId: List<Int>? = null,
	@SerialName("public_tag_id[]")
	val publicTagId: List<Int>? = null,
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Int>? = null,
	@SerialName("origin[]")
	val origin: JsonElement? = null,
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
	@SerialName("user_id")
	val userId: Int? = null,
	val nsb: Boolean? = null,
	val sb: Boolean? = null,
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
	val currency: String? = null,
	@SerialName("email_login_data")
	val emailLoginData: Boolean? = null,
	@SerialName("email_provider[]")
	val emailProvider: JsonElement? = null,
	@SerialName("not_email_provider[]")
	val notEmailProvider: String? = null,
	@SerialName("parse_same_item_ids")
	val parseSameItemIds: Boolean? = null,
	@SerialName("email_type[]")
	val emailType: JsonElement? = null,
	@SerialName("item_domain")
	val itemDomain: String? = null,
	@SerialName("subscription[]")
	val subscription: JsonElement? = null,
	@SerialName("subscription_length")
	val subscriptionLength: Int? = null,
	@SerialName("subscription_period")
	val subscriptionPeriod: String? = null,
	val autorenewal: String? = null,
	val tel: String? = null,
	val transactions: String? = null,
	val reg: Int? = null,
	@SerialName("reg_period")
	val regPeriod: String? = null,
	@SerialName("openai_tier[]")
	val openaiTier: JsonElement? = null,
	@SerialName("openai_balance_min")
	val openaiBalanceMin: Int? = null,
	@SerialName("openai_balance_max")
	val openaiBalanceMax: Int? = null,
)

@Serializable
data class CategoryChatGPTResponse(
	val items: List<JsonObject>? = null,
	val totalItems: Long? = null,
	val totalItemsPrice: JsonElement? = null,
	val hasNextPage: Boolean? = null,
	val perPage: Long? = null,
	val page: Long? = null,
	val wasCached: Boolean? = null,
	val cacheTTL: Long? = null,
	val lastModified: Long? = null,
	val serverTime: Long? = null,
	val searchUrl: String? = null,
	val stickyItems: List<JsonElement>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class CategoryVpnParams(
	val page: Int? = null,
	val pmin: Int? = null,
	val pmax: Int? = null,
	val title: String? = null,
	@SerialName("order_by")
	val orderBy: String? = null,
	@SerialName("tag_id[]")
	val tagId: List<Int>? = null,
	@SerialName("not_tag_id[]")
	val notTagId: List<Int>? = null,
	@SerialName("public_tag_id[]")
	val publicTagId: List<Int>? = null,
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Int>? = null,
	@SerialName("origin[]")
	val origin: JsonElement? = null,
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
	@SerialName("user_id")
	val userId: Int? = null,
	val nsb: Boolean? = null,
	val sb: Boolean? = null,
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
	val currency: String? = null,
	@SerialName("email_login_data")
	val emailLoginData: Boolean? = null,
	@SerialName("email_provider[]")
	val emailProvider: JsonElement? = null,
	@SerialName("not_email_provider[]")
	val notEmailProvider: String? = null,
	@SerialName("parse_same_item_ids")
	val parseSameItemIds: Boolean? = null,
	@SerialName("service[]")
	val service: JsonElement? = null,
	@SerialName("subscription_length")
	val subscriptionLength: Int? = null,
	@SerialName("subscription_period")
	val subscriptionPeriod: String? = null,
	val autorenewal: String? = null,
)

@Serializable
data class CategoryVpnResponse(
	val items: List<JsonObject>? = null,
	val totalItems: Long? = null,
	val totalItemsPrice: JsonElement? = null,
	val hasNextPage: Boolean? = null,
	val perPage: Long? = null,
	val page: Long? = null,
	val wasCached: Boolean? = null,
	val cacheTTL: Long? = null,
	val lastModified: Long? = null,
	val serverTime: Long? = null,
	val searchUrl: String? = null,
	val stickyItems: List<JsonElement>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class CategoryRobloxParams(
	val page: Int? = null,
	val pmin: Int? = null,
	val pmax: Int? = null,
	val title: String? = null,
	@SerialName("order_by")
	val orderBy: String? = null,
	@SerialName("tag_id[]")
	val tagId: List<Int>? = null,
	@SerialName("not_tag_id[]")
	val notTagId: List<Int>? = null,
	@SerialName("public_tag_id[]")
	val publicTagId: List<Int>? = null,
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Int>? = null,
	@SerialName("origin[]")
	val origin: JsonElement? = null,
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
	@SerialName("user_id")
	val userId: Int? = null,
	val nsb: Boolean? = null,
	val sb: Boolean? = null,
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
	val currency: String? = null,
	@SerialName("email_login_data")
	val emailLoginData: Boolean? = null,
	@SerialName("email_provider[]")
	val emailProvider: JsonElement? = null,
	@SerialName("not_email_provider[]")
	val notEmailProvider: String? = null,
	@SerialName("parse_same_item_ids")
	val parseSameItemIds: Boolean? = null,
	val email: String? = null,
	@SerialName("robux_min")
	val robuxMin: Int? = null,
	@SerialName("robux_max")
	val robuxMax: Int? = null,
	@SerialName("friends_min")
	val friendsMin: Int? = null,
	@SerialName("friends_max")
	val friendsMax: Int? = null,
	@SerialName("followers_min")
	val followersMin: Int? = null,
	@SerialName("followers_max")
	val followersMax: Int? = null,
	val country: List<String>? = null,
	@SerialName("not_country")
	val notCountry: List<String>? = null,
	val reg: Int? = null,
	@SerialName("reg_period")
	val regPeriod: String? = null,
	val subscription: String? = null,
	@SerialName("subscription_length")
	val subscriptionLength: Int? = null,
	@SerialName("subscription_period")
	val subscriptionPeriod: String? = null,
	val autorenewal: String? = null,
	@SerialName("xbox_connected")
	val xboxConnected: String? = null,
	@SerialName("psn_connected")
	val psnConnected: String? = null,
	val verified: String? = null,
	@SerialName("age_verified")
	val ageVerified: String? = null,
	@SerialName("incoming_robux_total_min")
	val incomingRobuxTotalMin: Int? = null,
	@SerialName("incoming_robux_total_max")
	val incomingRobuxTotalMax: Int? = null,
	@SerialName("limited_price_min")
	val limitedPriceMin: Int? = null,
	@SerialName("limited_price_max")
	val limitedPriceMax: Int? = null,
	@SerialName("gamepass_min")
	val gamepassMin: Int? = null,
	@SerialName("gamepass_max")
	val gamepassMax: Int? = null,
	@SerialName("game_donations")
	val gameDonations: String? = null,
	@SerialName("inv_min")
	val invMin: Int? = null,
	@SerialName("inv_max")
	val invMax: Int? = null,
	@SerialName("ugc_limited_price_min")
	val ugcLimitedPriceMin: Int? = null,
	@SerialName("ugc_limited_price_max")
	val ugcLimitedPriceMax: Int? = null,
	@SerialName("credit_balance_min")
	val creditBalanceMin: Int? = null,
	@SerialName("credit_balance_max")
	val creditBalanceMax: Int? = null,
	@SerialName("offsale_min")
	val offsaleMin: Int? = null,
	@SerialName("offsale_max")
	val offsaleMax: Int? = null,
	val voice: String? = null,
	@SerialName("age_group[]")
	val ageGroup: List<String>? = null,
	@SerialName("not_age_group[]")
	val notAgeGroup: List<String>? = null,
)

@Serializable
data class CategoryRobloxResponse(
	val items: List<JsonObject>? = null,
	val totalItems: Long? = null,
	val totalItemsPrice: JsonElement? = null,
	val hasNextPage: Boolean? = null,
	val perPage: Long? = null,
	val page: Long? = null,
	val wasCached: Boolean? = null,
	val cacheTTL: Long? = null,
	val lastModified: Long? = null,
	val serverTime: Long? = null,
	val searchUrl: String? = null,
	val stickyItems: List<JsonElement>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class CategoryWarfaceParams(
	val page: Int? = null,
	val pmin: Int? = null,
	val pmax: Int? = null,
	val title: String? = null,
	@SerialName("order_by")
	val orderBy: String? = null,
	@SerialName("tag_id[]")
	val tagId: List<Int>? = null,
	@SerialName("not_tag_id[]")
	val notTagId: List<Int>? = null,
	@SerialName("public_tag_id[]")
	val publicTagId: List<Int>? = null,
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Int>? = null,
	@SerialName("origin[]")
	val origin: JsonElement? = null,
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
	@SerialName("user_id")
	val userId: Int? = null,
	val nsb: Boolean? = null,
	val sb: Boolean? = null,
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
	val currency: String? = null,
	@SerialName("email_login_data")
	val emailLoginData: Boolean? = null,
	@SerialName("email_provider[]")
	val emailProvider: JsonElement? = null,
	@SerialName("not_email_provider[]")
	val notEmailProvider: String? = null,
	@SerialName("parse_same_item_ids")
	val parseSameItemIds: Boolean? = null,
	@SerialName("rank_min")
	val rankMin: Int? = null,
	@SerialName("rank_max")
	val rankMax: Int? = null,
	@SerialName("bonus_rank_min")
	val bonusRankMin: Int? = null,
	@SerialName("bonus_rank_max")
	val bonusRankMax: Int? = null,
	val tel: String? = null,
	val daybreak: Int? = null,
	@SerialName("kredits_min")
	val kreditsMin: Int? = null,
	@SerialName("kredits_max")
	val kreditsMax: Int? = null,
	@SerialName("total_kredits_min")
	val totalKreditsMin: Int? = null,
	@SerialName("total_kredits_max")
	val totalKreditsMax: Int? = null,
)

@Serializable
data class CategoryWarfaceResponse(
	val items: List<JsonObject>? = null,
	val totalItems: Long? = null,
	val totalItemsPrice: JsonElement? = null,
	val hasNextPage: Boolean? = null,
	val perPage: Long? = null,
	val page: Long? = null,
	val wasCached: Boolean? = null,
	val cacheTTL: Long? = null,
	val lastModified: Long? = null,
	val serverTime: Long? = null,
	val searchUrl: String? = null,
	val stickyItems: List<JsonElement>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class CategoryMinecraftParams(
	val page: Int? = null,
	val pmin: Int? = null,
	val pmax: Int? = null,
	val title: String? = null,
	@SerialName("order_by")
	val orderBy: String? = null,
	@SerialName("tag_id[]")
	val tagId: List<Int>? = null,
	@SerialName("not_tag_id[]")
	val notTagId: List<Int>? = null,
	@SerialName("public_tag_id[]")
	val publicTagId: List<Int>? = null,
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Int>? = null,
	@SerialName("origin[]")
	val origin: JsonElement? = null,
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
	@SerialName("user_id")
	val userId: Int? = null,
	val nsb: Boolean? = null,
	val sb: Boolean? = null,
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
	val currency: String? = null,
	@SerialName("email_login_data")
	val emailLoginData: Boolean? = null,
	@SerialName("email_provider[]")
	val emailProvider: JsonElement? = null,
	@SerialName("not_email_provider[]")
	val notEmailProvider: String? = null,
	@SerialName("parse_same_item_ids")
	val parseSameItemIds: Boolean? = null,
	val subscription: String? = null,
	@SerialName("subscription_length")
	val subscriptionLength: Int? = null,
	@SerialName("subscription_period")
	val subscriptionPeriod: String? = null,
	val autorenewal: String? = null,
	val java: String? = null,
	val bedrock: String? = null,
	val dungeons: String? = null,
	val legends: String? = null,
	@SerialName("change_nickname")
	val changeNickname: String? = null,
	@SerialName("capes[]")
	val capes: List<String>? = null,
	@SerialName("capes_min")
	val capesMin: Int? = null,
	@SerialName("capes_max")
	val capesMax: Int? = null,
	@SerialName("country[]")
	val country: List<String>? = null,
	@SerialName("not_country[]")
	val notCountry: List<String>? = null,
	@SerialName("hypixel_ban")
	val hypixelBan: String? = null,
	@SerialName("hypixel_skyblock_api_enabled")
	val hypixelSkyblockApiEnabled: String? = null,
	@SerialName("rank_hypixel[]")
	val rankHypixel: JsonElement? = null,
	@SerialName("level_hypixel_min")
	val levelHypixelMin: Int? = null,
	@SerialName("level_hypixel_max")
	val levelHypixelMax: Int? = null,
	@SerialName("achievement_hypixel_min")
	val achievementHypixelMin: Int? = null,
	@SerialName("achievement_hypixel_max")
	val achievementHypixelMax: Int? = null,
	@SerialName("level_hypixel_skyblock_min")
	val levelHypixelSkyblockMin: Int? = null,
	@SerialName("level_hypixel_skyblock_max")
	val levelHypixelSkyblockMax: Int? = null,
	@SerialName("net_worth_hypixel_skyblock_min")
	val netWorthHypixelSkyblockMin: Int? = null,
	@SerialName("net_worth_hypixel_skyblock_max")
	val netWorthHypixelSkyblockMax: Int? = null,
	val reg: Int? = null,
	@SerialName("reg_period")
	val regPeriod: String? = null,
	@SerialName("last_login_hypixel")
	val lastLoginHypixel: Int? = null,
	@SerialName("last_login_hypixel_period")
	val lastLoginHypixelPeriod: String? = null,
	@SerialName("can_change_details")
	val canChangeDetails: String? = null,
	@SerialName("nickname_length_min")
	val nicknameLengthMin: Int? = null,
	@SerialName("nickname_length_max")
	val nicknameLengthMax: Int? = null,
	@SerialName("hypixel_ban_parsed")
	val hypixelBanParsed: String? = null,
	@SerialName("minecoins_min")
	val minecoinsMin: Int? = null,
	@SerialName("minecoins_max")
	val minecoinsMax: Int? = null,
)

@Serializable
data class CategoryMinecraftResponse(
	val items: List<JsonObject>? = null,
	val totalItems: Long? = null,
	val totalItemsPrice: JsonElement? = null,
	val hasNextPage: Boolean? = null,
	val perPage: Long? = null,
	val page: Long? = null,
	val wasCached: Boolean? = null,
	val cacheTTL: Long? = null,
	val lastModified: Long? = null,
	val serverTime: Long? = null,
	val searchUrl: String? = null,
	val stickyItems: List<JsonElement>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class CategoryHytaleParams(
	val page: Int? = null,
	val pmin: Int? = null,
	val pmax: Int? = null,
	val title: String? = null,
	@SerialName("order_by")
	val orderBy: String? = null,
	@SerialName("tag_id[]")
	val tagId: List<Int>? = null,
	@SerialName("not_tag_id[]")
	val notTagId: List<Int>? = null,
	@SerialName("public_tag_id[]")
	val publicTagId: List<Int>? = null,
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Int>? = null,
	@SerialName("origin[]")
	val origin: JsonElement? = null,
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
	@SerialName("user_id")
	val userId: Int? = null,
	val nsb: Boolean? = null,
	val sb: Boolean? = null,
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
	val currency: String? = null,
	@SerialName("email_login_data")
	val emailLoginData: Boolean? = null,
	@SerialName("email_provider[]")
	val emailProvider: JsonElement? = null,
	@SerialName("not_email_provider[]")
	val notEmailProvider: String? = null,
	@SerialName("parse_same_item_ids")
	val parseSameItemIds: Boolean? = null,
	@SerialName("edition[]")
	val edition: JsonElement? = null,
	@SerialName("profiles_min")
	val profilesMin: Int? = null,
	@SerialName("profiles_max")
	val profilesMax: Int? = null,
)

@Serializable
data class CategoryHytaleResponse(
	val items: List<JsonObject>? = null,
	val totalItems: Long? = null,
	val totalItemsPrice: JsonElement? = null,
	val hasNextPage: Boolean? = null,
	val perPage: Long? = null,
	val page: Long? = null,
	val wasCached: Boolean? = null,
	val cacheTTL: Long? = null,
	val lastModified: Long? = null,
	val serverTime: Long? = null,
	val searchUrl: String? = null,
	val stickyItems: List<JsonElement>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class CategoryListParams(
	@SerialName("top_queries")
	val topQueries: Boolean? = null,
)

@Serializable
data class CategoryListResponse(
	val category: JsonObject? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class CategoryParamsResponse(
	val category: JsonObject? = null,
	val params: List<JsonObject>? = null,
	@SerialName("base_params")
	val baseParams: JsonObject? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class CategoryGamesResponse(
	val games: List<JsonObject>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

// ─── ListApi Types ────────────────────────────────────────

@Serializable
data class ListUserParams(
	@SerialName("user_id")
	val userId: Int? = null,
	@SerialName("category_id")
	val categoryId: JsonElement? = null,
	val page: Int? = null,
	val show: String? = null,
	@SerialName("delete_reason")
	val deleteReason: String? = null,
	val title: String? = null,
	val pmin: Int? = null,
	val pmax: Int? = null,
	val login: String? = null,
	@SerialName("origin[]")
	val origin: JsonElement? = null,
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
	@SerialName("order_by")
	val orderBy: String? = null,
	val sb: Boolean? = null,
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
	val nsb: Boolean? = null,
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
	val username: String? = null,
	@SerialName("published_startDate")
	val publishedStartDate: String? = null,
	@SerialName("published_endDate")
	val publishedEndDate: String? = null,
	@SerialName("filter_by_published_date")
	val filterByPublishedDate: Boolean? = null,
	@SerialName("paid_startDate")
	val paidStartDate: String? = null,
	@SerialName("paid_endDate")
	val paidEndDate: String? = null,
	@SerialName("filter_by_buyer_operation_date")
	val filterByBuyerOperationDate: Boolean? = null,
	@SerialName("delete_startDate")
	val deleteStartDate: String? = null,
	@SerialName("delete_endDate")
	val deleteEndDate: String? = null,
	@SerialName("filter_by_delete_date")
	val filterByDeleteDate: Boolean? = null,
)

@Serializable
data class ListUserResponse(
	val items: List<ItemFromListModel>? = null,
	val totalItems: Long? = null,
	val totalItemsPrice: JsonElement? = null,
	val hasNextPage: Boolean? = null,
	val perPage: Long? = null,
	val page: Long? = null,
	val searchUrl: String? = null,
	val stickyItems: List<ItemFromListModel>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ListOrdersParams(
	@SerialName("user_id")
	val userId: Int? = null,
	@SerialName("category_id")
	val categoryId: JsonElement? = null,
	val page: Int? = null,
	val show: String? = null,
	val title: String? = null,
	val pmin: Int? = null,
	val pmax: Int? = null,
	val login: String? = null,
	@SerialName("origin[]")
	val origin: JsonElement? = null,
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
	@SerialName("order_by")
	val orderBy: String? = null,
	val sb: Boolean? = null,
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
	val nsb: Boolean? = null,
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
)

@Serializable
data class ListOrdersResponse(
	val items: List<ItemFromListModel>? = null,
	val totalItems: Long? = null,
	val totalItemsPrice: JsonElement? = null,
	val hasNextPage: Boolean? = null,
	val perPage: Long? = null,
	val page: Long? = null,
	val searchUrl: String? = null,
	val stickyItems: List<ItemFromListModel>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ListStatesParams(
	@SerialName("user_id")
	val userId: JsonElement? = null,
)

@Serializable
data class ListStatesResponse(
	val userItemStates: JsonObject? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ListDownloadParams(
	val format: String? = null,
	@SerialName("custom_format")
	val customFormat: String? = null,
	@SerialName("category_id")
	val categoryId: JsonElement? = null,
	val page: Int? = null,
	val show: String? = null,
	@SerialName("delete_reason")
	val deleteReason: String? = null,
	val title: String? = null,
	val pmin: Int? = null,
	val pmax: Int? = null,
	@SerialName("origin[]")
	val origin: JsonElement? = null,
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
	@SerialName("order_by")
	val orderBy: String? = null,
	val sb: Boolean? = null,
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
	val nsb: Boolean? = null,
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
	val username: String? = null,
	@SerialName("published_startDate")
	val publishedStartDate: String? = null,
	@SerialName("published_endDate")
	val publishedEndDate: String? = null,
	@SerialName("filter_by_published_date")
	val filterByPublishedDate: Boolean? = null,
	@SerialName("paid_startDate")
	val paidStartDate: String? = null,
	@SerialName("paid_endDate")
	val paidEndDate: String? = null,
	@SerialName("filter_by_buyer_operation_date")
	val filterByBuyerOperationDate: Boolean? = null,
	@SerialName("delete_startDate")
	val deleteStartDate: String? = null,
	@SerialName("delete_endDate")
	val deleteEndDate: String? = null,
	@SerialName("filter_by_delete_date")
	val filterByDeleteDate: Boolean? = null,
)

typealias ListDownloadResponse = JsonElement

@Serializable
data class ListFavoritesParams(
	val page: Int? = null,
	val show: String? = null,
	val title: String? = null,
	val pmin: Int? = null,
	val pmax: Int? = null,
	@SerialName("origin[]")
	val origin: JsonElement? = null,
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
	@SerialName("order_by")
	val orderBy: String? = null,
	val sb: Boolean? = null,
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
	val nsb: Boolean? = null,
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
)

@Serializable
data class ListFavoritesResponse(
	val items: List<ItemFromListModel>? = null,
	val totalItems: Long? = null,
	val totalItemsPrice: JsonElement? = null,
	val hasNextPage: Boolean? = null,
	val perPage: Long? = null,
	val page: Long? = null,
	val searchUrl: String? = null,
	val stickyItems: List<ItemFromListModel>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ListViewedParams(
	val page: Int? = null,
	val show: String? = null,
	val title: String? = null,
	val pmin: Int? = null,
	val pmax: Int? = null,
	@SerialName("origin[]")
	val origin: JsonElement? = null,
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
	@SerialName("order_by")
	val orderBy: String? = null,
	val sb: Boolean? = null,
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
	val nsb: Boolean? = null,
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
)

@Serializable
data class ListViewedResponse(
	val items: List<ItemFromListModel>? = null,
	val totalItems: Long? = null,
	val totalItemsPrice: JsonElement? = null,
	val hasNextPage: Boolean? = null,
	val perPage: Long? = null,
	val page: Long? = null,
	val searchUrl: String? = null,
	val stickyItems: List<ItemFromListModel>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

// ─── ManagingApi Types ────────────────────────────────────────

@Serializable
data class ManagingGetParams(
	@SerialName("parse_same_item_ids")
	val parseSameItemIds: Boolean? = null,
)

@Serializable
data class ManagingGetResponse(
	val item: ItemModel? = null,
	val canStickItem: Boolean? = null,
	val canUnstickItem: Boolean? = null,
	val canBuyItem: Boolean? = null,
	val cannotBuyItemError: String? = null,
	val canCloseItem: Boolean? = null,
	val canOpenItem: Boolean? = null,
	val canReportItem: Boolean? = null,
	val canEditItem: Boolean? = null,
	val canDeleteItem: Boolean? = null,
	val canCancelConfirmedBuy: Boolean? = null,
	val canViewItemHistory: Boolean? = null,
	val faveCount: Boolean? = null,
	val isVisibleItem: Boolean? = null,
	val canViewLoginData: Boolean? = null,
	val showToFavouritesButton: Boolean? = null,
	val itemLink: String? = null,
	val canChangeOwner: Boolean? = null,
	val sameItemsIds: List<Int>? = null,
	val sameItemsCount: Long? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ManagingDeleteBody(
	val reason: String,
)

@Serializable
data class ManagingDeleteResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ManagingCreateClaimBody(
	@SerialName("item_id")
	val itemId: Int,
	@SerialName("post_body")
	val postBody: String,
)

@Serializable
data class ManagingCreateClaimResponse(
	val thread: JsonObject? = null,
	@SerialName("system_info")
	val systemInfo: JsonObject? = null,
)

@Serializable
data class ManagingBulkGetBody(
	@SerialName("item_id")
	val itemId: List<Int>? = null,
	@SerialName("parse_same_item_ids")
	val parseSameItemIds: Boolean? = null,
)

@Serializable
data class ManagingBulkGetResponse(
	val items: List<JsonObject>? = null,
	@SerialName("left_item_id")
	val leftItemId: List<Int>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ManagingSteamInventoryValueParams(
	@SerialName("app_id")
	val appId: JsonElement? = null,
	val currency: String? = null,
	@SerialName("ignore_cache")
	val ignoreCache: Boolean? = null,
)

@Serializable
data class ManagingSteamInventoryValueResponse(
	val query: String? = null,
	val data: JsonObject? = null,
	val appId: Long? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ManagingSteamValueParams(
	val link: String,
	@SerialName("app_id")
	val appId: JsonElement? = null,
	val currency: String? = null,
	@SerialName("ignore_cache")
	val ignoreCache: Boolean? = null,
)

@Serializable
data class ManagingSteamValueResponse(
	val query: String? = null,
	val data: JsonObject? = null,
	val appId: Long? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ManagingSteamPreviewParams(
	val type: String? = null,
)

typealias ManagingSteamPreviewResponse = JsonElement

@Serializable
data class ManagingEditBody(
	val title: String? = null,
	@SerialName("title_en")
	val titleEn: String? = null,
	val price: Int? = null,
	val currency: String? = null,
	@SerialName("item_origin")
	val itemOrigin: String? = null,
	@SerialName("email_login_data")
	val emailLoginData: String? = null,
	@SerialName("email_type")
	val emailType: String? = null,
	@SerialName("allow_ask_discount")
	val allowAskDiscount: Boolean? = null,
	@SerialName("proxy_id")
	val proxyId: Int? = null,
	val description: String? = null,
	val information: String? = null,
)

@Serializable
data class ManagingEditResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ManagingAIPriceResponse(
	val price: Long? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ManagingAutoBuyPriceResponse(
	val price: Long? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ManagingNoteBody(
	val text: String? = null,
)

@Serializable
data class ManagingNoteResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ManagingSteamUpdateValueBody(
	val all: Boolean? = null,
	@SerialName("app_id")
	val appId: JsonElement? = null,
	val authorize: Boolean? = null,
)

@Serializable
data class ManagingSteamUpdateValueResponse(
	val status: String? = null,
	val item: ItemModel? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ManagingBumpResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ManagingAutoBumpBody(
	val hour: Int,
)

@Serializable
data class ManagingAutoBumpResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ManagingAutoBumpDisableResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ManagingOpenResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ManagingCloseResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ManagingImageParams(
	val type: String,
)

@Serializable
data class ManagingImageResponse(
	val base64: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ManagingEmailCodeResponse(
	val item: ItemModel? = null,
	val codeData: JsonObject? = null,
)

@Serializable
data class ManagingGetLetters2Params(
	@SerialName("email_password")
	val emailPassword: String? = null,
	val email: String? = null,
	val password: String? = null,
	val limit: Int? = null,
)

@Serializable
data class ManagingGetLetters2Response(
	val email: String? = null,
	val letters: List<JsonObject>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ManagingSteamGetMafileResponse(
	val maFile: JsonObject? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ManagingSteamAddMafileResponse(
	val status: String? = null,
	val message: String? = null,
	val item: ItemModel? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ManagingSteamRemoveMafileResponse(
	val status: String? = null,
	val message: String? = null,
	val item: ItemModel? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ManagingSteamMafileCodeResponse(
	val item: ItemModel? = null,
	val codeData: JsonObject? = null,
)

@Serializable
data class ManagingSteamSDABody(
	val id: Int? = null,
	val nonce: Int? = null,
)

@Serializable
data class ManagingSteamSDAResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ManagingTelegramCodeResponse(
	val item: ItemModel? = null,
	val codes: JsonObject? = null,
)

@Serializable
data class ManagingTelegramResetAuthResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ManagingRefuseGuaranteeResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ManagingDeclineVideoRecordingBody(
	@SerialName("i_voluntarily_and_with_full_awareness_of_my_actions_waive_any_claims_regarding_this_item")
	val iVoluntarilyAndWithFullAwarenessOfMyActionsWaiveAnyClaimsRegardingThisItem: Boolean,
)

@Serializable
data class ManagingDeclineVideoRecordingResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ManagingCheckGuaranteeResponse(
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ManagingChangePasswordBody(
	@SerialName("_cancel")
	val Cancel: String? = null,
)

@Serializable
data class ManagingChangePasswordResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("new_password")
	val newPassword: String? = null,
)

@Serializable
data class ManagingTempEmailPasswordResponse(
	val item: JsonObject? = null,
)

@Serializable
data class ManagingTagBody(
	@SerialName("tag_id")
	val tagId: Int,
)

@Serializable
data class ManagingTagResponse(
	val itemId: Long? = null,
	val tag: JsonObject? = null,
	val addedTagId: Long? = null,
	val deleteTags: List<Int>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ManagingUntagBody(
	@SerialName("tag_id")
	val tagId: Int,
)

@Serializable
data class ManagingUntagResponse(
	val itemId: Long? = null,
	val tag: JsonObject? = null,
	val addedTagId: Long? = null,
	val deleteTags: List<Int>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ManagingPublicTagBody(
	@SerialName("tag_id")
	val tagId: Int,
)

@Serializable
data class ManagingPublicTagResponse(
	val itemId: Long? = null,
	val tag: JsonObject? = null,
	val addedTagId: Long? = null,
	val deleteTags: List<Int>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ManagingPublicUntagBody(
	@SerialName("tag_id")
	val tagId: Int,
)

@Serializable
data class ManagingPublicUntagResponse(
	val itemId: Long? = null,
	val tag: JsonObject? = null,
	val addedTagId: Long? = null,
	val deleteTags: List<Int>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ManagingFavoriteResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ManagingUnfavoriteResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ManagingStickResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ManagingUnstickResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ManagingTransferBody(
	val username: String,
	@SerialName("secret_answer")
	val secretAnswer: String,
)

@Serializable
data class ManagingTransferResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

// ─── ProfileApi Types ────────────────────────────────────────

@Serializable
data class ProfileClaimsParams(
	val type: String? = null,
	@SerialName("claim_state")
	val claimState: String? = null,
)

@Serializable
data class ProfileClaimsResponse(
	val claims: List<JsonObject>? = null,
	val stats: JsonObject? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ProfileGetParams(
	@SerialName("fields_include")
	val fieldsInclude: JsonElement? = null,
)

@Serializable
data class ProfileGetResponse(
	val user: UserModel? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ProfileEditBody(
	val user: JsonObject? = null,
	val option: JsonObject? = null,
	@SerialName("allow_accept_accounts")
	val allowAcceptAccounts: List<String>? = null,
	@SerialName("telegram_api_id")
	val telegramApiId: String? = null,
	@SerialName("telegram_api_hash")
	val telegramApiHash: String? = null,
	@SerialName("telegram_device_model")
	val telegramDeviceModel: String? = null,
	@SerialName("telegram_system_version")
	val telegramSystemVersion: String? = null,
	@SerialName("telegram_app_version")
	val telegramAppVersion: String? = null,
	@SerialName("telegram_lang_pack")
	val telegramLangPack: String? = null,
	@SerialName("telegram_lang_code")
	val telegramLangCode: String? = null,
	@SerialName("telegram_system_lang_code")
	val telegramSystemLangCode: String? = null,
	@SerialName("clear_telegram_client")
	val clearTelegramClient: Boolean? = null,
)

@Serializable
data class ProfileEditResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

// ─── CartApi Types ────────────────────────────────────────

@Serializable
data class CartGetParams(
	@SerialName("category_id")
	val categoryId: JsonElement? = null,
	val page: Int? = null,
	val pmin: Int? = null,
	val pmax: Int? = null,
	val title: String? = null,
	@SerialName("order_by")
	val orderBy: String? = null,
	@SerialName("tag_id[]")
	val tagId: List<Int>? = null,
	@SerialName("not_tag_id[]")
	val notTagId: List<Int>? = null,
	@SerialName("public_tag_id[]")
	val publicTagId: List<Int>? = null,
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Int>? = null,
	@SerialName("origin[]")
	val origin: JsonElement? = null,
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
	@SerialName("user_id")
	val userId: Int? = null,
	val nsb: Boolean? = null,
	val sb: Boolean? = null,
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
	val currency: String? = null,
	@SerialName("email_login_data")
	val emailLoginData: Boolean? = null,
	@SerialName("email_provider[]")
	val emailProvider: JsonElement? = null,
	@SerialName("not_email_provider[]")
	val notEmailProvider: String? = null,
	@SerialName("parse_same_item_ids")
	val parseSameItemIds: Boolean? = null,
)

@Serializable
data class CartGetResponse(
	val items: List<ItemFromListModel>? = null,
	val totalItems: Long? = null,
	val totalItemsPrice: JsonElement? = null,
	val hasNextPage: Boolean? = null,
	val perPage: Long? = null,
	val page: Long? = null,
	val searchUrl: String? = null,
	val stickyItems: List<ItemFromListModel>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class CartAddBody(
	@SerialName("item_id")
	val itemId: Int,
)

@Serializable
data class CartAddResponse(
	val success: Boolean? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class CartDeleteBody(
	@SerialName("item_id")
	val itemId: Int? = null,
)

@Serializable
data class CartDeleteResponse(
	val success: Boolean? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

// ─── PurchasingApi Types ────────────────────────────────────────

@Serializable
data class PurchasingFastBuyBody(
	val price: Double? = null,
	@SerialName("balance_id")
	val balanceId: Int? = null,
)

@Serializable
data class PurchasingFastBuyResponse(
	val status: String? = null,
	val item: JsonObject? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class PurchasingCheckResponse(
	val status: String? = null,
	val item: JsonObject? = null,
	val requireVideoRecording: Boolean? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class PurchasingConfirmBody(
	val price: Int? = null,
	@SerialName("balance_id")
	val balanceId: Int? = null,
)

@Serializable
data class PurchasingConfirmResponse(
	val status: String? = null,
	val item: JsonObject? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class PurchasingDiscountRequestBody(
	@SerialName("discount_price")
	val discountPrice: Double,
	val message: String? = null,
)

@Serializable
data class PurchasingDiscountRequestResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class PurchasingDiscountCancelResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

// ─── CustomDiscountsApi Types ────────────────────────────────────────

@Serializable
data class CustomDiscountsGetResponse(
	val discounts: List<DiscountModel>? = null,
	val total: Long? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class CustomDiscountsCreateBody(
	@SerialName("user_id")
	val userId: Int,
	@SerialName("category_id")
	val categoryId: JsonElement,
	@SerialName("discount_percent")
	val discountPercent: Double,
	@SerialName("min_price")
	val minPrice: Double,
	@SerialName("max_price")
	val maxPrice: Double? = null,
	val currency: String? = null,
)

@Serializable
data class CustomDiscountsCreateResponse(
	val discount: DiscountModel? = null,
	val total: Long? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class CustomDiscountsEditBody(
	@SerialName("discount_id")
	val discountId: Int,
	@SerialName("discount_percent")
	val discountPercent: Double? = null,
	@SerialName("min_price")
	val minPrice: Double? = null,
	@SerialName("max_price")
	val maxPrice: Double? = null,
)

@Serializable
data class CustomDiscountsEditResponse(
	val discounts: List<DiscountModel>? = null,
	val total: Long? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class CustomDiscountsDeleteBody(
	@SerialName("discount_id")
	val discountId: Int,
)

@Serializable
data class CustomDiscountsDeleteResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

// ─── PublishingApi Types ────────────────────────────────────────

@Serializable
data class PublishingFastSellBody(
	val title: String? = null,
	@SerialName("title_en")
	val titleEn: String? = null,
	val price: Double,
	@SerialName("category_id")
	val categoryId: JsonElement,
	val currency: String,
	@SerialName("item_origin")
	val itemOrigin: String,
	@SerialName("extended_guarantee")
	val extendedGuarantee: JsonElement? = null,
	@SerialName("allow_ask_discount")
	val allowAskDiscount: Boolean? = null,
	@SerialName("proxy_id")
	val proxyId: Int? = null,
	@SerialName("random_proxy")
	val randomProxy: Boolean? = null,
	val description: String? = null,
	val information: String? = null,
	val login: String? = null,
	val password: String? = null,
	@SerialName("login_password")
	val loginPassword: String? = null,
	@SerialName("has_email_login_data")
	val hasEmailLoginData: Boolean? = null,
	@SerialName("email_login_data")
	val emailLoginData: String? = null,
	@SerialName("email_type")
	val emailType: String? = null,
	val extra: JsonObject? = null,
)

@Serializable
data class PublishingFastSellResponse(
	val item: ItemModel? = null,
	val itemLink: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class PublishingAddBody(
	val title: String? = null,
	@SerialName("title_en")
	val titleEn: String? = null,
	val price: Double,
	@SerialName("category_id")
	val categoryId: JsonElement,
	val currency: String,
	@SerialName("item_origin")
	val itemOrigin: String,
	@SerialName("extended_guarantee")
	val extendedGuarantee: JsonElement? = null,
	val description: String? = null,
	val information: String? = null,
	val forceTempEmail: Boolean? = null,
	@SerialName("resell_item_id")
	val resellItemId: Int? = null,
	@SerialName("has_email_login_data")
	val hasEmailLoginData: Boolean? = null,
	@SerialName("email_login_data")
	val emailLoginData: String? = null,
	@SerialName("email_type")
	val emailType: String? = null,
	@SerialName("allow_ask_discount")
	val allowAskDiscount: Boolean? = null,
	@SerialName("proxy_id")
	val proxyId: Int? = null,
	@SerialName("random_proxy")
	val randomProxy: Boolean? = null,
)

@Serializable
data class PublishingAddResponse(
	val status: String? = null,
	val item: ItemModel? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class PublishingCheckBody(
	@SerialName("resell_item_id")
	val resellItemId: Int? = null,
	@SerialName("random_proxy")
	val randomProxy: Boolean? = null,
	val login: String? = null,
	val password: String? = null,
	@SerialName("login_password")
	val loginPassword: String? = null,
	@SerialName("has_email_login_data")
	val hasEmailLoginData: Boolean? = null,
	@SerialName("email_login_data")
	val emailLoginData: String? = null,
	@SerialName("email_type")
	val emailType: String? = null,
	val extra: JsonObject? = null,
)

@Serializable
data class PublishingCheckResponse(
	val status: String? = null,
	val item: JsonObject? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class PublishingExternalBody(
	val type: String,
	val login: String? = null,
	@SerialName("email_login_data")
	val emailLoginData: String? = null,
	val cookies: String? = null,
)

@Serializable
data class PublishingExternalResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

// ─── PaymentsApi Types ────────────────────────────────────────

@Serializable
data class PaymentsInvoiceGetParams(
	@SerialName("invoice_id")
	val invoiceId: Int? = null,
	@SerialName("payment_id")
	val paymentId: String? = null,
)

@Serializable
data class PaymentsInvoiceGetResponse(
	val invoice: InvoiceModel? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class PaymentsInvoiceCreateBody(
	val currency: String,
	val amount: Double,
	@SerialName("payment_id")
	val paymentId: String,
	val comment: String,
	@SerialName("url_success")
	val urlSuccess: String,
	@SerialName("url_callback")
	val urlCallback: String? = null,
	@SerialName("merchant_id")
	val merchantId: Int,
	@SerialName("required_telegram_id")
	val requiredTelegramId: Int? = null,
	@SerialName("required_telegram_username")
	val requiredTelegramUsername: String? = null,
	val lifetime: Double? = null,
	@SerialName("additional_data")
	val additionalData: String? = null,
	@SerialName("is_test")
	val isTest: Boolean? = null,
)

@Serializable
data class PaymentsInvoiceCreateResponse(
	val invoice: InvoiceModel? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class PaymentsInvoiceListParams(
	val page: Int? = null,
	val currency: String? = null,
	val status: String? = null,
	val amount: Double? = null,
	@SerialName("merchant_id")
	val merchantId: Int? = null,
)

@Serializable
data class PaymentsInvoiceListResponse(
	val invoices: List<InvoiceModel>? = null,
	val count: Long? = null,
	val page: Long? = null,
	val perPage: Long? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class PaymentsCurrencyResponse(
	val currencyList: JsonObject? = null,
	val lastUpdate: Long? = null,
	val visitorCurrency: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class PaymentsBalanceListResponse(
	val from: JsonObject? = null,
	val to: JsonObject? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class PaymentsBalanceExchangeBody(
	@SerialName("from_balance")
	val fromBalance: String,
	@SerialName("to_balance")
	val toBalance: String,
	val amount: Int,
)

@Serializable
data class PaymentsBalanceExchangeResponse(
	val from: JsonObject? = null,
	val to: JsonObject? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class PaymentsTransferBody(
	@SerialName("user_id")
	val userId: Int? = null,
	val username: String? = null,
	val amount: Int,
	val currency: String,
	val comment: String? = null,
	@SerialName("telegram_deal")
	val telegramDeal: Boolean? = null,
	@SerialName("telegram_username")
	val telegramUsername: String? = null,
	@SerialName("transfer_hold")
	val transferHold: Boolean? = null,
	@SerialName("hold_length_value")
	val holdLengthValue: Int? = null,
	@SerialName("hold_length_option")
	val holdLengthOption: String? = null,
)

@Serializable
data class PaymentsTransferResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class PaymentsFeeParams(
	val amount: Double? = null,
)

@Serializable
data class PaymentsFeeResponse(
	@SerialName("commission_percentage")
	val commissionPercentage: Long? = null,
	val spentCurrentMonth: Long? = null,
	val calculator: JsonObject? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class PaymentsCancelBody(
	@SerialName("payment_id")
	val paymentId: Int,
)

@Serializable
data class PaymentsCancelResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class PaymentsHistoryParams(
	val type: String? = null,
	val pmin: Int? = null,
	val pmax: Int? = null,
	val currency: String? = null,
	val page: Int? = null,
	@SerialName("operation_id_lt")
	val operationIdLt: Int? = null,
	val receiver: String? = null,
	val sender: String? = null,
	@SerialName("is_api")
	val isApi: Boolean? = null,
	val startDate: String? = null,
	val endDate: String? = null,
	val wallet: String? = null,
	val comment: String? = null,
	@SerialName("is_hold")
	val isHold: Boolean? = null,
	@SerialName("show_payment_stats")
	val showPaymentStats: Boolean? = null,
)

@Serializable
data class PaymentsHistoryResponse(
	val payments: JsonObject? = null,
	val perPage: String? = null,
	val page: Long? = null,
	val pageNavLink: String? = null,
	val pageNavParams: JsonObject? = null,
	val periodLabel: String? = null,
	val periodLabelPhrase: String? = null,
	val filterDatesDefault: Boolean? = null,
	val input: JsonObject? = null,
	val paymentStats: JsonElement? = null,
	val hasNextPage: Boolean? = null,
	val lastOperationId: Long? = null,
	val nextPageHref: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class PaymentsPayoutServicesResponse(
	val systems: List<JsonObject>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class PaymentsPayoutBody(
	@SerialName("payment_system")
	val paymentSystem: String,
	val wallet: String,
	val amount: Double,
	val currency: String,
	@SerialName("include_fee")
	val includeFee: Boolean? = null,
	val extra: JsonObject? = null,
)

@Serializable
data class PaymentsPayoutResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

// ─── AutoPaymentsApi Types ────────────────────────────────────────

@Serializable
data class AutoPaymentsListResponse(
	val payments: JsonObject? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class AutoPaymentsCreateBody(
	@SerialName("secret_answer")
	val secretAnswer: String? = null,
	@SerialName("username_receiver")
	val usernameReceiver: String,
	val day: JsonElement,
	val amount: Double,
	val currency: String? = null,
	val description: String? = null,
)

@Serializable
data class AutoPaymentsCreateResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("auto_payment_id")
	val autoPaymentId: Long? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class AutoPaymentsDeleteBody(
	@SerialName("auto_payment_id")
	val autoPaymentId: Int,
)

@Serializable
data class AutoPaymentsDeleteResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

// ─── ProxyApi Types ────────────────────────────────────────

@Serializable
data class ProxyGetResponse(
	val proxies: List<JsonObject>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ProxyAddBody(
	@SerialName("proxy_ip")
	val proxyIp: String? = null,
	@SerialName("proxy_port")
	val proxyPort: Int? = null,
	@SerialName("proxy_user")
	val proxyUser: String? = null,
	@SerialName("proxy_pass")
	val proxyPass: String? = null,
	@SerialName("proxy_row")
	val proxyRow: String? = null,
)

@Serializable
data class ProxyAddResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ProxyDeleteBody(
	@SerialName("proxy_id")
	val proxyId: Int? = null,
	@SerialName("delete_all")
	val deleteAll: Boolean? = null,
)

@Serializable
data class ProxyDeleteResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

// ─── ImapApi Types ────────────────────────────────────────

@Serializable
data class ImapCreateBody(
	val domain: String,
	@SerialName("imap_server")
	val imapServer: String,
	val port: Int,
	val secure: Boolean,
)

@Serializable
data class ImapCreateResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ImapDeleteBody(
	val domain: String,
)

@Serializable
data class ImapDeleteResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

// ─── BatchApi Types ────────────────────────────────────────

typealias BatchBatchBody = List<JsonObject>

@Serializable
data class BatchBatchResponse(
	val jobs: JsonObject? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

