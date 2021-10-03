package com.kaptsov.labyrinth.view;

import com.kaptsov.labyrinth.controller.ChooseController;

import javax.swing.*;

public class JFrameStartView implements StartView {

    private final ChooseController chooseController;

    public JFrameStartView(ChooseController chooseController) {
        this.chooseController = chooseController;
    }

    public void show() {
        JFrame jFrame = new JFrame("Labyrinth");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(200, 100);
        JPanel jPanel = new JPanel();
        JButton jButton = new JButton("START");
        jButton.addActionListener( e -> {
            jFrame.setVisible(false);
            chooseController.load();
        });
        jPanel.add(jButton);
        jFrame.add(jPanel);
        jFrame.setVisible(true);
    }

}
