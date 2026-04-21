# Lesson Reading 12 - Errors and Debugging Output

## Big Picture

Programming becomes much less stressful when students stop seeing errors as personal failure and start seeing them as information. This lesson is about reading what the tools and the program are already telling you. Compiler errors, runtime exceptions, stack traces, warnings, and log messages are all forms of communication. Good debuggers learn to interpret that communication instead of reacting to it emotionally.

Students do not need to know every error message in advance. They need a method for reading them. What kind of error is this? When did it happen? Which file and line does it point to? What was the program trying to do? These questions turn an intimidating block of text into a smaller investigation.

Debugging output also includes messages that are not full errors. Console lines, dashboard values, and other traces can help students understand whether the program is taking the path they expect. In that sense, debugging is not only about responding after something breaks. It is also about making program behavior visible while it runs.

## Key Terms

- compiler error: a problem that stops the code from building
- runtime exception: a problem that happens while the program is running
- stack trace: a report showing the chain of method calls leading to an error
- warning: a sign of possible trouble that may not stop the program immediately
- log message: text printed to help humans understand what the program is doing
- debugging: the process of finding and correcting the cause of a problem

## Compiler Errors Versus Runtime Problems

Compiler errors happen before the program runs. They usually mean the code does not follow Java's rules closely enough for the compiler to turn it into a working program. That can include missing symbols, type mismatches, syntax mistakes, or incorrect method usage. Students should treat compiler errors as build-time feedback. The program is telling you it cannot even begin because something structural is wrong.

Runtime problems are different. The program built successfully, but while it was running it encountered a situation it could not handle. This might involve `null`, an invalid index, a missing key, or some other bad assumption. Runtime exceptions often feel scarier because they happen after the program has already started, but they are still readable if students stay methodical.

Distinguishing these two categories matters because they suggest different first questions. Compiler errors ask, "What is wrong with the code I wrote?" Runtime exceptions ask, "What happened while this running program followed a path?"

## How To Read a Stack Trace

A stack trace shows the call chain that led to an error. It is not just noise. It is a trail. Students should learn to read it from the part that names the exception and then look for the first relevant line in their own code. That line often tells them where the immediate failure became visible.

The line mentioned in a stack trace is not always the original mistake, but it is still useful. It shows where the program finally could not continue. From there, students can ask what values or assumptions led to that point. In this way, stack traces support tracing and reasoning rather than replacing them.

Students should not try to understand every line in a long framework stack trace. The important skill is learning to identify where their own code appears and using that as a starting point.

## Logging and Visible Clues

Sometimes the program does not crash, but it still behaves incorrectly. In those cases, extra output can help. Log messages and dashboard values make invisible internal decisions visible. A well-placed message can confirm whether a condition became true, whether a method was called, or whether a value changed when expected.

Good debugging output is specific and useful. It should answer a question the programmer actually has. Too much output becomes noise, but thoughtful output helps students test their assumptions about program flow.

This is one reason telemetry and logging matter in robot code. When a robot does the wrong thing, students cannot always see why from physical motion alone. They need the code to reveal what it believed and what path it took.

## A Simple Debugging Process

A strong beginner process is: reproduce the problem, identify what kind of problem it is, read the exact message carefully, find the relevant file and line, inspect the values and assumptions involved, make one focused change, and then verify whether the problem is actually fixed. This process is calmer and more reliable than randomly changing many lines at once.

Students should especially avoid the habit of "fixing" errors by trial and error without understanding them. That sometimes produces a working result, but it does not build knowledge. Debugging is a reading skill as much as a writing skill.

## Why This Matters For FRC

Robot programming adds extra pressure because behavior happens in a physical system. A mechanism may move wrong, not move at all, or behave inconsistently. Students need to use build output, test output, console logs, and dashboard values together to understand what the software believed at each step.

If students can read errors calmly and use debugging output intentionally, they will be much more effective during both class and build season. This lesson is really about replacing panic with process.

## Before You Move On

- You should know the difference between compiler errors and runtime exceptions.
- You should understand that a stack trace is a clue about the path that led to failure.
- You should know why logging and dashboard output help reveal invisible program behavior.
- You should be able to describe a simple, methodical debugging process.
