package com.franck.chapitre12.partie4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class EcouteBouton1 implements ActionListener {

    public void actionPerformed(ActionEvent ev) {

        System.out.println("action sur bouton 1");
    }
}

class EcouteBouton2 implements ActionListener {

    public void actionPerformed(ActionEvent ev) {

        System.out.println("action sur bouton 2");
    }
}

class Fen2Boutons4 extends JFrame {

    private JButton monBouton1, monBouton2;

    public Fen2Boutons4() {

        setTitle("Avec deux boutons");
        setSize( 300, 200);
        monBouton1 = new JButton("Bouton A");
        monBouton2 = new JButton("Bouton B");
        Container contenu = getContentPane();
        contenu.setLayout(new FlowLayout());
        contenu.add(monBouton1);
        contenu.add(monBouton2);
        EcouteBouton1 ecout1 = new EcouteBouton1();
        EcouteBouton2 ecout2 = new EcouteBouton2();
        monBouton1.addActionListener(ecout1);
        monBouton2.addActionListener(ecout2);
    }

    public void actionPerformed(ActionEvent ev) {

        String nom = ev.getActionCommand();
        System.out.println("action sur bouton " + nom);
    }
}

public class Boutons4 {

    public static void main(String[] args) {

        Fen2Boutons4 fen = new Fen2Boutons4();
        fen.setVisible(true);
    }
}
