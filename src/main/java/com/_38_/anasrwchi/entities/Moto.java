package com._38_.anasrwchi.entities;

import com._38_.anasrwchi.entities.enums.TypeMoto;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("MOTO")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Moto extends Vehicule {

    private Integer cylindree;

    @Enumerated(EnumType.STRING)
    private TypeMoto typeMoto;

    private Boolean casqueInclus;
}
