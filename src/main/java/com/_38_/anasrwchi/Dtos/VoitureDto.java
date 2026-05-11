package com._38_.anasrwchi.Dtos;

import com._38_.anasrwchi.entities.Vehicule;
import com._38_.anasrwchi.entities.enums.BoiteVitesse;
import com._38_.anasrwchi.entities.enums.TypeCarburant;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
public class VoitureDto extends Vehicule {

    private Integer nombrePortes;
    private TypeCarburant typeCarburant;
    private BoiteVitesse boiteVitesse;
}