package com.sepience.particlesimulationplatform.services;

import com.sepience.particlesimulationplatform.entities.Simulation;
import com.sepience.particlesimulationplatform.entities.SimulationDto;
import com.sepience.particlesimulationplatform.repositories.SimulationRepository;
import com.sepience.particlesimulationplatform.services.interfaces.SimulationService;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    @Override
    public void upload(Simulation simulation) {
        simulationRepository.save(simulation);
    }

    @Override
    public Simulation transform(SimulationDto simulationDto) {
        ModelMapper modelMapper = new ModelMapper();

        PropertyMap<SimulationDto, Simulation> mechanicMap = new PropertyMap<SimulationDto, Simulation>() {
            @Override
            protected void configure() {
                skip().setId(0);
            }
        };

        modelMapper.addMappings(mechanicMap);
        modelMapper.validate();

        return modelMapper.map(simulationDto, Simulation.class);
    }
}
