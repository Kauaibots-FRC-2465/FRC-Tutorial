package frc.tutorial.foundation;

public final class RobotProfiles {
  public static final int DRIVER_CONTROLLER_PORT = 0;
  public static final double MAX_DRIVE_SPEED_METERS_PER_SECOND = 4.0;
  public static final String TEAM_NAME = "Kauaibots";

  private RobotProfiles() {}

  public static String describePreset(ArmPosition position) {
    return switch (position) {
      case STOW -> "Arm safely inside frame perimeter";
      case INTAKE -> "Arm lowered to collect a game piece";
      case SPEAKER -> "Arm raised to a shooting angle";
    };
  }
}
