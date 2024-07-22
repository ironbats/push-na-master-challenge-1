package com.br.spring.config.client.controller;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties(AppProperties.class)
public class AppController {
  private final AppProperties appProperties;
  public AppController(AppProperties appProperties) {
    this.appProperties = appProperties;
  }
  @GetMapping("/api/app-properties")
  public ResponseEntity<AppProperties> getAppProperties(){
    return ResponseEntity.ok(appProperties);
  }
}
