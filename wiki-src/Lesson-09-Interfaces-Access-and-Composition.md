# Lesson 09: Interfaces, Access, and Composition

Branch: `lesson-09-interfaces-access-and-composition`
Run mode: VS Code WPILib command palette with `Test Robot Code`

## Goals

- Read an interface as a contract.
- Understand composition as “one class uses another” instead of inheritance by default.
- See why robot code often depends on abstractions instead of one concrete class.

## Read First

- `src/main/java/frc/tutorial/foundation/DriverInput.java`
- `src/main/java/frc/tutorial/foundation/FixedDriverInput.java`
- `src/main/java/frc/tutorial/foundation/DriveRequestCalculator.java`
- `src/test/java/frc/tutorial/foundation/InterfacesAccessAndCompositionTest.java`

## Focus Questions

- Which class owns the algorithm?
- Which class supplies data?
- Why is the calculator easier to test because it depends on an interface?

## Success Check

- You can explain composition without using inheritance vocabulary.
