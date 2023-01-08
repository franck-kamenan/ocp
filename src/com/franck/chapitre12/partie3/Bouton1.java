package com.franck.chapitre12.partie3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Fen1Bouton extends JFrame {

    private JButton monBouton;

    public Fen1Bouton() {

        setTitle("Premier bouton");
        setSize( 300, 200);
        monBouton = new JButton("ESSAI");
        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(monBouton);
    }
}

public class Bouton1 {

    public static void main(String[] args) {

        Fen1Bouton fen = new Fen1Bouton();
        fen.setVisible(true);
    }
}
