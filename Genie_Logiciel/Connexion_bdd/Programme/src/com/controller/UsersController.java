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


    public static List<Users> Lister_les_users() {
        List<Users> Lister_les_users = new ArrayList<>();
        String selectAll;
        selectAll = "SELECT prenom, nom, date_de_naissance FROM javadb.users ORDER BY nom";
        UsersMapper um = new UsersMapper();
        try {
            Lister_les_users = um.transformObject(ConnectDatabase.getInstance().query(selectAll));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return Lister_les_users;
    }


}
