package frc.robot.subsystems;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ArmSubsystem extends SubsystemBase {
  private double targetAngleDegrees = Constants.ArmConstants.STOW_ANGLE_DEGREES;

  public void moveToAngle(double targetAngleDegrees) {
    this.targetAngleDegrees = targetAngleDegrees;
  }

  public double getTargetAngleDegrees() {
    return targetAngleDegrees;
  }

  @Override
  public void periodic() {
    SmartDashboard.putNumber("Arm/TargetAngleDegrees", targetAngleDegrees);
  }
}
