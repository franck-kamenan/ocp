package com.franck.chapitre6.partie9;

class Point8 {

    public Point8(int abs, int ord) {

        x =abs;
        y = ord;
    }

    public void permute(Point8 a) {     // methode d'échange des coordonnees du point courant avec celles de a

        Point8 c = new Point8(0, 0);
        c.x = a.x;                      // copie de a dans c
        c.y = a.y;                      // copie de a dans c
        a.x = x;                        // copie du point courant dans a
        a.y = y;                        // copie du point courant dans a
        x = c.x;                        // copie de c dans le point courant
        y = c.y;                        // copie de c dans le point courant
    }

    public void affiche() {

        System.out.println("Coordonnees: " + x + " " + y);
    }

    private int x, y;
}

public class Permute {

    public static void main(String[] args) {

        Point8 a = new Point8(1, 2);
        Point8 b = new Point8(5, 6);
        a.affiche();
        b.affiche();
        a.permute(b);
        a.affiche();
        b.affiche();
    }
}
