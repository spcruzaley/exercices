package challenges.unknow;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    public List<Node> nodeList;

    public Graph() {
        this.nodeList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Graph{" +
                "nodeList=" + nodeList +
                '}';
    }

    public int getDistanceOld(String input) {
        if(input.length() < 2)
            return 0;

        Node rootNode = getNode(input.charAt(0));
        Node targetNode = getNode(input.charAt(1));
        List<Edge> edges = rootNode.edgeList;
        int sumDistance = 0;

        for (Edge edge : edges) {
            Node currentEndNode = edge.endNode;
            if(currentEndNode.character == targetNode.character) {
                sumDistance = edge.distance;
                break;
            }
        }

        return sumDistance + getDistanceOld(input.substring(1));
    }

    public Node getNode(char charAt) {
        for (Node node : nodeList) {
            if(node.character == charAt) {
                return node;
            }
        }

        return null;
    }

    public int getDistance(String input) {
        Node node = getNode(input.charAt(0));
        return getDistance(node, input, 0);
    }

    public int getDistance(Node rootNode, String target, int index) {
        if(rootNode == null)
            return 0;

        List<Edge> edges = rootNode.edgeList;
        int sumDistance = 0;

        for (Edge edge : edges) {
            if(edge.startNode.character == target.charAt(index+1) || edge.endNode.character == target.charAt(index+1)) {
                sumDistance = edge.distance;
            } else {
                sumDistance += getDistance(target.substring(index+1));
            }
        }

        return sumDistance;
    }

    public int DFS(Node rootNode, Character targetCharacter) {
        if(rootNode == null || rootNode.edgeList == null)
            return 0;

        int counting = 0;

        for (Edge edge : rootNode.edgeList) {
            if(edge.startNode.character == targetCharacter) {
                counting = edge.distance;
            } else if(edge.endNode.character == targetCharacter) {
                counting = edge.distance;
            } else {
                counting += edge.distance + DFS(edge.endNode, targetCharacter);
            }
        }

        return counting;
    }

    public Node BFS(Node rootNode, Character targetCharacter, int index) {
        if(rootNode == null || rootNode.edgeList == null || rootNode.edgeList.size() == index)
            return null;

        List<Edge> edges = rootNode.edgeList;
        Edge edge = edges.get(index);

        if(edge.startNode.character == targetCharacter) {
            return edge.startNode;
        } else if(edge.endNode.character == targetCharacter) {
            return edge.endNode;
        } else {
            BFS(rootNode, targetCharacter, index + 1);
        }

        return null;
    }
}
