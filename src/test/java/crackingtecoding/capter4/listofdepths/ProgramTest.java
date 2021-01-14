package crackingtecoding.capter4.listofdepths;

import crackingtecoding.capter4.Node;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class ProgramTest {

    @Test
    public void testCreateList() {
        Node node = generateTree();
        int expectedSize = 3;
        List<Integer[]> expectedValues = new ArrayList<>();
        expectedValues.add(new Integer[]{1});
        expectedValues.add(new Integer[]{2, 3});
        expectedValues.add(new Integer[]{4, 5, 6, 7});

        Program program = new Program();
        List<LinkedList<Node>> actualLists = program.createList(node);
        int actualSize = actualLists.size();
        List<Integer[]> actualValues = new ArrayList<>();
        for (LinkedList<Node> list: actualLists) {
            LinkedList<Node> l = list;
            Integer[] ints = new Integer[l.size()];

            for (int i = 0; i < l.size(); i++) {
                ints[i] = l.get(i).value;
            }
            actualValues.add(ints);
        }

        Assert.assertEquals(expectedSize, actualSize);
        for (int i = 0; i < expectedSize; i++) {
            Assert.assertEquals(Arrays.toString(expectedValues.get(i)), Arrays.toString(actualValues.get(i)));
        }
    }

    @Test
    public void testPrintLevels() {
        Node root = generateTree();

        Program program = new Program();
        program.printLevels(root);
    }

    private Node generateTree() {
        Node node = new Node(1);

        node.left = new Node(2);
        node.left.left = new Node(4);
        node.left.right = new Node(5);

        node.right = new Node(3);
        node.right.left = new Node(6);
        node.right.right = new Node(7);

        return node;
    }

}
