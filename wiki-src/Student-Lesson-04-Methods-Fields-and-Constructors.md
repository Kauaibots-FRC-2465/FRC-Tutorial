# Student Lesson 04: Methods, Fields, and Constructors

This lesson explains how a class stores data, how it does work, and how it becomes a usable object.

## Main Ideas

A class is a blueprint. An object is one real instance made from that blueprint. Inside a class, fields store data and methods do work. A constructor is the special code that runs when a new object is created.

Fields answer the question "what information does this object remember?" Methods answer the question "what can this object do?" Some methods simply report field values. Others calculate a new answer based on those fields.

Constructors matter because they decide whether a new object starts life in a valid state. A good constructor usually performs simple setup that belongs to that object: storing parameter values, checking required inputs, and setting local defaults.

Constructors become risky when they reach too far outside the object being created. If one object tries to use another object during construction, but that other object is not fully ready yet, startup bugs can appear. This is a construction-order problem. In robot code, those bugs can be especially annoying because many parts of the robot may depend on one another.

The safest beginner rule is this: keep constructors simple. Use them to make one valid object. If more complicated setup depends on several objects already existing, a later `initialize()` or `configure()` step is often safer.

That does not mean outside objects can never appear in constructors. It means students should avoid depending on other objects by accident. If code needs another object during construction, the programmer should know that object is already ready and should be able to explain why that is safe.

## What Students Should Understand

- Fields store data owned by the object.
- Methods use that data to report or calculate information.
- Constructors create valid objects.
- Complex cross-object setup is often safer in a later initialization step than inside the constructor.
