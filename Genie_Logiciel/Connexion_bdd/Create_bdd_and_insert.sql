/*
database : javabase
user : java
pass : password
*/


CREATE DATABASE javadb DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci;

CREATE USER 'user'@'localhost' IDENTIFIED BY 'password';
GRANT ALL ON javadb.* TO 'user'@'localhost' IDENTIFIED BY 'password';

CREATE TABLE `javabase`.`tableau_ninja` ( `id` INT NOT NULL AUTO_INCREMENT , `nom` TEXT NOT NULL , `arme` TEXT NOT NULL , `kill` INT NOT NULL , PRIMARY KEY (`id`)) ENGINE = InnoDB;
INSERT INTO `tableau_ninja` (`id`, `nom`, `arme`, `kill`) VALUES ('', 'naruto', 'shuriken', '0'), ('', 'sasuke', 'sabre', '8');
