package exalgorithms.medium.longestpeak;

import org.junit.Assert;
import org.junit.Test;

public class LongestPeakTest {

    @Test
    public void testLongestPeakFirstCase() {
        int[] inputArray = new int[]{1,2,2,4,0,2,3,4,8,6,2,-1,0,5,1};
        int expectedLongest = 8;

        int actualLongest = LongestPeak.longestPeak(inputArray);

        Assert.assertEquals(expectedLongest, actualLongest);
    }

    @Test
    public void testLongestPeakSecondCase() {
        int[] inputArray = new int[]{1,2,3,3,4,0,10,6,5,-1,-3,2,3};
        int expectedLongest = 6;

        int actualLongest = LongestPeak.longestPeak(inputArray);

        Assert.assertEquals(expectedLongest, actualLongest);
    }

}
