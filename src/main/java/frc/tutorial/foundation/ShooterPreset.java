package frc.tutorial.foundation;

public class ShooterPreset {
  private final String name;
  private final int flywheelRpm;
  private final double hoodAngleDegrees;

  public ShooterPreset(String name, int flywheelRpm, double hoodAngleDegrees) {
    this.name = name;
    this.flywheelRpm = flywheelRpm;
    this.hoodAngleDegrees = hoodAngleDegrees;
  }

  public String getName() {
    return name;
  }

  public int getFlywheelRpm() {
    return flywheelRpm;
  }

  public double getHoodAngleDegrees() {
    return hoodAngleDegrees;
  }

  public boolean isHighPower() {
    return flywheelRpm >= 4500;
  }

  public String describe() {
    return name + ": " + flywheelRpm + " RPM at " + hoodAngleDegrees + " degrees";
  }
}
