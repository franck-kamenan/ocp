package com.franck.chapitre5;

import java.util.Scanner;

public class Do1 {

    public static void main(String[] args) {

        int n;
        do {

            System.out.print("donnez un nombre > 0: ");
            Scanner z = new Scanner(System.in);
            n = z.nextInt();
            System.out.println("vous avez fourni " + n);
        } while (n <= 0);
        System.out.println("reponse correcte");
    }
}
