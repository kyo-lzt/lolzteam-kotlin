// Auto-generated. Do not edit manually.

package com.lolzteam.api.generated.forum

import com.lolzteam.api.runtime.StringOrInt
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
import kotlinx.serialization.json.JsonObject

// ─── Enums ───────────────────────────────────────────────────────

@Serializable(with = AllowInviteGroupSerializer::class)
enum class AllowInviteGroup(val value: String) {
    NONE("none"),
    MEMBERS("members"),
    FOLLOWED("followed"),
}

internal object AllowInviteGroupSerializer : KSerializer<AllowInviteGroup> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("AllowInviteGroup", PrimitiveKind.STRING)

    override fun serialize(
        encoder: Encoder,
        value: AllowInviteGroup,
    ) {
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
    FOLLOWED("followed"),
}

internal object AllowPostProfileSerializer : KSerializer<AllowPostProfile> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("AllowPostProfile", PrimitiveKind.STRING)

    override fun serialize(
        encoder: Encoder,
        value: AllowPostProfile,
    ) {
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
    FOLLOWED("followed"),
}

internal object AllowReceiveNewsFeedSerializer : KSerializer<AllowReceiveNewsFeed> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("AllowReceiveNewsFeed", PrimitiveKind.STRING)

    override fun serialize(
        encoder: Encoder,
        value: AllowReceiveNewsFeed,
    ) {
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
    FOLLOWED("followed"),
}

internal object AllowSendPersonalConversationSerializer : KSerializer<AllowSendPersonalConversation> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("AllowSendPersonalConversation", PrimitiveKind.STRING)

    override fun serialize(
        encoder: Encoder,
        value: AllowSendPersonalConversation,
    ) {
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
    FOLLOWED("followed"),
}

internal object AllowViewProfileSerializer : KSerializer<AllowViewProfile> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("AllowViewProfile", PrimitiveKind.STRING)

    override fun serialize(
        encoder: Encoder,
        value: AllowViewProfile,
    ) {
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
    LIST("list"),
}

internal object CategoriesOrderSerializer : KSerializer<CategoriesOrder> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("CategoriesOrder", PrimitiveKind.STRING)

    override fun serialize(
        encoder: Encoder,
        value: CategoriesOrder,
    ) {
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
    SETTLED("settled"),
}

internal object ClaimStateSerializer : KSerializer<ClaimState> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("ClaimState", PrimitiveKind.STRING)

    override fun serialize(
        encoder: Encoder,
        value: ClaimState,
    ) {
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
    PROFILE_POST_COMMENT("profile_post_comment"),
}

internal object ContentTypeSerializer : KSerializer<ContentType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("ContentType", PrimitiveKind.STRING)

    override fun serialize(
        encoder: Encoder,
        value: ContentType,
    ) {
        encoder.encodeString(value.value)
    }

    override fun deserialize(decoder: Decoder): ContentType {
        val v = decoder.decodeString()
        return ContentType.entries.first { it.value == v }
    }
}

@Serializable(with = ContestTypeSerializer::class)
enum class ContestType(val value: String) {
    BY_FINISH_DATE("by_finish_date"),
}

internal object ContestTypeSerializer : KSerializer<ContestType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("ContestType", PrimitiveKind.STRING)

    override fun serialize(
        encoder: Encoder,
        value: ContestType,
    ) {
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
    NATURAL_REVERSE("natural_reverse"),
}

internal object ConversationsOrderSerializer : KSerializer<ConversationsOrder> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("ConversationsOrder", PrimitiveKind.STRING)

    override fun serialize(
        encoder: Encoder,
        value: ConversationsOrder,
    ) {
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
    TRY("try"),
}

internal object CurrencySerializer : KSerializer<Currency> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("Currency", PrimitiveKind.STRING)

    override fun serialize(
        encoder: Encoder,
        value: Currency,
    ) {
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
    DELETE_IGNORE("delete_ignore"),
}

internal object DeleteTypeSerializer : KSerializer<DeleteType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("DeleteType", PrimitiveKind.STRING)

    override fun serialize(
        encoder: Encoder,
        value: DeleteType,
    ) {
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
    DESC("desc"),
}

internal object DirectionSerializer : KSerializer<Direction> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("Direction", PrimitiveKind.STRING)

    override fun serialize(
        encoder: Encoder,
        value: Direction,
    ) {
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
    MONTH("month"),
}

internal object DurationSerializer : KSerializer<Duration> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("Duration", PrimitiveKind.STRING)

    override fun serialize(
        encoder: Encoder,
        value: Duration,
    ) {
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
    P2P("p2p"),
}

internal object FolderSerializer : KSerializer<Folder> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("Folder", PrimitiveKind.STRING)

    override fun serialize(
        encoder: Encoder,
        value: Folder,
    ) {
        encoder.encodeString(value.value)
    }

    override fun deserialize(decoder: Decoder): Folder {
        val v = decoder.decodeString()
        return Folder.entries.first { it.value == v }
    }
}

@Serializable(with = FormIdSerializer::class)
enum class FormId(val value: Long) {
    V3(3),
}

internal object FormIdSerializer : KSerializer<FormId> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("FormId", PrimitiveKind.LONG)

    override fun serialize(
        encoder: Encoder,
        value: FormId,
    ) {
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
    FEMALE("female"),
}

internal object GenderSerializer : KSerializer<Gender> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("Gender", PrimitiveKind.STRING)

    override fun serialize(
        encoder: Encoder,
        value: Gender,
    ) {
        encoder.encodeString(value.value)
    }

    override fun deserialize(decoder: Decoder): Gender {
        val v = decoder.decodeString()
        return Gender.entries.first { it.value == v }
    }
}

@Serializable(with = GrantTypeSerializer::class)
enum class GrantType(val value: String) {
    PASSWORD("password"),
}

internal object GrantTypeSerializer : KSerializer<GrantType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("GrantType", PrimitiveKind.STRING)

    override fun serialize(
        encoder: Encoder,
        value: GrantType,
    ) {
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
    V2(2),
}

internal object LanguageIdSerializer : KSerializer<LanguageId> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("LanguageId", PrimitiveKind.LONG)

    override fun serialize(
        encoder: Encoder,
        value: LanguageId,
    ) {
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
    DAYS("days"),
}

internal object LengthOptionSerializer : KSerializer<LengthOption> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("LengthOption", PrimitiveKind.STRING)

    override fun serialize(
        encoder: Encoder,
        value: LengthOption,
    ) {
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
    LIKE2("like2"),
}

internal object LikeTypeSerializer : KSerializer<LikeType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("LikeType", PrimitiveKind.STRING)

    override fun serialize(
        encoder: Encoder,
        value: LikeType,
    ) {
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
    NOMARKET("nomarket"),
}

internal object NotificationsTypeSerializer : KSerializer<NotificationsType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("NotificationsType", PrimitiveKind.STRING)

    override fun serialize(
        encoder: Encoder,
        value: NotificationsType,
    ) {
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
    LATER("later"),
}

internal object PayClaimSerializer : KSerializer<PayClaim> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("PayClaim", PrimitiveKind.STRING)

    override fun serialize(
        encoder: Encoder,
        value: PayClaim,
    ) {
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
    YEAR("year"),
}

internal object PeriodSerializer : KSerializer<Period> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("Period", PrimitiveKind.STRING)

    override fun serialize(
        encoder: Encoder,
        value: Period,
    ) {
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
    POST_LIKES_REVERSE("post_likes_reverse"),
}

internal object PostsOrderSerializer : KSerializer<PostsOrder> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("PostsOrder", PrimitiveKind.STRING)

    override fun serialize(
        encoder: Encoder,
        value: PostsOrder,
    ) {
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
    V22(22),
}

internal object PrizeDataUpgradeSerializer : KSerializer<PrizeDataUpgrade> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("PrizeDataUpgrade", PrimitiveKind.LONG)

    override fun serialize(
        encoder: Encoder,
        value: PrizeDataUpgrade,
    ) {
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
    UPGRADES("upgrades"),
}

internal object PrizeTypeSerializer : KSerializer<PrizeType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("PrizeType", PrimitiveKind.STRING)

    override fun serialize(
        encoder: Encoder,
        value: PrizeType,
    ) {
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
    V351(351),
}

internal object ReplyGroupSerializer : KSerializer<ReplyGroup> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("ReplyGroup", PrimitiveKind.LONG)

    override fun serialize(
        encoder: Encoder,
        value: ReplyGroup,
    ) {
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
    V13(13),
}

internal object RoomIdSerializer : KSerializer<RoomId> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("RoomId", PrimitiveKind.LONG)

    override fun serialize(
        encoder: Encoder,
        value: RoomId,
    ) {
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
    CLOSED("closed"),
}

internal object StateSerializer : KSerializer<State> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("State", PrimitiveKind.STRING)

    override fun serialize(
        encoder: Encoder,
        value: State,
    ) {
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
    VOTE_COUNT("vote_count"),
}

internal object ThreadsOrderSerializer : KSerializer<ThreadsOrder> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("ThreadsOrder", PrimitiveKind.STRING)

    override fun serialize(
        encoder: Encoder,
        value: ThreadsOrder,
    ) {
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
    PACIFIC_KIRITIMATI("Pacific/Kiritimati"),
}

internal object TimezoneSerializer : KSerializer<Timezone> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("Timezone", PrimitiveKind.STRING)

    override fun serialize(
        encoder: Encoder,
        value: Timezone,
    ) {
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
    NOTSAFE("notsafe"),
}

internal object TransferTypeSerializer : KSerializer<TransferType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("TransferType", PrimitiveKind.STRING)

    override fun serialize(
        encoder: Encoder,
        value: TransferType,
    ) {
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
    FOLLOW_DATE_REVERSE("follow_date_reverse"),
}

internal object UsersOrderSerializer : KSerializer<UsersOrder> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("UsersOrder", PrimitiveKind.STRING)

    override fun serialize(
        encoder: Encoder,
        value: UsersOrder,
    ) {
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
    GIVEN("given"),
}

internal object UsersTypeSerializer : KSerializer<UsersType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("UsersType", PrimitiveKind.STRING)

    override fun serialize(
        encoder: Encoder,
        value: UsersType,
    ) {
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
    val notificationId: Long,
    @SerialName("notification_create_date")
    val notificationCreateDate: Long,
    @SerialName("content_type")
    val contentType: String,
    @SerialName("content_id")
    val contentId: Long,
    @SerialName("content_action")
    val contentAction: String,
    @SerialName("notification_is_unread")
    val notificationIsUnread: Boolean,
    @SerialName("creator_user_id")
    val creatorUserId: Long,
    @SerialName("creator_username")
    val creatorUsername: String,
    @SerialName("creator_username_html")
    val creatorUsernameHtml: String,
    @SerialName("notification_type")
    val notificationType: String,
    val links: RespNotificationModelLinks,
    @SerialName("notification_html")
    val notificationHtml: String,
)

@Serializable
data class RespNotificationModelLinks(
    val content: String,
    @SerialName("creator_avatar")
    val creatorAvatar: String,
)

@Serializable
data class RespLinkModel(
    @SerialName("link_id")
    val linkId: Long,
    @SerialName("link_title")
    val linkTitle: String,
    @SerialName("link_description")
    val linkDescription: String,
    val links: RespLinkModelLinks,
    val permissions: RespLinkModelPermissions,
)

@Serializable
data class RespLinkModelLinks(
    val target: String,
    val detail: String,
)

@Serializable
data class RespLinkModelPermissions(
    val view: Boolean,
)

@Serializable
data class RespChatboxMessageModel(
    @SerialName("can_report")
    val canReport: Boolean,
    val date: Long,
    @SerialName("is_deleted")
    val isDeleted: Boolean,
    val message: String,
    @SerialName("message_id")
    val messageId: Long,
    val messageJson: String,
    val messageRaw: String,
    val room: RespChatboxMessageModelRoom,
    val user: RespChatboxMessageModelUser,
)

@Serializable
data class RespChatboxMessageModelRoom(
    @SerialName("can_report")
    val canReport: Boolean,
    val eng: Boolean,
    val market: Boolean,
    @SerialName("room_id")
    val roomId: Long,
    val title: String,
)

@Serializable
data class RespChatboxMessageModelUserRenderedAvatars(
    val l: String,
    val m: String,
    val s: String,
)

@Serializable
data class RespChatboxMessageModelUserRendered(
    val username: String,
    val avatars: RespChatboxMessageModelUserRenderedAvatars,
    val link: String,
)

@Serializable
data class RespChatboxMessageModelUserUniqBanner(
    @SerialName("banner_css")
    val bannerCss: String,
    @SerialName("banner_text")
    val bannerText: String,
    @SerialName("banner_icon")
    val bannerIcon: String,
    @SerialName("username_icon")
    val usernameIcon: String,
)

@Serializable
data class RespChatboxMessageModelUser(
    @SerialName("avatar_date")
    val avatarDate: Long,
    @SerialName("background_date")
    val backgroundDate: Long,
    @SerialName("contest_count")
    val contestCount: Long,
    @SerialName("custom_title")
    val customTitle: String,
    @SerialName("display_banner_id")
    val displayBannerId: Long,
    @SerialName("display_icon_group_id")
    val displayIconGroupId: Long,
    @SerialName("display_style_group_id")
    val displayStyleGroupId: Long,
    @SerialName("is_admin")
    val isAdmin: Boolean,
    @SerialName("is_banned")
    val isBanned: Boolean,
    @SerialName("is_moderator")
    val isModerator: Boolean,
    @SerialName("is_staff")
    val isStaff: Boolean,
    @SerialName("last_activity")
    val lastActivity: Long,
    @SerialName("like2_count")
    val like2Count: Long,
    @SerialName("like_count")
    val likeCount: Long,
    @SerialName("message_count")
    val messageCount: Long,
    @SerialName("register_date")
    val registerDate: Long,
    val rendered: RespChatboxMessageModelUserRendered,
    @SerialName("short_link")
    val shortLink: String,
    @SerialName("trophy_points")
    val trophyPoints: Long,
    @SerialName("uniq_banner")
    val uniqBanner: RespChatboxMessageModelUserUniqBanner,
    @SerialName("uniq_username_css")
    val uniqUsernameCss: String,
    @SerialName("user_id")
    val userId: Long,
    val username: String,
)

@Serializable
data class RespUserModel(
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
    @SerialName("short_link")
    val shortLink: String,
    @SerialName("custom_title")
    val customTitle: String,
    @SerialName("is_banned")
    val isBanned: Long,
    @SerialName("display_banner_id")
    val displayBannerId: Long,
    @SerialName("display_icon_group_id")
    val displayIconGroupId: Long,
    val balance: String,
    val hold: String,
    val currency: String,
    @SerialName("user_email")
    val userEmail: String,
    @SerialName("user_unread_notification_count")
    val userUnreadNotificationCount: Long,
    @SerialName("user_unread_conversation_count")
    val userUnreadConversationCount: Long,
    @SerialName("conv_welcome_message")
    val convWelcomeMessage: String,
    @SerialName("user_title")
    val userTitle: String,
    @SerialName("user_deposit")
    val userDeposit: Long,
    @SerialName("user_is_valid")
    val userIsValid: Boolean,
    @SerialName("user_is_verified")
    val userIsVerified: Boolean,
    @SerialName("user_is_followed")
    val userIsFollowed: Boolean,
    @SerialName("user_last_seen_date")
    val userLastSeenDate: Long,
    val links: RespUserModelLinks,
    val permissions: RespUserModelPermissions,
    @SerialName("user_is_ignored")
    val userIsIgnored: Boolean,
    @SerialName("user_is_visitor")
    val userIsVisitor: Boolean,
    @SerialName("user_group_id")
    val userGroupId: Long,
    @SerialName("curator_titles")
    val curatorTitles: List<String>,
    @SerialName("user_groups")
    val userGroups: List<RespUserModelUserGroups>,
    val fields: List<RespUserModelFields>,
    @SerialName("user_timezone_offset")
    val userTimezoneOffset: Long,
    @SerialName("user_external_authentications")
    val userExternalAuthentications: List<RespUserModelUserExternalAuthentications>,
    @SerialName("self_permissions")
    val selfPermissions: RespUserModelSelfPermissions,
    @SerialName("edit_permissions")
    val editPermissions: RespUserModelEditPermissions,
    val birthday: RespUserModelBirthday,
    @SerialName("secret_answer_rendered")
    val secretAnswerRendered: String,
    @SerialName("secret_answer_first_letter")
    val secretAnswerFirstLetter: String,
    @SerialName("user_following")
    val userFollowing: RespUserModelUserFollowing,
    @SerialName("user_followers")
    val userFollowers: RespUserModelUserFollowers,
    val banner: String,
)

@Serializable
data class RespUserModelLinks(
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
    @SerialName("background_l")
    val backgroundL: String,
    @SerialName("background_m")
    val backgroundM: String,
    val status: String,
    val timeline: String,
)

@Serializable
data class RespUserModelPermissions(
    val edit: Boolean,
    val follow: Boolean,
    val ignore: Boolean,
    @SerialName("profile_post")
    val profilePost: Boolean,
)

@Serializable
data class RespUserModelUserGroups(
    @SerialName("user_group_id")
    val userGroupId: Long,
    @SerialName("user_group_title")
    val userGroupTitle: String,
    @SerialName("user_group_title_en")
    val userGroupTitleEn: String,
    @SerialName("user_group_banner_css_class")
    val userGroupBannerCssClass: String,
    @SerialName("user_group_banner_text")
    val userGroupBannerText: String,
    @SerialName("user_group_banner_text_en")
    val userGroupBannerTextEn: String,
    @SerialName("display_group_selectable")
    val displayGroupSelectable: Boolean,
    @SerialName("display_banner_selectable")
    val displayBannerSelectable: Boolean,
    @SerialName("display_icon_selectable")
    val displayIconSelectable: Boolean,
    @SerialName("is_primary_group")
    val isPrimaryGroup: Boolean,
    @SerialName("user_group_icon_class")
    val userGroupIconClass: String,
)

@Serializable
data class RespUserModelFieldsChoices(
    val key: String,
    val value: String,
)

@Serializable
data class RespUserModelFields(
    val id: String,
    val title: String,
    val description: String,
    val position: String,
    @SerialName("is_required")
    val isRequired: Boolean,
    val value: String? = null,
    @SerialName("is_multi_choice")
    val isMultiChoice: Boolean,
    val choices: List<RespUserModelFieldsChoices>,
    val values: List<JsonElement>,
)

@Serializable
data class RespUserModelUserExternalAuthentications(
    val provider: String,
    @SerialName("provider_key")
    val providerKey: String,
)

