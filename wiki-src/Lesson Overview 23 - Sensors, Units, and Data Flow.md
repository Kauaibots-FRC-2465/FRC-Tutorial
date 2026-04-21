# Lesson Overview 23 - Sensors, Units, and Data Flow

Branch: `lesson-23-sensors-units-and-data-flow`
Reading Page: [Lesson Reading 23 - Sensors, Units, and Data Flow](<Lesson Reading 23 - Sensors, Units, and Data Flow>)
How to use this lesson: use the VS Code WPILib command palette and choose `Test Robot Code` and `Simulate Robot Code`

## What This Lesson Is Really About

Measurements are only useful if you know what they mean and where they came from. This lesson follows one value from a sensor, through the program, and out to the dashboard while paying attention to units such as meters and degrees.

## New Words

- sensor: hardware that measures something about the robot or its environment
- unit: the measurement label attached to a value, such as meters, degrees, or seconds
- data flow: the path information takes through the program
- conversion: changing a value from one unit or representation into another

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
