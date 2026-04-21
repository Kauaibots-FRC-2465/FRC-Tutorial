# Lesson 23: Sensors, Units, and Data Flow

Branch: `lesson-23-sensors-units-and-data-flow`
Run mode: VS Code WPILib command palette with `Test Robot Code` and `Simulate Robot Code`

## Goals

- Replace raw doubles with typed distances and angles where that improves clarity.
- Follow data from IO to subsystem to dashboard.
- Understand why unit-aware code prevents easy mistakes.

## Read First

- `src/main/java/frc/robot/Constants.java`
- `src/main/java/frc/robot/io/ArmIO.java`
- `src/main/java/frc/robot/io/DriveIO.java`
- `src/main/java/frc/robot/subsystems/ArmSubsystem.java`
- `src/main/java/frc/robot/subsystems/DriveSubsystem.java`

## Focus Questions

- Which values are now typed as distance or angle?
- Where are units converted for display?
- Why is unit information useful in autonomous code?

## Success Check

- You can explain how one arm angle or drive distance value moves through the program.
