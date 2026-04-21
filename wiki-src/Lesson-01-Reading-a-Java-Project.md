# Lesson 01: Reading a Java Project

Branch: `lesson-01-reading-a-java-project`
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

## Focus Questions

- Which file starts the program?
- Which files are there to build the project, and which files contain Java code?
- Which file seems to connect the main robot pieces together?

## Success Check

- You can explain where the robot program starts and where to look for its main parts.
