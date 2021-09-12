package com.kaptsov.labyrinth;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ElementTree {
    private boolean isExit;
    private int numberBranch;
    private ElementTree previousElement;
    private List<ElementTree> nextElements = new ArrayList<>();
    private int coordinateX;
    private int coordinateY;

    public int getCoordinateX() {
        return coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public boolean isExit() {
        return isExit;
    }

    public int getNumberBranch() {
        return numberBranch;
    }

    public ElementTree getPreviousElement() {
        return previousElement;
    }

    public List<ElementTree> getNextElements() {
        return nextElements;
    }

    public ElementTree(boolean isExit, int numberBranch, ElementTree previousElement, int x, int y) {
        this.isExit = isExit;
        this.numberBranch = numberBranch;
        this.previousElement = previousElement;
        coordinateX = x;
        coordinateY = y;
    }

    public void addNextElements(ElementTree elementTree) {
        nextElements.add(elementTree);
    }
    public static final Comparator<ElementTree> COMPARE_BY_NUMBER_BRANCH = new Comparator<ElementTree>() {
        @Override
        public int compare(ElementTree lhs, ElementTree rhs) {
            return lhs.getNumberBranch() - rhs.getNumberBranch();
        }
    };
}
