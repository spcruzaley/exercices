package tusharroy.binarytree;

import org.junit.Assert;
import org.junit.Test;
import utils.TreeNode;

public class ValidBinarySearchTreeTest {

    @Test
    public void testIsValidBSTWhenValid() {
        TreeNode node = generateValidBST();

        ValidBinarySearchTree validBinarySearchTree = new ValidBinarySearchTree();
        boolean actualValid = validBinarySearchTree.isValidBST(node);

        Assert.assertTrue(actualValid);
    }

    @Test
    public void testIsValidBSTWhenInvalid() {
        TreeNode node = generateInvalidBST();

        ValidBinarySearchTree validBinarySearchTree = new ValidBinarySearchTree();
        boolean actualValid = validBinarySearchTree.isValidBST(node);

        Assert.assertFalse(actualValid);
    }

    private TreeNode generateValidBST() {
        TreeNode node = new TreeNode(10);
        node.left = new TreeNode(-10);
        node.left.left = new TreeNode(-20);
        node.left.right = new TreeNode(0);

        node.right = new TreeNode(19);
        node.right.left = new TreeNode(17);

        return node;
    }

    private TreeNode generateInvalidBST() {
        TreeNode node = new TreeNode(10);
        node.left = new TreeNode(0);
        node.left.left = new TreeNode(-1);
        node.left.right = new TreeNode(21);

        node.right = new TreeNode(25);
        node.right.left = new TreeNode(16);
        node.right.right = new TreeNode(32);

        return node;
    }

}
