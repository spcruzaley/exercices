package exalgorithms.easy.sumandproducts;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SumAndProductsTest {

    @Test
    public void testProductSum() {
        int expectedTotal = 53;
        List<Object> list = buildList();

        int actualTotal = SumAndProducts.productSum(list);

        Assert.assertEquals(expectedTotal, actualTotal);
    }

    /**
     * Generates a list like: [[1, 2], 3, [4, 7, [2], 5]]
     * @return
     */
    private static List<Object> buildList() {
        List<Object> subList1 = new ArrayList<>();
        subList1.add(1);
        subList1.add(2);

        List<Object> subList3 = Collections.singletonList(2);

        List<Object> subList2 = new ArrayList<>();
        subList2.add(4);
        subList2.add(7);
        subList2.add(subList3);
        subList2.add(5);

        List<Object> rootList = new ArrayList<>();
        rootList.add(subList1);
        rootList.add(3);
        rootList.add(subList2);

        return rootList;
    }

}
