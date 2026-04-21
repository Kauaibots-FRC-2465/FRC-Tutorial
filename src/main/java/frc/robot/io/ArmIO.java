package frc.robot.io;

public interface ArmIO {
  void setTargetAngleDegrees(double targetAngleDegrees);

  void update();

  double getTargetAngleDegrees();

  double getMeasuredAngleDegrees();
}
