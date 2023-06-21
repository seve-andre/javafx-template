# JavaFX template
Click on [![Use this template](https://img.shields.io/badge/-Use%20this%20template-%23347d39)](https://github.com/seve-andre/javafx-template/generate) to create your own repo

## Instructions
Assuming:
1. domain name = `com.mitch`
2. app name = `altsim`

## What to edit
- in [build.gradle.kts](https://github.com/seve-andre/javafx-template/blob/main/build.gradle.kts)
  ```gradle.kts
  // BEFORE
  application {
    // Define the main class for the application
    mainClass.set("replaceWithPathToLauncher")
  }

  // AFTER
  application {
    // Define the main class for the application
    mainClass.set("altsim.Launcher")
  }
  ```
- in [settings.gradle.kts](https://github.com/seve-andre/javafx-template/blob/main/settings.gradle.kts):
  ```gradle.kts
  // BEFORE
  rootProject.name = "replaceWithNameOfTheProject"
    
  // AFTER
  rootProject.name = "altsim"
  ```

- package name from `projectAbbreviation` to `com.mitch.altsim`
