# Lesson 26: Integrated Tutorial Robot

Branch: `lesson-26-integrated-tutorial-robot`
Student Reading: [Student Lesson 26: Integrated Tutorial Robot](Student-Lesson-26-Integrated-Tutorial-Robot)
How to use this lesson: use the VS Code WPILib command palette and choose `Test Robot Code` and `Simulate Robot Code`

## What This Lesson Is Really About

This final lesson is where students stop looking at isolated topics and start reading the whole project as one system. The goal is to leave the course able to explain the project, run it, and make one careful change without breaking everything else.

## New Words

- integration: making many project parts work together
- pure logic: code that makes decisions without talking directly to hardware
- safe modification: a change small enough that you can explain it and verify it

## Goals

- Read the whole tutorial project as one coherent system.
- Verify that the code still supports tests, fake IO, telemetry, commands, and simulation.
- Finish with a project shape that students could realistically modify on a team.

## Read First

- `course/Course-Map.md`
- `src/main/java/frc/robot`
- `src/test/java/frc/robot/telemetry/RobotStatusPublisherTest.java`

## Focus Questions

- Which parts of the project are pure logic?
- Which parts talk to IO or simulation?
- Which pieces would you extend first for a new robot feature?

## Success Check

- You can describe the project structure, run the tests, and make one safe modification.
