package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.units.measure.Angle;
import frc.robot.subsystems.ArmSubsystem;

public class MoveArmToAngleCommand extends Command {
  private final ArmSubsystem armSubsystem;
  private final Angle targetAngle;

  public MoveArmToAngleCommand(ArmSubsystem armSubsystem, Angle targetAngle) {
    this.armSubsystem = armSubsystem;
    this.targetAngle = targetAngle;
    addRequirements(armSubsystem);
  }

  @Override
  public void initialize() {
    armSubsystem.moveToAngle(targetAngle);
  }

  @Override
  public boolean isFinished() {
    return armSubsystem.isAtTargetAngle();
  }
}
