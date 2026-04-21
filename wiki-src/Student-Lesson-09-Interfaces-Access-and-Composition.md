# Student Lesson 09: Interfaces, Access, and Composition

This lesson explains how Java lets different classes work together without being tightly glued together.

## Main Ideas

An interface is a promise about behavior. It says what methods must exist, but it does not contain the full implementation. That makes interfaces useful when code should depend on what another class can do rather than on exactly which class it is.

This matters because robot code often needs flexibility. The same driving logic might work with real controls, fake controls, or dashboard controls. If that logic depends on an interface, the code becomes easier to test and easier to swap.

Access modifiers such as `public` and `private` control who can use a field or method. `public` means the member is meant to be reachable from outside the class. `private` means it is internal to the class. Students should think of this as part of good organization. Not everything should be exposed.

Composition means one class uses another class as a part of its work. In beginner robot code, composition is usually a safer first choice than deep inheritance. Instead of saying "this class is a special version of that class," composition says "this class uses that helper class."

## What Students Should Understand

- Interfaces describe required behavior without forcing one implementation.
- Access modifiers help keep code organized and prevent accidental misuse.
- Composition usually makes robot code easier to test and reason about.
- Depending on abstractions is often safer than depending on one concrete class everywhere.
