# Lesson 14 Reading: Gradle and How Projects Run

## Big Picture

Students use VS Code commands such as `Build Robot Code`, `Test Robot Code`, and `Simulate Robot Code`, but there is still an important question underneath those buttons: what system is actually organizing the project so those tasks can happen? In this course, that system is Gradle. Students do not need to drive Gradle directly from the command line, but they should understand what role it plays.

Gradle is the build tool for the project. A build tool helps define how the code is compiled, how dependencies are downloaded and used, how tests are run, and how outputs are assembled. Students can think of it as part of the project's machinery rather than part of the robot's logic. It tells the tools how to turn the source files into something usable.

Understanding Gradle conceptually matters because it helps students separate robot behavior from project infrastructure. If the build fails, that does not always mean the robot logic is wrong. Sometimes it means the project setup, dependencies, or compile step has a problem. Knowing that difference makes tool output much easier to interpret.

## Key Terms

- build tool: software that organizes compiling, testing, and assembling a project
- task: a named action the build system can perform
- dependency: an outside library the project needs
- source set: a grouped part of the project such as main code or test code
- artifact: generated output produced by the build
- wrapper: project files that let the correct Gradle version run consistently

## What Gradle Is Doing

Gradle defines the steps needed to work with the project. Building means compiling the source files and checking whether they make sense together. Testing means running the automated test code. Other tasks may package artifacts or prepare code for deployment and simulation. Students do not have to remember every task name to benefit from this idea. The key is that the project already has a formal recipe for how these actions are supposed to happen.

When students use the WPILib command palette, they are using a student-friendly front end for those underlying build tasks. This is why the command palette can reliably trigger building, testing, and simulation without students typing raw Gradle commands. The editor is calling into the build system on the student's behalf.

## Dependencies and Project Setup

Most real Java projects depend on libraries that are not written inside the local project. FRC projects depend on WPILib and often on vendor libraries as well. Gradle helps manage those dependencies so the project knows what code it is allowed to use and where those libraries fit into the build.

This matters because a Java file may compile only if the correct libraries are available. If a class is missing, the cause may not be that the student typed the class name wrong. The cause may be that the project setup or dependency configuration is incomplete. Students do not need deep Gradle knowledge to recognize that this class of problem exists.

Gradle also helps keep the project structure organized. Main code and test code live in different source sets. That separation is not arbitrary. It helps the build system know which files are part of the robot program and which are part of the testing layer.

## Generated Output and the Build Folder

When Gradle runs tasks, it creates output. That output often goes into the `build` folder. Students should think of these files as generated artifacts, not hand-edited source code. If the build system can regenerate them, they should usually not be treated like normal project files.

This is why `.gitignore` often excludes many generated files. Teams want to keep the repository focused on source and configuration rather than on automatically recreated outputs. Understanding that distinction helps students interpret the file tree more accurately.

## Why Students Should Care

Students do not need to become build engineers to benefit from this lesson. They only need a working mental model. If the editor can build, test, and simulate the project, it is because the project has formal instructions for how those things happen. If one of those steps breaks, the problem may live in project setup as well as in source code.

This perspective also helps students become less dependent on magic. The build button is useful, but it is not magic. It is a named action backed by a build system. That understanding makes the tooling feel more trustworthy and less mysterious.

## Why This Matters For FRC

FRC projects depend heavily on tooling. Libraries, simulation support, tests, deployment, and build outputs all rely on project configuration working correctly. Students who understand Gradle conceptually are better prepared to troubleshoot project-level problems and less likely to confuse build issues with robot logic issues.

This lesson also supports teamwork. When several students are working in the same repository, consistent build behavior matters. A team needs shared project machinery, not just shared source files.

## Before You Move On

- You should know that Gradle is the build system organizing compile, test, and other project tasks.
- You should understand that the VS Code WPILib commands are using that build system underneath.
- You should know what dependencies, source sets, and generated output are in broad terms.
- You should understand why a build problem is not always the same thing as a robot-logic problem.
