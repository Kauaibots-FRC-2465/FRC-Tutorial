# Student Lesson 19: Subsystems and State Ownership

This lesson is about deciding which class should be trusted for which robot facts.

## Main Ideas

State is the information the program is currently holding. In a robot project, that might include arm angle, drivetrain position, intake loaded status, or target setpoint.

If many classes try to track the same fact, confusion appears quickly. One class may have an outdated answer. Another may calculate the fact differently. That is why programs need a source of truth: one main place responsible for storing or answering questions about a piece of information.

In command-based robot code, subsystems are often the right place to own robot-facing state. Commands can then ask the subsystem questions instead of duplicating that logic for themselves.

## What Students Should Understand

- State ownership means deciding which class is responsible for which information.
- A clear source of truth reduces duplicated logic and contradictions.
- Subsystems are often the best place for robot-facing state and status questions.
- Commands should usually ask subsystems instead of inventing their own copies of robot facts.
