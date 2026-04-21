package frc.robot.controls;

public interface DriverControls {
  double forward();

  double turn();

  boolean stowRequested();

  boolean intakePositionRequested();

  boolean speakerPositionRequested();

  boolean intakeInRequested();

  boolean intakeOutRequested();
}
