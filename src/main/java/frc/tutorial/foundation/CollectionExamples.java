package frc.tutorial.foundation;

import java.util.List;
import java.util.Map;

public class CollectionExamples {
  public int countReadyModules(boolean[] readyStates) {
    int readyCount = 0;

    for (boolean readyState : readyStates) {
      if (readyState) {
        readyCount++;
      }
    }

    return readyCount;
  }

  public List<String> namedAutoSteps() {
    return List.of("leave", "turn", "score");
  }

  public Map<String, Integer> shooterRpmByLocation() {
    return Map.of("subwoofer", 3500, "podium", 4700, "stage", 5000);
  }
}
