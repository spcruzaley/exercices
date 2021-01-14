package crackingtecoding.capter4;

public class Node {
    public Node left;
    public Node right;
    public Integer value;

    public Node(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "left=" + left +
                ", right=" + right +
                ", value=" + value +
                '}';
    }
}
