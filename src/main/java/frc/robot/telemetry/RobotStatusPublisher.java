package frc.robot.telemetry;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.subsystems.ArmSubsystem;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.IntakeSubsystem;

public class RobotStatusPublisher {
  private final DriveSubsystem driveSubsystem;
  private final ArmSubsystem armSubsystem;
  private final IntakeSubsystem intakeSubsystem;

  public RobotStatusPublisher(
      DriveSubsystem driveSubsystem, ArmSubsystem armSubsystem, IntakeSubsystem intakeSubsystem) {
    this.driveSubsystem = driveSubsystem;
    this.armSubsystem = armSubsystem;
    this.intakeSubsystem = intakeSubsystem;
  }

  public void publish() {
    SmartDashboard.putBoolean("Status/ReadyToShoot", readyToShoot());
    SmartDashboard.putString("Status/Summary", summary());
  }

  public boolean readyToShoot() {
    return intakeSubsystem.hasNote() && armSubsystem.isAtTargetAngle() && !driveSubsystem.isMoving();
  }

  public String summary() {
    if (readyToShoot()) {
      return "ready-to-shoot";
    }
    if (driveSubsystem.isMoving()) {
      return "driving";
    }
    if (!intakeSubsystem.hasNote()) {
      return "seeking-note";
    }
    return "aiming";
  }
}
