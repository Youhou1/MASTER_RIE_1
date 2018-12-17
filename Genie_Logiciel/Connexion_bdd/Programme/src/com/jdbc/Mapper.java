package com.jdbc;

import java.sql.ResultSet;
import java.util.List;

/**
 * Classe exposant les méthodes de transformation d'objets
 * @author Jocelyn
 * @param <T> l'objet à mapper
 */

public abstract class Mapper<T> {

    /***
     * Transforme un ResultSet en liste d'objet métier
     * @param res le resultset envoyé par la base
     * @return la liste d'objets métiers
     */
    public abstract List<T> transformObject(ResultSet res);
}