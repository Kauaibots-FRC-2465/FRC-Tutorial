# FRC Java Tutorial

This wiki supports a branch-based course for learning how to read, test, and modify FRC robot code in Java.

It is written for students who may be completely new to Java and new to robot code. Each lesson lives on its own Git branch. In this course, a branch is just a saved version of the project for one lesson. WPILib is the main software library used in FRC robot programs.

## How To Use The Course

1. Clone the repository. Cloning means making your own copy of the project on your computer.
2. Open the VS Code Source Control view in the activity bar and use Git Graph or the branch picker to switch to the branch for the lesson you want. That branch is the saved version of the code for that lesson.
3. Read the matching wiki page.
4. Run the project with the steps listed on that page.
5. Make small changes and check the result before moving on.

## Course Structure

- Tools and workflow come first, so students can actually open and run the lessons.
- Java reading foundations come next, so the syntax is less mysterious.
- Gradle and Git basics are taught before team work depends on them.
- WPILib and command-based robot structure come after students can already read Java. Command-based is a common WPILib project style built around subsystems and commands.
- Fake IO and simulation come before any real robot is required.
- AI-assisted design comes near the end, after students can check code carefully and explain what it does.

## Core Tools

- Source Control view: the Git view in the VS Code activity bar.
- Git Graph: the branch and history viewer used in this course.
- Branch picker: the VS Code control that lets you switch to a different lesson branch.
- `Ctrl+Shift+P`: open the VS Code command palette.
- `WPILib: Open WPILib Command Palette`: open the list of WPILib actions in VS Code.
- `Build Robot Code`: check whether the code can be turned into a program successfully.
- `Test Robot Code`: run small automatic checks called tests.
- `Simulate Robot Code`: run the robot code on your computer without a real robot.

## Main Reference Pages

- `Course-Map`
- `Glossary-Java-and-FRC`
- `Git-and-Gradle-Cheat-Sheet`
- `AI-Prompting-and-Code-Review-Checklist`

Each `Lesson-*` page is the short course guide page. Each lesson also has a matching `Lesson-XX-Reading-*` page with the longer student reading for that lesson. The reading pages are named to sit beside the lesson guide pages in the wiki menu.

## Lessons

- `Lesson-00-Tooling-and-Course-Workflow`
- `Lesson-01-Reading-a-Java-Project`
- `Lesson-02-Values-Variables-and-Primitives`
- `Lesson-03-Reference-Types-Wrappers-and-Strings`
- `Lesson-04-Methods-Fields-and-Constructors`
- `Lesson-05-Control-Flow-and-Tracing`
- `Lesson-06-Static-Final-Enums-and-Constants`
- `Lesson-07-Arrays-Lists-and-Maps`
- `Lesson-08-Generics-and-Common-Type-Patterns`
- `Lesson-09-Interfaces-Access-and-Composition`
- `Lesson-10-Lambdas-Method-References-and-Providers`
- `Lesson-11-Mutability-Immutability-and-Object-Lifetime`
- `Lesson-12-Reading-Errors-and-Debugging-Output`
- `Lesson-13-Unit-Tests-and-Test-Doubles`
- `Lesson-14-Gradle-and-How-Projects-Run`
- `Lesson-15-Git-for-Working-Programmers`
- `Lesson-16-Reading-a-Command-Based-Project`
- `Lesson-17-Robot-Lifecycle-and-Telemetry`
- `Lesson-18-Fake-IO-and-Hardware-Boundaries`
- `Lesson-19-Subsystems-and-State-Ownership`
- `Lesson-20-Commands-Basics-and-Default-Behavior`
- `Lesson-21-Triggers-Scheduler-and-Requirements`
- `Lesson-22-Command-Composition-and-Autonomous`
- `Lesson-23-Sensors-Units-and-Data-Flow`
- `Lesson-24-WPILib-Simulation`
- `Lesson-25-AI-Assisted-Feature-Design`
- `Lesson-26-Integrated-Tutorial-Robot`
