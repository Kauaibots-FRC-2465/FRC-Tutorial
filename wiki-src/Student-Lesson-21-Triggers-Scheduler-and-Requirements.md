# Student Lesson 21: Triggers, Scheduler, and Requirements

This lesson explains how command-based robots decide what is allowed to run and when.

## Main Ideas

A trigger is a condition that can start or stop commands. That condition might come from a controller button, a sensor state, or another logical rule.

The scheduler is the WPILib system that keeps commands moving. It starts them, runs them, ends them, and prevents illegal overlaps. Requirements are part of that system. A requirement says which subsystem a command needs to control. If two commands need the same subsystem at the same time, the scheduler resolves the conflict.

This matters because command-based code would become chaotic without clear rules for ownership. Requirements make resource conflicts visible. They prevent the drivetrain, arm, or intake from being told to do incompatible things at the same moment.

## What Students Should Understand

- Triggers decide when commands should begin or end.
- The scheduler manages command execution.
- Requirements tell the scheduler which subsystems a command needs.
- These rules are what make command-based behavior predictable instead of random.
