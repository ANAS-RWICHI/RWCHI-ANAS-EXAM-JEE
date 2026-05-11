package com._38_.anasrwchi.entities;

import com._38_.anasrwchi.entities.enums.StatutVehicule;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_VEHICULE", length = 10)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marque;
    private String modele;

    @Column(unique = true)
    private String matricule;

    private Double prixParJour;

    @Temporal(TemporalType.DATE)
    private Date dateMiseEnService;

    @Enumerated(EnumType.STRING)
    private StatutVehicule statut;

    @ManyToOne
    @JoinColumn(name = "agence_id")
    private Agence agence;

    @OneToMany(mappedBy = "vehicule", fetch = FetchType.LAZY)
    private List<Location> locations;

}
