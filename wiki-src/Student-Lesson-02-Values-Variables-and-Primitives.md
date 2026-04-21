# Student Lesson 02: Values, Variables, and Primitives

This lesson introduces the built-in value types that show up everywhere in robot code.

## Main Ideas

A variable is a named place that stores a value. When you write Java, you are constantly naming values so the program can reuse them later. Some values are built directly into the language. These are called primitive types.

The most common primitive types in beginner robot code are `int`, `double`, `boolean`, and `char`. `int` stores whole numbers. `double` stores decimal numbers. `boolean` stores `true` or `false`. `char` stores one single character. A lot of FRC logic depends on these types. Motor percentages, distances, speeds, flags, sensor conditions, and menu choices all begin with basic values.

One important beginner mistake is forgetting that Java treats different primitive types differently. If you divide two `int` values, Java gives you another `int`, which means the decimal part is thrown away. That is why `3 / 4` becomes `0` instead of `0.75`. If you want the decimal answer, at least one side must be a decimal type such as `double`.

Booleans are especially important because they model decisions. A beam break might be blocked or not blocked. A note might be loaded or not loaded. An intake might need to run or stop. Many control decisions become clearer when students realize that the program is often just turning measurements into `true` or `false` questions.

## What Students Should Understand

- Primitive types are the most basic built-in value types in Java.
- Choosing the right primitive type affects how calculations behave.
- Integer division is a common bug source.
- Booleans are the language of decision-making in robot code.
