package frc.tutorial.foundation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MutabilityImmutabilityAndObjectLifetimeTest {
  @Test
  void mutableObjectsCanChangeAfterTheyAreCreated() {
    MutableMatchState state = new MutableMatchState();
    MutableMatchState alias = state;

    state.noteScored();
    alias.noteScored();

    assertEquals(2, state.getScoredNotes());
  }

  @Test
  void immutableObjectsKeepTheValuesPassedToTheirConstructor() {
    DriveCommandRequest request = new DriveCommandRequest(0.6, -0.2);

    assertEquals(0.6, request.getForward(), 1.0e-9);
    assertEquals(-0.2, request.getTurn(), 1.0e-9);
  }
}
