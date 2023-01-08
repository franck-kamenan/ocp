package com.franck.chapitre7.partie2;

class Point {

    private int x, y;

    public Point(int x, int y) {

        this.x = x;
        this.y = y;
    }

    public void affiche() {

        System.out.println("Point: " + x + ", " + y);
    }
}

public class TabPoint {

    public static void main(String[] args) {

        Point[] tp;
        tp = new Point[3];
        tp[0] = new Point(1, 2);
        tp[1] = new Point(4, 5);
        tp[2] = new Point(8, 9);

        for (int i = 0; i < tp.length; i++) tp[i].affiche();
    }
}
