package crackingtecoding.capter4;

import org.junit.Assert;
import org.junit.Test;

public class CheckBalancedTest {

    @Test
    public void isBalancedAsValid() {
        Node node = generateValidBalancedTree();
        CheckBalanced checkBalanced = new CheckBalanced();
        boolean actualResult = checkBalanced.isBalanced(node);

        Assert.assertTrue(actualResult);
    }

    @Test
    public void isBalancedAsInvalid() {
        Node node = generateInvalidBalancedTree();
        CheckBalanced checkBalanced = new CheckBalanced();
        boolean actualResult = checkBalanced.isBalanced(node);

        Assert.assertFalse(actualResult);
    }

    private Node generateValidBalancedTree() {
        Node node = new Node(1);

        node.left = new Node(2);
        node.left.left = new Node(4);
        node.left.right = new Node(4);
        node.left.right.left = new Node(4);

        node.right = new Node(3);
        node.right.left = new Node(6);
        node.right.right = new Node(7);

        return node;
    }

    private Node generateInvalidBalancedTree() {
        Node node = new Node(1);

        node.left = new Node(2);
        node.left.left = new Node(4);
        node.left.right = new Node(4);
        node.left.right.left = new Node(4);
        node.left.right.left.right = new Node(4);

        node.right = new Node(3);
        node.right.left = new Node(6);
        node.right.right = new Node(7);

        return node;
    }
}