@Serializable
data class RespUserModelSelfPermissions(
    @SerialName("create_conversation")
    val createConversation: Boolean,
)

@Serializable
data class RespUserModelEditPermissions(
    val password: Boolean,
    @SerialName("user_email")
    val userEmail: Boolean,
    val username: Boolean,
    @SerialName("user_title")
    val userTitle: Boolean,
    @SerialName("short_link")
    val shortLink: Boolean,
    @SerialName("hide_username_logs")
    val hideUsernameLogs: Boolean,
    @SerialName("primary_group_id")
    val primaryGroupId: Boolean,
    @SerialName("secondary_group_ids")
    val secondaryGroupIds: Boolean,
    @SerialName("user_dob_day")
    val userDobDay: Boolean,
    @SerialName("user_dob_month")
    val userDobMonth: Boolean,
    @SerialName("user_dob_year")
    val userDobYear: Boolean,
    val fields: Boolean,
)

@Serializable
data class RespUserModelBirthdayTimeStamp(
    val date: String,
    @SerialName("timezone_type")
    val timezoneType: Long,
    val timezone: String,
)

@Serializable
data class RespUserModelBirthday(
    val age: Long,
    val timeStamp: RespUserModelBirthdayTimeStamp,
    val format: String,
)

@Serializable
data class RespUserModelUserFollowingUsers(
    @SerialName("user_id")
    val userId: Long,
    val username: String,
    @SerialName("username_html")
    val usernameHtml: String,
    val avatar: String,
)

@Serializable
data class RespUserModelUserFollowing(
    val users: List<RespUserModelUserFollowingUsers>,
    val count: Long,
)

@Serializable
data class RespUserModelUserFollowersUsers(
    @SerialName("user_id")
    val userId: Long,
    val username: String,
    @SerialName("username_html")
    val usernameHtml: String,
    val avatar: String,
)

@Serializable
data class RespUserModelUserFollowers(
    val users: List<RespUserModelUserFollowersUsers>,
    val count: Long,
)

@Serializable
data class RespThreadModel(
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
    @SerialName("creator_username_html")
    val creatorUsernameHtml: String,
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
    @SerialName("thread_is_closed")
    val threadIsClosed: Boolean,
    @SerialName("thread_is_followed")
    val threadIsFollowed: Boolean,
    @SerialName("thread_is_starred")
    val threadIsStarred: Boolean,
    @SerialName("first_post")
    val firstPost: RespThreadModelFirstPost,
    @SerialName("thread_prefixes")
    val threadPrefixes: List<JsonElement>,
    @SerialName("thread_tags")
    val threadTags: RespThreadModelThreadTags,
    val links: RespThreadModelLinks,
    val permissions: RespThreadModelPermissions,
    @SerialName("node_title")
    val nodeTitle: String,
    val restrictions: RespThreadModelRestrictions,
    @SerialName("last_post")
    val lastPost: RespThreadModelLastPost,
    val contest: RespThreadModelContest,
)

@Serializable
data class RespThreadModelFirstPostLinks(
    val permalink: String,
    val detail: String,
    val thread: String,
    val poster: String,
    val likes: String,
    val report: String,
    @SerialName("poster_avatar")
    val posterAvatar: String,
)

@Serializable
data class RespThreadModelFirstPostPermissions(
    val view: Boolean,
    val edit: Boolean,
    val delete: Boolean,
    val reply: Boolean,
    val like: Boolean,
    val report: Boolean,
)

@Serializable
data class RespThreadModelFirstPost(
    @SerialName("post_id")
    val postId: Long,
    @SerialName("thread_id")
    val threadId: Long,
    @SerialName("poster_user_id")
    val posterUserId: Long,
    @SerialName("poster_username")
    val posterUsername: String,
    @SerialName("poster_username_html")
    val posterUsernameHtml: String,
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
    @SerialName("post_is_liked")
    val postIsLiked: Boolean,
    val links: RespThreadModelFirstPostLinks,
    val permissions: RespThreadModelFirstPostPermissions,
    @SerialName("thread_is_deleted")
    val threadIsDeleted: Boolean,
)

@Serializable
data class RespThreadModelThreadTags(
    @SerialName("97491")
    val `97491`: String,
    @SerialName("193431")
    val `193431`: String,
    @SerialName("206")
    val `206`: String,
)

@Serializable
data class RespThreadModelLinks(
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
    @SerialName("last_post")
    val lastPost: String,
)

@Serializable
data class RespThreadModelPermissionsBump(
    val can: Boolean,
    @SerialName("available_count")
    val availableCount: Long,
    val error: JsonElement,
    @SerialName("next_available_time")
    val nextAvailableTime: JsonElement,
)

@Serializable
data class RespThreadModelPermissions(
    val view: Boolean,
    val delete: Boolean,
    val follow: Boolean,
    val post: Boolean,
    val edit: Boolean,
    @SerialName("edit_title")
    val editTitle: Boolean,
    @SerialName("edit_tags")
    val editTags: Boolean,
    val bump: RespThreadModelPermissionsBump,
)

@Serializable
data class RespThreadModelRestrictions(
    @SerialName("reply_delay")
    val replyDelay: Long,
    @SerialName("max_reply_count")
    val maxReplyCount: Long,
)

@Serializable
data class RespThreadModelLastPostLinks(
    val permalink: String,
    val detail: String,
    val thread: String,
    val poster: String,
    val likes: String,
    val report: String,
    @SerialName("poster_avatar")
    val posterAvatar: String,
)

@Serializable
data class RespThreadModelLastPostPermissions(
    val view: Boolean,
    val edit: Boolean,
    val delete: Boolean,
    val reply: Boolean,
    val like: Boolean,
    val report: Boolean,
)

@Serializable
data class RespThreadModelLastPost(
    @SerialName("post_id")
    val postId: Long,
    @SerialName("thread_id")
    val threadId: Long,
    @SerialName("poster_user_id")
    val posterUserId: Long,
    @SerialName("poster_username")
    val posterUsername: String,
    @SerialName("poster_username_html")
    val posterUsernameHtml: String,
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
    @SerialName("post_is_liked")
    val postIsLiked: Boolean,
    val links: RespThreadModelLastPostLinks,
    val permissions: RespThreadModelLastPostPermissions,
    @SerialName("thread_is_deleted")
    val threadIsDeleted: Boolean,
)

@Serializable
data class RespThreadModelContestPermissions(
    @SerialName("can_finish")
    val canFinish: Boolean,
    @SerialName("can_participate")
    val canParticipate: Boolean,
    @SerialName("can_participate_error")
    val canParticipateError: String,
    @SerialName("can_view_user_list")
    val canViewUserList: Boolean,
)

@Serializable
data class RespThreadModelContest(
    val type: String,
    @SerialName("finish_date")
    val finishDate: Long,
    @SerialName("now_count_members")
    val nowCountMembers: Long,
    @SerialName("needed_members")
    val neededMembers: Long,
    @SerialName("is_finished")
    val isFinished: Long,
    @SerialName("count_winners")
    val countWinners: Long,
    @SerialName("require_like_count")
    val requireLikeCount: Long,
    @SerialName("require_total_like_count")
    val requireTotalLikeCount: Long,
    @SerialName("prize_type")
    val prizeType: String,
    @SerialName("prize_type_phrase")
    val prizeTypePhrase: String,
    @SerialName("prize_data")
    val prizeData: Long,
    @SerialName("is_money_places")
    val isMoneyPlaces: Long,
    @SerialName("chance_to_win")
    val chanceToWin: Double,
    val winners: List<Long>,
    @SerialName("already_participate")
    val alreadyParticipate: Boolean,
    val permissions: RespThreadModelContestPermissions,
)

@Serializable
data class RespPostModel(
    @SerialName("post_id")
    val postId: Long,
    @SerialName("thread_id")
    val threadId: Long,
    @SerialName("poster_user_id")
    val posterUserId: Long,
    @SerialName("poster_username")
    val posterUsername: String,
    @SerialName("poster_username_html")
    val posterUsernameHtml: String,
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
    val links: RespPostModelLinks,
    val permissions: RespPostModelPermissions,
    @SerialName("thread_is_deleted")
    val threadIsDeleted: Boolean,
)

@Serializable
data class RespPostModelLinks(
    val permalink: String,
    val detail: String,
    val thread: String,
    val poster: String,
    val likes: String,
    val report: String,
    @SerialName("poster_avatar")
    val posterAvatar: String,
)

@Serializable
data class RespPostModelPermissions(
    val view: Boolean,
    val edit: Boolean,
    val delete: Boolean,
    val reply: Boolean,
    val like: Boolean,
    val report: Boolean,
)

@Serializable
data class RespPostCommentModel(
    @SerialName("post_comment_id")
    val postCommentId: Long,
    @SerialName("post_id")
    val postId: Long,
    @SerialName("thread_id")
    val threadId: Long,
    @SerialName("poster_user_id")
    val posterUserId: Long,
    @SerialName("poster_username")
    val posterUsername: String,
    @SerialName("poster_username_html")
    val posterUsernameHtml: String,
    @SerialName("post_comment_create_date")
    val postCommentCreateDate: Long,
    @SerialName("post_comment_body")
    val postCommentBody: String,
    @SerialName("post_comment_body_html")
    val postCommentBodyHtml: String,
    @SerialName("post_comment_body_plain_text")
    val postCommentBodyPlainText: String,
    @SerialName("post_comment_like_count")
    val postCommentLikeCount: Long,
    @SerialName("user_is_ignored")
    val userIsIgnored: Boolean,
    @SerialName("post_comment_is_published")
    val postCommentIsPublished: Boolean,
    @SerialName("post_comment_is_deleted")
    val postCommentIsDeleted: Boolean,
    @SerialName("post_comment_update_date")
    val postCommentUpdateDate: Long,
    val links: RespPostCommentModelLinks,
    val permissions: RespPostCommentModelPermissions,
)

@Serializable
data class RespPostCommentModelLinks(
    val permalink: String,
    val detail: String,
    val post: String,
    val thread: String,
    val poster: String,
    val likes: String,
    val report: String,
    @SerialName("poster_avatar")
    val posterAvatar: String,
)

@Serializable
data class RespPostCommentModelPermissions(
    val view: Boolean,
    val edit: Boolean,
    val delete: Boolean,
    val reply: Boolean,
    val like: Boolean,
    val report: Boolean,
)

@Serializable
data class RespProfilePostModel(
    @SerialName("profile_post_id")
    val profilePostId: Long,
    @SerialName("timeline_user_id")
    val timelineUserId: Long,
    @SerialName("poster_user_id")
    val posterUserId: Long,
    @SerialName("poster_username")
    val posterUsername: String,
    @SerialName("poster_username_html")
    val posterUsernameHtml: String,
    @SerialName("post_create_date")
    val postCreateDate: Long,
    @SerialName("post_body")
    val postBody: String,
    @SerialName("post_body_html")
    val postBodyHtml: String,
    @SerialName("post_body_plain_text")
    val postBodyPlainText: String,
    @SerialName("post_like_count")
    val postLikeCount: Long,
    @SerialName("post_comment_count")
    val postCommentCount: Long,
    @SerialName("post_comments_is_disabled")
    val postCommentsIsDisabled: Long,
    @SerialName("timeline_username")
    val timelineUsername: String,
    @SerialName("user_is_ignored")
    val userIsIgnored: Boolean,
    @SerialName("post_is_published")
    val postIsPublished: Boolean,
    @SerialName("post_is_deleted")
    val postIsDeleted: Boolean,
    @SerialName("post_is_liked")
    val postIsLiked: Boolean,
    @SerialName("post_is_sticked")
    val postIsSticked: Boolean,
    val links: RespProfilePostModelLinks,
    val permissions: RespProfilePostModelPermissions,
    @SerialName("timeline_user")
    val timelineUser: RespUserModel,
)

@Serializable
data class RespProfilePostModelLinks(
    val permalink: String,
    val detail: String,
    val timeline: String,
    @SerialName("timeline_user")
    val timelineUser: String,
    val poster: String,
    val likes: String,
    val comments: String,
    val report: String,
    @SerialName("poster_avatar")
    val posterAvatar: String,
)

@Serializable
data class RespProfilePostModelPermissions(
    val view: Boolean,
    val edit: Boolean,
    val delete: Boolean,
    val like: Boolean,
    val comment: Boolean,
    val report: Boolean,
    val stick: Boolean,
)

@Serializable
data class RespProfilePostCommentModel(
    @SerialName("comment_id")
    val commentId: Long,
    @SerialName("profile_post_id")
    val profilePostId: Long,
    @SerialName("comment_user_id")
    val commentUserId: Long,
    @SerialName("comment_username")
    val commentUsername: String,
    @SerialName("comment_username_html")
    val commentUsernameHtml: String,
    @SerialName("comment_create_date")
    val commentCreateDate: Long,
    @SerialName("comment_body")
    val commentBody: String,
    @SerialName("comment_body_html")
    val commentBodyHtml: String,
    @SerialName("comment_body_plain_text")
    val commentBodyPlainText: String,
    @SerialName("user_is_ignored")
    val userIsIgnored: Boolean,
    @SerialName("timeline_user_id")
    val timelineUserId: Long,
    val links: RespProfilePostCommentModelLinks,
    val permissions: RespProfilePostCommentModelPermissions,
)

@Serializable
data class RespProfilePostCommentModelLinks(
    val detail: String,
    @SerialName("profile_post")
    val profilePost: String,
    val timeline: String,
    @SerialName("timeline_user")
    val timelineUser: String,
    val poster: String,
    @SerialName("poster_avatar")
    val posterAvatar: String,
)

@Serializable
data class RespProfilePostCommentModelPermissions(
    val view: Boolean,
    val delete: Boolean,
)

@Serializable
data class RespConversationModel(
    @SerialName("conversation_id")
    val conversationId: Long,
    @SerialName("conversation_title")
    val conversationTitle: String,
    @SerialName("creator_user_id")
    val creatorUserId: Long,
    @SerialName("creator_username")
    val creatorUsername: String,
    @SerialName("creator_username_html")
    val creatorUsernameHtml: String,
    @SerialName("conversation_create_date")
    val conversationCreateDate: Long,
    @SerialName("conversation_update_date")
    val conversationUpdateDate: Long,
    @SerialName("conversation_last_read_date")
    val conversationLastReadDate: Long,
    @SerialName("conversation_online_count")
    val conversationOnlineCount: Long,
    @SerialName("is_starred")
    val isStarred: Long,
    @SerialName("is_group")
    val isGroup: Long,
    @SerialName("is_unread")
    val isUnread: Long,
    val alerts: Long,
    val permissions: RespConversationModelPermissions,
    @SerialName("conversation_message_count")
    val conversationMessageCount: Long,
    @SerialName("conversation_is_new")
    val conversationIsNew: Boolean,
    @SerialName("creator_is_ignored")
    val creatorIsIgnored: Boolean,
    @SerialName("conversation_is_open")
    val conversationIsOpen: Boolean,
    @SerialName("conversation_is_deleted")
    val conversationIsDeleted: Boolean,
    val recipient: RespConversationModelRecipient,
    val recipients: List<RespConversationModelRecipients>,
    val links: RespConversationModelLinks,
)

@Serializable
data class RespConversationModelPermissions(
    val view: Boolean,
    val reply: Boolean,
    val invite: Boolean,
    @SerialName("manage_invite_links")
    val manageInviteLinks: Boolean,
    val kick: Boolean,
    @SerialName("upload_avatar")
    val uploadAvatar: Boolean,
    val editOwnPost: Boolean,
    val stickyMessages: Boolean,
)

@Serializable
data class RespConversationModelRecipient(
    @SerialName("user_id")
    val userId: Long,
    val username: String,
    @SerialName("username_html")
    val usernameHtml: String,
    @SerialName("last_activity")
    val lastActivity: Long,
    @SerialName("is_online")
    val isOnline: Boolean,
    @SerialName("contacts_changed")
    val contactsChanged: Boolean,
    val avatar: String,
)

@Serializable
data class RespConversationModelRecipients(
    @SerialName("user_id")
    val userId: Long,
    val username: String,
    @SerialName("username_html")
    val usernameHtml: String,
    @SerialName("last_activity")
    val lastActivity: Long,
    @SerialName("is_online")
    val isOnline: Boolean,
    @SerialName("contacts_changed")
    val contactsChanged: Boolean,
    val avatar: String,
)

@Serializable
data class RespConversationModelLinks(
    val permalink: String,
    val detail: String,
    val messages: String,
    val avatar: String,
)

@Serializable
data class RespConversationMessageModel(
    @SerialName("message_id")
    val messageId: Long,
    @SerialName("conversation_id")
    val conversationId: Long,
    @SerialName("creator_user_id")
    val creatorUserId: Long,
    @SerialName("creator_username")
    val creatorUsername: String,
    @SerialName("creator_username_html")
    val creatorUsernameHtml: String,
    @SerialName("message_create_date")
    val messageCreateDate: Long,
    @SerialName("message_is_unread")
    val messageIsUnread: Long,
    @SerialName("message_need_translate")
    val messageNeedTranslate: Boolean,
    @SerialName("message_is_system")
    val messageIsSystem: Boolean,
    @SerialName("message_edit_date")
    val messageEditDate: Long,
    @SerialName("message_body")
    val messageBody: String,
    @SerialName("message_body_html")
    val messageBodyHtml: String,
    @SerialName("message_body_plain_text")
    val messageBodyPlainText: String,
    @SerialName("user_is_ignored")
    val userIsIgnored: Boolean,
    val links: RespConversationMessageModelLinks,
    val permissions: RespConversationMessageModelPermissions,
)

@Serializable
data class RespConversationMessageModelLinks(
    val detail: String,
    val conversation: String,
    val creator: String,
    @SerialName("creator_avatar")
    val creatorAvatar: String,
)

@Serializable
data class RespConversationMessageModelPermissions(
    val view: Boolean,
    val edit: Boolean,
    val delete: Boolean,
    @SerialName("stick-unstick")
    val stickUnstick: Boolean,
)

@Serializable
data class RespSystemInfo(
    @SerialName("visitor_id")
    val visitorId: Long,
    val time: Long,
)

// ─── OAuthApi Types ────────────────────────────────────────

@Serializable
@JsonClassDiscriminator("grant_type")
sealed interface OAuthTokenBody

@Serializable
@SerialName("client_credentials")
data class OAuthTokenBodyClientCredentials(
    @SerialName("client_id")
    val clientId: String,
    @SerialName("client_secret")
    val clientSecret: String,
    val scope: JsonElement,
) : OAuthTokenBody

