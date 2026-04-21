# Project Map

The first job in a new codebase is not writing code right away. The first job is finding the files that matter so you know where to look.

## Files To Read First

- `build.gradle`: a build file. It tells the build tool which libraries the project uses and how the project should be built.
- `settings.gradle`: another build-system file with project settings.
- `src/main/java/frc/robot/Main.java`: the Java entry point. This is the file that starts the robot program.
- `src/main/java/frc/robot/Robot.java`: a central framework file you will study later in the course.
- `src/main/java/frc/robot/RobotContainer.java`: a major project file you will study later when the course reaches the FRC framework lessons.
- `src/main/java/frc/robot/Constants.java`: shared values that are meant to stay the same unless you intentionally change them.

## Name Styles You Will See

Java code uses a few common naming patterns. These patterns help you guess what kind of thing you are looking at before you fully understand the code.

- `camelCase`: starts with a lowercase letter, then capitalizes later words, such as `robotContainer`, `driveSpeed`, or `getPose`. This is the normal style for variables, fields, parameters, and methods in Java.
- `PascalCase`: capitalizes every word, such as `RobotConfig`, `RobotContainer`, or `ShooterPreset`. This is the normal style for class names, enum names, and other type names in Java.
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
- `.code-workspace`: a VS Code workspace file that can open several related folders at once. Teams often use this when one robot project depends on several nearby repositories.
- `build/`: generated output such as compiled code, jars, reports, and temporary files. Students normally do not edit anything here.
- `vendordeps/`: vendor library description files. These are used when a project depends on hardware libraries from motor controller or sensor vendors.

## Packages, Folders, and JAR Files

Java files usually begin with a package statement. A package is the named group the class belongs to. The package name is usually tied to the folder path under the source root. For example, if a file says `package frc.robot.util;`, it should normally live in `src/main/java/frc/robot/util/`.

In many Java projects, package names follow a reverse-domain naming pattern such as `com.example.project`, `org.teamname.robot`, or `edu.wpi.first.wpilibj`. That convention helps projects avoid name collisions. In many FRC projects, students will also see the shorter template package `frc.robot`, which is common in WPILib starter projects.

A JAR file is one common kind of Java build output. `JAR` stands for `Java ARchive`. A JAR file is a packaged bundle that can hold compiled Java classes and other resources. Students usually do not edit a JAR by hand. It is something the build process creates from the source files.

## Using Multiple Repositories Together

Some teams keep subsystem libraries or utility libraries in separate repositories. A robot project can still use them if Gradle is told where they are. One common pattern is to add `includeBuild(...)` entries in `settings.gradle` so the robot project includes nearby library folders as local Gradle builds. The robot `build.gradle` can then depend on those libraries by name, such as `implementation 'frc.kauaibots.subsystems:wled'`.

If the team works this way, there are really two setup jobs. First, Gradle has to know about the library folders so the build can use them. Second, VS Code has to open those folders too, often through a `.code-workspace` file, so students can navigate and edit the code across repositories. If the folders are not in the workspace, the build may know about them even though the editor view does not.

## What To Notice

- Java code is organized into folders and packages so related files stay together.
- Package names and folder paths usually line up with each other under `src/main/java/` or `src/test/java/`.
- The `build/` folder often contains JAR files, which are packaged Java build outputs.
- Some teams use a multi-folder VS Code workspace because one robot project may depend on several nearby repositories.
- In that setup, Gradle files and the workspace file both matter.
- `Main` starts the program.
- `Robot` is one of the central framework files, but you do not need to master its deeper role yet.
- `RobotContainer` is another major project file whose deeper FRC role is introduced later in the course.

## Questions Students Should Be Able To Answer

1. Which file starts the robot program?
2. Which file looks like an important framework file even if you are not learning its full role yet?
3. Which files are build files rather than Java source files?
4. Which file names look important now, even if their deeper framework roles are still being saved for later lessons?
5. Where would you put a constant such as a controller port number?
