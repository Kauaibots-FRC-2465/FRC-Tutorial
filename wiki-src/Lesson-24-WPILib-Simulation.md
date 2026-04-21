# Lesson 24: WPILib Simulation

Branch: `lesson-24-wpilib-simulation`
Run mode: `.\gradlew.bat simulateJava`

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
