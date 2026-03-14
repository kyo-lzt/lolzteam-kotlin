/**
 * Emit Kotlin source files from parsed OpenAPI data.
 */

import type { ComponentSchemas, ParsedGroup } from "./parser.js";
import type { MethodDefinition } from "./transforms/operations.js";
import { schemaToTypeString } from "./transforms/types.js";
import {
	buildTypeName,
	groupToClassName,
	groupToFileName,
	groupToPropertyName,
} from "./utils/naming.js";

const PACKAGE = "com.lolzteam.api.generated";

// ─── Type Mapping ─────────────────────────────────────────────────────────────

function tsTypeToKotlin(tsType: string): string {
	// Handle union types (collapse to JsonElement)
	if (tsType.includes(" | ") || tsType.includes(" & ")) {
		// Check if it's just "X | null" pattern
		const parts = tsType.split(" | ").map((p) => p.trim());
		const nonNull = parts.filter((p) => p !== "null");
		if (nonNull.length === 1 && parts.includes("null")) {
			return `${tsTypeToKotlin(nonNull[0]!)}?`;
		}
		return "JsonElement";
	}

	// Handle Array<T>
	const arrayMatch = tsType.match(/^Array<(.+)>$/);
	if (arrayMatch) {
		return `List<${tsTypeToKotlin(arrayMatch[1]!)}>`;
	}

	// Handle inline objects (complex type strings with { })
	if (tsType.startsWith("{") || tsType.includes("Record<")) {
		return "JsonObject";
	}

	switch (tsType) {
		case "string":
			return "String";
		case "number":
			return "Double";
		case "integer":
			return "Int";
		case "boolean":
			return "Boolean";
		case "unknown":
			return "JsonElement";
		case "Blob":
			return "ByteArray";
		default:
			// Could be a literal type like "\"foo\"" or a number literal
			if (tsType.startsWith('"') || /^\d+$/.test(tsType)) {
				return "String";
			}
			return "JsonElement";
	}
}

/** Convert TS type to Kotlin for response context (always JsonElement for complex types). */
function tsTypeToKotlinResponse(tsType: string): string {
	// Responses are always JsonElement since http.request() returns JsonElement
	return "JsonElement";
}

function openApiTypeToKotlin(
	schema: Record<string, unknown> | undefined,
	spec: Record<string, unknown>,
): string {
	if (!schema) return "JsonElement";

	// Use TS type converter first, then map to Kotlin
	const tsType = schemaToTypeString(schema, spec);
	return tsTypeToKotlin(tsType);
}

// ─── Serializable Data Classes ────────────────────────────────────────────────

function snakeToCamel(name: string): string {
	return name.replace(/_([a-z])/g, (_, letter: string) => letter.toUpperCase());
}

function needsSerialName(name: string): boolean {
	const sanitized = sanitizeName(name);
	const camel = snakeToCamel(sanitized);
	// Need @SerialName if: has underscores, has [], starts with digit, or is keyword
	return name !== camel || name !== sanitized || /^\d/.test(camel);
}

function sanitizeName(name: string): string {
	// Strip trailing [] (e.g., "email_provider[]" → "email_provider")
	return name.replace(/\[\]$/, "");
}

function safeKotlinName(name: string): string {
	const keywords = new Set([
		"class", "fun", "val", "var", "object", "interface", "package",
		"return", "when", "is", "in", "as", "by", "do",
	]);
	const camel = snakeToCamel(sanitizeName(name));
	// Backtick-escape keywords or names starting with digits
	if (keywords.has(camel) || /^\d/.test(camel)) return `\`${camel}\``;
	return camel;
}

// ─── Types File ───────────────────────────────────────────────────────────────

interface KotlinTypeEntry {
	name: string;
	code: string;
}

function emitQueryParamsClass(group: string, method: MethodDefinition): KotlinTypeEntry | undefined {
	if (method.params.queryParams.length === 0) return undefined;

	const typeName = `${buildTypeName(group, method.methodName)}Params`;
	const lines: string[] = [];
	lines.push("@Serializable");
	lines.push(`data class ${typeName}(`);

	const props: string[] = [];
	for (const param of method.params.queryParams) {
		const kotlinType = tsTypeToKotlin(param.type);
		const nullable = param.required ? "" : "?";
		const fullType = `${kotlinType}${nullable}`;
		const camelName = safeKotlinName(param.name);
		const serialName = needsSerialName(param.name) ? `\t@SerialName("${param.name}")\n` : "";
		const default_ = param.required ? "" : " = null";
		props.push(`${serialName}\tval ${camelName}: ${fullType}${default_},`);
	}

	lines.push(props.join("\n"));
	lines.push(")");

	return { name: typeName, code: lines.join("\n") };
}

