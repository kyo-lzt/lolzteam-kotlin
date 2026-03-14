// Auto-generated. Do not edit manually.

package com.lolzteam.api.generated.market

import com.lolzteam.api.runtime.ClientConfig
import com.lolzteam.api.runtime.LolzteamHttpClient
import com.lolzteam.api.runtime.RateLimitConfig
import java.io.Closeable

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
