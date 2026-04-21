package frc.tutorial.foundation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class UnitTestsAndTestDoublesTest {
  @Test
  void aFakeCanDriveLogicWithoutAnyRealControllerHardware() {
    FakeDriverInput fakeDriverInput = new FakeDriverInput();
    DriveRequestCalculator calculator = new DriveRequestCalculator(fakeDriverInput);

    fakeDriverInput.setForward(0.75);
    fakeDriverInput.setTurn(-0.5);

    assertEquals(3.0, calculator.scaledForward(4.0), 1.0e-9);
    assertEquals(-90.0, calculator.scaledTurn(180.0), 1.0e-9);
  }
}
