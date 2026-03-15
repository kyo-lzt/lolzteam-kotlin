/** Schema-to-type mapping and operation/parameter/body/response extraction. */

import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.boolean
import kotlinx.serialization.json.booleanOrNull
import kotlinx.serialization.json.contentOrNull
import kotlinx.serialization.json.jsonArray
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive

// ─── Ref Resolution ──────────────────────────────────────────────────────────

/** Follow a JSON pointer path like `#/components/schemas/Foo`. */
fun resolveRef(ref: String, spec: JsonObject): JsonElement? {
	val parts = ref.removePrefix("#/").split("/")
	var current: JsonElement = spec
	for (part in parts) {
		current = (current as? JsonObject)?.get(part) ?: return null
	}
	return current
}

/** Shallow $ref resolution — only resolves the top-level ref. */
fun derefShallow(value: JsonElement, spec: JsonObject): JsonElement {
	if (value is JsonObject) {
		val ref = (value["\$ref"] as? JsonPrimitive)?.contentOrNull
		if (ref != null) {
			val resolved = resolveRef(ref, spec) ?: return value
			return derefShallow(resolved, spec)
		}
	}
	return value
}

/** Recursively resolve all `$ref` pointers in an object. */
fun derefDeep(value: JsonElement, spec: JsonObject, visited: MutableSet<String> = mutableSetOf()): JsonElement {
	if (value is JsonObject) {
		val ref = (value["\$ref"] as? JsonPrimitive)?.contentOrNull
		if (ref != null) {
			if (ref in visited) return JsonObject(emptyMap())
			visited.add(ref)
			val resolved = resolveRef(ref, spec) ?: return value
			return derefDeep(resolved, spec, visited)
		}
		return JsonObject(value.mapValues { derefDeep(it.value, spec, visited.toMutableSet()) })
	}
	if (value is JsonArray) {
		return JsonArray(value.map { derefDeep(it, spec, visited.toMutableSet()) })
	}
	return value
}

// ─── OpenAPI Schema → Kotlin Type ────────────────────────────────────────────

/** Convert an OpenAPI schema to an intermediate type string. */
fun schemaToTypeString(schema: JsonElement?, spec: JsonObject): String {
	if (schema == null) return "unknown"
	if (schema is JsonObject && schema.isEmpty()) return "unknown"

	// $ref
	if (schema is JsonObject) {
		val ref = (schema["\$ref"] as? JsonPrimitive)?.contentOrNull
		if (ref != null) {
			val resolved = derefShallow(schema, spec)
			return schemaToTypeString(resolved, spec)
		}
	}

	if (schema !is JsonObject) return "unknown"

	// Check type BEFORE enum — if type is a known non-string primitive with enum, return the primitive type
	val typeElEarly = schema["type"]
	val typeEarly = (typeElEarly as? JsonPrimitive)?.contentOrNull
	if (typeEarly != null && typeEarly in listOf("integer", "number", "boolean")) {
		val enumCheck = schema["enum"] as? JsonArray
		if (enumCheck != null && enumCheck.isNotEmpty()) {
			return primitiveType(typeEarly)
		}
	}

	// enum → string literal union
	val enumValues = schema["enum"] as? JsonArray
	if (enumValues != null && enumValues.isNotEmpty()) {
		val literals = enumValues.mapNotNull { el ->
			val prim = el as? JsonPrimitive ?: return@mapNotNull null
			if (prim.isString) "\"${prim.content.replace("\\", "\\\\").replace("\"", "\\\"")}\""
			else prim.content
		}
		if (literals.isNotEmpty()) return literals.joinToString(" | ")
	}

	// oneOf / anyOf → union
	val oneOf = schema["oneOf"] as? JsonArray
	if (oneOf != null && oneOf.isNotEmpty()) {
		return oneOf.joinToString(" | ") { schemaToTypeString(it, spec) }
	}
	val anyOf = schema["anyOf"] as? JsonArray
	if (anyOf != null && anyOf.isNotEmpty()) {
		return anyOf.joinToString(" | ") { schemaToTypeString(it, spec) }
	}

	// allOf → intersection
	val allOf = schema["allOf"] as? JsonArray
	if (allOf != null && allOf.isNotEmpty()) {
		return allOf.joinToString(" & ") { schemaToTypeString(it, spec) }
	}

	// Multi-type array: type: ['string', 'integer']
	val typeEl = schema["type"]
	if (typeEl is JsonArray) {
		val types = typeEl.map { (it as JsonPrimitive).content }
		val hasNull = "null" in types
		val nonNull = types.filter { it != "null" }.map { primitiveType(it) }
		val result = nonNull.joinToString(" | ")
		return if (hasNull) "$result | null" else result
	}

	val type = (typeEl as? JsonPrimitive)?.contentOrNull

	if (type == "array") {
		val itemType = schemaToTypeString(schema["items"], spec)
		return "Array<$itemType>"
	}

	if (type == "object" || schema.containsKey("properties")) {
		val props = schema["properties"] as? JsonObject
		if (props == null || props.isEmpty()) {
			val addlProps = schema["additionalProperties"]
			if (addlProps != null && addlProps !is JsonPrimitive) {
				val valType = schemaToTypeString(addlProps, spec)
				return "Record<string, $valType>"
			}
			return "Record<string, unknown>"
		}
		return "{}"  // inline object → will map to JsonObject in Kotlin
	}

	if (type != null) return primitiveType(type)

	return "unknown"
}

