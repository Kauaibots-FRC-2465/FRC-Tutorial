package frc.robot.io;

import frc.robot.Constants;

public class ArmIOFake implements ArmIO {
  private double targetAngleDegrees = Constants.ArmConstants.STOW_ANGLE_DEGREES;
  private double measuredAngleDegrees = Constants.ArmConstants.STOW_ANGLE_DEGREES;

  @Override
  public void setTargetAngleDegrees(double targetAngleDegrees) {
    this.targetAngleDegrees = targetAngleDegrees;
  }

  @Override
  public void update() {
    double error = targetAngleDegrees - measuredAngleDegrees;
    double maxStep = 2.5;

    if (Math.abs(error) <= maxStep) {
      measuredAngleDegrees = targetAngleDegrees;
    } else if (error > 0.0) {
      measuredAngleDegrees += maxStep;
    } else {
      measuredAngleDegrees -= maxStep;
    }
  }

  @Override
  public double getTargetAngleDegrees() {
    return targetAngleDegrees;
  }

  @Override
  public double getMeasuredAngleDegrees() {
    return measuredAngleDegrees;
  }
}
