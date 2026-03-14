// Auto-generated. Do not edit manually.

package com.lolzteam.api.generated.market

import com.lolzteam.api.runtime.LolzteamHttpClient
import com.lolzteam.api.runtime.RequestOptions
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.serializer

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

	suspend fun download(type: JsonElement, params: ListDownloadParams? = null): ListDownloadResponse {
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
