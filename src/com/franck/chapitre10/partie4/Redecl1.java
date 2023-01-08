package com.franck.chapitre10.partie4;

class ErrConst3 extends Exception {}
class ErrBidon extends Exception {}

class Point3 {

    private int x, y;

    public Point3(int x, int y) throws ErrConst3 {

        if ((x < 0) || (y < 0)) throw new ErrConst3();
        this.x = x;
        this.y = y;
    }

    public void f() throws ErrConst3, ErrBidon {

        try {

            Point3 p = new Point3(-3, 2);
        } catch (ErrConst3 e) {

            System.out.println("dans catch(ErrConst3) de f");
            throw new ErrBidon();        // on lance une nouvelle exception
        }
    }
}

public class Redecl1 {

    public static void main(String[] args) {

        try {

            Point3 a = new Point3(1, 4);
            a.f();
        } catch (ErrConst3 e) {

            System.out.println("dans catch(ErrConst2) de main");
        } catch (ErrBidon e) {

            System.out.println("dans catch(ErrBidon) de main");
        }

        System.out.println("apres bloc try main");
    }
}
