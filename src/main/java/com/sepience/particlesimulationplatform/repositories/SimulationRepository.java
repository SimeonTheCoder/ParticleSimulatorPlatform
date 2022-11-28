package com.sepience.particlesimulationplatform.repositories;

import com.sepience.particlesimulationplatform.entities.Simulation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SimulationRepository extends JpaRepository<Simulation, Long> {
    List<Simulation> findAll();

    List<Simulation> findSimulationByName(String name);
}
