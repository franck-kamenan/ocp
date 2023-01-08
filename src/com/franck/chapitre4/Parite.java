package com.franck.chapitre4;

import java.util.Scanner;

public class Parite {

    public static void main(String[] args) {

        int n;
        System.out.println("donnez un entier: ");
        Scanner z = new Scanner(System.in);
        n = z.nextInt();
        if ((n & 1) == 1)
            System.out.println("il est impair");
        else
            System.out.println("il est pair");
    }
}
