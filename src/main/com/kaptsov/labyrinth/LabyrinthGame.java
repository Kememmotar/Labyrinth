package com.kaptsov.labyrinth;

import java.nio.file.Paths;

public class LabyrinthGame {

    public static DatabaseLabyrinths databaseLabyrinths;

    public static void main(String[] args) {
        databaseLabyrinths = new DatabaseLabyrinths();
        databaseLabyrinths.loadAndCreate(Paths.get("").toAbsolutePath().normalize().toString() + "\\src\\LabyrinthFiles");
        System.out.println(databaseLabyrinths.getLabyrinthCount());
    }

}
