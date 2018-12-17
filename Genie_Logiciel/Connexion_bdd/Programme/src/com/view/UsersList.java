/*
package com.view;

import com.jdbc.MySQLAccess;
import com.model.Users;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;



public class UsersList extends JFrame {

    public UsersList() {
        build();
    }


    private void build() {
        setTitle("Liste des utilisateurs");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(buildContentPane());
    }

    //Parametres du Panel
    private JPanel buildContentPane() {
        JPanel user_panel = new JPanel();
        user_panel.setLayout(new FlowLayout());
        user_panel.setBackground(Color.LIGHT_GRAY);


        JTable usersTable = new JTable();

        usersTable.setAutoCreateColumnsFromModel(false);

        usersTable.setModel(new DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "Prénom", "Nom", "Date de naissance"
                }
        ));

        user_panel.add(usersTable);
        userListAll();


        return user_panel;
    }

    public void userListAll() {
        ArrayList<Users> list = userList();
        DefaultTableModel model = (DefaultTableModel) usersTable.getModel();
        Object[] row = new Object[2];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getPrenom();
            row[1] = list.get(i).getNom();
            row[2] = list.get(i).getDate_de_naissance();
            model.addRow(row);
        }
    }
}*/
