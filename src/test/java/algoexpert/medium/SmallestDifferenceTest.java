package algoexpert.medium;

import org.junit.Assert;
import org.junit.Test;

public class SmallestDifferenceTest {

    @Test
    public void testMethod() {
        int[] expectedArray = new int[]{28, 26};

        int[] a = new int[]{-1,5,10,20,28,3};
        int[] b = new int[]{26,134,135,15,17};
        int[] actualArray = SmallestDifference.smallestDifference(a, b);

        Assert.assertEquals(expectedArray[0], actualArray[0]);
        Assert.assertEquals(expectedArray[1], actualArray[1]);
    }

    @Test
    public void testSumTwoNegatives() {
        int expectedTwoNegatives = 3;

        int actualTwoNegatives = SmallestDifference.getSum(-2, -5);

        Assert.assertEquals(expectedTwoNegatives, actualTwoNegatives);
    }

    @Test
    public void testSumFirstNegative() {
        int expectedFirstNegative = 7;

        int actualFirstNegative = SmallestDifference.getSum(-2, 5);

        Assert.assertEquals(expectedFirstNegative, actualFirstNegative);
    }

    @Test
    public void testSumSecondNegative() {
        int expectedSecondNegative = 6;

        int actualSecondNegative = SmallestDifference.getSum(5, -1);

        Assert.assertEquals(expectedSecondNegative, actualSecondNegative);
    }

    @Test
    public void testSumTwoPositives() {
        int expectedTwoPositives = 2;

        int actualTwoPositives = SmallestDifference.getSum(5, 3);

        Assert.assertEquals(expectedTwoPositives, actualTwoPositives);
    }

}
