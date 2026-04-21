package frc.robot.io;

public class IntakeIOFake implements IntakeIO {
  private double rollerPercent;
  private boolean hasNote;
  private int intakeCycles;

  @Override
  public void setRollerPercent(double rollerPercent) {
    this.rollerPercent = rollerPercent;
  }

  @Override
  public void update() {
    if (rollerPercent > 0.5 && !hasNote) {
      intakeCycles++;
      if (intakeCycles >= 25) {
        hasNote = true;
        intakeCycles = 0;
      }
    } else if (rollerPercent < -0.2) {
      hasNote = false;
      intakeCycles = 0;
    } else if (Math.abs(rollerPercent) < 0.05) {
      intakeCycles = 0;
    }
  }

  @Override
  public double getRollerPercent() {
    return rollerPercent;
  }

  @Override
  public boolean hasNote() {
    return hasNote;
  }
}
