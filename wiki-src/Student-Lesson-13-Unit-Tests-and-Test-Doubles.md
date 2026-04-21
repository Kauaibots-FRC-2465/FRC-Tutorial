# Student Lesson 13: Unit Tests and Test Doubles

This lesson is about checking behavior automatically instead of only by hand.

## Main Ideas

A unit test is a small automatic check of one behavior. It sets up a situation, runs a small piece of code, and checks whether the result matches the expectation. Tests are useful because they can be repeated quickly and consistently.

Tests also serve as explanations. A good test says, in executable form, "when these inputs exist, this behavior should happen." That makes them helpful for learning as well as for catching regressions.

A test double is a fake replacement for something real. In robot code, the "real" thing might be a controller, motor, or sensor. A fake lets the test focus on logic without needing hardware. That is not cheating. It is good engineering. If the goal of the test is to check a decision rule, real hardware is often a distraction.

This lesson also reinforces dependency separation. Code is easier to test when it depends on clear inputs and outputs instead of directly reaching into hardware everywhere.

## What Students Should Understand

- Tests are repeatable checks of expected behavior.
- Tests can also teach by making expectations explicit.
- Test doubles let students verify logic without a real robot.
- Code that is easier to test is often easier to understand and maintain.
