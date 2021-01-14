package adventofcode.daythree;

import utils.Misc;

import java.util.List;

public class Solution {

    public static Integer stepsRight = 3;
    public static Integer stepsBottom = 0;

    public static void main(String[] args) {
        //List<String> list = Misc.getListFromInput("adventofcode/daythree/input");
        List<String> list = Misc.getListFromInput("adventofcode/daythree/input_part_two");
        //List<String> list = Misc.getListFromInput("adventofcode/daythree/input_for_test");
        char[][] matrix = new char[list.size()][list.get(0).length()];

        for (int i = 0, j=0; i < list.size(); i++) {
            for (char c : list.get(i).toCharArray()) {
                matrix[i][j++] = c;
            }
            j = 0;
        }

        //Misc.printCharMatrix(matrix, list.size(), list.get(0).length());

        long product = 1;

        stepsRight=1;
        int trees = getTreesCount(matrix, list.size(), list.get(0).length());
        System.out.println("Trees for right("+stepsRight+") & bottom("+stepsBottom+"): " + trees);
        product *= trees;

        stepsRight=3;
        trees = getTreesCount(matrix, list.size(), list.get(0).length());
        System.out.println("Trees for right("+stepsRight+") & bottom("+stepsBottom+"): " + trees);
        product *= trees;

        stepsRight=5;
        trees = getTreesCount(matrix, list.size(), list.get(0).length());
        System.out.println("Trees for right("+stepsRight+") & bottom("+stepsBottom+"): " + trees);
        product *= trees;

        stepsRight=7;
        trees = getTreesCount(matrix, list.size(), list.get(0).length());
        System.out.println("Trees for right("+stepsRight+") & bottom("+stepsBottom+"): " + trees);
        product *= trees;

        stepsRight=1;
        stepsBottom=1;
        trees = getTreesCount(matrix, list.size(), list.get(0).length());
        System.out.println("Trees for right("+stepsRight+") & bottom("+stepsBottom+"): " + trees);
        product *= trees;

        System.out.println("Total product: " + product);
    }

    public static int getTreesCount(char[][] matrix, int rows, int cols) {
        Coordinates coordinates = getNextIndexes(0, cols, stepsRight);
        int contTrees = 0;

        for (int x = 1, y; x < rows;x++) {
            y = coordinates.getY();
            x += stepsBottom;

            int tree = treeInNextMove(matrix[x][y]);
            if(tree == 1) {
                contTrees++;
            }

            coordinates = getNextIndexes(y, cols, stepsRight);
        }

        return contTrees == 0 ? 1 : contTrees;
    }

    public static Coordinates getNextIndexes(int y, int cols, int steps) {
        Coordinates coordinates = new Coordinates();
        y+=1;
        int nextStep = y+steps;

        if(nextStep > cols) {
            coordinates.setY(nextStep - cols - 1);
        } else {
            coordinates.setY(y + steps - 1);
        }

        return coordinates;
    }

    public static int treeInNextMove(char ch) {
        if(ch == '#') {
            return 1;
        }
        return 0;
    }

}

class Coordinates {
    private Integer x = 0;
    private Integer y = 0;

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }
}