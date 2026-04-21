package frc.tutorial.foundation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class InterfacesAccessAndCompositionTest {
  @Test
  void theSameCalculatorCanWorkWithAnythingThatImplementsTheInterface() {
    DriverInput driverInput = new FixedDriverInput(0.5, -0.25);
    DriveRequestCalculator calculator = new DriveRequestCalculator(driverInput);

    assertEquals(2.0, calculator.scaledForward(4.0), 1.0e-9);
    assertEquals(-45.0, calculator.scaledTurn(180.0), 1.0e-9);
  }
}