private fun primitiveType(t: String): String = when (t) {
	"string" -> "string"
	"integer" -> "integer"
	"number" -> "number"
	"boolean" -> "boolean"
	"null" -> "null"
	else -> "unknown"
}

/** Map intermediate type string to Kotlin type. */
fun tsTypeToKotlin(tsType: String): String {
	// allOf intersection types — handle separately from union
	if (" & " in tsType) {
		return "JsonElement"
	}

	// Union types
	if (" | " in tsType) {
		val parts = tsType.split(" | ").map { it.trim() }
		val nonNull = parts.filter { it != "null" }
		if (nonNull.size == 1 && "null" in parts) {
			return "${tsTypeToKotlin(nonNull[0])}?"
		}
		// All string literals → String
		if (nonNull.isNotEmpty() && nonNull.all { it.startsWith("\"") && it.endsWith("\"") }) {
			return "String"
		}
		// string | integer → StringOrInt
		val nonNullSet = nonNull.toSet()
		if (nonNullSet == setOf("string", "integer") || nonNullSet == setOf("integer", "string")) {
			return if ("null" in parts) "StringOrInt?" else "StringOrInt"
		}
		return "JsonElement"
	}

	// Array<T>
	val arrayMatch = Regex("^Array<(.+)>$").find(tsType)
	if (arrayMatch != null) {
		return "List<${tsTypeToKotlin(arrayMatch.groupValues[1])}>"
	}

	// Record<string, T> → Map<String, KotlinType>
	val recordMatch = Regex("^Record<string, (.+)>$").find(tsType)
	if (recordMatch != null) {
		return "Map<String, ${tsTypeToKotlin(recordMatch.groupValues[1])}>"
	}

	// Inline objects
	if (tsType.startsWith("{")) {
		return "JsonObject"
	}

	return when (tsType) {
		"string" -> "String"
		"number" -> "Double"
		"integer" -> "Long"
		"boolean" -> "Boolean"
		"unknown" -> "JsonElement"
		"Blob" -> "ByteArray"
		else -> {
			if (tsType.startsWith("\"") || tsType.matches(Regex("^\\d+$"))) "String"
			else "JsonElement"
		}
	}
}

// ─── Parameter Extraction ────────────────────────────────────────────────────

data class ParsedParameter(
	val name: String,
	val type: String,
	val required: Boolean,
	val enumValues: List<String>? = null,
	val defaultValue: String? = null,
)

data class OperationParameters(
	val pathParams: List<ParsedParameter>,
	val queryParams: List<ParsedParameter>,
)

fun extractParameters(operation: JsonObject, spec: JsonObject): OperationParameters {
	val pathParams = mutableListOf<ParsedParameter>()
	val queryParams = mutableListOf<ParsedParameter>()

	val rawParams = operation["parameters"] as? JsonArray ?: return OperationParameters(pathParams, queryParams)

	for (rawParam in rawParams) {
		val param = derefShallow(rawParam, spec) as? JsonObject ?: continue
		val inValue = (param["in"] as? JsonPrimitive)?.contentOrNull ?: continue
		if (inValue == "header" || inValue == "cookie") continue

		val name = (param["name"] as? JsonPrimitive)?.contentOrNull ?: continue
		val schema = param["schema"]
		val type = schemaToTypeString(schema, spec)
		val required = (param["required"] as? JsonPrimitive)?.booleanOrNull ?: false

		val enumValues = extractEnumValues(schema as? JsonObject)
		val defaultValue = extractDefaultValue(schema)

		val parsed = ParsedParameter(
			name = name,
			type = type,
			required = if (inValue == "path") true else required,
			enumValues = enumValues,
			defaultValue = defaultValue,
		)

		if (inValue == "path") pathParams.add(parsed)
		else if (inValue == "query") queryParams.add(parsed)
	}

	return OperationParameters(pathParams, queryParams)
}

