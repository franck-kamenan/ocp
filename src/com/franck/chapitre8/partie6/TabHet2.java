package com.franck.chapitre8.partie6;

// classe de base
class Point3 {

    private int x, y;

    public Point3(int x, int y) {

        this.x = x;
        this.y = y;
    }

    public void affiche() {

        identifie();
        System.out.println("Mes coordonnees sont: " + x + " " +y);
    }

    public void identifie() {

        System.out.println("Je suis un point");
    }
}

// classe derivee de point
class Pointcol3 extends Point3 {      // Pointcol dérive de Point

    private byte couleur;

    public Pointcol3(int x, int y, byte couleur) {

        super(x, y);        // obligatoirement comme première instruction
        this.couleur = couleur;
    }

    public void identifie() {

        System.out.println("Je suis un point colore de couleur " + couleur);
    }
}

// classe utilisant Pointcol
public class TabHet2 {

    public static void main(String[] args) {

        Point3 [] tabPts = new Point3[4];
        tabPts[0] = new Point3(0, 2);
        tabPts[1] = new Pointcol3(1, 5, (byte) 3);
        tabPts[2] = new Pointcol3(2, 8, (byte) 9);
        tabPts[3] = new Point3(1, 2);

        for (int i = 0; i < tabPts.length; i++) {

            tabPts[i].affiche();
        }
    }
}
