package com.sepience.particlesimulationplatform;

import com.sepience.particlesimulationplatform.entities.Simulation;
import com.sepience.particlesimulationplatform.services.interfaces.SimulationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ParticleSimulationPlatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(ParticleSimulationPlatformApplication.class, args);
    }

}