@Serializable
@SerialName("authorization_code")
data class OAuthTokenBodyAuthorizationCode(
    val code: String,
    @SerialName("client_id")
    val clientId: String,
    @SerialName("client_secret")
    val clientSecret: String,
    @SerialName("redirect_uri")
    val redirectUri: String,
    val scope: JsonElement,
) : OAuthTokenBody

@Serializable
@SerialName("refresh_token")
data class OAuthTokenBodyRefreshToken(
    @SerialName("refresh_token")
    val refreshToken: String,
    @SerialName("client_id")
    val clientId: String,
    @SerialName("client_secret")
    val clientSecret: String,
) : OAuthTokenBody

@Serializable
@SerialName("password")
data class OAuthTokenBodyPassword(
    val username: String,
    val password: String,
    @SerialName("client_id")
    val clientId: String,
    @SerialName("client_secret")
    val clientSecret: String,
    val scope: JsonElement,
) : OAuthTokenBody

@Serializable
data class OAuthTokenResponse(
    @SerialName("access_token")
    val accessToken: String,
    @SerialName("token_type")
    val tokenType: String,
    @SerialName("expires_in")
    val expiresIn: Long,
    @SerialName("refresh_token")
    val refreshToken: String? = null,
    val scope: String? = null,
)

// ─── AssetsApi Types ────────────────────────────────────────

@Serializable
data class AssetsCssParams(
    val css: List<String>? = null,
)

