package frc.tutorial.foundation;

public class NamedValue<T> {
  private final String name;
  private final T value;

  public NamedValue(String name, T value) {
    this.name = name;
    this.value = value;
  }

  public String name() {
    return name;
  }

  public T value() {
    return value;
  }
}
