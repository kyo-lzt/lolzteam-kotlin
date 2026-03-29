// Auto-generated. Do not edit manually.

package com.lolzteam.api.generated.forum

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

@Serializable(with = AllowInviteGroupSerializer::class)
enum class AllowInviteGroup(val value: String) {
	NONE("none"),
	MEMBERS("members"),
	FOLLOWED("followed");
}


internal object AllowInviteGroupSerializer : KSerializer<AllowInviteGroup> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("AllowInviteGroup", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: AllowInviteGroup) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): AllowInviteGroup {
		val v = decoder.decodeString()
		return AllowInviteGroup.entries.first { it.value == v }
	}
}


@Serializable(with = AllowPostProfileSerializer::class)
enum class AllowPostProfile(val value: String) {
	NONE("none"),
	MEMBERS("members"),
	FOLLOWED("followed");
}


internal object AllowPostProfileSerializer : KSerializer<AllowPostProfile> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("AllowPostProfile", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: AllowPostProfile) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): AllowPostProfile {
		val v = decoder.decodeString()
		return AllowPostProfile.entries.first { it.value == v }
	}
}


@Serializable(with = AllowReceiveNewsFeedSerializer::class)
enum class AllowReceiveNewsFeed(val value: String) {
	NONE("none"),
	MEMBERS("members"),
	FOLLOWED("followed");
}


internal object AllowReceiveNewsFeedSerializer : KSerializer<AllowReceiveNewsFeed> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("AllowReceiveNewsFeed", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: AllowReceiveNewsFeed) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): AllowReceiveNewsFeed {
		val v = decoder.decodeString()
		return AllowReceiveNewsFeed.entries.first { it.value == v }
	}
}


@Serializable(with = AllowSendPersonalConversationSerializer::class)
enum class AllowSendPersonalConversation(val value: String) {
	NONE("none"),
	MEMBERS("members"),
	FOLLOWED("followed");
}


internal object AllowSendPersonalConversationSerializer : KSerializer<AllowSendPersonalConversation> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("AllowSendPersonalConversation", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: AllowSendPersonalConversation) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): AllowSendPersonalConversation {
		val v = decoder.decodeString()
		return AllowSendPersonalConversation.entries.first { it.value == v }
	}
}


@Serializable(with = AllowViewProfileSerializer::class)
enum class AllowViewProfile(val value: String) {
	NONE("none"),
	MEMBERS("members"),
	FOLLOWED("followed");
}


internal object AllowViewProfileSerializer : KSerializer<AllowViewProfile> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("AllowViewProfile", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: AllowViewProfile) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): AllowViewProfile {
		val v = decoder.decodeString()
		return AllowViewProfile.entries.first { it.value == v }
	}
}


@Serializable(with = CategoriesOrderSerializer::class)
enum class CategoriesOrder(val value: String) {
	NATURAL("natural"),
	LIST("list");
}


internal object CategoriesOrderSerializer : KSerializer<CategoriesOrder> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("CategoriesOrder", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: CategoriesOrder) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): CategoriesOrder {
		val v = decoder.decodeString()
		return CategoriesOrder.entries.first { it.value == v }
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


@Serializable(with = ContentTypeSerializer::class)
enum class ContentType(val value: String) {
	POST("post"),
	POST_COMMENT("post_comment"),
	PROFILE_POST("profile_post"),
	PROFILE_POST_COMMENT("profile_post_comment");
}


internal object ContentTypeSerializer : KSerializer<ContentType> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("ContentType", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: ContentType) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): ContentType {
		val v = decoder.decodeString()
		return ContentType.entries.first { it.value == v }
	}
}


@Serializable(with = ContestTypeSerializer::class)
enum class ContestType(val value: String) {
	BY_FINISH_DATE("by_finish_date");
}


internal object ContestTypeSerializer : KSerializer<ContestType> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("ContestType", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: ContestType) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): ContestType {
		val v = decoder.decodeString()
		return ContestType.entries.first { it.value == v }
	}
}


@Serializable(with = ConversationsOrderSerializer::class)
enum class ConversationsOrder(val value: String) {
	NATURAL("natural"),
	NATURAL_REVERSE("natural_reverse");
}


internal object ConversationsOrderSerializer : KSerializer<ConversationsOrder> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("ConversationsOrder", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: ConversationsOrder) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): ConversationsOrder {
		val v = decoder.decodeString()
		return ConversationsOrder.entries.first { it.value == v }
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
	TRY("try");
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


@Serializable(with = DeleteTypeSerializer::class)
enum class DeleteType(val value: String) {
	DELETE("delete"),
	DELETE_IGNORE("delete_ignore");
}


internal object DeleteTypeSerializer : KSerializer<DeleteType> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("DeleteType", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: DeleteType) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): DeleteType {
		val v = decoder.decodeString()
		return DeleteType.entries.first { it.value == v }
	}
}


@Serializable(with = DirectionSerializer::class)
enum class Direction(val value: String) {
	ASC("asc"),
	DESC("desc");
}


internal object DirectionSerializer : KSerializer<Direction> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("Direction", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: Direction) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): Direction {
		val v = decoder.decodeString()
		return Direction.entries.first { it.value == v }
	}
}


@Serializable(with = DurationSerializer::class)
enum class Duration(val value: String) {
	DAY("day"),
	WEEK("week"),
	MONTH("month");
}


internal object DurationSerializer : KSerializer<Duration> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("Duration", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: Duration) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): Duration {
		val v = decoder.decodeString()
		return Duration.entries.first { it.value == v }
	}
}


@Serializable(with = FolderSerializer::class)
enum class Folder(val value: String) {
	ALL("all"),
	UNREAD("unread"),
	GROUPS("groups"),
	MARKET("market"),
	MARKET_REPLACEMENTS("market_replacements"),
	STAFF("staff"),
	GIVEAWAYS("giveaways"),
	P2P("p2p");
}


internal object FolderSerializer : KSerializer<Folder> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("Folder", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: Folder) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): Folder {
		val v = decoder.decodeString()
		return Folder.entries.first { it.value == v }
	}
}


@Serializable(with = FormIdSerializer::class)
enum class FormId(val value: Long) {
	V3(3);
}


internal object FormIdSerializer : KSerializer<FormId> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("FormId", PrimitiveKind.LONG)

	override fun serialize(encoder: Encoder, value: FormId) {
		encoder.encodeLong(value.value)
	}

	override fun deserialize(decoder: Decoder): FormId {
		val v = decoder.decodeLong()
		return FormId.entries.first { it.value == v }
	}
}


@Serializable(with = GenderSerializer::class)
enum class Gender(val value: String) {
	EMPTY(""),
	MALE("male"),
	FEMALE("female");
}


internal object GenderSerializer : KSerializer<Gender> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("Gender", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: Gender) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): Gender {
		val v = decoder.decodeString()
		return Gender.entries.first { it.value == v }
	}
}


@Serializable(with = GrantTypeSerializer::class)
enum class GrantType(val value: String) {
	PASSWORD("password");
}


internal object GrantTypeSerializer : KSerializer<GrantType> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("GrantType", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: GrantType) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): GrantType {
		val v = decoder.decodeString()
		return GrantType.entries.first { it.value == v }
	}
}


@Serializable(with = LanguageIdSerializer::class)
enum class LanguageId(val value: Long) {
	V1(1),
	V2(2);
}


internal object LanguageIdSerializer : KSerializer<LanguageId> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("LanguageId", PrimitiveKind.LONG)

	override fun serialize(encoder: Encoder, value: LanguageId) {
		encoder.encodeLong(value.value)
	}

	override fun deserialize(decoder: Decoder): LanguageId {
		val v = decoder.decodeLong()
		return LanguageId.entries.first { it.value == v }
	}
}


@Serializable(with = LengthOptionSerializer::class)
enum class LengthOption(val value: String) {
	MINUTES("minutes"),
	HOURS("hours"),
	DAYS("days");
}


internal object LengthOptionSerializer : KSerializer<LengthOption> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("LengthOption", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: LengthOption) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): LengthOption {
		val v = decoder.decodeString()
		return LengthOption.entries.first { it.value == v }
	}
}


@Serializable(with = LikeTypeSerializer::class)
enum class LikeType(val value: String) {
	LIKE("like"),
	LIKE2("like2");
}


internal object LikeTypeSerializer : KSerializer<LikeType> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("LikeType", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: LikeType) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): LikeType {
		val v = decoder.decodeString()
		return LikeType.entries.first { it.value == v }
	}
}


@Serializable(with = NotificationsTypeSerializer::class)
enum class NotificationsType(val value: String) {
	MARKET("market"),
	NOMARKET("nomarket");
}


internal object NotificationsTypeSerializer : KSerializer<NotificationsType> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("NotificationsType", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: NotificationsType) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): NotificationsType {
		val v = decoder.decodeString()
		return NotificationsType.entries.first { it.value == v }
	}
}


@Serializable(with = PayClaimSerializer::class)
enum class PayClaim(val value: String) {
	NOW("now"),
	LATER("later");
}


internal object PayClaimSerializer : KSerializer<PayClaim> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("PayClaim", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: PayClaim) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): PayClaim {
		val v = decoder.decodeString()
		return PayClaim.entries.first { it.value == v }
	}
}


@Serializable(with = PeriodSerializer::class)
enum class Period(val value: String) {
	DAY("day"),
	WEEK("week"),
	MONTH("month"),
	YEAR("year");
}


internal object PeriodSerializer : KSerializer<Period> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("Period", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: Period) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): Period {
		val v = decoder.decodeString()
		return Period.entries.first { it.value == v }
	}
}


@Serializable(with = PostsOrderSerializer::class)
enum class PostsOrder(val value: String) {
	NATURAL("natural"),
	NATURAL_REVERSE("natural_reverse"),
	POST_LIKES("post_likes"),
	POST_LIKES_REVERSE("post_likes_reverse");
}


internal object PostsOrderSerializer : KSerializer<PostsOrder> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("PostsOrder", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: PostsOrder) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): PostsOrder {
		val v = decoder.decodeString()
		return PostsOrder.entries.first { it.value == v }
	}
}


@Serializable(with = PrizeDataUpgradeSerializer::class)
enum class PrizeDataUpgrade(val value: Long) {
	V1(1),
	V6(6),
	V12(12),
	V14(14),
	V17(17),
	V19(19),
	V20(20),
	V21(21),
	V22(22);
}


internal object PrizeDataUpgradeSerializer : KSerializer<PrizeDataUpgrade> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("PrizeDataUpgrade", PrimitiveKind.LONG)

	override fun serialize(encoder: Encoder, value: PrizeDataUpgrade) {
		encoder.encodeLong(value.value)
	}

	override fun deserialize(decoder: Decoder): PrizeDataUpgrade {
		val v = decoder.decodeLong()
		return PrizeDataUpgrade.entries.first { it.value == v }
	}
}


@Serializable(with = PrizeTypeSerializer::class)
enum class PrizeType(val value: String) {
	MONEY("money"),
	UPGRADES("upgrades");
}


internal object PrizeTypeSerializer : KSerializer<PrizeType> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("PrizeType", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: PrizeType) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): PrizeType {
		val v = decoder.decodeString()
		return PrizeType.entries.first { it.value == v }
	}
}


@Serializable(with = ReplyGroupSerializer::class)
enum class ReplyGroup(val value: Long) {
	V0(0),
	V2(2),
	V21(21),
	V22(22),
	V23(23),
	V60(60),
	V351(351);
}


internal object ReplyGroupSerializer : KSerializer<ReplyGroup> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("ReplyGroup", PrimitiveKind.LONG)

	override fun serialize(encoder: Encoder, value: ReplyGroup) {
		encoder.encodeLong(value.value)
	}

	override fun deserialize(decoder: Decoder): ReplyGroup {
		val v = decoder.decodeLong()
		return ReplyGroup.entries.first { it.value == v }
	}
}


@Serializable(with = RoomIdSerializer::class)
enum class RoomId(val value: Long) {
	V1(1),
	V2(2),
	V3(3),
	V4(4),
	V13(13);
}


internal object RoomIdSerializer : KSerializer<RoomId> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("RoomId", PrimitiveKind.LONG)

	override fun serialize(encoder: Encoder, value: RoomId) {
		encoder.encodeLong(value.value)
	}

	override fun deserialize(decoder: Decoder): RoomId {
		val v = decoder.decodeLong()
		return RoomId.entries.first { it.value == v }
	}
}


@Serializable(with = StateSerializer::class)
enum class State(val value: String) {
	ACTIVE("active"),
	CLOSED("closed");
}


internal object StateSerializer : KSerializer<State> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("State", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: State) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): State {
		val v = decoder.decodeString()
		return State.entries.first { it.value == v }
	}
}


@Serializable(with = ThreadsOrderSerializer::class)
enum class ThreadsOrder(val value: String) {
	POST_DATE("post_date"),
	LAST_POST_DATE("last_post_date"),
	REPLY_COUNT("reply_count"),
	REPLY_COUNT_ASC("reply_count_asc"),
	FIRST_POST_LIKES("first_post_likes"),
	VOTE_COUNT("vote_count");
}


internal object ThreadsOrderSerializer : KSerializer<ThreadsOrder> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("ThreadsOrder", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: ThreadsOrder) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): ThreadsOrder {
		val v = decoder.decodeString()
		return ThreadsOrder.entries.first { it.value == v }
	}
}


@Serializable(with = TimezoneSerializer::class)
enum class Timezone(val value: String) {
	PACIFIC_MIDWAY("Pacific/Midway"),
	PACIFIC_HONOLULU("Pacific/Honolulu"),
	PACIFIC_MARQUESAS("Pacific/Marquesas"),
	AMERICA_ANCHORAGE("America/Anchorage"),
	AMERICA_LOS_ANGELES("America/Los_Angeles"),
	AMERICA_SANTA_ISABEL("America/Santa_Isabel"),
	AMERICA_TIJUANA("America/Tijuana"),
	AMERICA_DENVER("America/Denver"),
	AMERICA_CHIHUAHUA("America/Chihuahua"),
	AMERICA_PHOENIX("America/Phoenix"),
	AMERICA_CHICAGO("America/Chicago"),
	AMERICA_BELIZE("America/Belize"),
	AMERICA_MEXICO_CITY("America/Mexico_City"),
	PACIFIC_EASTER("Pacific/Easter"),
	AMERICA_NEW_YORK("America/New_York"),
	AMERICA_HAVANA("America/Havana"),
	AMERICA_BOGOTA("America/Bogota"),
	AMERICA_CARACAS("America/Caracas"),
	AMERICA_HALIFAX("America/Halifax"),
	AMERICA_GOOSE_BAY("America/Goose_Bay"),
	AMERICA_ASUNCION("America/Asuncion"),
	AMERICA_SANTIAGO("America/Santiago"),
	AMERICA_CUIABA("America/Cuiaba"),
	AMERICA_LA_PAZ("America/La_Paz"),
	AMERICA_ST_JOHNS("America/St_Johns"),
	AMERICA_ARGENTINA_BUENOS_AIRES("America/Argentina/Buenos_Aires"),
	AMERICA_ARGENTINA_SAN_LUIS("America/Argentina/San_Luis"),
	AMERICA_ARGENTINA_MENDOZA("America/Argentina/Mendoza"),
	ATLANTIC_STANLEY("Atlantic/Stanley"),
	AMERICA_GODTHAB("America/Godthab"),
	AMERICA_MONTEVIDEO("America/Montevideo"),
	AMERICA_SAO_PAULO("America/Sao_Paulo"),
	AMERICA_MIQUELON("America/Miquelon"),
	AMERICA_NORONHA("America/Noronha"),
	ATLANTIC_CAPE_VERDE("Atlantic/Cape_Verde"),
	ATLANTIC_AZORES("Atlantic/Azores"),
	EUROPE_LONDON("Europe/London"),
	AFRICA_CASABLANCA("Africa/Casablanca"),
	ATLANTIC_REYKJAVIK("Atlantic/Reykjavik"),
	EUROPE_AMSTERDAM("Europe/Amsterdam"),
	AFRICA_ALGIERS("Africa/Algiers"),
	AFRICA_WINDHOEK("Africa/Windhoek"),
	AFRICA_TUNIS("Africa/Tunis"),
	EUROPE_ATHENS("Europe/Athens"),
	AFRICA_JOHANNESBURG("Africa/Johannesburg"),
	EUROPE_KALININGRAD("Europe/Kaliningrad"),
	ASIA_AMMAN("Asia/Amman"),
	ASIA_BEIRUT("Asia/Beirut"),
	AFRICA_CAIRO("Africa/Cairo"),
	ASIA_JERUSALEM("Asia/Jerusalem"),
	ASIA_GAZA("Asia/Gaza"),
	ASIA_DAMASCUS("Asia/Damascus"),
	EUROPE_MOSCOW("Europe/Moscow"),
	EUROPE_MINSK("Europe/Minsk"),
	AFRICA_NAIROBI("Africa/Nairobi"),
	ASIA_TEHRAN("Asia/Tehran"),
	ASIA_DUBAI("Asia/Dubai"),
	ASIA_YEREVAN("Asia/Yerevan"),
	ASIA_BAKU("Asia/Baku"),
	INDIAN_MAURITIUS("Indian/Mauritius"),
	ASIA_KABUL("Asia/Kabul"),
	ASIA_YEKATERINBURG("Asia/Yekaterinburg"),
	ASIA_TASHKENT("Asia/Tashkent"),
	ASIA_KOLKATA("Asia/Kolkata"),
	ASIA_KATHMANDU("Asia/Kathmandu"),
	ASIA_NOVOSIBIRSK("Asia/Novosibirsk"),
	ASIA_DHAKA("Asia/Dhaka"),
	ASIA_ALMATY("Asia/Almaty"),
	ASIA_RANGOON("Asia/Rangoon"),
	ASIA_KRASNOYARSK("Asia/Krasnoyarsk"),
	ASIA_BANGKOK("Asia/Bangkok"),
	ASIA_IRKUTSK("Asia/Irkutsk"),
	ASIA_HONG_KONG("Asia/Hong_Kong"),
	ASIA_SINGAPORE("Asia/Singapore"),
	AUSTRALIA_PERTH("Australia/Perth"),
	ASIA_YAKUTSK("Asia/Yakutsk"),
	ASIA_TOKYO("Asia/Tokyo"),
	ASIA_SEOUL("Asia/Seoul"),
	AUSTRALIA_ADELAIDE("Australia/Adelaide"),
	AUSTRALIA_DARWIN("Australia/Darwin"),
	ASIA_VLADIVOSTOK("Asia/Vladivostok"),
	ASIA_MAGADAN("Asia/Magadan"),
	AUSTRALIA_BRISBANE("Australia/Brisbane"),
	AUSTRALIA_SYDNEY("Australia/Sydney"),
	PACIFIC_NOUMEA("Pacific/Noumea"),
	PACIFIC_NORFOLK("Pacific/Norfolk"),
	ASIA_ANADYR("Asia/Anadyr"),
	PACIFIC_AUCKLAND("Pacific/Auckland"),
	PACIFIC_FIJI("Pacific/Fiji"),
	PACIFIC_CHATHAM("Pacific/Chatham"),
	PACIFIC_TONGATAPU("Pacific/Tongatapu"),
	PACIFIC_APIA("Pacific/Apia"),
	PACIFIC_KIRITIMATI("Pacific/Kiritimati");
}


internal object TimezoneSerializer : KSerializer<Timezone> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("Timezone", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: Timezone) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): Timezone {
		val v = decoder.decodeString()
		return Timezone.entries.first { it.value == v }
	}
}


@Serializable(with = TransferTypeSerializer::class)
enum class TransferType(val value: String) {
	GUARANTOR("guarantor"),
	SAFE("safe"),
	NOTSAFE("notsafe");
}


internal object TransferTypeSerializer : KSerializer<TransferType> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("TransferType", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: TransferType) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): TransferType {
		val v = decoder.decodeString()
		return TransferType.entries.first { it.value == v }
	}
}


@Serializable(with = UsersOrderSerializer::class)
enum class UsersOrder(val value: String) {
	NATURAL("natural"),
	FOLLOW_DATE("follow_date"),
	FOLLOW_DATE_REVERSE("follow_date_reverse");
}


internal object UsersOrderSerializer : KSerializer<UsersOrder> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("UsersOrder", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: UsersOrder) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): UsersOrder {
		val v = decoder.decodeString()
		return UsersOrder.entries.first { it.value == v }
	}
}


@Serializable(with = UsersTypeSerializer::class)
enum class UsersType(val value: String) {
	GOTTEN("gotten"),
	GIVEN("given");
}


internal object UsersTypeSerializer : KSerializer<UsersType> {
	override val descriptor: SerialDescriptor =
		PrimitiveSerialDescriptor("UsersType", PrimitiveKind.STRING)

	override fun serialize(encoder: Encoder, value: UsersType) {
		encoder.encodeString(value.value)
	}

	override fun deserialize(decoder: Decoder): UsersType {
		val v = decoder.decodeString()
		return UsersType.entries.first { it.value == v }
	}
}


// ─── Component Schemas ────────────────────────────────────────

@Serializable
data class RespNotificationModel(
	@SerialName("notification_id")
	val notificationId: Double = 0.0,
	@SerialName("notification_create_date")
	val notificationCreateDate: Double = 0.0,
	@SerialName("content_type")
	val contentType: String = "",
	@SerialName("content_id")
	val contentId: Double = 0.0,
	@SerialName("content_action")
	val contentAction: String = "",
	@SerialName("notification_is_unread")
	val notificationIsUnread: Boolean = false,
	@SerialName("creator_user_id")
	val creatorUserId: Double = 0.0,
	@SerialName("creator_username")
	val creatorUsername: String = "",
	@SerialName("creator_username_html")
	val creatorUsernameHtml: String = "",
	@SerialName("notification_type")
	val notificationType: String = "",
	val links: RespNotificationModelLinks = RespNotificationModelLinks(),
	@SerialName("notification_html")
	val notificationHtml: String = "",
)

@Serializable
data class RespNotificationModelLinks(
	val content: String = "",
	@SerialName("creator_avatar")
	val creatorAvatar: String = "",
)

@Serializable
data class RespLinkModel(
	@SerialName("link_id")
	val linkId: Double = 0.0,
	@SerialName("link_title")
	val linkTitle: String = "",
	@SerialName("link_description")
	val linkDescription: String = "",
	val links: RespLinkModelLinks = RespLinkModelLinks(),
	val permissions: RespLinkModelPermissions = RespLinkModelPermissions(),
)

@Serializable
data class RespLinkModelLinks(
	val target: String = "",
	val detail: String = "",
)

@Serializable
data class RespLinkModelPermissions(
	val view: Boolean = false,
)

@Serializable
data class RespChatboxMessageModel(
	@SerialName("can_report")
	val canReport: Boolean = false,
	val date: Double = 0.0,
	@SerialName("is_deleted")
	val isDeleted: Boolean = false,
	val message: String = "",
	@SerialName("message_id")
	val messageId: Double = 0.0,
	val messageJson: String = "",
	val messageRaw: String = "",
	val room: RespChatboxMessageModelRoom = RespChatboxMessageModelRoom(),
	val user: RespChatboxMessageModelUser = RespChatboxMessageModelUser(),
)

@Serializable
data class RespChatboxMessageModelRoom(
	@SerialName("can_report")
	val canReport: Boolean = false,
	val eng: Boolean = false,
	val market: Boolean = false,
	@SerialName("room_id")
	val roomId: Double = 0.0,
	val title: String = "",
)

@Serializable
data class RespChatboxMessageModelUserRenderedAvatars(
	val l: String = "",
	val m: String = "",
	val s: String = "",
)

@Serializable
data class RespChatboxMessageModelUserRendered(
	val username: String = "",
	val avatars: RespChatboxMessageModelUserRenderedAvatars = RespChatboxMessageModelUserRenderedAvatars(),
	val link: String = "",
)

@Serializable
data class RespChatboxMessageModelUserUniqBanner(
	@SerialName("banner_css")
	val bannerCss: String = "",
	@SerialName("banner_text")
	val bannerText: String = "",
	@SerialName("banner_icon")
	val bannerIcon: String = "",
	@SerialName("username_icon")
	val usernameIcon: String = "",
)

