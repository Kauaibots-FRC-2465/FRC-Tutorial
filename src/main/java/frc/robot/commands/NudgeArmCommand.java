package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ArmSubsystem;

public class NudgeArmCommand extends Command {
  private final ArmSubsystem armSubsystem;
  private final double deltaDegreesPerCycle;

  public NudgeArmCommand(ArmSubsystem armSubsystem, double deltaDegreesPerCycle) {
    this.armSubsystem = armSubsystem;
    this.deltaDegreesPerCycle = deltaDegreesPerCycle;
    addRequirements(armSubsystem);
  }

  @Override
  public void execute() {
    armSubsystem.nudgeTargetAngle(deltaDegreesPerCycle);
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
