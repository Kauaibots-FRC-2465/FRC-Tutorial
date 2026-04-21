package frc.tutorial.foundation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GenericsAndCommonTypePatternsTest {
  @Test
  void aGenericClassCanStoreAStringValue() {
    NamedValue<String> autoName = new NamedValue<>("selectedAuto", "Two Piece");

    assertEquals("selectedAuto", autoName.name());
    assertEquals("Two Piece", autoName.value());
  }

  @Test
  void aGenericClassCanStoreANumberWithoutChangingItsCode() {
    NamedValue<Integer> shooterRpm = new NamedValue<>("shooterRpm", 4700);

    assertEquals("shooterRpm", shooterRpm.name());
    assertEquals(4700, shooterRpm.value());
  }

  @Test
  void genericTypesCanAlsoHoldCustomObjects() {
    ShooterPreset preset = new ShooterPreset("Protected", 3900, 24.0);
    NamedValue<ShooterPreset> selectedPreset = new NamedValue<>("preset", preset);

    assertEquals("Protected", selectedPreset.value().getName());
    assertEquals(3900, selectedPreset.value().getFlywheelRpm());
  }
}
