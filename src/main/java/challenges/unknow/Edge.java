package challenges.unknow;

public class Edge {
    Node startNode;
    Node endNode;
    Integer distance;

    public Edge(Node startNode, Node endNode, int distance) {
        this.startNode = startNode;
        this.endNode = endNode;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "startNode=" + startNode.character +
                ", endNode=" + endNode.character +
                ", distance=" + distance +
                '}';
    }
}
