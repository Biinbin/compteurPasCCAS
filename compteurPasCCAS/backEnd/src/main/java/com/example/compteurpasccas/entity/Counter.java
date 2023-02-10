package com.example.compteurpasccas.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Counter {
    // Paramètres:
    public Double value;

    public Counter(Double value) {
        this.value = value;
    }

    // Pour ajouter une distance au compteur:
    public Double ajouteDistanceKm(Double nombreKm){
        return value += nombreKm * 1666.7;
    }

    public Double ajouteDistancePas(Double nombrePas) {
        return value += nombrePas;
    }

    // Pour obtenir la distance du compteur:
    public Double getDistanceKm(){
        // Distance d'un pas en kilomètres (pour affichage)
        return (Double) (value * 0.00059999);
    }
}
