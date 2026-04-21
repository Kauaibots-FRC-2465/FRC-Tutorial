# Course Map

## Phase 0: Tools

These lessons teach how to open the project, move between lesson snapshots, and find the files that matter first.

- `lesson-00-tooling-and-course-workflow`: open the repository, switch branches with Source Control and Git Graph, and build the project from VS Code.
- `lesson-01-reading-a-java-project`: learn how a Java project is laid out and where the robot program starts.

## Phase 1: Java Reading Foundations

These lessons teach the Java ideas students need in order to read real robot code without guessing.

- `lesson-02-values-variables-and-primitives`: built-in value types such as numbers, true or false values, and single characters.
- `lesson-03-reference-types-wrappers-and-strings`: objects, text, `null`, and the difference between a value and a reference to an object.
- `lesson-04-methods-fields-and-constructors`: how classes store data and do work.
- `lesson-05-control-flow-and-tracing`: how the program chooses what to do next.
- `lesson-06-static-final-enums-and-constants`: fixed values, named states, and class-level information.
- `lesson-07-arrays-lists-and-maps`: common ways to store groups of values.
- `lesson-08-generics-and-common-type-patterns`: how Java writes one container shape that can hold different kinds of data safely.
- `lesson-09-interfaces-access-and-composition`: how classes work together without being tightly glued to one implementation.
- `lesson-10-lambdas-method-references-and-providers`: ways to ask for the current value later instead of storing one old value now.
- `lesson-11-mutability-immutability-and-object-lifetime`: what can change, what should stay fixed, and why that matters.
- `lesson-12-reading-errors-and-debugging-output`: how to learn from error messages and printed output.
- `lesson-13-unit-tests-and-test-doubles`: how to check behavior automatically without needing real robot hardware.

## Phase 2: Project Tools and Git

These lessons explain the tools that keep the project organized and runnable.

- `lesson-14-gradle-and-how-projects-run`: what the build system does when you build, test, or simulate the project.
- `lesson-15-git-for-working-programmers`: how to move between branches and save your own work safely using Source Control and Git Graph.

Lessons `00` through `15` are the Java-first block of the course. Students who already know Java can often move through that block faster, but lesson `16` is the intended common starting point for the FRC-specific framework lessons.

## Phase 3: WPILib and Command-Based Design

These lessons move from plain Java into the structure that real FRC robot projects use. WPILib is the main software library used in FRC robot programs. Command-based is a common WPILib style built around subsystems and commands.

- `lesson-16-reading-a-command-based-project`: the standard parts of a WPILib robot project and what each part is for.
- `lesson-17-robot-lifecycle-and-telemetry`: what the robot does in each mode and how it reports useful information to humans.
- `lesson-18-fake-io-and-hardware-boundaries`: how to keep robot logic separate from hardware-specific code.
- `lesson-19-subsystems-and-state-ownership`: which class should be responsible for which robot facts and decisions.
- `lesson-20-commands-basics-and-default-behavior`: how commands tell subsystems what to do during normal driving.
- `lesson-21-triggers-scheduler-and-requirements`: how button-like events start commands and how WPILib prevents command conflicts.
- `lesson-22-command-composition-and-autonomous`: how to combine small actions into a full autonomous routine.
- `lesson-23-sensors-units-and-data-flow`: how measurements move through the program and how units reduce mistakes.
- `lesson-24-wpilib-simulation`: how simulated motors and sensors let the code run on a laptop.

## Phase 4: AI and Integration

These lessons show how to use AI carefully and how to read the final project as one system.

- `lesson-25-ai-assisted-feature-design`: using AI for small, explainable changes instead of blindly accepting large code dumps.
- `lesson-26-integrated-tutorial-robot`: reading, running, testing, and safely modifying the full tutorial robot.
