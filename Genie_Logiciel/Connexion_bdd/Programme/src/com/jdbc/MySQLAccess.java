package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import com.model.Users;

public class MySQLAccess {
    private Connection connect = null;
    //private Statement statement = null;
    //private PreparedStatement preparedStatement = null;
    //private ResultSet resultSet = null;


    public ArrayList<Users> usersList() throws SQLException, ClassNotFoundException {
        ArrayList<Users> usersList = new ArrayList<>();

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            connect = DriverManager
                .getConnection("jdbc:mysql://192.168.122.180:3306/javadb?"
                        + "user=username&password=password");
             String select_query = "SELECT prenom, nom, date_de_naissance FROM javadb.users";
             Statement st = connect.createStatement();
             ResultSet rs = st.executeQuery(select_query);
             Users users;


             while(rs.next()) {
                 users = new Users(rs.getString("prenom"), rs.getString("nom"), rs.getString("date_de_naissance"));
                 usersList.add(users);
             }
        } catch (Exception e) {
            throw e;
        }
        return usersList;
    }
}
