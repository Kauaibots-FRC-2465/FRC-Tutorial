# Lesson 03 Reading: Reference Types, Wrappers, and Strings

## Big Picture

The last lesson introduced primitive types such as `int`, `double`, and `boolean`. Those are not the only kinds of values Java can work with. Much of Java programming revolves around objects, which use reference types. This lesson introduces the difference between primitive values and reference values, along with two very common object categories: wrapper types and strings.

Students do not need to memorize low-level memory details to understand this lesson. The practical idea is enough: a primitive variable directly stores one simple built-in kind of value, while a reference variable is connected to an object. That difference changes how Java treats comparison, `null`, method calls, and many library features. A lot of later confusion disappears once students understand that primitive types and objects follow different rules.

Objects matter because most real Java programs are built out of them. Strings are objects. Collections are objects. Subsystem classes are objects. Commands are objects. If students only understand primitives, they understand only a small part of what Java code is doing. This lesson is one step toward thinking in terms of objects instead of isolated numbers.

## Key Terms

- reference type: a type whose variable refers to an object
- object: one usable instance created from a class
- wrapper type: an object form of a primitive type, such as `Integer` for `int`
- `null`: a special value meaning a reference does not point to any object
- identity: whether two references point to the same object
- text value: a sequence of characters, usually represented by `String`

## Primitive Values Versus Object References

The most important distinction in this lesson is that a primitive value is not an object. A variable of type `int` stores a whole number. A variable of type `String` does not behave that way. It refers to a `String` object. The same general idea applies to most classes in Java. If students see a custom class name or many library class names, they should usually assume they are dealing with a reference type.

This matters because objects can have methods and internal data. A string can answer questions about its length or produce new strings. A list can hold many items. A larger application object can remember information and provide methods for interacting with it. Primitive values are simpler. They do not have the same object-style behavior.

Reference types also introduce `null`. A primitive variable always contains some primitive value when properly initialized. A reference variable can also contain `null`, which means it is not currently pointing to an object. `null` is useful sometimes, but it can also cause runtime problems if code tries to use an object that is not there. Students should treat `null` carefully and always ask whether a reference is expected to have a real object before it is used.

## Wrapper Types

Wrapper types are the object versions of primitive types. `Integer` wraps `int`, `Double` wraps `double`, and `Boolean` wraps `boolean`. Students may wonder why Java has both forms. One reason is that some Java features and libraries work with objects rather than primitives. Collections are a classic example. A `List` can store `Integer` objects, but not plain `int` values directly.

Wrapper types are useful, but they are not interchangeable with primitives in every way. They are objects, so they can be `null`. That means a missing `Integer` value may behave differently from a normal `int` with value `0`. Students should not assume that a wrapper type is just a fancier primitive. It has object behavior, and that includes both benefits and risks.

Java often performs automatic conversion between primitives and wrapper types. This can make code convenient to write, but it can also hide what is happening. Beginners should know that the conversion exists without relying on it blindly. If a type suddenly changes from primitive to wrapper, `null` and object behavior may enter the picture even when the code still looks simple on the surface.

## Strings As Objects

`String` is one of the most common object types in Java. It represents text such as names, messages, labels, and data read from files or dashboards. Even though a string can look simple, it is still an object, not a primitive. That means strings follow reference-type rules. Students should think of a string as a real object with methods and behavior, not just a bag of letters.

Strings are especially important because they appear everywhere: in console output, dashboard labels, error messages, branch names, and sometimes configuration data. A student who understands strings will have an easier time reading tool output and interpreting what the program is trying to communicate.

One helpful fact is that strings in Java are immutable. That means a string object does not change its own text after it is created. When code appears to "change" a string, it usually creates a new string instead. Students do not need a deep theory of immutability yet, but this property helps explain why string operations behave differently from operations on a mutable object.

## Equality, Identity, and Meaning

With reference types, students need to start separating two different questions. First: do these two references point to the exact same object? Second: do these two objects represent the same meaning or content? Those are not always the same question. Two separate string objects could still represent the same text. Two references could also point to the same object instance.

This idea becomes very important later in Java. If students assume that "same object" and "same meaning" are always identical ideas, they may misread program behavior. The full details of equality rules can wait until later, but students should already expect object comparison to be more subtle than primitive comparison.

## Why This Matters For FRC

FRC code is object-heavy. Timers, dashboard entries, helper objects, and many library features are all objects. Students who understand only primitive types can read simple math, but not the structure of the robot program. Reference types are what allow larger pieces of behavior to exist as organized units.

Strings and wrappers appear often too. Strings show up in telemetry, logging, labels, and debugging. Wrappers appear in Java libraries and generic types. Understanding these object forms early makes later lessons on collections, generics, and the FRC framework much less surprising.

## Before You Move On

- You should know the difference between a primitive value and a reference to an object.
- You should understand what wrapper types are and why Java sometimes uses them.
- You should know that `String` is an object type for text, not a primitive.
- You should understand that `null` means a reference is not currently pointing to an object.
