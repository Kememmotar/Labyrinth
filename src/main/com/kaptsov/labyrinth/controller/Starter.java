package com.kaptsov.labyrinth.controller;

import com.kaptsov.labyrinth.model.FinderLabyrinth;
import com.kaptsov.labyrinth.model.LoadLabyrinth;
import com.kaptsov.labyrinth.view.ChooseViewImpl;
import com.kaptsov.labyrinth.view.JFrameStartView;
import com.kaptsov.labyrinth.view.PaintViewImpl;

import javax.swing.*;

public class Starter {

    public static void main(String[] args) {

        FinderLabyrinth finderLabyrinth = new FinderLabyrinth();
        LoadLabyrinth loadLabyrinth = new LoadLabyrinth();
        PaintViewImpl paintView = new PaintViewImpl();
        PainterLabyrinth painterLabyrinth = new PainterLabyrinthImpl(loadLabyrinth, paintView);
        ChooseViewImpl chooseView = new ChooseViewImpl(painterLabyrinth);
        ChooseController chooseController = new ChooseControllerImpl(finderLabyrinth, chooseView);
        JFrameStartView startView = new JFrameStartView(chooseController);
        StartController startController = new StartControllerImpl(startView);
        startController.start();
    }

}
