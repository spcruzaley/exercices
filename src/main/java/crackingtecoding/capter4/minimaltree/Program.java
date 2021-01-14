package crackingtecoding.capter4.minimaltree;

import crackingtecoding.capter4.Node;

/**
 *
 */
public class Program {

    public Node createBinaryTree(int[] array) {
        return createBinaryTree(array, 0, array.length-1);
    }

    public Node createBinaryTree(int[] array, int start, int end) {
        if(end < start)
            return null;

        int middle = (start+end)/2;
        Node node = new Node(array[middle]);
        node.left = createBinaryTree(array, start, middle-1);
        node.right = createBinaryTree(array, middle+1, end);

        return node;
    }

}
