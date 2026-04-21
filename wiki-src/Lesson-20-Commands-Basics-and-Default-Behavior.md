# Lesson 20: Commands Basics and Default Behavior

Branch: `lesson-20-commands-basics-and-default-behavior`
Run mode: `.\gradlew.bat simulateJava`

## Goals

- Understand what a default command does.
- See how command code translates input into subsystem behavior.
- Recognize why deadbands and safe defaults matter.

## Read First

- `src/main/java/frc/robot/commands/DriveWithJoysticksCommand.java`
- `src/main/java/frc/robot/commands/IdleIntakeCommand.java`
- `src/main/java/frc/robot/RobotContainer.java`

## Focus Questions

- Which command owns a subsystem when nothing else is happening?
- Why does the intake need an explicit idle behavior?
- What input cleanup happens before the drive subsystem sees a command?

## Success Check

- You can explain what happens when the driver stops touching the controls.
