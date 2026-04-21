package frc.tutorial.foundation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StaticFinalEnumsAndConstantsTest {
  @Test
  void staticFinalValuesCanBeReadWithoutCreatingAnObject() {
    assertEquals(0, RobotProfiles.DRIVER_CONTROLLER_PORT);
    assertEquals(4.0, RobotProfiles.MAX_DRIVE_SPEED_METERS_PER_SECOND, 1.0e-9);
    assertEquals("Kauaibots", RobotProfiles.TEAM_NAME);
  }

  @Test
  void enumsGiveNamesToAClosedSetOfStates() {
    assertEquals("Arm safely inside frame perimeter", RobotProfiles.describePreset(ArmPosition.STOW));
    assertEquals("Arm lowered to collect a game piece", RobotProfiles.describePreset(ArmPosition.INTAKE));
    assertEquals("Arm raised to a shooting angle", RobotProfiles.describePreset(ArmPosition.SPEAKER));
  }
}