@Serializable
data class RespChatboxMessageModelUser(
	@SerialName("avatar_date")
	val avatarDate: Double = 0.0,
	@SerialName("background_date")
	val backgroundDate: Double = 0.0,
	@SerialName("contest_count")
	val contestCount: Double = 0.0,
	@SerialName("custom_title")
	val customTitle: String = "",
	@SerialName("display_banner_id")
	val displayBannerId: Double = 0.0,
	@SerialName("display_icon_group_id")
	val displayIconGroupId: Double = 0.0,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Double = 0.0,
	@SerialName("is_admin")
	val isAdmin: Boolean = false,
	@SerialName("is_banned")
	val isBanned: Boolean = false,
	@SerialName("is_moderator")
	val isModerator: Boolean = false,
	@SerialName("is_staff")
	val isStaff: Boolean = false,
	@SerialName("last_activity")
	val lastActivity: Double = 0.0,
	@SerialName("like2_count")
	val like2Count: Double = 0.0,
	@SerialName("like_count")
	val likeCount: Double = 0.0,
	@SerialName("message_count")
	val messageCount: Double = 0.0,
	@SerialName("register_date")
	val registerDate: Double = 0.0,
	val rendered: RespChatboxMessageModelUserRendered = RespChatboxMessageModelUserRendered(),
	@SerialName("short_link")
	val shortLink: String = "",
	@SerialName("trophy_points")
	val trophyPoints: Double = 0.0,
	@SerialName("uniq_banner")
	val uniqBanner: RespChatboxMessageModelUserUniqBanner = RespChatboxMessageModelUserUniqBanner(),
	@SerialName("uniq_username_css")
	val uniqUsernameCss: String = "",
	@SerialName("user_id")
	val userId: Double = 0.0,
	val username: String = "",
)

@Serializable
data class RespUserModel(
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
	@SerialName("short_link")
	val shortLink: String = "",
	@SerialName("custom_title")
	val customTitle: String = "",
	@SerialName("is_banned")
	val isBanned: Double = 0.0,
	@SerialName("display_banner_id")
	val displayBannerId: Double = 0.0,
	@SerialName("display_icon_group_id")
	val displayIconGroupId: Double = 0.0,
	val balance: String = "",
	val hold: String = "",
	val currency: String = "",
	@SerialName("user_email")
	val userEmail: String = "",
	@SerialName("user_unread_notification_count")
	val userUnreadNotificationCount: Double = 0.0,
	@SerialName("user_unread_conversation_count")
	val userUnreadConversationCount: Double = 0.0,
	@SerialName("conv_welcome_message")
	val convWelcomeMessage: String = "",
	@SerialName("user_title")
	val userTitle: String = "",
	@SerialName("user_deposit")
	val userDeposit: Double = 0.0,
	@SerialName("user_is_valid")
	val userIsValid: Boolean = false,
	@SerialName("user_is_verified")
	val userIsVerified: Boolean = false,
	@SerialName("user_is_followed")
	val userIsFollowed: Boolean = false,
	@SerialName("user_last_seen_date")
	val userLastSeenDate: Double = 0.0,
	val links: RespUserModelLinks = RespUserModelLinks(),
	val permissions: RespUserModelPermissions = RespUserModelPermissions(),
	@SerialName("user_is_ignored")
	val userIsIgnored: Boolean = false,
	@SerialName("user_is_visitor")
	val userIsVisitor: Boolean = false,
	@SerialName("user_group_id")
	val userGroupId: Double = 0.0,
	@SerialName("curator_titles")
	val curatorTitles: List<String> = emptyList(),
	@SerialName("user_groups")
	val userGroups: List<RespUserModelUserGroups> = emptyList(),
	val fields: List<RespUserModelFields> = emptyList(),
	@SerialName("user_timezone_offset")
	val userTimezoneOffset: Double = 0.0,
	@SerialName("user_external_authentications")
	val userExternalAuthentications: List<RespUserModelUserExternalAuthentications> = emptyList(),
	@SerialName("self_permissions")
	val selfPermissions: RespUserModelSelfPermissions = RespUserModelSelfPermissions(),
	@SerialName("edit_permissions")
	val editPermissions: RespUserModelEditPermissions = RespUserModelEditPermissions(),
	val birthday: RespUserModelBirthday = RespUserModelBirthday(),
	@SerialName("secret_answer_rendered")
	val secretAnswerRendered: String = "",
	@SerialName("secret_answer_first_letter")
	val secretAnswerFirstLetter: String = "",
	@SerialName("user_following")
	val userFollowing: RespUserModelUserFollowing = RespUserModelUserFollowing(),
	@SerialName("user_followers")
	val userFollowers: RespUserModelUserFollowers = RespUserModelUserFollowers(),
	val banner: String = "",
)

@Serializable
data class RespUserModelLinks(
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
	@SerialName("background_l")
	val backgroundL: String = "",
	@SerialName("background_m")
	val backgroundM: String = "",
	val status: String = "",
	val timeline: String = "",
)

@Serializable
data class RespUserModelPermissions(
	val edit: Boolean = false,
	val follow: Boolean = false,
	val ignore: Boolean = false,
	@SerialName("profile_post")
	val profilePost: Boolean = false,
)

@Serializable
data class RespUserModelUserGroups(
	@SerialName("user_group_id")
	val userGroupId: Double = 0.0,
	@SerialName("user_group_title")
	val userGroupTitle: String = "",
	@SerialName("user_group_title_en")
	val userGroupTitleEn: String = "",
	@SerialName("user_group_banner_css_class")
	val userGroupBannerCssClass: String = "",
	@SerialName("user_group_banner_text")
	val userGroupBannerText: String = "",
	@SerialName("user_group_banner_text_en")
	val userGroupBannerTextEn: String = "",
	@SerialName("display_group_selectable")
	val displayGroupSelectable: Boolean = false,
	@SerialName("display_banner_selectable")
	val displayBannerSelectable: Boolean = false,
	@SerialName("display_icon_selectable")
	val displayIconSelectable: Boolean = false,
	@SerialName("is_primary_group")
	val isPrimaryGroup: Boolean = false,
	@SerialName("user_group_icon_class")
	val userGroupIconClass: String = "",
)

@Serializable
data class RespUserModelFieldsChoices(
	val key: String = "",
	val value: String = "",
)

@Serializable
data class RespUserModelFields(
	val id: String = "",
	val title: String = "",
	val description: String = "",
	val position: String = "",
	@SerialName("is_required")
	val isRequired: Boolean = false,
	val value: String? = null,
	@SerialName("is_multi_choice")
	val isMultiChoice: Boolean = false,
	val choices: List<RespUserModelFieldsChoices> = emptyList(),
	val values: List<JsonElement> = emptyList(),
)

@Serializable
data class RespUserModelUserExternalAuthentications(
	val provider: String = "",
	@SerialName("provider_key")
	val providerKey: String = "",
)

@Serializable
data class RespUserModelSelfPermissions(
	@SerialName("create_conversation")
	val createConversation: Boolean = false,
)

@Serializable
data class RespUserModelEditPermissions(
	val password: Boolean = false,
	@SerialName("user_email")
	val userEmail: Boolean = false,
	val username: Boolean = false,
	@SerialName("user_title")
	val userTitle: Boolean = false,
	@SerialName("short_link")
	val shortLink: Boolean = false,
	@SerialName("hide_username_logs")
	val hideUsernameLogs: Boolean = false,
	@SerialName("primary_group_id")
	val primaryGroupId: Boolean = false,
	@SerialName("secondary_group_ids")
	val secondaryGroupIds: Boolean = false,
	@SerialName("user_dob_day")
	val userDobDay: Boolean = false,
	@SerialName("user_dob_month")
	val userDobMonth: Boolean = false,
	@SerialName("user_dob_year")
	val userDobYear: Boolean = false,
	val fields: Boolean = false,
)

@Serializable
data class RespUserModelBirthdayTimeStamp(
	val date: String = "",
	@SerialName("timezone_type")
	val timezoneType: Double = 0.0,
	val timezone: String = "",
)

@Serializable
data class RespUserModelBirthday(
	val age: Double = 0.0,
	val timeStamp: RespUserModelBirthdayTimeStamp = RespUserModelBirthdayTimeStamp(),
	val format: String = "",
)

@Serializable
data class RespUserModelUserFollowingUsers(
	@SerialName("user_id")
	val userId: Double = 0.0,
	val username: String = "",
	@SerialName("username_html")
	val usernameHtml: String = "",
	val avatar: String = "",
)

@Serializable
data class RespUserModelUserFollowing(
	val users: List<RespUserModelUserFollowingUsers> = emptyList(),
	val count: Double = 0.0,
)

@Serializable
data class RespUserModelUserFollowersUsers(
	@SerialName("user_id")
	val userId: Double = 0.0,
	val username: String = "",
	@SerialName("username_html")
	val usernameHtml: String = "",
	val avatar: String = "",
)

@Serializable
data class RespUserModelUserFollowers(
	val users: List<RespUserModelUserFollowersUsers> = emptyList(),
	val count: Double = 0.0,
)

@Serializable
data class RespThreadModel(
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
	@SerialName("creator_username_html")
	val creatorUsernameHtml: String = "",
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
	@SerialName("thread_is_closed")
	val threadIsClosed: Boolean = false,
	@SerialName("thread_is_followed")
	val threadIsFollowed: Boolean = false,
	@SerialName("thread_is_starred")
	val threadIsStarred: Boolean = false,
	@SerialName("first_post")
	val firstPost: RespThreadModelFirstPost = RespThreadModelFirstPost(),
	@SerialName("thread_prefixes")
	val threadPrefixes: List<JsonElement> = emptyList(),
	@SerialName("thread_tags")
	val threadTags: JsonElement = JsonNull,
	val links: RespThreadModelLinks = RespThreadModelLinks(),
	val permissions: RespThreadModelPermissions = RespThreadModelPermissions(),
	@SerialName("node_title")
	val nodeTitle: String = "",
	val restrictions: RespThreadModelRestrictions = RespThreadModelRestrictions(),
	@SerialName("last_post")
	val lastPost: RespThreadModelLastPost = RespThreadModelLastPost(),
	val contest: RespThreadModelContest = RespThreadModelContest(),
)

@Serializable
data class RespThreadModelFirstPostLinks(
	val permalink: String = "",
	val detail: String = "",
	val thread: String = "",
	val poster: String = "",
	val likes: String = "",
	val report: String = "",
	@SerialName("poster_avatar")
	val posterAvatar: String = "",
)

@Serializable
data class RespThreadModelFirstPostPermissions(
	val view: Boolean = false,
	val edit: Boolean = false,
	val delete: Boolean = false,
	val reply: Boolean = false,
	val like: Boolean = false,
	val report: Boolean = false,
)

@Serializable
data class RespThreadModelFirstPost(
	@SerialName("post_id")
	val postId: Double = 0.0,
	@SerialName("thread_id")
	val threadId: Double = 0.0,
	@SerialName("poster_user_id")
	val posterUserId: Double = 0.0,
	@SerialName("poster_username")
	val posterUsername: String = "",
	@SerialName("poster_username_html")
	val posterUsernameHtml: String = "",
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
	@SerialName("post_is_liked")
	val postIsLiked: Boolean = false,
	val links: RespThreadModelFirstPostLinks = RespThreadModelFirstPostLinks(),
	val permissions: RespThreadModelFirstPostPermissions = RespThreadModelFirstPostPermissions(),
	@SerialName("thread_is_deleted")
	val threadIsDeleted: Boolean = false,
)

@Serializable
data class RespThreadModelLinks(
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
	@SerialName("last_post")
	val lastPost: String = "",
)

@Serializable
data class RespThreadModelPermissionsBump(
	val can: Boolean = false,
	@SerialName("available_count")
	val availableCount: Double = 0.0,
	val error: JsonElement = JsonNull,
	@SerialName("next_available_time")
	val nextAvailableTime: JsonElement = JsonNull,
)

@Serializable
data class RespThreadModelPermissions(
	val view: Boolean = false,
	val delete: Boolean = false,
	val follow: Boolean = false,
	val post: Boolean = false,
	val edit: Boolean = false,
	@SerialName("edit_title")
	val editTitle: Boolean = false,
	@SerialName("edit_tags")
	val editTags: Boolean = false,
	val bump: RespThreadModelPermissionsBump = RespThreadModelPermissionsBump(),
)

@Serializable
data class RespThreadModelRestrictions(
	@SerialName("reply_delay")
	val replyDelay: Double = 0.0,
	@SerialName("max_reply_count")
	val maxReplyCount: Double = 0.0,
)

@Serializable
data class RespThreadModelLastPostLinks(
	val permalink: String = "",
	val detail: String = "",
	val thread: String = "",
	val poster: String = "",
	val likes: String = "",
	val report: String = "",
	@SerialName("poster_avatar")
	val posterAvatar: String = "",
)

@Serializable
data class RespThreadModelLastPostPermissions(
	val view: Boolean = false,
	val edit: Boolean = false,
	val delete: Boolean = false,
	val reply: Boolean = false,
	val like: Boolean = false,
	val report: Boolean = false,
)

@Serializable
data class RespThreadModelLastPost(
	@SerialName("post_id")
	val postId: Double = 0.0,
	@SerialName("thread_id")
	val threadId: Double = 0.0,
	@SerialName("poster_user_id")
	val posterUserId: Double = 0.0,
	@SerialName("poster_username")
	val posterUsername: String = "",
	@SerialName("poster_username_html")
	val posterUsernameHtml: String = "",
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
	@SerialName("post_is_liked")
	val postIsLiked: Boolean = false,
	val links: RespThreadModelLastPostLinks = RespThreadModelLastPostLinks(),
	val permissions: RespThreadModelLastPostPermissions = RespThreadModelLastPostPermissions(),
	@SerialName("thread_is_deleted")
	val threadIsDeleted: Boolean = false,
)

@Serializable
data class RespThreadModelContestPermissions(
	@SerialName("can_finish")
	val canFinish: Boolean = false,
	@SerialName("can_participate")
	val canParticipate: Boolean = false,
	@SerialName("can_participate_error")
	val canParticipateError: String = "",
	@SerialName("can_view_user_list")
	val canViewUserList: Boolean = false,
)

@Serializable
data class RespThreadModelContest(
	val type: String = "",
	@SerialName("finish_date")
	val finishDate: Double = 0.0,
	@SerialName("now_count_members")
	val nowCountMembers: Double = 0.0,
	@SerialName("needed_members")
	val neededMembers: Double = 0.0,
	@SerialName("is_finished")
	val isFinished: Double = 0.0,
	@SerialName("count_winners")
	val countWinners: Double = 0.0,
	@SerialName("require_like_count")
	val requireLikeCount: Double = 0.0,
	@SerialName("require_total_like_count")
	val requireTotalLikeCount: Double = 0.0,
	@SerialName("prize_type")
	val prizeType: String = "",
	@SerialName("prize_type_phrase")
	val prizeTypePhrase: String = "",
	@SerialName("prize_data")
	val prizeData: Double = 0.0,
	@SerialName("is_money_places")
	val isMoneyPlaces: Double = 0.0,
	@SerialName("chance_to_win")
	val chanceToWin: Double = 0.0,
	val winners: List<Long> = emptyList(),
	@SerialName("already_participate")
	val alreadyParticipate: Boolean = false,
	val permissions: RespThreadModelContestPermissions = RespThreadModelContestPermissions(),
)

@Serializable
data class RespPostModel(
	@SerialName("post_id")
	val postId: Double = 0.0,
	@SerialName("thread_id")
	val threadId: Double = 0.0,
	@SerialName("poster_user_id")
	val posterUserId: Double = 0.0,
	@SerialName("poster_username")
	val posterUsername: String = "",
	@SerialName("poster_username_html")
	val posterUsernameHtml: String = "",
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
	val links: RespPostModelLinks = RespPostModelLinks(),
	val permissions: RespPostModelPermissions = RespPostModelPermissions(),
	@SerialName("thread_is_deleted")
	val threadIsDeleted: Boolean = false,
)

@Serializable
data class RespPostModelLinks(
	val permalink: String = "",
	val detail: String = "",
	val thread: String = "",
	val poster: String = "",
	val likes: String = "",
	val report: String = "",
	@SerialName("poster_avatar")
	val posterAvatar: String = "",
)

@Serializable
data class RespPostModelPermissions(
	val view: Boolean = false,
	val edit: Boolean = false,
	val delete: Boolean = false,
	val reply: Boolean = false,
	val like: Boolean = false,
	val report: Boolean = false,
)

@Serializable
data class RespPostCommentModel(
	@SerialName("post_comment_id")
	val postCommentId: Double = 0.0,
	@SerialName("post_id")
	val postId: Double = 0.0,
	@SerialName("thread_id")
	val threadId: Double = 0.0,
	@SerialName("poster_user_id")
	val posterUserId: Double = 0.0,
	@SerialName("poster_username")
	val posterUsername: String = "",
	@SerialName("poster_username_html")
	val posterUsernameHtml: String = "",
	@SerialName("post_comment_create_date")
	val postCommentCreateDate: Double = 0.0,
	@SerialName("post_comment_body")
	val postCommentBody: String = "",
	@SerialName("post_comment_body_html")
	val postCommentBodyHtml: String = "",
	@SerialName("post_comment_body_plain_text")
	val postCommentBodyPlainText: String = "",
	@SerialName("post_comment_like_count")
	val postCommentLikeCount: Double = 0.0,
	@SerialName("user_is_ignored")
	val userIsIgnored: Boolean = false,
	@SerialName("post_comment_is_published")
	val postCommentIsPublished: Boolean = false,
	@SerialName("post_comment_is_deleted")
	val postCommentIsDeleted: Boolean = false,
	@SerialName("post_comment_update_date")
	val postCommentUpdateDate: Double = 0.0,
	val links: RespPostCommentModelLinks = RespPostCommentModelLinks(),
	val permissions: RespPostCommentModelPermissions = RespPostCommentModelPermissions(),
)

@Serializable
data class RespPostCommentModelLinks(
	val permalink: String = "",
	val detail: String = "",
	val post: String = "",
	val thread: String = "",
	val poster: String = "",
	val likes: String = "",
	val report: String = "",
	@SerialName("poster_avatar")
	val posterAvatar: String = "",
)

@Serializable
data class RespPostCommentModelPermissions(
	val view: Boolean = false,
	val edit: Boolean = false,
	val delete: Boolean = false,
	val reply: Boolean = false,
	val like: Boolean = false,
	val report: Boolean = false,
)

@Serializable
data class RespProfilePostModel(
	@SerialName("profile_post_id")
	val profilePostId: Double = 0.0,
	@SerialName("timeline_user_id")
	val timelineUserId: Double = 0.0,
	@SerialName("poster_user_id")
	val posterUserId: Double = 0.0,
	@SerialName("poster_username")
	val posterUsername: String = "",
	@SerialName("poster_username_html")
	val posterUsernameHtml: String = "",
	@SerialName("post_create_date")
	val postCreateDate: Double = 0.0,
	@SerialName("post_body")
	val postBody: String = "",
	@SerialName("post_body_html")
	val postBodyHtml: String = "",
	@SerialName("post_body_plain_text")
	val postBodyPlainText: String = "",
	@SerialName("post_like_count")
	val postLikeCount: Double = 0.0,
	@SerialName("post_comment_count")
	val postCommentCount: Double = 0.0,
	@SerialName("post_comments_is_disabled")
	val postCommentsIsDisabled: Double = 0.0,
	@SerialName("timeline_username")
	val timelineUsername: String = "",
	@SerialName("user_is_ignored")
	val userIsIgnored: Boolean = false,
	@SerialName("post_is_published")
	val postIsPublished: Boolean = false,
	@SerialName("post_is_deleted")
	val postIsDeleted: Boolean = false,
	@SerialName("post_is_liked")
	val postIsLiked: Boolean = false,
	@SerialName("post_is_sticked")
	val postIsSticked: Boolean = false,
	val links: RespProfilePostModelLinks = RespProfilePostModelLinks(),
	val permissions: RespProfilePostModelPermissions = RespProfilePostModelPermissions(),
	@SerialName("timeline_user")
	val timelineUser: RespUserModel = RespUserModel(),
)

@Serializable
data class RespProfilePostModelLinks(
	val permalink: String = "",
	val detail: String = "",
	val timeline: String = "",
	@SerialName("timeline_user")
	val timelineUser: String = "",
	val poster: String = "",
	val likes: String = "",
	val comments: String = "",
	val report: String = "",
	@SerialName("poster_avatar")
	val posterAvatar: String = "",
)

@Serializable
data class RespProfilePostModelPermissions(
	val view: Boolean = false,
	val edit: Boolean = false,
	val delete: Boolean = false,
	val like: Boolean = false,
	val comment: Boolean = false,
	val report: Boolean = false,
	val stick: Boolean = false,
)

@Serializable
data class RespProfilePostCommentModel(
	@SerialName("comment_id")
	val commentId: Double = 0.0,
	@SerialName("profile_post_id")
	val profilePostId: Double = 0.0,
	@SerialName("comment_user_id")
	val commentUserId: Double = 0.0,
	@SerialName("comment_username")
	val commentUsername: String = "",
	@SerialName("comment_username_html")
	val commentUsernameHtml: String = "",
	@SerialName("comment_create_date")
	val commentCreateDate: Double = 0.0,
	@SerialName("comment_body")
	val commentBody: String = "",
	@SerialName("comment_body_html")
	val commentBodyHtml: String = "",
	@SerialName("comment_body_plain_text")
	val commentBodyPlainText: String = "",
	@SerialName("user_is_ignored")
	val userIsIgnored: Boolean = false,
	@SerialName("timeline_user_id")
	val timelineUserId: Double = 0.0,
	val links: RespProfilePostCommentModelLinks = RespProfilePostCommentModelLinks(),
	val permissions: RespProfilePostCommentModelPermissions = RespProfilePostCommentModelPermissions(),
)

@Serializable
data class RespProfilePostCommentModelLinks(
	val detail: String = "",
	@SerialName("profile_post")
	val profilePost: String = "",
	val timeline: String = "",
	@SerialName("timeline_user")
	val timelineUser: String = "",
	val poster: String = "",
	@SerialName("poster_avatar")
	val posterAvatar: String = "",
)

@Serializable
data class RespProfilePostCommentModelPermissions(
	val view: Boolean = false,
	val delete: Boolean = false,
)

@Serializable
data class RespConversationModel(
	@SerialName("conversation_id")
	val conversationId: Double = 0.0,
	@SerialName("conversation_title")
	val conversationTitle: String = "",
	@SerialName("creator_user_id")
	val creatorUserId: Double = 0.0,
	@SerialName("creator_username")
	val creatorUsername: String = "",
	@SerialName("creator_username_html")
	val creatorUsernameHtml: String = "",
	@SerialName("conversation_create_date")
	val conversationCreateDate: Double = 0.0,
	@SerialName("conversation_update_date")
	val conversationUpdateDate: Double = 0.0,
	@SerialName("conversation_last_read_date")
	val conversationLastReadDate: Double = 0.0,
	@SerialName("conversation_online_count")
	val conversationOnlineCount: Double = 0.0,
	@SerialName("is_starred")
	val isStarred: Double = 0.0,
	@SerialName("is_group")
	val isGroup: Double = 0.0,
	@SerialName("is_unread")
	val isUnread: Double = 0.0,
	val alerts: Double = 0.0,
	val permissions: RespConversationModelPermissions = RespConversationModelPermissions(),
	@SerialName("conversation_message_count")
	val conversationMessageCount: Double = 0.0,
	@SerialName("conversation_is_new")
	val conversationIsNew: Boolean = false,
	@SerialName("creator_is_ignored")
	val creatorIsIgnored: Boolean = false,
	@SerialName("conversation_is_open")
	val conversationIsOpen: Boolean = false,
	@SerialName("conversation_is_deleted")
	val conversationIsDeleted: Boolean = false,
	val recipient: RespConversationModelRecipient = RespConversationModelRecipient(),
	val recipients: List<RespConversationModelRecipients> = emptyList(),
	val links: RespConversationModelLinks = RespConversationModelLinks(),
)

@Serializable
data class RespConversationModelPermissions(
	val view: Boolean = false,
	val reply: Boolean = false,
	val invite: Boolean = false,
	@SerialName("manage_invite_links")
	val manageInviteLinks: Boolean = false,
	val kick: Boolean = false,
	@SerialName("upload_avatar")
	val uploadAvatar: Boolean = false,
	val editOwnPost: Boolean = false,
	val stickyMessages: Boolean = false,
)

@Serializable
data class RespConversationModelRecipient(
	@SerialName("user_id")
	val userId: Double = 0.0,
	val username: String = "",
	@SerialName("username_html")
	val usernameHtml: String = "",
	@SerialName("last_activity")
	val lastActivity: Double = 0.0,
	@SerialName("is_online")
	val isOnline: Boolean = false,
	@SerialName("contacts_changed")
	val contactsChanged: Boolean = false,
	val avatar: String = "",
)

@Serializable
data class RespConversationModelRecipients(
	@SerialName("user_id")
	val userId: Double = 0.0,
	val username: String = "",
	@SerialName("username_html")
	val usernameHtml: String = "",
	@SerialName("last_activity")
	val lastActivity: Double = 0.0,
	@SerialName("is_online")
	val isOnline: Boolean = false,
	@SerialName("contacts_changed")
	val contactsChanged: Boolean = false,
	val avatar: String = "",
)

