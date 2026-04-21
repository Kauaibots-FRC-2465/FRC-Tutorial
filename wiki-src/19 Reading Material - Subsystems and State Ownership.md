# 19 Reading Material: Subsystems and State Ownership

## Big Picture

Subsystems are one of the core organizing ideas in command-based FRC code. They group hardware and behavior around a major robot capability. This lesson adds another design idea that matters just as much: state ownership. A subsystem should not only own hardware. It should also be the main place responsible for certain pieces of robot information.

State means information the program is currently holding onto, such as a target speed, whether the intake believes it has a game piece, or the most recent measured angle. Ownership means deciding which class is responsible for storing, updating, and answering questions about that information. Without ownership, the same idea tends to get copied into several places, and those copies eventually disagree.

This lesson is therefore about boundaries again, but now at the level of robot capabilities. Students should learn to ask not only "Which subsystem owns this hardware?" but also "Which subsystem or class should own this information?"

## Key Terms

- subsystem: a major robot capability that owns related hardware and behavior
- state: information the program is currently remembering
- ownership: which class is responsible for storing or managing that information
- public API: the methods a class exposes to outside code
- duplicated state: the same idea stored in multiple places
- consistency: different parts of the program agreeing about the same information

## What Counts As State

State is broader than many beginners first expect. It is not only big obvious things like "robot mode." It can also include target values, measured values, flags, counters, current selections, and internal mode information. If the program is remembering something over time, that is probably state.

Students should notice that state can be internal or external-facing. A subsystem may track information only for its own internal decisions, while also exposing a smaller public picture to the rest of the robot. The important point is that the information exists somewhere, and that "somewhere" should be chosen on purpose.

Understanding state well helps students read behavior. When a robot does something surprising, the reason is often not just a wrong calculation. It may be that the program's stored state did not match reality or did not update the way the student expected.

## Ownership and Responsibility

Ownership means one place has primary responsibility for a piece of information. If the arm subsystem measures and controls arm angle, then it is often the natural place to own the current measured angle and the target angle. Outside code should ask the subsystem for that information rather than maintaining its own competing copy.

This matters because duplicated state is one of the easiest ways to create bugs. If two classes both try to store the same idea, they can drift apart. Then one part of the program believes one thing while another part believes something else. Those bugs are hard to debug because both pieces of code may look reasonable on their own.

Students should therefore get into the habit of asking, "Who should be the authority for this information?" That question is more powerful than it may first appear. It leads directly to cleaner subsystem APIs and fewer coordination bugs.

## Subsystems As Stable Boundaries

A subsystem should usually present a clear public surface. Outside code should be able to command or query it in meaningful ways without reaching inside and manipulating internal details directly. This protects the subsystem's internal consistency and makes it easier to change later.

That does not mean subsystems must hide everything. It means the subsystem should decide what other code truly needs and expose that intentionally. Commands should work with the subsystem's public behavior, not with its hidden implementation details.

This makes the project easier to read. If students know a subsystem is the owner of certain state and hardware, they know where to look when something about that capability changes.

## Why This Matters For FRC

FRC robots are made of interacting capabilities: driving, aiming, intaking, elevating, shooting, climbing, and more. If their state boundaries are unclear, the project becomes fragile very quickly. Students start writing logic in the wrong places, multiple classes remember the same facts, and debugging becomes slower.

Clear subsystem ownership keeps the codebase understandable under team pressure. It also supports testing, simulation, and command design because the program has well-defined places where behavior and information live.

## Before You Move On

- You should know what state means in a program.
- You should understand why one class should usually be the main owner of a given piece of state.
- You should know why duplicated state causes consistency problems.
- You should understand that subsystems should expose a clear public API instead of letting other code manipulate their internals freely.

