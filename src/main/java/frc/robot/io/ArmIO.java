package frc.robot.io;

import edu.wpi.first.units.measure.Angle;

public interface ArmIO {
  void setTargetAngle(Angle targetAngle);

  void update();

  default void simulationPeriodic() {}

  Angle getTargetAngle();

  Angle getMeasuredAngle();
}
