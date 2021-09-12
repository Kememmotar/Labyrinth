package com.kaptsov.labyrinth;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LabyrinthFactory {

    public Labyrinths create(String path) {
        Scanner sc;
        try {
            sc = new Scanner(new File(path));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
        int x = 0, y = 0, tempY = 0;
        String [] splitted;
        if (sc.hasNext()) {
            splitted = sc.nextLine().split(" ");
            y = Integer.parseInt(splitted[0]);
            x = Integer.parseInt(splitted[1]);
        }
        boolean[][] data = new boolean[y][x];
        while (sc.hasNext()) {
            if (tempY == y) break;
            splitted = sc.nextLine().split("");
            for (int i = 0; i < x; i++)
                data[tempY][i] = !splitted[i].equals("#");
            tempY++;
        }
        return new Labyrinths(data);
    }

}
