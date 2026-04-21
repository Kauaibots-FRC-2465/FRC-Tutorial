# Lesson 10: Lambdas, Method References, and Providers

Branch: `lesson-10-lambdas-method-references-and-providers`
Run mode: `.\gradlew.bat test`

## Goals

- Read lambdas and method references without freezing on syntax.
- Understand a provider as “ask for the current value when needed.”
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
