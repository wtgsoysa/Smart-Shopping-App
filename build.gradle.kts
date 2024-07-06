buildscript {
    dependencies {
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.40.1")
        classpath("com.google.gms:google-services:4.3.13")

        val nav_version = "2.5.0" // Use val instead of def in Kotlin
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:$nav_version")
    }
}

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
}