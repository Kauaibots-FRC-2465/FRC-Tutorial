# Student Lesson 25: AI-Assisted Feature Design

This lesson explains how to use AI without giving up responsibility for the code.

## Main Ideas

AI can help draft code, suggest structure, or propose tests. That can be useful. But AI does not understand your robot in the way a careful programmer needs to. It predicts plausible code. That is not the same thing as verified code.

The safest use of AI is narrow and reviewable. Ask for a small feature, a sketch, or a first draft. Then inspect it carefully. Students should be able to explain what the code does, why the classes are arranged that way, and how they would test the result.

Good AI prompting includes constraints. Name the subsystem boundaries. Say which class should own which information. Require testable code. Require fake or simulated IO when hardware is unavailable.

## What Students Should Understand

- AI is a drafting tool, not a replacement for understanding.
- Smaller requests are easier to review than giant generated answers.
- Architecture, naming, ownership, and testability still matter when AI is involved.
- Students should trust explanation and evidence, not confident-looking output.
