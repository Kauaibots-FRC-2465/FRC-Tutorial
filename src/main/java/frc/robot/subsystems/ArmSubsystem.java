package frc.robot.subsystems;

import static edu.wpi.first.units.Units.Degrees;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.units.measure.Angle;
import frc.robot.io.ArmIO;

public class ArmSubsystem extends SubsystemBase {
  private final ArmIO io;

  public ArmSubsystem(ArmIO io) {
    this.io = io;
  }

  public void moveToAngle(Angle targetAngle) {
    io.setTargetAngle(targetAngle);
  }

  public void nudgeTargetAngle(double deltaDegrees) {
    io.setTargetAngle(Degrees.of(io.getTargetAngle().in(Degrees) + deltaDegrees));
  }

  public Angle getTargetAngle() {
    return io.getTargetAngle();
  }

  public Angle getMeasuredAngle() {
    return io.getMeasuredAngle();
  }

  public boolean isAtTargetAngle() {
    return Math.abs(io.getTargetAngle().in(Degrees) - io.getMeasuredAngle().in(Degrees)) <= 1.0;
  }

  @Override
  public void periodic() {
    io.update();
    SmartDashboard.putNumber("Arm/TargetAngleDegrees", io.getTargetAngle().in(Degrees));
    SmartDashboard.putNumber("Arm/MeasuredAngleDegrees", io.getMeasuredAngle().in(Degrees));
    SmartDashboard.putBoolean("Arm/AtTarget", isAtTargetAngle());
  }
}
