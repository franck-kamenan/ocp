package com.franck.chapitre5;

import java.util.Scanner;

public class Switch1 {

    public static void main(String[] args) {

        int n;
        System.out.print("donnez un nombre entier >= 0: ");
        Scanner z = new Scanner(System.in);
        n = z.nextInt();

        switch (n) {

            case 0 :
                System.out.println("nul");
                break;
            case 1 :
                System.out.println("un");
                break;
            case 3 :
                System.out.println("trois");
                break;
            default:
                System.out.println("ni 0, 1 ou 3");
        }

        System.out.println("Au revoir");
    }
}
