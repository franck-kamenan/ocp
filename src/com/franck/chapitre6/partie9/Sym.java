package com.franck.chapitre6.partie9;

class Point9 {

    public Point9(int abs, int ord) {

        x = abs;
        y = ord;
    }

    public Point9 symetrique() {

        Point9 res;
        res = new Point9(y, x);
        return res;
    }

    public void affiche() {

        System.out.println("Coordonnees: " + x + " " + y);
    }

    private int x, y;
}

public class Sym {

    public static void main(String[] args) {


        Point9 a = new Point9(1, 2);
        a.affiche();
        Point9 b = a.symetrique();
        b.affiche();
    }
}
