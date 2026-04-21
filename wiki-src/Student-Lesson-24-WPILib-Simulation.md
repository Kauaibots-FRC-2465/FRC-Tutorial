# Student Lesson 24: WPILib Simulation

This lesson explains what simulation is actually doing under the hood.

## Main Ideas

Fake IO gives the program pretend hardware values. WPILib simulation goes further by modeling how a mechanism or drivetrain should respond over time.

A physics model estimates how something moves when given inputs such as motor voltage. Simulated sensors then read from that model. This lets the program behave more like a real robot than a simple fixed fake would.

Simulation is powerful, but it is still an approximation. It can tell students whether a structure basically works, whether values are flowing correctly, and whether commands interact sensibly. It cannot guarantee that a real robot with friction, wiring mistakes, tuning problems, and physical imperfections will behave exactly the same.

## What Students Should Understand

- Simulation is more than random fake numbers; it tries to model motion.
- Simulated motors and sensors let robot code run on a laptop.
- Simulation is useful evidence, not perfect proof.
- Students should learn what simulation can show and what it cannot.
