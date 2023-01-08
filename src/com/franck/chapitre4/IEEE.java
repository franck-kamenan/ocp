package com.franck.chapitre4;

public class IEEE {

    public static void main(String[] args) {

        float x = 1e30f;
        float y;
        y = x * x;
        System.out.println(x + " a pour carre: " + y);

        float zero = 0.f;   // division flottante par zero
        float z = y / zero;
        System.out.println(y + " divise par 0 = " + z);
        y = 15;
        System.out.println(y + " divise par 0 = " + z);

        float x1 = Float.POSITIVE_INFINITY;     // +infini
        float x2 = Float.NEGATIVE_INFINITY;     // -infini
        z = x1 / x2;
        System.out.println(x1 + " / " + x2 + " = " + z);
    }
}
