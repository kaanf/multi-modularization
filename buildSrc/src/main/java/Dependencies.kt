object Dependencies {
    object BuildPlugins {
        val hiltPlugin by lazy { "com.google.dagger:hilt-android-gradle-plugin:${Versions.hiltPlugin}" }
    }

    object Androidx {
        val coreKtx by lazy { "androidx.core:core-ktx:${Versions.coreKtx}" }
        val hiltCompiler by lazy { "androidx.hilt:hilt-compiler:${Versions.hiltCompiler}" }
        val room by lazy { "androidx.room:room-runtime:${Versions.room}" }
        val roomCompiler by lazy { "androidx.room:room-compiler:${Versions.room}" }
        val roomKtx by lazy { "androidx.room:room-ktx:${Versions.room}" }
        val roomPaging by lazy { "androidx.room:room-paging:${Versions.room}" }
        val compose by lazy { "androidx.compose.ui:ui:${Versions.compose}" }
        val composeMaterial by lazy { "androidx.compose.material:material:${Versions.compose}" }
        val composePreview by lazy { "androidx.compose.ui:ui-tooling-preview:${Versions.compose}" }
        val viewModelCompose by lazy { "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.lifecycleRuntime}" }
        val lifecycleRuntime by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleRuntime}" }
        val composeActivity by lazy { "androidx.activity:activity-compose:${Versions.composeActivity}" }
    }

    object Google {
        val hilt by lazy { "com.google.dagger:hilt-android:${Versions.hilt}" }
        val hiltCompiler by lazy { "com.google.dagger:hilt-compiler:${Versions.hilt}" }
    }

    object Testing {
        val jUnit by lazy { "junit:junit:${Versions.jUnit}" }
        val jUnitExt by lazy { "androidx.test.ext:junit:${Versions.jUnitExt}" }
        val espresso by lazy { "androidx.test.espresso:espresso-core:${Versions.espresso}" }
        val jUnitUi by lazy { "androidx.compose.ui:ui-test-junit4:${Versions.compose}" }
        val composeTooling by lazy { "androidx.compose.ui:ui-tooling:${Versions.compose}" }
        val composeTestManifest by lazy { "androidx.compose.ui:ui-test-manifest:${Versions.compose}" }
        val hiltTest by lazy { "com.google.dagger:hilt-android-testing:${Versions.hilt}" }
        val hiltTestCompiler by lazy { "com.google.dagger:hilt-compiler:${Versions.hilt}" }
    }

    object Networking {
        val retrofit by lazy { "com.squareup.retrofit2:retrofit:${Versions.retrofit}" }
        val gsonConverter by lazy { ("com.squareup.retrofit2:converter-gson:${Versions.retrofit}") }
        val okHttpClient by lazy { ("com.squareup.okhttp3:logging-interceptor:${Versions.okHttp}") }
        val okHttpLoggingInterceptor by lazy { ("com.squareup.okhttp3:okhttp:${Versions.okHttp}") }
    }

    object Kotlin {
        val coroutineAndroid by lazy { ("org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}") }
        val coroutineCore by lazy { ("org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}") }
    }

    object Javax {
        val jvmInject by lazy { "javax.inject:javax.inject:${Versions.jvmInject}" }
    }
}
