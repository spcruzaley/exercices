package leetcode.minimumdepthofbinarytree;

import org.junit.Assert;
import org.junit.Test;
import utils.TreeNode;

public class SolutionTest {

    @Test
    public void testOne() {
        /**
         * [2,null,3,null,4,null,5,null,6]
         * Expected: 5
         */
        TreeNode root = new TreeNode(2, null, new TreeNode(3, null, new TreeNode(4, null,
                new TreeNode(5, null, new TreeNode(6)))));
        int expectedDepth = 5;
        Solution expectedSolution = new Solution();

        int actualDepth = expectedSolution.minDepth(root);

        Assert.assertEquals(expectedDepth, actualDepth);
    }

    @Test
    public void testTwo() {
        /**
         * [3,9,20,null,null,15,7]
         * Expected: 2
         */
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        int expectedDepth = 2;
        Solution expectedSolution = new Solution();

        int actualDepth = expectedSolution.minDepth(root);

        Assert.assertEquals(expectedDepth, actualDepth);
    }

    @Test
    public void testThree() {
        /**
         * [1,2,3,4,5]
         * Expected: 2
         */
        TreeNode root =
                new TreeNode(1,
                new TreeNode(2,
                    new TreeNode(4), new TreeNode(5)),
                new TreeNode(3));
        int expectedDepth = 2;
        Solution expectedSolution = new Solution();

        int actualDepth = expectedSolution.minDepth(root);

        Assert.assertEquals(expectedDepth, actualDepth);
    }

    @Test
    public void testFourth() {
        /**
         * [-9,-3,2,null,4,4,0,-6,null,-5]
         * Expected: 3
         */
        TreeNode root = new TreeNode(-9,
                new TreeNode(-3,
                    null,
                        new TreeNode(4,
                            new TreeNode(-6),
                            null)),
                new TreeNode(2,
                        new TreeNode(4,
                                new TreeNode(-5),
                                null),
                        new TreeNode(0))
        );
        int expectedDepth = 3;
        Solution expectedSolution = new Solution();

        int actualDepth = expectedSolution.minDepth(root);

        Assert.assertEquals(expectedDepth, actualDepth);
    }

    @Test
    public void testFive() {
        /**
         * [0,2,4,1,null,3,-1,5,1,null,6,null,8]
         * Expected: 4
         */
        TreeNode root = new TreeNode(0,
                new TreeNode(2,
                        new TreeNode(1,
                                new TreeNode(5),
                                new TreeNode(1)),
                        null),
                new TreeNode(4,
                        new TreeNode(3,
                                null,
                                new TreeNode(6)),
                        new TreeNode(-1,
                                null,
                                new TreeNode(8))
                )
        );
        int expectedDepth = 4;
        Solution expectedSolution = new Solution();

        int actualDepth = expectedSolution.minDepth(root);

        Assert.assertEquals(expectedDepth, actualDepth);
    }

}
