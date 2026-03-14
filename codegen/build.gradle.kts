plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.serialization)
    application
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.kotlinx.serialization.json)
}

application {
    mainClass.set("MainKt")
}

tasks.named<JavaExec>("run") {
    workingDir = rootProject.projectDir
}
