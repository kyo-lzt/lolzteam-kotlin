/** Emit Kotlin source files from parsed OpenAPI data. */

import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.contentOrNull
import kotlinx.serialization.json.jsonPrimitive

private const val PACKAGE = "com.lolzteam.api.generated"

/** Format a schema default value as a Kotlin literal matching the target type. */
private fun formatKotlinDefault(value: String, kotlinType: String, enumValues: List<String>? = null): String {
	// If this is an enum type, resolve to the enum variant
	if (enumValues != null && kotlinType != "String" && kotlinType != "Long" && kotlinType != "Double" && kotlinType != "Boolean") {
		val valueType = if (enumValues.all { it.toLongOrNull() != null }) "Long" else "String"
		val variantName = enumVariantName(value, valueType)
		return "$kotlinType.$variantName"
	}
	return when (kotlinType) {
		"String" -> "\"$value\""
		"Long" -> "${value}L"
		"Double" -> if ('.' in value) value else "$value.0"
		"Boolean" -> value
		else -> "\"$value\""
	}
}

// ─── Types File ───────────────────────────────────────────────────────────────

/** Resolve the Kotlin type for a param/body property, using enum lookup if available. */
private fun resolveFieldType(
	baseType: String,
	paramName: String,
	enumValues: List<String>?,
	enumLookup: Map<Pair<String, List<String>>, String>,
): String {
	if (enumValues != null) {
		val enumTypeName = enumLookup[Pair(paramName, enumValues)]
		if (enumTypeName != null) return enumTypeName
	}
	return tsTypeToKotlin(baseType)
}

private fun emitQueryParamsClass(
	group: String,
	method: MethodDefinition,
	enumLookup: Map<Pair<String, List<String>>, String> = emptyMap(),
): String? {
	if (method.params.queryParams.isEmpty()) return null

	val typeName = "${buildTypeName(group, method.methodName)}Params"
	val sb = StringBuilder()
	sb.appendLine("@Serializable")
	sb.appendLine("data class $typeName(")

	// Sort: required-no-default first, then fields with defaults
	val sorted = method.params.queryParams.sortedBy { if (it.required && it.defaultValue == null) 0 else 1 }

	val props = sorted.map { param ->
		val kotlinType = resolveFieldType(param.type, param.name, param.enumValues, enumLookup)
		val hasDefault = param.defaultValue != null
		val needsNullable = !param.required && !hasDefault
		val fullType = if (needsNullable) "$kotlinType?" else kotlinType
		val camelName = safeKotlinName(param.name)
		val serialName = if (needsSerialName(param.name)) "\t@SerialName(\"${param.name}\")\n" else ""
		val doc = if (hasDefault) "\t/** Default: ${param.defaultValue} */\n" else ""
		val default = if (hasDefault) {
			" = ${formatKotlinDefault(param.defaultValue!!, kotlinType, param.enumValues)}"
		} else if (!param.required) {
			" = null"
		} else {
			""
		}
		"$doc$serialName\tval $camelName: $fullType$default,"
	}

	sb.appendLine(props.joinToString("\n"))
	sb.append(")")
	return sb.toString()
}

