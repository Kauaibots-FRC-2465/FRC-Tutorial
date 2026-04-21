package frc.robot.io;

import static edu.wpi.first.units.Units.Degrees;

import edu.wpi.first.units.measure.Angle;
import frc.robot.Constants;

public class ArmIOFake implements ArmIO {
  private Angle targetAngle = Constants.ArmConstants.STOW_ANGLE;
  private Angle measuredAngle = Constants.ArmConstants.STOW_ANGLE;

  @Override
  public void setTargetAngle(Angle targetAngle) {
    this.targetAngle = targetAngle;
  }

  @Override
  public void update() {
    double error = targetAngle.in(Degrees) - measuredAngle.in(Degrees);
    double maxStep = 2.5;

    if (Math.abs(error) <= maxStep) {
      measuredAngle = targetAngle;
    } else if (error > 0.0) {
      measuredAngle = Degrees.of(measuredAngle.in(Degrees) + maxStep);
    } else {
      measuredAngle = Degrees.of(measuredAngle.in(Degrees) - maxStep);
    }
  }

  @Override
  public Angle getTargetAngle() {
    return targetAngle;
  }

  @Override
  public Angle getMeasuredAngle() {
    return measuredAngle;
  }
}
