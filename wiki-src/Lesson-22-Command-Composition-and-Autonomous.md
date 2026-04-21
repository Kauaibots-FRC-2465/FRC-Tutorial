# Lesson 22: Command Composition and Autonomous

Branch: `lesson-22-command-composition-and-autonomous`
Run mode: `.\gradlew.bat simulateJava`

## Goals

- Read composed autonomous routines.
- Understand sequence, deadline, timeout, and chooser-based selection.
- Connect small commands into a structured autonomous plan.

## Read First

- `src/main/java/frc/robot/commands/Autos.java`
- `src/main/java/frc/robot/RobotContainer.java`

## Focus Questions

- What order does each autonomous routine follow?
- Which commands run together, and which wait for others?
- How does the chooser connect dashboard selection to the robot?

## Success Check

- You can trace the full action order of `Score and Leave`.
