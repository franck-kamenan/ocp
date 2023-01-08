package com.franck.chapitre9.partie1;

import java.util.Scanner;

public class MotCol {

    public static void main(String[] args) {

        String mot;
        System.out.print("donnez un mot: ");
        Scanner z = new Scanner(System.in);
        mot = z.nextLine();

        System.out.println("voici votre mot en colonne:");
        for (int i = 0; i < mot.length(); i++) {

            System.out.println(mot.charAt(i));
        }
    }
}
