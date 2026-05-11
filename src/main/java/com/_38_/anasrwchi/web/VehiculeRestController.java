package com._38_.anasrwchi.web;

import com._38_.anasrwchi.Dtos.MotoDto;
import com._38_.anasrwchi.Dtos.VehiculeDto;
import com._38_.anasrwchi.Dtos.VoitureDto;
import com._38_.anasrwchi.Dtos.*;
import com._38_.anasrwchi.services.VehiculeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class VehiculeRestController {

    private final VehiculeService vehiculeService;

    @GetMapping
    public List<VehiculeDto> listVehicules() {
        return vehiculeService.getAllVehicules();
    }

    @PostMapping("/voiture")
    public VoitureDto saveVoiture(@RequestBody VoitureDto voitureDto) {
        return vehiculeService.saveVoiture(voitureDto);
    }

    @PostMapping("/moto")
    public MotoDto saveMoto(@RequestBody MotoDto motoDto) {
        return vehiculeService.saveMoto(motoDto);
    }

}