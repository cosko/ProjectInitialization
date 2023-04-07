package hr.fer.skalabilnost.labos.health;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.availability.ApplicationAvailability;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HealthController {

  private final ApplicationAvailability applicationAvailability;

  @GetMapping("/health")
  public HealthInfo getApplicationHealth(){
    return HealthInfo.builder().state(applicationAvailability.getLivenessState()).build();
  }
}
