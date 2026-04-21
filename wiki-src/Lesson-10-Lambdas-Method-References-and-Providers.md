# Lesson 10: Lambdas, Method References, and Providers

Branch: `lesson-10-lambdas-method-references-and-providers`
Student Reading: [Student Lesson 10: Lambdas, Method References, and Providers](Student-Lesson-10-Lambdas-Method-References-and-Providers)
How to use this lesson: use the VS Code WPILib command palette and choose `Test Robot Code`

## What This Lesson Is Really About

Sometimes a class should store a value. Other times it should ask for the current value later. This lesson introduces lambdas, method references, and providers because FRC code uses them constantly for controller input and live robot data.

## New Words

- lambda: a short way to write a small piece of behavior inline
- method reference: a short way to point at an existing method
- provider: code that gives you the current value when you ask for it

## Goals

- Read lambdas and method references without freezing on the syntax.
- Understand a provider as "ask for the current value when needed."
- Connect providers to controller input, chooser values, and state queries.

## Read First

- `src/main/java/frc/tutorial/foundation/ProviderDrivenShooter.java`
- `src/main/java/frc/tutorial/foundation/ReadyState.java`
- `src/test/java/frc/tutorial/foundation/LambdasMethodReferencesAndProvidersTest.java`

## Focus Questions

- Which values are stored directly?
- Which values are looked up later through a provider?
- Why does delayed lookup matter in robot code?

## Success Check

- You can explain the difference between handing a class a value and handing it a provider.