private fun emitBodyClass(
	group: String,
	method: MethodDefinition,
	enumLookup: Map<Pair<String, List<String>>, String> = emptyMap(),
): String? {
	if (!method.hasBody) return null

	val typeName = "${buildTypeName(group, method.methodName)}Body"

	// Discriminated union → sealed interface + data classes
	if (method.discriminatedUnion != null) {
		return emitDiscriminatedUnionBody(typeName, method, enumLookup)
	}

	// Array body → typealias
	if (method.bodyIsArray) {
		val itemType = tsTypeToKotlin(method.bodyArrayItemType ?: "unknown")
		return "typealias $typeName = List<$itemType>"
	}

	if (method.bodyProperties.isEmpty()) return null

	val hasByteArrayFields = method.bodyProperties.any { it.type == "Blob" }

	val sb = StringBuilder()

	if (hasByteArrayFields) {
		sb.appendLine("data class $typeName(")
	} else {
		sb.appendLine("@Serializable")
		sb.appendLine("data class $typeName(")
	}

	// Sort: required-no-default first, then fields with defaults
	val sortedProps = method.bodyProperties.sortedBy { if (it.required && it.defaultValue == null) 0 else 1 }

	val props = sortedProps.map { prop ->
		val kotlinType = if (prop.type == "Blob") {
			"ByteArray"
		} else {
			resolveFieldType(prop.type, prop.name, prop.enumValues, enumLookup)
		}
		val hasDefault = prop.defaultValue != null
		val needsNullable = !prop.required && !hasDefault
		val fullType = if (needsNullable) "$kotlinType?" else kotlinType
		val camelName = safeKotlinName(prop.name)
		val skipSerialName = hasByteArrayFields
		val serialName = if (!skipSerialName && needsSerialName(prop.name)) "\t@SerialName(\"${prop.name}\")\n" else ""
		val doc = if (hasDefault) "\t/** Default: ${prop.defaultValue} */\n" else ""
		val default = if (hasDefault) {
			" = ${formatKotlinDefault(prop.defaultValue!!, kotlinType, prop.enumValues)}"
		} else if (!prop.required) {
			" = null"
		} else {
			""
		}
		"$doc$serialName\tval $camelName: $fullType$default,"
	}

	sb.appendLine(props.joinToString("\n"))
	sb.append(")")
	return sb.toString()
}

private fun emitDiscriminatedUnionBody(
	typeName: String,
	method: MethodDefinition,
	enumLookup: Map<Pair<String, List<String>>, String>,
): String {
	val union = method.discriminatedUnion!!
	val sb = StringBuilder()

	// Build variant class names
	val variantNames = union.variants.map { variant ->
		typeName + discriminatorValueToSuffix(variant.discriminatorValue)
	}

	// Sealed interface
	sb.appendLine("@Serializable")
	sb.appendLine("@JsonClassDiscriminator(\"${union.discriminatorProperty}\")")
	sb.appendLine("sealed interface $typeName")

	// Emit each variant data class
	for ((i, variant) in union.variants.withIndex()) {
		val variantClassName = variantNames[i]

		sb.appendLine()
		sb.appendLine("@Serializable")
		sb.appendLine("@SerialName(\"${variant.discriminatorValue}\")")
		sb.appendLine("data class $variantClassName(")

		val props = variant.properties.map { prop ->
			val kotlinType = resolveFieldType(prop.type, prop.name, prop.enumValues, enumLookup)
			val hasDefault = prop.defaultValue != null
			val needsNullable = !prop.required && !hasDefault
			val fullType = if (needsNullable) "$kotlinType?" else kotlinType
			val camelName = safeKotlinName(prop.name)
			val serialName = if (needsSerialName(prop.name)) "\t@SerialName(\"${prop.name}\")\n" else ""
			val doc = if (hasDefault) "\t/** Default: ${prop.defaultValue} */\n" else ""
			val default = if (hasDefault) {
				" = ${formatKotlinDefault(prop.defaultValue!!, kotlinType, prop.enumValues)}"
			} else if (!prop.required) {
				" = null"
			} else {
				""
			}
			"$doc$serialName\tval $camelName: $fullType$default,"
		}

		sb.appendLine(props.joinToString("\n"))
		sb.append(") : $typeName")
	}

	return sb.toString()
}

/**
 * Convert a discriminator value to a PascalCase suffix for the variant class name.
 * e.g. "client_credentials" → "ClientCredentials", "1" → "V1"
 */
private fun discriminatorValueToSuffix(value: String): String {
	if (value.matches(Regex("-?\\d+"))) {
		return "V$value"
	}
	return snakeToPascal(value)
}

private fun emitResponseAlias(group: String, method: MethodDefinition): String {
	val typeName = "${buildTypeName(group, method.methodName)}Response"
	val targetType = if (method.responseIsHtml) "String" else "JsonElement"
	return "typealias $typeName = $targetType"
}

/** Convert a component schema name (e.g. "Resp_SystemInfo") to PascalCase. */
private fun componentNameToKotlin(name: String): String =
	name.split("_").joinToString("") { part ->
		if (part.isEmpty()) "" else part[0].uppercaseChar() + part.substring(1)
	}

