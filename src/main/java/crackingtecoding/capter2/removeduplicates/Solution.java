package crackingtecoding.capter2.removeduplicates;

import utils.Node;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Node node = new Node(9);
        node.add(5);
        node.add(4);
        node.add(2);
        node.add(4);
        node.add(2);
        node.add(5);
        node.add(8);
        node.add(1);

        Objects.toString(node, "");

        System.out.println(node);
        removeDuplicates(node);
        System.out.println(node);
    }

    public static void removeDuplicates(Node list) {
        Set<Integer> set = new HashSet<>();
        Node nodeWithoutDuplicates = list;

        while (nodeWithoutDuplicates != null) {
            int current = nodeWithoutDuplicates.peek();
            if(!set.contains(current)) {
                set.add(current);
            } else {
                list.remove(current);
            }
            nodeWithoutDuplicates = nodeWithoutDuplicates.next();
        }
    }

}
