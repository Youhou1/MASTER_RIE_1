
package com.view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class UserView extends JFrame implements ActionListener {
    //Déclaration des boutons de navigation
    private JButton list_users;


    public UserView() {
        build();
    }

    //Parametres Fenetre Menu principal
    private void build() {
        setTitle("Liste des utilisateurs");
        setSize(250, 80);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(buildContentPane());
    }

    //Parametres du Panel
    private JPanel buildContentPane() {
        JPanel panel_user = new JPanel();
        panel_user.setLayout(new FlowLayout());
        panel_user.setBackground(Color.LIGHT_GRAY);

        //Boutons Menu
        list_users = new JButton("Lister les utilisateurs");
        list_users.addActionListener(this);
        panel_user.add(list_users);


        return panel_user;
    }


    //Actions des boutons de navigation
    @Override
    @SuppressWarnings("ResultOfObjectAllocationIgnored")
    public void actionPerformed(ActionEvent e) {

        Object source = e.getSource();

        if (source == list_users) {
            System.out.println("list_users button pressed");

            UserView ecran_users = new UserView();
            ecran_users.setVisible(true);

        }

    }
}