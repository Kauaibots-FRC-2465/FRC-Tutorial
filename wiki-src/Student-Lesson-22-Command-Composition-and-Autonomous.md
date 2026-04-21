# Student Lesson 22: Command Composition and Autonomous

This lesson explains how small actions become a full autonomous routine.

## Main Ideas

Autonomous mode is the robot mode where the robot follows pre-planned actions without driver input. In good command-based code, autonomous is usually not one giant method. It is a composition of smaller commands.

Composition means combining actions into a larger plan. Some commands run one after another in sequence. Some run in parallel. Some use a deadline or timeout to control how long the combination lasts.

A chooser lets humans pick among available autonomous routines. That means the robot can expose choices such as "Leave Only" or "Score and Leave" without rewriting the whole code structure each time.

## What Students Should Understand

- Autonomous routines are often compositions of smaller commands.
- Sequence and parallel behavior are different ways of arranging actions.
- Timeouts and deadlines help control how long actions last.
- A chooser connects dashboard selection to robot behavior.
