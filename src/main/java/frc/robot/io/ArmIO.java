package frc.robot.io;

import edu.wpi.first.units.measure.Angle;

public interface ArmIO {
  void setTargetAngle(Angle targetAngle);

  void update();

  Angle getTargetAngle();

  Angle getMeasuredAngle();
}
