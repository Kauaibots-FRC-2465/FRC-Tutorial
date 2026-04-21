package frc.robot.subsystems;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.io.ArmIO;

public class ArmSubsystem extends SubsystemBase {
  private final ArmIO io;

  public ArmSubsystem(ArmIO io) {
    this.io = io;
  }

  public void moveToAngle(double targetAngleDegrees) {
    io.setTargetAngleDegrees(targetAngleDegrees);
  }

  public double getTargetAngleDegrees() {
    return io.getTargetAngleDegrees();
  }

  public double getMeasuredAngleDegrees() {
    return io.getMeasuredAngleDegrees();
  }

  @Override
  public void periodic() {
    io.update();
    SmartDashboard.putNumber("Arm/TargetAngleDegrees", io.getTargetAngleDegrees());
    SmartDashboard.putNumber("Arm/MeasuredAngleDegrees", io.getMeasuredAngleDegrees());
  }
}
