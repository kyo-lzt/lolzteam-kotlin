// Auto-generated. Do not edit manually.

package com.lolzteam.api.generated.market

import com.lolzteam.api.runtime.ClientConfig
import com.lolzteam.api.runtime.LolzteamHttpClient
import com.lolzteam.api.runtime.RateLimitConfig
import com.lolzteam.api.runtime.RequestOptions
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.serializer
import java.io.Closeable

class CategoryApi(private val http: LolzteamHttpClient) {

	suspend fun all(params: CategoryAllParams? = null): CategoryAllResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
			isSearch = true,
		))
	}

	suspend fun steam(params: CategorySteamParams? = null): CategorySteamResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/steam",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
			isSearch = true,
		))
	}

	suspend fun fortnite(params: CategoryFortniteParams? = null): CategoryFortniteResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/fortnite",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
			isSearch = true,
		))
	}

	suspend fun mihoyo(params: CategoryMihoyoParams? = null): CategoryMihoyoResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/mihoyo",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
			isSearch = true,
		))
	}

	suspend fun riot(params: CategoryRiotParams? = null): CategoryRiotResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/riot",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
			isSearch = true,
		))
	}

	suspend fun telegram(params: CategoryTelegramParams? = null): CategoryTelegramResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/telegram",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
			isSearch = true,
		))
	}

	suspend fun supercell(params: CategorySupercellParams? = null): CategorySupercellResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/supercell",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
			isSearch = true,
		))
	}

	suspend fun ea(params: CategoryEaParams? = null): CategoryEaResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/ea",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
			isSearch = true,
		))
	}

	suspend fun wot(params: CategoryWotParams? = null): CategoryWotResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/world-of-tanks",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
			isSearch = true,
		))
	}

	suspend fun wotBlitz(params: CategoryWotBlitzParams? = null): CategoryWotBlitzResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/wot-blitz",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
			isSearch = true,
		))
	}

	suspend fun gifts(params: CategoryGiftsParams? = null): CategoryGiftsResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/gifts",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
			isSearch = true,
		))
	}

	suspend fun epicGames(params: CategoryEpicGamesParams? = null): CategoryEpicGamesResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/epicgames",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
			isSearch = true,
		))
	}

	suspend fun escapeFromTarkov(params: CategoryEscapeFromTarkovParams? = null): CategoryEscapeFromTarkovResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/escape-from-tarkov",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
			isSearch = true,
		))
	}

	suspend fun socialClub(params: CategorySocialClubParams? = null): CategorySocialClubResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/socialclub",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
			isSearch = true,
		))
	}

	suspend fun uplay(params: CategoryUplayParams? = null): CategoryUplayResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/uplay",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
			isSearch = true,
		))
	}

	suspend fun discord(params: CategoryDiscordParams? = null): CategoryDiscordResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/discord",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
			isSearch = true,
		))
	}

	suspend fun tikTok(params: CategoryTikTokParams? = null): CategoryTikTokResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/tiktok",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
			isSearch = true,
		))
	}

	suspend fun instagram(params: CategoryInstagramParams? = null): CategoryInstagramResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/instagram",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
			isSearch = true,
		))
	}

	suspend fun battleNet(params: CategoryBattleNetParams? = null): CategoryBattleNetResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/battlenet",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
			isSearch = true,
		))
	}

	suspend fun chatGPT(params: CategoryChatGPTParams? = null): CategoryChatGPTResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/chatgpt",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
			isSearch = true,
		))
	}

	suspend fun vpn(params: CategoryVpnParams? = null): CategoryVpnResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/vpn",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
			isSearch = true,
		))
	}

	suspend fun roblox(params: CategoryRobloxParams? = null): CategoryRobloxResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/roblox",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
			isSearch = true,
		))
	}

	suspend fun warface(params: CategoryWarfaceParams? = null): CategoryWarfaceResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/warface",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
			isSearch = true,
		))
	}

	suspend fun minecraft(params: CategoryMinecraftParams? = null): CategoryMinecraftResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/minecraft",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
			isSearch = true,
		))
	}

	suspend fun hytale(params: CategoryHytaleParams? = null): CategoryHytaleResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/hytale",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
			isSearch = true,
		))
	}

	suspend fun list(params: CategoryListParams? = null): CategoryListResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/category",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
			isSearch = true,
		))
	}

	suspend fun params(categoryName: String): CategoryParamsResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/$categoryName/params",
			isSearch = true,
		))
	}

	suspend fun games(categoryName: String): CategoryGamesResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/$categoryName/games",
			isSearch = true,
		))
	}
}


class ListApi(private val http: LolzteamHttpClient) {

