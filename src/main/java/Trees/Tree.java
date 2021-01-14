package Trees;

import java.util.Arrays;
import java.util.List;

public class Tree {
    Node node = null;

    public static void main(String[] args) {

        Node node = new Node();
        //System.out.println(node.isEmpty());
        //System.out.println(node.isLeave());

        node.insert(3);
        node.insert(7);
        node.insert(1);
        node.insert(20);
        node.insert(5);
        node.insert(10);
        node.insert(2);
        node.insert(4);

        //node.preorder();
        //System.out.println("---------------");
        node.inorder();
        System.out.println("---------------");
        //node.postorder();
        //System.out.println("---------------");
        node.delete(3);
        node.inorder();
        System.out.println("---------------");
    }

    public static void localize(Node node, int index) {
        if(node.exist(index)) {
            System.out.println("Elemento " + index + " existe");
        } else {
            System.out.println("Elemento " + index + " NO existe");
        }
    }

}
