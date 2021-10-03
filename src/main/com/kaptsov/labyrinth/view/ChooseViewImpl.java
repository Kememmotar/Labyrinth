package com.kaptsov.labyrinth.view;

import com.kaptsov.labyrinth.controller.PainterLabyrinth;

import javax.swing.*;
import java.util.List;

public class ChooseViewImpl implements ChooseView {

    private final PainterLabyrinth painterLabyrinth;

    public ChooseViewImpl(PainterLabyrinth painterLabyrinth) {
        this.painterLabyrinth = painterLabyrinth;
    }

    @Override
    public void show(List<String> paths) {
        JFrame jFrame = new JFrame("Choose Labyrinth");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(48*paths.size(), 80);
        JPanel jPanel = new JPanel();
        for (int i = 1; i <= paths.size(); i++) {
            JButton jButton = new JButton("" + i);
            jButton.setSize(6, 10);
            int finalI = i;
            jButton.addActionListener(e -> {
                jFrame.setVisible(false);
                painterLabyrinth.paint(paths.get(finalI-1));
                //jFrame.remove(jPanel);
                //ChooseCoordinatesLabyrinth chooseCoordinatesLabyrinth = new ChooseCoordinatesLabyrinth(finalI, jFrame, databaseLabyrinths);
            });
            jPanel.add(jButton);
        }
        jFrame.add(jPanel);
        jFrame.setVisible(true);
    }
}
