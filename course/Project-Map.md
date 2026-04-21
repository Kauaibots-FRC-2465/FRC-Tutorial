# Project Map

The first job in a new codebase is not writing code right away. The first job is finding the files that matter so you know where to look.

## Files To Read First

- `build.gradle`: a build file. It tells the build tool which libraries the project uses and how the project should be built.
- `settings.gradle`: another build-system file with project settings.
- `src/main/java/frc/robot/Main.java`: the Java entry point. This is the file that starts the robot program.
- `src/main/java/frc/robot/Robot.java`: the class WPILib calls over and over while the robot is running in different modes.
- `src/main/java/frc/robot/RobotContainer.java`: the place where many command-based projects connect subsystems, commands, and controller buttons. Command-based is a common WPILib project style used by many FRC teams.
- `src/main/java/frc/robot/Constants.java`: shared values that are meant to stay the same unless you intentionally change them.

## Name Styles You Will See

Java code uses a few common naming patterns. These patterns help you guess what kind of thing you are looking at before you fully understand the code.

- `camelCase`: starts with a lowercase letter, then capitalizes later words, such as `robotContainer`, `driveSpeed`, or `getPose`. This is the normal style for variables, fields, parameters, and methods in Java.
- `PascalCase`: capitalizes every word, such as `RobotContainer`, `DriveSubsystem`, or `ShooterPreset`. This is the normal style for class names, enum names, and other type names in Java.
- `UPPER_SNAKE_CASE`: uses all capital letters with underscores, such as `DRIVER_PORT` or `MAX_SPEED_METERS_PER_SECOND`. This is the normal style for constants.
- `snake_case`: uses lowercase letters with underscores, such as `drive_speed`. This is not the normal style for Java variables or classes, but students may still see it in file names from other tools, in JSON data, or in code from other languages.

## Common Folders And Hidden Files

A directory structure is the way files and folders are arranged inside a project. In an FRC Java project, the directory structure helps separate source code, tests, build files, Git history, and generated output.

- `.git/`: the hidden folder where Git stores the repository's history and internal data. Students usually do not edit anything inside this folder directly.
- `.gitignore`: the file that tells Git which generated or local-only files should not appear in Source Control.
- `src/main/java/`: the main Java source folder. This is where the robot code students read and edit usually lives.
- `src/test/java/`: the Java test folder. This is where unit tests live.
- `src/main/deploy/`: files copied to the robot for runtime use, if the project needs them.
- `gradle/`: support files used by the Gradle wrapper.
- `gradlew.bat`: the Windows Gradle wrapper script. VS Code and WPILib commands use this behind the scenes so students do not have to run Gradle by hand.
- `build/`: generated output such as compiled code, jars, reports, and temporary files. Students normally do not edit anything here.
- `vendordeps/`: vendor library description files. These are used when a project depends on hardware libraries from motor controller or sensor vendors.

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
