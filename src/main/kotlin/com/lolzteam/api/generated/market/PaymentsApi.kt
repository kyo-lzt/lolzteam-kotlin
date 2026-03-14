// Auto-generated. Do not edit manually.

package com.lolzteam.api.generated.market

import com.lolzteam.api.runtime.LolzteamHttpClient
import com.lolzteam.api.runtime.RequestOptions
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.serializer

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
		))
	}

	suspend fun transfer(body: PaymentsTransferBody? = null): PaymentsTransferResponse {
		return http.request(RequestOptions(
			method = "POST",
			path = "/balance/transfer",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
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
		))
	}
}
