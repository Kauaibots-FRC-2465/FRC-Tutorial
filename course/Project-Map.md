# Project Map

The first job in a new codebase is not writing code right away. The first job is finding the files that matter so you know where to look.

## Files To Read First

- `build.gradle`: a build file. It tells the build tool which libraries the project uses and how the project should be built.
- `settings.gradle`: another build-system file with project settings.
- `src/main/java/frc/robot/Main.java`: the Java entry point. This is the file that starts the robot program.
- `src/main/java/frc/robot/Robot.java`: the class WPILib calls over and over while the robot is running in different modes.
- `src/main/java/frc/robot/RobotContainer.java`: the place where many command-based projects connect subsystems, commands, and controller buttons. Command-based is a common WPILib project style used by many FRC teams.
- `src/main/java/frc/robot/Constants.java`: shared values that are meant to stay the same unless you intentionally change them.

## What To Notice

- Java code is organized into folders and packages so related files stay together.
- `Main` starts the robot class.
- `Robot` manages the robot's major modes such as disabled, autonomous, teleop, test, and simulation.
- `RobotContainer` is where command-based robots usually define the overall setup of the project.
- Commands describe actions, such as driving, moving an arm, or running an intake.
- Subsystems own one robot capability, such as the drivetrain or the arm.

## Questions Students Should Be Able To Answer

1. Which file starts the robot program?
2. Which file contains methods that keep running while the robot is on?
3. Where would you look for the code that connects controller buttons to robot actions?
4. Where would you look for the code that tells the robot what to do by itself in autonomous mode?
5. Where would you put a constant such as a controller port number?
