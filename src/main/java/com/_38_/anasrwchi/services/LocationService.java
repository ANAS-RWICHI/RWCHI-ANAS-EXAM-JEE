package com._38_.anasrwchi.services;

import com._38_.anasrwchi.Dtos.LocationDto;

import java.util.List;

public interface LocationService {
    LocationDto saveLocation(LocationDto locationDto, Long vehiculeId);
    LocationDto getLocation(Long id);
    List<LocationDto> getAllLocations();
}
