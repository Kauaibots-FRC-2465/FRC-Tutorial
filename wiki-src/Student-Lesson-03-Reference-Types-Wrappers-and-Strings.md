# Student Lesson 03: Reference Types, Wrappers, and Strings

This lesson explains that not every variable directly holds its data.

## Main Ideas

Primitive variables hold their value directly. Reference variables are different. A reference variable points to an object. That means two variables can point to the same object, and `null` means the variable is not pointing to any object right now.

This idea matters because Java uses objects constantly. `String` is an object. Lists are objects. Custom classes are objects. Once students understand references, a lot of Java stops looking mysterious.

The keyword `new` creates a new object. That matters even when the object contains the same text or values as another object. Two objects can be equal in content without being the same object in memory. Beginners do not need a deep memory model yet, but they do need to understand that "same text" and "same object" are not always the same thing.

Wrapper types are object forms of primitive values. For example, `Integer` wraps an `int` and `Double` wraps a `double`. They exist because some Java tools and libraries work with objects, not raw primitive values. Students will see wrappers often in collections and APIs.

`null` is useful because it gives Java a way to say "there is no object here yet." It is also dangerous because if code tries to use a `null` reference like a real object, the program fails at runtime.

## What Students Should Understand

- A reference points to an object instead of storing the full object directly.
- `new` creates a new object.
- `null` means "no object here right now."
- Wrapper types let primitive-like data participate in object-based APIs.