/** Emit a @Serializable data class for a component schema. */
fun emitComponentSchemaClass(name: String, schema: JsonObject, rawSpec: JsonObject): String {
	val className = componentNameToKotlin(name)
	val props = schema["properties"] as? JsonObject
	if (props == null || props.isEmpty()) {
		return "typealias $className = JsonObject"
	}

	val requiredSet = (schema["required"] as? JsonArray)
		?.mapNotNull { (it as? JsonPrimitive)?.contentOrNull }
		?.toSet() ?: emptySet()

	val nestedClasses = mutableListOf<String>()
	val sb = StringBuilder()
	sb.appendLine("@Serializable")
	sb.appendLine("data class $className(")

	val fields = props.map { (propName, propValue) ->
		val required = propName in requiredSet
		val propObj = propValue as? JsonObject
		val kotlinType = resolvePropertyKotlinType(propObj, rawSpec, className, propName, nestedClasses)
		val nullable = if (required) "" else "?"
		val default = if (required) "" else " = null"
		val camelName = safeKotlinName(propName)
		val serialName = if (needsSerialName(propName)) "\t@SerialName(\"${propName}\")\n" else ""
		"$serialName\tval $camelName: $kotlinType$nullable$default,"
	}

	sb.appendLine(fields.joinToString("\n"))
	sb.append(")")

	// Append nested data classes after the parent
	for (nested in nestedClasses) {
		sb.appendLine()
		sb.appendLine()
		sb.append(nested)
	}

	return sb.toString()
}

/** Resolve a property schema to a Kotlin type, handling refs and primitives. */
private fun resolvePropertyKotlinType(
	propObj: JsonObject?,
	rawSpec: JsonObject,
	parentTypeName: String? = null,
	propName: String? = null,
	nestedClasses: MutableList<String>? = null,
): String {
	if (propObj == null) return "JsonElement"

	// Check for $ref
	val ref = (propObj["\$ref"] as? JsonPrimitive)?.contentOrNull
	if (ref != null && ref.startsWith("#/components/schemas/")) {
		return componentNameToKotlin(ref.removePrefix("#/components/schemas/"))
	}

	val typeEl = propObj["type"]

	// Multi-type
	if (typeEl is JsonArray) return "JsonElement"

	val type = (typeEl as? JsonPrimitive)?.contentOrNull

	if (type == "array") {
		val items = propObj["items"] as? JsonObject
		val itemRef = (items?.get("\$ref") as? JsonPrimitive)?.contentOrNull
		if (itemRef != null && itemRef.startsWith("#/components/schemas/")) {
			return "List<${componentNameToKotlin(itemRef.removePrefix("#/components/schemas/"))}>"
		}
		// Inline object inside array items
		val resolvedItems = if (items != null) derefShallow(items, rawSpec) as? JsonObject else null
		if (resolvedItems != null) {
			val itemProps = resolvedItems["properties"] as? JsonObject
			if (itemProps != null && itemProps.isNotEmpty()
				&& parentTypeName != null && propName != null && nestedClasses != null
			) {
				val nestedName = parentTypeName + snakeToPascal(sanitizeName(propName))
				emitNestedDataClass(nestedName, resolvedItems, rawSpec, nestedClasses)
				return "List<$nestedName>"
			}
		}
		val itemType = schemaToTypeString(resolvedItems, rawSpec)
		return "List<${tsTypeToKotlin(itemType)}>"
	}

	if (type == "object" || propObj.containsKey("properties")) {
		val innerProps = propObj["properties"] as? JsonObject
		if (innerProps == null || innerProps.isEmpty()) return "JsonObject"
		if (parentTypeName != null && propName != null && nestedClasses != null) {
			val nestedName = parentTypeName + snakeToPascal(sanitizeName(propName))
			emitNestedDataClass(nestedName, propObj, rawSpec, nestedClasses)
			return nestedName
		}
		return "JsonObject"
	}

	return when (type) {
		"string" -> "String"
		"integer" -> "Long"
		"number" -> "Double"
		"boolean" -> "Boolean"
		else -> "JsonElement"
	}
}

