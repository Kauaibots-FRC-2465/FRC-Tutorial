# 14 Lesson Overview: Gradle and How Projects Run

Branch: `lesson-14-gradle-and-how-projects-run`
Reading Page: [14 Reading Material: Gradle and How Projects Run](<14 Reading Material - Gradle and How Projects Run>)
How to use this lesson: use VS Code and the WPILib command palette

## What This Lesson Is Really About

Students do not need to become Gradle experts, but they do need a mental model of what the build system is doing. This lesson explains what changes when you build, test, or simulate the project.

## New Words

- Gradle: the build tool used by this project
- build tool: software that compiles code, runs tests, and manages project setup
- dependency: another library the project needs in order to work
- composite build: a Gradle setup that includes other local Gradle projects
- workspace file: a VS Code file that can open several folders together

## Goals

- Understand what Gradle is doing when the project builds.
- Read `build.gradle` without needing to master every line.
- Recognize the basic pattern for pulling local library repositories into one robot project.
- Understand that the VS Code workspace also has to include those folders.
- Use the common project actions confidently through VS Code.

## Read First

- `build.gradle`
- `settings.gradle`
- `course/Gradle-Cheat-Sheet.md`

## Focus Questions

- Where do dependencies come from?
- How can a robot project use local library repositories from nearby folders?
- Why is editing `settings.gradle` not enough by itself if the team wants to work on those libraries in VS Code?
- Which WPILib actions compile, test, and simulate the project?
- Which errors are build-setup problems and which are Java problems?

## Success Check

- You can explain what changes when you choose `Build Robot Code`, `Test Robot Code`, and `Simulate Robot Code`.

