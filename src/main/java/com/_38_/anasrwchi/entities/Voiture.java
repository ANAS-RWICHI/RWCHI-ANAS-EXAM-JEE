package com._38_.anasrwchi.entities;

import com._38_.anasrwchi.entities.enums.BoiteVitesse;
import com._38_.anasrwchi.entities.enums.StatutVehicule;
import com._38_.anasrwchi.entities.enums.TypeCarburant;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("VOITURE")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Voiture extends Vehicule {

    private Integer nombrePortes;

    @Enumerated(EnumType.STRING)
    private TypeCarburant typeCarburant;

    @Enumerated(EnumType.STRING)
    private BoiteVitesse boiteVitesse;
}