// ─── Body Extraction ─────────────────────────────────────────────────────────

data class BodyProperty(
	val name: String,
	val type: String,
	val required: Boolean,
	val enumValues: List<String>? = null,
	val defaultValue: String? = null,
)

data class OneOfVariant(
	val discriminatorValue: String,
	val title: String?,
	val properties: List<BodyProperty>,
)

data class DiscriminatedUnion(
	val discriminatorProperty: String,
	val discriminatorType: String,
	val variants: List<OneOfVariant>,
)

data class BodyExtractionResult(
	val properties: List<BodyProperty>,
	val bodyIsArray: Boolean = false,
	val bodyArrayItemType: String? = null,
	val bodyEncoding: String = "form",
	val discriminatedUnion: DiscriminatedUnion? = null,
)

fun extractBody(operation: JsonObject, spec: JsonObject): BodyExtractionResult {
	val empty = BodyExtractionResult(properties = emptyList())

	val rawRequestBody = operation["requestBody"] ?: return empty
	val requestBody = derefShallow(rawRequestBody, spec) as? JsonObject ?: return empty
	val content = requestBody["content"] as? JsonObject ?: return empty

	val hasForm = content.containsKey("application/x-www-form-urlencoded")
	val hasMultipart = content.containsKey("multipart/form-data")
	val hasJson = content.containsKey("application/json")

	val bodyEncoding = when {
		hasMultipart && !hasForm -> "multipart"
		hasJson && !hasForm -> "json"
		else -> "form"
	}

	val mediaType = (content["application/json"]
		?: content["multipart/form-data"]
		?: content["application/x-www-form-urlencoded"]) as? JsonObject
		?: return empty

	val schema = mediaType["schema"] as? JsonObject ?: return empty

	// Array body
	val schemaType = (schema["type"] as? JsonPrimitive)?.contentOrNull
	if (schemaType == "array" && !schema.containsKey("properties")) {
		val items = schema["items"]
		val itemType = if (items != null) schemaToTypeString(items, spec) else "unknown"
		return BodyExtractionResult(
			properties = emptyList(),
			bodyIsArray = true,
			bodyArrayItemType = itemType,
			bodyEncoding = bodyEncoding,
		)
	}

	val bodyProperties = mutableListOf<BodyProperty>()

	// oneOf → merge all properties, mark all optional
	val oneOf = schema["oneOf"] as? JsonArray
	if (oneOf != null) {
		// Try to detect discriminated union
		val union = detectDiscriminatedUnion(oneOf, spec)

		val allProps = mutableMapOf<String, JsonElement>()
		for (variant in oneOf) {
			val variantObj = variant as? JsonObject ?: continue
			val variantProps = variantObj["properties"] as? JsonObject ?: continue
			for ((name, propSchema) in variantProps) {
				allProps[name] = propSchema
			}
		}
		for ((name, propSchema) in allProps) {
			bodyProperties.add(BodyProperty(
				name = name,
				type = schemaToTypeString(propSchema, spec),
				required = false,
				enumValues = extractEnumValues(propSchema as? JsonObject),
			))
		}

		return BodyExtractionResult(
			properties = bodyProperties,
			bodyEncoding = bodyEncoding,
			discriminatedUnion = union,
		)
	} else {
		val properties = schema["properties"] as? JsonObject
		if (properties != null) {
			val requiredSet = (schema["required"] as? JsonArray)
				?.mapNotNull { (it as? JsonPrimitive)?.contentOrNull }
				?.toSet() ?: emptySet()

			for ((name, propSchema) in properties) {
				val propObj = propSchema as? JsonObject
				val format = (propObj?.get("format") as? JsonPrimitive)?.contentOrNull
				val type = if (format == "binary") "Blob" else schemaToTypeString(propSchema, spec)
				bodyProperties.add(BodyProperty(
					name = name,
					type = type,
					required = name in requiredSet,
					enumValues = extractEnumValues(propObj),
					defaultValue = extractDefaultValue(propSchema),
				))
			}
		}
	}

	return BodyExtractionResult(
		properties = bodyProperties,
		bodyEncoding = bodyEncoding,
	)
}

