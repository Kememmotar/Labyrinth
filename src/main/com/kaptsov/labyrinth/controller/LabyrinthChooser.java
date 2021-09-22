package com.kaptsov.labyrinth.controller;

import com.kaptsov.labyrinth.model.FinderLabyrinth;
import com.kaptsov.labyrinth.view.WindowChooseLabyrinth;

public class LabyrinthChooser {

    public void choose() {
        FinderLabyrinth finderLabyrinth = new FinderLabyrinth();
        String[] listLabyrinth = finderLabyrinth.find();
        WindowChooseLabyrinth windowChooseLabyrinth = new WindowChooseLabyrinth(listLabyrinth);
    }

}
