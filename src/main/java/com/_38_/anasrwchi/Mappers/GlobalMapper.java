package com._38_.anasrwchi.Mappers;

import com._38_.anasrwchi.Dtos.*;
import com._38_.anasrwchi.entities.*;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class GlobalMapper {

    // --- Agence Mappings ---
    public AgenceDto fromAgence(Agence agence) {
        AgenceDto agenceDto = new AgenceDto();
        BeanUtils.copyProperties(agence, agenceDto); //
        return agenceDto;
    }

    public Agence fromAgenceDto(AgenceDto agenceDto) {
        Agence agence = new Agence();
        BeanUtils.copyProperties(agenceDto, agence);
        return agence;
    }

    // --- Voiture Mappings ---
    public VoitureDto fromVoiture(Voiture voiture) {
        VoitureDto voitureDto = new VoitureDto();
        BeanUtils.copyProperties(voiture, voitureDto); //
        return voitureDto;
    }

    public Voiture fromVoitureDto(VoitureDto voitureDto) {
        Voiture voiture = new Voiture();
        BeanUtils.copyProperties(voitureDto, voiture);
        return voiture;
    }

    // --- Moto Mappings ---
    public MotoDto fromMoto(Moto moto) {
        MotoDto motoDto = new MotoDto();
        BeanUtils.copyProperties(moto, motoDto); //
        return motoDto;
    }

    public Moto fromMotoDto(MotoDto motoDto) {
        Moto moto = new Moto();
        BeanUtils.copyProperties(motoDto, moto);
        return moto;
    }

    public LocationDto fromLocation(Location location) {
        LocationDto locationDto = new LocationDto();
        BeanUtils.copyProperties(location, locationDto); //
        return locationDto;
    }

    public Location fromLocationDto(LocationDto locationDto) {
        Location location = new Location();
        BeanUtils.copyProperties(locationDto, location);
        return location;
    }

}