	suspend fun user(params: ListUserParams? = null): ListUserResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/user/items",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun orders(params: ListOrdersParams? = null): ListOrdersResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/user/orders",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun states(params: ListStatesParams? = null): ListStatesResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/user/item-states",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun download(type: String, params: ListDownloadParams? = null): ListDownloadResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/user/$type/download",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun favorites(params: ListFavoritesParams? = null): ListFavoritesResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/fave",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun viewed(params: ListViewedParams? = null): ListViewedResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/viewed",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}
}


class ManagingApi(private val http: LolzteamHttpClient) {

	suspend fun get(itemId: Int, params: ManagingGetParams? = null): ManagingGetResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/$itemId",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun delete(itemId: Int, body: ManagingDeleteBody? = null): ManagingDeleteResponse {
		return http.request(RequestOptions(
			method = "DELETE",
			path = "/$itemId",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		))
	}

	suspend fun createClaim(body: ManagingCreateClaimBody? = null): ManagingCreateClaimResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/claims",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		))
	}

	suspend fun bulkGet(body: ManagingBulkGetBody): ManagingBulkGetResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/bulk/items",
			body = http.json.encodeToJsonElement(serializer(), body),
			bodyEncoding = "json",
		))
	}

	suspend fun steamInventoryValue(itemId: Int, params: ManagingSteamInventoryValueParams? = null): ManagingSteamInventoryValueResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/$itemId/inventory-value",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun steamValue(params: ManagingSteamValueParams? = null): ManagingSteamValueResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/steam-value",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun steamPreview(itemId: Int, params: ManagingSteamPreviewParams? = null): ManagingSteamPreviewResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/$itemId/steam-preview",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun edit(itemId: Int, body: ManagingEditBody? = null): ManagingEditResponse {
		return http.request(RequestOptions(
			method = "PUT",
			path = "/$itemId/edit",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		))
	}

	suspend fun aIPrice(itemId: Int): ManagingAIPriceResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/$itemId/ai-price",
		))
	}

	suspend fun autoBuyPrice(itemId: Int): ManagingAutoBuyPriceResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/$itemId/auto-buy-price",
		))
	}

	suspend fun note(itemId: Int, body: ManagingNoteBody? = null): ManagingNoteResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/$itemId/note-save",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		))
	}

	suspend fun steamUpdateValue(itemId: Int, body: ManagingSteamUpdateValueBody? = null): ManagingSteamUpdateValueResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/$itemId/update-inventory",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		))
	}

	suspend fun bump(itemId: Int): ManagingBumpResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/$itemId/bump",
		))
	}

	suspend fun autoBump(itemId: Int, body: ManagingAutoBumpBody? = null): ManagingAutoBumpResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/$itemId/auto-bump",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		))
	}

	suspend fun autoBumpDisable(itemId: Int): ManagingAutoBumpDisableResponse {
		return http.request(RequestOptions(
			method = "DELETE",
			path = "/$itemId/auto-bump",
		))
	}

	suspend fun open(itemId: Int): ManagingOpenResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/$itemId/open",
		))
	}

	suspend fun close(itemId: Int): ManagingCloseResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/$itemId/close",
		))
	}

	suspend fun image(itemId: Int, params: ManagingImageParams? = null): ManagingImageResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/$itemId/image",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun emailCode(itemId: Int): ManagingEmailCodeResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/$itemId/email-code",
		))
	}

	suspend fun getLetters2(params: ManagingGetLetters2Params? = null): ManagingGetLetters2Response {
		return http.request(RequestOptions(
			method = "GET",
			path = "/letters2",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun steamGetMafile(itemId: Int): ManagingSteamGetMafileResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/$itemId/mafile",
		))
	}

	suspend fun steamAddMafile(itemId: Int): ManagingSteamAddMafileResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/$itemId/mafile",
		))
	}

	suspend fun steamRemoveMafile(itemId: Int): ManagingSteamRemoveMafileResponse {
		return http.request(RequestOptions(
			method = "DELETE",
			path = "/$itemId/mafile",
		))
	}

	suspend fun steamMafileCode(itemId: Int): ManagingSteamMafileCodeResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/$itemId/guard-code",
		))
	}

	suspend fun steamSDA(itemId: Int, body: ManagingSteamSDABody? = null): ManagingSteamSDAResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/$itemId/confirm-sda",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		))
	}

	suspend fun telegramCode(itemId: Int): ManagingTelegramCodeResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/$itemId/telegram-login-code",
		))
	}

	suspend fun telegramResetAuth(itemId: Int): ManagingTelegramResetAuthResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/$itemId/telegram-reset-authorizations",
		))
	}

	suspend fun refuseGuarantee(itemId: Int): ManagingRefuseGuaranteeResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/$itemId/refuse-guarantee",
		))
	}

	suspend fun declineVideoRecording(itemId: Int, body: ManagingDeclineVideoRecordingBody? = null): ManagingDeclineVideoRecordingResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/$itemId/decline-video-recording",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		))
	}

	suspend fun checkGuarantee(itemId: Int): ManagingCheckGuaranteeResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/$itemId/check-guarantee",
		))
	}

	suspend fun changePassword(itemId: Int, body: ManagingChangePasswordBody? = null): ManagingChangePasswordResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/$itemId/change-password",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		))
	}

	suspend fun tempEmailPassword(itemId: Int): ManagingTempEmailPasswordResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/$itemId/temp-email-password",
		))
	}

	suspend fun tag(itemId: Int, body: ManagingTagBody? = null): ManagingTagResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/$itemId/tag",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		))
	}

	suspend fun untag(itemId: Int, body: ManagingUntagBody? = null): ManagingUntagResponse {
		return http.request(RequestOptions(
			method = "DELETE",
			path = "/$itemId/tag",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		))
	}

	suspend fun publicTag(itemId: Int, body: ManagingPublicTagBody? = null): ManagingPublicTagResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/$itemId/public-tag",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		))
	}

	suspend fun publicUntag(itemId: Int, body: ManagingPublicUntagBody? = null): ManagingPublicUntagResponse {
		return http.request(RequestOptions(
			method = "DELETE",
			path = "/$itemId/public-tag",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		))
	}

	suspend fun favorite(itemId: Int): ManagingFavoriteResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/$itemId/star",
		))
	}

	suspend fun unfavorite(itemId: Int): ManagingUnfavoriteResponse {
		return http.request(RequestOptions(
			method = "DELETE",
			path = "/$itemId/star",
		))
	}

	suspend fun stick(itemId: Int): ManagingStickResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/$itemId/stick",
		))
	}

	suspend fun unstick(itemId: Int): ManagingUnstickResponse {
		return http.request(RequestOptions(
			method = "DELETE",
			path = "/$itemId/stick",
		))
	}

	suspend fun transfer(itemId: Int, body: ManagingTransferBody? = null): ManagingTransferResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/$itemId/change-owner",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		))
	}
}


