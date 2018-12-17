package com.jdbc;


import com.model.Users;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Map les results set en entité Proprietaire
 * @author Jocelyn
 */
public class UsersMapper extends Mapper<Users> {

    /**
     * Transforme un ResultSet en liste d'objet Proprietaire
     * @param res
     * @return
     */
    @Override
    public List<Users> transformObject(ResultSet res) {
        List<Users> liste_des_users = new ArrayList<>();
        try {
            // parcours des résultats envoyés
            while(res.next()) {
                Users user = new Users();
                user.setPrenom(res.getString("prenom"));
                user.setNom(res.getString("nom"));
                user.setDate_de_naissance(res.getString("date_de_naissance"));
                liste_des_users.add(user);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsersMapper.class.getName()).log(Level.SEVERE, null, ex);
        }

        return liste_des_users;
    }

}
