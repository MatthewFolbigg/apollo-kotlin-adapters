import com.gradleup.librarian.gradle.Librarian

plugins {
  id("org.jetbrains.kotlin.jvm").version("2.0.0").apply(false)
}

buildscript {
  repositories {
    mavenCentral()
  }
  dependencies {
    classpath("com.gradleup.librarian:librarian-gradle-plugin:0.0.8")
  }
}
Librarian.root(project)