package hr.fer.skalabilnost.labos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class HealthController {

  @GetMapping("/health")
  public RedirectView getServiceHealth(){
    return new RedirectView("actuator/health");
  }
}
