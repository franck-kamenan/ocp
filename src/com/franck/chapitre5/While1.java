package com.franck.chapitre5;

import java.util.Scanner;

public class While1 {

    public static void main(String[] args) {

        int n, som;
        som = 0;
        while (som < 100) {

            System.out.print("donnez un nbre: ");
            Scanner z = new Scanner(System.in);
            n = z.nextInt();
            som +=n;
        }
        System.out.println("Somme obtenue: " + som);
    }
}
