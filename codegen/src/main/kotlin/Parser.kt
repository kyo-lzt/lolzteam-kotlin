/** Parse an OpenAPI spec into grouped operation definitions. */

import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.contentOrNull
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive

data class ParsedGroup(
	val groupName: String,
	val methods: List<MethodDefinition>,
)

data class ParseResult(
	val groups: List<ParsedGroup>,
	val baseUrl: String,
	val componentSchemas: Map<String, JsonObject>,
	val rawSpec: JsonObject,
)

private val HTTP_METHODS = listOf("get", "post", "put", "delete", "patch")

fun parseSpec(rawSpec: JsonObject): ParseResult {
	// Extract component schemas before dereferencing
	val componentsObj = rawSpec["components"] as? JsonObject
	val schemasObj = componentsObj?.get("schemas") as? JsonObject
	val componentSchemas = linkedMapOf<String, JsonObject>()
	if (schemasObj != null) {
		for ((name, schema) in schemasObj) {
			val schemaObj = schema as? JsonObject ?: continue
			// Deref the schema itself so its properties are resolved
			val resolved = derefDeep(schemaObj, rawSpec) as? JsonObject ?: continue
			componentSchemas[name] = resolved
		}
	}

	// Resolve all $refs first
	val spec = derefDeep(rawSpec, rawSpec) as JsonObject

	val paths = spec["paths"] as? JsonObject
		?: return ParseResult(emptyList(), "https://localhost", componentSchemas, rawSpec)
	val groupMap = linkedMapOf<String, MutableList<MethodDefinition>>()

	for ((path, pathItem) in paths) {
		val pathObj = pathItem as? JsonObject ?: continue
		for (method in HTTP_METHODS) {
			val operation = pathObj[method] as? JsonObject ?: continue
			val operationId = (operation["operationId"] as? JsonPrimitive)?.contentOrNull ?: continue

			val group = operationIdToGroup(operationId)
			val methodName = operationIdToMethod(operationId)

			val methodDef = extractMethodDefinition(
				operationId = operationId,
				methodName = methodName,
				httpMethod = method,
				path = path,
				operation = operation,
				rawSpec = rawSpec,
			)

			groupMap.getOrPut(group) { mutableListOf() }.add(methodDef)
		}
	}

	val groups = groupMap.map { (groupName, methods) -> ParsedGroup(groupName, methods) }

	val servers = spec["servers"] as? JsonArray
	val firstServer = (servers?.firstOrNull() as? JsonObject)
	val baseUrl = (firstServer?.get("url") as? JsonPrimitive)?.contentOrNull ?: "https://localhost"

	return ParseResult(groups, baseUrl, componentSchemas, rawSpec)
}
