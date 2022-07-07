import org.gradle.kotlin.dsl.`kotlin-dsl`

plugins {
    `kotlin-dsl`
}

repositories {
    google()
    mavenCentral()
}

dependencies {
    implementation("de.vandermeer:asciitable:0.3.2")
    implementation(gradleApi())
    implementation(localGroovy())
}
