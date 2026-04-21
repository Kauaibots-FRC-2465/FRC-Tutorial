# Lesson 09: Interfaces, Access, and Composition

Branch: `lesson-09-interfaces-access-and-composition`
Student Reading: [Student Lesson 09: Interfaces, Access, and Composition](Student-Lesson-09-Interfaces-Access-and-Composition)
How to use this lesson: use the VS Code WPILib command palette and choose `Test Robot Code`

## What This Lesson Is Really About

Programs become easier to test and reuse when classes depend on clear promises instead of one hard-coded implementation. This lesson introduces interfaces and composition so students can see how classes cooperate.

## New Words

- interface: a Java type that says what methods must exist, without storing the full implementation
- access modifier: a Java keyword such as `public` or `private` that controls who can use something
- composition: building a class by having it use another class
- inheritance: building a class by extending another class

## Goals

- Read an interface as a contract.
- Understand composition as "one class uses another" instead of inheritance by default.
- See why robot code often depends on abstractions instead of one concrete class.

## Read First

- `src/main/java/frc/tutorial/foundation/DriverInput.java`
- `src/main/java/frc/tutorial/foundation/FixedDriverInput.java`
- `src/main/java/frc/tutorial/foundation/DriveRequestCalculator.java`
- `src/test/java/frc/tutorial/foundation/InterfacesAccessAndCompositionTest.java`

## Focus Questions

- Which class owns the calculation?
- Which class supplies the data?
- Why is the calculator easier to test because it depends on an interface?

## Success Check

- You can explain composition without needing inheritance vocabulary.
