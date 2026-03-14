// Auto-generated. Do not edit manually.

package com.lolzteam.api.generated.market

import com.lolzteam.api.runtime.LolzteamHttpClient
import com.lolzteam.api.runtime.RequestOptions
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.serializer

class CategoryApi(private val http: LolzteamHttpClient) {

	suspend fun all(params: CategoryAllParams? = null): CategoryAllResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun steam(params: CategorySteamParams? = null): CategorySteamResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/steam",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun fortnite(params: CategoryFortniteParams? = null): CategoryFortniteResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/fortnite",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun mihoyo(params: CategoryMihoyoParams? = null): CategoryMihoyoResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/mihoyo",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun riot(params: CategoryRiotParams? = null): CategoryRiotResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/riot",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun telegram(params: CategoryTelegramParams? = null): CategoryTelegramResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/telegram",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun supercell(params: CategorySupercellParams? = null): CategorySupercellResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/supercell",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun ea(params: CategoryEaParams? = null): CategoryEaResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/ea",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun wot(params: CategoryWotParams? = null): CategoryWotResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/world-of-tanks",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun wotBlitz(params: CategoryWotBlitzParams? = null): CategoryWotBlitzResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/wot-blitz",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun gifts(params: CategoryGiftsParams? = null): CategoryGiftsResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/gifts",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun epicGames(params: CategoryEpicGamesParams? = null): CategoryEpicGamesResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/epicgames",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun escapeFromTarkov(params: CategoryEscapeFromTarkovParams? = null): CategoryEscapeFromTarkovResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/escape-from-tarkov",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun socialClub(params: CategorySocialClubParams? = null): CategorySocialClubResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/socialclub",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun uplay(params: CategoryUplayParams? = null): CategoryUplayResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/uplay",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun discord(params: CategoryDiscordParams? = null): CategoryDiscordResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/discord",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun tikTok(params: CategoryTikTokParams? = null): CategoryTikTokResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/tiktok",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun instagram(params: CategoryInstagramParams? = null): CategoryInstagramResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/instagram",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun battleNet(params: CategoryBattleNetParams? = null): CategoryBattleNetResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/battlenet",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun chatGPT(params: CategoryChatGPTParams? = null): CategoryChatGPTResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/chatgpt",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun vpn(params: CategoryVpnParams? = null): CategoryVpnResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/vpn",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun roblox(params: CategoryRobloxParams? = null): CategoryRobloxResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/roblox",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun warface(params: CategoryWarfaceParams? = null): CategoryWarfaceResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/warface",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun minecraft(params: CategoryMinecraftParams? = null): CategoryMinecraftResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/minecraft",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun hytale(params: CategoryHytaleParams? = null): CategoryHytaleResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/hytale",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun list(params: CategoryListParams? = null): CategoryListResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/category",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

	suspend fun params(categoryName: JsonElement): CategoryParamsResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/$categoryName/params",
		))
	}

	suspend fun games(categoryName: JsonElement): CategoryGamesResponse {
		return http.request(RequestOptions(
			method = "GET",
			path = "/$categoryName/games",
		))
	}
}
