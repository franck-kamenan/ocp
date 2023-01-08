package com.franck.chapitre12.partie1;

import javax.swing.*;
import java.awt.*;

class MaFenetre extends JFrame{

    public MaFenetre() {

        setTitle("Ma première fenetre");
        setSize(300, 150);
    }
}

public class Premfen1 {

    public static void main(String[] args) {

        JFrame fen = new MaFenetre();
        fen.setVisible(true);
    }
}
