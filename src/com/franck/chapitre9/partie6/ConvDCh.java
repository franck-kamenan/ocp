package com.franck.chapitre9.partie6;

import java.util.Scanner;

public class ConvDCh {

    public static void main(String[] args) {

        double x;
        while (true) {       // on s'arrêtera quand n == 0

            System.out.print("donnez un double(0 pour finir): ");
            Scanner z = new Scanner(System.in);
            x = z.nextDouble();

            if (x == 0) break;
            String ch = String.valueOf(x);
            System.out.println("    chaine correspondante, de longueur " + ch.length() + " : " + ch);
        }
    }
}
