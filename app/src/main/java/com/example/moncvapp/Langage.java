package com.example.moncvapp;

public class Langage {
    private String nom;
    private int star;

    public Langage(String nom, int star) {
        this.nom = nom;
        this.star = star;
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getStar() {
        return (int) star;
    }

    public void setStar(int star) {
        this.star = star;
    }
}
