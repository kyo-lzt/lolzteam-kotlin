/**
 * CLI entry point: generate Kotlin clients from OpenAPI schemas.
 */

import { mkdirSync, readFileSync, writeFileSync } from "node:fs";
import { join } from "node:path";
import { emitKotlinGroupFile, emitKotlinClientFile, emitKotlinTypesFile } from "./emitter-kotlin.js";
import { parseSpec } from "./parser.js";
import { groupToFileName } from "./utils/naming.js";

interface ApiConfig {
	schemaPath: string;
	outputDir: string;
	clientName: string;
	defaultBaseUrl: string;
	defaultRateLimit: number;
	subPackage: string;
}

const ROOT = join(import.meta.dir, "../..");

const apis: ApiConfig[] = [
	{
		schemaPath: join(ROOT, "schemas/forum.json"),
		outputDir: join(ROOT, "src/main/kotlin/com/lolzteam/api/generated/forum"),
		clientName: "ForumClient",
		defaultBaseUrl: "https://prod-api.lolz.live",
		defaultRateLimit: 300,
		subPackage: "forum",
	},
	{
		schemaPath: join(ROOT, "schemas/market.json"),
		outputDir: join(ROOT, "src/main/kotlin/com/lolzteam/api/generated/market"),
		clientName: "MarketClient",
		defaultBaseUrl: "https://prod-api.lzt.market",
		defaultRateLimit: 120,
		subPackage: "market",
	},
];

function generateApi(config: ApiConfig): void {
	console.log(`Generating ${config.clientName}...`);

	let rawSpec: Record<string, unknown>;
	try {
		rawSpec = JSON.parse(readFileSync(config.schemaPath, "utf-8")) as Record<string, unknown>;
	} catch (error) {
		const message = error instanceof Error ? error.message : String(error);
		throw new Error(`Failed to parse schema ${config.schemaPath}: ${message}`);
	}
	const result = parseSpec(rawSpec);

	mkdirSync(config.outputDir, { recursive: true });

	// Write Types.kt
	const typesContent = emitKotlinTypesFile(result.groups, result.componentSchemas, config.subPackage);
	writeFileSync(join(config.outputDir, "Types.kt"), typesContent);
	console.log("  Types.kt");

	// Write group files
	for (const group of result.groups) {
		const fileName = groupToFileName(group.groupName);
		// Convert kebab-case to PascalCase for Kotlin file name
		const kotlinFileName = fileName
			.split("-")
			.map((part) => part.charAt(0).toUpperCase() + part.slice(1))
			.join("");
		const content = emitKotlinGroupFile(group, config.subPackage);
		writeFileSync(join(config.outputDir, `${kotlinFileName}Api.kt`), content);
		console.log(`  ${kotlinFileName}Api.kt`);
	}

	// Write client file
	const clientContent = emitKotlinClientFile(
		result.groups,
		config.clientName,
		config.defaultBaseUrl,
		config.defaultRateLimit,
		config.subPackage,
	);
	writeFileSync(join(config.outputDir, `${config.clientName}.kt`), clientContent);
	console.log(`  ${config.clientName}.kt`);

	console.log(
		`  Done: ${result.groups.length} groups, ${result.groups.reduce((sum, g) => sum + g.methods.length, 0)} operations\n`,
	);
}

for (const api of apis) {
	generateApi(api);
}
