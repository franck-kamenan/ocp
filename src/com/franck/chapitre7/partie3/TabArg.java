package com.franck.chapitre7.partie3;

class Util {

    static void raz(int t[]) {

        for (int i = 0; i < t.length; i++) t[i] = 0;        // ici for each pas applicable
    }

    static void affiche(int t[]) {

        for (int i = 0; i < t.length; i++) {                // ou(depuis JDK 5.0:

            System.out.print(t[i] + " ");                   // for(int v: t) System.out.print(v + " ");
        }
    }
}

public class TabArg {

    public static void main(String[] args) {

        int t[] = {1, 3, 5, 7};
        System.out.print("t avant: ");
        Util.affiche(t);
        Util.raz(t);
        System.out.print("\nt apres: ");
        Util.affiche(t);
    }
}
