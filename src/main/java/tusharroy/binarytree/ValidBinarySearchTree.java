package tusharroy.binarytree;

import utils.TreeNode;

public class ValidBinarySearchTree {

    public boolean isValidBST(TreeNode node) {
        return isValidBST(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public boolean isValidBST(TreeNode node, int min, int max) {
        if(node == null)
            return true;

        if(node.val <= min || node.val >= max)
            return false;

        return isValidBST(node.left, min, node.val) && isValidBST(node.right, node.val, max);
    }
}
