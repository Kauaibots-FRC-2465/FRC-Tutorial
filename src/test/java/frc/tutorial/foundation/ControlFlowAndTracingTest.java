package frc.tutorial.foundation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ControlFlowAndTracingTest {
  private final ControlFlowExamples examples = new ControlFlowExamples();

  @Test
  void ifStatementsCanChooseBetweenStates() {
    assertEquals("ready", examples.describeBatteryState(12.3));
    assertEquals("watch", examples.describeBatteryState(11.0));
    assertEquals("replace", examples.describeBatteryState(9.8));
  }

  @Test
  void switchExpressionsCanMapOneValueToAnother() {
    assertEquals("left", examples.startingSideFromDial(0));
    assertEquals("center", examples.startingSideFromDial(1));
    assertEquals("right", examples.startingSideFromDial(2));
    assertEquals("unknown", examples.startingSideFromDial(99));
  }

  @Test
  void loopsCanRepeatAnActionUntilTheWorkIsDone() {
    assertEquals("3, 2, 1", examples.warmupCountdown(3));
  }
}