@Serializable
data class RespConversationModelLinks(
	val permalink: String = "",
	val detail: String = "",
	val messages: String = "",
	val avatar: String = "",
)

@Serializable
data class RespConversationMessageModel(
	@SerialName("message_id")
	val messageId: Double = 0.0,
	@SerialName("conversation_id")
	val conversationId: Double = 0.0,
	@SerialName("creator_user_id")
	val creatorUserId: Double = 0.0,
	@SerialName("creator_username")
	val creatorUsername: String = "",
	@SerialName("creator_username_html")
	val creatorUsernameHtml: String = "",
	@SerialName("message_create_date")
	val messageCreateDate: Double = 0.0,
	@SerialName("message_is_unread")
	val messageIsUnread: Double = 0.0,
	@SerialName("message_need_translate")
	val messageNeedTranslate: Boolean = false,
	@SerialName("message_is_system")
	val messageIsSystem: Boolean = false,
	@SerialName("message_edit_date")
	val messageEditDate: Double = 0.0,
	@SerialName("message_body")
	val messageBody: String = "",
	@SerialName("message_body_html")
	val messageBodyHtml: String = "",
	@SerialName("message_body_plain_text")
	val messageBodyPlainText: String = "",
	@SerialName("user_is_ignored")
	val userIsIgnored: Boolean = false,
	val links: RespConversationMessageModelLinks = RespConversationMessageModelLinks(),
	val permissions: RespConversationMessageModelPermissions = RespConversationMessageModelPermissions(),
)

@Serializable
data class RespConversationMessageModelLinks(
	val detail: String = "",
	val conversation: String = "",
	val creator: String = "",
	@SerialName("creator_avatar")
	val creatorAvatar: String = "",
)

@Serializable
data class RespConversationMessageModelPermissions(
	val view: Boolean = false,
	val edit: Boolean = false,
	val delete: Boolean = false,
	@SerialName("stick-unstick")
	val stickUnstick: Boolean = false,
)

@Serializable
data class RespSystemInfo(
	@SerialName("visitor_id")
	val visitorId: Double = 0.0,
	val time: Double = 0.0,
)

// ─── OAuthApi Types ────────────────────────────────────────

@Serializable
@JsonClassDiscriminator("grant_type")
sealed interface OAuthTokenBody

@Serializable
@SerialName("client_credentials")
data class OAuthTokenBodyClientCredentials(
    /** Client ID. */
	@SerialName("client_id")
	val clientId: String,
    /** Client secret. */
	@SerialName("client_secret")
	val clientSecret: String,
    /** Scope. */
	val scope: JsonElement,
) : OAuthTokenBody
@Serializable
@SerialName("authorization_code")
data class OAuthTokenBodyAuthorizationCode(
    /** Authorization code. */
	val code: String,
    /** Client ID. */
	@SerialName("client_id")
	val clientId: String,
    /** Client secret. */
	@SerialName("client_secret")
	val clientSecret: String,
    /** Redirect URI. */
	@SerialName("redirect_uri")
	val redirectUri: String,
    /** Scope. */
	val scope: JsonElement,
) : OAuthTokenBody
@Serializable
@SerialName("refresh_token")
data class OAuthTokenBodyRefreshToken(
    /** Refresh token. */
	@SerialName("refresh_token")
	val refreshToken: String,
    /** Client ID. */
	@SerialName("client_id")
	val clientId: String,
    /** Client secret. */
	@SerialName("client_secret")
	val clientSecret: String,
) : OAuthTokenBody
@Serializable
@SerialName("password")
data class OAuthTokenBodyPassword(
    /** Account username/email. */
	val username: String,
    /** Account password. */
	val password: String,
    /** Client ID. */
	@SerialName("client_id")
	val clientId: String,
    /** Client secret. */
	@SerialName("client_secret")
	val clientSecret: String,
    /** Scope. */
	val scope: JsonElement,
) : OAuthTokenBody

@Serializable
data class OAuthTokenResponse(
	@SerialName("access_token")
	val accessToken: String = "",
	@SerialName("token_type")
	val tokenType: String = "",
	@SerialName("expires_in")
	val expiresIn: Double = 0.0,
	@SerialName("refresh_token")
	val refreshToken: String? = null,
	val scope: String? = null,
)

// ─── AssetsApi Types ────────────────────────────────────────

@Serializable
data class AssetsCssParams(
    /** The names or identifiers of the CSS selectors to retrieve. */
	val css: List<String>? = null,
)

