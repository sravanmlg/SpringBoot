package com.example.servicea;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RestController
public class ClientOnboardingController {
    @GetMapping("/api/onboard")
    public String onboardClient() {
        return "Client onboarding successful testing jenkins!";
    }
}

