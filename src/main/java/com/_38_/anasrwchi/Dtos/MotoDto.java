package com._38_.anasrwchi.Dtos;

import com._38_.anasrwchi.entities.Vehicule;
import com._38_.anasrwchi.entities.enums.TypeMoto;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class MotoDto extends Vehicule {
    private Integer cylindree;
    private String typeMoto;
    private Boolean casqueInclus;
}
