# AI Prompting and Code Review Checklist

In this course, code review means reading code carefully and checking whether it makes sense, whether it fits the plan for the project, and whether it is likely to work. AI can help you draft code, but it cannot replace understanding.

Understanding means you can explain what the code does, why the class exists, what information it is responsible for, and what might break if you change it.

## Words Used On This Page

- class: one Java type, usually written in one file
- state: information the program is currently holding, such as an arm angle, a shooter speed, or whether the intake has a game piece
- a class owns state: that class is the main place responsible for storing or answering questions about that information
- subsystem requirement: a rule saying which subsystem a command needs to control
- robot mode: one of the robot's main operating situations, such as disabled, teleop, autonomous, or simulation

## Use AI For

- generating a first draft
- proposing class and command structure
- suggesting tests
- translating a design idea into code skeletons

## Do Not Use AI For

- skipping code review
- inventing hardware details you have not verified
- believing code is good just because it sounds confident or compiles
- generating large changes you cannot explain

## Strong Prompt Ingredients

- name the subsystem boundaries
- say which class should be responsible for each important robot fact
- require testable code
- require fake or simulated IO when hardware is unavailable
- ask for small, reviewable steps instead of one giant answer

## Code Review Questions

- Which class should be responsible for this information?
- Example: where should the program store the arm angle, the target position, or whether the intake has a game piece?
- Which subsystems does this command need to control?
- What does the code do in each robot mode: disabled, teleop, autonomous, and simulation?
- Can the behavior run without real hardware?
- What data should appear on the dashboard?
- What test would catch the most likely bug?
