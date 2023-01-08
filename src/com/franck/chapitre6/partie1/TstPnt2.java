package com.franck.chapitre6.partie1;

public class TstPnt2 {

    public static void main(String[] args) {

        Pnt2 a;
        a = new Pnt2();
        a.initialise(3, 5);
        a.affiche();
        a.deplace(2, 0);
        a.affiche();
        Pnt2 b = new Pnt2();
        b.initialise(6, 8);
        b.affiche();
    }
}

class Pnt2 {

    public void initialise(int abs, int ord) {

        x = abs;
        y = ord;
    }

    public void deplace(int dx, int dy) {

        x += dx;
        y += dy;
    }

    public void affiche() {

        System.out.println("Je suis un point de coordonnees " + x + " " + y);
    }

    private int x;      // abscisse
    private int y;      // ordonnee
}
