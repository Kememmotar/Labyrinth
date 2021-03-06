package com.kaptsov.labyrinth;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LabyrinthGame {

    public static DatabaseLabyrinths databaseLabyrinths;

    public static void main(String[] args) {
        databaseLabyrinths = new DatabaseLabyrinths();
        databaseLabyrinths.loadAndCreate(Paths.get("").toAbsolutePath().normalize().toString() + "\\src\\LabyrinthFiles");
        int gameType = 0;
        System.out.println("Choose game type (1 - text, 2 - window)");
        Scanner sc = new Scanner(System.in);
        while (gameType < 1 || gameType > 2) {
            gameType = sc.nextInt();
        }
        if (gameType == 2) {
            LabyrinthGameWindow labyrinthGameWindow = new LabyrinthGameWindow(databaseLabyrinths);
            labyrinthGameWindow.launch();
            return;
        }
        DataToStart dataToStart = new InputDataToStart().InputData(databaseLabyrinths);
        MyTree myTree = new MyTree();
        LabyrinthWalkthrough labyrinthWalkthrough = new LabyrinthWalkthrough();
        labyrinthWalkthrough.walkthrough(myTree, dataToStart);
        List<ElementTree> elementTrees = new ArrayList<>();

        boolean isExit = false;

        for (ElementTree elementTree : myTree.finalElements) {
            if (elementTree.isExit()) {
                isExit = true;
                elementTrees.add(elementTree);
                System.out.println("Exit for x = " + (elementTree.getCoordinateX() + 1) + ", y = " + (elementTree.getCoordinateY() + 1));
            }
        }



        //if (!labyrinthWalkthrough.walkthrough(myTree, dataToStart)) {
        if (!isExit) {
            System.out.println("Labyrinth don't have the exit for input coordinates");
        }

        //In the future - for output minimal step
        //Collections.sort(elementTrees, ElementTree.COMPARE_BY_NUMBER_BRANCH);

    }

}
