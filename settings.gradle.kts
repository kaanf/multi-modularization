pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "Multi Modularization"
include (":app")
include (":core")
include (":onboarding")
include (":onboarding:onboarding_presentation")
include (":onboarding:onboarding_domain")
include (":tracker")
include (":tracker:tracker_data")
include (":tracker:tracker_domain")
include (":tracker:tracker_presentation")
