# 15 Reading Material: Git for Working Programmers

## Big Picture

Git is the tool that records project history and supports branching collaboration. In this course, students are using Git mostly through VS Code Source Control and Git Graph, not through the command line. That is fine. The important part is understanding the concepts clearly enough that the interface makes sense.

Version control matters because programming is not a straight line. Students make changes, compare versions, return to earlier ideas, and collaborate with other people. Git keeps track of those changes in a structured way. Without version control, a project quickly turns into a confusing set of renamed folders and accidental overwrites.

Students should think of Git as a history and branching system, not just as a way to "upload code." That broader mental model makes the course branch structure much easier to understand.

## Key Terms

- repository: the project plus its saved history
- commit: a saved point in that history
- branch: a named line of development or snapshot path
- diff: the set of changes between versions
- staged changes: edits chosen for the next commit
- merge conflict: a situation where Git cannot automatically combine changes cleanly

## Commits and History

A commit is a saved version of the project with a message explaining what changed. Students should think of commits as meaningful checkpoints, not as random save spam. A good commit says, "Here is one understandable change." That makes later history easier to read and easier to use.

History matters because programming is full of revision. If a change introduces a bug, Git makes it possible to inspect what changed. If students want to understand how a feature evolved, history can show that path. This is one reason version control is so important in real programming. It supports both collaboration and understanding.

Git Graph is useful here because it makes history visible. Students can see commits and branches as actual structure rather than abstract names.

## Branches As Separate Lines of Work

A branch is a named line of development. In this course, branches are also used as lesson snapshots. Students should remember that a branch is not a completely separate project sitting in another folder. It is another view of the same repository's history. Switching branches changes which version of the files appears in the working tree.

This makes branches useful for experimentation and instruction. A lesson branch can show one stage of the course. A feature branch can hold one new change without disturbing other work. Branching lets teams organize work without everything happening directly on the same version at once.

Git Graph helps students visualize this idea because they can literally see that different branches point to different commits in the same larger history.

## Staging, Committing, and Reading Diffs

The Source Control view shows which files changed. Staging means selecting which of those changes should go into the next commit. Students should see staging as a deliberate choice, not a mechanical step. It answers the question, "Which edits belong together as one idea?"

Diffs show what changed. Reading diffs is an important skill because it turns Git from a storage tool into a thinking tool. Students can compare before and after, see whether a change was larger than intended, and understand what another programmer actually modified.

This is one reason small commits are so valuable. Small, focused commits produce readable diffs and understandable history.

## Good Team Habits

Good Git habits are mostly about clarity. Work from the correct branch. Notice when files are modified unexpectedly. Commit related changes together. Write commit messages that say what changed. Read the diff before assuming the change is what you intended. These are not fancy habits. They are reliability habits.

Students should also know that merge conflicts are not a sign of disaster. A merge conflict means Git found overlapping changes it could not combine automatically. That is a coordination problem to solve carefully, not a reason to panic. The best way to reduce conflicts is good communication and smaller, clearer changes.

## Why This Matters For FRC

FRC projects are team projects. Several students may work on controller bindings, subsystems, testing, and documentation at the same time. Git keeps that work from becoming chaos. It also gives teams the confidence to experiment, because earlier versions are still recorded.

In this course specifically, Git is also the delivery system for the lessons themselves. Students cannot fully participate in a branch-based course without understanding what a branch, commit, and diff actually mean.

## Before You Move On

- You should know what repositories, commits, branches, staging, and diffs are.
- You should understand that the course uses branches as lesson snapshots.
- You should know why small, focused commits make history easier to use.
- You should understand that merge conflicts are solvable coordination problems, not proof that the project is ruined.

