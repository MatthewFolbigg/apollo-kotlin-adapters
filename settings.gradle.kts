pluginManagement {
  listOf(repositories, dependencyResolutionManagement.repositories).forEach {
    it.apply {
      mavenCentral()
      google()
    }
  }
  repositories {
    exclusiveContent {
      forRepository { maven("https://storage.googleapis.com/gradleup/m2") }
      filter {
        includeGroup("com.gradleup.librarian")
      }
    }
  }
}

include(":apollo-adapters-kotlinx-datetime", ":apollo-adapters-core")