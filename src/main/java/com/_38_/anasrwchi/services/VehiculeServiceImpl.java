package com._38_.anasrwchi.services;

import com._38_.anasrwchi.Dtos.MotoDto;
import com._38_.anasrwchi.Dtos.VehiculeDto;
import com._38_.anasrwchi.Dtos.VoitureDto;
import com._38_.anasrwchi.Mappers.GlobalMapper;
import com._38_.anasrwchi.entities.Agence;
import com._38_.anasrwchi.entities.Moto;
import com._38_.anasrwchi.entities.Vehicule;
import com._38_.anasrwchi.entities.Voiture;
import com._38_.anasrwchi.entities.enums.StatutVehicule;
import com._38_.anasrwchi.repositories.AgenceRepository;
import com._38_.anasrwchi.repositories.VehiculeRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@AllArgsConstructor
public class VehiculeServiceImpl implements VehiculeService{
    private final VehiculeRepository vehiculeRepository;
    private final AgenceRepository agenceRepository;
    private final GlobalMapper mapper;

    @Override
    public VoitureDto saveVoiture(VoitureDto motoDto) {
        Agence agence = agenceRepository.findById(agenceId).orElseThrow();
        Voiture voiture = mapper.fromVoitureDto(motoDto);
        voiture.setAgence(agence); // [cite: 8]
        return mapper.fromVoiture(vehiculeRepository.save(voiture));
    }

    @Override
    public MotoDto saveMoto(MotoDto motoDto, Long agenceId) {
        return null;
    }


    @Override
    public void updateStatus(Long id, StatutVehicule statut) {
        Vehicule vehicule = vehiculeRepository.findById(id).orElseThrow();
        vehicule.setStatut(statut); //
        vehiculeRepository.save(vehicule);
    }

    @Override
    public List<VehiculeDto> getAllVehicules() {
        return vehiculeRepository.findAll().stream().map(v -> {
            VehiculeDto dto = new VehiculeDto();
            BeanUtils.copyProperties(v, dto);
            return dto;
        }).collect(Collectors.toList());
    }

    @Override
    public VehiculeDto getVehiculeById(Long id) {
        Vehicule vehicule = vehiculeRepository.findById(id).orElseThrow();
        VehiculeDto dto = new VehiculeDto();
        BeanUtils.copyProperties(vehicule, dto);
        return dto;
    }

    @Override
    public MotoDto saveMoto(MotoDto motoDto) {
        Moto moto = mapper.fromMotoDto(motoDto); //
        Moto savedMoto = vehiculeRepository.save(moto);
        return mapper.fromMoto(savedMoto);
    }
    @Override
    public void deleteVehicule(Long id) {
        vehiculeRepository.deleteById(id);
    }
}
