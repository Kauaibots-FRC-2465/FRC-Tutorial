package frc.tutorial.foundation;

class FakeDriverInput implements DriverInput {
  private double forward;
  private double turn;

  void setForward(double forward) {
    this.forward = forward;
  }

  void setTurn(double turn) {
    this.turn = turn;
  }

  @Override
  public double forward() {
    return forward;
  }

  @Override
  public double turn() {
    return turn;
  }
}