function emitBodyClass(group: string, method: MethodDefinition): KotlinTypeEntry | undefined {
	if (!method.hasBody) return undefined;

	const typeName = `${buildTypeName(group, method.methodName)}Body`;

	// Array body → typealias
	if (method.bodyIsArray) {
		const itemType = tsTypeToKotlin(method.bodyArrayItemType ?? "unknown");
		return {
			name: typeName,
			code: `typealias ${typeName} = List<${itemType}>`,
		};
	}

	if (method.bodyProperties.length === 0) return undefined;

	const lines: string[] = [];
	lines.push("@Serializable");
	lines.push(`data class ${typeName}(`);

	const props: string[] = [];
	for (const prop of method.bodyProperties) {
		const kotlinType = prop.type === "Blob" ? "ByteArray" : tsTypeToKotlin(prop.type);
		const nullable = prop.required ? "" : "?";
		const fullType = `${kotlinType}${nullable}`;
		const camelName = safeKotlinName(prop.name);
		const serialName = needsSerialName(prop.name) ? `\t@SerialName("${prop.name}")\n` : "";
		const default_ = prop.required ? "" : " = null";
		props.push(`${serialName}\tval ${camelName}: ${fullType}${default_},`);
	}

	lines.push(props.join("\n"));
	lines.push(")");

	return { name: typeName, code: lines.join("\n") };
}

function emitResponseAlias(group: string, method: MethodDefinition): KotlinTypeEntry {
	const typeName = `${buildTypeName(group, method.methodName)}Response`;
	return {
		name: typeName,
		code: `typealias ${typeName} = JsonElement`,
	};
}

export function emitKotlinTypesFile(
	groups: ParsedGroup[],
	_componentSchemas: ComponentSchemas,
	subPackage: string,
): string {
	const sections: string[] = [];
	const fullPackage = `${PACKAGE}.${subPackage}`;

	sections.push("// Auto-generated. Do not edit manually.");
	sections.push("");
	sections.push(`package ${fullPackage}`);
	sections.push("");
	sections.push("import kotlinx.serialization.SerialName");
	sections.push("import kotlinx.serialization.Serializable");
	sections.push("import kotlinx.serialization.json.JsonElement");
	sections.push("import kotlinx.serialization.json.JsonObject");
	sections.push("");

	for (const group of groups) {
		const groupTypes: string[] = [];

		for (const method of group.methods) {
			const queryType = emitQueryParamsClass(group.groupName, method);
			if (queryType) {
				groupTypes.push(queryType.code);
			}

			const bodyType = emitBodyClass(group.groupName, method);
			if (bodyType) {
				groupTypes.push(bodyType.code);
			}

			const responseType = emitResponseAlias(group.groupName, method);
			groupTypes.push(responseType.code);
		}

		if (groupTypes.length > 0) {
			const className = groupToClassName(group.groupName);
			sections.push(`// ─── ${className} Types ────────────────────────────────────────`);
			sections.push("");
			sections.push(groupTypes.join("\n\n"));
			sections.push("");
		}
	}

	return sections.join("\n");
}

// ─── Group Class ──────────────────────────────────────────────────────────────

function buildPathExpression(path: string): string {
	const hasParams = path.includes("{");
	if (!hasParams) {
		return `"${path}"`;
	}
	// Convert {param} to ${param} for Kotlin string template
	const template = path.replace(/\{([^}]+)\}/g, (_match, paramName: string) => {
		return `\$${snakeToCamel(paramName)}`;
	});
	return `"${template}"`;
}

