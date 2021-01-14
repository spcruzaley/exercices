package exalgorithms.medium;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ThreeNumberSumTest {

    @Test
    public void testMethod() {
        //{"array": [12, 3, 1, 2, -6, 5, -8, 6], "targetSum": 0}
        int[] array = new int[]{12, 3, 1, 2, -6, 5, -8, 6};
        int targetSum = 0;

        List<Integer[]> list = ThreeNumberSum.threeNumberSum(array, targetSum);
        for (Integer[] i : list) {
            System.out.println(Arrays.toString(i));
        }
    }

    @Test
    public void testCaseTwo() {
        int[] array = new int[]{1,2,3};
        int targetSum = 6;

        List<Integer[]> list = ThreeNumberSum.threeNumberSum(array, targetSum);
        for (Integer[] i : list) {
            System.out.println(Arrays.toString(i));
        }
    }

    @Test
    public void testCaseThree() {
        int[] array = new int[]{12, 3, 1, 2, -6, 5, 0, -8, -1};
        int targetSum = 0;

        List<Integer[]> list = ThreeNumberSum.threeNumberSum(array, targetSum);
        for (Integer[] i : list) {
            System.out.println(Arrays.toString(i));
        }
    }

}