// ─── Response Extraction ─────────────────────────────────────────────────────

fun extractResponseType(operation: JsonObject, spec: JsonObject): String {
	val responses = operation["responses"] as? JsonObject ?: return "unknown"
	val rawSuccess = responses["200"] ?: responses["201"] ?: return "unknown"
	val success = derefShallow(rawSuccess, spec) as? JsonObject ?: return "unknown"
	val content = success["content"] as? JsonObject ?: return "unknown"
	val jsonContent = content["application/json"] as? JsonObject ?: return "unknown"
	val rawSchema = jsonContent["schema"] ?: return "unknown"
	val schema = derefShallow(rawSchema, spec)
	return schemaToTypeString(schema, spec)
}

// ─── Typed Response Extraction (ref-aware) ───────────────────────────────────

/** A single property in a response schema, preserving $ref info. */
data class ResponseProperty(
	val name: String,
	val type: String,
	val componentRef: String?,
	val isArray: Boolean,
	val required: Boolean,
	val inlineProperties: List<ResponseProperty>,
)

/** Full response schema for an operation. */
data class ResponseSchema(
	val properties: List<ResponseProperty>,
)

/** Extract response schema from the RAW (non-deref'd) operation, preserving $ref names. */
fun extractResponseSchema(rawOperation: JsonObject, rawSpec: JsonObject): ResponseSchema? {
	val responses = rawOperation["responses"] as? JsonObject ?: return null
	val rawSuccess = responses["200"] ?: responses["201"] ?: return null
	val success = derefShallow(rawSuccess, rawSpec) as? JsonObject ?: return null
	val content = success["content"] as? JsonObject ?: return null
	val jsonContent = content["application/json"] as? JsonObject ?: return null
	val rawSchema = jsonContent["schema"] ?: return null
	val schema = derefShallow(rawSchema, rawSpec) as? JsonObject ?: return null

	val props = schema["properties"] as? JsonObject ?: return null
	if (props.isEmpty()) return null

	val requiredSet = (schema["required"] as? JsonArray)
		?.mapNotNull { (it as? JsonPrimitive)?.contentOrNull }
		?.toSet() ?: emptySet()

	val result = mutableListOf<ResponseProperty>()
	for ((name, propValue) in props) {
		result.add(extractResponseProperty(name, propValue, name in requiredSet, rawSpec))
	}

	return ResponseSchema(result)
}

private fun extractResponseProperty(
	name: String,
	propValue: JsonElement,
	required: Boolean,
	rawSpec: JsonObject,
): ResponseProperty {
	if (propValue !is JsonObject) {
		return ResponseProperty(name, "unknown", null, false, required, emptyList())
	}

	// Direct $ref to component schema
	val ref = (propValue["\$ref"] as? JsonPrimitive)?.contentOrNull
	if (ref != null && ref.startsWith("#/components/schemas/")) {
		val schemaName = ref.removePrefix("#/components/schemas/")
		return ResponseProperty(name, schemaName, schemaName, false, required, emptyList())
	}

	val typeEl = propValue["type"]
	val type = (typeEl as? JsonPrimitive)?.contentOrNull

	// Array with items referencing component schema
	if (type == "array") {
		val items = propValue["items"] as? JsonObject
		val itemRef = (items?.get("\$ref") as? JsonPrimitive)?.contentOrNull
		if (itemRef != null && itemRef.startsWith("#/components/schemas/")) {
			val schemaName = itemRef.removePrefix("#/components/schemas/")
			return ResponseProperty(name, schemaName, schemaName, true, required, emptyList())
		}
		// Array of inline objects or primitives
		val resolvedItems = if (items != null) derefShallow(items, rawSpec) else null
		val itemType = schemaToTypeString(resolvedItems, rawSpec)
		val kotlinItemType = tsTypeToKotlin(itemType)
		return ResponseProperty(name, kotlinItemType, null, true, required, emptyList())
	}

	// Inline object with properties
	if (type == "object" || propValue.containsKey("properties")) {
		val inlineProps = propValue["properties"] as? JsonObject
		if (inlineProps != null && inlineProps.isNotEmpty()) {
			val inlineRequiredSet = (propValue["required"] as? JsonArray)
				?.mapNotNull { (it as? JsonPrimitive)?.contentOrNull }
				?.toSet() ?: emptySet()
			val children = inlineProps.map { (childName, childValue) ->
				extractResponseProperty(childName, childValue, childName in inlineRequiredSet, rawSpec)
			}
			return ResponseProperty(name, "inline", null, false, required, children)
		}
		return ResponseProperty(name, "JsonObject", null, false, required, emptyList())
	}

	// Multi-type array: type: ['string', 'integer'] → JsonElement
	if (typeEl is JsonArray) {
		return ResponseProperty(name, "JsonElement", null, false, required, emptyList())
	}

	// Primitive types
	val kotlinType = when (type) {
		"string" -> "String"
		"integer" -> "Long"
		"number" -> "Double"
		"boolean" -> "Boolean"
		else -> "JsonElement"
	}
	return ResponseProperty(name, kotlinType, null, false, required, emptyList())
}

