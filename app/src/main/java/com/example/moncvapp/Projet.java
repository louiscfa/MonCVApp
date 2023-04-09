package com.example.moncvapp;

public class Projet {
    private String nomProjet;
    private String descriptionProjet;
    private String lien;


    public Projet(String nomProjet, String descriptionProjet, String lien) {
        this.nomProjet = nomProjet;
        this.descriptionProjet = descriptionProjet;
        this.lien = lien;
    }

    public String getNomProjet() {
        return nomProjet;
    }

    public void setNomProjet(String nomProjet) {
        this.nomProjet = nomProjet;
    }

    public String getDescriptionProjet() {
        return descriptionProjet;
    }

    public void setDescriptionProjet(String descriptionProjet) {
        this.descriptionProjet = descriptionProjet;
    }

    public String getLien() {
        return lien;
    }

    public void setLien(String lien) {
        this.lien = lien;
    }
}
