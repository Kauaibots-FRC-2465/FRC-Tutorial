// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.Constants;
import frc.robot.subsystems.ArmSubsystem;
import edu.wpi.first.wpilibj2.command.Command;

public final class Autos {
  public static Command exampleAuto(ArmSubsystem armSubsystem) {
    return new MoveArmToAngleCommand(armSubsystem, Constants.ArmConstants.SPEAKER_ANGLE_DEGREES);
  }

  private Autos() {
    throw new UnsupportedOperationException("This is a utility class!");
  }
}
