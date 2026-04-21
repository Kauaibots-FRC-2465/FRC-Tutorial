# FRC Java Tutorial

This repository is a branch-based course for learning how to read, understand, test, and modify FRC robot code in Java.

The course is written for students who are new to Java. It starts with the minimum tools needed to work in the repository, then builds Java reading skills, then moves into WPILib and command-based robot structure.

## How To Use This Repository

1. Clone the repository.
2. Switch to the branch for the lesson you want.
3. Open the project in VS Code with the WPILib extension installed.
4. Run the lesson using one of the workflows introduced in lesson 0:
   - `.\gradlew.bat test`
   - `.\gradlew.bat simulateJava`
   - VS Code: `WPILib: Simulate Robot Code`

## Planned Lesson Branches

- `lesson-00-tooling-and-course-workflow`
- `lesson-01-reading-a-java-project`
- `lesson-02-values-variables-and-primitives`
- `lesson-03-reference-types-wrappers-and-strings`
- `lesson-04-methods-fields-and-constructors`
- `lesson-05-control-flow-and-tracing`
- `lesson-06-static-final-enums-and-constants`
- `lesson-07-arrays-lists-and-maps`
- `lesson-08-generics-and-common-type-patterns`
- `lesson-09-interfaces-access-and-composition`
- `lesson-10-lambdas-method-references-and-providers`
- `lesson-11-mutability-immutability-and-object-lifetime`
- `lesson-12-reading-errors-and-debugging-output`
- `lesson-13-unit-tests-and-test-doubles`
- `lesson-14-gradle-and-how-projects-run`
- `lesson-15-git-for-working-programmers`
- `lesson-16-reading-a-command-based-project`
- `lesson-17-robot-lifecycle-and-telemetry`
- `lesson-18-fake-io-and-hardware-boundaries`
- `lesson-19-subsystems-and-state-ownership`
- `lesson-20-commands-basics-and-default-behavior`
- `lesson-21-triggers-scheduler-and-requirements`
- `lesson-22-command-composition-and-autonomous`
- `lesson-23-sensors-units-and-data-flow`
- `lesson-24-wpilib-simulation`
- `lesson-25-ai-assisted-feature-design`
- `lesson-26-integrated-tutorial-robot`

## Expectations

Most lessons are designed to run without a real robot. Early lessons use plain Java code and tests. Later lessons use fake inputs, dashboard output, and WPILib simulation. Hardware is optional.
