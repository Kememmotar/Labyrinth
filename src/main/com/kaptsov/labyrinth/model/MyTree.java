package com.kaptsov.labyrinth.model;

import com.kaptsov.labyrinth.ElementTree;
import com.kaptsov.labyrinth.Tree;

import java.util.ArrayList;
import java.util.List;

public class MyTree implements Tree {
    ElementTree firstElement;
    List<ElementTree> finalElements = new ArrayList<>();

    public boolean contains(int x, int y, ElementTree elementTree) {
        ElementTree tmpElement = elementTree;
        while (true) {
            if (x == tmpElement.getCoordinateX() && y == tmpElement.getCoordinateY()) return true;
            tmpElement = tmpElement.getPreviousElement();
            if (tmpElement == null) return false;
        }
    }

}
