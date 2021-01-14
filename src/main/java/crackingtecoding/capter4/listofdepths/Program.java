package crackingtecoding.capter4.listofdepths;

import crackingtecoding.capter4.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Program {

    public List<LinkedList<Node>> createList(Node root) {
        List<LinkedList<Node>> lists = new ArrayList<>();
        createList(root, lists, 0);

        return lists;
    }

    public void createList(Node root, List<LinkedList<Node>> lists, int level) {
        if(root == null)
            return;

        LinkedList<Node> list = null;
        if(lists.size() == level) {
            list = new LinkedList<>();
            list.add(root);
            lists.add(list);
        } else {
            list = lists.get(level);
            list.add(root);
        }

        createList(root.left, lists, level+1);
        createList(root.right, lists, level+1);
    }

    public void printLevels(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        System.out.println(root.value+"-");

        while(!q.isEmpty()) {
            Node n = q.poll();

            if(n.left != null) {
                System.out.print(n.left.value+"-");
                q.add(n.left);
            }
            if(n.right != null) {
                System.out.print(n.right.value+"-");
                q.add(n.right);
            }
            System.out.println("");
        }
    }

}
