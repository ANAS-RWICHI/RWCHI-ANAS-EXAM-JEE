package com._38_.anasrwchi.services;

import com._38_.anasrwchi.Dtos.MotoDto;
import com._38_.anasrwchi.Dtos.VehiculeDto;
import com._38_.anasrwchi.Dtos.VoitureDto;
import com._38_.anasrwchi.entities.enums.StatutVehicule;

import java.util.List;

public interface VehiculeService {
    VoitureDto saveVoiture(VoitureDto voitureDto);
    MotoDto saveMoto(MotoDto motoDto, Long agenceId);
    VehiculeDto getVehiculeById(Long id);
    List<VehiculeDto> getAllVehicules();
    void updateStatus(Long id, StatutVehicule statut);

    MotoDto saveMoto(MotoDto motoDto);

    void deleteVehicule(Long id);
}
