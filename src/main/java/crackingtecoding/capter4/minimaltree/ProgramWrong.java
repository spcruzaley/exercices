package crackingtecoding.capter4.minimaltree;

import crackingtecoding.capter4.Node;

import java.util.LinkedList;
import java.util.Queue;

public class ProgramWrong {

    public Node createBinaryTree(int[] array) {
        if(array.length == 0) return null;
        if(array.length == 1) return new Node(array[0]);

        int i = 0;
        Node root = new Node(array[i]);

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        do {
            Node n = q.remove();

            i++;
            if(i < array.length) {
                n.left = new Node(array[i]);
                q.add(n.left);
            }

            i++;
            if(i < array.length) {
                n.right = new Node(array[i]);
                q.add(n.right);
            }
        } while(i < array.length);

        return root;
    }

}

