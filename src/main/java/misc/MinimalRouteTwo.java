package misc;

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
public class MinimalRouteTwo {

    public static final Integer USER = 2;
    public static final Integer FLOOR = 0;
    public static final Integer WALL = 1;
    public static final Integer VISITED = 8;
    public static final Integer TARGET = 3;

    private int[][] matrix;

    public MinimalRouteTwo(int[][] matrix) {
        this.matrix = matrix;
        buildGraph();

    }

    private void buildGraph() {
        Graph graph = new Graph();
        graph.addNode(0); //Source
        graph.addNode(1);
        graph.addNode(2);
        graph.addNode(3);
        graph.addNode(4);
        graph.addNode(5);
        graph.addNode(6); //Target
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(2, 5);
        graph.addEdge(4, 5);
        graph.addEdge(5, 100);

        graph.printGraph();
    }
}

class Graph {
    List<List<Integer>> listNodes;
    Integer value;

    public Graph() {
        this.listNodes = new ArrayList<>();
    }

    public void addNode(Integer node) {
        List<Integer> list = new ArrayList<>();
        list.add(node);

        listNodes.add(list);
    }

    public void addEdge(int nodeA, int nodeB) {
        listNodes.get(nodeA).add(nodeB);
        listNodes.get(nodeB).add(nodeA);
    }

    public void printGraph() {
        for (List<Integer> list: listNodes){
            System.out.println(list.toString());
        }
    }
}

class Node {
    Integer node;

    public Node(Integer node) {
        this.node = node;
    }
}

class CustomList <T> {

    List<T> list;

    public void add(T list) {

    }
}