@Serializable
data class AssetsCssResponse(
    val contents: String,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

// ─── CategoriesApi Types ────────────────────────────────────────

@Serializable
data class CategoriesListParams(
    @SerialName("parent_category_id")
    val parentCategoryId: Long? = null,
    @SerialName("parent_forum_id")
    val parentForumId: Long? = null,
    val order: CategoriesOrder? = null,
)

@Serializable
data class CategoriesListResponse(
    val categories: List<CategoriesListResponseCategories>,
    @SerialName("categories_total")
    val categoriesTotal: Long,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class CategoriesListResponseCategoriesLinks(
    val permalink: String,
    val detail: String,
    @SerialName("sub-categories")
    val subCategories: String,
    @SerialName("sub-forums")
    val subForums: String,
)

@Serializable
data class CategoriesListResponseCategoriesPermissions(
    val view: Boolean,
    val edit: Boolean,
    val delete: Boolean,
)

@Serializable
data class CategoriesListResponseCategories(
    @SerialName("category_id")
    val categoryId: Long,
    @SerialName("category_title")
    val categoryTitle: String,
    @SerialName("category_description")
    val categoryDescription: String,
    val links: CategoriesListResponseCategoriesLinks,
    val permissions: CategoriesListResponseCategoriesPermissions,
)

@Serializable
data class CategoriesGetResponse(
    val category: CategoriesGetResponseCategory,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class CategoriesGetResponseCategoryLinks(
    val permalink: String,
    val detail: String,
    @SerialName("sub-categories")
    val subCategories: String,
    @SerialName("sub-forums")
    val subForums: String,
)

@Serializable
data class CategoriesGetResponseCategoryPermissions(
    val view: Boolean,
    val edit: Boolean,
    val delete: Boolean,
)

@Serializable
data class CategoriesGetResponseCategory(
    @SerialName("category_id")
    val categoryId: Long,
    @SerialName("category_title")
    val categoryTitle: String,
    @SerialName("category_description")
    val categoryDescription: String,
    val links: CategoriesGetResponseCategoryLinks,
    val permissions: CategoriesGetResponseCategoryPermissions,
)

// ─── ForumsApi Types ────────────────────────────────────────

@Serializable
data class ForumsListParams(
    @SerialName("parent_category_id")
    val parentCategoryId: Long? = null,
    @SerialName("parent_forum_id")
    val parentForumId: Long? = null,
    val order: CategoriesOrder? = null,
)

@Serializable
data class ForumsListResponse(
    val forums: List<ForumsListResponseForums>,
    @SerialName("forums_total")
    val forumsTotal: Long,
    val tabs: List<ForumsListResponseTabs>,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class ForumsListResponseForumsForumPrefixesGroupPrefixes(
    @SerialName("prefix_id")
    val prefixId: Long,
    @SerialName("prefix_title")
    val prefixTitle: String,
)

@Serializable
data class ForumsListResponseForumsForumPrefixes(
    @SerialName("group_title")
    val groupTitle: String,
    @SerialName("group_prefixes")
    val groupPrefixes: List<ForumsListResponseForumsForumPrefixesGroupPrefixes>,
)

@Serializable
data class ForumsListResponseForumsLinks(
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
data class ForumsListResponseForumsPermissions(
    val view: Boolean,
    val edit: Boolean,
    val delete: Boolean,
    @SerialName("create_thread")
    val createThread: Boolean,
    @SerialName("tag_thread")
    val tagThread: Boolean,
    val follow: Boolean,
)

@Serializable
data class ForumsListResponseForums(
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
    val forumPrefixes: List<ForumsListResponseForumsForumPrefixes>,
    @SerialName("thread_default_prefix_id")
    val threadDefaultPrefixId: Long,
    @SerialName("thread_prefix_is_required")
    val threadPrefixIsRequired: Boolean,
    val links: ForumsListResponseForumsLinks,
    val permissions: ForumsListResponseForumsPermissions,
    @SerialName("forum_is_followed")
    val forumIsFollowed: Boolean,
)

@Serializable
data class ForumsListResponseTabs(
    @SerialName("link_title")
    val linkTitle: String,
    val isDefault: Boolean,
    val title: String,
    val isHidden: Boolean,
)

@Serializable
data class ForumsGroupedResponse(
    val data: ForumsGroupedResponseData,
    val tabs: List<ForumsGroupedResponseTabs>,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class ForumsGroupedResponseData00Links(
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
data class ForumsGroupedResponseData00Permissions(
    val view: Boolean,
    val edit: Boolean,
    val delete: Boolean,
    @SerialName("create_thread")
    val createThread: Boolean,
    @SerialName("tag_thread")
    val tagThread: Boolean,
    val follow: Boolean,
)

@Serializable
data class ForumsGroupedResponseData00(
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
    @SerialName("parent_node_id")
    val parentNodeId: Long,
    val links: ForumsGroupedResponseData00Links,
    val permissions: ForumsGroupedResponseData00Permissions,
    @SerialName("forum_is_followed")
    val forumIsFollowed: Boolean,
)

@Serializable
data class ForumsGroupedResponseData0(
    @SerialName("0")
    val `0`: ForumsGroupedResponseData00,
)

@Serializable
data class ForumsGroupedResponseData(
    @SerialName("0")
    val `0`: ForumsGroupedResponseData0,
)

@Serializable
data class ForumsGroupedResponseTabs(
    @SerialName("link_title")
    val linkTitle: String,
    val isDefault: Boolean,
    val title: String,
    val isHidden: Boolean,
)

@Serializable
data class ForumsGetResponse(
    val forum: ForumsGetResponseForum,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class ForumsGetResponseForumForumPrefixesGroupPrefixes(
    @SerialName("prefix_id")
    val prefixId: Long,
    @SerialName("prefix_title")
    val prefixTitle: String,
)

@Serializable
data class ForumsGetResponseForumForumPrefixes(
    @SerialName("group_title")
    val groupTitle: String,
    @SerialName("group_prefixes")
    val groupPrefixes: List<ForumsGetResponseForumForumPrefixesGroupPrefixes>,
)

@Serializable
data class ForumsGetResponseForumLinks(
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
data class ForumsGetResponseForumPermissions(
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
data class ForumsGetResponseForum(
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
    val forumPrefixes: List<ForumsGetResponseForumForumPrefixes>,
    @SerialName("thread_default_prefix_id")
    val threadDefaultPrefixId: Long,
    @SerialName("thread_prefix_is_required")
    val threadPrefixIsRequired: Boolean,
    val links: ForumsGetResponseForumLinks,
    val permissions: ForumsGetResponseForumPermissions,
    @SerialName("forum_is_followed")
    val forumIsFollowed: Boolean,
)

@Serializable
data class ForumsFollowersResponse(
    val users: List<ForumsFollowersResponseUsers>,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class ForumsFollowersResponseUsersFollow(
    val post: Boolean,
    val alert: Boolean,
    val email: Boolean,
)

@Serializable
data class ForumsFollowersResponseUsers(
    @SerialName("user_id")
    val userId: Long,
    val username: String,
    val follow: ForumsFollowersResponseUsersFollow,
)

@Serializable
data class ForumsFollowBody(
    val post: Boolean? = null,
    val alert: Boolean? = null,
    val email: Boolean? = null,
    @SerialName("prefix_ids")
    val prefixIds: List<Long>? = null,
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
    val total: Boolean? = null,
)

@Serializable
data class ForumsFollowedResponse(
    val forums: List<ForumsFollowedResponseForums>,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class ForumsFollowedResponseForumsForumPrefixesGroupPrefixes(
    @SerialName("prefix_id")
    val prefixId: Long,
    @SerialName("prefix_title")
    val prefixTitle: String,
)

@Serializable
data class ForumsFollowedResponseForumsForumPrefixes(
    @SerialName("group_title")
    val groupTitle: String,
    @SerialName("group_prefixes")
    val groupPrefixes: List<ForumsFollowedResponseForumsForumPrefixesGroupPrefixes>,
)

@Serializable
data class ForumsFollowedResponseForumsLinks(
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
data class ForumsFollowedResponseForumsPermissions(
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
data class ForumsFollowedResponseForumsFollow(
    val post: Boolean,
    val alert: Boolean,
    val email: Boolean,
)

@Serializable
data class ForumsFollowedResponseForums(
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
    val forumPrefixes: List<ForumsFollowedResponseForumsForumPrefixes>,
    @SerialName("thread_default_prefix_id")
    val threadDefaultPrefixId: Long,
    @SerialName("thread_prefix_is_required")
    val threadPrefixIsRequired: Boolean,
    val links: ForumsFollowedResponseForumsLinks,
    val permissions: ForumsFollowedResponseForumsPermissions,
    @SerialName("forum_is_followed")
    val forumIsFollowed: Boolean,
    val follow: ForumsFollowedResponseForumsFollow,
)

@Serializable
data class ForumsGetFeedOptionsResponse(
    val forums: List<ForumsGetFeedOptionsResponseForums>,
    @SerialName("excluded_forums_ids")
    val excludedForumsIds: List<Long>,
    @SerialName("default_excluded_forums_ids")
    val defaultExcludedForumsIds: List<Long>,
    val keywords: String,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class ForumsGetFeedOptionsResponseForumsLinks(
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
data class ForumsGetFeedOptionsResponseForumsPermissions(
    val view: Boolean,
    val edit: Boolean,
    val delete: Boolean,
    @SerialName("create_thread")
    val createThread: Boolean,
    @SerialName("tag_thread")
    val tagThread: Boolean,
    val follow: Boolean,
)

@Serializable
data class ForumsGetFeedOptionsResponseForums(
    @SerialName("forum_id")
    val forumId: Long,
    @SerialName("forum_title")
    val forumTitle: String,
    @SerialName("forum_description")
    val forumDescription: String,
    @SerialName("parent_node_id")
    val parentNodeId: Long,
    val links: ForumsGetFeedOptionsResponseForumsLinks,
    val permissions: ForumsGetFeedOptionsResponseForumsPermissions,
    @SerialName("forum_is_followed")
    val forumIsFollowed: Boolean,
    @SerialName("has_children")
    val hasChildren: Boolean,
)

@Serializable
data class ForumsEditFeedOptionsBody(
    @SerialName("node_ids")
    val nodeIds: List<Long>? = null,
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
    val linkForums: List<RespLinkModel>,
    @SerialName("link-forums_total")
    val linkForumsTotal: Long,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class LinksGetResponse(
    @SerialName("link-forum")
    val linkForum: RespLinkModel,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

// ─── PagesApi Types ────────────────────────────────────────

@Serializable
data class PagesListParams(
    @SerialName("parent_page_id")
    val parentPageId: Long? = null,
    val order: CategoriesOrder? = null,
)

@Serializable
data class PagesListResponse(
    val pages: List<PagesListResponsePages>,
    @SerialName("pages_total")
    val pagesTotal: Long,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class PagesListResponsePagesLinks(
    val permalink: String,
    val detail: String,
    @SerialName("sub-pages")
    val subPages: String,
)

@Serializable
data class PagesListResponsePagesPermissions(
    val view: Boolean,
    val edit: Boolean,
    val delete: Boolean,
)

@Serializable
data class PagesListResponsePages(
    @SerialName("page_id")
    val pageId: Long,
    @SerialName("page_title")
    val pageTitle: String,
    @SerialName("page_description")
    val pageDescription: String,
    val links: PagesListResponsePagesLinks,
    val permissions: PagesListResponsePagesPermissions,
)

@Serializable
data class PagesGetResponse(
    val page: PagesGetResponsePage,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class PagesGetResponsePageLinks(
    val permalink: String,
    val detail: String,
    @SerialName("sub-pages")
    val subPages: String,
)

@Serializable
data class PagesGetResponsePagePermissions(
    val view: Boolean,
    val edit: Boolean,
    val delete: Boolean,
)

@Serializable
data class PagesGetResponsePage(
    @SerialName("page_id")
    val pageId: Long,
    @SerialName("page_title")
    val pageTitle: String,
    @SerialName("page_description")
    val pageDescription: String,
    @SerialName("page_view_count")
    val pageViewCount: Long,
    val links: PagesGetResponsePageLinks,
    val permissions: PagesGetResponsePagePermissions,
    @SerialName("page_html")
    val pageHtml: String,
)

// ─── NavigationApi Types ────────────────────────────────────────

@Serializable
data class NavigationListParams(
    val parent: Long? = null,
)

@Serializable
data class NavigationListResponse(
    val elements: List<NavigationListResponseElements>,
    @SerialName("elements_count")
    val elementsCount: Long,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class NavigationListResponseElementsLinks(
    val permalink: String,
    val detail: String,
    @SerialName("sub-categories")
    val subCategories: String,
    @SerialName("sub-forums")
    val subForums: String,
    @SerialName("sub-elements")
    val subElements: String,
)

@Serializable
data class NavigationListResponseElementsPermissions(
    val view: Boolean,
    val edit: Boolean,
    val delete: Boolean,
)

@Serializable
data class NavigationListResponseElements(
    @SerialName("category_id")
    val categoryId: Long,
    @SerialName("category_title")
    val categoryTitle: String,
    @SerialName("category_description")
    val categoryDescription: String,
    val links: NavigationListResponseElementsLinks,
    val permissions: NavigationListResponseElementsPermissions,
    @SerialName("navigation_type")
    val navigationType: String,
    @SerialName("navigation_id")
    val navigationId: Long,
    @SerialName("navigation_parent_id")
    val navigationParentId: Long,
    @SerialName("has_sub_elements")
    val hasSubElements: Boolean,
)

// ─── ThreadsApi Types ────────────────────────────────────────

@Serializable
data class ThreadsListParams(
    @SerialName("forum_id")
    val forumId: Long? = null,
    val tab: String? = null,
    val state: State? = null,
    val period: Period? = null,
    val title: String? = null,
    @SerialName("title_only")
    val titleOnly: Boolean? = null,
    @SerialName("creator_user_id")
    val creatorUserId: Long? = null,
    val sticky: Boolean? = null,
    @SerialName("prefix_ids[]")
    val prefixIds: List<Long>? = null,
    @SerialName("prefix_ids_not[]")
    val prefixIdsNot: List<Long>? = null,
    @SerialName("thread_tag_id")
    val threadTagId: Long? = null,
    val page: Long? = null,
    val limit: Long? = null,
    val order: ThreadsOrder? = null,
    val direction: Direction? = null,
    @SerialName("thread_create_date")
    val threadCreateDate: Long? = null,
    @SerialName("thread_update_date")
    val threadUpdateDate: Long? = null,
    @SerialName("fields_include")
    val fieldsInclude: JsonElement? = null,
)

@Serializable
data class ThreadsListResponse(
    val threads: List<RespThreadModel>,
    val forum: ThreadsListResponseForum,
    @SerialName("threads_total")
    val threadsTotal: Long,
    val links: ThreadsListResponseLinks,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class ThreadsListResponseForumLinks(
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
data class ThreadsListResponseForumPermissions(
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
data class ThreadsListResponseForum(
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
    val forumPrefixes: List<JsonElement>,
    @SerialName("thread_default_prefix_id")
    val threadDefaultPrefixId: Long,
    @SerialName("thread_prefix_is_required")
    val threadPrefixIsRequired: Boolean,
    val links: ThreadsListResponseForumLinks,
    val permissions: ThreadsListResponseForumPermissions,
    @SerialName("forum_is_followed")
    val forumIsFollowed: Boolean,
)

@Serializable
data class ThreadsListResponseLinks(
    val pages: Long,
    val page: Long,
    val next: String,
)

@Serializable
data class ThreadsCreateBody(
    @SerialName("post_body")
    val postBody: String,
    @SerialName("forum_id")
    val forumId: Long,
    val title: String? = null,
    @SerialName("title_en")
    val titleEn: String? = null,
    @SerialName("prefix_id")
    val prefixId: List<Long>? = null,
    val tags: List<String>? = null,
    @SerialName("hide_contacts")
    val hideContacts: Boolean? = null,
    @SerialName("allow_ask_hidden_content")
    val allowAskHiddenContent: Boolean? = null,
    /** Default: 2 */
    @SerialName("reply_group")
    val replyGroup: ReplyGroup = ReplyGroup.V2,
    @SerialName("comment_ignore_group")
    val commentIgnoreGroup: Boolean? = null,
    @SerialName("dont_alert_followers")
    val dontAlertFollowers: Boolean? = null,
    @SerialName("schedule_date")
    val scheduleDate: String? = null,
    @SerialName("schedule_time")
    val scheduleTime: String? = null,
    @SerialName("watch_thread_state")
    val watchThreadState: Boolean? = null,
    @SerialName("watch_thread")
    val watchThread: Boolean? = null,
    @SerialName("watch_thread_email")
    val watchThreadEmail: Boolean? = null,
)

@Serializable
data class ThreadsCreateResponse(
    val thread: RespThreadModel,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class ThreadsCreateContestBody(
    @SerialName("post_body")
    val postBody: String,
    /** Default: by_finish_date */
    @SerialName("contest_type")
    val contestType: ContestType,
    @SerialName("prize_type")
    val prizeType: PrizeType,
    @SerialName("require_like_count")
    val requireLikeCount: Long,
    @SerialName("require_total_like_count")
    val requireTotalLikeCount: Long,
    val title: String? = null,
    @SerialName("title_en")
    val titleEn: String? = null,
    @SerialName("length_value")
    val lengthValue: Long? = null,
    @SerialName("length_option")
    val lengthOption: LengthOption? = null,
    @SerialName("count_winners")
    val countWinners: Long? = null,
    @SerialName("prize_data_money")
    val prizeDataMoney: Double? = null,
    @SerialName("is_money_places")
    val isMoneyPlaces: Boolean? = null,
    @SerialName("prize_data_places")
    val prizeDataPlaces: List<Double>? = null,
    @SerialName("prize_data_upgrade")
    val prizeDataUpgrade: PrizeDataUpgrade? = null,
    @SerialName("secret_answer")
    val secretAnswer: String? = null,
    val tags: List<String>? = null,
    /** Default: 2 */
    @SerialName("reply_group")
    val replyGroup: ReplyGroup = ReplyGroup.V2,
    @SerialName("comment_ignore_group")
    val commentIgnoreGroup: Boolean? = null,
    @SerialName("dont_alert_followers")
    val dontAlertFollowers: Boolean? = null,
    @SerialName("hide_contacts")
    val hideContacts: Boolean? = null,
    @SerialName("allow_ask_hidden_content")
    val allowAskHiddenContent: Boolean? = null,
    @SerialName("schedule_date")
    val scheduleDate: String? = null,
    @SerialName("schedule_time")
    val scheduleTime: String? = null,
    @SerialName("watch_thread_state")
    val watchThreadState: Boolean? = null,
    @SerialName("watch_thread")
    val watchThread: Boolean? = null,
    @SerialName("watch_thread_email")
    val watchThreadEmail: Boolean? = null,
)

@Serializable
data class ThreadsCreateContestResponse(
    val thread: RespThreadModel,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class ThreadsClaimBody(
    @SerialName("as_responder")
    val asResponder: String,
    @SerialName("as_is_market_deal")
    val asIsMarketDeal: Boolean,
    @SerialName("as_amount")
    val asAmount: Double,
    @SerialName("transfer_type")
    val transferType: TransferType,
    @SerialName("post_body")
    val postBody: String,
    @SerialName("as_market_item_id")
    val asMarketItemId: Long? = null,
    @SerialName("as_data")
    val asData: String? = null,
    val currency: Currency? = null,
    @SerialName("pay_claim")
    val payClaim: PayClaim? = null,
    @SerialName("as_funds_receipt")
    val asFundsReceipt: String? = null,
    @SerialName("as_tg_login_screenshot")
    val asTgLoginScreenshot: String? = null,
    val tags: List<String>? = null,
    @SerialName("hide_contacts")
    val hideContacts: Boolean? = null,
    @SerialName("allow_ask_hidden_content")
    val allowAskHiddenContent: Boolean? = null,
    /** Default: 2 */
    @SerialName("reply_group")
    val replyGroup: ReplyGroup = ReplyGroup.V2,
    @SerialName("comment_ignore_group")
    val commentIgnoreGroup: Boolean? = null,
    @SerialName("dont_alert_followers")
    val dontAlertFollowers: Boolean? = null,
    @SerialName("schedule_date")
    val scheduleDate: String? = null,
    @SerialName("schedule_time")
    val scheduleTime: String? = null,
    @SerialName("watch_thread_state")
    val watchThreadState: Boolean? = null,
    @SerialName("watch_thread")
    val watchThread: Boolean? = null,
    @SerialName("watch_thread_email")
    val watchThreadEmail: Boolean? = null,
)

@Serializable
data class ThreadsClaimResponse(
    val thread: RespThreadModel,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class ThreadsGetParams(
    @SerialName("fields_include")
    val fieldsInclude: JsonElement? = null,
)

@Serializable
data class ThreadsGetResponse(
    val thread: RespThreadModel,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class ThreadsEditBody(
    val title: String? = null,
    @SerialName("title_en")
    val titleEn: String? = null,
    @SerialName("prefix_id")
    val prefixId: List<Long>? = null,
    val tags: List<String>? = null,
    @SerialName("discussion_open")
    val discussionOpen: Boolean? = null,
    @SerialName("hide_contacts")
    val hideContacts: Boolean? = null,
    @SerialName("allow_ask_hidden_content")
    val allowAskHiddenContent: Boolean? = null,
    @SerialName("reply_group")
    val replyGroup: ReplyGroup? = null,
    @SerialName("comment_ignore_group")
    val commentIgnoreGroup: Boolean? = null,
)

@Serializable
data class ThreadsEditResponse(
    val thread: RespThreadModel,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class ThreadsDeleteBody(
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
    @SerialName("node_id")
    val nodeId: String,
    val title: String? = null,
    @SerialName("title_en")
    val titleEn: String? = null,
    @SerialName("prefix_id")
    val prefixId: List<Long>? = null,
    @SerialName("apply_thread_prefix")
    val applyThreadPrefix: Boolean? = null,
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
    val status: String,
    val message: String,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class ThreadsHideResponse(
    val status: String,
    val message: String,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
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
    val users: List<ThreadsFollowersResponseUsers>,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class ThreadsFollowersResponseUsersFollow(
    val alert: Boolean,
    val email: Boolean,
)

@Serializable
data class ThreadsFollowersResponseUsers(
    @SerialName("user_id")
    val userId: Long,
    val username: String,
    val follow: ThreadsFollowersResponseUsersFollow,
)

@Serializable
data class ThreadsFollowBody(
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
    val total: Boolean? = null,
    @SerialName("fields_include")
    val fieldsInclude: JsonElement? = null,
)

@Serializable
data class ThreadsFollowedResponse(
    val threads: List<ThreadsFollowedResponseThreads>,
    @SerialName("threads_total")
    val threadsTotal: Long,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class ThreadsFollowedResponseThreadsFirstPostLikeUsers(
    @SerialName("user_id")
    val userId: Long,
    val username: String,
    @SerialName("display_style_group_id")
    val displayStyleGroupId: Long,
    @SerialName("is_banned")
    val isBanned: Long,
    @SerialName("uniq_username_css")
    val uniqUsernameCss: String,
)

@Serializable
data class ThreadsFollowedResponseThreadsFirstPostLinks(
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
data class ThreadsFollowedResponseThreadsFirstPostPermissions(
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
data class ThreadsFollowedResponseThreadsFirstPost(
    @SerialName("post_id")
    val postId: Long,
    @SerialName("thread_id")
    val threadId: Long,
    @SerialName("poster_user_id")
    val posterUserId: Long,
    @SerialName("poster_username")
    val posterUsername: String,
    @SerialName("poster_username_html")
    val posterUsernameHtml: String,
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
    val likeUsers: List<ThreadsFollowedResponseThreadsFirstPostLikeUsers>,
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
    val links: ThreadsFollowedResponseThreadsFirstPostLinks,
    val permissions: ThreadsFollowedResponseThreadsFirstPostPermissions,
)

@Serializable
data class ThreadsFollowedResponseThreadsThreadTags(
    @SerialName("1403")
    val `1403`: String,
    @SerialName("8176")
    val `8176`: String,
    @SerialName("38")
    val `38`: String,
    @SerialName("1953")
    val `1953`: String,
    @SerialName("523")
    val `523`: String,
)

@Serializable
data class ThreadsFollowedResponseThreadsLinks(
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
    @SerialName("last_post")
    val lastPost: String,
)

@Serializable
data class ThreadsFollowedResponseThreadsPermissions(
    val view: Boolean,
    val delete: Boolean,
    val follow: Boolean,
    val post: Boolean,
    @SerialName("upload_attachment")
    val uploadAttachment: Boolean,
    val edit: Boolean,
    @SerialName("edit_title")
    val editTitle: Boolean,
    @SerialName("edit_tags")
    val editTags: Boolean,
)

@Serializable
data class ThreadsFollowedResponseThreadsForumLinks(
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
data class ThreadsFollowedResponseThreadsForumPermissions(
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
data class ThreadsFollowedResponseThreadsForum(
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
    val forumPrefixes: List<JsonElement>,
    @SerialName("thread_default_prefix_id")
    val threadDefaultPrefixId: Long,
    @SerialName("thread_prefix_is_required")
    val threadPrefixIsRequired: Boolean,
    val links: ThreadsFollowedResponseThreadsForumLinks,
    val permissions: ThreadsFollowedResponseThreadsForumPermissions,
    @SerialName("forum_is_followed")
    val forumIsFollowed: Boolean,
)

@Serializable
data class ThreadsFollowedResponseThreadsFollow(
    val alert: Boolean,
    val email: Boolean,
)

@Serializable
data class ThreadsFollowedResponseThreads(
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
    @SerialName("creator_username_html")
    val creatorUsernameHtml: String,
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
    val firstPost: ThreadsFollowedResponseThreadsFirstPost,
    @SerialName("thread_prefixes")
    val threadPrefixes: List<JsonElement>,
    @SerialName("thread_tags")
    val threadTags: ThreadsFollowedResponseThreadsThreadTags,
    val links: ThreadsFollowedResponseThreadsLinks,
    val permissions: ThreadsFollowedResponseThreadsPermissions,
    val forum: ThreadsFollowedResponseThreadsForum,
    val follow: ThreadsFollowedResponseThreadsFollow,
)

@Serializable
data class ThreadsNavigationResponse(
    val elements: List<ThreadsNavigationResponseElements>,
    @SerialName("elements_count")
    val elementsCount: Long,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class ThreadsNavigationResponseElementsLinks(
    val permalink: String,
    val detail: String,
    @SerialName("sub-categories")
    val subCategories: String,
    @SerialName("sub-forums")
    val subForums: String,
    @SerialName("sub-elements")
    val subElements: String,
)

@Serializable
data class ThreadsNavigationResponseElementsPermissions(
    val view: Boolean,
    val edit: Boolean,
    val delete: Boolean,
)

@Serializable
data class ThreadsNavigationResponseElements(
    @SerialName("category_id")
    val categoryId: Long,
    @SerialName("category_title")
    val categoryTitle: String,
    @SerialName("category_description")
    val categoryDescription: String,
    val links: ThreadsNavigationResponseElementsLinks,
    val permissions: ThreadsNavigationResponseElementsPermissions,
    @SerialName("navigation_type")
    val navigationType: String,
    @SerialName("navigation_id")
    val navigationId: Long,
    @SerialName("navigation_depth")
    val navigationDepth: Long,
    @SerialName("navigation_parent_id")
    val navigationParentId: Long,
    @SerialName("has_sub_elements")
    val hasSubElements: Boolean,
)

@Serializable
data class ThreadsPollGetResponse(
    val poll: ThreadsPollGetResponsePoll,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class ThreadsPollGetResponsePollResponses(
    @SerialName("response_id")
    val responseId: Long,
    @SerialName("response_answer")
    val responseAnswer: String,
    @SerialName("response_vote_count")
    val responseVoteCount: Long,
)

@Serializable
data class ThreadsPollGetResponsePollPermissions(
    val vote: Boolean,
    val result: Boolean,
)

@Serializable
data class ThreadsPollGetResponsePollLinks(
    val vote: String,
)

@Serializable
data class ThreadsPollGetResponsePoll(
    @SerialName("poll_id")
    val pollId: Long,
    @SerialName("poll_question")
    val pollQuestion: String,
    @SerialName("poll_vote_count")
    val pollVoteCount: Long,
    @SerialName("poll_max_votes")
    val pollMaxVotes: Long,
    @SerialName("poll_is_open")
    val pollIsOpen: Boolean,
    @SerialName("poll_is_voted")
    val pollIsVoted: Boolean,
    val responses: List<ThreadsPollGetResponsePollResponses>,
    val permissions: ThreadsPollGetResponsePollPermissions,
    val links: ThreadsPollGetResponsePollLinks,
)

@Serializable
data class ThreadsPollVoteBody(
    @SerialName("response_id")
    val responseId: Long? = null,
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
    val limit: Long? = null,
    @SerialName("forum_id")
    val forumId: Long? = null,
    @SerialName("data_limit")
    val dataLimit: Long? = null,
)

@Serializable
data class ThreadsUnreadResponse(
    val threads: List<RespThreadModel>,
    val data: List<ThreadsUnreadResponseData>,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class ThreadsUnreadResponseDataFirstPostLikeUsers(
    @SerialName("user_id")
    val userId: Long,
    val username: String,
    @SerialName("display_style_group_id")
    val displayStyleGroupId: Long,
    @SerialName("is_banned")
    val isBanned: Long,
    @SerialName("uniq_username_css")
    val uniqUsernameCss: String,
)

@Serializable
data class ThreadsUnreadResponseDataFirstPostLinks(
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
data class ThreadsUnreadResponseDataFirstPostPermissions(
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
data class ThreadsUnreadResponseDataFirstPost(
    @SerialName("post_id")
    val postId: Long,
    @SerialName("thread_id")
    val threadId: Long,
    @SerialName("poster_user_id")
    val posterUserId: Long,
    @SerialName("poster_username")
    val posterUsername: String,
    @SerialName("poster_username_html")
    val posterUsernameHtml: String,
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
    val likeUsers: List<ThreadsUnreadResponseDataFirstPostLikeUsers>,
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
    val links: ThreadsUnreadResponseDataFirstPostLinks,
    val permissions: ThreadsUnreadResponseDataFirstPostPermissions,
)

@Serializable
data class ThreadsUnreadResponseDataLinks(
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
data class ThreadsUnreadResponseDataPermissions(
    val view: Boolean,
    val delete: Boolean,
    val follow: Boolean,
    val post: Boolean,
    @SerialName("upload_attachment")
    val uploadAttachment: Boolean,
    val edit: Boolean,
)

@Serializable
data class ThreadsUnreadResponseDataForumLinks(
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
data class ThreadsUnreadResponseDataForumPermissions(
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
data class ThreadsUnreadResponseDataForum(
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
    val forumPrefixes: List<JsonElement>,
    @SerialName("thread_default_prefix_id")
    val threadDefaultPrefixId: Long,
    @SerialName("thread_prefix_is_required")
    val threadPrefixIsRequired: Boolean,
    val links: ThreadsUnreadResponseDataForumLinks,
    val permissions: ThreadsUnreadResponseDataForumPermissions,
    @SerialName("forum_is_followed")
    val forumIsFollowed: Boolean,
)

@Serializable
data class ThreadsUnreadResponseData(
    @SerialName("content_type")
    val contentType: String,
    @SerialName("content_id")
    val contentId: Long,
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
    @SerialName("creator_username_html")
    val creatorUsernameHtml: String,
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
    val firstPost: ThreadsUnreadResponseDataFirstPost,
    @SerialName("thread_prefixes")
    val threadPrefixes: List<JsonElement>,
    @SerialName("thread_tags")
    val threadTags: List<JsonElement>,
    val links: ThreadsUnreadResponseDataLinks,
    val permissions: ThreadsUnreadResponseDataPermissions,
    val forum: ThreadsUnreadResponseDataForum,
)

@Serializable
data class ThreadsRecentParams(
    val days: Long? = null,
    val limit: Long? = null,
    @SerialName("forum_id")
    val forumId: Long? = null,
    @SerialName("data_limit")
    val dataLimit: Long? = null,
)

@Serializable
data class ThreadsRecentResponse(
    val threads: List<RespThreadModel>,
    val data: List<ThreadsRecentResponseData>,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class ThreadsRecentResponseDataFirstPostLinks(
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
data class ThreadsRecentResponseDataFirstPostPermissions(
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
data class ThreadsRecentResponseDataFirstPost(
    @SerialName("post_id")
    val postId: Long,
    @SerialName("thread_id")
    val threadId: Long,
    @SerialName("poster_user_id")
    val posterUserId: Long,
    @SerialName("poster_username")
    val posterUsername: String,
    @SerialName("poster_username_html")
    val posterUsernameHtml: String,
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
    val links: ThreadsRecentResponseDataFirstPostLinks,
    val permissions: ThreadsRecentResponseDataFirstPostPermissions,
)

@Serializable
data class ThreadsRecentResponseDataLinks(
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
data class ThreadsRecentResponseDataPermissions(
    val view: Boolean,
    val delete: Boolean,
    val follow: Boolean,
    val post: Boolean,
    @SerialName("upload_attachment")
    val uploadAttachment: Boolean,
    val edit: Boolean,
)

@Serializable
data class ThreadsRecentResponseDataForumLinks(
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
data class ThreadsRecentResponseDataForumPermissions(
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
data class ThreadsRecentResponseDataForum(
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
    val forumPrefixes: List<JsonElement>,
    @SerialName("thread_default_prefix_id")
    val threadDefaultPrefixId: Long,
    @SerialName("thread_prefix_is_required")
    val threadPrefixIsRequired: Boolean,
    val links: ThreadsRecentResponseDataForumLinks,
    val permissions: ThreadsRecentResponseDataForumPermissions,
    @SerialName("forum_is_followed")
    val forumIsFollowed: Boolean,
)

@Serializable
data class ThreadsRecentResponseData(
    @SerialName("content_type")
    val contentType: String,
    @SerialName("content_id")
    val contentId: Long,
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
    @SerialName("creator_username_html")
    val creatorUsernameHtml: String,
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
    val firstPost: ThreadsRecentResponseDataFirstPost,
    @SerialName("thread_prefixes")
    val threadPrefixes: List<JsonElement>,
    @SerialName("thread_tags")
    val threadTags: List<JsonElement>,
    val links: ThreadsRecentResponseDataLinks,
    val permissions: ThreadsRecentResponseDataPermissions,
    val forum: ThreadsRecentResponseDataForum,
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
    @SerialName("thread_id")
    val threadId: Long? = null,
    @SerialName("page_of_post_id")
    val pageOfPostId: Long? = null,
    val page: Long? = null,
    val limit: Long? = null,
    val order: PostsOrder? = null,
)

@Serializable
data class PostsListResponse(
    val posts: List<RespThreadModel>,
    val thread: RespThreadModel,
    @SerialName("posts_total")
    val postsTotal: Long,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class PostsCreateBody(
    @SerialName("post_body")
    val postBody: String,
    @SerialName("thread_id")
    val threadId: Long? = null,
    @SerialName("quote_post_id")
    val quotePostId: Long? = null,
)

@Serializable
data class PostsCreateResponse(
    val post: RespPostModel,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class PostsGetResponse(
    val post: RespPostModel,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class PostsEditBody(
    @SerialName("post_body")
    val postBody: String? = null,
)

@Serializable
data class PostsEditResponse(
    val post: RespPostModel,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class PostsDeleteBody(
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
    val page: Long? = null,
    val limit: Long? = null,
)

@Serializable
data class PostsLikesResponse(
    val users: List<PostsLikesResponseUsers>,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class PostsLikesResponseUsers(
    @SerialName("user_id")
    val userId: Long,
    val username: String,
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
    val reasons: List<String>,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class PostsReportBody(
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
    @SerialName("post_id")
    val postId: Long,
    val before: Long? = null,
    @SerialName("before_comment")
    val beforeComment: Long? = null,
)

@Serializable
data class PostsCommentsGetResponse(
    val comments: List<RespPostCommentModel>,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class PostsCommentsCreateBody(
    @SerialName("post_id")
    val postId: Long,
    @SerialName("comment_body")
    val commentBody: String,
)

@Serializable
data class PostsCommentsCreateResponse(
    val comment: PostsCommentsCreateResponseComment,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class PostsCommentsCreateResponseCommentLinks(
    val permalink: String,
    val detail: String,
    val post: String,
    val thread: String,
    val poster: String,
    val likes: String,
    val report: String,
    @SerialName("poster_avatar")
    val posterAvatar: String,
)

@Serializable
data class PostsCommentsCreateResponseCommentPermissions(
    val view: Boolean,
    val edit: Boolean,
    val delete: Boolean,
    val reply: Boolean,
    val like: Boolean,
    val report: Boolean,
)

@Serializable
data class PostsCommentsCreateResponseComment(
    @SerialName("post_comment_id")
    val postCommentId: Long,
    @SerialName("post_id")
    val postId: Long,
    @SerialName("thread_id")
    val threadId: Long,
    @SerialName("poster_user_id")
    val posterUserId: Long,
    @SerialName("poster_username")
    val posterUsername: String,
    @SerialName("poster_username_html")
    val posterUsernameHtml: String,
    @SerialName("post_comment_body")
    val postCommentBody: String,
    @SerialName("post_comment_body_html")
    val postCommentBodyHtml: String,
    @SerialName("post_comment_body_plain_text")
    val postCommentBodyPlainText: String,
    @SerialName("post_comment_like_count")
    val postCommentLikeCount: Long,
    @SerialName("user_is_ignored")
    val userIsIgnored: Boolean,
    @SerialName("post_comment_is_published")
    val postCommentIsPublished: Boolean,
    @SerialName("post_comment_is_deleted")
    val postCommentIsDeleted: Boolean,
    @SerialName("post_comment_update_date")
    val postCommentUpdateDate: Long,
    val links: PostsCommentsCreateResponseCommentLinks,
    val permissions: PostsCommentsCreateResponseCommentPermissions,
)

@Serializable
data class PostsCommentsEditBody(
    @SerialName("post_comment_id")
    val postCommentId: Long,
    @SerialName("comment_body")
    val commentBody: String,
)

@Serializable
data class PostsCommentsEditResponse(
    val comment: PostsCommentsEditResponseComment,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class PostsCommentsEditResponseCommentLinks(
    val permalink: String,
    val detail: String,
    val post: String,
    val thread: String,
    val poster: String,
    val likes: String,
    val report: String,
    @SerialName("poster_avatar")
    val posterAvatar: String,
)

@Serializable
data class PostsCommentsEditResponseCommentPermissions(
    val view: Boolean,
    val edit: Boolean,
    val delete: Boolean,
    val reply: Boolean,
    val like: Boolean,
    val report: Boolean,
)

@Serializable
data class PostsCommentsEditResponseComment(
    @SerialName("post_comment_id")
    val postCommentId: Long,
    @SerialName("post_id")
    val postId: Long,
    @SerialName("thread_id")
    val threadId: Long,
    @SerialName("poster_user_id")
    val posterUserId: Long,
    @SerialName("poster_username")
    val posterUsername: String,
    @SerialName("poster_username_html")
    val posterUsernameHtml: String,
    @SerialName("post_comment_body")
    val postCommentBody: String,
    @SerialName("post_comment_body_html")
    val postCommentBodyHtml: String,
    @SerialName("post_comment_body_plain_text")
    val postCommentBodyPlainText: String,
    @SerialName("post_comment_like_count")
    val postCommentLikeCount: Long,
    @SerialName("user_is_ignored")
    val userIsIgnored: Boolean,
    @SerialName("post_comment_is_published")
    val postCommentIsPublished: Boolean,
    @SerialName("post_comment_is_deleted")
    val postCommentIsDeleted: Boolean,
    @SerialName("post_comment_update_date")
    val postCommentUpdateDate: Long,
    val links: PostsCommentsEditResponseCommentLinks,
    val permissions: PostsCommentsEditResponseCommentPermissions,
)

@Serializable
data class PostsCommentsDeleteBody(
    @SerialName("post_comment_id")
    val postCommentId: Long,
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
    @SerialName("post_comment_id")
    val postCommentId: Long,
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
    val page: Long? = null,
    val limit: Long? = null,
    @SerialName("fields_include")
    val fieldsInclude: JsonElement? = null,
)

@Serializable
data class UsersListResponse(
    val users: List<RespUserModel>,
    @SerialName("users_total")
    val usersTotal: Long,
    val links: UsersListResponseLinks,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class UsersListResponseLinks(
    val pages: Long,
    val page: Long,
    val next: String,
)

@Serializable
data class UsersFieldsResponse(
    val fields: List<UsersFieldsResponseFields>,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class UsersFieldsResponseFields(
    val id: String,
    val title: String,
    val description: String,
    val position: String,
    @SerialName("is_required")
    val isRequired: Boolean,
)

@Serializable
data class UsersFindParams(
    val username: String? = null,
    @SerialName("custom_fields")
    val customFields: Map<String, String>? = null,
    @SerialName("fields_include")
    val fieldsInclude: JsonElement? = null,
)

@Serializable
data class UsersFindResponse(
    val users: List<RespUserModel>,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class UsersGetParams(
    @SerialName("fields_include")
    val fieldsInclude: JsonElement? = null,
)

@Serializable
data class UsersGetResponse(
    val user: RespUserModel,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class UsersEditBody(
    val username: String? = null,
    @SerialName("user_title")
    val userTitle: String? = null,
    @SerialName("display_group_id")
    val displayGroupId: Long? = null,
    @SerialName("display_icon_group_id")
    val displayIconGroupId: Long? = null,
    @SerialName("display_banner_id")
    val displayBannerId: Long? = null,
    @SerialName("conv_welcome_message")
    val convWelcomeMessage: String? = null,
    @SerialName("user_dob_day")
    val userDobDay: Long? = null,
    @SerialName("user_dob_month")
    val userDobMonth: Long? = null,
    @SerialName("user_dob_year")
    val userDobYear: Long? = null,
    @SerialName("secret_answer")
    val secretAnswer: String? = null,
    @SerialName("secret_answer_type")
    val secretAnswerType: Long? = null,
    @SerialName("short_link")
    val shortLink: String? = null,
    @SerialName("language_id")
    val languageId: LanguageId? = null,
    val gender: Gender? = null,
    val timezone: Timezone? = null,
    @SerialName("receive_admin_email")
    val receiveAdminEmail: Boolean? = null,
    @SerialName("activity_visible")
    val activityVisible: Boolean? = null,
    @SerialName("show_dob_date")
    val showDobDate: Boolean? = null,
    @SerialName("show_dob_year")
    val showDobYear: Boolean? = null,
    @SerialName("hide_username_change_logs")
    val hideUsernameChangeLogs: Boolean? = null,
    @SerialName("allow_view_profile")
    val allowViewProfile: AllowViewProfile? = null,
    @SerialName("allow_post_profile")
    val allowPostProfile: AllowPostProfile? = null,
    @SerialName("allow_send_personal_conversation")
    val allowSendPersonalConversation: AllowSendPersonalConversation? = null,
    @SerialName("allow_invite_group")
    val allowInviteGroup: AllowInviteGroup? = null,
    @SerialName("allow_receive_news_feed")
    val allowReceiveNewsFeed: AllowReceiveNewsFeed? = null,
    val alert: Map<String, Boolean>? = null,
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
    val type: NotificationsType? = null,
    @SerialName("claim_state")
    val claimState: ClaimState? = null,
)

@Serializable
data class UsersClaimsResponse(
    val claims: List<UsersClaimsResponseClaims>,
    val stats: UsersClaimsResponseStats,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class UsersClaimsResponseClaims(
    @SerialName("thread_id")
    val threadId: Long,
    @SerialName("claim_date")
    val claimDate: Long,
    @SerialName("claim_state")
    val claimState: String,
    @SerialName("message_body")
    val messageBody: String,
    @SerialName("message_body_html")
    val messageBodyHtml: String,
    @SerialName("message_body_plain_text")
    val messageBodyPlainText: String,
    val amount: Long,
    @SerialName("amount_formatted")
    val amountFormatted: String,
    val author: RespUserModel,
)

@Serializable
data class UsersClaimsResponseStatsMarket(
    val total: Long,
    val solved: Long,
    val settled: Long,
    val rejected: Long,
)

@Serializable
data class UsersClaimsResponseStatsNoMarket(
    val total: Long,
    val solved: Long,
    val settled: Long,
    val rejected: Long,
)

@Serializable
data class UsersClaimsResponseStats(
    val market: UsersClaimsResponseStatsMarket,
    val noMarket: UsersClaimsResponseStatsNoMarket,
)

data class UsersAvatarUploadBody(
    val avatar: ByteArray,
    val x: Long? = null,
    val y: Long? = null,
    val crop: Long? = null,
)

@Serializable
data class UsersAvatarUploadResponse(
    val status: String,
    val message: String,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
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
    val x: Long? = null,
    val y: Long? = null,
    val crop: Long? = null,
)

@Serializable
data class UsersAvatarCropResponse(
    val status: String,
    val message: String,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

data class UsersBackgroundUploadBody(
    val background: ByteArray,
    val x: Long? = null,
    val y: Long? = null,
    val crop: Long? = null,
)

@Serializable
data class UsersBackgroundUploadResponse(
    val status: String,
    val message: String,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
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
    val x: Long? = null,
    val y: Long? = null,
    val crop: Long? = null,
)

@Serializable
data class UsersBackgroundCropResponse(
    val status: String,
    val message: String,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class UsersFollowersParams(
    val order: UsersOrder? = null,
    val page: Long? = null,
    val limit: Long? = null,
)

@Serializable
data class UsersFollowersResponse(
    val users: List<UsersFollowersResponseUsers>,
    @SerialName("users_total")
    val usersTotal: Long,
    val links: UsersFollowersResponseLinks,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class UsersFollowersResponseUsersLinks(
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
data class UsersFollowersResponseUsersPermissions(
    val edit: Boolean,
    val follow: Boolean,
    val ignore: Boolean,
    @SerialName("profile_post")
    val profilePost: Boolean,
)

@Serializable
data class UsersFollowersResponseUsersCustomFields(
    val _4: String,
    val lztInnovation20Link: String,
    val lztInnovation30Link: String,
    val lztInnovationLink: String,
)

@Serializable
data class UsersFollowersResponseUsers(
    @SerialName("content_type")
    val contentType: String,
    @SerialName("content_id")
    val contentId: Long,
    @SerialName("follow_date")
    val followDate: Long,
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
    val links: UsersFollowersResponseUsersLinks,
    val permissions: UsersFollowersResponseUsersPermissions,
    @SerialName("user_is_ignored")
    val userIsIgnored: Boolean,
    @SerialName("user_is_visitor")
    val userIsVisitor: Boolean,
    @SerialName("user_group_id")
    val userGroupId: Long,
    @SerialName("custom_fields")
    val customFields: UsersFollowersResponseUsersCustomFields,
)

@Serializable
data class UsersFollowersResponseLinks(
    val pages: Long,
    val page: Long,
    val next: String,
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
    val order: UsersOrder? = null,
    val page: Long? = null,
    val limit: Long? = null,
)

@Serializable
data class UsersFollowingsResponse(
    val users: List<UsersFollowingsResponseUsers>,
    @SerialName("users_total")
    val usersTotal: Long,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class UsersFollowingsResponseUsersLinks(
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
data class UsersFollowingsResponseUsersPermissions(
    val edit: Boolean,
    val follow: Boolean,
    val ignore: Boolean,
    @SerialName("profile_post")
    val profilePost: Boolean,
)

@Serializable
data class UsersFollowingsResponseUsersCustomFields(
    val _4: String,
    val allowSelfUnban: List<JsonElement>,
    val discord: String,
    val github: String,
    val jabber: String,
    val lztAwardUserTrophy: String,
    val lztCuratorNodeTitle: String,
    val lztCuratorNodeTitleEn: String,
    val lztDeposit: String,
    val lztInnovation20Link: String,
    val lztInnovation30Link: String,
    val lztInnovationLink: String,
    val lztLikesIncreasing: String,
    val lztLikesZeroing: String,
    val lztSympathyIncreasing: String,
    val lztSympathyZeroing: String,
    val maecenasValue: String,
    val scamURL: String,
    val steam: String,
    val telegram: String,
    val vk: String,
)

@Serializable
data class UsersFollowingsResponseUsers(
    @SerialName("content_type")
    val contentType: String,
    @SerialName("content_id")
    val contentId: Long,
    @SerialName("follow_date")
    val followDate: Long,
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
    @SerialName("short_link")
    val shortLink: String,
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
    val links: UsersFollowingsResponseUsersLinks,
    val permissions: UsersFollowingsResponseUsersPermissions,
    @SerialName("user_is_ignored")
    val userIsIgnored: Boolean,
    @SerialName("user_is_visitor")
    val userIsVisitor: Boolean,
    @SerialName("user_group_id")
    val userGroupId: Long,
    @SerialName("custom_fields")
    val customFields: UsersFollowingsResponseUsersCustomFields,
)

@Serializable
data class UsersLikesParams(
    @SerialName("node_id")
    val nodeId: Long? = null,
    @SerialName("like_type")
    val likeType: LikeType? = null,
    /** Default: gotten */
    val type: UsersType = UsersType.GOTTEN,
    val page: Long? = null,
    /** Default: post */
    @SerialName("content_type")
    val contentType: ContentType = ContentType.POST,
    @SerialName("search_user_id")
    val searchUserId: Long? = null,
    val stats: Boolean? = null,
)

@Serializable
data class UsersLikesResponse(
    val page: Long,
    val perPage: Long,
    val contentType: String,
    val totalLikes: Long,
    val likes: UsersLikesResponseLikes,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class UsersLikesResponseLikes1234567890(
    @SerialName("like_id")
    val likeId: Long,
    @SerialName("content_type")
    val contentType: String,
    @SerialName("content_id")
    val contentId: Long,
    @SerialName("like_user_id")
    val likeUserId: Long,
    @SerialName("like_date")
    val likeDate: Long,
    @SerialName("content_user_id")
    val contentUserId: Long,
    @SerialName("content_state")
    val contentState: String,
    val user: RespUserModel,
    val actionUser: RespUserModel,
    val messageHtml: String,
    @SerialName("post_date")
    val postDate: Long,
)

@Serializable
data class UsersLikesResponseLikes(
    @SerialName("1234567890")
    val `1234567890`: UsersLikesResponseLikes1234567890,
)

@Serializable
data class UsersIgnoredParams(
    val total: Boolean? = null,
)

@Serializable
data class UsersIgnoredResponse(
    val users: List<UsersIgnoredResponseUsers>,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class UsersIgnoredResponseUsersCustomFields(
    val _4: String,
    val scamURL: JsonElement,
    val lztLikesZeroing: JsonElement,
    val lztLikesIncreasing: JsonElement,
    val lztSympathyZeroing: JsonElement,
    val lztSympathyIncreasing: JsonElement,
    val telegram: JsonElement,
    val vk: String,
    val discord: String,
    val steam: String,
    val matrix: JsonElement,
    val jabber: String,
    val github: String,
)

@Serializable
data class UsersIgnoredResponseUsersIgnoredInfo(
    @SerialName("ignore_content")
    val ignoreContent: Long,
    @SerialName("ignore_conversations")
    val ignoreConversations: Long,
    @SerialName("restrict_view_profile")
    val restrictViewProfile: Long,
)

@Serializable
data class UsersIgnoredResponseUsersRenderedAvatars(
    val l: String,
    val m: String,
    val s: String,
)

@Serializable
data class UsersIgnoredResponseUsersRendered(
    val username: String,
    val avatars: UsersIgnoredResponseUsersRenderedAvatars,
    val backgrounds: List<JsonElement>,
    val link: String,
)

@Serializable
data class UsersIgnoredResponseUsers(
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
    val convertedDeposit: Long,
    @SerialName("custom_fields")
    val customFields: UsersIgnoredResponseUsersCustomFields,
    val deposit: Long,
    val homepage: String,
    @SerialName("ignored_info")
    val ignoredInfo: UsersIgnoredResponseUsersIgnoredInfo,
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
    @SerialName("last_activity")
    val lastActivity: Long,
    @SerialName("like2_count")
    val like2Count: Long,
    @SerialName("like_count")
    val likeCount: Long,
    val location: String,
    @SerialName("message_count")
    val messageCount: Long,
    @SerialName("register_date")
    val registerDate: Long,
    val rendered: UsersIgnoredResponseUsersRendered,
    @SerialName("short_link")
    val shortLink: String,
    @SerialName("trophy_points")
    val trophyPoints: Long,
    @SerialName("user_id")
    val userId: Long,
    @SerialName("user_title")
    val userTitle: String,
    val username: String,
    @SerialName("view_url")
    val viewUrl: String,
    @SerialName("warning_points")
    val warningPoints: Long,
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
    @SerialName("ignore_conversations")
    val ignoreConversations: Boolean? = null,
    @SerialName("ignore_content")
    val ignoreContent: Boolean? = null,
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
    val page: Long? = null,
    val limit: Long? = null,
)

@Serializable
data class UsersContentsResponse(
    val data: List<UsersContentsResponseData>,
    @SerialName("data_total")
    val dataTotal: Long,
    val user: RespUserModel,
    val links: UsersContentsResponseLinks,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class UsersContentsResponseDataLikeUsers(
    @SerialName("user_id")
    val userId: Long,
    val username: String,
    @SerialName("display_style_group_id")
    val displayStyleGroupId: Long,
    @SerialName("is_banned")
    val isBanned: Long,
    @SerialName("uniq_username_css")
    val uniqUsernameCss: String,
)

@Serializable
data class UsersContentsResponseDataLinks(
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
data class UsersContentsResponseDataPermissions(
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
data class UsersContentsResponseDataThreadLinks(
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
data class UsersContentsResponseDataThreadPermissions(
    val view: Boolean,
    val delete: Boolean,
    val follow: Boolean,
    val post: Boolean,
    @SerialName("upload_attachment")
    val uploadAttachment: Boolean,
)

@Serializable
data class UsersContentsResponseDataThread(
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
    @SerialName("creator_username_html")
    val creatorUsernameHtml: String,
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
    @SerialName("thread_prefixes")
    val threadPrefixes: List<JsonElement>,
    @SerialName("thread_tags")
    val threadTags: List<JsonElement>,
    val links: UsersContentsResponseDataThreadLinks,
    val permissions: UsersContentsResponseDataThreadPermissions,
)

@Serializable
data class UsersContentsResponseData(
    @SerialName("content_type")
    val contentType: String,
    @SerialName("content_id")
    val contentId: Long,
    @SerialName("post_id")
    val postId: Long,
    @SerialName("thread_id")
    val threadId: Long,
    @SerialName("poster_user_id")
    val posterUserId: Long,
    @SerialName("poster_username")
    val posterUsername: String,
    @SerialName("poster_username_html")
    val posterUsernameHtml: String,
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
    val likeUsers: List<UsersContentsResponseDataLikeUsers>,
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
    val links: UsersContentsResponseDataLinks,
    val permissions: UsersContentsResponseDataPermissions,
    val thread: UsersContentsResponseDataThread,
)

@Serializable
data class UsersContentsResponseLinks(
    val pages: Long,
    val page: Long,
    val next: String,
)

@Serializable
data class UsersTrophiesResponse(
    val trophies: List<UsersTrophiesResponseTrophies>,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class UsersTrophiesResponseTrophies(
    @SerialName("trophy_id")
    val trophyId: Long,
    val title: String,
    val description: String,
    @SerialName("trophy_url")
    val trophyUrl: String,
)

@Serializable
data class UsersSecretAnswerTypesResponse(
    val data: List<UsersSecretAnswerTypesResponseData>,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class UsersSecretAnswerTypesResponseData(
    @SerialName("sa_id")
    val saId: Long,
    val renderedPhrase: String,
)

@Serializable
data class UsersSaResetResponse(
    val success: Boolean,
    @SerialName("waiting_time")
    val waitingTime: String,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
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
    @SerialName("posts_user_id")
    val postsUserId: Long? = null,
    val page: Long? = null,
    val limit: Long? = null,
    @SerialName("fields_include")
    val fieldsInclude: JsonElement? = null,
)

@Serializable
data class ProfilePostsListResponse(
    @SerialName("profile_posts")
    val profilePosts: List<RespProfilePostModel>,
    val totalProfilePosts: Long,
    val canPostOnProfile: Boolean,
    val links: ProfilePostsListResponseLinks,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class ProfilePostsListResponseLinks(
    val pages: Long,
    val page: Long,
    val next: String,
)

@Serializable
data class ProfilePostsGetResponse(
    @SerialName("profile_post")
    val profilePost: RespProfilePostModel,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class ProfilePostsEditBody(
    @SerialName("post_body")
    val postBody: String? = null,
    @SerialName("disable_comments")
    val disableComments: Boolean? = null,
)

@Serializable
data class ProfilePostsEditResponse(
    @SerialName("profile_post")
    val profilePost: ProfilePostsEditResponseProfilePost,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class ProfilePostsEditResponseProfilePostLinks(
    val permalink: String,
    val detail: String,
    val timeline: String,
    @SerialName("timeline_user")
    val timelineUser: String,
    val poster: String,
    val likes: String,
    val comments: String,
    val report: String,
    @SerialName("poster_avatar")
    val posterAvatar: String,
)

@Serializable
data class ProfilePostsEditResponseProfilePostPermissions(
    val view: Boolean,
    val edit: Boolean,
    val delete: Boolean,
    val like: Boolean,
    val comment: Boolean,
    val report: Boolean,
)

@Serializable
data class ProfilePostsEditResponseProfilePost(
    @SerialName("profile_post_id")
    val profilePostId: Long,
    @SerialName("timeline_user_id")
    val timelineUserId: Long,
    @SerialName("poster_user_id")
    val posterUserId: Long,
    @SerialName("poster_username")
    val posterUsername: String,
    @SerialName("poster_username_html")
    val posterUsernameHtml: String,
    @SerialName("post_create_date")
    val postCreateDate: Long,
    @SerialName("post_body")
    val postBody: String,
    @SerialName("post_like_count")
    val postLikeCount: Long,
    @SerialName("post_comment_count")
    val postCommentCount: Long,
    @SerialName("timeline_username")
    val timelineUsername: String,
    @SerialName("user_is_ignored")
    val userIsIgnored: Boolean,
    @SerialName("post_is_published")
    val postIsPublished: Boolean,
    @SerialName("post_is_deleted")
    val postIsDeleted: Boolean,
    val links: ProfilePostsEditResponseProfilePostLinks,
    val permissions: ProfilePostsEditResponseProfilePostPermissions,
)

@Serializable
data class ProfilePostsDeleteParams(
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
    val reasons: List<String>,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class ProfilePostsReportBody(
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
    @SerialName("post_body")
    val postBody: String,
)

@Serializable
data class ProfilePostsCreateResponse(
    @SerialName("profile_post")
    val profilePost: ProfilePostsCreateResponseProfilePost,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class ProfilePostsCreateResponseProfilePostLinks(
    val permalink: String,
    val detail: String,
    val timeline: String,
    @SerialName("timeline_user")
    val timelineUser: String,
    val poster: String,
    val likes: String,
    val comments: String,
    val report: String,
    @SerialName("poster_avatar")
    val posterAvatar: String,
)

@Serializable
data class ProfilePostsCreateResponseProfilePostPermissions(
    val view: Boolean,
    val edit: Boolean,
    val delete: Boolean,
    val like: Boolean,
    val comment: Boolean,
    val report: Boolean,
)

@Serializable
data class ProfilePostsCreateResponseProfilePost(
    @SerialName("profile_post_id")
    val profilePostId: Long,
    @SerialName("timeline_user_id")
    val timelineUserId: Long,
    @SerialName("poster_user_id")
    val posterUserId: Long,
    @SerialName("poster_username")
    val posterUsername: String,
    @SerialName("poster_username_html")
    val posterUsernameHtml: String,
    @SerialName("post_create_date")
    val postCreateDate: Long,
    @SerialName("post_body")
    val postBody: String,
    @SerialName("post_like_count")
    val postLikeCount: Long,
    @SerialName("post_comment_count")
    val postCommentCount: Long,
    @SerialName("timeline_username")
    val timelineUsername: String,
    @SerialName("user_is_ignored")
    val userIsIgnored: Boolean,
    @SerialName("post_is_published")
    val postIsPublished: Boolean,
    @SerialName("post_is_deleted")
    val postIsDeleted: Boolean,
    val links: ProfilePostsCreateResponseProfilePostLinks,
    val permissions: ProfilePostsCreateResponseProfilePostPermissions,
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
    val users: List<ProfilePostsLikesResponseUsers>,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class ProfilePostsLikesResponseUsers(
    @SerialName("user_id")
    val userId: Long,
    val username: String,
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
    @SerialName("profile_post_id")
    val profilePostId: Long,
    val before: Long? = null,
    val limit: Long? = null,
)

@Serializable
data class ProfilePostsCommentsListResponse(
    val comments: List<RespProfilePostCommentModel>,
    @SerialName("comments_total")
    val commentsTotal: Long,
    @SerialName("profile_post")
    val profilePost: ProfilePostsCommentsListResponseProfilePost,
    @SerialName("timeline_user")
    val timelineUser: RespUserModel,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class ProfilePostsCommentsListResponseProfilePostLinks(
    val permalink: String,
    val detail: String,
    val timeline: String,
    @SerialName("timeline_user")
    val timelineUser: String,
    val poster: String,
    val likes: String,
    val comments: String,
    val report: String,
    @SerialName("poster_avatar")
    val posterAvatar: String,
)

@Serializable
data class ProfilePostsCommentsListResponseProfilePostPermissions(
    val view: Boolean,
    val edit: Boolean,
    val delete: Boolean,
    val like: Boolean,
    val comment: Boolean,
    val report: Boolean,
)

@Serializable
data class ProfilePostsCommentsListResponseProfilePost(
    @SerialName("profile_post_id")
    val profilePostId: Long,
    @SerialName("timeline_user_id")
    val timelineUserId: Long,
    @SerialName("poster_user_id")
    val posterUserId: Long,
    @SerialName("poster_username")
    val posterUsername: String,
    @SerialName("poster_username_html")
    val posterUsernameHtml: String,
    @SerialName("post_create_date")
    val postCreateDate: Long,
    @SerialName("post_body")
    val postBody: String,
    @SerialName("post_like_count")
    val postLikeCount: Long,
    @SerialName("post_comment_count")
    val postCommentCount: Long,
    @SerialName("timeline_username")
    val timelineUsername: String,
    @SerialName("user_is_ignored")
    val userIsIgnored: Boolean,
    @SerialName("post_is_published")
    val postIsPublished: Boolean,
    @SerialName("post_is_deleted")
    val postIsDeleted: Boolean,
    val links: ProfilePostsCommentsListResponseProfilePostLinks,
    val permissions: ProfilePostsCommentsListResponseProfilePostPermissions,
)

@Serializable
data class ProfilePostsCommentsCreateBody(
    @SerialName("profile_post_id")
    val profilePostId: Long,
    @SerialName("comment_body")
    val commentBody: String,
)

@Serializable
data class ProfilePostsCommentsCreateResponse(
    val comment: ProfilePostsCommentsCreateResponseComment,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class ProfilePostsCommentsCreateResponseCommentLinks(
    val detail: String,
    @SerialName("profile_post")
    val profilePost: String,
    val timeline: String,
    @SerialName("timeline_user")
    val timelineUser: String,
    val poster: String,
    @SerialName("poster_avatar")
    val posterAvatar: String,
)

@Serializable
data class ProfilePostsCommentsCreateResponseCommentPermissions(
    val view: Boolean,
    val delete: Boolean,
)

@Serializable
data class ProfilePostsCommentsCreateResponseComment(
    @SerialName("comment_id")
    val commentId: Long,
    @SerialName("profile_post_id")
    val profilePostId: Long,
    @SerialName("comment_user_id")
    val commentUserId: Long,
    @SerialName("comment_username")
    val commentUsername: String,
    @SerialName("comment_username_html")
    val commentUsernameHtml: String,
    @SerialName("comment_create_date")
    val commentCreateDate: Long,
    @SerialName("comment_body")
    val commentBody: String,
    @SerialName("user_is_ignored")
    val userIsIgnored: Boolean,
    @SerialName("timeline_user_id")
    val timelineUserId: Long,
    val links: ProfilePostsCommentsCreateResponseCommentLinks,
    val permissions: ProfilePostsCommentsCreateResponseCommentPermissions,
)

@Serializable
data class ProfilePostsCommentsEditBody(
    @SerialName("comment_id")
    val commentId: Long,
    @SerialName("comment_body")
    val commentBody: String,
)

@Serializable
data class ProfilePostsCommentsEditResponse(
    val comment: ProfilePostsCommentsEditResponseComment,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class ProfilePostsCommentsEditResponseCommentLinks(
    val detail: String,
    @SerialName("profile_post")
    val profilePost: String,
    val timeline: String,
    @SerialName("timeline_user")
    val timelineUser: String,
    val poster: String,
    @SerialName("poster_avatar")
    val posterAvatar: String,
)

@Serializable
data class ProfilePostsCommentsEditResponseCommentPermissions(
    val view: Boolean,
    val delete: Boolean,
)

@Serializable
data class ProfilePostsCommentsEditResponseComment(
    @SerialName("comment_id")
    val commentId: Long,
    @SerialName("profile_post_id")
    val profilePostId: Long,
    @SerialName("comment_user_id")
    val commentUserId: Long,
    @SerialName("comment_username")
    val commentUsername: String,
    @SerialName("comment_username_html")
    val commentUsernameHtml: String,
    @SerialName("comment_create_date")
    val commentCreateDate: Long,
    @SerialName("comment_body")
    val commentBody: String,
    @SerialName("user_is_ignored")
    val userIsIgnored: Boolean,
    @SerialName("timeline_user_id")
    val timelineUserId: Long,
    val links: ProfilePostsCommentsEditResponseCommentLinks,
    val permissions: ProfilePostsCommentsEditResponseCommentPermissions,
)

@Serializable
data class ProfilePostsCommentsDeleteBody(
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
    val comment: RespProfilePostCommentModel,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class ProfilePostsCommentsReportBody(
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
    val folder: Folder? = null,
    val page: Long? = null,
    val limit: Long? = null,
)

@Serializable
data class ConversationsListResponse(
    val conversations: List<RespConversationModel>,
    @SerialName("can_start")
    val canStart: Boolean,
    val folders: List<ConversationsListResponseFolders>,
    val links: ConversationsListResponseLinks,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class ConversationsListResponseFolders(
    val id: String,
    val title: String,
    val name: String,
)

@Serializable
data class ConversationsListResponseLinks(
    val pages: Long,
    val page: Long,
    val next: String,
)

@Serializable
data class ConversationsCreateBody(
    @SerialName("recipient_id")
    val recipientId: Long? = null,
    val recipients: List<String>? = null,
    /** Default: false */
    @SerialName("is_group")
    val isGroup: Boolean = false,
    val title: String? = null,
    @SerialName("open_invite")
    val openInvite: Boolean? = null,
    @SerialName("allow_edit_messages")
    val allowEditMessages: Boolean? = null,
    @SerialName("allow_sticky_messages")
    val allowStickyMessages: Boolean? = null,
    @SerialName("allow_delete_own_messages")
    val allowDeleteOwnMessages: Boolean? = null,
    @SerialName("message_body")
    val messageBody: String? = null,
)

@Serializable
data class ConversationsCreateResponse(
    val conversation: RespConversationModel,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class ConversationsUpdateBody(
    @SerialName("conversation_id")
    val conversationId: Long,
    val title: String? = null,
    @SerialName("open_invite")
    val openInvite: Boolean? = null,
    @SerialName("history_open")
    val historyOpen: Boolean? = null,
    @SerialName("allow_edit_messages")
    val allowEditMessages: Boolean? = null,
    @SerialName("allow_sticky_messages")
    val allowStickyMessages: Boolean? = null,
    @SerialName("allow_delete_own_messages")
    val allowDeleteOwnMessages: Boolean? = null,
)

@Serializable
data class ConversationsUpdateResponse(
    val conversation: RespConversationModel,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class ConversationsDeleteBody(
    @SerialName("conversation_id")
    val conversationId: Long,
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
    val conversation: RespConversationModel,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class ConversationsSaveBody(
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
    val conversation: RespConversationModel,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class ConversationsMessagesListParams(
    val page: Long? = null,
    val limit: Long? = null,
    val order: ConversationsOrder? = null,
    val before: Long? = null,
    val after: Long? = null,
)

@Serializable
data class ConversationsMessagesListResponse(
    val messages: List<RespConversationMessageModel>,
    @SerialName("messages_total")
    val messagesTotal: Long,
    val links: ConversationsMessagesListResponseLinks,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class ConversationsMessagesListResponseLinks(
    val pages: Long,
    val page: Long,
    val next: String,
)

@Serializable
data class ConversationsMessagesCreateBody(
    @SerialName("message_body")
    val messageBody: String,
    @SerialName("reply_message_id")
    val replyMessageId: Long? = null,
)

@Serializable
data class ConversationsMessagesCreateResponse(
    val message: RespConversationMessageModel,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class ConversationsSearchBody(
    val q: String? = null,
    @SerialName("conversation_id")
    val conversationId: Long? = null,
    @SerialName("search_recipients")
    val searchRecipients: Boolean? = null,
)

@Serializable
data class ConversationsSearchResponse(
    val conversations: List<RespConversationModel>,
    val recipients: Boolean,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class ConversationsMessagesGetResponse(
    val message: RespConversationModel,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class ConversationsMessagesEditBody(
    @SerialName("message_body")
    val messageBody: String,
)

@Serializable
data class ConversationsMessagesEditResponse(
    val message: RespConversationModel,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
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
    val status: String,
    val message: String,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
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
    val status: String,
    val message: String,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class ConversationsUnstarResponse(
    val status: String,
    val message: String,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class ConversationsAlertsEnableResponse(
    val status: String,
    val message: String,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class ConversationsAlertsDisableResponse(
    val status: String,
    val message: String,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

// ─── NotificationsApi Types ────────────────────────────────────────

@Serializable
data class NotificationsListParams(
    val type: NotificationsType? = null,
    val page: Long? = null,
    val limit: Long? = null,
)

@Serializable
data class NotificationsListResponse(
    val notifications: List<RespNotificationModel>,
    @SerialName("notifications_total")
    val notificationsTotal: Long,
    val links: NotificationsListResponseLinks,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class NotificationsListResponseLinks(
    val read: String,
    val pages: Long,
    val page: Long,
    val next: String,
)

@Serializable
data class NotificationsGetResponse(
    @SerialName("notification_id")
    val notificationId: Long,
    val notification: RespNotificationModel,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class NotificationsReadBody(
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
    val tags: TagsPopularResponseTags,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class TagsPopularResponseTags(
    @SerialName("000")
    val `000`: String,
)

@Serializable
data class TagsListParams(
    val page: Long? = null,
    val limit: Long? = null,
)

@Serializable
data class TagsListResponse(
    val tags: TagsListResponseTags,
    @SerialName("tags_total")
    val tagsTotal: Long,
    val links: TagsListResponseLinks,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class TagsListResponseTags(
    @SerialName("1")
    val `1`: String,
    @SerialName("2")
    val `2`: String,
    @SerialName("3")
    val `3`: String,
    @SerialName("4")
    val `4`: String,
    @SerialName("5")
    val `5`: String,
    @SerialName("6")
    val `6`: String,
    @SerialName("7")
    val `7`: String,
    @SerialName("8")
    val `8`: String,
    @SerialName("9")
    val `9`: String,
    @SerialName("10")
    val `10`: String,
    @SerialName("11")
    val `11`: String,
    @SerialName("12")
    val `12`: String,
    @SerialName("14")
    val `14`: String,
    @SerialName("15")
    val `15`: String,
    @SerialName("16")
    val `16`: String,
    @SerialName("17")
    val `17`: String,
    @SerialName("18")
    val `18`: String,
    @SerialName("19")
    val `19`: String,
    @SerialName("20")
    val `20`: String,
)

@Serializable
data class TagsListResponseLinks(
    val pages: Long,
    val page: Long,
    val next: String,
)

@Serializable
data class TagsGetParams(
    val page: Long? = null,
    val limit: Long? = null,
)

@Serializable
data class TagsGetResponse(
    val tag: TagsGetResponseTag,
    val tagged: List<TagsGetResponseTagged>,
    @SerialName("tagged_total")
    val taggedTotal: Long,
    val links: TagsGetResponseLinks,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class TagsGetResponseTagLinks(
    val permalink: String,
    val detail: String,
)

@Serializable
data class TagsGetResponseTag(
    @SerialName("tag_id")
    val tagId: Long,
    @SerialName("tag_text")
    val tagText: String,
    @SerialName("tag_use_count")
    val tagUseCount: Long,
    val links: TagsGetResponseTagLinks,
)

@Serializable
data class TagsGetResponseTaggedFirstPostLinks(
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
data class TagsGetResponseTaggedFirstPostPermissions(
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
data class TagsGetResponseTaggedFirstPost(
    @SerialName("post_id")
    val postId: Long,
    @SerialName("thread_id")
    val threadId: Long,
    @SerialName("poster_user_id")
    val posterUserId: Long,
    @SerialName("poster_username")
    val posterUsername: String,
    @SerialName("poster_username_html")
    val posterUsernameHtml: String,
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
    val links: TagsGetResponseTaggedFirstPostLinks,
    val permissions: TagsGetResponseTaggedFirstPostPermissions,
)

@Serializable
data class TagsGetResponseTaggedThreadPrefixes(
    @SerialName("prefix_id")
    val prefixId: Long,
    @SerialName("prefix_title")
    val prefixTitle: String,
)

@Serializable
data class TagsGetResponseTaggedThreadTags(
    @SerialName("1")
    val `1`: String,
    @SerialName("654")
    val `654`: String,
)

@Serializable
data class TagsGetResponseTaggedLinks(
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
data class TagsGetResponseTaggedPermissions(
    val view: Boolean,
    val delete: Boolean,
    val follow: Boolean,
    val post: Boolean,
    @SerialName("upload_attachment")
    val uploadAttachment: Boolean,
    val edit: Boolean,
)

@Serializable
data class TagsGetResponseTaggedForumForumPrefixesGroupPrefixes(
    @SerialName("prefix_id")
    val prefixId: Long,
    @SerialName("prefix_title")
    val prefixTitle: String,
)

@Serializable
data class TagsGetResponseTaggedForumForumPrefixes(
    @SerialName("group_title")
    val groupTitle: String,
    @SerialName("group_prefixes")
    val groupPrefixes: List<TagsGetResponseTaggedForumForumPrefixesGroupPrefixes>,
)

@Serializable
data class TagsGetResponseTaggedForumLinks(
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
data class TagsGetResponseTaggedForumPermissions(
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
data class TagsGetResponseTaggedForum(
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
    val forumPrefixes: List<TagsGetResponseTaggedForumForumPrefixes>,
    @SerialName("thread_default_prefix_id")
    val threadDefaultPrefixId: Long,
    @SerialName("thread_prefix_is_required")
    val threadPrefixIsRequired: Boolean,
    val links: TagsGetResponseTaggedForumLinks,
    val permissions: TagsGetResponseTaggedForumPermissions,
    @SerialName("forum_is_followed")
    val forumIsFollowed: Boolean,
)

@Serializable
data class TagsGetResponseTagged(
    @SerialName("content_type")
    val contentType: String,
    @SerialName("content_id")
    val contentId: Long,
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
    @SerialName("creator_username_html")
    val creatorUsernameHtml: String,
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
    val firstPost: TagsGetResponseTaggedFirstPost,
    @SerialName("thread_prefixes")
    val threadPrefixes: List<TagsGetResponseTaggedThreadPrefixes>,
    @SerialName("thread_tags")
    val threadTags: TagsGetResponseTaggedThreadTags,
    val links: TagsGetResponseTaggedLinks,
    val permissions: TagsGetResponseTaggedPermissions,
    val forum: TagsGetResponseTaggedForum,
)

@Serializable
data class TagsGetResponseLinks(
    val pages: Long,
    val page: Long,
    val next: String,
)

@Serializable
data class TagsFindParams(
    val tag: String,
)

@Serializable
data class TagsFindResponse(
    val tags: List<String>,
    val ids: List<Long>,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

// ─── SearchApi Types ────────────────────────────────────────

@Serializable
data class SearchAllBody(
    val q: String? = null,
    val tag: String? = null,
    @SerialName("forum_id")
    val forumId: Long? = null,
    @SerialName("user_id")
    val userId: StringOrInt? = null,
    val page: Long? = null,
    val limit: Long? = null,
)

@Serializable
data class SearchAllResponse(
    val data: List<SearchAllResponseData>,
    @SerialName("data_total")
    val dataTotal: Long,
    val users: List<RespUserModel>,
    val links: SearchAllResponseLinks,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class SearchAllResponseDataFirstPostLinks(
    val permalink: String,
    val detail: String,
    val thread: String,
    val poster: String,
    val likes: String,
    val report: String,
    @SerialName("poster_avatar")
    val posterAvatar: String,
)

@Serializable
data class SearchAllResponseDataFirstPostPermissions(
    val view: Boolean,
    val edit: Boolean,
    val delete: Boolean,
    val reply: Boolean,
    val like: Boolean,
    val report: Boolean,
)

@Serializable
data class SearchAllResponseDataFirstPost(
    @SerialName("post_id")
    val postId: Long,
    @SerialName("thread_id")
    val threadId: Long,
    @SerialName("poster_user_id")
    val posterUserId: Long,
    @SerialName("poster_username")
    val posterUsername: String,
    @SerialName("poster_username_html")
    val posterUsernameHtml: String,
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
    @SerialName("post_is_liked")
    val postIsLiked: Boolean,
    val links: SearchAllResponseDataFirstPostLinks,
    val permissions: SearchAllResponseDataFirstPostPermissions,
    @SerialName("thread_is_deleted")
    val threadIsDeleted: Boolean,
)

@Serializable
data class SearchAllResponseDataLinks(
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
data class SearchAllResponseDataPermissionsBump(
    val can: Boolean,
    @SerialName("available_count")
    val availableCount: Long,
    val error: JsonElement,
    @SerialName("next_available_time")
    val nextAvailableTime: JsonElement,
)

@Serializable
data class SearchAllResponseDataPermissions(
    val view: Boolean,
    val delete: Boolean,
    val follow: Boolean,
    val post: Boolean,
    val edit: Boolean,
    val bump: SearchAllResponseDataPermissionsBump,
)

@Serializable
data class SearchAllResponseDataForumLinks(
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
data class SearchAllResponseDataForumPermissions(
    val view: Boolean,
    val edit: Boolean,
    val delete: Boolean,
    @SerialName("create_thread")
    val createThread: Boolean,
    @SerialName("tag_thread")
    val tagThread: Boolean,
    val follow: Boolean,
)

@Serializable
data class SearchAllResponseDataForum(
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
    @SerialName("parent_node_id")
    val parentNodeId: Long,
    @SerialName("forum_prefixes")
    val forumPrefixes: List<JsonElement>,
    @SerialName("thread_default_prefix_id")
    val threadDefaultPrefixId: Long,
    @SerialName("thread_prefix_is_required")
    val threadPrefixIsRequired: Boolean,
    val links: SearchAllResponseDataForumLinks,
    val permissions: SearchAllResponseDataForumPermissions,
    @SerialName("forum_is_followed")
    val forumIsFollowed: Boolean,
)

@Serializable
data class SearchAllResponseDataLastPostLinks(
    val permalink: String,
    val detail: String,
    val thread: String,
    val poster: String,
    val likes: String,
    val report: String,
    @SerialName("poster_avatar")
    val posterAvatar: String,
)

@Serializable
data class SearchAllResponseDataLastPostPermissions(
    val view: Boolean,
    val edit: Boolean,
    val delete: Boolean,
    val reply: Boolean,
    val like: Boolean,
    val report: Boolean,
)

@Serializable
data class SearchAllResponseDataLastPost(
    @SerialName("post_id")
    val postId: Long,
    @SerialName("thread_id")
    val threadId: Long,
    @SerialName("poster_user_id")
    val posterUserId: Long,
    @SerialName("poster_username")
    val posterUsername: String,
    @SerialName("poster_username_html")
    val posterUsernameHtml: String,
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
    @SerialName("post_is_liked")
    val postIsLiked: Boolean,
    val links: SearchAllResponseDataLastPostLinks,
    val permissions: SearchAllResponseDataLastPostPermissions,
    @SerialName("thread_is_deleted")
    val threadIsDeleted: Boolean,
)

@Serializable
data class SearchAllResponseData(
    @SerialName("content_type")
    val contentType: String,
    @SerialName("content_id")
    val contentId: String,
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
    @SerialName("creator_username_html")
    val creatorUsernameHtml: String,
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
    @SerialName("thread_is_closed")
    val threadIsClosed: Boolean,
    @SerialName("thread_is_followed")
    val threadIsFollowed: Boolean,
    @SerialName("thread_is_starred")
    val threadIsStarred: Boolean,
    @SerialName("first_post")
    val firstPost: SearchAllResponseDataFirstPost,
    @SerialName("thread_prefixes")
    val threadPrefixes: List<JsonElement>,
    @SerialName("thread_tags")
    val threadTags: List<JsonElement>,
    val links: SearchAllResponseDataLinks,
    val permissions: SearchAllResponseDataPermissions,
    @SerialName("node_title")
    val nodeTitle: String,
    val forum: SearchAllResponseDataForum,
    @SerialName("last_post")
    val lastPost: SearchAllResponseDataLastPost,
)

@Serializable
data class SearchAllResponseLinks(
    val pages: Long,
    val page: Long,
    val next: String,
)

@Serializable
data class SearchThreadsBody(
    val q: String? = null,
    val tag: String? = null,
    @SerialName("forum_id")
    val forumId: Long? = null,
    @SerialName("user_id")
    val userId: StringOrInt? = null,
    val page: Long? = null,
    val limit: Long? = null,
    @SerialName("data_limit")
    val dataLimit: Long? = null,
)

@Serializable
data class SearchThreadsResponse(
    val data: List<SearchThreadsResponseData>,
    @SerialName("data_total")
    val dataTotal: Long,
    val links: SearchThreadsResponseLinks,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class SearchThreadsResponseDataFirstPostLinks(
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
data class SearchThreadsResponseDataFirstPostPermissions(
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
data class SearchThreadsResponseDataFirstPost(
    @SerialName("post_id")
    val postId: Long,
    @SerialName("thread_id")
    val threadId: Long,
    @SerialName("poster_user_id")
    val posterUserId: Long,
    @SerialName("poster_username")
    val posterUsername: String,
    @SerialName("poster_username_html")
    val posterUsernameHtml: String,
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
    val links: SearchThreadsResponseDataFirstPostLinks,
    val permissions: SearchThreadsResponseDataFirstPostPermissions,
)

@Serializable
data class SearchThreadsResponseDataLinks(
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
    @SerialName("last_post")
    val lastPost: String,
)

@Serializable
data class SearchThreadsResponseDataPermissions(
    val view: Boolean,
    val delete: Boolean,
    val follow: Boolean,
    val post: Boolean,
    @SerialName("upload_attachment")
    val uploadAttachment: Boolean,
    val edit: Boolean,
)

@Serializable
data class SearchThreadsResponseDataForumLinks(
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
data class SearchThreadsResponseDataForumPermissions(
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
data class SearchThreadsResponseDataForum(
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
    val forumPrefixes: List<JsonElement>,
    @SerialName("thread_default_prefix_id")
    val threadDefaultPrefixId: Long,
    @SerialName("thread_prefix_is_required")
    val threadPrefixIsRequired: Boolean,
    val links: SearchThreadsResponseDataForumLinks,
    val permissions: SearchThreadsResponseDataForumPermissions,
    @SerialName("forum_is_followed")
    val forumIsFollowed: Boolean,
)

@Serializable
data class SearchThreadsResponseData(
    @SerialName("content_type")
    val contentType: String,
    @SerialName("content_id")
    val contentId: Long,
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
    @SerialName("creator_username_html")
    val creatorUsernameHtml: String,
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
    val firstPost: SearchThreadsResponseDataFirstPost,
    @SerialName("thread_prefixes")
    val threadPrefixes: List<JsonElement>,
    @SerialName("thread_tags")
    val threadTags: List<JsonElement>,
    val links: SearchThreadsResponseDataLinks,
    val permissions: SearchThreadsResponseDataPermissions,
    val forum: SearchThreadsResponseDataForum,
)

@Serializable
data class SearchThreadsResponseLinks(
    val pages: Long,
    val page: Long,
    val next: String,
)

@Serializable
data class SearchPostsBody(
    val q: String? = null,
    val tag: String? = null,
    @SerialName("forum_id")
    val forumId: Long? = null,
    @SerialName("user_id")
    val userId: StringOrInt? = null,
    val page: Long? = null,
    val limit: Long? = null,
    @SerialName("data_limit")
    val dataLimit: Long? = null,
)

@Serializable
data class SearchPostsResponse(
    val data: List<SearchPostsResponseData>,
    @SerialName("data_total")
    val dataTotal: Long,
    val links: SearchPostsResponseLinks,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class SearchPostsResponseDataFirstPostLinks(
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
data class SearchPostsResponseDataFirstPostPermissions(
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
data class SearchPostsResponseDataFirstPost(
    @SerialName("post_id")
    val postId: Long,
    @SerialName("thread_id")
    val threadId: Long,
    @SerialName("poster_user_id")
    val posterUserId: Long,
    @SerialName("poster_username")
    val posterUsername: String,
    @SerialName("poster_username_html")
    val posterUsernameHtml: String,
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
    val links: SearchPostsResponseDataFirstPostLinks,
    val permissions: SearchPostsResponseDataFirstPostPermissions,
)

@Serializable
data class SearchPostsResponseDataLinks(
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
    @SerialName("last_post")
    val lastPost: String,
)

@Serializable
data class SearchPostsResponseDataPermissions(
    val view: Boolean,
    val delete: Boolean,
    val follow: Boolean,
    val post: Boolean,
    @SerialName("upload_attachment")
    val uploadAttachment: Boolean,
    val edit: Boolean,
)

@Serializable
data class SearchPostsResponseDataForumLinks(
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
data class SearchPostsResponseDataForumPermissions(
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
data class SearchPostsResponseDataForum(
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
    val forumPrefixes: List<JsonElement>,
    @SerialName("thread_default_prefix_id")
    val threadDefaultPrefixId: Long,
    @SerialName("thread_prefix_is_required")
    val threadPrefixIsRequired: Boolean,
    val links: SearchPostsResponseDataForumLinks,
    val permissions: SearchPostsResponseDataForumPermissions,
    @SerialName("forum_is_followed")
    val forumIsFollowed: Boolean,
)

@Serializable
data class SearchPostsResponseData(
    @SerialName("content_type")
    val contentType: String,
    @SerialName("content_id")
    val contentId: Long,
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
    @SerialName("creator_username_html")
    val creatorUsernameHtml: String,
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
    val firstPost: SearchPostsResponseDataFirstPost,
    @SerialName("thread_prefixes")
    val threadPrefixes: List<JsonElement>,
    @SerialName("thread_tags")
    val threadTags: List<JsonElement>,
    val links: SearchPostsResponseDataLinks,
    val permissions: SearchPostsResponseDataPermissions,
    val forum: SearchPostsResponseDataForum,
)

@Serializable
data class SearchPostsResponseLinks(
    val pages: Long,
    val page: Long,
    val next: String,
)

@Serializable
data class SearchUsersBody(
    val q: String? = null,
)

@Serializable
data class SearchUsersResponse(
    val users: List<RespUserModel>,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class SearchProfilePostsBody(
    val q: String? = null,
    @SerialName("user_id")
    val userId: Long? = null,
    val page: Long? = null,
    val limit: Long? = null,
)

@Serializable
data class SearchProfilePostsResponse(
    val data: List<SearchProfilePostsResponseData>,
    @SerialName("data_total")
    val dataTotal: Long,
    val links: SearchProfilePostsResponseLinks,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class SearchProfilePostsResponseDataLinks(
    val permalink: String,
    val detail: String,
    val timeline: String,
    @SerialName("timeline_user")
    val timelineUser: String,
    val poster: String,
    val likes: String,
    val comments: String,
    val report: String,
    @SerialName("poster_avatar")
    val posterAvatar: String,
)

@Serializable
data class SearchProfilePostsResponseDataPermissions(
    val view: Boolean,
    val edit: Boolean,
    val delete: Boolean,
    val like: Boolean,
    val comment: Boolean,
    val report: Boolean,
)

@Serializable
data class SearchProfilePostsResponseData(
    @SerialName("content_type")
    val contentType: String,
    @SerialName("content_id")
    val contentId: Long,
    @SerialName("profile_post_id")
    val profilePostId: Long,
    @SerialName("timeline_user_id")
    val timelineUserId: Long,
    @SerialName("poster_user_id")
    val posterUserId: Long,
    @SerialName("poster_username")
    val posterUsername: String,
    @SerialName("poster_username_html")
    val posterUsernameHtml: String,
    @SerialName("post_create_date")
    val postCreateDate: Long,
    @SerialName("post_body")
    val postBody: String,
    @SerialName("post_like_count")
    val postLikeCount: Long,
    @SerialName("post_comment_count")
    val postCommentCount: Long,
    @SerialName("timeline_username")
    val timelineUsername: String,
    @SerialName("user_is_ignored")
    val userIsIgnored: Boolean,
    @SerialName("post_is_published")
    val postIsPublished: Boolean,
    @SerialName("post_is_deleted")
    val postIsDeleted: Boolean,
    val links: SearchProfilePostsResponseDataLinks,
    val permissions: SearchProfilePostsResponseDataPermissions,
    @SerialName("timeline_user")
    val timelineUser: RespUserModel,
)

@Serializable
data class SearchProfilePostsResponseLinks(
    val pages: Long,
    val page: Long,
    val next: String,
)

@Serializable
data class SearchTaggedBody(
    val tag: String? = null,
    val tags: List<String>? = null,
    val page: Long? = null,
    val limit: Long? = null,
)

@Serializable
data class SearchTaggedResponse(
    val data: List<SearchTaggedResponseData>,
    @SerialName("data_total")
    val dataTotal: Long,
    @SerialName("search_tags")
    val searchTags: SearchTaggedResponseSearchTags,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class SearchTaggedResponseDataFirstPostLinks(
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
data class SearchTaggedResponseDataFirstPostPermissions(
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
data class SearchTaggedResponseDataFirstPost(
    @SerialName("post_id")
    val postId: Long,
    @SerialName("thread_id")
    val threadId: Long,
    @SerialName("poster_user_id")
    val posterUserId: Long,
    @SerialName("poster_username")
    val posterUsername: String,
    @SerialName("poster_username_html")
    val posterUsernameHtml: String,
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
    val links: SearchTaggedResponseDataFirstPostLinks,
    val permissions: SearchTaggedResponseDataFirstPostPermissions,
)

@Serializable
data class SearchTaggedResponseDataThreadTags(
    @SerialName("160179")
    val `160179`: String,
)

@Serializable
data class SearchTaggedResponseDataLinks(
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
    @SerialName("last_post")
    val lastPost: String,
)

@Serializable
data class SearchTaggedResponseDataPermissions(
    val view: Boolean,
    val delete: Boolean,
    val follow: Boolean,
    val post: Boolean,
    @SerialName("upload_attachment")
    val uploadAttachment: Boolean,
    val edit: Boolean,
    @SerialName("edit_title")
    val editTitle: Boolean,
    @SerialName("edit_tags")
    val editTags: Boolean,
)

@Serializable
data class SearchTaggedResponseDataForumForumPrefixesGroupPrefixes(
    @SerialName("prefix_id")
    val prefixId: Long,
    @SerialName("prefix_title")
    val prefixTitle: String,
)

@Serializable
data class SearchTaggedResponseDataForumForumPrefixes(
    @SerialName("group_title")
    val groupTitle: String,
    @SerialName("group_prefixes")
    val groupPrefixes: List<SearchTaggedResponseDataForumForumPrefixesGroupPrefixes>,
)

@Serializable
data class SearchTaggedResponseDataForumLinks(
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
data class SearchTaggedResponseDataForumPermissions(
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
data class SearchTaggedResponseDataForum(
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
    val forumPrefixes: List<SearchTaggedResponseDataForumForumPrefixes>,
    @SerialName("thread_default_prefix_id")
    val threadDefaultPrefixId: Long,
    @SerialName("thread_prefix_is_required")
    val threadPrefixIsRequired: Boolean,
    val links: SearchTaggedResponseDataForumLinks,
    val permissions: SearchTaggedResponseDataForumPermissions,
    @SerialName("forum_is_followed")
    val forumIsFollowed: Boolean,
)

@Serializable
data class SearchTaggedResponseData(
    @SerialName("content_type")
    val contentType: String,
    @SerialName("content_id")
    val contentId: Long,
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
    @SerialName("creator_username_html")
    val creatorUsernameHtml: String,
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
    val firstPost: SearchTaggedResponseDataFirstPost,
    @SerialName("thread_prefixes")
    val threadPrefixes: List<JsonElement>,
    @SerialName("thread_tags")
    val threadTags: SearchTaggedResponseDataThreadTags,
    val links: SearchTaggedResponseDataLinks,
    val permissions: SearchTaggedResponseDataPermissions,
    val forum: SearchTaggedResponseDataForum,
)

@Serializable
data class SearchTaggedResponseSearchTags(
    @SerialName("160179")
    val `160179`: String,
)

@Serializable
data class SearchResultsParams(
    val page: Long? = null,
    val limit: Long? = null,
)

@Serializable
data class SearchResultsResponse(
    val data: List<SearchResultsResponseData>,
    @SerialName("data_total")
    val dataTotal: Long,
    @SerialName("search_tags")
    val searchTags: SearchResultsResponseSearchTags,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class SearchResultsResponseDataFirstPostLinks(
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
data class SearchResultsResponseDataFirstPostPermissions(
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
data class SearchResultsResponseDataFirstPost(
    @SerialName("post_id")
    val postId: Long,
    @SerialName("thread_id")
    val threadId: Long,
    @SerialName("poster_user_id")
    val posterUserId: Long,
    @SerialName("poster_username")
    val posterUsername: String,
    @SerialName("poster_username_html")
    val posterUsernameHtml: String,
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
    val links: SearchResultsResponseDataFirstPostLinks,
    val permissions: SearchResultsResponseDataFirstPostPermissions,
)

@Serializable
data class SearchResultsResponseDataThreadTags(
    @SerialName("160179")
    val `160179`: String,
)

@Serializable
data class SearchResultsResponseDataLinks(
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
    @SerialName("last_post")
    val lastPost: String,
)

@Serializable
data class SearchResultsResponseDataPermissions(
    val view: Boolean,
    val delete: Boolean,
    val follow: Boolean,
    val post: Boolean,
    @SerialName("upload_attachment")
    val uploadAttachment: Boolean,
    val edit: Boolean,
    @SerialName("edit_title")
    val editTitle: Boolean,
    @SerialName("edit_tags")
    val editTags: Boolean,
)

@Serializable
data class SearchResultsResponseDataForumForumPrefixesGroupPrefixes(
    @SerialName("prefix_id")
    val prefixId: Long,
    @SerialName("prefix_title")
    val prefixTitle: String,
)

@Serializable
data class SearchResultsResponseDataForumForumPrefixes(
    @SerialName("group_title")
    val groupTitle: String,
    @SerialName("group_prefixes")
    val groupPrefixes: List<SearchResultsResponseDataForumForumPrefixesGroupPrefixes>,
)

@Serializable
data class SearchResultsResponseDataForumLinks(
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
data class SearchResultsResponseDataForumPermissions(
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
data class SearchResultsResponseDataForum(
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
    val forumPrefixes: List<SearchResultsResponseDataForumForumPrefixes>,
    @SerialName("thread_default_prefix_id")
    val threadDefaultPrefixId: Long,
    @SerialName("thread_prefix_is_required")
    val threadPrefixIsRequired: Boolean,
    val links: SearchResultsResponseDataForumLinks,
    val permissions: SearchResultsResponseDataForumPermissions,
    @SerialName("forum_is_followed")
    val forumIsFollowed: Boolean,
)

@Serializable
data class SearchResultsResponseData(
    @SerialName("content_type")
    val contentType: String,
    @SerialName("content_id")
    val contentId: Long,
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
    @SerialName("creator_username_html")
    val creatorUsernameHtml: String,
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
    val firstPost: SearchResultsResponseDataFirstPost,
    @SerialName("thread_prefixes")
    val threadPrefixes: List<JsonElement>,
    @SerialName("thread_tags")
    val threadTags: SearchResultsResponseDataThreadTags,
    val links: SearchResultsResponseDataLinks,
    val permissions: SearchResultsResponseDataPermissions,
    val forum: SearchResultsResponseDataForum,
)

@Serializable
data class SearchResultsResponseSearchTags(
    @SerialName("160179")
    val `160179`: String,
)

// ─── BatchApi Types ────────────────────────────────────────

typealias BatchExecuteBody = List<JsonObject>

@Serializable
data class BatchExecuteResponse(
    val jobs: BatchExecuteResponseJobs,
)

@Serializable
data class BatchExecuteResponseJobs(
    @SerialName("job_id")
    val jobId: JsonObject,
)

// ─── ChatboxApi Types ────────────────────────────────────────

@Serializable
data class ChatboxIndexParams(
    @SerialName("room_id")
    val roomId: RoomId? = null,
)

@Serializable
data class ChatboxIndexResponse(
    val rooms: List<ChatboxIndexResponseRooms>,
    val ban: JsonElement,
    val ignore: List<ChatboxIndexResponseIgnore>,
    val permissions: ChatboxIndexResponsePermissions,
    val commands: List<String>,
    val roomsOnline: ChatboxIndexResponseRoomsOnline,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class ChatboxIndexResponseRooms(
    @SerialName("can_report")
    val canReport: Boolean,
    val eng: Boolean,
    val market: Boolean,
    @SerialName("room_id")
    val roomId: Long,
    val title: String,
)

@Serializable
data class ChatboxIndexResponseIgnoreRenderedAvatars(
    val l: String,
    val m: String,
    val s: String,
)

@Serializable
data class ChatboxIndexResponseIgnoreRendered(
    val username: String,
    val avatars: ChatboxIndexResponseIgnoreRenderedAvatars,
    val link: String,
)

@Serializable
data class ChatboxIndexResponseIgnore(
    @SerialName("avatar_date")
    val avatarDate: Long,
    @SerialName("background_date")
    val backgroundDate: Long,
    @SerialName("contest_count")
    val contestCount: Long,
    @SerialName("custom_title")
    val customTitle: String,
    @SerialName("display_banner_id")
    val displayBannerId: Long,
    @SerialName("display_icon_group_id")
    val displayIconGroupId: Long,
    @SerialName("display_style_group_id")
    val displayStyleGroupId: Long,
    @SerialName("is_admin")
    val isAdmin: Boolean,
    @SerialName("is_banned")
    val isBanned: Boolean,
    @SerialName("is_moderator")
    val isModerator: Boolean,
    @SerialName("is_staff")
    val isStaff: Boolean,
    @SerialName("last_activity")
    val lastActivity: Long,
    @SerialName("like2_count")
    val like2Count: Long,
    @SerialName("like_count")
    val likeCount: Long,
    @SerialName("message_count")
    val messageCount: Long,
    @SerialName("register_date")
    val registerDate: Long,
    val rendered: ChatboxIndexResponseIgnoreRendered,
    @SerialName("short_link")
    val shortLink: JsonElement,
    @SerialName("trophy_points")
    val trophyPoints: Long,
    @SerialName("uniq_banner")
    val uniqBanner: JsonElement,
    @SerialName("uniq_username_css")
    val uniqUsernameCss: String,
    @SerialName("user_id")
    val userId: Long,
    val username: String,
)

@Serializable
data class ChatboxIndexResponsePermissions(
    val deleteAnyMessage: Boolean,
    val editAnyMessage: Boolean,
    val viewAnyMessage: Boolean,
    val viewMessages: Boolean,
    val postMessage: Boolean,
    val ban: Boolean,
)

@Serializable
data class ChatboxIndexResponseRoomsOnline(
    @SerialName("chat:0")
    val chat_0: Long,
)

@Serializable
data class ChatboxGetMessagesParams(
    @SerialName("room_id")
    val roomId: RoomId,
    @SerialName("before_message_id")
    val beforeMessageId: Long? = null,
)

@Serializable
data class ChatboxGetMessagesResponse(
    val messages: List<RespChatboxMessageModel>,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class ChatboxPostMessageBody(
    @SerialName("room_id")
    val roomId: RoomId,
    val message: String,
    @SerialName("reply_message_id")
    val replyMessageId: Long? = null,
)

@Serializable
data class ChatboxPostMessageResponse(
    val message: RespChatboxMessageModel,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class ChatboxEditMessageBody(
    @SerialName("message_id")
    val messageId: Long,
    val message: String,
)

@Serializable
data class ChatboxEditMessageResponse(
    val message: RespChatboxMessageModel,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class ChatboxDeleteMessageBody(
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
    @SerialName("room_id")
    val roomId: RoomId,
)

@Serializable
data class ChatboxOnlineResponse(
    val users: List<ChatboxOnlineResponseUsers>,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class ChatboxOnlineResponseUsersRenderedAvatars(
    val l: String,
    val m: String,
    val s: String,
)

@Serializable
data class ChatboxOnlineResponseUsersRendered(
    val username: String,
    val avatars: ChatboxOnlineResponseUsersRenderedAvatars,
    val link: String,
)

@Serializable
data class ChatboxOnlineResponseUsersUniqBanner(
    @SerialName("banner_css")
    val bannerCss: String,
    @SerialName("banner_text")
    val bannerText: String,
    @SerialName("banner_icon")
    val bannerIcon: String,
    @SerialName("username_icon")
    val usernameIcon: String,
)

@Serializable
data class ChatboxOnlineResponseUsers(
    @SerialName("avatar_date")
    val avatarDate: Long,
    @SerialName("background_date")
    val backgroundDate: Long,
    @SerialName("contest_count")
    val contestCount: Long,
    @SerialName("custom_title")
    val customTitle: String,
    @SerialName("display_banner_id")
    val displayBannerId: Long,
    @SerialName("display_icon_group_id")
    val displayIconGroupId: Long,
    @SerialName("display_style_group_id")
    val displayStyleGroupId: Long,
    @SerialName("is_admin")
    val isAdmin: Boolean,
    @SerialName("is_banned")
    val isBanned: Boolean,
    @SerialName("is_moderator")
    val isModerator: Boolean,
    @SerialName("is_staff")
    val isStaff: Boolean,
    @SerialName("last_activity")
    val lastActivity: Long,
    @SerialName("like2_count")
    val like2Count: Long,
    @SerialName("like_count")
    val likeCount: Long,
    @SerialName("message_count")
    val messageCount: Long,
    @SerialName("register_date")
    val registerDate: Long,
    val rendered: ChatboxOnlineResponseUsersRendered,
    @SerialName("short_link")
    val shortLink: String,
    @SerialName("trophy_points")
    val trophyPoints: Long,
    @SerialName("uniq_banner")
    val uniqBanner: ChatboxOnlineResponseUsersUniqBanner,
    @SerialName("uniq_username_css")
    val uniqUsernameCss: String,
    @SerialName("user_id")
    val userId: Long,
    val username: String,
)

@Serializable
data class ChatboxReportReasonsParams(
    @SerialName("message_id")
    val messageId: Long,
)

@Serializable
data class ChatboxReportReasonsResponse(
    val reasons: List<String>,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class ChatboxReportBody(
    @SerialName("message_id")
    val messageId: Long,
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
    val duration: Duration? = null,
)

@Serializable
data class ChatboxGetLeaderboardResponse(
    val leaderboard: List<ChatboxGetLeaderboardResponseLeaderboard>,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class ChatboxGetLeaderboardResponseLeaderboardRenderedAvatars(
    val l: String,
    val m: String,
    val s: String,
)

@Serializable
data class ChatboxGetLeaderboardResponseLeaderboardRendered(
    val username: String,
    val avatars: ChatboxGetLeaderboardResponseLeaderboardRenderedAvatars,
    val link: String,
)

@Serializable
data class ChatboxGetLeaderboardResponseLeaderboardUniqBanner(
    @SerialName("banner_css")
    val bannerCss: String,
    @SerialName("banner_text")
    val bannerText: String,
    @SerialName("banner_icon")
    val bannerIcon: String,
)

@Serializable
data class ChatboxGetLeaderboardResponseLeaderboard(
    val count: Long,
    @SerialName("user_id")
    val userId: Long,
    @SerialName("avatar_date")
    val avatarDate: Long,
    @SerialName("background_date")
    val backgroundDate: Long,
    @SerialName("contest_count")
    val contestCount: Long,
    @SerialName("custom_title")
    val customTitle: String,
    @SerialName("display_banner_id")
    val displayBannerId: Long,
    @SerialName("display_icon_group_id")
    val displayIconGroupId: Long,
    @SerialName("display_style_group_id")
    val displayStyleGroupId: Long,
    @SerialName("is_banned")
    val isBanned: Boolean,
    @SerialName("last_activity")
    val lastActivity: Long,
    @SerialName("like2_count")
    val like2Count: Long,
    @SerialName("like_count")
    val likeCount: Long,
    @SerialName("message_count")
    val messageCount: Long,
    @SerialName("register_date")
    val registerDate: Long,
    val rendered: ChatboxGetLeaderboardResponseLeaderboardRendered,
    @SerialName("short_link")
    val shortLink: JsonElement,
    @SerialName("trophy_points")
    val trophyPoints: Long,
    @SerialName("uniq_banner")
    val uniqBanner: ChatboxGetLeaderboardResponseLeaderboardUniqBanner,
    @SerialName("uniq_username_css")
    val uniqUsernameCss: String,
    val username: String,
)

@Serializable
data class ChatboxGetIgnoreResponse(
    val ignored: List<ChatboxGetIgnoreResponseIgnored>,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class ChatboxGetIgnoreResponseIgnoredRenderedAvatars(
    val l: String,
    val m: String,
    val s: String,
)

@Serializable
data class ChatboxGetIgnoreResponseIgnoredRendered(
    val username: String,
    val avatars: ChatboxGetIgnoreResponseIgnoredRenderedAvatars,
    val link: String,
)

@Serializable
data class ChatboxGetIgnoreResponseIgnored(
    @SerialName("avatar_date")
    val avatarDate: Long,
    @SerialName("background_date")
    val backgroundDate: Long,
    @SerialName("contest_count")
    val contestCount: Long,
    @SerialName("custom_title")
    val customTitle: String,
    @SerialName("display_banner_id")
    val displayBannerId: Long,
    @SerialName("display_icon_group_id")
    val displayIconGroupId: Long,
    @SerialName("display_style_group_id")
    val displayStyleGroupId: Long,
    @SerialName("is_banned")
    val isBanned: Boolean,
    @SerialName("last_activity")
    val lastActivity: Long,
    @SerialName("like2_count")
    val like2Count: Long,
    @SerialName("like_count")
    val likeCount: Long,
    @SerialName("message_count")
    val messageCount: Long,
    @SerialName("register_date")
    val registerDate: Long,
    val rendered: ChatboxGetIgnoreResponseIgnoredRendered,
    @SerialName("short_link")
    val shortLink: JsonElement,
    @SerialName("trophy_points")
    val trophyPoints: Long,
    @SerialName("uniq_banner")
    val uniqBanner: JsonElement,
    @SerialName("uniq_username_css")
    val uniqUsernameCss: String,
    @SerialName("user_id")
    val userId: Long,
    val username: String,
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
    val page: Long? = null,
)

@Serializable
data class FormsListResponse(
    val forms: List<FormsListResponseForms>,
    val formsPerPage: Long,
    val page: Long,
    val totalForms: Long,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class FormsListResponseFormsFieldsFieldChoices(
    val buy: String,
    val sell: String,
)

@Serializable
data class FormsListResponseFormsFields(
    @SerialName("field_id")
    val fieldId: Long,
    val title: String,
    val fieldChoices: FormsListResponseFormsFieldsFieldChoices,
    val required: Long,
    @SerialName("max_length")
    val maxLength: Long,
    @SerialName("default_value")
    val defaultValue: String,
)

@Serializable
data class FormsListResponseForms(
    @SerialName("form_id")
    val formId: Long,
    val title: String,
    val description: String,
    val fields: List<FormsListResponseFormsFields>,
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
    val message: String,
    val content: FormsCreateResponseContent,
    @SerialName("system_info")
    val systemInfo: RespSystemInfo,
)

@Serializable
data class FormsCreateResponseContentLinks(
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
)

@Serializable
data class FormsCreateResponseContentPermissions(
    val view: Boolean,
    val delete: Boolean,
    val follow: Boolean,
    val post: Boolean,
)

@Serializable
data class FormsCreateResponseContent(
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
    @SerialName("creator_username_html")
    val creatorUsernameHtml: String,
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
    @SerialName("thread_is_closed")
    val threadIsClosed: Boolean,
    @SerialName("thread_is_followed")
    val threadIsFollowed: Boolean,
    @SerialName("thread_prefixes")
    val threadPrefixes: List<JsonElement>,
    @SerialName("thread_tags")
    val threadTags: List<JsonElement>,
    val links: FormsCreateResponseContentLinks,
    val permissions: FormsCreateResponseContentPermissions,
    @SerialName("node_title")
    val nodeTitle: String,
)