/** Generate a nested @Serializable data class and add it to the nestedClasses list. */
private fun emitNestedDataClass(
	className: String,
	schema: JsonObject,
	rawSpec: JsonObject,
	nestedClasses: MutableList<String>,
) {
	val props = schema["properties"] as? JsonObject ?: return
	if (props.isEmpty()) return

	val requiredSet = (schema["required"] as? JsonArray)
		?.mapNotNull { (it as? JsonPrimitive)?.contentOrNull }
		?.toSet() ?: emptySet()

	val sb = StringBuilder()
	sb.appendLine("@Serializable")
	sb.appendLine("data class $className(")

	val seenNames = mutableSetOf<String>()
	val fields = props.mapNotNull { (propName, propValue) ->
		val camelName = safeKotlinName(propName)
		if (!seenNames.add(camelName)) return@mapNotNull null
		val required = propName in requiredSet
		val propObj = propValue as? JsonObject
		val kotlinType = resolvePropertyKotlinType(propObj, rawSpec, className, propName, nestedClasses)
		val nullable = if (required) "" else "?"
		val default = if (required) "" else " = null"
		val serialName = if (needsSerialName(propName)) "\t@SerialName(\"${propName}\")\n" else ""
		"$serialName\tval $camelName: $kotlinType$nullable$default,"
	}

	sb.appendLine(fields.joinToString("\n"))
	sb.append(")")
	nestedClasses.add(sb.toString())
}

/** Emit a typed @Serializable data class for a response. */
private fun emitResponseClass(
	group: String,
	method: MethodDefinition,
	componentSchemaNames: Set<String>,
	rawSpec: JsonObject,
): String {
	val typeName = "${buildTypeName(group, method.methodName)}Response"

	if (method.responseIsHtml) return "typealias $typeName = String"

	val rawSchema = method.rawResponseSchema
	val schema = method.responseSchema ?: return "typealias $typeName = JsonElement"

	if (schema.properties.isEmpty()) return "typealias $typeName = JsonElement"

	// Build a lookup from property name to raw JsonObject for inline type resolution
	val rawProps = rawSchema?.get("properties") as? JsonObject

	val nestedClasses = mutableListOf<String>()
	val sb = StringBuilder()
	sb.appendLine("@Serializable")
	sb.appendLine("data class $typeName(")

	val fields = schema.properties.map { prop ->
		val kotlinType = responsePropertyToKotlinType(
			prop, typeName, componentSchemaNames, rawProps, rawSpec, nestedClasses,
		)
		val nullable = "?"
		val default = " = null"
		val camelName = safeKotlinName(prop.name)
		val serialName = if (needsSerialName(prop.name)) "\t@SerialName(\"${prop.name}\")\n" else ""
		"$serialName\tval $camelName: $kotlinType$nullable$default,"
	}

	sb.appendLine(fields.joinToString("\n"))
	sb.append(")")

	// Append nested data classes after the response class
	for (nested in nestedClasses) {
		sb.appendLine()
		sb.appendLine()
		sb.append(nested)
	}

	return sb.toString()
}

private fun responsePropertyToKotlinType(
	prop: ResponseProperty,
	parentTypeName: String,
	componentSchemaNames: Set<String>,
	rawProps: JsonObject? = null,
	rawSpec: JsonObject = JsonObject(emptyMap()),
	nestedClasses: MutableList<String>? = null,
): String {
	// Component schema ref
	if (prop.componentRef != null) {
		val kotlinName = componentNameToKotlin(prop.componentRef)
		return if (prop.isArray) "List<$kotlinName>" else kotlinName
	}

	// Array of non-ref type — try nested type generation for inline object items
	if (prop.isArray) {
		if (rawProps != null && nestedClasses != null) {
			val rawPropObj = rawProps[prop.name] as? JsonObject
			if (rawPropObj != null) {
				val resolved = resolvePropertyKotlinType(rawPropObj, rawSpec, parentTypeName, prop.name, nestedClasses)
				if (resolved != "List<${prop.type}>" && resolved != "JsonObject") {
					return resolved
				}
			}
		}
		return "List<${prop.type}>"
	}

	// Inline object with properties → generate nested data class
	if (prop.type == "inline") {
		if (rawProps != null && nestedClasses != null) {
			val rawPropObj = rawProps[prop.name] as? JsonObject
			if (rawPropObj != null) {
				return resolvePropertyKotlinType(rawPropObj, rawSpec, parentTypeName, prop.name, nestedClasses)
			}
		}
		return "JsonObject"
	}

	return prop.type
}

