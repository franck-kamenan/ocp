package com.franck.chapitre6.partie9;

class Point7 {

    public Point7(int abs, int ord) {

        x = abs;
        y = ord;
    }

    public static boolean coincide(Point7 p1, Point7 p2) {

        return ((p1.x == p2.x) && (p1.y == p2.y));
    }

    private int x, y;
}

public class Coincid2 {

    public static void main(String[] args) {

        Point7 a = new Point7(1, 3);
        Point7 b = new Point7(2, 5);
        Point7 c = new Point7(1, 3);
        System.out.println("a et b: " + Point7.coincide(a, b));
        System.out.println("a et c: " + Point7.coincide(a, c));
    }
}
