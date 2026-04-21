# 01 Lesson Overview: Java Program Structure and Project Layout

Branch: `lesson-01-reading-a-java-project`
Reading Page: [01 Reading Material: Java Program Structure and Project Layout](<01 Reading Material - Java Program Structure and Project Layout>)
How to use this lesson: reading and discussion

## What This Lesson Is Really About

Before students can read a Java project, they need a small amount of Java structure vocabulary. They need to know what a class is, what a method is, what a variable is, and how packages and files fit together. This lesson teaches those basics first and then uses them to make the project layout feel less mysterious. You do not need to understand the FRC framework files yet. Those are taught later in the course.

## New Words

- source file: a file that contains Java code you wrote for the program
- build file: a file that tells the build system how to create the program
- entry point: the place where the program starts running
- class: a named Java type that groups related data and behavior
- object: one actual instance made from a class
- variable: a named place that stores a value
- field: a variable stored inside a class or object
- method: a named block of code that does work or returns information
- package statement: the line near the top of a Java file that says which package the class belongs to
- JAR file: a packaged Java build output; `JAR` stands for `Java ARchive`
- main class: one of the central Java files the project starts from or relies on
- support file: a file that helps the project build, configure itself, or organize code

## Goals

- Understand what a class, method, variable, field, and package are at a beginner level.
- Find where execution starts.
- Separate build files from source files.
- Connect Java package names to folder paths.
- Know what a JAR file is when it appears in the `build/` folder.
- Recognize the difference between simple Java classes, entry-point files, and later framework files.

## Read First

- `course/Project-Map.md`
- `src/main/java/frc/tutorial/foundation/ShooterPreset.java`
- `src/main/java/frc/robot/Main.java`
- `src/main/java/frc/robot/Robot.java`
- `src/main/java/frc/robot/RobotContainer.java` just to notice its location and name; its role is taught later

## Name Styles You Will See

- `camelCase`: starts lowercase and then uses capital letters for later words, such as `robotConfig` or `maxSpeed`. In Java, methods and variables usually use this style.
- `PascalCase`: capitalizes every word, such as `RobotConfig` or `ShooterPreset`. In Java, class names usually use this style.
- `UPPER_SNAKE_CASE`: all capital letters with underscores, such as `DRIVER_PORT`. In Java, constants often use this style.
- `snake_case`: lowercase letters with underscores, such as `drive_speed`. This is common in some other languages and data files, but not the normal style for Java variables or classes.

## Project Structure You Will See

A directory structure is the way folders and files are arranged in a project. In an FRC Java project, that structure helps you tell the difference between robot code, tests, build setup, Git data, and generated files.

- `.git/` stores Git history and internal repository data.
- `.gitignore` tells Git which local or generated files to ignore.
- `src/main/java/` holds the main robot code.
- `src/test/java/` holds test code.
- `build.gradle` and `settings.gradle` tell the build system how to build the project.
- `build/` holds generated output such as reports and JAR files and should usually be left alone.

## Basic Structure To Notice First

A class is one of the main building blocks of Java. A class gives a program a way to keep related information and related actions together in one named place. When students open a Java file, the most important first question is often, "What class is this file defining?" Once they know that, the rest of the file feels less random.

A method is something the class knows how to do, or a question the class knows how to answer. If a class needs to calculate a value, report information, or perform an action, that work usually appears in a method. A student does not need to understand every Java symbol yet. They do need to know that methods are where behavior is written.

A variable is a named place that stores a value. Some variables live inside methods and exist only while that method is running. A field is a variable that belongs to the class or to one object made from that class. Fields are the pieces of information the class keeps track of over time.

A package is a named group of related classes. Packages help keep large projects organized. The package statement near the top of the file tells where the class belongs in the project, and that package name usually matches the folder path the file is stored in.

When students look at `ShooterPreset.java`, they should mainly notice this shape:
- one file contains one class
- the class has fields that store data
- the class has methods that return information or answer a question
- the package statement near the top tells where that class belongs in the project

That is enough structure for this lesson. Students do not need control flow details yet. They need to be able to see the outline of a Java file and say, "this is the class name, these are fields, these are methods, and this package tells me where the file belongs."

## Focus Questions

- Which file starts the program?
- Which files are there to build the project, and which files contain Java code?
- In a simple Java class, which parts are the fields and which parts are the methods?
- Which files seem central right now, and which files can wait until the later FRC lessons?

## Success Check

- You can explain what a class, field, method, variable, and package are at a beginner level.
- You can explain where the program starts, where the build files live, and which deeper framework files you can safely postpone for later.


