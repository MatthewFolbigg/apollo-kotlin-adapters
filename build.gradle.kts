import com.gradleup.librarian.gradle.Librarian

plugins {
  id("org.jetbrains.kotlin.jvm").version("2.1.20").apply(false)
  id("com.gradleup.librarian").version("0.0.10-SNAPSHOT-b1753eed081e165aa3977894f4131cc978f06e05").apply(false)
}

Librarian.root(project)
