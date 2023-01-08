package com.franck.chapitre9.partie10;

enum Jour2 { lundi, mardi, mercredi, jeudi, vendredi, samedi, dimanche}

public class EnumSwitch {

    public static void main(String[] args) {

        Jour2 courant;
        courant = Jour2.vendredi;

        switch (courant) {

            case lundi :        // attention Jour.lundi serait une erreur
            case mardi:
            case mercredi:
            case jeudi:
                System.out.println("On bosse");
                break;
            case vendredi:
                System.out.println("Bientot le week-end");
                break;
            case samedi:
            case dimanche:
                System.out.println("c'est le week-end");
        }
    }
}
