package frc.robot.io;

import edu.wpi.first.units.measure.Distance;

public interface DriveIO {
  void setOpenLoop(double forward, double turn);

  void update();

  double getForwardCommand();

  double getTurnCommand();

  Distance getEstimatedX();

  double getHeadingDegrees();
}
