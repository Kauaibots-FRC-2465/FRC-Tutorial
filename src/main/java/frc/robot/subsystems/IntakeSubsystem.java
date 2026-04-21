package frc.robot.subsystems;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubsystem extends SubsystemBase {
  private double rollerPercent;

  public void run(double rollerPercent) {
    this.rollerPercent = rollerPercent;
  }

  public void stop() {
    run(0.0);
  }

  public double getRollerPercent() {
    return rollerPercent;
  }

  @Override
  public void periodic() {
    SmartDashboard.putNumber("Intake/RollerPercent", rollerPercent);
  }
}
