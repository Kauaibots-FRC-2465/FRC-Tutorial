# Lesson 21: Triggers, Scheduler, and Requirements

Branch: `lesson-21-triggers-scheduler-and-requirements`
Run mode: VS Code WPILib command palette with `Simulate Robot Code`

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
