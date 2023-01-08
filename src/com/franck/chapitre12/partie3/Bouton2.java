package com.franck.chapitre12.partie3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Fen2Bouton extends JFrame implements ActionListener {     // Attention: ne pas oublier implements

    private JButton monBouton;

    public Fen2Bouton() {

        setTitle("Premier bouton");
        setSize( 300, 200);
        monBouton = new JButton("ESSAI");
        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(monBouton);
        monBouton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ev) {

        System.out.println("action sur bouton ESSAI");
    }
}

public class Bouton2 {

    public static void main(String[] args) {

        Fen2Bouton fen = new Fen2Bouton();
        fen.setVisible(true);
    }
}