/** Emit a single enum class definition. */
private fun emitEnumClass(def: EnumDefinition): String {
	val sb = StringBuilder()
	sb.appendLine("@Serializable(with = ${def.typeName}Serializer::class)")
	sb.appendLine("enum class ${def.typeName}(val value: ${def.valueType}) {")

	val variants = def.values.mapIndexed { i, value ->
		val variantName = enumVariantName(value, def.valueType)
		val literal = if (def.valueType == "Long") value else "\"$value\""
		val suffix = if (i < def.values.size - 1) "," else ";"
		"\t$variantName($literal)$suffix"
	}
	sb.appendLine(variants.joinToString("\n"))

	sb.appendLine("}")
	return sb.toString()
}

/** Emit a KSerializer object for an enum class. */
private fun emitEnumSerializer(def: EnumDefinition): String {
	val sb = StringBuilder()
	val name = def.typeName
	val primitiveSerializer = if (def.valueType == "Long") {
		"PrimitiveKind.LONG"
	} else {
		"PrimitiveKind.STRING"
	}

	sb.appendLine("internal object ${name}Serializer : KSerializer<$name> {")
	sb.appendLine("\toverride val descriptor: SerialDescriptor =")
	sb.appendLine("\t\tPrimitiveSerialDescriptor(\"$name\", $primitiveSerializer)")
	sb.appendLine()

	if (def.valueType == "Long") {
		sb.appendLine("\toverride fun serialize(encoder: Encoder, value: $name) {")
		sb.appendLine("\t\tencoder.encodeLong(value.value)")
		sb.appendLine("\t}")
		sb.appendLine()
		sb.appendLine("\toverride fun deserialize(decoder: Decoder): $name {")
		sb.appendLine("\t\tval v = decoder.decodeLong()")
		sb.appendLine("\t\treturn $name.entries.first { it.value == v }")
		sb.appendLine("\t}")
	} else {
		sb.appendLine("\toverride fun serialize(encoder: Encoder, value: $name) {")
		sb.appendLine("\t\tencoder.encodeString(value.value)")
		sb.appendLine("\t}")
		sb.appendLine()
		sb.appendLine("\toverride fun deserialize(decoder: Decoder): $name {")
		sb.appendLine("\t\tval v = decoder.decodeString()")
		sb.appendLine("\t\treturn $name.entries.first { it.value == v }")
		sb.appendLine("\t}")
	}

	sb.appendLine("}")
	return sb.toString()
}

fun emitKotlinTypesFile(
	groups: List<ParsedGroup>,
	subPackage: String,
	componentSchemas: Map<String, JsonObject> = emptyMap(),
	rawSpec: JsonObject = JsonObject(emptyMap()),
	enumResult: EnumRegistry.BuildResult = EnumRegistry.BuildResult(emptyList(), emptyMap()),
): String {
	val sb = StringBuilder()
	val fullPackage = "$PACKAGE.$subPackage"

	sb.appendLine("// Auto-generated. Do not edit manually.")
	sb.appendLine()
	sb.appendLine("package $fullPackage")
	sb.appendLine()
	sb.appendLine("import kotlinx.serialization.KSerializer")
	sb.appendLine("import kotlinx.serialization.SerialName")
	sb.appendLine("import kotlinx.serialization.Serializable")
	sb.appendLine("import kotlinx.serialization.descriptors.PrimitiveKind")
	sb.appendLine("import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor")
	sb.appendLine("import kotlinx.serialization.descriptors.SerialDescriptor")
	sb.appendLine("import kotlinx.serialization.encoding.Decoder")
	sb.appendLine("import kotlinx.serialization.encoding.Encoder")
	sb.appendLine("import kotlinx.serialization.json.JsonClassDiscriminator")
	sb.appendLine("import kotlinx.serialization.json.JsonElement")
	sb.appendLine("import kotlinx.serialization.json.JsonObject")
	sb.appendLine("import com.lolzteam.api.runtime.StringOrInt")
	sb.appendLine()

	// Emit enum classes
	if (enumResult.definitions.isNotEmpty()) {
		sb.appendLine("// ─── Enums ───────────────────────────────────────────────────────")
		sb.appendLine()
		for (def in enumResult.definitions) {
			sb.appendLine(emitEnumClass(def))
			sb.appendLine()
			sb.appendLine(emitEnumSerializer(def))
			sb.appendLine()
		}
	}

	// Emit component schema classes
	if (componentSchemas.isNotEmpty()) {
		sb.appendLine("// ─── Component Schemas ────────────────────────────────────────")
		sb.appendLine()
		val schemaClasses = componentSchemas.mapNotNull { (name, schema) ->
			// Skip non-object schemas (e.g. UserIDModel which is a union type)
			val props = schema["properties"] as? JsonObject
			if (props == null || props.isEmpty()) return@mapNotNull null
			emitComponentSchemaClass(name, schema, rawSpec)
		}
		sb.appendLine(schemaClasses.joinToString("\n\n"))
		sb.appendLine()
	}

	val componentSchemaNames = componentSchemas.keys.toSet()
	val enumLookup = enumResult.lookup

	for (group in groups) {
		val groupTypes = mutableListOf<String>()

		for (method in group.methods) {
			val queryType = emitQueryParamsClass(group.groupName, method, enumLookup)
			if (queryType != null) groupTypes.add(queryType)

			val bodyType = emitBodyClass(group.groupName, method, enumLookup)
			if (bodyType != null) groupTypes.add(bodyType)

			groupTypes.add(emitResponseClass(group.groupName, method, componentSchemaNames, rawSpec))
		}

		if (groupTypes.isNotEmpty()) {
			val className = groupToClassName(group.groupName)
			sb.appendLine("// ─── ${className} Types ────────────────────────────────────────")
			sb.appendLine()
			sb.appendLine(groupTypes.joinToString("\n\n"))
			sb.appendLine()
		}
	}

	return sb.toString()
}

