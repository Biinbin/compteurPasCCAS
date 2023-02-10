package com.example.compteurpasccas.entity;


import jakarta.persistence.*;
import lombok.*;
import java.awt.Image;

import java.awt.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class City {

    // Paramètres:
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;
    public String nom;
    public String informations;
    //private Image image;
    boolean estDebloquee;

    public City(String nom, String informations, boolean estDebloquee) {
        this.nom = nom;
        this.informations = informations;
        this.estDebloquee = estDebloquee;
    }
}