@Serializable
data class AssetsCssResponse(
	val contents: String = "",
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

// ─── CategoriesApi Types ────────────────────────────────────────

@Serializable
data class CategoriesListParams(
    /** Id of parent category. If exists, filter categories that are direct children of that category. */
	@SerialName("parent_category_id")
	val parentCategoryId: Long? = null,
    /** Id of parent forum. If exists, filter categories that are direct children of that forum. */
	@SerialName("parent_forum_id")
	val parentForumId: Long? = null,
    /** Ordering of categories. */
	val order: CategoriesOrder? = null,
)

@Serializable
data class CategoriesListResponse(
	val categories: List<CategoriesListResponseCategories> = emptyList(),
	@SerialName("categories_total")
	val categoriesTotal: Double = 0.0,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class CategoriesListResponseCategoriesLinks(
	val permalink: String = "",
	val detail: String = "",
	@SerialName("sub-categories")
	val subCategories: String = "",
	@SerialName("sub-forums")
	val subForums: String = "",
)

@Serializable
data class CategoriesListResponseCategoriesPermissions(
	val view: Boolean = false,
	val edit: Boolean = false,
	val delete: Boolean = false,
)

@Serializable
data class CategoriesListResponseCategories(
	@SerialName("category_id")
	val categoryId: Double = 0.0,
	@SerialName("category_title")
	val categoryTitle: String = "",
	@SerialName("category_description")
	val categoryDescription: String = "",
	val links: CategoriesListResponseCategoriesLinks = CategoriesListResponseCategoriesLinks(),
	val permissions: CategoriesListResponseCategoriesPermissions = CategoriesListResponseCategoriesPermissions(),
)

@Serializable
data class CategoriesGetResponse(
	val category: CategoriesGetResponseCategory = CategoriesGetResponseCategory(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class CategoriesGetResponseCategoryLinks(
	val permalink: String = "",
	val detail: String = "",
	@SerialName("sub-categories")
	val subCategories: String = "",
	@SerialName("sub-forums")
	val subForums: String = "",
)

@Serializable
data class CategoriesGetResponseCategoryPermissions(
	val view: Boolean = false,
	val edit: Boolean = false,
	val delete: Boolean = false,
)

@Serializable
data class CategoriesGetResponseCategory(
	@SerialName("category_id")
	val categoryId: Double = 0.0,
	@SerialName("category_title")
	val categoryTitle: String = "",
	@SerialName("category_description")
	val categoryDescription: String = "",
	val links: CategoriesGetResponseCategoryLinks = CategoriesGetResponseCategoryLinks(),
	val permissions: CategoriesGetResponseCategoryPermissions = CategoriesGetResponseCategoryPermissions(),
)

// ─── ForumsApi Types ────────────────────────────────────────

@Serializable
data class ForumsListParams(
    /** Id of parent category. If exists, filter forums that are direct children of that category. */
	@SerialName("parent_category_id")
	val parentCategoryId: Long? = null,
    /** Id of parent forum. If exists, filter forums that are direct children of that forum. */
	@SerialName("parent_forum_id")
	val parentForumId: Long? = null,
    /** Ordering of forums. */
	val order: CategoriesOrder? = null,
)

@Serializable
data class ForumsListResponse(
	val forums: List<ForumsListResponseForums> = emptyList(),
	@SerialName("forums_total")
	val forumsTotal: Double = 0.0,
	val tabs: List<ForumsListResponseTabs> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ForumsListResponseForumsForumPrefixesGroupPrefixes(
	@SerialName("prefix_id")
	val prefixId: Double = 0.0,
	@SerialName("prefix_title")
	val prefixTitle: String = "",
)

@Serializable
data class ForumsListResponseForumsForumPrefixes(
	@SerialName("group_title")
	val groupTitle: String = "",
	@SerialName("group_prefixes")
	val groupPrefixes: List<ForumsListResponseForumsForumPrefixesGroupPrefixes> = emptyList(),
)

@Serializable
data class ForumsListResponseForumsLinks(
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
data class ForumsListResponseForumsPermissions(
	val view: Boolean = false,
	val edit: Boolean = false,
	val delete: Boolean = false,
	@SerialName("create_thread")
	val createThread: Boolean = false,
	@SerialName("tag_thread")
	val tagThread: Boolean = false,
	val follow: Boolean = false,
)

@Serializable
data class ForumsListResponseForums(
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
	val forumPrefixes: List<ForumsListResponseForumsForumPrefixes> = emptyList(),
	@SerialName("thread_default_prefix_id")
	val threadDefaultPrefixId: Double = 0.0,
	@SerialName("thread_prefix_is_required")
	val threadPrefixIsRequired: Boolean = false,
	val links: ForumsListResponseForumsLinks = ForumsListResponseForumsLinks(),
	val permissions: ForumsListResponseForumsPermissions = ForumsListResponseForumsPermissions(),
	@SerialName("forum_is_followed")
	val forumIsFollowed: Boolean = false,
)

@Serializable
data class ForumsListResponseTabs(
	@SerialName("link_title")
	val linkTitle: String = "",
	val isDefault: Boolean = false,
	val title: String = "",
	val isHidden: Boolean = false,
)

@Serializable
data class ForumsGroupedResponse(
	val data: JsonElement = JsonNull,
	val tabs: List<ForumsGroupedResponseTabs> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ForumsGroupedResponseTabs(
	@SerialName("link_title")
	val linkTitle: String = "",
	val isDefault: Boolean = false,
	val title: String = "",
	val isHidden: Boolean = false,
)

@Serializable
data class ForumsGetResponse(
	val forum: ForumsGetResponseForum = ForumsGetResponseForum(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ForumsGetResponseForumForumPrefixesGroupPrefixes(
	@SerialName("prefix_id")
	val prefixId: Double = 0.0,
	@SerialName("prefix_title")
	val prefixTitle: String = "",
)

@Serializable
data class ForumsGetResponseForumForumPrefixes(
	@SerialName("group_title")
	val groupTitle: String = "",
	@SerialName("group_prefixes")
	val groupPrefixes: List<ForumsGetResponseForumForumPrefixesGroupPrefixes> = emptyList(),
)

@Serializable
data class ForumsGetResponseForumLinks(
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
data class ForumsGetResponseForumPermissions(
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
data class ForumsGetResponseForum(
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
	val forumPrefixes: List<ForumsGetResponseForumForumPrefixes> = emptyList(),
	@SerialName("thread_default_prefix_id")
	val threadDefaultPrefixId: Double = 0.0,
	@SerialName("thread_prefix_is_required")
	val threadPrefixIsRequired: Boolean = false,
	val links: ForumsGetResponseForumLinks = ForumsGetResponseForumLinks(),
	val permissions: ForumsGetResponseForumPermissions = ForumsGetResponseForumPermissions(),
	@SerialName("forum_is_followed")
	val forumIsFollowed: Boolean = false,
)

@Serializable
data class ForumsFollowersResponse(
	val users: List<ForumsFollowersResponseUsers> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ForumsFollowersResponseUsersFollow(
	val post: Boolean = false,
	val alert: Boolean = false,
	val email: Boolean = false,
)

@Serializable
data class ForumsFollowersResponseUsers(
	@SerialName("user_id")
	val userId: Double = 0.0,
	val username: String = "",
	val follow: ForumsFollowersResponseUsersFollow = ForumsFollowersResponseUsersFollow(),
)

@Serializable
data class ForumsFollowBody(
    /** Whether to receive notification for post. */
	val post: Boolean? = null,
    /** Whether to receive notification as alert. */
	val alert: Boolean? = null,
    /** Whether to receive notification as email. */
	val email: Boolean? = null,
    /** Prefix ids. */
	@SerialName("prefix_ids")
	val prefixIds: List<Long>? = null,
    /** Minimal contest amount. (Only for 766 forumId) */
	@SerialName("minimal_contest_amount")
	val minimalContestAmount: Long? = null,
)

@Serializable
data class ForumsFollowResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ForumsUnfollowResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ForumsFollowedParams(
    /** If included in the request, only the forum count is returned as forums_total. */
	val total: Boolean? = null,
)

@Serializable
data class ForumsFollowedResponse(
	val forums: List<ForumsFollowedResponseForums> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ForumsFollowedResponseForumsForumPrefixesGroupPrefixes(
	@SerialName("prefix_id")
	val prefixId: Double = 0.0,
	@SerialName("prefix_title")
	val prefixTitle: String = "",
)

@Serializable
data class ForumsFollowedResponseForumsForumPrefixes(
	@SerialName("group_title")
	val groupTitle: String = "",
	@SerialName("group_prefixes")
	val groupPrefixes: List<ForumsFollowedResponseForumsForumPrefixesGroupPrefixes> = emptyList(),
)

@Serializable
data class ForumsFollowedResponseForumsLinks(
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
data class ForumsFollowedResponseForumsPermissions(
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
data class ForumsFollowedResponseForumsFollow(
	val post: Boolean = false,
	val alert: Boolean = false,
	val email: Boolean = false,
)

@Serializable
data class ForumsFollowedResponseForums(
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
	val forumPrefixes: List<ForumsFollowedResponseForumsForumPrefixes> = emptyList(),
	@SerialName("thread_default_prefix_id")
	val threadDefaultPrefixId: Double = 0.0,
	@SerialName("thread_prefix_is_required")
	val threadPrefixIsRequired: Boolean = false,
	val links: ForumsFollowedResponseForumsLinks = ForumsFollowedResponseForumsLinks(),
	val permissions: ForumsFollowedResponseForumsPermissions = ForumsFollowedResponseForumsPermissions(),
	@SerialName("forum_is_followed")
	val forumIsFollowed: Boolean = false,
	val follow: ForumsFollowedResponseForumsFollow = ForumsFollowedResponseForumsFollow(),
)

@Serializable
data class ForumsGetFeedOptionsResponse(
	val forums: List<ForumsGetFeedOptionsResponseForums> = emptyList(),
	@SerialName("excluded_forums_ids")
	val excludedForumsIds: List<Long> = emptyList(),
	@SerialName("default_excluded_forums_ids")
	val defaultExcludedForumsIds: List<Long> = emptyList(),
	val keywords: String = "",
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ForumsGetFeedOptionsResponseForumsLinks(
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
data class ForumsGetFeedOptionsResponseForumsPermissions(
	val view: Boolean = false,
	val edit: Boolean = false,
	val delete: Boolean = false,
	@SerialName("create_thread")
	val createThread: Boolean = false,
	@SerialName("tag_thread")
	val tagThread: Boolean = false,
	val follow: Boolean = false,
)

@Serializable
data class ForumsGetFeedOptionsResponseForums(
	@SerialName("forum_id")
	val forumId: Double = 0.0,
	@SerialName("forum_title")
	val forumTitle: String = "",
	@SerialName("forum_description")
	val forumDescription: String = "",
	@SerialName("parent_node_id")
	val parentNodeId: Double = 0.0,
	val links: ForumsGetFeedOptionsResponseForumsLinks = ForumsGetFeedOptionsResponseForumsLinks(),
	val permissions: ForumsGetFeedOptionsResponseForumsPermissions = ForumsGetFeedOptionsResponseForumsPermissions(),
	@SerialName("forum_is_followed")
	val forumIsFollowed: Boolean = false,
	@SerialName("has_children")
	val hasChildren: Boolean = false,
)

@Serializable
data class ForumsEditFeedOptionsBody(
    /** Array of forum ids to exclude from the feed. */
	@SerialName("node_ids")
	val nodeIds: List<Long>? = null,
    /** List of keywords to exclude specific threads from the feed. */
	val keywords: List<String>? = null,
)

@Serializable
data class ForumsEditFeedOptionsResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

// ─── LinksApi Types ────────────────────────────────────────

@Serializable
data class LinksListResponse(
	@SerialName("link-forums")
	val linkForums: List<RespLinkModel> = emptyList(),
	@SerialName("link-forums_total")
	val linkForumsTotal: Double = 0.0,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class LinksGetResponse(
	@SerialName("link-forum")
	val linkForum: RespLinkModel = RespLinkModel(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

// ─── PagesApi Types ────────────────────────────────────────

@Serializable
data class PagesListParams(
    /** Id of parent page. If exists, filter pages that are direct children of that page. */
	@SerialName("parent_page_id")
	val parentPageId: Long? = null,
    /** Ordering of pages. */
	val order: CategoriesOrder? = null,
)

@Serializable
data class PagesListResponse(
	val pages: List<PagesListResponsePages> = emptyList(),
	@SerialName("pages_total")
	val pagesTotal: Double = 0.0,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class PagesListResponsePagesLinks(
	val permalink: String = "",
	val detail: String = "",
	@SerialName("sub-pages")
	val subPages: String = "",
)

@Serializable
data class PagesListResponsePagesPermissions(
	val view: Boolean = false,
	val edit: Boolean = false,
	val delete: Boolean = false,
)

@Serializable
data class PagesListResponsePages(
	@SerialName("page_id")
	val pageId: Double = 0.0,
	@SerialName("page_title")
	val pageTitle: String = "",
	@SerialName("page_description")
	val pageDescription: String = "",
	val links: PagesListResponsePagesLinks = PagesListResponsePagesLinks(),
	val permissions: PagesListResponsePagesPermissions = PagesListResponsePagesPermissions(),
)

@Serializable
data class PagesGetResponse(
	val page: PagesGetResponsePage = PagesGetResponsePage(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class PagesGetResponsePageLinks(
	val permalink: String = "",
	val detail: String = "",
	@SerialName("sub-pages")
	val subPages: String = "",
)

@Serializable
data class PagesGetResponsePagePermissions(
	val view: Boolean = false,
	val edit: Boolean = false,
	val delete: Boolean = false,
)

@Serializable
data class PagesGetResponsePage(
	@SerialName("page_id")
	val pageId: Double = 0.0,
	@SerialName("page_title")
	val pageTitle: String = "",
	@SerialName("page_description")
	val pageDescription: String = "",
	@SerialName("page_view_count")
	val pageViewCount: Double = 0.0,
	val links: PagesGetResponsePageLinks = PagesGetResponsePageLinks(),
	val permissions: PagesGetResponsePagePermissions = PagesGetResponsePagePermissions(),
	@SerialName("page_html")
	val pageHtml: String = "",
)

// ─── NavigationApi Types ────────────────────────────────────────

@Serializable
data class NavigationListParams(
    /** Id of parent element. If exists, filter elements that are direct children of that element. */
	val parent: Long? = null,
)

@Serializable
data class NavigationListResponse(
	val elements: List<NavigationListResponseElements> = emptyList(),
	@SerialName("elements_count")
	val elementsCount: Double = 0.0,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class NavigationListResponseElementsLinks(
	val permalink: String = "",
	val detail: String = "",
	@SerialName("sub-categories")
	val subCategories: String = "",
	@SerialName("sub-forums")
	val subForums: String = "",
	@SerialName("sub-elements")
	val subElements: String = "",
)

@Serializable
data class NavigationListResponseElementsPermissions(
	val view: Boolean = false,
	val edit: Boolean = false,
	val delete: Boolean = false,
)

@Serializable
data class NavigationListResponseElements(
	@SerialName("category_id")
	val categoryId: Double = 0.0,
	@SerialName("category_title")
	val categoryTitle: String = "",
	@SerialName("category_description")
	val categoryDescription: String = "",
	val links: NavigationListResponseElementsLinks = NavigationListResponseElementsLinks(),
	val permissions: NavigationListResponseElementsPermissions = NavigationListResponseElementsPermissions(),
	@SerialName("navigation_type")
	val navigationType: String = "",
	@SerialName("navigation_id")
	val navigationId: Double = 0.0,
	@SerialName("navigation_parent_id")
	val navigationParentId: Double = 0.0,
	@SerialName("has_sub_elements")
	val hasSubElements: Boolean = false,
)

// ─── ThreadsApi Types ────────────────────────────────────────

@Serializable
data class ThreadsListParams(
    /** Id of the containing forum. */
	@SerialName("forum_id")
	val forumId: Long? = null,
    /** Tab to get threads from. */
	val tab: String? = null,
    /** Thread state. Works only if forum_id is set. */
	val state: State? = null,
    /** Filter to get only threads created within the selected period. Works only if forum_id is set. */
	val period: Period? = null,
    /** Thread title. */
	val title: String? = null,
    /** Search only in titles. */
	@SerialName("title_only")
	val titleOnly: Boolean? = null,
    /** Filter to get only threads created by the specified user. */
	@SerialName("creator_user_id")
	val creatorUserId: Long? = null,
    /** Filter to get only sticky or non-sticky threads. By default, all threads will be included and sticky ones will be at the top of the result on the first page. In mixed mode, sticky threads are not counted towards threads_total and does not affect pagination. */
	val sticky: Boolean? = null,
    /** Filter to get only threads with the specified prefix. */
	@SerialName("prefix_ids[]")
	val prefixIds: List<Long>? = null,
    /** Filter to get only threads without the specified prefix. */
	@SerialName("prefix_ids_not[]")
	val prefixIdsNot: List<Long>? = null,
    /** Filter to get only threads with the specified tag. */
	@SerialName("thread_tag_id")
	val threadTagId: Long? = null,
    /** Page number of threads. */
	val page: Long? = null,
    /** Number of threads in a page. */
	val limit: Long? = null,
    /** Ordering of threads. */
	val order: ThreadsOrder? = null,
    /** Direction of threads ordering. */
	val direction: Direction? = null,
    /** Filter threads by creation date. Only works with 'thread_create_date' and 'thread_create_date_reverse' ordering. */
	@SerialName("thread_create_date")
	val threadCreateDate: Long? = null,
    /** Filter threads by update date. Only works with 'thread_update_date' and 'thread_update_date_reverse' ordering. */
	@SerialName("thread_update_date")
	val threadUpdateDate: Long? = null,
    /** List of fields to include. */
	@SerialName("fields_include")
	val fieldsInclude: JsonElement? = null,
)

@Serializable
data class ThreadsListResponse(
	val threads: List<RespThreadModel> = emptyList(),
	val forum: ThreadsListResponseForum = ThreadsListResponseForum(),
	@SerialName("threads_total")
	val threadsTotal: Double = 0.0,
	val links: ThreadsListResponseLinks = ThreadsListResponseLinks(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ThreadsListResponseForumLinks(
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
data class ThreadsListResponseForumPermissions(
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
data class ThreadsListResponseForum(
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
	val forumPrefixes: List<JsonElement> = emptyList(),
	@SerialName("thread_default_prefix_id")
	val threadDefaultPrefixId: Double = 0.0,
	@SerialName("thread_prefix_is_required")
	val threadPrefixIsRequired: Boolean = false,
	val links: ThreadsListResponseForumLinks = ThreadsListResponseForumLinks(),
	val permissions: ThreadsListResponseForumPermissions = ThreadsListResponseForumPermissions(),
	@SerialName("forum_is_followed")
	val forumIsFollowed: Boolean = false,
)

@Serializable
data class ThreadsListResponseLinks(
	val pages: Double = 0.0,
	val page: Double = 0.0,
	val next: String = "",
)

@Serializable
data class ThreadsCreateBody(
    /** Content of the new thread. */
	@SerialName("post_body")
	val postBody: String,
    /** Id of the target forum. */
	@SerialName("forum_id")
	val forumId: Long,
    /** Thread title. Can be skipped if title_en set. */
	val title: String? = null,
    /** Thread english title. Can be skipped if title set. */
	@SerialName("title_en")
	val titleEn: String? = null,
    /** Prefix ids. */
	@SerialName("prefix_id")
	val prefixId: List<Long>? = null,
    /** Thread tags. */
	val tags: List<String>? = null,
    /** Hide contacts. */
	@SerialName("hide_contacts")
	val hideContacts: Boolean? = null,
    /** Allow ask hidden content. */
	@SerialName("allow_ask_hidden_content")
	val allowAskHiddenContent: Boolean? = null,
    /** Allow to reply only users with chosen or higher group.. Default: 2 */
	@SerialName("reply_group")
	val replyGroup: ReplyGroup = ReplyGroup.V2,
    /** Allow commenting if user can't post in thread. */
	@SerialName("comment_ignore_group")
	val commentIgnoreGroup: Boolean? = null,
    /** Don't alert followers about thread creation. */
	@SerialName("dont_alert_followers")
	val dontAlertFollowers: Boolean? = null,
    /** Date to schedule thread creation (format: `DD-MM-YYYY`). */
	@SerialName("schedule_date")
	val scheduleDate: String? = null,
    /** Time to schedule thread creation (format: `HH:MM`). */
	@SerialName("schedule_time")
	val scheduleTime: String? = null,
    /** Watch thread state. */
	@SerialName("watch_thread_state")
	val watchThreadState: Boolean? = null,
    /** Receive forum notifications of new posts in this thread. */
	@SerialName("watch_thread")
	val watchThread: Boolean? = null,
    /** Receive email notifications of new posts in this thread. */
	@SerialName("watch_thread_email")
	val watchThreadEmail: Boolean? = null,
)

@Serializable
data class ThreadsCreateResponse(
	val thread: RespThreadModel = RespThreadModel(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ThreadsCreateContestBody(
    /** Content of the new contest. */
	@SerialName("post_body")
	val postBody: String,
    /** Contest type.. Default: by_finish_date */
	@SerialName("contest_type")
	val contestType: ContestType,
    /** Prize type. */
	@SerialName("prize_type")
	val prizeType: PrizeType,
    /** Sympathies for this week. */
	@SerialName("require_like_count")
	val requireLikeCount: Long,
    /** Sympathies for all time. */
	@SerialName("require_total_like_count")
	val requireTotalLikeCount: Long,
    /** Thread title. Can be skipped if title_en set. */
	val title: String? = null,
    /** Thread english title. Can be skipped if title set. */
	@SerialName("title_en")
	val titleEn: String? = null,
    /** Giveaway duration value. The maximum duration is 3 days. Required if contest_type is by_finish_date. */
	@SerialName("length_value")
	val lengthValue: Long? = null,
    /** Giveaway duration type. The maximum duration is 3 days. Required if contest_type is by_finish_date. */
	@SerialName("length_option")
	val lengthOption: LengthOption? = null,
    /** Winner count (prize count). Optional if prize_type is money. */
	@SerialName("count_winners")
	val countWinners: Long? = null,
    /** How much money will each winner receive. Optional if prize_type is money. */
	@SerialName("prize_data_money")
	val prizeDataMoney: Double? = null,
    /** Enable the distribution of money prizes by places. Optional if prize_type is money. */
	@SerialName("is_money_places")
	val isMoneyPlaces: Boolean? = null,
    /** How much money will receive each place. Required if is_money_places is 1. */
	@SerialName("prize_data_places")
	val prizeDataPlaces: List<Double>? = null,
    /** Which upgrade will each winner receive. Required if prize_type is upgrades. */
	@SerialName("prize_data_upgrade")
	val prizeDataUpgrade: PrizeDataUpgrade? = null,
    /** Secret answer of your account. */
	@SerialName("secret_answer")
	val secretAnswer: String? = null,
    /** Thread tags. */
	val tags: List<String>? = null,
    /** Allow to reply only users with chosen or higher group.. Default: 2 */
	@SerialName("reply_group")
	val replyGroup: ReplyGroup = ReplyGroup.V2,
    /** Allow commenting if user can't post in thread. */
	@SerialName("comment_ignore_group")
	val commentIgnoreGroup: Boolean? = null,
    /** Don't alert followers about thread creation. */
	@SerialName("dont_alert_followers")
	val dontAlertFollowers: Boolean? = null,
    /** Hide contacts. */
	@SerialName("hide_contacts")
	val hideContacts: Boolean? = null,
    /** Allow ask hidden content. */
	@SerialName("allow_ask_hidden_content")
	val allowAskHiddenContent: Boolean? = null,
    /** Date to schedule thread creation (format: `DD-MM-YYYY`). */
	@SerialName("schedule_date")
	val scheduleDate: String? = null,
    /** Time to schedule thread creation (format: `HH:MM`). */
	@SerialName("schedule_time")
	val scheduleTime: String? = null,
    /** Watch thread state. */
	@SerialName("watch_thread_state")
	val watchThreadState: Boolean? = null,
    /** Receive forum notifications of new posts in this thread. */
	@SerialName("watch_thread")
	val watchThread: Boolean? = null,
    /** Receive email notifications of new posts in this thread. */
	@SerialName("watch_thread_email")
	val watchThreadEmail: Boolean? = null,
)

@Serializable
data class ThreadsCreateContestResponse(
	val thread: RespThreadModel = RespThreadModel(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ThreadsClaimBody(
    /** To whom the complaint is filed. Specify a nickname or a link to the profile. */
	@SerialName("as_responder")
	val asResponder: String,
    /** Did you buy account on the market? */
	@SerialName("as_is_market_deal")
	val asIsMarketDeal: Boolean,
    /** Indicate the amount by which the responder deceived you. */
	@SerialName("as_amount")
	val asAmount: Double,
    /** The transaction took place through a guarantor or there was a transfer to the market with a hold? Required if as_is_market_deal is 0. */
	@SerialName("transfer_type")
	val transferType: TransferType,
    /** You should describe what's happened. - describe the situation in a nutshell. If you wish, you can describe the situation in more detail using the "Spoiler" function. - attach screenshots of correspondence. You may upload to the site [Imgur](https://imgur.com/upload) - for convenience, use Ctrl + V when uploading screenshots to the album. - other evidence; - notify the respondent about the complaint you created, familiarize him with hidden content Describe the situation in as much detail as possible. */
	@SerialName("post_body")
	val postBody: String,
    /** Market item id. Required if as_is_market_deal is 1. */
	@SerialName("as_market_item_id")
	val asMarketItemId: Long? = null,
    /** Contacts and wallets of the responder. Specify the known data about the responder, if any. Optional if as_is_market_deal is 0. */
	@SerialName("as_data")
	val asData: String? = null,
    /** Currency of Claim. */
	val currency: Currency? = null,
    /** Pay claim fee now or later. (Only for transfer_type = notsafe) */
	@SerialName("pay_claim")
	val payClaim: PayClaim? = null,
    /** Funds transfer receipt. Upload a receipt for the transfer of funds, use the "View receipt" button in your wallet. May be uploaded to [Imgur](https://imgur.com/upload). Write "no" if you have not paid. Required if as_is_market_deal is 0. */
	@SerialName("as_funds_receipt")
	val asFundsReceipt: String? = null,
    /** Screenshot showing the respondent's Telegram login. If the correspondence was conducted in Telegram, upload a screenshot that will display the respondent's Telegram login against the background of your dialogue. The screenshot may be uploaded to [Imgur](https://imgur.com/upload). If the correspondence was conducted elsewhere, write "no". */
	@SerialName("as_tg_login_screenshot")
	val asTgLoginScreenshot: String? = null,
    /** Thread tags. */
	val tags: List<String>? = null,
    /** Hide contacts. */
	@SerialName("hide_contacts")
	val hideContacts: Boolean? = null,
    /** Allow ask hidden content. */
	@SerialName("allow_ask_hidden_content")
	val allowAskHiddenContent: Boolean? = null,
    /** Allow to reply only users with chosen or higher group.. Default: 2 */
	@SerialName("reply_group")
	val replyGroup: ReplyGroup = ReplyGroup.V2,
    /** Allow commenting if user can't post in thread. */
	@SerialName("comment_ignore_group")
	val commentIgnoreGroup: Boolean? = null,
    /** Don't alert followers about thread creation. */
	@SerialName("dont_alert_followers")
	val dontAlertFollowers: Boolean? = null,
    /** Date to schedule thread creation (format: `DD-MM-YYYY`). */
	@SerialName("schedule_date")
	val scheduleDate: String? = null,
    /** Time to schedule thread creation (format: `HH:MM`). */
	@SerialName("schedule_time")
	val scheduleTime: String? = null,
    /** Watch thread state. */
	@SerialName("watch_thread_state")
	val watchThreadState: Boolean? = null,
    /** Receive forum notifications of new posts in this thread. */
	@SerialName("watch_thread")
	val watchThread: Boolean? = null,
    /** Receive email notifications of new posts in this thread. */
	@SerialName("watch_thread_email")
	val watchThreadEmail: Boolean? = null,
)

@Serializable
data class ThreadsClaimResponse(
	val thread: RespThreadModel = RespThreadModel(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ThreadsGetParams(
    /** List of fields to include. */
	@SerialName("fields_include")
	val fieldsInclude: JsonElement? = null,
)

@Serializable
data class ThreadsGetResponse(
	val thread: RespThreadModel = RespThreadModel(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ThreadsEditBody(
    /** Thread title. */
	val title: String? = null,
    /** Thread title english. */
	@SerialName("title_en")
	val titleEn: String? = null,
    /** Prefix ids. Set "0" to remove all thread prefixes. */
	@SerialName("prefix_id")
	val prefixId: List<Long>? = null,
    /** Thread tags. */
	val tags: List<String>? = null,
    /** Discussion state. */
	@SerialName("discussion_open")
	val discussionOpen: Boolean? = null,
    /** Hide contacts. */
	@SerialName("hide_contacts")
	val hideContacts: Boolean? = null,
    /** Allow ask hidden content. */
	@SerialName("allow_ask_hidden_content")
	val allowAskHiddenContent: Boolean? = null,
    /** Allow to reply only users with chosen or higher group. */
	@SerialName("reply_group")
	val replyGroup: ReplyGroup? = null,
    /** Allow commenting if user can't post in thread. */
	@SerialName("comment_ignore_group")
	val commentIgnoreGroup: Boolean? = null,
)

@Serializable
data class ThreadsEditResponse(
	val thread: RespThreadModel = RespThreadModel(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ThreadsDeleteBody(
    /** Reason of the thread removal. */
	val reason: String? = null,
)

@Serializable
data class ThreadsDeleteResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ThreadsMoveBody(
    /** Forum id. */
	@SerialName("node_id")
	val nodeId: String,
    /** Thread title. */
	val title: String? = null,
    /** Thread title english. */
	@SerialName("title_en")
	val titleEn: String? = null,
    /** Prefix ids. Set "0" to remove all thread prefixes. */
	@SerialName("prefix_id")
	val prefixId: List<Long>? = null,
    /** Apply thread prefix. */
	@SerialName("apply_thread_prefix")
	val applyThreadPrefix: Boolean? = null,
    /** Send a notification to users who are followed to target node. */
	@SerialName("send_alert")
	val sendAlert: Boolean? = null,
)

@Serializable
data class ThreadsMoveResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ThreadsBumpResponse(
	val status: String = "",
	val message: String = "",
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ThreadsHideResponse(
	val status: String = "",
	val message: String = "",
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ThreadsStarResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ThreadsUnstarResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ThreadsFollowersResponse(
	val users: List<ThreadsFollowersResponseUsers> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ThreadsFollowersResponseUsersFollow(
	val alert: Boolean = false,
	val email: Boolean = false,
)

@Serializable
data class ThreadsFollowersResponseUsers(
	@SerialName("user_id")
	val userId: Double = 0.0,
	val username: String = "",
	val follow: ThreadsFollowersResponseUsersFollow = ThreadsFollowersResponseUsersFollow(),
)

@Serializable
data class ThreadsFollowBody(
    /** Whether to receive notification as email. */
	val email: Boolean? = null,
)

@Serializable
data class ThreadsFollowResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ThreadsUnfollowResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ThreadsFollowedParams(
    /** If included in the request, only the thread count is returned as threads_total. */
	val total: Boolean? = null,
    /** List of fields to include. */
	@SerialName("fields_include")
	val fieldsInclude: JsonElement? = null,
)

@Serializable
data class ThreadsFollowedResponse(
	val threads: List<ThreadsFollowedResponseThreads> = emptyList(),
	@SerialName("threads_total")
	val threadsTotal: Double = 0.0,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ThreadsFollowedResponseThreadsFirstPostLikeUsers(
	@SerialName("user_id")
	val userId: Double = 0.0,
	val username: String = "",
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Double = 0.0,
	@SerialName("is_banned")
	val isBanned: Double = 0.0,
	@SerialName("uniq_username_css")
	val uniqUsernameCss: String = "",
)

@Serializable
data class ThreadsFollowedResponseThreadsFirstPostLinks(
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
data class ThreadsFollowedResponseThreadsFirstPostPermissions(
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
data class ThreadsFollowedResponseThreadsFirstPost(
	@SerialName("post_id")
	val postId: Double = 0.0,
	@SerialName("thread_id")
	val threadId: Double = 0.0,
	@SerialName("poster_user_id")
	val posterUserId: Double = 0.0,
	@SerialName("poster_username")
	val posterUsername: String = "",
	@SerialName("poster_username_html")
	val posterUsernameHtml: String = "",
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
	val likeUsers: List<ThreadsFollowedResponseThreadsFirstPostLikeUsers> = emptyList(),
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
	val links: ThreadsFollowedResponseThreadsFirstPostLinks = ThreadsFollowedResponseThreadsFirstPostLinks(),
	val permissions: ThreadsFollowedResponseThreadsFirstPostPermissions = ThreadsFollowedResponseThreadsFirstPostPermissions(),
)

@Serializable
data class ThreadsFollowedResponseThreadsLinks(
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
	@SerialName("last_post")
	val lastPost: String = "",
)

@Serializable
data class ThreadsFollowedResponseThreadsPermissions(
	val view: Boolean = false,
	val delete: Boolean = false,
	val follow: Boolean = false,
	val post: Boolean = false,
	@SerialName("upload_attachment")
	val uploadAttachment: Boolean = false,
	val edit: Boolean = false,
	@SerialName("edit_title")
	val editTitle: Boolean = false,
	@SerialName("edit_tags")
	val editTags: Boolean = false,
)

@Serializable
data class ThreadsFollowedResponseThreadsForumLinks(
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
data class ThreadsFollowedResponseThreadsForumPermissions(
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
data class ThreadsFollowedResponseThreadsForum(
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
	val forumPrefixes: List<JsonElement> = emptyList(),
	@SerialName("thread_default_prefix_id")
	val threadDefaultPrefixId: Double = 0.0,
	@SerialName("thread_prefix_is_required")
	val threadPrefixIsRequired: Boolean = false,
	val links: ThreadsFollowedResponseThreadsForumLinks = ThreadsFollowedResponseThreadsForumLinks(),
	val permissions: ThreadsFollowedResponseThreadsForumPermissions = ThreadsFollowedResponseThreadsForumPermissions(),
	@SerialName("forum_is_followed")
	val forumIsFollowed: Boolean = false,
)

@Serializable
data class ThreadsFollowedResponseThreadsFollow(
	val alert: Boolean = false,
	val email: Boolean = false,
)

@Serializable
data class ThreadsFollowedResponseThreads(
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
	@SerialName("creator_username_html")
	val creatorUsernameHtml: String = "",
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
	val firstPost: ThreadsFollowedResponseThreadsFirstPost = ThreadsFollowedResponseThreadsFirstPost(),
	@SerialName("thread_prefixes")
	val threadPrefixes: List<JsonElement> = emptyList(),
	@SerialName("thread_tags")
	val threadTags: JsonElement = JsonNull,
	val links: ThreadsFollowedResponseThreadsLinks = ThreadsFollowedResponseThreadsLinks(),
	val permissions: ThreadsFollowedResponseThreadsPermissions = ThreadsFollowedResponseThreadsPermissions(),
	val forum: ThreadsFollowedResponseThreadsForum = ThreadsFollowedResponseThreadsForum(),
	val follow: ThreadsFollowedResponseThreadsFollow = ThreadsFollowedResponseThreadsFollow(),
)

@Serializable
data class ThreadsNavigationResponse(
	val elements: List<ThreadsNavigationResponseElements> = emptyList(),
	@SerialName("elements_count")
	val elementsCount: Double = 0.0,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ThreadsNavigationResponseElementsLinks(
	val permalink: String = "",
	val detail: String = "",
	@SerialName("sub-categories")
	val subCategories: String = "",
	@SerialName("sub-forums")
	val subForums: String = "",
	@SerialName("sub-elements")
	val subElements: String = "",
)

@Serializable
data class ThreadsNavigationResponseElementsPermissions(
	val view: Boolean = false,
	val edit: Boolean = false,
	val delete: Boolean = false,
)

@Serializable
data class ThreadsNavigationResponseElements(
	@SerialName("category_id")
	val categoryId: Double = 0.0,
	@SerialName("category_title")
	val categoryTitle: String = "",
	@SerialName("category_description")
	val categoryDescription: String = "",
	val links: ThreadsNavigationResponseElementsLinks = ThreadsNavigationResponseElementsLinks(),
	val permissions: ThreadsNavigationResponseElementsPermissions = ThreadsNavigationResponseElementsPermissions(),
	@SerialName("navigation_type")
	val navigationType: String = "",
	@SerialName("navigation_id")
	val navigationId: Double = 0.0,
	@SerialName("navigation_depth")
	val navigationDepth: Double = 0.0,
	@SerialName("navigation_parent_id")
	val navigationParentId: Double = 0.0,
	@SerialName("has_sub_elements")
	val hasSubElements: Boolean = false,
)

@Serializable
data class ThreadsPollGetResponse(
	val poll: ThreadsPollGetResponsePoll = ThreadsPollGetResponsePoll(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ThreadsPollGetResponsePollResponses(
	@SerialName("response_id")
	val responseId: Double = 0.0,
	@SerialName("response_answer")
	val responseAnswer: String = "",
	@SerialName("response_vote_count")
	val responseVoteCount: Double = 0.0,
)

@Serializable
data class ThreadsPollGetResponsePollPermissions(
	val vote: Boolean = false,
	val result: Boolean = false,
)

@Serializable
data class ThreadsPollGetResponsePollLinks(
	val vote: String = "",
)

@Serializable
data class ThreadsPollGetResponsePoll(
	@SerialName("poll_id")
	val pollId: Double = 0.0,
	@SerialName("poll_question")
	val pollQuestion: String = "",
	@SerialName("poll_vote_count")
	val pollVoteCount: Double = 0.0,
	@SerialName("poll_max_votes")
	val pollMaxVotes: Double = 0.0,
	@SerialName("poll_is_open")
	val pollIsOpen: Boolean = false,
	@SerialName("poll_is_voted")
	val pollIsVoted: Boolean = false,
	val responses: List<ThreadsPollGetResponsePollResponses> = emptyList(),
	val permissions: ThreadsPollGetResponsePollPermissions = ThreadsPollGetResponsePollPermissions(),
	val links: ThreadsPollGetResponsePollLinks = ThreadsPollGetResponsePollLinks(),
)

@Serializable
data class ThreadsPollVoteBody(
    /** The id of the response to vote for. Can be skipped if response_ids set. */
	@SerialName("response_id")
	val responseId: Long? = null,
    /** An array of ids of responses (if the poll allows multiple choices). */
	@SerialName("response_ids")
	val responseIds: List<Long>? = null,
)

@Serializable
data class ThreadsPollVoteResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ThreadsUnreadParams(
    /** Maximum number of result threads. The limit may get decreased if the value is too large (depending on the system configuration). */
	val limit: Long? = null,
    /** Id of the container forum to search for threads. Child forums of the specified forum will be included in the search. */
	@SerialName("forum_id")
	val forumId: Long? = null,
    /** Number of thread data to be returned. Default value is 20. */
	@SerialName("data_limit")
	val dataLimit: Long? = null,
)

@Serializable
data class ThreadsUnreadResponse(
	val threads: List<RespThreadModel> = emptyList(),
	val data: List<ThreadsUnreadResponseData> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ThreadsUnreadResponseDataFirstPostLikeUsers(
	@SerialName("user_id")
	val userId: Double = 0.0,
	val username: String = "",
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Double = 0.0,
	@SerialName("is_banned")
	val isBanned: Double = 0.0,
	@SerialName("uniq_username_css")
	val uniqUsernameCss: String = "",
)

@Serializable
data class ThreadsUnreadResponseDataFirstPostLinks(
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
data class ThreadsUnreadResponseDataFirstPostPermissions(
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
data class ThreadsUnreadResponseDataFirstPost(
	@SerialName("post_id")
	val postId: Double = 0.0,
	@SerialName("thread_id")
	val threadId: Double = 0.0,
	@SerialName("poster_user_id")
	val posterUserId: Double = 0.0,
	@SerialName("poster_username")
	val posterUsername: String = "",
	@SerialName("poster_username_html")
	val posterUsernameHtml: String = "",
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
	val likeUsers: List<ThreadsUnreadResponseDataFirstPostLikeUsers> = emptyList(),
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
	val links: ThreadsUnreadResponseDataFirstPostLinks = ThreadsUnreadResponseDataFirstPostLinks(),
	val permissions: ThreadsUnreadResponseDataFirstPostPermissions = ThreadsUnreadResponseDataFirstPostPermissions(),
)

@Serializable
data class ThreadsUnreadResponseDataLinks(
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
data class ThreadsUnreadResponseDataPermissions(
	val view: Boolean = false,
	val delete: Boolean = false,
	val follow: Boolean = false,
	val post: Boolean = false,
	@SerialName("upload_attachment")
	val uploadAttachment: Boolean = false,
	val edit: Boolean = false,
)

@Serializable
data class ThreadsUnreadResponseDataForumLinks(
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
data class ThreadsUnreadResponseDataForumPermissions(
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
data class ThreadsUnreadResponseDataForum(
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
	val forumPrefixes: List<JsonElement> = emptyList(),
	@SerialName("thread_default_prefix_id")
	val threadDefaultPrefixId: Double = 0.0,
	@SerialName("thread_prefix_is_required")
	val threadPrefixIsRequired: Boolean = false,
	val links: ThreadsUnreadResponseDataForumLinks = ThreadsUnreadResponseDataForumLinks(),
	val permissions: ThreadsUnreadResponseDataForumPermissions = ThreadsUnreadResponseDataForumPermissions(),
	@SerialName("forum_is_followed")
	val forumIsFollowed: Boolean = false,
)

@Serializable
data class ThreadsUnreadResponseData(
	@SerialName("content_type")
	val contentType: String = "",
	@SerialName("content_id")
	val contentId: Double = 0.0,
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
	@SerialName("creator_username_html")
	val creatorUsernameHtml: String = "",
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
	val firstPost: ThreadsUnreadResponseDataFirstPost = ThreadsUnreadResponseDataFirstPost(),
	@SerialName("thread_prefixes")
	val threadPrefixes: List<JsonElement> = emptyList(),
	@SerialName("thread_tags")
	val threadTags: List<JsonElement> = emptyList(),
	val links: ThreadsUnreadResponseDataLinks = ThreadsUnreadResponseDataLinks(),
	val permissions: ThreadsUnreadResponseDataPermissions = ThreadsUnreadResponseDataPermissions(),
	val forum: ThreadsUnreadResponseDataForum = ThreadsUnreadResponseDataForum(),
)

@Serializable
data class ThreadsRecentParams(
    /** Maximum number of days to search for threads. */
	val days: Long? = null,
    /** Maximum number of result threads. The limit may get decreased if the value is too large. */
	val limit: Long? = null,
    /** Id of the container forum to search for threads. Child forums of the specified forum will be included in the search. */
	@SerialName("forum_id")
	val forumId: Long? = null,
    /** Number of thread data to be returned. Default value is 20. */
	@SerialName("data_limit")
	val dataLimit: Long? = null,
)

@Serializable
data class ThreadsRecentResponse(
	val threads: List<RespThreadModel> = emptyList(),
	val data: List<ThreadsRecentResponseData> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ThreadsRecentResponseDataFirstPostLinks(
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
data class ThreadsRecentResponseDataFirstPostPermissions(
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
data class ThreadsRecentResponseDataFirstPost(
	@SerialName("post_id")
	val postId: Double = 0.0,
	@SerialName("thread_id")
	val threadId: Double = 0.0,
	@SerialName("poster_user_id")
	val posterUserId: Double = 0.0,
	@SerialName("poster_username")
	val posterUsername: String = "",
	@SerialName("poster_username_html")
	val posterUsernameHtml: String = "",
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
	val links: ThreadsRecentResponseDataFirstPostLinks = ThreadsRecentResponseDataFirstPostLinks(),
	val permissions: ThreadsRecentResponseDataFirstPostPermissions = ThreadsRecentResponseDataFirstPostPermissions(),
)

@Serializable
data class ThreadsRecentResponseDataLinks(
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
data class ThreadsRecentResponseDataPermissions(
	val view: Boolean = false,
	val delete: Boolean = false,
	val follow: Boolean = false,
	val post: Boolean = false,
	@SerialName("upload_attachment")
	val uploadAttachment: Boolean = false,
	val edit: Boolean = false,
)

@Serializable
data class ThreadsRecentResponseDataForumLinks(
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
data class ThreadsRecentResponseDataForumPermissions(
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
data class ThreadsRecentResponseDataForum(
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
	val forumPrefixes: List<JsonElement> = emptyList(),
	@SerialName("thread_default_prefix_id")
	val threadDefaultPrefixId: Double = 0.0,
	@SerialName("thread_prefix_is_required")
	val threadPrefixIsRequired: Boolean = false,
	val links: ThreadsRecentResponseDataForumLinks = ThreadsRecentResponseDataForumLinks(),
	val permissions: ThreadsRecentResponseDataForumPermissions = ThreadsRecentResponseDataForumPermissions(),
	@SerialName("forum_is_followed")
	val forumIsFollowed: Boolean = false,
)

@Serializable
data class ThreadsRecentResponseData(
	@SerialName("content_type")
	val contentType: String = "",
	@SerialName("content_id")
	val contentId: Double = 0.0,
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
	@SerialName("creator_username_html")
	val creatorUsernameHtml: String = "",
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
	val firstPost: ThreadsRecentResponseDataFirstPost = ThreadsRecentResponseDataFirstPost(),
	@SerialName("thread_prefixes")
	val threadPrefixes: List<JsonElement> = emptyList(),
	@SerialName("thread_tags")
	val threadTags: List<JsonElement> = emptyList(),
	val links: ThreadsRecentResponseDataLinks = ThreadsRecentResponseDataLinks(),
	val permissions: ThreadsRecentResponseDataPermissions = ThreadsRecentResponseDataPermissions(),
	val forum: ThreadsRecentResponseDataForum = ThreadsRecentResponseDataForum(),
)

@Serializable
data class ThreadsFinishResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

// ─── PostsApi Types ────────────────────────────────────────

@Serializable
data class PostsListParams(
    /** Id of the containing thread. */
	@SerialName("thread_id")
	val threadId: Long? = null,
    /** Id of a post, posts that are in the same page with the specified post will be returned. thread_id may be skipped. */
	@SerialName("page_of_post_id")
	val pageOfPostId: Long? = null,
    /** Page number of posts. */
	val page: Long? = null,
    /** Number of posts in a page. */
	val limit: Long? = null,
    /** Ordering of posts. */
	val order: PostsOrder? = null,
)

@Serializable
data class PostsListResponse(
	val posts: List<RespThreadModel> = emptyList(),
	val thread: RespThreadModel = RespThreadModel(),
	@SerialName("posts_total")
	val postsTotal: Double = 0.0,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class PostsCreateBody(
    /** Content of the new post. */
	@SerialName("post_body")
	val postBody: String,
    /** Id of the target thread. quote_post_id can be skipped if this parameter is provided. */
	@SerialName("thread_id")
	val threadId: Long? = null,
    /** Id of the quote post. thread_id can be skipped if this parameter is provided. */
	@SerialName("quote_post_id")
	val quotePostId: Long? = null,
)

@Serializable
data class PostsCreateResponse(
	val post: RespPostModel = RespPostModel(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class PostsGetResponse(
	val post: RespPostModel = RespPostModel(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class PostsEditBody(
    /** Content of the post. */
	@SerialName("post_body")
	val postBody: String? = null,
)

@Serializable
data class PostsEditResponse(
	val post: RespPostModel = RespPostModel(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class PostsDeleteBody(
    /** Reason of the post removal. */
	val reason: String? = null,
)

@Serializable
data class PostsDeleteResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class PostsLikesParams(
    /** Page number of users. */
	val page: Long? = null,
    /** Number of users in a page. */
	val limit: Long? = null,
)

@Serializable
data class PostsLikesResponse(
	val users: List<PostsLikesResponseUsers> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class PostsLikesResponseUsers(
	@SerialName("user_id")
	val userId: Double = 0.0,
	val username: String = "",
)

@Serializable
data class PostsLikeResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class PostsUnlikeResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class PostsReportReasonsResponse(
	val reasons: List<String> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class PostsReportBody(
    /** Reason of the report. */
	val message: String,
)

@Serializable
data class PostsReportResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class PostsCommentsGetParams(
    /** Id of post. */
	@SerialName("post_id")
	val postId: Long,
    /** The time in milliseconds (e.g. 1652177794083) before last comment date. */
	val before: Long? = null,
    /** Comment id to get older comments. */
	@SerialName("before_comment")
	val beforeComment: Long? = null,
)

@Serializable
data class PostsCommentsGetResponse(
	val comments: List<RespPostCommentModel> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class PostsCommentsCreateBody(
    /** Id of post. */
	@SerialName("post_id")
	val postId: Long,
    /** Content of the a post comment. */
	@SerialName("comment_body")
	val commentBody: String,
)

@Serializable
data class PostsCommentsCreateResponse(
	val comment: PostsCommentsCreateResponseComment = PostsCommentsCreateResponseComment(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class PostsCommentsCreateResponseCommentLinks(
	val permalink: String = "",
	val detail: String = "",
	val post: String = "",
	val thread: String = "",
	val poster: String = "",
	val likes: String = "",
	val report: String = "",
	@SerialName("poster_avatar")
	val posterAvatar: String = "",
)

@Serializable
data class PostsCommentsCreateResponseCommentPermissions(
	val view: Boolean = false,
	val edit: Boolean = false,
	val delete: Boolean = false,
	val reply: Boolean = false,
	val like: Boolean = false,
	val report: Boolean = false,
)

@Serializable
data class PostsCommentsCreateResponseComment(
	@SerialName("post_comment_id")
	val postCommentId: Double = 0.0,
	@SerialName("post_id")
	val postId: Double = 0.0,
	@SerialName("thread_id")
	val threadId: Double = 0.0,
	@SerialName("poster_user_id")
	val posterUserId: Double = 0.0,
	@SerialName("poster_username")
	val posterUsername: String = "",
	@SerialName("poster_username_html")
	val posterUsernameHtml: String = "",
	@SerialName("post_comment_body")
	val postCommentBody: String = "",
	@SerialName("post_comment_body_html")
	val postCommentBodyHtml: String = "",
	@SerialName("post_comment_body_plain_text")
	val postCommentBodyPlainText: String = "",
	@SerialName("post_comment_like_count")
	val postCommentLikeCount: Double = 0.0,
	@SerialName("user_is_ignored")
	val userIsIgnored: Boolean = false,
	@SerialName("post_comment_is_published")
	val postCommentIsPublished: Boolean = false,
	@SerialName("post_comment_is_deleted")
	val postCommentIsDeleted: Boolean = false,
	@SerialName("post_comment_update_date")
	val postCommentUpdateDate: Double = 0.0,
	val links: PostsCommentsCreateResponseCommentLinks = PostsCommentsCreateResponseCommentLinks(),
	val permissions: PostsCommentsCreateResponseCommentPermissions = PostsCommentsCreateResponseCommentPermissions(),
)

@Serializable
data class PostsCommentsEditBody(
    /** Id of post. */
	@SerialName("post_comment_id")
	val postCommentId: Long,
    /** Content of the new post comment. */
	@SerialName("comment_body")
	val commentBody: String,
)

@Serializable
data class PostsCommentsEditResponse(
	val comment: PostsCommentsEditResponseComment = PostsCommentsEditResponseComment(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class PostsCommentsEditResponseCommentLinks(
	val permalink: String = "",
	val detail: String = "",
	val post: String = "",
	val thread: String = "",
	val poster: String = "",
	val likes: String = "",
	val report: String = "",
	@SerialName("poster_avatar")
	val posterAvatar: String = "",
)

@Serializable
data class PostsCommentsEditResponseCommentPermissions(
	val view: Boolean = false,
	val edit: Boolean = false,
	val delete: Boolean = false,
	val reply: Boolean = false,
	val like: Boolean = false,
	val report: Boolean = false,
)

@Serializable
data class PostsCommentsEditResponseComment(
	@SerialName("post_comment_id")
	val postCommentId: Double = 0.0,
	@SerialName("post_id")
	val postId: Double = 0.0,
	@SerialName("thread_id")
	val threadId: Double = 0.0,
	@SerialName("poster_user_id")
	val posterUserId: Double = 0.0,
	@SerialName("poster_username")
	val posterUsername: String = "",
	@SerialName("poster_username_html")
	val posterUsernameHtml: String = "",
	@SerialName("post_comment_body")
	val postCommentBody: String = "",
	@SerialName("post_comment_body_html")
	val postCommentBodyHtml: String = "",
	@SerialName("post_comment_body_plain_text")
	val postCommentBodyPlainText: String = "",
	@SerialName("post_comment_like_count")
	val postCommentLikeCount: Double = 0.0,
	@SerialName("user_is_ignored")
	val userIsIgnored: Boolean = false,
	@SerialName("post_comment_is_published")
	val postCommentIsPublished: Boolean = false,
	@SerialName("post_comment_is_deleted")
	val postCommentIsDeleted: Boolean = false,
	@SerialName("post_comment_update_date")
	val postCommentUpdateDate: Double = 0.0,
	val links: PostsCommentsEditResponseCommentLinks = PostsCommentsEditResponseCommentLinks(),
	val permissions: PostsCommentsEditResponseCommentPermissions = PostsCommentsEditResponseCommentPermissions(),
)

@Serializable
data class PostsCommentsDeleteBody(
    /** Id of post comment. */
	@SerialName("post_comment_id")
	val postCommentId: Long,
    /** Reason of a post comment removal. */
	val reason: String? = null,
)

@Serializable
data class PostsCommentsDeleteResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class PostsCommentsReportBody(
    /** Id of post comment. */
	@SerialName("post_comment_id")
	val postCommentId: Long,
    /** Reason of the report. */
	val message: String,
)

@Serializable
data class PostsCommentsReportResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

// ─── UsersApi Types ────────────────────────────────────────

@Serializable
data class UsersListParams(
    /** Page number of users. */
	val page: Long? = null,
    /** Number of users in a page. */
	val limit: Long? = null,
    /** List of fields to include. */
	@SerialName("fields_include")
	val fieldsInclude: JsonElement? = null,
)

@Serializable
data class UsersListResponse(
	val users: List<RespUserModel> = emptyList(),
	@SerialName("users_total")
	val usersTotal: Double = 0.0,
	val links: UsersListResponseLinks = UsersListResponseLinks(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class UsersListResponseLinks(
	val pages: Double = 0.0,
	val page: Double = 0.0,
	val next: String = "",
)

@Serializable
data class UsersFieldsResponse(
	val fields: List<UsersFieldsResponseFields> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class UsersFieldsResponseFields(
	val id: String = "",
	val title: String = "",
	val description: String = "",
	val position: String = "",
	@SerialName("is_required")
	val isRequired: Boolean = false,
)

@Serializable
data class UsersFindParams(
    /** Username to filter. Usernames start with the query will be returned. */
	val username: String? = null,
    /** Custom fields to filter. Example: custom_fields[telegram]=telegramLogin. */
	@SerialName("custom_fields")
	val customFields: Map<String, String>? = null,
    /** List of fields to include. */
	@SerialName("fields_include")
	val fieldsInclude: JsonElement? = null,
)

@Serializable
data class UsersFindResponse(
	val users: List<RespUserModel> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class UsersGetParams(
    /** List of fields to include. */
	@SerialName("fields_include")
	val fieldsInclude: JsonElement? = null,
)

@Serializable
data class UsersGetResponse(
	val user: RespUserModel = RespUserModel(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class UsersEditBody(
    /** New username. */
	val username: String? = null,
    /** New custom title of the user. */
	@SerialName("user_title")
	val userTitle: String? = null,
    /** Id of the group you want to display. */
	@SerialName("display_group_id")
	val displayGroupId: Long? = null,
    /** Id of the icon group you want to display. */
	@SerialName("display_icon_group_id")
	val displayIconGroupId: Long? = null,
    /** Id of the banner you want to display. */
	@SerialName("display_banner_id")
	val displayBannerId: Long? = null,
    /** This message is shown when someone wants to write to you. */
	@SerialName("conv_welcome_message")
	val convWelcomeMessage: String? = null,
    /** Your date of birth (day). */
	@SerialName("user_dob_day")
	val userDobDay: Long? = null,
    /** Your date of birth (month). */
	@SerialName("user_dob_month")
	val userDobMonth: Long? = null,
    /** Your date of birth (year). */
	@SerialName("user_dob_year")
	val userDobYear: Long? = null,
    /** Secret answer. */
	@SerialName("secret_answer")
	val secretAnswer: String? = null,
    /** Secret answer type. */
	@SerialName("secret_answer_type")
	val secretAnswerType: Long? = null,
    /** Profile short link. */
	@SerialName("short_link")
	val shortLink: String? = null,
    /** User interface language ID. */
	@SerialName("language_id")
	val languageId: LanguageId? = null,
    /** User gender. */
	val gender: Gender? = null,
    /** User timezone. */
	val timezone: Timezone? = null,
    /** Whether to receive admin emails. */
	@SerialName("receive_admin_email")
	val receiveAdminEmail: Boolean? = null,
    /** Whether user activity is visible. */
	@SerialName("activity_visible")
	val activityVisible: Boolean? = null,
    /** Show date of birth (day and month). */
	@SerialName("show_dob_date")
	val showDobDate: Boolean? = null,
    /** Show year of birth. */
	@SerialName("show_dob_year")
	val showDobYear: Boolean? = null,
    /** Hide username change logs. */
	@SerialName("hide_username_change_logs")
	val hideUsernameChangeLogs: Boolean? = null,
    /** Who can view your profile. */
	@SerialName("allow_view_profile")
	val allowViewProfile: AllowViewProfile? = null,
    /** Who can post on your profile. */
	@SerialName("allow_post_profile")
	val allowPostProfile: AllowPostProfile? = null,
    /** Who can send you personal conversations. */
	@SerialName("allow_send_personal_conversation")
	val allowSendPersonalConversation: AllowSendPersonalConversation? = null,
    /** Who can invite you to groups. */
	@SerialName("allow_invite_group")
	val allowInviteGroup: AllowInviteGroup? = null,
    /** Who can see your news feed. */
	@SerialName("allow_receive_news_feed")
	val allowReceiveNewsFeed: AllowReceiveNewsFeed? = null,
    /** Alert settings. */
	val alert: Map<String, Boolean>? = null,
    /** Custom user profile fields. */
	val fields: JsonObject? = null,
)

@Serializable
data class UsersEditResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class UsersClaimsParams(
    /** Filter claims by their type. */
	val type: NotificationsType? = null,
    /** Filter claims by their state. */
	@SerialName("claim_state")
	val claimState: ClaimState? = null,
)

@Serializable
data class UsersClaimsResponse(
	val claims: List<UsersClaimsResponseClaims> = emptyList(),
	val stats: UsersClaimsResponseStats = UsersClaimsResponseStats(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class UsersClaimsResponseClaims(
	@SerialName("thread_id")
	val threadId: Double = 0.0,
	@SerialName("claim_date")
	val claimDate: Double = 0.0,
	@SerialName("claim_state")
	val claimState: String = "",
	@SerialName("message_body")
	val messageBody: String = "",
	@SerialName("message_body_html")
	val messageBodyHtml: String = "",
	@SerialName("message_body_plain_text")
	val messageBodyPlainText: String = "",
	val amount: Double = 0.0,
	@SerialName("amount_formatted")
	val amountFormatted: String = "",
	val author: RespUserModel = RespUserModel(),
)

@Serializable
data class UsersClaimsResponseStatsMarket(
	val total: Double = 0.0,
	val solved: Double = 0.0,
	val settled: Double = 0.0,
	val rejected: Double = 0.0,
)

@Serializable
data class UsersClaimsResponseStatsNoMarket(
	val total: Double = 0.0,
	val solved: Double = 0.0,
	val settled: Double = 0.0,
	val rejected: Double = 0.0,
)

@Serializable
data class UsersClaimsResponseStats(
	val market: UsersClaimsResponseStatsMarket = UsersClaimsResponseStatsMarket(),
	val noMarket: UsersClaimsResponseStatsNoMarket = UsersClaimsResponseStatsNoMarket(),
)

data class UsersAvatarUploadBody(
    /** Binary data of the avatar. */
	val avatar: ByteArray,
    /** The starting point of the selection by width. Default value - 0 */
	val x: Long? = null,
    /** The starting point of the selection by height. Default value - 0 */
	val y: Long? = null,
    /** Selection size. */
	val crop: Long? = null,
)

@Serializable
data class UsersAvatarUploadResponse(
	val status: String = "",
	val message: String = "",
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class UsersAvatarDeleteResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class UsersAvatarCropBody(
    /** The starting point of the selection by width. Default value - 0 */
	val x: Long? = null,
    /** The starting point of the selection by height. Default value - 0 */
	val y: Long? = null,
    /** Selection size. */
	val crop: Long? = null,
)

@Serializable
data class UsersAvatarCropResponse(
	val status: String = "",
	val message: String = "",
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

data class UsersBackgroundUploadBody(
    /** Binary data of the background. Background image must be 1920x1080 pixels */
	val background: ByteArray,
    /** The starting point of the selection by width. Default value - 0 */
	val x: Long? = null,
    /** The starting point of the selection by height. Default value - 0 */
	val y: Long? = null,
    /** Selection size. */
	val crop: Long? = null,
)

@Serializable
data class UsersBackgroundUploadResponse(
	val status: String = "",
	val message: String = "",
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class UsersBackgroundDeleteResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class UsersBackgroundCropBody(
    /** The starting point of the selection by width. Default value - 0 */
	val x: Long? = null,
    /** The starting point of the selection by height. Default value - 0 */
	val y: Long? = null,
    /** Selection size. */
	val crop: Long? = null,
)

@Serializable
data class UsersBackgroundCropResponse(
	val status: String = "",
	val message: String = "",
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class UsersFollowersParams(
    /** Ordering of followers. */
	val order: UsersOrder? = null,
    /** Page number of followers. */
	val page: Long? = null,
    /** Number of followers in a page. */
	val limit: Long? = null,
)

@Serializable
data class UsersFollowersResponse(
	val users: List<UsersFollowersResponseUsers> = emptyList(),
	@SerialName("users_total")
	val usersTotal: Double = 0.0,
	val links: UsersFollowersResponseLinks = UsersFollowersResponseLinks(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class UsersFollowersResponseUsersLinks(
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
data class UsersFollowersResponseUsersPermissions(
	val edit: Boolean = false,
	val follow: Boolean = false,
	val ignore: Boolean = false,
	@SerialName("profile_post")
	val profilePost: Boolean = false,
)

@Serializable
data class UsersFollowersResponseUsersCustomFields(
	val _4: String = "",
	val lztInnovation20Link: String = "",
	val lztInnovation30Link: String = "",
	val lztInnovationLink: String = "",
)

@Serializable
data class UsersFollowersResponseUsers(
	@SerialName("content_type")
	val contentType: String = "",
	@SerialName("content_id")
	val contentId: Double = 0.0,
	@SerialName("follow_date")
	val followDate: Double = 0.0,
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
	@SerialName("user_following_count")
	val userFollowingCount: Double = 0.0,
	@SerialName("user_followers_count")
	val userFollowersCount: Double = 0.0,
	val links: UsersFollowersResponseUsersLinks = UsersFollowersResponseUsersLinks(),
	val permissions: UsersFollowersResponseUsersPermissions = UsersFollowersResponseUsersPermissions(),
	@SerialName("user_is_ignored")
	val userIsIgnored: Boolean = false,
	@SerialName("user_is_visitor")
	val userIsVisitor: Boolean = false,
	@SerialName("user_group_id")
	val userGroupId: Double = 0.0,
	@SerialName("custom_fields")
	val customFields: UsersFollowersResponseUsersCustomFields = UsersFollowersResponseUsersCustomFields(),
)

@Serializable
data class UsersFollowersResponseLinks(
	val pages: Double = 0.0,
	val page: Double = 0.0,
	val next: String = "",
)

@Serializable
data class UsersFollowResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class UsersUnfollowResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class UsersFollowingsParams(
    /** Ordering of users. */
	val order: UsersOrder? = null,
    /** Page number of users. */
	val page: Long? = null,
    /** Number of users in a page. */
	val limit: Long? = null,
)

@Serializable
data class UsersFollowingsResponse(
	val users: List<UsersFollowingsResponseUsers> = emptyList(),
	@SerialName("users_total")
	val usersTotal: Double = 0.0,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class UsersFollowingsResponseUsersLinks(
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
data class UsersFollowingsResponseUsersPermissions(
	val edit: Boolean = false,
	val follow: Boolean = false,
	val ignore: Boolean = false,
	@SerialName("profile_post")
	val profilePost: Boolean = false,
)

@Serializable
data class UsersFollowingsResponseUsersCustomFields(
	val _4: String = "",
	val allowSelfUnban: List<JsonElement> = emptyList(),
	val discord: String = "",
	val github: String = "",
	val jabber: String = "",
	val lztAwardUserTrophy: String = "",
	val lztCuratorNodeTitle: String = "",
	val lztCuratorNodeTitleEn: String = "",
	val lztDeposit: String = "",
	val lztInnovation20Link: String = "",
	val lztInnovation30Link: String = "",
	val lztInnovationLink: String = "",
	val lztLikesIncreasing: String = "",
	val lztLikesZeroing: String = "",
	val lztSympathyIncreasing: String = "",
	val lztSympathyZeroing: String = "",
	val maecenasValue: String = "",
	val scamURL: String = "",
	val steam: String = "",
	val telegram: String = "",
	val vk: String = "",
)

@Serializable
data class UsersFollowingsResponseUsers(
	@SerialName("content_type")
	val contentType: String = "",
	@SerialName("content_id")
	val contentId: Double = 0.0,
	@SerialName("follow_date")
	val followDate: Double = 0.0,
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
	@SerialName("short_link")
	val shortLink: String = "",
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
	@SerialName("user_following_count")
	val userFollowingCount: Double = 0.0,
	@SerialName("user_followers_count")
	val userFollowersCount: Double = 0.0,
	val links: UsersFollowingsResponseUsersLinks = UsersFollowingsResponseUsersLinks(),
	val permissions: UsersFollowingsResponseUsersPermissions = UsersFollowingsResponseUsersPermissions(),
	@SerialName("user_is_ignored")
	val userIsIgnored: Boolean = false,
	@SerialName("user_is_visitor")
	val userIsVisitor: Boolean = false,
	@SerialName("user_group_id")
	val userGroupId: Double = 0.0,
	@SerialName("custom_fields")
	val customFields: UsersFollowingsResponseUsersCustomFields = UsersFollowingsResponseUsersCustomFields(),
)

@Serializable
data class UsersLikesParams(
    /** Filter by forum section. */
	@SerialName("node_id")
	val nodeId: Long? = null,
    /** Like type. */
	@SerialName("like_type")
	val likeType: LikeType? = null,
    /** Likes type.. Default: gotten */
	val type: UsersType = UsersType.GOTTEN,
    /** Page number. */
	val page: Long? = null,
    /** Content type.. Default: post */
	@SerialName("content_type")
	val contentType: ContentType = ContentType.POST,
    /** Get only likes from specified user. */
	@SerialName("search_user_id")
	val searchUserId: Long? = null,
    /** Show weekly statistics. */
	val stats: Boolean? = null,
)

@Serializable
data class UsersLikesResponse(
	val page: Double = 0.0,
	val perPage: Double = 0.0,
	val contentType: String = "",
	val totalLikes: Double = 0.0,
	val likes: JsonElement = JsonNull,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class UsersIgnoredParams(
    /** If included in the request, only the user count is returned as users_total. */
	val total: Boolean? = null,
)

@Serializable
data class UsersIgnoredResponse(
	val users: List<UsersIgnoredResponseUsers> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class UsersIgnoredResponseUsersCustomFields(
	val _4: String = "",
	val scamURL: JsonElement = JsonNull,
	val lztLikesZeroing: JsonElement = JsonNull,
	val lztLikesIncreasing: JsonElement = JsonNull,
	val lztSympathyZeroing: JsonElement = JsonNull,
	val lztSympathyIncreasing: JsonElement = JsonNull,
	val telegram: JsonElement = JsonNull,
	val vk: String = "",
	val discord: String = "",
	val steam: String = "",
	val matrix: JsonElement = JsonNull,
	val jabber: String = "",
	val github: String = "",
)

@Serializable
data class UsersIgnoredResponseUsersIgnoredInfo(
	@SerialName("ignore_content")
	val ignoreContent: Double = 0.0,
	@SerialName("ignore_conversations")
	val ignoreConversations: Double = 0.0,
	@SerialName("restrict_view_profile")
	val restrictViewProfile: Double = 0.0,
)

@Serializable
data class UsersIgnoredResponseUsersRenderedAvatars(
	val l: String = "",
	val m: String = "",
	val s: String = "",
)

@Serializable
data class UsersIgnoredResponseUsersRendered(
	val username: String = "",
	val avatars: UsersIgnoredResponseUsersRenderedAvatars = UsersIgnoredResponseUsersRenderedAvatars(),
	val backgrounds: List<JsonElement> = emptyList(),
	val link: String = "",
)

@Serializable
data class UsersIgnoredResponseUsers(
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
	val convertedDeposit: Double = 0.0,
	@SerialName("custom_fields")
	val customFields: UsersIgnoredResponseUsersCustomFields = UsersIgnoredResponseUsersCustomFields(),
	val deposit: Double = 0.0,
	val homepage: String = "",
	@SerialName("ignored_info")
	val ignoredInfo: UsersIgnoredResponseUsersIgnoredInfo = UsersIgnoredResponseUsersIgnoredInfo(),
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
	@SerialName("last_activity")
	val lastActivity: Double = 0.0,
	@SerialName("like2_count")
	val like2Count: Double = 0.0,
	@SerialName("like_count")
	val likeCount: Double = 0.0,
	val location: String = "",
	@SerialName("message_count")
	val messageCount: Double = 0.0,
	@SerialName("register_date")
	val registerDate: Double = 0.0,
	val rendered: UsersIgnoredResponseUsersRendered = UsersIgnoredResponseUsersRendered(),
	@SerialName("short_link")
	val shortLink: String = "",
	@SerialName("trophy_points")
	val trophyPoints: Double = 0.0,
	@SerialName("user_id")
	val userId: Double = 0.0,
	@SerialName("user_title")
	val userTitle: String = "",
	val username: String = "",
	@SerialName("view_url")
	val viewUrl: String = "",
	@SerialName("warning_points")
	val warningPoints: Double = 0.0,
)

@Serializable
data class UsersIgnoreResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class UsersIgnoreEditParams(
    /** Ignore user's conversations. */
	@SerialName("ignore_conversations")
	val ignoreConversations: Boolean? = null,
    /** Ignore user's content. */
	@SerialName("ignore_content")
	val ignoreContent: Boolean? = null,
    /** Restrict user from viewing your profile. */
	@SerialName("restrict_view_profile")
	val restrictViewProfile: Boolean? = null,
)

@Serializable
data class UsersIgnoreEditResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class UsersUnignoreResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class UsersContentsParams(
    /** Page number of contents. */
	val page: Long? = null,
    /** Number of contents in a page. */
	val limit: Long? = null,
)

@Serializable
data class UsersContentsResponse(
	val data: List<UsersContentsResponseData> = emptyList(),
	@SerialName("data_total")
	val dataTotal: Double = 0.0,
	val user: RespUserModel = RespUserModel(),
	val links: UsersContentsResponseLinks = UsersContentsResponseLinks(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class UsersContentsResponseDataLikeUsers(
	@SerialName("user_id")
	val userId: Double = 0.0,
	val username: String = "",
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Double = 0.0,
	@SerialName("is_banned")
	val isBanned: Double = 0.0,
	@SerialName("uniq_username_css")
	val uniqUsernameCss: String = "",
)

@Serializable
data class UsersContentsResponseDataLinks(
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
data class UsersContentsResponseDataPermissions(
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
data class UsersContentsResponseDataThreadLinks(
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
data class UsersContentsResponseDataThreadPermissions(
	val view: Boolean = false,
	val delete: Boolean = false,
	val follow: Boolean = false,
	val post: Boolean = false,
	@SerialName("upload_attachment")
	val uploadAttachment: Boolean = false,
)

@Serializable
data class UsersContentsResponseDataThread(
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
	@SerialName("creator_username_html")
	val creatorUsernameHtml: String = "",
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
	@SerialName("thread_prefixes")
	val threadPrefixes: List<JsonElement> = emptyList(),
	@SerialName("thread_tags")
	val threadTags: List<JsonElement> = emptyList(),
	val links: UsersContentsResponseDataThreadLinks = UsersContentsResponseDataThreadLinks(),
	val permissions: UsersContentsResponseDataThreadPermissions = UsersContentsResponseDataThreadPermissions(),
)

@Serializable
data class UsersContentsResponseData(
	@SerialName("content_type")
	val contentType: String = "",
	@SerialName("content_id")
	val contentId: Double = 0.0,
	@SerialName("post_id")
	val postId: Double = 0.0,
	@SerialName("thread_id")
	val threadId: Double = 0.0,
	@SerialName("poster_user_id")
	val posterUserId: Double = 0.0,
	@SerialName("poster_username")
	val posterUsername: String = "",
	@SerialName("poster_username_html")
	val posterUsernameHtml: String = "",
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
	val likeUsers: List<UsersContentsResponseDataLikeUsers> = emptyList(),
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
	val links: UsersContentsResponseDataLinks = UsersContentsResponseDataLinks(),
	val permissions: UsersContentsResponseDataPermissions = UsersContentsResponseDataPermissions(),
	val thread: UsersContentsResponseDataThread = UsersContentsResponseDataThread(),
)

@Serializable
data class UsersContentsResponseLinks(
	val pages: Double = 0.0,
	val page: Double = 0.0,
	val next: String = "",
)

@Serializable
data class UsersTrophiesResponse(
	val trophies: List<UsersTrophiesResponseTrophies> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class UsersTrophiesResponseTrophies(
	@SerialName("trophy_id")
	val trophyId: Double = 0.0,
	val title: String = "",
	val description: String = "",
	@SerialName("trophy_url")
	val trophyUrl: String = "",
)

@Serializable
data class UsersSecretAnswerTypesResponse(
	val data: List<UsersSecretAnswerTypesResponseData> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class UsersSecretAnswerTypesResponseData(
	@SerialName("sa_id")
	val saId: Double = 0.0,
	val renderedPhrase: String = "",
)

@Serializable
data class UsersSaResetResponse(
	val success: Boolean = false,
	@SerialName("waiting_time")
	val waitingTime: String = "",
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class UsersSaCancelResetResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

// ─── ProfilePostsApi Types ────────────────────────────────────────

@Serializable
data class ProfilePostsListParams(
    /** Filter to get only posts from the specified user. */
	@SerialName("posts_user_id")
	val postsUserId: Long? = null,
    /** Page number of contents. */
	val page: Long? = null,
    /** Number of contents in a page. */
	val limit: Long? = null,
    /** List of fields to include. */
	@SerialName("fields_include")
	val fieldsInclude: JsonElement? = null,
)

@Serializable
data class ProfilePostsListResponse(
	@SerialName("profile_posts")
	val profilePosts: List<RespProfilePostModel> = emptyList(),
	val totalProfilePosts: Double = 0.0,
	val canPostOnProfile: Boolean = false,
	val links: ProfilePostsListResponseLinks = ProfilePostsListResponseLinks(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ProfilePostsListResponseLinks(
	val pages: Double = 0.0,
	val page: Double = 0.0,
	val next: String = "",
)

@Serializable
data class ProfilePostsGetResponse(
	@SerialName("profile_post")
	val profilePost: RespProfilePostModel = RespProfilePostModel(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ProfilePostsEditBody(
    /** New content of the profile post. */
	@SerialName("post_body")
	val postBody: String? = null,
    /** Disable comments. */
	@SerialName("disable_comments")
	val disableComments: Boolean? = null,
)

@Serializable
data class ProfilePostsEditResponse(
	@SerialName("profile_post")
	val profilePost: ProfilePostsEditResponseProfilePost = ProfilePostsEditResponseProfilePost(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ProfilePostsEditResponseProfilePostLinks(
	val permalink: String = "",
	val detail: String = "",
	val timeline: String = "",
	@SerialName("timeline_user")
	val timelineUser: String = "",
	val poster: String = "",
	val likes: String = "",
	val comments: String = "",
	val report: String = "",
	@SerialName("poster_avatar")
	val posterAvatar: String = "",
)

@Serializable
data class ProfilePostsEditResponseProfilePostPermissions(
	val view: Boolean = false,
	val edit: Boolean = false,
	val delete: Boolean = false,
	val like: Boolean = false,
	val comment: Boolean = false,
	val report: Boolean = false,
)

@Serializable
data class ProfilePostsEditResponseProfilePost(
	@SerialName("profile_post_id")
	val profilePostId: Double = 0.0,
	@SerialName("timeline_user_id")
	val timelineUserId: Double = 0.0,
	@SerialName("poster_user_id")
	val posterUserId: Double = 0.0,
	@SerialName("poster_username")
	val posterUsername: String = "",
	@SerialName("poster_username_html")
	val posterUsernameHtml: String = "",
	@SerialName("post_create_date")
	val postCreateDate: Double = 0.0,
	@SerialName("post_body")
	val postBody: String = "",
	@SerialName("post_like_count")
	val postLikeCount: Double = 0.0,
	@SerialName("post_comment_count")
	val postCommentCount: Double = 0.0,
	@SerialName("timeline_username")
	val timelineUsername: String = "",
	@SerialName("user_is_ignored")
	val userIsIgnored: Boolean = false,
	@SerialName("post_is_published")
	val postIsPublished: Boolean = false,
	@SerialName("post_is_deleted")
	val postIsDeleted: Boolean = false,
	val links: ProfilePostsEditResponseProfilePostLinks = ProfilePostsEditResponseProfilePostLinks(),
	val permissions: ProfilePostsEditResponseProfilePostPermissions = ProfilePostsEditResponseProfilePostPermissions(),
)

@Serializable
data class ProfilePostsDeleteParams(
    /** Reason of the profile post removal. */
	val reason: String? = null,
)

@Serializable
data class ProfilePostsDeleteResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ProfilePostsReportReasonsResponse(
	val reasons: List<String> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ProfilePostsReportBody(
    /** Reason of the report. */
	val message: String,
)

@Serializable
data class ProfilePostsReportResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ProfilePostsCreateBody(
	@SerialName("user_id")
	val userId: StringOrInt,
    /** Content of a profile post. */
	@SerialName("post_body")
	val postBody: String,
)

@Serializable
data class ProfilePostsCreateResponse(
	@SerialName("profile_post")
	val profilePost: ProfilePostsCreateResponseProfilePost = ProfilePostsCreateResponseProfilePost(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ProfilePostsCreateResponseProfilePostLinks(
	val permalink: String = "",
	val detail: String = "",
	val timeline: String = "",
	@SerialName("timeline_user")
	val timelineUser: String = "",
	val poster: String = "",
	val likes: String = "",
	val comments: String = "",
	val report: String = "",
	@SerialName("poster_avatar")
	val posterAvatar: String = "",
)

@Serializable
data class ProfilePostsCreateResponseProfilePostPermissions(
	val view: Boolean = false,
	val edit: Boolean = false,
	val delete: Boolean = false,
	val like: Boolean = false,
	val comment: Boolean = false,
	val report: Boolean = false,
)

@Serializable
data class ProfilePostsCreateResponseProfilePost(
	@SerialName("profile_post_id")
	val profilePostId: Double = 0.0,
	@SerialName("timeline_user_id")
	val timelineUserId: Double = 0.0,
	@SerialName("poster_user_id")
	val posterUserId: Double = 0.0,
	@SerialName("poster_username")
	val posterUsername: String = "",
	@SerialName("poster_username_html")
	val posterUsernameHtml: String = "",
	@SerialName("post_create_date")
	val postCreateDate: Double = 0.0,
	@SerialName("post_body")
	val postBody: String = "",
	@SerialName("post_like_count")
	val postLikeCount: Double = 0.0,
	@SerialName("post_comment_count")
	val postCommentCount: Double = 0.0,
	@SerialName("timeline_username")
	val timelineUsername: String = "",
	@SerialName("user_is_ignored")
	val userIsIgnored: Boolean = false,
	@SerialName("post_is_published")
	val postIsPublished: Boolean = false,
	@SerialName("post_is_deleted")
	val postIsDeleted: Boolean = false,
	val links: ProfilePostsCreateResponseProfilePostLinks = ProfilePostsCreateResponseProfilePostLinks(),
	val permissions: ProfilePostsCreateResponseProfilePostPermissions = ProfilePostsCreateResponseProfilePostPermissions(),
)

@Serializable
data class ProfilePostsStickResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ProfilePostsUnstickResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ProfilePostsLikesResponse(
	val users: List<ProfilePostsLikesResponseUsers> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ProfilePostsLikesResponseUsers(
	@SerialName("user_id")
	val userId: Double = 0.0,
	val username: String = "",
)

@Serializable
data class ProfilePostsLikeResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ProfilePostsUnlikeResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ProfilePostsCommentsListParams(
    /** Id of profile post. */
	@SerialName("profile_post_id")
	val profilePostId: Long,
    /** Date to get older comments. Please note that this entry point does not support the page parameter but it still does support limit. */
	val before: Long? = null,
    /** Number of profile posts in a page. */
	val limit: Long? = null,
)

@Serializable
data class ProfilePostsCommentsListResponse(
	val comments: List<RespProfilePostCommentModel> = emptyList(),
	@SerialName("comments_total")
	val commentsTotal: Double = 0.0,
	@SerialName("profile_post")
	val profilePost: ProfilePostsCommentsListResponseProfilePost = ProfilePostsCommentsListResponseProfilePost(),
	@SerialName("timeline_user")
	val timelineUser: RespUserModel = RespUserModel(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ProfilePostsCommentsListResponseProfilePostLinks(
	val permalink: String = "",
	val detail: String = "",
	val timeline: String = "",
	@SerialName("timeline_user")
	val timelineUser: String = "",
	val poster: String = "",
	val likes: String = "",
	val comments: String = "",
	val report: String = "",
	@SerialName("poster_avatar")
	val posterAvatar: String = "",
)

@Serializable
data class ProfilePostsCommentsListResponseProfilePostPermissions(
	val view: Boolean = false,
	val edit: Boolean = false,
	val delete: Boolean = false,
	val like: Boolean = false,
	val comment: Boolean = false,
	val report: Boolean = false,
)

@Serializable
data class ProfilePostsCommentsListResponseProfilePost(
	@SerialName("profile_post_id")
	val profilePostId: Double = 0.0,
	@SerialName("timeline_user_id")
	val timelineUserId: Double = 0.0,
	@SerialName("poster_user_id")
	val posterUserId: Double = 0.0,
	@SerialName("poster_username")
	val posterUsername: String = "",
	@SerialName("poster_username_html")
	val posterUsernameHtml: String = "",
	@SerialName("post_create_date")
	val postCreateDate: Double = 0.0,
	@SerialName("post_body")
	val postBody: String = "",
	@SerialName("post_like_count")
	val postLikeCount: Double = 0.0,
	@SerialName("post_comment_count")
	val postCommentCount: Double = 0.0,
	@SerialName("timeline_username")
	val timelineUsername: String = "",
	@SerialName("user_is_ignored")
	val userIsIgnored: Boolean = false,
	@SerialName("post_is_published")
	val postIsPublished: Boolean = false,
	@SerialName("post_is_deleted")
	val postIsDeleted: Boolean = false,
	val links: ProfilePostsCommentsListResponseProfilePostLinks = ProfilePostsCommentsListResponseProfilePostLinks(),
	val permissions: ProfilePostsCommentsListResponseProfilePostPermissions = ProfilePostsCommentsListResponseProfilePostPermissions(),
)

@Serializable
data class ProfilePostsCommentsCreateBody(
    /** Id of profile post. */
	@SerialName("profile_post_id")
	val profilePostId: Long,
    /** Content of the new profile post comment. */
	@SerialName("comment_body")
	val commentBody: String,
)

@Serializable
data class ProfilePostsCommentsCreateResponse(
	val comment: ProfilePostsCommentsCreateResponseComment = ProfilePostsCommentsCreateResponseComment(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ProfilePostsCommentsCreateResponseCommentLinks(
	val detail: String = "",
	@SerialName("profile_post")
	val profilePost: String = "",
	val timeline: String = "",
	@SerialName("timeline_user")
	val timelineUser: String = "",
	val poster: String = "",
	@SerialName("poster_avatar")
	val posterAvatar: String = "",
)

@Serializable
data class ProfilePostsCommentsCreateResponseCommentPermissions(
	val view: Boolean = false,
	val delete: Boolean = false,
)

@Serializable
data class ProfilePostsCommentsCreateResponseComment(
	@SerialName("comment_id")
	val commentId: Double = 0.0,
	@SerialName("profile_post_id")
	val profilePostId: Double = 0.0,
	@SerialName("comment_user_id")
	val commentUserId: Double = 0.0,
	@SerialName("comment_username")
	val commentUsername: String = "",
	@SerialName("comment_username_html")
	val commentUsernameHtml: String = "",
	@SerialName("comment_create_date")
	val commentCreateDate: Double = 0.0,
	@SerialName("comment_body")
	val commentBody: String = "",
	@SerialName("user_is_ignored")
	val userIsIgnored: Boolean = false,
	@SerialName("timeline_user_id")
	val timelineUserId: Double = 0.0,
	val links: ProfilePostsCommentsCreateResponseCommentLinks = ProfilePostsCommentsCreateResponseCommentLinks(),
	val permissions: ProfilePostsCommentsCreateResponseCommentPermissions = ProfilePostsCommentsCreateResponseCommentPermissions(),
)

@Serializable
data class ProfilePostsCommentsEditBody(
    /** Id of profile post comment. */
	@SerialName("comment_id")
	val commentId: Long,
    /** New content for the profile post comment. */
	@SerialName("comment_body")
	val commentBody: String,
)

@Serializable
data class ProfilePostsCommentsEditResponse(
	val comment: ProfilePostsCommentsEditResponseComment = ProfilePostsCommentsEditResponseComment(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ProfilePostsCommentsEditResponseCommentLinks(
	val detail: String = "",
	@SerialName("profile_post")
	val profilePost: String = "",
	val timeline: String = "",
	@SerialName("timeline_user")
	val timelineUser: String = "",
	val poster: String = "",
	@SerialName("poster_avatar")
	val posterAvatar: String = "",
)

@Serializable
data class ProfilePostsCommentsEditResponseCommentPermissions(
	val view: Boolean = false,
	val delete: Boolean = false,
)

@Serializable
data class ProfilePostsCommentsEditResponseComment(
	@SerialName("comment_id")
	val commentId: Double = 0.0,
	@SerialName("profile_post_id")
	val profilePostId: Double = 0.0,
	@SerialName("comment_user_id")
	val commentUserId: Double = 0.0,
	@SerialName("comment_username")
	val commentUsername: String = "",
	@SerialName("comment_username_html")
	val commentUsernameHtml: String = "",
	@SerialName("comment_create_date")
	val commentCreateDate: Double = 0.0,
	@SerialName("comment_body")
	val commentBody: String = "",
	@SerialName("user_is_ignored")
	val userIsIgnored: Boolean = false,
	@SerialName("timeline_user_id")
	val timelineUserId: Double = 0.0,
	val links: ProfilePostsCommentsEditResponseCommentLinks = ProfilePostsCommentsEditResponseCommentLinks(),
	val permissions: ProfilePostsCommentsEditResponseCommentPermissions = ProfilePostsCommentsEditResponseCommentPermissions(),
)

@Serializable
data class ProfilePostsCommentsDeleteBody(
    /** Id of profile post comment. */
	@SerialName("comment_id")
	val commentId: Long,
)

@Serializable
data class ProfilePostsCommentsDeleteResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ProfilePostsCommentsGetResponse(
	val comment: RespProfilePostCommentModel = RespProfilePostCommentModel(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ProfilePostsCommentsReportBody(
    /** Reason of the report. */
	val message: String,
)

@Serializable
data class ProfilePostsCommentsReportResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

// ─── ConversationsApi Types ────────────────────────────────────────

@Serializable
data class ConversationsListParams(
    /** Filter conversations by folder. */
	val folder: Folder? = null,
    /** Page number of conversations. */
	val page: Long? = null,
    /** Number of conversations in a page. */
	val limit: Long? = null,
)

@Serializable
data class ConversationsListResponse(
	val conversations: List<RespConversationModel> = emptyList(),
	@SerialName("can_start")
	val canStart: Boolean = false,
	val folders: List<ConversationsListResponseFolders> = emptyList(),
	val links: ConversationsListResponseLinks = ConversationsListResponseLinks(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ConversationsListResponseFolders(
	val id: String = "",
	val title: String = "",
	val name: String = "",
)

@Serializable
data class ConversationsListResponseLinks(
	val pages: Double = 0.0,
	val page: Double = 0.0,
	val next: String = "",
)

@Serializable
data class ConversationsCreateBody(
    /** Id of recipient. Required if is_group=false. */
	@SerialName("recipient_id")
	val recipientId: Long? = null,
    /** List of recipients username's. Max recipients count is 10. Required if is_group=true. */
	val recipients: List<String>? = null,
    /** Is group. Set false if personal conversation, or set true if group.. Default: false */
	@SerialName("is_group")
	val isGroup: Boolean = false,
    /** The title of new conversation. Required if is_group=1. */
	val title: String? = null,
    /** Open invite. */
	@SerialName("open_invite")
	val openInvite: Boolean? = null,
    /** Allow edit messages. */
	@SerialName("allow_edit_messages")
	val allowEditMessages: Boolean? = null,
    /** Allow members to stick messages. */
	@SerialName("allow_sticky_messages")
	val allowStickyMessages: Boolean? = null,
    /** Allow members to delete their own messages. */
	@SerialName("allow_delete_own_messages")
	val allowDeleteOwnMessages: Boolean? = null,
    /** First message. Required if is_group=false */
	@SerialName("message_body")
	val messageBody: String? = null,
)

@Serializable
data class ConversationsCreateResponse(
	val conversation: RespConversationModel = RespConversationModel(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ConversationsUpdateBody(
    /** Id of conversation. */
	@SerialName("conversation_id")
	val conversationId: Long,
    /** New conversation title. */
	val title: String? = null,
    /** Allow members to invite others. */
	@SerialName("open_invite")
	val openInvite: Boolean? = null,
    /** Make conversation history visible to new members. */
	@SerialName("history_open")
	val historyOpen: Boolean? = null,
    /** Allow members to edit their own messages. */
	@SerialName("allow_edit_messages")
	val allowEditMessages: Boolean? = null,
    /** Allow members to stick messages. */
	@SerialName("allow_sticky_messages")
	val allowStickyMessages: Boolean? = null,
    /** Allow members to delete their own messages. */
	@SerialName("allow_delete_own_messages")
	val allowDeleteOwnMessages: Boolean? = null,
)

@Serializable
data class ConversationsUpdateResponse(
	val conversation: RespConversationModel = RespConversationModel(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ConversationsDeleteBody(
    /** Id of conversation. */
	@SerialName("conversation_id")
	val conversationId: Long,
    /** Deletion type. */
	@SerialName("delete_type")
	val deleteType: DeleteType,
)

@Serializable
data class ConversationsDeleteResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ConversationsStartBody(
	@SerialName("user_id")
	val userId: StringOrInt,
)

@Serializable
data class ConversationsStartResponse(
	val conversation: RespConversationModel = RespConversationModel(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ConversationsSaveBody(
    /** Content url. */
	val link: String,
)

@Serializable
data class ConversationsSaveResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ConversationsGetResponse(
	val conversation: RespConversationModel = RespConversationModel(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ConversationsMessagesListParams(
    /** Page number of messages. */
	val page: Long? = null,
    /** Number of messages in a page. */
	val limit: Long? = null,
    /** Ordering of messages. */
	val order: ConversationsOrder? = null,
    /** Date to get older messages. */
	val before: Long? = null,
    /** Date to get newer messages. */
	val after: Long? = null,
)

@Serializable
data class ConversationsMessagesListResponse(
	val messages: List<RespConversationMessageModel> = emptyList(),
	@SerialName("messages_total")
	val messagesTotal: Double = 0.0,
	val links: ConversationsMessagesListResponseLinks = ConversationsMessagesListResponseLinks(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ConversationsMessagesListResponseLinks(
	val pages: Double = 0.0,
	val page: Double = 0.0,
	val next: String = "",
)

@Serializable
data class ConversationsMessagesCreateBody(
    /** Content of the new message. */
	@SerialName("message_body")
	val messageBody: String,
    /** ID of the message being replied to. */
	@SerialName("reply_message_id")
	val replyMessageId: Long? = null,
)

@Serializable
data class ConversationsMessagesCreateResponse(
	val message: RespConversationMessageModel = RespConversationMessageModel(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ConversationsSearchBody(
    /** Search query string. */
	val q: String? = null,
    /** Id of conversation. */
	@SerialName("conversation_id")
	val conversationId: Long? = null,
    /** Search for recipients. */
	@SerialName("search_recipients")
	val searchRecipients: Boolean? = null,
)

@Serializable
data class ConversationsSearchResponse(
	val conversations: List<RespConversationModel> = emptyList(),
	val recipients: Boolean = false,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ConversationsMessagesGetResponse(
	val message: RespConversationModel = RespConversationModel(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ConversationsMessagesEditBody(
    /** New content of the message. */
	@SerialName("message_body")
	val messageBody: String,
)

@Serializable
data class ConversationsMessagesEditResponse(
	val message: RespConversationModel = RespConversationModel(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ConversationsMessagesDeleteResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ConversationsInviteBody(
    /** List of recipients username's. */
	val recipients: List<String>,
)

@Serializable
data class ConversationsInviteResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ConversationsKickBody(
    /** Id of user to kick from conversation. */
	@SerialName("user_id")
	val userId: Long,
)

@Serializable
data class ConversationsKickResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ConversationsReadResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ConversationsReadAllResponse(
	val status: String = "",
	val message: String = "",
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ConversationsMessagesStickResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ConversationsMessagesUnstickResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ConversationsStarResponse(
	val status: String = "",
	val message: String = "",
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ConversationsUnstarResponse(
	val status: String = "",
	val message: String = "",
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ConversationsAlertsEnableResponse(
	val status: String = "",
	val message: String = "",
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ConversationsAlertsDisableResponse(
	val status: String = "",
	val message: String = "",
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

// ─── NotificationsApi Types ────────────────────────────────────────

@Serializable
data class NotificationsListParams(
    /** Filter notifications by their type. */
	val type: NotificationsType? = null,
    /** Page number of notifications. */
	val page: Long? = null,
    /** Number of notifications in a page. */
	val limit: Long? = null,
)

@Serializable
data class NotificationsListResponse(
	val notifications: List<RespNotificationModel> = emptyList(),
	@SerialName("notifications_total")
	val notificationsTotal: Double = 0.0,
	val links: NotificationsListResponseLinks = NotificationsListResponseLinks(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class NotificationsListResponseLinks(
	val read: String = "",
	val pages: Double = 0.0,
	val page: Double = 0.0,
	val next: String = "",
)

@Serializable
data class NotificationsGetResponse(
	@SerialName("notification_id")
	val notificationId: Double = 0.0,
	val notification: RespNotificationModel = RespNotificationModel(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class NotificationsReadBody(
    /** If notification_id is omitted, it's mark all existing notifications as read. */
	@SerialName("notification_id")
	val notificationId: Long? = null,
)

@Serializable
data class NotificationsReadResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

// ─── TagsApi Types ────────────────────────────────────────

@Serializable
data class TagsPopularResponse(
	val tags: JsonElement = JsonNull,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class TagsListParams(
    /** Page number of tags list. */
	val page: Long? = null,
    /** Number of results in a page. */
	val limit: Long? = null,
)

@Serializable
data class TagsListResponse(
	val tags: JsonElement = JsonNull,
	@SerialName("tags_total")
	val tagsTotal: Double = 0.0,
	val links: TagsListResponseLinks = TagsListResponseLinks(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class TagsListResponseLinks(
	val pages: Double = 0.0,
	val page: Double = 0.0,
	val next: String = "",
)

@Serializable
data class TagsGetParams(
    /** Page number of tagged contents. */
	val page: Long? = null,
    /** Number of tagged contents in a page. */
	val limit: Long? = null,
)

@Serializable
data class TagsGetResponse(
	val tag: TagsGetResponseTag = TagsGetResponseTag(),
	val tagged: List<TagsGetResponseTagged> = emptyList(),
	@SerialName("tagged_total")
	val taggedTotal: Double = 0.0,
	val links: TagsGetResponseLinks = TagsGetResponseLinks(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class TagsGetResponseTagLinks(
	val permalink: String = "",
	val detail: String = "",
)

@Serializable
data class TagsGetResponseTag(
	@SerialName("tag_id")
	val tagId: Double = 0.0,
	@SerialName("tag_text")
	val tagText: String = "",
	@SerialName("tag_use_count")
	val tagUseCount: Double = 0.0,
	val links: TagsGetResponseTagLinks = TagsGetResponseTagLinks(),
)

@Serializable
data class TagsGetResponseTaggedFirstPostLinks(
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
data class TagsGetResponseTaggedFirstPostPermissions(
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
data class TagsGetResponseTaggedFirstPost(
	@SerialName("post_id")
	val postId: Double = 0.0,
	@SerialName("thread_id")
	val threadId: Double = 0.0,
	@SerialName("poster_user_id")
	val posterUserId: Double = 0.0,
	@SerialName("poster_username")
	val posterUsername: String = "",
	@SerialName("poster_username_html")
	val posterUsernameHtml: String = "",
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
	val links: TagsGetResponseTaggedFirstPostLinks = TagsGetResponseTaggedFirstPostLinks(),
	val permissions: TagsGetResponseTaggedFirstPostPermissions = TagsGetResponseTaggedFirstPostPermissions(),
)

@Serializable
data class TagsGetResponseTaggedThreadPrefixes(
	@SerialName("prefix_id")
	val prefixId: Double = 0.0,
	@SerialName("prefix_title")
	val prefixTitle: String = "",
)

@Serializable
data class TagsGetResponseTaggedLinks(
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
data class TagsGetResponseTaggedPermissions(
	val view: Boolean = false,
	val delete: Boolean = false,
	val follow: Boolean = false,
	val post: Boolean = false,
	@SerialName("upload_attachment")
	val uploadAttachment: Boolean = false,
	val edit: Boolean = false,
)

@Serializable
data class TagsGetResponseTaggedForumForumPrefixesGroupPrefixes(
	@SerialName("prefix_id")
	val prefixId: Double = 0.0,
	@SerialName("prefix_title")
	val prefixTitle: String = "",
)

@Serializable
data class TagsGetResponseTaggedForumForumPrefixes(
	@SerialName("group_title")
	val groupTitle: String = "",
	@SerialName("group_prefixes")
	val groupPrefixes: List<TagsGetResponseTaggedForumForumPrefixesGroupPrefixes> = emptyList(),
)

@Serializable
data class TagsGetResponseTaggedForumLinks(
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
data class TagsGetResponseTaggedForumPermissions(
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
data class TagsGetResponseTaggedForum(
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
	val forumPrefixes: List<TagsGetResponseTaggedForumForumPrefixes> = emptyList(),
	@SerialName("thread_default_prefix_id")
	val threadDefaultPrefixId: Double = 0.0,
	@SerialName("thread_prefix_is_required")
	val threadPrefixIsRequired: Boolean = false,
	val links: TagsGetResponseTaggedForumLinks = TagsGetResponseTaggedForumLinks(),
	val permissions: TagsGetResponseTaggedForumPermissions = TagsGetResponseTaggedForumPermissions(),
	@SerialName("forum_is_followed")
	val forumIsFollowed: Boolean = false,
)

@Serializable
data class TagsGetResponseTagged(
	@SerialName("content_type")
	val contentType: String = "",
	@SerialName("content_id")
	val contentId: Double = 0.0,
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
	@SerialName("creator_username_html")
	val creatorUsernameHtml: String = "",
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
	val firstPost: TagsGetResponseTaggedFirstPost = TagsGetResponseTaggedFirstPost(),
	@SerialName("thread_prefixes")
	val threadPrefixes: List<TagsGetResponseTaggedThreadPrefixes> = emptyList(),
	@SerialName("thread_tags")
	val threadTags: JsonElement = JsonNull,
	val links: TagsGetResponseTaggedLinks = TagsGetResponseTaggedLinks(),
	val permissions: TagsGetResponseTaggedPermissions = TagsGetResponseTaggedPermissions(),
	val forum: TagsGetResponseTaggedForum = TagsGetResponseTaggedForum(),
)

@Serializable
data class TagsGetResponseLinks(
	val pages: Double = 0.0,
	val page: Double = 0.0,
	val next: String = "",
)

@Serializable
data class TagsFindParams(
    /** tag to filter. Tags start with the query will be returned. */
	val tag: String,
)

@Serializable
data class TagsFindResponse(
	val tags: List<String> = emptyList(),
	val ids: List<Long> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

// ─── SearchApi Types ────────────────────────────────────────

@Serializable
data class SearchAllBody(
    /** Search query. Can be skipped if user_id is set. */
	val q: String? = null,
    /** Tag to search for tagged contents. */
	val tag: String? = null,
    /** Id of the container forum to search for contents. Child forums of the specified forum will be included in the search. */
	@SerialName("forum_id")
	val forumId: Long? = null,
	@SerialName("user_id")
	val userId: StringOrInt? = null,
    /** Page number of results. */
	val page: Long? = null,
    /** Number of results in a page. */
	val limit: Long? = null,
    /** The time in milliseconds (e.g. 1767214800) before last content date. */
	val before: Long? = null,
)

@Serializable
data class SearchAllResponse(
	val data: List<SearchAllResponseData> = emptyList(),
	@SerialName("data_total")
	val dataTotal: Double = 0.0,
	val users: List<RespUserModel> = emptyList(),
	val links: SearchAllResponseLinks = SearchAllResponseLinks(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class SearchAllResponseDataFirstPostLinks(
	val permalink: String = "",
	val detail: String = "",
	val thread: String = "",
	val poster: String = "",
	val likes: String = "",
	val report: String = "",
	@SerialName("poster_avatar")
	val posterAvatar: String = "",
)

@Serializable
data class SearchAllResponseDataFirstPostPermissions(
	val view: Boolean = false,
	val edit: Boolean = false,
	val delete: Boolean = false,
	val reply: Boolean = false,
	val like: Boolean = false,
	val report: Boolean = false,
)

@Serializable
data class SearchAllResponseDataFirstPost(
	@SerialName("post_id")
	val postId: Double = 0.0,
	@SerialName("thread_id")
	val threadId: Double = 0.0,
	@SerialName("poster_user_id")
	val posterUserId: Double = 0.0,
	@SerialName("poster_username")
	val posterUsername: String = "",
	@SerialName("poster_username_html")
	val posterUsernameHtml: String = "",
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
	@SerialName("post_is_liked")
	val postIsLiked: Boolean = false,
	val links: SearchAllResponseDataFirstPostLinks = SearchAllResponseDataFirstPostLinks(),
	val permissions: SearchAllResponseDataFirstPostPermissions = SearchAllResponseDataFirstPostPermissions(),
	@SerialName("thread_is_deleted")
	val threadIsDeleted: Boolean = false,
)

@Serializable
data class SearchAllResponseDataLinks(
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
data class SearchAllResponseDataPermissionsBump(
	val can: Boolean = false,
	@SerialName("available_count")
	val availableCount: Double = 0.0,
	val error: JsonElement = JsonNull,
	@SerialName("next_available_time")
	val nextAvailableTime: JsonElement = JsonNull,
)

@Serializable
data class SearchAllResponseDataPermissions(
	val view: Boolean = false,
	val delete: Boolean = false,
	val follow: Boolean = false,
	val post: Boolean = false,
	val edit: Boolean = false,
	val bump: SearchAllResponseDataPermissionsBump = SearchAllResponseDataPermissionsBump(),
)

@Serializable
data class SearchAllResponseDataForumLinks(
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
data class SearchAllResponseDataForumPermissions(
	val view: Boolean = false,
	val edit: Boolean = false,
	val delete: Boolean = false,
	@SerialName("create_thread")
	val createThread: Boolean = false,
	@SerialName("tag_thread")
	val tagThread: Boolean = false,
	val follow: Boolean = false,
)

@Serializable
data class SearchAllResponseDataForum(
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
	@SerialName("parent_node_id")
	val parentNodeId: Double = 0.0,
	@SerialName("forum_prefixes")
	val forumPrefixes: List<JsonElement> = emptyList(),
	@SerialName("thread_default_prefix_id")
	val threadDefaultPrefixId: Double = 0.0,
	@SerialName("thread_prefix_is_required")
	val threadPrefixIsRequired: Boolean = false,
	val links: SearchAllResponseDataForumLinks = SearchAllResponseDataForumLinks(),
	val permissions: SearchAllResponseDataForumPermissions = SearchAllResponseDataForumPermissions(),
	@SerialName("forum_is_followed")
	val forumIsFollowed: Boolean = false,
)

@Serializable
data class SearchAllResponseDataLastPostLinks(
	val permalink: String = "",
	val detail: String = "",
	val thread: String = "",
	val poster: String = "",
	val likes: String = "",
	val report: String = "",
	@SerialName("poster_avatar")
	val posterAvatar: String = "",
)

@Serializable
data class SearchAllResponseDataLastPostPermissions(
	val view: Boolean = false,
	val edit: Boolean = false,
	val delete: Boolean = false,
	val reply: Boolean = false,
	val like: Boolean = false,
	val report: Boolean = false,
)

@Serializable
data class SearchAllResponseDataLastPost(
	@SerialName("post_id")
	val postId: Double = 0.0,
	@SerialName("thread_id")
	val threadId: Double = 0.0,
	@SerialName("poster_user_id")
	val posterUserId: Double = 0.0,
	@SerialName("poster_username")
	val posterUsername: String = "",
	@SerialName("poster_username_html")
	val posterUsernameHtml: String = "",
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
	@SerialName("post_is_liked")
	val postIsLiked: Boolean = false,
	val links: SearchAllResponseDataLastPostLinks = SearchAllResponseDataLastPostLinks(),
	val permissions: SearchAllResponseDataLastPostPermissions = SearchAllResponseDataLastPostPermissions(),
	@SerialName("thread_is_deleted")
	val threadIsDeleted: Boolean = false,
)

@Serializable
data class SearchAllResponseData(
	@SerialName("content_type")
	val contentType: String = "",
	@SerialName("content_id")
	val contentId: String = "",
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
	@SerialName("creator_username_html")
	val creatorUsernameHtml: String = "",
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
	@SerialName("thread_is_closed")
	val threadIsClosed: Boolean = false,
	@SerialName("thread_is_followed")
	val threadIsFollowed: Boolean = false,
	@SerialName("thread_is_starred")
	val threadIsStarred: Boolean = false,
	@SerialName("first_post")
	val firstPost: SearchAllResponseDataFirstPost = SearchAllResponseDataFirstPost(),
	@SerialName("thread_prefixes")
	val threadPrefixes: List<JsonElement> = emptyList(),
	@SerialName("thread_tags")
	val threadTags: List<JsonElement> = emptyList(),
	val links: SearchAllResponseDataLinks = SearchAllResponseDataLinks(),
	val permissions: SearchAllResponseDataPermissions = SearchAllResponseDataPermissions(),
	@SerialName("node_title")
	val nodeTitle: String = "",
	val forum: SearchAllResponseDataForum = SearchAllResponseDataForum(),
	@SerialName("last_post")
	val lastPost: SearchAllResponseDataLastPost = SearchAllResponseDataLastPost(),
)

@Serializable
data class SearchAllResponseLinks(
	val pages: Double = 0.0,
	val page: Double = 0.0,
	val next: String = "",
)

@Serializable
data class SearchThreadsBody(
    /** Search query. Can be skipped if user_id is set. */
	val q: String? = null,
    /** Tag to search for tagged contents. */
	val tag: String? = null,
    /** Id of the container forum to search for contents. Child forums of the specified forum will be included in the search. */
	@SerialName("forum_id")
	val forumId: Long? = null,
	@SerialName("user_id")
	val userId: StringOrInt? = null,
    /** Page number of results. */
	val page: Long? = null,
    /** Number of results in a page. */
	val limit: Long? = null,
    /** Number of thread data to be returned. */
	@SerialName("data_limit")
	val dataLimit: Long? = null,
    /** The time in milliseconds (e.g. 1767214800) before last content date. */
	val before: Long? = null,
)

@Serializable
data class SearchThreadsResponse(
	val data: List<SearchThreadsResponseData> = emptyList(),
	@SerialName("data_total")
	val dataTotal: Double = 0.0,
	val links: SearchThreadsResponseLinks = SearchThreadsResponseLinks(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class SearchThreadsResponseDataFirstPostLinks(
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
data class SearchThreadsResponseDataFirstPostPermissions(
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
data class SearchThreadsResponseDataFirstPost(
	@SerialName("post_id")
	val postId: Double = 0.0,
	@SerialName("thread_id")
	val threadId: Double = 0.0,
	@SerialName("poster_user_id")
	val posterUserId: Double = 0.0,
	@SerialName("poster_username")
	val posterUsername: String = "",
	@SerialName("poster_username_html")
	val posterUsernameHtml: String = "",
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
	val links: SearchThreadsResponseDataFirstPostLinks = SearchThreadsResponseDataFirstPostLinks(),
	val permissions: SearchThreadsResponseDataFirstPostPermissions = SearchThreadsResponseDataFirstPostPermissions(),
)

@Serializable
data class SearchThreadsResponseDataLinks(
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
	@SerialName("last_post")
	val lastPost: String = "",
)

@Serializable
data class SearchThreadsResponseDataPermissions(
	val view: Boolean = false,
	val delete: Boolean = false,
	val follow: Boolean = false,
	val post: Boolean = false,
	@SerialName("upload_attachment")
	val uploadAttachment: Boolean = false,
	val edit: Boolean = false,
)

@Serializable
data class SearchThreadsResponseDataForumLinks(
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
data class SearchThreadsResponseDataForumPermissions(
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
data class SearchThreadsResponseDataForum(
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
	val forumPrefixes: List<JsonElement> = emptyList(),
	@SerialName("thread_default_prefix_id")
	val threadDefaultPrefixId: Double = 0.0,
	@SerialName("thread_prefix_is_required")
	val threadPrefixIsRequired: Boolean = false,
	val links: SearchThreadsResponseDataForumLinks = SearchThreadsResponseDataForumLinks(),
	val permissions: SearchThreadsResponseDataForumPermissions = SearchThreadsResponseDataForumPermissions(),
	@SerialName("forum_is_followed")
	val forumIsFollowed: Boolean = false,
)

@Serializable
data class SearchThreadsResponseData(
	@SerialName("content_type")
	val contentType: String = "",
	@SerialName("content_id")
	val contentId: Double = 0.0,
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
	@SerialName("creator_username_html")
	val creatorUsernameHtml: String = "",
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
	val firstPost: SearchThreadsResponseDataFirstPost = SearchThreadsResponseDataFirstPost(),
	@SerialName("thread_prefixes")
	val threadPrefixes: List<JsonElement> = emptyList(),
	@SerialName("thread_tags")
	val threadTags: List<JsonElement> = emptyList(),
	val links: SearchThreadsResponseDataLinks = SearchThreadsResponseDataLinks(),
	val permissions: SearchThreadsResponseDataPermissions = SearchThreadsResponseDataPermissions(),
	val forum: SearchThreadsResponseDataForum = SearchThreadsResponseDataForum(),
)

@Serializable
data class SearchThreadsResponseLinks(
	val pages: Double = 0.0,
	val page: Double = 0.0,
	val next: String = "",
)

@Serializable
data class SearchPostsBody(
    /** Search query. Can be skipped if user_id is set. */
	val q: String? = null,
    /** Tag to search for tagged contents. */
	val tag: String? = null,
    /** Id of the container forum to search for contents. Child forums of the specified forum will be included in the search. */
	@SerialName("forum_id")
	val forumId: Long? = null,
	@SerialName("user_id")
	val userId: StringOrInt? = null,
    /** Page number of results. */
	val page: Long? = null,
    /** Number of results in a page. */
	val limit: Long? = null,
    /** Number of post data to be returned. */
	@SerialName("data_limit")
	val dataLimit: Long? = null,
    /** The time in milliseconds (e.g. 1767214800) before last content date. */
	val before: Long? = null,
)

@Serializable
data class SearchPostsResponse(
	val data: List<SearchPostsResponseData> = emptyList(),
	@SerialName("data_total")
	val dataTotal: Double = 0.0,
	val links: SearchPostsResponseLinks = SearchPostsResponseLinks(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class SearchPostsResponseDataFirstPostLinks(
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
data class SearchPostsResponseDataFirstPostPermissions(
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
data class SearchPostsResponseDataFirstPost(
	@SerialName("post_id")
	val postId: Double = 0.0,
	@SerialName("thread_id")
	val threadId: Double = 0.0,
	@SerialName("poster_user_id")
	val posterUserId: Double = 0.0,
	@SerialName("poster_username")
	val posterUsername: String = "",
	@SerialName("poster_username_html")
	val posterUsernameHtml: String = "",
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
	val links: SearchPostsResponseDataFirstPostLinks = SearchPostsResponseDataFirstPostLinks(),
	val permissions: SearchPostsResponseDataFirstPostPermissions = SearchPostsResponseDataFirstPostPermissions(),
)

@Serializable
data class SearchPostsResponseDataLinks(
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
	@SerialName("last_post")
	val lastPost: String = "",
)

@Serializable
data class SearchPostsResponseDataPermissions(
	val view: Boolean = false,
	val delete: Boolean = false,
	val follow: Boolean = false,
	val post: Boolean = false,
	@SerialName("upload_attachment")
	val uploadAttachment: Boolean = false,
	val edit: Boolean = false,
)

@Serializable
data class SearchPostsResponseDataForumLinks(
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
data class SearchPostsResponseDataForumPermissions(
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
data class SearchPostsResponseDataForum(
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
	val forumPrefixes: List<JsonElement> = emptyList(),
	@SerialName("thread_default_prefix_id")
	val threadDefaultPrefixId: Double = 0.0,
	@SerialName("thread_prefix_is_required")
	val threadPrefixIsRequired: Boolean = false,
	val links: SearchPostsResponseDataForumLinks = SearchPostsResponseDataForumLinks(),
	val permissions: SearchPostsResponseDataForumPermissions = SearchPostsResponseDataForumPermissions(),
	@SerialName("forum_is_followed")
	val forumIsFollowed: Boolean = false,
)

@Serializable
data class SearchPostsResponseData(
	@SerialName("content_type")
	val contentType: String = "",
	@SerialName("content_id")
	val contentId: Double = 0.0,
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
	@SerialName("creator_username_html")
	val creatorUsernameHtml: String = "",
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
	val firstPost: SearchPostsResponseDataFirstPost = SearchPostsResponseDataFirstPost(),
	@SerialName("thread_prefixes")
	val threadPrefixes: List<JsonElement> = emptyList(),
	@SerialName("thread_tags")
	val threadTags: List<JsonElement> = emptyList(),
	val links: SearchPostsResponseDataLinks = SearchPostsResponseDataLinks(),
	val permissions: SearchPostsResponseDataPermissions = SearchPostsResponseDataPermissions(),
	val forum: SearchPostsResponseDataForum = SearchPostsResponseDataForum(),
)

@Serializable
data class SearchPostsResponseLinks(
	val pages: Double = 0.0,
	val page: Double = 0.0,
	val next: String = "",
)

@Serializable
data class SearchUsersBody(
    /** Search query. */
	val q: String? = null,
)

@Serializable
data class SearchUsersResponse(
	val users: List<RespUserModel> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class SearchProfilePostsBody(
    /** Search query. Can be skipped if user_id is set. */
	val q: String? = null,
    /** User ID to filter profile posts. */
	@SerialName("user_id")
	val userId: Long? = null,
    /** Page number of results. */
	val page: Long? = null,
    /** Number of results in a page. */
	val limit: Long? = null,
    /** The time in milliseconds (e.g. 1767214800) before last content date. */
	val before: Long? = null,
)

@Serializable
data class SearchProfilePostsResponse(
	val data: List<SearchProfilePostsResponseData> = emptyList(),
	@SerialName("data_total")
	val dataTotal: Double = 0.0,
	val links: SearchProfilePostsResponseLinks = SearchProfilePostsResponseLinks(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class SearchProfilePostsResponseDataLinks(
	val permalink: String = "",
	val detail: String = "",
	val timeline: String = "",
	@SerialName("timeline_user")
	val timelineUser: String = "",
	val poster: String = "",
	val likes: String = "",
	val comments: String = "",
	val report: String = "",
	@SerialName("poster_avatar")
	val posterAvatar: String = "",
)

@Serializable
data class SearchProfilePostsResponseDataPermissions(
	val view: Boolean = false,
	val edit: Boolean = false,
	val delete: Boolean = false,
	val like: Boolean = false,
	val comment: Boolean = false,
	val report: Boolean = false,
)

@Serializable
data class SearchProfilePostsResponseData(
	@SerialName("content_type")
	val contentType: String = "",
	@SerialName("content_id")
	val contentId: Double = 0.0,
	@SerialName("profile_post_id")
	val profilePostId: Double = 0.0,
	@SerialName("timeline_user_id")
	val timelineUserId: Double = 0.0,
	@SerialName("poster_user_id")
	val posterUserId: Double = 0.0,
	@SerialName("poster_username")
	val posterUsername: String = "",
	@SerialName("poster_username_html")
	val posterUsernameHtml: String = "",
	@SerialName("post_create_date")
	val postCreateDate: Double = 0.0,
	@SerialName("post_body")
	val postBody: String = "",
	@SerialName("post_like_count")
	val postLikeCount: Double = 0.0,
	@SerialName("post_comment_count")
	val postCommentCount: Double = 0.0,
	@SerialName("timeline_username")
	val timelineUsername: String = "",
	@SerialName("user_is_ignored")
	val userIsIgnored: Boolean = false,
	@SerialName("post_is_published")
	val postIsPublished: Boolean = false,
	@SerialName("post_is_deleted")
	val postIsDeleted: Boolean = false,
	val links: SearchProfilePostsResponseDataLinks = SearchProfilePostsResponseDataLinks(),
	val permissions: SearchProfilePostsResponseDataPermissions = SearchProfilePostsResponseDataPermissions(),
	@SerialName("timeline_user")
	val timelineUser: RespUserModel = RespUserModel(),
)

@Serializable
data class SearchProfilePostsResponseLinks(
	val pages: Double = 0.0,
	val page: Double = 0.0,
	val next: String = "",
)

@Serializable
data class SearchTaggedBody(
    /** Tag to search for tagged contents. */
	val tag: String? = null,
    /** Array of tags to search for tagged contents. */
	val tags: List<String>? = null,
    /** Page number of results. */
	val page: Long? = null,
    /** Number of results in a page. */
	val limit: Long? = null,
)

@Serializable
data class SearchTaggedResponse(
	val data: List<SearchTaggedResponseData> = emptyList(),
	@SerialName("data_total")
	val dataTotal: Double = 0.0,
	@SerialName("search_tags")
	val searchTags: JsonElement = JsonNull,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class SearchTaggedResponseDataFirstPostLinks(
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
data class SearchTaggedResponseDataFirstPostPermissions(
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
data class SearchTaggedResponseDataFirstPost(
	@SerialName("post_id")
	val postId: Double = 0.0,
	@SerialName("thread_id")
	val threadId: Double = 0.0,
	@SerialName("poster_user_id")
	val posterUserId: Double = 0.0,
	@SerialName("poster_username")
	val posterUsername: String = "",
	@SerialName("poster_username_html")
	val posterUsernameHtml: String = "",
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
	val links: SearchTaggedResponseDataFirstPostLinks = SearchTaggedResponseDataFirstPostLinks(),
	val permissions: SearchTaggedResponseDataFirstPostPermissions = SearchTaggedResponseDataFirstPostPermissions(),
)

@Serializable
data class SearchTaggedResponseDataLinks(
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
	@SerialName("last_post")
	val lastPost: String = "",
)

@Serializable
data class SearchTaggedResponseDataPermissions(
	val view: Boolean = false,
	val delete: Boolean = false,
	val follow: Boolean = false,
	val post: Boolean = false,
	@SerialName("upload_attachment")
	val uploadAttachment: Boolean = false,
	val edit: Boolean = false,
	@SerialName("edit_title")
	val editTitle: Boolean = false,
	@SerialName("edit_tags")
	val editTags: Boolean = false,
)

@Serializable
data class SearchTaggedResponseDataForumForumPrefixesGroupPrefixes(
	@SerialName("prefix_id")
	val prefixId: Double = 0.0,
	@SerialName("prefix_title")
	val prefixTitle: String = "",
)

@Serializable
data class SearchTaggedResponseDataForumForumPrefixes(
	@SerialName("group_title")
	val groupTitle: String = "",
	@SerialName("group_prefixes")
	val groupPrefixes: List<SearchTaggedResponseDataForumForumPrefixesGroupPrefixes> = emptyList(),
)

@Serializable
data class SearchTaggedResponseDataForumLinks(
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
data class SearchTaggedResponseDataForumPermissions(
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
data class SearchTaggedResponseDataForum(
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
	val forumPrefixes: List<SearchTaggedResponseDataForumForumPrefixes> = emptyList(),
	@SerialName("thread_default_prefix_id")
	val threadDefaultPrefixId: Double = 0.0,
	@SerialName("thread_prefix_is_required")
	val threadPrefixIsRequired: Boolean = false,
	val links: SearchTaggedResponseDataForumLinks = SearchTaggedResponseDataForumLinks(),
	val permissions: SearchTaggedResponseDataForumPermissions = SearchTaggedResponseDataForumPermissions(),
	@SerialName("forum_is_followed")
	val forumIsFollowed: Boolean = false,
)

@Serializable
data class SearchTaggedResponseData(
	@SerialName("content_type")
	val contentType: String = "",
	@SerialName("content_id")
	val contentId: Double = 0.0,
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
	@SerialName("creator_username_html")
	val creatorUsernameHtml: String = "",
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
	val firstPost: SearchTaggedResponseDataFirstPost = SearchTaggedResponseDataFirstPost(),
	@SerialName("thread_prefixes")
	val threadPrefixes: List<JsonElement> = emptyList(),
	@SerialName("thread_tags")
	val threadTags: JsonElement = JsonNull,
	val links: SearchTaggedResponseDataLinks = SearchTaggedResponseDataLinks(),
	val permissions: SearchTaggedResponseDataPermissions = SearchTaggedResponseDataPermissions(),
	val forum: SearchTaggedResponseDataForum = SearchTaggedResponseDataForum(),
)

@Serializable
data class SearchResultsParams(
    /** Page number of results. */
	val page: Long? = null,
    /** Number of results in a page. */
	val limit: Long? = null,
)

@Serializable
data class SearchResultsResponse(
	val data: List<SearchResultsResponseData> = emptyList(),
	@SerialName("data_total")
	val dataTotal: Double = 0.0,
	@SerialName("search_tags")
	val searchTags: JsonElement = JsonNull,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class SearchResultsResponseDataFirstPostLinks(
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
data class SearchResultsResponseDataFirstPostPermissions(
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
data class SearchResultsResponseDataFirstPost(
	@SerialName("post_id")
	val postId: Double = 0.0,
	@SerialName("thread_id")
	val threadId: Double = 0.0,
	@SerialName("poster_user_id")
	val posterUserId: Double = 0.0,
	@SerialName("poster_username")
	val posterUsername: String = "",
	@SerialName("poster_username_html")
	val posterUsernameHtml: String = "",
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
	val links: SearchResultsResponseDataFirstPostLinks = SearchResultsResponseDataFirstPostLinks(),
	val permissions: SearchResultsResponseDataFirstPostPermissions = SearchResultsResponseDataFirstPostPermissions(),
)

@Serializable
data class SearchResultsResponseDataLinks(
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
	@SerialName("last_post")
	val lastPost: String = "",
)

@Serializable
data class SearchResultsResponseDataPermissions(
	val view: Boolean = false,
	val delete: Boolean = false,
	val follow: Boolean = false,
	val post: Boolean = false,
	@SerialName("upload_attachment")
	val uploadAttachment: Boolean = false,
	val edit: Boolean = false,
	@SerialName("edit_title")
	val editTitle: Boolean = false,
	@SerialName("edit_tags")
	val editTags: Boolean = false,
)

@Serializable
data class SearchResultsResponseDataForumForumPrefixesGroupPrefixes(
	@SerialName("prefix_id")
	val prefixId: Double = 0.0,
	@SerialName("prefix_title")
	val prefixTitle: String = "",
)

@Serializable
data class SearchResultsResponseDataForumForumPrefixes(
	@SerialName("group_title")
	val groupTitle: String = "",
	@SerialName("group_prefixes")
	val groupPrefixes: List<SearchResultsResponseDataForumForumPrefixesGroupPrefixes> = emptyList(),
)

@Serializable
data class SearchResultsResponseDataForumLinks(
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
data class SearchResultsResponseDataForumPermissions(
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
data class SearchResultsResponseDataForum(
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
	val forumPrefixes: List<SearchResultsResponseDataForumForumPrefixes> = emptyList(),
	@SerialName("thread_default_prefix_id")
	val threadDefaultPrefixId: Double = 0.0,
	@SerialName("thread_prefix_is_required")
	val threadPrefixIsRequired: Boolean = false,
	val links: SearchResultsResponseDataForumLinks = SearchResultsResponseDataForumLinks(),
	val permissions: SearchResultsResponseDataForumPermissions = SearchResultsResponseDataForumPermissions(),
	@SerialName("forum_is_followed")
	val forumIsFollowed: Boolean = false,
)

@Serializable
data class SearchResultsResponseData(
	@SerialName("content_type")
	val contentType: String = "",
	@SerialName("content_id")
	val contentId: Double = 0.0,
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
	@SerialName("creator_username_html")
	val creatorUsernameHtml: String = "",
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
	val firstPost: SearchResultsResponseDataFirstPost = SearchResultsResponseDataFirstPost(),
	@SerialName("thread_prefixes")
	val threadPrefixes: List<JsonElement> = emptyList(),
	@SerialName("thread_tags")
	val threadTags: JsonElement = JsonNull,
	val links: SearchResultsResponseDataLinks = SearchResultsResponseDataLinks(),
	val permissions: SearchResultsResponseDataPermissions = SearchResultsResponseDataPermissions(),
	val forum: SearchResultsResponseDataForum = SearchResultsResponseDataForum(),
)

// ─── BatchApi Types ────────────────────────────────────────

typealias BatchExecuteBody = List<JsonObject>

@Serializable
data class BatchExecuteResponse(
	val jobs: BatchExecuteResponseJobs = BatchExecuteResponseJobs(),
)

@Serializable
data class BatchExecuteResponseJobs(
	@SerialName("job_id")
	val jobId: JsonObject = JsonObject(emptyMap()),
)

// ─── ChatboxApi Types ────────────────────────────────────────

@Serializable
data class ChatboxIndexParams(
    /** Room id. */
	@SerialName("room_id")
	val roomId: RoomId? = null,
)

@Serializable
data class ChatboxIndexResponse(
	val rooms: List<ChatboxIndexResponseRooms> = emptyList(),
	val ban: JsonElement = JsonNull,
	val ignore: List<ChatboxIndexResponseIgnore> = emptyList(),
	val permissions: ChatboxIndexResponsePermissions = ChatboxIndexResponsePermissions(),
	val commands: List<String> = emptyList(),
	val roomsOnline: ChatboxIndexResponseRoomsOnline = ChatboxIndexResponseRoomsOnline(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ChatboxIndexResponseRooms(
	@SerialName("can_report")
	val canReport: Boolean = false,
	val eng: Boolean = false,
	val market: Boolean = false,
	@SerialName("room_id")
	val roomId: Double = 0.0,
	val title: String = "",
)

@Serializable
data class ChatboxIndexResponseIgnoreRenderedAvatars(
	val l: String = "",
	val m: String = "",
	val s: String = "",
)

@Serializable
data class ChatboxIndexResponseIgnoreRendered(
	val username: String = "",
	val avatars: ChatboxIndexResponseIgnoreRenderedAvatars = ChatboxIndexResponseIgnoreRenderedAvatars(),
	val link: String = "",
)

@Serializable
data class ChatboxIndexResponseIgnore(
	@SerialName("avatar_date")
	val avatarDate: Double = 0.0,
	@SerialName("background_date")
	val backgroundDate: Double = 0.0,
	@SerialName("contest_count")
	val contestCount: Double = 0.0,
	@SerialName("custom_title")
	val customTitle: String = "",
	@SerialName("display_banner_id")
	val displayBannerId: Double = 0.0,
	@SerialName("display_icon_group_id")
	val displayIconGroupId: Double = 0.0,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Double = 0.0,
	@SerialName("is_admin")
	val isAdmin: Boolean = false,
	@SerialName("is_banned")
	val isBanned: Boolean = false,
	@SerialName("is_moderator")
	val isModerator: Boolean = false,
	@SerialName("is_staff")
	val isStaff: Boolean = false,
	@SerialName("last_activity")
	val lastActivity: Double = 0.0,
	@SerialName("like2_count")
	val like2Count: Double = 0.0,
	@SerialName("like_count")
	val likeCount: Double = 0.0,
	@SerialName("message_count")
	val messageCount: Double = 0.0,
	@SerialName("register_date")
	val registerDate: Double = 0.0,
	val rendered: ChatboxIndexResponseIgnoreRendered = ChatboxIndexResponseIgnoreRendered(),
	@SerialName("short_link")
	val shortLink: JsonElement = JsonNull,
	@SerialName("trophy_points")
	val trophyPoints: Double = 0.0,
	@SerialName("uniq_banner")
	val uniqBanner: JsonElement = JsonNull,
	@SerialName("uniq_username_css")
	val uniqUsernameCss: String = "",
	@SerialName("user_id")
	val userId: Double = 0.0,
	val username: String = "",
)

@Serializable
data class ChatboxIndexResponsePermissions(
	val deleteAnyMessage: Boolean = false,
	val editAnyMessage: Boolean = false,
	val viewAnyMessage: Boolean = false,
	val viewMessages: Boolean = false,
	val postMessage: Boolean = false,
	val ban: Boolean = false,
)

@Serializable
data class ChatboxIndexResponseRoomsOnline(
	@SerialName("chat:0")
	val chat_0: Double = 0.0,
)

@Serializable
data class ChatboxGetMessagesParams(
    /** Room id. */
	@SerialName("room_id")
	val roomId: RoomId,
    /** Message id to get older chat messages. */
	@SerialName("before_message_id")
	val beforeMessageId: Long? = null,
)

@Serializable
data class ChatboxGetMessagesResponse(
	val messages: List<RespChatboxMessageModel> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ChatboxPostMessageBody(
    /** Room ID. */
	@SerialName("room_id")
	val roomId: RoomId,
    /** Content of the chat message. */
	val message: String,
    /** ID of the message being replied to. */
	@SerialName("reply_message_id")
	val replyMessageId: Long? = null,
)

@Serializable
data class ChatboxPostMessageResponse(
	val message: RespChatboxMessageModel = RespChatboxMessageModel(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ChatboxEditMessageBody(
    /** Message id. */
	@SerialName("message_id")
	val messageId: Long,
    /** New content of the chat message. */
	val message: String,
)

@Serializable
data class ChatboxEditMessageResponse(
	val message: RespChatboxMessageModel = RespChatboxMessageModel(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ChatboxDeleteMessageBody(
    /** Message id. */
	@SerialName("message_id")
	val messageId: Long,
)

@Serializable
data class ChatboxDeleteMessageResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ChatboxOnlineParams(
    /** Room id. */
	@SerialName("room_id")
	val roomId: RoomId,
)

@Serializable
data class ChatboxOnlineResponse(
	val users: List<ChatboxOnlineResponseUsers> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ChatboxOnlineResponseUsersRenderedAvatars(
	val l: String = "",
	val m: String = "",
	val s: String = "",
)

@Serializable
data class ChatboxOnlineResponseUsersRendered(
	val username: String = "",
	val avatars: ChatboxOnlineResponseUsersRenderedAvatars = ChatboxOnlineResponseUsersRenderedAvatars(),
	val link: String = "",
)

@Serializable
data class ChatboxOnlineResponseUsersUniqBanner(
	@SerialName("banner_css")
	val bannerCss: String = "",
	@SerialName("banner_text")
	val bannerText: String = "",
	@SerialName("banner_icon")
	val bannerIcon: String = "",
	@SerialName("username_icon")
	val usernameIcon: String = "",
)

@Serializable
data class ChatboxOnlineResponseUsers(
	@SerialName("avatar_date")
	val avatarDate: Double = 0.0,
	@SerialName("background_date")
	val backgroundDate: Double = 0.0,
	@SerialName("contest_count")
	val contestCount: Double = 0.0,
	@SerialName("custom_title")
	val customTitle: String = "",
	@SerialName("display_banner_id")
	val displayBannerId: Double = 0.0,
	@SerialName("display_icon_group_id")
	val displayIconGroupId: Double = 0.0,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Double = 0.0,
	@SerialName("is_admin")
	val isAdmin: Boolean = false,
	@SerialName("is_banned")
	val isBanned: Boolean = false,
	@SerialName("is_moderator")
	val isModerator: Boolean = false,
	@SerialName("is_staff")
	val isStaff: Boolean = false,
	@SerialName("last_activity")
	val lastActivity: Double = 0.0,
	@SerialName("like2_count")
	val like2Count: Double = 0.0,
	@SerialName("like_count")
	val likeCount: Double = 0.0,
	@SerialName("message_count")
	val messageCount: Double = 0.0,
	@SerialName("register_date")
	val registerDate: Double = 0.0,
	val rendered: ChatboxOnlineResponseUsersRendered = ChatboxOnlineResponseUsersRendered(),
	@SerialName("short_link")
	val shortLink: String = "",
	@SerialName("trophy_points")
	val trophyPoints: Double = 0.0,
	@SerialName("uniq_banner")
	val uniqBanner: ChatboxOnlineResponseUsersUniqBanner = ChatboxOnlineResponseUsersUniqBanner(),
	@SerialName("uniq_username_css")
	val uniqUsernameCss: String = "",
	@SerialName("user_id")
	val userId: Double = 0.0,
	val username: String = "",
)

@Serializable
data class ChatboxReportReasonsParams(
    /** Message id. */
	@SerialName("message_id")
	val messageId: Long,
)

@Serializable
data class ChatboxReportReasonsResponse(
	val reasons: List<String> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ChatboxReportBody(
    /** Message id. */
	@SerialName("message_id")
	val messageId: Long,
    /** Report reason. */
	val reason: String,
)

@Serializable
data class ChatboxReportResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ChatboxGetLeaderboardParams(
    /** Duration. */
	val duration: Duration? = null,
)

@Serializable
data class ChatboxGetLeaderboardResponse(
	val leaderboard: List<ChatboxGetLeaderboardResponseLeaderboard> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ChatboxGetLeaderboardResponseLeaderboardRenderedAvatars(
	val l: String = "",
	val m: String = "",
	val s: String = "",
)

@Serializable
data class ChatboxGetLeaderboardResponseLeaderboardRendered(
	val username: String = "",
	val avatars: ChatboxGetLeaderboardResponseLeaderboardRenderedAvatars = ChatboxGetLeaderboardResponseLeaderboardRenderedAvatars(),
	val link: String = "",
)

@Serializable
data class ChatboxGetLeaderboardResponseLeaderboardUniqBanner(
	@SerialName("banner_css")
	val bannerCss: String = "",
	@SerialName("banner_text")
	val bannerText: String = "",
	@SerialName("banner_icon")
	val bannerIcon: String = "",
)

@Serializable
data class ChatboxGetLeaderboardResponseLeaderboard(
	val count: Double = 0.0,
	@SerialName("user_id")
	val userId: Double = 0.0,
	@SerialName("avatar_date")
	val avatarDate: Double = 0.0,
	@SerialName("background_date")
	val backgroundDate: Double = 0.0,
	@SerialName("contest_count")
	val contestCount: Double = 0.0,
	@SerialName("custom_title")
	val customTitle: String = "",
	@SerialName("display_banner_id")
	val displayBannerId: Double = 0.0,
	@SerialName("display_icon_group_id")
	val displayIconGroupId: Double = 0.0,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Double = 0.0,
	@SerialName("is_banned")
	val isBanned: Boolean = false,
	@SerialName("last_activity")
	val lastActivity: Double = 0.0,
	@SerialName("like2_count")
	val like2Count: Double = 0.0,
	@SerialName("like_count")
	val likeCount: Double = 0.0,
	@SerialName("message_count")
	val messageCount: Double = 0.0,
	@SerialName("register_date")
	val registerDate: Double = 0.0,
	val rendered: ChatboxGetLeaderboardResponseLeaderboardRendered = ChatboxGetLeaderboardResponseLeaderboardRendered(),
	@SerialName("short_link")
	val shortLink: JsonElement = JsonNull,
	@SerialName("trophy_points")
	val trophyPoints: Double = 0.0,
	@SerialName("uniq_banner")
	val uniqBanner: ChatboxGetLeaderboardResponseLeaderboardUniqBanner = ChatboxGetLeaderboardResponseLeaderboardUniqBanner(),
	@SerialName("uniq_username_css")
	val uniqUsernameCss: String = "",
	val username: String = "",
)

@Serializable
data class ChatboxGetIgnoreResponse(
	val ignored: List<ChatboxGetIgnoreResponseIgnored> = emptyList(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class ChatboxGetIgnoreResponseIgnoredRenderedAvatars(
	val l: String = "",
	val m: String = "",
	val s: String = "",
)

@Serializable
data class ChatboxGetIgnoreResponseIgnoredRendered(
	val username: String = "",
	val avatars: ChatboxGetIgnoreResponseIgnoredRenderedAvatars = ChatboxGetIgnoreResponseIgnoredRenderedAvatars(),
	val link: String = "",
)

@Serializable
data class ChatboxGetIgnoreResponseIgnored(
	@SerialName("avatar_date")
	val avatarDate: Double = 0.0,
	@SerialName("background_date")
	val backgroundDate: Double = 0.0,
	@SerialName("contest_count")
	val contestCount: Double = 0.0,
	@SerialName("custom_title")
	val customTitle: String = "",
	@SerialName("display_banner_id")
	val displayBannerId: Double = 0.0,
	@SerialName("display_icon_group_id")
	val displayIconGroupId: Double = 0.0,
	@SerialName("display_style_group_id")
	val displayStyleGroupId: Double = 0.0,
	@SerialName("is_banned")
	val isBanned: Boolean = false,
	@SerialName("last_activity")
	val lastActivity: Double = 0.0,
	@SerialName("like2_count")
	val like2Count: Double = 0.0,
	@SerialName("like_count")
	val likeCount: Double = 0.0,
	@SerialName("message_count")
	val messageCount: Double = 0.0,
	@SerialName("register_date")
	val registerDate: Double = 0.0,
	val rendered: ChatboxGetIgnoreResponseIgnoredRendered = ChatboxGetIgnoreResponseIgnoredRendered(),
	@SerialName("short_link")
	val shortLink: JsonElement = JsonNull,
	@SerialName("trophy_points")
	val trophyPoints: Double = 0.0,
	@SerialName("uniq_banner")
	val uniqBanner: JsonElement = JsonNull,
	@SerialName("uniq_username_css")
	val uniqUsernameCss: String = "",
	@SerialName("user_id")
	val userId: Double = 0.0,
	val username: String = "",
)

@Serializable
data class ChatboxPostIgnoreBody(
	@SerialName("user_id")
	val userId: StringOrInt,
)

@Serializable
data class ChatboxPostIgnoreResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

@Serializable
data class ChatboxDeleteIgnoreBody(
	@SerialName("user_id")
	val userId: StringOrInt,
)

@Serializable
data class ChatboxDeleteIgnoreResponse(
	val status: String? = null,
	val message: String? = null,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo? = null,
)

// ─── FormsApi Types ────────────────────────────────────────

@Serializable
data class FormsListParams(
    /** Page number of forms. */
	val page: Long? = null,
)

@Serializable
data class FormsListResponse(
	val forms: List<FormsListResponseForms> = emptyList(),
	val formsPerPage: Double = 0.0,
	val page: Double = 0.0,
	val totalForms: Double = 0.0,
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class FormsListResponseFormsFieldsFieldChoices(
	val buy: String = "",
	val sell: String = "",
)

@Serializable
data class FormsListResponseFormsFields(
	@SerialName("field_id")
	val fieldId: Double = 0.0,
	val title: String = "",
	val fieldChoices: FormsListResponseFormsFieldsFieldChoices = FormsListResponseFormsFieldsFieldChoices(),
	val required: Double = 0.0,
	@SerialName("max_length")
	val maxLength: Double = 0.0,
	@SerialName("default_value")
	val defaultValue: String = "",
)

@Serializable
data class FormsListResponseForms(
	@SerialName("form_id")
	val formId: Double = 0.0,
	val title: String = "",
	val description: String = "",
	val fields: List<FormsListResponseFormsFields> = emptyList(),
)

@Serializable
@JsonClassDiscriminator("form_id")
sealed interface FormsCreateBody

@Serializable
@SerialName("1")
data class FormsCreateBodyV1(
	val fields: JsonObject,
) : FormsCreateBody
@Serializable
@SerialName("3")
data class FormsCreateBodyV3(
	val fields: JsonObject,
) : FormsCreateBody

@Serializable
data class FormsCreateResponse(
	val message: String = "",
	val content: FormsCreateResponseContent = FormsCreateResponseContent(),
	@SerialName("system_info")
	val systemInfo: RespSystemInfo = RespSystemInfo(),
)

@Serializable
data class FormsCreateResponseContentLinks(
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
)

@Serializable
data class FormsCreateResponseContentPermissions(
	val view: Boolean = false,
	val delete: Boolean = false,
	val follow: Boolean = false,
	val post: Boolean = false,
)

@Serializable
data class FormsCreateResponseContent(
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
	@SerialName("creator_username_html")
	val creatorUsernameHtml: String = "",
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
	@SerialName("thread_is_closed")
	val threadIsClosed: Boolean = false,
	@SerialName("thread_is_followed")
	val threadIsFollowed: Boolean = false,
	@SerialName("thread_prefixes")
	val threadPrefixes: List<JsonElement> = emptyList(),
	@SerialName("thread_tags")
	val threadTags: List<JsonElement> = emptyList(),
	val links: FormsCreateResponseContentLinks = FormsCreateResponseContentLinks(),
	val permissions: FormsCreateResponseContentPermissions = FormsCreateResponseContentPermissions(),
	@SerialName("node_title")
	val nodeTitle: String = "",
)

