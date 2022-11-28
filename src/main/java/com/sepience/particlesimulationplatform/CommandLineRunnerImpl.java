package com.sepience.particlesimulationplatform;

import com.sepience.particlesimulationplatform.services.interfaces.SimulationService;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerImpl implements org.springframework.boot.CommandLineRunner {
    private SimulationService service;

    public CommandLineRunnerImpl(SimulationService service) {
        this.service = service;
    }

    @Override
    public void run(String... args) throws Exception {
//        Simulation simulation = new Simulation("General Kenobi", "Hello there!", "TCoder");

//        service.addSimulation(simulation);
    }
}
