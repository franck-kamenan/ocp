package com.franck.chapitre9.partie9;

public class TstStB {

    public static void main(String[] args) {

        String ch = "la java";
        StringBuffer chBuf = new StringBuffer(ch);
        System.out.println(chBuf);

        chBuf.setCharAt(3, 'J');
        System.out.println(chBuf);
        chBuf.setCharAt(1, 'e');
        System.out.println(chBuf);
        chBuf.append(" 2");
        System.out.println(chBuf);
        chBuf.insert(3, "langage ");
        System.out.println(chBuf);
    }
}
