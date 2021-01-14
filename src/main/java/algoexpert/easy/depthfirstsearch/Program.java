package algoexpert.easy.depthfirstsearch;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        Node node = buildTree();
        List<String> list = node.depthFirstSearch(new ArrayList<>());

        System.out.println(list.toString());
    }

    // Do not edit the class below except
    // for the depthFirstSearch method.
    // Feel free to add new properties
    // and methods to the class.
    static class Node {
        String name;
        List<Node> children = new ArrayList<Node>();

        public Node(String name) {
            this.name = name;
        }

        public List<String> depthFirstSearch(List<String> array) {
            // Write your code here.
            Node root = this;
            DFS(root, array);

            return array;
        }

        private void DFS(Node root, List<String> array) {
            if(root == null)
                return;

            array.add(root.name);
            for (int i = 0; i < root.children.size(); i++) {
                DFS(root.children.get(i), array);
            }
        }

        public Node addChild(String name) {
            Node child = new Node(name);
            children.add(child);
            return this;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "name='" + name + '\'' +
                    ", children=" + children +
                    '}';
        }
    }

    public static Node buildTree() {
        Node root = new Node("A");
        root.addChild("B");
        root.addChild("C");
        root.addChild("D");

        root.children.get(0).addChild("E");
        root.children.get(0).addChild("F");

        root.children.get(2).addChild("G");
        root.children.get(2).addChild("H");

        root.children.get(0).children.get(1).addChild("I");
        root.children.get(0).children.get(1).addChild("J");

        root.children.get(2).children.get(0).addChild("K");

        return root;
    }

}
