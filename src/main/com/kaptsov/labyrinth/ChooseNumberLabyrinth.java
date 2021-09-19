package com.kaptsov.labyrinth;

import javax.swing.*;

public class ChooseNumberLabyrinth {

    private final JFrame jFrame;
    private final int labyrinthCount;

    public ChooseNumberLabyrinth(JFrame jFrame, int labyrinthCount) {
        this.jFrame = jFrame;
        this.labyrinthCount = labyrinthCount;
    }

    public void choose(DatabaseLabyrinths databaseLabyrinths) {
        JPanel jPanel = new JPanel();
        for (int i = 1; i <= labyrinthCount; i++) {
            JButton jButton = new JButton("" + i);
            jButton.setSize(6, 10);
            int finalI = i;
            jButton.addActionListener(e -> {
                jFrame.remove(jPanel);
                ChooseCoordinatesLabyrinth chooseCoordinatesLabyrinth = new ChooseCoordinatesLabyrinth(finalI, jFrame, databaseLabyrinths);
            });
            jPanel.add(jButton);
        }
        jFrame.add(jPanel);
        jFrame.setVisible(true);
    }

}
