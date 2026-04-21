// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.Constants.OperatorConstants;
import frc.robot.controls.DashboardDriverControls;
import frc.robot.controls.DriverControls;
import frc.robot.controls.XboxDriverControls;
import frc.robot.io.ArmIOFake;
import frc.robot.io.DriveIOFake;
import frc.robot.io.IntakeIOFake;
import frc.robot.commands.DriveWithJoysticksCommand;
import frc.robot.commands.IdleIntakeCommand;
import frc.robot.commands.MoveArmToAngleCommand;
import frc.robot.commands.NudgeArmCommand;
import frc.robot.commands.RunIntakeCommand;
import frc.robot.commands.Autos;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.subsystems.ArmSubsystem;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.IntakeSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;

public class RobotContainer {
  private final DriveSubsystem driveSubsystem = new DriveSubsystem(new DriveIOFake());
  private final ArmSubsystem armSubsystem = new ArmSubsystem(new ArmIOFake());
  private final IntakeSubsystem intakeSubsystem = new IntakeSubsystem(new IntakeIOFake());

  private final CommandXboxController driverController =
      new CommandXboxController(OperatorConstants.DRIVER_CONTROLLER_PORT);
  private final DriverControls controls = createDriverControls();
  private final SendableChooser<Command> autoChooser = new SendableChooser<>();

  public RobotContainer() {
    driveSubsystem.setDefaultCommand(
        new DriveWithJoysticksCommand(driveSubsystem, controls::forward, controls::turn));
    intakeSubsystem.setDefaultCommand(new IdleIntakeCommand(intakeSubsystem));
    configureAutonomous();
    configureBindings();
  }

  private DriverControls createDriverControls() {
    if (edu.wpi.first.wpilibj.RobotBase.isSimulation()) {
      return new DashboardDriverControls();
    }
    return new XboxDriverControls(driverController);
  }

  private void configureBindings() {
    new Trigger(controls::stowRequested)
        .onTrue(new MoveArmToAngleCommand(armSubsystem, Constants.ArmConstants.STOW_ANGLE_DEGREES));
    new Trigger(controls::intakePositionRequested)
        .onTrue(new MoveArmToAngleCommand(armSubsystem, Constants.ArmConstants.INTAKE_ANGLE_DEGREES));
    new Trigger(controls::speakerPositionRequested)
        .onTrue(new MoveArmToAngleCommand(armSubsystem, Constants.ArmConstants.SPEAKER_ANGLE_DEGREES));
    new Trigger(controls::armUpRequested).whileTrue(new NudgeArmCommand(armSubsystem, 1.0));
    new Trigger(controls::armDownRequested).whileTrue(new NudgeArmCommand(armSubsystem, -1.0));
    new Trigger(controls::intakeInRequested).whileTrue(
        new RunIntakeCommand(intakeSubsystem, Constants.IntakeConstants.INTAKE_PERCENT));
    new Trigger(controls::intakeOutRequested).whileTrue(
        new RunIntakeCommand(intakeSubsystem, Constants.IntakeConstants.OUTTAKE_PERCENT));
  }

  private void configureAutonomous() {
    autoChooser.setDefaultOption(
        "Score and Leave",
        Autos.scoreAndLeaveAuto(driveSubsystem, armSubsystem, intakeSubsystem));
    autoChooser.addOption("Leave Only", Autos.leaveOnlyAuto(driveSubsystem));
    SmartDashboard.putData("Autonomous/Chooser", autoChooser);
  }

  public Command getAutonomousCommand() {
    return autoChooser.getSelected();
  }
}
