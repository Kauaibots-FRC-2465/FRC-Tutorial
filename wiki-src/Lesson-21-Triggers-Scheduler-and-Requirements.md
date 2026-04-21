# Lesson 21: Triggers, Scheduler, and Requirements

Branch: `lesson-21-triggers-scheduler-and-requirements`
How to use this lesson: use the VS Code WPILib command palette and choose `Simulate Robot Code`

## What This Lesson Is Really About

In a command-based robot, button-like events start commands, and WPILib decides which commands are allowed to run together. This lesson explains those rules so command behavior feels predictable instead of mysterious.

## New Words

- trigger: a condition that starts or stops commands when it changes
- scheduler: the WPILib system that starts commands, runs them, and prevents conflicts
- requirement: a rule saying which subsystem a command needs to control
- interrupt: stopping a running command because another command needs the same subsystem or the trigger changed

## Goals

- See how triggers schedule and interrupt commands.
- Understand subsystem requirements as a conflict-resolution rule.
- Observe command lifecycle messages in the console.

## Read First

- `src/main/java/frc/robot/Robot.java`
- `src/main/java/frc/robot/RobotContainer.java`
- `src/main/java/frc/robot/commands/NudgeArmCommand.java`

## Focus Questions

- Which commands require the arm subsystem?
- What happens when two arm commands compete?
- What do the initialize, interrupt, and finish messages tell you?

## Success Check

- You can explain one concrete command interruption caused by subsystem requirements.