class ProfileApi(private val http: LolzteamHttpClient) {

	suspend fun claims(params: ProfileClaimsParams? = null): ProfileClaimsResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/claims",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun get(params: ProfileGetParams? = null): ProfileGetResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/me",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun edit(body: ProfileEditBody? = null): ProfileEditResponse {
		return http.request(RequestOptions(
			method = "PUT",
			path = "/me",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		))
	}
}


class CartApi(private val http: LolzteamHttpClient) {

	suspend fun get(params: CartGetParams? = null): CartGetResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/cart",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun add(body: CartAddBody): CartAddResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/cart",
			body = http.json.encodeToJsonElement(serializer(), body),
			bodyEncoding = "json",
		))
	}

	suspend fun delete(body: CartDeleteBody? = null): CartDeleteResponse {
		return http.request(RequestOptions(
			method = "DELETE",
			path = "/cart",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		))
	}
}


class PurchasingApi(private val http: LolzteamHttpClient) {

	suspend fun fastBuy(itemId: Int, body: PurchasingFastBuyBody? = null): PurchasingFastBuyResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/$itemId/fast-buy",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		))
	}

	suspend fun check(itemId: Int): PurchasingCheckResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/$itemId/check-account",
		))
	}

	suspend fun confirm(itemId: Int, body: PurchasingConfirmBody? = null): PurchasingConfirmResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/$itemId/confirm-buy",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		))
	}

	suspend fun discountRequest(itemId: Int, body: PurchasingDiscountRequestBody? = null): PurchasingDiscountRequestResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/$itemId/discount",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		))
	}

	suspend fun discountCancel(itemId: Int): PurchasingDiscountCancelResponse {
		return http.request(RequestOptions(
			method = "DELETE",
			path = "/$itemId/discount",
		))
	}
}


class CustomDiscountsApi(private val http: LolzteamHttpClient) {

	suspend fun get(): CustomDiscountsGetResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/custom-discounts",
		))
	}

	suspend fun create(body: CustomDiscountsCreateBody? = null): CustomDiscountsCreateResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/custom-discounts",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		))
	}

	suspend fun edit(body: CustomDiscountsEditBody? = null): CustomDiscountsEditResponse {
		return http.request(RequestOptions(
			method = "PUT",
			path = "/custom-discounts",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		))
	}

	suspend fun delete(body: CustomDiscountsDeleteBody? = null): CustomDiscountsDeleteResponse {
		return http.request(RequestOptions(
			method = "DELETE",
			path = "/custom-discounts",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		))
	}
}


class PublishingApi(private val http: LolzteamHttpClient) {

	suspend fun fastSell(body: PublishingFastSellBody? = null): PublishingFastSellResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/item/fast-sell",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		))
	}

	suspend fun add(body: PublishingAddBody? = null): PublishingAddResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/item/add",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		))
	}

	suspend fun check(itemId: Int, body: PublishingCheckBody? = null): PublishingCheckResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/$itemId/goods/check",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		))
	}

	suspend fun external(itemId: Int, body: PublishingExternalBody? = null): PublishingExternalResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/$itemId/external-account",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		))
	}
}


