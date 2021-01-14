package misc;

import sun.awt.image.ImageWatched;

import java.lang.annotation.Target;
import java.util.*;

/**
 * Problem: You have a function that will be to receive;
 *  - matrix of integers that represents a gym map, where:
 *      + 0 refers to the floor
 *      + 1 refers to a wall
 *      + 2 its the user
 *      + 3 an exercise machine that the user its looking for (The target)
 *
 * Write a function that returns the minimal route from user to the machine.
 * Google's interview
 *
 * STATUS: PENDING TO FINISH
 */
public class MinimalRoute {

    public static final Integer USER = 2;
    public static final Integer FLOOR = 0;
    public static final Integer WALL = 1;
    public static final Integer VISITED = 8;
    public static final Integer TARGET = 3;

    /*public void searchForTarget(int[][] matrix) {
        int x = 0;
        int y = 0;

        if(matrix[x][y] == TARGET) {
            System.out.println("["+x+","+y+"]");
            System.out.println("FOUND !!!");
            return;
        }

        Queue<Integer[]> currentBoundaries = getBoundaries(matrix, x, y);
        Queue<Integer[]> parent = new LinkedList<>();
        parent.add(new Integer[]{x,y});

        Integer[] cell = null;
        while (!currentBoundaries.isEmpty()) {
            cell = currentBoundaries.poll();

            System.out.print("["+cell[0]+","+cell[1]+"]-");
            if(matrix[cell[0]][cell[1]] == TARGET) {
                break;
            }

            matrix[cell[0]][cell[1]] = VISITED;
            currentBoundaries.addAll(getBoundaries(matrix, cell[0], cell[1]));
        }
        System.out.println("");
        System.out.println("FOUND in: ["+cell[0]+","+cell[1]+"]: " + matrix[cell[0]][cell[1]]);
        while (!currentBoundaries.isEmpty()) {
            System.out.println("currentBoundaries: " + Arrays.toString(currentBoundaries.poll()));
        }

        printMatrix(matrix);
    }*/

    /*public void printBSF(int[][] matrix) {
        int x = 0;
        int y = 0;

        System.out.println("["+x+","+y+"]");
        Queue<Integer[]> currentBoundaries = getBoundaries(matrix, x, y);

        while (!currentBoundaries.isEmpty()) {
            Integer[] cell = currentBoundaries.poll();

            System.out.print("["+cell[0]+","+cell[1]+"]-");

            if(currentBoundaries.size() == 0) {
                System.out.println("");
            }

            matrix[cell[0]][cell[1]] = VISITED;
            currentBoundaries.addAll(getBoundaries(matrix, cell[0], cell[1]));
        }
    }*/

    /*private Queue<Integer[]> getBoundaries(int[][] matrix, int x, int y) {
        Queue<Integer[]> queue = new LinkedList<>();

        int limitX = matrix.length;
        int limitY = matrix[x].length;

        //Right
        if(y+1 < limitY && matrix[x][y+1] != WALL && matrix[x][y+1] != VISITED) {
            queue.add(new Integer[]{x,y+1});
        }
        //Down
        if(x+1 < limitX && matrix[x+1][y] != WALL && matrix[x+1][y] != VISITED) {
            queue.add(new Integer[]{x+1,y});
        }
        //Left
        if(y-1 >= 0 && matrix[x][y-1] != WALL && matrix[x][y-1] != VISITED) {
            queue.add(new Integer[]{x,y-1});
        }
        //Up
        if(x-1 >= 0 && matrix[x-1][y] != WALL && matrix[x-1][y] != VISITED) {
            queue.add(new Integer[]{x-1,y});
        }

        return queue;
    }*/

    public List<Integer[]> searchForTarget(final int[][] matrix) {
        int[][] matrixCopy = getCopy(matrix);

        //First we lookup for the target element and his parent
        Element element = getTargetElement(matrix);
        System.out.println("Element: " + element);

        return null;
    }

    public Element getTargetElement(int[][] matrix) {
        Queue<Element> currentBoundaries = getElementBoundaries(matrix, 0, 0);
        Element element = null;
        int cont = 0;

        while (!currentBoundaries.isEmpty()) {
            element = currentBoundaries.poll();

            if(matrix[element.x][element.y] == TARGET) {
                System.out.println("Cont: " + cont);
                break;
            }

            cont++;
            matrix[element.x][element.y] = VISITED;
            currentBoundaries.addAll(getElementBoundaries(matrix, element.x, element.y));
        }

        return element;
    }

    public void printElementsBSF(int[][] matrix) {
        Queue<Element> currentBoundaries = getElementBoundaries(matrix, 0, 0);

        while (!currentBoundaries.isEmpty()) {
            Element element = currentBoundaries.poll();

            System.out.println("["+element.x+","+element.y+"] Parent: "+element.parent);
            matrix[element.x][element.y] = VISITED;
            currentBoundaries.addAll(getElementBoundaries(matrix, element.x, element.y));
        }
    }

    public List<Element> getMatrixElements(int[][] matrix) {
        Queue<Element> currentBoundaries = getElementBoundaries(matrix, 0, 0);
        List<Element> elements = new ArrayList<>();

        while (!currentBoundaries.isEmpty()) {
            Element element = currentBoundaries.poll();
            elements.add(element);

            matrix[element.x][element.y] = VISITED;
            currentBoundaries.addAll(getElementBoundaries(matrix, element.x, element.y));
        }

        return elements;
    }

    private Queue<Element> getElementBoundaries(int[][] matrix, int x, int y) {
        Queue<Element> queue = new LinkedList<>();

        int limitX = matrix.length;
        int limitY = matrix[x].length;

        //Right
        if(y+1 < limitY && matrix[x][y+1] != WALL && matrix[x][y+1] != VISITED) {
            queue.add(new Element(x, y+1, new Parent(x, y)));
        }
        //Down
        if(x+1 < limitX && matrix[x+1][y] != WALL && matrix[x+1][y] != VISITED) {
            queue.add(new Element(x+1, y, new Parent(x, y)));
        }
        //Left
        if(y-1 >= 0 && matrix[x][y-1] != WALL && matrix[x][y-1] != VISITED) {
            queue.add(new Element(x, y-1, new Parent(x, y)));
        }
        //Up
        if(x-1 >= 0 && matrix[x-1][y] != WALL && matrix[x-1][y] != VISITED) {
            queue.add(new Element(x-1, y, new Parent(x, y)));
        }

        return queue;
    }

    public static void printMatrix(int[][] matrix, String arg) {
        System.out.println(arg);
        System.out.println("------------------------------------------");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    public static void printMatrix(int[][] matrix) {
        System.out.println("------------------------------------------");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println("");
    }

    public int[][] getCopy(int[][] matrix) {
        int[][] matrixCopy = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrixCopy[i][j] = matrix[i][j];
            }
        }

        return matrixCopy;
    }
}

class Element {
    int x;
    int y;
    Parent parent;

    public Element(int x, int y, Parent parent) {
        this.x = x;
        this.y = y;
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "Element{" +
                "x=" + x +
                ", y=" + y +
                ", parent=" + parent +
                '}';
    }
}

class Parent {
    int x;
    int y;

    public Parent(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        Parent p1 = this;
        Parent p2 = (Parent) obj;

        return p1.x == p2.x && p1.y == p2.y;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}