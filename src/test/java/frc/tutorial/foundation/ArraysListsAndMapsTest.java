package frc.tutorial.foundation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

class ArraysListsAndMapsTest {
  private final CollectionExamples examples = new CollectionExamples();

  @Test
  void arraysStoreFixedSizeSequencesOfValues() {
    boolean[] swerveReadyStates = {true, true, false, true};

    assertEquals(3, examples.countReadyModules(swerveReadyStates));
  }

  @Test
  void listsStoreOrderedGroupsOfObjects() {
    List<String> steps = examples.namedAutoSteps();

    assertEquals(List.of("leave", "turn", "score"), steps);
  }

  @Test
  void mapsStoreValuesByName() {
    Map<String, Integer> presets = examples.shooterRpmByLocation();

    assertEquals(4700, presets.get("podium"));
    assertEquals(5000, presets.get("stage"));
  }
}
