# 08 Lesson Overview: Generics and Common Type Patterns

Branch: `lesson-08-generics-and-common-type-patterns`
Reading Page: [08 Reading Material: Generics and Common Type Patterns](<08 Reading Material - Generics and Common Type Patterns>)
How to use this lesson: use the VS Code WPILib command palette and choose `Test Robot Code`

## What This Lesson Is Really About

Generics let Java describe a container shape once and then reuse it with different kinds of data. This lesson is here so students stop seeing angle brackets as visual noise and start reading what they mean.

## New Words

- generic type: a class or method that works with a type supplied later
- type parameter: the placeholder name inside a generic type, such as `T`
- container: a class whose job is to hold one or more values

## Goals

- Read a generic type without treating the angle brackets as noise.
- See how one class can safely store different kinds of values.
- Connect generic thinking to FRC APIs that use typed containers.

## Read First

- `src/main/java/frc/tutorial/foundation/NamedValue.java`
- `src/test/java/frc/tutorial/foundation/GenericsAndCommonTypePatternsTest.java`

## Focus Questions

- What does `T` stand for in this class?
- What changes when the type parameter changes?
- What stays the same?

## Success Check

- You can explain what `NamedValue<ShooterPreset>` means in plain English.

