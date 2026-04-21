package frc.tutorial.foundation;

public class FixedDriverInput implements DriverInput {
  private final double forward;
  private final double turn;

  public FixedDriverInput(double forward, double turn) {
    this.forward = forward;
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
