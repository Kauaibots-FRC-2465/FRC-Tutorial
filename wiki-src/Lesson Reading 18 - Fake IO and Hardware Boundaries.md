# Lesson Reading 18 - Fake IO and Hardware Boundaries

## Big Picture

One of the biggest practical problems in robot programming is that real hardware is not always available. Even when it is available, it is not always the best place to learn, test, or debug every idea. This lesson introduces fake IO and hardware boundaries as a way to solve that problem.

The basic idea is simple. High-level robot logic should not be tangled directly into every hardware call. Instead, the code should create a boundary. On one side is the logic that decides what the robot should do. On the other side is the specific implementation that talks to hardware, simulation, or a fake replacement. This separation lets the same robot logic run in more than one environment.

Students should think of this as a design pattern for flexibility. A fake implementation is not "pretending badly." It is a deliberate teaching and testing tool. It allows behavior to be observed, checked, and explained without requiring a full robot every time.

## Key Terms

- IO: input and output, especially communication with hardware
- hardware boundary: the design line between robot logic and hardware-specific code
- fake IO: a non-hardware implementation used for testing or teaching
- real IO: the implementation that talks to actual devices
- adapter: a class that translates between the rest of the program and a specific device or library
- dependency: something a class needs in order to do its job

## Why Boundaries Matter

If subsystem logic directly depends on every vendor-specific motor and sensor call, the code becomes harder to test and harder to move into simulation. It also becomes harder to read because the logic and the hardware details are mixed together. A boundary separates those concerns. The subsystem can focus on robot behavior, while the IO layer focuses on how data is read and outputs are written.

This does not eliminate hardware complexity. It organizes it. Students should notice that good design often does not make a hard problem disappear. It places the hard parts in a clearer location.

A hardware boundary also makes the code more honest. A class that depends only on an interface or an IO abstraction is clearly saying, "I need certain information and capabilities, but I do not need to know exactly which implementation provides them."

## What Fake IO Is For

Fake IO stands in for real hardware. A fake motor output object might record the requested voltage or speed without sending anything to a real motor. A fake sensor might return values from a scripted pattern instead of from a physical device. This lets students observe robot logic in a controlled environment.

The goal is not to make the fake identical to real hardware in every detail. The goal is to make it useful. A fake implementation should produce meaningful behavior for the lesson or test. It should help students answer questions such as "What command output is being requested?" or "How does this subsystem react when the sensor suddenly reports a game piece?"

Fake IO is especially valuable for classroom learning because it reduces the number of things that can go wrong at once. Students can focus on understanding the code instead of also fighting wiring, calibration, battery state, and mechanical problems.

## Designing a Useful Boundary

A useful hardware boundary exposes the information and actions the rest of the program truly needs. It should not expose every tiny device-specific detail if those details are not relevant to higher-level behavior. Students should think about what the subsystem really needs to know and what it really needs to command.

This often leads to interface-based or provider-based design. One implementation may be fake. Another may be real. Later, another may be simulation-specific. The subsystem logic does not need to change just because the environment changed. That is the major benefit.

Good boundaries also improve naming. Instead of talking directly in vendor API terms everywhere, the program can speak in terms closer to the robot behavior it cares about.

## Limits of Fake IO

Fake IO is useful, but it is not reality. A fake model can only show what it was designed to show. It may not include mechanical lag, electrical limits, or hardware faults unless someone explicitly modeled those behaviors. Students should therefore treat fake IO as a controlled learning and testing environment, not as perfect proof that the real robot will behave identically.

This is not a weakness of the approach. It is simply honesty. The purpose of fake IO is to make many ideas teachable and testable before hardware is involved. Later, simulation and real hardware help close the gap.

## Why This Matters For FRC

FRC teams often have more programmers than robots and more ideas than available test time. Fake IO helps the team keep learning and developing without blocking on hardware access. It also supports better architecture by forcing programmers to think clearly about what their logic actually depends on.

This lesson is one of the keys to making the course work for students at home or away from the robot. It turns "no hardware available" from a full stop into a manageable limitation.

## Before You Move On

- You should know what a hardware boundary is and why it helps.
- You should understand that fake IO is a deliberate teaching and testing tool.
- You should know why separating robot logic from hardware-specific code improves flexibility.
- You should understand that fake IO is useful but not identical to real hardware.
