package com.franck.chapitre9.partie6;

import java.util.Scanner;

public class ConvICh {

    public static void main(String[] args) {

        int n;
        while (true) {       // on s'arrêtera quand n == 0

            System.out.print("donnez un entier(0 pour finir): ");
            Scanner z = new Scanner(System.in);
            n = z.nextInt();

            if (n == 0) break;
            String ch = String.valueOf(n);
            System.out.println("    chaine correspondante, de longueur " + ch.length() + " : " + ch);
        }
    }
}
