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

    //Saves new location into the table in DB
    public LocationEntity addNewLocation (LocationEntity location){
        Optional<LocationEntity> saveLocation = locationRepository.findById(location.getId());
        saveLocation.get().setZipcode(location.getZipcode());
        saveLocation.get().setAddressLineOne(location.getAddressLineOne());
        saveLocation.get().setAddressLineTwo(location.getAddressLineTwo());
        saveLocation.get().setCity(location.getCity());
        saveLocation.get().setState(location.getState());
        return locationRepository.save(saveLocation.get());
    }

    //Retrieves the existing location from the table in DB
    public LocationEntity getLocation (LocationEntity location){
        LocationEntity getLocation = locationRepository.findById(location.getId()).get();
        return  locationRepository.save(getLocation);
    }
}
