package challenges.unknow;

import java.util.List;

public class Node {
    Character character;
    List<Edge> edgeList;
    boolean visited;

    public Node(char character) {
        this.character = character;
    }

    @Override
    public String toString() {
        return "Node{" +
                "character=" + character +
                ", edgeList=" + edgeList +
                '}';
    }
}
