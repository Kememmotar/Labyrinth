package com.kaptsov.labyrinth;

public class LabyrinthGameWindow {

    private final DatabaseLabyrinths databaseLabyrinths;

    public LabyrinthGameWindow(DatabaseLabyrinths databaseLabyrinths) {
        this.databaseLabyrinths = databaseLabyrinths;
    }

    public void launch() {

        new ChooseDataToStart(databaseLabyrinths).ChooseData();

    }


}
