package com.CW_IIT.orbit.controller;

import java.util.Optional;

import com.CW_IIT.orbit.exceptions.InvalidOrbitReferenceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.CW_IIT.orbit.entity.Orbit;
import com.CW_IIT.orbit.service.OrbitService;

@RestController
@RequestMapping("/orbit")
public class OrbitController {
    @Autowired
    OrbitService orbitService;

    @PostMapping("/create")
    public Long createOrbit(@RequestBody Orbit orbit) {
        orbitService.saveOrbit(orbit);
        return orbit.getSatelliteId();
    }

    @GetMapping("/viewAll")
    public Iterable<Orbit> viewAllOrbits() {
        return orbitService.getOrbitHistory();
    }

    @GetMapping("/view/{id}")
    public Orbit viewOrbitById(@PathVariable ("id") Long id) {
        Optional<Orbit> satellite = orbitService.getOrbit(id);
        if(satellite.isPresent()) {
            return satellite.get();
        }

        throw new InvalidOrbitReferenceException("Invalid Satellite reference provided");
    }

    @PutMapping("/update")
    public Long updateOrbit(@RequestBody Orbit orbit) {
        orbitService.updateOrbit(orbit);
        return orbit.getSatelliteId();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteSatellite(@PathVariable ("id") long id) {
        Optional<Orbit> satellite = orbitService.getOrbit(id);
        if(satellite.isPresent()) {
            return orbitService.deleteOrbit(id);
        }

        throw new InvalidOrbitReferenceException("Invalid Satellite reference provided");
    }
}

