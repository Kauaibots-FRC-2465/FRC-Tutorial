// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.Constants.OperatorConstants;
import frc.robot.commands.DriveWithJoysticksCommand;
import frc.robot.commands.MoveArmToAngleCommand;
import frc.robot.commands.RunIntakeCommand;
import frc.robot.commands.Autos;
import frc.robot.subsystems.ArmSubsystem;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.IntakeSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

public class RobotContainer {
  private final DriveSubsystem driveSubsystem = new DriveSubsystem();
  private final ArmSubsystem armSubsystem = new ArmSubsystem();
  private final IntakeSubsystem intakeSubsystem = new IntakeSubsystem();

  private final CommandXboxController driverController =
      new CommandXboxController(OperatorConstants.DRIVER_CONTROLLER_PORT);

  public RobotContainer() {
    driveSubsystem.setDefaultCommand(
        new DriveWithJoysticksCommand(
            driveSubsystem, () -> -driverController.getLeftY(), () -> -driverController.getRightX()));
    configureBindings();
  }

  private void configureBindings() {
    driverController.a().onTrue(new MoveArmToAngleCommand(armSubsystem, Constants.ArmConstants.STOW_ANGLE_DEGREES));
    driverController.x().onTrue(new MoveArmToAngleCommand(armSubsystem, Constants.ArmConstants.INTAKE_ANGLE_DEGREES));
    driverController.y().onTrue(new MoveArmToAngleCommand(armSubsystem, Constants.ArmConstants.SPEAKER_ANGLE_DEGREES));
    driverController.rightTrigger().whileTrue(
        new RunIntakeCommand(intakeSubsystem, Constants.IntakeConstants.INTAKE_PERCENT));
    driverController.leftTrigger().whileTrue(
        new RunIntakeCommand(intakeSubsystem, Constants.IntakeConstants.OUTTAKE_PERCENT));
  }

  public Command getAutonomousCommand() {
    return Autos.exampleAuto(armSubsystem);
  }
}
