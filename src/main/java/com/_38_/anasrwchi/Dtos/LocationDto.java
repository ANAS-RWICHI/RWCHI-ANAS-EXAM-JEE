package com._38_.anasrwchi.Dtos;

import com._38_.anasrwchi.entities.Vehicule;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LocationDto {
    private Long id;
    private Date dateDebut;
    private Date dateFin;
    private Double montantTotal;
}
