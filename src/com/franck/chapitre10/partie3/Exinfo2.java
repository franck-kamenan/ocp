package com.franck.chapitre10.partie3;

class ErrConst2 extends Exception {

    public ErrConst2(String mes) {

        super(mes);
    }
}

class Point2 {

    private int x, y;

    public Point2(int x, int y) throws ErrConst2 {

        if ((x < 0) || (y < 0)) throw new ErrConst2("Erreur construction avec coordonnees: " + x + ", " + y);
        this.x = x;
        this.y = y;
    }

    public void affiche() {

        System.out.println("coordonnees: " + x + ", " + y);
    }
}

public class Exinfo2 {

    public static void main(String[] args) {

        try {

            Point2 a = new Point2(1, 4);
            a.affiche();
            a = new Point2(-3, 5);
            a.affiche();
        } catch (ErrConst2 e) {

            System.out.println(e.getMessage());
            System.exit(-1);
        }
    }
}
