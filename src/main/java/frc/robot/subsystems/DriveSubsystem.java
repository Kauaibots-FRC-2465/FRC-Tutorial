package frc.robot.subsystems;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.io.DriveIO;

public class DriveSubsystem extends SubsystemBase {
  private final DriveIO io;

  public DriveSubsystem(DriveIO io) {
    this.io = io;
  }

  public void drive(double forward, double turn) {
    io.setOpenLoop(forward, turn);
  }

  public void stop() {
    drive(0.0, 0.0);
  }

  public double getLastForwardCommand() {
    return io.getForwardCommand();
  }

  public double getLastTurnCommand() {
    return io.getTurnCommand();
  }

  public double getEstimatedXMeters() {
    return io.getEstimatedXMeters();
  }

  public double getHeadingDegrees() {
    return io.getHeadingDegrees();
  }

  public boolean isMoving() {
    return Math.abs(io.getForwardCommand()) > 0.05 || Math.abs(io.getTurnCommand()) > 0.05;
  }

  @Override
  public void periodic() {
    io.update();
    SmartDashboard.putNumber("Drive/ForwardCommand", io.getForwardCommand());
    SmartDashboard.putNumber("Drive/TurnCommand", io.getTurnCommand());
    SmartDashboard.putNumber("Drive/EstimatedXMeters", io.getEstimatedXMeters());
    SmartDashboard.putNumber("Drive/HeadingDegrees", io.getHeadingDegrees());
    SmartDashboard.putBoolean("Drive/IsMoving", isMoving());
  }
}
