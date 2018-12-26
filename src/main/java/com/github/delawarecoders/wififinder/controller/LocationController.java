package com.github.delawarecoders.wififinder.controller;

import com.github.delawarecoders.wififinder.domain.LocationEntity;
import com.github.delawarecoders.wififinder.repository.LocationRepository;
import com.github.delawarecoders.wififinder.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class LocationController {

    @Autowired
    private LocationRepository locationRepository;

    @Autowired
    private LocationService locationService;

    @PostMapping("/location")
    public LocationEntity addLocation(@Valid @RequestBody LocationEntity location){
        return locationService.addNewLocation(location);
    }

    @GetMapping("/location")
    public Page<LocationEntity> getAllLocations(Pageable pageable){
        return locationRepository.findAll(pageable);
    }

    @GetMapping("/location/{locationId}")
    public LocationEntity getLocationById(@PathVariable Long locationId){
        return locationRepository.findById(locationId).get();
    }
}
