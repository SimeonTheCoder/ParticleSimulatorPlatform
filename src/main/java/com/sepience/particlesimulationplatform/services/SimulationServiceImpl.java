package com.sepience.particlesimulationplatform.services;

import com.sepience.particlesimulationplatform.entities.Simulation;
import com.sepience.particlesimulationplatform.repositories.SimulationRepository;
import com.sepience.particlesimulationplatform.services.interfaces.SimulationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SimulationServiceImpl implements SimulationService {
    private SimulationRepository simulationRepository;

    public SimulationServiceImpl(SimulationRepository simulationRepository) {
        this.simulationRepository = simulationRepository;
    }


    @Override
    public void addSimulation(Simulation simulation) {
        simulationRepository.save(simulation);
    }

    @Override
    public List<Simulation> getAll() {
        return simulationRepository.findAll();
    }
}
