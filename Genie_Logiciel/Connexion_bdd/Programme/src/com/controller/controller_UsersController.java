package com.controller;

import com.jdbc.UsersMapper;
import com.model.Users;
import com.jdbc.ConnectDatabase;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;

public class UsersController {
    private UsersController() {
    }

    /** L'instance statique */
    private static UsersController instance;

    /**
     * Récupère l'instance unique de la class Singleton.
     * @return
     */
    public static UsersController getInstance() {
        if (null == instance) { // Premier appel
            instance = new UsersController();
        }
        return instance;
    }


    public static List<Users> Lister_les_proprietaires() {
        List<Users> liste_des_proprietaires = new ArrayList<>();
        String selectAll;
        selectAll = "SELECT prenom, nom, date_de_naissance FROM javadb.users";
        UsersMapper um = new UsersMapper();
        try {
            liste_des_proprietaires = um.transformObject(ConnectDatabase.getInstance().query(selectAll));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return liste_des_proprietaires;
    }


}
