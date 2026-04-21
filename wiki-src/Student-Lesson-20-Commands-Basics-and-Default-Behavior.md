# Student Lesson 20: Commands Basics and Default Behavior

This lesson explains how actions are represented in a command-based robot.

## Main Ideas

A command is an action. It tells one or more subsystems what to do. This is useful because actions can then be scheduled, interrupted, repeated, or composed without hiding the robot's intent.

Default commands are especially important. A default command is what a subsystem does when no other command is currently using it. That gives the robot a sensible baseline behavior. A drivetrain may default to joystick driving. An intake may default to idle.

Deadbands matter here too. Real controller inputs are often noisy. A deadband is a small region around zero that the program treats as zero so tiny joystick drift does not move the robot.

## What Students Should Understand

- Commands describe actions.
- Default commands define the normal fallback behavior of a subsystem.
- A robot needs sensible idle behavior, not just special-case behavior.
- Input cleanup such as deadband handling makes robot behavior more stable.
