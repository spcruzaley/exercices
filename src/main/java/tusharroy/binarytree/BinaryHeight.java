package tusharroy.binarytree;

import utils.TreeNode;

public class BinaryHeight {

    public int getHeight(TreeNode node) {
        if(node == null)
            return 0;

        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);

        return 1 + Math.max(leftHeight, rightHeight);
    }

}
