# Student Lesson 17: Robot Lifecycle and Telemetry

This lesson explains that the robot does not run one giant script from top to bottom.

## Main Ideas

WPILib calls different methods depending on the robot's mode. This repeating pattern is called the robot lifecycle. Common modes include disabled, autonomous, teleop, test, and simulation. Each mode has different expectations about what the robot should be doing.

Understanding lifecycle matters because students need to know when certain code runs. Some behavior should happen every cycle. Some behavior should only happen when teleop begins. Some behavior should only exist in simulation.

Telemetry is the information the robot publishes so humans can see what is happening. That information may appear on the dashboard or in console output. Telemetry is not just decoration. It is one of the main tools for understanding behavior while the robot runs.

## What Students Should Understand

- The robot has modes, and the code behaves differently in each mode.
- Lifecycle methods are WPILib's way of organizing repeated robot execution.
- Telemetry makes invisible robot state visible to humans.
- Good telemetry supports debugging, tuning, and trust.
