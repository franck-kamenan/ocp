package com.franck.chapitre9.partie10;

enum Jour3 { lundi, mardi, mercredi, jeudi, vendredi, samedi, dimanche}

public class EnumValeurs {

    public static void main(String[] args) {

        System.out.println("Liste des valeurs du type Jour:");

        // avec For Each
        for (Jour j: Jour.values()) {

            System.out.println(j.toString());
        }
    }
}
