package com.franck.chapitre12.partie4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class EcouteBouton implements ActionListener {

    private int n;

    public EcouteBouton(int n) {

        this.n = n;
    }

    public void actionPerformed(ActionEvent ev) {

        System.out.println("action sur bouton " + n);
    }
}

class Fen2Boutons5 extends JFrame {

    private JButton monBouton1, monBouton2;

    public Fen2Boutons5() {

        setTitle("Avec deux boutons");
        setSize( 300, 200);
        monBouton1 = new JButton("Bouton A");
        monBouton2 = new JButton("Bouton B");
        Container contenu = getContentPane();
        contenu.setLayout(new FlowLayout());
        contenu.add(monBouton1);
        contenu.add(monBouton2);
        EcouteBouton ecout1 = new EcouteBouton(10);
        EcouteBouton ecout2 = new EcouteBouton(20);
        monBouton1.addActionListener(ecout1);
        monBouton2.addActionListener(ecout2);
    }

    public void actionPerformed(ActionEvent ev) {

        String nom = ev.getActionCommand();
        System.out.println("action sur bouton " + nom);
    }
}

public class Boutons5 {

    public static void main(String[] args) {

        Fen2Boutons5 fen = new Fen2Boutons5();
        fen.setVisible(true);
    }
}
