# Gradle Cheat Sheet

Gradle is the build tool for this project. A build tool is the software that turns the source code into a runnable program, runs tests, and helps launch simulation. Students should normally use the VS Code command palette through the WPILib extension, not type Gradle commands directly in a terminal.

## VS Code Actions Students Should Know

- Open the command palette with `Ctrl+Shift+P`.
- Run `WPILib: Open WPILib Command Palette`.
- Choose `Build Robot Code` to compile the project. Compile means checking the Java code and turning it into a program.
- Choose `Test Robot Code` to run the unit tests. A unit test is a small automatic check of one behavior.
- Choose `Simulate Robot Code` to run the robot in desktop simulation. Simulation means the computer pretends to be the robot.

## What Gradle Is Doing

- Reading `build.gradle`
- Loading WPILib plugins and dependencies, which are outside code libraries the project needs
- Compiling Java source files
- Running tests
- Creating build output in the `build` folder

## Good Habits

- Read the first error, not just the last line.
- Fix one problem at a time.
- If a build worked yesterday and fails today, check which files changed.
