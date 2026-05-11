package com._38_.anasrwchi.services;

import com._38_.anasrwchi.Dtos.LocationDto;
import com._38_.anasrwchi.entities.Location;
import com._38_.anasrwchi.entities.Vehicule;
import com._38_.anasrwchi.Mappers.GlobalMapper;
import com._38_.anasrwchi.repositories.LocationRepository;
import com._38_.anasrwchi.repositories.VehiculeRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@AllArgsConstructor
public class LocationServiceImpl implements LocationService {

    private final LocationRepository locationRepository;
    private final VehiculeRepository vehiculeRepository;
    private final GlobalMapper mapper;

    @Override
    public LocationDto saveLocation(LocationDto locationDto, Long vehiculeId) {
        Vehicule vehicule = vehiculeRepository.findById(vehiculeId)
                .orElseThrow(() -> new RuntimeException("Vehicule not found"));

        Location location = mapper.fromLocationDto(locationDto); //
        location.setVehicule(vehicule); //

        Location savedLocation = locationRepository.save(location);
        return mapper.fromLocation(savedLocation);
    }

    @Override
    public LocationDto getLocation(Long id) {
        Location location = locationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Location not found"));
        return mapper.fromLocation(location);
    }

    @Override
    public List<LocationDto> getAllLocations() {
        return locationRepository.findAll().stream()
                .map(mapper::fromLocation)
                .collect(Collectors.toList());
    }
}