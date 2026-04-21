package frc.robot.controls;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class DashboardDriverControls implements DriverControls {
  public DashboardDriverControls() {
    SmartDashboard.setDefaultNumber("Controls/Forward", 0.0);
    SmartDashboard.setDefaultNumber("Controls/Turn", 0.0);
    SmartDashboard.setDefaultBoolean("Controls/Stow", false);
    SmartDashboard.setDefaultBoolean("Controls/IntakePosition", false);
    SmartDashboard.setDefaultBoolean("Controls/SpeakerPosition", false);
    SmartDashboard.setDefaultBoolean("Controls/IntakeIn", false);
    SmartDashboard.setDefaultBoolean("Controls/IntakeOut", false);
  }

  @Override
  public double forward() {
    return SmartDashboard.getNumber("Controls/Forward", 0.0);
  }

  @Override
  public double turn() {
    return SmartDashboard.getNumber("Controls/Turn", 0.0);
  }

  @Override
  public boolean stowRequested() {
    return SmartDashboard.getBoolean("Controls/Stow", false);
  }

  @Override
  public boolean intakePositionRequested() {
    return SmartDashboard.getBoolean("Controls/IntakePosition", false);
  }

  @Override
  public boolean speakerPositionRequested() {
    return SmartDashboard.getBoolean("Controls/SpeakerPosition", false);
  }

  @Override
  public boolean intakeInRequested() {
    return SmartDashboard.getBoolean("Controls/IntakeIn", false);
  }

  @Override
  public boolean intakeOutRequested() {
    return SmartDashboard.getBoolean("Controls/IntakeOut", false);
  }
}
