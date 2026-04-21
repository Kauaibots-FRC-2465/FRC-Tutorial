# Lesson 25: AI-Assisted Feature Design

Branch: `lesson-25-ai-assisted-feature-design`
Run mode: `.\gradlew.bat test` and `.\gradlew.bat simulateJava`

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
