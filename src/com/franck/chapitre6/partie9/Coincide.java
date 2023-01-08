package com.franck.chapitre6.partie9;

class Point6 {

    public Point6(int abs, int ord) {

        x = abs;
        y = ord;
    }

    public boolean coincide(Point6 pt) {

        return ((pt.x == x) && (pt.y == y));
    }

    private int x, y;
}

public class Coincide {

    public static void main(String[] args) {

        Point6 a = new Point6(1, 3);
        Point6 b = new Point6(2, 5);
        Point6 c = new Point6(1, 3);
        System.out.println("a et b: " + a.coincide(b) + " " + b.coincide(a));
        System.out.println("a et c: " + a.coincide(c) + " " + c.coincide(a));
    }
}
