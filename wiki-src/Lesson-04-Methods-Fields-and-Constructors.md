# Lesson 04: Methods, Fields, and Constructors

Branch: `lesson-04-methods-fields-and-constructors`
How to use this lesson: use the VS Code WPILib command palette and choose `Test Robot Code`

## What This Lesson Is Really About

Classes are easier to understand when you separate the data they store from the work they do. This lesson shows how fields store data, methods do work, and constructors create usable objects.

## New Words

- class: a blueprint for making objects
- field: a variable stored inside an object
- method: a named block of code that does work
- constructor: the code that runs when a new object is created
- parameter: a value that a method or constructor receives from the caller

## Goals

- Read a simple class with fields and methods.
- Understand what a constructor actually does.
- See how one object can bundle robot data and related behavior.

## Read First

- `src/main/java/frc/tutorial/foundation/ShooterPreset.java`
- `src/test/java/frc/tutorial/foundation/MethodsFieldsAndConstructorsTest.java`

## Constructor Best Practices

A constructor's first job is to create one valid object. In most beginner Java code, that means the constructor should mostly do simple work that belongs to that object.

Usually good constructor work:

- store parameter values into fields
- check that required values make sense
- set simple default values owned by that object

Usually risky constructor work:

- reaching into many other objects to ask for information
- assuming some other object has already finished setting itself up
- doing work that depends on the whole robot already being assembled
- starting behavior that would be safer to start later

Why this matters: construction order is the order objects get created. If object `A` tries to use object `B` during construction, but `B` is not fully ready yet, the program can behave strangely or fail during startup.

A common safe pattern is:

1. create the objects
2. store the required outside objects in fields
3. run an `initialize()`, `configure()`, or similar setup step after everything has been created

That pattern is especially useful in robot code, where several subsystems, controllers, and helper classes may need to know about each other.

It is not wrong to use an outside object in a constructor if you know it already exists and is ready. The risky part is depending on that by accident instead of by design.

## Focus Questions

- Which values belong to the object?
- Which values come in as parameters?
- Which methods just report information, and which methods calculate something?
- Which constructor work is simple field setup, and which work would be safer in a later setup step?

## Success Check

- You can describe how one `ShooterPreset` object is built and used.
