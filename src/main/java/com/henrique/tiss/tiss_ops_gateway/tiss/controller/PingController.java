// src/main/java/com/henrique/tiss/tiss_ops_gateway/controller/PingController.java
package com.henrique.tiss.tiss_ops_gateway.tiss.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {
  @GetMapping("/ping")
  public String ping() { return "pong"; }
}