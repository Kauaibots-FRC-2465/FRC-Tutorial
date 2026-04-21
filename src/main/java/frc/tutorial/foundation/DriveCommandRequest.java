package frc.tutorial.foundation;

public class DriveCommandRequest {
  private final double forward;
  private final double turn;

  public DriveCommandRequest(double forward, double turn) {
    this.forward = forward;
    this.turn = turn;
  }

  public double getForward() {
    return forward;
  }

  public double getTurn() {
    return turn;
  }
}
