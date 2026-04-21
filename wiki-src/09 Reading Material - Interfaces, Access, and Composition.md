# 09 Reading Material: Interfaces, Access, and Composition

## Big Picture

As programs get larger, students need better ways to describe roles, control visibility, and connect pieces together without turning everything into one giant class. This lesson introduces three ideas that help do that: interfaces, access control, and composition. These ideas are central to writing code that other people can understand and safely modify.

Interfaces answer the question, "What kind of behavior can this thing provide?" Access control answers, "What parts of this class should other code be allowed to touch directly?" Composition answers, "How do we build larger behavior by combining smaller pieces?" These are design ideas, but they are also reading ideas. When students understand them, they can look at a class and understand not only what it does, but how it is meant to fit into a larger system.

This lesson also begins to move students away from the mistaken idea that inheritance is the main tool for structuring object-oriented code. In many modern Java projects, and especially in FRC code, composition is usually the more practical and safer design choice.

## Key Terms

- interface: a contract that describes behavior without giving the full implementation
- access modifier: a keyword such as `public` or `private` that controls visibility
- composition: building a class by using other objects inside it
- implementation: the actual code that fulfills an interface or method contract
- public API: the methods or fields a class intentionally exposes to outside code
- encapsulation: keeping internal details behind a controlled boundary

## Interfaces As Contracts

An interface describes what behavior is available without forcing every implementation to use the same internal details. Students should think of an interface as a promise about capabilities. If something implements an interface, other code can rely on those promised methods existing.

This is useful because different objects may do the same job in different ways. One implementation might talk to real hardware. Another might provide fake test behavior. Another might simulate a device. If they all implement the same interface, the rest of the code can focus on what it needs rather than the specific class behind it.

Interfaces therefore help separate "what this object can do" from "how this particular class does it." That separation is one of the main tools for flexible design. It also improves reading. When students see an interface type in a field or parameter, they should ask what behavior the class depends on rather than which exact implementation happens to be present today.

## Access Control and Why Visibility Matters

Access modifiers control who is allowed to use different parts of a class. `public` members are visible to outside code. `private` members are meant for internal use inside the class. Students should think of access control as a way of drawing boundaries. It helps a class say, "These are the parts you may use," while protecting the details that should stay internal.

This matters because not every detail should be exposed. If every field is public, outside code can change internal data freely, and the class loses control over its own consistency. A class becomes much easier to reason about when it manages its own internal details and offers a smaller, clearer public API.

Access control also helps readers know what to pay attention to. Public methods are part of the class's role in the larger program. Private helpers are implementation details. Both matter, but they matter in different ways. Students who notice that distinction read classes more accurately.

## Composition Over Inheritance

Composition means a class is built by holding or using other objects. Instead of becoming a more specific kind of some parent class again and again, the class combines useful pieces. Students can think of composition as "has-a" design rather than "is-a" design. A main application class has helpers. An IO manager has adapters. A telemetry helper has publishers.

This style is powerful because it keeps responsibilities clearer. A class can depend on the exact helpers it needs without becoming trapped in a deep inheritance chain. Deep inheritance can make code harder to follow because behavior becomes spread across many ancestor classes. Composition is often easier to test, easier to change, and easier to explain.

That does not mean inheritance is never useful. It means students should not assume it is the default answer to every design problem. In FRC and other application code, composition is usually the first idea to consider because it creates simpler and more flexible boundaries.

## Designing a Clear Public Surface

Good class design often means exposing only the methods that outside code really needs. The inside of the class may store several fields and use several helper methods, but the outside world may need only two or three meaningful operations. This keeps the class easier to use correctly.

Students should learn to ask, "What should outside code know about this class, and what should remain internal?" That question pushes them toward better APIs and more readable code. It also prepares them for later robot-design lessons, where boundaries between internal details and public actions matter a great deal.

## Why This Matters For FRC

FRC projects benefit from interfaces because the same higher-level robot logic may need to work with fake IO, simulation, and real hardware. They benefit from access control because internal details should not be freely edited from everywhere. They benefit from composition because robots are naturally assembled from parts: higher-level logic uses IO layers, telemetry helpers, and data sources.

This lesson therefore sits at the bridge between general Java design and practical robot architecture. Students who understand interfaces, access control, and composition will be better prepared to read why the course is structured the way it is later on.

## Before You Move On

- You should know that an interface describes behavior without locking in one implementation.
- You should understand that access modifiers control what outside code can see and use.
- You should know why composition is often easier to manage than deep inheritance.
- You should be able to explain why a class should expose a small, clear public API.

