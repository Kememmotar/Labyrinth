package com.kaptsov.labyrinth;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.nio.file.Paths;
import java.util.jar.JarOutputStream;

public class LabyrinthGame {

    public static DatabaseLabyrinths databaseLabyrinths;

    public static void main(String[] args) {
        databaseLabyrinths = new DatabaseLabyrinths();
        databaseLabyrinths.loadAndCreate(Paths.get("").toAbsolutePath().normalize().toString() + "\\src\\LabyrinthFiles");
        System.out.println(databaseLabyrinths.getLabyrinthCount());
    }

}
