package com.franck.chapitre5;

import java.util.Scanner;

public class Switch3 {

    public static void main(String[] args) {

        int n;
        System.out.print("donnez un nombre entier >= 0: ");
        Scanner z = new Scanner(System.in);
        n = z.nextInt();

        switch (n) {

            case 0 -> System.out.println("nul");
            case 1, 2 -> {

                System.out.println("petit");    // attention bloc
                System.out.println("moyen");    // nécéssaire ici
            }
            case 3, 4, 5 -> System.out.println("moyen");
            default -> System.out.println("grand");
        }

        System.out.println("Au revoir");
    }
}
