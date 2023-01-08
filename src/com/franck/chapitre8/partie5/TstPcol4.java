package com.franck.chapitre8.partie5;

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

        super(x, y);        // obligatoirement comme première instruction
        this.couleur = couleur;
    }

    public void affiche() {

        super.affiche();
        System.out.println(" et ma couleur est: " + couleur);
    }
}

// classe utilisant Pointcol
public class TstPcol4 {

    public static void main(String[] args) {

        Pointcol pc = new Pointcol(3, 5, (byte) 3);
        pc.affiche();       // ici, il s'agit de affiche de Pointcol
        pc.deplace(1, -3);
        pc.affiche();
    }
}
