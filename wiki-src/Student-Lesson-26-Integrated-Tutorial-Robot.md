# Student Lesson 26: Integrated Tutorial Robot

This lesson is about seeing the whole project as one system instead of as isolated topics.

## Main Ideas

By the end of the course, students have seen many separate ideas: Java values, objects, tests, commands, subsystems, telemetry, fake IO, simulation, Git workflow, and more. The final lesson is where those ideas come back together.

Integration means making many parts work together. A healthy robot project is not just a pile of individually correct files. It is a system whose parts fit together in a clear way. Some code owns hardware or fake hardware. Some code owns decisions. Some code publishes data. Some code coordinates actions.

A strong final skill is safe extension. That means asking: if I add a new feature, where should it live, what class should own the important information, how will I verify it, and what existing behavior might I accidentally break?

## What Students Should Understand

- The final robot project is one coherent system, not just a folder of examples.
- Different layers of the project have different jobs.
- A safe modification starts with understanding where the change belongs.
- Good verification habits are part of programming, not an optional extra.
