# Lesson 06 Reading: Static, Final, Enums, and Constants

## Big Picture

As programs grow, students need better ways to represent values that should stay stable and categories that should stay clear. This lesson introduces several Java tools that help with that job: `static`, `final`, constants, and enums. These ideas are about organization as much as syntax. They help code express what should vary and what should remain fixed.

Beginners often write numbers or strings directly into the code wherever they are needed. That works in tiny examples, but it becomes hard to read and hard to maintain in larger programs. If the same number appears in five places, a reader may not know whether those uses are supposed to match. If a value has no meaningful name, another student may not know what it represents. Constants and enums solve part of that problem by replacing mystery values with named ideas.

`static` and `final` also help communicate intent. They tell the reader something about how a piece of information is supposed to be used. Good code is not only code that runs. Good code also gives honest signals about what is stable, what is shared, and what is allowed to change.

## Key Terms

- `static`: belonging to the class rather than one object instance
- `final`: not meant to be reassigned after it is set
- constant: a named value that is intended to stay the same
- enum: a type made of a small set of named choices
- instance member: something that belongs to one object
- magic number: a raw number in code whose meaning is unclear

## Static Versus Instance Members

Most fields and methods students see early on belong to an object instance. That means each object can have its own copy of the field or use the method with its own data. A `static` field or method is different. It belongs to the class itself. Students should think of `static` as class-level rather than object-level.

This can be useful when the information is truly shared or when a method does not depend on any one object's changing data. Utility methods are a common example. So are grouped constants. But students should not assume that `static` automatically means "better" or "more powerful." It means the member belongs to the class, and that has design consequences. Overusing `static` can make code harder to reason about because shared information is easier to misuse.

One helpful reading question is this: does this field or method make sense only if I already have an object, or does it make sense as a class-wide concept? That question often points toward whether `static` is appropriate.

## What Final Really Means

The word `final` often gives beginners the rough idea "this does not change," and that is partly right, but the details matter. For a variable, `final` usually means the variable will not be assigned a different value or reference later. That is very useful because it communicates stability and prevents accidental reassignment.

However, students should learn one subtle point early: if a `final` variable refers to an object, the object itself might still be mutable. In other words, `final` can protect the reference without guaranteeing that the inside of the object never changes. Full immutability is a later topic, but students should already know that `final` and "completely unchangeable" are not always identical ideas.

Even with that subtlety, `final` is still a strong design signal. It tells readers that the programmer intended a value or reference to remain steady. That makes code easier to trust and easier to read.

## Constants and Why They Matter

A constant is a named value that should stay fixed. Instead of scattering raw numbers through the code, programmers give those values names. This improves readability because a name explains meaning. A constant such as `MAX_ARM_ANGLE` is more informative than an unexplained number. It also improves maintainability because changing the value in one place updates the meaning everywhere it is used.

Students should pay attention to why constants are more than a style preference. They reduce the number of places where meaning can be lost. If a program depends on a threshold, timeout, speed limit, or controller port, that value should usually have a name. Otherwise future readers must reverse-engineer why the number is there.

Constants are especially useful in robotics because robots depend on many physical limits and tuned values. Speed caps, default settings, deadbands, and preset targets are all easier to understand when they have stable names.

## Enums As Named Categories

An enum is a type whose values come from a small fixed list of named options. Students should think of an enum as a safer alternative to using random numbers or strings to represent categories. If a mechanism can be in `IDLE`, `INTAKING`, or `SHOOTING`, an enum expresses that directly.

Enums help because they make the allowed states explicit. Instead of wondering whether any string might appear, the reader knows the possible choices are limited and named. This improves readability and also helps the compiler catch mistakes. A misspelled category in a string is easy to miss. A wrong enum value is easier for the compiler and the programmer to detect.

Enums are common in robot code because systems often have modes, states, or operating choices. Named categories are easier to discuss in meetings too. A team can talk about "the shooter being in `SPINNING_UP`" much more clearly than talking about "the mode where the number is 2."

## Why This Matters For FRC

FRC projects benefit from stable names because students constantly read code written by other students. Constants prevent the code from becoming a pile of unexplained values. Enums prevent state-like ideas from turning into messy strings and integers. `static` and `final` help communicate whether something is shared, fixed, or meant to be configured in one place.

These tools also prepare students for later architecture. Subsystems often depend on constants. Commands may respond differently based on enum values. Telemetry and testing become clearer when names replace magic values. This lesson is really about making intent visible.

## Before You Move On

- You should know the difference between `static` members and instance members.
- You should understand that `final` prevents reassignment, but does not always guarantee deep immutability.
- You should know why constants are better than unexplained literal values.
- You should understand how enums represent a fixed set of named choices.
