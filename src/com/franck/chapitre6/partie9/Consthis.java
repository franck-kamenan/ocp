package com.franck.chapitre6.partie9;

class Point10 {

    public Point10(int abs, int ord) {

        x = abs;
        y = ord;
        System.out.println("constructeur deux arguments: " + x + " " + y);
    }

    public Point10() {

        this(0, 0);     // appel(0, 0); doit etre la premiere instruction
        System.out.println("constructeur sans arguments");
    }

    private int x, y;
}

public class Consthis {

    public static void main(String[] args) {

        Point10 a = new Point10(1, 2);
        Point10 b = new Point10();
    }
}
