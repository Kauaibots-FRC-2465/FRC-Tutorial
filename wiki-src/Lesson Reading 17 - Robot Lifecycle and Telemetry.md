# Lesson Reading 17 - Robot Lifecycle and Telemetry

## Big Picture

Robot code does not run in one single undifferentiated mode. The robot moves through phases such as disabled, autonomous, teleoperated, and test. The framework also calls important methods repeatedly while the robot is running. This lesson explains that lifecycle and introduces telemetry, which is the practice of publishing useful internal information so people can observe what the robot thinks is happening.

Students often first imagine a program as something that starts once, runs top to bottom, and ends. Robot software is different. It lives inside a looped environment where the framework repeatedly calls methods at the right times. Understanding that environment is essential. Without it, students will keep asking the wrong question about when code runs.

Telemetry matters because the robot's internal information is not automatically visible from the outside. The dashboard and console are windows into the robot's internal state, decisions, and measurements. That visibility becomes a major tool for debugging and verification.

## Key Terms

- lifecycle: the pattern of stages and repeated calls the robot program moves through
- mode: a robot operating phase such as disabled, autonomous, teleop, or test
- periodic method: a method the framework calls repeatedly
- telemetry: information the robot publishes so humans can observe it
- NetworkTables: the WPILib data-sharing system behind dashboard communication
- dashboard: the tool that displays published robot values

## Robot Modes

Different robot modes exist because the robot is expected to behave differently in different situations. In disabled mode, outputs that would move mechanisms are generally not active. In autonomous mode, the robot follows preplanned behavior. In teleop, driver control becomes active. Test mode exists for focused checking and controlled experiments.

Students should think of these modes as part of the environment, not as optional add-ons. The framework tells the program which operating situation it is currently in. The code should respond accordingly. This is one reason reading robot code requires more than normal Java syntax. The reader also has to understand the runtime context the framework provides.

## Periodic Execution

Many robot methods run repeatedly. That repeated execution is how the program keeps responding to sensors, commands, driver input, and changing conditions. Students should connect this lesson to the earlier lesson on control flow and loops. The framework is providing a repeated call pattern even when the local class does not show an explicit loop.

This repeated structure matters because values can change from one cycle to the next. A sensor reading may be different. A command may have started or ended. A provider may return a different input. Students should therefore stop thinking in terms of "this method ran once" and start thinking in terms of "this method is part of an ongoing cycle."

## Telemetry and Visibility

Telemetry is the information the program publishes so humans can inspect what the robot currently believes. This might include sensor readings, command states, mode information, target values, or warnings. Telemetry is valuable because robot behavior is otherwise partly hidden inside the software.

Students should not think of telemetry as decoration. It is a debugging and verification tool. If the robot behaves incorrectly, telemetry can show whether the software misunderstood the situation or whether the physical system failed to follow a correct command. That difference matters a lot during troubleshooting.

Good telemetry is intentional. It should highlight important information without overwhelming the dashboard with noise. Students should ask what a future debugger would want to know.

## NetworkTables and the Dashboard

WPILib uses NetworkTables to move published values to dashboards and related tools. Students do not need to master the protocol details yet. The practical idea is enough: the program can publish values, and the dashboard can display them. This creates a useful feedback loop between internal code state and human observation.

The dashboard is therefore not just a display. It is part of the developer's observation system. Students should get used to checking dashboard information as evidence, not just as decoration.

## Why This Matters For FRC

FRC robots are physical systems that change over time, react to different modes, and need to be debugged under pressure. Lifecycle knowledge tells students when the code runs. Telemetry tells them what the code believes while it runs. Together, those ideas make the robot program much more understandable.

This lesson also prepares students for fake IO, simulation, sensors, and command scheduling. All of those later topics depend on understanding that the robot is a repeating system with visible and invisible state.

## Before You Move On

- You should know the main robot modes and why they exist.
- You should understand that periodic methods are called repeatedly by the framework.
- You should know what telemetry is and why it helps with debugging and verification.
- You should understand that NetworkTables and the dashboard are part of how robot information becomes visible.
