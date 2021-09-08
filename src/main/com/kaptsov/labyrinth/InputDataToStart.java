package com.kaptsov.labyrinth;

import java.util.Scanner;

public class InputDataToStart {

    public DataToStart InputData(DatabaseLabyrinths databaseLabyrinths) {
        int x = 0, y = 0, number = 0;
        Scanner scanner = new Scanner(System.in);
        int countLabyrinth = databaseLabyrinths.getLabyrinthCount();
        System.out.println("Input number labyrinth (1 - " + countLabyrinth + "): ");
        while (number < 1 || number > countLabyrinth) {
            number = scanner.nextInt();
        }
        Labyrinths labyrinths = databaseLabyrinths.getLabyrinths(number - 1);
        int sizeLabyrinthX = labyrinths.getData().length;
        int sizeLabyrinthY = labyrinths.getData()[0].length;
        System.out.println("Input X (2 - " + (sizeLabyrinthX - 1) + "): ");
        while (x < 2 || x > (sizeLabyrinthX - 1)) {
            x = scanner.nextInt();
        }
        System.out.println("Input Y (2 - " + (sizeLabyrinthY - 1) + "): ");
        while (y < 2 || y > (sizeLabyrinthY - 1)) {
            y = scanner.nextInt();
        }
        return new DataToStart(x, y, labyrinths);
    }

}
