plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.jetbrains.kotlin.android)
    alias(libs.plugins.kotlin.serialization)
    id("com.google.devtools.ksp") version "1.9.22-1.0.18"
    alias(libs.plugins.ktorfit)
    id("maven-publish")
}

val GROUP_ID = "com.github.sanao1006"
val ARTIFACT_ID = "mlbapikkt"
val VERSION = "0.0.11"

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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    publishing {
        singleVariant("release") {
            withSourcesJar()
        }
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
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

publishing {
    publications {

        register<MavenPublication>("release") {
            groupId = GROUP_ID
            artifactId = ARTIFACT_ID
            version = VERSION

            afterEvaluate {
                from(components["release"])
            }
        }
    }
}

