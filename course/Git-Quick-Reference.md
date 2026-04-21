# Git Quick Reference

Git records the history of the codebase. In this course, each lesson lives on its own branch. A branch is a saved line of project history, so switching branches lets you move to a different lesson snapshot.

## Commands Students Should Know

- `git branch`: list local branches
- `git switch lesson-05-control-flow-and-tracing`: move to a lesson branch
- `git status`: show whether you changed any files
- `git diff`: show what changed in files you have edited
- `git add <file>`: stage a file, which means marking it for the next commit
- `git commit -m "Describe the change"`: record a saved snapshot of your work

## Safe Habits

- Run `git status` before you switch branches.
- Commit your work before changing lessons.
- Read the branch name carefully before making changes.
- Do not use force commands unless you fully understand what they do.
