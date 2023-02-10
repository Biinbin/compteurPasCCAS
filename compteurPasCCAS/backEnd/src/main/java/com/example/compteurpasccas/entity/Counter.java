package com.example.compteurpasccas.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Counter {
    // Paramètres:
    public float value;

    public Counter(float value) {
        this.value = value;
    }

    // Pour ajouter une distance au compteur:
    public float ajouteDistanceKm(float nombreKm){
        return value += nombreKm;
    }

    public float ajouteDistancePas(float nombrePas) {
        return (float) (value += nombrePas * (10.0/16667.0));
    }

    // Pour obtenir la distance du compteur:
    public float getDistanceKm(){
        // Distance d'un pas en kilomètres (pour affichage)
        return value;
    }
}
