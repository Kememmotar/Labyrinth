package com.kaptsov.labyrinth.controller;

import com.kaptsov.labyrinth.view.StartView;

public class StartControllerImpl implements StartController {
    private final StartView startView;

    public StartControllerImpl(StartView startView) {
        this.startView = startView;
    }

    @Override
    public void start() {
        startView.show();
    }
}
