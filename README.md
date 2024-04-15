[![](https://jitpack.io/v/sanao1006/mlb-api-kt.svg)](https://jitpack.io/#sanao1006/mlb-api-kt)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
# mlb-api-kt
🚧 WIP  
This is MLB Stats API wrapper for Android

# Build setup
### Step 1. Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:
```kotlin
dependencyResolutionManagement {
  repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
  repositories {
    mavenCentral()
    maven { url = uri("https://jitpack.io") }
  }
}
```
### Step 2. Add the dependency
```kotlin
dependencies {
  implementation("com.github.sanao1006:mlb-api-kt:<version>")
}
```

# How to use
