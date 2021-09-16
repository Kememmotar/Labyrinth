package com.kaptsov.labyrinth;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChooseNumberLabyrinth {

    private final JFrame jFrame;
    private final int labyrinthCount;
    private int[] numberLabyrinth = {0};
    private int number = 0;

    public ChooseNumberLabyrinth(JFrame jFrame, int labyrinthCount) {
        this.jFrame = jFrame;
        this.labyrinthCount = labyrinthCount;
    }

    public int choose() {
        JPanel jPanel = new JPanel();
        for (int i = 1; i <= labyrinthCount; i++) {
            JButton jButton = new JButton("" + i);
            jButton.setSize(6, 10);
            int finalI = i;
            jButton.addActionListener(e -> {
                numberLabyrinth[0] = finalI;
                jFrame.setVisible(false);
            });
            jPanel.add(jButton);
        }
        jFrame.add(jPanel);
        jFrame.setVisible(true);
        while (number < 1 || number > labyrinthCount) {
            number = numberLabyrinth[0];
        }
        System.out.println(number);
        return number;
    }

}
