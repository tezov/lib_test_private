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
    }
    api(project(":lib_test_common_unit"))
    api(project(":lib_test_common_integration"))
}