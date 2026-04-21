package frc.tutorial.foundation;

import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

public class ProviderDrivenShooter {
  private final Supplier<ShooterPreset> presetSupplier;
  private final BooleanSupplier allowedToShootSupplier;

  public ProviderDrivenShooter(
      Supplier<ShooterPreset> presetSupplier, BooleanSupplier allowedToShootSupplier) {
    this.presetSupplier = presetSupplier;
    this.allowedToShootSupplier = allowedToShootSupplier;
  }

  public String statusLine() {
    ShooterPreset preset = presetSupplier.get();
    boolean allowedToShoot = allowedToShootSupplier.getAsBoolean();

    return preset.getName() + " at " + preset.getFlywheelRpm() + " RPM, fire=" + allowedToShoot;
  }
}
