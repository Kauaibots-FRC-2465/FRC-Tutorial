# Gradle Cheat Sheet

Gradle is the build tool for this project. Students should normally use the VS Code command palette through the WPILib extension, not type Gradle commands directly in a terminal.

## VS Code Actions Students Should Know

- Open the command palette with `Ctrl+Shift+P`.
- Run `WPILib: Open WPILib Command Palette`.
- Choose `Build Robot Code` to compile the project.
- Choose `Test Robot Code` to run the unit tests.
- Choose `Simulate Robot Code` to run the robot in desktop simulation.

## What Gradle Is Doing

- Reading `build.gradle`
- Loading WPILib plugins and dependencies
- Compiling Java source files
- Running tests
- Creating build output in the `build` folder

## Good Habits

- Read the first error, not just the last line.
- Fix one problem at a time.
- If a build worked yesterday and fails today, check which files changed.