class PaymentsApi(private val http: LolzteamHttpClient) {

	suspend fun invoiceGet(params: PaymentsInvoiceGetParams? = null): PaymentsInvoiceGetResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/invoice",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun invoiceCreate(body: PaymentsInvoiceCreateBody? = null): PaymentsInvoiceCreateResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/invoice",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		))
	}

	suspend fun invoiceList(params: PaymentsInvoiceListParams? = null): PaymentsInvoiceListResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/invoice/list",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun currency(): PaymentsCurrencyResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/currency",
		))
	}

	suspend fun balanceList(): PaymentsBalanceListResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/balance/exchange",
		))
	}

	suspend fun balanceExchange(body: PaymentsBalanceExchangeBody? = null): PaymentsBalanceExchangeResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/balance/exchange",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		))
	}

	suspend fun transfer(body: PaymentsTransferBody? = null): PaymentsTransferResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/balance/transfer",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		))
	}

	suspend fun fee(params: PaymentsFeeParams? = null): PaymentsFeeResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/balance/transfer/fee",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun cancel(body: PaymentsCancelBody? = null): PaymentsCancelResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/balance/transfer/cancel",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		))
	}

	suspend fun history(params: PaymentsHistoryParams? = null): PaymentsHistoryResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/user/payments",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun payoutServices(): PaymentsPayoutServicesResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/balance/payout/services",
		))
	}

	suspend fun payout(body: PaymentsPayoutBody? = null): PaymentsPayoutResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/balance/payout",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		))
	}
}


class AutoPaymentsApi(private val http: LolzteamHttpClient) {

	suspend fun list(): AutoPaymentsListResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/auto-payments",
		))
	}

	suspend fun create(body: AutoPaymentsCreateBody? = null): AutoPaymentsCreateResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/auto-payment",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		))
	}

	suspend fun delete(body: AutoPaymentsDeleteBody? = null): AutoPaymentsDeleteResponse {
		return http.request(RequestOptions(
			method = "DELETE",
			path = "/auto-payment",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		))
	}
}


class ProxyApi(private val http: LolzteamHttpClient) {

	suspend fun get(): ProxyGetResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/proxy",
		))
	}

	suspend fun add(body: ProxyAddBody): ProxyAddResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/proxy",
			body = http.json.encodeToJsonElement(serializer(), body),
			bodyEncoding = "json",
		))
	}

	suspend fun delete(body: ProxyDeleteBody? = null): ProxyDeleteResponse {
		return http.request(RequestOptions(
			method = "DELETE",
			path = "/proxy",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		))
	}
}


class ImapApi(private val http: LolzteamHttpClient) {

	suspend fun create(body: ImapCreateBody? = null): ImapCreateResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/imap",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		))
	}

	suspend fun delete(body: ImapDeleteBody? = null): ImapDeleteResponse {
		return http.request(RequestOptions(
			method = "DELETE",
			path = "/imap",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		))
	}
}


class BatchApi(private val http: LolzteamHttpClient) {

	suspend fun batch(body: BatchBatchBody): BatchBatchResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/batch",
			body = http.json.encodeToJsonElement(serializer(), body),
			bodyEncoding = "json",
		))
	}
}


class MarketClient(config: ClientConfig) : Closeable {
	val category: CategoryApi
	val list: ListApi
	val managing: ManagingApi
	val profile: ProfileApi
	val cart: CartApi
	val purchasing: PurchasingApi
	val customDiscounts: CustomDiscountsApi
	val publishing: PublishingApi
	val payments: PaymentsApi
	val autoPayments: AutoPaymentsApi
	val proxy: ProxyApi
	val imap: ImapApi
	val batch: BatchApi

	private val http: LolzteamHttpClient

	init {
		http = LolzteamHttpClient(config.copy(
			baseUrl = config.baseUrl ?: "https://prod-api.lzt.market",
			rateLimit = config.rateLimit ?: RateLimitConfig(requestsPerMinute = 120),
			searchRateLimit = config.searchRateLimit ?: RateLimitConfig(requestsPerMinute = 20),
		))
		category = CategoryApi(http)
		list = ListApi(http)
		managing = ManagingApi(http)
		profile = ProfileApi(http)
		cart = CartApi(http)
		purchasing = PurchasingApi(http)
		customDiscounts = CustomDiscountsApi(http)
		publishing = PublishingApi(http)
		payments = PaymentsApi(http)
		autoPayments = AutoPaymentsApi(http)
		proxy = ProxyApi(http)
		imap = ImapApi(http)
		batch = BatchApi(http)
	}

	override fun close() {
		http.close()
	}
}

