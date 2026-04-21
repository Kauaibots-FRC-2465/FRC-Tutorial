# Student Lesson 01: Reading a Java Project

This lesson is about learning how to look at a project without getting lost.

## Main Ideas

When a beginner opens a codebase, it is easy to assume every file is equally important. That is almost never true. Some files contain the actual program logic. Some only describe how the project is built. Some are generated automatically. Learning to separate those categories is one of the first real programming skills.

A directory structure is the way files and folders are arranged inside a project. Good directory structure makes it easier to answer questions like these: where does the program start, where are the tests, where is the main robot code, and which files are probably safe to ignore for now?

In a Java project, `src/main/java` usually contains the main source code. In an FRC project, the files inside `frc/robot` are especially important. `Main.java` is the entry point. `Robot.java` contains methods WPILib calls while the robot is running. `RobotContainer.java` is usually where a command-based project connects inputs, commands, and subsystems.

This lesson also introduces name styles. Java uses naming patterns to make code more readable. `camelCase` usually means variables or methods. `PascalCase` usually means class names. `UPPER_SNAKE_CASE` usually means constants. `snake_case` is common in other languages and data files, but not usually for Java variables or classes.

Hidden files matter too. `.git` stores repository history. `.gitignore` tells Git which files should not be tracked. `build.gradle` and `settings.gradle` help the build system understand the project. These are real project files, even if they are not part of the robot's day-to-day behavior.

## What Students Should Understand

- Reading a project means learning the job of each file or folder.
- The entry point tells you where the program begins.
- Good naming conventions reduce guessing.
- Not every file deserves equal attention on the first read.
