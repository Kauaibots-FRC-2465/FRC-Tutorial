// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.Constants;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.ArmSubsystem;
import frc.robot.subsystems.IntakeSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;

public final class Autos {
  public static Command scoreAndLeaveAuto(
      DriveSubsystem driveSubsystem, ArmSubsystem armSubsystem, IntakeSubsystem intakeSubsystem) {
    return Commands.sequence(
        new MoveArmToAngleCommand(armSubsystem, Constants.ArmConstants.SPEAKER_ANGLE_DEGREES),
        Commands.waitSeconds(0.5),
        Commands.deadline(
            Commands.waitSeconds(1.0),
            new RunIntakeCommand(intakeSubsystem, Constants.IntakeConstants.OUTTAKE_PERCENT)),
        Commands.run(() -> driveSubsystem.drive(0.6, 0.0), driveSubsystem).withTimeout(2.0),
        Commands.runOnce(driveSubsystem::stop, driveSubsystem));
  }

  public static Command leaveOnlyAuto(DriveSubsystem driveSubsystem) {
    return Commands.sequence(
        Commands.run(() -> driveSubsystem.drive(0.5, 0.0), driveSubsystem).withTimeout(2.5),
        Commands.runOnce(driveSubsystem::stop, driveSubsystem));
  }

  private Autos() {
    throw new UnsupportedOperationException("This is a utility class!");
  }
}
