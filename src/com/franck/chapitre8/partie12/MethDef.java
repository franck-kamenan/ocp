package com.franck.chapitre8.partie12;

interface Aff {

    default void affiche() {

        System.out.println("Je suis un Aff = " + this);
    }
}

class A implements Aff {

    @Override
    public void affiche() {     // redefinit affiche

        System.out.println("Je suis un A = " + this);
        // Aff.super.affiche();
    }
}

class B implements Aff {}

public class MethDef {

    public static void main(String[] args) {

        A a = new A();
        B b = new B();

        a.affiche();
        b.affiche();
    }
}
