# 02 Reading Material: Values, Variables, and Primitives

## Big Picture

Programming starts with information. A program has to store numbers, remember yes-or-no decisions, compare one value to another, and update those values as the program runs. In Java, the simplest built-in pieces of information are called primitive values. To work with those values, programmers place them in variables. This lesson is about learning that language clearly enough that the code stops looking like random symbols and starts looking like named pieces of information moving through a system.

A value is the information itself. The number `5` is a value. The decimal `3.14` is a value. The answer `true` is a value. A variable is a name that the program uses to refer to one of those values. If a program stores a speed in a variable called `driveSpeed`, the variable name tells the reader what the number means. Good variable names turn code from a puzzle into a sentence.

Java cares strongly about types. A type tells the compiler what kind of value a variable is allowed to hold. That can feel strict at first, but it is useful. If a variable is supposed to store a whole number, Java can catch mistakes where the programmer tries to use it in a way that does not match that kind of information. The type system is not there to annoy beginners. It is there to help them make fewer silent mistakes.

## Key Terms

- value: the actual piece of information, such as `7`, `false`, or `2.5`
- variable: a named place that stores a value
- type: a rule that describes what kind of value is allowed
- primitive type: one of Java's built-in simple data types
- assignment: storing a value into a variable
- expression: code that produces a value

## Values and Variables

Students should separate two ideas that are easy to mix up. A variable is not the same thing as the value inside it. If a variable starts with one value and later changes to another, the variable name stays the same while the stored value changes. This is one reason variables are useful. They let a program talk about a changing quantity, like battery voltage or target speed, without inventing a new name every time the number changes.

Assignment is the act of putting a value into a variable. When students see an equals sign in a variable declaration or update, they should not read it as a math claim in the normal classroom sense. In Java, assignment means "store this value here." That difference matters because code often updates variables step by step. Understanding assignment is one of the first steps toward understanding how a program's information changes over time.

Variables also improve readability. A literal number such as `0.75` has no explanation by itself. But a variable name such as `intakePower` or `turnThreshold` adds meaning. In real robot code, numbers are everywhere. Variables and named constants make those numbers easier to understand, easier to compare, and safer to change later.

## The Main Primitive Types

Java has several primitive types, but beginners mostly meet a small core set first. `int` stores whole numbers such as `0`, `5`, or `-12`. `double` stores decimal numbers such as `3.5` or `-0.125`. `boolean` stores only two possible values: `true` and `false`. Some programs also use `char` for a single character, though it appears less often in FRC code than numbers and booleans.

The difference between `int` and `double` matters. An `int` is best when the value is counted in whole units, such as the number of selected modes or the number of completed cycles. A `double` is better when precision matters, such as speed, distance, angle, or joystick input. Students should learn that choosing a type is part of expressing meaning. The type is not only about storage; it tells the reader what kind of quantity the programmer expects.

Booleans are especially important because programs are full of decisions. A boolean may answer questions such as "Is the robot enabled?" "Has the shooter reached speed?" or "Does the sensor currently detect a game piece?" Code often becomes easier to read when the result of a question is stored in a clearly named boolean instead of being recomputed in many places.

## Expressions, Calculations, and Change Over Time

An expression is code that produces a value. A simple literal is an expression. A calculation like `currentSpeed + adjustment` is also an expression. A comparison like `distance < limit` is another expression, and that one produces a boolean. Students should get used to the idea that many lines of code are really instructions for how to compute a new value from older ones.

This matters because programs are often a chain of small calculations. A variable may begin with one value, then receive a new value based on a formula, then be compared to a limit, then affect a later decision. When students learn to track values through these steps, they begin to read program behavior rather than just individual lines. That is a major skill for later robot code.

Students should also know that the same number can mean very different things depending on the context. The literal `1` might mean one meter, one second, one controller index, or simply a yes-like flag in some other language. That is why type and naming both matter. A value by itself is often not enough. A value plus a type and a good name is much easier to reason about correctly.

## Common Beginner Mistakes

One common mistake is assuming a variable name and its current value are the same thing. They are not. Another mistake is forgetting that type affects how operations behave. For example, using whole-number arithmetic when decimal precision is needed can produce surprising results. Students do not need to memorize every rule immediately, but they should expect type choices to matter.

Another common mistake is using unclear names. A variable called `x` may be acceptable in a tiny math example, but in larger programs it usually hides meaning. A student who names values based on their purpose will understand their own code more easily later. This matters even more in team programming, where another student may need to read and modify the code days or weeks later.

## Why This Matters For FRC

Robot programs are full of values: motor outputs, sensor readings, timing values, controller inputs, limits, tolerances, and flags that describe the robot's current situation. Before students can understand the later robot-architecture lessons, they need to be comfortable with the idea that a program is constantly storing, updating, and comparing values.

Primitive types are especially common in robotics because the robot interacts with physical quantities. Speed, distance, angle, voltage, and timing all begin as values in code. If students can read variables and primitive types confidently, later lessons on sensor data, commands, and testing will feel much more natural.

## Before You Move On

- You should know the difference between a value and a variable.
- You should understand what `int`, `double`, and `boolean` are used for.
- You should know that assignment stores a value and that expressions produce values.
- You should be able to explain why type and variable naming both help prevent mistakes.


