package com.kaptsov.labyrinth.view;

import com.kaptsov.labyrinth.model.ElementTree;
//import com.kaptsov.labyrinth.model.LabyrinthWalkthrough;
import com.kaptsov.labyrinth.model.MyTree;
import com.kaptsov.labyrinth.model.DataToStart;
import com.kaptsov.labyrinth.model.LabyrinthData;

import javax.swing.*;
import java.awt.*;

public class PaintViewImpl implements PaintView {

    @Override
    public void paint(LabyrinthData labyrinthData) {
        JFrame jFrame = new JFrame("Choose coordinates");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel jPanel1 = new JPanel();
        boolean[][] labyrinthDataBoolean = labyrinthData.getData();
        int x = labyrinthDataBoolean[0].length;
        int y = labyrinthDataBoolean.length;
        JPanel jPanel[] = new JPanel[y];
        JButton jButtons[][];
        jButtons = new JButton[y][x];
        jFrame.setSize(x*41, y * 32 + 23);
        for (int i = 0; i < y; i++) {
            jPanel[i] = new JPanel();
            for (int j = 0; j < x; j++) {
                JButton jButton = new JButton("");
                jButtons[i][j] = jButton;
                jButton.setSize(3, 6);
                if (!labyrinthDataBoolean[i][j]) jButton.setBackground(Color.darkGray);
                else {
                    int finalX = j+1;
                    int finalY = i+1;
                    /*jButton.addActionListener(e -> {
                        DataToStart dataToStart = new DataToStart(finalX, finalY, labyrinthData);
                        MyTree myTree = new MyTree();
                        LabyrinthWalkthrough labyrinthWalkthrough = new LabyrinthWalkthrough();
                        labyrinthWalkthrough.walkthrough(myTree, dataToStart);

                        for (ElementTree elementTree : myTree.finalElements) {
                            if (!elementTree.isExit()) continue;
                            jButtons[elementTree.getCoordinateY()][elementTree.getCoordinateX()].setBackground(Color.ORANGE);
                            ElementTree tmpElementTree = elementTree;
                            while (!(tmpElementTree.getPreviousElement() == null)) {
                                tmpElementTree = tmpElementTree.getPreviousElement();
                                jButtons[tmpElementTree.getCoordinateY()][tmpElementTree.getCoordinateX()].setBackground(Color.ORANGE);
                            }
                        }

                    });*/
                }
                jPanel[i].add(jButton);
            }
            jPanel1.add(jPanel[i]);
        }
        jFrame.add(jPanel1);
        jFrame.setVisible(true);
    }
}
