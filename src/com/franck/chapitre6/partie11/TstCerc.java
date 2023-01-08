package com.franck.chapitre6.partie11;

class Point11 {

    public Point11(int x, int y) {

        this.x = x;
        this.y = y;
    }

    public void affiche() {

        System.out.println("Je suis un point de coordonnees " + x + " " + y);
    }

    public int getX() { return x;}
    public int getY() { return y;}

    public void setX(int x) {

        this.x = x;
    }

    public void setY(int y) {

        this.y = y;
    }

    private int x, y;
}

class Cercle {

    private Point11 c;      // centre du cercle
    private float r;      // rayon du cercle

    public Cercle(int x, int y, float r) {

        c = new Point11(x, y);
        this.r = r;
    }

    public void affiche() {

        System.out.println("Je suis un cercle de rayon " + r);
        System.out.println("et de centre de coordonnees " + c.getX() + " " + c.getY());
    }

    public void deplace(int dx, int dy) {

        c.setX(c.getX() + dx);
        c.setY(c.getY() + dy);
    }
}

public class TstCerc {

    public static void main(String[] args) {

        Point11 p = new Point11(3, 5);
        p.affiche();
        Cercle c = new Cercle(1, 2, 5.5f);
        c.affiche();
    }
}
