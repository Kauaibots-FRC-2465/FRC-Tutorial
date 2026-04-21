package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ArmSubsystem;

public class MoveArmToAngleCommand extends Command {
  private final ArmSubsystem armSubsystem;
  private final double targetAngleDegrees;

  public MoveArmToAngleCommand(ArmSubsystem armSubsystem, double targetAngleDegrees) {
    this.armSubsystem = armSubsystem;
    this.targetAngleDegrees = targetAngleDegrees;
    addRequirements(armSubsystem);
  }

  @Override
  public void initialize() {
    armSubsystem.moveToAngle(targetAngleDegrees);
  }

  @Override
  public boolean isFinished() {
    return armSubsystem.isAtTargetAngle();
  }
}
