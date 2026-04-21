# Lesson 01: Reading a Java Project

Branch: `lesson-01-reading-a-java-project`
Student Reading: [Student Lesson 01: Reading a Java Project](Student-Lesson-01-Reading-a-Java-Project)
How to use this lesson: reading and discussion

## What This Lesson Is Really About

When students first open a Java project, everything can look equally important. It is not. This lesson is about learning where execution starts, which files are about building the project, and which files contain the robot's behavior.

## New Words

- source file: a file that contains Java code you wrote for the program
- build file: a file that tells the build system how to create the program
- entry point: the place where the program starts running
- subsystem: code that owns one robot capability, such as driving or moving an arm
- command: a named robot action, such as driving with joysticks or running an intake

## Goals

- Find where execution starts.
- Separate build files from source files.
- Recognize the role of `Robot`, `RobotContainer`, commands, and subsystems.

## Read First

- `course/Project-Map.md`
- `src/main/java/frc/robot/Main.java`
- `src/main/java/frc/robot/Robot.java`
- `src/main/java/frc/robot/RobotContainer.java`

## Name Styles You Will See

- `camelCase`: starts lowercase and then uses capital letters for later words, such as `robotContainer` or `maxSpeed`. In Java, methods and variables usually use this style.
- `PascalCase`: capitalizes every word, such as `RobotContainer` or `DriveSubsystem`. In Java, class names usually use this style.
- `UPPER_SNAKE_CASE`: all capital letters with underscores, such as `DRIVER_PORT`. In Java, constants often use this style.
- `snake_case`: lowercase letters with underscores, such as `drive_speed`. This is common in some other languages and data files, but not the normal style for Java variables or classes.

## Project Structure You Will See

A directory structure is the way folders and files are arranged in a project. In an FRC Java project, that structure helps you tell the difference between robot code, tests, build setup, Git data, and generated files.

- `.git/` stores Git history and internal repository data.
- `.gitignore` tells Git which local or generated files to ignore.
- `src/main/java/` holds the main robot code.
- `src/test/java/` holds test code.
- `build.gradle` and `settings.gradle` tell the build system how to build the project.
- `build/` holds generated output and should usually be left alone.

## Focus Questions

- Which file starts the program?
- Which files are there to build the project, and which files contain Java code?
- Which file seems to connect the main robot pieces together?

## Success Check

- You can explain where the robot program starts and where to look for its main parts.
