# Lesson 19: Subsystems and State Ownership

Branch: `lesson-19-subsystems-and-state-ownership`
How to use this lesson: use the VS Code WPILib command palette and choose `Simulate Robot Code`

## What This Lesson Is Really About

Students often scatter important robot facts across many classes. This lesson is about deciding which class should own which facts so the code has one clear source of truth instead of several half-correct copies.

## New Words

- state: the data an object or program is currently holding
- source of truth: the one place that should be trusted for a piece of information
- derived question: a question answered from other data, such as "is the arm at target?"

## Goals

- Treat subsystems as the source of truth for robot-facing state.
- Move derived questions such as "is at target" into the subsystem that owns the data.
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

- You can point to one robot fact that is now owned by the correct subsystem.
