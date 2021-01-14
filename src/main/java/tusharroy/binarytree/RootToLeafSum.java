package tusharroy.binarytree;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class RootToLeafSum {

    /**
     * Search the path in a binary tree that can give the given sum
     * @return
     */
    public List<Integer> getPathForSum(TreeNode node, int sum) {
        List<Integer> list = new ArrayList<>();
        getPathForSum(node, sum, list);

        return list;
    }

    private boolean getPathForSum(TreeNode node, int sum, List<Integer> list) {
        if(node == null)
            return false;

        //Validate if the current node its a leaf
        if(node.left == null && node.right == null) {
            if(node.val == sum) {
                list.add(node.val);
                return true;
            } else {
                return false;
            }
        }

        if(getPathForSum(node.left, sum - node.val, list)) {
            list.add(node.val);
            return true;
        }
        if(getPathForSum(node.right, sum - node.val, list)) {
            list.add(node.val);
            return true;
        }

        return false;
    }

}
