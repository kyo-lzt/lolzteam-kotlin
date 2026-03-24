plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.serialization)
    id("org.jlleitschuh.gradle.ktlint") version "12.1.2"
    id("org.jetbrains.dokka") version "2.0.0"
    id("com.vanniktech.maven.publish") version "0.30.0"
}

group = "com.lolzteam"
version = findProperty("version") as String? ?: "0.0.0-dev"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.ktor.client.core)
    implementation(libs.ktor.client.cio)
    implementation(libs.ktor.client.content.negotiation)
    implementation(libs.ktor.serialization.json)
    implementation(libs.kotlinx.serialization.json)
    implementation(libs.kotlinx.coroutines.core)

    testImplementation(kotlin("test"))
    testImplementation(libs.ktor.client.mock)
    testImplementation(libs.kotlinx.coroutines.test)
}

tasks.test {
    useJUnitPlatform()
}

ktlint {
}

kotlin {
    compilerOptions {
        allWarningsAsErrors.set(true)
        freeCompilerArgs.add("-opt-in=kotlinx.serialization.ExperimentalSerializationApi")
    }
}

mavenPublishing {
    publishToMavenCentral(com.vanniktech.maven.publish.SonatypeHost.CENTRAL_PORTAL, automaticRelease = true)
    signAllPublications()

    coordinates("com.lolzteam", "lolzteam-api", version.toString())

    pom {
        name.set("lolzteam-api")
        description.set("Kotlin API wrapper for Lolzteam Forum and Market")
        url.set("https://github.com/kyo-lzt/lolzteam-kotlin")
        licenses {
            license {
                name.set("MIT")
                url.set("https://opensource.org/licenses/MIT")
            }
        }
        developers {
            developer {
                id.set("kyo-lzt")
                name.set("kyo-lzt")
                url.set("https://github.com/kyo-lzt")
            }
        }
        scm {
            url.set("https://github.com/kyo-lzt/lolzteam-kotlin")
            connection.set("scm:git:git://github.com/kyo-lzt/lolzteam-kotlin.git")
            developerConnection.set("scm:git:ssh://git@github.com/kyo-lzt/lolzteam-kotlin.git")
        }
    }
}
