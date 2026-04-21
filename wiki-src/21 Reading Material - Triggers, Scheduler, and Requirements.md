# 21 Reading Material: Triggers, Scheduler, and Requirements

## Big Picture

Command-based projects do not run commands randomly. Commands are started, updated, interrupted, and ended through a framework system called the scheduler. Triggers are one of the ways commands get activated, and requirements are how the framework prevents incompatible commands from trying to control the same subsystem at the same time.

This lesson is about understanding that control system. Students should stop imagining commands as independent pieces that all run whenever they want. In reality, command-based programming depends on rules. Who requested the command? What subsystem does it need? What is already running? Those questions affect what the scheduler will do.

Once students understand these ideas, a lot of seemingly mysterious robot behavior becomes easier to explain. A command may not start because another one already owns the subsystem. A default command may resume because a temporary command ended. A button press may schedule behavior only while a condition remains true. These are scheduler-driven effects.

## Key Terms

- trigger: a condition or input that can schedule command behavior
- scheduler: the framework system that manages commands over time
- requirement: a subsystem a command declares it needs
- conflict: a situation where two commands want the same subsystem
- interruption: one command ending because another took control
- binding: the setup that connects a trigger to a command action

## Triggers As Conditions

A trigger is not just a button in the physical sense. It is any condition that can be used to start, stop, or otherwise control command scheduling. Button presses are common, but so are other boolean conditions. Students should think of triggers as a bridge between events or conditions and robot actions.

This is important because it keeps the code expressive. Instead of manually checking every button everywhere, the project can declare meaningful relationships between triggers and commands. The code becomes less about scattered polling and more about structured bindings.

Triggers also support more complex behavior than a simple "pressed once" model. Commands may run while a condition remains true, start when a condition becomes true, or toggle based on events. Students do not need every variation memorized at once, but they should understand that triggers are part of a larger scheduling language.

## The Scheduler's Job

The scheduler manages command lifecycles. It checks triggers, starts commands, runs active commands, ends commands when they finish, and handles interruptions. Students should think of the scheduler as the traffic system for command-based code. It keeps actions coordinated instead of letting every command act independently without rules.

This matters because the scheduler is the reason command-based code can stay organized. If every subsystem could be controlled by multiple commands at the same time with no rules, the robot would quickly become unpredictable. The scheduler provides order.

## Requirements and Conflict Prevention

A requirement is a subsystem a command says it needs. This declaration is how the framework knows which commands cannot safely use the same resource at the same time. If two commands both require the same subsystem, the scheduler must resolve that conflict rather than letting both run freely.

Students should see requirements as a statement of ownership during action. While the command is active, it is claiming the right to control that subsystem. This is why default commands yield when another command requiring the same subsystem begins.

This rule is one of the most important protections in command-based design. It prevents two behaviors from fighting over one subsystem and producing confusing or unsafe results.

## Why This Matters For FRC

FRC robots are full of competing possible actions. A driver may hold one button while another event occurs. Autonomous may schedule a sequence while defaults still exist. Requirements and scheduler rules keep the robot's action model coherent.

Students who understand triggers, the scheduler, and requirements can answer much deeper questions about robot behavior. Not just "What does this command do?" but "Why did this command start, stop, or fail to run when I expected it to?"

## Before You Move On

- You should know that triggers are conditions that can schedule commands.
- You should understand that the scheduler manages command lifecycles and coordination.
- You should know what requirements are and why they prevent command conflicts.
- You should be able to explain why interruption and default-command resumption happen.

