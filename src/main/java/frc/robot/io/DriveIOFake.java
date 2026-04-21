package frc.robot.io;

import static edu.wpi.first.units.Units.Meters;

import edu.wpi.first.units.measure.Distance;

public class DriveIOFake implements DriveIO {
  private double forwardCommand;
  private double turnCommand;
  private double estimatedXMeters;
  private double headingDegrees;

  @Override
  public void setOpenLoop(double forward, double turn) {
    forwardCommand = forward;
    turnCommand = turn;
  }

  @Override
  public void update() {
    estimatedXMeters += forwardCommand * 0.04;
    headingDegrees += turnCommand * 3.0;
  }

  @Override
  public double getForwardCommand() {
    return forwardCommand;
  }

  @Override
  public double getTurnCommand() {
    return turnCommand;
  }

  @Override
  public Distance getEstimatedX() {
    return Meters.of(estimatedXMeters);
  }

  @Override
  public double getHeadingDegrees() {
    return headingDegrees;
  }
}
