# 05 Reading Material: Control Flow and Tracing

## Big Picture

Knowing what individual lines mean is not enough to read a program well. Students also have to know which lines actually run, in what order they run, and how the program chooses between different paths. That is what control flow describes. This lesson is about turning code from a static page into a sequence of actions that can be followed step by step.

Beginners often get overwhelmed because they try to understand a whole file all at once. Tracing is the skill that solves that problem. To trace code means to follow the execution path carefully: first this line runs, then a condition is checked, then one branch runs instead of another, then a loop repeats, and so on. Tracing slows the reading process down in a useful way. It replaces guessing with observation.

Control flow matters in every program, but especially in robot code. A robot program is full of decisions. Should the intake run? Is the shooter ready? Which command should respond to this button press? Students do not need to know the full robot framework yet to see the pattern. Programs are constantly evaluating conditions and choosing paths.

## Key Terms

- control flow: the order in which statements execute
- condition: an expression that produces `true` or `false`
- branch: one possible path the program can take
- loop: a structure that repeats work
- trace: following execution step by step
- iteration: one pass through a loop

## Decisions With Conditions

Decision-making in code often starts with a condition. A condition is an expression that answers a yes-or-no question. If the answer is `true`, one path may run. If the answer is `false`, another path may run. Students should see conditions as questions the program asks itself while it is working.

`if` and `else` structures are the most direct expression of that idea. They tell the program to choose one path or another based on a condition. The important reading skill is not simply recognizing the keywords. It is asking what question is being asked and what the program will do in each possible answer. If students can describe the condition in plain language, they are already reading the logic well.

`switch` statements serve a related purpose when the program must choose among several named cases. Instead of asking one yes-or-no question, a switch compares a value against several possible categories. This is often useful with enums or modes. Students should learn that different control-flow tools exist because different problem shapes exist.

## Repetition With Loops

Loops repeat work. A loop is useful when the same kind of action needs to happen multiple times. That might mean moving through every item in a collection, counting through a range of numbers, or repeatedly checking a condition while it remains true. The key reading question is always the same: what causes the loop to continue, and what causes it to stop?

Students should not think of loops as "magic repeating code." A loop is still just control flow with rules. If the stopping condition is clear, a loop becomes much easier to understand. If the stopping condition is unclear or never changes, a loop can become dangerous because it may run longer than expected or even forever.

In many real systems, repeated behavior is not written with a visible `for` or `while` loop in the local code. Instead, a framework may call methods over and over. Students will see this later in robot periodic methods and scheduling. That is one reason this lesson matters even before the WPILib lessons begin. The idea of repeated execution shows up in many forms.

## Tracing As a Reading Skill

Tracing means mentally or physically following the program one step at a time. Students may write notes, circle variable changes, or describe the flow aloud. The goal is to answer the simple question: what happens next? This turns a confusing block of code into a sequence of smaller decisions and updates.

When tracing, students should pay attention to changing variable values. A condition that was false at one moment may become true later because some earlier line changed a variable. That is why tracing and state changes go together. Code often feels confusing only because the reader has lost track of what values currently exist.

A strong tracing habit is to stop after each important step and restate the situation. Which variables changed? Which branch was taken? Is the loop continuing? This keeps the reader grounded. Many debugging problems are really tracing problems in disguise. The student is not wrong about syntax; the student is wrong about which path the program actually took.

## Common Mistakes When Reading Control Flow

One common mistake is reading all branches as if they run, even though only one path will actually happen at a time. Another is forgetting that loop bodies may run many times with different values on each pass. Students also sometimes skip the condition itself and look only at the code inside the branches. That usually leads to misunderstanding because the condition is what decides whether the branch matters at all.

Another common problem is tracing too quickly. Programming rewards careful reading more than fast reading. A student who slowly follows ten lines correctly will often understand more than a student who skims fifty lines and guesses. This is especially true when conditions depend on previous calculations.

## Why This Matters For FRC

Robot programs are full of control flow. A button may trigger one command if the robot is in one state and a different command in another. A sensor may decide whether a mechanism should keep moving. Autonomous behavior may follow one path until a condition changes and then continue somewhere else. None of that can be read well without tracing.

This lesson also prepares students for debugging. When a robot behaves unexpectedly, the question is often not "What does this method mean?" but "Which path did the program take, and why?" Students who can trace control flow are much more prepared to answer that question with evidence instead of guesswork.

## Before You Move On

- You should understand that control flow means the order in which code runs.
- You should know how conditions create branches and how loops repeat work.
- You should understand tracing as a step-by-step reading process.
- You should be able to explain why variable changes can affect later branches and loop behavior.


