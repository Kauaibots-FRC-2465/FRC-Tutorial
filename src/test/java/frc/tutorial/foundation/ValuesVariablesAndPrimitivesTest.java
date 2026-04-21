package frc.tutorial.foundation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ValuesVariablesAndPrimitivesTest {
  @Test
  void motorPercentCanBeConvertedToVoltage() {
    double batteryVoltage = 12.0;
    double drivePercent = 0.65;
    double appliedVoltage = batteryVoltage * drivePercent;

    assertEquals(7.8, appliedVoltage, 1.0e-9);
  }

  @Test
  void booleansCanDescribeRobotState() {
    boolean beamBreakBlocked = true;
    boolean noteLoaded = beamBreakBlocked;
    boolean intakeShouldRun = !noteLoaded;

    assertTrue(noteLoaded);
    assertFalse(intakeShouldRun);
  }

  @Test
  void integerDivisionBehavesDifferentlyFromDoubleDivision() {
    int completedAutos = 3;
    int attemptedAutos = 4;
    int integerRatio = completedAutos / attemptedAutos;

    double completedAutosDouble = 3.0;
    double attemptedAutosDouble = 4.0;
    double decimalRatio = completedAutosDouble / attemptedAutosDouble;

    assertEquals(0, integerRatio);
    assertEquals(0.75, decimalRatio, 1.0e-9);
  }

  @Test
  void charsAreJustSingleCharactersNotStrings() {
    char grade = 'A';
    String label = "A";

    assertEquals('A', grade);
    assertEquals("A", label);
  }
}
