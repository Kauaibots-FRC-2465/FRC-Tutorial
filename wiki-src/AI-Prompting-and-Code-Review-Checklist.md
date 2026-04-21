# AI Prompting and Code Review Checklist

In this course, code review means reading code carefully and asking whether it matches the design, whether it is understandable, and whether it is likely to behave correctly. AI can help you draft code, but it cannot replace understanding.

## Use AI For

- generating a first draft
- proposing class and command structure
- suggesting tests
- translating a design idea into code skeletons

## Do Not Use AI For

- skipping code review
- inventing hardware details you have not verified
- accepting code just because it looks confident or compiles
- generating large changes you cannot explain

## Strong Prompt Ingredients

- name the subsystem boundaries
- say which classes should own state
- require testable code
- require fake or simulated IO when hardware is unavailable
- ask for small, reviewable steps instead of one giant answer

## Code Review Questions

- Which class owns this state?
- Which subsystem requirements does this command need?
- What happens in disabled, teleop, autonomous, and simulation?
- Can the behavior run without real hardware?
- What data should appear on the dashboard?
- What test would catch the most likely bug?
