/** Emit Kotlin source files from parsed OpenAPI data. */

private const val PACKAGE = "com.lolzteam.api.generated"

// ─── Types File ───────────────────────────────────────────────────────────────

private fun emitQueryParamsClass(group: String, method: MethodDefinition): String? {
	if (method.params.queryParams.isEmpty()) return null

	val typeName = "${buildTypeName(group, method.methodName)}Params"
	val sb = StringBuilder()
	sb.appendLine("@Serializable")
	sb.appendLine("data class $typeName(")

	val props = method.params.queryParams.map { param ->
		val kotlinType = tsTypeToKotlin(param.type)
		val nullable = if (param.required) "" else "?"
		val fullType = "$kotlinType$nullable"
		val camelName = safeKotlinName(param.name)
		val serialName = if (needsSerialName(param.name)) "\t@SerialName(\"${param.name}\")\n" else ""
		val default = if (param.required) "" else " = null"
		"$serialName\tval $camelName: $fullType$default,"
	}

	sb.appendLine(props.joinToString("\n"))
	sb.append(")")
	return sb.toString()
}

private fun emitBodyClass(group: String, method: MethodDefinition): String? {
	if (!method.hasBody) return null

	val typeName = "${buildTypeName(group, method.methodName)}Body"

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

	val props = method.bodyProperties.map { prop ->
		val kotlinType = if (prop.type == "Blob") "ByteArray" else tsTypeToKotlin(prop.type)
		val nullable = if (prop.required) "" else "?"
		val fullType = "$kotlinType$nullable"
		val camelName = safeKotlinName(prop.name)
		val skipSerialName = hasByteArrayFields
		val serialName = if (!skipSerialName && needsSerialName(prop.name)) "\t@SerialName(\"${prop.name}\")\n" else ""
		val default = if (prop.required) "" else " = null"
		"$serialName\tval $camelName: $fullType$default,"
	}

	sb.appendLine(props.joinToString("\n"))
	sb.append(")")
	return sb.toString()
}

private fun emitResponseAlias(group: String, method: MethodDefinition): String {
	val typeName = "${buildTypeName(group, method.methodName)}Response"
	return "typealias $typeName = JsonElement"
}

fun emitKotlinTypesFile(groups: List<ParsedGroup>, subPackage: String): String {
	val sb = StringBuilder()
	val fullPackage = "$PACKAGE.$subPackage"

	sb.appendLine("// Auto-generated. Do not edit manually.")
	sb.appendLine()
	sb.appendLine("package $fullPackage")
	sb.appendLine()
	sb.appendLine("import kotlinx.serialization.SerialName")
	sb.appendLine("import kotlinx.serialization.Serializable")
	sb.appendLine("import kotlinx.serialization.json.JsonElement")
	sb.appendLine("import kotlinx.serialization.json.JsonObject")
	sb.appendLine()

	for (group in groups) {
		val groupTypes = mutableListOf<String>()

		for (method in group.methods) {
			val queryType = emitQueryParamsClass(group.groupName, method)
			if (queryType != null) groupTypes.add(queryType)

			val bodyType = emitBodyClass(group.groupName, method)
			if (bodyType != null) groupTypes.add(bodyType)

			groupTypes.add(emitResponseAlias(group.groupName, method))
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
		requestLines.add("${indent}return http.request(RequestOptions(")
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

		requestLines.add("$indent))")

		if (method.bodyRequired) {
			for (line in buildLines) sb.appendLine(line)
			for (line in requestLines) sb.appendLine(line)
		} else {
			sb.appendLine("\t\tif (body != null) {")
			for (line in buildLines) sb.appendLine(line)
			for (line in requestLines) sb.appendLine(line)
			sb.appendLine("\t\t} else {")
			sb.appendLine("\t\t\treturn http.request(RequestOptions(")
			sb.appendLine("\t\t\t\tmethod = \"${method.httpMethod}\",")
			sb.appendLine("\t\t\t\tpath = $pathExpr,")
			sb.appendLine("\t\t\t\tbodyEncoding = \"multipart\",")
			if (hasQueryType) {
				sb.appendLine("\t\t\t\tquery = params?.let { http.json.encodeToJsonElement(serializer(), it) },")
			}
			if (isSearch) {
				sb.appendLine("\t\t\t\tisSearch = true,")
			}
			sb.appendLine("\t\t\t))")
			sb.appendLine("\t\t}")
		}
	} else {
		sb.appendLine("\t\treturn http.request(RequestOptions(")
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

		sb.appendLine("\t\t))")
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
