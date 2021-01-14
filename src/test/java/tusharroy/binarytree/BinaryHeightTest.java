package tusharroy.binarytree;

import org.junit.Assert;
import org.junit.Test;
import utils.TreeNode;

public class BinaryHeightTest {

    @Test
    public void testGetHeight() {
        int expectedHeight = 5;
        TreeNode node = generateTreeNode();

        BinaryHeight binaryHeight = new BinaryHeight();
        int actualHeight = binaryHeight.getHeight(node);

        Assert.assertEquals(expectedHeight, actualHeight);
    }

    private TreeNode generateTreeNode() {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);

        node.right.left = new TreeNode(7);
        node.right.right = new TreeNode(12);
        node.right.right.right = new TreeNode(1);
        node.right.right.right.right = new TreeNode(6);

        return node;
    }

}
