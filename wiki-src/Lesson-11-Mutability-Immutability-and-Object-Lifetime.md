# Lesson 11: Mutability, Immutability, and Object Lifetime

Branch: `lesson-11-mutability-immutability-and-object-lifetime`
Run mode: `.\gradlew.bat test`

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
