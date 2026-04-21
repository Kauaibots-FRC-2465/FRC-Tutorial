# Student Lesson 23: Sensors, Units, and Data Flow

This lesson explains how measurements move through the program and why units matter.

## Main Ideas

Sensors measure something about the robot or its environment. But a sensor reading is only useful if the program understands what the number means and where it should go next.

Data flow is the path a value takes through the program. A reading may begin in IO, move into a subsystem, get transformed into a decision or status value, and then appear on the dashboard. Students should learn to follow one value through that chain instead of treating each class as a separate island.

Units matter because numbers without units are easy to misuse. A distance, angle, time, and velocity can all be stored as numbers, but they do not mean the same thing. Using unit-aware code reduces mistakes and makes intent clearer.

## What Students Should Understand

- Sensors provide measurements, not finished decisions.
- Data flow means tracking how information moves through the program.
- Units make measurements safer and easier to read.
- Good robot code keeps measurement, meaning, and display clearly connected.
