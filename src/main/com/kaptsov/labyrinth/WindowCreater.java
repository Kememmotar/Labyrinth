package com.kaptsov.labyrinth;

import javax.swing.*;

public class WindowCreater {

    public JFrame create(String title, int sizeX, int sizeY) {
        JFrame jFrame = new JFrame(title);
        jFrame.setSize(sizeX, sizeY);
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        return jFrame;
    }

}
