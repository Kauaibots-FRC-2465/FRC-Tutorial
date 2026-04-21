package frc.tutorial.foundation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LambdasMethodReferencesAndProvidersTest {
  @Test
  void providersCanSupplyValuesOnlyWhenAnotherClassNeedsThem() {
    ReadyState readyState = new ReadyState(true);
    ProviderDrivenShooter shooter =
        new ProviderDrivenShooter(
            () -> new ShooterPreset("Stage", 5000, 36.0), readyState::isReady);

    assertEquals("Stage at 5000 RPM, fire=true", shooter.statusLine());
  }
}
