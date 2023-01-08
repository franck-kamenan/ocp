package com.franck.chapitre6.partie10;

import java.util.Scanner;

class Util3 {

    public static long fac(long n) {

        long res;
        System.out.println("** entree dans fac: n = " + n);
        if (n <= 1) res = 1;
        else res = fac(n - 1) * n;
        System.out.println("** sortie de fac: res = " + res);
        return res;
    }
}

public class TstFac2 {

    public static void main(String[] args) {

        int n;
        System.out.print("donnez un nombre entier positif: ");
        Scanner z = new Scanner(System.in);
        n = z.nextInt();
        System.out.println("Voici sa factorielle: " + Util3.fac(n));
    }
}
