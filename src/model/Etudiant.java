/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Scanner;

/**
 *
 * @author Boris
 */
public class Etudiant {
    private String noms;
    private String prenoms;
    private double note1;
    private double note2;

    public Etudiant() {
    }

    public Etudiant(String noms, String prenoms, double note1, double note2) {
        this.noms = noms;
        this.prenoms = prenoms;
        this.note1 = note1;
        this.note2 = note2;
    }

    public String getNoms() {
        return noms;
    }

    public void setNoms(String noms) {
        this.noms = noms;
    }

    public String getPrenoms() {
        return prenoms;
    }

    public void setPrenoms(String prenoms) {
        this.prenoms = prenoms;
    }

    public double getNote1() {
        return note1;
    }

    public void setNote1(double note1) {
        this.note1 = note1;
    }

    public double getNote2() {
        return note2;
    }

    public void setNote2(double note2) {
        this.note2 = note2;
    }
    
}
