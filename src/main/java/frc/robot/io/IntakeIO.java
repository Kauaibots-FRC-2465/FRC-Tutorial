package frc.robot.io;

public interface IntakeIO {
  void setRollerPercent(double rollerPercent);

  void update();

  double getRollerPercent();

  boolean hasNote();
}
