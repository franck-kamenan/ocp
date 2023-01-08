package com.franck.chapitre4;

public class Conver {

    public static void main(String[] args) {

        byte b1 = 50, b2 = 100;
        int n;
        n = b1 * b2;    // b1 et b2 sont convertis en int, avant qu'on en fasse le
                        // produit(en int); le resultat aurait depasse la capacite
                        // du type byte, mais il est correct
        System.out.println(b1 + " * " + b2 + " = " + n);
        int n1 = 100000, n2 = 200000;
        long p;
        p = n1 * n2;    // le produit est calcule en int, il conduit a un depassement
                        // le resultat(errone) est affecte a p
        System.out.println(n1 + " * " + n2 + " = " + p);
    }
}
