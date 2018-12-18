package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


public class ConnectDatabase {
        // init database constants
        private static final String DATABASE_DRIVER = "com.mysql.cj.jdbc.Driver";
        private static final String DATABASE_URL = "jdbc:mysql://192.168.122.180:3306/javadb?";
        private static final String USERNAME = "username";
        private static final String PASSWORD = "password";

        // init connection object
        private Connection connection;
        // init properties object
        private Properties properties;
        // init transaction
        private Statement statement;
        /**
         * L'instance statique
         */
        private static ConnectDatabase instance;

    /**
     * Constructeur redéfini comme étant privé pour interdire
     * son appel et forcer à passer par la méthode getInstance()
     */
    private ConnectDatabase() {
    }


    /**
     * Récupère l'instance unique de la class Singleton.
     * @return
     */
    public static ConnectDatabase getInstance() {
        if (null == instance) { // Premier appel
            instance = new ConnectDatabase();
        }
        return instance;
    }

    /**
     * Créations des propriétés relatives à la connexion
     * @return
     */
    private Properties getProperties() {
        if (properties == null) {
            properties = new Properties();
            properties.setProperty("user", USERNAME);
            properties.setProperty("password", PASSWORD);
        }
        return properties;
    }

    /**
     * Connexion à la base
     * @return l'objet de connexion
     */
    public Connection connect() {
        Properties properties = getProperties();
        if (connection == null) {
            try {
                Class.forName(DATABASE_DRIVER);
                connection = DriverManager.getConnection(DATABASE_URL, getProperties());
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

    /**
     * Déconnexion de la base
     */
    public void disconnect() {
        if (connection != null) {
            try {
                connection.close();
                connection = null;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Requêtage de la base
     * @param query String La requête à exécuter
     * @return a ResultSet object containing the results or null if not available
     * @throws SQLException
     */

    public ResultSet query(String query) throws SQLException{
        // Connexion à la base
        Connection connect = this.connect();
        statement = instance.connection.createStatement();
        ResultSet res = statement.executeQuery(query);

        return res;
    }

    /**
     * @desc Method to insert data to a table
     * @param insertQuery String The Insert query
     * @return boolean
     * @throws SQLException
     */
    public int insert(String insertQuery) throws SQLException {
        statement = instance.connection.createStatement();
        int result = statement.executeUpdate(insertQuery);
        return result;

    }

}

