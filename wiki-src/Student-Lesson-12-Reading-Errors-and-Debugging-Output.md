# Student Lesson 12: Reading Errors and Debugging Output

This lesson teaches students to treat error messages as evidence.

## Main Ideas

Programming feels much harder when every error message looks like noise. The goal of this lesson is to train students to slow down and ask, "What is this message actually telling me?"

An exception is a runtime error. A stack trace shows the chain of method calls that led to that error. The most useful line is usually near the top, where the actual problem is named, not at the bottom where the runtime reports failure.

Debug output is different. It is not the program crashing. It is the programmer choosing to print useful values while the program runs. Good debug output helps answer questions like these: what values were used, which branch was taken, and why did the code make that decision?

Beginners often guess too quickly. They see a failure and immediately start editing random code. A better habit is to collect evidence first. Read the first meaningful error. Look at the values involved. Reproduce the failure in a small case if possible.

## What Students Should Understand

- Errors are usually more helpful than they first appear.
- Stack traces show where the failure came from.
- Debug output should reveal values and decisions, not just say "it failed."
- Evidence-driven debugging is much faster than random editing.
