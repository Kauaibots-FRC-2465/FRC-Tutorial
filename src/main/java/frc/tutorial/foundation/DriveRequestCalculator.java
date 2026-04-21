package frc.tutorial.foundation;

public class DriveRequestCalculator {
  private final DriverInput driverInput;

  public DriveRequestCalculator(DriverInput driverInput) {
    this.driverInput = driverInput;
  }

  public double scaledForward(double maxSpeedMetersPerSecond) {
    return driverInput.forward() * maxSpeedMetersPerSecond;
  }

  public double scaledTurn(double maxTurnDegreesPerSecond) {
    return driverInput.turn() * maxTurnDegreesPerSecond;
  }
}
