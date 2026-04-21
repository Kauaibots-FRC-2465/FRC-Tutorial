# Lesson Reading 16 - Command-Based Project Structure

## Big Picture

This lesson is the doorway from general Java into the structure of a real WPILib command-based robot project. By now students know enough Java to stop treating the robot code as magic. The next step is understanding the major pieces of the framework and how they fit together.

Command-based programming organizes robot code around a few main ideas. Subsystems represent major robot capabilities and the hardware they own. Commands represent actions the robot can perform with those subsystems. `RobotContainer` usually wires together the controls and high-level setup. `Robot` connects the project to the robot lifecycle. `Constants` stores stable named values. Students do not need to memorize every detail immediately, but they do need a clear map of these roles.

The power of this structure is that it separates responsibilities. Instead of one giant file trying to do everything, the project divides robot behavior into clearer pieces. That makes the code more readable, easier to test, and easier to revise.

## Key Terms

- subsystem: a major robot capability that owns related hardware and behavior
- command: an action or behavior that uses one or more subsystems
- `RobotContainer`: the class that commonly wires controls, commands, and shared project setup together
- `Robot`: the class tied to the robot lifecycle
- `Constants`: a common place for stable named values
- scheduler: the framework system that manages commands as the robot runs

## The Roles of the Main Classes

Students should think of `Robot` as the class closest to the framework's lifecycle. It responds to the robot being disabled, enabled, in autonomous, in teleop, and so on. It does not need to contain every detail of robot behavior. Its job is to connect the project to the environment in which the robot runs.

`RobotContainer` usually acts as the project's wiring hub. It creates important objects, sets up controller bindings, and decides how commands connect to buttons or triggers. Students should not think of it as a second dumping ground. Its job is organization and assembly.

Subsystems represent meaningful robot parts or capabilities. They own the hardware references and the state that belongs with that capability. Commands then use those subsystems to perform actions. This separation makes the robot easier to reason about because students can ask, "What hardware and state belong to this subsystem?" and "What action is this command trying to perform?"

## Why This Structure Helps

Without a framework, students might put controller logic, hardware access, robot mode handling, and decision logic all in one place. That quickly becomes difficult to manage. Command-based structure does not eliminate complexity, but it gives complexity a place to live.

This matters because code is read more often than it is first written. A project with clear roles helps future readers know where to look. If a button binding needs to change, `RobotContainer` is a likely place. If a mechanism's hardware logic needs to change, the subsystem is a likely place. If an action sequence needs to change, the command is a likely place.

The framework also encourages reuse. A subsystem can support many different commands. A command can often be tested or reasoned about independently from unrelated parts of the robot.

## Reading Strategy for Command-Based Projects

Students should not try to understand every class at once. A good reading order is to identify the main classes and their roles first. Find `Robot`, `RobotContainer`, and the subsystem and command packages. Ask what each file is responsible for. Then trace one behavior path, such as a controller input leading to a command that uses a subsystem.

This top-down reading strategy matters because the framework is about connections. Students are not just reading isolated methods. They are reading how the project is organized. Once that organizational map exists, the details make much more sense.

## Why This Matters For FRC

Command-based programming is one of the standard WPILib project styles teams use. Students who understand it can read many real FRC codebases, not just the examples in this course. More importantly, they can start modifying robot behavior without having to guess where everything belongs.

This lesson marks an important transition in the course. Students are no longer only learning Java as a language. They are learning how Java is used to structure a working robot program.

## Before You Move On

- You should know the main roles of `Robot`, `RobotContainer`, subsystems, commands, and `Constants`.
- You should understand that command-based structure separates responsibilities across those pieces.
- You should know why that separation makes the project easier to read and change.
- You should be able to describe a good top-down strategy for reading a command-based project.
