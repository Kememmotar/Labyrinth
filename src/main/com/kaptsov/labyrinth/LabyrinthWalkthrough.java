package com.kaptsov.labyrinth;

public class LabyrinthWalkthrough {

    private boolean checkIsExit(int x, int y, int labyrinthX, int labyrinthY, boolean isStep) {
        return (x == 0 || y == 0 || x == (labyrinthX-1) || y == (labyrinthY-1)) && isStep;
    }

    private void nextStep(MyTree myTree, Labyrinths labyrinths, boolean[][] data, int x, int y, int labyrinthX, int labyrinthY, int numberBranch, ElementTree previousElement) {
        if (myTree.contains(x, y, previousElement)) return;
        if (data[y][x]) { // Can step
            boolean isExit = checkIsExit(x, y, labyrinthX, labyrinthY, data[y][x]);
            ElementTree newElement = new ElementTree(isExit, numberBranch, previousElement, x, y);
            previousElement.addNextElements(newElement);
            if (isExit) {
                myTree.finalElements.add(newElement);
            } else {
                nextSteps(myTree, labyrinths, data, x, y, labyrinthX, labyrinthY, numberBranch + 1, newElement);
            }
        } else {
            myTree.finalElements.add(previousElement);
        }
    }

    private void nextSteps(MyTree myTree, Labyrinths labyrinths, boolean[][] data, int x, int y, int labyrinthX, int labyrinthY, int numberBranch, ElementTree previousElement) {
        // смена координат
        // проверка на прохождение
        //      нет прохода - Записать предыдущий шаг в финальные точки и выйти
        // есть проход - проверка на выход
        //      есть выход - создать новую точку, записать в финальную точку и выйти
        //      нет выхода - создать новую точку и запустить следующую проверку
        nextStep(myTree, labyrinths, data, x-1, y, labyrinthX, labyrinthY, numberBranch, previousElement);
        nextStep(myTree, labyrinths, data, x+1, y, labyrinthX, labyrinthY, numberBranch, previousElement);
        nextStep(myTree, labyrinths, data, x, y-1, labyrinthX, labyrinthY, numberBranch, previousElement);
        nextStep(myTree, labyrinths, data, x, y+1, labyrinthX, labyrinthY, numberBranch, previousElement);
    }

    public boolean walkthrough(MyTree myTree, DataToStart dataToStart) {
        //initial block
        Labyrinths labyrinths = dataToStart.getLabyrinths();
        boolean[][] data = labyrinths.getData();
        int y = data.length, x = data[0].length;
        int getX = dataToStart.getX()-1;
        int getY = dataToStart.getY()-1;
        if (!data[getY][getX]) return false;
        boolean isExit = checkIsExit(getX, getY, x, y, data[getY][getX]);
        myTree.firstElement = new ElementTree(isExit, 0, null, getX, getY);
        if (isExit) {
            myTree.finalElements.add(myTree.firstElement);
            return true;
        }

        nextSteps(myTree, labyrinths, data, getX, getY, x, y, 1, myTree.firstElement);
        return true;
    }
}
