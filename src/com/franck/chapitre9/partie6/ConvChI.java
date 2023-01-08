package com.franck.chapitre9.partie6;

import java.util.Scanner;

public class ConvChI {

    public static void main(String[] args) {

        String ch;
        while (true) {       // on s'arrêtera quand chaine vide

            System.out.print("donnez une chaine(0 pour finir): ");
            Scanner z = new Scanner(System.in);
            ch = z.nextLine();

            if (ch.length() == 0) break;
            int n = Integer.parseInt(ch);
            System.out.println("    entier correspondant " + n);
        }
    }
}
