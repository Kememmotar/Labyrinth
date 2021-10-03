package com.kaptsov.labyrinth.controller;

import com.kaptsov.labyrinth.model.FinderLabyrinth;
import com.kaptsov.labyrinth.view.ChooseView;

import java.util.List;

public class ChooseControllerImpl implements ChooseController {
    private final FinderLabyrinth finderLabyrinth;
    private final ChooseView chooseView;

    public ChooseControllerImpl(FinderLabyrinth finderLabyrinth, ChooseView chooseView) {
        this.finderLabyrinth = finderLabyrinth;
        this.chooseView = chooseView;
    }

    @Override
    public void load() {
        List<String> paths = finderLabyrinth.find();
        chooseView.show(paths);
    }
}
