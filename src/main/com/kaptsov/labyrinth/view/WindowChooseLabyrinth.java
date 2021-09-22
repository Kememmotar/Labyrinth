package com.kaptsov.labyrinth.view;

import com.kaptsov.labyrinth.ChooseCoordinatesLabyrinth;
import com.kaptsov.labyrinth.controller.LabyrinthChooser;

import javax.swing.*;

public class WindowChooseLabyrinth {

    public WindowChooseLabyrinth(String[] listLabyrinth) {
        JFrame jFrame = new JFrame("Choose labyrinth");
        jFrame.setSize(48 * listLabyrinth.length, 60);
        JPanel jPanel = new JPanel();
        for (int i = 1; i <= listLabyrinth.length; i++) {
            JButton jButton = new JButton("" + i);
            jButton.setSize(6, 10);
            int finalI = i;
            jButton.addActionListener(e -> {
                //jFrame.remove(jPanel);
                //ChooseCoordinatesLabyrinth chooseCoordinatesLabyrinth = new ChooseCoordinatesLabyrinth(finalI, jFrame, databaseLabyrinths);
            });
            jPanel.add(jButton);
        }
        jFrame.add(jPanel);
        jFrame.setVisible(true);
    }

}
