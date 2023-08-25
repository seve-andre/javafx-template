# JavaFX template
To create you own repo, click on:

[![Use this template](https://user-images.githubusercontent.com/38083522/226207439-1195c8c4-e3e2-4db0-8f39-7277b08872be.png)](https://github.com/seve-andre/compose-template/generate)

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
    mainClass.set("com.mitch.altsim.Launcher")
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
