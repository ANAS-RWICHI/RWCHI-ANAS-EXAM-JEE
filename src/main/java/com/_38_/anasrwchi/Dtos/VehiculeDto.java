package com._38_.anasrwchi.Dtos;

import com._38_.anasrwchi.entities.Agence;
import com._38_.anasrwchi.entities.Location;
import com._38_.anasrwchi.entities.enums.StatutVehicule;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VehiculeDto {
    private Long id;
    private String marque;
    private String modele;
    private String matricule;
    private Double prixParJour;
    private Date dateMiseEnService;
    private String statut;
}
