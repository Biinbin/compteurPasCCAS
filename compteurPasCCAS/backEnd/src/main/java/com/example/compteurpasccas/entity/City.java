package com.example.compteurpasccas.entity;


import jakarta.persistence.*;
import lombok.*;

import javax.swing.*;

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
    public String urlImg;
    public float distanceFrom0;

    public City(String nom, String informations, String urlImg, float distanceFrom0) {
        this.nom = nom;
        this.informations = informations;
        this.urlImg = urlImg;
        this.distanceFrom0 = distanceFrom0;
    }
}
