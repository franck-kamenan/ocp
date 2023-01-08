package com.franck.chapitre8.partie3;

// classe de base
class Point {

    private int x, y;

    public Point(int x, int y) {

        this.x = x;
        this.y = y;
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

    public Pointcol(int x, int y, byte couleur) {

        super(x, y);
        this.couleur = couleur;
    }

    public void affichec() {

        affiche();
        System.out.println(" et ma couleur est: " + couleur);
    }
}

// classe utilisant Pointcol
public class TstPcol3 {

    public static void main(String[] args) {

        Pointcol pc1 = new Pointcol(3, 5, (byte) 3);
        pc1.affiche();                                      // attention, ici affiche
        pc1.affichec();                                     // et ici affichec
        Pointcol pc2 = new Pointcol(5, 8, (byte) 2);
        pc2.affichec();                                     // et ici affichec
        pc2.deplace(1, -3);
        pc2.affichec();                                     // et ici affichec
    }
}
