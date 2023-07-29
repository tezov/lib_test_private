tezovConfig {
    configuration {
        domain = tezovCatalog.string("domain")
//        proguardCConsumerPaths.apply {
//            add("consumer-rules.pro")
//        }
    }
    configureAndroidPlugin()
}

android {
    tezovCatalog {
        with("projectVersion") {
            compileSdk = int("defaultCompileSdk")
            compileOptions {
                sourceCompatibility = javaVersion("javasource")
                targetCompatibility = javaVersion("javaTarget")
            }
            kotlinOptions {
                jvmTarget = javaVersion("jvmTarget").toString()
            }
            defaultConfig {
                minSdk = int("defaultMinCompileSdk")
            }
        }
    }
}

dependencies {
    tezovCatalog {
        with("projectPath.dependencies.core") {
            implementation(string("kotlin"))
        }
        with("projectPath.dependencies_test.core_integration") {
            api(string("junit_test"))
            api(string("junit_test_ktx"))
            api(string("test"))
            api(string("test_ktx"))

            api(string("coroutine"))
            api(string("compose_ui"))
            api(string("truth"))
            api(string("espresso_core"))
            api(string("espresso_contrib")){
                exclude(
                    group = "org.checkerframework",
                    module = "checker",
                )
            }

            api(string("uiautomator"))
        }
    }
}