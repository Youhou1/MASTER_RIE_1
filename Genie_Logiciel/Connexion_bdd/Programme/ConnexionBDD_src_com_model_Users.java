package com.model;


public class Users {

    private String prenom;
    private String nom;
    private String date_de_naissance;


    public Users(String prenom, String nom, String date_de_naissance){
        this.prenom = prenom;
        this.nom = nom;
        this.date_de_naissance = date_de_naissance;
    }

    public Users(){
        //Contructeur par défaut
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the date_de_naissance
     */
    public String getDate_de_naissance() {
        return date_de_naissance;
    }

    /**
     * @param date_de_naissance the date_de_naissance to set
     */
    public void setDate_de_naissance(String date_de_naissance) {
        this.date_de_naissance = date_de_naissance;
    }


}

