# FRC Java Tutorial

This repository is a step-by-step course for learning how to read, test, and modify FRC robot code in Java.

It is written for students who may be completely new to Java. The course begins with the minimum tools needed to open the project and move between lessons. After that, it teaches how to read Java, then how to read and change WPILib robot code. WPILib is the main software library used in FRC robot programs.

Each lesson lives on its own Git branch. In this course, a branch is just a saved version of the project for one lesson. When you switch branches, you are switching to a different lesson snapshot.

## How To Use This Repository

1. Clone the repository. Cloning means making your own copy of the project on your computer.
2. Open the VS Code Source Control view in the activity bar and use Git Graph or the branch picker to switch to the branch for the lesson you want. That branch is the saved version of the code for that lesson.
3. Open the project in VS Code with the WPILib extension installed. The WPILib extension adds the robot-specific actions used in this course.
4. Run the lesson using the VS Code command palette steps introduced in lesson 0:
   - `WPILib: Open WPILib Command Palette`: opens the list of WPILib actions in VS Code.
   - `Build Robot Code`: checks whether the code can be turned into a program successfully.
   - `Test Robot Code`: runs small automatic checks called tests.
   - `Simulate Robot Code`: runs the robot code on your computer without needing a real robot.

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

Most lessons are designed to run without a real robot. Early lessons use plain Java code and tests. A test is a small program that checks whether code behaves the way you expect. Later lessons use fake inputs, dashboard output, and WPILib simulation. Fake inputs are stand-ins for things like controllers or sensors. Dashboard output means values shown on screen so humans can see what the program is doing. Simulation means the computer pretends to be the robot well enough for you to study behavior.

Students should use VS Code for both Git and WPILib tasks. Use the Source Control view and Git Graph for Git work, and use the WPILib command palette instead of typing Gradle commands in a terminal.
