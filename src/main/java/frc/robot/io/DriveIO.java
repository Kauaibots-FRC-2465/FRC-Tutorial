package frc.robot.io;

public interface DriveIO {
  void setOpenLoop(double forward, double turn);

  void update();

  double getForwardCommand();

  double getTurnCommand();

  double getEstimatedXMeters();

  double getHeadingDegrees();
}
