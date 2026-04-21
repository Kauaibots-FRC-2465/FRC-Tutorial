# 22 Reading Material: Command Composition and Autonomous

## Big Picture

Once students understand single commands, the next step is combining them into larger behaviors. That is what command composition does. It lets the program build sequences, parallel groups, and other structured combinations from smaller command pieces. This is especially important in autonomous mode, where the robot often needs to perform several planned actions in a deliberate order.

Composition matters because a large robot behavior is usually easier to understand when it is built from smaller named actions. Instead of one giant command trying to do everything, the project can assemble a larger behavior from simpler parts. This is the same design idea students have already seen in other forms: break complexity into meaningful pieces.

Autonomous programming depends on this kind of structure. A good autonomous routine is not just "run many lines of code somehow." It is a carefully organized behavior plan.

## Key Terms

- composition: combining smaller commands into larger behavior
- sequence: commands that run one after another
- parallel: commands that run at the same time
- deadline: a composition where one command determines when the group ends
- autonomous: robot operation that follows preplanned behavior without driver control
- chooser: a mechanism for selecting between different autonomous options

## Why Composition Exists

If every large behavior had to be written as one giant command, the code would quickly become harder to read and harder to reuse. Composition lets the programmer treat commands as building blocks. A movement command, intake command, and aiming command can be used separately in teleop and also combined into a larger autonomous routine.

This helps readability because the larger plan can be described at a higher level. Students can ask, "Which actions happen in what order?" rather than getting lost in low-level details too soon. The small commands still matter, but the larger structure becomes visible.

## Sequential and Parallel Thinking

A sequence means the actions happen one after another. Students should picture this as a planned order. Finish step one, then start step two, then continue to step three. Sequences are common in autonomous because many tasks naturally depend on earlier tasks finishing first.

Parallel composition means more than one action can happen at the same time. This is powerful, but it requires careful thought. Students should ask whether the actions truly can occur together safely and whether their subsystem requirements allow it.

Deadline-style compositions add another layer of control by letting one command determine when the group ends. This is useful when several actions support a main action, but only one of them should decide when the combined behavior is done.

## Autonomous As Planned Behavior

Autonomous mode is where composition becomes especially visible. The robot may need to drive, wait for a condition, move a mechanism, and then do something else. Good autonomous design usually expresses that as structured combinations of smaller commands rather than as one enormous block of tightly mixed logic.

Students should not think of autonomous as a totally separate world from the rest of command-based design. It uses the same ideas: commands, requirements, scheduling, and structure. The difference is that the action flow is driven by a preplanned routine instead of by live driver input.

Choosers matter here because teams often want several autonomous options. A chooser lets the robot or operators select which prepared routine should run. That keeps autonomous flexible without mixing all options together in one confusing method.

## Why This Matters For FRC

Autonomous performance is one of the most visible places where robot architecture shows its quality. A team with well-composed commands can build, test, and revise autonomous routines more easily. A team with tangled action logic often struggles to change one step without breaking several others.

This lesson also reinforces a major course theme: architecture matters because it supports understanding. Composition gives students a way to read large robot behaviors as organized plans instead of unstructured code blobs.

## Before You Move On

- You should know what command composition is and why it helps.
- You should understand the difference between sequential and parallel composition.
- You should know what a deadline-style group is in broad terms.
- You should understand why autonomous behavior is easier to manage when built from smaller commands.

