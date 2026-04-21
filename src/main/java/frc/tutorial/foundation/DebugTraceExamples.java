package frc.tutorial.foundation;

public class DebugTraceExamples {
  public int requireMotorPort(int port) {
    if (port < 0) {
      throw new IllegalArgumentException("Motor port must be zero or greater, but was " + port);
    }
    return port;
  }

  public String traceDriveDecision(boolean fieldRelative, double forward, double turn) {
    return "fieldRelative="
        + fieldRelative
        + System.lineSeparator()
        + "forward="
        + forward
        + System.lineSeparator()
        + "turn="
        + turn;
  }
}
