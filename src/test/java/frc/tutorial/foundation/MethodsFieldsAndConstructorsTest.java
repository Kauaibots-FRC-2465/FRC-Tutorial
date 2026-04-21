package frc.tutorial.foundation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class MethodsFieldsAndConstructorsTest {
  @Test
  void constructorLoadsFieldValuesIntoTheObject() {
    ShooterPreset podiumShot = new ShooterPreset("Podium", 4700, 31.5);

    assertEquals("Podium", podiumShot.getName());
    assertEquals(4700, podiumShot.getFlywheelRpm());
    assertEquals(31.5, podiumShot.getHoodAngleDegrees(), 1.0e-9);
  }

  @Test
  void methodsCanComputeUsefulInformationFromFields() {
    ShooterPreset stageShot = new ShooterPreset("Stage", 5000, 36.0);

    assertTrue(stageShot.isHighPower());
    assertEquals("Stage: 5000 RPM at 36.0 degrees", stageShot.describe());
  }
}
