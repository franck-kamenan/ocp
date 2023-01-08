package com.franck.chapitre9.partie6;

import java.util.Scanner;

public class ConvChD {

    public static void main(String[] args) {

        String ch;
        while (true) {       // on s'arrêtera quand chaine vide

            System.out.print("donnez une chaine(0 pour finir): ");
            Scanner z = new Scanner(System.in);
            ch = z.nextLine();

            if (ch.length() == 0) break;
            double x = Double.parseDouble(ch);
            System.out.println("    double correspondant " + x);
        }
    }
}
