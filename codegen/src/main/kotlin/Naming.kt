/** Naming utilities for converting OpenAPI identifiers to Kotlin names. */

/** Extract method name from operationId: everything after the first dot, camelCased. */
fun operationIdToMethod(operationId: String): String {
	val parts = operationId.split(".")
	if (parts.size < 2) return lowercaseFirst(operationId)
	return parts.drop(1).mapIndexed { i, part ->
		if (i == 0) {
			if (isAllUppercase(part)) part.lowercase() else lowercaseFirst(part)
		} else {
			capitalizeFirst(if (isAllUppercase(part)) part.lowercase() else part)
		}
	}.joinToString("")
}

/** Extract group name from operationId: first segment, lowercased first char. */
fun operationIdToGroup(operationId: String): String {
	val first = operationId.split(".").firstOrNull() ?: operationId
	val group = lowercaseFirst(first)
	// Normalize known typos in group names
	if (group == "manging") return "managing"
	return group
}

/** Convert PascalCase tag to kebab-case file name. */
fun groupToFileName(tag: String): String =
	tag.replace(Regex("([a-z0-9])([A-Z])"), "$1-$2")
		.replace(Regex("([A-Z])([A-Z][a-z])"), "$1-$2")
		.lowercase()

/** Convert tag to camelCase property name. */
fun groupToPropertyName(tag: String): String = lowercaseFirst(tag)

/** Convert tag to class name: PascalCase + "Api". */
fun groupToClassName(tag: String): String = "${capitalizeFirst(tag)}Api"

/** Build a type name prefix from group + method. */
fun buildTypeName(group: String, method: String): String =
	capitalizeFirst(group) + capitalizeFirst(method)

fun snakeToCamel(name: String): String =
	name.replace(Regex("[_.\\-]([a-zA-Z])")) { it.groupValues[1].uppercase() }

fun snakeToPascal(name: String): String {
	// Split on underscores, hyphens, and dots, then capitalize each segment
	return name.split(Regex("[_\\-.]+"))
		.filter { it.isNotEmpty() }
		.joinToString("") { it[0].uppercaseChar() + it.substring(1) }
}

private fun lowercaseFirst(s: String): String =
	if (s.isEmpty()) s else s[0].lowercaseChar() + s.substring(1)

private fun capitalizeFirst(s: String): String =
	if (s.isEmpty()) s else s[0].uppercaseChar() + s.substring(1)

private fun isAllUppercase(s: String): Boolean =
	s.length > 1 && s == s.uppercase()

private val KOTLIN_KEYWORDS = setOf(
	"class", "fun", "val", "var", "object", "interface", "package",
	"return", "when", "is", "in", "as", "by", "do",
)

/** Strip trailing [] and replace non-identifier characters from parameter names. */
fun sanitizeName(name: String): String =
	name.removeSuffix("[]").replace(Regex("[^a-zA-Z0-9_]"), "_")

/** Convert a parameter name to a safe Kotlin identifier with backtick escaping. */
fun safeKotlinName(name: String): String {
	val camel = snakeToCamel(sanitizeName(name))
	return if (camel in KOTLIN_KEYWORDS || camel.first().isDigit()) "`$camel`" else camel
}

/** Whether a parameter name needs @SerialName annotation. */
fun needsSerialName(name: String): Boolean {
	val sanitized = sanitizeName(name)
	val camel = snakeToCamel(sanitized)
	return name != camel || name != sanitized || camel.first().isDigit() || '-' in name
}
