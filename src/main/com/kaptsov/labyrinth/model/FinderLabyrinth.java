package com.kaptsov.labyrinth.model;

import com.kaptsov.labyrinth.Labyrinths;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FinderLabyrinth {

    public String[] find() {

        List<String> listFiles = new ArrayList<String>();
        String path = Paths.get("").toAbsolutePath().normalize().toString() + "\\src\\LabyrinthFiles";
        try (DirectoryStream<Path> dir = Files.newDirectoryStream(
                Paths.get(path), "*.in")) {

            for (Path entry : dir) {
                listFiles.add(entry.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return (String[])listFiles.toArray();
    }

}
