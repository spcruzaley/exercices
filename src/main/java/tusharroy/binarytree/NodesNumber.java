package tusharroy.binarytree;

import utils.TreeNode;

public class NodesNumber {

    public int getNodesNumber(TreeNode node) {
        if(node == null)
            return 0;

        int leftNode = getNodesNumber(node.left);
        int rightNode = getNodesNumber(node.right);

        return leftNode + rightNode + 1;
    }

}
