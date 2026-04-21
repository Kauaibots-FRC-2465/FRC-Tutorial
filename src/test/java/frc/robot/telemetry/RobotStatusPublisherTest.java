package frc.robot.telemetry;

import static edu.wpi.first.units.Units.Degrees;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import frc.robot.io.ArmIOFake;
import frc.robot.io.DriveIOFake;
import frc.robot.io.IntakeIOFake;
import frc.robot.subsystems.ArmSubsystem;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.IntakeSubsystem;
import org.junit.jupiter.api.Test;

class RobotStatusPublisherTest {
  @Test
  void statusShowsSeekingNoteWhenNoGamePieceIsLoaded() {
    DriveSubsystem driveSubsystem = new DriveSubsystem(new DriveIOFake());
    ArmSubsystem armSubsystem = new ArmSubsystem(new ArmIOFake());
    IntakeSubsystem intakeSubsystem = new IntakeSubsystem(new IntakeIOFake());
    RobotStatusPublisher publisher =
        new RobotStatusPublisher(driveSubsystem, armSubsystem, intakeSubsystem);

    assertFalse(publisher.readyToShoot());
    assertEquals("seeking-note", publisher.summary());
  }

  @Test
  void statusShowsReadyToShootWhenTheRobotIsSettled() {
    DriveIOFake driveIO = new DriveIOFake();
    ArmIOFake armIO = new ArmIOFake();
    IntakeIOFake intakeIO = new IntakeIOFake();
    DriveSubsystem driveSubsystem = new DriveSubsystem(driveIO);
    ArmSubsystem armSubsystem = new ArmSubsystem(armIO);
    IntakeSubsystem intakeSubsystem = new IntakeSubsystem(intakeIO);
    RobotStatusPublisher publisher =
        new RobotStatusPublisher(driveSubsystem, armSubsystem, intakeSubsystem);

    armSubsystem.moveToAngle(Degrees.of(34.0));
    for (int index = 0; index < 20; index++) {
      armSubsystem.periodic();
    }

    intakeIO.setRollerPercent(0.8);
    for (int index = 0; index < 30; index++) {
      intakeSubsystem.periodic();
    }

    driveSubsystem.stop();
    driveSubsystem.periodic();

    assertTrue(publisher.readyToShoot());
    assertEquals("ready-to-shoot", publisher.summary());
  }
}