// ─── Group File ───────────────────────────────────────────────────────────────

private fun buildPathExpression(path: String): String {
	if (!path.contains("{")) return "\"$path\""
	val template = path.replace(Regex("\\{([^}]+)}")) { "\$${snakeToCamel(it.groupValues[1])}" }
	return "\"$template\""
}

private fun emitKotlinMethod(group: String, method: MethodDefinition, isSearch: Boolean = false): String {
	val sb = StringBuilder()
	val responseName = "${buildTypeName(group, method.methodName)}Response"

	// Build argument list
	val args = mutableListOf<String>()

	// Path params — use native Kotlin types instead of JsonElement
	for (param in method.params.pathParams) {
		val kotlinType = when (param.type) {
			"integer" -> "Int"
			"string" -> "String"
			"number" -> "Double"
			"boolean" -> "Boolean"
			else -> {
				// Union types containing string (e.g. "string | integer") → String
				// Path params are interpolated into URLs, so String is always safe
				val parts = param.type.split(" | ").map { it.trim() }
				if (parts.any { it == "string" }) "String"
				else tsTypeToKotlin(param.type)
			}
		}
		args.add("${snakeToCamel(param.name)}: $kotlinType")
	}

	// Body param
	val bodyTypeName = "${buildTypeName(group, method.methodName)}Body"
	val hasBodyType = method.hasBody && (method.bodyProperties.isNotEmpty() || method.bodyIsArray)
	if (hasBodyType) {
		if (method.bodyRequired) {
			args.add("body: $bodyTypeName")
		} else {
			args.add("body: $bodyTypeName? = null")
		}
	}

	// Query params
	val queryTypeName = "${buildTypeName(group, method.methodName)}Params"
	val hasQueryType = method.params.queryParams.isNotEmpty()
	if (hasQueryType) {
		args.add("params: $queryTypeName? = null")
	}

	val argStr = args.joinToString(", ")
	val pathExpr = buildPathExpression(method.path)

	val hasByteArrayFields = method.bodyProperties.any { it.type == "Blob" }
	val isMultipart = method.bodyEncoding == "multipart"
	val isJsonBody = method.bodyEncoding == "json"
	val isTypedResponse = method.responseSchema != null && !method.responseIsHtml

	// For HTML responses, use requestText(); for typed responses, wrap with deserialization
	val returnPrefix = if (method.responseIsHtml) {
		"return http.requestText("
	} else if (isTypedResponse) {
		"return http.json.decodeFromJsonElement(serializer(), http.request("
	} else {
		"return http.request("
	}
	val returnSuffix = if (method.responseIsHtml) ")" else if (isTypedResponse) "))" else ")"

	sb.appendLine("\tsuspend fun ${method.methodName}($argStr): $responseName {")

	if (isMultipart && hasByteArrayFields) {
		val serializableProps = method.bodyProperties.filter { it.type != "Blob" }
		val byteArrayFieldNames = method.bodyProperties.filter { it.type == "Blob" }.map { it.name }

		val bodyRef = "body"
		val indent = if (method.bodyRequired) "\t\t" else "\t\t\t"

		val buildLines = mutableListOf<String>()

		// Build JsonObject from non-ByteArray fields
		if (serializableProps.isNotEmpty()) {
			buildLines.add("${indent}val jsonBody = buildJsonObject {")
			for (prop in serializableProps) {
				val camelName = snakeToCamel(sanitizeName(prop.name))
				if (prop.required) {
					buildLines.add("$indent\tput(\"${prop.name}\", $bodyRef.$camelName)")
				} else {
					buildLines.add("$indent\t$bodyRef.$camelName?.let { put(\"${prop.name}\", it) }")
				}
			}
			buildLines.add("$indent}")
		}

		// Build byteArrayFields map
		buildLines.add("${indent}val byteFields = buildMap {")
		for (name in byteArrayFieldNames) {
			val camelName = snakeToCamel(sanitizeName(name))
			val prop = method.bodyProperties.find { it.name == name }
			if (prop?.required == true) {
				buildLines.add("$indent\tput(\"$name\", $bodyRef.$camelName)")
			} else {
				buildLines.add("$indent\t$bodyRef.$camelName?.let { put(\"$name\", it) }")
			}
		}
		buildLines.add("$indent}")

		val requestLines = mutableListOf<String>()
		requestLines.add("${indent}${returnPrefix}RequestOptions(")
		requestLines.add("$indent\tmethod = \"${method.httpMethod}\",")
		requestLines.add("$indent\tpath = $pathExpr,")
		if (serializableProps.isNotEmpty()) {
			requestLines.add("$indent\tbody = jsonBody,")
		}
		requestLines.add("$indent\tbodyEncoding = \"multipart\",")
		requestLines.add("$indent\tbyteArrayFields = byteFields,")

		if (hasQueryType) {
			requestLines.add("$indent\tquery = params?.let { http.json.encodeToJsonElement(serializer(), it) },")
		}

		if (isSearch) {
			requestLines.add("$indent\tisSearch = true,")
		}

		requestLines.add("$indent)$returnSuffix")

		if (method.bodyRequired) {
			for (line in buildLines) sb.appendLine(line)
			for (line in requestLines) sb.appendLine(line)
		} else {
			sb.appendLine("\t\tif (body != null) {")
			for (line in buildLines) sb.appendLine(line)
			for (line in requestLines) sb.appendLine(line)
			sb.appendLine("\t\t} else {")
			sb.appendLine("\t\t\t${returnPrefix}RequestOptions(")
			sb.appendLine("\t\t\t\tmethod = \"${method.httpMethod}\",")
			sb.appendLine("\t\t\t\tpath = $pathExpr,")
			sb.appendLine("\t\t\t\tbodyEncoding = \"multipart\",")
			if (hasQueryType) {
				sb.appendLine("\t\t\t\tquery = params?.let { http.json.encodeToJsonElement(serializer(), it) },")
			}
			if (isSearch) {
				sb.appendLine("\t\t\t\tisSearch = true,")
			}
			sb.appendLine("\t\t\t)$returnSuffix")
			sb.appendLine("\t\t}")
		}
	} else {
		sb.appendLine("\t\t${returnPrefix}RequestOptions(")
		sb.appendLine("\t\t\tmethod = \"${method.httpMethod}\",")
		sb.appendLine("\t\t\tpath = $pathExpr,")

		if (hasQueryType) {
			sb.appendLine("\t\t\tquery = params?.let { http.json.encodeToJsonElement(serializer(), it) },")
		}

		if (hasBodyType) {
			if (method.bodyRequired) {
				sb.appendLine("\t\t\tbody = http.json.encodeToJsonElement(serializer(), body),")
			} else {
				sb.appendLine("\t\t\tbody = body?.let { http.json.encodeToJsonElement(serializer(), it) },")
			}
			if (isMultipart) {
				sb.appendLine("\t\t\tbodyEncoding = \"multipart\",")
			} else if (isJsonBody) {
				sb.appendLine("\t\t\tbodyEncoding = \"json\",")
			}
		}

		if (isSearch) {
			sb.appendLine("\t\t\tisSearch = true,")
		}

		sb.appendLine("\t\t)$returnSuffix")
	}

	sb.append("\t}")
	return sb.toString()
}

