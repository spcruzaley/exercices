package adventofcode.daythree;

import org.junit.Assert;
import org.junit.Test;

public class TestSolution {

    @Test
    public void testGetNextColumIndexAtSameRow() {
        //Supose a matrix 3*3 with steps by 2
        int numOfColums = 3;
        int steps = 2;

        Solution solution = new Solution();
        Coordinates coordinatesA = solution.getNextIndexes(0, numOfColums, steps);
        Coordinates coordinatesB = solution.getNextIndexes(1, numOfColums, steps);
        Coordinates coordinatesC = solution.getNextIndexes(2, numOfColums, steps);

        Assert.assertEquals(2, coordinatesA.getY().intValue());
        Assert.assertEquals(0, coordinatesA.getX().intValue());

        Assert.assertEquals(0, coordinatesB.getY().intValue());
        Assert.assertEquals(1, coordinatesB.getX().intValue());

        Assert.assertEquals(1, coordinatesC.getY().intValue());
        Assert.assertEquals(1, coordinatesC.getX().intValue());
    }

}
