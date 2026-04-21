# Lesson Overview 11 - Mutability, Immutability, and Object Lifetime

Branch: `lesson-11-mutability-immutability-and-object-lifetime`
Reading Page: [Lesson Reading 11 - Mutability, Immutability, and Object Lifetime](<Lesson Reading 11 - Mutability, Immutability, and Object Lifetime>)
How to use this lesson: use the VS Code WPILib command palette and choose `Test Robot Code`

## What This Lesson Is Really About

Some bugs happen because data changes in more places than you expected. This lesson is about understanding which objects can change, which ones stay fixed, and why that difference matters when many parts of a robot program share data.

## New Words

- mutable: able to change after the object is created
- immutable: not able to change after the object is created
- aliasing: two variables pointing at the same mutable object
- object lifetime: how long an object exists before it can be discarded

## Goals

- See how shared mutable state creates surprises.
- Understand why immutable request objects are easier to reason about.
- Connect object lifetime to garbage collection at a practical level.

## Read First

- `src/main/java/frc/tutorial/foundation/MutableMatchState.java`
- `src/main/java/frc/tutorial/foundation/DriveCommandRequest.java`
- `src/test/java/frc/tutorial/foundation/MutabilityImmutabilityAndObjectLifetimeTest.java`

## Focus Questions

- Which object changes after construction?
- Which object never changes?
- Why does aliasing matter when two variables point at the same mutable object?

## Success Check

- You can identify which objects are safer to share broadly and which need tighter control.
