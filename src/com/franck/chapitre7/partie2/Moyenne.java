package com.franck.chapitre7.partie2;

import java.util.Scanner;

public class Moyenne {

    public static void main(String[] args) {

        int i, nbEl, nbElSupMoy;
        double somme, moyenne;

        System.out.print("Combien d'eleves? ");
        Scanner z = new Scanner(System.in);
        nbEl = z.nextInt();
        double[] notes = new double[nbEl];

        for (i = 0; i < nbEl; i++) {

            System.out.print("donnez la note numero " + (i + 1) + " : ");
            notes[i] = z.nextDouble();
        }

        for (i = 0, somme = 0; i < nbEl; i++) somme += notes[i];
        moyenne = somme / nbEl;
        System.out.println("\nmoyenne de la classe " + moyenne);

        for (i = 0, nbElSupMoy = 0; i < nbEl; i++) {

            if (notes[i] > moyenne) nbElSupMoy++;
        }

        System.out.println(nbElSupMoy + " eleves ont plus de cette moyenne");
    }
}
