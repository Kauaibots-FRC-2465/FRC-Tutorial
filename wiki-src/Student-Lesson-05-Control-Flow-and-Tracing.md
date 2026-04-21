# Student Lesson 05: Control Flow and Tracing

This lesson is about following what the program actually does, not what you hope it does.

## Main Ideas

Control flow is the order in which the program moves through its code. Programs do not run every line every time. They make choices. `if` statements choose between possibilities. `switch` statements choose among named cases. Loops repeat actions.

Tracing means following the program one step at a time and keeping track of the values that matter. Beginners often read code like a paragraph, but code is not a paragraph. It is a sequence of decisions. Tracing helps students see which branch was taken, how many times a loop ran, and how the program's stored information changed along the way.

This matters in robot code because robot behavior often depends on conditions. If a sensor says a note is loaded, the intake may stop. If a driver presses a button, a command may begin. If a count reaches a limit, the robot may leave a loop and move on.

A common beginner mistake is assuming that a branch "must" run without checking the actual condition. Another is forgetting that a loop may run zero times, one time, or many times depending on the starting values.

## What Students Should Understand

- Control flow is the path the program takes through its code.
- A condition decides which branch runs.
- A loop repeats while its condition allows it.
- Tracing is one of the fastest ways to understand unfamiliar code.
