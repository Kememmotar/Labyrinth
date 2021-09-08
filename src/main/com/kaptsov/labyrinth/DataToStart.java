package com.kaptsov.labyrinth;

public class DataToStart {

    private int x;
    private int y;
    private Labyrinths labyrinths;

    public DataToStart(int x, int y, Labyrinths labyrinths) {
        this.x = x;
        this.y = y;
        this.labyrinths = labyrinths;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Labyrinths getLabyrinths() {
        return labyrinths;
    }

}
