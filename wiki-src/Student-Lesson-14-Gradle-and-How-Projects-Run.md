# Student Lesson 14: Gradle and How Projects Run

This lesson explains the build system behind the buttons students use in VS Code.

## Main Ideas

Gradle is the build tool for this project. A build tool does more than compile code. It also manages dependencies, runs tests, and launches tasks like simulation.

Students do not need to write Gradle scripts from scratch in this course, but they do need to know what the build system is doing when they click a WPILib action. `Build Robot Code` compiles the code and makes sure the project is structurally valid. `Test Robot Code` runs the tests. `Simulate Robot Code` launches the desktop simulation task.

Files like `build.gradle` and `settings.gradle` tell Gradle how the project is configured. Dependencies are outside libraries the project needs, such as WPILib and vendor support libraries.

Understanding the build system helps students separate different kinds of problems. Some errors come from Java code itself. Some come from missing dependencies, project configuration, or the build environment.

## What Students Should Understand

- Gradle is the build system behind the VS Code actions.
- Building, testing, and simulating are related but different tasks.
- Build files describe how the project is assembled.
- Not every failure is a Java logic failure; some are setup or dependency problems.
