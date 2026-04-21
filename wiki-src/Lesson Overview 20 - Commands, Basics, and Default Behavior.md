# Lesson Overview 20 - Commands, Basics, and Default Behavior

Branch: `lesson-20-commands-basics-and-default-behavior`
Reading Page: [Lesson Reading 20 - Commands, Basics, and Default Behavior](<Lesson Reading 20 - Commands, Basics, and Default Behavior>)
How to use this lesson: use the VS Code WPILib command palette and choose `Simulate Robot Code`

## What This Lesson Is Really About

Commands are how command-based projects ask subsystems to do work. This lesson focuses on the commands that run during normal operation, especially the default commands that keep behavior sensible when nothing special is happening.

## New Words

- default command: the command a subsystem runs when no other command is using it
- deadband: a small input range treated as zero so tiny controller noise does not move the robot
- idle behavior: what the robot should do when no active input is asking for something else

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
