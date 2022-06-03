package com.example.contrle_continu2;

import java.io.Serializable;

public class Societe implements Serializable {



    public  int id ;
    public String nom;
    public  String Sec_Activité;
    public int nb_emp;
    public Societe() {

    }
    public Societe(int id, String nom, String sec_Activité, int nb_emp) {
        this.id = id;
        this.nom = nom;
        Sec_Activité = sec_Activité;
        this.nb_emp = nb_emp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSec_Activité() {
        return Sec_Activité;
    }

    public void setSec_Activité(String sec_Activité) {
        Sec_Activité = sec_Activité;
    }

    public int getNb_emp() {
        return nb_emp;
    }

    public void setNb_emp(int nb_emp) {
        this.nb_emp = nb_emp;
    }
}
