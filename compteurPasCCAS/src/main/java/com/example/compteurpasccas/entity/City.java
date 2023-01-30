package com.example.compteurpasccas.entity;


import jakarta.persistence.*;
import lombok.*;

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
    // public Image miniature;
    public boolean estDebloquee;
}
