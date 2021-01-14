package tusharroy.binarytree;

import org.junit.Assert;
import org.junit.Test;
import utils.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RootToLeafSumTest {

    @Test
    public void testGetPathForSum() {
        List<Integer> expectedPath = getPath();

        TreeNode node = generateTreeNode();
        RootToLeafSum rootToLeafSum = new RootToLeafSum();
        List<Integer> actualPath = rootToLeafSum.getPathForSum(node, 10);
        Collections.sort(actualPath);

        Assert.assertEquals(expectedPath.size(), actualPath.size());
        Assert.assertArrayEquals(expectedPath.toArray(), actualPath.toArray());
    }

    private List<Integer> getPath() {
        List<Integer> path = new ArrayList<>();
        path.add(1);
        path.add(3);
        path.add(6);

        return path;
    }

    private TreeNode generateTreeNode() {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.left.left = new TreeNode(4);
        node.left.right = new TreeNode(5);
        node.right = new TreeNode(3);
        node.right.left = new TreeNode(6);

        return node;
    }

}
