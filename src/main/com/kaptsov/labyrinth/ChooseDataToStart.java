package com.kaptsov.labyrinth;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChooseDataToStart {

    private final DatabaseLabyrinths databaseLabyrinths;

    int numberLabyrinth = 0;

    public ChooseDataToStart(DatabaseLabyrinths databaseLabyrinths) {
        this.databaseLabyrinths = databaseLabyrinths;
    }

    public DataToStart ChooseData() {

        WindowCreater windowCreater = new WindowCreater();
        //choose labyrinth
        JFrame chooseLabyrinth =  windowCreater.create("Choose labyrinth", databaseLabyrinths.getLabyrinthCount() * 48, 60);
        ChooseNumberLabyrinth chooseNumberLabyrinth = new ChooseNumberLabyrinth(chooseLabyrinth, databaseLabyrinths.getLabyrinthCount());
        numberLabyrinth = chooseNumberLabyrinth.choose();

        System.out.println(numberLabyrinth);
        //choose coordinates
        JFrame chooseCoordinates =  windowCreater.create("Choose coordinates", 480, 600);
        chooseCoordinates.setVisible(true);
        //write path
        return new DataToStart(1, 1, databaseLabyrinths.getLabyrinths(numberLabyrinth-1));
    }
}
