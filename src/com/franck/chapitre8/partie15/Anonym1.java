package com.franck.chapitre8.partie15;

class A {

    public void affiche() {

        System.out.println("Je suis un A");
    }
}

public class Anonym1 {

    public static void main(String[] args) {

        A a;
        a = new A() {

            @Override
            public void affiche() {

                System.out.println("Je suis un anonyme derive de A");
                // super.affiche();
            }
        };

        a.affiche();
    }
}
