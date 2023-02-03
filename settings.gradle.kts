pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

rootProject.name = "playzone-mobile"
include(":androidApp")
include(":common:auth:api")
include(":common:auth:data")
include(":common:auth:presentation")
include(":common:tournaments:api")
include(":common:tournaments:data")
include(":common:tournaments:presentation")
include(":common:games:api")
include(":common:games:data")
include(":common:games:presentation")
include(":common:core")
include(":common:umbrella-compose")
include(":common:umbrella-ios")