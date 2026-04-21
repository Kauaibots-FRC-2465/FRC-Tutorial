# Lesson 22: Command Composition and Autonomous

Branch: `lesson-22-command-composition-and-autonomous`
How to use this lesson: use the VS Code WPILib command palette and choose `Simulate Robot Code`

## What This Lesson Is Really About

Autonomous routines are not one giant block of code. They are usually built by combining smaller commands. This lesson teaches how those pieces are arranged and how the driver station can choose between routines.

## New Words

- autonomous: the robot mode where the robot follows pre-planned actions without driver input
- sequence: commands that run one after another
- parallel: commands that run at the same time
- chooser: a dashboard tool that lets humans pick between options

## Goals

- Read composed autonomous routines.
- Understand sequence, deadline, timeout, and chooser-based selection.
- Connect small commands into a structured autonomous plan.

## Read First

- `src/main/java/frc/robot/commands/Autos.java`
- `src/main/java/frc/robot/RobotContainer.java`

## Focus Questions

- What order does each autonomous routine follow?
- Which commands run together, and which wait for others?
- How does the chooser connect dashboard selection to the robot?

## Success Check

- You can trace the full action order of `Score and Leave`.
