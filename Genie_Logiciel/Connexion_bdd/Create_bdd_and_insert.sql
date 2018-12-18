/*
database : javadb
user : username
pass : password
si javadb déjà existant, supprimer cette base de donnée.
Il faut surment importer deux fois ce fichier (1 pour créer la base , 2 pour ajouter la table)
*/


CREATE DATABASE javadb DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci;

CREATE USER 'username'@'localhost' IDENTIFIED BY 'password';
GRANT ALL ON javadb.* TO 'user'@'localhost' IDENTIFIED BY 'password';

CREATE TABLE  users (
    id INT AUTO_INCREMENT,
    prenom VARCHAR(50) NOT NULL,
    nom VARCHAR(50) NOT NULL,
    date_de_naissance VARCHAR(10) NOT NULL,

    PRIMARY KEY (id));
INSERT INTO users (prenom, nom, date_de_naissance) VALUES ("Ludovico" ,"Einaudi" ,"23/11/1955"); INSERT INTO users (prenom, nom, date_de_naissance) VALUES ("Frédéric" ,"Chopin" ,"01/03/1810"); INSERT INTO users (prenom, nom, date_de_naissance) VALUES ("Claude" ,"Debussy" ,"22/08/1862");