function emitKotlinMethod(group: string, method: MethodDefinition): string {
	const lines: string[] = [];
	const responseName = `${buildTypeName(group, method.methodName)}Response`;

	// Build argument list
	const args: string[] = [];

	// Path params
	for (const param of method.params.pathParams) {
		const kotlinType = tsTypeToKotlin(param.type);
		args.push(`${snakeToCamel(param.name)}: ${kotlinType}`);
	}

	// Body param
	const bodyTypeName = `${buildTypeName(group, method.methodName)}Body`;
	const hasBodyType = method.hasBody && (method.bodyProperties.length > 0 || method.bodyIsArray);
	if (hasBodyType) {
		if (method.bodyRequired) {
			args.push(`body: ${bodyTypeName}`);
		} else {
			args.push(`body: ${bodyTypeName}? = null`);
		}
	}

	// Query params
	const queryTypeName = `${buildTypeName(group, method.methodName)}Params`;
	const hasQueryType = method.params.queryParams.length > 0;
	if (hasQueryType) {
		args.push(`params: ${queryTypeName}? = null`);
	}

	const argStr = args.join(", ");
	const pathExpr = buildPathExpression(method.path);

	lines.push(`\tsuspend fun ${method.methodName}(${argStr}): ${responseName} {`);
	lines.push(`\t\treturn http.request(RequestOptions(`);
	lines.push(`\t\t\tmethod = "${method.httpMethod}",`);
	lines.push(`\t\t\tpath = ${pathExpr},`);

	if (hasQueryType) {
		lines.push(`\t\t\tquery = params?.let { http.json.encodeToJsonElement(serializer(), it) },`);
	}

	if (hasBodyType) {
		if (method.bodyRequired) {
			lines.push(`\t\t\tbody = http.json.encodeToJsonElement(serializer(), body),`);
		} else {
			lines.push(`\t\t\tbody = body?.let { http.json.encodeToJsonElement(serializer(), it) },`);
		}
	}

	if (method.isMultipart) {
		lines.push(`\t\t\tmultipart = true,`);
	}

	lines.push(`\t\t))`);
	lines.push(`\t}`);

	return lines.join("\n");
}

export function emitKotlinGroupFile(group: ParsedGroup, subPackage: string): string {
	const className = groupToClassName(group.groupName);
	const fullPackage = `${PACKAGE}.${subPackage}`;
	const lines: string[] = [];

	lines.push("// Auto-generated. Do not edit manually.");
	lines.push("");
	lines.push(`package ${fullPackage}`);
	lines.push("");
	lines.push("import com.lolzteam.api.runtime.LolzteamHttpClient");
	lines.push("import com.lolzteam.api.runtime.RequestOptions");
	lines.push("import kotlinx.serialization.json.JsonElement");
	lines.push("import kotlinx.serialization.serializer");
	lines.push("");

	lines.push(`class ${className}(private val http: LolzteamHttpClient) {`);

	for (const method of group.methods) {
		lines.push("");
		lines.push(emitKotlinMethod(group.groupName, method));
	}

	lines.push("}");
	lines.push("");

	return lines.join("\n");
}

// ─── Client Index ─────────────────────────────────────────────────────────────

export function emitKotlinClientFile(
	groups: ParsedGroup[],
	clientName: string,
	defaultBaseUrl: string,
	defaultRateLimit: number,
	subPackage: string,
): string {
	const fullPackage = `${PACKAGE}.${subPackage}`;
	const lines: string[] = [];

	lines.push("// Auto-generated. Do not edit manually.");
	lines.push("");
	lines.push(`package ${fullPackage}`);
	lines.push("");
	lines.push("import com.lolzteam.api.runtime.ClientConfig");
	lines.push("import com.lolzteam.api.runtime.LolzteamHttpClient");
	lines.push("import com.lolzteam.api.runtime.RateLimitConfig");
	lines.push("import java.io.Closeable");
	lines.push("");

	lines.push(`class ${clientName}(config: ClientConfig) : Closeable {`);

	// Properties
	for (const group of groups) {
		const className = groupToClassName(group.groupName);
		const propName = groupToPropertyName(group.groupName);
		lines.push(`\tval ${propName}: ${className}`);
	}

	lines.push("");
	lines.push("\tprivate val http: LolzteamHttpClient");
	lines.push("");

	// Constructor
	lines.push("\tinit {");
	lines.push(`\t\thttp = LolzteamHttpClient(config.copy(`);
	lines.push(`\t\t\tbaseUrl = config.baseUrl ?: "${defaultBaseUrl}",`);
	lines.push(`\t\t\trateLimit = config.rateLimit ?: RateLimitConfig(requestsPerMinute = ${defaultRateLimit}),`);
	lines.push(`\t\t))`);

	for (const group of groups) {
		const className = groupToClassName(group.groupName);
		const propName = groupToPropertyName(group.groupName);
		lines.push(`\t\t${propName} = ${className}(http)`);
	}

	lines.push("\t}");
	lines.push("");

	lines.push("\toverride fun close() {");
	lines.push("\t\thttp.close()");
	lines.push("\t}");

	lines.push("}");
	lines.push("");

	return lines.join("\n");
}
