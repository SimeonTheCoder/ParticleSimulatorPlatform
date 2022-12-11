package com.sepience.particlesimulationplatform.services.interfaces;

import com.sepience.particlesimulationplatform.entities.Simulation;
import com.sepience.particlesimulationplatform.entities.SimulationDto;

import java.util.List;

public interface SimulationService {
    void addSimulation(Simulation simulation);

    List<Simulation> getAll();

    void upload(Simulation simulation);

    Simulation transform(SimulationDto simulationDto);
}
