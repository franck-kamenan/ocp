package com.franck.chapitre12.partie1;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

class MaFenetre2 extends JFrame{

    public MaFenetre2() {       // constructeur

        setTitle("Ma première fenetre");
        setBounds(50, 100, 300, 150);
    }
}

public class Premfen2 {

    public static void main(String[] args) {

        Scanner z = new Scanner(System.in);
        JFrame fen = new MaFenetre2();
        fen.setVisible(true);

        while (true) {      // fin sur longueur titre nulle

            System.out.print("nouvelle largeur: ");
            int larg = z.nextInt();
            System.out.print("nouvelle hauteur: ");
            int haut = z.nextInt();
            // System.out.print("nouveau titre: (vide pour finir) ");
            // String tit = z.nextLine();

            // if (tit.length() == 0) break;
            fen.setSize(larg, haut);
            // fen.setTitle(tit);
        }
    }
}
