package com.franck.chapitre12.partie2;

import javax.swing.*;
import java.awt.event.*;

class MaFenetre3 extends JFrame {

    public MaFenetre3() {       // constructeur

        setTitle("Gestion de clics");
        setBounds(10, 20, 300, 200);
        addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent ev) {

                int x = ev.getX();
                int y = ev.getY();
                System.out.println("clic au point de coordonnees " + x + ", " + y);
            }
        });
    }
}

public class Clic3 {

    public static void main(String[] args) {

        MaFenetre2 fen = new MaFenetre2();
        fen.setVisible(true);
    }
}
