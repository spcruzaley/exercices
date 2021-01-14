package challenges.unknow;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import utils.Misc;

import java.util.ArrayList;
import java.util.List;

public class SolutionTest {

    public Graph graph;

    @Before
    public void init() {
        graph = new Graph();
        List<Node> nodesList = new ArrayList<>();

        Node nodeA = new Node('A');
        Node nodeB = new Node('B');
        Node nodeC = new Node('C');
        Node nodeD = new Node('D');
        Node nodeE = new Node('E');

        //Node A and his connections
        Edge edgeAB = new Edge(nodeA, nodeB, 6);
        Edge edgeAE = new Edge(nodeA, nodeE, 4);

        List<Edge> listEdgesNodeA = new ArrayList<>();
        listEdgesNodeA.add(edgeAB);
        listEdgesNodeA.add(edgeAE);
        nodeA.edgeList = listEdgesNodeA;

        //Node B and his connections
        Edge edgeBA = new Edge(nodeB, nodeA, 6);
        Edge edgeBC = new Edge(nodeB, nodeC, 2);
        Edge edgeBD = new Edge(nodeB, nodeD, 4);

        List<Edge> listEdgesNodeB = new ArrayList<>();
        listEdgesNodeB.add(edgeBA);
        listEdgesNodeB.add(edgeBC);
        listEdgesNodeB.add(edgeBD);
        nodeB.edgeList = listEdgesNodeB;

        //Node C and his connections
        Edge edgeCB = new Edge(nodeC, nodeB, 3);
        Edge edgeCD = new Edge(nodeC, nodeD, 1);
        Edge edgeCE = new Edge(nodeC, nodeE, 7);

        List<Edge> listEdgesNodeC = new ArrayList<>();
        listEdgesNodeC.add(edgeCB);
        listEdgesNodeC.add(edgeCD);
        listEdgesNodeC.add(edgeCE);
        nodeC.edgeList = listEdgesNodeC;

        //Node D and his connections
        Edge edgeDB = new Edge(nodeD, nodeB, 8);

        List<Edge> listEdgesNodeD = new ArrayList<>();
        listEdgesNodeD.add(edgeDB);
        nodeD.edgeList = listEdgesNodeD;

        //Node E and his connections
        Edge edgeED = new Edge(nodeE, nodeD, 7);
        Edge edgeEB = new Edge(nodeE, nodeB, 5);

        List<Edge> listEdgesNodeE = new ArrayList<>();
        listEdgesNodeE.add(edgeED);
        listEdgesNodeE.add(edgeEB);
        nodeE.edgeList = listEdgesNodeE;

        graph.nodeList.add(nodeA);
        graph.nodeList.add(nodeB);
        graph.nodeList.add(nodeC);
        graph.nodeList.add(nodeD);
        graph.nodeList.add(nodeE);
    }

    @Test
    public void printGraphInfo() {
        System.out.println(graph.toString());
    }

    @Test
    public void testGetAndSpecificNode() {
        Character expectedCharacter = new Character('A');

        Node actualNode = graph.getNode('A');

        Assert.assertNotNull(actualNode);
        Assert.assertEquals(actualNode.character, expectedCharacter);
    }

    @Test
    public void getDistanceABCTest() {
        int expectedDistance = 9;

        String input = "ABC";
        int actualDistance = graph.getDistance(input);

        Assert.assertEquals(expectedDistance, actualDistance);
    }

    @Test
    public void getDistanceADTest() {
        int expectedDistance = 5;

        String input = "AD";
        int actualDistance = graph.getDistance(input);

        Assert.assertEquals(expectedDistance, actualDistance);
    }

    @Test
    public void getDistanceADCTest() {
        int expectedDistance = 15;

        String input = "ADC";
        int actualDistance = graph.getDistance(input);

        Assert.assertEquals(expectedDistance, actualDistance);
    }

    @Test
    public void getDistanceAEBCDTest() {
        int expectedDistance = 22;

        String input = "AEBCD";
        int actualDistance = graph.getDistance(input);

        Assert.assertEquals(expectedDistance, actualDistance);
    }

    @Test
    public void getDistanceAEDTest() {
        int expectedDistance = 0;

        String input = "AED";
        int actualDistance = graph.getDistance(input);

        Assert.assertEquals(expectedDistance, actualDistance);
    }

}
