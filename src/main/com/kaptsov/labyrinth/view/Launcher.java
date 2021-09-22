package com.kaptsov.labyrinth.view;

import com.kaptsov.labyrinth.controller.LabyrinthChooser;

import javax.swing.*;

public class Launcher {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Labyrinth");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(100, 100);
        JPanel jPanel = new JPanel();
        JButton jButton = new JButton("START");
        jButton.addActionListener( e -> {
            LabyrinthChooser labyrinthChooser = new LabyrinthChooser();
            labyrinthChooser.choose();
            jFrame.setVisible(false);
        });
        jPanel.add(jButton);
        jFrame.add(jPanel);
        jFrame.setVisible(true);
    }

}
