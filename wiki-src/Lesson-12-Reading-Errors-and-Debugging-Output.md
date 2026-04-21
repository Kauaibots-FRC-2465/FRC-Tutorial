# Lesson 12: Reading Errors and Debugging Output

Branch: `lesson-12-reading-errors-and-debugging-output`
How to use this lesson: use the VS Code WPILib command palette and choose `Test Robot Code`

## What This Lesson Is Really About

Beginners often see an error message and stop there. This lesson is about learning that error messages and printed output are evidence. If you read them carefully, they tell you where to look and what values mattered.

## New Words

- exception: a runtime error reported by Java
- stack trace: the list of method calls that led to an error
- debug output: printed information that helps you understand what the program did

## Goals

- Read exception messages without panicking.
- Understand why trace output should expose the values behind a decision.
- Build the habit of debugging with evidence instead of guessing.

## Read First

- `src/main/java/frc/tutorial/foundation/DebugTraceExamples.java`
- `src/test/java/frc/tutorial/foundation/ReadingErrorsAndDebuggingOutputTest.java`

## Focus Questions

- What exactly does the exception message tell you?
- Which values would help you reproduce the bug?
- Which parts of the output are useful signal, and which are just noise?

## Success Check

- You can point to the line of output that best explains the failure.
