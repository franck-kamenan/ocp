package com.franck.chapitre8.partie1;

// classe de base
class Point {

    private int x, y;

    public void initialise(int abs, int ord) {

        x = abs;
        y = ord;
    }

    public void deplace(int dx, int dy) {

        x += dx;
        y += dy;
    }

    public void affiche() {

        System.out.println("Je suis en " + x + " " +y);
    }
}

// classe derivee de point
class Pointcol extends Point {      // Pointcol dérive de Point

    private byte couleur;

    public void colore(byte couleur) {

        this.couleur = couleur;
    }
}

// classe utilisant Pointcol
public class TstPcol1 {

    public static void main(String[] args) {

        Pointcol pc = new Pointcol();
        pc.affiche();
        pc.initialise(3, 5);
        pc.colore((byte) 3);
        pc.affiche();
        pc.deplace(2, -1);
        pc.affiche();
        Point p = new Point();
        p.initialise(6, 9);
        p.affiche();
    }
}
