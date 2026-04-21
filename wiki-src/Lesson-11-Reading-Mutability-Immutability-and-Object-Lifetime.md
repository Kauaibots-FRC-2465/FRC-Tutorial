# Lesson 11 Reading: Mutability, Immutability, and Object Lifetime

## Big Picture

Programs do not just store data. They also decide how that data is allowed to change. Some objects are mutable, which means their internal data can change after creation. Others are immutable, which means their meaningful contents stay fixed. This lesson explains why that distinction matters and how it connects to object lifetime and garbage collection.

Students often first meet change only through variable reassignment. But object design adds a second layer: even if a reference stays the same, the object it refers to may or may not change internally. This is one reason `final` and immutability are not the same thing. A reference can remain fixed while the object behind it continues to change.

Understanding mutability is important because bugs often come from unexpected shared change. If two parts of the program are using the same mutable object, one part may change it in a way the other part did not expect. Immutability reduces that risk, but it is not always the right answer for every situation. Students need a balanced, practical view.

## Key Terms

- mutable: able to change after creation
- immutable: not intended to change after creation
- aliasing: multiple references pointing to the same object
- object lifetime: how long an object continues to exist and be used
- garbage collection: Java's process for cleaning up objects that are no longer reachable
- allocation: creating a new object

## Mutable Objects

A mutable object can update its internal state over time. This is very common and often necessary. A subsystem may need to track current readings. A data collector may need to store new samples. A command may update progress information while it runs. Mutability is not bad. It is simply powerful, and power has to be managed carefully.

The danger of mutable objects appears when change is shared too widely. If many parts of the code can update the same object, it can become hard to tell where a surprising value came from. Students should notice that mutability and access control are connected. If a mutable object exposes too much of itself, outside code may change it in ways the original class designer did not intend.

This is why clear ownership matters. Mutable state usually needs one main place responsible for maintaining it correctly. Without that boundary, the code becomes harder to reason about.

## Immutable Objects

An immutable object keeps its meaningful data fixed after creation. If the program needs a different value, it creates a different object rather than editing the old one. This style can make code easier to reason about because readers do not have to wonder whether some other line changed the object unexpectedly.

Strings are a common example students already know. Their text content does not change after creation. More generally, configuration-style objects and simple value objects are often good candidates for immutability. If the object's job is to represent a setting or a snapshot, immutability can make the design cleaner.

Immutability is helpful because it reduces surprise, but it is not free. Creating new objects instead of modifying old ones can be more verbose, and some parts of a real-time system naturally depend on mutable state. The goal is not to force immutability everywhere. The goal is to know when stable objects improve clarity.

## Aliasing and Shared Change

Aliasing happens when more than one reference points to the same object. This is not automatically a problem, but it becomes important when the object is mutable. If one reference changes the object, the other reference will observe that change too, because both names lead to the same underlying object.

Many beginner bugs come from forgetting this. A student may think they made a copy of an object when they really copied only the reference. Or they may assume a helper method could not affect another part of the program, even though both parts share the same mutable object. Once students understand aliasing, these bugs become easier to predict.

The practical reading question is simple: is this object shared, and if so, who is allowed to change it?

## Object Lifetime and Garbage Collection

An object's lifetime is the span during which the program keeps using it. Some objects exist briefly and then disappear. Others live for most of the program. Java manages memory automatically through garbage collection, which means the programmer usually does not manually delete objects. When an object is no longer reachable from the live parts of the program, Java may reclaim its memory later.

Students do not need a low-level memory-management course to use this well. The practical lesson is that object creation has a cost, object retention has a cost, and neither should be ignored. Most of the time, Java's automatic management is a benefit. But students should still be aware of when they are creating many short-lived objects and whether that is necessary.

In robot code, this matters because some code runs repeatedly. If a loop creates large amounts of unnecessary temporary data every cycle, that may create avoidable pressure on the runtime. The goal is not to become afraid of creating objects. The goal is to be intentional rather than careless.

## Why This Matters For FRC

Robot code naturally mixes mutable and immutable ideas. Configuration values, preset objects, and measurement snapshots may be good candidates for immutability. Live subsystem state, sensor updates, and command progress are often mutable. Students who understand the difference can design cleaner boundaries and predict bugs more accurately.

This lesson also prepares students for later architecture topics. Fake IO, telemetry, subsystems, and command behavior all depend on clear decisions about what should change, who should own that changing information, and how long particular objects should live.

## Before You Move On

- You should know the difference between mutable and immutable objects.
- You should understand that `final` and immutability are related but not identical ideas.
- You should know what aliasing is and why shared mutable objects can be risky.
- You should understand object lifetime and the basic role of garbage collection.