// ─── Discriminated Union Detection ────────────────────────────────────────────

/**
 * Detect if a oneOf array represents a discriminated union.
 * Returns null if not a discriminated union.
 */
fun detectDiscriminatedUnion(oneOfArray: JsonArray, spec: JsonObject): DiscriminatedUnion? {
	if (oneOfArray.size < 2) return null

	// Find candidate discriminator: a property that in every variant has a single-value enum
	var discriminatorProp: String? = null
	var discriminatorType: String? = null

	for ((i, element) in oneOfArray.withIndex()) {
		val variant = element as? JsonObject ?: return null
		val props = variant["properties"] as? JsonObject ?: return null

		if (i == 0) {
			// Find the first property with a single-value enum
			for ((propName, propValue) in props) {
				val propObj = propValue as? JsonObject ?: continue
				val enumArr = propObj["enum"] as? JsonArray ?: continue
				if (enumArr.size == 1) {
					discriminatorProp = propName
					discriminatorType = (propObj["type"] as? JsonPrimitive)?.contentOrNull ?: "string"
					break
				}
			}
			if (discriminatorProp == null) return null
		} else {
			// Verify the candidate exists in this variant with a single-value enum
			val propObj = props[discriminatorProp] as? JsonObject ?: return null
			val enumArr = propObj["enum"] as? JsonArray ?: return null
			if (enumArr.size != 1) return null
		}
	}

	val discProp = discriminatorProp ?: return null
	val discType = discriminatorType ?: "string"

	// Build variants
	val variants = oneOfArray.map { element ->
		val variant = element as JsonObject
		val props = variant["properties"] as JsonObject
		val title = (variant["title"] as? JsonPrimitive)?.contentOrNull

		val discPropSchema = props[discProp] as JsonObject
		val discValue = (discPropSchema["enum"] as JsonArray)[0].jsonPrimitive.content

		// Collect required fields for this variant
		val requiredSet = (variant["required"] as? JsonArray)
			?.mapNotNull { (it as? JsonPrimitive)?.contentOrNull }
			?.toSet() ?: emptySet()

		// Collect properties excluding the discriminator
		val variantProps = props.filterKeys { it != discProp }.map { (name, propSchema) ->
			val propObj = propSchema as? JsonObject
			val format = (propObj?.get("format") as? JsonPrimitive)?.contentOrNull
			val type = if (format == "binary") "Blob" else schemaToTypeString(propSchema, spec)
			BodyProperty(
				name = name,
				type = type,
				required = name in requiredSet,
				enumValues = extractEnumValues(propObj),
				defaultValue = extractDefaultValue(propSchema),
			)
		}

		OneOfVariant(
			discriminatorValue = discValue,
			title = title,
			properties = variantProps,
		)
	}

	return DiscriminatedUnion(
		discriminatorProperty = discProp,
		discriminatorType = discType,
		variants = variants,
	)
}

// ─── Enum Value Extraction ────────────────────────────────────────────────────

/** Extract enum values from a parameter/property schema, if present. */
fun extractEnumValues(schema: JsonObject?): List<String>? {
	if (schema == null) return null
	val enumArr = schema["enum"] as? JsonArray ?: return null
	if (enumArr.isEmpty()) return null
	return enumArr.mapNotNull { el ->
		(el as? JsonPrimitive)?.content
	}.ifEmpty { null }
}

// ─── Default Value Extraction ─────────────────────────────────────────────────

