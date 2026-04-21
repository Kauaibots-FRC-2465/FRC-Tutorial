# Lesson 24: WPILib Simulation

Branch: `lesson-24-wpilib-simulation`
How to use this lesson: use the VS Code WPILib command palette and choose `Simulate Robot Code`

## What This Lesson Is Really About

Fake IO is useful, but it does not try to act like real physics. WPILib simulation goes further by modeling how a mechanism responds over time. This lesson explains that loop so students can see how simulated motors lead to simulated sensor readings.

## New Words

- physics model: code that estimates how a mechanism moves in response to inputs
- `simulationPeriodic()`: a method WPILib calls during simulation so the program can update simulated hardware
- approximation: something close to reality but not identical to it

## Goals

- Compare fake IO with physics-based simulation.
- Understand what `simulationPeriodic()` is doing in this project.
- Watch drivetrain and arm state move through WPILib sim classes.

## Read First

- `src/main/java/frc/robot/io/DriveIOSim.java`
- `src/main/java/frc/robot/io/ArmIOSim.java`
- `src/main/java/frc/robot/Robot.java`
- `src/main/java/frc/robot/RobotContainer.java`

## Focus Questions

- Which values are motor-like inputs?
- Which values are sensor-like outputs?
- Why is simulation still an approximation and not a guarantee?

## Success Check

- You can describe the full loop from commanded output to simulated mechanism state to dashboard data.
