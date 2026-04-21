package frc.tutorial.foundation;

public class MutableMatchState {
  private int scoredNotes;

  public void noteScored() {
    scoredNotes++;
  }

  public int getScoredNotes() {
    return scoredNotes;
  }
}
