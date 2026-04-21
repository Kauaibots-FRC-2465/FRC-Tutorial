# Lesson Reading 04 - Methods, Fields, and Constructors

## Big Picture

Classes become useful when students understand three different roles inside them. Fields store information. Methods do work with that information. Constructors create new objects so those fields and methods can actually be used. These ideas sound basic, but they form the backbone of object-oriented Java. If students are shaky here, later architecture topics will feel much harder than they need to.

A class is a blueprint. An object is one actual instance made from that blueprint. If a class describes a shooter preset, then one object might represent a close-shot preset and another object might represent a far-shot preset. The class defines what all presets have in common. Each object stores its own data. This is one of the biggest shifts from tiny beginner programs to larger projects: instead of a single pile of variables, programs start organizing related data and behavior into objects.

Students should learn to ask two questions when reading a class. First: what information does this object remember? Second: what work can this object do? Fields usually answer the first question. Methods answer the second. Constructors answer a third question: how does this object become valid in the first place?

## Key Terms

- field: a variable stored inside an object
- method: a named block of code that does work
- parameter: a value given to a method or constructor
- return value: the result a method sends back
- constructor: the special setup code that runs when a new object is created
- instance: one actual object made from a class

## Fields: What the Object Knows

Fields represent the information that belongs to an object. If a class models a preset, its fields may store angle, speed, or label information. If a class models a sensor wrapper, its fields may store the latest reading or the hardware object it communicates with. The important idea is ownership. A field is not just any variable. It is a variable that belongs to that object and is available across the object's methods.

Students should distinguish fields from local variables. A local variable lives only inside a method or constructor. A field is part of the object's longer-lived state. This difference matters because it changes what information is available later. If a value must still matter after the current method finishes, it probably belongs in a field rather than a local variable.

Good classes usually store fields that match their responsibility. If a class stores too many unrelated pieces of information, it may be trying to do too many jobs. In beginner code, that often shows up as one giant class that remembers everything. Learning to identify fields helps students also learn to notice when a class boundary is becoming messy.

## Methods: What the Object Can Do

Methods are the actions a class offers. Some methods answer questions by returning information. Others perform calculations. Others update fields or send instructions to something else. Students should not assume that every method changes the object. Some methods simply report what is already known, and those are often just as important.

Parameters let a method receive outside information. A parameter is part of a method's input. The method can combine its parameters with the object's fields to produce a result. This is a powerful idea because it lets one object respond to changing situations without forgetting what it already knows.

Return values matter too. A method that returns a value is answering a question for the caller. Students should get into the habit of asking, "What information does this method need, and what information does it give back?" That question makes long files easier to read because each method begins to feel like a small contract.

## Constructors: How an Object Starts Life

A constructor is the special code that runs when a new object is created. Its main job is to make sure the new object starts in a valid condition. In many classes, that means storing parameter values into fields, checking that required information was provided, and setting reasonable defaults for anything not supplied from outside.

Constructors are important because the quality of an object's starting state affects everything that happens later. If the object begins with missing or inconsistent data, later methods may fail even if those methods are written correctly. A good constructor protects the rest of the class by ensuring the object is usable from the moment construction finishes.

Students should notice that constructors are not general-purpose dumping grounds for every kind of setup. Their first responsibility is narrow: create one valid object. If a constructor starts doing too many unrelated jobs, the class becomes harder to understand and harder to trust.

## Constructor Best Practices

The safest beginner rule is to keep constructors simple. A constructor should usually store its own required information, set local defaults, and stop. That keeps the beginning of the object's life easy to reason about. When students can explain exactly what the constructor guarantees, the rest of the class becomes easier to read.

Problems appear when constructors reach too far outside the object being created. Suppose object A is being constructed and, during that process, it tries to use object B. That might be safe, but only if object B is already fully ready. If B is still being constructed, or if the order of construction is not clear, startup bugs can appear. Those bugs are frustrating because the program fails before its real behavior even begins.

This is why construction order matters. In robot code, several objects may depend on one another. If constructors begin calling across those boundaries too early, the project can become fragile. The beginner-friendly best practice is to avoid outside-object work in constructors unless the programmer clearly knows that the outside object already exists and is safe to use.

## When To Use Later Initialization

Sometimes a class really does need setup that depends on several objects already existing. In that case, a later `initialize()`, `configure()`, or other explicit setup step is often cleaner than doing everything inside the constructor. This pattern separates "create the object" from "connect it to the rest of the system." That separation can make startup order much easier to manage.

This does not mean constructors should never receive other objects. They often do. For example, a class may need a sensor object or a provider object to do its job. The important question is whether the constructor is merely storing that dependency or whether it is trying to perform complicated work with it immediately. Storing is often fine. Reaching deep into other objects during construction is where the risk usually begins.

## Why This Matters For FRC

FRC code is full of objects: central project classes, telemetry helpers, fake IO classes, utility classes, and more. Those objects need to be created in a predictable way. If students understand fields, methods, and constructors well, they can read how one object stores dependencies, how another receives live inputs, and how the project is assembled into a working system.

This lesson also connects directly to design quality. When a class has clear fields, methods with understandable jobs, and a constructor that creates a valid object without surprising side effects, the code becomes easier to test and easier to change. Those are not advanced luxuries. They are practical habits that make team code more reliable.

## Before You Move On

- You should know the difference between fields and local variables.
- You should understand that methods take input through parameters and may return results.
- You should know that constructors create valid objects and should usually stay simple.
- You should understand why depending on outside objects during construction can cause order-related startup problems.
