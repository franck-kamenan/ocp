package com.franck.chapitre9.partie2;

import java.util.Scanner;

public class Compte1 {

    public static void main(String[] args) {

        final char car = 'e';
        int i;
        int posCar;
        int nbCar = 0;
        String ch;

        System.out.print("donnez un mot: ");
        Scanner z = new Scanner(System.in);
        ch = z.nextLine();

        i = 0;
        do {

            posCar = ch.indexOf(car, i);        // recherche à partir du caractère de rang i
            if (posCar >= 0) {

                nbCar++;
                i = posCar+1;
            }
        } while (posCar >= 0);

        System.out.println("votre mot comporte " + nbCar + " fois le caractere " + car);
    }
}
