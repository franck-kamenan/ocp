package com.franck.chapitre6.partie9;

class Util {

    public static void echange(int a, int b) {

        System.out.println("début échange: " + a + " " + b);
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println("fin échange: " + a + " " + b);
    }
}

public class Echange {

    public static void main(String[] args) {

        int n = 10, p = 20;
        System.out.println("avant appel: " + n + " " + p);
        Util.echange(n, p);
        System.out.println("apres appel: " + n + " " + p);
    }
}
