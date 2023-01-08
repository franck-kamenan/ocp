package com.franck.chapitre8.partie12;

interface Aff2 {

    default void affiche() {

        System.out.println("Je suis un Aff = " + this);
    }
}

interface Affder1 extends Aff2 {}       // utilise affiche de Aff2
interface Affder2 extends Aff2 {

    @Override
    default void affiche() {        // affiche devient abstraite

        // Aff2.super.affiche();
    }
}
interface Affder3 extends Aff2 {        // redefinit affiche


    @Override
    default void affiche() {

        System.out.println("Je suis un Affder3 = " + this);
        // Aff2.super.affiche();
    }
}

class A2 implements Affder1 {}

class B2 implements Affder2 {       // doit implementer affiche

    public void affiche() {

        System.out.println("Je suis un B2 = " + this);
    }
}

class C implements Affder3 {}

public class MethDef2 {

    public static void main(String[] args) {

        A2 a = new A2();
        B2 b = new B2();
        C c = new C();

        a.affiche();
        b.affiche();
        c.affiche();
    }
}
