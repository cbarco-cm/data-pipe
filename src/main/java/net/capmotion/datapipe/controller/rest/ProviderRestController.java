package net.capmotion.datapipe.controller.rest;

import net.capmotion.datapipe.model.Provider;
import net.capmotion.datapipe.services.ProviderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/providers")
public class ProviderRestController {

  private final ProviderService providerService;

  public ProviderRestController(ProviderService providerService) {
    this.providerService = providerService;
  }

  @GetMapping
  public ResponseEntity<java.util.List<Provider>> findOrdersByTableId() {
    return ResponseEntity.ok().body(providerService.findAll().toJavaList());
  }
}
