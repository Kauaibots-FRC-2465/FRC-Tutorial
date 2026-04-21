package frc.robot.subsystems;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveSubsystem extends SubsystemBase {
  private double lastForwardCommand;
  private double lastTurnCommand;

  public void drive(double forward, double turn) {
    lastForwardCommand = forward;
    lastTurnCommand = turn;
  }

  public void stop() {
    drive(0.0, 0.0);
  }

  public double getLastForwardCommand() {
    return lastForwardCommand;
  }

  public double getLastTurnCommand() {
    return lastTurnCommand;
  }

  @Override
  public void periodic() {
    SmartDashboard.putNumber("Drive/ForwardCommand", lastForwardCommand);
    SmartDashboard.putNumber("Drive/TurnCommand", lastTurnCommand);
  }
}
