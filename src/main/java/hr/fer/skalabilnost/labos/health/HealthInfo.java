package hr.fer.skalabilnost.labos.health;

import lombok.Builder;
import lombok.Data;
import org.springframework.boot.availability.LivenessState;

@Data
@Builder
public class HealthInfo {

  private LivenessState state;
}
