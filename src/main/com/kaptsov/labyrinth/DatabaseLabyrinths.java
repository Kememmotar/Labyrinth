package com.kaptsov.labyrinth;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DatabaseLabyrinths {

    private List<Labyrinths> labyrinths = new ArrayList<>();

    public int getLabyrinthCount() {
        return labyrinths.size();
    }

    public Labyrinths getLabyrinths(int number) {
        return labyrinths.get(number-1);
    }

    public boolean loadAndCreate(String path) {
        LabyrinthFactory labyrinthFactory = new LabyrinthFactory();
        try (DirectoryStream<Path> dir = Files.newDirectoryStream(
                Paths.get(path), "*.in")) {

            for (Path entry : dir) {
                Labyrinths labyrinth = labyrinthFactory.create(entry.toString());
                if (labyrinth != null)
                    labyrinths.add(labyrinth);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }

}
