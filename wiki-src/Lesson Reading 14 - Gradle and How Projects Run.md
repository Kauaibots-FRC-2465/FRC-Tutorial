# Lesson Reading 14 - Gradle and How Projects Run

## Big Picture

Students use VS Code commands such as `Build Robot Code`, `Test Robot Code`, and `Simulate Robot Code`, but there is still an important question underneath those buttons: what system is actually organizing the project so those tasks can happen? In this course, that system is Gradle. Students do not need to drive Gradle directly from the command line, but they should understand what role it plays.

Gradle is the build tool for the project. A build tool helps define how the code is compiled, how dependencies are downloaded and used, how tests are run, and how outputs are assembled. Students can think of it as part of the project's machinery rather than part of the robot's logic. It tells the tools how to turn the source files into something usable.

Understanding Gradle conceptually matters because it helps students separate robot behavior from project infrastructure. If the build fails, that does not always mean the robot logic is wrong. Sometimes it means the project setup, dependencies, or compile step has a problem. Knowing that difference makes tool output much easier to interpret.

## Key Terms

- build tool: software that organizes compiling, testing, and assembling a project
- task: a named action the build system can perform
- dependency: an outside library the project needs
- composite build: a Gradle setup where one project includes other local Gradle projects
- dependency substitution: a rule that tells Gradle to use a local included project instead of a published library artifact
- workspace file: a VS Code file such as `.code-workspace` that can open several folders together in one workspace
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

## Using Multiple Repositories in One Robot Project

Some teams keep one robot project in a single repository. Other teams split reusable code into several repositories and then bring those repositories together into one robot workspace. Your robot project can still build that way, but the setup is more deliberate. The main robot project has to tell Gradle where the local library projects live, and VS Code has to open those folders in the same workspace so students can actually read and edit them.

One common Gradle approach is a composite build. In that pattern, the robot project's `settings.gradle` uses `includeBuild("../Subsystems/WLED")` or similar paths to include local library projects from nearby folders. In your 2026 robot project, the robot `settings.gradle` includes several local projects such as `../Subsystems/WLED`, `../Subsystems/Limelight`, `../Subsystems/BatteryMonitor`, `../Subsystems/Pinpoint`, `../Subsystems/PoseEstimator`, and `../Utilities`.

Those `includeBuild(...)` calls are paired with `dependencySubstitution(...)`. This tells Gradle that when the robot asks for a module such as `frc.kauaibots.subsystems:wled`, it should use the local included project instead of looking for a separately published copy. In other words, the robot still depends on a named library coordinate, but Gradle is instructed to satisfy that dependency from a nearby local repository.

The robot `build.gradle` then looks normal from the dependency point of view. It can still say `implementation 'frc.kauaibots.subsystems:wled'` or `implementation 'frc.kauaibots.utilities:utilities'`. That is useful because the dependency names stay clear and readable. The special local-linking behavior lives in `settings.gradle`, not scattered all over the code.

Each included library project also needs to define its own identity clearly. In your subsystem repositories, that identity comes from things like `group = 'frc.kauaibots.subsystems'` and `rootProject.name = 'wled'`. Gradle combines those pieces into coordinates such as `frc.kauaibots.subsystems:wled`. That is why the names in the included projects have to match the names the robot project is asking for.

Your robot project also goes one step further in the `jar` task by declaring dependencies on the included builds' `:jar` tasks. That helps make sure the local libraries are built when the main robot JAR is assembled. Students do not need to memorize that pattern immediately, but they should understand the idea: once a project is split into local library repositories, the robot build may need extra coordination to package everything together.

## Gradle Is Only Half of the Setup

Students should know that changing the Gradle files is not enough by itself for a smooth day-to-day workflow. VS Code also needs to open the related folders. A `.code-workspace` file can do that by listing the robot folder and each local library folder in one workspace. In your robot project, the workspace file includes the robot folder plus folders such as `../Subsystems/WLED`, `../Subsystems/Pinpoint`, `../Subsystems/PoseEstimator`, `../Subsystems/BatteryMonitor`, `../Subsystems/Limelight`, and `../Utilities`.

This matters because Gradle can know about those projects even if the editor does not currently have those folders open. If the folders are not in the VS Code workspace, students may still build the project, but they will have a harder time navigating, searching, editing, and understanding the included library code. So the practical rule is this: update the Gradle files so the build knows about the libraries, and update the workspace file so the editor knows about the folders.

## Generated Output and the Build Folder

When Gradle runs tasks, it creates output. That output often goes into the `build` folder. Students should think of these files as generated artifacts, not hand-edited source code. If the build system can regenerate them, they should usually not be treated like normal project files.

This is why `.gitignore` often excludes many generated files. Teams want to keep the repository focused on source and configuration rather than on automatically recreated outputs. Understanding that distinction helps students interpret the file tree more accurately.

## Why Students Should Care

Students do not need to become build engineers to benefit from this lesson. They only need a working mental model. If the editor can build, test, and simulate the project, it is because the project has formal instructions for how those things happen. If one of those steps breaks, the problem may live in project setup as well as in source code.

This perspective also helps students become less dependent on magic. The build button is useful, but it is not magic. It is a named action backed by a build system. That understanding makes the tooling feel more trustworthy and less mysterious.

## Why This Matters For FRC

FRC projects depend heavily on tooling. Libraries, simulation support, tests, deployment, and build outputs all rely on project configuration working correctly. Students who understand Gradle conceptually are better prepared to troubleshoot project-level problems and less likely to confuse build issues with robot logic issues.

This lesson also supports teamwork. When several students are working in the same repository, consistent build behavior matters. A team needs shared project machinery, not just shared source files.

For teams that split code into several repositories, this lesson matters even more. The robot project may look like one codebase when opened in VS Code, but behind the scenes it is actually several Gradle projects and several Git repositories working together. Students who understand that will be much less confused when they switch between robot code, shared utilities, and subsystem libraries.

## Before You Move On

- You should know that Gradle is the build system organizing compile, test, and other project tasks.
- You should understand that the VS Code WPILib commands are using that build system underneath.
- You should know what dependencies, source sets, and generated output are in broad terms.
- You should understand the basic idea of using `includeBuild(...)` and dependency substitution to bring local library repositories into one robot project.
- You should know that opening those library folders in the VS Code workspace is a separate step from editing the Gradle files.
- You should understand why a build problem is not always the same thing as a robot-logic problem.
