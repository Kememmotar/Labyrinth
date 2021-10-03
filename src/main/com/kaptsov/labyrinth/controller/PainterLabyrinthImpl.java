package com.kaptsov.labyrinth.controller;

import com.kaptsov.labyrinth.model.LabyrinthData;
import com.kaptsov.labyrinth.model.LoadLabyrinth;
import com.kaptsov.labyrinth.view.PaintView;

public class PainterLabyrinthImpl implements PainterLabyrinth {

    private final LoadLabyrinth loadLabyrinth;
    private final PaintView paintView;

    public PainterLabyrinthImpl(LoadLabyrinth loadLabyrinth, PaintView paintView) {
        this.loadLabyrinth = loadLabyrinth;
        this.paintView = paintView;
    }

    @Override
    public void paint(String path) {
        LabyrinthData labyrinthData = loadLabyrinth.load(path);
        paintView.paint(labyrinthData);
    }
}
