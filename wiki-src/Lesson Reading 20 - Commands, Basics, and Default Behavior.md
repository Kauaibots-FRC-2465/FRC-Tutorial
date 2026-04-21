# Lesson Reading 20 - Commands, Basics, and Default Behavior

## Big Picture

Commands are the action units of command-based FRC code. A subsystem represents a capability or resource. A command tells the robot to do something with that capability. This lesson introduces that basic action model and explains default behavior, which is one of the key reasons command-based structure feels natural once students understand it.

Students should think of commands as named behaviors that can begin, continue, and end. Some commands do something short and finish. Others keep running until interrupted or until a condition changes. This is one reason commands are more than ordinary methods. They participate in the scheduler's ongoing control flow.

Default behavior means a subsystem can have a normal action that happens when nothing else is currently using it. This is extremely useful in teleop, where a drivetrain may normally respond to driver input unless some other command temporarily needs control.

## Key Terms

- command: an action object that uses one or more subsystems
- lifecycle: the stages a command goes through while it runs
- default command: the normal command a subsystem runs when no other command is using it
- scheduler: the system that starts, runs, and stops commands
- interrupt: to stop a command because something else needs control or conditions changed
- requirement: a declared use of a subsystem by a command

## Commands As Actions

A method can perform an action once when it is called. A command is broader. It represents an action over time inside the scheduler. Students should think of a command as behavior with structure: it may initialize, continue doing work, decide whether it is done, and clean up when it ends.

This model is useful because many robot actions are not one-time events. Driving with joysticks is ongoing behavior. Running an intake until a sensor changes is ongoing behavior. Spinning up a shooter and then finishing when ready is ongoing behavior. Commands give those actions names and boundaries.

The named nature of commands also improves readability. Instead of scattering action logic everywhere, the project can organize meaningful behaviors into dedicated command classes or factories.

## Default Commands

A default command is what a subsystem normally does when nothing else currently owns it. Students should think of this as the subsystem's resting active behavior, not its passive idle state in a human sense. For a drivetrain, the default command may continuously read the driver's providers and send drive outputs. For another subsystem, the default command may simply hold a safe target.

Default commands matter because they let the robot feel responsive without requiring every teleop behavior to be manually started over and over. They also fit naturally with interruption. If a different command temporarily uses the subsystem, the default command pauses. When the other command ends, the default command can resume.

This pattern is elegant once students understand it because it expresses the question, "What should this subsystem usually be doing right now?"

## Command Boundaries

Good commands usually have a clear job. They should be understandable in terms of what they are trying to accomplish and which subsystems they need. If a command is doing many unrelated things, that may be a sign the design needs to be split into smaller pieces.

Students should also separate command logic from subsystem logic. A subsystem owns hardware and capability-specific state. A command tells the subsystem what action to perform. This distinction is not always perfectly sharp, but it is a strong design guide.

## Why This Matters For FRC

Commands are one of the main ways FRC teams express robot behavior. Teleop control, button actions, autonomous steps, and temporary overrides all become clearer when expressed as named commands. Students who understand commands gain a practical way to think about robot actions over time.

Default behavior is especially important because many robot capabilities are active most of the time. Learning that concept helps students understand why a command-based project can feel both organized and responsive.

## Before You Move On

- You should know that commands represent actions over time, not just one-time method calls.
- You should understand what a default command is and why it matters.
- You should know that commands have lifecycles managed by the scheduler.
- You should understand the difference between subsystem responsibility and command responsibility.
