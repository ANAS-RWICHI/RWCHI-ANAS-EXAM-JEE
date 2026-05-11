package com._38_.anasrwchi;

import com._38_.anasrwchi.entities.Agence;
import com._38_.anasrwchi.entities.Location;
import com._38_.anasrwchi.entities.Moto;
import com._38_.anasrwchi.entities.Voiture;
import com._38_.anasrwchi.entities.enums.BoiteVitesse;
import com._38_.anasrwchi.entities.enums.StatutVehicule;
import com._38_.anasrwchi.entities.enums.TypeCarburant;
import com._38_.anasrwchi.entities.enums.TypeMoto;
import com._38_.anasrwchi.repositories.AgenceRepository;
import com._38_.anasrwchi.repositories.LocationRepository;
import com._38_.anasrwchi.repositories.VehiculeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class ExamJeeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamJeeApplication.class, args);
    }
    @Bean
    CommandLineRunner start(AgenceRepository agenceRepo,
                            VehiculeRepository vehiculeRepo,
                            LocationRepository locationRepo) {
        return args -> {
            // 1. Create an Agence
            Agence agence = new Agence(null, "Elite Car", "123 Rue de Paris", "Paris", "0123456789", null);
            agenceRepo.save(agence);

            // 2. Create a Voiture (Car)
            Voiture voiture = new Voiture();
            voiture.setMarque("Toyota");
            voiture.setModele("Yaris");
            voiture.setMatricule("ABC-123");
            voiture.setPrixParJour(50.0);
            voiture.setStatut(StatutVehicule.DISPONIBLE);
            voiture.setAgence(agence);
            voiture.setNombrePortes(5);
            voiture.setTypeCarburant(TypeCarburant.HYBRIDE);
            voiture.setBoiteVitesse(BoiteVitesse.AUTOMATIQUE);
            vehiculeRepo.save(voiture);

            // 3. Create a Moto (Motorcycle)
            Moto moto = new Moto();
            moto.setMarque("Honda");
            moto.setModele("CB500");
            moto.setMatricule("XYZ-789");
            moto.setPrixParJour(30.0);
            moto.setStatut(StatutVehicule.DISPONIBLE);
            moto.setAgence(agence);
            moto.setCylindree(500);
            moto.setTypeMoto(TypeMoto.ROADSTER);
            moto.setCasqueInclus(true);
            vehiculeRepo.save(moto);

            // 4. Create a Location
            Location location = new Location(null, new Date(), new Date(), 150.0, voiture);
            locationRepo.save(location);

            System.out.println("Data initialized successfully!");
        };
    }
}
