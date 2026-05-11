package com._38_.anasrwchi.services;

import com._38_.anasrwchi.Dtos.AgenceDto;
import com._38_.anasrwchi.Dtos.VehiculeDto;

import java.util.List;

public interface AgenceService {
    AgenceDto saveAgence(AgenceDto agenceDto);
    AgenceDto getAgence(Long id);
    List<AgenceDto> getAllAgences();
    AgenceDto updateAgence(Long id, AgenceDto agenceDto);
    void deleteAgence(Long id);
}
