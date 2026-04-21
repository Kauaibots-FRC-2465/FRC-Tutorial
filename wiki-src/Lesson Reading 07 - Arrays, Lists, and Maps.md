# Lesson Reading 07 - Arrays, Lists, and Maps

## Big Picture

Programs often need to store not just one value, but many related values. A robot might need several sensor readings, several presets, or several named settings. As soon as one variable is not enough, students need a data structure. In this lesson, the three main structures are arrays, lists, and maps. They all store groups of data, but they are designed for different kinds of use.

Choosing a structure is part of expressing an idea clearly. If the order of items matters and the size is fixed, an array may fit well. If the size may change, a list may make more sense. If items need to be found by name or label instead of by position, a map is often the right tool. The point is not to memorize definitions in isolation. The point is to connect each structure to the shape of the problem.

Beginners sometimes treat all collections as interchangeable containers. They are not. The structure chosen affects how easy the code is to read, how easy it is to update values, and what kinds of mistakes are likely to happen. Good programmers choose a structure that matches the way the data will actually be used.

## Key Terms

- array: an ordered fixed-size group of items
- list: an ordered collection whose size can usually change more easily
- map: a collection of key-value pairs
- index: a numeric position in an ordered structure
- key: the name or lookup value used in a map
- collection: a general word for a group of stored items

## Arrays

An array stores items in order. Each item has an index, which is its position in the array. Arrays are useful when the size is known and stable. Students should think of an array as a row of slots. Slot 0 holds the first item, slot 1 holds the next, and so on. This position-based thinking is simple and efficient when the data really does fit a fixed ordered shape.

Arrays are common in programming because they are a basic and direct way to represent grouped data. But they also carry constraints. Their fixed size means they are not always convenient when the number of items may change over time. That does not make arrays bad. It simply means their strengths are clearest when the program already knows how many positions it needs.

Students should also learn early that indexes matter. Using the wrong index can mean reading the wrong item or trying to access a position that does not exist. Ordered structures reward careful thinking about position.

## Lists

Lists are also ordered collections, but they are usually easier to work with when the number of items may change. Students can think of a list as a more flexible sequence. It still has order, and items can still be accessed by position, but the list is designed for easier growth and shrinking than a simple fixed array.

Lists are often friendlier than arrays for everyday application code because they support common collection operations in a more convenient way. That convenience makes them common in Java projects. Students will later see them alongside generics because lists usually store objects of a specific type.

The important conceptual point is that a list still represents order. If order does not matter, or if lookup by name matters more than position, a list may not be the best fit. This is why "just use a list for everything" is not really a design principle. The structure should match the problem.

## Maps

A map stores key-value pairs. Instead of asking for the item at position 2, the program asks for the value connected to a key such as a name, label, or other identifying value. Students should think of a map as a lookup table. It is helpful when the natural question is "what value goes with this name?" rather than "what value is in this position?"

Maps are powerful because many real problems are naturally keyed. A project might connect preset names to preset objects, device names to IDs, or labels to configuration values. In those cases, reading the code becomes easier when the access pattern uses meaningful keys instead of numeric positions that the reader must memorize.

Maps also introduce a different kind of risk. A position in a list always refers to some slot if the index is valid, but a map key might not exist. That means students should learn to ask what happens if the requested key is missing. This question becomes part of good defensive reading and design.

## Choosing the Right Structure

The best structure depends on how the program thinks about the data. If the data is naturally "the first, second, and third item," ordered structures such as arrays or lists may fit well. If the data is naturally "the value associated with this name," a map is often better. The student should ask what kind of access pattern the program will use most often.

Another useful question is whether the size is fixed. If the number of items is stable and known in advance, arrays can be perfectly reasonable. If the number may change or convenience matters more, lists are usually more comfortable. If named lookup is central, a map may be best even if the collection is not large.

Good structure choice improves readability. It tells future readers what kind of relationship the stored data has. A list says sequence. A map says lookup by key. An array says ordered fixed shape. Those meanings help the reader before they even look at the contained values.

## Why This Matters For FRC

Robot projects often need grouped data. Students may store multiple presets, several sensors, controller mappings, autonomous options, or collections of test cases. The wrong structure can make the code harder to understand than it needs to be. The right structure can make the design almost explain itself.

This lesson also prepares students for later lessons on generics and providers. Collections appear frequently in Java. If students already know the difference between ordered access and keyed lookup, they will be much more ready to understand how those collections are typed and used in larger robot code.

## Before You Move On

- You should know that arrays, lists, and maps all store groups of data, but not in the same way.
- You should understand that arrays and lists use order and indexes, while maps use keys.
- You should know how fixed size, changing size, and named lookup affect structure choice.
- You should be able to explain why the data structure should match the problem instead of being chosen at random.
