package com.sepience.particlesimulationplatform.services.interfaces;

import com.sepience.particlesimulationplatform.entities.Simulation;

import java.util.List;

public interface SimulationService {
    void addSimulation(Simulation simulation);

    List<Simulation> getAll();
}
