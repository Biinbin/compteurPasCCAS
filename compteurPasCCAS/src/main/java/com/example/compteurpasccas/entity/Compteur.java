package com.example.compteurpasccas.entity;

public class Compteur {
    // Paramètres:
    public int pas;

    // Constructeurs:
    public Compteur() {
    }

    // Getters / Setters:
    public int getPas() {
        return pas;
    }

    public void setPas(int pas) {
        this.pas = pas;
    }

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
