// Auto-generated. Do not edit manually.

package com.lolzteam.api.generated.market

import com.lolzteam.api.runtime.LolzteamHttpClient
import com.lolzteam.api.runtime.RequestOptions
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.serializer

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
		))
	}

	suspend fun createClaim(body: ManagingCreateClaimBody? = null): ManagingCreateClaimResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/claims",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun bulkGet(body: ManagingBulkGetBody): ManagingBulkGetResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/bulk/items",
			body = http.json.encodeToJsonElement(serializer(), body),
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
		))
	}

	suspend fun steamUpdateValue(itemId: Int, body: ManagingSteamUpdateValueBody? = null): ManagingSteamUpdateValueResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/$itemId/update-inventory",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
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
		))
	}

	suspend fun untag(itemId: Int, body: ManagingUntagBody? = null): ManagingUntagResponse {
		return http.request(RequestOptions(
			method = "DELETE",
			path = "/$itemId/tag",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun publicTag(itemId: Int, body: ManagingPublicTagBody? = null): ManagingPublicTagResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/$itemId/public-tag",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun publicUntag(itemId: Int, body: ManagingPublicUntagBody? = null): ManagingPublicUntagResponse {
		return http.request(RequestOptions(
			method = "DELETE",
			path = "/$itemId/public-tag",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
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
		))
	}
}
