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
                jvmTarget = string("jvmTarget")
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
    api(project(":test_common_unit"))
    api(project(":test_common_integration"))
}