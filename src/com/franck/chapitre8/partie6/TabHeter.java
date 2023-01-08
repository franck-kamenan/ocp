package com.franck.chapitre8.partie6;

// classe de base
class Point2 {

    private int x, y;

    public Point2(int x, int y) {

        this.x = x;
        this.y = y;
    }

    public void affiche() {

        System.out.println("Je suis en " + x + " " +y);
    }
}

// classe derivee de point
class Pointcol2 extends Point2 {      // Pointcol dérive de Point

    private byte couleur;

    public Pointcol2(int x, int y, byte couleur) {

        super(x, y);        // obligatoirement comme première instruction
        this.couleur = couleur;
    }

    public void affiche() {

        super.affiche();
        System.out.println(" et ma couleur est: " + couleur);
    }
}

// classe utilisant Pointcol
public class TabHeter {

    public static void main(String[] args) {

        Point2 [] tabPts = new Point2[4];
        tabPts[0] = new Point2(0, 2);
        tabPts[1] = new Pointcol2(1, 5, (byte) 3);
        tabPts[2] = new Pointcol2(2, 0, (byte) 9);
        tabPts[3] = new Point2(1, 2);

        for (int i = 0; i < tabPts.length; i++) {

            tabPts[i].affiche();
        }
    }
}
