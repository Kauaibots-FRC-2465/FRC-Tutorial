package frc.robot.controls;

import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

public class XboxDriverControls implements DriverControls {
  private final CommandXboxController controller;

  public XboxDriverControls(CommandXboxController controller) {
    this.controller = controller;
  }

  @Override
  public double forward() {
    return -controller.getLeftY();
  }

  @Override
  public double turn() {
    return -controller.getRightX();
  }

  @Override
  public boolean stowRequested() {
    return controller.a().getAsBoolean();
  }

  @Override
  public boolean intakePositionRequested() {
    return controller.x().getAsBoolean();
  }

  @Override
  public boolean speakerPositionRequested() {
    return controller.y().getAsBoolean();
  }

  @Override
  public boolean intakeInRequested() {
    return controller.rightTrigger().getAsBoolean();
  }

  @Override
  public boolean intakeOutRequested() {
    return controller.leftTrigger().getAsBoolean();
  }
}
