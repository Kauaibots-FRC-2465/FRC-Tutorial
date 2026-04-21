package frc.tutorial.foundation;

public class ControlFlowExamples {
  public String describeBatteryState(double voltage) {
    if (voltage >= 12.0) {
      return "ready";
    }
    if (voltage >= 10.5) {
      return "watch";
    }
    return "replace";
  }

  public String startingSideFromDial(int dialPosition) {
    return switch (dialPosition) {
      case 0 -> "left";
      case 1 -> "center";
      case 2 -> "right";
      default -> "unknown";
    };
  }

  public String warmupCountdown(int seconds) {
    StringBuilder builder = new StringBuilder();

    for (int current = seconds; current > 0; current--) {
      if (builder.length() > 0) {
        builder.append(", ");
      }
      builder.append(current);
    }

    return builder.toString();
  }
}
