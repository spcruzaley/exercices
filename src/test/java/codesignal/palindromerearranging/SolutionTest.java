package codesignal.palindromerearranging;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testPalindromeRearrangingWithTrue() {
        Solution solution = new Solution();
        String s = "ddcc";

        Assert.assertTrue(solution.palindromeRearranging(s));
    }

    @Test
    public void testPalindromeRearrangingWithFalse() {
        Solution solution = new Solution();
        String s = "ddccax";

        Assert.assertFalse(solution.palindromeRearranging(s));
    }

}
