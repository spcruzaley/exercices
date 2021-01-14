package leetcode.minimumdepthofbinarytree;

import utils.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Solution {

    /**
     * Unfortunately I couldn't solve the problem by my self, I had to check the solution, it was taken from:
     * https://www.geeksforgeeks.org/find-minimum-depth-of-a-binary-tree/
     *
     * @param node
     * @return
     */
    public int minDepth(TreeNode node) {
        if(node == null)
            return 0;

        if(node.left == null && node.right == null)
            return 1;

        if(node.left == null)
            return minDepth(node.right) + 1;
        if(node.right == null)
            return minDepth(node.left) + 1;

        return Math.min(minDepth(node.left), minDepth(node.right)) + 1 ;
    }

}
