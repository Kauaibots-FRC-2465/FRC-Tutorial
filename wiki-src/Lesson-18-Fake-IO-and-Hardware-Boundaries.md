# Lesson 18: Fake IO and Hardware Boundaries

Branch: `lesson-18-fake-io-and-hardware-boundaries`
How to use this lesson: use the VS Code WPILib command palette and choose `Simulate Robot Code`

## What This Lesson Is Really About

Robot code becomes much easier to test when the part that makes decisions is separated from the part that talks to motors and sensors. This lesson explains that separation and shows how fake IO lets a laptop stand in for hardware.

## New Words

- IO: short for input and output, meaning the code that talks to hardware
- hardware boundary: the line between robot logic and hardware-specific code
- fake IO: a non-hardware version of an IO class used for testing or simulation

## Goals

- Separate robot logic from hardware-like behavior.
- Understand why IO interfaces make laptop development possible.
- Use dashboard controls to drive the robot without a real controller.

## Read First

- `src/main/java/frc/robot/io`
- `src/main/java/frc/robot/controls`
- `src/main/java/frc/robot/RobotContainer.java`

## Focus Questions

- Which classes define the boundary between logic and hardware?
- Which classes fake that boundary?
- Why is this easier to test and teach than direct hardware calls everywhere?

## Success Check

- You can explain how the same subsystem can run with different IO implementations.
