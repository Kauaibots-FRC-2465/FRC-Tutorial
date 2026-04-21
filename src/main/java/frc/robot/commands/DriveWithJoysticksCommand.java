package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants;
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
    double forward =
        applyDeadband(forwardSupplier.getAsDouble()) * Constants.DriveConstants.MAX_FORWARD_COMMAND;
    double turn =
        applyDeadband(turnSupplier.getAsDouble()) * Constants.DriveConstants.MAX_TURN_COMMAND;
    driveSubsystem.drive(forward, turn);
  }

  @Override
  public void end(boolean interrupted) {
    driveSubsystem.stop();
  }

  @Override
  public boolean isFinished() {
    return false;
  }

  private double applyDeadband(double value) {
    return Math.abs(value) < 0.05 ? 0.0 : value;
  }
}
