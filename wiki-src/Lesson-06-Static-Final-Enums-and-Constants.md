# Lesson 06: Static, Final, Enums, and Constants

Branch: `lesson-06-static-final-enums-and-constants`
How to use this lesson: use the VS Code WPILib command palette and choose `Test Robot Code`

## What This Lesson Is Really About

Robot projects often contain values that should stay fixed and named states that should be easy to read. This lesson explains the Java tools teams use for that job.

## New Words

- `static`: belongs to the class itself instead of one object
- `final`: cannot be reassigned after setup
- enum: a small fixed set of named choices
- constant: a value that is meant to stay the same unless you intentionally edit the code

## Goals

- Read `static final` values confidently.
- Understand why enums are common in robot code.
- Recognize when a value belongs to the class instead of one object.

## Read First

- `src/main/java/frc/tutorial/foundation/RobotProfiles.java`
- `src/main/java/frc/tutorial/foundation/ArmPosition.java`
- `src/test/java/frc/tutorial/foundation/StaticFinalEnumsAndConstantsTest.java`

## Focus Questions

- Which values are intended to stay fixed?
- Why use named states instead of raw strings?
- Where do constants help reduce mistakes?

## Success Check

- You can explain why robot projects often gather constants and named states in clear places.
