package com.franck.chapitre12.partie4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Fen2Boutons3 extends JFrame implements ActionListener {

    private JButton monBouton1, monBouton2;

    public Fen2Boutons3() {

        setTitle("Avec deux boutons");
        setSize( 300, 200);
        monBouton1 = new JButton("Bouton A");
        monBouton2 = new JButton("Bouton B");
        Container contenu =getContentPane();
        contenu.setLayout(new FlowLayout());
        contenu.add(monBouton1);
        contenu.add(monBouton2);
        monBouton1.addActionListener(this);
        monBouton2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ev) {

        String nom = ev.getActionCommand();
        System.out.println("action sur bouton " + nom);
    }
}

public class Boutons3 {

    public static void main(String[] args) {

        Fen2Boutons3 fen = new Fen2Boutons3();
        fen.setVisible(true);
    }
}
