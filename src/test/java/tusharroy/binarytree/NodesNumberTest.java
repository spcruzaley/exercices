package tusharroy.binarytree;

import org.junit.Assert;
import org.junit.Test;
import utils.TreeNode;

public class NodesNumberTest {

    @Test
    public void testGetNodesNumber() {
        int expectedNodes = 6;
        TreeNode node = generateTreeNode();

        NodesNumber nodesNumber = new NodesNumber();
        int actualNodes = nodesNumber.getNodesNumber(node);

        Assert.assertEquals(expectedNodes, actualNodes);
    }

    private TreeNode generateTreeNode() {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.left.left = new TreeNode(4);
        node.left.right = new TreeNode(5);
        node.right = new TreeNode(3);
        node.right.left = new TreeNode(6);

        return node;
    }
}
