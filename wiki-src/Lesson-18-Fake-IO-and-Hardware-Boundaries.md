# Lesson 18: Fake IO and Hardware Boundaries

Branch: `lesson-18-fake-io-and-hardware-boundaries`
Run mode: VS Code WPILib command palette with `Simulate Robot Code`

## Goals

- Separate robot logic from hardware-like behavior.
- Understand why IO interfaces make laptop development possible.
- Use dashboard controls to drive the robot without a real controller.

## Read First

- `src/main/java/frc/robot/io`
- `src/main/java/frc/robot/controls`
- `src/main/java/frc/robot/RobotContainer.java`

## Focus Questions

- Which classes define the boundary?
- Which classes fake the boundary?
- Why is this easier to test and teach than direct hardware calls everywhere?

## Success Check

- You can explain how the same subsystem can run with different IO implementations.
