# Student Lesson 18: Fake IO and Hardware Boundaries

This lesson explains how robot code can stay useful even when no hardware is attached.

## Main Ideas

IO means input and output. In robot code, IO is the part that talks directly to hardware: motors, sensors, controllers, and other devices. A hardware boundary is the line between that hardware-facing code and the rest of the robot logic.

This separation matters because most robot logic should not need to care whether the data came from a real sensor, a fake sensor, or a simulator. If the logic is isolated from hardware details, students can run and test the code on a laptop.

Fake IO is a non-hardware implementation of the same interface. It lets the rest of the code behave as if hardware exists without requiring a real robot on the table. This makes the code easier to test, easier to teach, and easier to debug.

## What Students Should Understand

- IO code is where the program touches hardware directly.
- A hardware boundary protects the rest of the program from hardware details.
- Fake IO makes laptop development possible.
- Good hardware boundaries make robot code more flexible and easier to reason about.
