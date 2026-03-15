/** CLI entry point: generate Kotlin clients from OpenAPI schemas. */

import kotlinx.serialization.json.Json
import kotlinx.serialization.json.jsonObject
import java.io.File

data class ApiConfig(
	val schemaPath: String,
	val outputDir: String,
	val clientName: String,
	val defaultBaseUrl: String,
	val defaultRateLimit: Int,
	val subPackage: String,
	val defaultSearchRateLimit: Int? = null,
	val searchGroups: Set<String> = emptySet(),
)

fun main() {
	val root = File(System.getProperty("user.dir"))

	val apis = listOf(
		ApiConfig(
			schemaPath = File(root, "schemas/forum.json").absolutePath,
			outputDir = File(root, "src/main/kotlin/com/lolzteam/api/generated/forum").absolutePath,
			clientName = "ForumClient",
			defaultBaseUrl = "https://prod-api.lolz.live",
			defaultRateLimit = 300,
			subPackage = "forum",
		),
		ApiConfig(
			schemaPath = File(root, "schemas/market.json").absolutePath,
			outputDir = File(root, "src/main/kotlin/com/lolzteam/api/generated/market").absolutePath,
			clientName = "MarketClient",
			defaultBaseUrl = "https://prod-api.lzt.market",
			defaultRateLimit = 120,
			subPackage = "market",
			defaultSearchRateLimit = 20,
			searchGroups = setOf("category"),
		),
	)

	val json = Json { ignoreUnknownKeys = true }

	for (config in apis) {
		println("Generating ${config.clientName}...")

		val rawText = File(config.schemaPath).readText()
		val rawSpec = json.parseToJsonElement(rawText).jsonObject
		val result = parseSpec(rawSpec)

		val outDir = File(config.outputDir)
		outDir.mkdirs()

		// Clean up old per-tag *Api.kt files
		outDir.listFiles()
			?.filter { it.name.endsWith("Api.kt") }
			?.forEach { file ->
				file.delete()
				println("  Deleted old ${file.name}")
			}

		// Write Types.kt
		val typesContent = emitKotlinTypesFile(result.groups, config.subPackage)
		File(outDir, "Types.kt").writeText(typesContent)
		println("  Types.kt")

		// Write client file (includes all group classes)
		val clientContent = emitKotlinClientFile(
			groups = result.groups,
			clientName = config.clientName,
			defaultBaseUrl = config.defaultBaseUrl,
			defaultRateLimit = config.defaultRateLimit,
			subPackage = config.subPackage,
			defaultSearchRateLimit = config.defaultSearchRateLimit,
			searchGroups = config.searchGroups,
		)
		File(outDir, "${config.clientName}.kt").writeText(clientContent)
		println("  ${config.clientName}.kt")

		val totalOps = result.groups.sumOf { it.methods.size }
		println("  Done: ${result.groups.size} groups, $totalOps operations\n")
	}
}
