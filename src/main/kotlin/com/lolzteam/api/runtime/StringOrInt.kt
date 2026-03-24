package com.lolzteam.api.runtime

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonDecoder
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.longOrNull

@Serializable(with = StringOrIntSerializer::class)
sealed interface StringOrInt {
    val stringValue: String

    data class OfString(val value: String) : StringOrInt {
        override val stringValue: String get() = value
    }

    data class OfInt(val value: Long) : StringOrInt {
        override val stringValue: String get() = value.toString()
    }

    companion object {
        fun of(value: String): StringOrInt = OfString(value)

        fun of(value: Long): StringOrInt = OfInt(value)

        fun of(value: Int): StringOrInt = OfInt(value.toLong())
    }
}

internal object StringOrIntSerializer : KSerializer<StringOrInt> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("StringOrInt", PrimitiveKind.STRING)

    override fun serialize(
        encoder: Encoder,
        value: StringOrInt,
    ) {
        when (value) {
            is StringOrInt.OfString -> encoder.encodeString(value.value)
            is StringOrInt.OfInt -> encoder.encodeLong(value.value)
        }
    }

    override fun deserialize(decoder: Decoder): StringOrInt {
        val jsonDecoder = decoder as? JsonDecoder
        if (jsonDecoder != null) {
            val element = jsonDecoder.decodeJsonElement() as? JsonPrimitive
            if (element != null) {
                val longVal = element.longOrNull
                if (longVal != null) return StringOrInt.OfInt(longVal)
                return StringOrInt.OfString(element.content)
            }
        }
        return StringOrInt.OfString(decoder.decodeString())
    }
}
