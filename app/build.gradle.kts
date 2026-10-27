plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.android_2026"
    compileSdk = 37 // Đã thay thế khối compileSdk 36.1 bằng API 37

    defaultConfig {
        applicationId = "com.example.android_2026"
        minSdk = 24
        targetSdk = 36 // Bạn có thể giữ nguyên 36 hoặc đổi thành 37
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            optimization {
                enable = false
            }
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation(libs.androidx.activity.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.core.ktx)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit)
}