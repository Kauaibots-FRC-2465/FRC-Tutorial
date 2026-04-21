# Student Lesson 10: Lambdas, Method References, and Providers

This lesson introduces a very common Java idea: sometimes code should ask for a value later instead of storing one value now.

## Main Ideas

A lambda is a short way to write a small piece of behavior. A method reference is a short way to point at an existing method. Students will see both when Java code wants to pass behavior around instead of just passing data.

A provider is code that supplies the current value when asked. This matters in robot programming because many values are not supposed to be frozen at construction time. Driver input changes. Sensor readings change. Robot status changes. If a command stores one old value at startup, it may stop matching reality. If it asks a provider for the current value each time it needs it, the behavior stays live.

That is why interfaces like `Supplier<T>`, `BooleanSupplier`, and `DoubleSupplier` appear so often. They let one part of the program say, "I do not need the value yet. I need a way to get the value when the moment comes."

## What Students Should Understand

- Lambdas and method references are ways of passing behavior.
- Providers are useful when the current value matters more than the value at setup time.
- Live robot input is often better modeled by providers than by stored one-time values.
- This pattern is a big part of readable FRC command code.
