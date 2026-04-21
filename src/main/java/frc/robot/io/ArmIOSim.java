package frc.robot.io;

import static edu.wpi.first.units.Units.Degrees;
import static edu.wpi.first.units.Units.Radians;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.math.system.plant.DCMotor;
import edu.wpi.first.units.measure.Angle;
import edu.wpi.first.wpilibj.simulation.SingleJointedArmSim;
import edu.wpi.first.wpilibj.smartdashboard.Mechanism2d;
import edu.wpi.first.wpilibj.smartdashboard.MechanismLigament2d;
import edu.wpi.first.wpilibj.smartdashboard.MechanismRoot2d;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.util.Color;
import edu.wpi.first.wpilibj.util.Color8Bit;
import frc.robot.Constants;

public class ArmIOSim implements ArmIO {
  private Angle targetAngle = Constants.ArmConstants.STOW_ANGLE;
  private final SingleJointedArmSim sim =
      new SingleJointedArmSim(
          DCMotor.getNEO(1),
          100.0,
          SingleJointedArmSim.estimateMOI(0.6, 3.0),
          0.6,
          Degrees.of(0.0).in(Radians),
          Degrees.of(90.0).in(Radians),
          true,
          Constants.ArmConstants.STOW_ANGLE.in(Radians));
  private final Mechanism2d mechanism = new Mechanism2d(60, 60);
  private final MechanismRoot2d pivot = mechanism.getRoot("ArmPivot", 30, 30);
  private final MechanismLigament2d tower = pivot.append(new MechanismLigament2d("ArmTower", 28, -90));
  private final MechanismLigament2d arm =
      pivot.append(
          new MechanismLigament2d(
              "Arm",
              24,
              sim.getAngleRads() * 180.0 / Math.PI,
              6,
              new Color8Bit(Color.kYellow)));

  public ArmIOSim() {
    tower.setColor(new Color8Bit(Color.kBlue));
    SmartDashboard.putData("Arm/Mechanism", mechanism);
  }

  @Override
  public void setTargetAngle(Angle targetAngle) {
    this.targetAngle = targetAngle;
  }

  @Override
  public void update() {}

  @Override
  public void simulationPeriodic() {
    double errorRadians = targetAngle.in(Radians) - sim.getAngleRads();
    double commandedVolts = MathUtil.clamp(errorRadians * 10.0, -6.0, 6.0);

    sim.setInput(commandedVolts);
    sim.update(0.02);
    arm.setAngle(sim.getAngleRads() * 180.0 / Math.PI);
  }

  @Override
  public Angle getTargetAngle() {
    return targetAngle;
  }

  @Override
  public Angle getMeasuredAngle() {
    return Radians.of(sim.getAngleRads());
  }
}
