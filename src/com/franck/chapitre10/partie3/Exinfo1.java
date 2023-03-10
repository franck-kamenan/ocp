package com.franck.chapitre10.partie3;

class ErrConst extends Exception {

    public int abs, ord;

    public ErrConst(int abs, int ord) {

        this.abs = abs;
        this.ord = ord;
    }
}

class Point {

    private int x, y;

    public Point(int x, int y) throws ErrConst {

        if ((x < 0) || (y < 0)) throw new ErrConst(x, y);
        this.x = x;
        this.y = y;
    }

    public void affiche() {

        System.out.println("coordonnees: " + x + ", " + y);
    }
}

public class Exinfo1 {

    public static void main(String[] args) {

        try {

            Point a = new Point(1, 4);
            a.affiche();
            a = new Point(-3, 5);
            a.affiche();
        } catch (ErrConst e) {

            System.out.println("Erreur construction Point");
            System.out.println("    coordonnees souhaitees: " + e.abs + ", " + e.ord);
            System.exit(-1);
        }
    }
}
