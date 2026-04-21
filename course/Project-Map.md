# Project Map

The first job in a new codebase is not writing code. It is finding the places where the important code lives.

## Files To Read First

- `build.gradle`: tells Gradle how the project is built and which plugins and libraries are used.
- `settings.gradle`: tells Gradle where to find WPILib packages on this computer.
- `src/main/java/frc/robot/Main.java`: Java entry point.
- `src/main/java/frc/robot/Robot.java`: WPILib lifecycle methods.
- `src/main/java/frc/robot/RobotContainer.java`: where subsystems, commands, controllers, and bindings are assembled.
- `src/main/java/frc/robot/Constants.java`: shared constants.

## What To Notice

- Java code is organized by package and folder.
- `Main` starts the robot class.
- `Robot` manages mode transitions like disabled, autonomous, teleop, test, and simulation.
- `RobotContainer` is where command-based robots usually define structure.
- Commands describe actions.
- Subsystems own hardware or hardware-like behavior.

## Questions Students Should Be Able To Answer

1. Which file starts the robot program?
2. Which file runs every 20 milliseconds?
3. Where would you look for controller bindings?
4. Where would you look for an autonomous command?
5. Where would you put a constant such as a controller port number?
