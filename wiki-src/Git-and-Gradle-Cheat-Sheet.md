# Git and Gradle Cheat Sheet

## Git

Git keeps a history of the code. In this course, each lesson lives on its own branch, which means its own saved version of the project.

- `git branch`: list local branches
- `git switch lesson-07-arrays-lists-and-maps`: move to a lesson branch
- `git status`: see whether you changed any files
- `git diff`: inspect what changed in files you edited
- `git add <file>`: stage a file, which means marking it for the next commit
- `git commit -m "Describe the change"`: save a commit, which is a recorded snapshot of your work

## VS Code and WPILib

Use VS Code and the WPILib extension instead of typing Gradle commands directly.

- Open the command palette with `Ctrl+Shift+P`
- Run `WPILib: Open WPILib Command Palette`
- Choose `Build Robot Code` to compile the project, which means turning the Java code into a program
- Choose `Test Robot Code` to run unit tests, which are small automatic checks of behavior
- Choose `Simulate Robot Code` to start desktop simulation, which means the computer pretends to be the robot

## Good Habits

- Run `git status` before switching branches.
- Read the first real error in the build output.
- Fix one issue at a time.
- Keep commits small enough that you can explain them.
