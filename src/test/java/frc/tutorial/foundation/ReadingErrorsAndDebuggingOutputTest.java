package frc.tutorial.foundation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class ReadingErrorsAndDebuggingOutputTest {
  private final DebugTraceExamples examples = new DebugTraceExamples();

  @Test
  void exceptionMessagesShouldExplainWhatWentWrong() {
    IllegalArgumentException error =
        assertThrows(IllegalArgumentException.class, () -> examples.requireMotorPort(-1));

    assertEquals("Motor port must be zero or greater, but was -1", error.getMessage());
  }

  @Test
  void traceOutputShouldExposeTheValuesThatDroveADecision() {
    String trace = examples.traceDriveDecision(true, 0.4, -0.1);

    assertTrue(trace.contains("fieldRelative=true"));
    assertTrue(trace.contains("forward=0.4"));
    assertTrue(trace.contains("turn=-0.1"));
  }
}
