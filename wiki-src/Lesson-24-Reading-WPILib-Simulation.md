# Lesson 24 Reading: WPILib Simulation

## Big Picture

Simulation lets students run robot code on a computer without a real robot. That is extremely valuable for learning, testing, and demonstrating behavior. But simulation is not one single magic feature. It is a structured environment where the robot program, simulated devices, and sometimes simple physics models interact.

Students should connect this lesson to the earlier fake-IO lesson. Fake IO and simulation solve related problems, but they are not identical. Fake IO is a deliberately simplified replacement. Simulation aims to model behavior more like a running robot environment. Both are useful, and each has strengths.

The main goal of this lesson is to make simulation feel understandable. Students should know what it is doing, what kinds of results to expect, and what its limits are.

## Key Terms

- simulation: running robot code in a computer-based stand-in for the robot environment
- sim model: code that approximates how a mechanism or device behaves
- `simulationPeriodic()`: a method used to update simulation-specific behavior
- fake IO: a simplified replacement, often used for teaching or testing
- fidelity: how closely a model matches real-world behavior
- dashboard feedback: visible information published while the simulation runs

## What Simulation Is Doing

In simulation, the robot code still runs as code. Commands schedule, subsystems update, telemetry publishes, and control logic executes. The difference is that the program is interacting with simulated inputs and outputs instead of the real robot hardware. That gives students a chance to observe behavior without deploying to a robot.

Some simulation setups are very simple. Others use mechanism or drivetrain simulation helpers to estimate how a system would move based on commands. Students do not need full physics expertise to use simulation well. They only need to understand that the program is receiving and producing values inside a modeled environment rather than a physical one.

## Simulation Versus Fake IO

Fake IO is usually designed for simple, controlled behavior. It often answers questions like "What output did the code request?" or "How does this logic react if the sensor suddenly changes?" Simulation often goes a step further by connecting outputs to modeled changes over time. For example, motor commands may affect a simulated position or velocity, which then affects the next sensor reading.

Students should not view one as better than the other in every situation. Fake IO is great for teaching and focused logic checks. Simulation is great for observing a more connected running system. The course uses both because they solve slightly different problems.

## What Students Should Look For

When simulation runs, students should look for clear evidence that the project is behaving as expected. Does the simulation start cleanly? Do dashboard values update? Do fake or simulated sensor values change in the expected direction? Does the command flow appear to match the lesson?

The point is not merely that a window opened. The point is whether the running system produces meaningful visible behavior. Students should treat simulation as an observation tool, not just a launch step.

## Limits of Simulation

Simulation is useful, but it is still a model. A model can leave things out. It may not reproduce mechanical friction accurately, electrical brownouts, noisy sensors, or wiring mistakes. Students should not assume that simulation success guarantees perfect hardware success. It provides evidence, not certainty.

At the same time, these limits do not make simulation weak. Simulation is valuable because it makes many design and logic questions testable much earlier and much more safely than waiting for hardware alone.

## Why This Matters For FRC

FRC teams often need to share limited robot time. Simulation gives students a way to continue learning and verifying behavior when the robot is unavailable. It also supports better architecture, because code that runs well in simulation is often code with clearer boundaries and more observable behavior.

For this course, simulation is one of the key reasons the lessons can remain accessible to students outside the shop. It turns robot programming into something that can be explored on a laptop rather than only at the robot cart.

## Before You Move On

- You should know what simulation is and what it is meant to provide.
- You should understand the difference between simulation and fake IO.
- You should know what kinds of evidence to look for when a simulation lesson runs.
- You should understand that simulation is valuable evidence, but not perfect proof of hardware behavior.
