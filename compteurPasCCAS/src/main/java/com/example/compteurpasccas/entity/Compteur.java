package com.example.compteurpasccas.entity;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Compteur {
    // Paramètres:
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    public int pas;

    // Pour ajouter une distance au compteur:
    public void ajouteDistanceKm(int nombreKm){
        pas += nombreKm * 1667;
    }

    public void ajouteDistancePas(int nombrePas) {
        pas += nombrePas;
    }

    // Pour obtenir la distance du compteur:
    public double getDistanceKm(){
        // Distance d'un pas en kilomètres (pour affichage)
        return pas * 0.00059999;
    }
}
