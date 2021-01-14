package misc.minimalroute;

import misc.ContainCommonElements;
import org.junit.Assert;
import org.junit.Test;

public class ContainCommonElementsTest {

    @Test
    public void testIterativeMethodWithCommonChar() {
        char[] array1 = new char[]{'a','d','c'};
        char[] array2 = new char[]{'v','w', 'g', 'q', 'd'};

        boolean actualResult = ContainCommonElements.containElementsIterative(array1, array2);

        Assert.assertTrue(actualResult);
    }

    @Test
    public void testIterativeMethodWithOutCommonChar() {
        char[] array1 = new char[]{'a','d','c'};
        char[] array2 = new char[]{'v','w', 'g', 'q', 'r'};

        boolean actualResult = ContainCommonElements.containElementsIterative(array1, array2);

        Assert.assertFalse(actualResult);
    }

    @Test
    public void testRecursiveMethodWithCommonChar() {
        char[] array1 = new char[]{'a','d','c'};
        char[] array2 = new char[]{'v','w', 'g', 'q', 'd'};

        boolean actualResult = ContainCommonElements.containElementsRecursive(array1, array2);

        Assert.assertTrue(actualResult);
    }

    @Test
    public void testRecursiveMethodWithOutCommonChar() {
        char[] array1 = new char[]{'a','d','c'};
        char[] array2 = new char[]{'v','w', 'g', 'q', 'r'};

        boolean actualResult = ContainCommonElements.containElementsRecursive(array1, array2);

        Assert.assertFalse(actualResult);
    }

}
