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
	val balances: List<UserModelBalances>,
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
	val customFields: UserModelCustomFields,
	@SerialName("custom_title")
	val customTitle: String,
	val deposit: Long,
	val dob: UserModelDob,
	@SerialName("feedback_data")
	val feedbackData: UserModelFeedbackData,
	val hold: String,
	val homepage: String,
	@SerialName("imap_data")
	val imapData: UserModelImapData,
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
	val publicTags: List<UserModelPublicTags>,
	@SerialName("register_date")
	val registerDate: Long,
	val rendered: UserModelRendered,
	@SerialName("restore_count")
	val restoreCount: Long,
	@SerialName("restore_data")
	val restoreData: UserModelRestoreData,
	@SerialName("short_link")
	val shortLink: String,
	@SerialName("sold_items_count")
	val soldItemsCount: Long,
	val tags: List<UserModelTags>,
	@SerialName("telegram_client")
	val telegramClient: UserModelTelegramClient,
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
data class UserModelBalances(
	val balance: String,
	@SerialName("balance_id")
	val balanceId: Long,
	val convertedBalance: Double,
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
data class UserModelCustomFields(
	val _4: String,
	val allowSelfUnban: List<JsonElement>,
	@SerialName("ban_reason")
	val banReason: String,
	val discord: String,
	val github: String,
	val jabber: String,
	val lztAwardUserTrophy: String,
	val lztLikesIncreasing: String,
	val lztLikesZeroing: String,
	val lztSympathyIncreasing: String,
	val lztSympathyZeroing: String,
	val lztUnbanAmount: String,
	val maecenasValue: String,
	val scamURL: String,
	val steam: String,
	val telegram: String,
	val vk: String,
	val favoritePorn: String,
	val favoriteVape: String,
	val favoriteAnime: String,
	val matrix: String,
)

@Serializable
data class UserModelDob(
	val year: Long,
	val month: Long,
	val day: Long,
)

@Serializable
data class UserModelFeedbackData12345(
	val positive: Long,
	val negative: Long,
)

@Serializable
data class UserModelFeedbackData(
	@SerialName("12345")
	val `12345`: UserModelFeedbackData12345,
)

@Serializable
data class UserModelImapDataDomainZone(
	val domain: String,
	@SerialName("imap_server")
	val imapServer: String,
	val port: Long,
	val secure: Boolean,
)

@Serializable
data class UserModelImapData(
	@SerialName("domain.zone")
	val domainZone: UserModelImapDataDomainZone,
)

@Serializable
data class UserModelPublicTags(
	@SerialName("background_color")
	val backgroundColor: String,
	@SerialName("tag_id")
	val tagId: Long,
	val title: String,
)

@Serializable
data class UserModelRenderedAvatars(
	val l: String,
	val m: String,
	val s: String,
)

@Serializable
data class UserModelRenderedBackgrounds(
	val l: String,
	val m: String,
)

@Serializable
data class UserModelRendered(
	val username: String,
	val avatars: UserModelRenderedAvatars,
	val backgrounds: UserModelRenderedBackgrounds,
	val link: String,
)

@Serializable
data class UserModelRestoreData(
	@SerialName("12345")
	val `12345`: Long,
)

@Serializable
data class UserModelTags(
	@SerialName("tag_id")
	val tagId: Long,
	val title: String,
	val isDefault: Boolean,
	val forOwnedAccountsOnly: Boolean,
	val bc: String,
)

@Serializable
data class UserModelTelegramClient(
	@SerialName("telegram_api_id")
	val telegramApiId: String,
	@SerialName("telegram_api_hash")
	val telegramApiHash: String,
	@SerialName("telegram_device_model")
	val telegramDeviceModel: String,
	@SerialName("telegram_system_version")
	val telegramSystemVersion: String,
	@SerialName("telegram_app_version")
	val telegramAppVersion: String,
	@SerialName("telegram_system_lang_code")
	val telegramSystemLangCode: String,
	@SerialName("telegram_lang_code")
	val telegramLangCode: String,
	@SerialName("telegram_lang_pack")
	val telegramLangPack: String,
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
	val item: ItemModel,
	val codeData: ConfirmationCodeModelCodeData,
)

@Serializable
data class ConfirmationCodeModelCodeData(
	val code: String,
	val date: Long,
	val textPlain: String,
)

@Serializable
data class ItemListModel(
	val items: List<ItemFromListModel>,
	val totalItems: Long,
	val totalItemsPrice: JsonElement,
	val hasNextPage: Boolean,
	val perPage: Long,
	val page: Long,
	val searchUrl: String,
	val stickyItems: List<ItemFromListModel>,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo,
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
	val bumpSettings: ItemFromListModelBumpSettings? = null,
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
	val seller: ItemFromListModelSeller? = null,
)

@Serializable
data class ItemFromListModelBumpSettings(
	val canBumpItem: Boolean? = null,
	val canBumpItemGlobally: Boolean? = null,
	val shortErrorPhrase: String? = null,
	val errorPhrase: String? = null,
)

@Serializable
data class ItemFromListModelSeller(
	@SerialName("user_id")
	val userId: Long? = null,
	@SerialName("sold_items_count")
	val soldItemsCount: Long? = null,
	@SerialName("active_item_count")
	val activeItemCount: Long? = null,
	@SerialName("restore_data")
	val restoreData: String? = null,
	val username: String? = null,
	@SerialName("avatar_date")
	val avatarDate: Long? = null,
	@SerialName("is_banned")
	val isBanned: Long? = null,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Long? = null,
	@SerialName("restore_percents")
	val restorePercents: Long? = null,
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
	val guarantee: ItemModelGuarantee,
	val canViewLoginData: Boolean,
	val canUpdateItemStats: Boolean,
	val canReportItem: Boolean,
	val canViewItemViews: Boolean,
	val loginData: ItemModelLoginData,
	val canViewEmailLoginData: Boolean,
	val copyFormatData: ItemModelCopyFormatData,
	val showGetEmailCodeButton: Boolean,
	val getEmailCodeDisplayLogin: JsonElement,
	val buyer: ItemModelBuyer,
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
	val accountLinks: List<ItemModelAccountLinks>,
	val accountLink: String,
	val imagePreviewLinks: List<String>,
	val canChangePassword: Boolean,
	val canChangeEmailPassword: Boolean,
	val uniqueKeyExists: Boolean,
	val itemOriginPhrase: String,
	val visitorIsAuthor: Boolean,
	val canAskDiscount: Boolean,
	val tags: ItemModelTags,
	val customFields: ItemModelCustomFields,
	val externalAuth: List<JsonElement>,
	val isTrusted: Boolean,
	val isBirthdayToday: Boolean,
	val isIgnored: Boolean,
	val deposit: Long,
	val extraPrices: List<ItemModelExtraPrices>,
	val canViewAccountLoginAndTempEmail: Boolean,
	val bumpSettings: ItemModelBumpSettings,
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
	val seller: ItemModelSeller,
)

@Serializable
data class ItemModelGuarantee(
	val duration: Long,
	val `class`: String,
	val durationPhrase: String,
	val endDate: Long,
	val active: Boolean,
	val cancelled: Boolean,
	val remainingTime: Long,
	val remainingTimePhrase: String,
	val cancelledReason: String,
	val cancelledReasonPhrase: String,
)

@Serializable
data class ItemModelLoginData(
	val raw: String,
	val encodedRaw: String,
	val login: String,
	val password: String,
	val encodedPassword: String,
	val oldPassword: String,
	val encodedOldPassword: JsonElement,
)

@Serializable
data class ItemModelCopyFormatData(
	@SerialName("title_link")
	val titleLink: String,
	@SerialName("login_data")
	val loginData: String,
	val full: String,
)

@Serializable
data class ItemModelBuyer(
	@SerialName("user_id")
	val userId: Long,
	@SerialName("operation_date")
	val operationDate: Long,
	val visitorIsBuyer: Boolean,
	val username: String,
	@SerialName("is_banned")
	val isBanned: Long,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Long,
	@SerialName("display_icon_group_id")
	val displayIconGroupId: Long,
	@SerialName("uniq_username_css")
	val uniqUsernameCss: String,
	@SerialName("uniq_banner")
	val uniqBanner: String,
	@SerialName("user_group_id")
	val userGroupId: Long,
)

@Serializable
data class ItemModelAccountLinks(
	val link: String,
	val text: String,
	val iconClass: String,
)

@Serializable
data class ItemModelTags1234567890(
	@SerialName("tag_id")
	val tagId: Long,
	val title: String,
	val isDefault: Boolean,
	val forOwnedAccountsOnly: Boolean,
	val bc: String,
)

@Serializable
data class ItemModelTags(
	@SerialName("1234567890")
	val `1234567890`: ItemModelTags1234567890,
)

@Serializable
data class ItemModelCustomFields(
	val _4: String,
	val allowSelfUnban: List<JsonElement>,
	@SerialName("ban_reason")
	val banReason: String,
	val discord: String,
	val github: String,
	val jabber: String,
	val lztUnbanAmount: String,
	val steam: String,
	val telegram: String,
	val vk: String,
)

@Serializable
data class ItemModelExtraPrices(
	val currency: String,
	val price: String,
	val priceValue: Double,
)

@Serializable
data class ItemModelBumpSettings(
	val canBumpItem: Boolean,
	val canBumpItemGlobally: Boolean,
	val shortErrorPhrase: JsonElement,
	val nextAllowedBumpDate: JsonElement,
	val errorPhrase: JsonElement,
)

@Serializable
data class ItemModelSellerContacts(
	@SerialName("ban_reason")
	val banReason: String,
	val telegram: String,
)

@Serializable
data class ItemModelSeller(
	@SerialName("user_id")
	val userId: Long,
	val username: String,
	@SerialName("avatar_date")
	val avatarDate: Long,
	@SerialName("is_banned")
	val isBanned: Long,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Long,
	@SerialName("joined_date")
	val joinedDate: Long,
	@SerialName("sold_items_count")
	val soldItemsCount: Long,
	@SerialName("active_items_count")
	val activeItemsCount: Long,
	@SerialName("restore_data")
	val restoreData: String,
	@SerialName("effective_last_activity")
	val effectiveLastActivity: Long,
	@SerialName("restore_percents")
	val restorePercents: JsonElement,
	val isOnline: Boolean,
	val contacts: ItemModelSellerContacts,
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
	val page: Long? = null,
	val pmin: Long? = null,
	val pmax: Long? = null,
	val title: String? = null,
	@SerialName("order_by")
	val orderBy: String? = null,
	@SerialName("tag_id[]")
	val tagId: List<Long>? = null,
	@SerialName("not_tag_id[]")
	val notTagId: List<Long>? = null,
	@SerialName("public_tag_id[]")
	val publicTagId: List<Long>? = null,
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Long>? = null,
	@SerialName("origin[]")
	val origin: JsonElement? = null,
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
	@SerialName("user_id")
	val userId: Long? = null,
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
	val page: Long? = null,
	val pmin: Long? = null,
	val pmax: Long? = null,
	val title: String? = null,
	@SerialName("order_by")
	val orderBy: String? = null,
	@SerialName("tag_id[]")
	val tagId: List<Long>? = null,
	@SerialName("not_tag_id[]")
	val notTagId: List<Long>? = null,
	@SerialName("public_tag_id[]")
	val publicTagId: List<Long>? = null,
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Long>? = null,
	@SerialName("origin[]")
	val origin: JsonElement? = null,
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
	@SerialName("user_id")
	val userId: Long? = null,
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
	val game: List<Long>? = null,
	@SerialName("hours_played")
	val hoursPlayed: Map<String, Long>? = null,
	@SerialName("hours_played_max")
	val hoursPlayedMax: Map<String, Long>? = null,
	val eg: Long? = null,
	@SerialName("vac[]")
	val vac: List<Long>? = null,
	@SerialName("vac_skip_game_check")
	val vacSkipGameCheck: Boolean? = null,
	val rt: String? = null,
	@SerialName("trade_ban")
	val tradeBan: String? = null,
	@SerialName("trade_limit")
	val tradeLimit: String? = null,
	val daybreak: Long? = null,
	val limit: String? = null,
	val mafile: String? = null,
	val reg: Long? = null,
	@SerialName("reg_period")
	val regPeriod: String? = null,
	val lmin: Long? = null,
	val lmax: Long? = null,
	val rmin: Long? = null,
	val rmax: Long? = null,
	@SerialName("wingman_rmin")
	val wingmanRmin: Long? = null,
	@SerialName("wingman_rmax")
	val wingmanRmax: Long? = null,
	@SerialName("no_vac")
	val noVac: Boolean? = null,
	@SerialName("mm_ban")
	val mmBan: String? = null,
	@SerialName("balance_min")
	val balanceMin: Long? = null,
	@SerialName("balance_max")
	val balanceMax: Long? = null,
	@SerialName("inv_game")
	val invGame: Long? = null,
	@SerialName("inv_min")
	val invMin: Double? = null,
	@SerialName("inv_max")
	val invMax: Double? = null,
	@SerialName("friends_min")
	val friendsMin: Long? = null,
	@SerialName("friends_max")
	val friendsMax: Long? = null,
	val gmin: Long? = null,
	val gmax: Long? = null,
	@SerialName("win_count_min")
	val winCountMin: Long? = null,
	@SerialName("win_count_max")
	val winCountMax: Long? = null,
	@SerialName("medal_id[]")
	val medalId: List<Long>? = null,
	@SerialName("medal_operator_or")
	val medalOperatorOr: Boolean? = null,
	@SerialName("medal_min")
	val medalMin: Long? = null,
	@SerialName("medal_max")
	val medalMax: Long? = null,
	@SerialName("gift[]")
	val gift: JsonElement? = null,
	@SerialName("gift_min")
	val giftMin: Long? = null,
	@SerialName("gift_max")
	val giftMax: Long? = null,
	@SerialName("recently_hours_min")
	val recentlyHoursMin: Long? = null,
	@SerialName("recently_hours_max")
	val recentlyHoursMax: Long? = null,
	@SerialName("country[]")
	val country: List<String>? = null,
	@SerialName("not_country[]")
	val notCountry: List<String>? = null,
	@SerialName("cs2_profile_rank_min")
	val cs2ProfileRankMin: Long? = null,
	@SerialName("cs2_profile_rank_max")
	val cs2ProfileRankMax: Long? = null,
	@SerialName("solommr_min")
	val solommrMin: Long? = null,
	@SerialName("solommr_max")
	val solommrMax: Long? = null,
	@SerialName("d2_game_count_min")
	val d2GameCountMin: Long? = null,
	@SerialName("d2_game_count_max")
	val d2GameCountMax: Long? = null,
	@SerialName("d2_win_count_min")
	val d2WinCountMin: Long? = null,
	@SerialName("d2_win_count_max")
	val d2WinCountMax: Long? = null,
	@SerialName("d2_behavior_min")
	val d2BehaviorMin: Long? = null,
	@SerialName("d2_behavior_max")
	val d2BehaviorMax: Long? = null,
	@SerialName("faceit_lvl_min")
	val faceitLvlMin: Long? = null,
	@SerialName("faceit_lvl_max")
	val faceitLvlMax: Long? = null,
	@SerialName("points_min")
	val pointsMin: Long? = null,
	@SerialName("points_max")
	val pointsMax: Long? = null,
	@SerialName("relevant_gmin")
	val relevantGmin: Long? = null,
	@SerialName("relevant_gmax")
	val relevantGmax: Long? = null,
	@SerialName("last_trans_date")
	val lastTransDate: Long? = null,
	@SerialName("last_trans_date_period")
	val lastTransDatePeriod: String? = null,
	@SerialName("last_trans_date_later")
	val lastTransDateLater: Long? = null,
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
	val eloMin: Long? = null,
	@SerialName("elo_max")
	val eloMax: Long? = null,
	@SerialName("cs2_map_rank")
	val cs2MapRank: Long? = null,
	@SerialName("cs2_map_rmin")
	val cs2MapRmin: Long? = null,
	@SerialName("cs2_map_rmax")
	val cs2MapRmax: Long? = null,
	@SerialName("has_faceit")
	val hasFaceit: String? = null,
	@SerialName("faceit_csgo_lvl_min")
	val faceitCsgoLvlMin: Long? = null,
	@SerialName("faceit_csgo_lvl_max")
	val faceitCsgoLvlMax: Long? = null,
	@SerialName("rust_deaths_min")
	val rustDeathsMin: Long? = null,
	@SerialName("rust_deaths_max")
	val rustDeathsMax: Long? = null,
	@SerialName("rust_kills_min")
	val rustKillsMin: Long? = null,
	@SerialName("rust_kills_max")
	val rustKillsMax: Long? = null,
	@SerialName("d2_last_match_date")
	val d2LastMatchDate: Long? = null,
	@SerialName("d2_last_match_date_period")
	val d2LastMatchDatePeriod: String? = null,
	@SerialName("cards_min")
	val cardsMin: Long? = null,
	@SerialName("cards_max")
	val cardsMax: Long? = null,
	@SerialName("cards_games_min")
	val cardsGamesMin: Long? = null,
	@SerialName("cards_games_max")
	val cardsGamesMax: Long? = null,
	@SerialName("skip_vac_inv")
	val skipVacInv: Boolean? = null,
)

@Serializable
data class CategorySteamResponse(
	val items: List<CategorySteamResponseItems>? = null,
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
data class CategorySteamResponseItemsSteamFullGamesList730(
	val appid: Long,
	@SerialName("playtime_forever")
	val playtimeForever: Double,
	@SerialName("internal_game_id")
	val internalGameId: Long,
	val abbr: String,
	val title: String,
	val parentGameId: Long,
	val img: String,
)

@Serializable
data class CategorySteamResponseItemsSteamFullGamesList(
	@SerialName("730")
	val `730`: CategorySteamResponseItemsSteamFullGamesList730,
)

@Serializable
data class CategorySteamResponseItemsSteamFullGames(
	val list: CategorySteamResponseItemsSteamFullGamesList,
	val total: Long,
)

@Serializable
data class CategorySteamResponseItemsGuarantee(
	val duration: Long,
	val `class`: String,
	val durationPhrase: String,
	val endDate: JsonElement,
	val active: JsonElement,
	val cancelled: JsonElement,
	val remainingTime: JsonElement,
)

@Serializable
data class CategorySteamResponseItemsBumpSettings(
	val canBumpItem: Boolean,
	val canBumpItemGlobally: Boolean,
	val shortErrorPhrase: JsonElement,
	val errorPhrase: JsonElement,
)

@Serializable
data class CategorySteamResponseItemsSteamData(
	@SerialName("steam_ban_type_id")
	val steamBanTypeId: List<JsonElement>,
)

@Serializable
data class CategorySteamResponseItemsSteamTransactions(
	val date: String,
	val product: String,
	val type: String,
	val source: String,
	val amount: String,
)

@Serializable
data class CategorySteamResponseItemsAccountLinks(
	val link: String,
	val text: String,
	val iconClass: String,
)

@Serializable
data class CategorySteamResponseItemsSeller(
	@SerialName("user_id")
	val userId: Long,
	@SerialName("sold_items_count")
	val soldItemsCount: Long,
	@SerialName("active_items_count")
	val activeItemsCount: Long,
	@SerialName("restore_data")
	val restoreData: String,
	val username: String,
	@SerialName("avatar_date")
	val avatarDate: Long,
	@SerialName("is_banned")
	val isBanned: Long,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Long,
	@SerialName("restore_percents")
	val restorePercents: Long,
)

@Serializable
data class CategorySteamResponseItems(
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
	@SerialName("view_count")
	val viewCount: Long,
	@SerialName("is_sticky")
	val isSticky: Long,
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
	@SerialName("email_type")
	val emailType: String,
	@SerialName("email_provider")
	val emailProvider: String,
	@SerialName("item_domain")
	val itemDomain: String,
	@SerialName("resale_item_origin")
	val resaleItemOrigin: String,
	@SerialName("steam_item_id")
	val steamItemId: Long,
	@SerialName("steam_country")
	val steamCountry: String,
	@SerialName("steam_register_date")
	val steamRegisterDate: Long,
	@SerialName("steam_last_activity")
	val steamLastActivity: Long,
	@SerialName("steam_full_games")
	val steamFullGames: CategorySteamResponseItemsSteamFullGames,
	@SerialName("steam_community_ban")
	val steamCommunityBan: Long,
	@SerialName("steam_bans")
	val steamBans: String,
	@SerialName("steam_cs2_profile_rank")
	val steamCs2ProfileRank: Long,
	@SerialName("steam_balance")
	val steamBalance: String,
	@SerialName("steam_cs2_rank_id")
	val steamCs2RankId: Long,
	@SerialName("steam_is_limited")
	val steamIsLimited: Long,
	@SerialName("steam_level")
	val steamLevel: Long,
	@SerialName("steam_friend_count")
	val steamFriendCount: Long,
	@SerialName("steam_cs2_last_activity")
	val steamCs2LastActivity: Long,
	@SerialName("steam_dota2_solo_mmr")
	val steamDota2SoloMmr: Long,
	@SerialName("steam_cs2_ban_date")
	val steamCs2BanDate: Long,
	@SerialName("steam_converted_balance")
	val steamConvertedBalance: Long,
	@SerialName("steam_cards_count")
	val steamCardsCount: Long,
	@SerialName("steam_cards_games")
	val steamCardsGames: Long,
	@SerialName("steam_pubg_inv_value")
	val steamPubgInvValue: Long,
	@SerialName("steam_cs2_inv_value")
	val steamCs2InvValue: Long,
	@SerialName("steam_dota2_inv_value")
	val steamDota2InvValue: Long,
	@SerialName("steam_tf2_inv_value")
	val steamTf2InvValue: Long,
	@SerialName("steam_rust_inv_value")
	val steamRustInvValue: Long,
	@SerialName("steam_cs2_wingman_rank_id")
	val steamCs2WingmanRankId: Long,
	@SerialName("steam_game_count")
	val steamGameCount: Long,
	@SerialName("steam_steam_inv_value")
	val steamSteamInvValue: Long,
	@SerialName("steam_inv_value")
	val steamInvValue: Long,
	@SerialName("steam_cs2_win_count")
	val steamCs2WinCount: Long,
	@SerialName("steam_dota2_game_count")
	val steamDota2GameCount: Long,
	@SerialName("steam_dota2_lose_count")
	val steamDota2LoseCount: Long,
	@SerialName("steam_dota2_win_count")
	val steamDota2WinCount: Long,
	@SerialName("steam_hours_played_recently")
	val steamHoursPlayedRecently: String,
	@SerialName("steam_faceit_level")
	val steamFaceitLevel: Long,
	@SerialName("steam_points")
	val steamPoints: Long,
	@SerialName("steam_last_transaction_date")
	val steamLastTransactionDate: Long,
	@SerialName("steam_relevant_game_count")
	val steamRelevantGameCount: Long,
	@SerialName("steam_gift_count")
	val steamGiftCount: Long,
	@SerialName("steam_limit_spent")
	val steamLimitSpent: String,
	@SerialName("steam_dota2_behavior")
	val steamDota2Behavior: Long,
	@SerialName("steam_mfa")
	val steamMfa: Long,
	@SerialName("steam_market")
	val steamMarket: Long,
	@SerialName("steam_market_restrictions")
	val steamMarketRestrictions: Long,
	@SerialName("steam_market_ban_end_date")
	val steamMarketBanEndDate: Long,
	@SerialName("steam_unturned_inv_value")
	val steamUnturnedInvValue: Long,
	@SerialName("steam_cs2_last_launched")
	val steamCs2LastLaunched: Long,
	@SerialName("steam_kf2_inv_value")
	val steamKf2InvValue: Long,
	@SerialName("steam_dst_inv_value")
	val steamDstInvValue: Long,
	@SerialName("steam_cs2_premier_elo")
	val steamCs2PremierElo: Long,
	@SerialName("steam_has_activated_keys")
	val steamHasActivatedKeys: Long,
	@SerialName("steam_cs2_ban_type")
	val steamCs2BanType: Long,
	@SerialName("steam_rust_kill_player")
	val steamRustKillPlayer: Long,
	@SerialName("steam_rust_deaths")
	val steamRustDeaths: Long,
	@SerialName("steam_total_gifts_rub")
	val steamTotalGiftsRub: Long,
	@SerialName("steam_total_refunds_rub")
	val steamTotalRefundsRub: Long,
	@SerialName("steam_total_ingame_rub")
	val steamTotalIngameRub: Long,
	@SerialName("steam_total_games_rub")
	val steamTotalGamesRub: Long,
	@SerialName("steam_total_purchased_rub")
	val steamTotalPurchasedRub: Long,
	@SerialName("steam_dota2_last_match_date")
	val steamDota2LastMatchDate: Long,
	@SerialName("feedback_data")
	val feedbackData: String,
	val isIgnored: Boolean,
	val priceWithSellerFee: Long,
	val guarantee: CategorySteamResponseItemsGuarantee,
	val canViewLoginData: Boolean,
	val canUpdateItemStats: Boolean,
	val canReportItem: Boolean,
	val canViewEmailLoginData: Boolean,
	val showGetEmailCodeButton: Boolean,
	val canOpenItem: Boolean,
	val canCloseItem: Boolean,
	val canEditItem: Boolean,
	val canDeleteItem: Boolean,
	val canStickItem: Boolean,
	val canUnstickItem: Boolean,
	val bumpSettings: CategorySteamResponseItemsBumpSettings,
	val canBumpItem: Boolean,
	val canBuyItem: Boolean,
	@SerialName("rub_price")
	val rubPrice: Long,
	@SerialName("price_currency")
	val priceCurrency: String,
	val canValidateAccount: Boolean,
	val canResellItemAfterPurchase: Boolean,
	val steamData: CategorySteamResponseItemsSteamData,
	val isSmallExf: Boolean,
	@SerialName("account_last_activity")
	val accountLastActivity: Long,
	val hasCs2: Boolean,
	val hasDota2: Boolean,
	val hasPubg: Boolean,
	val hasTf2: Boolean,
	val hasRust: Boolean,
	@SerialName("steam_cs2_ban_date_active")
	val steamCs2BanDateActive: Boolean,
	val dota2CalibrationWarning: Boolean,
	val displayConvertedBalance: Boolean,
	val inventoryValue: List<JsonElement>,
	val steamCs2Medals: List<JsonElement>,
	val cs2RankExpired: Boolean,
	val steamDota2WinRate: Long,
	val steamTransactions: List<CategorySteamResponseItemsSteamTransactions>,
	val hasPossibleBanInDota2: Boolean,
	val chineseAccount: Boolean,
	val cs2MapsRanks: List<JsonElement>,
	val cs2PremierElo: List<JsonElement>,
	val steamLifetimeTradeBan: Boolean,
	val canViewAccountLink: Boolean,
	val accountLinks: List<CategorySteamResponseItemsAccountLinks>,
	val accountLink: String,
	val emailLoginUrl: String,
	val canChangePassword: Boolean,
	val itemOriginPhrase: String,
	@SerialName("sold_items_category_count")
	val soldItemsCategoryCount: Long,
	@SerialName("restore_items_category_count")
	val restoreItemsCategoryCount: Long,
	val tags: List<JsonElement>,
	@SerialName("note_text")
	val noteText: JsonElement,
	val hasPendingAutoBuy: Boolean,
	val descriptionHtml: String,
	val descriptionEnHtml: String,
	val descriptionPlain: String,
	val descriptionEnPlain: String,
	val seller: CategorySteamResponseItemsSeller,
)

@Serializable
data class CategoryFortniteParams(
	val page: Long? = null,
	val pmin: Long? = null,
	val pmax: Long? = null,
	val title: String? = null,
	@SerialName("order_by")
	val orderBy: String? = null,
	@SerialName("tag_id[]")
	val tagId: List<Long>? = null,
	@SerialName("not_tag_id[]")
	val notTagId: List<Long>? = null,
	@SerialName("public_tag_id[]")
	val publicTagId: List<Long>? = null,
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Long>? = null,
	@SerialName("origin[]")
	val origin: JsonElement? = null,
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
	@SerialName("user_id")
	val userId: Long? = null,
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
	val eg: Long? = null,
	val smin: Long? = null,
	val smax: Long? = null,
	val vbmin: Long? = null,
	val vbmax: Long? = null,
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
	val skinsShopMin: Long? = null,
	@SerialName("skins_shop_max")
	val skinsShopMax: Long? = null,
	@SerialName("pickaxes_shop_min")
	val pickaxesShopMin: Long? = null,
	@SerialName("pickaxes_shop_max")
	val pickaxesShopMax: Long? = null,
	@SerialName("dances_shop_min")
	val dancesShopMin: Long? = null,
	@SerialName("dances_shop_max")
	val dancesShopMax: Long? = null,
	@SerialName("gliders_shop_min")
	val glidersShopMin: Long? = null,
	@SerialName("gliders_shop_max")
	val glidersShopMax: Long? = null,
	@SerialName("skins_shop_vbmin")
	val skinsShopVbmin: Long? = null,
	@SerialName("skins_shop_vbmax")
	val skinsShopVbmax: Long? = null,
	@SerialName("pickaxes_shop_vbmin")
	val pickaxesShopVbmin: Long? = null,
	@SerialName("pickaxes_shop_vbmax")
	val pickaxesShopVbmax: Long? = null,
	@SerialName("dances_shop_vbmin")
	val dancesShopVbmin: Long? = null,
	@SerialName("dances_shop_vbmax")
	val dancesShopVbmax: Long? = null,
	@SerialName("gliders_shop_vbmin")
	val glidersShopVbmin: Long? = null,
	@SerialName("gliders_shop_vbmax")
	val glidersShopVbmax: Long? = null,
	val bp: String? = null,
	val lmin: Long? = null,
	val lmax: Long? = null,
	@SerialName("bp_lmin")
	val bpLmin: Long? = null,
	@SerialName("bp_lmax")
	val bpLmax: Long? = null,
	@SerialName("last_trans_date")
	val lastTransDate: Long? = null,
	@SerialName("last_trans_date_period")
	val lastTransDatePeriod: String? = null,
	@SerialName("no_trans")
	val noTrans: Boolean? = null,
	@SerialName("xbox_linkable")
	val xboxLinkable: String? = null,
	@SerialName("psn_linkable")
	val psnLinkable: String? = null,
	val daybreak: Long? = null,
	@SerialName("rl_purchases")
	val rlPurchases: Boolean? = null,
	val reg: Long? = null,
	@SerialName("reg_period")
	val regPeriod: String? = null,
	@SerialName("refund_credits_min")
	val refundCreditsMin: Long? = null,
	@SerialName("refund_credits_max")
	val refundCreditsMax: Long? = null,
	@SerialName("pickaxe_min")
	val pickaxeMin: Long? = null,
	@SerialName("pickaxe_max")
	val pickaxeMax: Long? = null,
	val dmin: Long? = null,
	val dmax: Long? = null,
	val gmin: Long? = null,
	val gmax: Long? = null,
	@SerialName("country[]")
	val country: List<String>? = null,
	@SerialName("not_country[]")
	val notCountry: List<String>? = null,
)

@Serializable
data class CategoryFortniteResponse(
	val items: List<CategoryFortniteResponseItems>? = null,
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
data class CategoryFortniteResponseItemsBumpSettings(
	val canBumpItem: Boolean,
	val canBumpItemGlobally: Boolean,
	val shortErrorPhrase: JsonElement,
	val errorPhrase: JsonElement,
)

@Serializable
data class CategoryFortniteResponseItemsFortniteSkins(
	val id: String,
	val title: String,
	val rarity: String,
	val type: String,
	@SerialName("from_shop")
	val fromShop: Long,
)

@Serializable
data class CategoryFortniteResponseItemsFortnitePickaxe(
	val id: String,
	val title: String,
	val rarity: String,
	val type: String,
	@SerialName("from_shop")
	val fromShop: Long,
)

@Serializable
data class CategoryFortniteResponseItemsFortniteDance(
	val id: String,
	val title: String,
	val rarity: String,
	val type: String,
	@SerialName("from_shop")
	val fromShop: Long,
)

@Serializable
data class CategoryFortniteResponseItemsFortniteGliders(
	val id: String,
	val title: String,
	val rarity: String,
	val type: String,
	@SerialName("from_shop")
	val fromShop: Long,
)

@Serializable
data class CategoryFortniteResponseItemsFortnitePastSeasons(
	val numWins: Long,
	val seasonXp: Long,
	val purchasedVIP: Boolean,
	val survivorPrestige: Long,
	val seasonLevel: Long,
	val numLowBracket: Long,
	val bookLevel: Long,
	val numRoyalRoyales: Long,
	val seasonNumber: Long,
	val survivorTier: Long,
	val numHighBracket: Long,
)

@Serializable
data class CategoryFortniteResponseItemsFortniteTransactions(
	val date: Long,
	val title: String,
	val presentmentTotal: String,
	val orderType: String,
)

@Serializable
data class CategoryFortniteResponseItemsShopCounts(
	val shopSkinsCount: Long,
	val shopPickaxesCount: Long,
	val shopDancesCount: Long,
	val shopGlidersCount: Long,
)

@Serializable
data class CategoryFortniteResponseItemsSeller(
	@SerialName("user_id")
	val userId: Long,
	@SerialName("sold_items_count")
	val soldItemsCount: Long,
	@SerialName("active_items_count")
	val activeItemsCount: Long,
	@SerialName("restore_data")
	val restoreData: String,
	val username: String,
	@SerialName("avatar_date")
	val avatarDate: Long,
	@SerialName("is_banned")
	val isBanned: Long,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Long,
	@SerialName("restore_percents")
	val restorePercents: Long,
)

@Serializable
data class CategoryFortniteResponseItems(
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
	@SerialName("view_count")
	val viewCount: Long,
	@SerialName("is_sticky")
	val isSticky: Long,
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
	@SerialName("email_type")
	val emailType: String,
	@SerialName("email_provider")
	val emailProvider: String,
	@SerialName("item_domain")
	val itemDomain: String,
	@SerialName("resale_item_origin")
	val resaleItemOrigin: String,
	@SerialName("fortnite_item_id")
	val fortniteItemId: Long,
	@SerialName("fortnite_platform")
	val fortnitePlatform: String,
	@SerialName("fortnite_register_date")
	val fortniteRegisterDate: Long,
	@SerialName("fortnite_last_activity")
	val fortniteLastActivity: Long,
	@SerialName("fortnite_book_level")
	val fortniteBookLevel: Long,
	@SerialName("fortnite_lifetime_wins")
	val fortniteLifetimeWins: Long,
	@SerialName("fortnite_level")
	val fortniteLevel: Long,
	@SerialName("fortnite_season_num")
	val fortniteSeasonNum: Long,
	@SerialName("fortnite_books_purchased")
	val fortniteBooksPurchased: Long,
	@SerialName("fortnite_balance")
	val fortniteBalance: Long,
	@SerialName("fortnite_skin_count")
	val fortniteSkinCount: Long,
	@SerialName("fortnite_change_email")
	val fortniteChangeEmail: Long,
	@SerialName("fortnite_rl_purchases")
	val fortniteRlPurchases: Long,
	@SerialName("fortnite_next_change_email_date")
	val fortniteNextChangeEmailDate: Long,
	@SerialName("fortnite_last_trans_date")
	val fortniteLastTransDate: Long,
	@SerialName("fortnite_xbox_linkable")
	val fortniteXboxLinkable: Long,
	@SerialName("fortnite_psn_linkable")
	val fortnitePsnLinkable: Long,
	@SerialName("fortnite_shop_skins_count")
	val fortniteShopSkinsCount: Long,
	@SerialName("fortnite_shop_pickaxes_count")
	val fortniteShopPickaxesCount: Long,
	@SerialName("fortnite_shop_dances_count")
	val fortniteShopDancesCount: Long,
	@SerialName("fortnite_shop_gliders_count")
	val fortniteShopGlidersCount: Long,
	@SerialName("feedback_data")
	val feedbackData: String,
	val isIgnored: Boolean,
	val priceWithSellerFee: Long,
	val guarantee: JsonElement,
	val canViewLoginData: Boolean,
	val canUpdateItemStats: Boolean,
	val canReportItem: Boolean,
	val canViewEmailLoginData: Boolean,
	val showGetEmailCodeButton: Boolean,
	val canOpenItem: Boolean,
	val canCloseItem: Boolean,
	val canEditItem: Boolean,
	val canDeleteItem: Boolean,
	val canStickItem: Boolean,
	val canUnstickItem: Boolean,
	val bumpSettings: CategoryFortniteResponseItemsBumpSettings,
	val canBumpItem: Boolean,
	val canBuyItem: Boolean,
	@SerialName("rub_price")
	val rubPrice: Long,
	@SerialName("price_currency")
	val priceCurrency: String,
	val canValidateAccount: Boolean,
	val canResellItemAfterPurchase: Boolean,
	val fortniteSkins: List<CategoryFortniteResponseItemsFortniteSkins>,
	val fortnitePickaxe: List<CategoryFortniteResponseItemsFortnitePickaxe>,
	val fortniteDance: List<CategoryFortniteResponseItemsFortniteDance>,
	val fortniteGliders: List<CategoryFortniteResponseItemsFortniteGliders>,
	@SerialName("fortnite_pickaxe_count")
	val fortnitePickaxeCount: Long,
	@SerialName("fortnite_dance_count")
	val fortniteDanceCount: Long,
	@SerialName("fortnite_glider_count")
	val fortniteGliderCount: Long,
	val fortnitePastSeasons: List<CategoryFortniteResponseItemsFortnitePastSeasons>,
	val isSmallExf: Boolean,
	@SerialName("account_last_activity")
	val accountLastActivity: Long,
	val fortniteTransactions: List<CategoryFortniteResponseItemsFortniteTransactions>,
	val domain: String,
	val shopCounts: CategoryFortniteResponseItemsShopCounts,
	val canViewAccountLink: Boolean,
	val accountLinks: List<JsonElement>,
	val emailLoginUrl: String,
	val canChangePassword: Boolean,
	val itemOriginPhrase: String,
	@SerialName("sold_items_category_count")
	val soldItemsCategoryCount: Long,
	@SerialName("restore_items_category_count")
	val restoreItemsCategoryCount: Long,
	val tags: List<JsonElement>,
	@SerialName("note_text")
	val noteText: JsonElement,
	val hasPendingAutoBuy: Boolean,
	val descriptionHtml: String,
	val descriptionEnHtml: String,
	val descriptionPlain: String,
	val descriptionEnPlain: String,
	val seller: CategoryFortniteResponseItemsSeller,
)

@Serializable
data class CategoryMihoyoParams(
	val page: Long? = null,
	val pmin: Long? = null,
	val pmax: Long? = null,
	val title: String? = null,
	@SerialName("order_by")
	val orderBy: String? = null,
	@SerialName("tag_id[]")
	val tagId: List<Long>? = null,
	@SerialName("not_tag_id[]")
	val notTagId: List<Long>? = null,
	@SerialName("public_tag_id[]")
	val publicTagId: List<Long>? = null,
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Long>? = null,
	@SerialName("origin[]")
	val origin: JsonElement? = null,
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
	@SerialName("user_id")
	val userId: Long? = null,
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
	val genshinCharacter: List<Long>? = null,
	@SerialName("genshin_character_constellations")
	val genshinCharacterConstellations: Map<String, Long>? = null,
	@SerialName("genshin_character_constellations_max")
	val genshinCharacterConstellationsMax: Map<String, Long>? = null,
	@SerialName("genshin_weapon[]")
	val genshinWeapon: List<Long>? = null,
	@SerialName("genshin_char_min")
	val genshinCharMin: Long? = null,
	@SerialName("genshin_char_max")
	val genshinCharMax: Long? = null,
	@SerialName("genshin_legendary_min")
	val genshinLegendaryMin: Long? = null,
	@SerialName("genshin_legendary_max")
	val genshinLegendaryMax: Long? = null,
	@SerialName("genshin_level_min")
	val genshinLevelMin: Long? = null,
	@SerialName("genshin_level_max")
	val genshinLevelMax: Long? = null,
	@SerialName("genshin_legendary_weapon_min")
	val genshinLegendaryWeaponMin: Long? = null,
	@SerialName("genshin_legendary_weapon_max")
	val genshinLegendaryWeaponMax: Long? = null,
	@SerialName("constellations_min")
	val constellationsMin: Long? = null,
	@SerialName("constellations_max")
	val constellationsMax: Long? = null,
	@SerialName("genshin_achievement_min")
	val genshinAchievementMin: Long? = null,
	@SerialName("genshin_achievement_max")
	val genshinAchievementMax: Long? = null,
	@SerialName("genshin_currency_min")
	val genshinCurrencyMin: Long? = null,
	@SerialName("genshin_currency_max")
	val genshinCurrencyMax: Long? = null,
	@SerialName("honkai_character[]")
	val honkaiCharacter: List<Long>? = null,
	@SerialName("honkai_character_eidolons")
	val honkaiCharacterEidolons: Map<String, Long>? = null,
	@SerialName("honkai_character_eidolons_max")
	val honkaiCharacterEidolonsMax: Map<String, Long>? = null,
	@SerialName("honkai_weapon[]")
	val honkaiWeapon: List<Long>? = null,
	@SerialName("honkai_char_min")
	val honkaiCharMin: Long? = null,
	@SerialName("honkai_char_max")
	val honkaiCharMax: Long? = null,
	@SerialName("honkai_legendary_min")
	val honkaiLegendaryMin: Long? = null,
	@SerialName("honkai_legendary_max")
	val honkaiLegendaryMax: Long? = null,
	@SerialName("honkai_level_min")
	val honkaiLevelMin: Long? = null,
	@SerialName("honkai_level_max")
	val honkaiLevelMax: Long? = null,
	@SerialName("honkai_legendary_weapon_min")
	val honkaiLegendaryWeaponMin: Long? = null,
	@SerialName("honkai_legendary_weapon_max")
	val honkaiLegendaryWeaponMax: Long? = null,
	@SerialName("eidolons_min")
	val eidolonsMin: Long? = null,
	@SerialName("eidolons_max")
	val eidolonsMax: Long? = null,
	@SerialName("honkai_achievement_min")
	val honkaiAchievementMin: Long? = null,
	@SerialName("honkai_achievement_max")
	val honkaiAchievementMax: Long? = null,
	@SerialName("honkai_currency_min")
	val honkaiCurrencyMin: Long? = null,
	@SerialName("honkai_currency_max")
	val honkaiCurrencyMax: Long? = null,
	@SerialName("zenless_character[]")
	val zenlessCharacter: List<Long>? = null,
	@SerialName("zenless_character_cinemas")
	val zenlessCharacterCinemas: Map<String, Long>? = null,
	@SerialName("zenless_character_cinemas_max")
	val zenlessCharacterCinemasMax: Map<String, Long>? = null,
	@SerialName("zenless_weapon[]")
	val zenlessWeapon: List<Long>? = null,
	@SerialName("zenless_legendary_min")
	val zenlessLegendaryMin: Long? = null,
	@SerialName("zenless_legendary_max")
	val zenlessLegendaryMax: Long? = null,
	@SerialName("cinemas_min")
	val cinemasMin: Long? = null,
	@SerialName("cinemas_max")
	val cinemasMax: Long? = null,
	@SerialName("zenless_legendary_weapon_min")
	val zenlessLegendaryWeaponMin: Long? = null,
	@SerialName("zenless_legendary_weapon_max")
	val zenlessLegendaryWeaponMax: Long? = null,
	@SerialName("zenless_char_min")
	val zenlessCharMin: Long? = null,
	@SerialName("zenless_char_max")
	val zenlessCharMax: Long? = null,
	@SerialName("zenless_level_min")
	val zenlessLevelMin: Long? = null,
	@SerialName("zenless_level_max")
	val zenlessLevelMax: Long? = null,
	@SerialName("zenless_achievement_min")
	val zenlessAchievementMin: Long? = null,
	@SerialName("zenless_achievement_max")
	val zenlessAchievementMax: Long? = null,
	@SerialName("zenless_currency_min")
	val zenlessCurrencyMin: Long? = null,
	@SerialName("zenless_currency_max")
	val zenlessCurrencyMax: Long? = null,
	val daybreak: Long? = null,
)

@Serializable
data class CategoryMihoyoResponse(
	val items: List<CategoryMihoyoResponseItems>? = null,
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
data class CategoryMihoyoResponseItemsBumpSettings(
	val canBumpItem: Boolean,
	val canBumpItemGlobally: Boolean,
	val shortErrorPhrase: JsonElement,
	val errorPhrase: JsonElement,
)

@Serializable
data class CategoryMihoyoResponseItemsMihoyoLinkedAccounts(
	val links: List<String>,
	val legacy: Boolean,
)

@Serializable
data class CategoryMihoyoResponseItemsHonkaiCharactersEquip(
	val id: Long,
	val level: Long,
	val rank: Long,
	val name: String,
	val desc: String,
	val icon: String,
	val rarity: Long,
)

@Serializable
data class CategoryMihoyoResponseItemsHonkaiCharactersRelicsMainProperty(
	@SerialName("property_type")
	val propertyType: Long,
	val value: String,
	val times: Long,
)

@Serializable
data class CategoryMihoyoResponseItemsHonkaiCharactersRelicsProperties(
	@SerialName("property_type")
	val propertyType: Long,
	val value: String,
	val times: Long,
)

@Serializable
data class CategoryMihoyoResponseItemsHonkaiCharactersRelics(
	val id: Long,
	val level: Long,
	val pos: Long,
	val name: String,
	val desc: String,
	val icon: String,
	val rarity: Long,
	@SerialName("main_property")
	val mainProperty: CategoryMihoyoResponseItemsHonkaiCharactersRelicsMainProperty,
	val properties: List<CategoryMihoyoResponseItemsHonkaiCharactersRelicsProperties>,
)

@Serializable
data class CategoryMihoyoResponseItemsHonkaiCharactersOrnamentsMainProperty(
	@SerialName("property_type")
	val propertyType: Long,
	val value: String,
	val times: Long,
)

@Serializable
data class CategoryMihoyoResponseItemsHonkaiCharactersOrnamentsProperties(
	@SerialName("property_type")
	val propertyType: Long,
	val value: String,
	val times: Long,
)

@Serializable
data class CategoryMihoyoResponseItemsHonkaiCharactersOrnaments(
	val id: Long,
	val level: Long,
	val pos: Long,
	val name: String,
	val desc: String,
	val icon: String,
	val rarity: Long,
	@SerialName("main_property")
	val mainProperty: CategoryMihoyoResponseItemsHonkaiCharactersOrnamentsMainProperty,
	val properties: List<CategoryMihoyoResponseItemsHonkaiCharactersOrnamentsProperties>,
)

@Serializable
data class CategoryMihoyoResponseItemsHonkaiCharacters(
	val id: Long,
	val level: Long,
	val name: String,
	val element: String,
	val icon: String,
	val rarity: Long,
	val rank: Long,
	val image: String,
	val equip: CategoryMihoyoResponseItemsHonkaiCharactersEquip,
	val relics: List<CategoryMihoyoResponseItemsHonkaiCharactersRelics>,
	val ornaments: List<CategoryMihoyoResponseItemsHonkaiCharactersOrnaments>,
	@SerialName("base_type")
	val baseType: Long,
	@SerialName("figure_path")
	val figurePath: String,
	val elementImage: String,
)

@Serializable
data class CategoryMihoyoResponseItemsGenshinCharactersWeapon(
	val id: Long,
	val name: String,
	val icon: String,
	val type: Long,
	val rarity: Long,
	val level: Long,
	@SerialName("promote_level")
	val promoteLevel: Long,
	@SerialName("type_name")
	val typeName: String,
	val desc: String,
	@SerialName("affix_level")
	val affixLevel: Long,
)

@Serializable
data class CategoryMihoyoResponseItemsGenshinCharactersReliquaries(
	val id: Long,
	val name: String,
	val icon: String,
	val pos: Long,
	val rarity: Long,
	val level: Long,
	@SerialName("pos_name")
	val posName: String,
)

@Serializable
data class CategoryMihoyoResponseItemsGenshinCharacters(
	val id: Long,
	val image: String,
	val icon: String,
	val name: String,
	val element: String,
	val fetter: Long,
	val level: Long,
	val rarity: Long,
	val weapon: CategoryMihoyoResponseItemsGenshinCharactersWeapon,
	val reliquaries: List<CategoryMihoyoResponseItemsGenshinCharactersReliquaries>,
	@SerialName("actived_constellation_num")
	val activedConstellationNum: Long,
	val costumes: List<JsonElement>,
	val external: JsonElement,
	val background: String,
)

@Serializable
data class CategoryMihoyoResponseItemsZenlessCharactersWeaponProperties(
	@SerialName("property_name")
	val propertyName: String,
	@SerialName("property_id")
	val propertyId: Long,
	val base: String,
)

@Serializable
data class CategoryMihoyoResponseItemsZenlessCharactersWeaponMainProperties(
	@SerialName("property_name")
	val propertyName: String,
	@SerialName("property_id")
	val propertyId: Long,
	val base: String,
)

@Serializable
data class CategoryMihoyoResponseItemsZenlessCharactersWeapon(
	val id: Long,
	val level: Long,
	val name: String,
	val star: Long,
	val icon: String,
	val rarity: Long,
	val properties: List<CategoryMihoyoResponseItemsZenlessCharactersWeaponProperties>,
	@SerialName("main_properties")
	val mainProperties: List<CategoryMihoyoResponseItemsZenlessCharactersWeaponMainProperties>,
	@SerialName("talent_title")
	val talentTitle: String,
	@SerialName("talent_content")
	val talentContent: String,
	val profession: Long,
	val starIcon: String,
	val rarityIcon: String,
)

@Serializable
data class CategoryMihoyoResponseItemsZenlessCharacters(
	val id: Long,
	val level: Long,
	@SerialName("name_mi18n")
	val nameMi18n: String,
	@SerialName("full_name_mi18n")
	val fullNameMi18n: String,
	@SerialName("element_type")
	val elementType: Long,
	@SerialName("camp_name_mi18n")
	val campNameMi18n: String,
	@SerialName("avatar_profession")
	val avatarProfession: Long,
	val rarity: Long,
	val weapon: CategoryMihoyoResponseItemsZenlessCharactersWeapon,
	val rank: Long,
	val name: String,
	val rarityIcon: String,
	val elementIcon: String,
	val professionIcon: String,
)

@Serializable
data class CategoryMihoyoResponseItemsAccountLinks(
	val link: String,
	val text: String,
	val iconClass: String,
)

@Serializable
data class CategoryMihoyoResponseItemsSeller(
	@SerialName("user_id")
	val userId: Long,
	@SerialName("sold_items_count")
	val soldItemsCount: Long,
	@SerialName("active_items_count")
	val activeItemsCount: Long,
	@SerialName("restore_data")
	val restoreData: String,
	val username: String,
	@SerialName("avatar_date")
	val avatarDate: Long,
	@SerialName("is_banned")
	val isBanned: Long,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Long,
	@SerialName("restore_percents")
	val restorePercents: Long,
)

@Serializable
data class CategoryMihoyoResponseItems(
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
	@SerialName("view_count")
	val viewCount: Long,
	@SerialName("is_sticky")
	val isSticky: Long,
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
	@SerialName("email_type")
	val emailType: String,
	@SerialName("email_provider")
	val emailProvider: String,
	@SerialName("item_domain")
	val itemDomain: String,
	@SerialName("resale_item_origin")
	val resaleItemOrigin: String,
	@SerialName("mihoyo_item_id")
	val mihoyoItemId: Long,
	@SerialName("mihoyo_id")
	val mihoyoId: Long,
	@SerialName("mihoyo_email")
	val mihoyoEmail: Long,
	@SerialName("mihoyo_has_linked_accounts")
	val mihoyoHasLinkedAccounts: Long,
	@SerialName("mihoyo_region")
	val mihoyoRegion: String,
	@SerialName("mihoyo_last_activity")
	val mihoyoLastActivity: Long,
	@SerialName("mihoyo_genshin_level")
	val mihoyoGenshinLevel: Long,
	@SerialName("mihoyo_genshin_character_count")
	val mihoyoGenshinCharacterCount: Long,
	@SerialName("mihoyo_genshin_achievement_count")
	val mihoyoGenshinAchievementCount: Long,
	@SerialName("mihoyo_genshin_abyss_process")
	val mihoyoGenshinAbyssProcess: String,
	@SerialName("mihoyo_genshin_legendary_characters_count")
	val mihoyoGenshinLegendaryCharactersCount: Long,
	@SerialName("mihoyo_genshin_constellations_count")
	val mihoyoGenshinConstellationsCount: Long,
	@SerialName("mihoyo_genshin_legendary_weapons_count")
	val mihoyoGenshinLegendaryWeaponsCount: Long,
	@SerialName("mihoyo_genshin_activity_days")
	val mihoyoGenshinActivityDays: Long,
	@SerialName("mihoyo_genshin_currency")
	val mihoyoGenshinCurrency: Long,
	@SerialName("mihoyo_honkai_level")
	val mihoyoHonkaiLevel: Long,
	@SerialName("mihoyo_honkai_character_count")
	val mihoyoHonkaiCharacterCount: Long,
	@SerialName("mihoyo_honkai_achievement_count")
	val mihoyoHonkaiAchievementCount: Long,
	@SerialName("mihoyo_honkai_abyss_process")
	val mihoyoHonkaiAbyssProcess: String,
	@SerialName("mihoyo_honkai_legendary_characters_count")
	val mihoyoHonkaiLegendaryCharactersCount: Long,
	@SerialName("mihoyo_honkai_eidolons_count")
	val mihoyoHonkaiEidolonsCount: Long,
	@SerialName("mihoyo_honkai_legendary_weapons_count")
	val mihoyoHonkaiLegendaryWeaponsCount: Long,
	@SerialName("mihoyo_honkai_activity_days")
	val mihoyoHonkaiActivityDays: Long,
	@SerialName("mihoyo_honkai_currency")
	val mihoyoHonkaiCurrency: Long,
	@SerialName("mihoyo_zenless_level")
	val mihoyoZenlessLevel: Long,
	@SerialName("mihoyo_zenless_character_count")
	val mihoyoZenlessCharacterCount: Long,
	@SerialName("mihoyo_zenless_achievement_count")
	val mihoyoZenlessAchievementCount: Long,
	@SerialName("mihoyo_zenless_abyss_process")
	val mihoyoZenlessAbyssProcess: String,
	@SerialName("mihoyo_zenless_legendary_characters_count")
	val mihoyoZenlessLegendaryCharactersCount: Long,
	@SerialName("mihoyo_zenless_cinemas_count")
	val mihoyoZenlessCinemasCount: Long,
	@SerialName("mihoyo_zenless_legendary_weapons_count")
	val mihoyoZenlessLegendaryWeaponsCount: Long,
	@SerialName("mihoyo_zenless_activity_days")
	val mihoyoZenlessActivityDays: Long,
	@SerialName("mihoyo_zenless_currency")
	val mihoyoZenlessCurrency: Long,
	@SerialName("feedback_data")
	val feedbackData: String,
	val isIgnored: Boolean,
	val priceWithSellerFee: Long,
	val guarantee: JsonElement,
	val canViewLoginData: Boolean,
	val canUpdateItemStats: Boolean,
	val canReportItem: Boolean,
	val canViewEmailLoginData: Boolean,
	val showGetEmailCodeButton: Boolean,
	val canOpenItem: Boolean,
	val canCloseItem: Boolean,
	val canEditItem: Boolean,
	val canDeleteItem: Boolean,
	val canStickItem: Boolean,
	val canUnstickItem: Boolean,
	val bumpSettings: CategoryMihoyoResponseItemsBumpSettings,
	val canBumpItem: Boolean,
	val canBuyItem: Boolean,
	@SerialName("rub_price")
	val rubPrice: Long,
	@SerialName("price_currency")
	val priceCurrency: String,
	val canValidateAccount: Boolean,
	val canResellItemAfterPurchase: Boolean,
	val mihoyoRegionPhrase: String,
	val mihoyoLinkedAccounts: CategoryMihoyoResponseItemsMihoyoLinkedAccounts,
	val mihoyoLinkedAccountsString: String,
	val honkaiCharacters: List<CategoryMihoyoResponseItemsHonkaiCharacters>,
	val genshinCharacters: List<CategoryMihoyoResponseItemsGenshinCharacters>,
	val zenlessCharacters: List<CategoryMihoyoResponseItemsZenlessCharacters>,
	val canViewAccountLink: Boolean,
	val accountLinks: List<CategoryMihoyoResponseItemsAccountLinks>,
	val accountLink: String,
	val emailLoginUrl: String,
	val canChangePassword: Boolean,
	val itemOriginPhrase: String,
	@SerialName("sold_items_category_count")
	val soldItemsCategoryCount: Long,
	@SerialName("restore_items_category_count")
	val restoreItemsCategoryCount: Long,
	val tags: List<JsonElement>,
	@SerialName("note_text")
	val noteText: JsonElement,
	val hasPendingAutoBuy: Boolean,
	val descriptionHtml: String,
	val descriptionEnHtml: String,
	val descriptionPlain: String,
	val descriptionEnPlain: String,
	val seller: CategoryMihoyoResponseItemsSeller,
)

@Serializable
data class CategoryRiotParams(
	val page: Long? = null,
	val pmin: Long? = null,
	val pmax: Long? = null,
	val title: String? = null,
	@SerialName("order_by")
	val orderBy: String? = null,
	@SerialName("tag_id[]")
	val tagId: List<Long>? = null,
	@SerialName("not_tag_id[]")
	val notTagId: List<Long>? = null,
	@SerialName("public_tag_id[]")
	val publicTagId: List<Long>? = null,
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Long>? = null,
	@SerialName("origin[]")
	val origin: JsonElement? = null,
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
	@SerialName("user_id")
	val userId: Long? = null,
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
	val rmin: Long? = null,
	val rmax: Long? = null,
	@SerialName("last_rmin")
	val lastRmin: Long? = null,
	@SerialName("last_rmax")
	val lastRmax: Long? = null,
	@SerialName("previous_rmin")
	val previousRmin: Long? = null,
	@SerialName("previous_rmax")
	val previousRmax: Long? = null,
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
	val daybreak: Long? = null,
	@SerialName("valorant_level_min")
	val valorantLevelMin: Long? = null,
	@SerialName("valorant_level_max")
	val valorantLevelMax: Long? = null,
	@SerialName("lol_level_min")
	val lolLevelMin: Long? = null,
	@SerialName("lol_level_max")
	val lolLevelMax: Long? = null,
	@SerialName("inv_min")
	val invMin: Long? = null,
	@SerialName("inv_max")
	val invMax: Long? = null,
	@SerialName("vp_min")
	val vpMin: Long? = null,
	@SerialName("vp_max")
	val vpMax: Long? = null,
	@SerialName("valorant_smin")
	val valorantSmin: Long? = null,
	@SerialName("valorant_smax")
	val valorantSmax: Long? = null,
	@SerialName("valorant_rank_type[]")
	val valorantRankType: JsonElement? = null,
	val amin: Long? = null,
	val amax: Long? = null,
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
	val lolSmin: Long? = null,
	@SerialName("lol_smax")
	val lolSmax: Long? = null,
	@SerialName("champion_min")
	val championMin: Long? = null,
	@SerialName("champion_max")
	val championMax: Long? = null,
	@SerialName("win_rate_min")
	val winRateMin: Long? = null,
	@SerialName("win_rate_max")
	val winRateMax: Long? = null,
	@SerialName("blue_min")
	val blueMin: Long? = null,
	@SerialName("blue_max")
	val blueMax: Long? = null,
	@SerialName("orange_min")
	val orangeMin: Long? = null,
	@SerialName("orange_max")
	val orangeMax: Long? = null,
	@SerialName("mythic_min")
	val mythicMin: Long? = null,
	@SerialName("mythic_max")
	val mythicMax: Long? = null,
	@SerialName("riot_min")
	val riotMin: Long? = null,
	@SerialName("riot_max")
	val riotMax: Long? = null,
	val email: String? = null,
	val tel: String? = null,
	@SerialName("valorant_knife_min")
	val valorantKnifeMin: Long? = null,
	@SerialName("valorant_knife_max")
	val valorantKnifeMax: Long? = null,
	@SerialName("rp_min")
	val rpMin: Long? = null,
	@SerialName("rp_max")
	val rpMax: Long? = null,
	@SerialName("fa_min")
	val faMin: Long? = null,
	@SerialName("fa_max")
	val faMax: Long? = null,
	@SerialName("lol_rank[]")
	val lolRank: JsonElement? = null,
)

@Serializable
data class CategoryRiotResponse(
	val items: List<CategoryRiotResponseItems>? = null,
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
data class CategoryRiotResponseItemsBumpSettings(
	val canBumpItem: Boolean,
	val canBumpItemGlobally: Boolean,
	val shortErrorPhrase: JsonElement,
	val errorPhrase: JsonElement,
)

@Serializable
data class CategoryRiotResponseItemsValorantInventory(
	val WeaponSkins: List<String>,
	val Agent: List<String>,
	val Buddy: List<String>,
)

@Serializable
data class CategoryRiotResponseItemsLolInventory(
	val Champion: List<Long>,
	val Skin: List<Long>,
)

@Serializable
data class CategoryRiotResponseItemsAccountLinks(
	val link: String,
	val text: String,
	val iconClass: String,
)

@Serializable
data class CategoryRiotResponseItemsSeller(
	@SerialName("user_id")
	val userId: Long,
	@SerialName("sold_items_count")
	val soldItemsCount: Long,
	@SerialName("active_items_count")
	val activeItemsCount: Long,
	@SerialName("restore_data")
	val restoreData: String,
	val username: String,
	@SerialName("avatar_date")
	val avatarDate: Long,
	@SerialName("is_banned")
	val isBanned: Long,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Long,
	@SerialName("restore_percents")
	val restorePercents: Long,
)

@Serializable
data class CategoryRiotResponseItems(
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
	@SerialName("view_count")
	val viewCount: Long,
	@SerialName("is_sticky")
	val isSticky: Long,
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
	@SerialName("email_type")
	val emailType: String,
	@SerialName("email_provider")
	val emailProvider: String,
	@SerialName("item_domain")
	val itemDomain: String,
	@SerialName("resale_item_origin")
	val resaleItemOrigin: String,
	@SerialName("riot_item_id")
	val riotItemId: Long,
	@SerialName("riot_id")
	val riotId: String,
	@SerialName("riot_account_verified")
	val riotAccountVerified: Long,
	@SerialName("riot_email_verified")
	val riotEmailVerified: Long,
	@SerialName("riot_country")
	val riotCountry: String,
	@SerialName("riot_password_change")
	val riotPasswordChange: Long,
	@SerialName("riot_phone_verified")
	val riotPhoneVerified: Long,
	@SerialName("riot_last_activity")
	val riotLastActivity: Long,
	@SerialName("riot_valorant_wallet_vp")
	val riotValorantWalletVp: Long,
	@SerialName("riot_valorant_wallet_rp")
	val riotValorantWalletRp: Long,
	@SerialName("riot_valorant_wallet_fa")
	val riotValorantWalletFa: Long,
	@SerialName("riot_valorant_level")
	val riotValorantLevel: Long,
	@SerialName("riot_username")
	val riotUsername: String,
	@SerialName("riot_valorant_rank")
	val riotValorantRank: Long,
	@SerialName("riot_valorant_region")
	val riotValorantRegion: String,
	@SerialName("riot_valorant_skin_count")
	val riotValorantSkinCount: Long,
	@SerialName("riot_valorant_agent_count")
	val riotValorantAgentCount: Long,
	@SerialName("riot_valorant_previous_rank")
	val riotValorantPreviousRank: Long,
	@SerialName("riot_valorant_last_rank")
	val riotValorantLastRank: Long,
	@SerialName("riot_valorant_rank_type")
	val riotValorantRankType: String,
	@SerialName("riot_valorant_inventory_value")
	val riotValorantInventoryValue: Long,
	@SerialName("riot_valorant_knife")
	val riotValorantKnife: Long,
	@SerialName("riot_lol_region")
	val riotLolRegion: String,
	@SerialName("riot_lol_skin_count")
	val riotLolSkinCount: Long,
	@SerialName("riot_lol_champion_count")
	val riotLolChampionCount: Long,
	@SerialName("riot_lol_level")
	val riotLolLevel: Long,
	@SerialName("riot_lol_wallet_blue")
	val riotLolWalletBlue: Long,
	@SerialName("riot_lol_wallet_orange")
	val riotLolWalletOrange: Long,
	@SerialName("riot_lol_wallet_mythic")
	val riotLolWalletMythic: Long,
	@SerialName("riot_lol_wallet_riot")
	val riotLolWalletRiot: Long,
	@SerialName("riot_lol_rank")
	val riotLolRank: String,
	@SerialName("riot_lol_rank_win_rate")
	val riotLolRankWinRate: Long,
	@SerialName("feedback_data")
	val feedbackData: String,
	val isIgnored: Boolean,
	val priceWithSellerFee: Long,
	val guarantee: JsonElement,
	val canViewLoginData: Boolean,
	val canUpdateItemStats: Boolean,
	val canReportItem: Boolean,
	val canViewEmailLoginData: Boolean,
	val showGetEmailCodeButton: Boolean,
	val canOpenItem: Boolean,
	val canCloseItem: Boolean,
	val canEditItem: Boolean,
	val canDeleteItem: Boolean,
	val canStickItem: Boolean,
	val canUnstickItem: Boolean,
	val bumpSettings: CategoryRiotResponseItemsBumpSettings,
	val canBumpItem: Boolean,
	val canBuyItem: Boolean,
	@SerialName("rub_price")
	val rubPrice: Long,
	@SerialName("price_currency")
	val priceCurrency: String,
	val canValidateAccount: Boolean,
	val canResellItemAfterPurchase: Boolean,
	val valorantRegionPhrase: String,
	val valorantRankTitle: String,
	val valorantRankImgPath: String,
	val valorantPreviousRankTitle: String,
	val valorantLastRankTitle: String,
	val lolRegionPhrase: String,
	val isSmallExf: Boolean,
	@SerialName("account_last_activity")
	val accountLastActivity: Long,
	val valorantInventory: CategoryRiotResponseItemsValorantInventory,
	val lolInventory: CategoryRiotResponseItemsLolInventory,
	val canViewAccountLink: Boolean,
	val accountLinks: List<CategoryRiotResponseItemsAccountLinks>,
	val accountLink: String,
	val emailLoginUrl: String,
	val canChangePassword: Boolean,
	val itemOriginPhrase: String,
	@SerialName("sold_items_category_count")
	val soldItemsCategoryCount: Long,
	@SerialName("restore_items_category_count")
	val restoreItemsCategoryCount: Long,
	val tags: List<JsonElement>,
	@SerialName("note_text")
	val noteText: JsonElement,
	val hasPendingAutoBuy: Boolean,
	val descriptionHtml: String,
	val descriptionEnHtml: String,
	val descriptionPlain: String,
	val descriptionEnPlain: String,
	val seller: CategoryRiotResponseItemsSeller,
)

@Serializable
data class CategoryTelegramParams(
	val page: Long? = null,
	val pmin: Long? = null,
	val pmax: Long? = null,
	val title: String? = null,
	@SerialName("order_by")
	val orderBy: String? = null,
	@SerialName("tag_id[]")
	val tagId: List<Long>? = null,
	@SerialName("not_tag_id[]")
	val notTagId: List<Long>? = null,
	@SerialName("public_tag_id[]")
	val publicTagId: List<Long>? = null,
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Long>? = null,
	@SerialName("origin[]")
	val origin: JsonElement? = null,
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
	@SerialName("user_id")
	val userId: Long? = null,
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
	val premiumExpiration: Long? = null,
	@SerialName("premium_expiration_period")
	val premiumExpirationPeriod: String? = null,
	@SerialName("country[]")
	val country: List<String>? = null,
	@SerialName("not_country[]")
	val notCountry: List<String>? = null,
	val daybreak: Long? = null,
	@SerialName("min_channels")
	val minChannels: Long? = null,
	@SerialName("max_channels")
	val maxChannels: Long? = null,
	@SerialName("min_chats")
	val minChats: Long? = null,
	@SerialName("max_chats")
	val maxChats: Long? = null,
	@SerialName("min_conversations")
	val minConversations: Long? = null,
	@SerialName("max_conversations")
	val maxConversations: Long? = null,
	@SerialName("min_admin")
	val minAdmin: Long? = null,
	@SerialName("max_admin")
	val maxAdmin: Long? = null,
	@SerialName("min_admin_sub")
	val minAdminSub: Long? = null,
	@SerialName("max_admin_sub")
	val maxAdminSub: Long? = null,
	@SerialName("dig_min")
	val digMin: Long? = null,
	@SerialName("dig_max")
	val digMax: Long? = null,
	@SerialName("min_contacts")
	val minContacts: Long? = null,
	@SerialName("max_contacts")
	val maxContacts: Long? = null,
	@SerialName("min_stars")
	val minStars: Long? = null,
	@SerialName("max_stars")
	val maxStars: Long? = null,
	val birthday: Long? = null,
	@SerialName("birthday_period")
	val birthdayPeriod: String? = null,
	@SerialName("birthday_after")
	val birthdayAfter: Long? = null,
	@SerialName("birthday_after_period")
	val birthdayAfterPeriod: String? = null,
	@SerialName("min_id")
	val minId: Long? = null,
	@SerialName("max_id")
	val maxId: Long? = null,
	@SerialName("allow_geo_spamblock")
	val allowGeoSpamblock: Boolean? = null,
	@SerialName("min_gifts")
	val minGifts: Long? = null,
	@SerialName("max_gifts")
	val maxGifts: Long? = null,
	@SerialName("min_nft_gifts")
	val minNftGifts: Long? = null,
	@SerialName("max_nft_gifts")
	val maxNftGifts: Long? = null,
	@SerialName("min_gifts_stars")
	val minGiftsStars: Long? = null,
	@SerialName("max_gifts_stars")
	val maxGiftsStars: Long? = null,
	@SerialName("min_gifts_convert_stars")
	val minGiftsConvertStars: Long? = null,
	@SerialName("max_gifts_convert_stars")
	val maxGiftsConvertStars: Long? = null,
	@SerialName("dc_id[]")
	val dcId: List<Long>? = null,
	@SerialName("not_dc_id[]")
	val notDcId: List<Long>? = null,
	val email: String? = null,
	@SerialName("min_bots")
	val minBots: Long? = null,
	@SerialName("max_bots")
	val maxBots: Long? = null,
	@SerialName("min_bot_active_users")
	val minBotActiveUsers: Long? = null,
	@SerialName("max_bot_active_users")
	val maxBotActiveUsers: Long? = null,
)

@Serializable
data class CategoryTelegramResponse(
	val items: List<CategoryTelegramResponseItems>? = null,
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
data class CategoryTelegramResponseItemsBumpSettings(
	val canBumpItem: Boolean,
	val canBumpItemGlobally: Boolean,
	val shortErrorPhrase: JsonElement,
	val errorPhrase: JsonElement,
)

@Serializable
data class CategoryTelegramResponseItemsTelegramGroupCounters(
	val chats: Long,
	val channels: Long,
	val conversations: Long,
	val admin: Long,
)

@Serializable
data class CategoryTelegramResponseItemsSeller(
	@SerialName("user_id")
	val userId: Long,
	@SerialName("sold_items_count")
	val soldItemsCount: Long,
	@SerialName("active_items_count")
	val activeItemsCount: Long,
	@SerialName("restore_data")
	val restoreData: String,
	val username: String,
	@SerialName("avatar_date")
	val avatarDate: Long,
	@SerialName("is_banned")
	val isBanned: Long,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Long,
	@SerialName("restore_percents")
	val restorePercents: JsonElement,
)

@Serializable
data class CategoryTelegramResponseItems(
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
	@SerialName("view_count")
	val viewCount: Long,
	@SerialName("is_sticky")
	val isSticky: Long,
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
	@SerialName("email_type")
	val emailType: String,
	@SerialName("email_provider")
	val emailProvider: JsonElement,
	@SerialName("item_domain")
	val itemDomain: String,
	@SerialName("resale_item_origin")
	val resaleItemOrigin: String,
	@SerialName("telegram_item_id")
	val telegramItemId: Long,
	@SerialName("telegram_country")
	val telegramCountry: String,
	@SerialName("telegram_last_seen")
	val telegramLastSeen: Long,
	@SerialName("telegram_premium")
	val telegramPremium: Long,
	@SerialName("telegram_stars_count")
	val telegramStarsCount: Long,
	@SerialName("telegram_birthday")
	val telegramBirthday: Long,
	@SerialName("telegram_password")
	val telegramPassword: Long,
	@SerialName("telegram_premium_expires")
	val telegramPremiumExpires: Long,
	@SerialName("telegram_spam_block")
	val telegramSpamBlock: JsonElement,
	@SerialName("telegram_channels_count")
	val telegramChannelsCount: Long,
	@SerialName("telegram_chats_count")
	val telegramChatsCount: Long,
	@SerialName("telegram_admin_count")
	val telegramAdminCount: Long,
	@SerialName("telegram_admin_subs_count")
	val telegramAdminSubsCount: Long,
	@SerialName("telegram_conversations_count")
	val telegramConversationsCount: Long,
	@SerialName("telegram_id_count")
	val telegramIdCount: Long,
	@SerialName("telegram_contacts_count")
	val telegramContactsCount: Long,
	@SerialName("feedback_data")
	val feedbackData: String,
	val isIgnored: Boolean,
	val priceWithSellerFee: Long,
	val guarantee: JsonElement,
	val canViewLoginData: Boolean,
	val canUpdateItemStats: Boolean,
	val canReportItem: Boolean,
	val canViewEmailLoginData: Boolean,
	val showGetEmailCodeButton: Boolean,
	val canOpenItem: Boolean,
	val canCloseItem: Boolean,
	val canEditItem: Boolean,
	val canDeleteItem: Boolean,
	val canStickItem: Boolean,
	val canUnstickItem: Boolean,
	val bumpSettings: CategoryTelegramResponseItemsBumpSettings,
	val canBumpItem: Boolean,
	val canBuyItem: Boolean,
	@SerialName("rub_price")
	val rubPrice: Long,
	@SerialName("price_currency")
	val priceCurrency: String,
	val canValidateAccount: Boolean,
	val canResellItemAfterPurchase: Boolean,
	@SerialName("telegram_group_counters")
	val telegramGroupCounters: CategoryTelegramResponseItemsTelegramGroupCounters,
	val canViewAccountLink: Boolean,
	val accountLinks: List<JsonElement>,
	val canChangePassword: Boolean,
	val itemOriginPhrase: String,
	val tags: List<JsonElement>,
	@SerialName("note_text")
	val noteText: JsonElement,
	val hasPendingAutoBuy: Boolean,
	val descriptionHtml: String,
	val descriptionEnHtml: String,
	val descriptionPlain: String,
	val descriptionEnPlain: String,
	val seller: CategoryTelegramResponseItemsSeller,
)

@Serializable
data class CategorySupercellParams(
	val page: Long? = null,
	val pmin: Long? = null,
	val pmax: Long? = null,
	val title: String? = null,
	@SerialName("order_by")
	val orderBy: String? = null,
	@SerialName("tag_id[]")
	val tagId: List<Long>? = null,
	@SerialName("not_tag_id[]")
	val notTagId: List<Long>? = null,
	@SerialName("public_tag_id[]")
	val publicTagId: List<Long>? = null,
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Long>? = null,
	@SerialName("origin[]")
	val origin: JsonElement? = null,
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
	@SerialName("user_id")
	val userId: Long? = null,
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
	val daybreak: Long? = null,
	@SerialName("email_type[]")
	val emailType: JsonElement? = null,
	@SerialName("item_domain")
	val itemDomain: String? = null,
	val eg: Long? = null,
	val tel: String? = null,
	@SerialName("brawl_level_min")
	val brawlLevelMin: Long? = null,
	@SerialName("brawl_level_max")
	val brawlLevelMax: Long? = null,
	@SerialName("brawl_cup_min")
	val brawlCupMin: Long? = null,
	@SerialName("brawl_cup_max")
	val brawlCupMax: Long? = null,
	@SerialName("brawl_wins_min")
	val brawlWinsMin: Long? = null,
	@SerialName("brawl_wins_max")
	val brawlWinsMax: Long? = null,
	@SerialName("brawl_pass")
	val brawlPass: String? = null,
	@SerialName("brawler[]")
	val brawler: JsonElement? = null,
	@SerialName("brawlers_min")
	val brawlersMin: Long? = null,
	@SerialName("brawlers_max")
	val brawlersMax: Long? = null,
	@SerialName("legendary_brawlers_min")
	val legendaryBrawlersMin: Long? = null,
	@SerialName("legendary_brawlers_max")
	val legendaryBrawlersMax: Long? = null,
	@SerialName("royale_level_min")
	val royaleLevelMin: Long? = null,
	@SerialName("royale_level_max")
	val royaleLevelMax: Long? = null,
	@SerialName("royale_cup_min")
	val royaleCupMin: Long? = null,
	@SerialName("royale_cup_max")
	val royaleCupMax: Long? = null,
	@SerialName("royale_wins_min")
	val royaleWinsMin: Long? = null,
	@SerialName("royale_wins_max")
	val royaleWinsMax: Long? = null,
	@SerialName("king_level_min")
	val kingLevelMin: Long? = null,
	@SerialName("king_level_max")
	val kingLevelMax: Long? = null,
	@SerialName("royale_pass")
	val royalePass: String? = null,
	@SerialName("clash_level_min")
	val clashLevelMin: Long? = null,
	@SerialName("clash_level_max")
	val clashLevelMax: Long? = null,
	@SerialName("clash_cup_min")
	val clashCupMin: Long? = null,
	@SerialName("clash_cup_max")
	val clashCupMax: Long? = null,
	@SerialName("clash_wins_min")
	val clashWinsMin: Long? = null,
	@SerialName("clash_wins_max")
	val clashWinsMax: Long? = null,
	@SerialName("clash_pass")
	val clashPass: String? = null,
	@SerialName("total_heroes_level_min")
	val totalHeroesLevelMin: Long? = null,
	@SerialName("total_heroes_level_max")
	val totalHeroesLevelMax: Long? = null,
	@SerialName("total_troops_level_min")
	val totalTroopsLevelMin: Long? = null,
	@SerialName("total_troops_level_max")
	val totalTroopsLevelMax: Long? = null,
	@SerialName("total_spells_level_min")
	val totalSpellsLevelMin: Long? = null,
	@SerialName("total_spells_level_max")
	val totalSpellsLevelMax: Long? = null,
	@SerialName("total_builder_heroes_level_min")
	val totalBuilderHeroesLevelMin: Long? = null,
	@SerialName("total_builder_heroes_level_max")
	val totalBuilderHeroesLevelMax: Long? = null,
	@SerialName("total_builder_troops_level_min")
	val totalBuilderTroopsLevelMin: Long? = null,
	@SerialName("total_builder_troops_level_max")
	val totalBuilderTroopsLevelMax: Long? = null,
	@SerialName("town_hall_level_min")
	val townHallLevelMin: Long? = null,
	@SerialName("town_hall_level_max")
	val townHallLevelMax: Long? = null,
	@SerialName("builder_hall_level_min")
	val builderHallLevelMin: Long? = null,
	@SerialName("builder_hall_level_max")
	val builderHallLevelMax: Long? = null,
	@SerialName("builder_hall_cup_min")
	val builderHallCupMin: Long? = null,
	@SerialName("builder_hall_cup_max")
	val builderHallCupMax: Long? = null,
	@SerialName("creation_year_min")
	val creationYearMin: Long? = null,
	@SerialName("creation_year_max")
	val creationYearMax: Long? = null,
)

@Serializable
data class CategorySupercellResponse(
	val items: List<CategorySupercellResponseItems>? = null,
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
data class CategorySupercellResponseItemsBumpSettings(
	val canBumpItem: Boolean,
	val canBumpItemGlobally: Boolean,
	val shortErrorPhrase: JsonElement,
	val errorPhrase: JsonElement,
)

@Serializable
data class CategorySupercellResponseItemsAccountLinks(
	val link: String,
	val text: String,
	val iconClass: String,
)

@Serializable
data class CategorySupercellResponseItemsSeller(
	@SerialName("user_id")
	val userId: Long,
	@SerialName("sold_items_count")
	val soldItemsCount: Long,
	@SerialName("active_items_count")
	val activeItemsCount: Long,
	@SerialName("restore_data")
	val restoreData: String,
	val username: String,
	@SerialName("avatar_date")
	val avatarDate: Long,
	@SerialName("is_banned")
	val isBanned: Long,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Long,
	@SerialName("restore_percents")
	val restorePercents: JsonElement,
)

@Serializable
data class CategorySupercellResponseItems(
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
	@SerialName("view_count")
	val viewCount: Long,
	@SerialName("is_sticky")
	val isSticky: Long,
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
	@SerialName("email_type")
	val emailType: String,
	@SerialName("email_provider")
	val emailProvider: String,
	@SerialName("item_domain")
	val itemDomain: String,
	@SerialName("resale_item_origin")
	val resaleItemOrigin: String,
	@SerialName("supercell_item_id")
	val supercellItemId: Long,
	@SerialName("supercell_id")
	val supercellId: String,
	@SerialName("supercell_arena")
	val supercellArena: String,
	@SerialName("supercell_brawler_count")
	val supercellBrawlerCount: Long,
	@SerialName("supercell_last_activity")
	val supercellLastActivity: Long,
	@SerialName("supercell_legendary_brawler_count")
	val supercellLegendaryBrawlerCount: Long,
	@SerialName("supercell_town_hall_level")
	val supercellTownHallLevel: Long,
	@SerialName("supercell_builder_hall_level")
	val supercellBuilderHallLevel: Long,
	@SerialName("supercell_builder_hall_cup_count")
	val supercellBuilderHallCupCount: Long,
	@SerialName("supercell_phone")
	val supercellPhone: Long,
	@SerialName("supercell_laser_level")
	val supercellLaserLevel: Long,
	@SerialName("supercell_scroll_level")
	val supercellScrollLevel: Long,
	@SerialName("supercell_magic_level")
	val supercellMagicLevel: Long,
	@SerialName("supercell_laser_trophies")
	val supercellLaserTrophies: Long,
	@SerialName("supercell_scroll_trophies")
	val supercellScrollTrophies: Long,
	@SerialName("supercell_magic_trophies")
	val supercellMagicTrophies: Long,
	@SerialName("supercell_laser_victories")
	val supercellLaserVictories: Long,
	@SerialName("supercell_scroll_victories")
	val supercellScrollVictories: Long,
	@SerialName("supercell_magic_victories")
	val supercellMagicVictories: Long,
	@SerialName("supercell_laser_battle_pass")
	val supercellLaserBattlePass: Long,
	@SerialName("supercell_scroll_battle_pass")
	val supercellScrollBattlePass: Long,
	@SerialName("supercell_magic_battle_pass")
	val supercellMagicBattlePass: Long,
	@SerialName("supercell_systems")
	val supercellSystems: String,
	@SerialName("supercell_king_level")
	val supercellKingLevel: Long,
	@SerialName("supercell_total_heroes_level")
	val supercellTotalHeroesLevel: Long,
	@SerialName("supercell_total_troops_level")
	val supercellTotalTroopsLevel: Long,
	@SerialName("supercell_total_spells_level")
	val supercellTotalSpellsLevel: Long,
	@SerialName("supercell_total_builder_heroes_level")
	val supercellTotalBuilderHeroesLevel: Long,
	@SerialName("supercell_total_builder_troops_level")
	val supercellTotalBuilderTroopsLevel: Long,
	@SerialName("feedback_data")
	val feedbackData: String,
	val isIgnored: Boolean,
	val priceWithSellerFee: Long,
	val guarantee: JsonElement,
	val canViewLoginData: Boolean,
	val canUpdateItemStats: Boolean,
	val canReportItem: Boolean,
	val canViewEmailLoginData: Boolean,
	val showGetEmailCodeButton: Boolean,
	val canOpenItem: Boolean,
	val canCloseItem: Boolean,
	val canEditItem: Boolean,
	val canDeleteItem: Boolean,
	val canStickItem: Boolean,
	val canUnstickItem: Boolean,
	val bumpSettings: CategorySupercellResponseItemsBumpSettings,
	val canBumpItem: Boolean,
	val canBuyItem: Boolean,
	@SerialName("rub_price")
	val rubPrice: Long,
	@SerialName("price_currency")
	val priceCurrency: String,
	val canValidateAccount: Boolean,
	val canResellItemAfterPurchase: Boolean,
	val isSmallExf: Boolean,
	val supercellBrawlers: List<JsonElement>,
	val canViewAccountLink: Boolean,
	val accountLinks: List<CategorySupercellResponseItemsAccountLinks>,
	val accountLink: String,
	val emailLoginUrl: String,
	val canChangePassword: Boolean,
	val itemOriginPhrase: String,
	val tags: List<JsonElement>,
	@SerialName("note_text")
	val noteText: JsonElement,
	val hasPendingAutoBuy: Boolean,
	val descriptionHtml: String,
	val descriptionEnHtml: String,
	val descriptionPlain: String,
	val descriptionEnPlain: String,
	val seller: CategorySupercellResponseItemsSeller,
)

@Serializable
data class CategoryEaParams(
	val page: Long? = null,
	val pmin: Long? = null,
	val pmax: Long? = null,
	val title: String? = null,
	@SerialName("order_by")
	val orderBy: String? = null,
	@SerialName("tag_id[]")
	val tagId: List<Long>? = null,
	@SerialName("not_tag_id[]")
	val notTagId: List<Long>? = null,
	@SerialName("public_tag_id[]")
	val publicTagId: List<Long>? = null,
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Long>? = null,
	@SerialName("origin[]")
	val origin: JsonElement? = null,
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
	@SerialName("user_id")
	val userId: Long? = null,
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
	val gmin: Long? = null,
	val gmax: Long? = null,
	@SerialName("al_rank_min")
	val alRankMin: Long? = null,
	@SerialName("al_rank_max")
	val alRankMax: Long? = null,
	@SerialName("al_level_min")
	val alLevelMin: Long? = null,
	@SerialName("al_level_max")
	val alLevelMax: Long? = null,
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
	val subscriptionLength: Long? = null,
	@SerialName("subscription_period")
	val subscriptionPeriod: String? = null,
	@SerialName("hours_played")
	val hoursPlayed: Map<String, Long>? = null,
	@SerialName("hours_played_max")
	val hoursPlayedMax: Map<String, Long>? = null,
	val transactions: String? = null,
)

@Serializable
data class CategoryEaResponse(
	val items: List<CategoryEaResponseItems>? = null,
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
data class CategoryEaResponseItemsEaGamesApexLegends(
	@SerialName("game_id")
	val gameId: String,
	val title: String,
	@SerialName("last_activity")
	val lastActivity: Long,
	@SerialName("total_played")
	val totalPlayed: Long,
	val img: String,
)

@Serializable
data class CategoryEaResponseItemsEaGames(
	@SerialName("apex-legends")
	val apexLegends: CategoryEaResponseItemsEaGamesApexLegends,
)

@Serializable
data class CategoryEaResponseItemsBumpSettings(
	val canBumpItem: Boolean,
	val canBumpItemGlobally: Boolean,
	val shortErrorPhrase: JsonElement,
	val errorPhrase: JsonElement,
)

@Serializable
data class CategoryEaResponseItemsAccountLinks(
	val link: String,
	val text: String,
	val iconClass: String,
)

@Serializable
data class CategoryEaResponseItemsSeller(
	@SerialName("user_id")
	val userId: Long,
	@SerialName("sold_items_count")
	val soldItemsCount: Long,
	@SerialName("active_items_count")
	val activeItemsCount: Long,
	@SerialName("restore_data")
	val restoreData: String,
	val username: String,
	@SerialName("avatar_date")
	val avatarDate: Long,
	@SerialName("is_banned")
	val isBanned: Long,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Long,
	@SerialName("restore_percents")
	val restorePercents: Long,
)

@Serializable
data class CategoryEaResponseItems(
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
	@SerialName("view_count")
	val viewCount: Long,
	@SerialName("is_sticky")
	val isSticky: Long,
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
	@SerialName("email_type")
	val emailType: String,
	@SerialName("email_provider")
	val emailProvider: String,
	@SerialName("item_domain")
	val itemDomain: String,
	@SerialName("resale_item_origin")
	val resaleItemOrigin: String,
	@SerialName("ea_item_id")
	val eaItemId: Long,
	@SerialName("ea_id")
	val eaId: Long,
	@SerialName("ea_country")
	val eaCountry: String,
	@SerialName("ea_games")
	val eaGames: CategoryEaResponseItemsEaGames,
	@SerialName("ea_game_count")
	val eaGameCount: Long,
	@SerialName("ea_last_activity")
	val eaLastActivity: Long,
	@SerialName("ea_al_level")
	val eaAlLevel: Long,
	@SerialName("ea_al_rank_score")
	val eaAlRankScore: Long,
	@SerialName("ea_subscription")
	val eaSubscription: String,
	@SerialName("ea_subscription_end_date")
	val eaSubscriptionEndDate: Long,
	@SerialName("ea_username")
	val eaUsername: String,
	@SerialName("ea_xbox_connected")
	val eaXboxConnected: Long,
	@SerialName("ea_steam_connected")
	val eaSteamConnected: Long,
	@SerialName("ea_psn_connected")
	val eaPsnConnected: Long,
	@SerialName("ea_bans")
	val eaBans: List<JsonElement>,
	@SerialName("ea_has_ban")
	val eaHasBan: Long,
	@SerialName("feedback_data")
	val feedbackData: String,
	val isIgnored: Boolean,
	val priceWithSellerFee: Long,
	val guarantee: JsonElement,
	val canViewLoginData: Boolean,
	val canUpdateItemStats: Boolean,
	val canReportItem: Boolean,
	val canViewEmailLoginData: Boolean,
	val showGetEmailCodeButton: Boolean,
	val canOpenItem: Boolean,
	val canCloseItem: Boolean,
	val canEditItem: Boolean,
	val canDeleteItem: Boolean,
	val canStickItem: Boolean,
	val canUnstickItem: Boolean,
	val bumpSettings: CategoryEaResponseItemsBumpSettings,
	val canBumpItem: Boolean,
	val canBuyItem: Boolean,
	@SerialName("rub_price")
	val rubPrice: Long,
	@SerialName("price_currency")
	val priceCurrency: String,
	val canValidateAccount: Boolean,
	val canResellItemAfterPurchase: Boolean,
	val canViewAccountLink: Boolean,
	val accountLinks: List<CategoryEaResponseItemsAccountLinks>,
	val accountLink: String,
	val emailLoginUrl: String,
	val canChangePassword: Boolean,
	val itemOriginPhrase: String,
	@SerialName("sold_items_category_count")
	val soldItemsCategoryCount: Long,
	@SerialName("restore_items_category_count")
	val restoreItemsCategoryCount: Long,
	val tags: List<JsonElement>,
	@SerialName("note_text")
	val noteText: JsonElement,
	val hasPendingAutoBuy: Boolean,
	val descriptionHtml: String,
	val descriptionEnHtml: String,
	val descriptionPlain: String,
	val descriptionEnPlain: String,
	val seller: CategoryEaResponseItemsSeller,
)

@Serializable
data class CategoryWotParams(
	val page: Long? = null,
	val pmin: Long? = null,
	val pmax: Long? = null,
	val title: String? = null,
	@SerialName("order_by")
	val orderBy: String? = null,
	@SerialName("tag_id[]")
	val tagId: List<Long>? = null,
	@SerialName("not_tag_id[]")
	val notTagId: List<Long>? = null,
	@SerialName("public_tag_id[]")
	val publicTagId: List<Long>? = null,
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Long>? = null,
	@SerialName("origin[]")
	val origin: JsonElement? = null,
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
	@SerialName("user_id")
	val userId: Long? = null,
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
	val daybreak: Long? = null,
	@SerialName("battles_min")
	val battlesMin: Long? = null,
	@SerialName("battles_max")
	val battlesMax: Long? = null,
	@SerialName("gold_min")
	val goldMin: Long? = null,
	@SerialName("gold_max")
	val goldMax: Long? = null,
	@SerialName("silver_min")
	val silverMin: Long? = null,
	@SerialName("silver_max")
	val silverMax: Long? = null,
	@SerialName("top_min")
	val topMin: Long? = null,
	@SerialName("top_max")
	val topMax: Long? = null,
	@SerialName("prem_min")
	val premMin: Long? = null,
	@SerialName("prem_max")
	val premMax: Long? = null,
	@SerialName("top_prem_min")
	val topPremMin: Long? = null,
	@SerialName("top_prem_max")
	val topPremMax: Long? = null,
	@SerialName("win_pmin")
	val winPmin: Long? = null,
	@SerialName("win_pmax")
	val winPmax: Long? = null,
	@SerialName("tank[]")
	val tank: List<Long>? = null,
	@SerialName("region[]")
	val region: JsonElement? = null,
	@SerialName("not_region[]")
	val notRegion: JsonElement? = null,
	val premium: String? = null,
	@SerialName("premium_expiration")
	val premiumExpiration: Long? = null,
	@SerialName("premium_expiration_period")
	val premiumExpirationPeriod: String? = null,
	val clan: String? = null,
	@SerialName("clan_role[]")
	val clanRole: JsonElement? = null,
	@SerialName("not_clan_role[]")
	val notClanRole: JsonElement? = null,
	@SerialName("clan_gold_min")
	val clanGoldMin: Long? = null,
	@SerialName("clan_gold_max")
	val clanGoldMax: Long? = null,
	@SerialName("clan_credits_min")
	val clanCreditsMin: Long? = null,
	@SerialName("clan_credits_max")
	val clanCreditsMax: Long? = null,
	@SerialName("clan_crystal_min")
	val clanCrystalMin: Long? = null,
	@SerialName("clan_crystal_max")
	val clanCrystalMax: Long? = null,
	@SerialName("country[]")
	val country: List<String>? = null,
	@SerialName("not_country[]")
	val notCountry: List<String>? = null,
)

@Serializable
data class CategoryWotResponse(
	val items: List<CategoryWotResponseItems>? = null,
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
data class CategoryWotResponseItemsBumpSettings(
	val canBumpItem: Boolean,
	val canBumpItemGlobally: Boolean,
	val shortErrorPhrase: JsonElement,
	val errorPhrase: JsonElement,
)

@Serializable
data class CategoryWotResponseItemsWotTanks00000(
	@SerialName("tank_id")
	val tankId: Long? = null,
	val name: String? = null,
	@SerialName("is_premium")
	val isPremium: Long? = null,
	@SerialName("image_url")
	val imageUrl: String? = null,
	@SerialName("short_name")
	val shortName: String? = null,
	val tier: Long? = null,
)

@Serializable
data class CategoryWotResponseItemsWotTanks(
	@SerialName("00000")
	val `00000`: CategoryWotResponseItemsWotTanks00000,
)

@Serializable
data class CategoryWotResponseItemsSeller(
	@SerialName("user_id")
	val userId: Long,
	@SerialName("sold_items_count")
	val soldItemsCount: Long,
	@SerialName("active_items_count")
	val activeItemsCount: Long,
	@SerialName("restore_data")
	val restoreData: String,
	val username: String,
	@SerialName("avatar_date")
	val avatarDate: Long,
	@SerialName("is_banned")
	val isBanned: Long,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Long,
	@SerialName("restore_percents")
	val restorePercents: Long,
)

@Serializable
data class CategoryWotResponseItems(
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
	@SerialName("view_count")
	val viewCount: Long,
	@SerialName("is_sticky")
	val isSticky: Long,
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
	@SerialName("email_type")
	val emailType: String,
	@SerialName("email_provider")
	val emailProvider: JsonElement,
	@SerialName("item_domain")
	val itemDomain: String,
	@SerialName("resale_item_origin")
	val resaleItemOrigin: String,
	@SerialName("wot_item_id")
	val wotItemId: Long,
	@SerialName("wot_last_activity")
	val wotLastActivity: Long,
	@SerialName("wot_register_date")
	val wotRegisterDate: Long,
	@SerialName("wot_mobile")
	val wotMobile: Long,
	@SerialName("wot_premium")
	val wotPremium: Long,
	@SerialName("wot_premium_expires")
	val wotPremiumExpires: Long,
	@SerialName("wot_gold")
	val wotGold: Long,
	@SerialName("wot_credits")
	val wotCredits: Long,
	@SerialName("wot_battle_count")
	val wotBattleCount: Long,
	@SerialName("wot_win_count")
	val wotWinCount: Long,
	@SerialName("wot_loss_count")
	val wotLossCount: Long,
	@SerialName("wot_win_count_percents")
	val wotWinCountPercents: Long,
	@SerialName("wot_top_tanks")
	val wotTopTanks: Long,
	@SerialName("wot_premium_tanks")
	val wotPremiumTanks: Long,
	@SerialName("wot_top_premium_tanks")
	val wotTopPremiumTanks: Long,
	@SerialName("wot_region")
	val wotRegion: String,
	@SerialName("wot_blitz")
	val wotBlitz: Long,
	@SerialName("feedback_data")
	val feedbackData: String,
	val isIgnored: Boolean,
	val priceWithSellerFee: Long,
	val guarantee: JsonElement,
	val canViewLoginData: Boolean,
	val canUpdateItemStats: Boolean,
	val canReportItem: Boolean,
	val canViewEmailLoginData: Boolean,
	val showGetEmailCodeButton: Boolean,
	val canOpenItem: Boolean,
	val canCloseItem: Boolean,
	val canEditItem: Boolean,
	val canDeleteItem: Boolean,
	val canStickItem: Boolean,
	val canUnstickItem: Boolean,
	val bumpSettings: CategoryWotResponseItemsBumpSettings,
	val canBumpItem: Boolean,
	val canBuyItem: Boolean,
	@SerialName("rub_price")
	val rubPrice: Long,
	@SerialName("price_currency")
	val priceCurrency: String,
	val canValidateAccount: Boolean,
	val canResellItemAfterPurchase: Boolean,
	val wotRegionPhrase: String,
	val isSmallExf: Boolean,
	@SerialName("account_last_activity")
	val accountLastActivity: Long,
	val wotTanks: CategoryWotResponseItemsWotTanks,
	val wotPremiumTankCount: Long,
	val wotTankCount: Long,
	val wotLauncherTitle: String,
	@SerialName("wot_has_clan")
	val wotHasClan: Boolean,
	val canViewAccountLink: Boolean,
	val accountLinks: List<JsonElement>,
	val canChangePassword: Boolean,
	val itemOriginPhrase: String,
	@SerialName("sold_items_category_count")
	val soldItemsCategoryCount: Long,
	@SerialName("restore_items_category_count")
	val restoreItemsCategoryCount: Long,
	val tags: List<JsonElement>,
	@SerialName("note_text")
	val noteText: JsonElement,
	val hasPendingAutoBuy: Boolean,
	val descriptionHtml: String,
	val descriptionEnHtml: String,
	val descriptionPlain: String,
	val descriptionEnPlain: String,
	val seller: CategoryWotResponseItemsSeller,
)

@Serializable
data class CategoryWotBlitzParams(
	val page: Long? = null,
	val pmin: Long? = null,
	val pmax: Long? = null,
	val title: String? = null,
	@SerialName("order_by")
	val orderBy: String? = null,
	@SerialName("tag_id[]")
	val tagId: List<Long>? = null,
	@SerialName("not_tag_id[]")
	val notTagId: List<Long>? = null,
	@SerialName("public_tag_id[]")
	val publicTagId: List<Long>? = null,
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Long>? = null,
	@SerialName("origin[]")
	val origin: JsonElement? = null,
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
	@SerialName("user_id")
	val userId: Long? = null,
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
	val daybreak: Long? = null,
	@SerialName("battles_min")
	val battlesMin: Long? = null,
	@SerialName("battles_max")
	val battlesMax: Long? = null,
	@SerialName("gold_min")
	val goldMin: Long? = null,
	@SerialName("gold_max")
	val goldMax: Long? = null,
	@SerialName("silver_min")
	val silverMin: Long? = null,
	@SerialName("silver_max")
	val silverMax: Long? = null,
	@SerialName("top_min")
	val topMin: Long? = null,
	@SerialName("top_max")
	val topMax: Long? = null,
	@SerialName("prem_min")
	val premMin: Long? = null,
	@SerialName("prem_max")
	val premMax: Long? = null,
	@SerialName("top_prem_min")
	val topPremMin: Long? = null,
	@SerialName("top_prem_max")
	val topPremMax: Long? = null,
	@SerialName("win_pmin")
	val winPmin: Long? = null,
	@SerialName("win_pmax")
	val winPmax: Long? = null,
	@SerialName("tank[]")
	val tank: List<Long>? = null,
	@SerialName("region[]")
	val region: JsonElement? = null,
	@SerialName("not_region[]")
	val notRegion: JsonElement? = null,
	val premium: String? = null,
	@SerialName("premium_expiration")
	val premiumExpiration: Long? = null,
	@SerialName("premium_expiration_period")
	val premiumExpirationPeriod: String? = null,
	val clan: String? = null,
	@SerialName("clan_role[]")
	val clanRole: JsonElement? = null,
	@SerialName("not_clan_role[]")
	val notClanRole: JsonElement? = null,
	@SerialName("clan_gold_min")
	val clanGoldMin: Long? = null,
	@SerialName("clan_gold_max")
	val clanGoldMax: Long? = null,
	@SerialName("clan_credits_min")
	val clanCreditsMin: Long? = null,
	@SerialName("clan_credits_max")
	val clanCreditsMax: Long? = null,
	@SerialName("clan_crystal_min")
	val clanCrystalMin: Long? = null,
	@SerialName("clan_crystal_max")
	val clanCrystalMax: Long? = null,
	@SerialName("country[]")
	val country: List<String>? = null,
	@SerialName("not_country[]")
	val notCountry: List<String>? = null,
)

@Serializable
data class CategoryWotBlitzResponse(
	val items: List<CategoryWotBlitzResponseItems>? = null,
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
data class CategoryWotBlitzResponseItemsBumpSettings(
	val canBumpItem: Boolean,
	val canBumpItemGlobally: Boolean,
	val shortErrorPhrase: JsonElement,
	val errorPhrase: JsonElement,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks12305(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks6753(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks18001(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks6449(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks15697(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks4481(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks13185(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks14337(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks3681(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks6145(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks5425(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks3649(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks7169(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks7249(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks7297(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks19537(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks5681(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks6209(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks58641(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks16897(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks10369(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks22817(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks9489(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks385(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks19217(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks9297(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks13825(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks5505(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks13089(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks12049(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks13569(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks4145(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks24321(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks23313(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks20257(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks14609(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks10289(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks14881(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks3937(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks10785(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks6929(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks16401(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks641(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks20001(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks12545(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks7953(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks25361(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks20481(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks62737(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks5137(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks18753(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks19025(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks13345(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks2945(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks16193(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks18209(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks19985(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks19489(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks20305(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks20737(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks21329(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks53025(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks18241(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks10881(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks21265(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks20513(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks12673(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks16705(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks6785(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks58881(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks18513(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks2849(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks9073(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks18769(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks15953(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks6257(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks6001(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks55297(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks23841(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks64529(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks21025(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks23057(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks7281(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks23825(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks8753(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks59137(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks10241(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks7793(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks5745(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks11553(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks625(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks20817(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks23297(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks2625(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks19713(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks24849(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks56097(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks57105(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks54785(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks2609(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks57361(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks1409(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks55889(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks5393(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks5489(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks53761(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks65377(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks54545(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks51473(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks10273(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks3121(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks4881(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks51729(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks4369(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks6993(
	@SerialName("tank_id")
	val tankId: Long,
	val name: String,
	@SerialName("is_premium")
	val isPremium: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val tier: Long,
	@SerialName("short_name")
	val shortName: String,
	@SerialName("is_collectible")
	val isCollectible: Long,
)

@Serializable
data class CategoryWotBlitzResponseItemsWotTanks(
	@SerialName("12305")
	val `12305`: CategoryWotBlitzResponseItemsWotTanks12305,
	@SerialName("6753")
	val `6753`: CategoryWotBlitzResponseItemsWotTanks6753,
	@SerialName("18001")
	val `18001`: CategoryWotBlitzResponseItemsWotTanks18001,
	@SerialName("6449")
	val `6449`: CategoryWotBlitzResponseItemsWotTanks6449,
	@SerialName("15697")
	val `15697`: CategoryWotBlitzResponseItemsWotTanks15697,
	@SerialName("4481")
	val `4481`: CategoryWotBlitzResponseItemsWotTanks4481,
	@SerialName("13185")
	val `13185`: CategoryWotBlitzResponseItemsWotTanks13185,
	@SerialName("14337")
	val `14337`: CategoryWotBlitzResponseItemsWotTanks14337,
	@SerialName("3681")
	val `3681`: CategoryWotBlitzResponseItemsWotTanks3681,
	@SerialName("6145")
	val `6145`: CategoryWotBlitzResponseItemsWotTanks6145,
	@SerialName("5425")
	val `5425`: CategoryWotBlitzResponseItemsWotTanks5425,
	@SerialName("3649")
	val `3649`: CategoryWotBlitzResponseItemsWotTanks3649,
	@SerialName("7169")
	val `7169`: CategoryWotBlitzResponseItemsWotTanks7169,
	@SerialName("7249")
	val `7249`: CategoryWotBlitzResponseItemsWotTanks7249,
	@SerialName("7297")
	val `7297`: CategoryWotBlitzResponseItemsWotTanks7297,
	@SerialName("19537")
	val `19537`: CategoryWotBlitzResponseItemsWotTanks19537,
	@SerialName("5681")
	val `5681`: CategoryWotBlitzResponseItemsWotTanks5681,
	@SerialName("6209")
	val `6209`: CategoryWotBlitzResponseItemsWotTanks6209,
	@SerialName("58641")
	val `58641`: CategoryWotBlitzResponseItemsWotTanks58641,
	@SerialName("16897")
	val `16897`: CategoryWotBlitzResponseItemsWotTanks16897,
	@SerialName("10369")
	val `10369`: CategoryWotBlitzResponseItemsWotTanks10369,
	@SerialName("22817")
	val `22817`: CategoryWotBlitzResponseItemsWotTanks22817,
	@SerialName("9489")
	val `9489`: CategoryWotBlitzResponseItemsWotTanks9489,
	@SerialName("385")
	val `385`: CategoryWotBlitzResponseItemsWotTanks385,
	@SerialName("19217")
	val `19217`: CategoryWotBlitzResponseItemsWotTanks19217,
	@SerialName("9297")
	val `9297`: CategoryWotBlitzResponseItemsWotTanks9297,
	@SerialName("13825")
	val `13825`: CategoryWotBlitzResponseItemsWotTanks13825,
	@SerialName("5505")
	val `5505`: CategoryWotBlitzResponseItemsWotTanks5505,
	@SerialName("13089")
	val `13089`: CategoryWotBlitzResponseItemsWotTanks13089,
	@SerialName("12049")
	val `12049`: CategoryWotBlitzResponseItemsWotTanks12049,
	@SerialName("13569")
	val `13569`: CategoryWotBlitzResponseItemsWotTanks13569,
	@SerialName("4145")
	val `4145`: CategoryWotBlitzResponseItemsWotTanks4145,
	@SerialName("24321")
	val `24321`: CategoryWotBlitzResponseItemsWotTanks24321,
	@SerialName("23313")
	val `23313`: CategoryWotBlitzResponseItemsWotTanks23313,
	@SerialName("20257")
	val `20257`: CategoryWotBlitzResponseItemsWotTanks20257,
	@SerialName("14609")
	val `14609`: CategoryWotBlitzResponseItemsWotTanks14609,
	@SerialName("10289")
	val `10289`: CategoryWotBlitzResponseItemsWotTanks10289,
	@SerialName("14881")
	val `14881`: CategoryWotBlitzResponseItemsWotTanks14881,
	@SerialName("3937")
	val `3937`: CategoryWotBlitzResponseItemsWotTanks3937,
	@SerialName("10785")
	val `10785`: CategoryWotBlitzResponseItemsWotTanks10785,
	@SerialName("6929")
	val `6929`: CategoryWotBlitzResponseItemsWotTanks6929,
	@SerialName("16401")
	val `16401`: CategoryWotBlitzResponseItemsWotTanks16401,
	@SerialName("641")
	val `641`: CategoryWotBlitzResponseItemsWotTanks641,
	@SerialName("20001")
	val `20001`: CategoryWotBlitzResponseItemsWotTanks20001,
	@SerialName("12545")
	val `12545`: CategoryWotBlitzResponseItemsWotTanks12545,
	@SerialName("7953")
	val `7953`: CategoryWotBlitzResponseItemsWotTanks7953,
	@SerialName("25361")
	val `25361`: CategoryWotBlitzResponseItemsWotTanks25361,
	@SerialName("20481")
	val `20481`: CategoryWotBlitzResponseItemsWotTanks20481,
	@SerialName("62737")
	val `62737`: CategoryWotBlitzResponseItemsWotTanks62737,
	@SerialName("5137")
	val `5137`: CategoryWotBlitzResponseItemsWotTanks5137,
	@SerialName("18753")
	val `18753`: CategoryWotBlitzResponseItemsWotTanks18753,
	@SerialName("19025")
	val `19025`: CategoryWotBlitzResponseItemsWotTanks19025,
	@SerialName("13345")
	val `13345`: CategoryWotBlitzResponseItemsWotTanks13345,
	@SerialName("2945")
	val `2945`: CategoryWotBlitzResponseItemsWotTanks2945,
	@SerialName("16193")
	val `16193`: CategoryWotBlitzResponseItemsWotTanks16193,
	@SerialName("18209")
	val `18209`: CategoryWotBlitzResponseItemsWotTanks18209,
	@SerialName("19985")
	val `19985`: CategoryWotBlitzResponseItemsWotTanks19985,
	@SerialName("19489")
	val `19489`: CategoryWotBlitzResponseItemsWotTanks19489,
	@SerialName("20305")
	val `20305`: CategoryWotBlitzResponseItemsWotTanks20305,
	@SerialName("20737")
	val `20737`: CategoryWotBlitzResponseItemsWotTanks20737,
	@SerialName("21329")
	val `21329`: CategoryWotBlitzResponseItemsWotTanks21329,
	@SerialName("53025")
	val `53025`: CategoryWotBlitzResponseItemsWotTanks53025,
	@SerialName("18241")
	val `18241`: CategoryWotBlitzResponseItemsWotTanks18241,
	@SerialName("10881")
	val `10881`: CategoryWotBlitzResponseItemsWotTanks10881,
	@SerialName("21265")
	val `21265`: CategoryWotBlitzResponseItemsWotTanks21265,
	@SerialName("20513")
	val `20513`: CategoryWotBlitzResponseItemsWotTanks20513,
	@SerialName("12673")
	val `12673`: CategoryWotBlitzResponseItemsWotTanks12673,
	@SerialName("16705")
	val `16705`: CategoryWotBlitzResponseItemsWotTanks16705,
	@SerialName("6785")
	val `6785`: CategoryWotBlitzResponseItemsWotTanks6785,
	@SerialName("58881")
	val `58881`: CategoryWotBlitzResponseItemsWotTanks58881,
	@SerialName("18513")
	val `18513`: CategoryWotBlitzResponseItemsWotTanks18513,
	@SerialName("2849")
	val `2849`: CategoryWotBlitzResponseItemsWotTanks2849,
	@SerialName("9073")
	val `9073`: CategoryWotBlitzResponseItemsWotTanks9073,
	@SerialName("18769")
	val `18769`: CategoryWotBlitzResponseItemsWotTanks18769,
	@SerialName("15953")
	val `15953`: CategoryWotBlitzResponseItemsWotTanks15953,
	@SerialName("6257")
	val `6257`: CategoryWotBlitzResponseItemsWotTanks6257,
	@SerialName("6001")
	val `6001`: CategoryWotBlitzResponseItemsWotTanks6001,
	@SerialName("55297")
	val `55297`: CategoryWotBlitzResponseItemsWotTanks55297,
	@SerialName("23841")
	val `23841`: CategoryWotBlitzResponseItemsWotTanks23841,
	@SerialName("64529")
	val `64529`: CategoryWotBlitzResponseItemsWotTanks64529,
	@SerialName("21025")
	val `21025`: CategoryWotBlitzResponseItemsWotTanks21025,
	@SerialName("23057")
	val `23057`: CategoryWotBlitzResponseItemsWotTanks23057,
	@SerialName("7281")
	val `7281`: CategoryWotBlitzResponseItemsWotTanks7281,
	@SerialName("23825")
	val `23825`: CategoryWotBlitzResponseItemsWotTanks23825,
	@SerialName("8753")
	val `8753`: CategoryWotBlitzResponseItemsWotTanks8753,
	@SerialName("59137")
	val `59137`: CategoryWotBlitzResponseItemsWotTanks59137,
	@SerialName("10241")
	val `10241`: CategoryWotBlitzResponseItemsWotTanks10241,
	@SerialName("7793")
	val `7793`: CategoryWotBlitzResponseItemsWotTanks7793,
	@SerialName("5745")
	val `5745`: CategoryWotBlitzResponseItemsWotTanks5745,
	@SerialName("11553")
	val `11553`: CategoryWotBlitzResponseItemsWotTanks11553,
	@SerialName("625")
	val `625`: CategoryWotBlitzResponseItemsWotTanks625,
	@SerialName("20817")
	val `20817`: CategoryWotBlitzResponseItemsWotTanks20817,
	@SerialName("23297")
	val `23297`: CategoryWotBlitzResponseItemsWotTanks23297,
	@SerialName("2625")
	val `2625`: CategoryWotBlitzResponseItemsWotTanks2625,
	@SerialName("19713")
	val `19713`: CategoryWotBlitzResponseItemsWotTanks19713,
	@SerialName("24849")
	val `24849`: CategoryWotBlitzResponseItemsWotTanks24849,
	@SerialName("56097")
	val `56097`: CategoryWotBlitzResponseItemsWotTanks56097,
	@SerialName("57105")
	val `57105`: CategoryWotBlitzResponseItemsWotTanks57105,
	@SerialName("54785")
	val `54785`: CategoryWotBlitzResponseItemsWotTanks54785,
	@SerialName("2609")
	val `2609`: CategoryWotBlitzResponseItemsWotTanks2609,
	@SerialName("57361")
	val `57361`: CategoryWotBlitzResponseItemsWotTanks57361,
	@SerialName("1409")
	val `1409`: CategoryWotBlitzResponseItemsWotTanks1409,
	@SerialName("55889")
	val `55889`: CategoryWotBlitzResponseItemsWotTanks55889,
	@SerialName("5393")
	val `5393`: CategoryWotBlitzResponseItemsWotTanks5393,
	@SerialName("5489")
	val `5489`: CategoryWotBlitzResponseItemsWotTanks5489,
	@SerialName("53761")
	val `53761`: CategoryWotBlitzResponseItemsWotTanks53761,
	@SerialName("65377")
	val `65377`: CategoryWotBlitzResponseItemsWotTanks65377,
	@SerialName("54545")
	val `54545`: CategoryWotBlitzResponseItemsWotTanks54545,
	@SerialName("51473")
	val `51473`: CategoryWotBlitzResponseItemsWotTanks51473,
	@SerialName("10273")
	val `10273`: CategoryWotBlitzResponseItemsWotTanks10273,
	@SerialName("3121")
	val `3121`: CategoryWotBlitzResponseItemsWotTanks3121,
	@SerialName("4881")
	val `4881`: CategoryWotBlitzResponseItemsWotTanks4881,
	@SerialName("51729")
	val `51729`: CategoryWotBlitzResponseItemsWotTanks51729,
	@SerialName("4369")
	val `4369`: CategoryWotBlitzResponseItemsWotTanks4369,
	@SerialName("6993")
	val `6993`: CategoryWotBlitzResponseItemsWotTanks6993,
)

@Serializable
data class CategoryWotBlitzResponseItemsSeller(
	@SerialName("user_id")
	val userId: Long,
	@SerialName("sold_items_count")
	val soldItemsCount: Long,
	@SerialName("active_items_count")
	val activeItemsCount: Long,
	@SerialName("restore_data")
	val restoreData: String,
	val username: String,
	@SerialName("avatar_date")
	val avatarDate: Long,
	@SerialName("is_banned")
	val isBanned: Long,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Long,
	@SerialName("restore_percents")
	val restorePercents: Long,
)

@Serializable
data class CategoryWotBlitzResponseItems(
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
	@SerialName("view_count")
	val viewCount: Long,
	@SerialName("is_sticky")
	val isSticky: Long,
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
	@SerialName("email_type")
	val emailType: String,
	@SerialName("email_provider")
	val emailProvider: JsonElement,
	@SerialName("item_domain")
	val itemDomain: String,
	@SerialName("resale_item_origin")
	val resaleItemOrigin: String,
	@SerialName("wot_item_id")
	val wotItemId: Long,
	@SerialName("wot_last_activity")
	val wotLastActivity: Long,
	@SerialName("wot_register_date")
	val wotRegisterDate: Long,
	@SerialName("wot_mobile")
	val wotMobile: Long,
	@SerialName("wot_premium")
	val wotPremium: Long,
	@SerialName("wot_premium_expires")
	val wotPremiumExpires: Long,
	@SerialName("wot_gold")
	val wotGold: Long,
	@SerialName("wot_credits")
	val wotCredits: Long,
	@SerialName("wot_battle_count")
	val wotBattleCount: Long,
	@SerialName("wot_win_count")
	val wotWinCount: Long,
	@SerialName("wot_loss_count")
	val wotLossCount: Long,
	@SerialName("wot_win_count_percents")
	val wotWinCountPercents: Long,
	@SerialName("wot_top_tanks")
	val wotTopTanks: Long,
	@SerialName("wot_premium_tanks")
	val wotPremiumTanks: Long,
	@SerialName("wot_top_premium_tanks")
	val wotTopPremiumTanks: Long,
	@SerialName("wot_region")
	val wotRegion: String,
	@SerialName("wot_blitz")
	val wotBlitz: Long,
	@SerialName("feedback_data")
	val feedbackData: String,
	val isIgnored: Boolean,
	val priceWithSellerFee: Long,
	val guarantee: JsonElement,
	val canViewLoginData: Boolean,
	val canUpdateItemStats: Boolean,
	val canReportItem: Boolean,
	val canViewEmailLoginData: Boolean,
	val showGetEmailCodeButton: Boolean,
	val canOpenItem: Boolean,
	val canCloseItem: Boolean,
	val canEditItem: Boolean,
	val canDeleteItem: Boolean,
	val canStickItem: Boolean,
	val canUnstickItem: Boolean,
	val bumpSettings: CategoryWotBlitzResponseItemsBumpSettings,
	val canBumpItem: Boolean,
	val canBuyItem: Boolean,
	@SerialName("rub_price")
	val rubPrice: Long,
	@SerialName("price_currency")
	val priceCurrency: String,
	val canValidateAccount: Boolean,
	val canResellItemAfterPurchase: Boolean,
	val wotRegionPhrase: String,
	val isSmallExf: Boolean,
	@SerialName("account_last_activity")
	val accountLastActivity: Long,
	val wotTanks: CategoryWotBlitzResponseItemsWotTanks,
	val wotPremiumTankCount: Long,
	val wotTankCount: Long,
	val wotLauncherTitle: String,
	@SerialName("wot_has_clan")
	val wotHasClan: Boolean,
	val canViewAccountLink: Boolean,
	val accountLinks: List<JsonElement>,
	val canChangePassword: Boolean,
	val itemOriginPhrase: String,
	@SerialName("sold_items_category_count")
	val soldItemsCategoryCount: Long,
	@SerialName("restore_items_category_count")
	val restoreItemsCategoryCount: Long,
	val tags: List<JsonElement>,
	@SerialName("note_text")
	val noteText: JsonElement,
	val hasPendingAutoBuy: Boolean,
	val descriptionHtml: String,
	val descriptionEnHtml: String,
	val descriptionPlain: String,
	val descriptionEnPlain: String,
	val seller: CategoryWotBlitzResponseItemsSeller,
)

@Serializable
data class CategoryGiftsParams(
	val page: Long? = null,
	val pmin: Long? = null,
	val pmax: Long? = null,
	val title: String? = null,
	@SerialName("order_by")
	val orderBy: String? = null,
	@SerialName("tag_id[]")
	val tagId: List<Long>? = null,
	@SerialName("not_tag_id[]")
	val notTagId: List<Long>? = null,
	@SerialName("public_tag_id[]")
	val publicTagId: List<Long>? = null,
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Long>? = null,
	@SerialName("origin[]")
	val origin: JsonElement? = null,
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
	@SerialName("user_id")
	val userId: Long? = null,
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
	val subscriptionLength: Long? = null,
	@SerialName("subscription_period")
	val subscriptionPeriod: String? = null,
)

@Serializable
data class CategoryGiftsResponse(
	val items: List<CategoryGiftsResponseItems>? = null,
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
data class CategoryGiftsResponseItemsBumpSettings(
	val canBumpItem: Boolean,
	val canBumpItemGlobally: Boolean,
	val shortErrorPhrase: JsonElement,
	val errorPhrase: JsonElement,
)

@Serializable
data class CategoryGiftsResponseItemsSeller(
	@SerialName("user_id")
	val userId: Long,
	@SerialName("sold_items_count")
	val soldItemsCount: Long,
	@SerialName("active_items_count")
	val activeItemsCount: Long,
	@SerialName("restore_data")
	val restoreData: String,
	val username: String,
	@SerialName("avatar_date")
	val avatarDate: Long,
	@SerialName("is_banned")
	val isBanned: Long,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Long,
	@SerialName("restore_percents")
	val restorePercents: JsonElement,
)

@Serializable
data class CategoryGiftsResponseItems(
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
	@SerialName("view_count")
	val viewCount: Long,
	@SerialName("is_sticky")
	val isSticky: Long,
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
	@SerialName("email_type")
	val emailType: String,
	@SerialName("email_provider")
	val emailProvider: JsonElement,
	@SerialName("item_domain")
	val itemDomain: String,
	@SerialName("resale_item_origin")
	val resaleItemOrigin: String,
	@SerialName("gifts_item_id")
	val giftsItemId: Long,
	@SerialName("gifts_service")
	val giftsService: String,
	@SerialName("gifts_duration")
	val giftsDuration: Long,
	@SerialName("gifts_type")
	val giftsType: String,
	@SerialName("feedback_data")
	val feedbackData: String,
	val isIgnored: Boolean,
	val priceWithSellerFee: Long,
	val guarantee: JsonElement,
	val canViewLoginData: Boolean,
	val canUpdateItemStats: Boolean,
	val canReportItem: Boolean,
	val canViewEmailLoginData: Boolean,
	val showGetEmailCodeButton: Boolean,
	val canOpenItem: Boolean,
	val canCloseItem: Boolean,
	val canEditItem: Boolean,
	val canDeleteItem: Boolean,
	val canStickItem: Boolean,
	val canUnstickItem: Boolean,
	val bumpSettings: CategoryGiftsResponseItemsBumpSettings,
	val canBumpItem: Boolean,
	val canBuyItem: Boolean,
	@SerialName("rub_price")
	val rubPrice: Long,
	@SerialName("price_currency")
	val priceCurrency: String,
	val canValidateAccount: Boolean,
	val canResellItemAfterPurchase: Boolean,
	val giftsSubscriptionName: String,
	val giftsServiceName: String,
	val canViewAccountLink: Boolean,
	val canChangePassword: Boolean,
	val itemOriginPhrase: String,
	val tags: List<JsonElement>,
	@SerialName("note_text")
	val noteText: JsonElement,
	val hasPendingAutoBuy: Boolean,
	val descriptionHtml: String,
	val descriptionEnHtml: String,
	val descriptionPlain: String,
	val descriptionEnPlain: String,
	val seller: CategoryGiftsResponseItemsSeller,
)

@Serializable
data class CategoryEpicGamesParams(
	val page: Long? = null,
	val pmin: Long? = null,
	val pmax: Long? = null,
	val title: String? = null,
	@SerialName("order_by")
	val orderBy: String? = null,
	@SerialName("tag_id[]")
	val tagId: List<Long>? = null,
	@SerialName("not_tag_id[]")
	val notTagId: List<Long>? = null,
	@SerialName("public_tag_id[]")
	val publicTagId: List<Long>? = null,
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Long>? = null,
	@SerialName("origin[]")
	val origin: JsonElement? = null,
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
	@SerialName("user_id")
	val userId: Long? = null,
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
	val eg: Long? = null,
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
	val gmin: Long? = null,
	val gmax: Long? = null,
	@SerialName("country[]")
	val country: List<String>? = null,
	@SerialName("not_country[]")
	val notCountry: List<String>? = null,
	val daybreak: Long? = null,
	@SerialName("hours_played")
	val hoursPlayed: Map<String, Long>? = null,
	@SerialName("hours_played_max")
	val hoursPlayedMax: Map<String, Long>? = null,
)

@Serializable
data class CategoryEpicGamesResponse(
	val items: List<CategoryEpicGamesResponseItems>? = null,
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
data class CategoryEpicGamesResponseItemsEgGames0(
	@SerialName("internal_game_id")
	val internalGameId: Long,
	@SerialName("app_id")
	val appId: String,
	val title: String,
	val abbr: String,
	@SerialName("category_id")
	val categoryId: Long,
	val img: String,
	val url: String,
	val ru: JsonElement,
	@SerialName("hits_count")
	val hitsCount: Long,
	val link: String,
)

@Serializable
data class CategoryEpicGamesResponseItemsEgGames(
	@SerialName("0")
	val `0`: CategoryEpicGamesResponseItemsEgGames0,
)

@Serializable
data class CategoryEpicGamesResponseItemsBumpSettings(
	val canBumpItem: Boolean,
	val canBumpItemGlobally: Boolean,
	val shortErrorPhrase: JsonElement,
	val errorPhrase: JsonElement,
)

@Serializable
data class CategoryEpicGamesResponseItemsEgTransactions(
	val date: Long,
	val title: String,
	val presentmentTotal: String,
	val orderType: String,
)

@Serializable
data class CategoryEpicGamesResponseItemsSeller(
	@SerialName("user_id")
	val userId: Long,
	@SerialName("sold_items_count")
	val soldItemsCount: Long,
	@SerialName("active_items_count")
	val activeItemsCount: Long,
	@SerialName("restore_data")
	val restoreData: String,
	val username: String,
	@SerialName("avatar_date")
	val avatarDate: Long,
	@SerialName("is_banned")
	val isBanned: Long,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Long,
	@SerialName("restore_percents")
	val restorePercents: Long,
)

@Serializable
data class CategoryEpicGamesResponseItems(
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
	@SerialName("view_count")
	val viewCount: Long,
	@SerialName("is_sticky")
	val isSticky: Long,
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
	@SerialName("email_type")
	val emailType: String,
	@SerialName("email_provider")
	val emailProvider: String,
	@SerialName("item_domain")
	val itemDomain: String,
	@SerialName("resale_item_origin")
	val resaleItemOrigin: String,
	@SerialName("eg_item_id")
	val egItemId: Long,
	@SerialName("eg_country")
	val egCountry: String,
	@SerialName("eg_code_redemption_history")
	val egCodeRedemptionHistory: List<JsonElement>,
	@SerialName("eg_coupons")
	val egCoupons: List<JsonElement>,
	@SerialName("eg_games")
	val egGames: CategoryEpicGamesResponseItemsEgGames,
	@SerialName("eg_change_email")
	val egChangeEmail: Long,
	@SerialName("eg_can_update_display_name")
	val egCanUpdateDisplayName: Long,
	@SerialName("eg_last_activity")
	val egLastActivity: Long,
	@SerialName("eg_payment_methods")
	val egPaymentMethods: List<JsonElement>,
	@SerialName("eg_rl_purchases")
	val egRlPurchases: Long,
	@SerialName("eg_username")
	val egUsername: String,
	@SerialName("eg_rewards_balance")
	val egRewardsBalance: Long,
	@SerialName("eg_rewards_expiration_date")
	val egRewardsExpirationDate: Long,
	@SerialName("eg_next_change_email_date")
	val egNextChangeEmailDate: Long,
	@SerialName("eg_game_count")
	val egGameCount: Long,
	@SerialName("eg_balance")
	val egBalance: Long,
	@SerialName("feedback_data")
	val feedbackData: String,
	val isIgnored: Boolean,
	val priceWithSellerFee: Long,
	val guarantee: JsonElement,
	val canViewLoginData: Boolean,
	val canUpdateItemStats: Boolean,
	val canReportItem: Boolean,
	val canViewEmailLoginData: Boolean,
	val showGetEmailCodeButton: Boolean,
	val canOpenItem: Boolean,
	val canCloseItem: Boolean,
	val canEditItem: Boolean,
	val canDeleteItem: Boolean,
	val canStickItem: Boolean,
	val canUnstickItem: Boolean,
	val bumpSettings: CategoryEpicGamesResponseItemsBumpSettings,
	val canBumpItem: Boolean,
	val canBuyItem: Boolean,
	@SerialName("rub_price")
	val rubPrice: Long,
	@SerialName("price_currency")
	val priceCurrency: String,
	val canValidateAccount: Boolean,
	val canResellItemAfterPurchase: Boolean,
	val egTransactions: List<CategoryEpicGamesResponseItemsEgTransactions>,
	val canViewAccountLink: Boolean,
	val accountLinks: List<JsonElement>,
	val emailLoginUrl: String,
	val canChangePassword: Boolean,
	val itemOriginPhrase: String,
	@SerialName("sold_items_category_count")
	val soldItemsCategoryCount: Long,
	@SerialName("restore_items_category_count")
	val restoreItemsCategoryCount: Long,
	val tags: List<JsonElement>,
	@SerialName("note_text")
	val noteText: JsonElement,
	val hasPendingAutoBuy: Boolean,
	val descriptionHtml: String,
	val descriptionEnHtml: String,
	val descriptionPlain: String,
	val descriptionEnPlain: String,
	val seller: CategoryEpicGamesResponseItemsSeller,
)

@Serializable
data class CategoryEscapeFromTarkovParams(
	val page: Long? = null,
	val pmin: Long? = null,
	val pmax: Long? = null,
	val title: String? = null,
	@SerialName("order_by")
	val orderBy: String? = null,
	@SerialName("tag_id[]")
	val tagId: List<Long>? = null,
	@SerialName("not_tag_id[]")
	val notTagId: List<Long>? = null,
	@SerialName("public_tag_id[]")
	val publicTagId: List<Long>? = null,
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Long>? = null,
	@SerialName("origin[]")
	val origin: JsonElement? = null,
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
	@SerialName("user_id")
	val userId: Long? = null,
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
	val reg: Long? = null,
	@SerialName("reg_period")
	val regPeriod: String? = null,
	@SerialName("level_min")
	val levelMin: Long? = null,
	@SerialName("level_max")
	val levelMax: Long? = null,
	val pve: String? = null,
	val side: String? = null,
)

@Serializable
data class CategoryEscapeFromTarkovResponse(
	val items: List<CategoryEscapeFromTarkovResponseItems>? = null,
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
data class CategoryEscapeFromTarkovResponseItemsBumpSettings(
	val canBumpItem: Boolean,
	val canBumpItemGlobally: Boolean,
	val shortErrorPhrase: JsonElement,
	val errorPhrase: JsonElement,
)

@Serializable
data class CategoryEscapeFromTarkovResponseItemsSeller(
	@SerialName("user_id")
	val userId: Long,
	@SerialName("sold_items_count")
	val soldItemsCount: Long,
	@SerialName("active_items_count")
	val activeItemsCount: Long,
	@SerialName("restore_data")
	val restoreData: String,
	val username: String,
	@SerialName("avatar_date")
	val avatarDate: Long,
	@SerialName("is_banned")
	val isBanned: Long,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Long,
	@SerialName("restore_percents")
	val restorePercents: Long,
)

@Serializable
data class CategoryEscapeFromTarkovResponseItems(
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
	@SerialName("view_count")
	val viewCount: Long,
	@SerialName("is_sticky")
	val isSticky: Long,
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
	@SerialName("email_type")
	val emailType: String,
	@SerialName("email_provider")
	val emailProvider: String,
	@SerialName("item_domain")
	val itemDomain: String,
	@SerialName("resale_item_origin")
	val resaleItemOrigin: String,
	@SerialName("tarkov_item_id")
	val tarkovItemId: Long,
	@SerialName("tarkov_game_version")
	val tarkovGameVersion: String,
	@SerialName("tarkov_register_date")
	val tarkovRegisterDate: Long,
	@SerialName("tarkov_level")
	val tarkovLevel: Long,
	@SerialName("tarkov_exp")
	val tarkovExp: Long,
	@SerialName("tarkov_last_activity")
	val tarkovLastActivity: Long,
	@SerialName("tarkov_side")
	val tarkovSide: String,
	@SerialName("tarkov_rubles")
	val tarkovRubles: Long,
	@SerialName("tarkov_secured_container")
	val tarkovSecuredContainer: String,
	@SerialName("tarkov_euros")
	val tarkovEuros: Long,
	@SerialName("tarkov_dollars")
	val tarkovDollars: Long,
	@SerialName("tarkov_kd")
	val tarkovKd: Long,
	@SerialName("tarkov_deaths")
	val tarkovDeaths: Long,
	@SerialName("tarkov_kills")
	val tarkovKills: Long,
	@SerialName("tarkov_sessions")
	val tarkovSessions: Long,
	@SerialName("tarkov_region")
	val tarkovRegion: String,
	@SerialName("tarkov_total_in_game")
	val tarkovTotalInGame: Long,
	@SerialName("tarkov_mail_forwarding")
	val tarkovMailForwarding: Long,
	@SerialName("tarkov_username")
	val tarkovUsername: String,
	@SerialName("tarkov_purchase_date")
	val tarkovPurchaseDate: Long,
	@SerialName("feedback_data")
	val feedbackData: String,
	val isIgnored: Boolean,
	val priceWithSellerFee: Long,
	val guarantee: JsonElement,
	val canViewLoginData: Boolean,
	val canUpdateItemStats: Boolean,
	val canReportItem: Boolean,
	val canViewEmailLoginData: Boolean,
	val showGetEmailCodeButton: Boolean,
	val canOpenItem: Boolean,
	val canCloseItem: Boolean,
	val canEditItem: Boolean,
	val canDeleteItem: Boolean,
	val canStickItem: Boolean,
	val canUnstickItem: Boolean,
	val bumpSettings: CategoryEscapeFromTarkovResponseItemsBumpSettings,
	val canBumpItem: Boolean,
	val canBuyItem: Boolean,
	@SerialName("rub_price")
	val rubPrice: Long,
	@SerialName("price_currency")
	val priceCurrency: String,
	val canValidateAccount: Boolean,
	val canResellItemAfterPurchase: Boolean,
	val tarkovRegionPhrase: String,
	val tarkovGameVersionPhrase: String,
	val accountDomain: String,
	val canViewAccountLink: Boolean,
	val emailLoginUrl: String,
	val canChangePassword: Boolean,
	val itemOriginPhrase: String,
	@SerialName("sold_items_category_count")
	val soldItemsCategoryCount: Long,
	@SerialName("restore_items_category_count")
	val restoreItemsCategoryCount: Long,
	val tags: List<JsonElement>,
	@SerialName("note_text")
	val noteText: JsonElement,
	val hasPendingAutoBuy: Boolean,
	val descriptionHtml: String,
	val descriptionEnHtml: String,
	val descriptionPlain: String,
	val descriptionEnPlain: String,
	val seller: CategoryEscapeFromTarkovResponseItemsSeller,
)

@Serializable
data class CategorySocialClubParams(
	val page: Long? = null,
	val pmin: Long? = null,
	val pmax: Long? = null,
	val title: String? = null,
	@SerialName("order_by")
	val orderBy: String? = null,
	@SerialName("tag_id[]")
	val tagId: List<Long>? = null,
	@SerialName("not_tag_id[]")
	val notTagId: List<Long>? = null,
	@SerialName("public_tag_id[]")
	val publicTagId: List<Long>? = null,
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Long>? = null,
	@SerialName("origin[]")
	val origin: JsonElement? = null,
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
	@SerialName("user_id")
	val userId: Long? = null,
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
	val daybreak: Long? = null,
	@SerialName("level_min")
	val levelMin: Long? = null,
	@SerialName("level_max")
	val levelMax: Long? = null,
	@SerialName("cash_min")
	val cashMin: Long? = null,
	@SerialName("cash_max")
	val cashMax: Long? = null,
	@SerialName("bank_cash_min")
	val bankCashMin: Long? = null,
	@SerialName("bank_cash_max")
	val bankCashMax: Long? = null,
	@SerialName("game[]")
	val game: List<String>? = null,
)

@Serializable
data class CategorySocialClubResponse(
	val items: List<CategorySocialClubResponseItems>? = null,
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
data class CategorySocialClubResponseItemsSocialclubGames(
	val id: Long,
	val name: String,
	val defaultPlatform: String,
	val platform: String,
	val lastSeen: String,
	@SerialName("internal_game_id")
	val internalGameId: Long,
	@SerialName("app_id")
	val appId: String,
	val title: String,
	val abbr: String,
	@SerialName("category_id")
	val categoryId: Long,
	val img: String,
	val url: String,
	val ru: JsonElement,
)

@Serializable
data class CategorySocialClubResponseItemsBumpSettings(
	val canBumpItem: Boolean,
	val canBumpItemGlobally: Boolean,
	val shortErrorPhrase: JsonElement,
	val errorPhrase: JsonElement,
)

@Serializable
data class CategorySocialClubResponseItemsSeller(
	@SerialName("user_id")
	val userId: Long,
	@SerialName("sold_items_count")
	val soldItemsCount: Long,
	@SerialName("active_items_count")
	val activeItemsCount: Long,
	@SerialName("restore_data")
	val restoreData: String,
	val username: String,
	@SerialName("avatar_date")
	val avatarDate: Long,
	@SerialName("is_banned")
	val isBanned: Long,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Long,
	@SerialName("restore_percents")
	val restorePercents: JsonElement,
)

@Serializable
data class CategorySocialClubResponseItems(
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
	@SerialName("view_count")
	val viewCount: Long,
	@SerialName("is_sticky")
	val isSticky: Long,
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
	@SerialName("email_type")
	val emailType: String,
	@SerialName("email_provider")
	val emailProvider: String,
	@SerialName("item_domain")
	val itemDomain: String,
	@SerialName("resale_item_origin")
	val resaleItemOrigin: String,
	@SerialName("socialclub_item_id")
	val socialclubItemId: Long,
	@SerialName("socialclub_level")
	val socialclubLevel: Long,
	@SerialName("socialclub_cash")
	val socialclubCash: Long,
	@SerialName("socialclub_bank_cash")
	val socialclubBankCash: Long,
	@SerialName("socialclub_games")
	val socialclubGames: List<CategorySocialClubResponseItemsSocialclubGames>,
	@SerialName("socialclub_last_activity")
	val socialclubLastActivity: Long,
	@SerialName("socialclub_has_gtav")
	val socialclubHasGtav: Long,
	@SerialName("socialclub_has_rdr2")
	val socialclubHasRdr2: Long,
	@SerialName("feedback_data")
	val feedbackData: String,
	val isIgnored: Boolean,
	val priceWithSellerFee: Long,
	val guarantee: JsonElement,
	val canViewLoginData: Boolean,
	val canUpdateItemStats: Boolean,
	val canReportItem: Boolean,
	val canViewEmailLoginData: Boolean,
	val showGetEmailCodeButton: Boolean,
	val canOpenItem: Boolean,
	val canCloseItem: Boolean,
	val canEditItem: Boolean,
	val canDeleteItem: Boolean,
	val canStickItem: Boolean,
	val canUnstickItem: Boolean,
	val bumpSettings: CategorySocialClubResponseItemsBumpSettings,
	val canBumpItem: Boolean,
	val canBuyItem: Boolean,
	@SerialName("rub_price")
	val rubPrice: Long,
	@SerialName("price_currency")
	val priceCurrency: String,
	val canValidateAccount: Boolean,
	val canResellItemAfterPurchase: Boolean,
	val isSmallExf: Boolean,
	@SerialName("account_last_activity")
	val accountLastActivity: Long,
	val canViewAccountLink: Boolean,
	val accountLinks: List<JsonElement>,
	val emailLoginUrl: String,
	val canChangePassword: Boolean,
	val itemOriginPhrase: String,
	val tags: List<JsonElement>,
	@SerialName("note_text")
	val noteText: JsonElement,
	val hasPendingAutoBuy: Boolean,
	val descriptionHtml: String,
	val descriptionEnHtml: String,
	val descriptionPlain: String,
	val descriptionEnPlain: String,
	val seller: CategorySocialClubResponseItemsSeller,
)

@Serializable
data class CategoryUplayParams(
	val page: Long? = null,
	val pmin: Long? = null,
	val pmax: Long? = null,
	val title: String? = null,
	@SerialName("order_by")
	val orderBy: String? = null,
	@SerialName("tag_id[]")
	val tagId: List<Long>? = null,
	@SerialName("not_tag_id[]")
	val notTagId: List<Long>? = null,
	@SerialName("public_tag_id[]")
	val publicTagId: List<Long>? = null,
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Long>? = null,
	@SerialName("origin[]")
	val origin: JsonElement? = null,
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
	@SerialName("user_id")
	val userId: Long? = null,
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
	val daybreak: Long? = null,
	val gmin: Long? = null,
	val gmax: Long? = null,
	val subscription: String? = null,
	@SerialName("subscription_length")
	val subscriptionLength: Long? = null,
	@SerialName("subscription_period")
	val subscriptionPeriod: String? = null,
	@SerialName("r6_level_min")
	val r6LevelMin: Long? = null,
	@SerialName("r6_level_max")
	val r6LevelMax: Long? = null,
	@SerialName("r6_rank_min")
	val r6RankMin: Long? = null,
	@SerialName("r6_rank_max")
	val r6RankMax: Long? = null,
	@SerialName("r6_operators_min")
	val r6OperatorsMin: Long? = null,
	@SerialName("r6_operators_max")
	val r6OperatorsMax: Long? = null,
	@SerialName("r6_ban")
	val r6Ban: String? = null,
	@SerialName("r6_smin")
	val r6Smin: Long? = null,
	@SerialName("r6_smax")
	val r6Smax: Long? = null,
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
	val reg: Long? = null,
	@SerialName("reg_period")
	val regPeriod: String? = null,
)

@Serializable
data class CategoryUplayResponse(
	val items: List<CategoryUplayResponseItems>? = null,
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
data class CategoryUplayResponseItemsUplayGamesFfffffffFfffFfffFfffFfffffffffff(
	val title: String,
	val img: String,
	val pvpTimePlayed: Long,
	val pveTimePlayed: Long,
	val abbr: String,
	val gameId: String,
)

@Serializable
data class CategoryUplayResponseItemsUplayGames(
	@SerialName("ffffffff-ffff-ffff-ffff-ffffffffffff")
	val ffffffffFfffFfffFfffFfffffffffff: CategoryUplayResponseItemsUplayGamesFfffffffFfffFfffFfffFfffffffffff,
)

@Serializable
data class CategoryUplayResponseItemsBumpSettings(
	val canBumpItem: Boolean,
	val canBumpItemGlobally: Boolean,
	val shortErrorPhrase: JsonElement,
	val errorPhrase: JsonElement,
)

@Serializable
data class CategoryUplayResponseItemsR6Operators(
	val img: String,
	val name: String,
	val url: String,
)

@Serializable
data class CategoryUplayResponseItemsSeller(
	@SerialName("user_id")
	val userId: Long,
	@SerialName("sold_items_count")
	val soldItemsCount: Long,
	@SerialName("active_items_count")
	val activeItemsCount: Long,
	@SerialName("restore_data")
	val restoreData: String,
	val username: String,
	@SerialName("avatar_date")
	val avatarDate: Long,
	@SerialName("is_banned")
	val isBanned: Long,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Long,
	@SerialName("restore_percents")
	val restorePercents: Long,
)

@Serializable
data class CategoryUplayResponseItems(
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
	@SerialName("view_count")
	val viewCount: Long,
	@SerialName("is_sticky")
	val isSticky: Long,
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
	@SerialName("email_type")
	val emailType: String,
	@SerialName("email_provider")
	val emailProvider: String,
	@SerialName("item_domain")
	val itemDomain: String,
	@SerialName("resale_item_origin")
	val resaleItemOrigin: String,
	@SerialName("uplay_item_id")
	val uplayItemId: Long,
	@SerialName("uplay_last_activity")
	val uplayLastActivity: Long,
	@SerialName("uplay_country")
	val uplayCountry: String,
	@SerialName("uplay_created_date")
	val uplayCreatedDate: Long,
	@SerialName("uplay_games")
	val uplayGames: CategoryUplayResponseItemsUplayGames,
	@SerialName("uplay_game_count")
	val uplayGameCount: Long,
	@SerialName("uplay_r6_level")
	val uplayR6Level: Long,
	@SerialName("uplay_r6_ban")
	val uplayR6Ban: Long,
	@SerialName("uplay_r6_operators")
	val uplayR6Operators: String,
	@SerialName("uplay_r6_operators_count")
	val uplayR6OperatorsCount: Long,
	@SerialName("uplay_r6_skins")
	val uplayR6Skins: String,
	@SerialName("uplay_r6_skins_count")
	val uplayR6SkinsCount: Long,
	@SerialName("uplay_subscription")
	val uplaySubscription: String,
	@SerialName("uplay_subscription_end_date")
	val uplaySubscriptionEndDate: Long,
	@SerialName("uplay_xbox_connected")
	val uplayXboxConnected: Long,
	@SerialName("uplay_psn_connected")
	val uplayPsnConnected: Long,
	@SerialName("uplay_steam_connected")
	val uplaySteamConnected: Long,
	@SerialName("uplay_r6_rank")
	val uplayR6Rank: Long,
	@SerialName("feedback_data")
	val feedbackData: String,
	val isIgnored: Boolean,
	val priceWithSellerFee: Long,
	val guarantee: JsonElement,
	val canViewLoginData: Boolean,
	val canUpdateItemStats: Boolean,
	val canReportItem: Boolean,
	val canViewEmailLoginData: Boolean,
	val showGetEmailCodeButton: Boolean,
	val canOpenItem: Boolean,
	val canCloseItem: Boolean,
	val canEditItem: Boolean,
	val canDeleteItem: Boolean,
	val canStickItem: Boolean,
	val canUnstickItem: Boolean,
	val bumpSettings: CategoryUplayResponseItemsBumpSettings,
	val canBumpItem: Boolean,
	val canBuyItem: Boolean,
	@SerialName("rub_price")
	val rubPrice: Long,
	@SerialName("price_currency")
	val priceCurrency: String,
	val canValidateAccount: Boolean,
	val canResellItemAfterPurchase: Boolean,
	val uplayLinkedAccounts: String,
	@SerialName("uplay_r6_steam_warning")
	val uplayR6SteamWarning: Boolean,
	@SerialName("uplay_r6_external_warning")
	val uplayR6ExternalWarning: Boolean,
	@SerialName("uplay_r6")
	val uplayR6: Boolean,
	@SerialName("uplay_r6_ban_active")
	val uplayR6BanActive: Boolean,
	val isSmallExf: Boolean,
	@SerialName("account_last_activity")
	val accountLastActivity: Long,
	val r6Skins: List<JsonElement>,
	val r6Operators: List<CategoryUplayResponseItemsR6Operators>,
	val canViewAccountLink: Boolean,
	val emailLoginUrl: String,
	val canChangePassword: Boolean,
	val itemOriginPhrase: String,
	@SerialName("sold_items_category_count")
	val soldItemsCategoryCount: Long,
	@SerialName("restore_items_category_count")
	val restoreItemsCategoryCount: Long,
	val tags: List<JsonElement>,
	@SerialName("note_text")
	val noteText: JsonElement,
	val hasPendingAutoBuy: Boolean,
	val descriptionHtml: String,
	val descriptionEnHtml: String,
	val descriptionPlain: String,
	val descriptionEnPlain: String,
	val seller: CategoryUplayResponseItemsSeller,
)

@Serializable
data class CategoryDiscordParams(
	val page: Long? = null,
	val pmin: Long? = null,
	val pmax: Long? = null,
	val title: String? = null,
	@SerialName("order_by")
	val orderBy: String? = null,
	@SerialName("tag_id[]")
	val tagId: List<Long>? = null,
	@SerialName("not_tag_id[]")
	val notTagId: List<Long>? = null,
	@SerialName("public_tag_id[]")
	val publicTagId: List<Long>? = null,
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Long>? = null,
	@SerialName("origin[]")
	val origin: JsonElement? = null,
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
	@SerialName("user_id")
	val userId: Long? = null,
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
	val nitroLength: Long? = null,
	@SerialName("nitro_period")
	val nitroPeriod: String? = null,
	@SerialName("boosts_min")
	val boostsMin: Long? = null,
	@SerialName("boosts_max")
	val boostsMax: Long? = null,
	val billing: String? = null,
	val gifts: String? = null,
	val transactions: String? = null,
	@SerialName("badge[]")
	val badge: JsonElement? = null,
	@SerialName("condition[]")
	val condition: JsonElement? = null,
	@SerialName("chat_min")
	val chatMin: Long? = null,
	@SerialName("chat_max")
	val chatMax: Long? = null,
	@SerialName("min_admin_members")
	val minAdminMembers: Long? = null,
	@SerialName("max_admin_members")
	val maxAdminMembers: Long? = null,
	@SerialName("min_admin")
	val minAdmin: Long? = null,
	@SerialName("max_admin")
	val maxAdmin: Long? = null,
	val reg: Long? = null,
	@SerialName("reg_period")
	val regPeriod: String? = null,
	@SerialName("language[]")
	val language: List<String>? = null,
	@SerialName("not_language[]")
	val notLanguage: List<String>? = null,
	val clans: String? = null,
	@SerialName("min_admin_clans")
	val minAdminClans: Long? = null,
	@SerialName("max_admin_clans")
	val maxAdminClans: Long? = null,
	@SerialName("min_owner_clans")
	val minOwnerClans: Long? = null,
	@SerialName("max_owner_clans")
	val maxOwnerClans: Long? = null,
	@SerialName("country[]")
	val country: List<String>? = null,
	@SerialName("not_country[]")
	val notCountry: List<String>? = null,
	@SerialName("min_servers")
	val minServers: Long? = null,
	@SerialName("max_servers")
	val maxServers: Long? = null,
	@SerialName("2fa")
	val `2fa`: String? = null,
	@SerialName("min_full_credits")
	val minFullCredits: Long? = null,
	@SerialName("max_full_credits")
	val maxFullCredits: Long? = null,
	@SerialName("min_basic_credits")
	val minBasicCredits: Long? = null,
	@SerialName("max_basic_credits")
	val maxBasicCredits: Long? = null,
	@SerialName("min_orbs")
	val minOrbs: Long? = null,
	@SerialName("max_orbs")
	val maxOrbs: Long? = null,
)

@Serializable
data class CategoryDiscordResponse(
	val items: List<CategoryDiscordResponseItems>? = null,
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
data class CategoryDiscordResponseItemsBumpSettings(
	val canBumpItem: Boolean,
	val canBumpItemGlobally: Boolean,
	val shortErrorPhrase: JsonElement,
	val errorPhrase: JsonElement,
)

@Serializable
data class CategoryDiscordResponseItemsSeller(
	@SerialName("user_id")
	val userId: Long,
	@SerialName("sold_items_count")
	val soldItemsCount: Long,
	@SerialName("active_items_count")
	val activeItemsCount: Long,
	@SerialName("restore_data")
	val restoreData: String,
	val username: String,
	@SerialName("avatar_date")
	val avatarDate: Long,
	@SerialName("is_banned")
	val isBanned: Long,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Long,
	@SerialName("restore_percents")
	val restorePercents: JsonElement,
)

@Serializable
data class CategoryDiscordResponseItems(
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
	@SerialName("view_count")
	val viewCount: Long,
	@SerialName("is_sticky")
	val isSticky: Long,
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
	@SerialName("email_type")
	val emailType: String,
	@SerialName("email_provider")
	val emailProvider: String,
	@SerialName("item_domain")
	val itemDomain: String,
	@SerialName("resale_item_origin")
	val resaleItemOrigin: String,
	@SerialName("discord_item_id")
	val discordItemId: Long,
	@SerialName("discord_chat_count")
	val discordChatCount: Long,
	@SerialName("discord_verified")
	val discordVerified: Long,
	@SerialName("discord_condition")
	val discordCondition: String,
	@SerialName("discord_gifts")
	val discordGifts: Long,
	@SerialName("discord_billing")
	val discordBilling: Long,
	@SerialName("discord_register_date")
	val discordRegisterDate: Long,
	@SerialName("discord_locale")
	val discordLocale: String,
	@SerialName("discord_nitro_end_date")
	val discordNitroEndDate: Long,
	@SerialName("discord_available_boosts")
	val discordAvailableBoosts: Long,
	@SerialName("discord_nitro_type")
	val discordNitroType: Long,
	@SerialName("discord_admin_members_count")
	val discordAdminMembersCount: Long,
	@SerialName("discord_admin_servers_count")
	val discordAdminServersCount: Long,
	@SerialName("discord_admin_servers")
	val discordAdminServers: String,
	@SerialName("feedback_data")
	val feedbackData: String,
	val isIgnored: Boolean,
	val priceWithSellerFee: Long,
	val guarantee: JsonElement,
	val canViewLoginData: Boolean,
	val canUpdateItemStats: Boolean,
	val canReportItem: Boolean,
	val canViewEmailLoginData: Boolean,
	val showGetEmailCodeButton: Boolean,
	val canOpenItem: Boolean,
	val canCloseItem: Boolean,
	val canEditItem: Boolean,
	val canDeleteItem: Boolean,
	val canStickItem: Boolean,
	val canUnstickItem: Boolean,
	val bumpSettings: CategoryDiscordResponseItemsBumpSettings,
	val canBumpItem: Boolean,
	val canBuyItem: Boolean,
	@SerialName("rub_price")
	val rubPrice: Long,
	@SerialName("price_currency")
	val priceCurrency: String,
	val canValidateAccount: Boolean,
	val canResellItemAfterPurchase: Boolean,
	val discordAccountConditionLabel: String,
	val discordLocaleTitle: String,
	val canViewAccountLink: Boolean,
	val emailLoginUrl: String,
	val canChangePassword: Boolean,
	val itemOriginPhrase: String,
	val tags: List<JsonElement>,
	@SerialName("note_text")
	val noteText: JsonElement,
	val hasPendingAutoBuy: Boolean,
	val descriptionHtml: String,
	val descriptionEnHtml: String,
	val descriptionPlain: String,
	val descriptionEnPlain: String,
	val seller: CategoryDiscordResponseItemsSeller,
)

@Serializable
data class CategoryTikTokParams(
	val page: Long? = null,
	val pmin: Long? = null,
	val pmax: Long? = null,
	val title: String? = null,
	@SerialName("order_by")
	val orderBy: String? = null,
	@SerialName("tag_id[]")
	val tagId: List<Long>? = null,
	@SerialName("not_tag_id[]")
	val notTagId: List<Long>? = null,
	@SerialName("public_tag_id[]")
	val publicTagId: List<Long>? = null,
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Long>? = null,
	@SerialName("origin[]")
	val origin: JsonElement? = null,
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
	@SerialName("user_id")
	val userId: Long? = null,
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
	val reg: Long? = null,
	@SerialName("reg_period")
	val regPeriod: String? = null,
	@SerialName("followers_min")
	val followersMin: Long? = null,
	@SerialName("followers_max")
	val followersMax: Long? = null,
	@SerialName("post_min")
	val postMin: Long? = null,
	@SerialName("post_max")
	val postMax: Long? = null,
	@SerialName("like_min")
	val likeMin: Long? = null,
	@SerialName("like_max")
	val likeMax: Long? = null,
	@SerialName("coins_min")
	val coinsMin: Long? = null,
	@SerialName("coins_max")
	val coinsMax: Long? = null,
	@SerialName("cookie_login")
	val cookieLogin: String? = null,
	val verified: String? = null,
	val email: String? = null,
)

@Serializable
data class CategoryTikTokResponse(
	val items: List<CategoryTikTokResponseItems>? = null,
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
data class CategoryTikTokResponseItemsBumpSettings(
	val canBumpItem: Boolean,
	val canBumpItemGlobally: Boolean,
	val shortErrorPhrase: JsonElement,
	val errorPhrase: JsonElement,
)

@Serializable
data class CategoryTikTokResponseItemsAccountLinks(
	val link: String,
	val text: String,
	val iconClass: String,
)

@Serializable
data class CategoryTikTokResponseItemsSeller(
	@SerialName("user_id")
	val userId: Long,
	@SerialName("sold_items_count")
	val soldItemsCount: Long,
	@SerialName("active_items_count")
	val activeItemsCount: Long,
	@SerialName("restore_data")
	val restoreData: String,
	val username: String,
	@SerialName("avatar_date")
	val avatarDate: Long,
	@SerialName("is_banned")
	val isBanned: Long,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Long,
	@SerialName("restore_percents")
	val restorePercents: Long,
)

@Serializable
data class CategoryTikTokResponseItems(
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
	@SerialName("view_count")
	val viewCount: Long,
	@SerialName("is_sticky")
	val isSticky: Long,
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
	@SerialName("email_type")
	val emailType: String,
	@SerialName("email_provider")
	val emailProvider: JsonElement,
	@SerialName("item_domain")
	val itemDomain: String,
	@SerialName("resale_item_origin")
	val resaleItemOrigin: String,
	@SerialName("tt_item_id")
	val ttItemId: Long,
	@SerialName("tt_id")
	val ttId: Long,
	@SerialName("tt_permalink")
	val ttPermalink: String,
	@SerialName("tt_uniqueId")
	val ttUniqueId: String,
	@SerialName("tt_verified")
	val ttVerified: Long,
	@SerialName("tt_createTime")
	val ttCreateTime: Long,
	@SerialName("tt_privateAccount")
	val ttPrivateAccount: Long,
	@SerialName("tt_followers")
	val ttFollowers: Long,
	@SerialName("tt_following")
	val ttFollowing: Long,
	@SerialName("tt_likes")
	val ttLikes: Long,
	@SerialName("tt_videos")
	val ttVideos: Long,
	@SerialName("tt_screen_name")
	val ttScreenName: String,
	@SerialName("tt_hasEmail")
	val ttHasEmail: Long,
	@SerialName("tt_hasMobile")
	val ttHasMobile: Long,
	@SerialName("tt_top_country")
	val ttTopCountry: String,
	@SerialName("tt_countries")
	val ttCountries: String,
	@SerialName("tt_coins")
	val ttCoins: Long,
	@SerialName("tt_hasLivePermission")
	val ttHasLivePermission: Long,
	@SerialName("tt_cookie_login")
	val ttCookieLogin: Long,
	@SerialName("feedback_data")
	val feedbackData: String,
	val isIgnored: Boolean,
	val priceWithSellerFee: Long,
	val guarantee: JsonElement,
	val canViewLoginData: Boolean,
	val canUpdateItemStats: Boolean,
	val canReportItem: Boolean,
	val canViewEmailLoginData: Boolean,
	val showGetEmailCodeButton: Boolean,
	val canOpenItem: Boolean,
	val canCloseItem: Boolean,
	val canEditItem: Boolean,
	val canDeleteItem: Boolean,
	val canStickItem: Boolean,
	val canUnstickItem: Boolean,
	val bumpSettings: CategoryTikTokResponseItemsBumpSettings,
	val canBumpItem: Boolean,
	val canBuyItem: Boolean,
	@SerialName("rub_price")
	val rubPrice: Long,
	@SerialName("price_currency")
	val priceCurrency: String,
	val canValidateAccount: Boolean,
	val canResellItemAfterPurchase: Boolean,
	val canViewAccountLink: Boolean,
	val accountLinks: List<CategoryTikTokResponseItemsAccountLinks>,
	val accountLink: String,
	val canChangePassword: Boolean,
	val itemOriginPhrase: String,
	@SerialName("sold_items_category_count")
	val soldItemsCategoryCount: Long,
	@SerialName("restore_items_category_count")
	val restoreItemsCategoryCount: Long,
	val tags: List<JsonElement>,
	@SerialName("note_text")
	val noteText: JsonElement,
	val hasPendingAutoBuy: Boolean,
	val descriptionHtml: String,
	val descriptionEnHtml: String,
	val descriptionPlain: String,
	val descriptionEnPlain: String,
	val seller: CategoryTikTokResponseItemsSeller,
)

@Serializable
data class CategoryInstagramParams(
	val page: Long? = null,
	val pmin: Long? = null,
	val pmax: Long? = null,
	val title: String? = null,
	@SerialName("order_by")
	val orderBy: String? = null,
	@SerialName("tag_id[]")
	val tagId: List<Long>? = null,
	@SerialName("not_tag_id[]")
	val notTagId: List<Long>? = null,
	@SerialName("public_tag_id[]")
	val publicTagId: List<Long>? = null,
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Long>? = null,
	@SerialName("origin[]")
	val origin: JsonElement? = null,
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
	@SerialName("user_id")
	val userId: Long? = null,
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
	val followersMin: Long? = null,
	@SerialName("followers_max")
	val followersMax: Long? = null,
	@SerialName("post_min")
	val postMin: Long? = null,
	@SerialName("post_max")
	val postMax: Long? = null,
	val reg: Long? = null,
	@SerialName("reg_period")
	val regPeriod: String? = null,
)

@Serializable
data class CategoryInstagramResponse(
	val items: List<CategoryInstagramResponseItems>? = null,
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
data class CategoryInstagramResponseItemsBumpSettings(
	val canBumpItem: Boolean,
	val canBumpItemGlobally: Boolean,
	val shortErrorPhrase: JsonElement,
	val errorPhrase: JsonElement,
)

@Serializable
data class CategoryInstagramResponseItemsAccountLinks(
	val link: String,
	val text: String,
	val iconClass: String,
)

@Serializable
data class CategoryInstagramResponseItemsSeller(
	@SerialName("user_id")
	val userId: Long,
	@SerialName("sold_items_count")
	val soldItemsCount: Long,
	@SerialName("active_items_count")
	val activeItemsCount: Long,
	@SerialName("restore_data")
	val restoreData: String,
	val username: String,
	@SerialName("avatar_date")
	val avatarDate: Long,
	@SerialName("is_banned")
	val isBanned: Long,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Long,
	@SerialName("restore_percents")
	val restorePercents: JsonElement,
)

@Serializable
data class CategoryInstagramResponseItems(
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
	@SerialName("view_count")
	val viewCount: Long,
	@SerialName("is_sticky")
	val isSticky: Long,
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
	@SerialName("email_type")
	val emailType: String,
	@SerialName("email_provider")
	val emailProvider: String,
	@SerialName("item_domain")
	val itemDomain: String,
	@SerialName("resale_item_origin")
	val resaleItemOrigin: String,
	@SerialName("instagram_item_id")
	val instagramItemId: Long,
	@SerialName("instagram_id")
	val instagramId: String,
	@SerialName("instagram_follower_count")
	val instagramFollowerCount: Long,
	@SerialName("instagram_follow_count")
	val instagramFollowCount: Long,
	@SerialName("instagram_post_count")
	val instagramPostCount: Long,
	@SerialName("instagram_country")
	val instagramCountry: String,
	@SerialName("instagram_username")
	val instagramUsername: String,
	@SerialName("instagram_mobile")
	val instagramMobile: Long,
	@SerialName("instagram_register_date")
	val instagramRegisterDate: Long,
	@SerialName("instagram_has_cookies")
	val instagramHasCookies: Long,
	@SerialName("instagram_login_without_cookies")
	val instagramLoginWithoutCookies: Long,
	@SerialName("feedback_data")
	val feedbackData: String,
	val isIgnored: Boolean,
	val priceWithSellerFee: Long,
	val guarantee: JsonElement,
	val canViewLoginData: Boolean,
	val canUpdateItemStats: Boolean,
	val canReportItem: Boolean,
	val canViewEmailLoginData: Boolean,
	val showGetEmailCodeButton: Boolean,
	val canOpenItem: Boolean,
	val canCloseItem: Boolean,
	val canEditItem: Boolean,
	val canDeleteItem: Boolean,
	val canStickItem: Boolean,
	val canUnstickItem: Boolean,
	val bumpSettings: CategoryInstagramResponseItemsBumpSettings,
	val canBumpItem: Boolean,
	val canBuyItem: Boolean,
	@SerialName("rub_price")
	val rubPrice: Long,
	@SerialName("price_currency")
	val priceCurrency: String,
	val canValidateAccount: Boolean,
	val canResellItemAfterPurchase: Boolean,
	val canViewAccountLink: Boolean,
	val accountLinks: List<CategoryInstagramResponseItemsAccountLinks>,
	val accountLink: String,
	val emailLoginUrl: String,
	val canChangePassword: Boolean,
	val itemOriginPhrase: String,
	val tags: List<JsonElement>,
	@SerialName("note_text")
	val noteText: JsonElement,
	val hasPendingAutoBuy: Boolean,
	val descriptionHtml: String,
	val descriptionEnHtml: String,
	val descriptionPlain: String,
	val descriptionEnPlain: String,
	val seller: CategoryInstagramResponseItemsSeller,
)

@Serializable
data class CategoryBattleNetParams(
	val page: Long? = null,
	val pmin: Long? = null,
	val pmax: Long? = null,
	val title: String? = null,
	@SerialName("order_by")
	val orderBy: String? = null,
	@SerialName("tag_id[]")
	val tagId: List<Long>? = null,
	@SerialName("not_tag_id[]")
	val notTagId: List<Long>? = null,
	@SerialName("public_tag_id[]")
	val publicTagId: List<Long>? = null,
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Long>? = null,
	@SerialName("origin[]")
	val origin: JsonElement? = null,
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
	@SerialName("user_id")
	val userId: Long? = null,
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
	val eg: Long? = null,
	@SerialName("game[]")
	val game: List<Long>? = null,
	val daybreak: Long? = null,
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
	val balanceMin: Long? = null,
	@SerialName("balance_max")
	val balanceMax: Long? = null,
)

@Serializable
data class CategoryBattleNetResponse(
	val items: List<CategoryBattleNetResponseItems>? = null,
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
data class CategoryBattleNetResponseItemsGuarantee(
	val duration: Long,
	val `class`: String,
	val durationPhrase: String,
	val endDate: JsonElement,
	val active: JsonElement,
	val cancelled: JsonElement,
	val remainingTime: JsonElement,
)

@Serializable
data class CategoryBattleNetResponseItemsBumpSettings(
	val canBumpItem: Boolean,
	val canBumpItemGlobally: Boolean,
	val shortErrorPhrase: JsonElement,
	val errorPhrase: JsonElement,
)

@Serializable
data class CategoryBattleNetResponseItemsBattlenetGames17459(
	@SerialName("internal_game_id")
	val internalGameId: Long,
	@SerialName("app_id")
	val appId: String,
	val title: String,
	val abbr: String,
	@SerialName("category_id")
	val categoryId: Long,
	val img: String,
	val url: String,
	val ru: JsonElement,
)

@Serializable
data class CategoryBattleNetResponseItemsBattlenetGames(
	@SerialName("17459")
	val `17459`: CategoryBattleNetResponseItemsBattlenetGames17459,
)

@Serializable
data class CategoryBattleNetResponseItemsBattlenetTransactions(
	val date: Long,
	val productTitle: String,
	val formattedTotal: String,
	val total: String,
)

@Serializable
data class CategoryBattleNetResponseItemsSeller(
	@SerialName("user_id")
	val userId: Long,
	@SerialName("sold_items_count")
	val soldItemsCount: Long,
	@SerialName("active_items_count")
	val activeItemsCount: Long,
	@SerialName("restore_data")
	val restoreData: String,
	val username: String,
	@SerialName("avatar_date")
	val avatarDate: Long,
	@SerialName("is_banned")
	val isBanned: Long,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Long,
	@SerialName("restore_percents")
	val restorePercents: Long,
)

@Serializable
data class CategoryBattleNetResponseItems(
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
	@SerialName("view_count")
	val viewCount: Long,
	@SerialName("is_sticky")
	val isSticky: Long,
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
	@SerialName("email_type")
	val emailType: String,
	@SerialName("email_provider")
	val emailProvider: String,
	@SerialName("item_domain")
	val itemDomain: String,
	@SerialName("resale_item_origin")
	val resaleItemOrigin: String,
	@SerialName("battlenet_item_id")
	val battlenetItemId: Long,
	@SerialName("battlenet_balance")
	val battlenetBalance: String,
	@SerialName("battlenet_country")
	val battlenetCountry: String,
	@SerialName("battlenet_last_activity")
	val battlenetLastActivity: Long,
	@SerialName("battlenet_mobile")
	val battlenetMobile: Long,
	@SerialName("battlenet_bans")
	val battlenetBans: String,
	@SerialName("battlenet_can_change_tag")
	val battlenetCanChangeTag: Long,
	@SerialName("battlenet_real_id_enabled")
	val battlenetRealIdEnabled: Long,
	@SerialName("battlenet_change_full_name")
	val battlenetChangeFullName: Long,
	@SerialName("battlenet_parent_control")
	val battlenetParentControl: Long,
	@SerialName("battlenet_converted_balance")
	val battlenetConvertedBalance: Long,
	@SerialName("feedback_data")
	val feedbackData: String,
	val isIgnored: Boolean,
	val priceWithSellerFee: Long,
	val guarantee: CategoryBattleNetResponseItemsGuarantee,
	val canViewLoginData: Boolean,
	val canUpdateItemStats: Boolean,
	val canReportItem: Boolean,
	val canViewEmailLoginData: Boolean,
	val showGetEmailCodeButton: Boolean,
	val canOpenItem: Boolean,
	val canCloseItem: Boolean,
	val canEditItem: Boolean,
	val canDeleteItem: Boolean,
	val canStickItem: Boolean,
	val canUnstickItem: Boolean,
	val bumpSettings: CategoryBattleNetResponseItemsBumpSettings,
	val canBumpItem: Boolean,
	val canBuyItem: Boolean,
	@SerialName("rub_price")
	val rubPrice: Long,
	@SerialName("price_currency")
	val priceCurrency: String,
	val canValidateAccount: Boolean,
	val canResellItemAfterPurchase: Boolean,
	val isSmallExf: Boolean,
	@SerialName("account_last_activity")
	val accountLastActivity: Long,
	val battlenetGames: CategoryBattleNetResponseItemsBattlenetGames,
	val hasOverwatch: Boolean,
	val battlenetTransactions: List<CategoryBattleNetResponseItemsBattlenetTransactions>,
	val displayConvertedBalance: Boolean,
	val canViewAccountLink: Boolean,
	val accountLinks: List<JsonElement>,
	val emailLoginUrl: String,
	val canChangePassword: Boolean,
	val itemOriginPhrase: String,
	@SerialName("sold_items_category_count")
	val soldItemsCategoryCount: Long,
	@SerialName("restore_items_category_count")
	val restoreItemsCategoryCount: Long,
	val tags: List<JsonElement>,
	@SerialName("note_text")
	val noteText: JsonElement,
	val hasPendingAutoBuy: Boolean,
	val descriptionHtml: String,
	val descriptionEnHtml: String,
	val descriptionPlain: String,
	val descriptionEnPlain: String,
	val seller: CategoryBattleNetResponseItemsSeller,
)

@Serializable
data class CategoryChatGPTParams(
	val page: Long? = null,
	val pmin: Long? = null,
	val pmax: Long? = null,
	val title: String? = null,
	@SerialName("order_by")
	val orderBy: String? = null,
	@SerialName("tag_id[]")
	val tagId: List<Long>? = null,
	@SerialName("not_tag_id[]")
	val notTagId: List<Long>? = null,
	@SerialName("public_tag_id[]")
	val publicTagId: List<Long>? = null,
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Long>? = null,
	@SerialName("origin[]")
	val origin: JsonElement? = null,
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
	@SerialName("user_id")
	val userId: Long? = null,
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
	val subscriptionLength: Long? = null,
	@SerialName("subscription_period")
	val subscriptionPeriod: String? = null,
	val autorenewal: String? = null,
	val tel: String? = null,
	val transactions: String? = null,
	val reg: Long? = null,
	@SerialName("reg_period")
	val regPeriod: String? = null,
	@SerialName("openai_tier[]")
	val openaiTier: JsonElement? = null,
	@SerialName("openai_balance_min")
	val openaiBalanceMin: Long? = null,
	@SerialName("openai_balance_max")
	val openaiBalanceMax: Long? = null,
)

@Serializable
data class CategoryChatGPTResponse(
	val items: List<CategoryChatGPTResponseItems>? = null,
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
data class CategoryChatGPTResponseItemsCopyFormatData(
	@SerialName("title_link")
	val titleLink: String,
)

@Serializable
data class CategoryChatGPTResponseItemsBumpSettings(
	val canBumpItem: Boolean,
	val canBumpItemGlobally: Boolean,
	val shortErrorPhrase: JsonElement,
	val errorPhrase: JsonElement,
)

@Serializable
data class CategoryChatGPTResponseItemsSeller(
	@SerialName("user_id")
	val userId: Long,
	@SerialName("sold_items_count")
	val soldItemsCount: Long,
	@SerialName("active_items_count")
	val activeItemsCount: Long,
	@SerialName("restore_data")
	val restoreData: String,
	val username: String,
	@SerialName("avatar_date")
	val avatarDate: Long,
	@SerialName("is_banned")
	val isBanned: Long,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Long,
	@SerialName("restore_percents")
	val restorePercents: JsonElement,
)

@Serializable
data class CategoryChatGPTResponseItems(
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
	@SerialName("view_count")
	val viewCount: Long,
	@SerialName("is_sticky")
	val isSticky: Long,
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
	@SerialName("email_type")
	val emailType: String,
	@SerialName("email_provider")
	val emailProvider: String,
	@SerialName("item_domain")
	val itemDomain: String,
	@SerialName("resale_item_origin")
	val resaleItemOrigin: String,
	@SerialName("chatgpt_item_id")
	val chatgptItemId: Long,
	@SerialName("chatgpt_country")
	val chatgptCountry: String,
	@SerialName("chatgpt_register_date")
	val chatgptRegisterDate: Long,
	@SerialName("chatgpt_phone")
	val chatgptPhone: Long,
	@SerialName("chatgpt_subscription")
	val chatgptSubscription: String,
	@SerialName("chatgpt_subscription_ends")
	val chatgptSubscriptionEnds: Long,
	@SerialName("chatgpt_subscription_auto_renew")
	val chatgptSubscriptionAutoRenew: Long,
	@SerialName("feedback_data")
	val feedbackData: String,
	val isIgnored: Boolean,
	val priceWithSellerFee: Double,
	val guarantee: JsonElement,
	val canViewLoginData: Boolean,
	val canUpdateItemStats: Boolean,
	val canReportItem: Boolean,
	val canViewItemViews: Boolean,
	val canViewEmailLoginData: Boolean,
	val copyFormatData: CategoryChatGPTResponseItemsCopyFormatData,
	val showGetEmailCodeButton: Boolean,
	val canOpenItem: Boolean,
	val canCloseItem: Boolean,
	val canEditItem: Boolean,
	val canDeleteItem: Boolean,
	val canStickItem: Boolean,
	val canUnstickItem: Boolean,
	val bumpSettings: CategoryChatGPTResponseItemsBumpSettings,
	val isPersonalAccount: Boolean,
	val canBumpItem: Boolean,
	val canBuyItem: Boolean,
	@SerialName("rub_price")
	val rubPrice: Long,
	@SerialName("price_currency")
	val priceCurrency: String,
	val priceWithSellerFeeLabel: String,
	val canValidateAccount: Boolean,
	val canResellItemAfterPurchase: Boolean,
	val gptSubType: String,
	val canViewAccountLink: Boolean,
	val emailLoginUrl: String,
	val canChangePassword: Boolean,
	val canChangeEmailPassword: Boolean,
	val uniqueKeyExists: Boolean,
	val itemOriginPhrase: String,
	val tags: List<JsonElement>,
	@SerialName("note_text")
	val noteText: JsonElement,
	val hasPendingAutoBuy: Boolean,
	val descriptionHtml: String,
	val descriptionEnHtml: String,
	val descriptionPlain: String,
	val descriptionEnPlain: String,
	val seller: CategoryChatGPTResponseItemsSeller,
)

@Serializable
data class CategoryVpnParams(
	val page: Long? = null,
	val pmin: Long? = null,
	val pmax: Long? = null,
	val title: String? = null,
	@SerialName("order_by")
	val orderBy: String? = null,
	@SerialName("tag_id[]")
	val tagId: List<Long>? = null,
	@SerialName("not_tag_id[]")
	val notTagId: List<Long>? = null,
	@SerialName("public_tag_id[]")
	val publicTagId: List<Long>? = null,
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Long>? = null,
	@SerialName("origin[]")
	val origin: JsonElement? = null,
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
	@SerialName("user_id")
	val userId: Long? = null,
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
	val subscriptionLength: Long? = null,
	@SerialName("subscription_period")
	val subscriptionPeriod: String? = null,
	val autorenewal: String? = null,
)

@Serializable
data class CategoryVpnResponse(
	val items: List<CategoryVpnResponseItems>? = null,
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
data class CategoryVpnResponseItemsBumpSettings(
	val canBumpItem: Boolean,
	val canBumpItemGlobally: Boolean,
	val shortErrorPhrase: JsonElement,
	val errorPhrase: JsonElement,
)

@Serializable
data class CategoryVpnResponseItemsSeller(
	@SerialName("user_id")
	val userId: Long,
	@SerialName("sold_items_count")
	val soldItemsCount: Long,
	@SerialName("active_items_count")
	val activeItemsCount: Long,
	@SerialName("restore_data")
	val restoreData: String,
	val username: String,
	@SerialName("avatar_date")
	val avatarDate: Long,
	@SerialName("is_banned")
	val isBanned: Long,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Long,
	@SerialName("restore_percents")
	val restorePercents: Long,
)

@Serializable
data class CategoryVpnResponseItems(
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
	@SerialName("view_count")
	val viewCount: Long,
	@SerialName("is_sticky")
	val isSticky: Long,
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
	@SerialName("email_type")
	val emailType: String,
	@SerialName("email_provider")
	val emailProvider: JsonElement,
	@SerialName("item_domain")
	val itemDomain: String,
	@SerialName("resale_item_origin")
	val resaleItemOrigin: String,
	@SerialName("vpn_item_id")
	val vpnItemId: Long,
	@SerialName("vpn_service")
	val vpnService: String,
	@SerialName("vpn_expire_date")
	val vpnExpireDate: Long,
	@SerialName("vpn_renewable")
	val vpnRenewable: Long,
	@SerialName("feedback_data")
	val feedbackData: String,
	val isIgnored: Boolean,
	val priceWithSellerFee: Long,
	val guarantee: JsonElement,
	val canViewLoginData: Boolean,
	val canUpdateItemStats: Boolean,
	val canReportItem: Boolean,
	val canViewEmailLoginData: Boolean,
	val showGetEmailCodeButton: Boolean,
	val canOpenItem: Boolean,
	val canCloseItem: Boolean,
	val canEditItem: Boolean,
	val canDeleteItem: Boolean,
	val canStickItem: Boolean,
	val canUnstickItem: Boolean,
	val bumpSettings: CategoryVpnResponseItemsBumpSettings,
	val canBumpItem: Boolean,
	val canBuyItem: Boolean,
	@SerialName("rub_price")
	val rubPrice: Long,
	@SerialName("price_currency")
	val priceCurrency: String,
	val canValidateAccount: Boolean,
	val canResellItemAfterPurchase: Boolean,
	val vpnProductTitle: String,
	val canViewAccountLink: Boolean,
	val canChangePassword: Boolean,
	val itemOriginPhrase: String,
	@SerialName("sold_items_category_count")
	val soldItemsCategoryCount: Long,
	@SerialName("restore_items_category_count")
	val restoreItemsCategoryCount: Long,
	val tags: List<JsonElement>,
	@SerialName("note_text")
	val noteText: JsonElement,
	val hasPendingAutoBuy: Boolean,
	val descriptionHtml: String,
	val descriptionEnHtml: String,
	val descriptionPlain: String,
	val descriptionEnPlain: String,
	val seller: CategoryVpnResponseItemsSeller,
)

@Serializable
data class CategoryRobloxParams(
	val page: Long? = null,
	val pmin: Long? = null,
	val pmax: Long? = null,
	val title: String? = null,
	@SerialName("order_by")
	val orderBy: String? = null,
	@SerialName("tag_id[]")
	val tagId: List<Long>? = null,
	@SerialName("not_tag_id[]")
	val notTagId: List<Long>? = null,
	@SerialName("public_tag_id[]")
	val publicTagId: List<Long>? = null,
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Long>? = null,
	@SerialName("origin[]")
	val origin: JsonElement? = null,
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
	@SerialName("user_id")
	val userId: Long? = null,
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
	val robuxMin: Long? = null,
	@SerialName("robux_max")
	val robuxMax: Long? = null,
	@SerialName("friends_min")
	val friendsMin: Long? = null,
	@SerialName("friends_max")
	val friendsMax: Long? = null,
	@SerialName("followers_min")
	val followersMin: Long? = null,
	@SerialName("followers_max")
	val followersMax: Long? = null,
	val country: List<String>? = null,
	@SerialName("not_country")
	val notCountry: List<String>? = null,
	val reg: Long? = null,
	@SerialName("reg_period")
	val regPeriod: String? = null,
	val subscription: String? = null,
	@SerialName("subscription_length")
	val subscriptionLength: Long? = null,
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
	val incomingRobuxTotalMin: Long? = null,
	@SerialName("incoming_robux_total_max")
	val incomingRobuxTotalMax: Long? = null,
	@SerialName("limited_price_min")
	val limitedPriceMin: Long? = null,
	@SerialName("limited_price_max")
	val limitedPriceMax: Long? = null,
	@SerialName("gamepass_min")
	val gamepassMin: Long? = null,
	@SerialName("gamepass_max")
	val gamepassMax: Long? = null,
	@SerialName("game_donations")
	val gameDonations: String? = null,
	@SerialName("inv_min")
	val invMin: Long? = null,
	@SerialName("inv_max")
	val invMax: Long? = null,
	@SerialName("ugc_limited_price_min")
	val ugcLimitedPriceMin: Long? = null,
	@SerialName("ugc_limited_price_max")
	val ugcLimitedPriceMax: Long? = null,
	@SerialName("credit_balance_min")
	val creditBalanceMin: Long? = null,
	@SerialName("credit_balance_max")
	val creditBalanceMax: Long? = null,
	@SerialName("offsale_min")
	val offsaleMin: Long? = null,
	@SerialName("offsale_max")
	val offsaleMax: Long? = null,
	val voice: String? = null,
	@SerialName("age_group[]")
	val ageGroup: List<String>? = null,
	@SerialName("not_age_group[]")
	val notAgeGroup: List<String>? = null,
)

@Serializable
data class CategoryRobloxResponse(
	val items: List<CategoryRobloxResponseItems>? = null,
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
data class CategoryRobloxResponseItemsBumpSettings(
	val canBumpItem: Boolean,
	val canBumpItemGlobally: Boolean,
	val shortErrorPhrase: JsonElement,
	val errorPhrase: JsonElement,
)

@Serializable
data class CategoryRobloxResponseItemsRobloxGameDonationsDetails(
	val product: String,
	val amount: Long,
	val type: String,
)

@Serializable
data class CategoryRobloxResponseItemsAccountLinks(
	val link: String,
	val text: String,
	val iconClass: String,
)

@Serializable
data class CategoryRobloxResponseItemsSeller(
	@SerialName("user_id")
	val userId: Long,
	@SerialName("sold_items_count")
	val soldItemsCount: Long,
	@SerialName("active_items_count")
	val activeItemsCount: Long,
	@SerialName("restore_data")
	val restoreData: String,
	val username: String,
	@SerialName("avatar_date")
	val avatarDate: Long,
	@SerialName("is_banned")
	val isBanned: Long,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Long,
	@SerialName("restore_percents")
	val restorePercents: Long,
)

@Serializable
data class CategoryRobloxResponseItems(
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
	@SerialName("view_count")
	val viewCount: Long,
	@SerialName("is_sticky")
	val isSticky: Long,
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
	@SerialName("email_type")
	val emailType: String,
	@SerialName("email_provider")
	val emailProvider: String,
	@SerialName("item_domain")
	val itemDomain: String,
	@SerialName("resale_item_origin")
	val resaleItemOrigin: String,
	@SerialName("roblox_item_id")
	val robloxItemId: Long,
	@SerialName("roblox_id")
	val robloxId: Long,
	@SerialName("roblox_email_verified")
	val robloxEmailVerified: Long,
	@SerialName("roblox_robux")
	val robloxRobux: Long,
	@SerialName("roblox_username")
	val robloxUsername: String,
	@SerialName("roblox_country")
	val robloxCountry: String,
	@SerialName("roblox_register_date")
	val robloxRegisterDate: Long,
	@SerialName("roblox_friends")
	val robloxFriends: Long,
	@SerialName("roblox_followers")
	val robloxFollowers: Long,
	@SerialName("roblox_subscription")
	val robloxSubscription: String,
	@SerialName("roblox_subscription_end_date")
	val robloxSubscriptionEndDate: Long,
	@SerialName("roblox_xbox_connected")
	val robloxXboxConnected: Long,
	@SerialName("roblox_incoming_robux_total")
	val robloxIncomingRobuxTotal: Long,
	@SerialName("roblox_limited_price")
	val robloxLimitedPrice: Long,
	@SerialName("roblox_verified")
	val robloxVerified: Long,
	@SerialName("roblox_age_verified")
	val robloxAgeVerified: Long,
	@SerialName("roblox_psn_connected")
	val robloxPsnConnected: Long,
	@SerialName("roblox_subscription_auto_renew")
	val robloxSubscriptionAutoRenew: Long,
	@SerialName("roblox_game_pass_total_robux")
	val robloxGamePassTotalRobux: Long,
	@SerialName("roblox_game_donations")
	val robloxGameDonations: String,
	@SerialName("roblox_inventory_price")
	val robloxInventoryPrice: Long,
	@SerialName("roblox_ugc_limited_price")
	val robloxUgcLimitedPrice: Long,
	@SerialName("roblox_credit_balance")
	val robloxCreditBalance: Long,
	@SerialName("feedback_data")
	val feedbackData: String,
	val isIgnored: Boolean,
	val priceWithSellerFee: Long,
	val guarantee: JsonElement,
	val canViewLoginData: Boolean,
	val canUpdateItemStats: Boolean,
	val canReportItem: Boolean,
	val canViewEmailLoginData: Boolean,
	val showGetEmailCodeButton: Boolean,
	val canOpenItem: Boolean,
	val canCloseItem: Boolean,
	val canEditItem: Boolean,
	val canDeleteItem: Boolean,
	val canStickItem: Boolean,
	val canUnstickItem: Boolean,
	val bumpSettings: CategoryRobloxResponseItemsBumpSettings,
	val canBumpItem: Boolean,
	val canBuyItem: Boolean,
	@SerialName("rub_price")
	val rubPrice: Long,
	@SerialName("price_currency")
	val priceCurrency: String,
	val canValidateAccount: Boolean,
	val canResellItemAfterPurchase: Boolean,
	val robloxLinkedAccounts: String,
	val creditBalance: String,
	val robloxGameDonationsDetails: List<CategoryRobloxResponseItemsRobloxGameDonationsDetails>,
	val canViewAccountLink: Boolean,
	val accountLinks: List<CategoryRobloxResponseItemsAccountLinks>,
	val accountLink: String,
	val emailLoginUrl: String,
	val canChangePassword: Boolean,
	val itemOriginPhrase: String,
	@SerialName("sold_items_category_count")
	val soldItemsCategoryCount: Long,
	@SerialName("restore_items_category_count")
	val restoreItemsCategoryCount: Long,
	val tags: List<JsonElement>,
	@SerialName("note_text")
	val noteText: JsonElement,
	val hasPendingAutoBuy: Boolean,
	val descriptionHtml: String,
	val descriptionEnHtml: String,
	val descriptionPlain: String,
	val descriptionEnPlain: String,
	val seller: CategoryRobloxResponseItemsSeller,
)

@Serializable
data class CategoryWarfaceParams(
	val page: Long? = null,
	val pmin: Long? = null,
	val pmax: Long? = null,
	val title: String? = null,
	@SerialName("order_by")
	val orderBy: String? = null,
	@SerialName("tag_id[]")
	val tagId: List<Long>? = null,
	@SerialName("not_tag_id[]")
	val notTagId: List<Long>? = null,
	@SerialName("public_tag_id[]")
	val publicTagId: List<Long>? = null,
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Long>? = null,
	@SerialName("origin[]")
	val origin: JsonElement? = null,
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
	@SerialName("user_id")
	val userId: Long? = null,
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
	val rankMin: Long? = null,
	@SerialName("rank_max")
	val rankMax: Long? = null,
	@SerialName("bonus_rank_min")
	val bonusRankMin: Long? = null,
	@SerialName("bonus_rank_max")
	val bonusRankMax: Long? = null,
	val tel: String? = null,
	val daybreak: Long? = null,
	@SerialName("kredits_min")
	val kreditsMin: Long? = null,
	@SerialName("kredits_max")
	val kreditsMax: Long? = null,
	@SerialName("total_kredits_min")
	val totalKreditsMin: Long? = null,
	@SerialName("total_kredits_max")
	val totalKreditsMax: Long? = null,
)

@Serializable
data class CategoryWarfaceResponse(
	val items: List<CategoryWarfaceResponseItems>? = null,
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
data class CategoryWarfaceResponseItemsBumpSettings(
	val canBumpItem: Boolean,
	val canBumpItemGlobally: Boolean,
	val shortErrorPhrase: JsonElement,
	val errorPhrase: JsonElement,
)

@Serializable
data class CategoryWarfaceResponseItemsWfServers(
	val id: Long,
	val rank: Long,
	val title: String,
)

@Serializable
data class CategoryWarfaceResponseItemsSeller(
	@SerialName("user_id")
	val userId: Long,
	@SerialName("sold_items_count")
	val soldItemsCount: Long,
	@SerialName("active_items_count")
	val activeItemsCount: Long,
	@SerialName("restore_data")
	val restoreData: String,
	val username: String,
	@SerialName("avatar_date")
	val avatarDate: Long,
	@SerialName("is_banned")
	val isBanned: Long,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Long,
	@SerialName("restore_percents")
	val restorePercents: Long,
)

@Serializable
data class CategoryWarfaceResponseItems(
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
	@SerialName("view_count")
	val viewCount: Long,
	@SerialName("is_sticky")
	val isSticky: Long,
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
	@SerialName("email_type")
	val emailType: String,
	@SerialName("email_provider")
	val emailProvider: JsonElement,
	@SerialName("item_domain")
	val itemDomain: String,
	@SerialName("resale_item_origin")
	val resaleItemOrigin: String,
	@SerialName("wf_item_id")
	val wfItemId: Long,
	@SerialName("wf_players")
	val wfPlayers: Boolean,
	@SerialName("wf_server_1")
	val wfServer_1: Long,
	@SerialName("wf_server_2")
	val wfServer_2: Long,
	@SerialName("wf_server_3")
	val wfServer_3: Long,
	@SerialName("wf_mobile")
	val wfMobile: Long,
	@SerialName("wf_bonus_rank")
	val wfBonusRank: Long,
	@SerialName("wf_mail_mobile")
	val wfMailMobile: Long,
	@SerialName("wf_last_game_date")
	val wfLastGameDate: Long,
	@SerialName("wf_loan")
	val wfLoan: Boolean,
	@SerialName("wf_active_loan")
	val wfActiveLoan: Long,
	@SerialName("wf_rank")
	val wfRank: Long,
	@SerialName("feedback_data")
	val feedbackData: String,
	val isIgnored: Boolean,
	val priceWithSellerFee: Long,
	val guarantee: JsonElement,
	val canViewLoginData: Boolean,
	val canUpdateItemStats: Boolean,
	val canReportItem: Boolean,
	val canViewEmailLoginData: Boolean,
	val showGetEmailCodeButton: Boolean,
	val canOpenItem: Boolean,
	val canCloseItem: Boolean,
	val canEditItem: Boolean,
	val canDeleteItem: Boolean,
	val canStickItem: Boolean,
	val canUnstickItem: Boolean,
	val bumpSettings: CategoryWarfaceResponseItemsBumpSettings,
	val canBumpItem: Boolean,
	val canBuyItem: Boolean,
	@SerialName("rub_price")
	val rubPrice: Long,
	@SerialName("price_currency")
	val priceCurrency: String,
	val canValidateAccount: Boolean,
	val canResellItemAfterPurchase: Boolean,
	val isSmallExf: Boolean,
	@SerialName("account_last_activity")
	val accountLastActivity: Long,
	@SerialName("wf_servers")
	val wfServers: List<CategoryWarfaceResponseItemsWfServers>,
	val domain: String,
	val canViewAccountLink: Boolean,
	val canChangePassword: Boolean,
	val itemOriginPhrase: String,
	@SerialName("sold_items_category_count")
	val soldItemsCategoryCount: Long,
	@SerialName("restore_items_category_count")
	val restoreItemsCategoryCount: Long,
	val tags: List<JsonElement>,
	@SerialName("note_text")
	val noteText: JsonElement,
	val hasPendingAutoBuy: Boolean,
	val descriptionHtml: String,
	val descriptionEnHtml: String,
	val descriptionPlain: String,
	val descriptionEnPlain: String,
	val seller: CategoryWarfaceResponseItemsSeller,
)

@Serializable
data class CategoryMinecraftParams(
	val page: Long? = null,
	val pmin: Long? = null,
	val pmax: Long? = null,
	val title: String? = null,
	@SerialName("order_by")
	val orderBy: String? = null,
	@SerialName("tag_id[]")
	val tagId: List<Long>? = null,
	@SerialName("not_tag_id[]")
	val notTagId: List<Long>? = null,
	@SerialName("public_tag_id[]")
	val publicTagId: List<Long>? = null,
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Long>? = null,
	@SerialName("origin[]")
	val origin: JsonElement? = null,
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
	@SerialName("user_id")
	val userId: Long? = null,
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
	val subscriptionLength: Long? = null,
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
	val capesMin: Long? = null,
	@SerialName("capes_max")
	val capesMax: Long? = null,
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
	val levelHypixelMin: Long? = null,
	@SerialName("level_hypixel_max")
	val levelHypixelMax: Long? = null,
	@SerialName("achievement_hypixel_min")
	val achievementHypixelMin: Long? = null,
	@SerialName("achievement_hypixel_max")
	val achievementHypixelMax: Long? = null,
	@SerialName("level_hypixel_skyblock_min")
	val levelHypixelSkyblockMin: Long? = null,
	@SerialName("level_hypixel_skyblock_max")
	val levelHypixelSkyblockMax: Long? = null,
	@SerialName("net_worth_hypixel_skyblock_min")
	val netWorthHypixelSkyblockMin: Long? = null,
	@SerialName("net_worth_hypixel_skyblock_max")
	val netWorthHypixelSkyblockMax: Long? = null,
	val reg: Long? = null,
	@SerialName("reg_period")
	val regPeriod: String? = null,
	@SerialName("last_login_hypixel")
	val lastLoginHypixel: Long? = null,
	@SerialName("last_login_hypixel_period")
	val lastLoginHypixelPeriod: String? = null,
	@SerialName("can_change_details")
	val canChangeDetails: String? = null,
	@SerialName("nickname_length_min")
	val nicknameLengthMin: Long? = null,
	@SerialName("nickname_length_max")
	val nicknameLengthMax: Long? = null,
	@SerialName("hypixel_ban_parsed")
	val hypixelBanParsed: String? = null,
	@SerialName("minecoins_min")
	val minecoinsMin: Long? = null,
	@SerialName("minecoins_max")
	val minecoinsMax: Long? = null,
)

@Serializable
data class CategoryMinecraftResponse(
	val items: List<CategoryMinecraftResponseItems>? = null,
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
data class CategoryMinecraftResponseItemsBumpSettings(
	val canBumpItem: Boolean,
	val canBumpItemGlobally: Boolean,
	val shortErrorPhrase: JsonElement,
	val errorPhrase: JsonElement,
)

@Serializable
data class CategoryMinecraftResponseItemsAccountLinks(
	val link: String,
	val text: String,
	val iconClass: String,
)

@Serializable
data class CategoryMinecraftResponseItemsSeller(
	@SerialName("user_id")
	val userId: Long,
	@SerialName("sold_items_count")
	val soldItemsCount: Long,
	@SerialName("active_items_count")
	val activeItemsCount: Long,
	@SerialName("restore_data")
	val restoreData: String,
	val username: String,
	@SerialName("avatar_date")
	val avatarDate: Long,
	@SerialName("is_banned")
	val isBanned: Long,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Long,
	@SerialName("restore_percents")
	val restorePercents: JsonElement,
)

@Serializable
data class CategoryMinecraftResponseItems(
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
	@SerialName("view_count")
	val viewCount: Long,
	@SerialName("is_sticky")
	val isSticky: Long,
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
	@SerialName("email_type")
	val emailType: String,
	@SerialName("email_provider")
	val emailProvider: String,
	@SerialName("item_domain")
	val itemDomain: String,
	@SerialName("resale_item_origin")
	val resaleItemOrigin: String,
	@SerialName("minecraft_item_id")
	val minecraftItemId: Long,
	@SerialName("minecraft_id")
	val minecraftId: String,
	@SerialName("minecraft_nickname")
	val minecraftNickname: String,
	@SerialName("minecraft_country")
	val minecraftCountry: String,
	@SerialName("minecraft_skin")
	val minecraftSkin: String,
	@SerialName("minecraft_java")
	val minecraftJava: Long,
	@SerialName("minecraft_bedrock")
	val minecraftBedrock: Long,
	@SerialName("minecraft_can_change_nickname")
	val minecraftCanChangeNickname: Long,
	@SerialName("minecraft_created_at")
	val minecraftCreatedAt: Long,
	@SerialName("minecraft_hypixel_rank")
	val minecraftHypixelRank: String,
	@SerialName("minecraft_hypixel_level")
	val minecraftHypixelLevel: Long,
	@SerialName("minecraft_hypixel_achievement")
	val minecraftHypixelAchievement: Long,
	@SerialName("minecraft_hypixel_last_login")
	val minecraftHypixelLastLogin: Long,
	@SerialName("minecraft_hypixel_ban")
	val minecraftHypixelBan: Long,
	@SerialName("minecraft_hypixel_ban_reason")
	val minecraftHypixelBanReason: String,
	@SerialName("minecraft_hypixel_skyblock_level")
	val minecraftHypixelSkyblockLevel: Long,
	@SerialName("minecraft_hypixel_skyblock_net_worth")
	val minecraftHypixelSkyblockNetWorth: Long,
	@SerialName("minecraft_dungeons")
	val minecraftDungeons: Long,
	@SerialName("minecraft_legends")
	val minecraftLegends: Long,
	@SerialName("minecraft_capes_count")
	val minecraftCapesCount: Long,
	@SerialName("minecraft_capes")
	val minecraftCapes: List<JsonElement>,
	@SerialName("minecraft_subscription_name")
	val minecraftSubscriptionName: String,
	@SerialName("minecraft_subscription_ends")
	val minecraftSubscriptionEnds: Long,
	@SerialName("minecraft_subscription_auto_renew")
	val minecraftSubscriptionAutoRenew: Long,
	@SerialName("minecraft_email_reset_date")
	val minecraftEmailResetDate: Long,
	@SerialName("feedback_data")
	val feedbackData: String,
	val isIgnored: Boolean,
	val priceWithSellerFee: Long,
	val guarantee: JsonElement,
	val canViewLoginData: Boolean,
	val canUpdateItemStats: Boolean,
	val canReportItem: Boolean,
	val canViewEmailLoginData: Boolean,
	val showGetEmailCodeButton: Boolean,
	val canOpenItem: Boolean,
	val canCloseItem: Boolean,
	val canEditItem: Boolean,
	val canDeleteItem: Boolean,
	val canStickItem: Boolean,
	val canUnstickItem: Boolean,
	val bumpSettings: CategoryMinecraftResponseItemsBumpSettings,
	val canBumpItem: Boolean,
	val canBuyItem: Boolean,
	@SerialName("rub_price")
	val rubPrice: Long,
	@SerialName("price_currency")
	val priceCurrency: String,
	val canValidateAccount: Boolean,
	val canResellItemAfterPurchase: Boolean,
	val minecraftHasPaidLicense: Boolean,
	val canViewAccountLink: Boolean,
	val accountLinks: List<CategoryMinecraftResponseItemsAccountLinks>,
	val accountLink: String,
	val emailLoginUrl: String,
	val canChangePassword: Boolean,
	val itemOriginPhrase: String,
	val tags: List<JsonElement>,
	@SerialName("note_text")
	val noteText: JsonElement,
	val hasPendingAutoBuy: Boolean,
	val descriptionHtml: String,
	val descriptionEnHtml: String,
	val descriptionPlain: String,
	val descriptionEnPlain: String,
	val seller: CategoryMinecraftResponseItemsSeller,
)

@Serializable
data class CategoryHytaleParams(
	val page: Long? = null,
	val pmin: Long? = null,
	val pmax: Long? = null,
	val title: String? = null,
	@SerialName("order_by")
	val orderBy: String? = null,
	@SerialName("tag_id[]")
	val tagId: List<Long>? = null,
	@SerialName("not_tag_id[]")
	val notTagId: List<Long>? = null,
	@SerialName("public_tag_id[]")
	val publicTagId: List<Long>? = null,
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Long>? = null,
	@SerialName("origin[]")
	val origin: JsonElement? = null,
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
	@SerialName("user_id")
	val userId: Long? = null,
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
	val profilesMin: Long? = null,
	@SerialName("profiles_max")
	val profilesMax: Long? = null,
)

@Serializable
data class CategoryHytaleResponse(
	val items: List<CategoryHytaleResponseItems>? = null,
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
data class CategoryHytaleResponseItemsCategory(
	@SerialName("category_id")
	val categoryId: Long,
	@SerialName("category_title")
	val categoryTitle: String,
	@SerialName("category_name")
	val categoryName: String,
	@SerialName("category_url")
	val categoryUrl: String,
)

@Serializable
data class CategoryHytaleResponseItemsCopyFormatData(
	@SerialName("title_link")
	val titleLink: String,
)

@Serializable
data class CategoryHytaleResponseItemsSeller(
	@SerialName("user_id")
	val userId: Long,
	@SerialName("sold_items_count")
	val soldItemsCount: Long,
	@SerialName("active_items_count")
	val activeItemsCount: Long,
	@SerialName("restore_data")
	val restoreData: String,
	val username: String,
	@SerialName("avatar_date")
	val avatarDate: Long,
	@SerialName("is_banned")
	val isBanned: Long,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Long,
	@SerialName("restore_percents")
	val restorePercents: JsonElement,
)

@Serializable
data class CategoryHytaleResponseItems(
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
	@SerialName("view_count")
	val viewCount: Long,
	@SerialName("is_sticky")
	val isSticky: Long,
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
	@SerialName("email_type")
	val emailType: String,
	@SerialName("email_provider")
	val emailProvider: String,
	@SerialName("item_domain")
	val itemDomain: String,
	@SerialName("resale_item_origin")
	val resaleItemOrigin: String,
	@SerialName("auto_bump_period")
	val autoBumpPeriod: Long,
	@SerialName("rub_price")
	val rubPrice: Long,
	val discount: Boolean,
	@SerialName("hytale_item_id")
	val hytaleItemId: Long,
	@SerialName("hytale_profiles")
	val hytaleProfiles: Long,
	@SerialName("hytale_edition")
	val hytaleEdition: String,
	@SerialName("feedback_data")
	val feedbackData: String,
	@SerialName("max_discount_percent")
	val maxDiscountPercent: Long,
	val isIgnored: Boolean,
	val priceWithSellerFee: Double,
	val category: CategoryHytaleResponseItemsCategory,
	val guarantee: JsonElement,
	val canViewLoginData: Boolean,
	val canViewTempEmail: Boolean,
	val canUpdateItemStats: Boolean,
	val canReportItem: Boolean,
	val canViewItemViews: Boolean,
	val canManagePublicTag: Boolean,
	val canViewEmailLoginData: Boolean,
	val copyFormatData: CategoryHytaleResponseItemsCopyFormatData,
	val showGetEmailCodeButton: Boolean,
	val canOpenItem: Boolean,
	val canCloseItem: Boolean,
	val canEditItem: Boolean,
	val canDeleteItem: Boolean,
	val canStickItem: Boolean,
	val canUnstickItem: Boolean,
	val canBumpItem: Boolean,
	val canNotBumpItemReason: String,
	val buyer: JsonElement,
	val isPersonalAccount: Boolean,
	val canBuyItem: Boolean,
	@SerialName("price_currency")
	val priceCurrency: String,
	val priceWithSellerFeeLabel: String,
	val canValidateAccount: Boolean,
	val canResellItem: Boolean,
	val canViewAccountLink: Boolean,
	val imagePreviewLinks: List<JsonElement>,
	val emailLoginUrl: String,
	val canChangePassword: Boolean,
	val canChangeEmailPassword: Boolean,
	val uniqueKeyExists: Boolean,
	val itemOriginPhrase: String,
	val tags: List<JsonElement>,
	@SerialName("public_tag")
	val publicTag: JsonElement,
	@SerialName("note_text")
	val noteText: JsonElement,
	val hasPendingAutoBuy: Boolean,
	val descriptionHtml: String,
	val descriptionEnHtml: String,
	val descriptionPlain: String,
	val descriptionEnPlain: String,
	val seller: CategoryHytaleResponseItemsSeller,
)

@Serializable
data class CategoryListParams(
	@SerialName("top_queries")
	val topQueries: Boolean? = null,
)

@Serializable
data class CategoryListResponse(
	val category: CategoryListResponseCategory? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class CategoryListResponseCategoryLinks(
	val permalink: String,
	val detail: String,
	@SerialName("sub-categories")
	val subCategories: String,
	@SerialName("sub-forums")
	val subForums: String,
)

@Serializable
data class CategoryListResponseCategory(
	@SerialName("category_id")
	val categoryId: Long,
	@SerialName("category_title")
	val categoryTitle: String,
	@SerialName("category_description")
	val categoryDescription: String,
	val links: CategoryListResponseCategoryLinks,
)

@Serializable
data class CategoryParamsResponse(
	val category: CategoryParamsResponseCategory? = null,
	val params: List<CategoryParamsResponseParams>? = null,
	@SerialName("base_params")
	val baseParams: CategoryParamsResponseBaseParams? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class CategoryParamsResponseCategory(
	@SerialName("category_id")
	val categoryId: Long,
	@SerialName("sub_category_id")
	val subCategoryId: Long,
	@SerialName("category_order")
	val categoryOrder: Long,
	@SerialName("category_title")
	val categoryTitle: String,
	@SerialName("category_name")
	val categoryName: String,
	@SerialName("category_url")
	val categoryUrl: String,
	@SerialName("category_description_html")
	val categoryDescriptionHtml: String,
	@SerialName("category_login_url")
	val categoryLoginUrl: String,
	@SerialName("add_item_available")
	val addItemAvailable: Long,
	@SerialName("mass_upload_item_available")
	val massUploadItemAvailable: Long,
	@SerialName("has_guarantee")
	val hasGuarantee: Long,
	@SerialName("has_account_link")
	val hasAccountLink: Long,
	@SerialName("require_temp_email")
	val requireTempEmail: Long,
	@SerialName("recovery_link")
	val recoveryLink: String,
	@SerialName("check_button_enabled")
	val checkButtonEnabled: Long,
	@SerialName("checker_enabled")
	val checkerEnabled: Long,
	@SerialName("support_personal_proxy")
	val supportPersonalProxy: Long,
	@SerialName("support_email_login_data")
	val supportEmailLoginData: Long,
	@SerialName("require_email_login_data")
	val requireEmailLoginData: Long,
	@SerialName("display_in_list")
	val displayInList: Long,
	@SerialName("category_description_html_en")
	val categoryDescriptionHtmlEn: String,
	@SerialName("category_h1_html_en")
	val categoryH1HtmlEn: String,
	@SerialName("account_price_min")
	val accountPriceMin: Long,
	@SerialName("require_video_recording")
	val requireVideoRecording: Long,
	@SerialName("top_queries")
	val topQueries: String,
	@SerialName("require_eld_for_native_accs")
	val requireEldForNativeAccs: Long,
	@SerialName("can_be_resold")
	val canBeResold: Long,
	@SerialName("support_temp_email")
	val supportTempEmail: Long,
	val cookies: String,
	@SerialName("login_type")
	val loginType: String,
	@SerialName("guest_hidden")
	val guestHidden: Long,
	@SerialName("available_temp_email")
	val availableTempEmail: Long,
	@SerialName("resale_duration_limit_days")
	val resaleDurationLimitDays: Long,
	@SerialName("buy_without_validation")
	val buyWithoutValidation: Long,
	@SerialName("max_invalid_upload_tries")
	val maxInvalidUploadTries: Long,
)

@Serializable
data class CategoryParamsResponseParams(
	val name: String,
	val input: String,
	val description: String,
	val values: List<String>,
)

@Serializable
data class CategoryParamsResponseBaseParams0(
	val name: String,
	val input: String,
	val description: String,
)

@Serializable
data class CategoryParamsResponseBaseParams(
	@SerialName("0")
	val `0`: CategoryParamsResponseBaseParams0,
)

@Serializable
data class CategoryGamesResponse(
	val games: List<CategoryGamesResponseGames>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class CategoryGamesResponseGames(
	@SerialName("app_id")
	val appId: String,
	val title: String,
	val abbr: String,
	@SerialName("category_id")
	val categoryId: Long,
	val img: String,
	val url: String,
	val ru: String,
)

// ─── ListApi Types ────────────────────────────────────────

@Serializable
data class ListUserParams(
	@SerialName("user_id")
	val userId: Long? = null,
	@SerialName("category_id")
	val categoryId: Long? = null,
	val page: Long? = null,
	val show: String? = null,
	@SerialName("delete_reason")
	val deleteReason: String? = null,
	val title: String? = null,
	val pmin: Long? = null,
	val pmax: Long? = null,
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
	val userId: Long? = null,
	@SerialName("category_id")
	val categoryId: Long? = null,
	val page: Long? = null,
	val show: String? = null,
	val title: String? = null,
	val pmin: Long? = null,
	val pmax: Long? = null,
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
	val userItemStates: ListStatesResponseUserItemStates? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ListStatesResponseUserItemStatesStickied(
	@SerialName("item_state")
	val itemState: String,
	@SerialName("item_count")
	val itemCount: Long,
	val title: String,
	val stickyLimit: Long,
)

@Serializable
data class ListStatesResponseUserItemStatesDiscountRequest(
	@SerialName("item_state")
	val itemState: String,
	@SerialName("item_count")
	val itemCount: Long,
	val title: String,
)

@Serializable
data class ListStatesResponseUserItemStatesInBuyersFavorites(
	@SerialName("item_state")
	val itemState: String,
	@SerialName("item_count")
	val itemCount: Long,
	val title: String,
)

@Serializable
data class ListStatesResponseUserItemStatesActive(
	@SerialName("item_count")
	val itemCount: Long,
	@SerialName("item_state")
	val itemState: String,
	val title: String,
)

@Serializable
data class ListStatesResponseUserItemStatesPaid(
	@SerialName("item_count")
	val itemCount: Long,
	@SerialName("item_state")
	val itemState: String,
	val title: String,
)

@Serializable
data class ListStatesResponseUserItemStatesClosed(
	@SerialName("item_state")
	val itemState: String,
	@SerialName("item_count")
	val itemCount: Long,
	val title: String,
)

@Serializable
data class ListStatesResponseUserItemStatesDeleted(
	@SerialName("item_count")
	val itemCount: Long,
	@SerialName("item_state")
	val itemState: String,
	val title: String,
)

@Serializable
data class ListStatesResponseUserItemStatesAwaiting(
	@SerialName("item_count")
	val itemCount: Long,
	@SerialName("item_state")
	val itemState: String,
	val title: String,
)

@Serializable
data class ListStatesResponseUserItemStatesPreActive(
	@SerialName("item_state")
	val itemState: String,
	@SerialName("item_count")
	val itemCount: Long,
	val title: String,
)

@Serializable
data class ListStatesResponseUserItemStatesPreUpload(
	@SerialName("item_state")
	val itemState: String,
	@SerialName("item_count")
	val itemCount: Long,
	val title: String,
)

@Serializable
data class ListStatesResponseUserItemStatesPendingDeletion(
	@SerialName("item_state")
	val itemState: String,
	@SerialName("item_count")
	val itemCount: Long,
	val title: String,
)

@Serializable
data class ListStatesResponseUserItemStatesClosedInactive(
	@SerialName("item_count")
	val itemCount: Long,
	@SerialName("item_state")
	val itemState: String,
	val title: String,
)

@Serializable
data class ListStatesResponseUserItemStatesAutoBump(
	@SerialName("item_state")
	val itemState: String,
	@SerialName("item_count")
	val itemCount: Long,
	val title: String,
)

@Serializable
data class ListStatesResponseUserItemStates(
	val stickied: ListStatesResponseUserItemStatesStickied,
	@SerialName("discount_request")
	val discountRequest: ListStatesResponseUserItemStatesDiscountRequest,
	@SerialName("in_buyers_favorites")
	val inBuyersFavorites: ListStatesResponseUserItemStatesInBuyersFavorites,
	val active: ListStatesResponseUserItemStatesActive,
	val paid: ListStatesResponseUserItemStatesPaid,
	val closed: ListStatesResponseUserItemStatesClosed,
	val deleted: ListStatesResponseUserItemStatesDeleted,
	val awaiting: ListStatesResponseUserItemStatesAwaiting,
	@SerialName("pre_active")
	val preActive: ListStatesResponseUserItemStatesPreActive,
	@SerialName("pre_upload")
	val preUpload: ListStatesResponseUserItemStatesPreUpload,
	@SerialName("pending_deletion")
	val pendingDeletion: ListStatesResponseUserItemStatesPendingDeletion,
	@SerialName("closed_inactive")
	val closedInactive: ListStatesResponseUserItemStatesClosedInactive,
	@SerialName("auto_bump")
	val autoBump: ListStatesResponseUserItemStatesAutoBump,
)

@Serializable
data class ListDownloadParams(
	val format: String? = null,
	@SerialName("custom_format")
	val customFormat: String? = null,
	@SerialName("category_id")
	val categoryId: Long? = null,
	val page: Long? = null,
	val show: String? = null,
	@SerialName("delete_reason")
	val deleteReason: String? = null,
	val title: String? = null,
	val pmin: Long? = null,
	val pmax: Long? = null,
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
	val page: Long? = null,
	val show: String? = null,
	val title: String? = null,
	val pmin: Long? = null,
	val pmax: Long? = null,
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
	val page: Long? = null,
	val show: String? = null,
	val title: String? = null,
	val pmin: Long? = null,
	val pmax: Long? = null,
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
	val sameItemsIds: List<Long>? = null,
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
	val itemId: Long,
	@SerialName("post_body")
	val postBody: String,
)

@Serializable
data class ManagingCreateClaimResponse(
	val thread: ManagingCreateClaimResponseThread? = null,
	@SerialName("system_info")
	val systemInfo: ManagingCreateClaimResponseSystemInfo? = null,
)

@Serializable
data class ManagingCreateClaimResponseThreadFirstPostLikeUsers(
	@SerialName("user_id")
	val userId: Long,
	val username: String,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Long? = null,
	@SerialName("is_banned")
	val isBanned: Long? = null,
	@SerialName("uniq_username_css")
	val uniqUsernameCss: String? = null,
)

@Serializable
data class ManagingCreateClaimResponseThreadFirstPostLinks(
	val permalink: String,
	val detail: String,
	val thread: String,
	val poster: String,
	val likes: String,
	val report: String,
	val attachments: String,
	@SerialName("poster_avatar")
	val posterAvatar: String,
)

@Serializable
data class ManagingCreateClaimResponseThreadFirstPostPermissions(
	val view: Boolean,
	val edit: Boolean,
	val delete: Boolean,
	val reply: Boolean,
	val like: Boolean,
	val report: Boolean,
	@SerialName("upload_attachment")
	val uploadAttachment: Boolean,
)

@Serializable
data class ManagingCreateClaimResponseThreadFirstPost(
	@SerialName("post_id")
	val postId: Long,
	@SerialName("thread_id")
	val threadId: Long,
	@SerialName("poster_user_id")
	val posterUserId: Long,
	@SerialName("poster_username")
	val posterUsername: String,
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
	@SerialName("post_attachment_count")
	val postAttachmentCount: Long,
	@SerialName("like_users")
	val likeUsers: List<ManagingCreateClaimResponseThreadFirstPostLikeUsers>,
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
	val links: ManagingCreateClaimResponseThreadFirstPostLinks,
	val permissions: ManagingCreateClaimResponseThreadFirstPostPermissions,
)

@Serializable
data class ManagingCreateClaimResponseThreadLinks(
	val permalink: String,
	val detail: String,
	val followers: String,
	val forum: String,
	val posts: String,
	@SerialName("first_poster")
	val firstPoster: String,
	@SerialName("first_poster_avatar")
	val firstPosterAvatar: String,
	@SerialName("first_post")
	val firstPost: String,
	@SerialName("last_poster")
	val lastPoster: String,
	@SerialName("last_post")
	val lastPost: String,
)

@Serializable
data class ManagingCreateClaimResponseThreadPermissions(
	val view: Boolean,
	val delete: Boolean,
	val follow: Boolean,
	val post: Boolean,
	@SerialName("upload_attachment")
	val uploadAttachment: Boolean,
	val edit: Boolean,
)

@Serializable
data class ManagingCreateClaimResponseThreadForumForumPrefixesGroupPrefixes(
	@SerialName("prefix_id")
	val prefixId: Long,
	@SerialName("prefix_title")
	val prefixTitle: String,
)

@Serializable
data class ManagingCreateClaimResponseThreadForumForumPrefixes(
	@SerialName("group_title")
	val groupTitle: String,
	@SerialName("group_prefixes")
	val groupPrefixes: List<ManagingCreateClaimResponseThreadForumForumPrefixesGroupPrefixes>,
)

@Serializable
data class ManagingCreateClaimResponseThreadForumLinks(
	val permalink: String,
	val detail: String,
	@SerialName("sub-categories")
	val subCategories: String,
	@SerialName("sub-forums")
	val subForums: String,
	val threads: String,
	val followers: String,
)

@Serializable
data class ManagingCreateClaimResponseThreadForumPermissions(
	val view: Boolean,
	val edit: Boolean,
	val delete: Boolean,
	@SerialName("create_thread")
	val createThread: Boolean,
	@SerialName("upload_attachment")
	val uploadAttachment: Boolean,
	@SerialName("tag_thread")
	val tagThread: Boolean,
	val follow: Boolean,
)

@Serializable
data class ManagingCreateClaimResponseThreadForum(
	@SerialName("forum_id")
	val forumId: Long,
	@SerialName("forum_title")
	val forumTitle: String,
	@SerialName("forum_description")
	val forumDescription: String,
	@SerialName("forum_thread_count")
	val forumThreadCount: Long,
	@SerialName("forum_post_count")
	val forumPostCount: Long,
	@SerialName("forum_prefixes")
	val forumPrefixes: List<ManagingCreateClaimResponseThreadForumForumPrefixes>,
	@SerialName("thread_default_prefix_id")
	val threadDefaultPrefixId: Long,
	@SerialName("thread_prefix_is_required")
	val threadPrefixIsRequired: Boolean,
	val links: ManagingCreateClaimResponseThreadForumLinks,
	val permissions: ManagingCreateClaimResponseThreadForumPermissions,
	@SerialName("forum_is_followed")
	val forumIsFollowed: Boolean,
)

@Serializable
data class ManagingCreateClaimResponseThread(
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
	@SerialName("thread_is_followed")
	val threadIsFollowed: Boolean,
	@SerialName("first_post")
	val firstPost: ManagingCreateClaimResponseThreadFirstPost,
	@SerialName("thread_prefixes")
	val threadPrefixes: List<JsonElement>,
	@SerialName("thread_tags")
	val threadTags: List<JsonElement>,
	val links: ManagingCreateClaimResponseThreadLinks,
	val permissions: ManagingCreateClaimResponseThreadPermissions,
	val forum: ManagingCreateClaimResponseThreadForum,
)

@Serializable
data class ManagingCreateClaimResponseSystemInfo(
	@SerialName("visitor_id")
	val visitorId: Long,
	val time: Long,
)

@Serializable
data class ManagingBulkGetBody(
	@SerialName("item_id")
	val itemId: List<Long>? = null,
	@SerialName("parse_same_item_ids")
	val parseSameItemIds: Boolean? = null,
)

@Serializable
data class ManagingBulkGetResponse(
	val items: List<ManagingBulkGetResponseItems>? = null,
	@SerialName("left_item_id")
	val leftItemId: List<Long>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ManagingBulkGetResponseItems(
	@SerialName("0")
	val `0`: ItemModel? = null,
)

@Serializable
data class ManagingSteamInventoryValueParams(
	@SerialName("app_id")
	val appId: Long? = null,
	val currency: String? = null,
	@SerialName("ignore_cache")
	val ignoreCache: Boolean? = null,
)

@Serializable
data class ManagingSteamInventoryValueResponse(
	val query: String? = null,
	val data: ManagingSteamInventoryValueResponseData? = null,
	val appId: Long? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ManagingSteamInventoryValueResponseDataItems0Stickers(
	val stickerCount: Long,
	val count: Long,
	val images: List<String>,
	val title: String,
)

@Serializable
data class ManagingSteamInventoryValueResponseDataItems0(
	val classid: String,
	val tradable: Long,
	val marketable: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val title: String,
	val price: Double,
	val count: Long,
	val type: String,
	@SerialName("market_hash_name")
	val marketHashName: String,
	val fraudwarnings: JsonElement,
	val stickers: ManagingSteamInventoryValueResponseDataItems0Stickers,
)

@Serializable
data class ManagingSteamInventoryValueResponseDataItems(
	@SerialName("0")
	val `0`: ManagingSteamInventoryValueResponseDataItems0? = null,
)

@Serializable
data class ManagingSteamInventoryValueResponseData(
	val items: ManagingSteamInventoryValueResponseDataItems,
	@SerialName("steam_id")
	val steamId: String,
	val appId: Long,
	val appTitle: String,
	val totalValue: Double,
	val itemCount: Long,
	val marketableItemCount: Long,
	val currency: String,
	val currencyIcon: String,
	val language: String,
	val time: Long,
)

@Serializable
data class ManagingSteamValueParams(
	val link: String,
	@SerialName("app_id")
	val appId: Long? = null,
	val currency: String? = null,
	@SerialName("ignore_cache")
	val ignoreCache: Boolean? = null,
)

@Serializable
data class ManagingSteamValueResponse(
	val query: String? = null,
	val data: ManagingSteamValueResponseData? = null,
	val appId: Long? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ManagingSteamValueResponseDataItems0Stickers(
	val stickerCount: Long,
	val count: Long,
	val images: List<String>,
	val title: String,
)

@Serializable
data class ManagingSteamValueResponseDataItems0(
	val classid: String,
	val tradable: Long,
	val marketable: Long,
	@SerialName("image_url")
	val imageUrl: String,
	val title: String,
	val price: Double,
	val count: Long,
	val type: String,
	@SerialName("market_hash_name")
	val marketHashName: String,
	val fraudwarnings: JsonElement,
	val stickers: ManagingSteamValueResponseDataItems0Stickers,
)

@Serializable
data class ManagingSteamValueResponseDataItems(
	@SerialName("0")
	val `0`: ManagingSteamValueResponseDataItems0? = null,
)

@Serializable
data class ManagingSteamValueResponseData(
	val items: ManagingSteamValueResponseDataItems,
	@SerialName("steam_id")
	val steamId: String,
	val appId: Long,
	val appTitle: String,
	val totalValue: Double,
	val itemCount: Long,
	val marketableItemCount: Long,
	val currency: String,
	val currencyIcon: String,
	val language: String,
	val time: Long,
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
	val price: Long? = null,
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
	val proxyId: Long? = null,
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
	val appId: Long? = null,
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
	val hour: Long,
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
	val codeData: ManagingEmailCodeResponseCodeData? = null,
)

@Serializable
data class ManagingEmailCodeResponseCodeData(
	val code: String,
	val date: Long,
	val textPlain: String,
)

@Serializable
data class ManagingGetLetters2Params(
	@SerialName("email_password")
	val emailPassword: String? = null,
	val email: String? = null,
	val password: String? = null,
	val limit: Long? = null,
)

@Serializable
data class ManagingGetLetters2Response(
	val email: String? = null,
	val letters: List<ManagingGetLetters2ResponseLetters>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ManagingGetLetters2ResponseLetters(
	val textHtml: String,
	val textPlain: String,
	val from: String,
	val date: Long,
)

@Serializable
data class ManagingSteamGetMafileResponse(
	val maFile: ManagingSteamGetMafileResponseMaFile? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ManagingSteamGetMafileResponseMaFileSession(
	val SessionID: String,
	val AccessToken: String,
	val RefreshToken: String,
	val SteamID: String,
	val SteamLoginSecure: String,
)

@Serializable
data class ManagingSteamGetMafileResponseMaFile(
	@SerialName("shared_secret")
	val sharedSecret: String,
	@SerialName("serial_number")
	val serialNumber: Long,
	@SerialName("revocation_code")
	val revocationCode: String,
	val uri: String,
	@SerialName("account_name")
	val accountName: String,
	@SerialName("token_gid")
	val tokenGid: String,
	@SerialName("identity_secret")
	val identitySecret: String,
	val secret_1: String,
	@SerialName("device_id")
	val deviceId: String,
	@SerialName("fully_enrolled")
	val fullyEnrolled: Boolean,
	val Session: ManagingSteamGetMafileResponseMaFileSession,
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
	val codeData: ManagingSteamMafileCodeResponseCodeData? = null,
)

@Serializable
data class ManagingSteamMafileCodeResponseCodeData(
	val code: String,
	val date: Long,
	val textPlain: String,
)

@Serializable
data class ManagingSteamSDABody(
	val id: Long? = null,
	val nonce: Long? = null,
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
	val codes: ManagingTelegramCodeResponseCodes? = null,
)

@Serializable
data class ManagingTelegramCodeResponseCodes(
	val code: String? = null,
	val date: Long? = null,
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
	val Cancel: Long? = null,
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
	val item: ManagingTempEmailPasswordResponseItem? = null,
)

@Serializable
data class ManagingTempEmailPasswordResponseItem(
	val account: String,
)

@Serializable
data class ManagingTagBody(
	@SerialName("tag_id")
	val tagId: Long,
)

@Serializable
data class ManagingTagResponse(
	val itemId: Long? = null,
	val tag: ManagingTagResponseTag? = null,
	val addedTagId: Long? = null,
	val deleteTags: List<Long>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ManagingTagResponseTag(
	@SerialName("tag_id")
	val tagId: Long,
	val title: String,
	val isDefault: Boolean,
	val forOwnedAccountsOnly: Boolean,
	val bc: String,
)

@Serializable
data class ManagingUntagBody(
	@SerialName("tag_id")
	val tagId: Long,
)

@Serializable
data class ManagingUntagResponse(
	val itemId: Long? = null,
	val tag: ManagingUntagResponseTag? = null,
	val addedTagId: Long? = null,
	val deleteTags: List<Long>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ManagingUntagResponseTag(
	@SerialName("tag_id")
	val tagId: Long,
	val title: String,
	val isDefault: Boolean,
	val forOwnedAccountsOnly: Boolean,
	val bc: String,
)

@Serializable
data class ManagingPublicTagBody(
	@SerialName("tag_id")
	val tagId: Long,
)

@Serializable
data class ManagingPublicTagResponse(
	val itemId: Long? = null,
	val tag: ManagingPublicTagResponseTag? = null,
	val addedTagId: Long? = null,
	val deleteTags: List<Long>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ManagingPublicTagResponseTag(
	@SerialName("tag_id")
	val tagId: Long,
	val title: String,
	val isDefault: Boolean,
	val forOwnedAccountsOnly: Boolean,
	val bc: String,
)

@Serializable
data class ManagingPublicUntagBody(
	@SerialName("tag_id")
	val tagId: Long,
)

@Serializable
data class ManagingPublicUntagResponse(
	val itemId: Long? = null,
	val tag: ManagingPublicUntagResponseTag? = null,
	val addedTagId: Long? = null,
	val deleteTags: List<Long>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ManagingPublicUntagResponseTag(
	@SerialName("tag_id")
	val tagId: Long,
	val title: String,
	val isDefault: Boolean,
	val forOwnedAccountsOnly: Boolean,
	val bc: String,
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
	val claims: List<ProfileClaimsResponseClaims>? = null,
	val stats: ProfileClaimsResponseStats? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ProfileClaimsResponseClaimsAuthorLinks(
	val permalink: String,
	val detail: String,
	val avatar: String,
	@SerialName("avatar_big")
	val avatarBig: String,
	@SerialName("avatar_small")
	val avatarSmall: String,
	val followers: String,
	val followings: String,
	val ignore: String,
	val timeline: String,
)

@Serializable
data class ProfileClaimsResponseClaimsAuthorPermissions(
	val edit: Boolean,
	val follow: Boolean,
	val ignore: Boolean,
)

@Serializable
data class ProfileClaimsResponseClaimsAuthorFields(
	val id: String,
	val title: String,
	val description: String,
	val position: String,
	@SerialName("is_required")
	val isRequired: Boolean,
)

@Serializable
data class ProfileClaimsResponseClaimsAuthor(
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
	@SerialName("custom_title")
	val customTitle: String,
	@SerialName("is_banned")
	val isBanned: Long,
	@SerialName("user_title")
	val userTitle: String,
	@SerialName("user_is_valid")
	val userIsValid: Boolean,
	@SerialName("user_is_verified")
	val userIsVerified: Boolean,
	@SerialName("user_is_followed")
	val userIsFollowed: Boolean,
	@SerialName("user_last_seen_date")
	val userLastSeenDate: Long,
	val links: ProfileClaimsResponseClaimsAuthorLinks,
	val permissions: ProfileClaimsResponseClaimsAuthorPermissions,
	@SerialName("user_is_ignored")
	val userIsIgnored: Boolean,
	@SerialName("user_is_visitor")
	val userIsVisitor: Boolean,
	@SerialName("user_group_id")
	val userGroupId: Long,
	@SerialName("ban_reason")
	val banReason: String,
	val fields: List<ProfileClaimsResponseClaimsAuthorFields>,
)

@Serializable
data class ProfileClaimsResponseClaims(
	@SerialName("thread_id")
	val threadId: Long,
	@SerialName("claim_date")
	val claimDate: Long,
	@SerialName("claim_state")
	val claimState: String,
	@SerialName("message_body")
	val messageBody: String,
	@SerialName("amount_formatted")
	val amountFormatted: String,
	val author: ProfileClaimsResponseClaimsAuthor,
)

@Serializable
data class ProfileClaimsResponseStatsMarket(
	val total: Long,
	val solved: Long,
	val settled: Long,
	val rejected: Long,
)

@Serializable
data class ProfileClaimsResponseStatsNoMarket(
	val total: Long,
	val solved: Long,
	val settled: Long,
	val rejected: Long,
)

@Serializable
data class ProfileClaimsResponseStats(
	val market: ProfileClaimsResponseStatsMarket,
	val noMarket: ProfileClaimsResponseStatsNoMarket,
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
	val categoryId: Long? = null,
	val page: Long? = null,
	val pmin: Long? = null,
	val pmax: Long? = null,
	val title: String? = null,
	@SerialName("order_by")
	val orderBy: String? = null,
	@SerialName("tag_id[]")
	val tagId: List<Long>? = null,
	@SerialName("not_tag_id[]")
	val notTagId: List<Long>? = null,
	@SerialName("public_tag_id[]")
	val publicTagId: List<Long>? = null,
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Long>? = null,
	@SerialName("origin[]")
	val origin: JsonElement? = null,
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
	@SerialName("user_id")
	val userId: Long? = null,
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
	val itemId: Long,
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
	val itemId: Long? = null,
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
	val balanceId: Long? = null,
)

@Serializable
data class PurchasingFastBuyResponse(
	val status: String? = null,
	val item: PurchasingFastBuyResponseItem? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class PurchasingFastBuyResponseItemGuarantee(
	val duration: Long,
	val `class`: String,
	val durationPhrase: String,
	val endDate: Long,
	val active: Boolean,
	val cancelled: Boolean,
	val remainingTime: Long,
	val remainingTimePhrase: String,
)

@Serializable
data class PurchasingFastBuyResponseItemLoginData(
	val raw: String,
	val encodedRaw: String,
	val login: String,
	val password: String,
	val encodedPassword: String,
	val oldPassword: String,
	val encodedOldPassword: JsonElement,
)

@Serializable
data class PurchasingFastBuyResponseItemEmailLoginData(
	val raw: String,
	val encodedRaw: String,
	val login: String,
	val password: String,
	val encodedPassword: String,
	val oldPassword: String,
	val encodedOldPassword: String,
)

@Serializable
data class PurchasingFastBuyResponseItemBuyer(
	@SerialName("user_id")
	val userId: Long,
	@SerialName("operation_date")
	val operationDate: Long,
	val visitorIsBuyer: Boolean,
	val username: String,
	@SerialName("is_banned")
	val isBanned: Long,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Long,
	@SerialName("uniq_username_css")
	val uniqUsernameCss: String,
	@SerialName("user_group_id")
	val userGroupId: Long,
)

@Serializable
data class PurchasingFastBuyResponseItemAccountLinks(
	val link: String,
	val text: String,
	val iconClass: String,
)

@Serializable
data class PurchasingFastBuyResponseItemTags1(
	@SerialName("tag_id")
	val tagId: Long,
	val title: String,
	val isDefault: Boolean,
	val forOwnedAccountsOnly: Boolean,
	val bc: String,
)

@Serializable
data class PurchasingFastBuyResponseItemTags(
	@SerialName("1")
	val `1`: PurchasingFastBuyResponseItemTags1,
)

@Serializable
data class PurchasingFastBuyResponseItemExtraPrices(
	val currency: String,
	val price: String,
)

@Serializable
data class PurchasingFastBuyResponseItemBumpSettings(
	val canBumpItem: Boolean,
	val canBumpItemGlobally: Boolean,
	val shortErrorPhrase: JsonElement,
	val errorPhrase: JsonElement,
)

@Serializable
data class PurchasingFastBuyResponseItemSeller(
	@SerialName("user_id")
	val userId: Long,
	val username: String,
	@SerialName("avatar_date")
	val avatarDate: Long,
	@SerialName("is_banned")
	val isBanned: Long,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Long,
	@SerialName("joined_date")
	val joinedDate: Long,
	@SerialName("sold_items_count")
	val soldItemsCount: Long,
	@SerialName("active_items_count")
	val activeItemsCount: Long,
	@SerialName("restore_data")
	val restoreData: String,
	@SerialName("restore_percents")
	val restorePercents: Long,
	val isOnline: Boolean,
)

@Serializable
data class PurchasingFastBuyResponseItem(
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
	@SerialName("user_allow_ask_discount")
	val userAllowAskDiscount: Long,
	@SerialName("max_discount_percent")
	val maxDiscountPercent: Long,
	@SerialName("market_custom_title")
	val marketCustomTitle: String,
	@SerialName("feedback_data")
	val feedbackData: String,
	@SerialName("buyer_avatar_date")
	val buyerAvatarDate: Long,
	@SerialName("buyer_user_group_id")
	val buyerUserGroupId: Long,
	val priceWithSellerFee: Long,
	val guarantee: PurchasingFastBuyResponseItemGuarantee,
	val canViewLoginData: Boolean,
	val canUpdateItemStats: Boolean,
	val canReportItem: Boolean,
	val loginData: PurchasingFastBuyResponseItemLoginData,
	val canViewEmailLoginData: Boolean,
	val emailLoginData: PurchasingFastBuyResponseItemEmailLoginData,
	val showGetEmailCodeButton: Boolean,
	val getEmailCodeDisplayLogin: String,
	val buyer: PurchasingFastBuyResponseItemBuyer,
	val isPersonalAccount: Boolean,
	@SerialName("sold_items_category_count")
	val soldItemsCategoryCount: Long,
	@SerialName("restore_items_category_count")
	val restoreItemsCategoryCount: Long,
	@SerialName("rub_price")
	val rubPrice: Long,
	@SerialName("price_currency")
	val priceCurrency: String,
	val canValidateAccount: Boolean,
	val canResellItemAfterPurchase: Boolean,
	@SerialName("account_last_activity")
	val accountLastActivity: Long,
	val displayConvertedBalance: Boolean,
	val canViewAccountLink: Boolean,
	val accountLinks: List<PurchasingFastBuyResponseItemAccountLinks>,
	val accountLink: String,
	val emailLoginUrl: String,
	val canChangePassword: Boolean,
	val itemOriginPhrase: String,
	val visitorIsAuthor: Boolean,
	val canAskDiscount: Boolean,
	val tags: PurchasingFastBuyResponseItemTags,
	val customFields: List<JsonElement>,
	val externalAuth: List<JsonElement>,
	val isTrusted: Boolean,
	val isBirthdayToday: Boolean,
	val isIgnored: Boolean,
	val deposit: Long,
	val extraPrices: List<PurchasingFastBuyResponseItemExtraPrices>,
	val canViewAccountLoginAndTempEmail: Boolean,
	val bumpSettings: PurchasingFastBuyResponseItemBumpSettings,
	val canCheckGuarantee: Boolean,
	val needToRequireVideoToViewLoginData: Boolean,
	val descriptionHtml: String,
	val descriptionEnHtml: String,
	val descriptionPlain: String,
	val descriptionEnPlain: String,
	val seller: PurchasingFastBuyResponseItemSeller,
)

@Serializable
data class PurchasingCheckResponse(
	val status: String? = null,
	val item: PurchasingCheckResponseItem? = null,
	val requireVideoRecording: Boolean? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class PurchasingCheckResponseItemGuarantee(
	val duration: Long,
	val `class`: String,
	val durationPhrase: String,
	val endDate: JsonElement,
	val active: JsonElement,
	val cancelled: JsonElement,
	val remainingTime: JsonElement,
)

@Serializable
data class PurchasingCheckResponseItemAccountLinks(
	val link: String,
	val text: String,
	val iconClass: String,
)

@Serializable
data class PurchasingCheckResponseItemExtraPrices(
	val currency: String,
	val price: String,
)

@Serializable
data class PurchasingCheckResponseItemBumpSettings(
	val canBumpItem: Boolean,
	val canBumpItemGlobally: Boolean,
	val shortErrorPhrase: JsonElement,
	val errorPhrase: JsonElement,
)

@Serializable
data class PurchasingCheckResponseItemSeller(
	@SerialName("user_id")
	val userId: Long,
	val username: String,
	@SerialName("avatar_date")
	val avatarDate: Long,
	@SerialName("is_banned")
	val isBanned: Long,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Long,
	@SerialName("joined_date")
	val joinedDate: Long,
	@SerialName("sold_items_count")
	val soldItemsCount: Long,
	@SerialName("active_items_count")
	val activeItemsCount: Long,
	@SerialName("restore_data")
	val restoreData: String,
	@SerialName("restore_percents")
	val restorePercents: JsonElement,
	val isOnline: Boolean,
)

@Serializable
data class PurchasingCheckResponseItem(
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
	@SerialName("view_count")
	val viewCount: Long,
	@SerialName("is_sticky")
	val isSticky: Long,
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
	@SerialName("email_type")
	val emailType: String,
	@SerialName("email_provider")
	val emailProvider: String,
	@SerialName("item_domain")
	val itemDomain: String,
	@SerialName("resale_item_origin")
	val resaleItemOrigin: String,
	@SerialName("user_allow_ask_discount")
	val userAllowAskDiscount: Long,
	@SerialName("max_discount_percent")
	val maxDiscountPercent: Long,
	@SerialName("market_custom_title")
	val marketCustomTitle: String,
	@SerialName("feedback_data")
	val feedbackData: String,
	@SerialName("category_title")
	val categoryTitle: String,
	@SerialName("category_url")
	val categoryUrl: String,
	@SerialName("require_temp_email")
	val requireTempEmail: Long,
	@SerialName("available_temp_email")
	val availableTempEmail: Long,
	@SerialName("check_button_enabled")
	val checkButtonEnabled: Long,
	@SerialName("checker_enabled")
	val checkerEnabled: Long,
	@SerialName("buy_without_validation")
	val buyWithoutValidation: Long,
	@SerialName("has_guarantee")
	val hasGuarantee: Long,
	@SerialName("require_video_recording")
	val requireVideoRecording: Long,
	@SerialName("can_be_resold")
	val canBeResold: Long,
	@SerialName("login_type")
	val loginType: String,
	@SerialName("require_email_login_data")
	val requireEmailLoginData: Long,
	@SerialName("category_prefix_id")
	val categoryPrefixId: Long,
	@SerialName("ask_user_id")
	val askUserId: JsonElement,
	@SerialName("ask_item_id")
	val askItemId: JsonElement,
	@SerialName("ask_date")
	val askDate: JsonElement,
	@SerialName("discount_price")
	val discountPrice: JsonElement,
	@SerialName("discount_accepted")
	val discountAccepted: JsonElement,
	@SerialName("user_alerted")
	val userAlerted: JsonElement,
	val message: JsonElement,
	@SerialName("min_price")
	val minPrice: Long,
	val priceWithSellerFee: Long,
	val guarantee: PurchasingCheckResponseItemGuarantee,
	val canViewLoginData: Boolean,
	val canUpdateItemStats: Boolean,
	val canReportItem: Boolean,
	val canViewEmailLoginData: Boolean,
	val showGetEmailCodeButton: Boolean,
	val isPersonalAccount: Boolean,
	@SerialName("rub_price")
	val rubPrice: Long,
	@SerialName("price_currency")
	val priceCurrency: String,
	val canValidateAccount: Boolean,
	val canResellItemAfterPurchase: Boolean,
	val isSmallExf: Boolean,
	@SerialName("account_last_activity")
	val accountLastActivity: Long,
	val canViewAccountLink: Boolean,
	val accountLinks: List<PurchasingCheckResponseItemAccountLinks>,
	val accountLink: String,
	val emailLoginUrl: String,
	val canChangePassword: Boolean,
	val itemOriginPhrase: String,
	val visitorIsAuthor: Boolean,
	val canAskDiscount: Boolean,
	val tags: List<JsonElement>,
	val customFields: List<JsonElement>,
	val externalAuth: List<JsonElement>,
	val isTrusted: Boolean,
	val isBirthdayToday: Boolean,
	val isIgnored: Boolean,
	val deposit: Long,
	val extraPrices: List<PurchasingCheckResponseItemExtraPrices>,
	val canViewAccountLoginAndTempEmail: Boolean,
	val bumpSettings: PurchasingCheckResponseItemBumpSettings,
	val canCheckGuarantee: Boolean,
	val needToRequireVideoToViewLoginData: Boolean,
	val descriptionHtml: String,
	val descriptionEnHtml: String,
	val descriptionPlain: String,
	val descriptionEnPlain: String,
	val seller: PurchasingCheckResponseItemSeller,
)

@Serializable
data class PurchasingConfirmBody(
	val price: Long? = null,
	@SerialName("balance_id")
	val balanceId: Long? = null,
)

@Serializable
data class PurchasingConfirmResponse(
	val status: String? = null,
	val item: PurchasingConfirmResponseItem? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class PurchasingConfirmResponseItemLoginData(
	val raw: String,
	val encodedRaw: String,
	val login: String,
	val password: String,
	val encodedPassword: String,
	val oldPassword: String,
	val encodedOldPassword: String,
	val adviceToChangePassword: Boolean,
)

@Serializable
data class PurchasingConfirmResponseItem(
	val loginData: PurchasingConfirmResponseItemLoginData,
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
	val userId: Long,
	@SerialName("category_id")
	val categoryId: Long,
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
	val discountId: Long,
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
	val discountId: Long,
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
	val categoryId: Long,
	val currency: String,
	@SerialName("item_origin")
	val itemOrigin: String,
	@SerialName("extended_guarantee")
	val extendedGuarantee: Long? = null,
	@SerialName("allow_ask_discount")
	val allowAskDiscount: Boolean? = null,
	@SerialName("proxy_id")
	val proxyId: Long? = null,
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
	val categoryId: Long,
	val currency: String,
	@SerialName("item_origin")
	val itemOrigin: String,
	@SerialName("extended_guarantee")
	val extendedGuarantee: Long? = null,
	val description: String? = null,
	val information: String? = null,
	val forceTempEmail: Boolean? = null,
	@SerialName("resell_item_id")
	val resellItemId: Long? = null,
	@SerialName("has_email_login_data")
	val hasEmailLoginData: Boolean? = null,
	@SerialName("email_login_data")
	val emailLoginData: String? = null,
	@SerialName("email_type")
	val emailType: String? = null,
	@SerialName("allow_ask_discount")
	val allowAskDiscount: Boolean? = null,
	@SerialName("proxy_id")
	val proxyId: Long? = null,
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
	val resellItemId: Long? = null,
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
	val item: PublishingCheckResponseItem? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class PublishingCheckResponseItemGuarantee(
	val duration: Long,
	val `class`: String,
	val durationPhrase: String,
	val endDate: Long,
	val active: Boolean,
	val cancelled: Boolean,
	val remainingTime: Long,
	val remainingTimePhrase: String,
)

@Serializable
data class PublishingCheckResponseItemLoginData(
	val raw: String,
	val encodedRaw: String,
	val login: String,
	val password: String,
	val encodedPassword: String,
	val oldPassword: String,
	val encodedOldPassword: JsonElement,
)

@Serializable
data class PublishingCheckResponseItemEmailLoginData(
	val raw: String,
	val encodedRaw: String,
	val login: String,
	val password: String,
	val encodedPassword: String,
	val oldPassword: String,
	val encodedOldPassword: String,
)

@Serializable
data class PublishingCheckResponseItemBuyer(
	@SerialName("user_id")
	val userId: Long,
	@SerialName("operation_date")
	val operationDate: Long,
	val visitorIsBuyer: Boolean,
	val username: String,
	@SerialName("is_banned")
	val isBanned: Long,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Long,
	@SerialName("uniq_username_css")
	val uniqUsernameCss: String,
	@SerialName("user_group_id")
	val userGroupId: Long,
)

@Serializable
data class PublishingCheckResponseItemAccountLinks(
	val link: String,
	val text: String,
	val iconClass: String,
)

@Serializable
data class PublishingCheckResponseItemTags1(
	@SerialName("tag_id")
	val tagId: Long,
	val title: String,
	val isDefault: Boolean,
	val forOwnedAccountsOnly: Boolean,
	val bc: String,
)

@Serializable
data class PublishingCheckResponseItemTags(
	@SerialName("1")
	val `1`: PublishingCheckResponseItemTags1,
)

@Serializable
data class PublishingCheckResponseItemExtraPrices(
	val currency: String,
	val price: String,
)

@Serializable
data class PublishingCheckResponseItemBumpSettings(
	val canBumpItem: Boolean,
	val canBumpItemGlobally: Boolean,
	val shortErrorPhrase: JsonElement,
	val errorPhrase: JsonElement,
)

@Serializable
data class PublishingCheckResponseItemSeller(
	@SerialName("user_id")
	val userId: Long,
	val username: String,
	@SerialName("avatar_date")
	val avatarDate: Long,
	@SerialName("is_banned")
	val isBanned: Long,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Long,
	@SerialName("joined_date")
	val joinedDate: Long,
	@SerialName("sold_items_count")
	val soldItemsCount: Long,
	@SerialName("active_items_count")
	val activeItemsCount: Long,
	@SerialName("restore_data")
	val restoreData: String,
	@SerialName("restore_percents")
	val restorePercents: Long,
	val isOnline: Boolean,
)

@Serializable
data class PublishingCheckResponseItem(
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
	@SerialName("user_allow_ask_discount")
	val userAllowAskDiscount: Long,
	@SerialName("max_discount_percent")
	val maxDiscountPercent: Long,
	@SerialName("market_custom_title")
	val marketCustomTitle: String,
	@SerialName("feedback_data")
	val feedbackData: String,
	@SerialName("buyer_avatar_date")
	val buyerAvatarDate: Long,
	@SerialName("buyer_user_group_id")
	val buyerUserGroupId: Long,
	val priceWithSellerFee: Long,
	val guarantee: PublishingCheckResponseItemGuarantee,
	val canViewLoginData: Boolean,
	val canUpdateItemStats: Boolean,
	val canReportItem: Boolean,
	val loginData: PublishingCheckResponseItemLoginData,
	val canViewEmailLoginData: Boolean,
	val emailLoginData: PublishingCheckResponseItemEmailLoginData,
	val showGetEmailCodeButton: Boolean,
	val getEmailCodeDisplayLogin: String,
	val buyer: PublishingCheckResponseItemBuyer,
	val isPersonalAccount: Boolean,
	@SerialName("sold_items_category_count")
	val soldItemsCategoryCount: Long,
	@SerialName("restore_items_category_count")
	val restoreItemsCategoryCount: Long,
	@SerialName("rub_price")
	val rubPrice: Long,
	@SerialName("price_currency")
	val priceCurrency: String,
	val canValidateAccount: Boolean,
	val canResellItemAfterPurchase: Boolean,
	@SerialName("account_last_activity")
	val accountLastActivity: Long,
	val displayConvertedBalance: Boolean,
	val canViewAccountLink: Boolean,
	val accountLinks: List<PublishingCheckResponseItemAccountLinks>,
	val accountLink: String,
	val emailLoginUrl: String,
	val canChangePassword: Boolean,
	val itemOriginPhrase: String,
	val visitorIsAuthor: Boolean,
	val canAskDiscount: Boolean,
	val tags: PublishingCheckResponseItemTags,
	val customFields: List<JsonElement>,
	val externalAuth: List<JsonElement>,
	val isTrusted: Boolean,
	val isBirthdayToday: Boolean,
	val isIgnored: Boolean,
	val deposit: Long,
	val extraPrices: List<PublishingCheckResponseItemExtraPrices>,
	val canViewAccountLoginAndTempEmail: Boolean,
	val bumpSettings: PublishingCheckResponseItemBumpSettings,
	val canCheckGuarantee: Boolean,
	val needToRequireVideoToViewLoginData: Boolean,
	val descriptionHtml: String,
	val descriptionEnHtml: String,
	val descriptionPlain: String,
	val descriptionEnPlain: String,
	val seller: PublishingCheckResponseItemSeller,
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
	val invoiceId: Long? = null,
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
	val merchantId: Long,
	@SerialName("required_telegram_id")
	val requiredTelegramId: Long? = null,
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
	val page: Long? = null,
	val currency: String? = null,
	val status: String? = null,
	val amount: Double? = null,
	@SerialName("merchant_id")
	val merchantId: Long? = null,
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
	val currencyList: PaymentsCurrencyResponseCurrencyList? = null,
	val lastUpdate: Long? = null,
	val visitorCurrency: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListBTC(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListETH(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListBNB(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListBCH(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListXMR(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListSOL(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListLTC(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListDASH(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListTON(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListUSDT(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListMATIC(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListTRX(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListDOGE(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListKWD(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListGBP(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListCHF(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListEUR(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListUSD(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListSGD(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListCAD(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListAUD(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListNZD(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListBGN(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListGEL(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListILS(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListQAR(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListPEN(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListAED(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListSAR(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListPLN(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListMYR(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListRON(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListBRL(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListDKK(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListCNY(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListHKD(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListSEK(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListNOK(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListZAR(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListMXN(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListCZK(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListTWD(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListTHB(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListTRY(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListUAH(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListUYU(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListPHP(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListINR(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListRUB(
	val title: String,
	val rate: Long,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListRSD(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListJPY(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListHUF(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListKZT(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListCRC(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListCLP(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListARS(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListKRW(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListCOP(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListIDR(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListVND(
	val title: String,
	val rate: Double,
	val formattedRate: String,
	val symbol: String,
)

@Serializable
data class PaymentsCurrencyResponseCurrencyList(
	val BTC: PaymentsCurrencyResponseCurrencyListBTC,
	val ETH: PaymentsCurrencyResponseCurrencyListETH,
	val BNB: PaymentsCurrencyResponseCurrencyListBNB,
	val BCH: PaymentsCurrencyResponseCurrencyListBCH,
	val XMR: PaymentsCurrencyResponseCurrencyListXMR,
	val SOL: PaymentsCurrencyResponseCurrencyListSOL,
	val LTC: PaymentsCurrencyResponseCurrencyListLTC,
	val DASH: PaymentsCurrencyResponseCurrencyListDASH,
	val TON: PaymentsCurrencyResponseCurrencyListTON,
	val USDT: PaymentsCurrencyResponseCurrencyListUSDT,
	val MATIC: PaymentsCurrencyResponseCurrencyListMATIC,
	val TRX: PaymentsCurrencyResponseCurrencyListTRX,
	val DOGE: PaymentsCurrencyResponseCurrencyListDOGE,
	val KWD: PaymentsCurrencyResponseCurrencyListKWD,
	val GBP: PaymentsCurrencyResponseCurrencyListGBP,
	val CHF: PaymentsCurrencyResponseCurrencyListCHF,
	val EUR: PaymentsCurrencyResponseCurrencyListEUR,
	val USD: PaymentsCurrencyResponseCurrencyListUSD,
	val SGD: PaymentsCurrencyResponseCurrencyListSGD,
	val CAD: PaymentsCurrencyResponseCurrencyListCAD,
	val AUD: PaymentsCurrencyResponseCurrencyListAUD,
	val NZD: PaymentsCurrencyResponseCurrencyListNZD,
	val BGN: PaymentsCurrencyResponseCurrencyListBGN,
	val GEL: PaymentsCurrencyResponseCurrencyListGEL,
	val ILS: PaymentsCurrencyResponseCurrencyListILS,
	val QAR: PaymentsCurrencyResponseCurrencyListQAR,
	val PEN: PaymentsCurrencyResponseCurrencyListPEN,
	val AED: PaymentsCurrencyResponseCurrencyListAED,
	val SAR: PaymentsCurrencyResponseCurrencyListSAR,
	val PLN: PaymentsCurrencyResponseCurrencyListPLN,
	val MYR: PaymentsCurrencyResponseCurrencyListMYR,
	val RON: PaymentsCurrencyResponseCurrencyListRON,
	val BRL: PaymentsCurrencyResponseCurrencyListBRL,
	val DKK: PaymentsCurrencyResponseCurrencyListDKK,
	val CNY: PaymentsCurrencyResponseCurrencyListCNY,
	val HKD: PaymentsCurrencyResponseCurrencyListHKD,
	val SEK: PaymentsCurrencyResponseCurrencyListSEK,
	val NOK: PaymentsCurrencyResponseCurrencyListNOK,
	val ZAR: PaymentsCurrencyResponseCurrencyListZAR,
	val MXN: PaymentsCurrencyResponseCurrencyListMXN,
	val CZK: PaymentsCurrencyResponseCurrencyListCZK,
	val TWD: PaymentsCurrencyResponseCurrencyListTWD,
	val THB: PaymentsCurrencyResponseCurrencyListTHB,
	val TRY: PaymentsCurrencyResponseCurrencyListTRY,
	val UAH: PaymentsCurrencyResponseCurrencyListUAH,
	val UYU: PaymentsCurrencyResponseCurrencyListUYU,
	val PHP: PaymentsCurrencyResponseCurrencyListPHP,
	val INR: PaymentsCurrencyResponseCurrencyListINR,
	val RUB: PaymentsCurrencyResponseCurrencyListRUB,
	val RSD: PaymentsCurrencyResponseCurrencyListRSD,
	val JPY: PaymentsCurrencyResponseCurrencyListJPY,
	val HUF: PaymentsCurrencyResponseCurrencyListHUF,
	val KZT: PaymentsCurrencyResponseCurrencyListKZT,
	val CRC: PaymentsCurrencyResponseCurrencyListCRC,
	val CLP: PaymentsCurrencyResponseCurrencyListCLP,
	val ARS: PaymentsCurrencyResponseCurrencyListARS,
	val KRW: PaymentsCurrencyResponseCurrencyListKRW,
	val COP: PaymentsCurrencyResponseCurrencyListCOP,
	val IDR: PaymentsCurrencyResponseCurrencyListIDR,
	val VND: PaymentsCurrencyResponseCurrencyListVND,
)

@Serializable
data class PaymentsBalanceListResponse(
	val from: PaymentsBalanceListResponseFrom? = null,
	val to: PaymentsBalanceListResponseTo? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class PaymentsBalanceListResponseFromBalance(
	val balance: String,
	val convertedBalance: Long,
	val fullTitle: String,
	val title: String,
	val type: String,
)

@Serializable
data class PaymentsBalanceListResponseFrom(
	val balance: PaymentsBalanceListResponseFromBalance,
	@SerialName("12345")
	val `12345`: BalanceModel,
)

@Serializable
data class PaymentsBalanceListResponseTo(
	val balance: UserModel,
)

@Serializable
data class PaymentsBalanceExchangeBody(
	@SerialName("from_balance")
	val fromBalance: String,
	@SerialName("to_balance")
	val toBalance: String,
	val amount: Long,
)

@Serializable
data class PaymentsBalanceExchangeResponse(
	val from: PaymentsBalanceExchangeResponseFrom? = null,
	val to: PaymentsBalanceExchangeResponseTo? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class PaymentsBalanceExchangeResponseFromBalance(
	val balance: String,
	val convertedBalance: Long,
	val fullTitle: String,
	val title: String,
	val type: String,
)

@Serializable
data class PaymentsBalanceExchangeResponseFrom(
	val balance: PaymentsBalanceExchangeResponseFromBalance,
	@SerialName("12345")
	val `12345`: BalanceModel,
)

@Serializable
data class PaymentsBalanceExchangeResponseTo(
	val balance: UserModel,
)

@Serializable
data class PaymentsTransferBody(
	@SerialName("user_id")
	val userId: Long? = null,
	val username: String? = null,
	val amount: Long,
	val currency: String,
	val comment: String? = null,
	@SerialName("telegram_deal")
	val telegramDeal: Boolean? = null,
	@SerialName("telegram_username")
	val telegramUsername: String? = null,
	@SerialName("transfer_hold")
	val transferHold: Boolean? = null,
	@SerialName("hold_length_value")
	val holdLengthValue: Long? = null,
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
	val calculator: PaymentsFeeResponseCalculator? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class PaymentsFeeResponseCalculator(
	val inputAmount: Long,
	val commissionAmount: Long,
	val totalOutputAmount: Long,
)

@Serializable
data class PaymentsCancelBody(
	@SerialName("payment_id")
	val paymentId: Long,
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
	val pmin: Long? = null,
	val pmax: Long? = null,
	val currency: String? = null,
	val page: Long? = null,
	@SerialName("operation_id_lt")
	val operationIdLt: Long? = null,
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
	val payments: PaymentsHistoryResponsePayments? = null,
	val perPage: String? = null,
	val page: Long? = null,
	val pageNavLink: String? = null,
	val pageNavParams: PaymentsHistoryResponsePageNavParams? = null,
	val periodLabel: String? = null,
	val periodLabelPhrase: String? = null,
	val filterDatesDefault: Boolean? = null,
	val input: PaymentsHistoryResponseInput? = null,
	val paymentStats: JsonElement? = null,
	val hasNextPage: Boolean? = null,
	val lastOperationId: Long? = null,
	val nextPageHref: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class PaymentsHistoryResponsePayments1234567890Data(
	@SerialName("user_id")
	val userId: Long,
	val username: String,
	val comment: String,
	val fee: Long,
	@SerialName("invoice_id")
	val invoiceId: Long,
	@SerialName("is_test")
	val isTest: Boolean,
	@SerialName("payment_id")
	val paymentId: String,
	val commentPlain: String,
	@SerialName("is_banned")
	val isBanned: Long,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Long,
	@SerialName("uniq_username_css")
	val uniqUsernameCss: String,
	@SerialName("uniq_banner")
	val uniqBanner: String,
	@SerialName("avatar_date")
	val avatarDate: Long,
	@SerialName("user_group_id")
	val userGroupId: Long,
	@SerialName("username_html")
	val usernameHtml: String,
	val avatar: String,
)

@Serializable
data class PaymentsHistoryResponsePayments1234567890Label(
	val title: String,
)

@Serializable
data class PaymentsHistoryResponsePayments1234567890Merchant(
	@SerialName("merchant_id")
	val merchantId: Long,
	val name: String,
	@SerialName("user_id")
	val userId: Long,
	@SerialName("created_date")
	val createdDate: Long,
	@SerialName("secret_key")
	val secretKey: String,
	@SerialName("avatar_data")
	val avatarData: String,
	val url: String,
)

@Serializable
data class PaymentsHistoryResponsePayments1234567890User(
	@SerialName("user_id")
	val userId: Long,
	@SerialName("user_balance")
	val userBalance: String,
	@SerialName("user_hold")
	val userHold: String,
	@SerialName("user_balance_with_hold")
	val userBalanceWithHold: Double,
)

@Serializable
data class PaymentsHistoryResponsePayments1234567890(
	@SerialName("operation_id")
	val operationId: Long,
	@SerialName("operation_date")
	val operationDate: Long,
	@SerialName("operation_type")
	val operationType: String,
	@SerialName("outgoing_sum")
	val outgoingSum: String,
	@SerialName("incoming_sum")
	val incomingSum: String,
	@SerialName("item_id")
	val itemId: Long,
	val wallet: String,
	@SerialName("is_finished")
	val isFinished: Long,
	@SerialName("is_hold")
	val isHold: Long,
	@SerialName("payment_system")
	val paymentSystem: String,
	val data: PaymentsHistoryResponsePayments1234567890Data,
	@SerialName("hold_end_date")
	val holdEndDate: Long,
	@SerialName("operation_end_date")
	val operationEndDate: Long,
	val api: Long,
	val sum: String,
	@SerialName("payment_status")
	val paymentStatus: String,
	val supportLink: JsonElement,
	val paymentSystemIcons: List<JsonElement>,
	val canCancelPaidMailPayment: Boolean,
	val canCancelBalanceTransfer: Boolean,
	val canCancelBalancePayout: Boolean,
	val canCancelBalanceHold: Boolean,
	val canFinishBalanceTransfer: Boolean,
	val canFinishBalancePayout: Boolean,
	val canFinishBalanceHold: Boolean,
	val label: PaymentsHistoryResponsePayments1234567890Label,
	val merchant: PaymentsHistoryResponsePayments1234567890Merchant,
	val user: PaymentsHistoryResponsePayments1234567890User,
)

@Serializable
data class PaymentsHistoryResponsePayments(
	@SerialName("1234567890")
	val `1234567890`: PaymentsHistoryResponsePayments1234567890,
)

@Serializable
data class PaymentsHistoryResponsePageNavParams(
	val type: String,
	val startDate: String,
	val endDate: String,
)

@Serializable
data class PaymentsHistoryResponseInput(
	@SerialName("user_id")
	val userId: Long,
	val type: String,
	val startDate: String,
	val endDate: String,
	val page: Long,
	@SerialName("period_label")
	val periodLabel: String,
	val receiver: String,
	val sender: String,
	val comment: String,
	val pmin: String,
	val pmax: String,
	@SerialName("category_id")
	val categoryId: Long,
	val wallet: String,
	@SerialName("is_hold")
	val isHold: Boolean,
	val currency: String,
	@SerialName("operation_id_lt")
	val operationIdLt: Long,
)

@Serializable
data class PaymentsPayoutServicesResponse(
	val systems: List<PaymentsPayoutServicesResponseSystems>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class PaymentsPayoutServicesResponseSystemsProvidersBEP20(
	val title: String,
	val isUnavailable: Boolean,
)

@Serializable
data class PaymentsPayoutServicesResponseSystemsProvidersTRC20(
	val title: String,
	val isUnavailable: Boolean,
)

@Serializable
data class PaymentsPayoutServicesResponseSystemsProvidersERC20(
	val title: String,
	val isUnavailable: Boolean,
)

@Serializable
data class PaymentsPayoutServicesResponseSystemsProvidersTRX(
	val title: String,
	val isUnavailable: Boolean,
)

@Serializable
data class PaymentsPayoutServicesResponseSystemsProvidersBTC(
	val title: String,
	val isUnavailable: Boolean,
)

@Serializable
data class PaymentsPayoutServicesResponseSystemsProvidersTON(
	val title: String,
	val isUnavailable: Boolean,
)

@Serializable
data class PaymentsPayoutServicesResponseSystemsProvidersETH(
	val title: String,
	val isUnavailable: Boolean,
)

@Serializable
data class PaymentsPayoutServicesResponseSystemsProvidersLTC(
	val title: String,
	val isUnavailable: Boolean,
)

@Serializable
data class PaymentsPayoutServicesResponseSystemsProvidersBNB(
	val title: String,
	val isUnavailable: Boolean,
)

@Serializable
data class PaymentsPayoutServicesResponseSystemsProvidersDASH(
	val title: String,
	val isUnavailable: Boolean,
)

@Serializable
data class PaymentsPayoutServicesResponseSystemsProvidersDOGE(
	val title: String,
	val isUnavailable: Boolean,
)

@Serializable
data class PaymentsPayoutServicesResponseSystemsProvidersXMR(
	val title: String,
	val isUnavailable: Boolean,
)

@Serializable
data class PaymentsPayoutServicesResponseSystemsProvidersSOL(
	val title: String,
	val isUnavailable: Boolean,
)

@Serializable
data class PaymentsPayoutServicesResponseSystemsProvidersBCH(
	val title: String,
	val isUnavailable: Boolean,
)

@Serializable
data class PaymentsPayoutServicesResponseSystemsProviders(
	val BEP20: PaymentsPayoutServicesResponseSystemsProvidersBEP20,
	val TRC20: PaymentsPayoutServicesResponseSystemsProvidersTRC20,
	val ERC20: PaymentsPayoutServicesResponseSystemsProvidersERC20,
	val TRX: PaymentsPayoutServicesResponseSystemsProvidersTRX,
	val BTC: PaymentsPayoutServicesResponseSystemsProvidersBTC,
	val TON: PaymentsPayoutServicesResponseSystemsProvidersTON,
	val ETH: PaymentsPayoutServicesResponseSystemsProvidersETH,
	val LTC: PaymentsPayoutServicesResponseSystemsProvidersLTC,
	val BNB: PaymentsPayoutServicesResponseSystemsProvidersBNB,
	val DASH: PaymentsPayoutServicesResponseSystemsProvidersDASH,
	val DOGE: PaymentsPayoutServicesResponseSystemsProvidersDOGE,
	val XMR: PaymentsPayoutServicesResponseSystemsProvidersXMR,
	val SOL: PaymentsPayoutServicesResponseSystemsProvidersSOL,
	val BCH: PaymentsPayoutServicesResponseSystemsProvidersBCH,
)

@Serializable
data class PaymentsPayoutServicesResponseSystems(
	val system: String,
	val commission: String,
	val min: Long,
	val max: Long,
	@SerialName("instant_payout")
	val instantPayout: Boolean,
	@SerialName("problematic_payout")
	val problematicPayout: Boolean,
	@SerialName("is_unavailable")
	val isUnavailable: Boolean,
	val p2p: Boolean,
	@SerialName("has_wallet")
	val hasWallet: Boolean,
	val providers: PaymentsPayoutServicesResponseSystemsProviders,
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
	val payments: AutoPaymentsListResponsePayments? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class AutoPaymentsListResponsePayments1234567890ReceiverLinks(
	val permalink: String,
	val detail: String,
	val avatar: String,
	@SerialName("avatar_big")
	val avatarBig: String,
	@SerialName("avatar_small")
	val avatarSmall: String,
	val followers: String,
	val followings: String,
	val ignore: String,
	val timeline: String,
)

@Serializable
data class AutoPaymentsListResponsePayments1234567890ReceiverPermissions(
	val edit: Boolean,
	val follow: Boolean,
	val ignore: Boolean,
	@SerialName("profile_post")
	val profilePost: Boolean,
)

@Serializable
data class AutoPaymentsListResponsePayments1234567890ReceiverFields(
	val id: String,
	val title: String,
	val description: String,
	val position: String,
	@SerialName("is_required")
	val isRequired: Boolean,
	val value: String,
)

@Serializable
data class AutoPaymentsListResponsePayments1234567890Receiver(
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
	@SerialName("custom_title")
	val customTitle: String,
	@SerialName("is_banned")
	val isBanned: Long,
	@SerialName("user_title")
	val userTitle: String,
	@SerialName("user_is_valid")
	val userIsValid: Boolean,
	@SerialName("user_is_verified")
	val userIsVerified: Boolean,
	@SerialName("user_is_followed")
	val userIsFollowed: Boolean,
	@SerialName("user_last_seen_date")
	val userLastSeenDate: Long,
	@SerialName("user_following_count")
	val userFollowingCount: Long,
	@SerialName("user_followers_count")
	val userFollowersCount: Long,
	val links: AutoPaymentsListResponsePayments1234567890ReceiverLinks,
	val permissions: AutoPaymentsListResponsePayments1234567890ReceiverPermissions,
	@SerialName("user_is_ignored")
	val userIsIgnored: Boolean,
	@SerialName("user_is_visitor")
	val userIsVisitor: Boolean,
	@SerialName("user_group_id")
	val userGroupId: Long,
	val fields: List<AutoPaymentsListResponsePayments1234567890ReceiverFields>,
)

@Serializable
data class AutoPaymentsListResponsePayments1234567890(
	@SerialName("user_id")
	val userId: Long,
	@SerialName("receiver_id")
	val receiverId: Long,
	val amount: String,
	val description: String,
	@SerialName("next_payment")
	val nextPayment: Long,
	@SerialName("next_alert_date")
	val nextAlertDate: Long,
	@SerialName("auto_payment_id")
	val autoPaymentId: Long,
	val day: String,
	val receiver: AutoPaymentsListResponsePayments1234567890Receiver,
)

@Serializable
data class AutoPaymentsListResponsePayments(
	@SerialName("1234567890")
	val `1234567890`: AutoPaymentsListResponsePayments1234567890,
)

@Serializable
data class AutoPaymentsCreateBody(
	@SerialName("secret_answer")
	val secretAnswer: String? = null,
	@SerialName("username_receiver")
	val usernameReceiver: String,
	val day: Long,
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
	val autoPaymentId: Long,
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
	val proxies: List<ProxyGetResponseProxies>? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ProxyGetResponseProxiesProxy(
	@SerialName("proxy_id")
	val proxyId: Long,
	@SerialName("user_id")
	val userId: Long,
	@SerialName("proxy_ip")
	val proxyIp: String,
	@SerialName("proxy_port")
	val proxyPort: Long,
	@SerialName("proxy_user")
	val proxyUser: String,
	@SerialName("proxy_pass")
	val proxyPass: String,
	val proxyString: String,
)

@Serializable
data class ProxyGetResponseProxies(
	val proxy: ProxyGetResponseProxiesProxy,
)

@Serializable
data class ProxyAddBody(
	@SerialName("proxy_ip")
	val proxyIp: String? = null,
	@SerialName("proxy_port")
	val proxyPort: Long? = null,
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
	val proxyId: Long? = null,
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
	val port: Long,
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
	val jobs: BatchBatchResponseJobs? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class BatchBatchResponseJobsJobId(
	@SerialName("_job_result")
	val JobResult: String? = null,
	@SerialName("_job_error")
	val JobError: String? = null,
)

@Serializable
data class BatchBatchResponseJobs(
	@SerialName("job_id")
	val jobId: BatchBatchResponseJobsJobId,
)

