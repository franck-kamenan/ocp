package com.franck.chapitre9.partie2;

import java.util.Scanner;

public class Compte2 {

    public static void main(String[] args) {

        final char car = 'e';
        String ch;

        System.out.print("donnez un mot: ");
        Scanner z = new Scanner(System.in);
        ch = z.nextLine();

        int nbCar = 0;
        for (int i = 0; i < ch.length(); i++) {

            if (ch.charAt(i) == car) nbCar++;
        }

        System.out.println("votre mot comporte " + nbCar + " fois le caractere " + car);
    }
}
