# Lesson Overview 13 - Unit Tests and Test Doubles

Branch: `lesson-13-unit-tests-and-test-doubles`
Reading Page: [Lesson Reading 13 - Unit Tests and Test Doubles](<Lesson Reading 13 - Unit Tests and Test Doubles>)
How to use this lesson: use the VS Code WPILib command palette and choose `Test Robot Code`

## What This Lesson Is Really About

Tests are not just a way to catch bugs after the fact. They are also a clear way to describe expected behavior. This lesson shows how fake inputs let us test logic without needing a robot on the table.

## New Words

- unit test: a small automatic check of one behavior
- test double: a fake replacement for something real
- dependency: something one class needs in order to do its job

## Goals

- Treat tests as executable explanations of behavior.
- See how fake inputs remove the need for real hardware.
- Connect interface-based design to testability.

## Read First

- `src/test/java/frc/tutorial/foundation/FakeDriverInput.java`
- `src/test/java/frc/tutorial/foundation/UnitTestsAndTestDoublesTest.java`

## Focus Questions

- What is the real dependency?
- What does the fake replace?
- Why is this test still useful even though it never touches a controller?

## Success Check

- You can explain why fake inputs are a normal engineering tool, not a shortcut.
