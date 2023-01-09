package com.example.compteurpasccas.entity;

public class City {

    // Paramètres:
    public Integer id;
    public String nom;
    public String informations;
    public Boolean estDebloquee;

    // Constructeurs:
    public City() {
    }

    // Getters / Setters:
    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getInformations() {
        return informations;
    }

    public void setInformations(String informations) {
        this.informations = informations;
    }

    public Boolean getEstDebloquee() {
        return estDebloquee;
    }

    public void setEstDebloquee(Boolean estDebloquee) {
        this.estDebloquee = estDebloquee;
    }
}
