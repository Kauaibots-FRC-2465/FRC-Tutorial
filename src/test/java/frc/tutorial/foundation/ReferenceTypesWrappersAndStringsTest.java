package frc.tutorial.foundation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

class ReferenceTypesWrappersAndStringsTest {
  @Test
  void twoVariablesCanPointAtTheSameStringObject() {
    String subsystemName = "Shooter";
    String sameReference = subsystemName;

    assertSame(subsystemName, sameReference);
  }

  @Test
  void newCanCreateADifferentObjectWithTheSameText() {
    String sensorLabel = "Arm Encoder";
    String copiedLabel = new String("Arm Encoder");

    assertEquals(sensorLabel, copiedLabel);
    assertNotSame(sensorLabel, copiedLabel);
  }

  @Test
  void wrapperTypesHoldPrimitiveValuesInsideObjects() {
    Integer measuredRpm = Integer.valueOf(4600);
    Double measuredVoltage = Double.valueOf(11.8);

    assertEquals(4600, measuredRpm.intValue());
    assertEquals(11.8, measuredVoltage.doubleValue(), 1.0e-9);
  }

  @Test
  void nullMeansAReferencePointsToNothingYet() {
    String selectedAutoName = null;

    assertNull(selectedAutoName);
  }
}
