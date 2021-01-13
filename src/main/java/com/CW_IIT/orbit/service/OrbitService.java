package com.CW_IIT.orbit.service;

import java.util.Optional;

import com.CW_IIT.orbit.repository.OrbitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CW_IIT.orbit.entity.Orbit;

@Service
public class OrbitService {
    @Autowired
    OrbitRepository OrbitRepository;

    public void saveOrbit(Orbit Orbit) {
        OrbitRepository.save(Orbit);
    }

    public Iterable<Orbit> getOrbitHistory() {
        return OrbitRepository.findAll();
    }

    public Optional<Orbit> getOrbit(Long id) {
        return OrbitRepository.findById(id);
    }

    public String deleteOrbit(Long id) {
        OrbitRepository.deleteById(id);
        return "Satellite removed !! " + id;
    }

    public Orbit updateOrbit(Orbit orbit) {
        Orbit existingOrbit = OrbitRepository.findById(orbit.getSatelliteId()).orElse(null);
        existingOrbit.setElevation(orbit.getElevation());
        existingOrbit.setAzimuth(orbit.getAzimuth());
        return OrbitRepository.save(existingOrbit);

    }
}
