package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.IntakeSubsystem;

public class RunIntakeCommand extends Command {
  private final IntakeSubsystem intakeSubsystem;
  private final double percent;

  public RunIntakeCommand(IntakeSubsystem intakeSubsystem, double percent) {
    this.intakeSubsystem = intakeSubsystem;
    this.percent = percent;
    addRequirements(intakeSubsystem);
  }

  @Override
  public void execute() {
    intakeSubsystem.run(percent);
  }

  @Override
  public void end(boolean interrupted) {
    intakeSubsystem.stop();
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
