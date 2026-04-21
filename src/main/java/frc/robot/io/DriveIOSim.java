package frc.robot.io;

import static edu.wpi.first.units.Units.Meters;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.math.numbers.N2;
import edu.wpi.first.math.system.LinearSystem;
import edu.wpi.first.math.system.plant.DCMotor;
import edu.wpi.first.math.system.plant.LinearSystemId;
import edu.wpi.first.units.measure.Distance;
import edu.wpi.first.wpilibj.simulation.DifferentialDrivetrainSim;
import edu.wpi.first.wpilibj.smartdashboard.Field2d;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class DriveIOSim implements DriveIO {
  private double forwardCommand;
  private double turnCommand;
  private final Field2d field = new Field2d();
  private final LinearSystem<N2, N2, N2> drivetrainSystem =
      LinearSystemId.identifyDrivetrainSystem(1.98, 0.2, 1.5, 0.3);
  private final DifferentialDrivetrainSim sim =
      new DifferentialDrivetrainSim(drivetrainSystem, DCMotor.getCIM(2), 8.0, 0.75, 0.0762, null);

  public DriveIOSim() {
    SmartDashboard.putData("Drive/Field", field);
  }

  @Override
  public void setOpenLoop(double forward, double turn) {
    forwardCommand = forward;
    turnCommand = turn;
  }

  @Override
  public void update() {}

  @Override
  public void simulationPeriodic() {
    double leftVolts = MathUtil.clamp((forwardCommand + turnCommand) * 12.0, -12.0, 12.0);
    double rightVolts = MathUtil.clamp((forwardCommand - turnCommand) * 12.0, -12.0, 12.0);

    sim.setInputs(leftVolts, rightVolts);
    sim.update(0.02);
    field.setRobotPose(sim.getPose());
  }

  @Override
  public double getForwardCommand() {
    return forwardCommand;
  }

  @Override
  public double getTurnCommand() {
    return turnCommand;
  }

  @Override
  public Distance getEstimatedX() {
    return Meters.of(sim.getPose().getX());
  }

  @Override
  public double getHeadingDegrees() {
    return sim.getHeading().getDegrees();
  }
}
