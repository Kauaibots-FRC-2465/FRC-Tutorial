package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.DriveSubsystem;
import java.util.function.DoubleSupplier;

public class DriveWithJoysticksCommand extends Command {
  private final DriveSubsystem driveSubsystem;
  private final DoubleSupplier forwardSupplier;
  private final DoubleSupplier turnSupplier;

  public DriveWithJoysticksCommand(
      DriveSubsystem driveSubsystem,
      DoubleSupplier forwardSupplier,
      DoubleSupplier turnSupplier) {
    this.driveSubsystem = driveSubsystem;
    this.forwardSupplier = forwardSupplier;
    this.turnSupplier = turnSupplier;
    addRequirements(driveSubsystem);
  }

  @Override
  public void execute() {
    driveSubsystem.drive(forwardSupplier.getAsDouble(), turnSupplier.getAsDouble());
  }

  @Override
  public void end(boolean interrupted) {
    driveSubsystem.stop();
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
