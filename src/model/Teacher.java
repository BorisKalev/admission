/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Boris
 */
public class Teacher {
    private String nom;
    private String prenom;
    private int ancienneter;

    public Teacher(String nom, String prenom, int ancienneter) {
        this.nom = nom;
        this.prenom = prenom;
        this.ancienneter = ancienneter;
    }

    public Teacher() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAncienneter() {
        return ancienneter;
    }

    public void setAncienneter(int ancienneter) {
        this.ancienneter = ancienneter;
    }
    
}
