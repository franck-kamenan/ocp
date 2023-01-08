package com.franck.chapitre10.partie4;

class ErrConst2 extends Exception {}

class Point2 {

    private int x, y;

    public Point2(int x, int y) throws ErrConst2 {

        if ((x < 0) || (y < 0)) throw new ErrConst2();
        this.x = x;
        this.y = y;
    }

    public void f() throws ErrConst2 {

        try {

            Point2 p = new Point2(-3, 2);
        } catch (ErrConst2 e) {

            System.out.println("dans catch(ErrConst2) de f");
            throw e;        // on repasse l'exception à un niveau superieur
        }
    }
}

public class Redecl {

    public static void main(String[] args) {

        try {

            Point2 a = new Point2(1, 4);
            a.f();
        } catch (ErrConst2 e) {

            System.out.println("dans catch(ErrConst2) de main");
        }

        System.out.println("apres bloc try main");
    }
}
