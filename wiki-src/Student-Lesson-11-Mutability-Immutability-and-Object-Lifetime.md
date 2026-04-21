# Student Lesson 11: Mutability, Immutability, and Object Lifetime

This lesson explains why some objects are safer to share than others.

## Main Ideas

A mutable object can change after it is created. An immutable object cannot. Neither idea is automatically good or bad. The question is whether change is expected and whether that change is easy to reason about.

Mutable objects are useful when the program really needs changing state, such as a subsystem that updates sensor readings over time. But mutable objects can also create confusion if many different parts of the program can change them. Students often think two variables mean two separate things, but if both variables point to the same mutable object, a change through one name affects the other too. That is aliasing.

Immutable objects are often easier to share because they do not surprise other parts of the program after creation. That is why configuration values and request objects are often good candidates for immutability.

Object lifetime is the amount of time an object exists before Java can throw it away. Students do not need deep garbage collection theory yet. The important lesson is simpler: if your code keeps creating unnecessary new objects inside fast repeated loops, that can create work for the runtime and make behavior harder to reason about.

## What Students Should Understand

- Mutable means the object can change after creation.
- Immutable means it cannot.
- Shared mutable state is a common source of bugs.
- Immutable data is often safer for requests, configuration, and values that should stay fixed.
