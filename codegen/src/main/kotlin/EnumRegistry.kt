/** Collect, deduplicate, and name enum types from parsed operations. */

/**
 * A single enum definition ready for code generation.
 * [valueType] is "String" or "Long" depending on whether all values are integers.
 */
data class EnumDefinition(
	val typeName: String,
	val values: List<String>,
	val valueType: String,
)

/**
 * Registry that collects all enum usages, deduplicates by (paramName, values),
 * and resolves naming conflicts when the same param name maps to different value sets.
 *
 * Call [register] for every param/body property that has enum values,
 * then call [build] to produce final [EnumDefinition]s and a lookup map.
 */
class EnumRegistry {
	/** (paramName, sortedValues) → list of operation groups that use it */
	private data class EnumKey(val paramName: String, val values: List<String>)
	private data class EnumUsage(val key: EnumKey, val groups: MutableSet<String>)

	private val usages = linkedMapOf<EnumKey, EnumUsage>()

	/** Register a param/property enum. [group] is the operation group (e.g. "Threads"). */
	fun register(paramName: String, enumValues: List<String>, group: String) {
		val key = EnumKey(paramName, enumValues.map { it })
		val usage = usages.getOrPut(key) { EnumUsage(key, mutableSetOf()) }
		usage.groups.add(group)
	}

	data class BuildResult(
		/** All enum definitions to emit. */
		val definitions: List<EnumDefinition>,
		/** Lookup: (paramName, sortedValues) → enum type name. */
		val lookup: Map<Pair<String, List<String>>, String>,
	)

	fun build(): BuildResult {
		// Group by param name to detect conflicts
		val byName = usages.values.groupBy { it.key.paramName }

		val definitions = mutableListOf<EnumDefinition>()
		val lookup = mutableMapOf<Pair<String, List<String>>, String>()

		for ((paramName, variants) in byName) {
			if (variants.size == 1) {
				// No conflict — use simple PascalCase name from param
				val usage = variants.single()
				val typeName = paramNameToEnumType(paramName)
				val valueType = inferValueType(usage.key.values)
				definitions.add(EnumDefinition(typeName, usage.key.values, valueType))
				lookup[Pair(paramName, usage.key.values)] = typeName
			} else {
				// Conflict — prefix with group name, then disambiguate further if needed
				val candidateNames = mutableMapOf<String, MutableList<EnumUsage>>()
				for (usage in variants) {
					val prefix = usage.groups.sorted().first()
					val candidate = snakeToPascal(prefix) + paramNameToEnumType(paramName)
					candidateNames.getOrPut(candidate) { mutableListOf() }.add(usage)
				}

				for ((candidate, usagesForName) in candidateNames) {
					if (usagesForName.size == 1) {
						val usage = usagesForName.single()
						val valueType = inferValueType(usage.key.values)
						definitions.add(EnumDefinition(candidate, usage.key.values, valueType))
						lookup[Pair(paramName, usage.key.values)] = candidate
					} else {
						// Same group prefix → append numeric suffix
						for ((idx, usage) in usagesForName.sortedBy { it.key.values.size }.withIndex()) {
							val typeName = "${candidate}${idx + 1}"
							val valueType = inferValueType(usage.key.values)
							definitions.add(EnumDefinition(typeName, usage.key.values, valueType))
							lookup[Pair(paramName, usage.key.values)] = typeName
						}
					}
				}
			}
		}

		return BuildResult(definitions.sortedBy { it.typeName }, lookup)
	}
}

/** Convert a param name like "order_by" or "not_email_provider[]" to PascalCase enum type. */
private fun paramNameToEnumType(paramName: String): String {
	val clean = paramName.removeSuffix("[]")
	val pascal = snakeToPascal(clean)
	// Ensure it doesn't start with a digit
	return if (pascal.isNotEmpty() && pascal.first().isDigit()) "V$pascal" else pascal
}

/** Check if all enum values are valid integers → Long, otherwise String. */
private fun inferValueType(values: List<String>): String =
	if (values.all { it.toLongOrNull() != null }) "Long" else "String"

/** Generate the Kotlin variant name for an enum value. */
fun enumVariantName(value: String, valueType: String): String {
	if (valueType == "Long") {
		val num = value.toLongOrNull()
		if (num != null) {
			return if (num < 0) "Neg${-num}" else "V$num"
		}
	}
	// String variant: UPPER_SNAKE_CASE
	val clean = value
		.replace(Regex("[^a-zA-Z0-9_]"), "_")
		.replace(Regex("_+"), "_")
		.trim('_')

	if (clean.isEmpty()) return "EMPTY"

	// Convert camelCase/PascalCase to UPPER_SNAKE
	val upper = clean
		.replace(Regex("([a-z0-9])([A-Z])"), "$1_$2")
		.uppercase()

	// If starts with a digit, prefix with V
	return if (upper.first().isDigit()) "V$upper" else upper
}
