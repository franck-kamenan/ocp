package com.franck.chapitre5;

import java.util.Scanner;

public class Contin2 {

    public static void main(String[] args) {

        double x;
        do {

            System.out.print("donnez un flottant > 0 (0 pour finir): ");
            Scanner z = new Scanner(System.in);
            x = z.nextDouble();
            if (x < 0) {

                System.out.println(" ce nbre n'est pas > 0");
                continue;
            }

            System.out.println(" Sa racine est " + Math.sqrt(x));
        }

        while (x != 0);
    }
}
