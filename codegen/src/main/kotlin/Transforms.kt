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
	// Union types
	if (" | " in tsType || " & " in tsType) {
		val parts = tsType.split(" | ").map { it.trim() }
		val nonNull = parts.filter { it != "null" }
		if (nonNull.size == 1 && "null" in parts) {
			return "${tsTypeToKotlin(nonNull[0])}?"
		}
		// All string literals → String
		if (nonNull.isNotEmpty() && nonNull.all { it.startsWith("\"") && it.endsWith("\"") }) {
			return "String"
		}
		return "JsonElement"
	}

	// Array<T>
	val arrayMatch = Regex("^Array<(.+)>$").find(tsType)
	if (arrayMatch != null) {
		return "List<${tsTypeToKotlin(arrayMatch.groupValues[1])}>"
	}

	// Inline objects
	if (tsType.startsWith("{") || "Record<" in tsType) {
		return "JsonObject"
	}

	return when (tsType) {
		"string" -> "String"
		"number" -> "Double"
		"integer" -> "Int"
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

		val parsed = ParsedParameter(
			name = name,
			type = type,
			required = if (inValue == "path") true else required,
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
)

data class BodyExtractionResult(
	val properties: List<BodyProperty>,
	val bodyIsArray: Boolean = false,
	val bodyArrayItemType: String? = null,
	val bodyEncoding: String = "form",
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
			))
		}
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
	val bodyIsArray: Boolean = false,
	val bodyArrayItemType: String? = null,
	val bodyEncoding: String = "form",
)

fun extractMethodDefinition(
	operationId: String,
	methodName: String,
	httpMethod: String,
	path: String,
	operation: JsonObject,
): MethodDefinition {
	val spec = JsonObject(emptyMap())
	val params = extractParameters(operation, spec)
	val body = extractBody(operation, spec)
	val responseType = extractResponseType(operation, spec)

	val isGet = httpMethod.uppercase() == "GET"

	// GET requests can't have body — treat body properties as query params
	val effectiveQueryParams = if (isGet) {
		params.queryParams + body.properties.map { ParsedParameter(name = it.name, type = it.type, required = false) }
	} else {
		params.queryParams
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
		bodyIsArray = if (isGet) false else body.bodyIsArray,
		bodyArrayItemType = if (isGet) null else body.bodyArrayItemType,
		bodyEncoding = if (isGet) "form" else body.bodyEncoding,
	)
}
