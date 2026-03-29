// Auto-generated. Do not edit manually.

package com.lolzteam.api.generated.market

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonClassDiscriminator
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import com.lolzteam.api.runtime.StringOrInt

// ─── Enums ───────────────────────────────────────────────────────

@Serializable(with = AgeVerifiedSerializer::class)
enum class AgeVerified(val value: String) {
	YES("yes"),
	NO("no"),
	NOMATTER("nomatter");
}


internal object AgeVerifiedSerializer : KSerializer<AgeVerified> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("AgeVerified", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: AgeVerified) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): AgeVerified {
		val v = decoder.decodeString()
		return AgeVerified.entries.first { it.value == v }
	}
}


@Serializable(with = AppIdSerializer::class)
enum class AppId(val value: Long) {
	V730(730),
	V578080(578080),
	V753(753),
	V570(570),
	V440(440),
	V252490(252490),
	V304930(304930),
	V232090(232090),
	V322330(322330);
}


internal object AppIdSerializer : KSerializer<AppId> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("AppId", PrimitiveKind.LONG)

	override fun serialize(encoder: Encoder, value: AppId) {
		encoder.encodeLong(value.value)
	}

	override fun deserialize(decoder: Decoder): AppId {
		val v = decoder.decodeLong()
		return AppId.entries.first { it.value == v }
	}
}


@Serializable(with = AutorenewalSerializer::class)
enum class Autorenewal(val value: String) {
	YES("yes"),
	NO("no"),
	NOMATTER("nomatter");
}


internal object AutorenewalSerializer : KSerializer<Autorenewal> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("Autorenewal", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: Autorenewal) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): Autorenewal {
		val v = decoder.decodeString()
		return Autorenewal.entries.first { it.value == v }
	}
}


@Serializable(with = BedrockSerializer::class)
enum class Bedrock(val value: String) {
	YES("yes"),
	NO("no"),
	NOMATTER("nomatter");
}


internal object BedrockSerializer : KSerializer<Bedrock> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("Bedrock", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: Bedrock) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): Bedrock {
		val v = decoder.decodeString()
		return Bedrock.entries.first { it.value == v }
	}
}


@Serializable(with = BillingSerializer::class)
enum class Billing(val value: String) {
	YES("yes"),
	NO("no"),
	NOMATTER("nomatter");
}


internal object BillingSerializer : KSerializer<Billing> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("Billing", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: Billing) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): Billing {
		val v = decoder.decodeString()
		return Billing.entries.first { it.value == v }
	}
}


@Serializable(with = BirthdayAfterPeriodSerializer::class)
enum class BirthdayAfterPeriod(val value: String) {
	DAY("day"),
	MONTH("month"),
	YEAR("year");
}


internal object BirthdayAfterPeriodSerializer : KSerializer<BirthdayAfterPeriod> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("BirthdayAfterPeriod", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: BirthdayAfterPeriod) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): BirthdayAfterPeriod {
		val v = decoder.decodeString()
		return BirthdayAfterPeriod.entries.first { it.value == v }
	}
}


@Serializable(with = BirthdayPeriodSerializer::class)
enum class BirthdayPeriod(val value: String) {
	DAY("day"),
	MONTH("month"),
	YEAR("year");
}


internal object BirthdayPeriodSerializer : KSerializer<BirthdayPeriod> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("BirthdayPeriod", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: BirthdayPeriod) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): BirthdayPeriod {
		val v = decoder.decodeString()
		return BirthdayPeriod.entries.first { it.value == v }
	}
}


@Serializable(with = BpSerializer::class)
enum class Bp(val value: String) {
	YES("yes"),
	NO("no"),
	NOMATTER("nomatter");
}


internal object BpSerializer : KSerializer<Bp> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("Bp", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: Bp) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): Bp {
		val v = decoder.decodeString()
		return Bp.entries.first { it.value == v }
	}
}


@Serializable(with = BrawlPassSerializer::class)
enum class BrawlPass(val value: String) {
	YES("yes"),
	NO("no"),
	NOMATTER("nomatter");
}


internal object BrawlPassSerializer : KSerializer<BrawlPass> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("BrawlPass", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: BrawlPass) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): BrawlPass {
		val v = decoder.decodeString()
		return BrawlPass.entries.first { it.value == v }
	}
}


@Serializable(with = CanChangeDetailsSerializer::class)
enum class CanChangeDetails(val value: String) {
	YES("yes"),
	NO("no"),
	NOMATTER("nomatter");
}


internal object CanChangeDetailsSerializer : KSerializer<CanChangeDetails> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("CanChangeDetails", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: CanChangeDetails) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): CanChangeDetails {
		val v = decoder.decodeString()
		return CanChangeDetails.entries.first { it.value == v }
	}
}


@Serializable(with = CancelSerializer::class)
enum class Cancel(val value: Long) {
	V1(1);
}


internal object CancelSerializer : KSerializer<Cancel> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("Cancel", PrimitiveKind.LONG)

	override fun serialize(encoder: Encoder, value: Cancel) {
		encoder.encodeLong(value.value)
	}

	override fun deserialize(decoder: Decoder): Cancel {
		val v = decoder.decodeLong()
		return Cancel.entries.first { it.value == v }
	}
}


@Serializable(with = CategoryEg1Serializer::class)
enum class CategoryEg1(val value: Long) {
	V0(0),
	V1(1);
}


internal object CategoryEg1Serializer : KSerializer<CategoryEg1> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("CategoryEg1", PrimitiveKind.LONG)

	override fun serialize(encoder: Encoder, value: CategoryEg1) {
		encoder.encodeLong(value.value)
	}

	override fun deserialize(decoder: Decoder): CategoryEg1 {
		val v = decoder.decodeLong()
		return CategoryEg1.entries.first { it.value == v }
	}
}


@Serializable(with = CategoryEg2Serializer::class)
enum class CategoryEg2(val value: Long) {
	Neg1(-1),
	V0(0),
	V1(1);
}


internal object CategoryEg2Serializer : KSerializer<CategoryEg2> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("CategoryEg2", PrimitiveKind.LONG)

	override fun serialize(encoder: Encoder, value: CategoryEg2) {
		encoder.encodeLong(value.value)
	}

	override fun deserialize(decoder: Decoder): CategoryEg2 {
		val v = decoder.decodeLong()
		return CategoryEg2.entries.first { it.value == v }
	}
}


@Serializable(with = CategoryEg3Serializer::class)
enum class CategoryEg3(val value: Long) {
	Neg1(-1),
	V0(0),
	V1(1),
	V2(2);
}


internal object CategoryEg3Serializer : KSerializer<CategoryEg3> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("CategoryEg3", PrimitiveKind.LONG)

	override fun serialize(encoder: Encoder, value: CategoryEg3) {
		encoder.encodeLong(value.value)
	}

	override fun deserialize(decoder: Decoder): CategoryEg3 {
		val v = decoder.decodeLong()
		return CategoryEg3.entries.first { it.value == v }
	}
}


@Serializable(with = CategoryIdSerializer::class)
enum class CategoryId(val value: Long) {
	V1(1),
	V3(3),
	V4(4),
	V5(5),
	V6(6),
	V7(7),
	V8(8),
	V9(9),
	V10(10),
	V11(11),
	V12(12),
	V13(13),
	V14(14),
	V15(15),
	V16(16),
	V17(17),
	V18(18),
	V19(19),
	V20(20),
	V22(22),
	V24(24),
	V28(28),
	V30(30),
	V31(31);
}


internal object CategoryIdSerializer : KSerializer<CategoryId> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("CategoryId", PrimitiveKind.LONG)

	override fun serialize(encoder: Encoder, value: CategoryId) {
		encoder.encodeLong(value.value)
	}

	override fun deserialize(decoder: Decoder): CategoryId {
		val v = decoder.decodeLong()
		return CategoryId.entries.first { it.value == v }
	}
}


@Serializable(with = CategorySubscription1Serializer::class)
enum class CategorySubscription1(val value: String) {
	EA_PLAY("EA Play"),
	EA_PLAY_PRO("EA Play Pro");
}


internal object CategorySubscription1Serializer : KSerializer<CategorySubscription1> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("CategorySubscription1", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: CategorySubscription1) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): CategorySubscription1 {
		val v = decoder.decodeString()
		return CategorySubscription1.entries.first { it.value == v }
	}
}


@Serializable(with = CategorySubscription2Serializer::class)
enum class CategorySubscription2(val value: String) {
	PC_GAME_PASS("PC Game Pass"),
	XBOX_GAME_PASS_ULTIMATE("Xbox Game Pass Ultimate");
}


internal object CategorySubscription2Serializer : KSerializer<CategorySubscription2> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("CategorySubscription2", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: CategorySubscription2) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): CategorySubscription2 {
		val v = decoder.decodeString()
		return CategorySubscription2.entries.first { it.value == v }
	}
}


@Serializable(with = CategorySubscription3Serializer::class)
enum class CategorySubscription3(val value: String) {
	BASIC("basic"),
	PREMIUM("premium"),
	PREMIUM_ANYWHERE("premiumAnywhere");
}


internal object CategorySubscription3Serializer : KSerializer<CategorySubscription3> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("CategorySubscription3", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: CategorySubscription3) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): CategorySubscription3 {
		val v = decoder.decodeString()
		return CategorySubscription3.entries.first { it.value == v }
	}
}


@Serializable(with = CategorySubscription4Serializer::class)
enum class CategorySubscription4(val value: String) {
	DISCORD_NITRO("discord_nitro"),
	DISCORD_NITRO_BASIC("discord_nitro_basic"),
	DISCORD_NITRO_TRIAL("discord_nitro_trial"),
	TELEGRAM_PREMIUM("telegram_premium");
}


internal object CategorySubscription4Serializer : KSerializer<CategorySubscription4> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("CategorySubscription4", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: CategorySubscription4) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): CategorySubscription4 {
		val v = decoder.decodeString()
		return CategorySubscription4.entries.first { it.value == v }
	}
}


@Serializable(with = CategorySubscription5Serializer::class)
enum class CategorySubscription5(val value: String) {
	ROBLOX_PREMIUM1000("RobloxPremium1000"),
	ROBLOX_PREMIUM100012_MONTHS("RobloxPremium100012Months"),
	ROBLOX_PREMIUM1000_ONE_MONTH("RobloxPremium1000OneMonth"),
	ROBLOX_PREMIUM2200("RobloxPremium2200"),
	ROBLOX_PREMIUM2200_ONE_MONTH("RobloxPremium2200OneMonth"),
	ROBLOX_PREMIUM450("RobloxPremium450"),
	ROBLOX_PREMIUM450_ONE_MONTH("RobloxPremium450OneMonth");
}


internal object CategorySubscription5Serializer : KSerializer<CategorySubscription5> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("CategorySubscription5", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: CategorySubscription5) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): CategorySubscription5 {
		val v = decoder.decodeString()
		return CategorySubscription5.entries.first { it.value == v }
	}
}


@Serializable(with = ChangeEmailSerializer::class)
enum class ChangeEmail(val value: String) {
	YES("yes"),
	NO("no"),
	NOMATTER("nomatter");
}


internal object ChangeEmailSerializer : KSerializer<ChangeEmail> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("ChangeEmail", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: ChangeEmail) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): ChangeEmail {
		val v = decoder.decodeString()
		return ChangeEmail.entries.first { it.value == v }
	}
}


@Serializable(with = ChangeNicknameSerializer::class)
enum class ChangeNickname(val value: String) {
	YES("yes"),
	NO("no"),
	NOMATTER("nomatter");
}


internal object ChangeNicknameSerializer : KSerializer<ChangeNickname> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("ChangeNickname", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: ChangeNickname) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): ChangeNickname {
		val v = decoder.decodeString()
		return ChangeNickname.entries.first { it.value == v }
	}
}


@Serializable(with = ChangeableFnSerializer::class)
enum class ChangeableFn(val value: String) {
	YES("yes"),
	NO("no"),
	NOMATTER("nomatter");
}


internal object ChangeableFnSerializer : KSerializer<ChangeableFn> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("ChangeableFn", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: ChangeableFn) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): ChangeableFn {
		val v = decoder.decodeString()
		return ChangeableFn.entries.first { it.value == v }
	}
}


@Serializable(with = ClaimStateSerializer::class)
enum class ClaimState(val value: String) {
	ACTIVE("active"),
	SOLVED("solved"),
	REJECTED("rejected"),
	SETTLED("settled");
}


internal object ClaimStateSerializer : KSerializer<ClaimState> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("ClaimState", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: ClaimState) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): ClaimState {
		val v = decoder.decodeString()
		return ClaimState.entries.first { it.value == v }
	}
}


@Serializable(with = ClanSerializer::class)
enum class Clan(val value: String) {
	YES("yes"),
	NO("no"),
	NOMATTER("nomatter");
}


internal object ClanSerializer : KSerializer<Clan> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("Clan", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: Clan) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): Clan {
		val v = decoder.decodeString()
		return Clan.entries.first { it.value == v }
	}
}


@Serializable(with = ClansSerializer::class)
enum class Clans(val value: String) {
	YES("yes"),
	NO("no"),
	NOMATTER("nomatter");
}


internal object ClansSerializer : KSerializer<Clans> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("Clans", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: Clans) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): Clans {
		val v = decoder.decodeString()
		return Clans.entries.first { it.value == v }
	}
}


@Serializable(with = ClashPassSerializer::class)
enum class ClashPass(val value: String) {
	YES("yes"),
	NO("no"),
	NOMATTER("nomatter");
}


internal object ClashPassSerializer : KSerializer<ClashPass> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("ClashPass", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: ClashPass) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): ClashPass {
		val v = decoder.decodeString()
		return ClashPass.entries.first { it.value == v }
	}
}


@Serializable(with = CookieLoginSerializer::class)
enum class CookieLogin(val value: String) {
	YES("yes"),
	NO("no"),
	NOMATTER("nomatter");
}


internal object CookieLoginSerializer : KSerializer<CookieLogin> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("CookieLogin", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: CookieLogin) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): CookieLogin {
		val v = decoder.decodeString()
		return CookieLogin.entries.first { it.value == v }
	}
}


@Serializable(with = CookiesSerializer::class)
enum class Cookies(val value: String) {
	YES("yes"),
	NO("no"),
	NOMATTER("nomatter");
}


internal object CookiesSerializer : KSerializer<Cookies> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("Cookies", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: Cookies) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): Cookies {
		val v = decoder.decodeString()
		return Cookies.entries.first { it.value == v }
	}
}


@Serializable(with = Cs2MapRankSerializer::class)
enum class Cs2MapRank(val value: Long) {
	V1(1),
	V2(2),
	V3(3),
	V4(4),
	V5(5),
	V6(6),
	V7(7),
	V8(8),
	V9(9),
	V10(10),
	V11(11),
	V12(12),
	V13(13);
}


internal object Cs2MapRankSerializer : KSerializer<Cs2MapRank> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("Cs2MapRank", PrimitiveKind.LONG)

	override fun serialize(encoder: Encoder, value: Cs2MapRank) {
		encoder.encodeLong(value.value)
	}

	override fun deserialize(decoder: Decoder): Cs2MapRank {
		val v = decoder.decodeLong()
		return Cs2MapRank.entries.first { it.value == v }
	}
}


@Serializable(with = CurrencySerializer::class)
enum class Currency(val value: String) {
	RUB("rub"),
	UAH("uah"),
	KZT("kzt"),
	BYN("byn"),
	USD("usd"),
	EUR("eur"),
	GBP("gbp"),
	CNY("cny"),
	TRY("try"),
	JPY("jpy"),
	BRL("brl");
}


internal object CurrencySerializer : KSerializer<Currency> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("Currency", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: Currency) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): Currency {
		val v = decoder.decodeString()
		return Currency.entries.first { it.value == v }
	}
}


@Serializable(with = D2LastMatchDatePeriodSerializer::class)
enum class D2LastMatchDatePeriod(val value: String) {
	DAY("day"),
	MONTH("month"),
	YEAR("year");
}


internal object D2LastMatchDatePeriodSerializer : KSerializer<D2LastMatchDatePeriod> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("D2LastMatchDatePeriod", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: D2LastMatchDatePeriod) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): D2LastMatchDatePeriod {
		val v = decoder.decodeString()
		return D2LastMatchDatePeriod.entries.first { it.value == v }
	}
}


@Serializable(with = DaySerializer::class)
enum class Day(val value: Long) {
	V0(0),
	V1(1),
	V2(2),
	V3(3),
	V4(4),
	V5(5),
	V6(6),
	V7(7),
	V8(8),
	V9(9),
	V10(10),
	V11(11),
	V12(12),
	V13(13),
	V14(14),
	V15(15),
	V16(16),
	V17(17),
	V18(18),
	V19(19),
	V20(20),
	V21(21),
	V22(22),
	V23(23),
	V24(24),
	V25(25),
	V26(26),
	V27(27),
	V28(28);
}


internal object DaySerializer : KSerializer<Day> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("Day", PrimitiveKind.LONG)

	override fun serialize(encoder: Encoder, value: Day) {
		encoder.encodeLong(value.value)
	}

	override fun deserialize(decoder: Decoder): Day {
		val v = decoder.decodeLong()
		return Day.entries.first { it.value == v }
	}
}


@Serializable(with = DungeonsSerializer::class)
enum class Dungeons(val value: String) {
	YES("yes"),
	NO("no"),
	NOMATTER("nomatter");
}


internal object DungeonsSerializer : KSerializer<Dungeons> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("Dungeons", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: Dungeons) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): Dungeons {
		val v = decoder.decodeString()
		return Dungeons.entries.first { it.value == v }
	}
}


@Serializable(with = EaSerializer::class)
enum class Ea(val value: String) {
	YES("yes"),
	NO("no"),
	NOMATTER("nomatter");
}


internal object EaSerializer : KSerializer<Ea> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("Ea", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: Ea) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): Ea {
		val v = decoder.decodeString()
		return Ea.entries.first { it.value == v }
	}
}


@Serializable(with = EditBtagSerializer::class)
enum class EditBtag(val value: String) {
	YES("yes"),
	NO("no"),
	NOMATTER("nomatter");
}


internal object EditBtagSerializer : KSerializer<EditBtag> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("EditBtag", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: EditBtag) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): EditBtag {
		val v = decoder.decodeString()
		return EditBtag.entries.first { it.value == v }
	}
}


@Serializable(with = EmailSerializer::class)
enum class Email(val value: String) {
	YES("yes"),
	NO("no"),
	NOMATTER("nomatter");
}


internal object EmailSerializer : KSerializer<Email> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("Email", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: Email) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): Email {
		val v = decoder.decodeString()
		return Email.entries.first { it.value == v }
	}
}


@Serializable(with = EmailTypeSerializer::class)
enum class EmailType(val value: String) {
	NATIVE("native"),
	AUTOREG("autoreg");
}


internal object EmailTypeSerializer : KSerializer<EmailType> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("EmailType", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: EmailType) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): EmailType {
		val v = decoder.decodeString()
		return EmailType.entries.first { it.value == v }
	}
}


@Serializable(with = ExtendedGuaranteeSerializer::class)
enum class ExtendedGuarantee(val value: Long) {
	Neg1(-1),
	V0(0),
	V1(1);
}


internal object ExtendedGuaranteeSerializer : KSerializer<ExtendedGuarantee> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("ExtendedGuarantee", PrimitiveKind.LONG)

	override fun serialize(encoder: Encoder, value: ExtendedGuarantee) {
		encoder.encodeLong(value.value)
	}

	override fun deserialize(decoder: Decoder): ExtendedGuarantee {
		val v = decoder.decodeLong()
		return ExtendedGuarantee.entries.first { it.value == v }
	}
}


@Serializable(with = FormatSerializer::class)
enum class Format(val value: String) {
	SHORT("short"),
	CUSTOM("custom"),
	MFA_FILE_STEAM_ID("mfa_file_steam_id"),
	MFA_FILE_LOGIN("mfa_file_login");
}


internal object FormatSerializer : KSerializer<Format> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("Format", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: Format) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): Format {
		val v = decoder.decodeString()
		return Format.entries.first { it.value == v }
	}
}


@Serializable(with = GameDonationsSerializer::class)
enum class GameDonations(val value: String) {
	YES("yes"),
	NO("no"),
	NOMATTER("nomatter");
}


internal object GameDonationsSerializer : KSerializer<GameDonations> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("GameDonations", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: GameDonations) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): GameDonations {
		val v = decoder.decodeString()
		return GameDonations.entries.first { it.value == v }
	}
}


@Serializable(with = GiftsSerializer::class)
enum class Gifts(val value: String) {
	YES("yes"),
	NO("no"),
	NOMATTER("nomatter");
}


internal object GiftsSerializer : KSerializer<Gifts> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("Gifts", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: Gifts) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): Gifts {
		val v = decoder.decodeString()
		return Gifts.entries.first { it.value == v }
	}
}


@Serializable(with = HasActivatedKeysSerializer::class)
enum class HasActivatedKeys(val value: String) {
	YES("yes"),
	NO("no"),
	NOMATTER("nomatter");
}


internal object HasActivatedKeysSerializer : KSerializer<HasActivatedKeys> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("HasActivatedKeys", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: HasActivatedKeys) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): HasActivatedKeys {
		val v = decoder.decodeString()
		return HasActivatedKeys.entries.first { it.value == v }
	}
}


@Serializable(with = HasBanSerializer::class)
enum class HasBan(val value: String) {
	YES("yes"),
	NO("no"),
	NOMATTER("nomatter");
}


internal object HasBanSerializer : KSerializer<HasBan> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("HasBan", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: HasBan) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): HasBan {
		val v = decoder.decodeString()
		return HasBan.entries.first { it.value == v }
	}
}


@Serializable(with = HasFaceitSerializer::class)
enum class HasFaceit(val value: String) {
	YES("yes"),
	NO("no"),
	NOMATTER("nomatter");
}


internal object HasFaceitSerializer : KSerializer<HasFaceit> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("HasFaceit", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: HasFaceit) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): HasFaceit {
		val v = decoder.decodeString()
		return HasFaceit.entries.first { it.value == v }
	}
}


@Serializable(with = HoldLengthOptionSerializer::class)
enum class HoldLengthOption(val value: String) {
	HOUR("hour"),
	DAY("day"),
	WEEK("week"),
	MONTH("month"),
	YEAR("year");
}


internal object HoldLengthOptionSerializer : KSerializer<HoldLengthOption> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("HoldLengthOption", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: HoldLengthOption) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): HoldLengthOption {
		val v = decoder.decodeString()
		return HoldLengthOption.entries.first { it.value == v }
	}
}


@Serializable(with = HypixelBanSerializer::class)
enum class HypixelBan(val value: String) {
	YES("yes"),
	NO("no"),
	NOMATTER("nomatter");
}


internal object HypixelBanSerializer : KSerializer<HypixelBan> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("HypixelBan", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: HypixelBan) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): HypixelBan {
		val v = decoder.decodeString()
		return HypixelBan.entries.first { it.value == v }
	}
}


@Serializable(with = HypixelBanParsedSerializer::class)
enum class HypixelBanParsed(val value: String) {
	YES("yes"),
	NO("no"),
	NOMATTER("nomatter");
}


internal object HypixelBanParsedSerializer : KSerializer<HypixelBanParsed> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("HypixelBanParsed", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: HypixelBanParsed) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): HypixelBanParsed {
		val v = decoder.decodeString()
		return HypixelBanParsed.entries.first { it.value == v }
	}
}


@Serializable(with = HypixelSkyblockApiEnabledSerializer::class)
enum class HypixelSkyblockApiEnabled(val value: String) {
	YES("yes"),
	NO("no"),
	NOMATTER("nomatter");
}


internal object HypixelSkyblockApiEnabledSerializer : KSerializer<HypixelSkyblockApiEnabled> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("HypixelSkyblockApiEnabled", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: HypixelSkyblockApiEnabled) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): HypixelSkyblockApiEnabled {
		val v = decoder.decodeString()
		return HypixelSkyblockApiEnabled.entries.first { it.value == v }
	}
}


@Serializable(with = JavaSerializer::class)
enum class Java(val value: String) {
	YES("yes"),
	NO("no"),
	NOMATTER("nomatter");
}


internal object JavaSerializer : KSerializer<Java> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("Java", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: Java) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): Java {
		val v = decoder.decodeString()
		return Java.entries.first { it.value == v }
	}
}


@Serializable(with = LastLoginHypixelPeriodSerializer::class)
enum class LastLoginHypixelPeriod(val value: String) {
	DAY("day"),
	MONTH("month"),
	YEAR("year");
}


internal object LastLoginHypixelPeriodSerializer : KSerializer<LastLoginHypixelPeriod> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("LastLoginHypixelPeriod", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: LastLoginHypixelPeriod) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): LastLoginHypixelPeriod {
		val v = decoder.decodeString()
		return LastLoginHypixelPeriod.entries.first { it.value == v }
	}
}


@Serializable(with = LastTransDatePeriodSerializer::class)
enum class LastTransDatePeriod(val value: String) {
	DAY("day"),
	MONTH("month"),
	YEAR("year");
}


internal object LastTransDatePeriodSerializer : KSerializer<LastTransDatePeriod> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("LastTransDatePeriod", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: LastTransDatePeriod) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): LastTransDatePeriod {
		val v = decoder.decodeString()
		return LastTransDatePeriod.entries.first { it.value == v }
	}
}


@Serializable(with = LastTransDatePeriodLaterSerializer::class)
enum class LastTransDatePeriodLater(val value: String) {
	DAY("day"),
	MONTH("month"),
	YEAR("year");
}


internal object LastTransDatePeriodLaterSerializer : KSerializer<LastTransDatePeriodLater> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("LastTransDatePeriodLater", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: LastTransDatePeriodLater) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): LastTransDatePeriodLater {
		val v = decoder.decodeString()
		return LastTransDatePeriodLater.entries.first { it.value == v }
	}
}


@Serializable(with = LegendsSerializer::class)
enum class Legends(val value: String) {
	YES("yes"),
	NO("no"),
	NOMATTER("nomatter");
}


internal object LegendsSerializer : KSerializer<Legends> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("Legends", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: Legends) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): Legends {
		val v = decoder.decodeString()
		return Legends.entries.first { it.value == v }
	}
}


@Serializable(with = LimitSerializer::class)
enum class Limit(val value: String) {
	YES("yes"),
	NO("no"),
	NOMATTER("nomatter");
}


internal object LimitSerializer : KSerializer<Limit> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("Limit", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: Limit) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): Limit {
		val v = decoder.decodeString()
		return Limit.entries.first { it.value == v }
	}
}


@Serializable(with = LoginWithoutCookiesSerializer::class)
enum class LoginWithoutCookies(val value: String) {
	YES("yes"),
	NO("no"),
	NOMATTER("nomatter");
}


internal object LoginWithoutCookiesSerializer : KSerializer<LoginWithoutCookies> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("LoginWithoutCookies", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: LoginWithoutCookies) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): LoginWithoutCookies {
		val v = decoder.decodeString()
		return LoginWithoutCookies.entries.first { it.value == v }
	}
}


@Serializable(with = MafileSerializer::class)
enum class Mafile(val value: String) {
	YES("yes"),
	NO("no"),
	NOMATTER("nomatter");
}


internal object MafileSerializer : KSerializer<Mafile> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("Mafile", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: Mafile) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): Mafile {
		val v = decoder.decodeString()
		return Mafile.entries.first { it.value == v }
	}
}


@Serializable(with = ManagingItemOriginSerializer::class)
enum class ManagingItemOrigin(val value: String) {
	BRUTE("brute"),
	PHISHING("phishing"),
	STEALER("stealer"),
	PERSONAL("personal"),
	RESALE("resale"),
	AUTOREG("autoreg"),
	DUMMY("dummy");
}


internal object ManagingItemOriginSerializer : KSerializer<ManagingItemOrigin> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("ManagingItemOrigin", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: ManagingItemOrigin) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): ManagingItemOrigin {
		val v = decoder.decodeString()
		return ManagingItemOrigin.entries.first { it.value == v }
	}
}


@Serializable(with = ManagingType1Serializer::class)
enum class ManagingType1(val value: String) {
	PROFILES("profiles"),
	GAMES("games");
}


internal object ManagingType1Serializer : KSerializer<ManagingType1> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("ManagingType1", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: ManagingType1) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): ManagingType1 {
		val v = decoder.decodeString()
		return ManagingType1.entries.first { it.value == v }
	}
}


@Serializable(with = ManagingType2Serializer::class)
enum class ManagingType2(val value: String) {
	SKINS("skins"),
	PICKAXES("pickaxes"),
	DANCES("dances"),
	GLIDERS("gliders"),
	WEAPONS("weapons"),
	AGENTS("agents"),
	BUDDIES("buddies");
}


internal object ManagingType2Serializer : KSerializer<ManagingType2> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("ManagingType2", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: ManagingType2) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): ManagingType2 {
		val v = decoder.decodeString()
		return ManagingType2.entries.first { it.value == v }
	}
}


@Serializable(with = MmBanSerializer::class)
enum class MmBan(val value: String) {
	YES("yes"),
	NO("no"),
	NOMATTER("nomatter");
}


internal object MmBanSerializer : KSerializer<MmBan> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("MmBan", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: MmBan) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): MmBan {
		val v = decoder.decodeString()
		return MmBan.entries.first { it.value == v }
	}
}


@Serializable(with = NitroSerializer::class)
enum class Nitro(val value: String) {
	YES("yes"),
	NO("no"),
	NOMATTER("nomatter");
}


internal object NitroSerializer : KSerializer<Nitro> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("Nitro", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: Nitro) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): Nitro {
		val v = decoder.decodeString()
		return Nitro.entries.first { it.value == v }
	}
}


@Serializable(with = NitroPeriodSerializer::class)
enum class NitroPeriod(val value: String) {
	DAY("day"),
	MONTH("month"),
	YEAR("year");
}


internal object NitroPeriodSerializer : KSerializer<NitroPeriod> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("NitroPeriod", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: NitroPeriod) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): NitroPeriod {
		val v = decoder.decodeString()
		return NitroPeriod.entries.first { it.value == v }
	}
}


@Serializable(with = NoBansSerializer::class)
enum class NoBans(val value: String) {
	YES("yes"),
	NO("no"),
	NOMATTER("nomatter");
}


internal object NoBansSerializer : KSerializer<NoBans> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("NoBans", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: NoBans) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): NoBans {
		val v = decoder.decodeString()
		return NoBans.entries.first { it.value == v }
	}
}


@Serializable(with = NotEmailProviderSerializer::class)
enum class NotEmailProvider(val value: String) {
	OTHER("other"),
	RAMBLER("rambler"),
	OUTLOOK("outlook"),
	FIRSTMAIL("firstmail"),
	NOTLETTERS("notletters"),
	MAIL_RU("mail_ru");
}


internal object NotEmailProviderSerializer : KSerializer<NotEmailProvider> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("NotEmailProvider", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: NotEmailProvider) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): NotEmailProvider {
		val v = decoder.decodeString()
		return NotEmailProvider.entries.first { it.value == v }
	}
}


@Serializable(with = OrderBySerializer::class)
enum class OrderBy(val value: String) {
	PRICE_TO_UP("price_to_up"),
	PRICE_TO_DOWN("price_to_down"),
	PDATE_TO_DOWN("pdate_to_down"),
	PDATE_TO_UP("pdate_to_up"),
	PDATE_TO_DOWN_UPLOAD("pdate_to_down_upload"),
	PDATE_TO_UP_UPLOAD("pdate_to_up_upload"),
	EDATE_TO_UP("edate_to_up"),
	EDATE_TO_DOWN("edate_to_down"),
	DDATE_TO_UP("ddate_to_up"),
	DDATE_TO_DOWN("ddate_to_down");
}


internal object OrderBySerializer : KSerializer<OrderBy> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("OrderBy", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: OrderBy) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): OrderBy {
		val v = decoder.decodeString()
		return OrderBy.entries.first { it.value == v }
	}
}


@Serializable(with = ParentControlSerializer::class)
enum class ParentControl(val value: String) {
	YES("yes"),
	NO("no"),
	NOMATTER("nomatter");
}


internal object ParentControlSerializer : KSerializer<ParentControl> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("ParentControl", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: ParentControl) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): ParentControl {
		val v = decoder.decodeString()
		return ParentControl.entries.first { it.value == v }
	}
}


@Serializable(with = PasswordSerializer::class)
enum class Password(val value: String) {
	YES("yes"),
	NO("no"),
	NOMATTER("nomatter");
}


internal object PasswordSerializer : KSerializer<Password> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("Password", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: Password) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): Password {
		val v = decoder.decodeString()
		return Password.entries.first { it.value == v }
	}
}


@Serializable(with = PaymentsTypeSerializer::class)
enum class PaymentsType(val value: String) {
	PAID_ITEM("paid_item"),
	SOLD_ITEM("sold_item"),
	WITHDRAWAL_BALANCE("withdrawal_balance"),
	REFILLED_BALANCE("refilled_balance"),
	INTERNAL_PURCHASE("internal_purchase"),
	MONEY_TRANSFER("money_transfer"),
	RECEIVING_MONEY("receiving_money"),
	CLAIM_HOLD("claim_hold"),
	INSURANCE_DEPOSIT("insurance_deposit"),
	PAID_MAIL("paid_mail"),
	CONTEST("contest"),
	INVOICE("invoice"),
	BALANCE_EXCHANGE("balance_exchange");
}


internal object PaymentsTypeSerializer : KSerializer<PaymentsType> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("PaymentsType", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: PaymentsType) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): PaymentsType {
		val v = decoder.decodeString()
		return PaymentsType.entries.first { it.value == v }
	}
}


@Serializable(with = PremiumSerializer::class)
enum class Premium(val value: String) {
	YES("yes"),
	NO("no"),
	NOMATTER("nomatter");
}


internal object PremiumSerializer : KSerializer<Premium> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("Premium", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: Premium) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): Premium {
		val v = decoder.decodeString()
		return Premium.entries.first { it.value == v }
	}
}


@Serializable(with = PremiumExpirationPeriodSerializer::class)
enum class PremiumExpirationPeriod(val value: String) {
	DAY("day"),
	MONTH("month"),
	YEAR("year");
}


internal object PremiumExpirationPeriodSerializer : KSerializer<PremiumExpirationPeriod> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("PremiumExpirationPeriod", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: PremiumExpirationPeriod) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): PremiumExpirationPeriod {
		val v = decoder.decodeString()
		return PremiumExpirationPeriod.entries.first { it.value == v }
	}
}


@Serializable(with = ProfileTypeSerializer::class)
enum class ProfileType(val value: String) {
	MARKET("market"),
	NOMARKET("nomarket");
}


internal object ProfileTypeSerializer : KSerializer<ProfileType> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("ProfileType", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: ProfileType) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): ProfileType {
		val v = decoder.decodeString()
		return ProfileType.entries.first { it.value == v }
	}
}


@Serializable(with = PsnConnectedSerializer::class)
enum class PsnConnected(val value: String) {
	YES("yes"),
	NO("no"),
	NOMATTER("nomatter");
}


internal object PsnConnectedSerializer : KSerializer<PsnConnected> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("PsnConnected", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: PsnConnected) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): PsnConnected {
		val v = decoder.decodeString()
		return PsnConnected.entries.first { it.value == v }
	}
}


@Serializable(with = PsnLinkableSerializer::class)
enum class PsnLinkable(val value: String) {
	YES("yes"),
	NO("no"),
	NOMATTER("nomatter");
}


internal object PsnLinkableSerializer : KSerializer<PsnLinkable> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("PsnLinkable", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: PsnLinkable) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): PsnLinkable {
		val v = decoder.decodeString()
		return PsnLinkable.entries.first { it.value == v }
	}
}


@Serializable(with = PublishingItemOriginSerializer::class)
enum class PublishingItemOrigin(val value: String) {
	BRUTE("brute"),
	PHISHING("phishing"),
	STEALER("stealer"),
	PERSONAL("personal"),
	RESALE("resale"),
	AUTOREG("autoreg"),
	DUMMY("dummy"),
	SELF_REGISTRATION("self_registration");
}


internal object PublishingItemOriginSerializer : KSerializer<PublishingItemOrigin> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("PublishingItemOrigin", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: PublishingItemOrigin) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): PublishingItemOrigin {
		val v = decoder.decodeString()
		return PublishingItemOrigin.entries.first { it.value == v }
	}
}


@Serializable(with = PublishingTypeSerializer::class)
enum class PublishingType(val value: String) {
	SOCIALCLUB("socialclub");
}


internal object PublishingTypeSerializer : KSerializer<PublishingType> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("PublishingType", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: PublishingType) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): PublishingType {
		val v = decoder.decodeString()
		return PublishingType.entries.first { it.value == v }
	}
}


@Serializable(with = PveSerializer::class)
enum class Pve(val value: String) {
	YES("yes"),
	NO("no"),
	NOMATTER("nomatter");
}


internal object PveSerializer : KSerializer<Pve> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("Pve", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: Pve) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): Pve {
		val v = decoder.decodeString()
		return Pve.entries.first { it.value == v }
	}
}


@Serializable(with = R6BanSerializer::class)
enum class R6Ban(val value: String) {
	YES("yes"),
	NO("no"),
	NOMATTER("nomatter");
}


internal object R6BanSerializer : KSerializer<R6Ban> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("R6Ban", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: R6Ban) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): R6Ban {
		val v = decoder.decodeString()
		return R6Ban.entries.first { it.value == v }
	}
}


@Serializable(with = RealIdSerializer::class)
enum class RealId(val value: String) {
	YES("yes"),
	NO("no"),
	NOMATTER("nomatter");
}


internal object RealIdSerializer : KSerializer<RealId> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("RealId", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: RealId) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): RealId {
		val v = decoder.decodeString()
		return RealId.entries.first { it.value == v }
	}
}


@Serializable(with = RegPeriodSerializer::class)
enum class RegPeriod(val value: String) {
	DAY("day"),
	MONTH("month"),
	YEAR("year");
}


internal object RegPeriodSerializer : KSerializer<RegPeriod> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("RegPeriod", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: RegPeriod) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): RegPeriod {
		val v = decoder.decodeString()
		return RegPeriod.entries.first { it.value == v }
	}
}


@Serializable(with = RegionSerializer::class)
enum class Region(val value: String) {
	AF("af"),
	AS("as"),
	CIS("cis"),
	EU("eu"),
	ME("me"),
	OC("oc"),
	US("us");
}


internal object RegionSerializer : KSerializer<Region> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("Region", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: Region) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): Region {
		val v = decoder.decodeString()
		return Region.entries.first { it.value == v }
	}
}


@Serializable(with = RoyalePassSerializer::class)
enum class RoyalePass(val value: String) {
	YES("yes"),
	NO("no"),
	NOMATTER("nomatter");
}


internal object RoyalePassSerializer : KSerializer<RoyalePass> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("RoyalePass", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: RoyalePass) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): RoyalePass {
		val v = decoder.decodeString()
		return RoyalePass.entries.first { it.value == v }
	}
}


@Serializable(with = RtSerializer::class)
enum class Rt(val value: String) {
	YES("yes"),
	NO("no"),
	NOMATTER("nomatter");
}


internal object RtSerializer : KSerializer<Rt> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("Rt", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: Rt) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): Rt {
		val v = decoder.decodeString()
		return Rt.entries.first { it.value == v }
	}
}


@Serializable(with = ShowSerializer::class)
enum class Show(val value: String) {
	ACTIVE("active"),
	PAID("paid"),
	DELETED("deleted"),
	AWAITING("awaiting"),
	CLOSED("closed"),
	DISCOUNT_REQUEST("discount_request"),
	STICKIED("stickied"),
	PRE_ACTIVE("pre_active");
}


internal object ShowSerializer : KSerializer<Show> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("Show", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: Show) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): Show {
		val v = decoder.decodeString()
		return Show.entries.first { it.value == v }
	}
}


@Serializable(with = SideSerializer::class)
enum class Side(val value: String) {
	BEAR("Bear"),
	SAVAGE("Savage");
}


internal object SideSerializer : KSerializer<Side> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("Side", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: Side) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): Side {
		val v = decoder.decodeString()
		return Side.entries.first { it.value == v }
	}
}


@Serializable(with = SpamSerializer::class)
enum class Spam(val value: String) {
	YES("yes"),
	NO("no"),
	NOMATTER("nomatter");
}


internal object SpamSerializer : KSerializer<Spam> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("Spam", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: Spam) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): Spam {
		val v = decoder.decodeString()
		return Spam.entries.first { it.value == v }
	}
}


@Serializable(with = StatusSerializer::class)
enum class Status(val value: String) {
	PAID("paid"),
	NOT_PAID("not_paid");
}


internal object StatusSerializer : KSerializer<Status> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("Status", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: Status) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): Status {
		val v = decoder.decodeString()
		return Status.entries.first { it.value == v }
	}
}


@Serializable(with = SteamConnectedSerializer::class)
enum class SteamConnected(val value: String) {
	YES("yes"),
	NO("no"),
	NOMATTER("nomatter");
}


internal object SteamConnectedSerializer : KSerializer<SteamConnected> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("SteamConnected", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: SteamConnected) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): SteamConnected {
		val v = decoder.decodeString()
		return SteamConnected.entries.first { it.value == v }
	}
}


@Serializable(with = SubscriptionPeriodSerializer::class)
enum class SubscriptionPeriod(val value: String) {
	DAY("day"),
	MONTH("month"),
	YEAR("year");
}


internal object SubscriptionPeriodSerializer : KSerializer<SubscriptionPeriod> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("SubscriptionPeriod", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: SubscriptionPeriod) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): SubscriptionPeriod {
		val v = decoder.decodeString()
		return SubscriptionPeriod.entries.first { it.value == v }
	}
}


@Serializable(with = TelSerializer::class)
enum class Tel(val value: String) {
	YES("yes"),
	NO("no"),
	NOMATTER("nomatter");
}


internal object TelSerializer : KSerializer<Tel> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("Tel", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: Tel) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): Tel {
		val v = decoder.decodeString()
		return Tel.entries.first { it.value == v }
	}
}


@Serializable(with = TempEmailSerializer::class)
enum class TempEmail(val value: String) {
	YES("yes"),
	NO("no"),
	NOMATTER("nomatter");
}


internal object TempEmailSerializer : KSerializer<TempEmail> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("TempEmail", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: TempEmail) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): TempEmail {
		val v = decoder.decodeString()
		return TempEmail.entries.first { it.value == v }
	}
}


@Serializable(with = TradeBanSerializer::class)
enum class TradeBan(val value: String) {
	YES("yes"),
	NO("no"),
	NOMATTER("nomatter");
}


internal object TradeBanSerializer : KSerializer<TradeBan> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("TradeBan", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: TradeBan) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): TradeBan {
		val v = decoder.decodeString()
		return TradeBan.entries.first { it.value == v }
	}
}


@Serializable(with = TradeLimitSerializer::class)
enum class TradeLimit(val value: String) {
	YES("yes"),
	NO("no"),
	NOMATTER("nomatter");
}


internal object TradeLimitSerializer : KSerializer<TradeLimit> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("TradeLimit", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: TradeLimit) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): TradeLimit {
		val v = decoder.decodeString()
		return TradeLimit.entries.first { it.value == v }
	}
}


@Serializable(with = TransactionsSerializer::class)
enum class Transactions(val value: String) {
	YES("yes"),
	NO("no"),
	NOMATTER("nomatter");
}


internal object TransactionsSerializer : KSerializer<Transactions> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("Transactions", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: Transactions) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): Transactions {
		val v = decoder.decodeString()
		return Transactions.entries.first { it.value == v }
	}
}


@Serializable(with = V2faSerializer::class)
enum class V2fa(val value: String) {
	YES("yes"),
	NO("no"),
	NOMATTER("nomatter");
}


internal object V2faSerializer : KSerializer<V2fa> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("V2fa", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: V2fa) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): V2fa {
		val v = decoder.decodeString()
		return V2fa.entries.first { it.value == v }
	}
}


@Serializable(with = VerifiedSerializer::class)
enum class Verified(val value: String) {
	YES("yes"),
	NO("no"),
	NOMATTER("nomatter");
}


internal object VerifiedSerializer : KSerializer<Verified> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("Verified", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: Verified) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): Verified {
		val v = decoder.decodeString()
		return Verified.entries.first { it.value == v }
	}
}


@Serializable(with = VoiceSerializer::class)
enum class Voice(val value: String) {
	YES("yes"),
	NO("no"),
	NOMATTER("nomatter");
}


internal object VoiceSerializer : KSerializer<Voice> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("Voice", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: Voice) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): Voice {
		val v = decoder.decodeString()
		return Voice.entries.first { it.value == v }
	}
}


@Serializable(with = XboxConnectedSerializer::class)
enum class XboxConnected(val value: String) {
	YES("yes"),
	NO("no"),
	NOMATTER("nomatter");
}


internal object XboxConnectedSerializer : KSerializer<XboxConnected> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("XboxConnected", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: XboxConnected) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): XboxConnected {
		val v = decoder.decodeString()
		return XboxConnected.entries.first { it.value == v }
	}
}


@Serializable(with = XboxLinkableSerializer::class)
enum class XboxLinkable(val value: String) {
	YES("yes"),
	NO("no"),
	NOMATTER("nomatter");
}


internal object XboxLinkableSerializer : KSerializer<XboxLinkable> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("XboxLinkable", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: XboxLinkable) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): XboxLinkable {
		val v = decoder.decodeString()
		return XboxLinkable.entries.first { it.value == v }
	}
}


// ─── Component Schemas ────────────────────────────────────────

@Serializable
data class DiscountModel(
	@SerialName("category_id")
	val categoryId: Double = 0.0,
	@SerialName("discount_id")
	val discountId: Double = 0.0,
	@SerialName("discount_percent")
	val discountPercent: Double = 0.0,
	@SerialName("discount_user_id")
	val discountUserId: Double = 0.0,
	@SerialName("max_price")
	val maxPrice: Double = 0.0,
	@SerialName("min_price")
	val minPrice: Double = 0.0,
	@SerialName("user_id")
	val userId: Double = 0.0,
)

@Serializable
data class UserModel(
	@SerialName("active_items_count")
	val activeItemsCount: Double = 0.0,
	@SerialName("activity_visible")
	val activityVisible: Boolean = false,
	val age: Double = 0.0,
	val balance: String = "",
	val balances: List<UserModelBalances> = emptyList(),
	@SerialName("bump_item_period")
	val bumpItemPeriod: Double = 0.0,
	@SerialName("can_edit")
	val canEdit: Boolean = false,
	@SerialName("can_follow")
	val canFollow: Boolean = false,
	@SerialName("can_ignore")
	val canIgnore: Boolean = false,
	@SerialName("can_post_profile")
	val canPostProfile: Boolean = false,
	@SerialName("can_view_profile")
	val canViewProfile: Boolean = false,
	@SerialName("can_view_profile_posts")
	val canViewProfilePosts: Boolean = false,
	@SerialName("can_warn")
	val canWarn: Boolean = false,
	@SerialName("contest_count")
	val contestCount: Double = 0.0,
	@SerialName("conv_welcome_message")
	val convWelcomeMessage: String = "",
	val convertedBalance: Double = 0.0,
	val convertedDeposit: Double = 0.0,
	val convertedHold: Double = 0.0,
	val currency: String = "",
	val currencyPhrase: String = "",
	@SerialName("custom_account_download_format")
	val customAccountDownloadFormat: String = "",
	@SerialName("custom_fields")
	val customFields: UserModelCustomFields = UserModelCustomFields(),
	@SerialName("custom_title")
	val customTitle: String = "",
	val deposit: Double = 0.0,
	val dob: UserModelDob = UserModelDob(),
	@SerialName("feedback_data")
	val feedbackData: JsonElement = JsonNull,
	val hold: String = "",
	val homepage: String = "",
	@SerialName("imap_data")
	val imapData: UserModelImapData = UserModelImapData(),
	@SerialName("is_admin")
	val isAdmin: Boolean = false,
	@SerialName("is_banned")
	val isBanned: Boolean = false,
	@SerialName("is_followed")
	val isFollowed: Boolean = false,
	@SerialName("is_ignored")
	val isIgnored: Boolean = false,
	@SerialName("is_moderator")
	val isModerator: Boolean = false,
	@SerialName("is_staff")
	val isStaff: Boolean = false,
	@SerialName("is_super_admin")
	val isSuperAdmin: Boolean = false,
	@SerialName("joined_date")
	val joinedDate: Double = 0.0,
	@SerialName("last_activity")
	val lastActivity: Double = 0.0,
	@SerialName("like2_count")
	val like2Count: Double = 0.0,
	@SerialName("like_count")
	val likeCount: Double = 0.0,
	val location: String = "",
	@SerialName("market_custom_title")
	val marketCustomTitle: String = "",
	@SerialName("max_discount_percent")
	val maxDiscountPercent: Double = 0.0,
	@SerialName("message_count")
	val messageCount: Double = 0.0,
	@SerialName("paid_mail_left")
	val paidMailLeft: Double = 0.0,
	@SerialName("public_tags")
	val publicTags: List<UserModelPublicTags> = emptyList(),
	@SerialName("register_date")
	val registerDate: Double = 0.0,
	val rendered: UserModelRendered = UserModelRendered(),
	@SerialName("restore_count")
	val restoreCount: Double = 0.0,
	@SerialName("restore_data")
	val restoreData: JsonElement = JsonNull,
	@SerialName("short_link")
	val shortLink: String = "",
	@SerialName("sold_items_count")
	val soldItemsCount: Double = 0.0,
	val tags: List<UserModelTags> = emptyList(),
	@SerialName("telegram_client")
	val telegramClient: UserModelTelegramClient = UserModelTelegramClient(),
	@SerialName("trophy_points")
	val trophyPoints: Double = 0.0,
	@SerialName("user_allow_ask_discount")
	val userAllowAskDiscount: Boolean = false,
	@SerialName("user_id")
	val userId: Double = 0.0,
	@SerialName("user_title")
	val userTitle: String = "",
	val username: String = "",
	@SerialName("view_url")
	val viewUrl: String = "",
	val visible: Boolean = false,
	@SerialName("warning_points")
	val warningPoints: Double = 0.0,
)

@Serializable
data class UserModelBalances(
	val balance: String = "",
	@SerialName("balance_id")
	val balanceId: Double = 0.0,
	val convertedBalance: Double = 0.0,
	@SerialName("custom_title")
	val customTitle: JsonElement = JsonNull,
	val fullTitle: String = "",
	@SerialName("merchant_id")
	val merchantId: Double = 0.0,
	val title: String = "",
	val type: String = "",
	@SerialName("user_id")
	val userId: Double = 0.0,
)

@Serializable
data class UserModelCustomFields(
	val _4: String = "",
	val allowSelfUnban: List<JsonElement> = emptyList(),
	@SerialName("ban_reason")
	val banReason: String = "",
	val discord: String = "",
	val github: String = "",
	val jabber: String = "",
	val lztAwardUserTrophy: String = "",
	val lztLikesIncreasing: String = "",
	val lztLikesZeroing: String = "",
	val lztSympathyIncreasing: String = "",
	val lztSympathyZeroing: String = "",
	val lztUnbanAmount: String = "",
	val maecenasValue: String = "",
	val scamURL: String = "",
	val steam: String = "",
	val telegram: String = "",
	val vk: String = "",
	val favoritePorn: String = "",
	val favoriteVape: String = "",
	val favoriteAnime: String = "",
	val matrix: String = "",
)

@Serializable
data class UserModelDob(
	val year: Double = 0.0,
	val month: Double = 0.0,
	val day: Double = 0.0,
)

@Serializable
data class UserModelImapDataDomainZone(
	val domain: String = "",
	@SerialName("imap_server")
	val imapServer: String = "",
	val port: Double = 0.0,
	val secure: Boolean = false,
)

@Serializable
data class UserModelImapData(
	@SerialName("domain.zone")
	val domainZone: UserModelImapDataDomainZone = UserModelImapDataDomainZone(),
)

@Serializable
data class UserModelPublicTags(
	@SerialName("background_color")
	val backgroundColor: String = "",
	@SerialName("tag_id")
	val tagId: Double = 0.0,
	val title: String = "",
)

@Serializable
data class UserModelRenderedAvatars(
	val l: String = "",
	val m: String = "",
	val s: String = "",
)

@Serializable
data class UserModelRenderedBackgrounds(
	val l: String = "",
	val m: String = "",
)

@Serializable
data class UserModelRendered(
	val username: String = "",
	val avatars: UserModelRenderedAvatars = UserModelRenderedAvatars(),
	val backgrounds: UserModelRenderedBackgrounds = UserModelRenderedBackgrounds(),
	val link: String = "",
)

@Serializable
data class UserModelTags(
	@SerialName("tag_id")
	val tagId: Double = 0.0,
	val title: String = "",
	val isDefault: Boolean = false,
	val forOwnedAccountsOnly: Boolean = false,
	val bc: String = "",
)

@Serializable
data class UserModelTelegramClient(
	@SerialName("telegram_api_id")
	val telegramApiId: String = "",
	@SerialName("telegram_api_hash")
	val telegramApiHash: String = "",
	@SerialName("telegram_device_model")
	val telegramDeviceModel: String = "",
	@SerialName("telegram_system_version")
	val telegramSystemVersion: String = "",
	@SerialName("telegram_app_version")
	val telegramAppVersion: String = "",
	@SerialName("telegram_system_lang_code")
	val telegramSystemLangCode: String = "",
	@SerialName("telegram_lang_code")
	val telegramLangCode: String = "",
	@SerialName("telegram_lang_pack")
	val telegramLangPack: String = "",
)

@Serializable
data class BalanceModel(
	val balance: String = "",
	@SerialName("balance_id")
	val balanceId: Double = 0.0,
	@SerialName("custom_title")
	val customTitle: JsonElement = JsonNull,
	val fullTitle: String = "",
	@SerialName("merchant_id")
	val merchantId: Double = 0.0,
	val title: String = "",
	val type: String = "",
	@SerialName("user_id")
	val userId: Double = 0.0,
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
	val dota2Mmr: Double? = null,
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
	val genshinCurrency: Double? = null,
	@SerialName("honkai_currency")
	val honkaiCurrency: Double? = null,
	@SerialName("zenless_currency")
	val zenlessCurrency: Double? = null,
	val password: String? = null,
	val telegramClient: String? = null,
	val telegramJson: String? = null,
	val checkChannels: Boolean? = null,
	val checkSpam: Boolean? = null,
	val checkHypixelBan: Boolean? = null,
)

@Serializable
data class ConfirmationCodeModel(
	val item: ItemModel = ItemModel(),
	val codeData: ConfirmationCodeModelCodeData = ConfirmationCodeModelCodeData(),
)

@Serializable
data class ConfirmationCodeModelCodeData(
	val code: String = "",
	val date: Double = 0.0,
	val textPlain: String = "",
)

@Serializable
data class ItemListModel(
	val items: List<ItemFromListModel> = emptyList(),
	val totalItems: Double = 0.0,
	val totalItemsPrice: JsonElement = JsonNull,
	val hasNextPage: Boolean = false,
	val perPage: Double = 0.0,
	val page: Double = 0.0,
	val searchUrl: String = "",
	val stickyItems: List<ItemFromListModel> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ItemFromListModel(
	@SerialName("item_id")
	val itemId: Double? = null,
	@SerialName("item_state")
	val itemState: String? = null,
	@SerialName("category_id")
	val categoryId: Double? = null,
	@SerialName("published_date")
	val publishedDate: Double? = null,
	val title: String? = null,
	val description: String? = null,
	val price: Double? = null,
	@SerialName("update_stat_date")
	val updateStatDate: Double? = null,
	@SerialName("refreshed_date")
	val refreshedDate: Double? = null,
	@SerialName("view_count")
	val viewCount: Double? = null,
	@SerialName("is_sticky")
	val isSticky: Double? = null,
	@SerialName("item_origin")
	val itemOrigin: String? = null,
	@SerialName("extended_guarantee")
	val extendedGuarantee: Double? = null,
	val nsb: Double? = null,
	@SerialName("allow_ask_discount")
	val allowAskDiscount: Double? = null,
	@SerialName("title_en")
	val titleEn: String? = null,
	@SerialName("description_en")
	val descriptionEn: String? = null,
	@SerialName("item_domain")
	val itemDomain: String? = null,
	@SerialName("resale_item_origin")
	val resaleItemOrigin: String? = null,
	val isIgnored: Double? = null,
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
	val rubPrice: Double? = null,
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
	val userId: Double? = null,
	@SerialName("sold_items_count")
	val soldItemsCount: Double? = null,
	@SerialName("active_item_count")
	val activeItemCount: Double? = null,
	@SerialName("restore_data")
	val restoreData: String? = null,
	val username: String? = null,
	@SerialName("avatar_date")
	val avatarDate: Double? = null,
	@SerialName("is_banned")
	val isBanned: Double? = null,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Double? = null,
	@SerialName("restore_percents")
	val restorePercents: Double? = null,
)

@Serializable
data class ItemModel(
	@SerialName("item_id")
	val itemId: Double = 0.0,
	@SerialName("item_state")
	val itemState: String = "",
	@SerialName("category_id")
	val categoryId: Double = 0.0,
	@SerialName("published_date")
	val publishedDate: Double = 0.0,
	val title: String = "",
	val description: String = "",
	val price: Double = 0.0,
	@SerialName("update_stat_date")
	val updateStatDate: Double = 0.0,
	@SerialName("refreshed_date")
	val refreshedDate: Double = 0.0,
	@SerialName("edit_date")
	val editDate: Double = 0.0,
	@SerialName("pending_deletion_date")
	val pendingDeletionDate: Double = 0.0,
	val login: String = "",
	@SerialName("temp_email")
	val tempEmail: String = "",
	@SerialName("view_count")
	val viewCount: Double = 0.0,
	@SerialName("is_sticky")
	val isSticky: Double = 0.0,
	val information: String = "",
	@SerialName("item_origin")
	val itemOrigin: String = "",
	@SerialName("extended_guarantee")
	val extendedGuarantee: Double = 0.0,
	val nsb: Double = 0.0,
	@SerialName("allow_ask_discount")
	val allowAskDiscount: Double = 0.0,
	@SerialName("title_en")
	val titleEn: String = "",
	@SerialName("description_en")
	val descriptionEn: String = "",
	@SerialName("information_en")
	val informationEn: String = "",
	@SerialName("email_type")
	val emailType: String = "",
	@SerialName("email_provider")
	val emailProvider: String = "",
	@SerialName("item_domain")
	val itemDomain: String = "",
	@SerialName("resale_item_origin")
	val resaleItemOrigin: String = "",
	@SerialName("note_text")
	val noteText: String = "",
	@SerialName("content_type")
	val contentType: JsonElement = JsonNull,
	@SerialName("content_id")
	val contentId: JsonElement = JsonNull,
	@SerialName("delete_date")
	val deleteDate: Double = 0.0,
	@SerialName("delete_user_id")
	val deleteUserId: Double = 0.0,
	@SerialName("delete_username")
	val deleteUsername: String = "",
	@SerialName("delete_reason")
	val deleteReason: String = "",
	@SerialName("user_allow_ask_discount")
	val userAllowAskDiscount: Double = 0.0,
	@SerialName("max_discount_percent")
	val maxDiscountPercent: Double = 0.0,
	@SerialName("market_custom_title")
	val marketCustomTitle: String = "",
	@SerialName("feedback_data")
	val feedbackData: String = "",
	@SerialName("buyer_display_icon_group_id")
	val buyerDisplayIconGroupId: Double = 0.0,
	@SerialName("buyer_uniq_banner")
	val buyerUniqBanner: String = "",
	@SerialName("buyer_avatar_date")
	val buyerAvatarDate: Double = 0.0,
	@SerialName("buyer_user_group_id")
	val buyerUserGroupId: Double = 0.0,
	@SerialName("is_fave")
	val isFave: JsonElement = JsonNull,
	@SerialName("in_cart")
	val inCart: JsonElement = JsonNull,
	@SerialName("cart_price")
	val cartPrice: JsonElement = JsonNull,
	val canResellItem: Boolean = false,
	val priceWithSellerFee: Double = 0.0,
	val guarantee: ItemModelGuarantee = ItemModelGuarantee(),
	val canViewLoginData: Boolean = false,
	val canUpdateItemStats: Boolean = false,
	val canReportItem: Boolean = false,
	val canViewItemViews: Boolean = false,
	val loginData: ItemModelLoginData = ItemModelLoginData(),
	val canViewEmailLoginData: Boolean = false,
	val copyFormatData: ItemModelCopyFormatData = ItemModelCopyFormatData(),
	val showGetEmailCodeButton: Boolean = false,
	val getEmailCodeDisplayLogin: JsonElement = JsonNull,
	val buyer: ItemModelBuyer = ItemModelBuyer(),
	val isPersonalAccount: Boolean = false,
	@SerialName("rub_price")
	val rubPrice: Double = 0.0,
	@SerialName("price_currency")
	val priceCurrency: String = "",
	val priceWithSellerFeeLabel: String = "",
	val canValidateAccount: Boolean = false,
	val canResellItemAfterPurchase: Boolean = false,
	val isSmallExf: Boolean = false,
	@SerialName("account_last_activity")
	val accountLastActivity: Double = 0.0,
	val canViewAccountLink: Boolean = false,
	val accountLinks: List<ItemModelAccountLinks> = emptyList(),
	val accountLink: String = "",
	val imagePreviewLinks: List<String> = emptyList(),
	val canChangePassword: Boolean = false,
	val canChangeEmailPassword: Boolean = false,
	val uniqueKeyExists: Boolean = false,
	val itemOriginPhrase: String = "",
	val visitorIsAuthor: Boolean = false,
	val canAskDiscount: Boolean = false,
	val tags: JsonElement = JsonNull,
	val customFields: ItemModelCustomFields = ItemModelCustomFields(),
	val externalAuth: List<JsonElement> = emptyList(),
	val isTrusted: Boolean = false,
	val isBirthdayToday: Boolean = false,
	val isIgnored: Boolean = false,
	val deposit: Double = 0.0,
	val extraPrices: List<ItemModelExtraPrices> = emptyList(),
	val canViewAccountLoginAndTempEmail: Boolean = false,
	val bumpSettings: ItemModelBumpSettings = ItemModelBumpSettings(),
	val canCheckGuarantee: Boolean = false,
	val canShareItem: Boolean = false,
	val canCheckAiPrice: Boolean = false,
	val aiPrice: Double = 0.0,
	val aiPriceCheckDate: Double = 0.0,
	val needToRequireVideoToViewLoginData: Boolean = false,
	val canCheckAutoBuyPrice: Boolean = false,
	val autoBuyPrice: Double = 0.0,
	val autoBuyPriceCheckDate: Double = 0.0,
	val descriptionHtml: String = "",
	val descriptionEnHtml: String = "",
	val descriptionPlain: String = "",
	val descriptionEnPlain: String = "",
	val seller: ItemModelSeller = ItemModelSeller(),
)

@Serializable
data class ItemModelGuarantee(
	val duration: Double = 0.0,
	val `class`: String = "",
	val durationPhrase: String = "",
	val endDate: Double = 0.0,
	val active: Boolean = false,
	val cancelled: Boolean = false,
	val remainingTime: Double = 0.0,
	val remainingTimePhrase: String = "",
	val cancelledReason: String = "",
	val cancelledReasonPhrase: String = "",
)

@Serializable
data class ItemModelLoginData(
	val raw: String = "",
	val encodedRaw: String = "",
	val login: String = "",
	val password: String = "",
	val encodedPassword: String = "",
	val oldPassword: String = "",
	val encodedOldPassword: JsonElement = JsonNull,
)

@Serializable
data class ItemModelCopyFormatData(
	@SerialName("title_link")
	val titleLink: String = "",
	@SerialName("login_data")
	val loginData: String = "",
	val full: String = "",
)

@Serializable
data class ItemModelBuyer(
	@SerialName("user_id")
	val userId: Double = 0.0,
	@SerialName("operation_date")
	val operationDate: Double = 0.0,
	val visitorIsBuyer: Boolean = false,
	val username: String = "",
	@SerialName("is_banned")
	val isBanned: Double = 0.0,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Double = 0.0,
	@SerialName("display_icon_group_id")
	val displayIconGroupId: Double = 0.0,
	@SerialName("uniq_username_css")
	val uniqUsernameCss: String = "",
	@SerialName("uniq_banner")
	val uniqBanner: String = "",
	@SerialName("user_group_id")
	val userGroupId: Double = 0.0,
)

@Serializable
data class ItemModelAccountLinks(
	val link: String = "",
	val text: String = "",
	val iconClass: String = "",
)

@Serializable
data class ItemModelCustomFields(
	val _4: String = "",
	val allowSelfUnban: List<JsonElement> = emptyList(),
	@SerialName("ban_reason")
	val banReason: String = "",
	val discord: String = "",
	val github: String = "",
	val jabber: String = "",
	val lztUnbanAmount: String = "",
	val steam: String = "",
	val telegram: String = "",
	val vk: String = "",
)

@Serializable
data class ItemModelExtraPrices(
	val currency: String = "",
	val price: String = "",
	val priceValue: Double = 0.0,
)

@Serializable
data class ItemModelBumpSettings(
	val canBumpItem: Boolean = false,
	val canBumpItemGlobally: Boolean = false,
	val shortErrorPhrase: JsonElement = JsonNull,
	val nextAllowedBumpDate: JsonElement = JsonNull,
	val errorPhrase: JsonElement = JsonNull,
)

@Serializable
data class ItemModelSellerContacts(
	@SerialName("ban_reason")
	val banReason: String = "",
	val telegram: String = "",
)

@Serializable
data class ItemModelSeller(
	@SerialName("user_id")
	val userId: Double = 0.0,
	val username: String = "",
	@SerialName("avatar_date")
	val avatarDate: Double = 0.0,
	@SerialName("is_banned")
	val isBanned: Double = 0.0,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Double = 0.0,
	@SerialName("joined_date")
	val joinedDate: Double = 0.0,
	@SerialName("sold_items_count")
	val soldItemsCount: Double = 0.0,
	@SerialName("active_items_count")
	val activeItemsCount: Double = 0.0,
	@SerialName("restore_data")
	val restoreData: String = "",
	@SerialName("effective_last_activity")
	val effectiveLastActivity: Double = 0.0,
	@SerialName("restore_percents")
	val restorePercents: JsonElement = JsonNull,
	val isOnline: Boolean = false,
	val contacts: ItemModelSellerContacts = ItemModelSellerContacts(),
)

@Serializable
data class InvoiceModel(
	@SerialName("additional_data")
	val additionalData: String = "",
	val amount: Double = 0.0,
	val comment: String = "",
	@SerialName("expires_at")
	val expiresAt: Double = 0.0,
	@SerialName("invoice_date")
	val invoiceDate: Double = 0.0,
	@SerialName("invoice_id")
	val invoiceId: Double = 0.0,
	@SerialName("is_test")
	val isTest: Boolean = false,
	@SerialName("merchant_id")
	val merchantId: Double = 0.0,
	@SerialName("paid_date")
	val paidDate: Double = 0.0,
	@SerialName("payer_user_id")
	val payerUserId: Double = 0.0,
	@SerialName("payment_id")
	val paymentId: String = "",
	@SerialName("resend_attempts")
	val resendAttempts: Double = 0.0,
	val status: String = "",
	val url: String = "",
	@SerialName("url_callback")
	val urlCallback: String = "",
	@SerialName("url_success")
	val urlSuccess: String = "",
	@SerialName("user_id")
	val userId: Double = 0.0,
)

@Serializable
data class RespSystemInfo(
	@SerialName("visitor_id")
	val visitorId: Double = 0.0,
	val time: Double = 0.0,
	@SerialName("log_id")
	val logId: Double = 0.0,
)

// ─── CategoryApi Types ────────────────────────────────────────

@Serializable
data class CategoryAllParams(
    /** The number of the page to display results from. */
	val page: Long? = null,
    /** Minimal price of account (Inclusive). */
	val pmin: Long? = null,
    /** Maximum price of account (Inclusive). */
	val pmax: Long? = null,
    /** The word or words contained in the account title. */
	val title: String? = null,
    /** Order by. */
	@SerialName("order_by")
	val orderBy: OrderBy? = null,
    /** List of tag ids (Tag list is available via GET /me). */
	@SerialName("tag_id[]")
	val tagId: List<Long>? = null,
    /** List of tag ids that won't be included (Tag list is available via GET /me). */
	@SerialName("not_tag_id[]")
	val notTagId: List<Long>? = null,
    /** List of tag ids (Tag list is available via GET /me). */
	@SerialName("public_tag_id[]")
	val publicTagId: List<Long>? = null,
    /** List of tag ids that won't be included (Tag list is available via GET /me). */
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Long>? = null,
    /** List of account origins. */
	@SerialName("origin[]")
	val origin: JsonElement? = null,
    /** List of account origins that won't be included. */
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
    /** Search accounts of user. */
	@SerialName("user_id")
	val userId: Long? = null,
    /** Not sold before. */
	val nsb: Boolean? = null,
    /** Sold before. */
	val sb: Boolean? = null,
    /** Not sold by me before. */
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
    /** Sold by me before. */
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
    /** Currency in which the cost of the account will be searched. */
	val currency: Currency? = null,
    /** Has email login data. */
	@SerialName("email_login_data")
	val emailLoginData: Boolean? = null,
    /** Email provider. */
	@SerialName("email_provider[]")
	val emailProvider: JsonElement? = null,
    /** Email provider. */
	@SerialName("not_email_provider[]")
	val notEmailProvider: NotEmailProvider? = null,
    /** Parse same item ids. */
	@SerialName("parse_same_item_ids")
	val parseSameItemIds: Boolean? = null,
)

@Serializable
data class CategoryAllResponse(
	val items: List<ItemFromListModel> = emptyList(),
	val totalItems: Double = 0.0,
	val totalItemsPrice: JsonElement = JsonNull,
	val hasNextPage: Boolean = false,
	val perPage: Double = 0.0,
	val page: Double = 0.0,
	val searchUrl: String = "",
	val stickyItems: List<ItemFromListModel> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class CategorySteamParams(
    /** The number of the page to display results from. */
	val page: Long? = null,
    /** Minimal price of account (Inclusive). */
	val pmin: Long? = null,
    /** Maximum price of account (Inclusive). */
	val pmax: Long? = null,
    /** The word or words contained in the account title. */
	val title: String? = null,
    /** Order by. */
	@SerialName("order_by")
	val orderBy: OrderBy? = null,
    /** List of tag ids (Tag list is available via GET /me). */
	@SerialName("tag_id[]")
	val tagId: List<Long>? = null,
    /** List of tag ids that won't be included (Tag list is available via GET /me). */
	@SerialName("not_tag_id[]")
	val notTagId: List<Long>? = null,
    /** List of tag ids (Tag list is available via GET /me). */
	@SerialName("public_tag_id[]")
	val publicTagId: List<Long>? = null,
    /** List of tag ids that won't be included (Tag list is available via GET /me). */
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Long>? = null,
    /** List of account origins. */
	@SerialName("origin[]")
	val origin: JsonElement? = null,
    /** List of account origins that won't be included. */
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
    /** Search accounts of user. */
	@SerialName("user_id")
	val userId: Long? = null,
    /** Not sold before. */
	val nsb: Boolean? = null,
    /** Sold before. */
	val sb: Boolean? = null,
    /** Not sold by me before. */
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
    /** Sold by me before. */
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
    /** Currency in which the cost of the account will be searched. */
	val currency: Currency? = null,
    /** Has email login data. */
	@SerialName("email_login_data")
	val emailLoginData: Boolean? = null,
    /** Email type. */
	@SerialName("email_type[]")
	val emailType: JsonElement? = null,
    /** Email provider. */
	@SerialName("email_provider[]")
	val emailProvider: JsonElement? = null,
    /** Email provider. */
	@SerialName("not_email_provider[]")
	val notEmailProvider: NotEmailProvider? = null,
    /** Parse same item ids. */
	@SerialName("parse_same_item_ids")
	val parseSameItemIds: Boolean? = null,
    /** Domain of native/autoreg email. */
	@SerialName("item_domain")
	val itemDomain: String? = null,
    /** List of games. */
	@SerialName("game[]")
	val game: List<Long>? = null,
    /** List of minimum hours played by game. */
	@SerialName("hours_played")
	val hoursPlayed: Map<String, Long>? = null,
    /** List of maximum hours played by game. */
	@SerialName("hours_played_max")
	val hoursPlayedMax: Map<String, Long>? = null,
    /** Guarantee type. */
	val eg: CategoryEg2? = null,
    /** List of VAC bans by game. */
	@SerialName("vac[]")
	val vac: List<Long>? = null,
    /** Don't check game existence while checking for vac. */
	@SerialName("vac_skip_game_check")
	val vacSkipGameCheck: Boolean? = null,
    /** Has community ban.. Default: no */
	val rt: Rt = Rt.NO,
    /** Has lifetime trade ban. */
	@SerialName("trade_ban")
	val tradeBan: TradeBan? = null,
    /** Has temporary trade limit. */
	@SerialName("trade_limit")
	val tradeLimit: TradeLimit? = null,
    /** Number of days the account has been offline. */
	val daybreak: Long? = null,
    /** Has 5 $ limit. */
	val limit: Limit? = null,
    /** Has .mafile (Steam Guard Authenticator). */
	val mafile: Mafile? = null,
    /** How old is the account. */
	val reg: Long? = null,
    /** In what notation is time measured. */
	@SerialName("reg_period")
	val regPeriod: RegPeriod? = null,
    /** Minimum level. */
	val lmin: Long? = null,
    /** Maximum level. */
	val lmax: Long? = null,
    /** Minimum rank in CS2 Matchmaking. */
	val rmin: Long? = null,
    /** Maximum rank in CS2 Matchmaking. */
	val rmax: Long? = null,
    /** Minimum rank in CS2 Wingman. */
	@SerialName("wingman_rmin")
	val wingmanRmin: Long? = null,
    /** Maximum rank in CS2 Wingman. */
	@SerialName("wingman_rmax")
	val wingmanRmax: Long? = null,
    /** Has no VAC ban. */
	@SerialName("no_vac")
	val noVac: Boolean? = null,
    /** Has CS2 Matchmaking ban. */
	@SerialName("mm_ban")
	val mmBan: MmBan? = null,
    /** Minimum balance. */
	@SerialName("balance_min")
	val balanceMin: Long? = null,
    /** Maximum balance. */
	@SerialName("balance_max")
	val balanceMax: Long? = null,
    /** Game ID to check inventory price. */
	@SerialName("inv_game")
	val invGame: Long? = null,
    /** Minimum inventory price for game. */
	@SerialName("inv_min")
	val invMin: Double? = null,
    /** Maximum inventory price for game. */
	@SerialName("inv_max")
	val invMax: Double? = null,
    /** Minimum number of friends. */
	@SerialName("friends_min")
	val friendsMin: Long? = null,
    /** Maximum number of friends. */
	@SerialName("friends_max")
	val friendsMax: Long? = null,
    /** Minimum number of games. */
	val gmin: Long? = null,
    /** Maximum number of games. */
	val gmax: Long? = null,
    /** Minimum number of wins. */
	@SerialName("win_count_min")
	val winCountMin: Long? = null,
    /** Maximum number of wins. */
	@SerialName("win_count_max")
	val winCountMax: Long? = null,
    /** List of medal IDs. */
	@SerialName("medal_id[]")
	val medalId: List<Long>? = null,
    /** Search for medals using "OR" instead of "AND". */
	@SerialName("medal_operator_or")
	val medalOperatorOr: Boolean? = null,
    /** Minimum number of medals. */
	@SerialName("medal_min")
	val medalMin: Long? = null,
    /** Maximum number of medals. */
	@SerialName("medal_max")
	val medalMax: Long? = null,
    /** List of gifts. */
	@SerialName("gift[]")
	val gift: JsonElement? = null,
    /** Minimum number of gifts. */
	@SerialName("gift_min")
	val giftMin: Long? = null,
    /** Maximum number of gifts. */
	@SerialName("gift_max")
	val giftMax: Long? = null,
    /** Minimum number of recently played hours. */
	@SerialName("recently_hours_min")
	val recentlyHoursMin: Long? = null,
    /** Maximum number of recently played hours. */
	@SerialName("recently_hours_max")
	val recentlyHoursMax: Long? = null,
    /** List of allowed countries. */
	@SerialName("country[]")
	val country: List<String>? = null,
    /** List of disallowed countries. */
	@SerialName("not_country[]")
	val notCountry: List<String>? = null,
    /** Minimum CS2 rank. */
	@SerialName("cs2_profile_rank_min")
	val cs2ProfileRankMin: Long? = null,
    /** Maximum CS2 rank. */
	@SerialName("cs2_profile_rank_max")
	val cs2ProfileRankMax: Long? = null,
    /** Minimum number of Dota 2 MMR. */
	@SerialName("solommr_min")
	val solommrMin: Long? = null,
    /** Maximum number of Dota 2 MMR. */
	@SerialName("solommr_max")
	val solommrMax: Long? = null,
    /** Minimum number of Dota 2 games. */
	@SerialName("d2_game_count_min")
	val d2GameCountMin: Long? = null,
    /** Maximum number of Dota 2 games. */
	@SerialName("d2_game_count_max")
	val d2GameCountMax: Long? = null,
    /** Minimum number of Dota 2 wins. */
	@SerialName("d2_win_count_min")
	val d2WinCountMin: Long? = null,
    /** Maximum number of Dota 2 wins. */
	@SerialName("d2_win_count_max")
	val d2WinCountMax: Long? = null,
    /** Minimum number of Dota 2 behavior. */
	@SerialName("d2_behavior_min")
	val d2BehaviorMin: Long? = null,
    /** Maximum number of Dota 2 behavior. */
	@SerialName("d2_behavior_max")
	val d2BehaviorMax: Long? = null,
    /** Minimum FACEIT level. */
	@SerialName("faceit_lvl_min")
	val faceitLvlMin: Long? = null,
    /** Maximum FACEIT level. */
	@SerialName("faceit_lvl_max")
	val faceitLvlMax: Long? = null,
    /** Minimum number of Steam points. */
	@SerialName("points_min")
	val pointsMin: Long? = null,
    /** Maximum number of Steam points. */
	@SerialName("points_max")
	val pointsMax: Long? = null,
    /** Minimum number of relevant games. */
	@SerialName("relevant_gmin")
	val relevantGmin: Long? = null,
    /** Maximum number of relevant games. */
	@SerialName("relevant_gmax")
	val relevantGmax: Long? = null,
    /** How old is last transaction. */
	@SerialName("last_trans_date")
	val lastTransDate: Long? = null,
    /** In what notation is time measured. */
	@SerialName("last_trans_date_period")
	val lastTransDatePeriod: LastTransDatePeriod? = null,
    /** How new is last transaction. */
	@SerialName("last_trans_date_later")
	val lastTransDateLater: Long? = null,
    /** In what notation is time measured. */
	@SerialName("last_trans_date_period_later")
	val lastTransDatePeriodLater: LastTransDatePeriodLater? = null,
    /** Has no transactions. */
	@SerialName("no_trans")
	val noTrans: Boolean? = null,
    /** Has transactions. */
	val trans: Boolean? = null,
    /** Minimum amount spent on gifts. */
	@SerialName("gifts_purchase_min")
	val giftsPurchaseMin: Double? = null,
    /** Maximum amount spent on gifts. */
	@SerialName("gifts_purchase_max")
	val giftsPurchaseMax: Double? = null,
    /** Minimum amount of refunds. */
	@SerialName("refunds_purchase_min")
	val refundsPurchaseMin: Double? = null,
    /** Minimum amount of refunds. */
	@SerialName("refunds_purchase_max")
	val refundsPurchaseMax: Double? = null,
    /** Minimum spend amount on in-game purchases. */
	@SerialName("ingame_purchase_min")
	val ingamePurchaseMin: Double? = null,
    /** Maximum spend amount on in-game purchases. */
	@SerialName("ingame_purchase_max")
	val ingamePurchaseMax: Double? = null,
    /** Minimum spend amount on all purchases. */
	@SerialName("games_purchase_min")
	val gamesPurchaseMin: Double? = null,
    /** Maximum spend amount on all purchases. */
	@SerialName("games_purchase_max")
	val gamesPurchaseMax: Double? = null,
    /** Minimum spend amount on all purchases. */
	@SerialName("purchase_min")
	val purchaseMin: Double? = null,
    /** Maximum spend amount on all purchases. */
	@SerialName("purchase_max")
	val purchaseMax: Double? = null,
    /** Has activated keys. */
	@SerialName("has_activated_keys")
	val hasActivatedKeys: HasActivatedKeys? = null,
    /** Minimum Premier ELO in CS2. */
	@SerialName("elo_min")
	val eloMin: Long? = null,
    /** Maximum Premier ELO in CS2. */
	@SerialName("elo_max")
	val eloMax: Long? = null,
    /** Map for rank in CS2. */
	@SerialName("cs2_map_rank")
	val cs2MapRank: Cs2MapRank? = null,
    /** Minimum rank in CS2 on a certain map. */
	@SerialName("cs2_map_rmin")
	val cs2MapRmin: Long? = null,
    /** Maximum rank in CS2 on a certain map. */
	@SerialName("cs2_map_rmax")
	val cs2MapRmax: Long? = null,
    /** Has FACEIT account. */
	@SerialName("has_faceit")
	val hasFaceit: HasFaceit? = null,
    /** Minimum FACEIT level. */
	@SerialName("faceit_csgo_lvl_min")
	val faceitCsgoLvlMin: Long? = null,
    /** Maximum FACEIT level. */
	@SerialName("faceit_csgo_lvl_max")
	val faceitCsgoLvlMax: Long? = null,
    /** Minimum number of Rust deaths */
	@SerialName("rust_deaths_min")
	val rustDeathsMin: Long? = null,
    /** Maximum number of Rust deaths */
	@SerialName("rust_deaths_max")
	val rustDeathsMax: Long? = null,
    /** Minimum number of Rust kills */
	@SerialName("rust_kills_min")
	val rustKillsMin: Long? = null,
    /** Maximum number of Rust kills */
	@SerialName("rust_kills_max")
	val rustKillsMax: Long? = null,
    /** How old is last match of Dota 2. */
	@SerialName("d2_last_match_date")
	val d2LastMatchDate: Long? = null,
    /** In what notation is time measured. */
	@SerialName("d2_last_match_date_period")
	val d2LastMatchDatePeriod: D2LastMatchDatePeriod? = null,
    /** Minimum number of available to collect trading cards. */
	@SerialName("cards_min")
	val cardsMin: Long? = null,
    /** Maximum number of available to collect trading cards. */
	@SerialName("cards_max")
	val cardsMax: Long? = null,
    /** Minimum number of available games with available to collect trading cards. */
	@SerialName("cards_games_min")
	val cardsGamesMin: Long? = null,
    /** Maximum number of available games with available to collect trading cards. */
	@SerialName("cards_games_max")
	val cardsGamesMax: Long? = null,
    /** Ignore inventory value if game has VAC ban. */
	@SerialName("skip_vac_inv")
	val skipVacInv: Boolean? = null,
)

@Serializable
data class CategorySteamResponse(
	val items: List<CategorySteamResponseItems> = emptyList(),
	val totalItems: Double = 0.0,
	val totalItemsPrice: JsonElement = JsonNull,
	val hasNextPage: Boolean = false,
	val perPage: Double = 0.0,
	val page: Double = 0.0,
	val wasCached: Boolean = false,
	val cacheTTL: Double = 0.0,
	val lastModified: Double = 0.0,
	val serverTime: Double = 0.0,
	val searchUrl: String = "",
	val stickyItems: List<JsonElement> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class CategorySteamResponseItemsSteamFullGames(
	val list: JsonElement = JsonNull,
	val total: Double = 0.0,
)

@Serializable
data class CategorySteamResponseItemsGuarantee(
	val duration: Double = 0.0,
	val `class`: String = "",
	val durationPhrase: String = "",
	val endDate: JsonElement = JsonNull,
	val active: JsonElement = JsonNull,
	val cancelled: JsonElement = JsonNull,
	val remainingTime: JsonElement = JsonNull,
)

@Serializable
data class CategorySteamResponseItemsBumpSettings(
	val canBumpItem: Boolean = false,
	val canBumpItemGlobally: Boolean = false,
	val shortErrorPhrase: JsonElement = JsonNull,
	val errorPhrase: JsonElement = JsonNull,
)

@Serializable
data class CategorySteamResponseItemsSteamData(
	@SerialName("steam_ban_type_id")
	val steamBanTypeId: List<JsonElement> = emptyList(),
)

@Serializable
data class CategorySteamResponseItemsSteamTransactions(
	val date: String = "",
	val product: String = "",
	val type: String = "",
	val source: String = "",
	val amount: String = "",
)

@Serializable
data class CategorySteamResponseItemsAccountLinks(
	val link: String = "",
	val text: String = "",
	val iconClass: String = "",
)

@Serializable
data class CategorySteamResponseItemsSeller(
	@SerialName("user_id")
	val userId: Double = 0.0,
	@SerialName("sold_items_count")
	val soldItemsCount: Double = 0.0,
	@SerialName("active_items_count")
	val activeItemsCount: Double = 0.0,
	@SerialName("restore_data")
	val restoreData: String = "",
	val username: String = "",
	@SerialName("avatar_date")
	val avatarDate: Double = 0.0,
	@SerialName("is_banned")
	val isBanned: Double = 0.0,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Double = 0.0,
	@SerialName("restore_percents")
	val restorePercents: Double = 0.0,
)

@Serializable
data class CategorySteamResponseItems(
	@SerialName("item_id")
	val itemId: Double = 0.0,
	@SerialName("item_state")
	val itemState: String = "",
	@SerialName("category_id")
	val categoryId: Double = 0.0,
	@SerialName("published_date")
	val publishedDate: Double = 0.0,
	val title: String = "",
	val description: String = "",
	val price: Double = 0.0,
	@SerialName("update_stat_date")
	val updateStatDate: Double = 0.0,
	@SerialName("refreshed_date")
	val refreshedDate: Double = 0.0,
	@SerialName("edit_date")
	val editDate: Double = 0.0,
	@SerialName("view_count")
	val viewCount: Double = 0.0,
	@SerialName("is_sticky")
	val isSticky: Double = 0.0,
	@SerialName("item_origin")
	val itemOrigin: String = "",
	@SerialName("extended_guarantee")
	val extendedGuarantee: Double = 0.0,
	val nsb: Double = 0.0,
	@SerialName("allow_ask_discount")
	val allowAskDiscount: Double = 0.0,
	@SerialName("title_en")
	val titleEn: String = "",
	@SerialName("description_en")
	val descriptionEn: String = "",
	@SerialName("email_type")
	val emailType: String = "",
	@SerialName("email_provider")
	val emailProvider: String = "",
	@SerialName("item_domain")
	val itemDomain: String = "",
	@SerialName("resale_item_origin")
	val resaleItemOrigin: String = "",
	@SerialName("steam_item_id")
	val steamItemId: Double = 0.0,
	@SerialName("steam_country")
	val steamCountry: String = "",
	@SerialName("steam_register_date")
	val steamRegisterDate: Double = 0.0,
	@SerialName("steam_last_activity")
	val steamLastActivity: Double = 0.0,
	@SerialName("steam_full_games")
	val steamFullGames: CategorySteamResponseItemsSteamFullGames = CategorySteamResponseItemsSteamFullGames(),
	@SerialName("steam_community_ban")
	val steamCommunityBan: Double = 0.0,
	@SerialName("steam_bans")
	val steamBans: String = "",
	@SerialName("steam_cs2_profile_rank")
	val steamCs2ProfileRank: Double = 0.0,
	@SerialName("steam_balance")
	val steamBalance: String = "",
	@SerialName("steam_cs2_rank_id")
	val steamCs2RankId: Double = 0.0,
	@SerialName("steam_is_limited")
	val steamIsLimited: Double = 0.0,
	@SerialName("steam_level")
	val steamLevel: Double = 0.0,
	@SerialName("steam_friend_count")
	val steamFriendCount: Double = 0.0,
	@SerialName("steam_cs2_last_activity")
	val steamCs2LastActivity: Double = 0.0,
	@SerialName("steam_dota2_solo_mmr")
	val steamDota2SoloMmr: Double = 0.0,
	@SerialName("steam_cs2_ban_date")
	val steamCs2BanDate: Double = 0.0,
	@SerialName("steam_converted_balance")
	val steamConvertedBalance: Double = 0.0,
	@SerialName("steam_cards_count")
	val steamCardsCount: Double = 0.0,
	@SerialName("steam_cards_games")
	val steamCardsGames: Double = 0.0,
	@SerialName("steam_pubg_inv_value")
	val steamPubgInvValue: Double = 0.0,
	@SerialName("steam_cs2_inv_value")
	val steamCs2InvValue: Double = 0.0,
	@SerialName("steam_dota2_inv_value")
	val steamDota2InvValue: Double = 0.0,
	@SerialName("steam_tf2_inv_value")
	val steamTf2InvValue: Double = 0.0,
	@SerialName("steam_rust_inv_value")
	val steamRustInvValue: Double = 0.0,
	@SerialName("steam_cs2_wingman_rank_id")
	val steamCs2WingmanRankId: Double = 0.0,
	@SerialName("steam_game_count")
	val steamGameCount: Double = 0.0,
	@SerialName("steam_steam_inv_value")
	val steamSteamInvValue: Double = 0.0,
	@SerialName("steam_inv_value")
	val steamInvValue: Double = 0.0,
	@SerialName("steam_cs2_win_count")
	val steamCs2WinCount: Double = 0.0,
	@SerialName("steam_dota2_game_count")
	val steamDota2GameCount: Double = 0.0,
	@SerialName("steam_dota2_lose_count")
	val steamDota2LoseCount: Double = 0.0,
	@SerialName("steam_dota2_win_count")
	val steamDota2WinCount: Double = 0.0,
	@SerialName("steam_hours_played_recently")
	val steamHoursPlayedRecently: String = "",
	@SerialName("steam_faceit_level")
	val steamFaceitLevel: Double = 0.0,
	@SerialName("steam_points")
	val steamPoints: Double = 0.0,
	@SerialName("steam_last_transaction_date")
	val steamLastTransactionDate: Double = 0.0,
	@SerialName("steam_relevant_game_count")
	val steamRelevantGameCount: Double = 0.0,
	@SerialName("steam_gift_count")
	val steamGiftCount: Double = 0.0,
	@SerialName("steam_limit_spent")
	val steamLimitSpent: String = "",
	@SerialName("steam_dota2_behavior")
	val steamDota2Behavior: Double = 0.0,
	@SerialName("steam_mfa")
	val steamMfa: Double = 0.0,
	@SerialName("steam_market")
	val steamMarket: Double = 0.0,
	@SerialName("steam_market_restrictions")
	val steamMarketRestrictions: Double = 0.0,
	@SerialName("steam_market_ban_end_date")
	val steamMarketBanEndDate: Double = 0.0,
	@SerialName("steam_unturned_inv_value")
	val steamUnturnedInvValue: Double = 0.0,
	@SerialName("steam_cs2_last_launched")
	val steamCs2LastLaunched: Double = 0.0,
	@SerialName("steam_kf2_inv_value")
	val steamKf2InvValue: Double = 0.0,
	@SerialName("steam_dst_inv_value")
	val steamDstInvValue: Double = 0.0,
	@SerialName("steam_cs2_premier_elo")
	val steamCs2PremierElo: Double = 0.0,
	@SerialName("steam_has_activated_keys")
	val steamHasActivatedKeys: Double = 0.0,
	@SerialName("steam_cs2_ban_type")
	val steamCs2BanType: Double = 0.0,
	@SerialName("steam_rust_kill_player")
	val steamRustKillPlayer: Double = 0.0,
	@SerialName("steam_rust_deaths")
	val steamRustDeaths: Double = 0.0,
	@SerialName("steam_total_gifts_rub")
	val steamTotalGiftsRub: Double = 0.0,
	@SerialName("steam_total_refunds_rub")
	val steamTotalRefundsRub: Double = 0.0,
	@SerialName("steam_total_ingame_rub")
	val steamTotalIngameRub: Double = 0.0,
	@SerialName("steam_total_games_rub")
	val steamTotalGamesRub: Double = 0.0,
	@SerialName("steam_total_purchased_rub")
	val steamTotalPurchasedRub: Double = 0.0,
	@SerialName("steam_dota2_last_match_date")
	val steamDota2LastMatchDate: Double = 0.0,
	@SerialName("feedback_data")
	val feedbackData: String = "",
	val isIgnored: Boolean = false,
	val priceWithSellerFee: Double = 0.0,
	val guarantee: CategorySteamResponseItemsGuarantee = CategorySteamResponseItemsGuarantee(),
	val canViewLoginData: Boolean = false,
	val canUpdateItemStats: Boolean = false,
	val canReportItem: Boolean = false,
	val canViewEmailLoginData: Boolean = false,
	val showGetEmailCodeButton: Boolean = false,
	val canOpenItem: Boolean = false,
	val canCloseItem: Boolean = false,
	val canEditItem: Boolean = false,
	val canDeleteItem: Boolean = false,
	val canStickItem: Boolean = false,
	val canUnstickItem: Boolean = false,
	val bumpSettings: CategorySteamResponseItemsBumpSettings = CategorySteamResponseItemsBumpSettings(),
	val canBumpItem: Boolean = false,
	val canBuyItem: Boolean = false,
	@SerialName("rub_price")
	val rubPrice: Double = 0.0,
	@SerialName("price_currency")
	val priceCurrency: String = "",
	val canValidateAccount: Boolean = false,
	val canResellItemAfterPurchase: Boolean = false,
	val steamData: CategorySteamResponseItemsSteamData = CategorySteamResponseItemsSteamData(),
	val isSmallExf: Boolean = false,
	@SerialName("account_last_activity")
	val accountLastActivity: Double = 0.0,
	val hasCs2: Boolean = false,
	val hasDota2: Boolean = false,
	val hasPubg: Boolean = false,
	val hasTf2: Boolean = false,
	val hasRust: Boolean = false,
	@SerialName("steam_cs2_ban_date_active")
	val steamCs2BanDateActive: Boolean = false,
	val dota2CalibrationWarning: Boolean = false,
	val displayConvertedBalance: Boolean = false,
	val inventoryValue: List<JsonElement> = emptyList(),
	val steamCs2Medals: List<JsonElement> = emptyList(),
	val cs2RankExpired: Boolean = false,
	val steamDota2WinRate: Double = 0.0,
	val steamTransactions: List<CategorySteamResponseItemsSteamTransactions> = emptyList(),
	val hasPossibleBanInDota2: Boolean = false,
	val chineseAccount: Boolean = false,
	val cs2MapsRanks: List<JsonElement> = emptyList(),
	val cs2PremierElo: List<JsonElement> = emptyList(),
	val steamLifetimeTradeBan: Boolean = false,
	val canViewAccountLink: Boolean = false,
	val accountLinks: List<CategorySteamResponseItemsAccountLinks> = emptyList(),
	val accountLink: String = "",
	val emailLoginUrl: String = "",
	val canChangePassword: Boolean = false,
	val itemOriginPhrase: String = "",
	@SerialName("sold_items_category_count")
	val soldItemsCategoryCount: Double = 0.0,
	@SerialName("restore_items_category_count")
	val restoreItemsCategoryCount: Double = 0.0,
	val tags: List<JsonElement> = emptyList(),
	@SerialName("note_text")
	val noteText: JsonElement = JsonNull,
	val hasPendingAutoBuy: Boolean = false,
	val descriptionHtml: String = "",
	val descriptionEnHtml: String = "",
	val descriptionPlain: String = "",
	val descriptionEnPlain: String = "",
	val seller: CategorySteamResponseItemsSeller = CategorySteamResponseItemsSeller(),
)

@Serializable
data class CategoryFortniteParams(
    /** The number of the page to display results from. */
	val page: Long? = null,
    /** Minimal price of account (Inclusive). */
	val pmin: Long? = null,
    /** Maximum price of account (Inclusive). */
	val pmax: Long? = null,
    /** The word or words contained in the account title. */
	val title: String? = null,
    /** Order by. */
	@SerialName("order_by")
	val orderBy: OrderBy? = null,
    /** List of tag ids (Tag list is available via GET /me). */
	@SerialName("tag_id[]")
	val tagId: List<Long>? = null,
    /** List of tag ids that won't be included (Tag list is available via GET /me). */
	@SerialName("not_tag_id[]")
	val notTagId: List<Long>? = null,
    /** List of tag ids (Tag list is available via GET /me). */
	@SerialName("public_tag_id[]")
	val publicTagId: List<Long>? = null,
    /** List of tag ids that won't be included (Tag list is available via GET /me). */
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Long>? = null,
    /** List of account origins. */
	@SerialName("origin[]")
	val origin: JsonElement? = null,
    /** List of account origins that won't be included. */
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
    /** Search accounts of user. */
	@SerialName("user_id")
	val userId: Long? = null,
    /** Not sold before. */
	val nsb: Boolean? = null,
    /** Sold before. */
	val sb: Boolean? = null,
    /** Not sold by me before. */
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
    /** Sold by me before. */
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
    /** Currency in which the cost of the account will be searched. */
	val currency: Currency? = null,
    /** Has email login data. */
	@SerialName("email_login_data")
	val emailLoginData: Boolean? = null,
    /** Email provider. */
	@SerialName("email_provider[]")
	val emailProvider: JsonElement? = null,
    /** Email type. */
	@SerialName("email_type[]")
	val emailType: JsonElement? = null,
    /** Email provider. */
	@SerialName("not_email_provider[]")
	val notEmailProvider: NotEmailProvider? = null,
    /** Parse same item ids. */
	@SerialName("parse_same_item_ids")
	val parseSameItemIds: Boolean? = null,
    /** Access to market temp mail. */
	@SerialName("temp_email")
	val tempEmail: TempEmail? = null,
    /** Domain of native/autoreg email. */
	@SerialName("item_domain")
	val itemDomain: String? = null,
    /** Guarantee type. */
	val eg: CategoryEg3? = null,
    /** Minimum number of skins. */
	val smin: Long? = null,
    /** Maximum number of skins. */
	val smax: Long? = null,
    /** Minimum number of V-Bucks. */
	val vbmin: Long? = null,
    /** Maximum number of V-Bucks. */
	val vbmax: Long? = null,
    /** Skins. */
	@SerialName("skin[]")
	val skin: JsonElement? = null,
    /** Pickaxes. */
	@SerialName("pickaxe[]")
	val pickaxe: JsonElement? = null,
    /** Gliders. */
	@SerialName("glider[]")
	val glider: JsonElement? = null,
    /** Dances. */
	@SerialName("dance[]")
	val dance: JsonElement? = null,
    /** Can change email. */
	@SerialName("change_email")
	val changeEmail: ChangeEmail? = null,
    /** Platform. */
	@SerialName("platform[]")
	val platform: JsonElement? = null,
    /** Minimum number of shop skins. */
	@SerialName("skins_shop_min")
	val skinsShopMin: Long? = null,
    /** Maximum number of shop skins. */
	@SerialName("skins_shop_max")
	val skinsShopMax: Long? = null,
    /** Minimum number of shop pickaxes. */
	@SerialName("pickaxes_shop_min")
	val pickaxesShopMin: Long? = null,
    /** Maximum number of shop pickaxes. */
	@SerialName("pickaxes_shop_max")
	val pickaxesShopMax: Long? = null,
    /** Minimum number of shop dances. */
	@SerialName("dances_shop_min")
	val dancesShopMin: Long? = null,
    /** Maximum number of shop dances. */
	@SerialName("dances_shop_max")
	val dancesShopMax: Long? = null,
    /** Minimum number of shop gliders. */
	@SerialName("gliders_shop_min")
	val glidersShopMin: Long? = null,
    /** Maximum number of shop gliders. */
	@SerialName("gliders_shop_max")
	val glidersShopMax: Long? = null,
    /** Minimum total cost of all skins in the shop in V-Bucks. */
	@SerialName("skins_shop_vbmin")
	val skinsShopVbmin: Long? = null,
    /** Maximum total cost of all skins in the shop in V-Bucks. */
	@SerialName("skins_shop_vbmax")
	val skinsShopVbmax: Long? = null,
    /** Minimum total cost of all pickaxes in the shop in V-Bucks. */
	@SerialName("pickaxes_shop_vbmin")
	val pickaxesShopVbmin: Long? = null,
    /** Maximum total cost of all pickaxes in the shop in V-Bucks. */
	@SerialName("pickaxes_shop_vbmax")
	val pickaxesShopVbmax: Long? = null,
    /** Minimum total cost of all dances in the shop in V-Bucks. */
	@SerialName("dances_shop_vbmin")
	val dancesShopVbmin: Long? = null,
    /** Maximum total cost of all dances in the shop in V-Bucks. */
	@SerialName("dances_shop_vbmax")
	val dancesShopVbmax: Long? = null,
    /** Minimum total cost of all gliders in the shop in V-Bucks. */
	@SerialName("gliders_shop_vbmin")
	val glidersShopVbmin: Long? = null,
    /** Maximum total cost of all gliders in the shop in V-Bucks. */
	@SerialName("gliders_shop_vbmax")
	val glidersShopVbmax: Long? = null,
    /** Has Battle Pass. */
	val bp: Bp? = null,
    /** Minimum level. */
	val lmin: Long? = null,
    /** Maximum level. */
	val lmax: Long? = null,
    /** Minimum level of Battle Pass. */
	@SerialName("bp_lmin")
	val bpLmin: Long? = null,
    /** Maximum level of Battle Pass. */
	@SerialName("bp_lmax")
	val bpLmax: Long? = null,
    /** How old is last transaction. */
	@SerialName("last_trans_date")
	val lastTransDate: Long? = null,
    /** In what notation is time measured. */
	@SerialName("last_trans_date_period")
	val lastTransDatePeriod: LastTransDatePeriod? = null,
    /** Has no transactions. */
	@SerialName("no_trans")
	val noTrans: Boolean? = null,
    /** Can be linked to Xbox. */
	@SerialName("xbox_linkable")
	val xboxLinkable: XboxLinkable? = null,
    /** Can be linked to PSN. */
	@SerialName("psn_linkable")
	val psnLinkable: PsnLinkable? = null,
    /** Number of days the account has been offline. */
	val daybreak: Long? = null,
    /** Has Rocket League purchases. */
	@SerialName("rl_purchases")
	val rlPurchases: Boolean? = null,
    /** How old is the account. */
	val reg: Long? = null,
    /** In what notation is time measured. */
	@SerialName("reg_period")
	val regPeriod: RegPeriod? = null,
    /** Minimum number of available refund credits. */
	@SerialName("refund_credits_min")
	val refundCreditsMin: Long? = null,
    /** Maximum number of available refund credits. */
	@SerialName("refund_credits_max")
	val refundCreditsMax: Long? = null,
    /** Minimum number of pickaxes. */
	@SerialName("pickaxe_min")
	val pickaxeMin: Long? = null,
    /** Maximum number of pickaxes. */
	@SerialName("pickaxe_max")
	val pickaxeMax: Long? = null,
    /** Minimum number of dances. */
	val dmin: Long? = null,
    /** Maximum number of dances. */
	val dmax: Long? = null,
    /** Minimum number of gliders. */
	val gmin: Long? = null,
    /** Maximum number of gliders. */
	val gmax: Long? = null,
    /** List of allowed countries. */
	@SerialName("country[]")
	val country: List<String>? = null,
    /** List of disallowed countries. */
	@SerialName("not_country[]")
	val notCountry: List<String>? = null,
)

@Serializable
data class CategoryFortniteResponse(
	val items: List<CategoryFortniteResponseItems> = emptyList(),
	val totalItems: Double = 0.0,
	val totalItemsPrice: JsonElement = JsonNull,
	val hasNextPage: Boolean = false,
	val perPage: Double = 0.0,
	val page: Double = 0.0,
	val wasCached: Boolean = false,
	val cacheTTL: Double = 0.0,
	val lastModified: Double = 0.0,
	val serverTime: Double = 0.0,
	val searchUrl: String = "",
	val stickyItems: List<JsonElement> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class CategoryFortniteResponseItemsBumpSettings(
	val canBumpItem: Boolean = false,
	val canBumpItemGlobally: Boolean = false,
	val shortErrorPhrase: JsonElement = JsonNull,
	val errorPhrase: JsonElement = JsonNull,
)

@Serializable
data class CategoryFortniteResponseItemsFortniteSkins(
	val id: String = "",
	val title: String = "",
	val rarity: String = "",
	val type: String = "",
	@SerialName("from_shop")
	val fromShop: Double = 0.0,
)

@Serializable
data class CategoryFortniteResponseItemsFortnitePickaxe(
	val id: String = "",
	val title: String = "",
	val rarity: String = "",
	val type: String = "",
	@SerialName("from_shop")
	val fromShop: Double = 0.0,
)

@Serializable
data class CategoryFortniteResponseItemsFortniteDance(
	val id: String = "",
	val title: String = "",
	val rarity: String = "",
	val type: String = "",
	@SerialName("from_shop")
	val fromShop: Double = 0.0,
)

@Serializable
data class CategoryFortniteResponseItemsFortniteGliders(
	val id: String = "",
	val title: String = "",
	val rarity: String = "",
	val type: String = "",
	@SerialName("from_shop")
	val fromShop: Double = 0.0,
)

@Serializable
data class CategoryFortniteResponseItemsFortnitePastSeasons(
	val numWins: Double = 0.0,
	val seasonXp: Double = 0.0,
	val purchasedVIP: Boolean = false,
	val survivorPrestige: Double = 0.0,
	val seasonLevel: Double = 0.0,
	val numLowBracket: Double = 0.0,
	val bookLevel: Double = 0.0,
	val numRoyalRoyales: Double = 0.0,
	val seasonNumber: Double = 0.0,
	val survivorTier: Double = 0.0,
	val numHighBracket: Double = 0.0,
)

@Serializable
data class CategoryFortniteResponseItemsFortniteTransactions(
	val date: Double = 0.0,
	val title: String = "",
	val presentmentTotal: String = "",
	val orderType: String = "",
)

@Serializable
data class CategoryFortniteResponseItemsShopCounts(
	val shopSkinsCount: Double = 0.0,
	val shopPickaxesCount: Double = 0.0,
	val shopDancesCount: Double = 0.0,
	val shopGlidersCount: Double = 0.0,
)

@Serializable
data class CategoryFortniteResponseItemsSeller(
	@SerialName("user_id")
	val userId: Double = 0.0,
	@SerialName("sold_items_count")
	val soldItemsCount: Double = 0.0,
	@SerialName("active_items_count")
	val activeItemsCount: Double = 0.0,
	@SerialName("restore_data")
	val restoreData: String = "",
	val username: String = "",
	@SerialName("avatar_date")
	val avatarDate: Double = 0.0,
	@SerialName("is_banned")
	val isBanned: Double = 0.0,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Double = 0.0,
	@SerialName("restore_percents")
	val restorePercents: Double = 0.0,
)

@Serializable
data class CategoryFortniteResponseItems(
	@SerialName("item_id")
	val itemId: Double = 0.0,
	@SerialName("item_state")
	val itemState: String = "",
	@SerialName("category_id")
	val categoryId: Double = 0.0,
	@SerialName("published_date")
	val publishedDate: Double = 0.0,
	val title: String = "",
	val description: String = "",
	val price: Double = 0.0,
	@SerialName("update_stat_date")
	val updateStatDate: Double = 0.0,
	@SerialName("refreshed_date")
	val refreshedDate: Double = 0.0,
	@SerialName("edit_date")
	val editDate: Double = 0.0,
	@SerialName("view_count")
	val viewCount: Double = 0.0,
	@SerialName("is_sticky")
	val isSticky: Double = 0.0,
	@SerialName("item_origin")
	val itemOrigin: String = "",
	@SerialName("extended_guarantee")
	val extendedGuarantee: Double = 0.0,
	val nsb: Double = 0.0,
	@SerialName("allow_ask_discount")
	val allowAskDiscount: Double = 0.0,
	@SerialName("title_en")
	val titleEn: String = "",
	@SerialName("description_en")
	val descriptionEn: String = "",
	@SerialName("email_type")
	val emailType: String = "",
	@SerialName("email_provider")
	val emailProvider: String = "",
	@SerialName("item_domain")
	val itemDomain: String = "",
	@SerialName("resale_item_origin")
	val resaleItemOrigin: String = "",
	@SerialName("fortnite_item_id")
	val fortniteItemId: Double = 0.0,
	@SerialName("fortnite_platform")
	val fortnitePlatform: String = "",
	@SerialName("fortnite_register_date")
	val fortniteRegisterDate: Double = 0.0,
	@SerialName("fortnite_last_activity")
	val fortniteLastActivity: Double = 0.0,
	@SerialName("fortnite_book_level")
	val fortniteBookLevel: Double = 0.0,
	@SerialName("fortnite_lifetime_wins")
	val fortniteLifetimeWins: Double = 0.0,
	@SerialName("fortnite_level")
	val fortniteLevel: Double = 0.0,
	@SerialName("fortnite_season_num")
	val fortniteSeasonNum: Double = 0.0,
	@SerialName("fortnite_books_purchased")
	val fortniteBooksPurchased: Double = 0.0,
	@SerialName("fortnite_balance")
	val fortniteBalance: Double = 0.0,
	@SerialName("fortnite_skin_count")
	val fortniteSkinCount: Double = 0.0,
	@SerialName("fortnite_change_email")
	val fortniteChangeEmail: Double = 0.0,
	@SerialName("fortnite_rl_purchases")
	val fortniteRlPurchases: Double = 0.0,
	@SerialName("fortnite_next_change_email_date")
	val fortniteNextChangeEmailDate: Double = 0.0,
	@SerialName("fortnite_last_trans_date")
	val fortniteLastTransDate: Double = 0.0,
	@SerialName("fortnite_xbox_linkable")
	val fortniteXboxLinkable: Double = 0.0,
	@SerialName("fortnite_psn_linkable")
	val fortnitePsnLinkable: Double = 0.0,
	@SerialName("fortnite_shop_skins_count")
	val fortniteShopSkinsCount: Double = 0.0,
	@SerialName("fortnite_shop_pickaxes_count")
	val fortniteShopPickaxesCount: Double = 0.0,
	@SerialName("fortnite_shop_dances_count")
	val fortniteShopDancesCount: Double = 0.0,
	@SerialName("fortnite_shop_gliders_count")
	val fortniteShopGlidersCount: Double = 0.0,
	@SerialName("feedback_data")
	val feedbackData: String = "",
	val isIgnored: Boolean = false,
	val priceWithSellerFee: Double = 0.0,
	val guarantee: JsonElement = JsonNull,
	val canViewLoginData: Boolean = false,
	val canUpdateItemStats: Boolean = false,
	val canReportItem: Boolean = false,
	val canViewEmailLoginData: Boolean = false,
	val showGetEmailCodeButton: Boolean = false,
	val canOpenItem: Boolean = false,
	val canCloseItem: Boolean = false,
	val canEditItem: Boolean = false,
	val canDeleteItem: Boolean = false,
	val canStickItem: Boolean = false,
	val canUnstickItem: Boolean = false,
	val bumpSettings: CategoryFortniteResponseItemsBumpSettings = CategoryFortniteResponseItemsBumpSettings(),
	val canBumpItem: Boolean = false,
	val canBuyItem: Boolean = false,
	@SerialName("rub_price")
	val rubPrice: Double = 0.0,
	@SerialName("price_currency")
	val priceCurrency: String = "",
	val canValidateAccount: Boolean = false,
	val canResellItemAfterPurchase: Boolean = false,
	val fortniteSkins: List<CategoryFortniteResponseItemsFortniteSkins> = emptyList(),
	val fortnitePickaxe: List<CategoryFortniteResponseItemsFortnitePickaxe> = emptyList(),
	val fortniteDance: List<CategoryFortniteResponseItemsFortniteDance> = emptyList(),
	val fortniteGliders: List<CategoryFortniteResponseItemsFortniteGliders> = emptyList(),
	@SerialName("fortnite_pickaxe_count")
	val fortnitePickaxeCount: Double = 0.0,
	@SerialName("fortnite_dance_count")
	val fortniteDanceCount: Double = 0.0,
	@SerialName("fortnite_glider_count")
	val fortniteGliderCount: Double = 0.0,
	val fortnitePastSeasons: List<CategoryFortniteResponseItemsFortnitePastSeasons> = emptyList(),
	val isSmallExf: Boolean = false,
	@SerialName("account_last_activity")
	val accountLastActivity: Double = 0.0,
	val fortniteTransactions: List<CategoryFortniteResponseItemsFortniteTransactions> = emptyList(),
	val domain: String = "",
	val shopCounts: CategoryFortniteResponseItemsShopCounts = CategoryFortniteResponseItemsShopCounts(),
	val canViewAccountLink: Boolean = false,
	val accountLinks: List<JsonElement> = emptyList(),
	val emailLoginUrl: String = "",
	val canChangePassword: Boolean = false,
	val itemOriginPhrase: String = "",
	@SerialName("sold_items_category_count")
	val soldItemsCategoryCount: Double = 0.0,
	@SerialName("restore_items_category_count")
	val restoreItemsCategoryCount: Double = 0.0,
	val tags: List<JsonElement> = emptyList(),
	@SerialName("note_text")
	val noteText: JsonElement = JsonNull,
	val hasPendingAutoBuy: Boolean = false,
	val descriptionHtml: String = "",
	val descriptionEnHtml: String = "",
	val descriptionPlain: String = "",
	val descriptionEnPlain: String = "",
	val seller: CategoryFortniteResponseItemsSeller = CategoryFortniteResponseItemsSeller(),
)

@Serializable
data class CategoryMihoyoParams(
    /** The number of the page to display results from. */
	val page: Long? = null,
    /** Minimal price of account (Inclusive). */
	val pmin: Long? = null,
    /** Maximum price of account (Inclusive). */
	val pmax: Long? = null,
    /** The word or words contained in the account title. */
	val title: String? = null,
    /** Order by. */
	@SerialName("order_by")
	val orderBy: OrderBy? = null,
    /** List of tag ids (Tag list is available via GET /me). */
	@SerialName("tag_id[]")
	val tagId: List<Long>? = null,
    /** List of tag ids that won't be included (Tag list is available via GET /me). */
	@SerialName("not_tag_id[]")
	val notTagId: List<Long>? = null,
    /** List of tag ids (Tag list is available via GET /me). */
	@SerialName("public_tag_id[]")
	val publicTagId: List<Long>? = null,
    /** List of tag ids that won't be included (Tag list is available via GET /me). */
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Long>? = null,
    /** List of account origins. */
	@SerialName("origin[]")
	val origin: JsonElement? = null,
    /** List of account origins that won't be included. */
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
    /** Search accounts of user. */
	@SerialName("user_id")
	val userId: Long? = null,
    /** Not sold before. */
	val nsb: Boolean? = null,
    /** Sold before. */
	val sb: Boolean? = null,
    /** Not sold by me before. */
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
    /** Sold by me before. */
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
    /** Currency in which the cost of the account will be searched. */
	val currency: Currency? = null,
    /** Has email login data. */
	@SerialName("email_login_data")
	val emailLoginData: Boolean? = null,
    /** Email provider. */
	@SerialName("email_provider[]")
	val emailProvider: JsonElement? = null,
    /** Email provider. */
	@SerialName("not_email_provider[]")
	val notEmailProvider: NotEmailProvider? = null,
    /** Email type. */
	@SerialName("email_type[]")
	val emailType: JsonElement? = null,
    /** Parse same item ids. */
	@SerialName("parse_same_item_ids")
	val parseSameItemIds: Boolean? = null,
    /** Domain of native/autoreg email. */
	@SerialName("item_domain")
	val itemDomain: String? = null,
    /** Has linked email. */
	val email: Email? = null,
    /** Has linked external accounts. */
	val ea: Ea? = null,
    /** Region. */
	val region: JsonElement? = null,
    /** List of disallowed regions. */
	@SerialName("not_region")
	val notRegion: JsonElement? = null,
    /** List of characters. */
	@SerialName("genshin_character[]")
	val genshinCharacter: List<Long>? = null,
    /** List of minimum constellations on characters. */
	@SerialName("genshin_character_constellations")
	val genshinCharacterConstellations: Map<String, Long>? = null,
    /** List of maximum constellations on characters. */
	@SerialName("genshin_character_constellations_max")
	val genshinCharacterConstellationsMax: Map<String, Long>? = null,
    /** List of weapons. */
	@SerialName("genshin_weapon[]")
	val genshinWeapon: List<Long>? = null,
    /** Minimum number of characters. */
	@SerialName("genshin_char_min")
	val genshinCharMin: Long? = null,
    /** Maximum number of characters. */
	@SerialName("genshin_char_max")
	val genshinCharMax: Long? = null,
    /** Minimum number of legendary characters. */
	@SerialName("genshin_legendary_min")
	val genshinLegendaryMin: Long? = null,
    /** Maximum number of legendary characters. */
	@SerialName("genshin_legendary_max")
	val genshinLegendaryMax: Long? = null,
    /** Minimum level. */
	@SerialName("genshin_level_min")
	val genshinLevelMin: Long? = null,
    /** Maximum level. */
	@SerialName("genshin_level_max")
	val genshinLevelMax: Long? = null,
    /** Minimum number of legendary weapon characters. */
	@SerialName("genshin_legendary_weapon_min")
	val genshinLegendaryWeaponMin: Long? = null,
    /** Maximum number of legendary weapon characters. */
	@SerialName("genshin_legendary_weapon_max")
	val genshinLegendaryWeaponMax: Long? = null,
    /** Minimum number of constellations on legendary characters. */
	@SerialName("constellations_min")
	val constellationsMin: Long? = null,
    /** Maximum number of constellations on legendary characters. */
	@SerialName("constellations_max")
	val constellationsMax: Long? = null,
    /** Minimum number of achievements. */
	@SerialName("genshin_achievement_min")
	val genshinAchievementMin: Long? = null,
    /** Maximum number of achievements. */
	@SerialName("genshin_achievement_max")
	val genshinAchievementMax: Long? = null,
    /** Minimum number of primogems. */
	@SerialName("genshin_currency_min")
	val genshinCurrencyMin: Long? = null,
    /** Maximum number of primogems. */
	@SerialName("genshin_currency_max")
	val genshinCurrencyMax: Long? = null,
    /** List of characters. */
	@SerialName("honkai_character[]")
	val honkaiCharacter: List<Long>? = null,
    /** List of minimum eidolons on characters. */
	@SerialName("honkai_character_eidolons")
	val honkaiCharacterEidolons: Map<String, Long>? = null,
    /** List of maximum eidolons on characters. */
	@SerialName("honkai_character_eidolons_max")
	val honkaiCharacterEidolonsMax: Map<String, Long>? = null,
    /** List of weapons. */
	@SerialName("honkai_weapon[]")
	val honkaiWeapon: List<Long>? = null,
    /** Minimum number of characters. */
	@SerialName("honkai_char_min")
	val honkaiCharMin: Long? = null,
    /** Maximum number of characters. */
	@SerialName("honkai_char_max")
	val honkaiCharMax: Long? = null,
    /** Minimum number of legendary characters. */
	@SerialName("honkai_legendary_min")
	val honkaiLegendaryMin: Long? = null,
    /** Maximum number of legendary characters. */
	@SerialName("honkai_legendary_max")
	val honkaiLegendaryMax: Long? = null,
    /** Minimum level. */
	@SerialName("honkai_level_min")
	val honkaiLevelMin: Long? = null,
    /** Maximum level. */
	@SerialName("honkai_level_max")
	val honkaiLevelMax: Long? = null,
    /** Minimum number of legendary weapon characters. */
	@SerialName("honkai_legendary_weapon_min")
	val honkaiLegendaryWeaponMin: Long? = null,
    /** Maximum number of legendary weapon characters. */
	@SerialName("honkai_legendary_weapon_max")
	val honkaiLegendaryWeaponMax: Long? = null,
    /** Minimum number of constellations on Honkai: Star Rail legendary characters. */
	@SerialName("eidolons_min")
	val eidolonsMin: Long? = null,
    /** Maximum number of legendary Honkai: Star Rail weapon characters. */
	@SerialName("eidolons_max")
	val eidolonsMax: Long? = null,
    /** Minimum number of achievements. */
	@SerialName("honkai_achievement_min")
	val honkaiAchievementMin: Long? = null,
    /** Maximum number of achievements. */
	@SerialName("honkai_achievement_max")
	val honkaiAchievementMax: Long? = null,
    /** Minimum number of Stellar Jade. */
	@SerialName("honkai_currency_min")
	val honkaiCurrencyMin: Long? = null,
    /** Maximum number of Stellar Jade. */
	@SerialName("honkai_currency_max")
	val honkaiCurrencyMax: Long? = null,
    /** List of Zenless Zone Zero characters. */
	@SerialName("zenless_character[]")
	val zenlessCharacter: List<Long>? = null,
    /** List of minimum cinemas on characters. */
	@SerialName("zenless_character_cinemas")
	val zenlessCharacterCinemas: Map<String, Long>? = null,
    /** List of maximum cinemas on characters. */
	@SerialName("zenless_character_cinemas_max")
	val zenlessCharacterCinemasMax: Map<String, Long>? = null,
    /** List of Zenless Zone Zero weapons. */
	@SerialName("zenless_weapon[]")
	val zenlessWeapon: List<Long>? = null,
    /** Minimum number of Zenless Zone Zero legendary characters. */
	@SerialName("zenless_legendary_min")
	val zenlessLegendaryMin: Long? = null,
    /** Maximum number of Zenless Zone Zero legendary characters. */
	@SerialName("zenless_legendary_max")
	val zenlessLegendaryMax: Long? = null,
    /** Minimum number of cinemas on Zenless Zone Zero characters. */
	@SerialName("cinemas_min")
	val cinemasMin: Long? = null,
    /** Maximum number of cinemas on Zenless Zone Zero characters. */
	@SerialName("cinemas_max")
	val cinemasMax: Long? = null,
    /** Minimum number of legendary Zenless Zone Zero weapon characters. */
	@SerialName("zenless_legendary_weapon_min")
	val zenlessLegendaryWeaponMin: Long? = null,
    /** Maximum number of legendary Zenless Zone Zero weapon characters. */
	@SerialName("zenless_legendary_weapon_max")
	val zenlessLegendaryWeaponMax: Long? = null,
    /** Minimum number of Zenless Zone Zero characters. */
	@SerialName("zenless_char_min")
	val zenlessCharMin: Long? = null,
    /** Maximum number of Zenless Zone Zero characters. */
	@SerialName("zenless_char_max")
	val zenlessCharMax: Long? = null,
    /** Minimum Zenless Zone Zero level. */
	@SerialName("zenless_level_min")
	val zenlessLevelMin: Long? = null,
    /** Maximum Zenless Zone Zero level. */
	@SerialName("zenless_level_max")
	val zenlessLevelMax: Long? = null,
    /** Minimum count of Zenless Zone Zero achievements. */
	@SerialName("zenless_achievement_min")
	val zenlessAchievementMin: Long? = null,
    /** Maximum count of Zenless Zone Zero achievements. */
	@SerialName("zenless_achievement_max")
	val zenlessAchievementMax: Long? = null,
    /** Minimum count of Zenless Zone Zero polychrome. */
	@SerialName("zenless_currency_min")
	val zenlessCurrencyMin: Long? = null,
    /** Maximum count of Zenless Zone Zero polychrome. */
	@SerialName("zenless_currency_max")
	val zenlessCurrencyMax: Long? = null,
    /** Number of days the account has been offline. */
	val daybreak: Long? = null,
)

@Serializable
data class CategoryMihoyoResponse(
	val items: List<CategoryMihoyoResponseItems> = emptyList(),
	val totalItems: Double = 0.0,
	val totalItemsPrice: JsonElement = JsonNull,
	val hasNextPage: Boolean = false,
	val perPage: Double = 0.0,
	val page: Double = 0.0,
	val wasCached: Boolean = false,
	val cacheTTL: Double = 0.0,
	val lastModified: Double = 0.0,
	val serverTime: Double = 0.0,
	val searchUrl: String = "",
	val stickyItems: List<JsonElement> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class CategoryMihoyoResponseItemsBumpSettings(
	val canBumpItem: Boolean = false,
	val canBumpItemGlobally: Boolean = false,
	val shortErrorPhrase: JsonElement = JsonNull,
	val errorPhrase: JsonElement = JsonNull,
)

@Serializable
data class CategoryMihoyoResponseItemsMihoyoLinkedAccounts(
	val links: List<String> = emptyList(),
	val legacy: Boolean = false,
)

@Serializable
data class CategoryMihoyoResponseItemsHonkaiCharactersEquip(
	val id: Double = 0.0,
	val level: Double = 0.0,
	val rank: Double = 0.0,
	val name: String = "",
	val desc: String = "",
	val icon: String = "",
	val rarity: Double = 0.0,
)

@Serializable
data class CategoryMihoyoResponseItemsHonkaiCharactersRelicsMainProperty(
	@SerialName("property_type")
	val propertyType: Double = 0.0,
	val value: String = "",
	val times: Double = 0.0,
)

@Serializable
data class CategoryMihoyoResponseItemsHonkaiCharactersRelicsProperties(
	@SerialName("property_type")
	val propertyType: Double = 0.0,
	val value: String = "",
	val times: Double = 0.0,
)

@Serializable
data class CategoryMihoyoResponseItemsHonkaiCharactersRelics(
	val id: Double = 0.0,
	val level: Double = 0.0,
	val pos: Double = 0.0,
	val name: String = "",
	val desc: String = "",
	val icon: String = "",
	val rarity: Double = 0.0,
	@SerialName("main_property")
	val mainProperty: CategoryMihoyoResponseItemsHonkaiCharactersRelicsMainProperty = CategoryMihoyoResponseItemsHonkaiCharactersRelicsMainProperty(),
	val properties: List<CategoryMihoyoResponseItemsHonkaiCharactersRelicsProperties> = emptyList(),
)

@Serializable
data class CategoryMihoyoResponseItemsHonkaiCharactersOrnamentsMainProperty(
	@SerialName("property_type")
	val propertyType: Double = 0.0,
	val value: String = "",
	val times: Double = 0.0,
)

@Serializable
data class CategoryMihoyoResponseItemsHonkaiCharactersOrnamentsProperties(
	@SerialName("property_type")
	val propertyType: Double = 0.0,
	val value: String = "",
	val times: Double = 0.0,
)

@Serializable
data class CategoryMihoyoResponseItemsHonkaiCharactersOrnaments(
	val id: Double = 0.0,
	val level: Double = 0.0,
	val pos: Double = 0.0,
	val name: String = "",
	val desc: String = "",
	val icon: String = "",
	val rarity: Double = 0.0,
	@SerialName("main_property")
	val mainProperty: CategoryMihoyoResponseItemsHonkaiCharactersOrnamentsMainProperty = CategoryMihoyoResponseItemsHonkaiCharactersOrnamentsMainProperty(),
	val properties: List<CategoryMihoyoResponseItemsHonkaiCharactersOrnamentsProperties> = emptyList(),
)

@Serializable
data class CategoryMihoyoResponseItemsHonkaiCharacters(
	val id: Double = 0.0,
	val level: Double = 0.0,
	val name: String = "",
	val element: String = "",
	val icon: String = "",
	val rarity: Double = 0.0,
	val rank: Double = 0.0,
	val image: String = "",
	val equip: CategoryMihoyoResponseItemsHonkaiCharactersEquip = CategoryMihoyoResponseItemsHonkaiCharactersEquip(),
	val relics: List<CategoryMihoyoResponseItemsHonkaiCharactersRelics> = emptyList(),
	val ornaments: List<CategoryMihoyoResponseItemsHonkaiCharactersOrnaments> = emptyList(),
	@SerialName("base_type")
	val baseType: Double = 0.0,
	@SerialName("figure_path")
	val figurePath: String = "",
	val elementImage: String = "",
)

@Serializable
data class CategoryMihoyoResponseItemsGenshinCharactersWeapon(
	val id: Double = 0.0,
	val name: String = "",
	val icon: String = "",
	val type: Double = 0.0,
	val rarity: Double = 0.0,
	val level: Double = 0.0,
	@SerialName("promote_level")
	val promoteLevel: Double = 0.0,
	@SerialName("type_name")
	val typeName: String = "",
	val desc: String = "",
	@SerialName("affix_level")
	val affixLevel: Double = 0.0,
)

@Serializable
data class CategoryMihoyoResponseItemsGenshinCharactersReliquaries(
	val id: Double = 0.0,
	val name: String = "",
	val icon: String = "",
	val pos: Double = 0.0,
	val rarity: Double = 0.0,
	val level: Double = 0.0,
	@SerialName("pos_name")
	val posName: String = "",
)

@Serializable
data class CategoryMihoyoResponseItemsGenshinCharacters(
	val id: Double = 0.0,
	val image: String = "",
	val icon: String = "",
	val name: String = "",
	val element: String = "",
	val fetter: Double = 0.0,
	val level: Double = 0.0,
	val rarity: Double = 0.0,
	val weapon: CategoryMihoyoResponseItemsGenshinCharactersWeapon = CategoryMihoyoResponseItemsGenshinCharactersWeapon(),
	val reliquaries: List<CategoryMihoyoResponseItemsGenshinCharactersReliquaries> = emptyList(),
	@SerialName("actived_constellation_num")
	val activedConstellationNum: Double = 0.0,
	val costumes: List<JsonElement> = emptyList(),
	val external: JsonElement = JsonNull,
	val background: String = "",
)

@Serializable
data class CategoryMihoyoResponseItemsZenlessCharactersWeaponProperties(
	@SerialName("property_name")
	val propertyName: String = "",
	@SerialName("property_id")
	val propertyId: Double = 0.0,
	val base: String = "",
)

@Serializable
data class CategoryMihoyoResponseItemsZenlessCharactersWeaponMainProperties(
	@SerialName("property_name")
	val propertyName: String = "",
	@SerialName("property_id")
	val propertyId: Double = 0.0,
	val base: String = "",
)

@Serializable
data class CategoryMihoyoResponseItemsZenlessCharactersWeapon(
	val id: Double = 0.0,
	val level: Double = 0.0,
	val name: String = "",
	val star: Double = 0.0,
	val icon: String = "",
	val rarity: Double = 0.0,
	val properties: List<CategoryMihoyoResponseItemsZenlessCharactersWeaponProperties> = emptyList(),
	@SerialName("main_properties")
	val mainProperties: List<CategoryMihoyoResponseItemsZenlessCharactersWeaponMainProperties> = emptyList(),
	@SerialName("talent_title")
	val talentTitle: String = "",
	@SerialName("talent_content")
	val talentContent: String = "",
	val profession: Double = 0.0,
	val starIcon: String = "",
	val rarityIcon: String = "",
)

@Serializable
data class CategoryMihoyoResponseItemsZenlessCharacters(
	val id: Double = 0.0,
	val level: Double = 0.0,
	@SerialName("name_mi18n")
	val nameMi18n: String = "",
	@SerialName("full_name_mi18n")
	val fullNameMi18n: String = "",
	@SerialName("element_type")
	val elementType: Double = 0.0,
	@SerialName("camp_name_mi18n")
	val campNameMi18n: String = "",
	@SerialName("avatar_profession")
	val avatarProfession: Double = 0.0,
	val rarity: Double = 0.0,
	val weapon: CategoryMihoyoResponseItemsZenlessCharactersWeapon = CategoryMihoyoResponseItemsZenlessCharactersWeapon(),
	val rank: Double = 0.0,
	val name: String = "",
	val rarityIcon: String = "",
	val elementIcon: String = "",
	val professionIcon: String = "",
)

@Serializable
data class CategoryMihoyoResponseItemsAccountLinks(
	val link: String = "",
	val text: String = "",
	val iconClass: String = "",
)

@Serializable
data class CategoryMihoyoResponseItemsSeller(
	@SerialName("user_id")
	val userId: Double = 0.0,
	@SerialName("sold_items_count")
	val soldItemsCount: Double = 0.0,
	@SerialName("active_items_count")
	val activeItemsCount: Double = 0.0,
	@SerialName("restore_data")
	val restoreData: String = "",
	val username: String = "",
	@SerialName("avatar_date")
	val avatarDate: Double = 0.0,
	@SerialName("is_banned")
	val isBanned: Double = 0.0,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Double = 0.0,
	@SerialName("restore_percents")
	val restorePercents: Double = 0.0,
)

@Serializable
data class CategoryMihoyoResponseItems(
	@SerialName("item_id")
	val itemId: Double = 0.0,
	@SerialName("item_state")
	val itemState: String = "",
	@SerialName("category_id")
	val categoryId: Double = 0.0,
	@SerialName("published_date")
	val publishedDate: Double = 0.0,
	val title: String = "",
	val description: String = "",
	val price: Double = 0.0,
	@SerialName("update_stat_date")
	val updateStatDate: Double = 0.0,
	@SerialName("refreshed_date")
	val refreshedDate: Double = 0.0,
	@SerialName("edit_date")
	val editDate: Double = 0.0,
	@SerialName("view_count")
	val viewCount: Double = 0.0,
	@SerialName("is_sticky")
	val isSticky: Double = 0.0,
	@SerialName("item_origin")
	val itemOrigin: String = "",
	@SerialName("extended_guarantee")
	val extendedGuarantee: Double = 0.0,
	val nsb: Double = 0.0,
	@SerialName("allow_ask_discount")
	val allowAskDiscount: Double = 0.0,
	@SerialName("title_en")
	val titleEn: String = "",
	@SerialName("description_en")
	val descriptionEn: String = "",
	@SerialName("email_type")
	val emailType: String = "",
	@SerialName("email_provider")
	val emailProvider: String = "",
	@SerialName("item_domain")
	val itemDomain: String = "",
	@SerialName("resale_item_origin")
	val resaleItemOrigin: String = "",
	@SerialName("mihoyo_item_id")
	val mihoyoItemId: Double = 0.0,
	@SerialName("mihoyo_id")
	val mihoyoId: Double = 0.0,
	@SerialName("mihoyo_email")
	val mihoyoEmail: Double = 0.0,
	@SerialName("mihoyo_has_linked_accounts")
	val mihoyoHasLinkedAccounts: Double = 0.0,
	@SerialName("mihoyo_region")
	val mihoyoRegion: String = "",
	@SerialName("mihoyo_last_activity")
	val mihoyoLastActivity: Double = 0.0,
	@SerialName("mihoyo_genshin_level")
	val mihoyoGenshinLevel: Double = 0.0,
	@SerialName("mihoyo_genshin_character_count")
	val mihoyoGenshinCharacterCount: Double = 0.0,
	@SerialName("mihoyo_genshin_achievement_count")
	val mihoyoGenshinAchievementCount: Double = 0.0,
	@SerialName("mihoyo_genshin_abyss_process")
	val mihoyoGenshinAbyssProcess: String = "",
	@SerialName("mihoyo_genshin_legendary_characters_count")
	val mihoyoGenshinLegendaryCharactersCount: Double = 0.0,
	@SerialName("mihoyo_genshin_constellations_count")
	val mihoyoGenshinConstellationsCount: Double = 0.0,
	@SerialName("mihoyo_genshin_legendary_weapons_count")
	val mihoyoGenshinLegendaryWeaponsCount: Double = 0.0,
	@SerialName("mihoyo_genshin_activity_days")
	val mihoyoGenshinActivityDays: Double = 0.0,
	@SerialName("mihoyo_genshin_currency")
	val mihoyoGenshinCurrency: Double = 0.0,
	@SerialName("mihoyo_honkai_level")
	val mihoyoHonkaiLevel: Double = 0.0,
	@SerialName("mihoyo_honkai_character_count")
	val mihoyoHonkaiCharacterCount: Double = 0.0,
	@SerialName("mihoyo_honkai_achievement_count")
	val mihoyoHonkaiAchievementCount: Double = 0.0,
	@SerialName("mihoyo_honkai_abyss_process")
	val mihoyoHonkaiAbyssProcess: String = "",
	@SerialName("mihoyo_honkai_legendary_characters_count")
	val mihoyoHonkaiLegendaryCharactersCount: Double = 0.0,
	@SerialName("mihoyo_honkai_eidolons_count")
	val mihoyoHonkaiEidolonsCount: Double = 0.0,
	@SerialName("mihoyo_honkai_legendary_weapons_count")
	val mihoyoHonkaiLegendaryWeaponsCount: Double = 0.0,
	@SerialName("mihoyo_honkai_activity_days")
	val mihoyoHonkaiActivityDays: Double = 0.0,
	@SerialName("mihoyo_honkai_currency")
	val mihoyoHonkaiCurrency: Double = 0.0,
	@SerialName("mihoyo_zenless_level")
	val mihoyoZenlessLevel: Double = 0.0,
	@SerialName("mihoyo_zenless_character_count")
	val mihoyoZenlessCharacterCount: Double = 0.0,
	@SerialName("mihoyo_zenless_achievement_count")
	val mihoyoZenlessAchievementCount: Double = 0.0,
	@SerialName("mihoyo_zenless_abyss_process")
	val mihoyoZenlessAbyssProcess: String = "",
	@SerialName("mihoyo_zenless_legendary_characters_count")
	val mihoyoZenlessLegendaryCharactersCount: Double = 0.0,
	@SerialName("mihoyo_zenless_cinemas_count")
	val mihoyoZenlessCinemasCount: Double = 0.0,
	@SerialName("mihoyo_zenless_legendary_weapons_count")
	val mihoyoZenlessLegendaryWeaponsCount: Double = 0.0,
	@SerialName("mihoyo_zenless_activity_days")
	val mihoyoZenlessActivityDays: Double = 0.0,
	@SerialName("mihoyo_zenless_currency")
	val mihoyoZenlessCurrency: Double = 0.0,
	@SerialName("feedback_data")
	val feedbackData: String = "",
	val isIgnored: Boolean = false,
	val priceWithSellerFee: Double = 0.0,
	val guarantee: JsonElement = JsonNull,
	val canViewLoginData: Boolean = false,
	val canUpdateItemStats: Boolean = false,
	val canReportItem: Boolean = false,
	val canViewEmailLoginData: Boolean = false,
	val showGetEmailCodeButton: Boolean = false,
	val canOpenItem: Boolean = false,
	val canCloseItem: Boolean = false,
	val canEditItem: Boolean = false,
	val canDeleteItem: Boolean = false,
	val canStickItem: Boolean = false,
	val canUnstickItem: Boolean = false,
	val bumpSettings: CategoryMihoyoResponseItemsBumpSettings = CategoryMihoyoResponseItemsBumpSettings(),
	val canBumpItem: Boolean = false,
	val canBuyItem: Boolean = false,
	@SerialName("rub_price")
	val rubPrice: Double = 0.0,
	@SerialName("price_currency")
	val priceCurrency: String = "",
	val canValidateAccount: Boolean = false,
	val canResellItemAfterPurchase: Boolean = false,
	val mihoyoRegionPhrase: String = "",
	val mihoyoLinkedAccounts: CategoryMihoyoResponseItemsMihoyoLinkedAccounts = CategoryMihoyoResponseItemsMihoyoLinkedAccounts(),
	val mihoyoLinkedAccountsString: String = "",
	val honkaiCharacters: List<CategoryMihoyoResponseItemsHonkaiCharacters> = emptyList(),
	val genshinCharacters: List<CategoryMihoyoResponseItemsGenshinCharacters> = emptyList(),
	val zenlessCharacters: List<CategoryMihoyoResponseItemsZenlessCharacters> = emptyList(),
	val canViewAccountLink: Boolean = false,
	val accountLinks: List<CategoryMihoyoResponseItemsAccountLinks> = emptyList(),
	val accountLink: String = "",
	val emailLoginUrl: String = "",
	val canChangePassword: Boolean = false,
	val itemOriginPhrase: String = "",
	@SerialName("sold_items_category_count")
	val soldItemsCategoryCount: Double = 0.0,
	@SerialName("restore_items_category_count")
	val restoreItemsCategoryCount: Double = 0.0,
	val tags: List<JsonElement> = emptyList(),
	@SerialName("note_text")
	val noteText: JsonElement = JsonNull,
	val hasPendingAutoBuy: Boolean = false,
	val descriptionHtml: String = "",
	val descriptionEnHtml: String = "",
	val descriptionPlain: String = "",
	val descriptionEnPlain: String = "",
	val seller: CategoryMihoyoResponseItemsSeller = CategoryMihoyoResponseItemsSeller(),
)

@Serializable
data class CategoryRiotParams(
    /** The number of the page to display results from. */
	val page: Long? = null,
    /** Minimal price of account (Inclusive). */
	val pmin: Long? = null,
    /** Maximum price of account (Inclusive). */
	val pmax: Long? = null,
    /** The word or words contained in the account title. */
	val title: String? = null,
    /** Order by. */
	@SerialName("order_by")
	val orderBy: OrderBy? = null,
    /** List of tag ids (Tag list is available via GET /me). */
	@SerialName("tag_id[]")
	val tagId: List<Long>? = null,
    /** List of tag ids that won't be included (Tag list is available via GET /me). */
	@SerialName("not_tag_id[]")
	val notTagId: List<Long>? = null,
    /** List of tag ids (Tag list is available via GET /me). */
	@SerialName("public_tag_id[]")
	val publicTagId: List<Long>? = null,
    /** List of tag ids that won't be included (Tag list is available via GET /me). */
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Long>? = null,
    /** List of account origins. */
	@SerialName("origin[]")
	val origin: JsonElement? = null,
    /** List of account origins that won't be included. */
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
    /** Search accounts of user. */
	@SerialName("user_id")
	val userId: Long? = null,
    /** Not sold before. */
	val nsb: Boolean? = null,
    /** Sold before. */
	val sb: Boolean? = null,
    /** Not sold by me before. */
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
    /** Sold by me before. */
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
    /** Currency in which the cost of the account will be searched. */
	val currency: Currency? = null,
    /** Has email login data. */
	@SerialName("email_login_data")
	val emailLoginData: Boolean? = null,
    /** Email provider. */
	@SerialName("email_provider[]")
	val emailProvider: JsonElement? = null,
    /** Email provider. */
	@SerialName("not_email_provider[]")
	val notEmailProvider: NotEmailProvider? = null,
    /** Parse same item ids. */
	@SerialName("parse_same_item_ids")
	val parseSameItemIds: Boolean? = null,
    /** Email type. */
	@SerialName("email_type[]")
	val emailType: JsonElement? = null,
    /** Domain of native/autoreg email. */
	@SerialName("item_domain")
	val itemDomain: String? = null,
    /** Minimum valorant rank. */
	val rmin: Long? = null,
    /** Maximum valorant rank. */
	val rmax: Long? = null,
    /** Last minimum valorant rank. */
	@SerialName("last_rmin")
	val lastRmin: Long? = null,
    /** Last maximum valorant rank. */
	@SerialName("last_rmax")
	val lastRmax: Long? = null,
    /** Previous minimum rank. */
	@SerialName("previous_rmin")
	val previousRmin: Long? = null,
    /** Previous maximum rank. */
	@SerialName("previous_rmax")
	val previousRmax: Long? = null,
    /** List of weapon skins. */
	@SerialName("weaponSkin[]")
	val weaponSkin: List<String>? = null,
    /** List of buddies. */
	@SerialName("buddy[]")
	val buddy: List<String>? = null,
    /** List of agents. */
	@SerialName("agent[]")
	val agent: List<String>? = null,
    /** List of champions. */
	@SerialName("champion[]")
	val champion: List<String>? = null,
    /** List of LoL skins. */
	@SerialName("skin[]")
	val skin: List<String>? = null,
    /** List of allowed countries. */
	@SerialName("country[]")
	val country: List<String>? = null,
    /** List of disallowed countries. */
	@SerialName("not_country[]")
	val notCountry: List<String>? = null,
    /** Number of days the account has been offline. */
	val daybreak: Long? = null,
    /** Minimum level in Valorant. */
	@SerialName("valorant_level_min")
	val valorantLevelMin: Long? = null,
    /** Maximum level in Valorant. */
	@SerialName("valorant_level_max")
	val valorantLevelMax: Long? = null,
    /** Minimum level in LoL. */
	@SerialName("lol_level_min")
	val lolLevelMin: Long? = null,
    /** Maximum level in LoL. */
	@SerialName("lol_level_max")
	val lolLevelMax: Long? = null,
    /** Minimum inventory value. */
	@SerialName("inv_min")
	val invMin: Long? = null,
    /** Maximum inventory value. */
	@SerialName("inv_max")
	val invMax: Long? = null,
    /** Minimum number of Valorant points. */
	@SerialName("vp_min")
	val vpMin: Long? = null,
    /** Maximum number of Valorant points. */
	@SerialName("vp_max")
	val vpMax: Long? = null,
    /** Minimum number of skins. */
	@SerialName("valorant_smin")
	val valorantSmin: Long? = null,
    /** Maximum number of skins. */
	@SerialName("valorant_smax")
	val valorantSmax: Long? = null,
    /** List of allowed rank types. */
	@SerialName("valorant_rank_type[]")
	val valorantRankType: JsonElement? = null,
    /** Minimum amount of agents. */
	val amin: Long? = null,
    /** Maximum amount of agents. */
	val amax: Long? = null,
    /** List of allowed regions in Valorant. */
	@SerialName("valorant_region[]")
	val valorantRegion: List<String>? = null,
    /** List of disallowed regions in Valorant. */
	@SerialName("valorant_not_region[]")
	val valorantNotRegion: List<String>? = null,
    /** List of allowed regions in LoL. */
	@SerialName("lol_region[]")
	val lolRegion: List<String>? = null,
    /** List of disallowed regions in LoL. */
	@SerialName("lol_not_region[]")
	val lolNotRegion: List<String>? = null,
    /** Has any knife. */
	val knife: Boolean? = null,
    /** Minimum number of skins in LoL. */
	@SerialName("lol_smin")
	val lolSmin: Long? = null,
    /** Maximum number of skins in LoL. */
	@SerialName("lol_smax")
	val lolSmax: Long? = null,
    /** Minimum number of champions. */
	@SerialName("champion_min")
	val championMin: Long? = null,
    /** Maximum number of champions. */
	@SerialName("champion_max")
	val championMax: Long? = null,
    /** Minimum win-rate. */
	@SerialName("win_rate_min")
	val winRateMin: Long? = null,
    /** Maximum win-rate. */
	@SerialName("win_rate_max")
	val winRateMax: Long? = null,
    /** Minimum wallet blue balance. */
	@SerialName("blue_min")
	val blueMin: Long? = null,
    /** Maximum wallet blue balance. */
	@SerialName("blue_max")
	val blueMax: Long? = null,
    /** Minimum wallet orange balance. */
	@SerialName("orange_min")
	val orangeMin: Long? = null,
    /** Maximum wallet orange balance. */
	@SerialName("orange_max")
	val orangeMax: Long? = null,
    /** Minimum wallet mythic balance. */
	@SerialName("mythic_min")
	val mythicMin: Long? = null,
    /** Maximum wallet mythic balance. */
	@SerialName("mythic_max")
	val mythicMax: Long? = null,
    /** Minimum wallet riot balance. */
	@SerialName("riot_min")
	val riotMin: Long? = null,
    /** Maximum wallet riot balance. */
	@SerialName("riot_max")
	val riotMax: Long? = null,
    /** Has linked email. */
	val email: Email? = null,
    /** Has linked mobile. */
	val tel: Tel? = null,
    /** Minimum knifes in Valorant. */
	@SerialName("valorant_knife_min")
	val valorantKnifeMin: Long? = null,
    /** Maximum knifes in Valorant. */
	@SerialName("valorant_knife_max")
	val valorantKnifeMax: Long? = null,
    /** Minimum number of Valorant Radiant Points. */
	@SerialName("rp_min")
	val rpMin: Long? = null,
    /** Maximum number of Valorant Radiant Points. */
	@SerialName("rp_max")
	val rpMax: Long? = null,
    /** Minimum number of Valorant free agents. */
	@SerialName("fa_min")
	val faMin: Long? = null,
    /** Maximum number of Valorant free agents. */
	@SerialName("fa_max")
	val faMax: Long? = null,
    /** List of allowed ranks in LoL. */
	@SerialName("lol_rank[]")
	val lolRank: JsonElement? = null,
)

@Serializable
data class CategoryRiotResponse(
	val items: List<CategoryRiotResponseItems> = emptyList(),
	val totalItems: Double = 0.0,
	val totalItemsPrice: JsonElement = JsonNull,
	val hasNextPage: Boolean = false,
	val perPage: Double = 0.0,
	val page: Double = 0.0,
	val wasCached: Boolean = false,
	val cacheTTL: Double = 0.0,
	val lastModified: Double = 0.0,
	val serverTime: Double = 0.0,
	val searchUrl: String = "",
	val stickyItems: List<JsonElement> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class CategoryRiotResponseItemsBumpSettings(
	val canBumpItem: Boolean = false,
	val canBumpItemGlobally: Boolean = false,
	val shortErrorPhrase: JsonElement = JsonNull,
	val errorPhrase: JsonElement = JsonNull,
)

@Serializable
data class CategoryRiotResponseItemsValorantInventory(
	val WeaponSkins: List<String> = emptyList(),
	val Agent: List<String> = emptyList(),
	val Buddy: List<String> = emptyList(),
)

@Serializable
data class CategoryRiotResponseItemsLolInventory(
	val Champion: List<Long> = emptyList(),
	val Skin: List<Long> = emptyList(),
)

@Serializable
data class CategoryRiotResponseItemsAccountLinks(
	val link: String = "",
	val text: String = "",
	val iconClass: String = "",
)

@Serializable
data class CategoryRiotResponseItemsSeller(
	@SerialName("user_id")
	val userId: Double = 0.0,
	@SerialName("sold_items_count")
	val soldItemsCount: Double = 0.0,
	@SerialName("active_items_count")
	val activeItemsCount: Double = 0.0,
	@SerialName("restore_data")
	val restoreData: String = "",
	val username: String = "",
	@SerialName("avatar_date")
	val avatarDate: Double = 0.0,
	@SerialName("is_banned")
	val isBanned: Double = 0.0,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Double = 0.0,
	@SerialName("restore_percents")
	val restorePercents: Double = 0.0,
)

@Serializable
data class CategoryRiotResponseItems(
	@SerialName("item_id")
	val itemId: Double = 0.0,
	@SerialName("item_state")
	val itemState: String = "",
	@SerialName("category_id")
	val categoryId: Double = 0.0,
	@SerialName("published_date")
	val publishedDate: Double = 0.0,
	val title: String = "",
	val description: String = "",
	val price: Double = 0.0,
	@SerialName("update_stat_date")
	val updateStatDate: Double = 0.0,
	@SerialName("refreshed_date")
	val refreshedDate: Double = 0.0,
	@SerialName("edit_date")
	val editDate: Double = 0.0,
	@SerialName("view_count")
	val viewCount: Double = 0.0,
	@SerialName("is_sticky")
	val isSticky: Double = 0.0,
	@SerialName("item_origin")
	val itemOrigin: String = "",
	@SerialName("extended_guarantee")
	val extendedGuarantee: Double = 0.0,
	val nsb: Double = 0.0,
	@SerialName("allow_ask_discount")
	val allowAskDiscount: Double = 0.0,
	@SerialName("title_en")
	val titleEn: String = "",
	@SerialName("description_en")
	val descriptionEn: String = "",
	@SerialName("email_type")
	val emailType: String = "",
	@SerialName("email_provider")
	val emailProvider: String = "",
	@SerialName("item_domain")
	val itemDomain: String = "",
	@SerialName("resale_item_origin")
	val resaleItemOrigin: String = "",
	@SerialName("riot_item_id")
	val riotItemId: Double = 0.0,
	@SerialName("riot_id")
	val riotId: String = "",
	@SerialName("riot_account_verified")
	val riotAccountVerified: Double = 0.0,
	@SerialName("riot_email_verified")
	val riotEmailVerified: Double = 0.0,
	@SerialName("riot_country")
	val riotCountry: String = "",
	@SerialName("riot_password_change")
	val riotPasswordChange: Double = 0.0,
	@SerialName("riot_phone_verified")
	val riotPhoneVerified: Double = 0.0,
	@SerialName("riot_last_activity")
	val riotLastActivity: Double = 0.0,
	@SerialName("riot_valorant_wallet_vp")
	val riotValorantWalletVp: Double = 0.0,
	@SerialName("riot_valorant_wallet_rp")
	val riotValorantWalletRp: Double = 0.0,
	@SerialName("riot_valorant_wallet_fa")
	val riotValorantWalletFa: Double = 0.0,
	@SerialName("riot_valorant_level")
	val riotValorantLevel: Double = 0.0,
	@SerialName("riot_username")
	val riotUsername: String = "",
	@SerialName("riot_valorant_rank")
	val riotValorantRank: Double = 0.0,
	@SerialName("riot_valorant_region")
	val riotValorantRegion: String = "",
	@SerialName("riot_valorant_skin_count")
	val riotValorantSkinCount: Double = 0.0,
	@SerialName("riot_valorant_agent_count")
	val riotValorantAgentCount: Double = 0.0,
	@SerialName("riot_valorant_previous_rank")
	val riotValorantPreviousRank: Double = 0.0,
	@SerialName("riot_valorant_last_rank")
	val riotValorantLastRank: Double = 0.0,
	@SerialName("riot_valorant_rank_type")
	val riotValorantRankType: String = "",
	@SerialName("riot_valorant_inventory_value")
	val riotValorantInventoryValue: Double = 0.0,
	@SerialName("riot_valorant_knife")
	val riotValorantKnife: Double = 0.0,
	@SerialName("riot_lol_region")
	val riotLolRegion: String = "",
	@SerialName("riot_lol_skin_count")
	val riotLolSkinCount: Double = 0.0,
	@SerialName("riot_lol_champion_count")
	val riotLolChampionCount: Double = 0.0,
	@SerialName("riot_lol_level")
	val riotLolLevel: Double = 0.0,
	@SerialName("riot_lol_wallet_blue")
	val riotLolWalletBlue: Double = 0.0,
	@SerialName("riot_lol_wallet_orange")
	val riotLolWalletOrange: Double = 0.0,
	@SerialName("riot_lol_wallet_mythic")
	val riotLolWalletMythic: Double = 0.0,
	@SerialName("riot_lol_wallet_riot")
	val riotLolWalletRiot: Double = 0.0,
	@SerialName("riot_lol_rank")
	val riotLolRank: String = "",
	@SerialName("riot_lol_rank_win_rate")
	val riotLolRankWinRate: Double = 0.0,
	@SerialName("feedback_data")
	val feedbackData: String = "",
	val isIgnored: Boolean = false,
	val priceWithSellerFee: Double = 0.0,
	val guarantee: JsonElement = JsonNull,
	val canViewLoginData: Boolean = false,
	val canUpdateItemStats: Boolean = false,
	val canReportItem: Boolean = false,
	val canViewEmailLoginData: Boolean = false,
	val showGetEmailCodeButton: Boolean = false,
	val canOpenItem: Boolean = false,
	val canCloseItem: Boolean = false,
	val canEditItem: Boolean = false,
	val canDeleteItem: Boolean = false,
	val canStickItem: Boolean = false,
	val canUnstickItem: Boolean = false,
	val bumpSettings: CategoryRiotResponseItemsBumpSettings = CategoryRiotResponseItemsBumpSettings(),
	val canBumpItem: Boolean = false,
	val canBuyItem: Boolean = false,
	@SerialName("rub_price")
	val rubPrice: Double = 0.0,
	@SerialName("price_currency")
	val priceCurrency: String = "",
	val canValidateAccount: Boolean = false,
	val canResellItemAfterPurchase: Boolean = false,
	val valorantRegionPhrase: String = "",
	val valorantRankTitle: String = "",
	val valorantRankImgPath: String = "",
	val valorantPreviousRankTitle: String = "",
	val valorantLastRankTitle: String = "",
	val lolRegionPhrase: String = "",
	val isSmallExf: Boolean = false,
	@SerialName("account_last_activity")
	val accountLastActivity: Double = 0.0,
	val valorantInventory: CategoryRiotResponseItemsValorantInventory = CategoryRiotResponseItemsValorantInventory(),
	val lolInventory: CategoryRiotResponseItemsLolInventory = CategoryRiotResponseItemsLolInventory(),
	val canViewAccountLink: Boolean = false,
	val accountLinks: List<CategoryRiotResponseItemsAccountLinks> = emptyList(),
	val accountLink: String = "",
	val emailLoginUrl: String = "",
	val canChangePassword: Boolean = false,
	val itemOriginPhrase: String = "",
	@SerialName("sold_items_category_count")
	val soldItemsCategoryCount: Double = 0.0,
	@SerialName("restore_items_category_count")
	val restoreItemsCategoryCount: Double = 0.0,
	val tags: List<JsonElement> = emptyList(),
	@SerialName("note_text")
	val noteText: JsonElement = JsonNull,
	val hasPendingAutoBuy: Boolean = false,
	val descriptionHtml: String = "",
	val descriptionEnHtml: String = "",
	val descriptionPlain: String = "",
	val descriptionEnPlain: String = "",
	val seller: CategoryRiotResponseItemsSeller = CategoryRiotResponseItemsSeller(),
)

@Serializable
data class CategoryTelegramParams(
    /** The number of the page to display results from. */
	val page: Long? = null,
    /** Minimal price of account (Inclusive). */
	val pmin: Long? = null,
    /** Maximum price of account (Inclusive). */
	val pmax: Long? = null,
    /** The word or words contained in the account title. */
	val title: String? = null,
    /** Order by. */
	@SerialName("order_by")
	val orderBy: OrderBy? = null,
    /** List of tag ids (Tag list is available via GET /me). */
	@SerialName("tag_id[]")
	val tagId: List<Long>? = null,
    /** List of tag ids that won't be included (Tag list is available via GET /me). */
	@SerialName("not_tag_id[]")
	val notTagId: List<Long>? = null,
    /** List of tag ids (Tag list is available via GET /me). */
	@SerialName("public_tag_id[]")
	val publicTagId: List<Long>? = null,
    /** List of tag ids that won't be included (Tag list is available via GET /me). */
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Long>? = null,
    /** List of account origins. */
	@SerialName("origin[]")
	val origin: JsonElement? = null,
    /** List of account origins that won't be included. */
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
    /** Search accounts of user. */
	@SerialName("user_id")
	val userId: Long? = null,
    /** Not sold before. */
	val nsb: Boolean? = null,
    /** Sold before. */
	val sb: Boolean? = null,
    /** Not sold by me before. */
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
    /** Sold by me before. */
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
    /** Currency in which the cost of the account will be searched. */
	val currency: Currency? = null,
    /** Has email login data. */
	@SerialName("email_login_data")
	val emailLoginData: Boolean? = null,
    /** Email provider. */
	@SerialName("email_provider[]")
	val emailProvider: JsonElement? = null,
    /** Email provider. */
	@SerialName("not_email_provider[]")
	val notEmailProvider: NotEmailProvider? = null,
    /** Parse same item ids. */
	@SerialName("parse_same_item_ids")
	val parseSameItemIds: Boolean? = null,
    /** Has a spam ban. */
	val spam: Spam? = null,
    /** Has a cloud password. */
	val password: Password? = null,
    /** Has a premium subscription. */
	val premium: Premium? = null,
    /** When premium subscription will be active */
	@SerialName("premium_expiration")
	val premiumExpiration: Long? = null,
    /** In what notation is time measured */
	@SerialName("premium_expiration_period")
	val premiumExpirationPeriod: PremiumExpirationPeriod? = null,
    /** List of allowed countries. */
	@SerialName("country[]")
	val country: List<String>? = null,
    /** List of disallowed countries. */
	@SerialName("not_country[]")
	val notCountry: List<String>? = null,
    /** Number of days the account has been offline. */
	val daybreak: Long? = null,
    /** Minimum number of channels. */
	@SerialName("min_channels")
	val minChannels: Long? = null,
    /** Maximum number of channels. */
	@SerialName("max_channels")
	val maxChannels: Long? = null,
    /** Minimum number of chats. */
	@SerialName("min_chats")
	val minChats: Long? = null,
    /** Maximum number of chats. */
	@SerialName("max_chats")
	val maxChats: Long? = null,
    /** Minimum number of conversations. */
	@SerialName("min_conversations")
	val minConversations: Long? = null,
    /** Maximum number of conversations. */
	@SerialName("max_conversations")
	val maxConversations: Long? = null,
    /** Minimum number of channels, where account is administrator/owner. */
	@SerialName("min_admin")
	val minAdmin: Long? = null,
    /** Maximum number of channels, where account is administrator/owner. */
	@SerialName("max_admin")
	val maxAdmin: Long? = null,
    /** Minimum number of subscribers in channel, where account is administrator/owner. */
	@SerialName("min_admin_sub")
	val minAdminSub: Long? = null,
    /** Maximum number of subscribers in channel, where account is administrator/owner. */
	@SerialName("max_admin_sub")
	val maxAdminSub: Long? = null,
    /** Minimum number of digits in ID. */
	@SerialName("dig_min")
	val digMin: Long? = null,
    /** Maximum number of digits in ID. */
	@SerialName("dig_max")
	val digMax: Long? = null,
    /** Minimum number of contacts. */
	@SerialName("min_contacts")
	val minContacts: Long? = null,
    /** Maximum number of contacts. */
	@SerialName("max_contacts")
	val maxContacts: Long? = null,
    /** Minimum number of Telegram Stars. */
	@SerialName("min_stars")
	val minStars: Long? = null,
    /** Maximum number of Telegram Stars. */
	@SerialName("max_stars")
	val maxStars: Long? = null,
    /** Birthday was X time before. */
	val birthday: Long? = null,
    /** In what notation is time measured. */
	@SerialName("birthday_period")
	val birthdayPeriod: BirthdayPeriod? = null,
    /** Birthday was X time after. */
	@SerialName("birthday_after")
	val birthdayAfter: Long? = null,
    /** In what notation is time measured. */
	@SerialName("birthday_after_period")
	val birthdayAfterPeriod: BirthdayAfterPeriod? = null,
    /** Minimum ID of account, will be rounded down till nearest 10k. Available if your balance is higher than 100000 RUB. */
	@SerialName("min_id")
	val minId: Long? = null,
    /** Maximum ID of account, will be rounded down till nearest 10k. Available if your balance is higher than 100000 RUB. */
	@SerialName("max_id")
	val maxId: Long? = null,
    /** Allow geo spam block in search with spam=no. */
	@SerialName("allow_geo_spamblock")
	val allowGeoSpamblock: Boolean? = null,
    /** Minimum number of Telegram gifts on account. */
	@SerialName("min_gifts")
	val minGifts: Long? = null,
    /** Maximum number of Telegram gifts on account. */
	@SerialName("max_gifts")
	val maxGifts: Long? = null,
    /** Minimum number of Telegram NFT gifts on account. */
	@SerialName("min_nft_gifts")
	val minNftGifts: Long? = null,
    /** Maximum number of Telegram NFT gifts on account. */
	@SerialName("max_nft_gifts")
	val maxNftGifts: Long? = null,
    /** Minimum value of all Stars gifts. */
	@SerialName("min_gifts_stars")
	val minGiftsStars: Long? = null,
    /** Maximum value of all Stars gifts. */
	@SerialName("max_gifts_stars")
	val maxGiftsStars: Long? = null,
    /** Minimum value of all Stars gifts after convert. */
	@SerialName("min_gifts_convert_stars")
	val minGiftsConvertStars: Long? = null,
    /** Maximum value of all Stars gifts after convert. */
	@SerialName("max_gifts_convert_stars")
	val maxGiftsConvertStars: Long? = null,
    /** List of allowed DC ID. */
	@SerialName("dc_id[]")
	val dcId: List<Long>? = null,
    /** List of disallowed DC ID. */
	@SerialName("not_dc_id[]")
	val notDcId: List<Long>? = null,
    /** Has linked email. */
	val email: Email? = null,
    /** Minimum number of bots. */
	@SerialName("min_bots")
	val minBots: Long? = null,
    /** Maximum number of bots. */
	@SerialName("max_bots")
	val maxBots: Long? = null,
    /** Minimum active users in bot. */
	@SerialName("min_bot_active_users")
	val minBotActiveUsers: Long? = null,
    /** Maximum active users in bot. */
	@SerialName("max_bot_active_users")
	val maxBotActiveUsers: Long? = null,
)

@Serializable
data class CategoryTelegramResponse(
	val items: List<CategoryTelegramResponseItems> = emptyList(),
	val totalItems: Double = 0.0,
	val totalItemsPrice: JsonElement = JsonNull,
	val hasNextPage: Boolean = false,
	val perPage: Double = 0.0,
	val page: Double = 0.0,
	val wasCached: Boolean = false,
	val cacheTTL: Double = 0.0,
	val lastModified: Double = 0.0,
	val serverTime: Double = 0.0,
	val searchUrl: String = "",
	val stickyItems: List<JsonElement> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class CategoryTelegramResponseItemsBumpSettings(
	val canBumpItem: Boolean = false,
	val canBumpItemGlobally: Boolean = false,
	val shortErrorPhrase: JsonElement = JsonNull,
	val errorPhrase: JsonElement = JsonNull,
)

@Serializable
data class CategoryTelegramResponseItemsTelegramGroupCounters(
	val chats: Double = 0.0,
	val channels: Double = 0.0,
	val conversations: Double = 0.0,
	val admin: Double = 0.0,
)

@Serializable
data class CategoryTelegramResponseItemsSeller(
	@SerialName("user_id")
	val userId: Double = 0.0,
	@SerialName("sold_items_count")
	val soldItemsCount: Double = 0.0,
	@SerialName("active_items_count")
	val activeItemsCount: Double = 0.0,
	@SerialName("restore_data")
	val restoreData: String = "",
	val username: String = "",
	@SerialName("avatar_date")
	val avatarDate: Double = 0.0,
	@SerialName("is_banned")
	val isBanned: Double = 0.0,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Double = 0.0,
	@SerialName("restore_percents")
	val restorePercents: JsonElement = JsonNull,
)

@Serializable
data class CategoryTelegramResponseItems(
	@SerialName("item_id")
	val itemId: Double = 0.0,
	@SerialName("item_state")
	val itemState: String = "",
	@SerialName("category_id")
	val categoryId: Double = 0.0,
	@SerialName("published_date")
	val publishedDate: Double = 0.0,
	val title: String = "",
	val description: String = "",
	val price: Double = 0.0,
	@SerialName("update_stat_date")
	val updateStatDate: Double = 0.0,
	@SerialName("refreshed_date")
	val refreshedDate: Double = 0.0,
	@SerialName("edit_date")
	val editDate: Double = 0.0,
	@SerialName("view_count")
	val viewCount: Double = 0.0,
	@SerialName("is_sticky")
	val isSticky: Double = 0.0,
	@SerialName("item_origin")
	val itemOrigin: String = "",
	@SerialName("extended_guarantee")
	val extendedGuarantee: Double = 0.0,
	val nsb: Double = 0.0,
	@SerialName("allow_ask_discount")
	val allowAskDiscount: Double = 0.0,
	@SerialName("title_en")
	val titleEn: String = "",
	@SerialName("description_en")
	val descriptionEn: String = "",
	@SerialName("email_type")
	val emailType: String = "",
	@SerialName("email_provider")
	val emailProvider: JsonElement = JsonNull,
	@SerialName("item_domain")
	val itemDomain: String = "",
	@SerialName("resale_item_origin")
	val resaleItemOrigin: String = "",
	@SerialName("telegram_item_id")
	val telegramItemId: Double = 0.0,
	@SerialName("telegram_country")
	val telegramCountry: String = "",
	@SerialName("telegram_last_seen")
	val telegramLastSeen: Double = 0.0,
	@SerialName("telegram_premium")
	val telegramPremium: Double = 0.0,
	@SerialName("telegram_stars_count")
	val telegramStarsCount: Double = 0.0,
	@SerialName("telegram_birthday")
	val telegramBirthday: Double = 0.0,
	@SerialName("telegram_password")
	val telegramPassword: Double = 0.0,
	@SerialName("telegram_premium_expires")
	val telegramPremiumExpires: Double = 0.0,
	@SerialName("telegram_spam_block")
	val telegramSpamBlock: JsonElement = JsonNull,
	@SerialName("telegram_channels_count")
	val telegramChannelsCount: Double = 0.0,
	@SerialName("telegram_chats_count")
	val telegramChatsCount: Double = 0.0,
	@SerialName("telegram_admin_count")
	val telegramAdminCount: Double = 0.0,
	@SerialName("telegram_admin_subs_count")
	val telegramAdminSubsCount: Double = 0.0,
	@SerialName("telegram_conversations_count")
	val telegramConversationsCount: Double = 0.0,
	@SerialName("telegram_id_count")
	val telegramIdCount: Double = 0.0,
	@SerialName("telegram_contacts_count")
	val telegramContactsCount: Double = 0.0,
	@SerialName("feedback_data")
	val feedbackData: String = "",
	val isIgnored: Boolean = false,
	val priceWithSellerFee: Double = 0.0,
	val guarantee: JsonElement = JsonNull,
	val canViewLoginData: Boolean = false,
	val canUpdateItemStats: Boolean = false,
	val canReportItem: Boolean = false,
	val canViewEmailLoginData: Boolean = false,
	val showGetEmailCodeButton: Boolean = false,
	val canOpenItem: Boolean = false,
	val canCloseItem: Boolean = false,
	val canEditItem: Boolean = false,
	val canDeleteItem: Boolean = false,
	val canStickItem: Boolean = false,
	val canUnstickItem: Boolean = false,
	val bumpSettings: CategoryTelegramResponseItemsBumpSettings = CategoryTelegramResponseItemsBumpSettings(),
	val canBumpItem: Boolean = false,
	val canBuyItem: Boolean = false,
	@SerialName("rub_price")
	val rubPrice: Double = 0.0,
	@SerialName("price_currency")
	val priceCurrency: String = "",
	val canValidateAccount: Boolean = false,
	val canResellItemAfterPurchase: Boolean = false,
	@SerialName("telegram_group_counters")
	val telegramGroupCounters: CategoryTelegramResponseItemsTelegramGroupCounters = CategoryTelegramResponseItemsTelegramGroupCounters(),
	val canViewAccountLink: Boolean = false,
	val accountLinks: List<JsonElement> = emptyList(),
	val canChangePassword: Boolean = false,
	val itemOriginPhrase: String = "",
	val tags: List<JsonElement> = emptyList(),
	@SerialName("note_text")
	val noteText: JsonElement = JsonNull,
	val hasPendingAutoBuy: Boolean = false,
	val descriptionHtml: String = "",
	val descriptionEnHtml: String = "",
	val descriptionPlain: String = "",
	val descriptionEnPlain: String = "",
	val seller: CategoryTelegramResponseItemsSeller = CategoryTelegramResponseItemsSeller(),
)

@Serializable
data class CategorySupercellParams(
    /** The number of the page to display results from. */
	val page: Long? = null,
    /** Minimal price of account (Inclusive). */
	val pmin: Long? = null,
    /** Maximum price of account (Inclusive). */
	val pmax: Long? = null,
    /** The word or words contained in the account title. */
	val title: String? = null,
    /** Order by. */
	@SerialName("order_by")
	val orderBy: OrderBy? = null,
    /** List of tag ids (Tag list is available via GET /me). */
	@SerialName("tag_id[]")
	val tagId: List<Long>? = null,
    /** List of tag ids that won't be included (Tag list is available via GET /me). */
	@SerialName("not_tag_id[]")
	val notTagId: List<Long>? = null,
    /** List of tag ids (Tag list is available via GET /me). */
	@SerialName("public_tag_id[]")
	val publicTagId: List<Long>? = null,
    /** List of tag ids that won't be included (Tag list is available via GET /me). */
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Long>? = null,
    /** List of account origins. */
	@SerialName("origin[]")
	val origin: JsonElement? = null,
    /** List of account origins that won't be included. */
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
    /** Search accounts of user. */
	@SerialName("user_id")
	val userId: Long? = null,
    /** Not sold before. */
	val nsb: Boolean? = null,
    /** Sold before. */
	val sb: Boolean? = null,
    /** Not sold by me before. */
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
    /** Sold by me before. */
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
    /** Currency in which the cost of the account will be searched. */
	val currency: Currency? = null,
    /** Has email login data. */
	@SerialName("email_login_data")
	val emailLoginData: Boolean? = null,
    /** Email provider. */
	@SerialName("email_provider[]")
	val emailProvider: JsonElement? = null,
    /** Email provider. */
	@SerialName("not_email_provider[]")
	val notEmailProvider: NotEmailProvider? = null,
    /** Parse same item ids. */
	@SerialName("parse_same_item_ids")
	val parseSameItemIds: Boolean? = null,
    /** Number of days the account has been offline. */
	val daybreak: Long? = null,
    /** Email type. */
	@SerialName("email_type[]")
	val emailType: JsonElement? = null,
    /** Domain of native/autoreg email. */
	@SerialName("item_domain")
	val itemDomain: String? = null,
    /** Guarantee type. */
	val eg: CategoryEg3? = null,
    /** Has linked mobile. */
	val tel: Tel? = null,
    /** Minimum Brawl Stars level. */
	@SerialName("brawl_level_min")
	val brawlLevelMin: Long? = null,
    /** Maximum Brawl Stars level. */
	@SerialName("brawl_level_max")
	val brawlLevelMax: Long? = null,
    /** Minimum number of Brawl Stars trophies. */
	@SerialName("brawl_cup_min")
	val brawlCupMin: Long? = null,
    /** Maximum number of Brawl Stars trophies. */
	@SerialName("brawl_cup_max")
	val brawlCupMax: Long? = null,
    /** Minimum number of Brawl Stars wins. */
	@SerialName("brawl_wins_min")
	val brawlWinsMin: Long? = null,
    /** Maximum number of Brawl Stars wins. */
	@SerialName("brawl_wins_max")
	val brawlWinsMax: Long? = null,
    /** Has Brawl Pass. */
	@SerialName("brawl_pass")
	val brawlPass: BrawlPass? = null,
    /** List of brawlers. */
	@SerialName("brawler[]")
	val brawler: JsonElement? = null,
    /** Minimum number of brawlers. */
	@SerialName("brawlers_min")
	val brawlersMin: Long? = null,
    /** Maximum number of brawlers. */
	@SerialName("brawlers_max")
	val brawlersMax: Long? = null,
    /** Minimum number of legendary brawlers. */
	@SerialName("legendary_brawlers_min")
	val legendaryBrawlersMin: Long? = null,
    /** Maximum number of legendary brawlers. */
	@SerialName("legendary_brawlers_max")
	val legendaryBrawlersMax: Long? = null,
    /** Minimum Clash Royale level. */
	@SerialName("royale_level_min")
	val royaleLevelMin: Long? = null,
    /** Maximum Clash Royale level. */
	@SerialName("royale_level_max")
	val royaleLevelMax: Long? = null,
    /** Minimum number of Clash Royale trophies. */
	@SerialName("royale_cup_min")
	val royaleCupMin: Long? = null,
    /** Maximum number of Clash Royale trophies. */
	@SerialName("royale_cup_max")
	val royaleCupMax: Long? = null,
    /** Minimum number of Clash Royale wins. */
	@SerialName("royale_wins_min")
	val royaleWinsMin: Long? = null,
    /** Maximum number of Clash Royale wins. */
	@SerialName("royale_wins_max")
	val royaleWinsMax: Long? = null,
    /** Minimum King level in Clash Royale. */
	@SerialName("king_level_min")
	val kingLevelMin: Long? = null,
    /** Maximum King level in Clash Royale. */
	@SerialName("king_level_max")
	val kingLevelMax: Long? = null,
    /** Has Royale Pass. */
	@SerialName("royale_pass")
	val royalePass: RoyalePass? = null,
    /** Minimum Clash of Clans level. */
	@SerialName("clash_level_min")
	val clashLevelMin: Long? = null,
    /** Maximum Clash of Clans level. */
	@SerialName("clash_level_max")
	val clashLevelMax: Long? = null,
    /** Minimum number of Clash of Clans trophies. */
	@SerialName("clash_cup_min")
	val clashCupMin: Long? = null,
    /** Maximum number of Clash of Clans trophies. */
	@SerialName("clash_cup_max")
	val clashCupMax: Long? = null,
    /** Minimum number of Clash of Clans wins. */
	@SerialName("clash_wins_min")
	val clashWinsMin: Long? = null,
    /** Maximum number of Clash of Clans wins. */
	@SerialName("clash_wins_max")
	val clashWinsMax: Long? = null,
    /** Has Battle Pass. */
	@SerialName("clash_pass")
	val clashPass: ClashPass? = null,
    /** Minimum total heroes level count in Clash of Clans. */
	@SerialName("total_heroes_level_min")
	val totalHeroesLevelMin: Long? = null,
    /** Maximum total heroes level count in Clash of Clans. */
	@SerialName("total_heroes_level_max")
	val totalHeroesLevelMax: Long? = null,
    /** Minimum total troops level count in Clash of Clans. */
	@SerialName("total_troops_level_min")
	val totalTroopsLevelMin: Long? = null,
    /** Maximum total troops level count in Clash of Clans. */
	@SerialName("total_troops_level_max")
	val totalTroopsLevelMax: Long? = null,
    /** Minimum total spells level count in Clash of Clans. */
	@SerialName("total_spells_level_min")
	val totalSpellsLevelMin: Long? = null,
    /** Maximum total spells level count in Clash of Clans. */
	@SerialName("total_spells_level_max")
	val totalSpellsLevelMax: Long? = null,
    /** Minimum total builder village heroes level count in Clash of Clans. */
	@SerialName("total_builder_heroes_level_min")
	val totalBuilderHeroesLevelMin: Long? = null,
    /** Maximum total builder village heroes level count in Clash of Clans. */
	@SerialName("total_builder_heroes_level_max")
	val totalBuilderHeroesLevelMax: Long? = null,
    /** Minimum total builder village troops level count in Clash of Clans. */
	@SerialName("total_builder_troops_level_min")
	val totalBuilderTroopsLevelMin: Long? = null,
    /** Maximum total builder village troops level count in Clash of Clans. */
	@SerialName("total_builder_troops_level_max")
	val totalBuilderTroopsLevelMax: Long? = null,
    /** Minimum level of town hall. */
	@SerialName("town_hall_level_min")
	val townHallLevelMin: Long? = null,
    /** Maximum level of town hall. */
	@SerialName("town_hall_level_max")
	val townHallLevelMax: Long? = null,
    /** Minimum level of builder hall. */
	@SerialName("builder_hall_level_min")
	val builderHallLevelMin: Long? = null,
    /** Maximum level of builder hall. */
	@SerialName("builder_hall_level_max")
	val builderHallLevelMax: Long? = null,
    /** Minimum number of builder hall cups. */
	@SerialName("builder_hall_cup_min")
	val builderHallCupMin: Long? = null,
    /** Maximum number of builder hall cups. */
	@SerialName("builder_hall_cup_max")
	val builderHallCupMax: Long? = null,
    /** Minimum account creation year (e.g. 2023). */
	@SerialName("creation_year_min")
	val creationYearMin: Long? = null,
    /** Maximum account creation year (e.g. 2024). */
	@SerialName("creation_year_max")
	val creationYearMax: Long? = null,
)

@Serializable
data class CategorySupercellResponse(
	val items: List<CategorySupercellResponseItems> = emptyList(),
	val totalItems: Double = 0.0,
	val totalItemsPrice: JsonElement = JsonNull,
	val hasNextPage: Boolean = false,
	val perPage: Double = 0.0,
	val page: Double = 0.0,
	val wasCached: Boolean = false,
	val cacheTTL: Double = 0.0,
	val lastModified: Double = 0.0,
	val serverTime: Double = 0.0,
	val searchUrl: String = "",
	val stickyItems: List<JsonElement> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class CategorySupercellResponseItemsBumpSettings(
	val canBumpItem: Boolean = false,
	val canBumpItemGlobally: Boolean = false,
	val shortErrorPhrase: JsonElement = JsonNull,
	val errorPhrase: JsonElement = JsonNull,
)

@Serializable
data class CategorySupercellResponseItemsAccountLinks(
	val link: String = "",
	val text: String = "",
	val iconClass: String = "",
)

@Serializable
data class CategorySupercellResponseItemsSeller(
	@SerialName("user_id")
	val userId: Double = 0.0,
	@SerialName("sold_items_count")
	val soldItemsCount: Double = 0.0,
	@SerialName("active_items_count")
	val activeItemsCount: Double = 0.0,
	@SerialName("restore_data")
	val restoreData: String = "",
	val username: String = "",
	@SerialName("avatar_date")
	val avatarDate: Double = 0.0,
	@SerialName("is_banned")
	val isBanned: Double = 0.0,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Double = 0.0,
	@SerialName("restore_percents")
	val restorePercents: JsonElement = JsonNull,
)

@Serializable
data class CategorySupercellResponseItems(
	@SerialName("item_id")
	val itemId: Double = 0.0,
	@SerialName("item_state")
	val itemState: String = "",
	@SerialName("category_id")
	val categoryId: Double = 0.0,
	@SerialName("published_date")
	val publishedDate: Double = 0.0,
	val title: String = "",
	val description: String = "",
	val price: Double = 0.0,
	@SerialName("update_stat_date")
	val updateStatDate: Double = 0.0,
	@SerialName("refreshed_date")
	val refreshedDate: Double = 0.0,
	@SerialName("edit_date")
	val editDate: Double = 0.0,
	@SerialName("view_count")
	val viewCount: Double = 0.0,
	@SerialName("is_sticky")
	val isSticky: Double = 0.0,
	@SerialName("item_origin")
	val itemOrigin: String = "",
	@SerialName("extended_guarantee")
	val extendedGuarantee: Double = 0.0,
	val nsb: Double = 0.0,
	@SerialName("allow_ask_discount")
	val allowAskDiscount: Double = 0.0,
	@SerialName("title_en")
	val titleEn: String = "",
	@SerialName("description_en")
	val descriptionEn: String = "",
	@SerialName("email_type")
	val emailType: String = "",
	@SerialName("email_provider")
	val emailProvider: String = "",
	@SerialName("item_domain")
	val itemDomain: String = "",
	@SerialName("resale_item_origin")
	val resaleItemOrigin: String = "",
	@SerialName("supercell_item_id")
	val supercellItemId: Double = 0.0,
	@SerialName("supercell_id")
	val supercellId: String = "",
	@SerialName("supercell_arena")
	val supercellArena: String = "",
	@SerialName("supercell_brawler_count")
	val supercellBrawlerCount: Double = 0.0,
	@SerialName("supercell_last_activity")
	val supercellLastActivity: Double = 0.0,
	@SerialName("supercell_legendary_brawler_count")
	val supercellLegendaryBrawlerCount: Double = 0.0,
	@SerialName("supercell_town_hall_level")
	val supercellTownHallLevel: Double = 0.0,
	@SerialName("supercell_builder_hall_level")
	val supercellBuilderHallLevel: Double = 0.0,
	@SerialName("supercell_builder_hall_cup_count")
	val supercellBuilderHallCupCount: Double = 0.0,
	@SerialName("supercell_phone")
	val supercellPhone: Double = 0.0,
	@SerialName("supercell_laser_level")
	val supercellLaserLevel: Double = 0.0,
	@SerialName("supercell_scroll_level")
	val supercellScrollLevel: Double = 0.0,
	@SerialName("supercell_magic_level")
	val supercellMagicLevel: Double = 0.0,
	@SerialName("supercell_laser_trophies")
	val supercellLaserTrophies: Double = 0.0,
	@SerialName("supercell_scroll_trophies")
	val supercellScrollTrophies: Double = 0.0,
	@SerialName("supercell_magic_trophies")
	val supercellMagicTrophies: Double = 0.0,
	@SerialName("supercell_laser_victories")
	val supercellLaserVictories: Double = 0.0,
	@SerialName("supercell_scroll_victories")
	val supercellScrollVictories: Double = 0.0,
	@SerialName("supercell_magic_victories")
	val supercellMagicVictories: Double = 0.0,
	@SerialName("supercell_laser_battle_pass")
	val supercellLaserBattlePass: Double = 0.0,
	@SerialName("supercell_scroll_battle_pass")
	val supercellScrollBattlePass: Double = 0.0,
	@SerialName("supercell_magic_battle_pass")
	val supercellMagicBattlePass: Double = 0.0,
	@SerialName("supercell_systems")
	val supercellSystems: String = "",
	@SerialName("supercell_king_level")
	val supercellKingLevel: Double = 0.0,
	@SerialName("supercell_total_heroes_level")
	val supercellTotalHeroesLevel: Double = 0.0,
	@SerialName("supercell_total_troops_level")
	val supercellTotalTroopsLevel: Double = 0.0,
	@SerialName("supercell_total_spells_level")
	val supercellTotalSpellsLevel: Double = 0.0,
	@SerialName("supercell_total_builder_heroes_level")
	val supercellTotalBuilderHeroesLevel: Double = 0.0,
	@SerialName("supercell_total_builder_troops_level")
	val supercellTotalBuilderTroopsLevel: Double = 0.0,
	@SerialName("feedback_data")
	val feedbackData: String = "",
	val isIgnored: Boolean = false,
	val priceWithSellerFee: Double = 0.0,
	val guarantee: JsonElement = JsonNull,
	val canViewLoginData: Boolean = false,
	val canUpdateItemStats: Boolean = false,
	val canReportItem: Boolean = false,
	val canViewEmailLoginData: Boolean = false,
	val showGetEmailCodeButton: Boolean = false,
	val canOpenItem: Boolean = false,
	val canCloseItem: Boolean = false,
	val canEditItem: Boolean = false,
	val canDeleteItem: Boolean = false,
	val canStickItem: Boolean = false,
	val canUnstickItem: Boolean = false,
	val bumpSettings: CategorySupercellResponseItemsBumpSettings = CategorySupercellResponseItemsBumpSettings(),
	val canBumpItem: Boolean = false,
	val canBuyItem: Boolean = false,
	@SerialName("rub_price")
	val rubPrice: Double = 0.0,
	@SerialName("price_currency")
	val priceCurrency: String = "",
	val canValidateAccount: Boolean = false,
	val canResellItemAfterPurchase: Boolean = false,
	val isSmallExf: Boolean = false,
	val supercellBrawlers: List<JsonElement> = emptyList(),
	val canViewAccountLink: Boolean = false,
	val accountLinks: List<CategorySupercellResponseItemsAccountLinks> = emptyList(),
	val accountLink: String = "",
	val emailLoginUrl: String = "",
	val canChangePassword: Boolean = false,
	val itemOriginPhrase: String = "",
	val tags: List<JsonElement> = emptyList(),
	@SerialName("note_text")
	val noteText: JsonElement = JsonNull,
	val hasPendingAutoBuy: Boolean = false,
	val descriptionHtml: String = "",
	val descriptionEnHtml: String = "",
	val descriptionPlain: String = "",
	val descriptionEnPlain: String = "",
	val seller: CategorySupercellResponseItemsSeller = CategorySupercellResponseItemsSeller(),
)

@Serializable
data class CategoryEaParams(
    /** The number of the page to display results from. */
	val page: Long? = null,
    /** Minimal price of account (Inclusive). */
	val pmin: Long? = null,
    /** Maximum price of account (Inclusive). */
	val pmax: Long? = null,
    /** The word or words contained in the account title. */
	val title: String? = null,
    /** Order by. */
	@SerialName("order_by")
	val orderBy: OrderBy? = null,
    /** List of tag ids (Tag list is available via GET /me). */
	@SerialName("tag_id[]")
	val tagId: List<Long>? = null,
    /** List of tag ids that won't be included (Tag list is available via GET /me). */
	@SerialName("not_tag_id[]")
	val notTagId: List<Long>? = null,
    /** List of tag ids (Tag list is available via GET /me). */
	@SerialName("public_tag_id[]")
	val publicTagId: List<Long>? = null,
    /** List of tag ids that won't be included (Tag list is available via GET /me). */
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Long>? = null,
    /** List of account origins. */
	@SerialName("origin[]")
	val origin: JsonElement? = null,
    /** List of account origins that won't be included. */
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
    /** Search accounts of user. */
	@SerialName("user_id")
	val userId: Long? = null,
    /** Not sold before. */
	val nsb: Boolean? = null,
    /** Sold before. */
	val sb: Boolean? = null,
    /** Not sold by me before. */
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
    /** Sold by me before. */
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
    /** Currency in which the cost of the account will be searched. */
	val currency: Currency? = null,
    /** Has email login data. */
	@SerialName("email_login_data")
	val emailLoginData: Boolean? = null,
    /** Email provider. */
	@SerialName("email_provider[]")
	val emailProvider: JsonElement? = null,
    /** Email provider. */
	@SerialName("not_email_provider[]")
	val notEmailProvider: NotEmailProvider? = null,
    /** Parse same item ids. */
	@SerialName("parse_same_item_ids")
	val parseSameItemIds: Boolean? = null,
    /** Email type. */
	@SerialName("email_type[]")
	val emailType: JsonElement? = null,
    /** Domain of native/autoreg email. */
	@SerialName("item_domain")
	val itemDomain: String? = null,
    /** List of games. */
	@SerialName("game[]")
	val game: List<String>? = null,
    /** List of allowed countries. */
	@SerialName("country[]")
	val country: List<String>? = null,
    /** List of disallowed countries. */
	@SerialName("not_country[]")
	val notCountry: List<String>? = null,
    /** Minimum count of games. */
	val gmin: Long? = null,
    /** Maximum count of games. */
	val gmax: Long? = null,
    /** Minimum rank points in Apex Legends. */
	@SerialName("al_rank_min")
	val alRankMin: Long? = null,
    /** Maximum rank points in Apex Legends. */
	@SerialName("al_rank_max")
	val alRankMax: Long? = null,
    /** Minimum level in Apex Legends. */
	@SerialName("al_level_min")
	val alLevelMin: Long? = null,
    /** Maximum level in Apex Legends. */
	@SerialName("al_level_max")
	val alLevelMax: Long? = null,
    /** Has a ban in any game. */
	@SerialName("has_ban")
	val hasBan: HasBan? = null,
    /** Xbox connected to account. */
	@SerialName("xbox_connected")
	val xboxConnected: XboxConnected? = null,
    /** Steam connected to account. */
	@SerialName("steam_connected")
	val steamConnected: SteamConnected? = null,
    /** PSN connected to account. */
	@SerialName("psn_connected")
	val psnConnected: PsnConnected? = null,
    /** Name of subscription. */
	val subscription: CategorySubscription1? = null,
    /** Length of subscription. */
	@SerialName("subscription_length")
	val subscriptionLength: Long? = null,
    /** In what notation is time measured. */
	@SerialName("subscription_period")
	val subscriptionPeriod: SubscriptionPeriod? = null,
    /** List of minimum hours played by game. */
	@SerialName("hours_played")
	val hoursPlayed: Map<String, Long>? = null,
    /** List of maximum hours played by game. */
	@SerialName("hours_played_max")
	val hoursPlayedMax: Map<String, Long>? = null,
    /** Has transactions. */
	val transactions: Transactions? = null,
)

@Serializable
data class CategoryEaResponse(
	val items: List<CategoryEaResponseItems> = emptyList(),
	val totalItems: Double = 0.0,
	val totalItemsPrice: JsonElement = JsonNull,
	val hasNextPage: Boolean = false,
	val perPage: Double = 0.0,
	val page: Double = 0.0,
	val wasCached: Boolean = false,
	val cacheTTL: Double = 0.0,
	val lastModified: Double = 0.0,
	val serverTime: Double = 0.0,
	val searchUrl: String = "",
	val stickyItems: List<JsonElement> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class CategoryEaResponseItemsEaGamesApexLegends(
	@SerialName("game_id")
	val gameId: String = "",
	val title: String = "",
	@SerialName("last_activity")
	val lastActivity: Double = 0.0,
	@SerialName("total_played")
	val totalPlayed: Double = 0.0,
	val img: String = "",
)

@Serializable
data class CategoryEaResponseItemsEaGames(
	@SerialName("apex-legends")
	val apexLegends: CategoryEaResponseItemsEaGamesApexLegends = CategoryEaResponseItemsEaGamesApexLegends(),
)

@Serializable
data class CategoryEaResponseItemsBumpSettings(
	val canBumpItem: Boolean = false,
	val canBumpItemGlobally: Boolean = false,
	val shortErrorPhrase: JsonElement = JsonNull,
	val errorPhrase: JsonElement = JsonNull,
)

@Serializable
data class CategoryEaResponseItemsAccountLinks(
	val link: String = "",
	val text: String = "",
	val iconClass: String = "",
)

@Serializable
data class CategoryEaResponseItemsSeller(
	@SerialName("user_id")
	val userId: Double = 0.0,
	@SerialName("sold_items_count")
	val soldItemsCount: Double = 0.0,
	@SerialName("active_items_count")
	val activeItemsCount: Double = 0.0,
	@SerialName("restore_data")
	val restoreData: String = "",
	val username: String = "",
	@SerialName("avatar_date")
	val avatarDate: Double = 0.0,
	@SerialName("is_banned")
	val isBanned: Double = 0.0,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Double = 0.0,
	@SerialName("restore_percents")
	val restorePercents: Double = 0.0,
)

@Serializable
data class CategoryEaResponseItems(
	@SerialName("item_id")
	val itemId: Double = 0.0,
	@SerialName("item_state")
	val itemState: String = "",
	@SerialName("category_id")
	val categoryId: Double = 0.0,
	@SerialName("published_date")
	val publishedDate: Double = 0.0,
	val title: String = "",
	val description: String = "",
	val price: Double = 0.0,
	@SerialName("update_stat_date")
	val updateStatDate: Double = 0.0,
	@SerialName("refreshed_date")
	val refreshedDate: Double = 0.0,
	@SerialName("edit_date")
	val editDate: Double = 0.0,
	@SerialName("view_count")
	val viewCount: Double = 0.0,
	@SerialName("is_sticky")
	val isSticky: Double = 0.0,
	@SerialName("item_origin")
	val itemOrigin: String = "",
	@SerialName("extended_guarantee")
	val extendedGuarantee: Double = 0.0,
	val nsb: Double = 0.0,
	@SerialName("allow_ask_discount")
	val allowAskDiscount: Double = 0.0,
	@SerialName("title_en")
	val titleEn: String = "",
	@SerialName("description_en")
	val descriptionEn: String = "",
	@SerialName("email_type")
	val emailType: String = "",
	@SerialName("email_provider")
	val emailProvider: String = "",
	@SerialName("item_domain")
	val itemDomain: String = "",
	@SerialName("resale_item_origin")
	val resaleItemOrigin: String = "",
	@SerialName("ea_item_id")
	val eaItemId: Double = 0.0,
	@SerialName("ea_id")
	val eaId: Double = 0.0,
	@SerialName("ea_country")
	val eaCountry: String = "",
	@SerialName("ea_games")
	val eaGames: CategoryEaResponseItemsEaGames = CategoryEaResponseItemsEaGames(),
	@SerialName("ea_game_count")
	val eaGameCount: Double = 0.0,
	@SerialName("ea_last_activity")
	val eaLastActivity: Double = 0.0,
	@SerialName("ea_al_level")
	val eaAlLevel: Double = 0.0,
	@SerialName("ea_al_rank_score")
	val eaAlRankScore: Double = 0.0,
	@SerialName("ea_subscription")
	val eaSubscription: String = "",
	@SerialName("ea_subscription_end_date")
	val eaSubscriptionEndDate: Double = 0.0,
	@SerialName("ea_username")
	val eaUsername: String = "",
	@SerialName("ea_xbox_connected")
	val eaXboxConnected: Double = 0.0,
	@SerialName("ea_steam_connected")
	val eaSteamConnected: Double = 0.0,
	@SerialName("ea_psn_connected")
	val eaPsnConnected: Double = 0.0,
	@SerialName("ea_bans")
	val eaBans: List<JsonElement> = emptyList(),
	@SerialName("ea_has_ban")
	val eaHasBan: Double = 0.0,
	@SerialName("feedback_data")
	val feedbackData: String = "",
	val isIgnored: Boolean = false,
	val priceWithSellerFee: Double = 0.0,
	val guarantee: JsonElement = JsonNull,
	val canViewLoginData: Boolean = false,
	val canUpdateItemStats: Boolean = false,
	val canReportItem: Boolean = false,
	val canViewEmailLoginData: Boolean = false,
	val showGetEmailCodeButton: Boolean = false,
	val canOpenItem: Boolean = false,
	val canCloseItem: Boolean = false,
	val canEditItem: Boolean = false,
	val canDeleteItem: Boolean = false,
	val canStickItem: Boolean = false,
	val canUnstickItem: Boolean = false,
	val bumpSettings: CategoryEaResponseItemsBumpSettings = CategoryEaResponseItemsBumpSettings(),
	val canBumpItem: Boolean = false,
	val canBuyItem: Boolean = false,
	@SerialName("rub_price")
	val rubPrice: Double = 0.0,
	@SerialName("price_currency")
	val priceCurrency: String = "",
	val canValidateAccount: Boolean = false,
	val canResellItemAfterPurchase: Boolean = false,
	val canViewAccountLink: Boolean = false,
	val accountLinks: List<CategoryEaResponseItemsAccountLinks> = emptyList(),
	val accountLink: String = "",
	val emailLoginUrl: String = "",
	val canChangePassword: Boolean = false,
	val itemOriginPhrase: String = "",
	@SerialName("sold_items_category_count")
	val soldItemsCategoryCount: Double = 0.0,
	@SerialName("restore_items_category_count")
	val restoreItemsCategoryCount: Double = 0.0,
	val tags: List<JsonElement> = emptyList(),
	@SerialName("note_text")
	val noteText: JsonElement = JsonNull,
	val hasPendingAutoBuy: Boolean = false,
	val descriptionHtml: String = "",
	val descriptionEnHtml: String = "",
	val descriptionPlain: String = "",
	val descriptionEnPlain: String = "",
	val seller: CategoryEaResponseItemsSeller = CategoryEaResponseItemsSeller(),
)

@Serializable
data class CategoryWotParams(
    /** The number of the page to display results from. */
	val page: Long? = null,
    /** Minimal price of account (Inclusive). */
	val pmin: Long? = null,
    /** Maximum price of account (Inclusive). */
	val pmax: Long? = null,
    /** The word or words contained in the account title. */
	val title: String? = null,
    /** Order by. */
	@SerialName("order_by")
	val orderBy: OrderBy? = null,
    /** List of tag ids (Tag list is available via GET /me). */
	@SerialName("tag_id[]")
	val tagId: List<Long>? = null,
    /** List of tag ids that won't be included (Tag list is available via GET /me). */
	@SerialName("not_tag_id[]")
	val notTagId: List<Long>? = null,
    /** List of tag ids (Tag list is available via GET /me). */
	@SerialName("public_tag_id[]")
	val publicTagId: List<Long>? = null,
    /** List of tag ids that won't be included (Tag list is available via GET /me). */
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Long>? = null,
    /** List of account origins. */
	@SerialName("origin[]")
	val origin: JsonElement? = null,
    /** List of account origins that won't be included. */
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
    /** Search accounts of user. */
	@SerialName("user_id")
	val userId: Long? = null,
    /** Not sold before. */
	val nsb: Boolean? = null,
    /** Sold before. */
	val sb: Boolean? = null,
    /** Not sold by me before. */
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
    /** Sold by me before. */
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
    /** Currency in which the cost of the account will be searched. */
	val currency: Currency? = null,
    /** Has email login data. */
	@SerialName("email_login_data")
	val emailLoginData: Boolean? = null,
    /** Email provider. */
	@SerialName("email_provider[]")
	val emailProvider: JsonElement? = null,
    /** Email provider. */
	@SerialName("not_email_provider[]")
	val notEmailProvider: NotEmailProvider? = null,
    /** Parse same item ids. */
	@SerialName("parse_same_item_ids")
	val parseSameItemIds: Boolean? = null,
    /** Email type. */
	@SerialName("email_type[]")
	val emailType: JsonElement? = null,
    /** Domain of native/autoreg email. */
	@SerialName("item_domain")
	val itemDomain: String? = null,
    /** Has linked mobile. */
	val tel: Tel? = null,
    /** Number of days the account has been offline. */
	val daybreak: Long? = null,
    /** Minimum number of battles. */
	@SerialName("battles_min")
	val battlesMin: Long? = null,
    /** Maximum number of battles. */
	@SerialName("battles_max")
	val battlesMax: Long? = null,
    /** Minimum number of gold. */
	@SerialName("gold_min")
	val goldMin: Long? = null,
    /** Maximum number of gold. */
	@SerialName("gold_max")
	val goldMax: Long? = null,
    /** Minimum number of silver. */
	@SerialName("silver_min")
	val silverMin: Long? = null,
    /** Maximum number of silver. */
	@SerialName("silver_max")
	val silverMax: Long? = null,
    /** Minimum number of top tanks. */
	@SerialName("top_min")
	val topMin: Long? = null,
    /** Maximum number of top tanks. */
	@SerialName("top_max")
	val topMax: Long? = null,
    /** Minimum number of premium tanks. */
	@SerialName("prem_min")
	val premMin: Long? = null,
    /** Maximum number of premium tanks. */
	@SerialName("prem_max")
	val premMax: Long? = null,
    /** Minimum number of top premium tanks. */
	@SerialName("top_prem_min")
	val topPremMin: Long? = null,
    /** Maximum number of top premium tanks. */
	@SerialName("top_prem_max")
	val topPremMax: Long? = null,
    /** Minimum number of wins. */
	@SerialName("win_pmin")
	val winPmin: Long? = null,
    /** Maximum number of wins. */
	@SerialName("win_pmax")
	val winPmax: Long? = null,
    /** List of tanks. */
	@SerialName("tank[]")
	val tank: List<Long>? = null,
    /** Region. */
	@SerialName("region[]")
	val region: JsonElement? = null,
    /** Exclude region. */
	@SerialName("not_region[]")
	val notRegion: JsonElement? = null,
    /** Has a premium subscription. */
	val premium: Premium? = null,
    /** When premium subscription will be active */
	@SerialName("premium_expiration")
	val premiumExpiration: Long? = null,
    /** In what notation is time measured */
	@SerialName("premium_expiration_period")
	val premiumExpirationPeriod: PremiumExpirationPeriod? = null,
    /** Has clan. */
	val clan: Clan? = null,
    /** List of allowed clan role. */
	@SerialName("clan_role[]")
	val clanRole: JsonElement? = null,
    /** List of disallowed clan role. */
	@SerialName("not_clan_role[]")
	val notClanRole: JsonElement? = null,
    /** Minimum number of gold in clan treasure. */
	@SerialName("clan_gold_min")
	val clanGoldMin: Long? = null,
    /** Maximum number of gold in clan treasure. */
	@SerialName("clan_gold_max")
	val clanGoldMax: Long? = null,
    /** Minimum number of credits in clan treasure. */
	@SerialName("clan_credits_min")
	val clanCreditsMin: Long? = null,
    /** Maximum number of credits in clan treasure. */
	@SerialName("clan_credits_max")
	val clanCreditsMax: Long? = null,
    /** Minimum number of crystal in clan treasure. */
	@SerialName("clan_crystal_min")
	val clanCrystalMin: Long? = null,
    /** Maximum number of crystal in clan treasure. */
	@SerialName("clan_crystal_max")
	val clanCrystalMax: Long? = null,
    /** List of allowed countries. */
	@SerialName("country[]")
	val country: List<String>? = null,
    /** List of disallowed countries. */
	@SerialName("not_country[]")
	val notCountry: List<String>? = null,
)

@Serializable
data class CategoryWotResponse(
	val items: List<CategoryWotResponseItems> = emptyList(),
	val totalItems: Double = 0.0,
	val totalItemsPrice: JsonElement = JsonNull,
	val hasNextPage: Boolean = false,
	val perPage: Double = 0.0,
	val page: Double = 0.0,
	val wasCached: Boolean = false,
	val cacheTTL: Double = 0.0,
	val lastModified: Double = 0.0,
	val serverTime: Double = 0.0,
	val searchUrl: String = "",
	val stickyItems: List<JsonElement> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class CategoryWotResponseItemsBumpSettings(
	val canBumpItem: Boolean = false,
	val canBumpItemGlobally: Boolean = false,
	val shortErrorPhrase: JsonElement = JsonNull,
	val errorPhrase: JsonElement = JsonNull,
)

@Serializable
data class CategoryWotResponseItemsSeller(
	@SerialName("user_id")
	val userId: Double = 0.0,
	@SerialName("sold_items_count")
	val soldItemsCount: Double = 0.0,
	@SerialName("active_items_count")
	val activeItemsCount: Double = 0.0,
	@SerialName("restore_data")
	val restoreData: String = "",
	val username: String = "",
	@SerialName("avatar_date")
	val avatarDate: Double = 0.0,
	@SerialName("is_banned")
	val isBanned: Double = 0.0,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Double = 0.0,
	@SerialName("restore_percents")
	val restorePercents: Double = 0.0,
)

@Serializable
data class CategoryWotResponseItems(
	@SerialName("item_id")
	val itemId: Double = 0.0,
	@SerialName("item_state")
	val itemState: String = "",
	@SerialName("category_id")
	val categoryId: Double = 0.0,
	@SerialName("published_date")
	val publishedDate: Double = 0.0,
	val title: String = "",
	val description: String = "",
	val price: Double = 0.0,
	@SerialName("update_stat_date")
	val updateStatDate: Double = 0.0,
	@SerialName("refreshed_date")
	val refreshedDate: Double = 0.0,
	@SerialName("edit_date")
	val editDate: Double = 0.0,
	@SerialName("view_count")
	val viewCount: Double = 0.0,
	@SerialName("is_sticky")
	val isSticky: Double = 0.0,
	@SerialName("item_origin")
	val itemOrigin: String = "",
	@SerialName("extended_guarantee")
	val extendedGuarantee: Double = 0.0,
	val nsb: Double = 0.0,
	@SerialName("allow_ask_discount")
	val allowAskDiscount: Double = 0.0,
	@SerialName("title_en")
	val titleEn: String = "",
	@SerialName("description_en")
	val descriptionEn: String = "",
	@SerialName("email_type")
	val emailType: String = "",
	@SerialName("email_provider")
	val emailProvider: JsonElement = JsonNull,
	@SerialName("item_domain")
	val itemDomain: String = "",
	@SerialName("resale_item_origin")
	val resaleItemOrigin: String = "",
	@SerialName("wot_item_id")
	val wotItemId: Double = 0.0,
	@SerialName("wot_last_activity")
	val wotLastActivity: Double = 0.0,
	@SerialName("wot_register_date")
	val wotRegisterDate: Double = 0.0,
	@SerialName("wot_mobile")
	val wotMobile: Double = 0.0,
	@SerialName("wot_premium")
	val wotPremium: Double = 0.0,
	@SerialName("wot_premium_expires")
	val wotPremiumExpires: Double = 0.0,
	@SerialName("wot_gold")
	val wotGold: Double = 0.0,
	@SerialName("wot_credits")
	val wotCredits: Double = 0.0,
	@SerialName("wot_battle_count")
	val wotBattleCount: Double = 0.0,
	@SerialName("wot_win_count")
	val wotWinCount: Double = 0.0,
	@SerialName("wot_loss_count")
	val wotLossCount: Double = 0.0,
	@SerialName("wot_win_count_percents")
	val wotWinCountPercents: Double = 0.0,
	@SerialName("wot_top_tanks")
	val wotTopTanks: Double = 0.0,
	@SerialName("wot_premium_tanks")
	val wotPremiumTanks: Double = 0.0,
	@SerialName("wot_top_premium_tanks")
	val wotTopPremiumTanks: Double = 0.0,
	@SerialName("wot_region")
	val wotRegion: String = "",
	@SerialName("wot_blitz")
	val wotBlitz: Double = 0.0,
	@SerialName("feedback_data")
	val feedbackData: String = "",
	val isIgnored: Boolean = false,
	val priceWithSellerFee: Double = 0.0,
	val guarantee: JsonElement = JsonNull,
	val canViewLoginData: Boolean = false,
	val canUpdateItemStats: Boolean = false,
	val canReportItem: Boolean = false,
	val canViewEmailLoginData: Boolean = false,
	val showGetEmailCodeButton: Boolean = false,
	val canOpenItem: Boolean = false,
	val canCloseItem: Boolean = false,
	val canEditItem: Boolean = false,
	val canDeleteItem: Boolean = false,
	val canStickItem: Boolean = false,
	val canUnstickItem: Boolean = false,
	val bumpSettings: CategoryWotResponseItemsBumpSettings = CategoryWotResponseItemsBumpSettings(),
	val canBumpItem: Boolean = false,
	val canBuyItem: Boolean = false,
	@SerialName("rub_price")
	val rubPrice: Double = 0.0,
	@SerialName("price_currency")
	val priceCurrency: String = "",
	val canValidateAccount: Boolean = false,
	val canResellItemAfterPurchase: Boolean = false,
	val wotRegionPhrase: String = "",
	val isSmallExf: Boolean = false,
	@SerialName("account_last_activity")
	val accountLastActivity: Double = 0.0,
	val wotTanks: JsonElement = JsonNull,
	val wotPremiumTankCount: Double = 0.0,
	val wotTankCount: Double = 0.0,
	val wotLauncherTitle: String = "",
	@SerialName("wot_has_clan")
	val wotHasClan: Boolean = false,
	val canViewAccountLink: Boolean = false,
	val accountLinks: List<JsonElement> = emptyList(),
	val canChangePassword: Boolean = false,
	val itemOriginPhrase: String = "",
	@SerialName("sold_items_category_count")
	val soldItemsCategoryCount: Double = 0.0,
	@SerialName("restore_items_category_count")
	val restoreItemsCategoryCount: Double = 0.0,
	val tags: List<JsonElement> = emptyList(),
	@SerialName("note_text")
	val noteText: JsonElement = JsonNull,
	val hasPendingAutoBuy: Boolean = false,
	val descriptionHtml: String = "",
	val descriptionEnHtml: String = "",
	val descriptionPlain: String = "",
	val descriptionEnPlain: String = "",
	val seller: CategoryWotResponseItemsSeller = CategoryWotResponseItemsSeller(),
)

@Serializable
data class CategoryWotBlitzParams(
    /** The number of the page to display results from. */
	val page: Long? = null,
    /** Minimal price of account (Inclusive). */
	val pmin: Long? = null,
    /** Maximum price of account (Inclusive). */
	val pmax: Long? = null,
    /** The word or words contained in the account title. */
	val title: String? = null,
    /** Order by. */
	@SerialName("order_by")
	val orderBy: OrderBy? = null,
    /** List of tag ids (Tag list is available via GET /me). */
	@SerialName("tag_id[]")
	val tagId: List<Long>? = null,
    /** List of tag ids that won't be included (Tag list is available via GET /me). */
	@SerialName("not_tag_id[]")
	val notTagId: List<Long>? = null,
    /** List of tag ids (Tag list is available via GET /me). */
	@SerialName("public_tag_id[]")
	val publicTagId: List<Long>? = null,
    /** List of tag ids that won't be included (Tag list is available via GET /me). */
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Long>? = null,
    /** List of account origins. */
	@SerialName("origin[]")
	val origin: JsonElement? = null,
    /** List of account origins that won't be included. */
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
    /** Search accounts of user. */
	@SerialName("user_id")
	val userId: Long? = null,
    /** Not sold before. */
	val nsb: Boolean? = null,
    /** Sold before. */
	val sb: Boolean? = null,
    /** Not sold by me before. */
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
    /** Sold by me before. */
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
    /** Currency in which the cost of the account will be searched. */
	val currency: Currency? = null,
    /** Has email login data. */
	@SerialName("email_login_data")
	val emailLoginData: Boolean? = null,
    /** Email provider. */
	@SerialName("email_provider[]")
	val emailProvider: JsonElement? = null,
    /** Email provider. */
	@SerialName("not_email_provider[]")
	val notEmailProvider: NotEmailProvider? = null,
    /** Parse same item ids. */
	@SerialName("parse_same_item_ids")
	val parseSameItemIds: Boolean? = null,
    /** Email type. */
	@SerialName("email_type[]")
	val emailType: JsonElement? = null,
    /** Domain of native/autoreg email. */
	@SerialName("item_domain")
	val itemDomain: String? = null,
    /** Has linked mobile. */
	val tel: Tel? = null,
    /** Number of days the account has been offline. */
	val daybreak: Long? = null,
    /** Minimum number of battles. */
	@SerialName("battles_min")
	val battlesMin: Long? = null,
    /** Maximum number of battles. */
	@SerialName("battles_max")
	val battlesMax: Long? = null,
    /** Minimum number of gold. */
	@SerialName("gold_min")
	val goldMin: Long? = null,
    /** Maximum number of gold. */
	@SerialName("gold_max")
	val goldMax: Long? = null,
    /** Minimum number of silver. */
	@SerialName("silver_min")
	val silverMin: Long? = null,
    /** Maximum number of silver. */
	@SerialName("silver_max")
	val silverMax: Long? = null,
    /** Minimum number of top tanks. */
	@SerialName("top_min")
	val topMin: Long? = null,
    /** Maximum number of top tanks. */
	@SerialName("top_max")
	val topMax: Long? = null,
    /** Minimum number of premium tanks. */
	@SerialName("prem_min")
	val premMin: Long? = null,
    /** Maximum number of premium tanks. */
	@SerialName("prem_max")
	val premMax: Long? = null,
    /** Minimum number of top premium tanks. */
	@SerialName("top_prem_min")
	val topPremMin: Long? = null,
    /** Maximum number of top premium tanks. */
	@SerialName("top_prem_max")
	val topPremMax: Long? = null,
    /** Minimum number of wins. */
	@SerialName("win_pmin")
	val winPmin: Long? = null,
    /** Maximum number of wins. */
	@SerialName("win_pmax")
	val winPmax: Long? = null,
    /** List of tanks. */
	@SerialName("tank[]")
	val tank: List<Long>? = null,
    /** Region. */
	@SerialName("region[]")
	val region: JsonElement? = null,
    /** Exclude region. */
	@SerialName("not_region[]")
	val notRegion: JsonElement? = null,
    /** Has a premium subscription. */
	val premium: Premium? = null,
    /** When premium subscription will be active */
	@SerialName("premium_expiration")
	val premiumExpiration: Long? = null,
    /** In what notation is time measured */
	@SerialName("premium_expiration_period")
	val premiumExpirationPeriod: PremiumExpirationPeriod? = null,
    /** Has clan. */
	val clan: Clan? = null,
    /** List of allowed clan role. */
	@SerialName("clan_role[]")
	val clanRole: JsonElement? = null,
    /** List of disallowed clan role. */
	@SerialName("not_clan_role[]")
	val notClanRole: JsonElement? = null,
    /** Minimum number of gold in clan treasure. */
	@SerialName("clan_gold_min")
	val clanGoldMin: Long? = null,
    /** Maximum number of gold in clan treasure. */
	@SerialName("clan_gold_max")
	val clanGoldMax: Long? = null,
    /** Minimum number of credits in clan treasure. */
	@SerialName("clan_credits_min")
	val clanCreditsMin: Long? = null,
    /** Maximum number of credits in clan treasure. */
	@SerialName("clan_credits_max")
	val clanCreditsMax: Long? = null,
    /** Minimum number of crystal in clan treasure. */
	@SerialName("clan_crystal_min")
	val clanCrystalMin: Long? = null,
    /** Maximum number of crystal in clan treasure. */
	@SerialName("clan_crystal_max")
	val clanCrystalMax: Long? = null,
    /** List of allowed countries. */
	@SerialName("country[]")
	val country: List<String>? = null,
    /** List of disallowed countries. */
	@SerialName("not_country[]")
	val notCountry: List<String>? = null,
)

@Serializable
data class CategoryWotBlitzResponse(
	val items: List<CategoryWotBlitzResponseItems> = emptyList(),
	val totalItems: Double = 0.0,
	val totalItemsPrice: JsonElement = JsonNull,
	val hasNextPage: Boolean = false,
	val perPage: Double = 0.0,
	val page: Double = 0.0,
	val wasCached: Boolean = false,
	val cacheTTL: Double = 0.0,
	val lastModified: Double = 0.0,
	val serverTime: Double = 0.0,
	val searchUrl: String = "",
	val stickyItems: List<JsonElement> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class CategoryWotBlitzResponseItemsBumpSettings(
	val canBumpItem: Boolean = false,
	val canBumpItemGlobally: Boolean = false,
	val shortErrorPhrase: JsonElement = JsonNull,
	val errorPhrase: JsonElement = JsonNull,
)

@Serializable
data class CategoryWotBlitzResponseItemsSeller(
	@SerialName("user_id")
	val userId: Double = 0.0,
	@SerialName("sold_items_count")
	val soldItemsCount: Double = 0.0,
	@SerialName("active_items_count")
	val activeItemsCount: Double = 0.0,
	@SerialName("restore_data")
	val restoreData: String = "",
	val username: String = "",
	@SerialName("avatar_date")
	val avatarDate: Double = 0.0,
	@SerialName("is_banned")
	val isBanned: Double = 0.0,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Double = 0.0,
	@SerialName("restore_percents")
	val restorePercents: Double = 0.0,
)

@Serializable
data class CategoryWotBlitzResponseItems(
	@SerialName("item_id")
	val itemId: Double = 0.0,
	@SerialName("item_state")
	val itemState: String = "",
	@SerialName("category_id")
	val categoryId: Double = 0.0,
	@SerialName("published_date")
	val publishedDate: Double = 0.0,
	val title: String = "",
	val description: String = "",
	val price: Double = 0.0,
	@SerialName("update_stat_date")
	val updateStatDate: Double = 0.0,
	@SerialName("refreshed_date")
	val refreshedDate: Double = 0.0,
	@SerialName("edit_date")
	val editDate: Double = 0.0,
	@SerialName("view_count")
	val viewCount: Double = 0.0,
	@SerialName("is_sticky")
	val isSticky: Double = 0.0,
	@SerialName("item_origin")
	val itemOrigin: String = "",
	@SerialName("extended_guarantee")
	val extendedGuarantee: Double = 0.0,
	val nsb: Double = 0.0,
	@SerialName("allow_ask_discount")
	val allowAskDiscount: Double = 0.0,
	@SerialName("title_en")
	val titleEn: String = "",
	@SerialName("description_en")
	val descriptionEn: String = "",
	@SerialName("email_type")
	val emailType: String = "",
	@SerialName("email_provider")
	val emailProvider: JsonElement = JsonNull,
	@SerialName("item_domain")
	val itemDomain: String = "",
	@SerialName("resale_item_origin")
	val resaleItemOrigin: String = "",
	@SerialName("wot_item_id")
	val wotItemId: Double = 0.0,
	@SerialName("wot_last_activity")
	val wotLastActivity: Double = 0.0,
	@SerialName("wot_register_date")
	val wotRegisterDate: Double = 0.0,
	@SerialName("wot_mobile")
	val wotMobile: Double = 0.0,
	@SerialName("wot_premium")
	val wotPremium: Double = 0.0,
	@SerialName("wot_premium_expires")
	val wotPremiumExpires: Double = 0.0,
	@SerialName("wot_gold")
	val wotGold: Double = 0.0,
	@SerialName("wot_credits")
	val wotCredits: Double = 0.0,
	@SerialName("wot_battle_count")
	val wotBattleCount: Double = 0.0,
	@SerialName("wot_win_count")
	val wotWinCount: Double = 0.0,
	@SerialName("wot_loss_count")
	val wotLossCount: Double = 0.0,
	@SerialName("wot_win_count_percents")
	val wotWinCountPercents: Double = 0.0,
	@SerialName("wot_top_tanks")
	val wotTopTanks: Double = 0.0,
	@SerialName("wot_premium_tanks")
	val wotPremiumTanks: Double = 0.0,
	@SerialName("wot_top_premium_tanks")
	val wotTopPremiumTanks: Double = 0.0,
	@SerialName("wot_region")
	val wotRegion: String = "",
	@SerialName("wot_blitz")
	val wotBlitz: Double = 0.0,
	@SerialName("feedback_data")
	val feedbackData: String = "",
	val isIgnored: Boolean = false,
	val priceWithSellerFee: Double = 0.0,
	val guarantee: JsonElement = JsonNull,
	val canViewLoginData: Boolean = false,
	val canUpdateItemStats: Boolean = false,
	val canReportItem: Boolean = false,
	val canViewEmailLoginData: Boolean = false,
	val showGetEmailCodeButton: Boolean = false,
	val canOpenItem: Boolean = false,
	val canCloseItem: Boolean = false,
	val canEditItem: Boolean = false,
	val canDeleteItem: Boolean = false,
	val canStickItem: Boolean = false,
	val canUnstickItem: Boolean = false,
	val bumpSettings: CategoryWotBlitzResponseItemsBumpSettings = CategoryWotBlitzResponseItemsBumpSettings(),
	val canBumpItem: Boolean = false,
	val canBuyItem: Boolean = false,
	@SerialName("rub_price")
	val rubPrice: Double = 0.0,
	@SerialName("price_currency")
	val priceCurrency: String = "",
	val canValidateAccount: Boolean = false,
	val canResellItemAfterPurchase: Boolean = false,
	val wotRegionPhrase: String = "",
	val isSmallExf: Boolean = false,
	@SerialName("account_last_activity")
	val accountLastActivity: Double = 0.0,
	val wotTanks: JsonElement = JsonNull,
	val wotPremiumTankCount: Double = 0.0,
	val wotTankCount: Double = 0.0,
	val wotLauncherTitle: String = "",
	@SerialName("wot_has_clan")
	val wotHasClan: Boolean = false,
	val canViewAccountLink: Boolean = false,
	val accountLinks: List<JsonElement> = emptyList(),
	val canChangePassword: Boolean = false,
	val itemOriginPhrase: String = "",
	@SerialName("sold_items_category_count")
	val soldItemsCategoryCount: Double = 0.0,
	@SerialName("restore_items_category_count")
	val restoreItemsCategoryCount: Double = 0.0,
	val tags: List<JsonElement> = emptyList(),
	@SerialName("note_text")
	val noteText: JsonElement = JsonNull,
	val hasPendingAutoBuy: Boolean = false,
	val descriptionHtml: String = "",
	val descriptionEnHtml: String = "",
	val descriptionPlain: String = "",
	val descriptionEnPlain: String = "",
	val seller: CategoryWotBlitzResponseItemsSeller = CategoryWotBlitzResponseItemsSeller(),
)

@Serializable
data class CategoryGiftsParams(
    /** The number of the page to display results from. */
	val page: Long? = null,
    /** Minimal price of account (Inclusive). */
	val pmin: Long? = null,
    /** Maximum price of account (Inclusive). */
	val pmax: Long? = null,
    /** The word or words contained in the account title. */
	val title: String? = null,
    /** Order by. */
	@SerialName("order_by")
	val orderBy: OrderBy? = null,
    /** List of tag ids (Tag list is available via GET /me). */
	@SerialName("tag_id[]")
	val tagId: List<Long>? = null,
    /** List of tag ids that won't be included (Tag list is available via GET /me). */
	@SerialName("not_tag_id[]")
	val notTagId: List<Long>? = null,
    /** List of tag ids (Tag list is available via GET /me). */
	@SerialName("public_tag_id[]")
	val publicTagId: List<Long>? = null,
    /** List of tag ids that won't be included (Tag list is available via GET /me). */
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Long>? = null,
    /** List of account origins. */
	@SerialName("origin[]")
	val origin: JsonElement? = null,
    /** List of account origins that won't be included. */
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
    /** Search accounts of user. */
	@SerialName("user_id")
	val userId: Long? = null,
    /** Not sold before. */
	val nsb: Boolean? = null,
    /** Sold before. */
	val sb: Boolean? = null,
    /** Not sold by me before. */
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
    /** Sold by me before. */
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
    /** Currency in which the cost of the account will be searched. */
	val currency: Currency? = null,
    /** Has email login data. */
	@SerialName("email_login_data")
	val emailLoginData: Boolean? = null,
    /** Email provider. */
	@SerialName("email_provider[]")
	val emailProvider: JsonElement? = null,
    /** Email provider. */
	@SerialName("not_email_provider[]")
	val notEmailProvider: NotEmailProvider? = null,
    /** Parse same item ids. */
	@SerialName("parse_same_item_ids")
	val parseSameItemIds: Boolean? = null,
    /** Name of subscription. */
	val subscription: CategorySubscription4? = null,
    /** Length of subscription. */
	@SerialName("subscription_length")
	val subscriptionLength: Long? = null,
    /** In what notation is time measured. */
	@SerialName("subscription_period")
	val subscriptionPeriod: SubscriptionPeriod? = null,
)

@Serializable
data class CategoryGiftsResponse(
	val items: List<CategoryGiftsResponseItems> = emptyList(),
	val totalItems: Double = 0.0,
	val totalItemsPrice: JsonElement = JsonNull,
	val hasNextPage: Boolean = false,
	val perPage: Double = 0.0,
	val page: Double = 0.0,
	val wasCached: Boolean = false,
	val cacheTTL: Double = 0.0,
	val lastModified: Double = 0.0,
	val serverTime: Double = 0.0,
	val searchUrl: String = "",
	val stickyItems: List<JsonElement> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class CategoryGiftsResponseItemsBumpSettings(
	val canBumpItem: Boolean = false,
	val canBumpItemGlobally: Boolean = false,
	val shortErrorPhrase: JsonElement = JsonNull,
	val errorPhrase: JsonElement = JsonNull,
)

@Serializable
data class CategoryGiftsResponseItemsSeller(
	@SerialName("user_id")
	val userId: Double = 0.0,
	@SerialName("sold_items_count")
	val soldItemsCount: Double = 0.0,
	@SerialName("active_items_count")
	val activeItemsCount: Double = 0.0,
	@SerialName("restore_data")
	val restoreData: String = "",
	val username: String = "",
	@SerialName("avatar_date")
	val avatarDate: Double = 0.0,
	@SerialName("is_banned")
	val isBanned: Double = 0.0,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Double = 0.0,
	@SerialName("restore_percents")
	val restorePercents: JsonElement = JsonNull,
)

@Serializable
data class CategoryGiftsResponseItems(
	@SerialName("item_id")
	val itemId: Double = 0.0,
	@SerialName("item_state")
	val itemState: String = "",
	@SerialName("category_id")
	val categoryId: Double = 0.0,
	@SerialName("published_date")
	val publishedDate: Double = 0.0,
	val title: String = "",
	val description: String = "",
	val price: Double = 0.0,
	@SerialName("update_stat_date")
	val updateStatDate: Double = 0.0,
	@SerialName("refreshed_date")
	val refreshedDate: Double = 0.0,
	@SerialName("edit_date")
	val editDate: Double = 0.0,
	@SerialName("view_count")
	val viewCount: Double = 0.0,
	@SerialName("is_sticky")
	val isSticky: Double = 0.0,
	@SerialName("item_origin")
	val itemOrigin: String = "",
	@SerialName("extended_guarantee")
	val extendedGuarantee: Double = 0.0,
	val nsb: Double = 0.0,
	@SerialName("allow_ask_discount")
	val allowAskDiscount: Double = 0.0,
	@SerialName("title_en")
	val titleEn: String = "",
	@SerialName("description_en")
	val descriptionEn: String = "",
	@SerialName("email_type")
	val emailType: String = "",
	@SerialName("email_provider")
	val emailProvider: JsonElement = JsonNull,
	@SerialName("item_domain")
	val itemDomain: String = "",
	@SerialName("resale_item_origin")
	val resaleItemOrigin: String = "",
	@SerialName("gifts_item_id")
	val giftsItemId: Double = 0.0,
	@SerialName("gifts_service")
	val giftsService: String = "",
	@SerialName("gifts_duration")
	val giftsDuration: Double = 0.0,
	@SerialName("gifts_type")
	val giftsType: String = "",
	@SerialName("feedback_data")
	val feedbackData: String = "",
	val isIgnored: Boolean = false,
	val priceWithSellerFee: Double = 0.0,
	val guarantee: JsonElement = JsonNull,
	val canViewLoginData: Boolean = false,
	val canUpdateItemStats: Boolean = false,
	val canReportItem: Boolean = false,
	val canViewEmailLoginData: Boolean = false,
	val showGetEmailCodeButton: Boolean = false,
	val canOpenItem: Boolean = false,
	val canCloseItem: Boolean = false,
	val canEditItem: Boolean = false,
	val canDeleteItem: Boolean = false,
	val canStickItem: Boolean = false,
	val canUnstickItem: Boolean = false,
	val bumpSettings: CategoryGiftsResponseItemsBumpSettings = CategoryGiftsResponseItemsBumpSettings(),
	val canBumpItem: Boolean = false,
	val canBuyItem: Boolean = false,
	@SerialName("rub_price")
	val rubPrice: Double = 0.0,
	@SerialName("price_currency")
	val priceCurrency: String = "",
	val canValidateAccount: Boolean = false,
	val canResellItemAfterPurchase: Boolean = false,
	val giftsSubscriptionName: String = "",
	val giftsServiceName: String = "",
	val canViewAccountLink: Boolean = false,
	val canChangePassword: Boolean = false,
	val itemOriginPhrase: String = "",
	val tags: List<JsonElement> = emptyList(),
	@SerialName("note_text")
	val noteText: JsonElement = JsonNull,
	val hasPendingAutoBuy: Boolean = false,
	val descriptionHtml: String = "",
	val descriptionEnHtml: String = "",
	val descriptionPlain: String = "",
	val descriptionEnPlain: String = "",
	val seller: CategoryGiftsResponseItemsSeller = CategoryGiftsResponseItemsSeller(),
)

@Serializable
data class CategoryEpicGamesParams(
    /** The number of the page to display results from. */
	val page: Long? = null,
    /** Minimal price of account (Inclusive). */
	val pmin: Long? = null,
    /** Maximum price of account (Inclusive). */
	val pmax: Long? = null,
    /** The word or words contained in the account title. */
	val title: String? = null,
    /** Order by. */
	@SerialName("order_by")
	val orderBy: OrderBy? = null,
    /** List of tag ids (Tag list is available via GET /me). */
	@SerialName("tag_id[]")
	val tagId: List<Long>? = null,
    /** List of tag ids that won't be included (Tag list is available via GET /me). */
	@SerialName("not_tag_id[]")
	val notTagId: List<Long>? = null,
    /** List of tag ids (Tag list is available via GET /me). */
	@SerialName("public_tag_id[]")
	val publicTagId: List<Long>? = null,
    /** List of tag ids that won't be included (Tag list is available via GET /me). */
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Long>? = null,
    /** List of account origins. */
	@SerialName("origin[]")
	val origin: JsonElement? = null,
    /** List of account origins that won't be included. */
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
    /** Search accounts of user. */
	@SerialName("user_id")
	val userId: Long? = null,
    /** Not sold before. */
	val nsb: Boolean? = null,
    /** Sold before. */
	val sb: Boolean? = null,
    /** Not sold by me before. */
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
    /** Sold by me before. */
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
    /** Currency in which the cost of the account will be searched. */
	val currency: Currency? = null,
    /** Has email login data. */
	@SerialName("email_login_data")
	val emailLoginData: Boolean? = null,
    /** Email provider. */
	@SerialName("email_provider[]")
	val emailProvider: JsonElement? = null,
    /** Email provider. */
	@SerialName("not_email_provider[]")
	val notEmailProvider: NotEmailProvider? = null,
    /** Parse same item ids. */
	@SerialName("parse_same_item_ids")
	val parseSameItemIds: Boolean? = null,
    /** Email type. */
	@SerialName("email_type[]")
	val emailType: JsonElement? = null,
    /** Domain of native/autoreg email. */
	@SerialName("item_domain")
	val itemDomain: String? = null,
    /** Guarantee type. */
	val eg: CategoryEg3? = null,
    /** List of games. */
	@SerialName("game[]")
	val game: List<String>? = null,
    /** Can change email. */
	@SerialName("change_email")
	val changeEmail: ChangeEmail? = null,
    /** Has Rocket League purchases. */
	@SerialName("rl_purchases")
	val rlPurchases: Boolean? = null,
    /** Minimum epic wallet balance. */
	@SerialName("balance_min")
	val balanceMin: Double? = null,
    /** Maximum epic wallet balance. */
	@SerialName("balance_max")
	val balanceMax: Double? = null,
    /** Minimum rewards balance. */
	@SerialName("rewards_balance_min")
	val rewardsBalanceMin: Double? = null,
    /** Maximum rewards balance. */
	@SerialName("rewards_balance_max")
	val rewardsBalanceMax: Double? = null,
    /** Minimum number of games. */
	val gmin: Long? = null,
    /** Maximum number of games. */
	val gmax: Long? = null,
    /** List of allowed countries. */
	@SerialName("country[]")
	val country: List<String>? = null,
    /** List of disallowed countries. */
	@SerialName("not_country[]")
	val notCountry: List<String>? = null,
    /** Number of days the account has been offline. */
	val daybreak: Long? = null,
    /** List of minimum hours played by game. */
	@SerialName("hours_played")
	val hoursPlayed: Map<String, Long>? = null,
    /** List of maximum hours played by game. */
	@SerialName("hours_played_max")
	val hoursPlayedMax: Map<String, Long>? = null,
)

@Serializable
data class CategoryEpicGamesResponse(
	val items: List<CategoryEpicGamesResponseItems> = emptyList(),
	val totalItems: Double = 0.0,
	val totalItemsPrice: JsonElement = JsonNull,
	val hasNextPage: Boolean = false,
	val perPage: Double = 0.0,
	val page: Double = 0.0,
	val wasCached: Boolean = false,
	val cacheTTL: Double = 0.0,
	val lastModified: Double = 0.0,
	val serverTime: Double = 0.0,
	val searchUrl: String = "",
	val stickyItems: List<JsonElement> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class CategoryEpicGamesResponseItemsBumpSettings(
	val canBumpItem: Boolean = false,
	val canBumpItemGlobally: Boolean = false,
	val shortErrorPhrase: JsonElement = JsonNull,
	val errorPhrase: JsonElement = JsonNull,
)

@Serializable
data class CategoryEpicGamesResponseItemsEgTransactions(
	val date: Double = 0.0,
	val title: String = "",
	val presentmentTotal: String = "",
	val orderType: String = "",
)

@Serializable
data class CategoryEpicGamesResponseItemsSeller(
	@SerialName("user_id")
	val userId: Double = 0.0,
	@SerialName("sold_items_count")
	val soldItemsCount: Double = 0.0,
	@SerialName("active_items_count")
	val activeItemsCount: Double = 0.0,
	@SerialName("restore_data")
	val restoreData: String = "",
	val username: String = "",
	@SerialName("avatar_date")
	val avatarDate: Double = 0.0,
	@SerialName("is_banned")
	val isBanned: Double = 0.0,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Double = 0.0,
	@SerialName("restore_percents")
	val restorePercents: Double = 0.0,
)

@Serializable
data class CategoryEpicGamesResponseItems(
	@SerialName("item_id")
	val itemId: Double = 0.0,
	@SerialName("item_state")
	val itemState: String = "",
	@SerialName("category_id")
	val categoryId: Double = 0.0,
	@SerialName("published_date")
	val publishedDate: Double = 0.0,
	val title: String = "",
	val description: String = "",
	val price: Double = 0.0,
	@SerialName("update_stat_date")
	val updateStatDate: Double = 0.0,
	@SerialName("refreshed_date")
	val refreshedDate: Double = 0.0,
	@SerialName("edit_date")
	val editDate: Double = 0.0,
	@SerialName("view_count")
	val viewCount: Double = 0.0,
	@SerialName("is_sticky")
	val isSticky: Double = 0.0,
	@SerialName("item_origin")
	val itemOrigin: String = "",
	@SerialName("extended_guarantee")
	val extendedGuarantee: Double = 0.0,
	val nsb: Double = 0.0,
	@SerialName("allow_ask_discount")
	val allowAskDiscount: Double = 0.0,
	@SerialName("title_en")
	val titleEn: String = "",
	@SerialName("description_en")
	val descriptionEn: String = "",
	@SerialName("email_type")
	val emailType: String = "",
	@SerialName("email_provider")
	val emailProvider: String = "",
	@SerialName("item_domain")
	val itemDomain: String = "",
	@SerialName("resale_item_origin")
	val resaleItemOrigin: String = "",
	@SerialName("eg_item_id")
	val egItemId: Double = 0.0,
	@SerialName("eg_country")
	val egCountry: String = "",
	@SerialName("eg_code_redemption_history")
	val egCodeRedemptionHistory: List<JsonElement> = emptyList(),
	@SerialName("eg_coupons")
	val egCoupons: List<JsonElement> = emptyList(),
	@SerialName("eg_games")
	val egGames: JsonElement = JsonNull,
	@SerialName("eg_change_email")
	val egChangeEmail: Double = 0.0,
	@SerialName("eg_can_update_display_name")
	val egCanUpdateDisplayName: Double = 0.0,
	@SerialName("eg_last_activity")
	val egLastActivity: Double = 0.0,
	@SerialName("eg_payment_methods")
	val egPaymentMethods: List<JsonElement> = emptyList(),
	@SerialName("eg_rl_purchases")
	val egRlPurchases: Double = 0.0,
	@SerialName("eg_username")
	val egUsername: String = "",
	@SerialName("eg_rewards_balance")
	val egRewardsBalance: Double = 0.0,
	@SerialName("eg_rewards_expiration_date")
	val egRewardsExpirationDate: Double = 0.0,
	@SerialName("eg_next_change_email_date")
	val egNextChangeEmailDate: Double = 0.0,
	@SerialName("eg_game_count")
	val egGameCount: Double = 0.0,
	@SerialName("eg_balance")
	val egBalance: Double = 0.0,
	@SerialName("feedback_data")
	val feedbackData: String = "",
	val isIgnored: Boolean = false,
	val priceWithSellerFee: Double = 0.0,
	val guarantee: JsonElement = JsonNull,
	val canViewLoginData: Boolean = false,
	val canUpdateItemStats: Boolean = false,
	val canReportItem: Boolean = false,
	val canViewEmailLoginData: Boolean = false,
	val showGetEmailCodeButton: Boolean = false,
	val canOpenItem: Boolean = false,
	val canCloseItem: Boolean = false,
	val canEditItem: Boolean = false,
	val canDeleteItem: Boolean = false,
	val canStickItem: Boolean = false,
	val canUnstickItem: Boolean = false,
	val bumpSettings: CategoryEpicGamesResponseItemsBumpSettings = CategoryEpicGamesResponseItemsBumpSettings(),
	val canBumpItem: Boolean = false,
	val canBuyItem: Boolean = false,
	@SerialName("rub_price")
	val rubPrice: Double = 0.0,
	@SerialName("price_currency")
	val priceCurrency: String = "",
	val canValidateAccount: Boolean = false,
	val canResellItemAfterPurchase: Boolean = false,
	val egTransactions: List<CategoryEpicGamesResponseItemsEgTransactions> = emptyList(),
	val canViewAccountLink: Boolean = false,
	val accountLinks: List<JsonElement> = emptyList(),
	val emailLoginUrl: String = "",
	val canChangePassword: Boolean = false,
	val itemOriginPhrase: String = "",
	@SerialName("sold_items_category_count")
	val soldItemsCategoryCount: Double = 0.0,
	@SerialName("restore_items_category_count")
	val restoreItemsCategoryCount: Double = 0.0,
	val tags: List<JsonElement> = emptyList(),
	@SerialName("note_text")
	val noteText: JsonElement = JsonNull,
	val hasPendingAutoBuy: Boolean = false,
	val descriptionHtml: String = "",
	val descriptionEnHtml: String = "",
	val descriptionPlain: String = "",
	val descriptionEnPlain: String = "",
	val seller: CategoryEpicGamesResponseItemsSeller = CategoryEpicGamesResponseItemsSeller(),
)

@Serializable
data class CategoryEscapeFromTarkovParams(
    /** The number of the page to display results from. */
	val page: Long? = null,
    /** Minimal price of account (Inclusive). */
	val pmin: Long? = null,
    /** Maximum price of account (Inclusive). */
	val pmax: Long? = null,
    /** The word or words contained in the account title. */
	val title: String? = null,
    /** Order by. */
	@SerialName("order_by")
	val orderBy: OrderBy? = null,
    /** List of tag ids (Tag list is available via GET /me). */
	@SerialName("tag_id[]")
	val tagId: List<Long>? = null,
    /** List of tag ids that won't be included (Tag list is available via GET /me). */
	@SerialName("not_tag_id[]")
	val notTagId: List<Long>? = null,
    /** List of tag ids (Tag list is available via GET /me). */
	@SerialName("public_tag_id[]")
	val publicTagId: List<Long>? = null,
    /** List of tag ids that won't be included (Tag list is available via GET /me). */
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Long>? = null,
    /** List of account origins. */
	@SerialName("origin[]")
	val origin: JsonElement? = null,
    /** List of account origins that won't be included. */
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
    /** Search accounts of user. */
	@SerialName("user_id")
	val userId: Long? = null,
    /** Not sold before. */
	val nsb: Boolean? = null,
    /** Sold before. */
	val sb: Boolean? = null,
    /** Not sold by me before. */
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
    /** Sold by me before. */
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
    /** Currency in which the cost of the account will be searched. */
	val currency: Currency? = null,
    /** Has email login data. */
	@SerialName("email_login_data")
	val emailLoginData: Boolean? = null,
    /** Email provider. */
	@SerialName("email_provider[]")
	val emailProvider: JsonElement? = null,
    /** Email provider. */
	@SerialName("not_email_provider[]")
	val notEmailProvider: NotEmailProvider? = null,
    /** Parse same item ids. */
	@SerialName("parse_same_item_ids")
	val parseSameItemIds: Boolean? = null,
    /** Email type. */
	@SerialName("email_type[]")
	val emailType: JsonElement? = null,
    /** Domain of native/autoreg email. */
	@SerialName("item_domain")
	val itemDomain: String? = null,
    /** Region. */
	val region: Region? = null,
    /** List of versions. */
	@SerialName("version[]")
	val version: JsonElement? = null,
    /** How old is the account. */
	val reg: Long? = null,
    /** In what notation is time measured. */
	@SerialName("reg_period")
	val regPeriod: RegPeriod? = null,
    /** Minimum level. */
	@SerialName("level_min")
	val levelMin: Long? = null,
    /** Maximum level. */
	@SerialName("level_max")
	val levelMax: Long? = null,
    /** Access to pve. */
	val pve: Pve? = null,
    /** Side in current wipe. */
	val side: Side? = null,
)

@Serializable
data class CategoryEscapeFromTarkovResponse(
	val items: List<CategoryEscapeFromTarkovResponseItems> = emptyList(),
	val totalItems: Double = 0.0,
	val totalItemsPrice: JsonElement = JsonNull,
	val hasNextPage: Boolean = false,
	val perPage: Double = 0.0,
	val page: Double = 0.0,
	val wasCached: Boolean = false,
	val cacheTTL: Double = 0.0,
	val lastModified: Double = 0.0,
	val serverTime: Double = 0.0,
	val searchUrl: String = "",
	val stickyItems: List<JsonElement> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class CategoryEscapeFromTarkovResponseItemsBumpSettings(
	val canBumpItem: Boolean = false,
	val canBumpItemGlobally: Boolean = false,
	val shortErrorPhrase: JsonElement = JsonNull,
	val errorPhrase: JsonElement = JsonNull,
)

@Serializable
data class CategoryEscapeFromTarkovResponseItemsSeller(
	@SerialName("user_id")
	val userId: Double = 0.0,
	@SerialName("sold_items_count")
	val soldItemsCount: Double = 0.0,
	@SerialName("active_items_count")
	val activeItemsCount: Double = 0.0,
	@SerialName("restore_data")
	val restoreData: String = "",
	val username: String = "",
	@SerialName("avatar_date")
	val avatarDate: Double = 0.0,
	@SerialName("is_banned")
	val isBanned: Double = 0.0,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Double = 0.0,
	@SerialName("restore_percents")
	val restorePercents: Double = 0.0,
)

@Serializable
data class CategoryEscapeFromTarkovResponseItems(
	@SerialName("item_id")
	val itemId: Double = 0.0,
	@SerialName("item_state")
	val itemState: String = "",
	@SerialName("category_id")
	val categoryId: Double = 0.0,
	@SerialName("published_date")
	val publishedDate: Double = 0.0,
	val title: String = "",
	val description: String = "",
	val price: Double = 0.0,
	@SerialName("update_stat_date")
	val updateStatDate: Double = 0.0,
	@SerialName("refreshed_date")
	val refreshedDate: Double = 0.0,
	@SerialName("edit_date")
	val editDate: Double = 0.0,
	@SerialName("view_count")
	val viewCount: Double = 0.0,
	@SerialName("is_sticky")
	val isSticky: Double = 0.0,
	@SerialName("item_origin")
	val itemOrigin: String = "",
	@SerialName("extended_guarantee")
	val extendedGuarantee: Double = 0.0,
	val nsb: Double = 0.0,
	@SerialName("allow_ask_discount")
	val allowAskDiscount: Double = 0.0,
	@SerialName("title_en")
	val titleEn: String = "",
	@SerialName("description_en")
	val descriptionEn: String = "",
	@SerialName("email_type")
	val emailType: String = "",
	@SerialName("email_provider")
	val emailProvider: String = "",
	@SerialName("item_domain")
	val itemDomain: String = "",
	@SerialName("resale_item_origin")
	val resaleItemOrigin: String = "",
	@SerialName("tarkov_item_id")
	val tarkovItemId: Double = 0.0,
	@SerialName("tarkov_game_version")
	val tarkovGameVersion: String = "",
	@SerialName("tarkov_register_date")
	val tarkovRegisterDate: Double = 0.0,
	@SerialName("tarkov_level")
	val tarkovLevel: Double = 0.0,
	@SerialName("tarkov_exp")
	val tarkovExp: Double = 0.0,
	@SerialName("tarkov_last_activity")
	val tarkovLastActivity: Double = 0.0,
	@SerialName("tarkov_side")
	val tarkovSide: String = "",
	@SerialName("tarkov_rubles")
	val tarkovRubles: Double = 0.0,
	@SerialName("tarkov_secured_container")
	val tarkovSecuredContainer: String = "",
	@SerialName("tarkov_euros")
	val tarkovEuros: Double = 0.0,
	@SerialName("tarkov_dollars")
	val tarkovDollars: Double = 0.0,
	@SerialName("tarkov_kd")
	val tarkovKd: Double = 0.0,
	@SerialName("tarkov_deaths")
	val tarkovDeaths: Double = 0.0,
	@SerialName("tarkov_kills")
	val tarkovKills: Double = 0.0,
	@SerialName("tarkov_sessions")
	val tarkovSessions: Double = 0.0,
	@SerialName("tarkov_region")
	val tarkovRegion: String = "",
	@SerialName("tarkov_total_in_game")
	val tarkovTotalInGame: Double = 0.0,
	@SerialName("tarkov_mail_forwarding")
	val tarkovMailForwarding: Double = 0.0,
	@SerialName("tarkov_username")
	val tarkovUsername: String = "",
	@SerialName("tarkov_purchase_date")
	val tarkovPurchaseDate: Double = 0.0,
	@SerialName("feedback_data")
	val feedbackData: String = "",
	val isIgnored: Boolean = false,
	val priceWithSellerFee: Double = 0.0,
	val guarantee: JsonElement = JsonNull,
	val canViewLoginData: Boolean = false,
	val canUpdateItemStats: Boolean = false,
	val canReportItem: Boolean = false,
	val canViewEmailLoginData: Boolean = false,
	val showGetEmailCodeButton: Boolean = false,
	val canOpenItem: Boolean = false,
	val canCloseItem: Boolean = false,
	val canEditItem: Boolean = false,
	val canDeleteItem: Boolean = false,
	val canStickItem: Boolean = false,
	val canUnstickItem: Boolean = false,
	val bumpSettings: CategoryEscapeFromTarkovResponseItemsBumpSettings = CategoryEscapeFromTarkovResponseItemsBumpSettings(),
	val canBumpItem: Boolean = false,
	val canBuyItem: Boolean = false,
	@SerialName("rub_price")
	val rubPrice: Double = 0.0,
	@SerialName("price_currency")
	val priceCurrency: String = "",
	val canValidateAccount: Boolean = false,
	val canResellItemAfterPurchase: Boolean = false,
	val tarkovRegionPhrase: String = "",
	val tarkovGameVersionPhrase: String = "",
	val accountDomain: String = "",
	val canViewAccountLink: Boolean = false,
	val emailLoginUrl: String = "",
	val canChangePassword: Boolean = false,
	val itemOriginPhrase: String = "",
	@SerialName("sold_items_category_count")
	val soldItemsCategoryCount: Double = 0.0,
	@SerialName("restore_items_category_count")
	val restoreItemsCategoryCount: Double = 0.0,
	val tags: List<JsonElement> = emptyList(),
	@SerialName("note_text")
	val noteText: JsonElement = JsonNull,
	val hasPendingAutoBuy: Boolean = false,
	val descriptionHtml: String = "",
	val descriptionEnHtml: String = "",
	val descriptionPlain: String = "",
	val descriptionEnPlain: String = "",
	val seller: CategoryEscapeFromTarkovResponseItemsSeller = CategoryEscapeFromTarkovResponseItemsSeller(),
)

@Serializable
data class CategorySocialClubParams(
    /** The number of the page to display results from. */
	val page: Long? = null,
    /** Minimal price of account (Inclusive). */
	val pmin: Long? = null,
    /** Maximum price of account (Inclusive). */
	val pmax: Long? = null,
    /** The word or words contained in the account title. */
	val title: String? = null,
    /** Order by. */
	@SerialName("order_by")
	val orderBy: OrderBy? = null,
    /** List of tag ids (Tag list is available via GET /me). */
	@SerialName("tag_id[]")
	val tagId: List<Long>? = null,
    /** List of tag ids that won't be included (Tag list is available via GET /me). */
	@SerialName("not_tag_id[]")
	val notTagId: List<Long>? = null,
    /** List of tag ids (Tag list is available via GET /me). */
	@SerialName("public_tag_id[]")
	val publicTagId: List<Long>? = null,
    /** List of tag ids that won't be included (Tag list is available via GET /me). */
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Long>? = null,
    /** List of account origins. */
	@SerialName("origin[]")
	val origin: JsonElement? = null,
    /** List of account origins that won't be included. */
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
    /** Search accounts of user. */
	@SerialName("user_id")
	val userId: Long? = null,
    /** Not sold before. */
	val nsb: Boolean? = null,
    /** Sold before. */
	val sb: Boolean? = null,
    /** Not sold by me before. */
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
    /** Sold by me before. */
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
    /** Currency in which the cost of the account will be searched. */
	val currency: Currency? = null,
    /** Has email login data. */
	@SerialName("email_login_data")
	val emailLoginData: Boolean? = null,
    /** Email provider. */
	@SerialName("email_provider[]")
	val emailProvider: JsonElement? = null,
    /** Email provider. */
	@SerialName("not_email_provider[]")
	val notEmailProvider: NotEmailProvider? = null,
    /** Parse same item ids. */
	@SerialName("parse_same_item_ids")
	val parseSameItemIds: Boolean? = null,
    /** Number of days the account has been offline. */
	val daybreak: Long? = null,
    /** Minimum number of Social Club level. */
	@SerialName("level_min")
	val levelMin: Long? = null,
    /** Maximum number of Social Club level. */
	@SerialName("level_max")
	val levelMax: Long? = null,
    /** Minimum number of GTA V cash */
	@SerialName("cash_min")
	val cashMin: Long? = null,
    /** Maximum number of GTA V cash */
	@SerialName("cash_max")
	val cashMax: Long? = null,
    /** Minimum number of GTA V bank cash */
	@SerialName("bank_cash_min")
	val bankCashMin: Long? = null,
    /** Maximum number of GTA V bank cash */
	@SerialName("bank_cash_max")
	val bankCashMax: Long? = null,
    /** List of games. */
	@SerialName("game[]")
	val game: List<String>? = null,
)

@Serializable
data class CategorySocialClubResponse(
	val items: List<CategorySocialClubResponseItems> = emptyList(),
	val totalItems: Double = 0.0,
	val totalItemsPrice: JsonElement = JsonNull,
	val hasNextPage: Boolean = false,
	val perPage: Double = 0.0,
	val page: Double = 0.0,
	val wasCached: Boolean = false,
	val cacheTTL: Double = 0.0,
	val lastModified: Double = 0.0,
	val serverTime: Double = 0.0,
	val searchUrl: String = "",
	val stickyItems: List<JsonElement> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class CategorySocialClubResponseItemsSocialclubGames(
	val id: Double = 0.0,
	val name: String = "",
	val defaultPlatform: String = "",
	val platform: String = "",
	val lastSeen: String = "",
	@SerialName("internal_game_id")
	val internalGameId: Double = 0.0,
	@SerialName("app_id")
	val appId: String = "",
	val title: String = "",
	val abbr: String = "",
	@SerialName("category_id")
	val categoryId: Double = 0.0,
	val img: String = "",
	val url: String = "",
	val ru: JsonElement = JsonNull,
)

@Serializable
data class CategorySocialClubResponseItemsBumpSettings(
	val canBumpItem: Boolean = false,
	val canBumpItemGlobally: Boolean = false,
	val shortErrorPhrase: JsonElement = JsonNull,
	val errorPhrase: JsonElement = JsonNull,
)

@Serializable
data class CategorySocialClubResponseItemsSeller(
	@SerialName("user_id")
	val userId: Double = 0.0,
	@SerialName("sold_items_count")
	val soldItemsCount: Double = 0.0,
	@SerialName("active_items_count")
	val activeItemsCount: Double = 0.0,
	@SerialName("restore_data")
	val restoreData: String = "",
	val username: String = "",
	@SerialName("avatar_date")
	val avatarDate: Double = 0.0,
	@SerialName("is_banned")
	val isBanned: Double = 0.0,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Double = 0.0,
	@SerialName("restore_percents")
	val restorePercents: JsonElement = JsonNull,
)

@Serializable
data class CategorySocialClubResponseItems(
	@SerialName("item_id")
	val itemId: Double = 0.0,
	@SerialName("item_state")
	val itemState: String = "",
	@SerialName("category_id")
	val categoryId: Double = 0.0,
	@SerialName("published_date")
	val publishedDate: Double = 0.0,
	val title: String = "",
	val description: String = "",
	val price: Double = 0.0,
	@SerialName("update_stat_date")
	val updateStatDate: Double = 0.0,
	@SerialName("refreshed_date")
	val refreshedDate: Double = 0.0,
	@SerialName("edit_date")
	val editDate: Double = 0.0,
	@SerialName("view_count")
	val viewCount: Double = 0.0,
	@SerialName("is_sticky")
	val isSticky: Double = 0.0,
	@SerialName("item_origin")
	val itemOrigin: String = "",
	@SerialName("extended_guarantee")
	val extendedGuarantee: Double = 0.0,
	val nsb: Double = 0.0,
	@SerialName("allow_ask_discount")
	val allowAskDiscount: Double = 0.0,
	@SerialName("title_en")
	val titleEn: String = "",
	@SerialName("description_en")
	val descriptionEn: String = "",
	@SerialName("email_type")
	val emailType: String = "",
	@SerialName("email_provider")
	val emailProvider: String = "",
	@SerialName("item_domain")
	val itemDomain: String = "",
	@SerialName("resale_item_origin")
	val resaleItemOrigin: String = "",
	@SerialName("socialclub_item_id")
	val socialclubItemId: Double = 0.0,
	@SerialName("socialclub_level")
	val socialclubLevel: Double = 0.0,
	@SerialName("socialclub_cash")
	val socialclubCash: Double = 0.0,
	@SerialName("socialclub_bank_cash")
	val socialclubBankCash: Double = 0.0,
	@SerialName("socialclub_games")
	val socialclubGames: List<CategorySocialClubResponseItemsSocialclubGames> = emptyList(),
	@SerialName("socialclub_last_activity")
	val socialclubLastActivity: Double = 0.0,
	@SerialName("socialclub_has_gtav")
	val socialclubHasGtav: Double = 0.0,
	@SerialName("socialclub_has_rdr2")
	val socialclubHasRdr2: Double = 0.0,
	@SerialName("feedback_data")
	val feedbackData: String = "",
	val isIgnored: Boolean = false,
	val priceWithSellerFee: Double = 0.0,
	val guarantee: JsonElement = JsonNull,
	val canViewLoginData: Boolean = false,
	val canUpdateItemStats: Boolean = false,
	val canReportItem: Boolean = false,
	val canViewEmailLoginData: Boolean = false,
	val showGetEmailCodeButton: Boolean = false,
	val canOpenItem: Boolean = false,
	val canCloseItem: Boolean = false,
	val canEditItem: Boolean = false,
	val canDeleteItem: Boolean = false,
	val canStickItem: Boolean = false,
	val canUnstickItem: Boolean = false,
	val bumpSettings: CategorySocialClubResponseItemsBumpSettings = CategorySocialClubResponseItemsBumpSettings(),
	val canBumpItem: Boolean = false,
	val canBuyItem: Boolean = false,
	@SerialName("rub_price")
	val rubPrice: Double = 0.0,
	@SerialName("price_currency")
	val priceCurrency: String = "",
	val canValidateAccount: Boolean = false,
	val canResellItemAfterPurchase: Boolean = false,
	val isSmallExf: Boolean = false,
	@SerialName("account_last_activity")
	val accountLastActivity: Double = 0.0,
	val canViewAccountLink: Boolean = false,
	val accountLinks: List<JsonElement> = emptyList(),
	val emailLoginUrl: String = "",
	val canChangePassword: Boolean = false,
	val itemOriginPhrase: String = "",
	val tags: List<JsonElement> = emptyList(),
	@SerialName("note_text")
	val noteText: JsonElement = JsonNull,
	val hasPendingAutoBuy: Boolean = false,
	val descriptionHtml: String = "",
	val descriptionEnHtml: String = "",
	val descriptionPlain: String = "",
	val descriptionEnPlain: String = "",
	val seller: CategorySocialClubResponseItemsSeller = CategorySocialClubResponseItemsSeller(),
)

@Serializable
data class CategoryUplayParams(
    /** The number of the page to display results from. */
	val page: Long? = null,
    /** Minimal price of account (Inclusive). */
	val pmin: Long? = null,
    /** Maximum price of account (Inclusive). */
	val pmax: Long? = null,
    /** The word or words contained in the account title. */
	val title: String? = null,
    /** Order by. */
	@SerialName("order_by")
	val orderBy: OrderBy? = null,
    /** List of tag ids (Tag list is available via GET /me). */
	@SerialName("tag_id[]")
	val tagId: List<Long>? = null,
    /** List of tag ids that won't be included (Tag list is available via GET /me). */
	@SerialName("not_tag_id[]")
	val notTagId: List<Long>? = null,
    /** List of tag ids (Tag list is available via GET /me). */
	@SerialName("public_tag_id[]")
	val publicTagId: List<Long>? = null,
    /** List of tag ids that won't be included (Tag list is available via GET /me). */
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Long>? = null,
    /** List of account origins. */
	@SerialName("origin[]")
	val origin: JsonElement? = null,
    /** List of account origins that won't be included. */
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
    /** Search accounts of user. */
	@SerialName("user_id")
	val userId: Long? = null,
    /** Not sold before. */
	val nsb: Boolean? = null,
    /** Sold before. */
	val sb: Boolean? = null,
    /** Not sold by me before. */
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
    /** Sold by me before. */
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
    /** Currency in which the cost of the account will be searched. */
	val currency: Currency? = null,
    /** Has email login data. */
	@SerialName("email_login_data")
	val emailLoginData: Boolean? = null,
    /** Email provider. */
	@SerialName("email_provider[]")
	val emailProvider: JsonElement? = null,
    /** Email provider. */
	@SerialName("not_email_provider[]")
	val notEmailProvider: NotEmailProvider? = null,
    /** Parse same item ids. */
	@SerialName("parse_same_item_ids")
	val parseSameItemIds: Boolean? = null,
    /** Email type. */
	@SerialName("email_type[]")
	val emailType: JsonElement? = null,
    /** Domain of native/autoreg email. */
	@SerialName("item_domain")
	val itemDomain: String? = null,
    /** List of games. */
	@SerialName("game[]")
	val game: List<String>? = null,
    /** List of allowed countries. */
	@SerialName("country[]")
	val country: List<String>? = null,
    /** List of disallowed countries. */
	@SerialName("not_country[]")
	val notCountry: List<String>? = null,
    /** Number of days the account has been offline. */
	val daybreak: Long? = null,
    /** Minimum count of games. */
	val gmin: Long? = null,
    /** Maximum count of games. */
	val gmax: Long? = null,
    /** Name of subscription. */
	val subscription: CategorySubscription3? = null,
    /** Length of subscription. */
	@SerialName("subscription_length")
	val subscriptionLength: Long? = null,
    /** In what notation is time measured. */
	@SerialName("subscription_period")
	val subscriptionPeriod: SubscriptionPeriod? = null,
    /** Minimum level in Tom Clancy's Rainbow Six Siege. */
	@SerialName("r6_level_min")
	val r6LevelMin: Long? = null,
    /** Maximum level in Tom Clancy's Rainbow Six Siege. */
	@SerialName("r6_level_max")
	val r6LevelMax: Long? = null,
    /** Minimum rank points in Tom Clancy's Rainbow Six Siege. */
	@SerialName("r6_rank_min")
	val r6RankMin: Long? = null,
    /** Maximum rank points in Tom Clancy's Rainbow Six Siege. */
	@SerialName("r6_rank_max")
	val r6RankMax: Long? = null,
    /** Minimum count of operators in Tom Clancy's Rainbow Six Siege. */
	@SerialName("r6_operators_min")
	val r6OperatorsMin: Long? = null,
    /** Maximum count of operators in Tom Clancy's Rainbow Six Siege. */
	@SerialName("r6_operators_max")
	val r6OperatorsMax: Long? = null,
    /** Is account banned in Tom Clancy's Rainbow Six Siege */
	@SerialName("r6_ban")
	val r6Ban: R6Ban? = null,
    /** Minimum number of skins in Tom Clancy's Rainbow Six Siege. */
	@SerialName("r6_smin")
	val r6Smin: Long? = null,
    /** Maximum number of skins in Tom Clancy's Rainbow Six Siege. */
	@SerialName("r6_smax")
	val r6Smax: Long? = null,
    /** List of weapon skins in Tom Clancy's Rainbow Six Siege. */
	@SerialName("r6_skin[]")
	val r6Skin: List<String>? = null,
    /** List of operators in Tom Clancy's Rainbow Six Siege. */
	@SerialName("r6_operator[]")
	val r6Operator: List<String>? = null,
    /** Xbox connected to account. */
	@SerialName("xbox_connected")
	val xboxConnected: XboxConnected? = null,
    /** PSN connected to account. */
	@SerialName("psn_connected")
	val psnConnected: PsnConnected? = null,
    /** Steam connected to account. */
	@SerialName("steam_connected")
	val steamConnected: SteamConnected? = null,
    /** Minimum balance. */
	@SerialName("balance_min")
	val balanceMin: Double? = null,
    /** Maximum balance. */
	@SerialName("balance_max")
	val balanceMax: Double? = null,
    /** Has transactions. */
	val transactions: Transactions? = null,
    /** How old is the account. */
	val reg: Long? = null,
    /** In what notation is time measured. */
	@SerialName("reg_period")
	val regPeriod: RegPeriod? = null,
)

@Serializable
data class CategoryUplayResponse(
	val items: List<CategoryUplayResponseItems> = emptyList(),
	val totalItems: Double = 0.0,
	val totalItemsPrice: JsonElement = JsonNull,
	val hasNextPage: Boolean = false,
	val perPage: Double = 0.0,
	val page: Double = 0.0,
	val wasCached: Boolean = false,
	val cacheTTL: Double = 0.0,
	val lastModified: Double = 0.0,
	val serverTime: Double = 0.0,
	val searchUrl: String = "",
	val stickyItems: List<JsonElement> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class CategoryUplayResponseItemsUplayGamesFfffffffFfffFfffFfffFfffffffffff(
	val title: String = "",
	val img: String = "",
	val pvpTimePlayed: Double = 0.0,
	val pveTimePlayed: Double = 0.0,
	val abbr: String = "",
	val gameId: String = "",
)

@Serializable
data class CategoryUplayResponseItemsUplayGames(
	@SerialName("ffffffff-ffff-ffff-ffff-ffffffffffff")
	val ffffffffFfffFfffFfffFfffffffffff: CategoryUplayResponseItemsUplayGamesFfffffffFfffFfffFfffFfffffffffff = CategoryUplayResponseItemsUplayGamesFfffffffFfffFfffFfffFfffffffffff(),
)

@Serializable
data class CategoryUplayResponseItemsBumpSettings(
	val canBumpItem: Boolean = false,
	val canBumpItemGlobally: Boolean = false,
	val shortErrorPhrase: JsonElement = JsonNull,
	val errorPhrase: JsonElement = JsonNull,
)

@Serializable
data class CategoryUplayResponseItemsR6Operators(
	val img: String = "",
	val name: String = "",
	val url: String = "",
)

@Serializable
data class CategoryUplayResponseItemsSeller(
	@SerialName("user_id")
	val userId: Double = 0.0,
	@SerialName("sold_items_count")
	val soldItemsCount: Double = 0.0,
	@SerialName("active_items_count")
	val activeItemsCount: Double = 0.0,
	@SerialName("restore_data")
	val restoreData: String = "",
	val username: String = "",
	@SerialName("avatar_date")
	val avatarDate: Double = 0.0,
	@SerialName("is_banned")
	val isBanned: Double = 0.0,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Double = 0.0,
	@SerialName("restore_percents")
	val restorePercents: Double = 0.0,
)

@Serializable
data class CategoryUplayResponseItems(
	@SerialName("item_id")
	val itemId: Double = 0.0,
	@SerialName("item_state")
	val itemState: String = "",
	@SerialName("category_id")
	val categoryId: Double = 0.0,
	@SerialName("published_date")
	val publishedDate: Double = 0.0,
	val title: String = "",
	val description: String = "",
	val price: Double = 0.0,
	@SerialName("update_stat_date")
	val updateStatDate: Double = 0.0,
	@SerialName("refreshed_date")
	val refreshedDate: Double = 0.0,
	@SerialName("edit_date")
	val editDate: Double = 0.0,
	@SerialName("view_count")
	val viewCount: Double = 0.0,
	@SerialName("is_sticky")
	val isSticky: Double = 0.0,
	@SerialName("item_origin")
	val itemOrigin: String = "",
	@SerialName("extended_guarantee")
	val extendedGuarantee: Double = 0.0,
	val nsb: Double = 0.0,
	@SerialName("allow_ask_discount")
	val allowAskDiscount: Double = 0.0,
	@SerialName("title_en")
	val titleEn: String = "",
	@SerialName("description_en")
	val descriptionEn: String = "",
	@SerialName("email_type")
	val emailType: String = "",
	@SerialName("email_provider")
	val emailProvider: String = "",
	@SerialName("item_domain")
	val itemDomain: String = "",
	@SerialName("resale_item_origin")
	val resaleItemOrigin: String = "",
	@SerialName("uplay_item_id")
	val uplayItemId: Double = 0.0,
	@SerialName("uplay_last_activity")
	val uplayLastActivity: Double = 0.0,
	@SerialName("uplay_country")
	val uplayCountry: String = "",
	@SerialName("uplay_created_date")
	val uplayCreatedDate: Double = 0.0,
	@SerialName("uplay_games")
	val uplayGames: CategoryUplayResponseItemsUplayGames = CategoryUplayResponseItemsUplayGames(),
	@SerialName("uplay_game_count")
	val uplayGameCount: Double = 0.0,
	@SerialName("uplay_r6_level")
	val uplayR6Level: Double = 0.0,
	@SerialName("uplay_r6_ban")
	val uplayR6Ban: Double = 0.0,
	@SerialName("uplay_r6_operators")
	val uplayR6Operators: String = "",
	@SerialName("uplay_r6_operators_count")
	val uplayR6OperatorsCount: Double = 0.0,
	@SerialName("uplay_r6_skins")
	val uplayR6Skins: String = "",
	@SerialName("uplay_r6_skins_count")
	val uplayR6SkinsCount: Double = 0.0,
	@SerialName("uplay_subscription")
	val uplaySubscription: String = "",
	@SerialName("uplay_subscription_end_date")
	val uplaySubscriptionEndDate: Double = 0.0,
	@SerialName("uplay_xbox_connected")
	val uplayXboxConnected: Double = 0.0,
	@SerialName("uplay_psn_connected")
	val uplayPsnConnected: Double = 0.0,
	@SerialName("uplay_steam_connected")
	val uplaySteamConnected: Double = 0.0,
	@SerialName("uplay_r6_rank")
	val uplayR6Rank: Double = 0.0,
	@SerialName("feedback_data")
	val feedbackData: String = "",
	val isIgnored: Boolean = false,
	val priceWithSellerFee: Double = 0.0,
	val guarantee: JsonElement = JsonNull,
	val canViewLoginData: Boolean = false,
	val canUpdateItemStats: Boolean = false,
	val canReportItem: Boolean = false,
	val canViewEmailLoginData: Boolean = false,
	val showGetEmailCodeButton: Boolean = false,
	val canOpenItem: Boolean = false,
	val canCloseItem: Boolean = false,
	val canEditItem: Boolean = false,
	val canDeleteItem: Boolean = false,
	val canStickItem: Boolean = false,
	val canUnstickItem: Boolean = false,
	val bumpSettings: CategoryUplayResponseItemsBumpSettings = CategoryUplayResponseItemsBumpSettings(),
	val canBumpItem: Boolean = false,
	val canBuyItem: Boolean = false,
	@SerialName("rub_price")
	val rubPrice: Double = 0.0,
	@SerialName("price_currency")
	val priceCurrency: String = "",
	val canValidateAccount: Boolean = false,
	val canResellItemAfterPurchase: Boolean = false,
	val uplayLinkedAccounts: String = "",
	@SerialName("uplay_r6_steam_warning")
	val uplayR6SteamWarning: Boolean = false,
	@SerialName("uplay_r6_external_warning")
	val uplayR6ExternalWarning: Boolean = false,
	@SerialName("uplay_r6")
	val uplayR6: Boolean = false,
	@SerialName("uplay_r6_ban_active")
	val uplayR6BanActive: Boolean = false,
	val isSmallExf: Boolean = false,
	@SerialName("account_last_activity")
	val accountLastActivity: Double = 0.0,
	val r6Skins: List<JsonElement> = emptyList(),
	val r6Operators: List<CategoryUplayResponseItemsR6Operators> = emptyList(),
	val canViewAccountLink: Boolean = false,
	val emailLoginUrl: String = "",
	val canChangePassword: Boolean = false,
	val itemOriginPhrase: String = "",
	@SerialName("sold_items_category_count")
	val soldItemsCategoryCount: Double = 0.0,
	@SerialName("restore_items_category_count")
	val restoreItemsCategoryCount: Double = 0.0,
	val tags: List<JsonElement> = emptyList(),
	@SerialName("note_text")
	val noteText: JsonElement = JsonNull,
	val hasPendingAutoBuy: Boolean = false,
	val descriptionHtml: String = "",
	val descriptionEnHtml: String = "",
	val descriptionPlain: String = "",
	val descriptionEnPlain: String = "",
	val seller: CategoryUplayResponseItemsSeller = CategoryUplayResponseItemsSeller(),
)

@Serializable
data class CategoryDiscordParams(
    /** The number of the page to display results from. */
	val page: Long? = null,
    /** Minimal price of account (Inclusive). */
	val pmin: Long? = null,
    /** Maximum price of account (Inclusive). */
	val pmax: Long? = null,
    /** The word or words contained in the account title. */
	val title: String? = null,
    /** Order by. */
	@SerialName("order_by")
	val orderBy: OrderBy? = null,
    /** List of tag ids (Tag list is available via GET /me). */
	@SerialName("tag_id[]")
	val tagId: List<Long>? = null,
    /** List of tag ids that won't be included (Tag list is available via GET /me). */
	@SerialName("not_tag_id[]")
	val notTagId: List<Long>? = null,
    /** List of tag ids (Tag list is available via GET /me). */
	@SerialName("public_tag_id[]")
	val publicTagId: List<Long>? = null,
    /** List of tag ids that won't be included (Tag list is available via GET /me). */
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Long>? = null,
    /** List of account origins. */
	@SerialName("origin[]")
	val origin: JsonElement? = null,
    /** List of account origins that won't be included. */
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
    /** Search accounts of user. */
	@SerialName("user_id")
	val userId: Long? = null,
    /** Not sold before. */
	val nsb: Boolean? = null,
    /** Sold before. */
	val sb: Boolean? = null,
    /** Not sold by me before. */
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
    /** Sold by me before. */
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
    /** Currency in which the cost of the account will be searched. */
	val currency: Currency? = null,
    /** Has email login data. */
	@SerialName("email_login_data")
	val emailLoginData: Boolean? = null,
    /** Email provider. */
	@SerialName("email_provider[]")
	val emailProvider: JsonElement? = null,
    /** Email provider. */
	@SerialName("not_email_provider[]")
	val notEmailProvider: NotEmailProvider? = null,
    /** Parse same item ids. */
	@SerialName("parse_same_item_ids")
	val parseSameItemIds: Boolean? = null,
    /** Email type. */
	@SerialName("email_type[]")
	val emailType: JsonElement? = null,
    /** Domain of native/autoreg email. */
	@SerialName("item_domain")
	val itemDomain: String? = null,
    /** Has linked mobile. */
	val tel: Tel? = null,
    /** Has nitro. */
	val nitro: Nitro? = null,
    /** Nitro type. */
	@SerialName("nitro_type[]")
	val nitroType: JsonElement? = null,
    /** Length of nitro. */
	@SerialName("nitro_length")
	val nitroLength: Long? = null,
    /** In what notation is time measured. */
	@SerialName("nitro_period")
	val nitroPeriod: NitroPeriod? = null,
    /** Minimum number of boosts. */
	@SerialName("boosts_min")
	val boostsMin: Long? = null,
    /** Maximum number of boosts. */
	@SerialName("boosts_max")
	val boostsMax: Long? = null,
    /** Has billing. */
	val billing: Billing? = null,
    /** Has gifts. */
	val gifts: Gifts? = null,
    /** Has transactions. */
	val transactions: Transactions? = null,
    /** List of badges. */
	@SerialName("badge[]")
	val badge: JsonElement? = null,
    /** List of account conditions. */
	@SerialName("condition[]")
	val condition: JsonElement? = null,
    /** Minimum number of chats. */
	@SerialName("chat_min")
	val chatMin: Long? = null,
    /** Maximum number of chats. */
	@SerialName("chat_max")
	val chatMax: Long? = null,
    /** Minimum number of subscribers in server, where account is administrator/owner. */
	@SerialName("min_admin_members")
	val minAdminMembers: Long? = null,
    /** Maximum number of subscribers in server, where account is administrator/owner. */
	@SerialName("max_admin_members")
	val maxAdminMembers: Long? = null,
    /** Minimum number of servers, where account is administrator/owner. */
	@SerialName("min_admin")
	val minAdmin: Long? = null,
    /** Maximum number of servers, where account is administrator/owner. */
	@SerialName("max_admin")
	val maxAdmin: Long? = null,
    /** How old is the account. */
	val reg: Long? = null,
    /** In what notation is time measured. */
	@SerialName("reg_period")
	val regPeriod: RegPeriod? = null,
    /** List of languages. */
	@SerialName("language[]")
	val language: List<String>? = null,
    /** List of languages that won't be included. */
	@SerialName("not_language[]")
	val notLanguage: List<String>? = null,
    /** Has clans. */
	val clans: Clans? = null,
    /** Minimum number of clans, where account is administrator. */
	@SerialName("min_admin_clans")
	val minAdminClans: Long? = null,
    /** Maximum number of clans, where account is administrator. */
	@SerialName("max_admin_clans")
	val maxAdminClans: Long? = null,
    /** Minimum number of clans, where account is owner. */
	@SerialName("min_owner_clans")
	val minOwnerClans: Long? = null,
    /** Maximum number of clans, where account is owner. */
	@SerialName("max_owner_clans")
	val maxOwnerClans: Long? = null,
    /** List of allowed countries. */
	@SerialName("country[]")
	val country: List<String>? = null,
    /** List of disallowed countries. */
	@SerialName("not_country[]")
	val notCountry: List<String>? = null,
    /** Minimum count of servers. */
	@SerialName("min_servers")
	val minServers: Long? = null,
    /** Maximum count of servers. */
	@SerialName("max_servers")
	val maxServers: Long? = null,
    /** Has two-factor authentication. */
	@SerialName("2fa")
	val `2fa`: V2fa? = null,
    /** Minimum number of Nitro full credits. */
	@SerialName("min_full_credits")
	val minFullCredits: Long? = null,
    /** Maximum number of Nitro full credits. */
	@SerialName("max_full_credits")
	val maxFullCredits: Long? = null,
    /** Minimum number of Nitro basic credits. */
	@SerialName("min_basic_credits")
	val minBasicCredits: Long? = null,
    /** Maximum number of Nitro basic credits. */
	@SerialName("max_basic_credits")
	val maxBasicCredits: Long? = null,
    /** Minimum number of Discord Orbs. */
	@SerialName("min_orbs")
	val minOrbs: Long? = null,
    /** Maximum number of Discord Orbs. */
	@SerialName("max_orbs")
	val maxOrbs: Long? = null,
)

@Serializable
data class CategoryDiscordResponse(
	val items: List<CategoryDiscordResponseItems> = emptyList(),
	val totalItems: Double = 0.0,
	val totalItemsPrice: JsonElement = JsonNull,
	val hasNextPage: Boolean = false,
	val perPage: Double = 0.0,
	val page: Double = 0.0,
	val wasCached: Boolean = false,
	val cacheTTL: Double = 0.0,
	val lastModified: Double = 0.0,
	val serverTime: Double = 0.0,
	val searchUrl: String = "",
	val stickyItems: List<JsonElement> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class CategoryDiscordResponseItemsBumpSettings(
	val canBumpItem: Boolean = false,
	val canBumpItemGlobally: Boolean = false,
	val shortErrorPhrase: JsonElement = JsonNull,
	val errorPhrase: JsonElement = JsonNull,
)

@Serializable
data class CategoryDiscordResponseItemsSeller(
	@SerialName("user_id")
	val userId: Double = 0.0,
	@SerialName("sold_items_count")
	val soldItemsCount: Double = 0.0,
	@SerialName("active_items_count")
	val activeItemsCount: Double = 0.0,
	@SerialName("restore_data")
	val restoreData: String = "",
	val username: String = "",
	@SerialName("avatar_date")
	val avatarDate: Double = 0.0,
	@SerialName("is_banned")
	val isBanned: Double = 0.0,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Double = 0.0,
	@SerialName("restore_percents")
	val restorePercents: JsonElement = JsonNull,
)

@Serializable
data class CategoryDiscordResponseItems(
	@SerialName("item_id")
	val itemId: Double = 0.0,
	@SerialName("item_state")
	val itemState: String = "",
	@SerialName("category_id")
	val categoryId: Double = 0.0,
	@SerialName("published_date")
	val publishedDate: Double = 0.0,
	val title: String = "",
	val description: String = "",
	val price: Double = 0.0,
	@SerialName("update_stat_date")
	val updateStatDate: Double = 0.0,
	@SerialName("refreshed_date")
	val refreshedDate: Double = 0.0,
	@SerialName("edit_date")
	val editDate: Double = 0.0,
	@SerialName("view_count")
	val viewCount: Double = 0.0,
	@SerialName("is_sticky")
	val isSticky: Double = 0.0,
	@SerialName("item_origin")
	val itemOrigin: String = "",
	@SerialName("extended_guarantee")
	val extendedGuarantee: Double = 0.0,
	val nsb: Double = 0.0,
	@SerialName("allow_ask_discount")
	val allowAskDiscount: Double = 0.0,
	@SerialName("title_en")
	val titleEn: String = "",
	@SerialName("description_en")
	val descriptionEn: String = "",
	@SerialName("email_type")
	val emailType: String = "",
	@SerialName("email_provider")
	val emailProvider: String = "",
	@SerialName("item_domain")
	val itemDomain: String = "",
	@SerialName("resale_item_origin")
	val resaleItemOrigin: String = "",
	@SerialName("discord_item_id")
	val discordItemId: Double = 0.0,
	@SerialName("discord_chat_count")
	val discordChatCount: Double = 0.0,
	@SerialName("discord_verified")
	val discordVerified: Double = 0.0,
	@SerialName("discord_condition")
	val discordCondition: String = "",
	@SerialName("discord_gifts")
	val discordGifts: Double = 0.0,
	@SerialName("discord_billing")
	val discordBilling: Double = 0.0,
	@SerialName("discord_register_date")
	val discordRegisterDate: Double = 0.0,
	@SerialName("discord_locale")
	val discordLocale: String = "",
	@SerialName("discord_nitro_end_date")
	val discordNitroEndDate: Double = 0.0,
	@SerialName("discord_available_boosts")
	val discordAvailableBoosts: Double = 0.0,
	@SerialName("discord_nitro_type")
	val discordNitroType: Double = 0.0,
	@SerialName("discord_admin_members_count")
	val discordAdminMembersCount: Double = 0.0,
	@SerialName("discord_admin_servers_count")
	val discordAdminServersCount: Double = 0.0,
	@SerialName("discord_admin_servers")
	val discordAdminServers: String = "",
	@SerialName("feedback_data")
	val feedbackData: String = "",
	val isIgnored: Boolean = false,
	val priceWithSellerFee: Double = 0.0,
	val guarantee: JsonElement = JsonNull,
	val canViewLoginData: Boolean = false,
	val canUpdateItemStats: Boolean = false,
	val canReportItem: Boolean = false,
	val canViewEmailLoginData: Boolean = false,
	val showGetEmailCodeButton: Boolean = false,
	val canOpenItem: Boolean = false,
	val canCloseItem: Boolean = false,
	val canEditItem: Boolean = false,
	val canDeleteItem: Boolean = false,
	val canStickItem: Boolean = false,
	val canUnstickItem: Boolean = false,
	val bumpSettings: CategoryDiscordResponseItemsBumpSettings = CategoryDiscordResponseItemsBumpSettings(),
	val canBumpItem: Boolean = false,
	val canBuyItem: Boolean = false,
	@SerialName("rub_price")
	val rubPrice: Double = 0.0,
	@SerialName("price_currency")
	val priceCurrency: String = "",
	val canValidateAccount: Boolean = false,
	val canResellItemAfterPurchase: Boolean = false,
	val discordAccountConditionLabel: String = "",
	val discordLocaleTitle: String = "",
	val canViewAccountLink: Boolean = false,
	val emailLoginUrl: String = "",
	val canChangePassword: Boolean = false,
	val itemOriginPhrase: String = "",
	val tags: List<JsonElement> = emptyList(),
	@SerialName("note_text")
	val noteText: JsonElement = JsonNull,
	val hasPendingAutoBuy: Boolean = false,
	val descriptionHtml: String = "",
	val descriptionEnHtml: String = "",
	val descriptionPlain: String = "",
	val descriptionEnPlain: String = "",
	val seller: CategoryDiscordResponseItemsSeller = CategoryDiscordResponseItemsSeller(),
)

@Serializable
data class CategoryTikTokParams(
    /** The number of the page to display results from. */
	val page: Long? = null,
    /** Minimal price of account (Inclusive). */
	val pmin: Long? = null,
    /** Maximum price of account (Inclusive). */
	val pmax: Long? = null,
    /** The word or words contained in the account title. */
	val title: String? = null,
    /** Order by. */
	@SerialName("order_by")
	val orderBy: OrderBy? = null,
    /** List of tag ids (Tag list is available via GET /me). */
	@SerialName("tag_id[]")
	val tagId: List<Long>? = null,
    /** List of tag ids that won't be included (Tag list is available via GET /me). */
	@SerialName("not_tag_id[]")
	val notTagId: List<Long>? = null,
    /** List of tag ids (Tag list is available via GET /me). */
	@SerialName("public_tag_id[]")
	val publicTagId: List<Long>? = null,
    /** List of tag ids that won't be included (Tag list is available via GET /me). */
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Long>? = null,
    /** List of account origins. */
	@SerialName("origin[]")
	val origin: JsonElement? = null,
    /** List of account origins that won't be included. */
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
    /** Search accounts of user. */
	@SerialName("user_id")
	val userId: Long? = null,
    /** Not sold before. */
	val nsb: Boolean? = null,
    /** Sold before. */
	val sb: Boolean? = null,
    /** Not sold by me before. */
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
    /** Sold by me before. */
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
    /** Currency in which the cost of the account will be searched. */
	val currency: Currency? = null,
    /** Has email login data. */
	@SerialName("email_login_data")
	val emailLoginData: Boolean? = null,
    /** Email provider. */
	@SerialName("email_provider[]")
	val emailProvider: JsonElement? = null,
    /** Email provider. */
	@SerialName("not_email_provider[]")
	val notEmailProvider: NotEmailProvider? = null,
    /** Parse same item ids. */
	@SerialName("parse_same_item_ids")
	val parseSameItemIds: Boolean? = null,
    /** Email type. */
	@SerialName("email_type[]")
	val emailType: JsonElement? = null,
    /** Domain of native/autoreg email. */
	@SerialName("item_domain")
	val itemDomain: String? = null,
    /** Has linked mobile. */
	val tel: Tel? = null,
    /** How old is the account. */
	val reg: Long? = null,
    /** In what notation is time measured. */
	@SerialName("reg_period")
	val regPeriod: RegPeriod? = null,
    /** Minimum number of followers. */
	@SerialName("followers_min")
	val followersMin: Long? = null,
    /** Maximum number of followers. */
	@SerialName("followers_max")
	val followersMax: Long? = null,
    /** Minimum number of posts. */
	@SerialName("post_min")
	val postMin: Long? = null,
    /** Maximum number of posts. */
	@SerialName("post_max")
	val postMax: Long? = null,
    /** Minimum number of likes. */
	@SerialName("like_min")
	val likeMin: Long? = null,
    /** Maximum number of likes. */
	@SerialName("like_max")
	val likeMax: Long? = null,
    /** Minimum number of coins. */
	@SerialName("coins_min")
	val coinsMin: Long? = null,
    /** Maximum number of coins. */
	@SerialName("coins_max")
	val coinsMax: Long? = null,
    /** Login by cookies. */
	@SerialName("cookie_login")
	val cookieLogin: CookieLogin? = null,
    /** Has verified. */
	val verified: Verified? = null,
    /** Has linked email. */
	val email: Email? = null,
)

@Serializable
data class CategoryTikTokResponse(
	val items: List<CategoryTikTokResponseItems> = emptyList(),
	val totalItems: Double = 0.0,
	val totalItemsPrice: JsonElement = JsonNull,
	val hasNextPage: Boolean = false,
	val perPage: Double = 0.0,
	val page: Double = 0.0,
	val wasCached: Boolean = false,
	val cacheTTL: Double = 0.0,
	val lastModified: Double = 0.0,
	val serverTime: Double = 0.0,
	val searchUrl: String = "",
	val stickyItems: List<JsonElement> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class CategoryTikTokResponseItemsBumpSettings(
	val canBumpItem: Boolean = false,
	val canBumpItemGlobally: Boolean = false,
	val shortErrorPhrase: JsonElement = JsonNull,
	val errorPhrase: JsonElement = JsonNull,
)

@Serializable
data class CategoryTikTokResponseItemsAccountLinks(
	val link: String = "",
	val text: String = "",
	val iconClass: String = "",
)

@Serializable
data class CategoryTikTokResponseItemsSeller(
	@SerialName("user_id")
	val userId: Double = 0.0,
	@SerialName("sold_items_count")
	val soldItemsCount: Double = 0.0,
	@SerialName("active_items_count")
	val activeItemsCount: Double = 0.0,
	@SerialName("restore_data")
	val restoreData: String = "",
	val username: String = "",
	@SerialName("avatar_date")
	val avatarDate: Double = 0.0,
	@SerialName("is_banned")
	val isBanned: Double = 0.0,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Double = 0.0,
	@SerialName("restore_percents")
	val restorePercents: Double = 0.0,
)

@Serializable
data class CategoryTikTokResponseItems(
	@SerialName("item_id")
	val itemId: Double = 0.0,
	@SerialName("item_state")
	val itemState: String = "",
	@SerialName("category_id")
	val categoryId: Double = 0.0,
	@SerialName("published_date")
	val publishedDate: Double = 0.0,
	val title: String = "",
	val description: String = "",
	val price: Double = 0.0,
	@SerialName("update_stat_date")
	val updateStatDate: Double = 0.0,
	@SerialName("refreshed_date")
	val refreshedDate: Double = 0.0,
	@SerialName("edit_date")
	val editDate: Double = 0.0,
	@SerialName("view_count")
	val viewCount: Double = 0.0,
	@SerialName("is_sticky")
	val isSticky: Double = 0.0,
	@SerialName("item_origin")
	val itemOrigin: String = "",
	@SerialName("extended_guarantee")
	val extendedGuarantee: Double = 0.0,
	val nsb: Double = 0.0,
	@SerialName("allow_ask_discount")
	val allowAskDiscount: Double = 0.0,
	@SerialName("title_en")
	val titleEn: String = "",
	@SerialName("description_en")
	val descriptionEn: String = "",
	@SerialName("email_type")
	val emailType: String = "",
	@SerialName("email_provider")
	val emailProvider: JsonElement = JsonNull,
	@SerialName("item_domain")
	val itemDomain: String = "",
	@SerialName("resale_item_origin")
	val resaleItemOrigin: String = "",
	@SerialName("tt_item_id")
	val ttItemId: Double = 0.0,
	@SerialName("tt_id")
	val ttId: Double = 0.0,
	@SerialName("tt_permalink")
	val ttPermalink: String = "",
	@SerialName("tt_uniqueId")
	val ttUniqueId: String = "",
	@SerialName("tt_verified")
	val ttVerified: Double = 0.0,
	@SerialName("tt_createTime")
	val ttCreateTime: Double = 0.0,
	@SerialName("tt_privateAccount")
	val ttPrivateAccount: Double = 0.0,
	@SerialName("tt_followers")
	val ttFollowers: Double = 0.0,
	@SerialName("tt_following")
	val ttFollowing: Double = 0.0,
	@SerialName("tt_likes")
	val ttLikes: Double = 0.0,
	@SerialName("tt_videos")
	val ttVideos: Double = 0.0,
	@SerialName("tt_screen_name")
	val ttScreenName: String = "",
	@SerialName("tt_hasEmail")
	val ttHasEmail: Double = 0.0,
	@SerialName("tt_hasMobile")
	val ttHasMobile: Double = 0.0,
	@SerialName("tt_top_country")
	val ttTopCountry: String = "",
	@SerialName("tt_countries")
	val ttCountries: String = "",
	@SerialName("tt_coins")
	val ttCoins: Double = 0.0,
	@SerialName("tt_hasLivePermission")
	val ttHasLivePermission: Double = 0.0,
	@SerialName("tt_cookie_login")
	val ttCookieLogin: Double = 0.0,
	@SerialName("feedback_data")
	val feedbackData: String = "",
	val isIgnored: Boolean = false,
	val priceWithSellerFee: Double = 0.0,
	val guarantee: JsonElement = JsonNull,
	val canViewLoginData: Boolean = false,
	val canUpdateItemStats: Boolean = false,
	val canReportItem: Boolean = false,
	val canViewEmailLoginData: Boolean = false,
	val showGetEmailCodeButton: Boolean = false,
	val canOpenItem: Boolean = false,
	val canCloseItem: Boolean = false,
	val canEditItem: Boolean = false,
	val canDeleteItem: Boolean = false,
	val canStickItem: Boolean = false,
	val canUnstickItem: Boolean = false,
	val bumpSettings: CategoryTikTokResponseItemsBumpSettings = CategoryTikTokResponseItemsBumpSettings(),
	val canBumpItem: Boolean = false,
	val canBuyItem: Boolean = false,
	@SerialName("rub_price")
	val rubPrice: Double = 0.0,
	@SerialName("price_currency")
	val priceCurrency: String = "",
	val canValidateAccount: Boolean = false,
	val canResellItemAfterPurchase: Boolean = false,
	val canViewAccountLink: Boolean = false,
	val accountLinks: List<CategoryTikTokResponseItemsAccountLinks> = emptyList(),
	val accountLink: String = "",
	val canChangePassword: Boolean = false,
	val itemOriginPhrase: String = "",
	@SerialName("sold_items_category_count")
	val soldItemsCategoryCount: Double = 0.0,
	@SerialName("restore_items_category_count")
	val restoreItemsCategoryCount: Double = 0.0,
	val tags: List<JsonElement> = emptyList(),
	@SerialName("note_text")
	val noteText: JsonElement = JsonNull,
	val hasPendingAutoBuy: Boolean = false,
	val descriptionHtml: String = "",
	val descriptionEnHtml: String = "",
	val descriptionPlain: String = "",
	val descriptionEnPlain: String = "",
	val seller: CategoryTikTokResponseItemsSeller = CategoryTikTokResponseItemsSeller(),
)

@Serializable
data class CategoryInstagramParams(
    /** The number of the page to display results from. */
	val page: Long? = null,
    /** Minimal price of account (Inclusive). */
	val pmin: Long? = null,
    /** Maximum price of account (Inclusive). */
	val pmax: Long? = null,
    /** The word or words contained in the account title. */
	val title: String? = null,
    /** Order by. */
	@SerialName("order_by")
	val orderBy: OrderBy? = null,
    /** List of tag ids (Tag list is available via GET /me). */
	@SerialName("tag_id[]")
	val tagId: List<Long>? = null,
    /** List of tag ids that won't be included (Tag list is available via GET /me). */
	@SerialName("not_tag_id[]")
	val notTagId: List<Long>? = null,
    /** List of tag ids (Tag list is available via GET /me). */
	@SerialName("public_tag_id[]")
	val publicTagId: List<Long>? = null,
    /** List of tag ids that won't be included (Tag list is available via GET /me). */
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Long>? = null,
    /** List of account origins. */
	@SerialName("origin[]")
	val origin: JsonElement? = null,
    /** List of account origins that won't be included. */
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
    /** Search accounts of user. */
	@SerialName("user_id")
	val userId: Long? = null,
    /** Not sold before. */
	val nsb: Boolean? = null,
    /** Sold before. */
	val sb: Boolean? = null,
    /** Not sold by me before. */
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
    /** Sold by me before. */
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
    /** Currency in which the cost of the account will be searched. */
	val currency: Currency? = null,
    /** Has email login data. */
	@SerialName("email_login_data")
	val emailLoginData: Boolean? = null,
    /** Email provider. */
	@SerialName("email_provider[]")
	val emailProvider: JsonElement? = null,
    /** Email provider. */
	@SerialName("not_email_provider[]")
	val notEmailProvider: NotEmailProvider? = null,
    /** Parse same item ids. */
	@SerialName("parse_same_item_ids")
	val parseSameItemIds: Boolean? = null,
    /** Email type. */
	@SerialName("email_type[]")
	val emailType: JsonElement? = null,
    /** Domain of native/autoreg email. */
	@SerialName("item_domain")
	val itemDomain: String? = null,
    /** Has linked mobile. */
	val tel: Tel? = null,
    /** List of allowed countries. */
	@SerialName("country[]")
	val country: List<String>? = null,
    /** List of disallowed countries. */
	@SerialName("not_country[]")
	val notCountry: List<String>? = null,
    /** Login by cookies. */
	val cookies: Cookies? = null,
    /** Login without cookies. */
	@SerialName("login_without_cookies")
	val loginWithoutCookies: LoginWithoutCookies? = null,
    /** Minimum number of followers. */
	@SerialName("followers_min")
	val followersMin: Long? = null,
    /** Maximum number of followers. */
	@SerialName("followers_max")
	val followersMax: Long? = null,
    /** Minimum number of posts. */
	@SerialName("post_min")
	val postMin: Long? = null,
    /** Maximum number of posts. */
	@SerialName("post_max")
	val postMax: Long? = null,
    /** How old is the account. */
	val reg: Long? = null,
    /** In what notation is time measured. */
	@SerialName("reg_period")
	val regPeriod: RegPeriod? = null,
)

@Serializable
data class CategoryInstagramResponse(
	val items: List<CategoryInstagramResponseItems> = emptyList(),
	val totalItems: Double = 0.0,
	val totalItemsPrice: JsonElement = JsonNull,
	val hasNextPage: Boolean = false,
	val perPage: Double = 0.0,
	val page: Double = 0.0,
	val wasCached: Boolean = false,
	val cacheTTL: Double = 0.0,
	val lastModified: Double = 0.0,
	val serverTime: Double = 0.0,
	val searchUrl: String = "",
	val stickyItems: List<JsonElement> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class CategoryInstagramResponseItemsBumpSettings(
	val canBumpItem: Boolean = false,
	val canBumpItemGlobally: Boolean = false,
	val shortErrorPhrase: JsonElement = JsonNull,
	val errorPhrase: JsonElement = JsonNull,
)

@Serializable
data class CategoryInstagramResponseItemsAccountLinks(
	val link: String = "",
	val text: String = "",
	val iconClass: String = "",
)

@Serializable
data class CategoryInstagramResponseItemsSeller(
	@SerialName("user_id")
	val userId: Double = 0.0,
	@SerialName("sold_items_count")
	val soldItemsCount: Double = 0.0,
	@SerialName("active_items_count")
	val activeItemsCount: Double = 0.0,
	@SerialName("restore_data")
	val restoreData: String = "",
	val username: String = "",
	@SerialName("avatar_date")
	val avatarDate: Double = 0.0,
	@SerialName("is_banned")
	val isBanned: Double = 0.0,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Double = 0.0,
	@SerialName("restore_percents")
	val restorePercents: JsonElement = JsonNull,
)

@Serializable
data class CategoryInstagramResponseItems(
	@SerialName("item_id")
	val itemId: Double = 0.0,
	@SerialName("item_state")
	val itemState: String = "",
	@SerialName("category_id")
	val categoryId: Double = 0.0,
	@SerialName("published_date")
	val publishedDate: Double = 0.0,
	val title: String = "",
	val description: String = "",
	val price: Double = 0.0,
	@SerialName("update_stat_date")
	val updateStatDate: Double = 0.0,
	@SerialName("refreshed_date")
	val refreshedDate: Double = 0.0,
	@SerialName("edit_date")
	val editDate: Double = 0.0,
	@SerialName("view_count")
	val viewCount: Double = 0.0,
	@SerialName("is_sticky")
	val isSticky: Double = 0.0,
	@SerialName("item_origin")
	val itemOrigin: String = "",
	@SerialName("extended_guarantee")
	val extendedGuarantee: Double = 0.0,
	val nsb: Double = 0.0,
	@SerialName("allow_ask_discount")
	val allowAskDiscount: Double = 0.0,
	@SerialName("title_en")
	val titleEn: String = "",
	@SerialName("description_en")
	val descriptionEn: String = "",
	@SerialName("email_type")
	val emailType: String = "",
	@SerialName("email_provider")
	val emailProvider: String = "",
	@SerialName("item_domain")
	val itemDomain: String = "",
	@SerialName("resale_item_origin")
	val resaleItemOrigin: String = "",
	@SerialName("instagram_item_id")
	val instagramItemId: Double = 0.0,
	@SerialName("instagram_id")
	val instagramId: String = "",
	@SerialName("instagram_follower_count")
	val instagramFollowerCount: Double = 0.0,
	@SerialName("instagram_follow_count")
	val instagramFollowCount: Double = 0.0,
	@SerialName("instagram_post_count")
	val instagramPostCount: Double = 0.0,
	@SerialName("instagram_country")
	val instagramCountry: String = "",
	@SerialName("instagram_username")
	val instagramUsername: String = "",
	@SerialName("instagram_mobile")
	val instagramMobile: Double = 0.0,
	@SerialName("instagram_register_date")
	val instagramRegisterDate: Double = 0.0,
	@SerialName("instagram_has_cookies")
	val instagramHasCookies: Double = 0.0,
	@SerialName("instagram_login_without_cookies")
	val instagramLoginWithoutCookies: Double = 0.0,
	@SerialName("feedback_data")
	val feedbackData: String = "",
	val isIgnored: Boolean = false,
	val priceWithSellerFee: Double = 0.0,
	val guarantee: JsonElement = JsonNull,
	val canViewLoginData: Boolean = false,
	val canUpdateItemStats: Boolean = false,
	val canReportItem: Boolean = false,
	val canViewEmailLoginData: Boolean = false,
	val showGetEmailCodeButton: Boolean = false,
	val canOpenItem: Boolean = false,
	val canCloseItem: Boolean = false,
	val canEditItem: Boolean = false,
	val canDeleteItem: Boolean = false,
	val canStickItem: Boolean = false,
	val canUnstickItem: Boolean = false,
	val bumpSettings: CategoryInstagramResponseItemsBumpSettings = CategoryInstagramResponseItemsBumpSettings(),
	val canBumpItem: Boolean = false,
	val canBuyItem: Boolean = false,
	@SerialName("rub_price")
	val rubPrice: Double = 0.0,
	@SerialName("price_currency")
	val priceCurrency: String = "",
	val canValidateAccount: Boolean = false,
	val canResellItemAfterPurchase: Boolean = false,
	val canViewAccountLink: Boolean = false,
	val accountLinks: List<CategoryInstagramResponseItemsAccountLinks> = emptyList(),
	val accountLink: String = "",
	val emailLoginUrl: String = "",
	val canChangePassword: Boolean = false,
	val itemOriginPhrase: String = "",
	val tags: List<JsonElement> = emptyList(),
	@SerialName("note_text")
	val noteText: JsonElement = JsonNull,
	val hasPendingAutoBuy: Boolean = false,
	val descriptionHtml: String = "",
	val descriptionEnHtml: String = "",
	val descriptionPlain: String = "",
	val descriptionEnPlain: String = "",
	val seller: CategoryInstagramResponseItemsSeller = CategoryInstagramResponseItemsSeller(),
)

@Serializable
data class CategoryBattleNetParams(
    /** The number of the page to display results from. */
	val page: Long? = null,
    /** Minimal price of account (Inclusive). */
	val pmin: Long? = null,
    /** Maximum price of account (Inclusive). */
	val pmax: Long? = null,
    /** The word or words contained in the account title. */
	val title: String? = null,
    /** Order by. */
	@SerialName("order_by")
	val orderBy: OrderBy? = null,
    /** List of tag ids (Tag list is available via GET /me). */
	@SerialName("tag_id[]")
	val tagId: List<Long>? = null,
    /** List of tag ids that won't be included (Tag list is available via GET /me). */
	@SerialName("not_tag_id[]")
	val notTagId: List<Long>? = null,
    /** List of tag ids (Tag list is available via GET /me). */
	@SerialName("public_tag_id[]")
	val publicTagId: List<Long>? = null,
    /** List of tag ids that won't be included (Tag list is available via GET /me). */
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Long>? = null,
    /** List of account origins. */
	@SerialName("origin[]")
	val origin: JsonElement? = null,
    /** List of account origins that won't be included. */
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
    /** Search accounts of user. */
	@SerialName("user_id")
	val userId: Long? = null,
    /** Not sold before. */
	val nsb: Boolean? = null,
    /** Sold before. */
	val sb: Boolean? = null,
    /** Not sold by me before. */
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
    /** Sold by me before. */
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
    /** Currency in which the cost of the account will be searched. */
	val currency: Currency? = null,
    /** Has email login data. */
	@SerialName("email_login_data")
	val emailLoginData: Boolean? = null,
    /** Email provider. */
	@SerialName("email_provider[]")
	val emailProvider: JsonElement? = null,
    /** Email provider. */
	@SerialName("not_email_provider[]")
	val notEmailProvider: NotEmailProvider? = null,
    /** Parse same item ids. */
	@SerialName("parse_same_item_ids")
	val parseSameItemIds: Boolean? = null,
    /** Email type. */
	@SerialName("email_type[]")
	val emailType: JsonElement? = null,
    /** Domain of native/autoreg email. */
	@SerialName("item_domain")
	val itemDomain: String? = null,
    /** Guarantee type. */
	val eg: CategoryEg1? = null,
    /** List of games. */
	@SerialName("game[]")
	val game: List<Long>? = null,
    /** Number of days the account has been offline. */
	val daybreak: Long? = null,
    /** List of allowed countries. */
	@SerialName("country[]")
	val country: List<String>? = null,
    /** List of disallowed countries. */
	@SerialName("not_country[]")
	val notCountry: List<String>? = null,
    /** Has linked mobile. */
	val tel: Tel? = null,
    /** Can edit BattleTag. */
	@SerialName("edit_btag")
	val editBtag: EditBtag? = null,
    /** Can edit full name. */
	@SerialName("changeable_fn")
	val changeableFn: ChangeableFn? = null,
    /** Real id. */
	@SerialName("real_id")
	val realId: RealId? = null,
    /** Has disabled parent control. */
	@SerialName("parent_control")
	val parentControl: ParentControl? = null,
    /** Has no bans. */
	@SerialName("no_bans")
	val noBans: NoBans? = null,
    /** Minimum balance. */
	@SerialName("balance_min")
	val balanceMin: Long? = null,
    /** Maximum balance. */
	@SerialName("balance_max")
	val balanceMax: Long? = null,
)

@Serializable
data class CategoryBattleNetResponse(
	val items: List<CategoryBattleNetResponseItems> = emptyList(),
	val totalItems: Double = 0.0,
	val totalItemsPrice: JsonElement = JsonNull,
	val hasNextPage: Boolean = false,
	val perPage: Double = 0.0,
	val page: Double = 0.0,
	val wasCached: Boolean = false,
	val cacheTTL: Double = 0.0,
	val lastModified: Double = 0.0,
	val serverTime: Double = 0.0,
	val searchUrl: String = "",
	val stickyItems: List<JsonElement> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class CategoryBattleNetResponseItemsGuarantee(
	val duration: Double = 0.0,
	val `class`: String = "",
	val durationPhrase: String = "",
	val endDate: JsonElement = JsonNull,
	val active: JsonElement = JsonNull,
	val cancelled: JsonElement = JsonNull,
	val remainingTime: JsonElement = JsonNull,
)

@Serializable
data class CategoryBattleNetResponseItemsBumpSettings(
	val canBumpItem: Boolean = false,
	val canBumpItemGlobally: Boolean = false,
	val shortErrorPhrase: JsonElement = JsonNull,
	val errorPhrase: JsonElement = JsonNull,
)

@Serializable
data class CategoryBattleNetResponseItemsBattlenetTransactions(
	val date: Double = 0.0,
	val productTitle: String = "",
	val formattedTotal: String = "",
	val total: String = "",
)

@Serializable
data class CategoryBattleNetResponseItemsSeller(
	@SerialName("user_id")
	val userId: Double = 0.0,
	@SerialName("sold_items_count")
	val soldItemsCount: Double = 0.0,
	@SerialName("active_items_count")
	val activeItemsCount: Double = 0.0,
	@SerialName("restore_data")
	val restoreData: String = "",
	val username: String = "",
	@SerialName("avatar_date")
	val avatarDate: Double = 0.0,
	@SerialName("is_banned")
	val isBanned: Double = 0.0,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Double = 0.0,
	@SerialName("restore_percents")
	val restorePercents: Double = 0.0,
)

@Serializable
data class CategoryBattleNetResponseItems(
	@SerialName("item_id")
	val itemId: Double = 0.0,
	@SerialName("item_state")
	val itemState: String = "",
	@SerialName("category_id")
	val categoryId: Double = 0.0,
	@SerialName("published_date")
	val publishedDate: Double = 0.0,
	val title: String = "",
	val description: String = "",
	val price: Double = 0.0,
	@SerialName("update_stat_date")
	val updateStatDate: Double = 0.0,
	@SerialName("refreshed_date")
	val refreshedDate: Double = 0.0,
	@SerialName("edit_date")
	val editDate: Double = 0.0,
	@SerialName("view_count")
	val viewCount: Double = 0.0,
	@SerialName("is_sticky")
	val isSticky: Double = 0.0,
	@SerialName("item_origin")
	val itemOrigin: String = "",
	@SerialName("extended_guarantee")
	val extendedGuarantee: Double = 0.0,
	val nsb: Double = 0.0,
	@SerialName("allow_ask_discount")
	val allowAskDiscount: Double = 0.0,
	@SerialName("title_en")
	val titleEn: String = "",
	@SerialName("description_en")
	val descriptionEn: String = "",
	@SerialName("email_type")
	val emailType: String = "",
	@SerialName("email_provider")
	val emailProvider: String = "",
	@SerialName("item_domain")
	val itemDomain: String = "",
	@SerialName("resale_item_origin")
	val resaleItemOrigin: String = "",
	@SerialName("battlenet_item_id")
	val battlenetItemId: Double = 0.0,
	@SerialName("battlenet_balance")
	val battlenetBalance: String = "",
	@SerialName("battlenet_country")
	val battlenetCountry: String = "",
	@SerialName("battlenet_last_activity")
	val battlenetLastActivity: Double = 0.0,
	@SerialName("battlenet_mobile")
	val battlenetMobile: Double = 0.0,
	@SerialName("battlenet_bans")
	val battlenetBans: String = "",
	@SerialName("battlenet_can_change_tag")
	val battlenetCanChangeTag: Double = 0.0,
	@SerialName("battlenet_real_id_enabled")
	val battlenetRealIdEnabled: Double = 0.0,
	@SerialName("battlenet_change_full_name")
	val battlenetChangeFullName: Double = 0.0,
	@SerialName("battlenet_parent_control")
	val battlenetParentControl: Double = 0.0,
	@SerialName("battlenet_converted_balance")
	val battlenetConvertedBalance: Double = 0.0,
	@SerialName("feedback_data")
	val feedbackData: String = "",
	val isIgnored: Boolean = false,
	val priceWithSellerFee: Double = 0.0,
	val guarantee: CategoryBattleNetResponseItemsGuarantee = CategoryBattleNetResponseItemsGuarantee(),
	val canViewLoginData: Boolean = false,
	val canUpdateItemStats: Boolean = false,
	val canReportItem: Boolean = false,
	val canViewEmailLoginData: Boolean = false,
	val showGetEmailCodeButton: Boolean = false,
	val canOpenItem: Boolean = false,
	val canCloseItem: Boolean = false,
	val canEditItem: Boolean = false,
	val canDeleteItem: Boolean = false,
	val canStickItem: Boolean = false,
	val canUnstickItem: Boolean = false,
	val bumpSettings: CategoryBattleNetResponseItemsBumpSettings = CategoryBattleNetResponseItemsBumpSettings(),
	val canBumpItem: Boolean = false,
	val canBuyItem: Boolean = false,
	@SerialName("rub_price")
	val rubPrice: Double = 0.0,
	@SerialName("price_currency")
	val priceCurrency: String = "",
	val canValidateAccount: Boolean = false,
	val canResellItemAfterPurchase: Boolean = false,
	val isSmallExf: Boolean = false,
	@SerialName("account_last_activity")
	val accountLastActivity: Double = 0.0,
	val battlenetGames: JsonElement = JsonNull,
	val hasOverwatch: Boolean = false,
	val battlenetTransactions: List<CategoryBattleNetResponseItemsBattlenetTransactions> = emptyList(),
	val displayConvertedBalance: Boolean = false,
	val canViewAccountLink: Boolean = false,
	val accountLinks: List<JsonElement> = emptyList(),
	val emailLoginUrl: String = "",
	val canChangePassword: Boolean = false,
	val itemOriginPhrase: String = "",
	@SerialName("sold_items_category_count")
	val soldItemsCategoryCount: Double = 0.0,
	@SerialName("restore_items_category_count")
	val restoreItemsCategoryCount: Double = 0.0,
	val tags: List<JsonElement> = emptyList(),
	@SerialName("note_text")
	val noteText: JsonElement = JsonNull,
	val hasPendingAutoBuy: Boolean = false,
	val descriptionHtml: String = "",
	val descriptionEnHtml: String = "",
	val descriptionPlain: String = "",
	val descriptionEnPlain: String = "",
	val seller: CategoryBattleNetResponseItemsSeller = CategoryBattleNetResponseItemsSeller(),
)

@Serializable
data class CategoryChatGPTParams(
    /** The number of the page to display results from. */
	val page: Long? = null,
    /** Minimal price of account (Inclusive). */
	val pmin: Long? = null,
    /** Maximum price of account (Inclusive). */
	val pmax: Long? = null,
    /** The word or words contained in the account title. */
	val title: String? = null,
    /** Order by. */
	@SerialName("order_by")
	val orderBy: OrderBy? = null,
    /** List of tag ids (Tag list is available via GET /me). */
	@SerialName("tag_id[]")
	val tagId: List<Long>? = null,
    /** List of tag ids that won't be included (Tag list is available via GET /me). */
	@SerialName("not_tag_id[]")
	val notTagId: List<Long>? = null,
    /** List of tag ids (Tag list is available via GET /me). */
	@SerialName("public_tag_id[]")
	val publicTagId: List<Long>? = null,
    /** List of tag ids that won't be included (Tag list is available via GET /me). */
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Long>? = null,
    /** List of account origins. */
	@SerialName("origin[]")
	val origin: JsonElement? = null,
    /** List of account origins that won't be included. */
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
    /** Search accounts of user. */
	@SerialName("user_id")
	val userId: Long? = null,
    /** Not sold before. */
	val nsb: Boolean? = null,
    /** Sold before. */
	val sb: Boolean? = null,
    /** Not sold by me before. */
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
    /** Sold by me before. */
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
    /** Currency in which the cost of the account will be searched. */
	val currency: Currency? = null,
    /** Has email login data. */
	@SerialName("email_login_data")
	val emailLoginData: Boolean? = null,
    /** Email provider. */
	@SerialName("email_provider[]")
	val emailProvider: JsonElement? = null,
    /** Email provider. */
	@SerialName("not_email_provider[]")
	val notEmailProvider: NotEmailProvider? = null,
    /** Parse same item ids. */
	@SerialName("parse_same_item_ids")
	val parseSameItemIds: Boolean? = null,
    /** Email type. */
	@SerialName("email_type[]")
	val emailType: JsonElement? = null,
    /** Domain of native/autoreg email. */
	@SerialName("item_domain")
	val itemDomain: String? = null,
    /** List of allowed subscriptions. */
	@SerialName("subscription[]")
	val subscription: JsonElement? = null,
    /** Length of subscription. */
	@SerialName("subscription_length")
	val subscriptionLength: Long? = null,
    /** In what notation is time measured. */
	@SerialName("subscription_period")
	val subscriptionPeriod: SubscriptionPeriod? = null,
    /** Is auto renewal enabled. */
	val autorenewal: Autorenewal? = null,
    /** Has linked mobile. */
	val tel: Tel? = null,
    /** Has transactions. */
	val transactions: Transactions? = null,
    /** How old is the account. */
	val reg: Long? = null,
    /** In what notation is time measured. */
	@SerialName("reg_period")
	val regPeriod: RegPeriod? = null,
    /** List of allowed tiers. */
	@SerialName("openai_tier[]")
	val openaiTier: JsonElement? = null,
    /** Minimum OpenAI credit balance. */
	@SerialName("openai_balance_min")
	val openaiBalanceMin: Long? = null,
    /** Maximum OpenAI credit balance. */
	@SerialName("openai_balance_max")
	val openaiBalanceMax: Long? = null,
)

@Serializable
data class CategoryChatGPTResponse(
	val items: List<CategoryChatGPTResponseItems> = emptyList(),
	val totalItems: Double = 0.0,
	val totalItemsPrice: JsonElement = JsonNull,
	val hasNextPage: Boolean = false,
	val perPage: Double = 0.0,
	val page: Double = 0.0,
	val wasCached: Boolean = false,
	val cacheTTL: Double = 0.0,
	val lastModified: Double = 0.0,
	val serverTime: Double = 0.0,
	val searchUrl: String = "",
	val stickyItems: List<JsonElement> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class CategoryChatGPTResponseItemsCopyFormatData(
	@SerialName("title_link")
	val titleLink: String = "",
)

@Serializable
data class CategoryChatGPTResponseItemsBumpSettings(
	val canBumpItem: Boolean = false,
	val canBumpItemGlobally: Boolean = false,
	val shortErrorPhrase: JsonElement = JsonNull,
	val errorPhrase: JsonElement = JsonNull,
)

@Serializable
data class CategoryChatGPTResponseItemsSeller(
	@SerialName("user_id")
	val userId: Double = 0.0,
	@SerialName("sold_items_count")
	val soldItemsCount: Double = 0.0,
	@SerialName("active_items_count")
	val activeItemsCount: Double = 0.0,
	@SerialName("restore_data")
	val restoreData: String = "",
	val username: String = "",
	@SerialName("avatar_date")
	val avatarDate: Double = 0.0,
	@SerialName("is_banned")
	val isBanned: Double = 0.0,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Double = 0.0,
	@SerialName("restore_percents")
	val restorePercents: JsonElement = JsonNull,
)

@Serializable
data class CategoryChatGPTResponseItems(
	@SerialName("item_id")
	val itemId: Double = 0.0,
	@SerialName("item_state")
	val itemState: String = "",
	@SerialName("category_id")
	val categoryId: Double = 0.0,
	@SerialName("published_date")
	val publishedDate: Double = 0.0,
	val title: String = "",
	val description: String = "",
	val price: Double = 0.0,
	@SerialName("update_stat_date")
	val updateStatDate: Double = 0.0,
	@SerialName("refreshed_date")
	val refreshedDate: Double = 0.0,
	@SerialName("edit_date")
	val editDate: Double = 0.0,
	@SerialName("view_count")
	val viewCount: Double = 0.0,
	@SerialName("is_sticky")
	val isSticky: Double = 0.0,
	@SerialName("item_origin")
	val itemOrigin: String = "",
	@SerialName("extended_guarantee")
	val extendedGuarantee: Double = 0.0,
	val nsb: Double = 0.0,
	@SerialName("allow_ask_discount")
	val allowAskDiscount: Double = 0.0,
	@SerialName("title_en")
	val titleEn: String = "",
	@SerialName("description_en")
	val descriptionEn: String = "",
	@SerialName("email_type")
	val emailType: String = "",
	@SerialName("email_provider")
	val emailProvider: String = "",
	@SerialName("item_domain")
	val itemDomain: String = "",
	@SerialName("resale_item_origin")
	val resaleItemOrigin: String = "",
	@SerialName("chatgpt_item_id")
	val chatgptItemId: Double = 0.0,
	@SerialName("chatgpt_country")
	val chatgptCountry: String = "",
	@SerialName("chatgpt_register_date")
	val chatgptRegisterDate: Double = 0.0,
	@SerialName("chatgpt_phone")
	val chatgptPhone: Double = 0.0,
	@SerialName("chatgpt_subscription")
	val chatgptSubscription: String = "",
	@SerialName("chatgpt_subscription_ends")
	val chatgptSubscriptionEnds: Double = 0.0,
	@SerialName("chatgpt_subscription_auto_renew")
	val chatgptSubscriptionAutoRenew: Double = 0.0,
	@SerialName("feedback_data")
	val feedbackData: String = "",
	val isIgnored: Boolean = false,
	val priceWithSellerFee: Double = 0.0,
	val guarantee: JsonElement = JsonNull,
	val canViewLoginData: Boolean = false,
	val canUpdateItemStats: Boolean = false,
	val canReportItem: Boolean = false,
	val canViewItemViews: Boolean = false,
	val canViewEmailLoginData: Boolean = false,
	val copyFormatData: CategoryChatGPTResponseItemsCopyFormatData = CategoryChatGPTResponseItemsCopyFormatData(),
	val showGetEmailCodeButton: Boolean = false,
	val canOpenItem: Boolean = false,
	val canCloseItem: Boolean = false,
	val canEditItem: Boolean = false,
	val canDeleteItem: Boolean = false,
	val canStickItem: Boolean = false,
	val canUnstickItem: Boolean = false,
	val bumpSettings: CategoryChatGPTResponseItemsBumpSettings = CategoryChatGPTResponseItemsBumpSettings(),
	val isPersonalAccount: Boolean = false,
	val canBumpItem: Boolean = false,
	val canBuyItem: Boolean = false,
	@SerialName("rub_price")
	val rubPrice: Double = 0.0,
	@SerialName("price_currency")
	val priceCurrency: String = "",
	val priceWithSellerFeeLabel: String = "",
	val canValidateAccount: Boolean = false,
	val canResellItemAfterPurchase: Boolean = false,
	val gptSubType: String = "",
	val canViewAccountLink: Boolean = false,
	val emailLoginUrl: String = "",
	val canChangePassword: Boolean = false,
	val canChangeEmailPassword: Boolean = false,
	val uniqueKeyExists: Boolean = false,
	val itemOriginPhrase: String = "",
	val tags: List<JsonElement> = emptyList(),
	@SerialName("note_text")
	val noteText: JsonElement = JsonNull,
	val hasPendingAutoBuy: Boolean = false,
	val descriptionHtml: String = "",
	val descriptionEnHtml: String = "",
	val descriptionPlain: String = "",
	val descriptionEnPlain: String = "",
	val seller: CategoryChatGPTResponseItemsSeller = CategoryChatGPTResponseItemsSeller(),
)

@Serializable
data class CategoryVpnParams(
    /** The number of the page to display results from. */
	val page: Long? = null,
    /** Minimal price of account (Inclusive). */
	val pmin: Long? = null,
    /** Maximum price of account (Inclusive). */
	val pmax: Long? = null,
    /** The word or words contained in the account title. */
	val title: String? = null,
    /** Order by. */
	@SerialName("order_by")
	val orderBy: OrderBy? = null,
    /** List of tag ids (Tag list is available via GET /me). */
	@SerialName("tag_id[]")
	val tagId: List<Long>? = null,
    /** List of tag ids that won't be included (Tag list is available via GET /me). */
	@SerialName("not_tag_id[]")
	val notTagId: List<Long>? = null,
    /** List of tag ids (Tag list is available via GET /me). */
	@SerialName("public_tag_id[]")
	val publicTagId: List<Long>? = null,
    /** List of tag ids that won't be included (Tag list is available via GET /me). */
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Long>? = null,
    /** List of account origins. */
	@SerialName("origin[]")
	val origin: JsonElement? = null,
    /** List of account origins that won't be included. */
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
    /** Search accounts of user. */
	@SerialName("user_id")
	val userId: Long? = null,
    /** Not sold before. */
	val nsb: Boolean? = null,
    /** Sold before. */
	val sb: Boolean? = null,
    /** Not sold by me before. */
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
    /** Sold by me before. */
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
    /** Currency in which the cost of the account will be searched. */
	val currency: Currency? = null,
    /** Has email login data. */
	@SerialName("email_login_data")
	val emailLoginData: Boolean? = null,
    /** Email provider. */
	@SerialName("email_provider[]")
	val emailProvider: JsonElement? = null,
    /** Email provider. */
	@SerialName("not_email_provider[]")
	val notEmailProvider: NotEmailProvider? = null,
    /** Parse same item ids. */
	@SerialName("parse_same_item_ids")
	val parseSameItemIds: Boolean? = null,
    /** List of allowed VPN services. */
	@SerialName("service[]")
	val service: JsonElement? = null,
    /** Length of subscription. */
	@SerialName("subscription_length")
	val subscriptionLength: Long? = null,
    /** In what notation is time measured. */
	@SerialName("subscription_period")
	val subscriptionPeriod: SubscriptionPeriod? = null,
    /** Is auto renewal enabled. */
	val autorenewal: Autorenewal? = null,
)

@Serializable
data class CategoryVpnResponse(
	val items: List<CategoryVpnResponseItems> = emptyList(),
	val totalItems: Double = 0.0,
	val totalItemsPrice: JsonElement = JsonNull,
	val hasNextPage: Boolean = false,
	val perPage: Double = 0.0,
	val page: Double = 0.0,
	val wasCached: Boolean = false,
	val cacheTTL: Double = 0.0,
	val lastModified: Double = 0.0,
	val serverTime: Double = 0.0,
	val searchUrl: String = "",
	val stickyItems: List<JsonElement> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class CategoryVpnResponseItemsBumpSettings(
	val canBumpItem: Boolean = false,
	val canBumpItemGlobally: Boolean = false,
	val shortErrorPhrase: JsonElement = JsonNull,
	val errorPhrase: JsonElement = JsonNull,
)

@Serializable
data class CategoryVpnResponseItemsSeller(
	@SerialName("user_id")
	val userId: Double = 0.0,
	@SerialName("sold_items_count")
	val soldItemsCount: Double = 0.0,
	@SerialName("active_items_count")
	val activeItemsCount: Double = 0.0,
	@SerialName("restore_data")
	val restoreData: String = "",
	val username: String = "",
	@SerialName("avatar_date")
	val avatarDate: Double = 0.0,
	@SerialName("is_banned")
	val isBanned: Double = 0.0,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Double = 0.0,
	@SerialName("restore_percents")
	val restorePercents: Double = 0.0,
)

@Serializable
data class CategoryVpnResponseItems(
	@SerialName("item_id")
	val itemId: Double = 0.0,
	@SerialName("item_state")
	val itemState: String = "",
	@SerialName("category_id")
	val categoryId: Double = 0.0,
	@SerialName("published_date")
	val publishedDate: Double = 0.0,
	val title: String = "",
	val description: String = "",
	val price: Double = 0.0,
	@SerialName("update_stat_date")
	val updateStatDate: Double = 0.0,
	@SerialName("refreshed_date")
	val refreshedDate: Double = 0.0,
	@SerialName("edit_date")
	val editDate: Double = 0.0,
	@SerialName("view_count")
	val viewCount: Double = 0.0,
	@SerialName("is_sticky")
	val isSticky: Double = 0.0,
	@SerialName("item_origin")
	val itemOrigin: String = "",
	@SerialName("extended_guarantee")
	val extendedGuarantee: Double = 0.0,
	val nsb: Double = 0.0,
	@SerialName("allow_ask_discount")
	val allowAskDiscount: Double = 0.0,
	@SerialName("title_en")
	val titleEn: String = "",
	@SerialName("description_en")
	val descriptionEn: String = "",
	@SerialName("email_type")
	val emailType: String = "",
	@SerialName("email_provider")
	val emailProvider: JsonElement = JsonNull,
	@SerialName("item_domain")
	val itemDomain: String = "",
	@SerialName("resale_item_origin")
	val resaleItemOrigin: String = "",
	@SerialName("vpn_item_id")
	val vpnItemId: Double = 0.0,
	@SerialName("vpn_service")
	val vpnService: String = "",
	@SerialName("vpn_expire_date")
	val vpnExpireDate: Double = 0.0,
	@SerialName("vpn_renewable")
	val vpnRenewable: Double = 0.0,
	@SerialName("feedback_data")
	val feedbackData: String = "",
	val isIgnored: Boolean = false,
	val priceWithSellerFee: Double = 0.0,
	val guarantee: JsonElement = JsonNull,
	val canViewLoginData: Boolean = false,
	val canUpdateItemStats: Boolean = false,
	val canReportItem: Boolean = false,
	val canViewEmailLoginData: Boolean = false,
	val showGetEmailCodeButton: Boolean = false,
	val canOpenItem: Boolean = false,
	val canCloseItem: Boolean = false,
	val canEditItem: Boolean = false,
	val canDeleteItem: Boolean = false,
	val canStickItem: Boolean = false,
	val canUnstickItem: Boolean = false,
	val bumpSettings: CategoryVpnResponseItemsBumpSettings = CategoryVpnResponseItemsBumpSettings(),
	val canBumpItem: Boolean = false,
	val canBuyItem: Boolean = false,
	@SerialName("rub_price")
	val rubPrice: Double = 0.0,
	@SerialName("price_currency")
	val priceCurrency: String = "",
	val canValidateAccount: Boolean = false,
	val canResellItemAfterPurchase: Boolean = false,
	val vpnProductTitle: String = "",
	val canViewAccountLink: Boolean = false,
	val canChangePassword: Boolean = false,
	val itemOriginPhrase: String = "",
	@SerialName("sold_items_category_count")
	val soldItemsCategoryCount: Double = 0.0,
	@SerialName("restore_items_category_count")
	val restoreItemsCategoryCount: Double = 0.0,
	val tags: List<JsonElement> = emptyList(),
	@SerialName("note_text")
	val noteText: JsonElement = JsonNull,
	val hasPendingAutoBuy: Boolean = false,
	val descriptionHtml: String = "",
	val descriptionEnHtml: String = "",
	val descriptionPlain: String = "",
	val descriptionEnPlain: String = "",
	val seller: CategoryVpnResponseItemsSeller = CategoryVpnResponseItemsSeller(),
)

@Serializable
data class CategoryRobloxParams(
    /** The number of the page to display results from. */
	val page: Long? = null,
    /** Minimal price of account (Inclusive). */
	val pmin: Long? = null,
    /** Maximum price of account (Inclusive). */
	val pmax: Long? = null,
    /** The word or words contained in the account title. */
	val title: String? = null,
    /** Order by. */
	@SerialName("order_by")
	val orderBy: OrderBy? = null,
    /** List of tag ids (Tag list is available via GET /me). */
	@SerialName("tag_id[]")
	val tagId: List<Long>? = null,
    /** List of tag ids that won't be included (Tag list is available via GET /me). */
	@SerialName("not_tag_id[]")
	val notTagId: List<Long>? = null,
    /** List of tag ids (Tag list is available via GET /me). */
	@SerialName("public_tag_id[]")
	val publicTagId: List<Long>? = null,
    /** List of tag ids that won't be included (Tag list is available via GET /me). */
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Long>? = null,
    /** List of account origins. */
	@SerialName("origin[]")
	val origin: JsonElement? = null,
    /** List of account origins that won't be included. */
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
    /** Search accounts of user. */
	@SerialName("user_id")
	val userId: Long? = null,
    /** Not sold before. */
	val nsb: Boolean? = null,
    /** Sold before. */
	val sb: Boolean? = null,
    /** Not sold by me before. */
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
    /** Sold by me before. */
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
    /** Currency in which the cost of the account will be searched. */
	val currency: Currency? = null,
    /** Has email login data. */
	@SerialName("email_login_data")
	val emailLoginData: Boolean? = null,
    /** Email provider. */
	@SerialName("email_provider[]")
	val emailProvider: JsonElement? = null,
    /** Email provider. */
	@SerialName("not_email_provider[]")
	val notEmailProvider: NotEmailProvider? = null,
    /** Parse same item ids. */
	@SerialName("parse_same_item_ids")
	val parseSameItemIds: Boolean? = null,
    /** Has verified email. */
	val email: Email? = null,
    /** Minimum robux. */
	@SerialName("robux_min")
	val robuxMin: Long? = null,
    /** Maximum robux. */
	@SerialName("robux_max")
	val robuxMax: Long? = null,
    /** Minimum friends. */
	@SerialName("friends_min")
	val friendsMin: Long? = null,
    /** Maximum friends. */
	@SerialName("friends_max")
	val friendsMax: Long? = null,
    /** Minimum number of followers. */
	@SerialName("followers_min")
	val followersMin: Long? = null,
    /** Maximum number of followers. */
	@SerialName("followers_max")
	val followersMax: Long? = null,
    /** List of allowed countries. */
	val country: List<String>? = null,
    /** List of disallowed countries. */
	@SerialName("not_country")
	val notCountry: List<String>? = null,
    /** How old is the account. */
	val reg: Long? = null,
    /** In what notation is time measured. */
	@SerialName("reg_period")
	val regPeriod: RegPeriod? = null,
    /** Name of subscription. */
	val subscription: CategorySubscription5? = null,
    /** Length of subscription. */
	@SerialName("subscription_length")
	val subscriptionLength: Long? = null,
    /** In what notation is time measured. */
	@SerialName("subscription_period")
	val subscriptionPeriod: SubscriptionPeriod? = null,
    /** Is auto renewal enabled. */
	val autorenewal: Autorenewal? = null,
    /** Xbox connected to account. */
	@SerialName("xbox_connected")
	val xboxConnected: XboxConnected? = null,
    /** PSN connected to account. */
	@SerialName("psn_connected")
	val psnConnected: PsnConnected? = null,
    /** Has verified. */
	val verified: Verified? = null,
    /** Account is age verified via documents. */
	@SerialName("age_verified")
	val ageVerified: AgeVerified? = null,
    /** Minimum amount of incoming robux. */
	@SerialName("incoming_robux_total_min")
	val incomingRobuxTotalMin: Long? = null,
    /** Maximum amount of incoming robux. */
	@SerialName("incoming_robux_total_max")
	val incomingRobuxTotalMax: Long? = null,
    /** Minimum limited items value. */
	@SerialName("limited_price_min")
	val limitedPriceMin: Long? = null,
    /** Maximum limited items value. */
	@SerialName("limited_price_max")
	val limitedPriceMax: Long? = null,
    /** Minimum total Robux cost of all game passes in popular Roblox games.. */
	@SerialName("gamepass_min")
	val gamepassMin: Long? = null,
    /** Maximum total Robux cost of all game passes in popular Roblox games.. */
	@SerialName("gamepass_max")
	val gamepassMax: Long? = null,
    /** Has game donations. */
	@SerialName("game_donations")
	val gameDonations: GameDonations? = null,
    /** Minimum inventory value. */
	@SerialName("inv_min")
	val invMin: Long? = null,
    /** Maximum inventory value. */
	@SerialName("inv_max")
	val invMax: Long? = null,
    /** Minimum UGC limited items value. */
	@SerialName("ugc_limited_price_min")
	val ugcLimitedPriceMin: Long? = null,
    /** Maximum UGC limited items value. */
	@SerialName("ugc_limited_price_max")
	val ugcLimitedPriceMax: Long? = null,
    /** Minimum credit balance. */
	@SerialName("credit_balance_min")
	val creditBalanceMin: Long? = null,
    /** Maximum credit balance. */
	@SerialName("credit_balance_max")
	val creditBalanceMax: Long? = null,
    /** Minimum offsale items count. */
	@SerialName("offsale_min")
	val offsaleMin: Long? = null,
    /** Maximum offsale items count. */
	@SerialName("offsale_max")
	val offsaleMax: Long? = null,
    /** Voice chat is available. */
	val voice: Voice? = null,
    /** List of allowed age groups. */
	@SerialName("age_group[]")
	val ageGroup: List<String>? = null,
    /** List of disallowed age groups. */
	@SerialName("not_age_group[]")
	val notAgeGroup: List<String>? = null,
)

@Serializable
data class CategoryRobloxResponse(
	val items: List<CategoryRobloxResponseItems> = emptyList(),
	val totalItems: Double = 0.0,
	val totalItemsPrice: JsonElement = JsonNull,
	val hasNextPage: Boolean = false,
	val perPage: Double = 0.0,
	val page: Double = 0.0,
	val wasCached: Boolean = false,
	val cacheTTL: Double = 0.0,
	val lastModified: Double = 0.0,
	val serverTime: Double = 0.0,
	val searchUrl: String = "",
	val stickyItems: List<JsonElement> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class CategoryRobloxResponseItemsBumpSettings(
	val canBumpItem: Boolean = false,
	val canBumpItemGlobally: Boolean = false,
	val shortErrorPhrase: JsonElement = JsonNull,
	val errorPhrase: JsonElement = JsonNull,
)

@Serializable
data class CategoryRobloxResponseItemsRobloxGameDonationsDetails(
	val product: String = "",
	val amount: Double = 0.0,
	val type: String = "",
)

@Serializable
data class CategoryRobloxResponseItemsAccountLinks(
	val link: String = "",
	val text: String = "",
	val iconClass: String = "",
)

@Serializable
data class CategoryRobloxResponseItemsSeller(
	@SerialName("user_id")
	val userId: Double = 0.0,
	@SerialName("sold_items_count")
	val soldItemsCount: Double = 0.0,
	@SerialName("active_items_count")
	val activeItemsCount: Double = 0.0,
	@SerialName("restore_data")
	val restoreData: String = "",
	val username: String = "",
	@SerialName("avatar_date")
	val avatarDate: Double = 0.0,
	@SerialName("is_banned")
	val isBanned: Double = 0.0,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Double = 0.0,
	@SerialName("restore_percents")
	val restorePercents: Double = 0.0,
)

@Serializable
data class CategoryRobloxResponseItems(
	@SerialName("item_id")
	val itemId: Double = 0.0,
	@SerialName("item_state")
	val itemState: String = "",
	@SerialName("category_id")
	val categoryId: Double = 0.0,
	@SerialName("published_date")
	val publishedDate: Double = 0.0,
	val title: String = "",
	val description: String = "",
	val price: Double = 0.0,
	@SerialName("update_stat_date")
	val updateStatDate: Double = 0.0,
	@SerialName("refreshed_date")
	val refreshedDate: Double = 0.0,
	@SerialName("edit_date")
	val editDate: Double = 0.0,
	@SerialName("view_count")
	val viewCount: Double = 0.0,
	@SerialName("is_sticky")
	val isSticky: Double = 0.0,
	@SerialName("item_origin")
	val itemOrigin: String = "",
	@SerialName("extended_guarantee")
	val extendedGuarantee: Double = 0.0,
	val nsb: Double = 0.0,
	@SerialName("allow_ask_discount")
	val allowAskDiscount: Double = 0.0,
	@SerialName("title_en")
	val titleEn: String = "",
	@SerialName("description_en")
	val descriptionEn: String = "",
	@SerialName("email_type")
	val emailType: String = "",
	@SerialName("email_provider")
	val emailProvider: String = "",
	@SerialName("item_domain")
	val itemDomain: String = "",
	@SerialName("resale_item_origin")
	val resaleItemOrigin: String = "",
	@SerialName("roblox_item_id")
	val robloxItemId: Double = 0.0,
	@SerialName("roblox_id")
	val robloxId: Double = 0.0,
	@SerialName("roblox_email_verified")
	val robloxEmailVerified: Double = 0.0,
	@SerialName("roblox_robux")
	val robloxRobux: Double = 0.0,
	@SerialName("roblox_username")
	val robloxUsername: String = "",
	@SerialName("roblox_country")
	val robloxCountry: String = "",
	@SerialName("roblox_register_date")
	val robloxRegisterDate: Double = 0.0,
	@SerialName("roblox_friends")
	val robloxFriends: Double = 0.0,
	@SerialName("roblox_followers")
	val robloxFollowers: Double = 0.0,
	@SerialName("roblox_subscription")
	val robloxSubscription: String = "",
	@SerialName("roblox_subscription_end_date")
	val robloxSubscriptionEndDate: Double = 0.0,
	@SerialName("roblox_xbox_connected")
	val robloxXboxConnected: Double = 0.0,
	@SerialName("roblox_incoming_robux_total")
	val robloxIncomingRobuxTotal: Double = 0.0,
	@SerialName("roblox_limited_price")
	val robloxLimitedPrice: Double = 0.0,
	@SerialName("roblox_verified")
	val robloxVerified: Double = 0.0,
	@SerialName("roblox_age_verified")
	val robloxAgeVerified: Double = 0.0,
	@SerialName("roblox_psn_connected")
	val robloxPsnConnected: Double = 0.0,
	@SerialName("roblox_subscription_auto_renew")
	val robloxSubscriptionAutoRenew: Double = 0.0,
	@SerialName("roblox_game_pass_total_robux")
	val robloxGamePassTotalRobux: Double = 0.0,
	@SerialName("roblox_game_donations")
	val robloxGameDonations: String = "",
	@SerialName("roblox_inventory_price")
	val robloxInventoryPrice: Double = 0.0,
	@SerialName("roblox_ugc_limited_price")
	val robloxUgcLimitedPrice: Double = 0.0,
	@SerialName("roblox_credit_balance")
	val robloxCreditBalance: Double = 0.0,
	@SerialName("feedback_data")
	val feedbackData: String = "",
	val isIgnored: Boolean = false,
	val priceWithSellerFee: Double = 0.0,
	val guarantee: JsonElement = JsonNull,
	val canViewLoginData: Boolean = false,
	val canUpdateItemStats: Boolean = false,
	val canReportItem: Boolean = false,
	val canViewEmailLoginData: Boolean = false,
	val showGetEmailCodeButton: Boolean = false,
	val canOpenItem: Boolean = false,
	val canCloseItem: Boolean = false,
	val canEditItem: Boolean = false,
	val canDeleteItem: Boolean = false,
	val canStickItem: Boolean = false,
	val canUnstickItem: Boolean = false,
	val bumpSettings: CategoryRobloxResponseItemsBumpSettings = CategoryRobloxResponseItemsBumpSettings(),
	val canBumpItem: Boolean = false,
	val canBuyItem: Boolean = false,
	@SerialName("rub_price")
	val rubPrice: Double = 0.0,
	@SerialName("price_currency")
	val priceCurrency: String = "",
	val canValidateAccount: Boolean = false,
	val canResellItemAfterPurchase: Boolean = false,
	val robloxLinkedAccounts: String = "",
	val creditBalance: String = "",
	val robloxGameDonationsDetails: List<CategoryRobloxResponseItemsRobloxGameDonationsDetails> = emptyList(),
	val canViewAccountLink: Boolean = false,
	val accountLinks: List<CategoryRobloxResponseItemsAccountLinks> = emptyList(),
	val accountLink: String = "",
	val emailLoginUrl: String = "",
	val canChangePassword: Boolean = false,
	val itemOriginPhrase: String = "",
	@SerialName("sold_items_category_count")
	val soldItemsCategoryCount: Double = 0.0,
	@SerialName("restore_items_category_count")
	val restoreItemsCategoryCount: Double = 0.0,
	val tags: List<JsonElement> = emptyList(),
	@SerialName("note_text")
	val noteText: JsonElement = JsonNull,
	val hasPendingAutoBuy: Boolean = false,
	val descriptionHtml: String = "",
	val descriptionEnHtml: String = "",
	val descriptionPlain: String = "",
	val descriptionEnPlain: String = "",
	val seller: CategoryRobloxResponseItemsSeller = CategoryRobloxResponseItemsSeller(),
)

@Serializable
data class CategoryWarfaceParams(
    /** The number of the page to display results from. */
	val page: Long? = null,
    /** Minimal price of account (Inclusive). */
	val pmin: Long? = null,
    /** Maximum price of account (Inclusive). */
	val pmax: Long? = null,
    /** The word or words contained in the account title. */
	val title: String? = null,
    /** Order by. */
	@SerialName("order_by")
	val orderBy: OrderBy? = null,
    /** List of tag ids (Tag list is available via GET /me). */
	@SerialName("tag_id[]")
	val tagId: List<Long>? = null,
    /** List of tag ids that won't be included (Tag list is available via GET /me). */
	@SerialName("not_tag_id[]")
	val notTagId: List<Long>? = null,
    /** List of tag ids (Tag list is available via GET /me). */
	@SerialName("public_tag_id[]")
	val publicTagId: List<Long>? = null,
    /** List of tag ids that won't be included (Tag list is available via GET /me). */
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Long>? = null,
    /** List of account origins. */
	@SerialName("origin[]")
	val origin: JsonElement? = null,
    /** List of account origins that won't be included. */
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
    /** Search accounts of user. */
	@SerialName("user_id")
	val userId: Long? = null,
    /** Not sold before. */
	val nsb: Boolean? = null,
    /** Sold before. */
	val sb: Boolean? = null,
    /** Not sold by me before. */
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
    /** Sold by me before. */
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
    /** Currency in which the cost of the account will be searched. */
	val currency: Currency? = null,
    /** Has email login data. */
	@SerialName("email_login_data")
	val emailLoginData: Boolean? = null,
    /** Email provider. */
	@SerialName("email_provider[]")
	val emailProvider: JsonElement? = null,
    /** Email provider. */
	@SerialName("not_email_provider[]")
	val notEmailProvider: NotEmailProvider? = null,
    /** Parse same item ids. */
	@SerialName("parse_same_item_ids")
	val parseSameItemIds: Boolean? = null,
    /** Minimum rank. */
	@SerialName("rank_min")
	val rankMin: Long? = null,
    /** Maximum rank. */
	@SerialName("rank_max")
	val rankMax: Long? = null,
    /** Minimum bonus rank. */
	@SerialName("bonus_rank_min")
	val bonusRankMin: Long? = null,
    /** Maximum bonus rank. */
	@SerialName("bonus_rank_max")
	val bonusRankMax: Long? = null,
    /** Has linked mobile. */
	val tel: Tel? = null,
    /** Number of days the account has been offline. */
	val daybreak: Long? = null,
    /** Minimum amount of Kredits. */
	@SerialName("kredits_min")
	val kreditsMin: Long? = null,
    /** Maximum amount of Kredits. */
	@SerialName("kredits_max")
	val kreditsMax: Long? = null,
    /** Minimum total donated Kredits. */
	@SerialName("total_kredits_min")
	val totalKreditsMin: Long? = null,
    /** Maximum total donated Kredits. */
	@SerialName("total_kredits_max")
	val totalKreditsMax: Long? = null,
)

@Serializable
data class CategoryWarfaceResponse(
	val items: List<CategoryWarfaceResponseItems> = emptyList(),
	val totalItems: Double = 0.0,
	val totalItemsPrice: JsonElement = JsonNull,
	val hasNextPage: Boolean = false,
	val perPage: Double = 0.0,
	val page: Double = 0.0,
	val wasCached: Boolean = false,
	val cacheTTL: Double = 0.0,
	val lastModified: Double = 0.0,
	val serverTime: Double = 0.0,
	val searchUrl: String = "",
	val stickyItems: List<JsonElement> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class CategoryWarfaceResponseItemsBumpSettings(
	val canBumpItem: Boolean = false,
	val canBumpItemGlobally: Boolean = false,
	val shortErrorPhrase: JsonElement = JsonNull,
	val errorPhrase: JsonElement = JsonNull,
)

@Serializable
data class CategoryWarfaceResponseItemsWfServers(
	val id: Double = 0.0,
	val rank: Double = 0.0,
	val title: String = "",
)

@Serializable
data class CategoryWarfaceResponseItemsSeller(
	@SerialName("user_id")
	val userId: Double = 0.0,
	@SerialName("sold_items_count")
	val soldItemsCount: Double = 0.0,
	@SerialName("active_items_count")
	val activeItemsCount: Double = 0.0,
	@SerialName("restore_data")
	val restoreData: String = "",
	val username: String = "",
	@SerialName("avatar_date")
	val avatarDate: Double = 0.0,
	@SerialName("is_banned")
	val isBanned: Double = 0.0,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Double = 0.0,
	@SerialName("restore_percents")
	val restorePercents: Double = 0.0,
)

@Serializable
data class CategoryWarfaceResponseItems(
	@SerialName("item_id")
	val itemId: Double = 0.0,
	@SerialName("item_state")
	val itemState: String = "",
	@SerialName("category_id")
	val categoryId: Double = 0.0,
	@SerialName("published_date")
	val publishedDate: Double = 0.0,
	val title: String = "",
	val description: String = "",
	val price: Double = 0.0,
	@SerialName("update_stat_date")
	val updateStatDate: Double = 0.0,
	@SerialName("refreshed_date")
	val refreshedDate: Double = 0.0,
	@SerialName("edit_date")
	val editDate: Double = 0.0,
	@SerialName("view_count")
	val viewCount: Double = 0.0,
	@SerialName("is_sticky")
	val isSticky: Double = 0.0,
	@SerialName("item_origin")
	val itemOrigin: String = "",
	@SerialName("extended_guarantee")
	val extendedGuarantee: Double = 0.0,
	val nsb: Double = 0.0,
	@SerialName("allow_ask_discount")
	val allowAskDiscount: Double = 0.0,
	@SerialName("title_en")
	val titleEn: String = "",
	@SerialName("description_en")
	val descriptionEn: String = "",
	@SerialName("email_type")
	val emailType: String = "",
	@SerialName("email_provider")
	val emailProvider: JsonElement = JsonNull,
	@SerialName("item_domain")
	val itemDomain: String = "",
	@SerialName("resale_item_origin")
	val resaleItemOrigin: String = "",
	@SerialName("wf_item_id")
	val wfItemId: Double = 0.0,
	@SerialName("wf_players")
	val wfPlayers: Boolean = false,
	@SerialName("wf_server_1")
	val wfServer_1: Double = 0.0,
	@SerialName("wf_server_2")
	val wfServer_2: Double = 0.0,
	@SerialName("wf_server_3")
	val wfServer_3: Double = 0.0,
	@SerialName("wf_mobile")
	val wfMobile: Double = 0.0,
	@SerialName("wf_bonus_rank")
	val wfBonusRank: Double = 0.0,
	@SerialName("wf_mail_mobile")
	val wfMailMobile: Double = 0.0,
	@SerialName("wf_last_game_date")
	val wfLastGameDate: Double = 0.0,
	@SerialName("wf_loan")
	val wfLoan: Boolean = false,
	@SerialName("wf_active_loan")
	val wfActiveLoan: Double = 0.0,
	@SerialName("wf_rank")
	val wfRank: Double = 0.0,
	@SerialName("feedback_data")
	val feedbackData: String = "",
	val isIgnored: Boolean = false,
	val priceWithSellerFee: Double = 0.0,
	val guarantee: JsonElement = JsonNull,
	val canViewLoginData: Boolean = false,
	val canUpdateItemStats: Boolean = false,
	val canReportItem: Boolean = false,
	val canViewEmailLoginData: Boolean = false,
	val showGetEmailCodeButton: Boolean = false,
	val canOpenItem: Boolean = false,
	val canCloseItem: Boolean = false,
	val canEditItem: Boolean = false,
	val canDeleteItem: Boolean = false,
	val canStickItem: Boolean = false,
	val canUnstickItem: Boolean = false,
	val bumpSettings: CategoryWarfaceResponseItemsBumpSettings = CategoryWarfaceResponseItemsBumpSettings(),
	val canBumpItem: Boolean = false,
	val canBuyItem: Boolean = false,
	@SerialName("rub_price")
	val rubPrice: Double = 0.0,
	@SerialName("price_currency")
	val priceCurrency: String = "",
	val canValidateAccount: Boolean = false,
	val canResellItemAfterPurchase: Boolean = false,
	val isSmallExf: Boolean = false,
	@SerialName("account_last_activity")
	val accountLastActivity: Double = 0.0,
	@SerialName("wf_servers")
	val wfServers: List<CategoryWarfaceResponseItemsWfServers> = emptyList(),
	val domain: String = "",
	val canViewAccountLink: Boolean = false,
	val canChangePassword: Boolean = false,
	val itemOriginPhrase: String = "",
	@SerialName("sold_items_category_count")
	val soldItemsCategoryCount: Double = 0.0,
	@SerialName("restore_items_category_count")
	val restoreItemsCategoryCount: Double = 0.0,
	val tags: List<JsonElement> = emptyList(),
	@SerialName("note_text")
	val noteText: JsonElement = JsonNull,
	val hasPendingAutoBuy: Boolean = false,
	val descriptionHtml: String = "",
	val descriptionEnHtml: String = "",
	val descriptionPlain: String = "",
	val descriptionEnPlain: String = "",
	val seller: CategoryWarfaceResponseItemsSeller = CategoryWarfaceResponseItemsSeller(),
)

@Serializable
data class CategoryMinecraftParams(
    /** The number of the page to display results from. */
	val page: Long? = null,
    /** Minimal price of account (Inclusive). */
	val pmin: Long? = null,
    /** Maximum price of account (Inclusive). */
	val pmax: Long? = null,
    /** The word or words contained in the account title. */
	val title: String? = null,
    /** Order by. */
	@SerialName("order_by")
	val orderBy: OrderBy? = null,
    /** List of tag ids (Tag list is available via GET /me). */
	@SerialName("tag_id[]")
	val tagId: List<Long>? = null,
    /** List of tag ids that won't be included (Tag list is available via GET /me). */
	@SerialName("not_tag_id[]")
	val notTagId: List<Long>? = null,
    /** List of tag ids (Tag list is available via GET /me). */
	@SerialName("public_tag_id[]")
	val publicTagId: List<Long>? = null,
    /** List of tag ids that won't be included (Tag list is available via GET /me). */
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Long>? = null,
    /** List of account origins. */
	@SerialName("origin[]")
	val origin: JsonElement? = null,
    /** List of account origins that won't be included. */
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
    /** Search accounts of user. */
	@SerialName("user_id")
	val userId: Long? = null,
    /** Not sold before. */
	val nsb: Boolean? = null,
    /** Sold before. */
	val sb: Boolean? = null,
    /** Not sold by me before. */
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
    /** Sold by me before. */
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
    /** Currency in which the cost of the account will be searched. */
	val currency: Currency? = null,
    /** Has email login data. */
	@SerialName("email_login_data")
	val emailLoginData: Boolean? = null,
    /** Email provider. */
	@SerialName("email_provider[]")
	val emailProvider: JsonElement? = null,
    /** Email provider. */
	@SerialName("not_email_provider[]")
	val notEmailProvider: NotEmailProvider? = null,
    /** Parse same item ids. */
	@SerialName("parse_same_item_ids")
	val parseSameItemIds: Boolean? = null,
    /** Name of subscription. */
	val subscription: CategorySubscription2? = null,
    /** Length of subscription. */
	@SerialName("subscription_length")
	val subscriptionLength: Long? = null,
    /** In what notation is time measured. */
	@SerialName("subscription_period")
	val subscriptionPeriod: SubscriptionPeriod? = null,
    /** Is auto renewal enabled. */
	val autorenewal: Autorenewal? = null,
    /** Has java edition. */
	val java: Java? = null,
    /** Has bedrock edition. */
	val bedrock: Bedrock? = null,
    /** Has Minecraft Dungeons. */
	val dungeons: Dungeons? = null,
    /** Has Minecraft Legends. */
	val legends: Legends? = null,
    /** Can change nickname. */
	@SerialName("change_nickname")
	val changeNickname: ChangeNickname? = null,
    /** List of capes. */
	@SerialName("capes[]")
	val capes: List<String>? = null,
    /** Minimum number of capes. */
	@SerialName("capes_min")
	val capesMin: Long? = null,
    /** Maximum number of capes. */
	@SerialName("capes_max")
	val capesMax: Long? = null,
    /** List of allowed countries. */
	@SerialName("country[]")
	val country: List<String>? = null,
    /** List of disallowed countries. */
	@SerialName("not_country[]")
	val notCountry: List<String>? = null,
    /** Has active Hypixel ban. */
	@SerialName("hypixel_ban")
	val hypixelBan: HypixelBan? = null,
    /** Is API enabled in Hypixel Skyblock. */
	@SerialName("hypixel_skyblock_api_enabled")
	val hypixelSkyblockApiEnabled: HypixelSkyblockApiEnabled? = null,
    /** Rank on hypixel. */
	@SerialName("rank_hypixel[]")
	val rankHypixel: JsonElement? = null,
    /** Minimum number of level hypixel. */
	@SerialName("level_hypixel_min")
	val levelHypixelMin: Long? = null,
    /** Maximum number of level hypixel. */
	@SerialName("level_hypixel_max")
	val levelHypixelMax: Long? = null,
    /** Minimum number of achievement hypixel. */
	@SerialName("achievement_hypixel_min")
	val achievementHypixelMin: Long? = null,
    /** Maximum number of achievement hypixel. */
	@SerialName("achievement_hypixel_max")
	val achievementHypixelMax: Long? = null,
    /** Minimum level on Hypixel SkyBlock. */
	@SerialName("level_hypixel_skyblock_min")
	val levelHypixelSkyblockMin: Long? = null,
    /** Maximum level on Hypixel SkyBlock. */
	@SerialName("level_hypixel_skyblock_max")
	val levelHypixelSkyblockMax: Long? = null,
    /** Minimum net worth on Hypixel SkyBlock. */
	@SerialName("net_worth_hypixel_skyblock_min")
	val netWorthHypixelSkyblockMin: Long? = null,
    /** Maximum net worth on Hypixel SkyBlock. */
	@SerialName("net_worth_hypixel_skyblock_max")
	val netWorthHypixelSkyblockMax: Long? = null,
    /** How old is the account. */
	val reg: Long? = null,
    /** In what notation is time measured. */
	@SerialName("reg_period")
	val regPeriod: RegPeriod? = null,
    /** How old is the last login account. */
	@SerialName("last_login_hypixel")
	val lastLoginHypixel: Long? = null,
    /** In what notation is time measured. */
	@SerialName("last_login_hypixel_period")
	val lastLoginHypixelPeriod: LastLoginHypixelPeriod? = null,
    /** Can change details. */
	@SerialName("can_change_details")
	val canChangeDetails: CanChangeDetails? = null,
    /** Minimum number of characters in nickname. */
	@SerialName("nickname_length_min")
	val nicknameLengthMin: Long? = null,
    /** Maximum number of characters in nickname. */
	@SerialName("nickname_length_max")
	val nicknameLengthMax: Long? = null,
    /** Was Hypixel ban parsed by Market. */
	@SerialName("hypixel_ban_parsed")
	val hypixelBanParsed: HypixelBanParsed? = null,
    /** Minimum number of Minecoins. */
	@SerialName("minecoins_min")
	val minecoinsMin: Long? = null,
    /** Maximum number of Minecoins. */
	@SerialName("minecoins_max")
	val minecoinsMax: Long? = null,
)

@Serializable
data class CategoryMinecraftResponse(
	val items: List<CategoryMinecraftResponseItems> = emptyList(),
	val totalItems: Double = 0.0,
	val totalItemsPrice: JsonElement = JsonNull,
	val hasNextPage: Boolean = false,
	val perPage: Double = 0.0,
	val page: Double = 0.0,
	val wasCached: Boolean = false,
	val cacheTTL: Double = 0.0,
	val lastModified: Double = 0.0,
	val serverTime: Double = 0.0,
	val searchUrl: String = "",
	val stickyItems: List<JsonElement> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class CategoryMinecraftResponseItemsBumpSettings(
	val canBumpItem: Boolean = false,
	val canBumpItemGlobally: Boolean = false,
	val shortErrorPhrase: JsonElement = JsonNull,
	val errorPhrase: JsonElement = JsonNull,
)

@Serializable
data class CategoryMinecraftResponseItemsAccountLinks(
	val link: String = "",
	val text: String = "",
	val iconClass: String = "",
)

@Serializable
data class CategoryMinecraftResponseItemsSeller(
	@SerialName("user_id")
	val userId: Double = 0.0,
	@SerialName("sold_items_count")
	val soldItemsCount: Double = 0.0,
	@SerialName("active_items_count")
	val activeItemsCount: Double = 0.0,
	@SerialName("restore_data")
	val restoreData: String = "",
	val username: String = "",
	@SerialName("avatar_date")
	val avatarDate: Double = 0.0,
	@SerialName("is_banned")
	val isBanned: Double = 0.0,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Double = 0.0,
	@SerialName("restore_percents")
	val restorePercents: JsonElement = JsonNull,
)

@Serializable
data class CategoryMinecraftResponseItems(
	@SerialName("item_id")
	val itemId: Double = 0.0,
	@SerialName("item_state")
	val itemState: String = "",
	@SerialName("category_id")
	val categoryId: Double = 0.0,
	@SerialName("published_date")
	val publishedDate: Double = 0.0,
	val title: String = "",
	val description: String = "",
	val price: Double = 0.0,
	@SerialName("update_stat_date")
	val updateStatDate: Double = 0.0,
	@SerialName("refreshed_date")
	val refreshedDate: Double = 0.0,
	@SerialName("edit_date")
	val editDate: Double = 0.0,
	@SerialName("view_count")
	val viewCount: Double = 0.0,
	@SerialName("is_sticky")
	val isSticky: Double = 0.0,
	@SerialName("item_origin")
	val itemOrigin: String = "",
	@SerialName("extended_guarantee")
	val extendedGuarantee: Double = 0.0,
	val nsb: Double = 0.0,
	@SerialName("allow_ask_discount")
	val allowAskDiscount: Double = 0.0,
	@SerialName("title_en")
	val titleEn: String = "",
	@SerialName("description_en")
	val descriptionEn: String = "",
	@SerialName("email_type")
	val emailType: String = "",
	@SerialName("email_provider")
	val emailProvider: String = "",
	@SerialName("item_domain")
	val itemDomain: String = "",
	@SerialName("resale_item_origin")
	val resaleItemOrigin: String = "",
	@SerialName("minecraft_item_id")
	val minecraftItemId: Double = 0.0,
	@SerialName("minecraft_id")
	val minecraftId: String = "",
	@SerialName("minecraft_nickname")
	val minecraftNickname: String = "",
	@SerialName("minecraft_country")
	val minecraftCountry: String = "",
	@SerialName("minecraft_skin")
	val minecraftSkin: String = "",
	@SerialName("minecraft_java")
	val minecraftJava: Double = 0.0,
	@SerialName("minecraft_bedrock")
	val minecraftBedrock: Double = 0.0,
	@SerialName("minecraft_can_change_nickname")
	val minecraftCanChangeNickname: Double = 0.0,
	@SerialName("minecraft_created_at")
	val minecraftCreatedAt: Double = 0.0,
	@SerialName("minecraft_hypixel_rank")
	val minecraftHypixelRank: String = "",
	@SerialName("minecraft_hypixel_level")
	val minecraftHypixelLevel: Double = 0.0,
	@SerialName("minecraft_hypixel_achievement")
	val minecraftHypixelAchievement: Double = 0.0,
	@SerialName("minecraft_hypixel_last_login")
	val minecraftHypixelLastLogin: Double = 0.0,
	@SerialName("minecraft_hypixel_ban")
	val minecraftHypixelBan: Double = 0.0,
	@SerialName("minecraft_hypixel_ban_reason")
	val minecraftHypixelBanReason: String = "",
	@SerialName("minecraft_hypixel_skyblock_level")
	val minecraftHypixelSkyblockLevel: Double = 0.0,
	@SerialName("minecraft_hypixel_skyblock_net_worth")
	val minecraftHypixelSkyblockNetWorth: Double = 0.0,
	@SerialName("minecraft_dungeons")
	val minecraftDungeons: Double = 0.0,
	@SerialName("minecraft_legends")
	val minecraftLegends: Double = 0.0,
	@SerialName("minecraft_capes_count")
	val minecraftCapesCount: Double = 0.0,
	@SerialName("minecraft_capes")
	val minecraftCapes: List<JsonElement> = emptyList(),
	@SerialName("minecraft_subscription_name")
	val minecraftSubscriptionName: String = "",
	@SerialName("minecraft_subscription_ends")
	val minecraftSubscriptionEnds: Double = 0.0,
	@SerialName("minecraft_subscription_auto_renew")
	val minecraftSubscriptionAutoRenew: Double = 0.0,
	@SerialName("minecraft_email_reset_date")
	val minecraftEmailResetDate: Double = 0.0,
	@SerialName("feedback_data")
	val feedbackData: String = "",
	val isIgnored: Boolean = false,
	val priceWithSellerFee: Double = 0.0,
	val guarantee: JsonElement = JsonNull,
	val canViewLoginData: Boolean = false,
	val canUpdateItemStats: Boolean = false,
	val canReportItem: Boolean = false,
	val canViewEmailLoginData: Boolean = false,
	val showGetEmailCodeButton: Boolean = false,
	val canOpenItem: Boolean = false,
	val canCloseItem: Boolean = false,
	val canEditItem: Boolean = false,
	val canDeleteItem: Boolean = false,
	val canStickItem: Boolean = false,
	val canUnstickItem: Boolean = false,
	val bumpSettings: CategoryMinecraftResponseItemsBumpSettings = CategoryMinecraftResponseItemsBumpSettings(),
	val canBumpItem: Boolean = false,
	val canBuyItem: Boolean = false,
	@SerialName("rub_price")
	val rubPrice: Double = 0.0,
	@SerialName("price_currency")
	val priceCurrency: String = "",
	val canValidateAccount: Boolean = false,
	val canResellItemAfterPurchase: Boolean = false,
	val minecraftHasPaidLicense: Boolean = false,
	val canViewAccountLink: Boolean = false,
	val accountLinks: List<CategoryMinecraftResponseItemsAccountLinks> = emptyList(),
	val accountLink: String = "",
	val emailLoginUrl: String = "",
	val canChangePassword: Boolean = false,
	val itemOriginPhrase: String = "",
	val tags: List<JsonElement> = emptyList(),
	@SerialName("note_text")
	val noteText: JsonElement = JsonNull,
	val hasPendingAutoBuy: Boolean = false,
	val descriptionHtml: String = "",
	val descriptionEnHtml: String = "",
	val descriptionPlain: String = "",
	val descriptionEnPlain: String = "",
	val seller: CategoryMinecraftResponseItemsSeller = CategoryMinecraftResponseItemsSeller(),
)

@Serializable
data class CategoryHytaleParams(
    /** The number of the page to display results from. */
	val page: Long? = null,
    /** Minimal price of account (Inclusive). */
	val pmin: Long? = null,
    /** Maximum price of account (Inclusive). */
	val pmax: Long? = null,
    /** The word or words contained in the account title. */
	val title: String? = null,
    /** Order by. */
	@SerialName("order_by")
	val orderBy: OrderBy? = null,
    /** List of tag ids (Tag list is available via GET /me). */
	@SerialName("tag_id[]")
	val tagId: List<Long>? = null,
    /** List of tag ids that won't be included (Tag list is available via GET /me). */
	@SerialName("not_tag_id[]")
	val notTagId: List<Long>? = null,
    /** List of tag ids (Tag list is available via GET /me). */
	@SerialName("public_tag_id[]")
	val publicTagId: List<Long>? = null,
    /** List of tag ids that won't be included (Tag list is available via GET /me). */
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Long>? = null,
    /** List of account origins. */
	@SerialName("origin[]")
	val origin: JsonElement? = null,
    /** List of account origins that won't be included. */
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
    /** Search accounts of user. */
	@SerialName("user_id")
	val userId: Long? = null,
    /** Not sold before. */
	val nsb: Boolean? = null,
    /** Sold before. */
	val sb: Boolean? = null,
    /** Not sold by me before. */
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
    /** Sold by me before. */
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
    /** Currency in which the cost of the account will be searched. */
	val currency: Currency? = null,
    /** Has email login data. */
	@SerialName("email_login_data")
	val emailLoginData: Boolean? = null,
    /** Email provider. */
	@SerialName("email_provider[]")
	val emailProvider: JsonElement? = null,
    /** Email provider. */
	@SerialName("not_email_provider[]")
	val notEmailProvider: NotEmailProvider? = null,
    /** Parse same item ids. */
	@SerialName("parse_same_item_ids")
	val parseSameItemIds: Boolean? = null,
    /** List of allowed editions. */
	@SerialName("edition[]")
	val edition: JsonElement? = null,
    /** Minimum number of profiles with game. */
	@SerialName("profiles_min")
	val profilesMin: Long? = null,
    /** Maximum number of profiles with game. */
	@SerialName("profiles_max")
	val profilesMax: Long? = null,
)

@Serializable
data class CategoryHytaleResponse(
	val items: List<CategoryHytaleResponseItems> = emptyList(),
	val totalItems: Double = 0.0,
	val totalItemsPrice: JsonElement = JsonNull,
	val hasNextPage: Boolean = false,
	val perPage: Double = 0.0,
	val page: Double = 0.0,
	val wasCached: Boolean = false,
	val cacheTTL: Double = 0.0,
	val lastModified: Double = 0.0,
	val serverTime: Double = 0.0,
	val searchUrl: String = "",
	val stickyItems: List<JsonElement> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class CategoryHytaleResponseItemsCategory(
	@SerialName("category_id")
	val categoryId: Double = 0.0,
	@SerialName("category_title")
	val categoryTitle: String = "",
	@SerialName("category_name")
	val categoryName: String = "",
	@SerialName("category_url")
	val categoryUrl: String = "",
)

@Serializable
data class CategoryHytaleResponseItemsCopyFormatData(
	@SerialName("title_link")
	val titleLink: String = "",
)

@Serializable
data class CategoryHytaleResponseItemsSeller(
	@SerialName("user_id")
	val userId: Double = 0.0,
	@SerialName("sold_items_count")
	val soldItemsCount: Double = 0.0,
	@SerialName("active_items_count")
	val activeItemsCount: Double = 0.0,
	@SerialName("restore_data")
	val restoreData: String = "",
	val username: String = "",
	@SerialName("avatar_date")
	val avatarDate: Double = 0.0,
	@SerialName("is_banned")
	val isBanned: Double = 0.0,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Double = 0.0,
	@SerialName("restore_percents")
	val restorePercents: JsonElement = JsonNull,
)

@Serializable
data class CategoryHytaleResponseItems(
	@SerialName("item_id")
	val itemId: Double = 0.0,
	@SerialName("item_state")
	val itemState: String = "",
	@SerialName("category_id")
	val categoryId: Double = 0.0,
	@SerialName("published_date")
	val publishedDate: Double = 0.0,
	val title: String = "",
	val description: String = "",
	val price: Double = 0.0,
	@SerialName("update_stat_date")
	val updateStatDate: Double = 0.0,
	@SerialName("refreshed_date")
	val refreshedDate: Double = 0.0,
	@SerialName("edit_date")
	val editDate: Double = 0.0,
	@SerialName("pending_deletion_date")
	val pendingDeletionDate: Double = 0.0,
	@SerialName("view_count")
	val viewCount: Double = 0.0,
	@SerialName("is_sticky")
	val isSticky: Double = 0.0,
	@SerialName("item_origin")
	val itemOrigin: String = "",
	@SerialName("extended_guarantee")
	val extendedGuarantee: Double = 0.0,
	val nsb: Double = 0.0,
	@SerialName("allow_ask_discount")
	val allowAskDiscount: Double = 0.0,
	@SerialName("title_en")
	val titleEn: String = "",
	@SerialName("description_en")
	val descriptionEn: String = "",
	@SerialName("email_type")
	val emailType: String = "",
	@SerialName("email_provider")
	val emailProvider: String = "",
	@SerialName("item_domain")
	val itemDomain: String = "",
	@SerialName("resale_item_origin")
	val resaleItemOrigin: String = "",
	@SerialName("auto_bump_period")
	val autoBumpPeriod: Double = 0.0,
	@SerialName("rub_price")
	val rubPrice: Double = 0.0,
	val discount: Boolean = false,
	@SerialName("hytale_item_id")
	val hytaleItemId: Double = 0.0,
	@SerialName("hytale_profiles")
	val hytaleProfiles: Double = 0.0,
	@SerialName("hytale_edition")
	val hytaleEdition: String = "",
	@SerialName("feedback_data")
	val feedbackData: String = "",
	@SerialName("max_discount_percent")
	val maxDiscountPercent: Double = 0.0,
	val isIgnored: Boolean = false,
	val priceWithSellerFee: Double = 0.0,
	val category: CategoryHytaleResponseItemsCategory = CategoryHytaleResponseItemsCategory(),
	val guarantee: JsonElement = JsonNull,
	val canViewLoginData: Boolean = false,
	val canViewTempEmail: Boolean = false,
	val canUpdateItemStats: Boolean = false,
	val canReportItem: Boolean = false,
	val canViewItemViews: Boolean = false,
	val canManagePublicTag: Boolean = false,
	val canViewEmailLoginData: Boolean = false,
	val copyFormatData: CategoryHytaleResponseItemsCopyFormatData = CategoryHytaleResponseItemsCopyFormatData(),
	val showGetEmailCodeButton: Boolean = false,
	val canOpenItem: Boolean = false,
	val canCloseItem: Boolean = false,
	val canEditItem: Boolean = false,
	val canDeleteItem: Boolean = false,
	val canStickItem: Boolean = false,
	val canUnstickItem: Boolean = false,
	val canBumpItem: Boolean = false,
	val canNotBumpItemReason: String = "",
	val buyer: JsonElement = JsonNull,
	val isPersonalAccount: Boolean = false,
	val canBuyItem: Boolean = false,
	@SerialName("price_currency")
	val priceCurrency: String = "",
	val priceWithSellerFeeLabel: String = "",
	val canValidateAccount: Boolean = false,
	val canResellItem: Boolean = false,
	val canViewAccountLink: Boolean = false,
	val imagePreviewLinks: List<JsonElement> = emptyList(),
	val emailLoginUrl: String = "",
	val canChangePassword: Boolean = false,
	val canChangeEmailPassword: Boolean = false,
	val uniqueKeyExists: Boolean = false,
	val itemOriginPhrase: String = "",
	val tags: List<JsonElement> = emptyList(),
	@SerialName("public_tag")
	val publicTag: JsonElement = JsonNull,
	@SerialName("note_text")
	val noteText: JsonElement = JsonNull,
	val hasPendingAutoBuy: Boolean = false,
	val descriptionHtml: String = "",
	val descriptionEnHtml: String = "",
	val descriptionPlain: String = "",
	val descriptionEnPlain: String = "",
	val seller: CategoryHytaleResponseItemsSeller = CategoryHytaleResponseItemsSeller(),
)

@Serializable
data class CategoryListParams(
    /** Display top queries for per category. */
	@SerialName("top_queries")
	val topQueries: Boolean? = null,
)

@Serializable
data class CategoryListResponse(
	val category: CategoryListResponseCategory = CategoryListResponseCategory(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class CategoryListResponseCategoryLinks(
	val permalink: String = "",
	val detail: String = "",
	@SerialName("sub-categories")
	val subCategories: String = "",
	@SerialName("sub-forums")
	val subForums: String = "",
)

@Serializable
data class CategoryListResponseCategory(
	@SerialName("category_id")
	val categoryId: Double = 0.0,
	@SerialName("category_title")
	val categoryTitle: String = "",
	@SerialName("category_description")
	val categoryDescription: String = "",
	val links: CategoryListResponseCategoryLinks = CategoryListResponseCategoryLinks(),
)

@Serializable
data class CategoryParamsResponse(
	val category: CategoryParamsResponseCategory? = null,
	val params: List<CategoryParamsResponseParams>? = null,
	@SerialName("base_params")
	val baseParams: JsonElement? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class CategoryParamsResponseCategory(
	@SerialName("category_id")
	val categoryId: Double = 0.0,
	@SerialName("sub_category_id")
	val subCategoryId: Double = 0.0,
	@SerialName("category_order")
	val categoryOrder: Double = 0.0,
	@SerialName("category_title")
	val categoryTitle: String = "",
	@SerialName("category_name")
	val categoryName: String = "",
	@SerialName("category_url")
	val categoryUrl: String = "",
	@SerialName("category_description_html")
	val categoryDescriptionHtml: String = "",
	@SerialName("category_login_url")
	val categoryLoginUrl: String = "",
	@SerialName("add_item_available")
	val addItemAvailable: Double = 0.0,
	@SerialName("mass_upload_item_available")
	val massUploadItemAvailable: Double = 0.0,
	@SerialName("has_guarantee")
	val hasGuarantee: Double = 0.0,
	@SerialName("has_account_link")
	val hasAccountLink: Double = 0.0,
	@SerialName("require_temp_email")
	val requireTempEmail: Double = 0.0,
	@SerialName("recovery_link")
	val recoveryLink: String = "",
	@SerialName("check_button_enabled")
	val checkButtonEnabled: Double = 0.0,
	@SerialName("checker_enabled")
	val checkerEnabled: Double = 0.0,
	@SerialName("support_personal_proxy")
	val supportPersonalProxy: Double = 0.0,
	@SerialName("support_email_login_data")
	val supportEmailLoginData: Double = 0.0,
	@SerialName("require_email_login_data")
	val requireEmailLoginData: Double = 0.0,
	@SerialName("display_in_list")
	val displayInList: Double = 0.0,
	@SerialName("category_description_html_en")
	val categoryDescriptionHtmlEn: String = "",
	@SerialName("category_h1_html_en")
	val categoryH1HtmlEn: String = "",
	@SerialName("account_price_min")
	val accountPriceMin: Double = 0.0,
	@SerialName("require_video_recording")
	val requireVideoRecording: Double = 0.0,
	@SerialName("top_queries")
	val topQueries: String = "",
	@SerialName("require_eld_for_native_accs")
	val requireEldForNativeAccs: Double = 0.0,
	@SerialName("can_be_resold")
	val canBeResold: Double = 0.0,
	@SerialName("support_temp_email")
	val supportTempEmail: Double = 0.0,
	val cookies: String = "",
	@SerialName("login_type")
	val loginType: String = "",
	@SerialName("guest_hidden")
	val guestHidden: Double = 0.0,
	@SerialName("available_temp_email")
	val availableTempEmail: Double = 0.0,
	@SerialName("resale_duration_limit_days")
	val resaleDurationLimitDays: Double = 0.0,
	@SerialName("buy_without_validation")
	val buyWithoutValidation: Double = 0.0,
	@SerialName("max_invalid_upload_tries")
	val maxInvalidUploadTries: Double = 0.0,
)

@Serializable
data class CategoryParamsResponseParams(
	val name: String = "",
	val input: String = "",
	val description: String = "",
	val values: List<String> = emptyList(),
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
	val appId: String = "",
	val title: String = "",
	val abbr: String = "",
	@SerialName("category_id")
	val categoryId: Double = 0.0,
	val img: String = "",
	val url: String = "",
	val ru: String = "",
)

// ─── ListApi Types ────────────────────────────────────────

@Serializable
data class ListUserParams(
    /** User id. */
	@SerialName("user_id")
	val userId: Long? = null,
    /** Accounts category. */
	@SerialName("category_id")
	val categoryId: CategoryId? = null,
    /** The number of the page to display results from. */
	val page: Long? = null,
    /** Account status. */
	val show: Show? = null,
    /** Delete reason. (Only if show is set to deleted) */
	@SerialName("delete_reason")
	val deleteReason: String? = null,
    /** The word or words contained in the account title. */
	val title: String? = null,
    /** Minimal price of account (Inclusive). */
	val pmin: Long? = null,
    /** Maximum price of account (Inclusive). */
	val pmax: Long? = null,
    /** Login. */
	val login: String? = null,
    /** List of account origins. */
	@SerialName("origin[]")
	val origin: JsonElement? = null,
    /** List of account origins that won't be included. */
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
    /** Order by. */
	@SerialName("order_by")
	val orderBy: OrderBy? = null,
    /** Sold before. */
	val sb: Boolean? = null,
    /** Sold by me before. */
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
    /** Not sold before. */
	val nsb: Boolean? = null,
    /** Not sold by me before. */
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
    /** Username of buyer. (If show is paid) */
	val username: String? = null,
    /** Start date for filtering by publication date. */
	@SerialName("published_startDate")
	val publishedStartDate: String? = null,
    /** End date for filtering by publication date. */
	@SerialName("published_endDate")
	val publishedEndDate: String? = null,
    /** Enable filtering by publication date. */
	@SerialName("filter_by_published_date")
	val filterByPublishedDate: Boolean? = null,
    /** Start date for filtering by buyer operation date. */
	@SerialName("paid_startDate")
	val paidStartDate: String? = null,
    /** End date for filtering by buyer operation date. */
	@SerialName("paid_endDate")
	val paidEndDate: String? = null,
    /** Enable filtering by buyer operation date. */
	@SerialName("filter_by_buyer_operation_date")
	val filterByBuyerOperationDate: Boolean? = null,
    /** Start date for filtering by deletion date. */
	@SerialName("delete_startDate")
	val deleteStartDate: String? = null,
    /** End date for filtering by deletion date. */
	@SerialName("delete_endDate")
	val deleteEndDate: String? = null,
    /** Enable filtering by deletion date. */
	@SerialName("filter_by_delete_date")
	val filterByDeleteDate: Boolean? = null,
)

@Serializable
data class ListUserResponse(
	val items: List<ItemFromListModel> = emptyList(),
	val totalItems: Double = 0.0,
	val totalItemsPrice: JsonElement = JsonNull,
	val hasNextPage: Boolean = false,
	val perPage: Double = 0.0,
	val page: Double = 0.0,
	val searchUrl: String = "",
	val stickyItems: List<ItemFromListModel> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ListOrdersParams(
    /** User id. */
	@SerialName("user_id")
	val userId: Long? = null,
    /** Accounts category. */
	@SerialName("category_id")
	val categoryId: CategoryId? = null,
    /** The number of the page to display results from. */
	val page: Long? = null,
    /** Account status. */
	val show: Show? = null,
    /** The word or words contained in the account title. */
	val title: String? = null,
    /** Minimal price of account (Inclusive). */
	val pmin: Long? = null,
    /** Maximum price of account (Inclusive). */
	val pmax: Long? = null,
    /** Login. */
	val login: String? = null,
    /** List of account origins. */
	@SerialName("origin[]")
	val origin: JsonElement? = null,
    /** List of account origins that won't be included. */
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
    /** Order by. */
	@SerialName("order_by")
	val orderBy: OrderBy? = null,
    /** Sold before. */
	val sb: Boolean? = null,
    /** Sold by me before. */
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
    /** Not sold before. */
	val nsb: Boolean? = null,
    /** Not sold by me before. */
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
)

@Serializable
data class ListOrdersResponse(
	val items: List<ItemFromListModel> = emptyList(),
	val totalItems: Double = 0.0,
	val totalItemsPrice: JsonElement = JsonNull,
	val hasNextPage: Boolean = false,
	val perPage: Double = 0.0,
	val page: Double = 0.0,
	val searchUrl: String = "",
	val stickyItems: List<ItemFromListModel> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ListStatesParams(
    /** User ID. */
	@SerialName("user_id")
	val userId: StringOrInt? = null,
)

@Serializable
data class ListStatesResponse(
	val userItemStates: ListStatesResponseUserItemStates = ListStatesResponseUserItemStates(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ListStatesResponseUserItemStatesStickied(
	@SerialName("item_state")
	val itemState: String = "",
	@SerialName("item_count")
	val itemCount: Double = 0.0,
	val title: String = "",
	val stickyLimit: Double = 0.0,
)

@Serializable
data class ListStatesResponseUserItemStatesDiscountRequest(
	@SerialName("item_state")
	val itemState: String = "",
	@SerialName("item_count")
	val itemCount: Double = 0.0,
	val title: String = "",
)

@Serializable
data class ListStatesResponseUserItemStatesInBuyersFavorites(
	@SerialName("item_state")
	val itemState: String = "",
	@SerialName("item_count")
	val itemCount: Double = 0.0,
	val title: String = "",
)

@Serializable
data class ListStatesResponseUserItemStatesActive(
	@SerialName("item_count")
	val itemCount: Double = 0.0,
	@SerialName("item_state")
	val itemState: String = "",
	val title: String = "",
)

@Serializable
data class ListStatesResponseUserItemStatesPaid(
	@SerialName("item_count")
	val itemCount: Double = 0.0,
	@SerialName("item_state")
	val itemState: String = "",
	val title: String = "",
)

@Serializable
data class ListStatesResponseUserItemStatesClosed(
	@SerialName("item_state")
	val itemState: String = "",
	@SerialName("item_count")
	val itemCount: Double = 0.0,
	val title: String = "",
)

@Serializable
data class ListStatesResponseUserItemStatesDeleted(
	@SerialName("item_count")
	val itemCount: Double = 0.0,
	@SerialName("item_state")
	val itemState: String = "",
	val title: String = "",
)

@Serializable
data class ListStatesResponseUserItemStatesAwaiting(
	@SerialName("item_count")
	val itemCount: Double = 0.0,
	@SerialName("item_state")
	val itemState: String = "",
	val title: String = "",
)

@Serializable
data class ListStatesResponseUserItemStatesPreActive(
	@SerialName("item_state")
	val itemState: String = "",
	@SerialName("item_count")
	val itemCount: Double = 0.0,
	val title: String = "",
)

@Serializable
data class ListStatesResponseUserItemStatesPreUpload(
	@SerialName("item_state")
	val itemState: String = "",
	@SerialName("item_count")
	val itemCount: Double = 0.0,
	val title: String = "",
)

@Serializable
data class ListStatesResponseUserItemStatesPendingDeletion(
	@SerialName("item_state")
	val itemState: String = "",
	@SerialName("item_count")
	val itemCount: Double = 0.0,
	val title: String = "",
)

@Serializable
data class ListStatesResponseUserItemStatesClosedInactive(
	@SerialName("item_count")
	val itemCount: Double = 0.0,
	@SerialName("item_state")
	val itemState: String = "",
	val title: String = "",
)

@Serializable
data class ListStatesResponseUserItemStatesAutoBump(
	@SerialName("item_state")
	val itemState: String = "",
	@SerialName("item_count")
	val itemCount: Double = 0.0,
	val title: String = "",
)

@Serializable
data class ListStatesResponseUserItemStates(
	val stickied: ListStatesResponseUserItemStatesStickied = ListStatesResponseUserItemStatesStickied(),
	@SerialName("discount_request")
	val discountRequest: ListStatesResponseUserItemStatesDiscountRequest = ListStatesResponseUserItemStatesDiscountRequest(),
	@SerialName("in_buyers_favorites")
	val inBuyersFavorites: ListStatesResponseUserItemStatesInBuyersFavorites = ListStatesResponseUserItemStatesInBuyersFavorites(),
	val active: ListStatesResponseUserItemStatesActive = ListStatesResponseUserItemStatesActive(),
	val paid: ListStatesResponseUserItemStatesPaid = ListStatesResponseUserItemStatesPaid(),
	val closed: ListStatesResponseUserItemStatesClosed = ListStatesResponseUserItemStatesClosed(),
	val deleted: ListStatesResponseUserItemStatesDeleted = ListStatesResponseUserItemStatesDeleted(),
	val awaiting: ListStatesResponseUserItemStatesAwaiting = ListStatesResponseUserItemStatesAwaiting(),
	@SerialName("pre_active")
	val preActive: ListStatesResponseUserItemStatesPreActive = ListStatesResponseUserItemStatesPreActive(),
	@SerialName("pre_upload")
	val preUpload: ListStatesResponseUserItemStatesPreUpload = ListStatesResponseUserItemStatesPreUpload(),
	@SerialName("pending_deletion")
	val pendingDeletion: ListStatesResponseUserItemStatesPendingDeletion = ListStatesResponseUserItemStatesPendingDeletion(),
	@SerialName("closed_inactive")
	val closedInactive: ListStatesResponseUserItemStatesClosedInactive = ListStatesResponseUserItemStatesClosedInactive(),
	@SerialName("auto_bump")
	val autoBump: ListStatesResponseUserItemStatesAutoBump = ListStatesResponseUserItemStatesAutoBump(),
)

@Serializable
data class ListDownloadParams(
    /** Format of the downloaded accounts. */
	val format: Format? = null,
    /** Custom format string for download. (Required if format is set to custom) */
	@SerialName("custom_format")
	val customFormat: String? = null,
    /** Accounts category. */
	@SerialName("category_id")
	val categoryId: CategoryId? = null,
    /** The number of the page to display results from. */
	val page: Long? = null,
    /** Account status. */
	val show: Show? = null,
    /** Delete reason. (Only if show is set to deleted) */
	@SerialName("delete_reason")
	val deleteReason: String? = null,
    /** The word or words contained in the account title. */
	val title: String? = null,
    /** Minimal price of account (Inclusive). */
	val pmin: Long? = null,
    /** Maximum price of account (Inclusive). */
	val pmax: Long? = null,
    /** List of account origins. */
	@SerialName("origin[]")
	val origin: JsonElement? = null,
    /** List of account origins that won't be included. */
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
    /** Order by. */
	@SerialName("order_by")
	val orderBy: OrderBy? = null,
    /** Sold before. */
	val sb: Boolean? = null,
    /** Sold by me before. */
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
    /** Not sold before. */
	val nsb: Boolean? = null,
    /** Not sold by me before. */
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
    /** Username of buyer. (If show is paid) */
	val username: String? = null,
    /** Start date for filtering by publication date. */
	@SerialName("published_startDate")
	val publishedStartDate: String? = null,
    /** End date for filtering by publication date. */
	@SerialName("published_endDate")
	val publishedEndDate: String? = null,
    /** Enable filtering by publication date. */
	@SerialName("filter_by_published_date")
	val filterByPublishedDate: Boolean? = null,
    /** Start date for filtering by buyer operation date. */
	@SerialName("paid_startDate")
	val paidStartDate: String? = null,
    /** End date for filtering by buyer operation date. */
	@SerialName("paid_endDate")
	val paidEndDate: String? = null,
    /** Enable filtering by buyer operation date. */
	@SerialName("filter_by_buyer_operation_date")
	val filterByBuyerOperationDate: Boolean? = null,
    /** Start date for filtering by deletion date. */
	@SerialName("delete_startDate")
	val deleteStartDate: String? = null,
    /** End date for filtering by deletion date. */
	@SerialName("delete_endDate")
	val deleteEndDate: String? = null,
    /** Enable filtering by deletion date. */
	@SerialName("filter_by_delete_date")
	val filterByDeleteDate: Boolean? = null,
)

typealias ListDownloadResponse = String

@Serializable
data class ListFavoritesParams(
    /** The number of the page to display results from. */
	val page: Long? = null,
    /** Account status. */
	val show: Show? = null,
    /** The word or words contained in the account title. */
	val title: String? = null,
    /** Minimal price of account (Inclusive). */
	val pmin: Long? = null,
    /** Maximum price of account (Inclusive). */
	val pmax: Long? = null,
    /** List of account origins. */
	@SerialName("origin[]")
	val origin: JsonElement? = null,
    /** List of account origins that won't be included. */
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
    /** Order by. */
	@SerialName("order_by")
	val orderBy: OrderBy? = null,
    /** Sold before. */
	val sb: Boolean? = null,
    /** Sold by me before. */
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
    /** Not sold before. */
	val nsb: Boolean? = null,
    /** Not sold by me before. */
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
)

@Serializable
data class ListFavoritesResponse(
	val items: List<ItemFromListModel> = emptyList(),
	val totalItems: Double = 0.0,
	val totalItemsPrice: JsonElement = JsonNull,
	val hasNextPage: Boolean = false,
	val perPage: Double = 0.0,
	val page: Double = 0.0,
	val searchUrl: String = "",
	val stickyItems: List<ItemFromListModel> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ListViewedParams(
    /** The number of the page to display results from. */
	val page: Long? = null,
    /** Account status. */
	val show: Show? = null,
    /** The word or words contained in the account title. */
	val title: String? = null,
    /** Minimal price of account (Inclusive). */
	val pmin: Long? = null,
    /** Maximum price of account (Inclusive). */
	val pmax: Long? = null,
    /** List of account origins. */
	@SerialName("origin[]")
	val origin: JsonElement? = null,
    /** List of account origins that won't be included. */
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
    /** Order by. */
	@SerialName("order_by")
	val orderBy: OrderBy? = null,
    /** Sold before. */
	val sb: Boolean? = null,
    /** Sold by me before. */
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
    /** Not sold before. */
	val nsb: Boolean? = null,
    /** Not sold by me before. */
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
)

@Serializable
data class ListViewedResponse(
	val items: List<ItemFromListModel> = emptyList(),
	val totalItems: Double = 0.0,
	val totalItemsPrice: JsonElement = JsonNull,
	val hasNextPage: Boolean = false,
	val perPage: Double = 0.0,
	val page: Double = 0.0,
	val searchUrl: String = "",
	val stickyItems: List<ItemFromListModel> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

// ─── ManagingApi Types ────────────────────────────────────────

@Serializable
data class ManagingGetParams(
    /** Parse same item ids. */
	@SerialName("parse_same_item_ids")
	val parseSameItemIds: Boolean? = null,
)

@Serializable
data class ManagingGetResponse(
	val item: ItemModel = ItemModel(),
	val canStickItem: Boolean = false,
	val canUnstickItem: Boolean = false,
	val canBuyItem: Boolean = false,
	val cannotBuyItemError: String = "",
	val canCloseItem: Boolean = false,
	val canOpenItem: Boolean = false,
	val canReportItem: Boolean = false,
	val canEditItem: Boolean = false,
	val canDeleteItem: Boolean = false,
	val canCancelConfirmedBuy: Boolean = false,
	val canViewItemHistory: Boolean = false,
	val faveCount: Boolean = false,
	val isVisibleItem: Boolean = false,
	val canViewLoginData: Boolean = false,
	val showToFavouritesButton: Boolean = false,
	val itemLink: String = "",
	val canChangeOwner: Boolean = false,
	val sameItemsIds: List<Long> = emptyList(),
	val sameItemsCount: Double = 0.0,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ManagingDeleteBody(
    /** Delete reason. */
	val reason: String,
)

@Serializable
data class ManagingDeleteResponse(
	val status: String = "",
	val message: String = "",
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ManagingCreateClaimBody(
    /** Item id. */
	@SerialName("item_id")
	val itemId: Long,
    /** You should describe what's happened. - describe the situation in a nutshell. If you wish, you can describe the situation in more detail using the "Spoiler" function. - attach screenshots of correspondence. You must upload to the site [Imgur](https://imgur.com/upload) - other evidence; - notify the respondent about the complaint you created, familiarize him with hidden content Describe the situation in as much detail as possible. */
	@SerialName("post_body")
	val postBody: String,
)

@Serializable
data class ManagingCreateClaimResponse(
	val thread: ManagingCreateClaimResponseThread = ManagingCreateClaimResponseThread(),
	@SerialName("system_info")
	val systemInfo: ManagingCreateClaimResponseSystemInfo = ManagingCreateClaimResponseSystemInfo(),
)

@Serializable
data class ManagingCreateClaimResponseThreadFirstPostLikeUsers(
	@SerialName("user_id")
	val userId: Double = 0.0,
	val username: String = "",
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Double? = null,
	@SerialName("is_banned")
	val isBanned: Double? = null,
	@SerialName("uniq_username_css")
	val uniqUsernameCss: String? = null,
)

@Serializable
data class ManagingCreateClaimResponseThreadFirstPostLinks(
	val permalink: String = "",
	val detail: String = "",
	val thread: String = "",
	val poster: String = "",
	val likes: String = "",
	val report: String = "",
	val attachments: String = "",
	@SerialName("poster_avatar")
	val posterAvatar: String = "",
)

@Serializable
data class ManagingCreateClaimResponseThreadFirstPostPermissions(
	val view: Boolean = false,
	val edit: Boolean = false,
	val delete: Boolean = false,
	val reply: Boolean = false,
	val like: Boolean = false,
	val report: Boolean = false,
	@SerialName("upload_attachment")
	val uploadAttachment: Boolean = false,
)

@Serializable
data class ManagingCreateClaimResponseThreadFirstPost(
	@SerialName("post_id")
	val postId: Double = 0.0,
	@SerialName("thread_id")
	val threadId: Double = 0.0,
	@SerialName("poster_user_id")
	val posterUserId: Double = 0.0,
	@SerialName("poster_username")
	val posterUsername: String = "",
	@SerialName("post_create_date")
	val postCreateDate: Double = 0.0,
	@SerialName("post_body")
	val postBody: String = "",
	@SerialName("post_body_html")
	val postBodyHtml: String = "",
	@SerialName("post_body_plain_text")
	val postBodyPlainText: String = "",
	val signature: String = "",
	@SerialName("signature_html")
	val signatureHtml: String = "",
	@SerialName("signature_plain_text")
	val signaturePlainText: String = "",
	@SerialName("post_like_count")
	val postLikeCount: Double = 0.0,
	@SerialName("post_attachment_count")
	val postAttachmentCount: Double = 0.0,
	@SerialName("like_users")
	val likeUsers: List<ManagingCreateClaimResponseThreadFirstPostLikeUsers> = emptyList(),
	@SerialName("user_is_ignored")
	val userIsIgnored: Boolean = false,
	@SerialName("post_is_published")
	val postIsPublished: Boolean = false,
	@SerialName("post_is_deleted")
	val postIsDeleted: Boolean = false,
	@SerialName("post_update_date")
	val postUpdateDate: Double = 0.0,
	@SerialName("post_is_first_post")
	val postIsFirstPost: Boolean = false,
	val links: ManagingCreateClaimResponseThreadFirstPostLinks = ManagingCreateClaimResponseThreadFirstPostLinks(),
	val permissions: ManagingCreateClaimResponseThreadFirstPostPermissions = ManagingCreateClaimResponseThreadFirstPostPermissions(),
)

@Serializable
data class ManagingCreateClaimResponseThreadLinks(
	val permalink: String = "",
	val detail: String = "",
	val followers: String = "",
	val forum: String = "",
	val posts: String = "",
	@SerialName("first_poster")
	val firstPoster: String = "",
	@SerialName("first_poster_avatar")
	val firstPosterAvatar: String = "",
	@SerialName("first_post")
	val firstPost: String = "",
	@SerialName("last_poster")
	val lastPoster: String = "",
	@SerialName("last_post")
	val lastPost: String = "",
)

@Serializable
data class ManagingCreateClaimResponseThreadPermissions(
	val view: Boolean = false,
	val delete: Boolean = false,
	val follow: Boolean = false,
	val post: Boolean = false,
	@SerialName("upload_attachment")
	val uploadAttachment: Boolean = false,
	val edit: Boolean = false,
)

@Serializable
data class ManagingCreateClaimResponseThreadForumForumPrefixesGroupPrefixes(
	@SerialName("prefix_id")
	val prefixId: Double = 0.0,
	@SerialName("prefix_title")
	val prefixTitle: String = "",
)

@Serializable
data class ManagingCreateClaimResponseThreadForumForumPrefixes(
	@SerialName("group_title")
	val groupTitle: String = "",
	@SerialName("group_prefixes")
	val groupPrefixes: List<ManagingCreateClaimResponseThreadForumForumPrefixesGroupPrefixes> = emptyList(),
)

@Serializable
data class ManagingCreateClaimResponseThreadForumLinks(
	val permalink: String = "",
	val detail: String = "",
	@SerialName("sub-categories")
	val subCategories: String = "",
	@SerialName("sub-forums")
	val subForums: String = "",
	val threads: String = "",
	val followers: String = "",
)

@Serializable
data class ManagingCreateClaimResponseThreadForumPermissions(
	val view: Boolean = false,
	val edit: Boolean = false,
	val delete: Boolean = false,
	@SerialName("create_thread")
	val createThread: Boolean = false,
	@SerialName("upload_attachment")
	val uploadAttachment: Boolean = false,
	@SerialName("tag_thread")
	val tagThread: Boolean = false,
	val follow: Boolean = false,
)

@Serializable
data class ManagingCreateClaimResponseThreadForum(
	@SerialName("forum_id")
	val forumId: Double = 0.0,
	@SerialName("forum_title")
	val forumTitle: String = "",
	@SerialName("forum_description")
	val forumDescription: String = "",
	@SerialName("forum_thread_count")
	val forumThreadCount: Double = 0.0,
	@SerialName("forum_post_count")
	val forumPostCount: Double = 0.0,
	@SerialName("forum_prefixes")
	val forumPrefixes: List<ManagingCreateClaimResponseThreadForumForumPrefixes> = emptyList(),
	@SerialName("thread_default_prefix_id")
	val threadDefaultPrefixId: Double = 0.0,
	@SerialName("thread_prefix_is_required")
	val threadPrefixIsRequired: Boolean = false,
	val links: ManagingCreateClaimResponseThreadForumLinks = ManagingCreateClaimResponseThreadForumLinks(),
	val permissions: ManagingCreateClaimResponseThreadForumPermissions = ManagingCreateClaimResponseThreadForumPermissions(),
	@SerialName("forum_is_followed")
	val forumIsFollowed: Boolean = false,
)

@Serializable
data class ManagingCreateClaimResponseThread(
	@SerialName("thread_id")
	val threadId: Double = 0.0,
	@SerialName("forum_id")
	val forumId: Double = 0.0,
	@SerialName("thread_title")
	val threadTitle: String = "",
	@SerialName("thread_view_count")
	val threadViewCount: Double = 0.0,
	@SerialName("creator_user_id")
	val creatorUserId: Double = 0.0,
	@SerialName("creator_username")
	val creatorUsername: String = "",
	@SerialName("thread_create_date")
	val threadCreateDate: Double = 0.0,
	@SerialName("thread_update_date")
	val threadUpdateDate: Double = 0.0,
	@SerialName("user_is_ignored")
	val userIsIgnored: Boolean = false,
	@SerialName("thread_post_count")
	val threadPostCount: Double = 0.0,
	@SerialName("thread_is_published")
	val threadIsPublished: Boolean = false,
	@SerialName("thread_is_deleted")
	val threadIsDeleted: Boolean = false,
	@SerialName("thread_is_sticky")
	val threadIsSticky: Boolean = false,
	@SerialName("thread_is_followed")
	val threadIsFollowed: Boolean = false,
	@SerialName("first_post")
	val firstPost: ManagingCreateClaimResponseThreadFirstPost = ManagingCreateClaimResponseThreadFirstPost(),
	@SerialName("thread_prefixes")
	val threadPrefixes: List<JsonElement> = emptyList(),
	@SerialName("thread_tags")
	val threadTags: List<JsonElement> = emptyList(),
	val links: ManagingCreateClaimResponseThreadLinks = ManagingCreateClaimResponseThreadLinks(),
	val permissions: ManagingCreateClaimResponseThreadPermissions = ManagingCreateClaimResponseThreadPermissions(),
	val forum: ManagingCreateClaimResponseThreadForum = ManagingCreateClaimResponseThreadForum(),
)

@Serializable
data class ManagingCreateClaimResponseSystemInfo(
	@SerialName("visitor_id")
	val visitorId: Double = 0.0,
	val time: Double = 0.0,
)

@Serializable
data class ManagingBulkGetBody(
    /** Item id. */
	@SerialName("item_id")
	val itemId: List<Long>? = null,
    /** Parse same item ids. */
	@SerialName("parse_same_item_ids")
	val parseSameItemIds: Boolean? = null,
)

@Serializable
data class ManagingBulkGetResponse(
	val items: List<ManagingBulkGetResponseItems> = emptyList(),
	@SerialName("left_item_id")
	val leftItemId: List<Long> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ManagingBulkGetResponseItems(
	@SerialName("0")
	val `0`: ItemModel? = null,
)

@Serializable
data class ManagingSteamInventoryValueParams(
    /** Application id. */
	@SerialName("app_id")
	val appId: AppId? = null,
    /** Currency in which the inventory value will be returned */
	val currency: Currency? = null,
    /** Ignore cache. */
	@SerialName("ignore_cache")
	val ignoreCache: Boolean? = null,
)

@Serializable
data class ManagingSteamInventoryValueResponse(
	val query: String? = null,
	val data: ManagingSteamInventoryValueResponseData? = null,
	val appId: Double? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ManagingSteamInventoryValueResponseData(
	val items: JsonElement = JsonNull,
	@SerialName("steam_id")
	val steamId: String = "",
	val appId: Double = 0.0,
	val appTitle: String = "",
	val totalValue: Double = 0.0,
	val itemCount: Double = 0.0,
	val marketableItemCount: Double = 0.0,
	val currency: String = "",
	val currencyIcon: String = "",
	val language: String = "",
	val time: Double = 0.0,
)

@Serializable
data class ManagingSteamValueParams(
    /** Link or id of account. Can be [https://lzt.market/{item-id}/, https://steamcommunity.com/id/{steam-name}, https://steamcommunity.com/profiles/{steam-id}, {steam-id}]. */
	val link: String,
    /** Application id. */
	@SerialName("app_id")
	val appId: AppId? = null,
    /** Currency in which the inventory value will be returned */
	val currency: Currency? = null,
    /** Ignore cache. */
	@SerialName("ignore_cache")
	val ignoreCache: Boolean? = null,
)

@Serializable
data class ManagingSteamValueResponse(
	val query: String? = null,
	val data: ManagingSteamValueResponseData? = null,
	val appId: Double? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ManagingSteamValueResponseData(
	val items: JsonElement = JsonNull,
	@SerialName("steam_id")
	val steamId: String = "",
	val appId: Double = 0.0,
	val appTitle: String = "",
	val totalValue: Double = 0.0,
	val itemCount: Double = 0.0,
	val marketableItemCount: Double = 0.0,
	val currency: String = "",
	val currencyIcon: String = "",
	val language: String = "",
	val time: Double = 0.0,
)

@Serializable
data class ManagingSteamPreviewParams(
    /** Type of page. */
	val type: ManagingType1? = null,
)

typealias ManagingSteamPreviewResponse = String

@Serializable
data class ManagingEditBody(
    /** Title of account. If title specified and title_en is empty, title_en will be automatically translated to English language. */
	val title: String? = null,
    /** English title of account. If title_en specified and title is empty, title will be automatically translated to Russian language. */
	@SerialName("title_en")
	val titleEn: String? = null,
    /** Current price of account in your currency. */
	val price: Long? = null,
	val currency: Currency? = null,
    /** Account origin. Where did you get it from. */
	@SerialName("item_origin")
	val itemOrigin: ManagingItemOrigin? = null,
    /** Email login data (email:password format). */
	@SerialName("email_login_data")
	val emailLoginData: String? = null,
    /** Email type. */
	@SerialName("email_type")
	val emailType: EmailType? = null,
    /** Allow users to ask discount for this account. */
	@SerialName("allow_ask_discount")
	val allowAskDiscount: Boolean? = null,
    /** Using proxy id for account checking. See GET or POST /proxy to get or edit proxy list. */
	@SerialName("proxy_id")
	val proxyId: Long? = null,
    /** Account public description. */
	val description: String? = null,
    /** Account private information (visible only for buyer). */
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
	val price: Double = 0.0,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ManagingAutoBuyPriceResponse(
	val price: Double = 0.0,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ManagingNoteBody(
    /** Text of note. */
	val text: String? = null,
)

@Serializable
data class ManagingNoteResponse(
	val status: String = "",
	val message: String = "",
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ManagingSteamUpdateValueBody(
    /** Update the entire Steam inventory. */
	val all: Boolean? = null,
    /** Application id. */
	@SerialName("app_id")
	val appId: AppId? = null,
    /** Parse inventory when authorized (Parse trade banned items). */
	val authorize: Boolean? = null,
)

@Serializable
data class ManagingSteamUpdateValueResponse(
	val status: String = "",
	val item: ItemModel = ItemModel(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ManagingBumpResponse(
	val status: String = "",
	val message: String = "",
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ManagingAutoBumpBody(
    /** Interval in hours */
	val hour: Long,
)

@Serializable
data class ManagingAutoBumpResponse(
	val status: String = "",
	val message: String = "",
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ManagingAutoBumpDisableResponse(
	val status: String = "",
	val message: String = "",
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ManagingOpenResponse(
	val status: String = "",
	val message: String = "",
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ManagingCloseResponse(
	val status: String = "",
	val message: String = "",
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ManagingImageParams(
    /** Type of image. */
	val type: ManagingType2,
)

@Serializable
data class ManagingImageResponse(
	val base64: String = "",
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ManagingEmailCodeResponse(
	val item: ItemModel = ItemModel(),
	val codeData: ManagingEmailCodeResponseCodeData = ManagingEmailCodeResponseCodeData(),
)

@Serializable
data class ManagingEmailCodeResponseCodeData(
	val code: String = "",
	val date: Double = 0.0,
	val textPlain: String = "",
)

@Serializable
data class ManagingGetLetters2Params(
    /** Email login data (email:password format). Required if both *email* and *password* are not provided. */
	@SerialName("email_password")
	val emailPassword: String? = null,
    /** Email. Required if *email_password* is not provided. */
	val email: String? = null,
    /** Password. Required if *email_password* is not provided. */
	val password: String? = null,
    /** Number of letters to return. */
	val limit: Long? = null,
)

@Serializable
data class ManagingGetLetters2Response(
	val email: String = "",
	val letters: List<ManagingGetLetters2ResponseLetters> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ManagingGetLetters2ResponseLetters(
	val textHtml: String = "",
	val textPlain: String = "",
	val from: String = "",
	val date: Double = 0.0,
)

@Serializable
data class ManagingSteamGetMafileResponse(
	val maFile: ManagingSteamGetMafileResponseMaFile = ManagingSteamGetMafileResponseMaFile(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ManagingSteamGetMafileResponseMaFileSession(
	val SessionID: String = "",
	val AccessToken: String = "",
	val RefreshToken: String = "",
	val SteamID: String = "",
	val SteamLoginSecure: String = "",
)

@Serializable
data class ManagingSteamGetMafileResponseMaFile(
	@SerialName("shared_secret")
	val sharedSecret: String = "",
	@SerialName("serial_number")
	val serialNumber: Double = 0.0,
	@SerialName("revocation_code")
	val revocationCode: String = "",
	val uri: String = "",
	@SerialName("account_name")
	val accountName: String = "",
	@SerialName("token_gid")
	val tokenGid: String = "",
	@SerialName("identity_secret")
	val identitySecret: String = "",
	val secret_1: String = "",
	@SerialName("device_id")
	val deviceId: String = "",
	@SerialName("fully_enrolled")
	val fullyEnrolled: Boolean = false,
	val Session: ManagingSteamGetMafileResponseMaFileSession = ManagingSteamGetMafileResponseMaFileSession(),
)

@Serializable
data class ManagingSteamAddMafileResponse(
	val status: String = "",
	val message: String = "",
	val item: ItemModel = ItemModel(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ManagingSteamRemoveMafileResponse(
	val status: String = "",
	val message: String = "",
	val item: ItemModel = ItemModel(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ManagingSteamMafileCodeResponse(
	val item: ItemModel = ItemModel(),
	val codeData: ManagingSteamMafileCodeResponseCodeData = ManagingSteamMafileCodeResponseCodeData(),
)

@Serializable
data class ManagingSteamMafileCodeResponseCodeData(
	val code: String = "",
	val date: Double = 0.0,
	val textPlain: String = "",
)

@Serializable
data class ManagingSteamSDABody(
    /** Confirmation id. (Required along with nonce if you want to confirm action). */
	val id: Long? = null,
    /** Confirmation nonce. (Required along with id if you want to confirm action). */
	val nonce: Long? = null,
)

@Serializable
data class ManagingSteamSDAResponse(
	val status: String = "",
	val message: String = "",
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ManagingTelegramCodeResponse(
	val item: ItemModel = ItemModel(),
	val codes: ManagingTelegramCodeResponseCodes = ManagingTelegramCodeResponseCodes(),
)

@Serializable
data class ManagingTelegramCodeResponseCodes(
	val code: String? = null,
	val date: Double? = null,
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
    /** You voluntarily and with full awareness of your actions waive any claims regarding this account. */
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
	val message: String = "",
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ManagingChangePasswordBody(
    /** Cancel change password recommendation. It will be helpful, if you don't want to change password and get login data. */
	@SerialName("_cancel")
	val Cancel: Cancel? = null,
)

@Serializable
data class ManagingChangePasswordResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("new_password")
	val newPassword: String = "",
)

@Serializable
data class ManagingTempEmailPasswordResponse(
	val item: ManagingTempEmailPasswordResponseItem = ManagingTempEmailPasswordResponseItem(),
)

@Serializable
data class ManagingTempEmailPasswordResponseItem(
	val account: String = "",
)

@Serializable
data class ManagingTagBody(
    /** Tag ID. */
	@SerialName("tag_id")
	val tagId: Long,
)

@Serializable
data class ManagingTagResponse(
	val itemId: Double = 0.0,
	val tag: ManagingTagResponseTag = ManagingTagResponseTag(),
	val addedTagId: Double = 0.0,
	val deleteTags: List<Long> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ManagingTagResponseTag(
	@SerialName("tag_id")
	val tagId: Double = 0.0,
	val title: String = "",
	val isDefault: Boolean = false,
	val forOwnedAccountsOnly: Boolean = false,
	val bc: String = "",
)

@Serializable
data class ManagingUntagBody(
    /** Tag ID. */
	@SerialName("tag_id")
	val tagId: Long,
)

@Serializable
data class ManagingUntagResponse(
	val itemId: Double = 0.0,
	val tag: ManagingUntagResponseTag = ManagingUntagResponseTag(),
	val addedTagId: Double = 0.0,
	val deleteTags: List<Long> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ManagingUntagResponseTag(
	@SerialName("tag_id")
	val tagId: Double = 0.0,
	val title: String = "",
	val isDefault: Boolean = false,
	val forOwnedAccountsOnly: Boolean = false,
	val bc: String = "",
)

@Serializable
data class ManagingPublicTagBody(
    /** Tag ID. */
	@SerialName("tag_id")
	val tagId: Long,
)

@Serializable
data class ManagingPublicTagResponse(
	val itemId: Double = 0.0,
	val tag: ManagingPublicTagResponseTag = ManagingPublicTagResponseTag(),
	val addedTagId: Double = 0.0,
	val deleteTags: List<Long> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ManagingPublicTagResponseTag(
	@SerialName("tag_id")
	val tagId: Double = 0.0,
	val title: String = "",
	val isDefault: Boolean = false,
	val forOwnedAccountsOnly: Boolean = false,
	val bc: String = "",
)

@Serializable
data class ManagingPublicUntagBody(
    /** Tag ID. */
	@SerialName("tag_id")
	val tagId: Long,
)

@Serializable
data class ManagingPublicUntagResponse(
	val itemId: Double = 0.0,
	val tag: ManagingPublicUntagResponseTag = ManagingPublicUntagResponseTag(),
	val addedTagId: Double = 0.0,
	val deleteTags: List<Long> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ManagingPublicUntagResponseTag(
	@SerialName("tag_id")
	val tagId: Double = 0.0,
	val title: String = "",
	val isDefault: Boolean = false,
	val forOwnedAccountsOnly: Boolean = false,
	val bc: String = "",
)

@Serializable
data class ManagingFavoriteResponse(
	val status: String = "",
	val message: String = "",
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
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
    /** The username of the new account owner. */
	val username: String,
    /** Secret answer of your account. */
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
    /** Filter claims by their type. */
	val type: ProfileType? = null,
    /** Filter claims by their state. */
	@SerialName("claim_state")
	val claimState: ClaimState? = null,
)

@Serializable
data class ProfileClaimsResponse(
	val claims: List<ProfileClaimsResponseClaims> = emptyList(),
	val stats: ProfileClaimsResponseStats = ProfileClaimsResponseStats(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ProfileClaimsResponseClaimsAuthorLinks(
	val permalink: String = "",
	val detail: String = "",
	val avatar: String = "",
	@SerialName("avatar_big")
	val avatarBig: String = "",
	@SerialName("avatar_small")
	val avatarSmall: String = "",
	val followers: String = "",
	val followings: String = "",
	val ignore: String = "",
	val timeline: String = "",
)

@Serializable
data class ProfileClaimsResponseClaimsAuthorPermissions(
	val edit: Boolean = false,
	val follow: Boolean = false,
	val ignore: Boolean = false,
)

@Serializable
data class ProfileClaimsResponseClaimsAuthorFields(
	val id: String = "",
	val title: String = "",
	val description: String = "",
	val position: String = "",
	@SerialName("is_required")
	val isRequired: Boolean = false,
)

@Serializable
data class ProfileClaimsResponseClaimsAuthor(
	@SerialName("user_id")
	val userId: Double = 0.0,
	val username: String = "",
	@SerialName("username_html")
	val usernameHtml: String = "",
	@SerialName("user_message_count")
	val userMessageCount: Double = 0.0,
	@SerialName("user_register_date")
	val userRegisterDate: Double = 0.0,
	@SerialName("user_like_count")
	val userLikeCount: Double = 0.0,
	@SerialName("user_like2_count")
	val userLike2Count: Double = 0.0,
	@SerialName("contest_count")
	val contestCount: Double = 0.0,
	@SerialName("trophy_count")
	val trophyCount: Double = 0.0,
	@SerialName("custom_title")
	val customTitle: String = "",
	@SerialName("is_banned")
	val isBanned: Double = 0.0,
	@SerialName("user_title")
	val userTitle: String = "",
	@SerialName("user_is_valid")
	val userIsValid: Boolean = false,
	@SerialName("user_is_verified")
	val userIsVerified: Boolean = false,
	@SerialName("user_is_followed")
	val userIsFollowed: Boolean = false,
	@SerialName("user_last_seen_date")
	val userLastSeenDate: Double = 0.0,
	val links: ProfileClaimsResponseClaimsAuthorLinks = ProfileClaimsResponseClaimsAuthorLinks(),
	val permissions: ProfileClaimsResponseClaimsAuthorPermissions = ProfileClaimsResponseClaimsAuthorPermissions(),
	@SerialName("user_is_ignored")
	val userIsIgnored: Boolean = false,
	@SerialName("user_is_visitor")
	val userIsVisitor: Boolean = false,
	@SerialName("user_group_id")
	val userGroupId: Double = 0.0,
	@SerialName("ban_reason")
	val banReason: String = "",
	val fields: List<ProfileClaimsResponseClaimsAuthorFields> = emptyList(),
)

@Serializable
data class ProfileClaimsResponseClaims(
	@SerialName("thread_id")
	val threadId: Double = 0.0,
	@SerialName("claim_date")
	val claimDate: Double = 0.0,
	@SerialName("claim_state")
	val claimState: String = "",
	@SerialName("message_body")
	val messageBody: String = "",
	@SerialName("amount_formatted")
	val amountFormatted: String = "",
	val author: ProfileClaimsResponseClaimsAuthor = ProfileClaimsResponseClaimsAuthor(),
)

@Serializable
data class ProfileClaimsResponseStatsMarket(
	val total: Double = 0.0,
	val solved: Double = 0.0,
	val settled: Double = 0.0,
	val rejected: Double = 0.0,
)

@Serializable
data class ProfileClaimsResponseStatsNoMarket(
	val total: Double = 0.0,
	val solved: Double = 0.0,
	val settled: Double = 0.0,
	val rejected: Double = 0.0,
)

@Serializable
data class ProfileClaimsResponseStats(
	val market: ProfileClaimsResponseStatsMarket = ProfileClaimsResponseStatsMarket(),
	val noMarket: ProfileClaimsResponseStatsNoMarket = ProfileClaimsResponseStatsNoMarket(),
)

@Serializable
data class ProfileGetParams(
    /** List of hidden fields to include. */
	@SerialName("fields_include")
	val fieldsInclude: JsonElement? = null,
)

@Serializable
data class ProfileGetResponse(
	val user: UserModel = UserModel(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ProfileEditBody(
	val user: JsonObject? = null,
	val option: JsonObject? = null,
    /** Usernames who can transfer market accounts to you. Separate values with a comma. */
	@SerialName("allow_accept_accounts")
	val allowAcceptAccounts: List<String>? = null,
    /** Telegram api id. */
	@SerialName("telegram_api_id")
	val telegramApiId: String? = null,
    /** Telegram api hash. */
	@SerialName("telegram_api_hash")
	val telegramApiHash: String? = null,
    /** Telegram device model. */
	@SerialName("telegram_device_model")
	val telegramDeviceModel: String? = null,
    /** Telegram system version. */
	@SerialName("telegram_system_version")
	val telegramSystemVersion: String? = null,
    /** Telegram app version. */
	@SerialName("telegram_app_version")
	val telegramAppVersion: String? = null,
    /** Telegram lang pack. */
	@SerialName("telegram_lang_pack")
	val telegramLangPack: String? = null,
    /** Telegram lang code. */
	@SerialName("telegram_lang_code")
	val telegramLangCode: String? = null,
    /** Telegram system lang code. */
	@SerialName("telegram_system_lang_code")
	val telegramSystemLangCode: String? = null,
    /** Clear Telegram data. */
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
    /** Accounts category. */
	@SerialName("category_id")
	val categoryId: CategoryId? = null,
    /** The number of the page to display results from. */
	val page: Long? = null,
    /** Minimal price of account (Inclusive). */
	val pmin: Long? = null,
    /** Maximum price of account (Inclusive). */
	val pmax: Long? = null,
    /** The word or words contained in the account title. */
	val title: String? = null,
    /** Order by. */
	@SerialName("order_by")
	val orderBy: OrderBy? = null,
    /** List of tag ids (Tag list is available via GET /me). */
	@SerialName("tag_id[]")
	val tagId: List<Long>? = null,
    /** List of tag ids that won't be included (Tag list is available via GET /me). */
	@SerialName("not_tag_id[]")
	val notTagId: List<Long>? = null,
    /** List of tag ids (Tag list is available via GET /me). */
	@SerialName("public_tag_id[]")
	val publicTagId: List<Long>? = null,
    /** List of tag ids that won't be included (Tag list is available via GET /me). */
	@SerialName("not_public_tag_id[]")
	val notPublicTagId: List<Long>? = null,
    /** List of account origins. */
	@SerialName("origin[]")
	val origin: JsonElement? = null,
    /** List of account origins that won't be included. */
	@SerialName("not_origin[]")
	val notOrigin: JsonElement? = null,
    /** Search accounts of user. */
	@SerialName("user_id")
	val userId: Long? = null,
    /** Not sold before. */
	val nsb: Boolean? = null,
    /** Sold before. */
	val sb: Boolean? = null,
    /** Not sold by me before. */
	@SerialName("nsb_by_me")
	val nsbByMe: Boolean? = null,
    /** Sold by me before. */
	@SerialName("sb_by_me")
	val sbByMe: Boolean? = null,
    /** Currency in which the cost of the account will be searched. */
	val currency: Currency? = null,
    /** Has email login data. */
	@SerialName("email_login_data")
	val emailLoginData: Boolean? = null,
    /** Email provider. */
	@SerialName("email_provider[]")
	val emailProvider: JsonElement? = null,
    /** Email provider. */
	@SerialName("not_email_provider[]")
	val notEmailProvider: NotEmailProvider? = null,
    /** Parse same item ids. */
	@SerialName("parse_same_item_ids")
	val parseSameItemIds: Boolean? = null,
)

@Serializable
data class CartGetResponse(
	val items: List<ItemFromListModel> = emptyList(),
	val totalItems: Double = 0.0,
	val totalItemsPrice: JsonElement = JsonNull,
	val hasNextPage: Boolean = false,
	val perPage: Double = 0.0,
	val page: Double = 0.0,
	val searchUrl: String = "",
	val stickyItems: List<ItemFromListModel> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class CartAddBody(
    /** Item id. */
	@SerialName("item_id")
	val itemId: Long,
)

@Serializable
data class CartAddResponse(
	val success: Boolean = false,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class CartDeleteBody(
    /** Item id. */
	@SerialName("item_id")
	val itemId: Long? = null,
)

@Serializable
data class CartDeleteResponse(
	val success: Boolean = false,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

// ─── PurchasingApi Types ────────────────────────────────────────

@Serializable
data class PurchasingFastBuyBody(
    /** Current price of account in your currency. */
	val price: Double? = null,
    /** Balance ID that will be used to purchase specified item. */
	@SerialName("balance_id")
	val balanceId: Long? = null,
)

@Serializable
data class PurchasingFastBuyResponse(
	val status: String = "",
	val item: PurchasingFastBuyResponseItem = PurchasingFastBuyResponseItem(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class PurchasingFastBuyResponseItemGuarantee(
	val duration: Double = 0.0,
	val `class`: String = "",
	val durationPhrase: String = "",
	val endDate: Double = 0.0,
	val active: Boolean = false,
	val cancelled: Boolean = false,
	val remainingTime: Double = 0.0,
	val remainingTimePhrase: String = "",
)

@Serializable
data class PurchasingFastBuyResponseItemLoginData(
	val raw: String = "",
	val encodedRaw: String = "",
	val login: String = "",
	val password: String = "",
	val encodedPassword: String = "",
	val oldPassword: String = "",
	val encodedOldPassword: JsonElement = JsonNull,
)

@Serializable
data class PurchasingFastBuyResponseItemEmailLoginData(
	val raw: String = "",
	val encodedRaw: String = "",
	val login: String = "",
	val password: String = "",
	val encodedPassword: String = "",
	val oldPassword: String = "",
	val encodedOldPassword: String = "",
)

@Serializable
data class PurchasingFastBuyResponseItemBuyer(
	@SerialName("user_id")
	val userId: Double = 0.0,
	@SerialName("operation_date")
	val operationDate: Double = 0.0,
	val visitorIsBuyer: Boolean = false,
	val username: String = "",
	@SerialName("is_banned")
	val isBanned: Double = 0.0,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Double = 0.0,
	@SerialName("uniq_username_css")
	val uniqUsernameCss: String = "",
	@SerialName("user_group_id")
	val userGroupId: Double = 0.0,
)

@Serializable
data class PurchasingFastBuyResponseItemAccountLinks(
	val link: String = "",
	val text: String = "",
	val iconClass: String = "",
)

@Serializable
data class PurchasingFastBuyResponseItemExtraPrices(
	val currency: String = "",
	val price: String = "",
)

@Serializable
data class PurchasingFastBuyResponseItemBumpSettings(
	val canBumpItem: Boolean = false,
	val canBumpItemGlobally: Boolean = false,
	val shortErrorPhrase: JsonElement = JsonNull,
	val errorPhrase: JsonElement = JsonNull,
)

@Serializable
data class PurchasingFastBuyResponseItemSeller(
	@SerialName("user_id")
	val userId: Double = 0.0,
	val username: String = "",
	@SerialName("avatar_date")
	val avatarDate: Double = 0.0,
	@SerialName("is_banned")
	val isBanned: Double = 0.0,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Double = 0.0,
	@SerialName("joined_date")
	val joinedDate: Double = 0.0,
	@SerialName("sold_items_count")
	val soldItemsCount: Double = 0.0,
	@SerialName("active_items_count")
	val activeItemsCount: Double = 0.0,
	@SerialName("restore_data")
	val restoreData: String = "",
	@SerialName("restore_percents")
	val restorePercents: Double = 0.0,
	val isOnline: Boolean = false,
)

@Serializable
data class PurchasingFastBuyResponseItem(
	@SerialName("item_id")
	val itemId: Double = 0.0,
	@SerialName("item_state")
	val itemState: String = "",
	@SerialName("category_id")
	val categoryId: Double = 0.0,
	@SerialName("published_date")
	val publishedDate: Double = 0.0,
	val title: String = "",
	val description: String = "",
	val price: Double = 0.0,
	@SerialName("update_stat_date")
	val updateStatDate: Double = 0.0,
	@SerialName("refreshed_date")
	val refreshedDate: Double = 0.0,
	@SerialName("edit_date")
	val editDate: Double = 0.0,
	val login: String = "",
	@SerialName("temp_email")
	val tempEmail: String = "",
	@SerialName("view_count")
	val viewCount: Double = 0.0,
	@SerialName("is_sticky")
	val isSticky: Double = 0.0,
	val information: String = "",
	@SerialName("item_origin")
	val itemOrigin: String = "",
	@SerialName("extended_guarantee")
	val extendedGuarantee: Double = 0.0,
	val nsb: Double = 0.0,
	@SerialName("allow_ask_discount")
	val allowAskDiscount: Double = 0.0,
	@SerialName("title_en")
	val titleEn: String = "",
	@SerialName("description_en")
	val descriptionEn: String = "",
	@SerialName("information_en")
	val informationEn: String = "",
	@SerialName("email_type")
	val emailType: String = "",
	@SerialName("email_provider")
	val emailProvider: String = "",
	@SerialName("item_domain")
	val itemDomain: String = "",
	@SerialName("resale_item_origin")
	val resaleItemOrigin: String = "",
	@SerialName("user_allow_ask_discount")
	val userAllowAskDiscount: Double = 0.0,
	@SerialName("max_discount_percent")
	val maxDiscountPercent: Double = 0.0,
	@SerialName("market_custom_title")
	val marketCustomTitle: String = "",
	@SerialName("feedback_data")
	val feedbackData: String = "",
	@SerialName("buyer_avatar_date")
	val buyerAvatarDate: Double = 0.0,
	@SerialName("buyer_user_group_id")
	val buyerUserGroupId: Double = 0.0,
	val priceWithSellerFee: Double = 0.0,
	val guarantee: PurchasingFastBuyResponseItemGuarantee = PurchasingFastBuyResponseItemGuarantee(),
	val canViewLoginData: Boolean = false,
	val canUpdateItemStats: Boolean = false,
	val canReportItem: Boolean = false,
	val loginData: PurchasingFastBuyResponseItemLoginData = PurchasingFastBuyResponseItemLoginData(),
	val canViewEmailLoginData: Boolean = false,
	val emailLoginData: PurchasingFastBuyResponseItemEmailLoginData = PurchasingFastBuyResponseItemEmailLoginData(),
	val showGetEmailCodeButton: Boolean = false,
	val getEmailCodeDisplayLogin: String = "",
	val buyer: PurchasingFastBuyResponseItemBuyer = PurchasingFastBuyResponseItemBuyer(),
	val isPersonalAccount: Boolean = false,
	@SerialName("sold_items_category_count")
	val soldItemsCategoryCount: Double = 0.0,
	@SerialName("restore_items_category_count")
	val restoreItemsCategoryCount: Double = 0.0,
	@SerialName("rub_price")
	val rubPrice: Double = 0.0,
	@SerialName("price_currency")
	val priceCurrency: String = "",
	val canValidateAccount: Boolean = false,
	val canResellItemAfterPurchase: Boolean = false,
	@SerialName("account_last_activity")
	val accountLastActivity: Double = 0.0,
	val displayConvertedBalance: Boolean = false,
	val canViewAccountLink: Boolean = false,
	val accountLinks: List<PurchasingFastBuyResponseItemAccountLinks> = emptyList(),
	val accountLink: String = "",
	val emailLoginUrl: String = "",
	val canChangePassword: Boolean = false,
	val itemOriginPhrase: String = "",
	val visitorIsAuthor: Boolean = false,
	val canAskDiscount: Boolean = false,
	val tags: JsonElement = JsonNull,
	val customFields: List<JsonElement> = emptyList(),
	val externalAuth: List<JsonElement> = emptyList(),
	val isTrusted: Boolean = false,
	val isBirthdayToday: Boolean = false,
	val isIgnored: Boolean = false,
	val deposit: Double = 0.0,
	val extraPrices: List<PurchasingFastBuyResponseItemExtraPrices> = emptyList(),
	val canViewAccountLoginAndTempEmail: Boolean = false,
	val bumpSettings: PurchasingFastBuyResponseItemBumpSettings = PurchasingFastBuyResponseItemBumpSettings(),
	val canCheckGuarantee: Boolean = false,
	val needToRequireVideoToViewLoginData: Boolean = false,
	val descriptionHtml: String = "",
	val descriptionEnHtml: String = "",
	val descriptionPlain: String = "",
	val descriptionEnPlain: String = "",
	val seller: PurchasingFastBuyResponseItemSeller = PurchasingFastBuyResponseItemSeller(),
)

@Serializable
data class PurchasingCheckResponse(
	val status: String = "",
	val item: PurchasingCheckResponseItem = PurchasingCheckResponseItem(),
	val requireVideoRecording: Boolean = false,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class PurchasingCheckResponseItemGuarantee(
	val duration: Double = 0.0,
	val `class`: String = "",
	val durationPhrase: String = "",
	val endDate: JsonElement = JsonNull,
	val active: JsonElement = JsonNull,
	val cancelled: JsonElement = JsonNull,
	val remainingTime: JsonElement = JsonNull,
)

@Serializable
data class PurchasingCheckResponseItemAccountLinks(
	val link: String = "",
	val text: String = "",
	val iconClass: String = "",
)

@Serializable
data class PurchasingCheckResponseItemExtraPrices(
	val currency: String = "",
	val price: String = "",
)

@Serializable
data class PurchasingCheckResponseItemBumpSettings(
	val canBumpItem: Boolean = false,
	val canBumpItemGlobally: Boolean = false,
	val shortErrorPhrase: JsonElement = JsonNull,
	val errorPhrase: JsonElement = JsonNull,
)

@Serializable
data class PurchasingCheckResponseItemSeller(
	@SerialName("user_id")
	val userId: Double = 0.0,
	val username: String = "",
	@SerialName("avatar_date")
	val avatarDate: Double = 0.0,
	@SerialName("is_banned")
	val isBanned: Double = 0.0,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Double = 0.0,
	@SerialName("joined_date")
	val joinedDate: Double = 0.0,
	@SerialName("sold_items_count")
	val soldItemsCount: Double = 0.0,
	@SerialName("active_items_count")
	val activeItemsCount: Double = 0.0,
	@SerialName("restore_data")
	val restoreData: String = "",
	@SerialName("restore_percents")
	val restorePercents: JsonElement = JsonNull,
	val isOnline: Boolean = false,
)

@Serializable
data class PurchasingCheckResponseItem(
	@SerialName("item_id")
	val itemId: Double = 0.0,
	@SerialName("item_state")
	val itemState: String = "",
	@SerialName("category_id")
	val categoryId: Double = 0.0,
	@SerialName("published_date")
	val publishedDate: Double = 0.0,
	val title: String = "",
	val description: String = "",
	val price: Double = 0.0,
	@SerialName("update_stat_date")
	val updateStatDate: Double = 0.0,
	@SerialName("refreshed_date")
	val refreshedDate: Double = 0.0,
	@SerialName("edit_date")
	val editDate: Double = 0.0,
	@SerialName("view_count")
	val viewCount: Double = 0.0,
	@SerialName("is_sticky")
	val isSticky: Double = 0.0,
	@SerialName("item_origin")
	val itemOrigin: String = "",
	@SerialName("extended_guarantee")
	val extendedGuarantee: Double = 0.0,
	val nsb: Double = 0.0,
	@SerialName("allow_ask_discount")
	val allowAskDiscount: Double = 0.0,
	@SerialName("title_en")
	val titleEn: String = "",
	@SerialName("description_en")
	val descriptionEn: String = "",
	@SerialName("email_type")
	val emailType: String = "",
	@SerialName("email_provider")
	val emailProvider: String = "",
	@SerialName("item_domain")
	val itemDomain: String = "",
	@SerialName("resale_item_origin")
	val resaleItemOrigin: String = "",
	@SerialName("user_allow_ask_discount")
	val userAllowAskDiscount: Double = 0.0,
	@SerialName("max_discount_percent")
	val maxDiscountPercent: Double = 0.0,
	@SerialName("market_custom_title")
	val marketCustomTitle: String = "",
	@SerialName("feedback_data")
	val feedbackData: String = "",
	@SerialName("category_title")
	val categoryTitle: String = "",
	@SerialName("category_url")
	val categoryUrl: String = "",
	@SerialName("require_temp_email")
	val requireTempEmail: Double = 0.0,
	@SerialName("available_temp_email")
	val availableTempEmail: Double = 0.0,
	@SerialName("check_button_enabled")
	val checkButtonEnabled: Double = 0.0,
	@SerialName("checker_enabled")
	val checkerEnabled: Double = 0.0,
	@SerialName("buy_without_validation")
	val buyWithoutValidation: Double = 0.0,
	@SerialName("has_guarantee")
	val hasGuarantee: Double = 0.0,
	@SerialName("require_video_recording")
	val requireVideoRecording: Double = 0.0,
	@SerialName("can_be_resold")
	val canBeResold: Double = 0.0,
	@SerialName("login_type")
	val loginType: String = "",
	@SerialName("require_email_login_data")
	val requireEmailLoginData: Double = 0.0,
	@SerialName("category_prefix_id")
	val categoryPrefixId: Double = 0.0,
	@SerialName("ask_user_id")
	val askUserId: JsonElement = JsonNull,
	@SerialName("ask_item_id")
	val askItemId: JsonElement = JsonNull,
	@SerialName("ask_date")
	val askDate: JsonElement = JsonNull,
	@SerialName("discount_price")
	val discountPrice: JsonElement = JsonNull,
	@SerialName("discount_accepted")
	val discountAccepted: JsonElement = JsonNull,
	@SerialName("user_alerted")
	val userAlerted: JsonElement = JsonNull,
	val message: JsonElement = JsonNull,
	@SerialName("min_price")
	val minPrice: Double = 0.0,
	val priceWithSellerFee: Double = 0.0,
	val guarantee: PurchasingCheckResponseItemGuarantee = PurchasingCheckResponseItemGuarantee(),
	val canViewLoginData: Boolean = false,
	val canUpdateItemStats: Boolean = false,
	val canReportItem: Boolean = false,
	val canViewEmailLoginData: Boolean = false,
	val showGetEmailCodeButton: Boolean = false,
	val isPersonalAccount: Boolean = false,
	@SerialName("rub_price")
	val rubPrice: Double = 0.0,
	@SerialName("price_currency")
	val priceCurrency: String = "",
	val canValidateAccount: Boolean = false,
	val canResellItemAfterPurchase: Boolean = false,
	val isSmallExf: Boolean = false,
	@SerialName("account_last_activity")
	val accountLastActivity: Double = 0.0,
	val canViewAccountLink: Boolean = false,
	val accountLinks: List<PurchasingCheckResponseItemAccountLinks> = emptyList(),
	val accountLink: String = "",
	val emailLoginUrl: String = "",
	val canChangePassword: Boolean = false,
	val itemOriginPhrase: String = "",
	val visitorIsAuthor: Boolean = false,
	val canAskDiscount: Boolean = false,
	val tags: List<JsonElement> = emptyList(),
	val customFields: List<JsonElement> = emptyList(),
	val externalAuth: List<JsonElement> = emptyList(),
	val isTrusted: Boolean = false,
	val isBirthdayToday: Boolean = false,
	val isIgnored: Boolean = false,
	val deposit: Double = 0.0,
	val extraPrices: List<PurchasingCheckResponseItemExtraPrices> = emptyList(),
	val canViewAccountLoginAndTempEmail: Boolean = false,
	val bumpSettings: PurchasingCheckResponseItemBumpSettings = PurchasingCheckResponseItemBumpSettings(),
	val canCheckGuarantee: Boolean = false,
	val needToRequireVideoToViewLoginData: Boolean = false,
	val descriptionHtml: String = "",
	val descriptionEnHtml: String = "",
	val descriptionPlain: String = "",
	val descriptionEnPlain: String = "",
	val seller: PurchasingCheckResponseItemSeller = PurchasingCheckResponseItemSeller(),
)

@Serializable
data class PurchasingConfirmBody(
    /** Current price of account in your currency. */
	val price: Long? = null,
    /** Balance ID that will be used to purchase specified item. */
	@SerialName("balance_id")
	val balanceId: Long? = null,
)

@Serializable
data class PurchasingConfirmResponse(
	val status: String? = null,
	val item: PurchasingConfirmResponseItem = PurchasingConfirmResponseItem(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class PurchasingConfirmResponseItemLoginData(
	val raw: String = "",
	val encodedRaw: String = "",
	val login: String = "",
	val password: String = "",
	val encodedPassword: String = "",
	val oldPassword: String = "",
	val encodedOldPassword: String = "",
	val adviceToChangePassword: Boolean = false,
)

@Serializable
data class PurchasingConfirmResponseItem(
	val loginData: PurchasingConfirmResponseItemLoginData = PurchasingConfirmResponseItemLoginData(),
)

@Serializable
data class PurchasingDiscountRequestBody(
    /** Requested discounted price. */
	@SerialName("discount_price")
	val discountPrice: Double,
    /** Message to the seller. */
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
	val discounts: List<DiscountModel> = emptyList(),
	val total: Double = 0.0,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class CustomDiscountsCreateBody(
    /** User ID. */
	@SerialName("user_id")
	val userId: Long,
    /** Accounts category. */
	@SerialName("category_id")
	val categoryId: CategoryId,
    /** Discount percent to apply. */
	@SerialName("discount_percent")
	val discountPercent: Double,
    /** Minimum accounts price for which the discount applies. */
	@SerialName("min_price")
	val minPrice: Double,
    /** Maximum accounts price for which the discount applies. */
	@SerialName("max_price")
	val maxPrice: Double? = null,
	val currency: Currency? = null,
)

@Serializable
data class CustomDiscountsCreateResponse(
	val discount: DiscountModel = DiscountModel(),
	val total: Double = 0.0,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class CustomDiscountsEditBody(
    /** ID of the discount to edit. */
	@SerialName("discount_id")
	val discountId: Long,
    /** Discount percent to apply. */
	@SerialName("discount_percent")
	val discountPercent: Double? = null,
    /** Minimum price for which the discount applies. */
	@SerialName("min_price")
	val minPrice: Double? = null,
    /** Maximum price for which the discount applies. */
	@SerialName("max_price")
	val maxPrice: Double? = null,
)

@Serializable
data class CustomDiscountsEditResponse(
	val discounts: List<DiscountModel> = emptyList(),
	val total: Double = 0.0,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class CustomDiscountsDeleteBody(
    /** ID of the discount to delete. */
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
    /** Current price of account in your currency. */
	val price: Double,
    /** Accounts category. */
	@SerialName("category_id")
	val categoryId: CategoryId,
	val currency: Currency,
    /** Account origin. Where did you get it from. */
	@SerialName("item_origin")
	val itemOrigin: PublishingItemOrigin,
    /** Title of account. If title specified and title_en is empty, title_en will be automatically translated to English language. */
	val title: String? = null,
    /** English title of account. If title_en specified and title is empty, title will be automatically translated to Russian language. */
	@SerialName("title_en")
	val titleEn: String? = null,
    /** Guarantee type. */
	@SerialName("extended_guarantee")
	val extendedGuarantee: ExtendedGuarantee? = null,
    /** Allow users to ask discount for this account. */
	@SerialName("allow_ask_discount")
	val allowAskDiscount: Boolean? = null,
    /** Proxy id that will be used to check account. */
	@SerialName("proxy_id")
	val proxyId: Long? = null,
    /** Set this parameter to true so that the Market will take a random proxy from its pool for each of your requests. Otherwise, if this parameter is set to false or not set, the Market will take a specific proxy from its pool, which is predefined for each item. > This parameter only works with proxies from the Market pool. If you want to use your own proxies, use the proxy_id or extra[proxy] parameter. */
	@SerialName("random_proxy")
	val randomProxy: Boolean? = null,
    /** Account public description. */
	val description: String? = null,
    /** Account private information (visible only for buyer). */
	val information: String? = null,
    /** Account login (or email). */
	val login: String? = null,
    /** Account password. */
	val password: String? = null,
    /** Account login data (login:password format). */
	@SerialName("login_password")
	val loginPassword: String? = null,
    /** Required if a category is one of list of Required email login data categories. */
	@SerialName("has_email_login_data")
	val hasEmailLoginData: Boolean? = null,
    /** Required if a category is one of list of Required email login data categories. Email login data (email:password format). */
	@SerialName("email_login_data")
	val emailLoginData: String? = null,
    /** Email type. */
	@SerialName("email_type")
	val emailType: EmailType? = null,
	val extra: JsonObject? = null,
)

@Serializable
data class PublishingFastSellResponse(
	val item: ItemModel = ItemModel(),
	val itemLink: String = "",
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class PublishingAddBody(
    /** Current price of account in your currency. */
	val price: Double,
    /** Accounts category. */
	@SerialName("category_id")
	val categoryId: CategoryId,
	val currency: Currency,
    /** Account origin. Where did you get it from. */
	@SerialName("item_origin")
	val itemOrigin: PublishingItemOrigin,
    /** Title of account. If title specified and title_en is empty, title_en will be automatically translated to English language. */
	val title: String? = null,
    /** English title of account. If title_en specified and title is empty, title will be automatically translated to Russian language. */
	@SerialName("title_en")
	val titleEn: String? = null,
    /** Guarantee type. */
	@SerialName("extended_guarantee")
	val extendedGuarantee: ExtendedGuarantee? = null,
    /** Account public description. */
	val description: String? = null,
    /** Account private information (visible only for buyer). */
	val information: String? = null,
    /** Get temporary email if not required by category. Available for Supercell, Fortnite and Epic Games categories. */
	val forceTempEmail: Boolean? = null,
    /** Put item id, if you are trying to resell item. This is useful to pass temporary email from reselling item to new item. You will get same temporary email from reselling account. */
	@SerialName("resell_item_id")
	val resellItemId: Long? = null,
    /** Required if a category is one of list of Required email login data categories. */
	@SerialName("has_email_login_data")
	val hasEmailLoginData: Boolean? = null,
    /** Required if a category is one of list of Required email login data categories. Email login data (email:password format). */
	@SerialName("email_login_data")
	val emailLoginData: String? = null,
    /** Email type. */
	@SerialName("email_type")
	val emailType: EmailType? = null,
    /** Allow users to ask discount for this account. */
	@SerialName("allow_ask_discount")
	val allowAskDiscount: Boolean? = null,
    /** Proxy id that will be used to check account. */
	@SerialName("proxy_id")
	val proxyId: Long? = null,
    /** Set this parameter to true so that the Market will take a random proxy from its pool for each of your requests. Otherwise, if this parameter is set to false or not set, the Market will take a specific proxy from its pool, which is predefined for each item. > This parameter only works with proxies from the Market pool. If you want to use your own proxies, use the proxy_id or extra[proxy] parameter. */
	@SerialName("random_proxy")
	val randomProxy: Boolean? = null,
)

@Serializable
data class PublishingAddResponse(
	val status: String = "",
	val item: ItemModel = ItemModel(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class PublishingCheckBody(
    /** Put if you are trying to resell an account. */
	@SerialName("resell_item_id")
	val resellItemId: Long? = null,
    /** Set this parameter to true so that the Market will take a random proxy from its pool for each of your requests. Otherwise, if this parameter is set to false or not set, the Market will take a specific proxy from its pool, which is predefined for each item. > This parameter only works with proxies from the Market pool. If you want to use your own proxies, use the proxy_id or extra[proxy] parameter. */
	@SerialName("random_proxy")
	val randomProxy: Boolean? = null,
    /** Account login (or email). */
	val login: String? = null,
    /** Account password. */
	val password: String? = null,
    /** Account login data (login:password format). */
	@SerialName("login_password")
	val loginPassword: String? = null,
    /** Required if a category is one of list of Required email login data categories. */
	@SerialName("has_email_login_data")
	val hasEmailLoginData: Boolean? = null,
    /** Required if a category is one of list of Required email login data categories. Email login data (email:password format). */
	@SerialName("email_login_data")
	val emailLoginData: String? = null,
    /** Email type. */
	@SerialName("email_type")
	val emailType: EmailType? = null,
	val extra: JsonObject? = null,
)

@Serializable
data class PublishingCheckResponse(
	val status: String = "",
	val item: PublishingCheckResponseItem = PublishingCheckResponseItem(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class PublishingCheckResponseItemGuarantee(
	val duration: Double = 0.0,
	val `class`: String = "",
	val durationPhrase: String = "",
	val endDate: Double = 0.0,
	val active: Boolean = false,
	val cancelled: Boolean = false,
	val remainingTime: Double = 0.0,
	val remainingTimePhrase: String = "",
)

@Serializable
data class PublishingCheckResponseItemLoginData(
	val raw: String = "",
	val encodedRaw: String = "",
	val login: String = "",
	val password: String = "",
	val encodedPassword: String = "",
	val oldPassword: String = "",
	val encodedOldPassword: JsonElement = JsonNull,
)

@Serializable
data class PublishingCheckResponseItemEmailLoginData(
	val raw: String = "",
	val encodedRaw: String = "",
	val login: String = "",
	val password: String = "",
	val encodedPassword: String = "",
	val oldPassword: String = "",
	val encodedOldPassword: String = "",
)

@Serializable
data class PublishingCheckResponseItemBuyer(
	@SerialName("user_id")
	val userId: Double = 0.0,
	@SerialName("operation_date")
	val operationDate: Double = 0.0,
	val visitorIsBuyer: Boolean = false,
	val username: String = "",
	@SerialName("is_banned")
	val isBanned: Double = 0.0,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Double = 0.0,
	@SerialName("uniq_username_css")
	val uniqUsernameCss: String = "",
	@SerialName("user_group_id")
	val userGroupId: Double = 0.0,
)

@Serializable
data class PublishingCheckResponseItemAccountLinks(
	val link: String = "",
	val text: String = "",
	val iconClass: String = "",
)

@Serializable
data class PublishingCheckResponseItemExtraPrices(
	val currency: String = "",
	val price: String = "",
)

@Serializable
data class PublishingCheckResponseItemBumpSettings(
	val canBumpItem: Boolean = false,
	val canBumpItemGlobally: Boolean = false,
	val shortErrorPhrase: JsonElement = JsonNull,
	val errorPhrase: JsonElement = JsonNull,
)

@Serializable
data class PublishingCheckResponseItemSeller(
	@SerialName("user_id")
	val userId: Double = 0.0,
	val username: String = "",
	@SerialName("avatar_date")
	val avatarDate: Double = 0.0,
	@SerialName("is_banned")
	val isBanned: Double = 0.0,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Double = 0.0,
	@SerialName("joined_date")
	val joinedDate: Double = 0.0,
	@SerialName("sold_items_count")
	val soldItemsCount: Double = 0.0,
	@SerialName("active_items_count")
	val activeItemsCount: Double = 0.0,
	@SerialName("restore_data")
	val restoreData: String = "",
	@SerialName("restore_percents")
	val restorePercents: Double = 0.0,
	val isOnline: Boolean = false,
)

@Serializable
data class PublishingCheckResponseItem(
	@SerialName("item_id")
	val itemId: Double = 0.0,
	@SerialName("item_state")
	val itemState: String = "",
	@SerialName("category_id")
	val categoryId: Double = 0.0,
	@SerialName("published_date")
	val publishedDate: Double = 0.0,
	val title: String = "",
	val description: String = "",
	val price: Double = 0.0,
	@SerialName("update_stat_date")
	val updateStatDate: Double = 0.0,
	@SerialName("refreshed_date")
	val refreshedDate: Double = 0.0,
	@SerialName("edit_date")
	val editDate: Double = 0.0,
	val login: String = "",
	@SerialName("temp_email")
	val tempEmail: String = "",
	@SerialName("view_count")
	val viewCount: Double = 0.0,
	@SerialName("is_sticky")
	val isSticky: Double = 0.0,
	val information: String = "",
	@SerialName("item_origin")
	val itemOrigin: String = "",
	@SerialName("extended_guarantee")
	val extendedGuarantee: Double = 0.0,
	val nsb: Double = 0.0,
	@SerialName("allow_ask_discount")
	val allowAskDiscount: Double = 0.0,
	@SerialName("title_en")
	val titleEn: String = "",
	@SerialName("description_en")
	val descriptionEn: String = "",
	@SerialName("information_en")
	val informationEn: String = "",
	@SerialName("email_type")
	val emailType: String = "",
	@SerialName("email_provider")
	val emailProvider: String = "",
	@SerialName("item_domain")
	val itemDomain: String = "",
	@SerialName("resale_item_origin")
	val resaleItemOrigin: String = "",
	@SerialName("user_allow_ask_discount")
	val userAllowAskDiscount: Double = 0.0,
	@SerialName("max_discount_percent")
	val maxDiscountPercent: Double = 0.0,
	@SerialName("market_custom_title")
	val marketCustomTitle: String = "",
	@SerialName("feedback_data")
	val feedbackData: String = "",
	@SerialName("buyer_avatar_date")
	val buyerAvatarDate: Double = 0.0,
	@SerialName("buyer_user_group_id")
	val buyerUserGroupId: Double = 0.0,
	val priceWithSellerFee: Double = 0.0,
	val guarantee: PublishingCheckResponseItemGuarantee = PublishingCheckResponseItemGuarantee(),
	val canViewLoginData: Boolean = false,
	val canUpdateItemStats: Boolean = false,
	val canReportItem: Boolean = false,
	val loginData: PublishingCheckResponseItemLoginData = PublishingCheckResponseItemLoginData(),
	val canViewEmailLoginData: Boolean = false,
	val emailLoginData: PublishingCheckResponseItemEmailLoginData = PublishingCheckResponseItemEmailLoginData(),
	val showGetEmailCodeButton: Boolean = false,
	val getEmailCodeDisplayLogin: String = "",
	val buyer: PublishingCheckResponseItemBuyer = PublishingCheckResponseItemBuyer(),
	val isPersonalAccount: Boolean = false,
	@SerialName("sold_items_category_count")
	val soldItemsCategoryCount: Double = 0.0,
	@SerialName("restore_items_category_count")
	val restoreItemsCategoryCount: Double = 0.0,
	@SerialName("rub_price")
	val rubPrice: Double = 0.0,
	@SerialName("price_currency")
	val priceCurrency: String = "",
	val canValidateAccount: Boolean = false,
	val canResellItemAfterPurchase: Boolean = false,
	@SerialName("account_last_activity")
	val accountLastActivity: Double = 0.0,
	val displayConvertedBalance: Boolean = false,
	val canViewAccountLink: Boolean = false,
	val accountLinks: List<PublishingCheckResponseItemAccountLinks> = emptyList(),
	val accountLink: String = "",
	val emailLoginUrl: String = "",
	val canChangePassword: Boolean = false,
	val itemOriginPhrase: String = "",
	val visitorIsAuthor: Boolean = false,
	val canAskDiscount: Boolean = false,
	val tags: JsonElement = JsonNull,
	val customFields: List<JsonElement> = emptyList(),
	val externalAuth: List<JsonElement> = emptyList(),
	val isTrusted: Boolean = false,
	val isBirthdayToday: Boolean = false,
	val isIgnored: Boolean = false,
	val deposit: Double = 0.0,
	val extraPrices: List<PublishingCheckResponseItemExtraPrices> = emptyList(),
	val canViewAccountLoginAndTempEmail: Boolean = false,
	val bumpSettings: PublishingCheckResponseItemBumpSettings = PublishingCheckResponseItemBumpSettings(),
	val canCheckGuarantee: Boolean = false,
	val needToRequireVideoToViewLoginData: Boolean = false,
	val descriptionHtml: String = "",
	val descriptionEnHtml: String = "",
	val descriptionPlain: String = "",
	val descriptionEnPlain: String = "",
	val seller: PublishingCheckResponseItemSeller = PublishingCheckResponseItemSeller(),
)

@Serializable
data class PublishingExternalBody(
    /** External account type. */
	val type: PublishingType,
    /** Account login data (login:password format). */
	val login: String? = null,
    /** Email login data (email:password format). */
	@SerialName("email_login_data")
	val emailLoginData: String? = null,
    /** Cookies. */
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
    /** Invoice ID. */
	@SerialName("invoice_id")
	val invoiceId: Long? = null,
    /** Payment ID. */
	@SerialName("payment_id")
	val paymentId: String? = null,
)

@Serializable
data class PaymentsInvoiceGetResponse(
	val invoice: InvoiceModel = InvoiceModel(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class PaymentsInvoiceCreateBody(
	val currency: Currency,
    /** Invoice amount. */
	val amount: Double,
    /** Payment ID in your system (must be unique within the merchant / invoices). */
	@SerialName("payment_id")
	val paymentId: String,
    /** Comment to the invoice. */
	val comment: String,
    /** URL to redirect to after successful payment. */
	@SerialName("url_success")
	val urlSuccess: String,
    /** Merchant ID. */
	@SerialName("merchant_id")
	val merchantId: Long,
    /** Callback url. */
	@SerialName("url_callback")
	val urlCallback: String? = null,
    /** Telegram User ID for which the invoice was created. */
	@SerialName("required_telegram_id")
	val requiredTelegramId: Long? = null,
    /** Telegram Username (including @) for which the invoice was created (if any). */
	@SerialName("required_telegram_username")
	val requiredTelegramUsername: String? = null,
    /** Invoice lifetime.. Default: 3600 */
	val lifetime: Double = 3600.0,
    /** Additional information for you. */
	@SerialName("additional_data")
	val additionalData: String? = null,
    /** Create a test invoice. */
	@SerialName("is_test")
	val isTest: Boolean? = null,
)

@Serializable
data class PaymentsInvoiceCreateResponse(
	val invoice: InvoiceModel = InvoiceModel(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class PaymentsInvoiceListParams(
    /** The number of the page to display results from. */
	val page: Long? = null,
    /** Currency of the created invoice. */
	val currency: Currency? = null,
    /** Status of the invoice. */
	val status: Status? = null,
    /** Invoice amount. */
	val amount: Double? = null,
    /** Merchant ID. */
	@SerialName("merchant_id")
	val merchantId: Long? = null,
)

@Serializable
data class PaymentsInvoiceListResponse(
	val invoices: List<InvoiceModel> = emptyList(),
	val count: Double = 0.0,
	val page: Double = 0.0,
	val perPage: Double = 0.0,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class PaymentsCurrencyResponse(
	val currencyList: PaymentsCurrencyResponseCurrencyList = PaymentsCurrencyResponseCurrencyList(),
	val lastUpdate: Double = 0.0,
	val visitorCurrency: String = "",
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListBTC(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListETH(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListBNB(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListBCH(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListXMR(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListSOL(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListLTC(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListDASH(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListTON(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListUSDT(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListMATIC(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListTRX(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListDOGE(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListKWD(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListGBP(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListCHF(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListEUR(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListUSD(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListSGD(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListCAD(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListAUD(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListNZD(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListBGN(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListGEL(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListILS(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListQAR(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListPEN(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListAED(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListSAR(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListPLN(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListMYR(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListRON(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListBRL(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListDKK(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListCNY(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListHKD(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListSEK(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListNOK(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListZAR(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListMXN(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListCZK(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListTWD(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListTHB(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListTRY(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListUAH(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListUYU(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListPHP(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListINR(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListRUB(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListRSD(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListJPY(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListHUF(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListKZT(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListCRC(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListCLP(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListARS(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListKRW(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListCOP(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListIDR(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListVND(
	val title: String = "",
	val rate: Double = 0.0,
	val formattedRate: String = "",
	val symbol: String = "",
)

@Serializable
data class PaymentsCurrencyResponseCurrencyList(
	val BTC: PaymentsCurrencyResponseCurrencyListBTC = PaymentsCurrencyResponseCurrencyListBTC(),
	val ETH: PaymentsCurrencyResponseCurrencyListETH = PaymentsCurrencyResponseCurrencyListETH(),
	val BNB: PaymentsCurrencyResponseCurrencyListBNB = PaymentsCurrencyResponseCurrencyListBNB(),
	val BCH: PaymentsCurrencyResponseCurrencyListBCH = PaymentsCurrencyResponseCurrencyListBCH(),
	val XMR: PaymentsCurrencyResponseCurrencyListXMR = PaymentsCurrencyResponseCurrencyListXMR(),
	val SOL: PaymentsCurrencyResponseCurrencyListSOL = PaymentsCurrencyResponseCurrencyListSOL(),
	val LTC: PaymentsCurrencyResponseCurrencyListLTC = PaymentsCurrencyResponseCurrencyListLTC(),
	val DASH: PaymentsCurrencyResponseCurrencyListDASH = PaymentsCurrencyResponseCurrencyListDASH(),
	val TON: PaymentsCurrencyResponseCurrencyListTON = PaymentsCurrencyResponseCurrencyListTON(),
	val USDT: PaymentsCurrencyResponseCurrencyListUSDT = PaymentsCurrencyResponseCurrencyListUSDT(),
	val MATIC: PaymentsCurrencyResponseCurrencyListMATIC = PaymentsCurrencyResponseCurrencyListMATIC(),
	val TRX: PaymentsCurrencyResponseCurrencyListTRX = PaymentsCurrencyResponseCurrencyListTRX(),
	val DOGE: PaymentsCurrencyResponseCurrencyListDOGE = PaymentsCurrencyResponseCurrencyListDOGE(),
	val KWD: PaymentsCurrencyResponseCurrencyListKWD = PaymentsCurrencyResponseCurrencyListKWD(),
	val GBP: PaymentsCurrencyResponseCurrencyListGBP = PaymentsCurrencyResponseCurrencyListGBP(),
	val CHF: PaymentsCurrencyResponseCurrencyListCHF = PaymentsCurrencyResponseCurrencyListCHF(),
	val EUR: PaymentsCurrencyResponseCurrencyListEUR = PaymentsCurrencyResponseCurrencyListEUR(),
	val USD: PaymentsCurrencyResponseCurrencyListUSD = PaymentsCurrencyResponseCurrencyListUSD(),
	val SGD: PaymentsCurrencyResponseCurrencyListSGD = PaymentsCurrencyResponseCurrencyListSGD(),
	val CAD: PaymentsCurrencyResponseCurrencyListCAD = PaymentsCurrencyResponseCurrencyListCAD(),
	val AUD: PaymentsCurrencyResponseCurrencyListAUD = PaymentsCurrencyResponseCurrencyListAUD(),
	val NZD: PaymentsCurrencyResponseCurrencyListNZD = PaymentsCurrencyResponseCurrencyListNZD(),
	val BGN: PaymentsCurrencyResponseCurrencyListBGN = PaymentsCurrencyResponseCurrencyListBGN(),
	val GEL: PaymentsCurrencyResponseCurrencyListGEL = PaymentsCurrencyResponseCurrencyListGEL(),
	val ILS: PaymentsCurrencyResponseCurrencyListILS = PaymentsCurrencyResponseCurrencyListILS(),
	val QAR: PaymentsCurrencyResponseCurrencyListQAR = PaymentsCurrencyResponseCurrencyListQAR(),
	val PEN: PaymentsCurrencyResponseCurrencyListPEN = PaymentsCurrencyResponseCurrencyListPEN(),
	val AED: PaymentsCurrencyResponseCurrencyListAED = PaymentsCurrencyResponseCurrencyListAED(),
	val SAR: PaymentsCurrencyResponseCurrencyListSAR = PaymentsCurrencyResponseCurrencyListSAR(),
	val PLN: PaymentsCurrencyResponseCurrencyListPLN = PaymentsCurrencyResponseCurrencyListPLN(),
	val MYR: PaymentsCurrencyResponseCurrencyListMYR = PaymentsCurrencyResponseCurrencyListMYR(),
	val RON: PaymentsCurrencyResponseCurrencyListRON = PaymentsCurrencyResponseCurrencyListRON(),
	val BRL: PaymentsCurrencyResponseCurrencyListBRL = PaymentsCurrencyResponseCurrencyListBRL(),
	val DKK: PaymentsCurrencyResponseCurrencyListDKK = PaymentsCurrencyResponseCurrencyListDKK(),
	val CNY: PaymentsCurrencyResponseCurrencyListCNY = PaymentsCurrencyResponseCurrencyListCNY(),
	val HKD: PaymentsCurrencyResponseCurrencyListHKD = PaymentsCurrencyResponseCurrencyListHKD(),
	val SEK: PaymentsCurrencyResponseCurrencyListSEK = PaymentsCurrencyResponseCurrencyListSEK(),
	val NOK: PaymentsCurrencyResponseCurrencyListNOK = PaymentsCurrencyResponseCurrencyListNOK(),
	val ZAR: PaymentsCurrencyResponseCurrencyListZAR = PaymentsCurrencyResponseCurrencyListZAR(),
	val MXN: PaymentsCurrencyResponseCurrencyListMXN = PaymentsCurrencyResponseCurrencyListMXN(),
	val CZK: PaymentsCurrencyResponseCurrencyListCZK = PaymentsCurrencyResponseCurrencyListCZK(),
	val TWD: PaymentsCurrencyResponseCurrencyListTWD = PaymentsCurrencyResponseCurrencyListTWD(),
	val THB: PaymentsCurrencyResponseCurrencyListTHB = PaymentsCurrencyResponseCurrencyListTHB(),
	val TRY: PaymentsCurrencyResponseCurrencyListTRY = PaymentsCurrencyResponseCurrencyListTRY(),
	val UAH: PaymentsCurrencyResponseCurrencyListUAH = PaymentsCurrencyResponseCurrencyListUAH(),
	val UYU: PaymentsCurrencyResponseCurrencyListUYU = PaymentsCurrencyResponseCurrencyListUYU(),
	val PHP: PaymentsCurrencyResponseCurrencyListPHP = PaymentsCurrencyResponseCurrencyListPHP(),
	val INR: PaymentsCurrencyResponseCurrencyListINR = PaymentsCurrencyResponseCurrencyListINR(),
	val RUB: PaymentsCurrencyResponseCurrencyListRUB = PaymentsCurrencyResponseCurrencyListRUB(),
	val RSD: PaymentsCurrencyResponseCurrencyListRSD = PaymentsCurrencyResponseCurrencyListRSD(),
	val JPY: PaymentsCurrencyResponseCurrencyListJPY = PaymentsCurrencyResponseCurrencyListJPY(),
	val HUF: PaymentsCurrencyResponseCurrencyListHUF = PaymentsCurrencyResponseCurrencyListHUF(),
	val KZT: PaymentsCurrencyResponseCurrencyListKZT = PaymentsCurrencyResponseCurrencyListKZT(),
	val CRC: PaymentsCurrencyResponseCurrencyListCRC = PaymentsCurrencyResponseCurrencyListCRC(),
	val CLP: PaymentsCurrencyResponseCurrencyListCLP = PaymentsCurrencyResponseCurrencyListCLP(),
	val ARS: PaymentsCurrencyResponseCurrencyListARS = PaymentsCurrencyResponseCurrencyListARS(),
	val KRW: PaymentsCurrencyResponseCurrencyListKRW = PaymentsCurrencyResponseCurrencyListKRW(),
	val COP: PaymentsCurrencyResponseCurrencyListCOP = PaymentsCurrencyResponseCurrencyListCOP(),
	val IDR: PaymentsCurrencyResponseCurrencyListIDR = PaymentsCurrencyResponseCurrencyListIDR(),
	val VND: PaymentsCurrencyResponseCurrencyListVND = PaymentsCurrencyResponseCurrencyListVND(),
)

@Serializable
data class PaymentsBalanceListResponse(
	val from: PaymentsBalanceListResponseFrom = PaymentsBalanceListResponseFrom(),
	val to: PaymentsBalanceListResponseTo = PaymentsBalanceListResponseTo(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class PaymentsBalanceListResponseFromBalance(
	val balance: String = "",
	val convertedBalance: Double = 0.0,
	val fullTitle: String = "",
	val title: String = "",
	val type: String = "",
)

@Serializable
data class PaymentsBalanceListResponseFrom(
	val balance: PaymentsBalanceListResponseFromBalance = PaymentsBalanceListResponseFromBalance(),
	@SerialName("12345")
	val `12345`: BalanceModel = BalanceModel(),
)

@Serializable
data class PaymentsBalanceListResponseTo(
	val balance: UserModel = UserModel(),
)

@Serializable
data class PaymentsBalanceExchangeBody(
    /** Source balance type */
	@SerialName("from_balance")
	val fromBalance: String,
    /** Target balance type */
	@SerialName("to_balance")
	val toBalance: String,
    /** Amount to exchange */
	val amount: Long,
)

@Serializable
data class PaymentsBalanceExchangeResponse(
	val from: PaymentsBalanceExchangeResponseFrom = PaymentsBalanceExchangeResponseFrom(),
	val to: PaymentsBalanceExchangeResponseTo = PaymentsBalanceExchangeResponseTo(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class PaymentsBalanceExchangeResponseFromBalance(
	val balance: String = "",
	val convertedBalance: Double = 0.0,
	val fullTitle: String = "",
	val title: String = "",
	val type: String = "",
)

@Serializable
data class PaymentsBalanceExchangeResponseFrom(
	val balance: PaymentsBalanceExchangeResponseFromBalance = PaymentsBalanceExchangeResponseFromBalance(),
	@SerialName("12345")
	val `12345`: BalanceModel = BalanceModel(),
)

@Serializable
data class PaymentsBalanceExchangeResponseTo(
	val balance: UserModel = UserModel(),
)

@Serializable
data class PaymentsTransferBody(
    /** Amount to send in your currency. */
	val amount: Long,
	val currency: Currency,
    /** User id of receiver. If user_id specified, username is not required. */
	@SerialName("user_id")
	val userId: Long? = null,
    /** Username of receiver. If username specified, user_id is not required. */
	val username: String? = null,
    /** Transfer comment. */
	val comment: String? = null,
    /** Is the deal happening on Telegram? */
	@SerialName("telegram_deal")
	val telegramDeal: Boolean? = null,
    /** Telegram username of the user you are dialoguing with. */
	@SerialName("telegram_username")
	val telegramUsername: String? = null,
    /** Hold transfer or not. */
	@SerialName("transfer_hold")
	val transferHold: Boolean? = null,
    /** Hold length value. */
	@SerialName("hold_length_value")
	val holdLengthValue: Long? = null,
    /** Hold length option. */
	@SerialName("hold_length_option")
	val holdLengthOption: HoldLengthOption? = null,
)

@Serializable
data class PaymentsTransferResponse(
	val status: String = "",
	val message: String = "",
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class PaymentsFeeParams(
    /** Amount you want to send in your currency. */
	val amount: Double? = null,
)

@Serializable
data class PaymentsFeeResponse(
	@SerialName("commission_percentage")
	val commissionPercentage: Double = 0.0,
	val spentCurrentMonth: Double = 0.0,
	val calculator: PaymentsFeeResponseCalculator = PaymentsFeeResponseCalculator(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class PaymentsFeeResponseCalculator(
	val inputAmount: Double = 0.0,
	val commissionAmount: Double = 0.0,
	val totalOutputAmount: Double = 0.0,
)

@Serializable
data class PaymentsCancelBody(
    /** Payment id. */
	@SerialName("payment_id")
	val paymentId: Long,
)

@Serializable
data class PaymentsCancelResponse(
	val status: String = "",
	val message: String = "",
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class PaymentsHistoryParams(
    /** Type of operation. */
	val type: PaymentsType? = null,
    /** Minimal price of account (Inclusive). */
	val pmin: Long? = null,
    /** Maximum price of account (Inclusive). */
	val pmax: Long? = null,
    /** Currency. */
	val currency: Currency? = null,
    /** The number of the page to display results from. */
	val page: Long? = null,
    /** Id of the operation from which the result begins. */
	@SerialName("operation_id_lt")
	val operationIdLt: Long? = null,
    /** Username of user, which receive money from you. */
	val receiver: String? = null,
    /** Username of user, which sent money to you. */
	val sender: String? = null,
    /** Returns payments that are done via API. */
	@SerialName("is_api")
	val isApi: Boolean? = null,
    /** Start date of operation (RFC 3339 date format). */
	val startDate: String? = null,
    /** End date of operation (RFC 3339 date format). */
	val endDate: String? = null,
    /** Wallet, which used for money payouts. */
	val wallet: String? = null,
    /** Comment for money transfers. */
	val comment: String? = null,
    /** Display hold operations. */
	@SerialName("is_hold")
	val isHold: Boolean? = null,
    /** Display payment stats for selected period (outgoing value, incoming value). */
	@SerialName("show_payment_stats")
	val showPaymentStats: Boolean? = null,
)

@Serializable
data class PaymentsHistoryResponse(
	val payments: JsonElement = JsonNull,
	val perPage: String = "",
	val page: Double = 0.0,
	val pageNavLink: String = "",
	val pageNavParams: PaymentsHistoryResponsePageNavParams = PaymentsHistoryResponsePageNavParams(),
	val periodLabel: String = "",
	val periodLabelPhrase: String = "",
	val filterDatesDefault: Boolean = false,
	val input: PaymentsHistoryResponseInput = PaymentsHistoryResponseInput(),
	val paymentStats: JsonElement = JsonNull,
	val hasNextPage: Boolean = false,
	val lastOperationId: Double = 0.0,
	val nextPageHref: String = "",
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class PaymentsHistoryResponsePageNavParams(
	val type: String = "",
	val startDate: String = "",
	val endDate: String = "",
)

@Serializable
data class PaymentsHistoryResponseInput(
	@SerialName("user_id")
	val userId: Double = 0.0,
	val type: String = "",
	val startDate: String = "",
	val endDate: String = "",
	val page: Double = 0.0,
	@SerialName("period_label")
	val periodLabel: String = "",
	val receiver: String = "",
	val sender: String = "",
	val comment: String = "",
	val pmin: String = "",
	val pmax: String = "",
	@SerialName("category_id")
	val categoryId: Double = 0.0,
	val wallet: String = "",
	@SerialName("is_hold")
	val isHold: Boolean = false,
	val currency: String = "",
	@SerialName("operation_id_lt")
	val operationIdLt: Double = 0.0,
)

@Serializable
data class PaymentsPayoutServicesResponse(
	val systems: List<PaymentsPayoutServicesResponseSystems> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class PaymentsPayoutServicesResponseSystemsProvidersBEP20(
	val title: String = "",
	val isUnavailable: Boolean = false,
)

@Serializable
data class PaymentsPayoutServicesResponseSystemsProvidersTRC20(
	val title: String = "",
	val isUnavailable: Boolean = false,
)

@Serializable
data class PaymentsPayoutServicesResponseSystemsProvidersERC20(
	val title: String = "",
	val isUnavailable: Boolean = false,
)

@Serializable
data class PaymentsPayoutServicesResponseSystemsProvidersTRX(
	val title: String = "",
	val isUnavailable: Boolean = false,
)

@Serializable
data class PaymentsPayoutServicesResponseSystemsProvidersBTC(
	val title: String = "",
	val isUnavailable: Boolean = false,
)

@Serializable
data class PaymentsPayoutServicesResponseSystemsProvidersTON(
	val title: String = "",
	val isUnavailable: Boolean = false,
)

@Serializable
data class PaymentsPayoutServicesResponseSystemsProvidersETH(
	val title: String = "",
	val isUnavailable: Boolean = false,
)

@Serializable
data class PaymentsPayoutServicesResponseSystemsProvidersLTC(
	val title: String = "",
	val isUnavailable: Boolean = false,
)

@Serializable
data class PaymentsPayoutServicesResponseSystemsProvidersBNB(
	val title: String = "",
	val isUnavailable: Boolean = false,
)

@Serializable
data class PaymentsPayoutServicesResponseSystemsProvidersDASH(
	val title: String = "",
	val isUnavailable: Boolean = false,
)

@Serializable
data class PaymentsPayoutServicesResponseSystemsProvidersDOGE(
	val title: String = "",
	val isUnavailable: Boolean = false,
)

@Serializable
data class PaymentsPayoutServicesResponseSystemsProvidersXMR(
	val title: String = "",
	val isUnavailable: Boolean = false,
)

@Serializable
data class PaymentsPayoutServicesResponseSystemsProvidersSOL(
	val title: String = "",
	val isUnavailable: Boolean = false,
)

@Serializable
data class PaymentsPayoutServicesResponseSystemsProvidersBCH(
	val title: String = "",
	val isUnavailable: Boolean = false,
)

@Serializable
data class PaymentsPayoutServicesResponseSystemsProviders(
	val BEP20: PaymentsPayoutServicesResponseSystemsProvidersBEP20 = PaymentsPayoutServicesResponseSystemsProvidersBEP20(),
	val TRC20: PaymentsPayoutServicesResponseSystemsProvidersTRC20 = PaymentsPayoutServicesResponseSystemsProvidersTRC20(),
	val ERC20: PaymentsPayoutServicesResponseSystemsProvidersERC20 = PaymentsPayoutServicesResponseSystemsProvidersERC20(),
	val TRX: PaymentsPayoutServicesResponseSystemsProvidersTRX = PaymentsPayoutServicesResponseSystemsProvidersTRX(),
	val BTC: PaymentsPayoutServicesResponseSystemsProvidersBTC = PaymentsPayoutServicesResponseSystemsProvidersBTC(),
	val TON: PaymentsPayoutServicesResponseSystemsProvidersTON = PaymentsPayoutServicesResponseSystemsProvidersTON(),
	val ETH: PaymentsPayoutServicesResponseSystemsProvidersETH = PaymentsPayoutServicesResponseSystemsProvidersETH(),
	val LTC: PaymentsPayoutServicesResponseSystemsProvidersLTC = PaymentsPayoutServicesResponseSystemsProvidersLTC(),
	val BNB: PaymentsPayoutServicesResponseSystemsProvidersBNB = PaymentsPayoutServicesResponseSystemsProvidersBNB(),
	val DASH: PaymentsPayoutServicesResponseSystemsProvidersDASH = PaymentsPayoutServicesResponseSystemsProvidersDASH(),
	val DOGE: PaymentsPayoutServicesResponseSystemsProvidersDOGE = PaymentsPayoutServicesResponseSystemsProvidersDOGE(),
	val XMR: PaymentsPayoutServicesResponseSystemsProvidersXMR = PaymentsPayoutServicesResponseSystemsProvidersXMR(),
	val SOL: PaymentsPayoutServicesResponseSystemsProvidersSOL = PaymentsPayoutServicesResponseSystemsProvidersSOL(),
	val BCH: PaymentsPayoutServicesResponseSystemsProvidersBCH = PaymentsPayoutServicesResponseSystemsProvidersBCH(),
)

@Serializable
data class PaymentsPayoutServicesResponseSystems(
	val system: String = "",
	val commission: String = "",
	val min: Double = 0.0,
	val max: Double = 0.0,
	@SerialName("instant_payout")
	val instantPayout: Boolean = false,
	@SerialName("problematic_payout")
	val problematicPayout: Boolean = false,
	@SerialName("is_unavailable")
	val isUnavailable: Boolean = false,
	val p2p: Boolean = false,
	@SerialName("has_wallet")
	val hasWallet: Boolean = false,
	val providers: PaymentsPayoutServicesResponseSystemsProviders = PaymentsPayoutServicesResponseSystemsProviders(),
)

@Serializable
data class PaymentsPayoutBody(
	@SerialName("payment_system")
	val paymentSystem: String,
	val wallet: String,
	val amount: Double,
	val currency: Currency,
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
	val payments: JsonElement = JsonNull,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class AutoPaymentsCreateBody(
    /** Username of the payment receiver. */
	@SerialName("username_receiver")
	val usernameReceiver: String,
    /** Day of the month for the payment. (Use "0" for the last day of the month) */
	val day: Day,
    /** Amount to be transferred. */
	val amount: Double,
    /** Secret answer. */
	@SerialName("secret_answer")
	val secretAnswer: String? = null,
	val currency: Currency? = null,
    /** Payment description. */
	val description: String? = null,
)

@Serializable
data class AutoPaymentsCreateResponse(
	val status: String = "",
	val message: String = "",
	@SerialName("auto_payment_id")
	val autoPaymentId: Double = 0.0,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class AutoPaymentsDeleteBody(
    /** Auto payment ID. */
	@SerialName("auto_payment_id")
	val autoPaymentId: Long,
)

@Serializable
data class AutoPaymentsDeleteResponse(
	val status: String = "",
	val message: String = "",
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

// ─── ProxyApi Types ────────────────────────────────────────

@Serializable
data class ProxyGetResponse(
	val proxies: List<ProxyGetResponseProxies> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ProxyGetResponseProxiesProxy(
	@SerialName("proxy_id")
	val proxyId: Double = 0.0,
	@SerialName("user_id")
	val userId: Double = 0.0,
	@SerialName("proxy_ip")
	val proxyIp: String = "",
	@SerialName("proxy_port")
	val proxyPort: Double = 0.0,
	@SerialName("proxy_user")
	val proxyUser: String = "",
	@SerialName("proxy_pass")
	val proxyPass: String = "",
	val proxyString: String = "",
)

@Serializable
data class ProxyGetResponseProxies(
	val proxy: ProxyGetResponseProxiesProxy = ProxyGetResponseProxiesProxy(),
)

@Serializable
data class ProxyAddBody(
    /** Proxy ip or host. Required if proxy_row is not specified. */
	@SerialName("proxy_ip")
	val proxyIp: String? = null,
    /** Proxy port. Required if proxy_row is not specified. */
	@SerialName("proxy_port")
	val proxyPort: Long? = null,
    /** Proxy username. Required if proxy_row is not specified. */
	@SerialName("proxy_user")
	val proxyUser: String? = null,
    /** Proxy password. Required if proxy_row is not specified. */
	@SerialName("proxy_pass")
	val proxyPass: String? = null,
    /** Proxy list in String format ip:port:user:pass. Each proxy must be start with new line (use \r\n separator) */
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
    /** Id of an existing proxy. */
	@SerialName("proxy_id")
	val proxyId: Long? = null,
    /** Delete all proxies. */
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
    /** Domain to delete IMAP configuration for. */
	val domain: String,
    /** IMAP server address. */
	@SerialName("imap_server")
	val imapServer: String,
    /** IMAP server port. */
	val port: Long,
    /** Whether to use a secure connection. */
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
    /** Domain to delete IMAP configuration for. */
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
	val jobs: BatchBatchResponseJobs = BatchBatchResponseJobs(),
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
	val jobId: BatchBatchResponseJobsJobId = BatchBatchResponseJobsJobId(),
)

