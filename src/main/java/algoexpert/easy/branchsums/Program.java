package algoexpert.easy.branchsums;

import java.util.ArrayList;
import java.util.List;

class Program {
    // This is the class of the input root. Do not edit it.
    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {
        List<Integer> list = branchSums(buildBinaryTree());
        System.out.println("List: " + list.toString());
    }

    public static List<Integer> branchSums(BinaryTree root) {
        List<Integer> list = new ArrayList<>();
        branchSums(root, 0, list);

        return list;
    }

    public static void branchSums(BinaryTree root, int sum, List<Integer> list) {
        if(root == null)
            return;

        sum += root.value;
        branchSums(root.left, sum, list);
        branchSums(root.right, sum, list);

        if(root.left == null && root.right == null)
            list.add(sum);
    }

    public static BinaryTree buildBinaryTree() {
        BinaryTree rootNode = new BinaryTree(1);

        BinaryTree node2 = new BinaryTree(2);
        BinaryTree node3 = new BinaryTree(3);
        BinaryTree node4 = new BinaryTree(4);
        BinaryTree node5 = new BinaryTree(5);
        BinaryTree node6 = new BinaryTree(6);
        BinaryTree node7 = new BinaryTree(7);
        BinaryTree node8 = new BinaryTree(8);
        BinaryTree node9 = new BinaryTree(9);
        BinaryTree node10 = new BinaryTree(10);

        node4.left = node8;
        node4.right = node9;

        node5.left = node10;

        node2.left = node4;
        node2.right = node5;

        node3.left = node6;
        node3.right = node7;

        rootNode.left = node2;
        rootNode.right = node3;

        return rootNode;
    }
}
