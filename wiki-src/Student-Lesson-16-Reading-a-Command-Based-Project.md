# Student Lesson 16: Reading a Command-Based Project

This lesson is the transition from small Java examples to a real robot code structure.

## Main Ideas

Command-based programming is a common WPILib project style. Its main goal is organization. Instead of throwing every robot behavior into one giant class, command-based code separates the robot into subsystems and commands.

A subsystem usually owns one robot capability, such as driving, moving an arm, or running an intake. A command is an action that tells one or more subsystems what to do. `RobotContainer` is the place where many of these parts are connected.

This project structure is an example of architecture, meaning the overall shape of the program and the way its parts fit together. Students do not need to memorize every file immediately. They need to recognize the roles: where inputs are bound, where subsystem logic lives, where autonomous choices are configured, and where constants are stored.

## What Students Should Understand

- Command-based projects are structured on purpose.
- Subsystems own capabilities.
- Commands express actions.
- Reading architecture means understanding the job of each file, not memorizing every line.
