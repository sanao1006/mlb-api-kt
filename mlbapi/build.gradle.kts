plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.jetbrains.kotlin.android)
    alias(libs.plugins.kotlin.serialization)
    id("com.google.devtools.ksp") version "1.9.22-1.0.18"
    alias(libs.plugins.ktorfit)
    id("maven-publish")
}

val GROUP_ID = "com.github.sanao1006"
val ARTIFACT_ID = "mlb-api-kt"
val VERSION = "0.0.1"

android {
    namespace = "app.sanao1006.mlbkt"
    group = GROUP_ID
    version = VERSION
    compileSdk = 34

    defaultConfig {
        minSdk = 26
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    ksp(libs.ktorfit.ksp)
    implementation(libs.bundles.ktor)
    implementation(libs.coroutines)
    implementation(libs.serialization)
    implementation(libs.bundles.sandwich)

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    testImplementation(libs.coroutines.test)
    testImplementation(libs.serialization)
    testImplementation(kotlin("test"))
}

afterEvaluate {
    publishing {
        publications {
            create<MavenPublication>("release") {
                from(components["release"])
                groupId = GROUP_ID
                artifactId = ARTIFACT_ID
                version = VERSION
            }
        }
    }
}
