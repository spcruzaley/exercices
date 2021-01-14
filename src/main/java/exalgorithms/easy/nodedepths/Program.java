package exalgorithms.easy.nodedepths;

class Program {

    public static int cont = 0;

    public static void main(String[] args) {
        System.out.println("Result: " + nodeDepths(buildBinaryTree()));
    }

    public static int nodeDepths(BinaryTree root) {
        return nodeDepths(root, 0);
    }

    public static int nodeDepths(BinaryTree root, int depth) {
        if(root == null)
            return 0;

        int left = nodeDepths(root.left, depth+1);
        int right = nodeDepths(root.right, depth+1);

        System.out.println("Node: " + root.value + " - Depth: " + depth + " - Left: " + left + " - Right: " + right);

        return depth + left + right; //nodeDepths(null, depth+1);
    }

    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;
        public boolean visited;

        public BinaryTree(int value) {
            this.value = value;
            left = null;
            right = null;
        }
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

        node4.left = node8;
        node4.right = node9;

        node2.left = node4;
        node2.right = node5;

        node3.left = node6;
        node3.right = node7;

        rootNode.left = node2;
        rootNode.right = node3;

        return rootNode;
    }

}
