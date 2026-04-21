# Git and Gradle Cheat Sheet

## Git

Git keeps a history of the code. In this course, each lesson lives on its own branch, which means its own saved version of the project.

Students should use the VS Code Source Control view in the activity bar and the Git Graph extension instead of typing Git commands in the terminal.

- Source Control view: the place in VS Code where you see changed files, staged files, and the commit message box
- Git Graph: the branch and history viewer used in this course
- Branch picker: the VS Code control used to switch to a different lesson branch
- Stage: mark a file for the next commit
- Commit: save a snapshot of your work with a message

## VS Code and WPILib

Use VS Code and the WPILib extension instead of typing Gradle commands directly.

- Open the command palette with `Ctrl+Shift+P`
- Run `WPILib: Open WPILib Command Palette`
- Choose `Build Robot Code` to compile the project, which means turning the Java code into a program
- Choose `Test Robot Code` to run unit tests, which are small automatic checks of behavior
- Choose `Simulate Robot Code` to start desktop simulation, which means the computer pretends to be the robot

## Good Habits

- Look at the Source Control view before switching branches.
- Read the first real error in the build output.
- Fix one issue at a time.
- Keep commits small enough that you can explain them.
