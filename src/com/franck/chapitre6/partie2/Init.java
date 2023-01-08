package com.franck.chapitre6.partie2;

public class Init {

    public static void main(String[] args) {

        A a = new A();      // ici a.n vaut 5, a.p vaut 10, mais a.np vaut 200
        a.affiche();
    }
}

class A {

    public A() {

        // ici, n vaut 20, p vaut 10 et np vaut 0
        np = n * p;
        n = 5;
    }

    public void affiche() {

        System.out.println("n = " + n + ", p = " + p + ", np = " + np);
    }

    private int n = 20, p = 10;
    private int np;
}