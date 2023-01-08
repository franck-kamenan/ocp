package com.franck.chapitre6.partie10;

import java.util.Scanner;

class Util2 {

    public static long fac(long n) {

        if (n > 1) return (fac(n - 1) * n);
        else return 1;
    }
}

public class TstFac {

    public static void main(String[] args) {

        int n;
        System.out.print("donnez un nombre entier positif: ");
        Scanner z = new Scanner(System.in);
        n = z.nextInt();
        System.out.println("Voici sa factorielle: " + Util2.fac(n));
    }
}
