# Lesson 00 Reading: Tooling and Course Workflow

## Big Picture

Before students can learn Java or robot programming, they need to know how to open the project, switch to the correct lesson, and run the code safely. That may sound simple, but it matters a lot. If a student does not know whether they are looking at the right branch, whether the project built successfully, or whether the simulator is still using old code, then even good programming ideas become confusing. The first job of this course is to make the learning environment predictable.

This course uses one Git repository with many lesson branches. A repository is the full project and its saved history. A branch is one version of that project. In this course, a branch is usually a checkpoint for one lesson. When a student switches branches, they are not opening a different folder. They are telling Git to replace the current project files with a different saved version. That is why branch switching is so important. If the wrong branch is open, a student may be reading the wrong code and draw the wrong conclusion.

The main tool students will use is VS Code with the WPILib extension. VS Code is the editor. WPILib adds FRC-specific commands so students can build, test, simulate, and deploy robot projects. The Source Control view and Git Graph are the course tools for Git. Students do not need to use command-line Git for normal class work. What they do need is a calm, repeatable routine for checking which branch is active, switching branches, and seeing whether they have changed any files.

## Key Terms

- repository: the whole project plus its saved history
- branch: one saved line of development in a repository
- clone: making a copy of a repository on your computer
- build: turning source code into a program and checking whether it compiles
- test: running automatic checks that compare actual behavior to expected behavior
- simulation: running robot code on a computer without a real robot

## The Course Workflow

Most lessons in this course follow the same sequence. First, switch to the correct lesson branch. Second, read the lesson guide and the longer reading page. Third, run the lesson in the way that page recommends. Sometimes that means building the code. Sometimes it means running tests. Later in the course, it may mean launching the simulator. Only after the starting point works should students begin making changes.

That order is important because it answers a basic question before students edit anything: "Did this project already work before I touched it?" If the answer is yes, then a new problem probably came from the new change. If the answer is no, then the student has learned something valuable too: the branch may not be the right one, the project may not have loaded correctly, or the build may have failed before their own edits started. This is a simple habit, but it saves a lot of time.

Students should also get used to making small changes instead of large ones. If one small edit breaks the build, the cause is usually easy to find. If ten edits happen at once, the cause becomes harder to track down. Good programmers are not people who never make mistakes. Good programmers are people who make mistakes in a way that is easy to investigate and correct.

## What the Main Tools Actually Do

The Source Control view shows whether files have changed. That matters because a student may switch branches, edit a file, forget about the edit, and then be surprised later when Git says the working tree is not clean. Git Graph gives a picture of branches and commits. It helps students see that a branch is not magic. It is simply a named point in the project's history. The branch picker in VS Code is the fast way to move from one lesson snapshot to another.

The WPILib command palette is the safer student-facing way to run FRC project tasks. `Build Robot Code` checks whether the project compiles. `Test Robot Code` runs the automated tests for that lesson. `Simulate Robot Code` starts a robot simulation on the computer. Students do not need to memorize how Gradle performs those tasks internally right away. They only need to know what result each command is supposed to produce and how to tell whether it succeeded.

Students should learn to watch for clear signals after running a command. A successful build usually ends without compile errors. A successful test run reports that tests passed. A successful simulation launches the robot program and keeps it running until the student stops it. Looking for those outcomes trains students to connect an action with an expected result instead of clicking commands mechanically.

## Good Habits From Day One

One important habit is checking the active branch before reading or editing code. Another is reading the output after a build or test instead of immediately closing it. Students should also learn to stop and reset their thinking when the environment behaves differently than expected. Sometimes the problem is not the code concept in the lesson. Sometimes the real issue is that the wrong branch is open, the simulator is still running old code, or a local file changed the project state.

Another good habit is asking simple process questions early. "Am I on the right branch?" "Did the build pass before I changed anything?" "Did I run the lesson the way the page told me to?" Those are strong questions, not weak ones. Programming often feels hard because several small misunderstandings stack on top of each other. Process habits help remove those misunderstandings before they grow.

## Why This Matters For FRC

FRC programming is not only about writing code. It is also about running, checking, testing, simulating, and revising code under time pressure. During build season, students often have limited time with the robot. That means a lot of learning and debugging has to happen away from the machine. If students can open a branch, build a project, run tests, and launch simulation confidently, they can keep learning even when the robot is not available.

The same habits also help teamwork. If everyone on the team understands what a branch is, what it means for the code to build, and how to tell whether a lesson starts from a clean state, then conversations become clearer. Students can explain not just what they changed, but where they were working and how they checked that it behaved correctly.

## Before You Move On

- You should know what a repository, branch, build, test, and simulation are.
- You should understand why each lesson starts by switching to the correct branch and running the project before editing it.
- You should be comfortable using VS Code Source Control, Git Graph, and the WPILib command palette as the main course tools.
