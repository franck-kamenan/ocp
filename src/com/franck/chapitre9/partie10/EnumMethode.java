package com.franck.chapitre9.partie10;

enum Jour5 {

    lundi, mardi, mercredi, jeudi, vendredi, samedi, dimanche;

    public void affiche() {

        System.out.println(this.toString());
    }
}

public class EnumMethode {

    public static void main(String[] args) {

        System.out.println("Noms des valeurs du type jour:");
        for (Jour5 j: Jour5.values()) {

            j.affiche();
        }
    }
}
