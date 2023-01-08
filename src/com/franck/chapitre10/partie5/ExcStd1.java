package com.franck.chapitre10.partie5;

import java.util.Scanner;

public class ExcStd1 {

    public static void main(String[] args) {

        try {

            int t[];
            System.out.print("taille voulue: ");
            Scanner z = new Scanner(System.in);
            int n = z.nextInt();
            t = new int[n];
            System.out.print("indice: ");
            int i = z.nextInt();
            t[i] = 12;
            System.out.println("*** fin normale");
        } catch (NegativeArraySizeException e) {

            System.out.println("Exception taille tableau negative: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Exception indice tableau: " + e.getMessage());
        }
    }
}
