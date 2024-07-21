// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    // Instead of using a alpha version of 8.4.0, I instead switched to the release version.
    // It probably won't change anything if I switch it instead to the latest version,
    // but who knows ¯\_(ツ)_/¯
    id("com.android.application") version "8.4.0" apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
    kotlin("jvm") version "1.9.20" apply false
    kotlin("plugin.serialization") version "1.9.20" apply false
}
