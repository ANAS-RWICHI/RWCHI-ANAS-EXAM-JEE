package com._38_.anasrwchi.Dtos;

import com._38_.anasrwchi.entities.Vehicule;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
public class AgenceDto {
    private Long id;
    private String nom;
    private String adresse;
    private String ville;private String telephone;
    private List<Vehicule> vehicules;
}
