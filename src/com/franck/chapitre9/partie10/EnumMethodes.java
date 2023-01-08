package com.franck.chapitre9.partie10;

enum Jour6 {

    lundi("lu"), mardi("ma"), mercredi("me"), jeudi("je"), vendredi("ve"), samedi("sa"), dimanche("di");

    private String abrege;

    private Jour6(String a) {

        abrege = a;
    }

    public String abreviation() {

        return abrege;
    }
}

public class EnumMethodes {

    public static void main(String[] args) {

        System.out.println("Noms des valeurs du type jour et leurs abreviations");
        for (Jour6 j: Jour6.values()) {

            System.out.println(j + " : " + j.abreviation());
        }
    }
}
