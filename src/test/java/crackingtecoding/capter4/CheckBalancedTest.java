package crackingtecoding.capter4;

import org.junit.Test;

public class CheckBalancedTest {

    @Test
    public void method() {
        Node node = generateTree();
        CheckBalanced checkBalanced = new CheckBalanced();

        //checkBalanced.isBalanced(node);
        checkBalanced.preorder(node);
    }

    private Node generateTree() {
        Node node = new Node(1);

        node.left = new Node(2);
        node.left.left = new Node(4);
        node.left.right = new Node(7);
        node.left.right.left = new Node(17);
        node.left.right.left.left = new Node(117);
        node.left.left.left = new Node(5);

        node.right = new Node(3);
        node.right.left = new Node(6);
        //node.right.right = new Node(7);

        return node;
    }
}
