package com.franck.chapitre12.partie4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class EcoutCr implements ActionListener {

    private Container contenu;

    public EcoutCr(Container contenu) {

        this.contenu = contenu;
    }

    public void actionPerformed(ActionEvent ev) {

        JButton nouvBout = new JButton("BOUTON");
        contenu.add(nouvBout);
        contenu.validate();     // pour recalculer
    }
}

class FenBoutonsDyn extends JFrame {

    private JButton crBouton;

    public FenBoutonsDyn() {

        setTitle("Boutons dynamiques");
        setSize( 500, 150);
        Container contenu = getContentPane();
        contenu.setLayout(new FlowLayout());
        crBouton = new JButton("CREATION BOUTON");
        contenu.add(crBouton);
        EcoutCr ecoutCr = new EcoutCr(contenu);
        crBouton.addActionListener(ecoutCr);
    }
}

public class BoutDy0 {

    public static void main(String[] args) {

        FenBoutonsDyn fen = new FenBoutonsDyn();
        fen.setVisible(true);
    }
}
