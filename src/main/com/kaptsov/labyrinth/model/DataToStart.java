package com.kaptsov.labyrinth.model;

import com.kaptsov.labyrinth.Labyrinths;

public class DataToStart {

    private int x;
    private int y;
    private LabyrinthData labyrinthData;

    public DataToStart(int x, int y, LabyrinthData labyrinthData) {
        this.x = x;
        this.y = y;
        this.labyrinthData = labyrinthData;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public LabyrinthData getLabyrinths() {
        return labyrinthData;
    }

}
