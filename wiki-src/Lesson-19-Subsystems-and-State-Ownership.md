# Lesson 19: Subsystems and State Ownership

Branch: `lesson-19-subsystems-and-state-ownership`
Run mode: `.\gradlew.bat simulateJava`

## Goals

- Treat subsystems as the source of truth for robot-facing state.
- Move derived questions such as “is at target” into the subsystem that owns the data.
- Reduce duplicated logic in commands and container code.

## Read First

- `src/main/java/frc/robot/subsystems/ArmSubsystem.java`
- `src/main/java/frc/robot/subsystems/DriveSubsystem.java`
- `src/main/java/frc/robot/subsystems/IntakeSubsystem.java`

## Focus Questions

- Which class should decide whether the arm is at target?
- Which class should decide whether the intake is loaded?
- What becomes simpler when ownership is clear?

## Success Check

- You can point to one state question that is now owned by the correct subsystem.
