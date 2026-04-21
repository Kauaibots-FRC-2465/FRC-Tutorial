# 13 Reading Material: Unit Tests and Test Doubles

## Big Picture

Testing is a way of checking whether code behaves as expected. A unit test focuses on one small piece of behavior at a time. In this course, tests are important because students should be able to learn and verify robot logic even without access to real hardware. Unit tests support that goal by letting code be checked automatically and repeatedly.

Students sometimes imagine testing as a separate advanced skill that comes after programming. In practice, testing is part of thinking clearly about behavior. A good test asks a simple question: if these inputs and conditions are true, what result should happen? That question forces the programmer to make behavior concrete.

Test doubles help when the real dependency is inconvenient, slow, or unavailable. A fake provider or fake IO object can stand in for real hardware so the test can focus on logic. This is especially useful in FRC, where many classes interact with sensors, motors, or changing inputs.

## Key Terms

- unit test: an automated test of one small piece of behavior
- assertion: a check that compares actual results to expected results
- test double: a replacement used in a test instead of a real dependency
- fake: a working test replacement with simplified behavior
- deterministic: producing predictable results for the same inputs
- isolation: keeping a test focused on the specific behavior it is meant to check

## What a Unit Test Is For

A unit test is not meant to prove that the entire robot project is perfect. It is meant to check one small piece of behavior clearly and automatically. That small scope is what makes the test useful. If the test fails, the programmer has a narrower area to investigate. If it passes, the programmer has evidence that at least one known behavior still works as expected.

Students should see tests as executable expectations. A test does not just say, "I hope this works." It states a condition, runs the code, and checks the result. This makes the programmer's assumptions visible. That visibility helps teams discuss behavior more precisely.

Unit tests are especially strong when they are deterministic. If the same inputs always lead to the same results, then a failed test means something real changed or broke. Random or unstable tests are much less helpful because they damage trust in the testing process.

## Assertions and Behavior

Assertions are the heart of a test. They compare what the code actually did with what the programmer believes it should do. A good assertion is specific. It does not just check that "something happened." It checks the outcome that matters for the behavior under test.

Writing good assertions requires students to clarify the important result. Is the code returning the correct value? Choosing the correct mode? Publishing the correct state? Rejecting an invalid input? The better the student can answer that question, the better the test will be.

This is one reason tests improve design thinking. They force the programmer to state what success looks like in a concrete way.

## Test Doubles

Many classes depend on things that are hard or unnecessary to use in a unit test. Real hardware is the obvious example in robotics. A test double replaces that dependency so the logic can still be exercised. A fake object may provide simplified but useful behavior. A stub may return fixed answers. The exact vocabulary matters less than the practical idea: the test uses a controlled replacement instead of the real thing.

Students should understand why this helps. If the real dependency is noisy, unavailable, or constantly changing, the test may become hard to control. A fake dependency makes the inputs predictable. That lets the test focus on what the code under test is supposed to do with those inputs.

This is closely connected to the course's use of providers and hardware boundaries. Code that depends on interfaces and providers is easier to test because the test can supply its own versions.

## What Tests Can and Cannot Do

Tests are powerful, but they are not magic. A passing unit test does not guarantee the entire program is correct. It guarantees only that the tested behavior matched the expectation in that test. Students should think of tests as evidence, not proof of perfection.

At the same time, that evidence is valuable. Tests catch regressions, document behavior, and support refactoring. If a student changes code and a previously passing test fails, that is a strong signal that something important changed.

Students should therefore avoid two extremes: believing tests are unnecessary, and believing tests solve every problem. Good engineering lives between those extremes.

## Why This Matters For FRC

FRC teams often need to develop logic away from the real robot. Tests make that possible. A class that decides whether the shooter is ready, chooses a preset, or formats telemetry can be tested without spinning motors or reading actual sensors. That makes learning faster and safer.

Tests also help during busy build periods. When the robot is shared by many students, automatic tests give a way to check parts of the codebase even when hardware time is limited. That is a practical advantage, not just a classroom ideal.

## Before You Move On

- You should know that a unit test checks one small behavior automatically.
- You should understand that assertions compare actual results to expected results.
- You should know what a test double is and why fakes are useful.
- You should understand that tests provide useful evidence, but not a guarantee that every part of the program is perfect.

