package frc.robot.subsystems;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.io.IntakeIO;

public class IntakeSubsystem extends SubsystemBase {
  private final IntakeIO io;

  public IntakeSubsystem(IntakeIO io) {
    this.io = io;
  }

  public void run(double rollerPercent) {
    io.setRollerPercent(rollerPercent);
  }

  public void stop() {
    run(0.0);
  }

  public double getRollerPercent() {
    return io.getRollerPercent();
  }

  public boolean hasNote() {
    return io.hasNote();
  }

  @Override
  public void periodic() {
    io.update();
    SmartDashboard.putNumber("Intake/RollerPercent", io.getRollerPercent());
    SmartDashboard.putBoolean("Intake/HasNote", io.hasNote());
  }
}
