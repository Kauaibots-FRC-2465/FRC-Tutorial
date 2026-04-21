# Gradle Cheat Sheet

Gradle is the build tool for this project. You do not need to understand everything about Gradle at the start, but you do need to know how to use the common tasks.

## Commands Students Should Know

- `.\gradlew.bat compileJava`: compile the main Java code.
- `.\gradlew.bat test`: run the unit tests.
- `.\gradlew.bat simulateJava`: run the robot in desktop simulation.
- `.\gradlew.bat build`: run the normal build pipeline.

## What Gradle Is Doing

- Reading `build.gradle`
- Loading WPILib plugins and dependencies
- Compiling Java source files
- Running tests
- Creating build output in the `build` folder

## Good Habits

- Read the first error, not just the last line.
- Fix one problem at a time.
- If a command worked yesterday and fails today, check which files changed.
