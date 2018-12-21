package com.github.delawarecoders.wififinder.service;

import com.github.delawarecoders.wififinder.domain.LocationEntity;
import com.github.delawarecoders.wififinder.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LocationService {

    @Autowired
    LocationRepository locationRepository;


    public LocationEntity addNewLocation (LocationEntity location) {
        locationRepository.
    }

}
