# Student Lesson 06: Static, Final, Enums, and Constants

This lesson explains how Java names fixed values and small sets of known states.

## Main Ideas

Not every value belongs to one individual object. Some values belong to the class as a whole. In Java, `static` means the value belongs to the class itself instead of to one specific object instance.

`final` means a variable cannot be reassigned after setup. In beginner code, students will often see `static final` together because constants are usually class-level values that should not change during normal program use.

Constants matter because they make robot code easier to change and safer to read. A controller port number, speed limit, or angle setpoint should usually be written once in a clear place instead of copied all over the code.

Enums solve a different problem. Sometimes a program needs one choice from a small fixed set: `STOW`, `INTAKE`, `SPEAKER`; or `RED`, `BLUE`; or `DISABLED`, `TELEOP`. An enum gives names to those known options. That is better than scattering strings around the code, because the possible values are clear and limited.

## What Students Should Understand

- `static` means class-level, not object-level.
- `final` means the variable cannot later be reassigned.
- Constants help centralize important values.
- Enums make named states clearer and safer than random strings.
