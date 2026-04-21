# Lesson 25: AI-Assisted Feature Design

Branch: `lesson-25-ai-assisted-feature-design`
How to use this lesson: use the VS Code WPILib command palette and choose `Test Robot Code` and `Simulate Robot Code`

## What This Lesson Is Really About

AI can help draft code, but it is not allowed to replace understanding. This lesson shows students how to ask for a small feature, read the answer carefully, and judge whether the result fits the project they already understand.

## New Words

- prompt: the instructions you give to an AI system
- code review: reading code carefully and checking whether it is correct, clear, and well designed
- testability: how easy it is to verify behavior with tests or simulation

## Goals

- Use AI for a small, reviewable feature instead of an unbounded code dump.
- Review generated design choices against the existing architecture.
- Keep ownership, naming, and testability intact while adding a feature.

## Read First

- `src/main/java/frc/robot/telemetry/RobotStatusPublisher.java`
- `wiki-src/AI-Prompting-and-Code-Review-Checklist.md`

## Focus Questions

- Why is this feature small enough to review carefully?
- Which existing subsystems does it depend on?
- What would make this feature lower quality if it came from AI?

## Success Check

- You can explain the feature in plain English and identify where you would test it.
