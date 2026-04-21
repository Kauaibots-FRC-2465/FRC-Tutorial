# Lesson 17: Robot Lifecycle and Telemetry

Branch: `lesson-17-robot-lifecycle-and-telemetry`
Student Reading: [Student Lesson 17: Robot Lifecycle and Telemetry](Student-Lesson-17-Robot-Lifecycle-and-Telemetry)
How to use this lesson: use the VS Code WPILib command palette and choose `Simulate Robot Code`

## What This Lesson Is Really About

FRC robots do not run one giant method from start to finish. WPILib calls different methods depending on the robot's mode. This lesson shows that repeating pattern and the information the robot shares with people through the dashboard and console.

## New Words

- lifecycle: the repeating pattern of methods WPILib runs while the robot is on
- mode: one of the robot's operating states, such as disabled, autonomous, or teleop
- telemetry: data published so humans can see what the robot is doing
- dashboard: the screen that displays robot data

## Goals

- Understand the major robot modes.
- Watch values move through dashboard and console output.
- Connect lifecycle methods to what the robot is doing in each mode.

## Read First

- `src/main/java/frc/robot/Robot.java`
- `src/main/java/frc/robot/subsystems/DriveSubsystem.java`
- `src/main/java/frc/robot/subsystems/ArmSubsystem.java`
- `src/main/java/frc/robot/subsystems/IntakeSubsystem.java`

## Focus Questions

- Which methods run in every mode?
- Which values are published so humans can watch the robot?
- How do console messages and dashboard values help each other?

## Success Check

- You can explain where one telemetry value is created and where it is displayed.
