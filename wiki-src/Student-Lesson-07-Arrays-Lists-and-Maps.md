# Student Lesson 07: Arrays, Lists, and Maps

This lesson explains the most common ways Java stores groups of values.

## Main Ideas

Programs often need more than one value of the same general kind. An array, list, or map gives the program a way to store many values together.

An array is a fixed-size ordered group. It is useful when the number of items is known and does not need to change. A list is also ordered, but it is usually more flexible. It is often the better choice when the amount of data might grow or shrink. A map stores values by key. Instead of saying "give me item number 2," you say "give me the value named `speakerShot`."

The important lesson is not memorizing every method on these classes. The important lesson is recognizing the shape of the problem. If order matters, a list or array may fit. If lookup by name matters, a map may fit. If the size is fixed, an array may be enough.

Robot code uses these structures for presets, autonomous steps, named settings, and collections of measurements.

## What Students Should Understand

- Arrays, lists, and maps all store multiple values, but they do it differently.
- Arrays are fixed-size.
- Lists preserve order and are usually more flexible than arrays.
- Maps look up values by key instead of by position.