private fun emitGroupClass(group: ParsedGroup, searchGroups: Set<String> = emptySet()): String {
	val className = groupToClassName(group.groupName)
	val isSearch = group.groupName in searchGroups
	val sb = StringBuilder()

	sb.appendLine("public class $className(private val http: LolzteamHttpClient) {")

	for (method in group.methods) {
		sb.appendLine()
		sb.appendLine(emitKotlinMethod(group.groupName, method, isSearch = isSearch))
	}

	sb.appendLine("}")

	return sb.toString()
}

// ─── Client File ──────────────────────────────────────────────────────────────

fun emitKotlinClientFile(
	groups: List<ParsedGroup>,
	clientName: String,
	defaultBaseUrl: String,
	defaultRateLimit: Int,
	subPackage: String,
	defaultSearchRateLimit: Int? = null,
	searchGroups: Set<String> = emptySet(),
	enumLookup: Map<Pair<String, List<String>>, String> = emptyMap(),
): String {
	val fullPackage = "$PACKAGE.$subPackage"
	val sb = StringBuilder()

	val needsMultipartBuilders = groups.any { g ->
		g.methods.any { m -> m.bodyEncoding == "multipart" && m.bodyProperties.any { it.type == "Blob" } }
	}

	sb.appendLine("// Auto-generated. Do not edit manually.")
	sb.appendLine()
	sb.appendLine("package $fullPackage")
	sb.appendLine()
	sb.appendLine("import com.lolzteam.api.runtime.ClientConfig")
	sb.appendLine("import com.lolzteam.api.runtime.LolzteamHttpClient")
	sb.appendLine("import com.lolzteam.api.runtime.RateLimitConfig")
	sb.appendLine("import com.lolzteam.api.runtime.RequestOptions")
	sb.appendLine("import kotlinx.serialization.json.JsonElement")
	sb.appendLine("import kotlinx.serialization.json.decodeFromJsonElement")
	if (needsMultipartBuilders) {
		sb.appendLine("import kotlinx.serialization.json.buildJsonObject")
		sb.appendLine("import kotlinx.serialization.json.put")
	}
	sb.appendLine("import kotlinx.serialization.serializer")
	sb.appendLine("import java.io.Closeable")
	sb.appendLine()

	// Group API classes
	for (group in groups) {
		sb.appendLine(emitGroupClass(group, searchGroups))
		sb.appendLine()
	}

	sb.appendLine("class $clientName(config: ClientConfig) : Closeable {")

	// Properties
	for (group in groups) {
		val propClassName = groupToClassName(group.groupName)
		val propName = groupToPropertyName(group.groupName)
		sb.appendLine("\tval $propName: $propClassName")
	}

	sb.appendLine()
	sb.appendLine("\tprivate val http: LolzteamHttpClient")
	sb.appendLine()

	// Constructor
	sb.appendLine("\tinit {")
	sb.appendLine("\t\thttp = LolzteamHttpClient(config.copy(")
	sb.appendLine("\t\t\tbaseUrl = config.baseUrl ?: \"$defaultBaseUrl\",")
	sb.appendLine("\t\t\trateLimit = config.rateLimit ?: RateLimitConfig(requestsPerMinute = $defaultRateLimit),")
	if (defaultSearchRateLimit != null) {
		sb.appendLine("\t\t\tsearchRateLimit = config.searchRateLimit ?: RateLimitConfig(requestsPerMinute = $defaultSearchRateLimit),")
	}
	sb.appendLine("\t\t))")

	for (group in groups) {
		val propClassName = groupToClassName(group.groupName)
		val propName = groupToPropertyName(group.groupName)
		sb.appendLine("\t\t$propName = $propClassName(http)")
	}

	sb.appendLine("\t}")
	sb.appendLine()

	sb.appendLine("\toverride fun close() {")
	sb.appendLine("\t\thttp.close()")
	sb.appendLine("\t}")

	sb.appendLine("}")
	sb.appendLine()

	return sb.toString()
}
