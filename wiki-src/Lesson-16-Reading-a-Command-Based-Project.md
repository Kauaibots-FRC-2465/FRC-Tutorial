# Lesson 16: Reading a Command-Based Project

Branch: `lesson-16-reading-a-command-based-project`
Reading Page: [Lesson 16 Reading: Reading a Command-Based Project](Lesson-16-Reading-Material-a-Command-Based-Project)
How to use this lesson: read the code, then use the VS Code WPILib command palette and choose `Build Robot Code`

## What This Lesson Is Really About

This is the point where students stop reading small Java examples and start reading a full robot project. The goal is not to memorize every file. The goal is to recognize the standard shape of a command-based WPILib robot.

## New Words

- command-based: a common WPILib project style built around subsystems and commands
- architecture: the overall shape of the program and how its parts fit together
- binding: the connection between an input and a command

## Goals

- Recognize the standard shape of a command-based WPILib project.
- Connect subsystems, commands, bindings, and constants to one robot.
- Read the project as architecture, not just as isolated files.

## Read First

- `src/main/java/frc/robot/RobotContainer.java`
- `src/main/java/frc/robot/commands`
- `src/main/java/frc/robot/subsystems`
- `src/main/java/frc/robot/Constants.java`

## Focus Questions

- Which classes own robot capabilities?
- Which classes describe actions?
- Where do controller bindings turn into scheduled commands?

## Success Check

- You can sketch the project structure on paper and explain the job of each part.
