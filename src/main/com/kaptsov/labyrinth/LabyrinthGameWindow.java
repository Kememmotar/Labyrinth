package com.kaptsov.labyrinth;

public class LabyrinthGameWindow {

    private final DatabaseLabyrinths databaseLabyrinths;

    public LabyrinthGameWindow(DatabaseLabyrinths databaseLabyrinths) {
        this.databaseLabyrinths = databaseLabyrinths;
    }

    public void launch() {

        DataToStart dataToStart = new ChooseDataToStart(databaseLabyrinths).ChooseData();

    }


}