/** Extract the "default" value from a schema element as a string, or null if absent. */
fun extractDefaultValue(schema: JsonElement?): String? {
	val obj = schema as? JsonObject ?: return null
	val defaultNode = obj["default"] ?: return null
	val prim = defaultNode as? JsonPrimitive ?: return null
	return prim.content
}

// ─── Method Definition ───────────────────────────────────────────────────────

data class MethodDefinition(
	val operationId: String,
	val methodName: String,
	val httpMethod: String,
	val path: String,
	val params: OperationParameters,
	val bodyProperties: List<BodyProperty>,
	val hasBody: Boolean,
	val bodyRequired: Boolean,
	val responseType: String,
	val responseSchema: ResponseSchema? = null,
	val rawResponseSchema: JsonObject? = null,
	val bodyIsArray: Boolean = false,
	val bodyArrayItemType: String? = null,
	val bodyEncoding: String = "form",
	val discriminatedUnion: DiscriminatedUnion? = null,
	val responseIsHtml: Boolean = false,
)

fun extractMethodDefinition(
	operationId: String,
	methodName: String,
	httpMethod: String,
	path: String,
	operation: JsonObject,
	rawSpec: JsonObject = JsonObject(emptyMap()),
): MethodDefinition {
	val spec = JsonObject(emptyMap())
	val params = extractParameters(operation, spec)
	val body = extractBody(operation, spec)
	val responseType = extractResponseType(operation, spec)

	// Extract typed response schema from raw spec (preserving $refs)
	val rawPaths = rawSpec["paths"] as? JsonObject
	val rawPathItem = rawPaths?.get(path) as? JsonObject
	val rawOperation = rawPathItem?.get(httpMethod.lowercase()) as? JsonObject
	val responseSchema = if (rawOperation != null) extractResponseSchema(rawOperation, rawSpec) else null

	// Extract raw response schema JsonObject for nested type generation
	val rawResponseSchema: JsonObject? = if (rawOperation != null) {
		val rawResponses = rawOperation["responses"] as? JsonObject
		val rawSuccess = rawResponses?.get("200") ?: rawResponses?.get("201")
		val success = if (rawSuccess != null) derefShallow(rawSuccess, rawSpec) as? JsonObject else null
		val content = success?.get("content") as? JsonObject
		val jsonContent = content?.get("application/json") as? JsonObject
		val rawSchema = jsonContent?.get("schema")
		if (rawSchema != null) derefShallow(rawSchema, rawSpec) as? JsonObject else null
	} else null

	val isGet = httpMethod.uppercase() == "GET"

	// GET requests can't have body — treat body properties as query params
	val effectiveQueryParams = if (isGet) {
		params.queryParams + body.properties.map {
			ParsedParameter(name = it.name, type = it.type, required = false, enumValues = it.enumValues, defaultValue = it.defaultValue)
		}
	} else {
		params.queryParams
	}

	// Detect text/html response
	val responseIsHtml = run {
		val responses = operation["responses"] as? JsonObject
		val success = responses?.get("200") ?: responses?.get("201")
		val successObj = if (success != null) derefShallow(success, spec) as? JsonObject else null
		val content = successObj?.get("content") as? JsonObject
		content?.containsKey("text/html") == true
	}

	val rawRequestBody = operation["requestBody"]
	val bodyRequired = if (isGet) false else {
		if (rawRequestBody != null) {
			val rb = derefShallow(rawRequestBody, spec) as? JsonObject
			(rb?.get("required") as? JsonPrimitive)?.booleanOrNull ?: false
		} else false
	}

	return MethodDefinition(
		operationId = operationId,
		methodName = methodName,
		httpMethod = httpMethod.uppercase(),
		path = path,
		params = OperationParameters(
			pathParams = params.pathParams,
			queryParams = effectiveQueryParams,
		),
		bodyProperties = if (isGet) emptyList() else body.properties,
		hasBody = if (isGet) false else rawRequestBody != null,
		bodyRequired = bodyRequired,
		responseType = responseType,
		responseSchema = responseSchema,
		rawResponseSchema = rawResponseSchema,
		bodyIsArray = if (isGet) false else body.bodyIsArray,
		bodyArrayItemType = if (isGet) null else body.bodyArrayItemType,
		bodyEncoding = if (isGet) "form" else body.bodyEncoding,
		discriminatedUnion = if (isGet) null else body.discriminatedUnion,
		responseIsHtml = responseIsHtml,
	)
}
