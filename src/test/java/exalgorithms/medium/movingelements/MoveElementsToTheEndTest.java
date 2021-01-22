package exalgorithms.medium.movingelements;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MoveElementsToTheEndTest {

    @Test
    public void testMoveElementsSolution1() {
        int target = 2;
        int[] inputArray = new int[]{2,1,2,2,2,3,4,2};
        int[] expectedArray = new int[]{1,3,4,2,2,2,2,2};

        int[] actualArray = MoveElementsToTheEnd.solution1(inputArray, target);

        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void testMoveElementsTwoSolution1() {
        int target = 3;
        int[] inputArray = new int[]{2,1,3,2,2,3,4,2};
        int[] expectedArray = new int[]{2,1,2,2,4,2,3,3};

        int[] actualArray = MoveElementsToTheEnd.solution1(inputArray, target);

        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void testMoveElementsSolution2() {
        int target = 2;
        int[] inputArray = new int[]{2,1,2,2,2,3,4,2};
        int[] expectedArray = new int[]{4,1,3,2,2,2,2,2};

        int[] actualArray = MoveElementsToTheEnd.solution2(inputArray, target);

        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void testMoveElementsTwoSolution2() {
        int target = 3;
        int[] inputArray = new int[]{2,1,3,2,2,3,4,2};
        int[] expectedArray = new int[]{2,1,2,2,2,4,3,3};

        int[] actualArray = MoveElementsToTheEnd.solution2(inputArray, target);

        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    //Testing for utils methods
    @Test
    public void testRotationFromIndexZero() {
        int[] expectedOutput = new int[]{2,3,4,1};

        int[] actualInput = new int[]{1,2,3,4};
        MoveElementsToTheEnd.rotation(actualInput, 0);

        Assert.assertArrayEquals(expectedOutput, actualInput);
    }

    @Test
    public void testRotationFromWhateverIndex() {
        int[] expectedOutput = new int[]{1,2,4,5,3};

        int[] actualInput = new int[]{1,2,3,4,5};
        MoveElementsToTheEnd.rotation(actualInput, 2);

        Assert.assertArrayEquals(expectedOutput, actualInput);
    }

    @Test
    public void testGetMaxOccurrences() {
        int expectedOccurrences = 5;
        int[] inputArray = new int[]{2,1,2,2,2,3,4,2};

        int actualOccurrences = MoveElementsToTheEnd.getMaxOccurrences(inputArray, 2, 0, 0);

        Assert.assertEquals(expectedOccurrences, actualOccurrences);
    }

}
