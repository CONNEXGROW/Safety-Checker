plugins {
    id("com.android.application")
    kotlin("android")
}

val kotlinVersion = "1.8.0" // Define the Kotlin version here

android {
    namespace = "com.example.myapplication" // Specify your namespace here
    compileSdk = 33 // Use the latest version you have installed

    defaultConfig {
        applicationId = "com.example.myapplication"
        minSdk = 21
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        // This is important for instrumented tests
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8 // Match this to the Kotlin JVM target
        targetCompatibility = JavaVersion.VERSION_1_8 // Match this to the Kotlin JVM target
    }

    kotlinOptions {
        jvmTarget = "1.8" // Set this to 1.8 or whichever version matches your Java compatibility
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.6.1") // or latest version
    implementation("androidx.browser:browser:1.5.0") // Custom Tabs dependency
    implementation("org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion") // Use the defined Kotlin version
    implementation("com.google.android.material:material:1.9.0") // Material Components dependency

    // Add the Google Play Services Location dependency
    implementation("com.google.android.gms:play-services-location:21.0.1")

    // Unit testing
    testImplementation("junit:junit:4.13.2") // Latest stable version of JUnit 4

    // Instrumented testing
    androidTestImplementation("androidx.test.ext:junit:1.1.5") // JUnit 4 for instrumented tests
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1") // Espresso for UI testing
}
