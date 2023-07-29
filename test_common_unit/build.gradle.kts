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
        with("projectPath.dependencies_test.core_unit") {
            api(string("juint"))
            api(string("truth"))
            api(string("mockk"))
            api(string("mockk_android"))
        }
    }
}