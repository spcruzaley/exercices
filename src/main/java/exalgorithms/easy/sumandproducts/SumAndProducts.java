package exalgorithms.easy.sumandproducts;

import java.util.List;

class SumAndProducts {

    //Time complexity O(n) - Where n is the array length, we need to traverse all the elements
    //Space complexity O(d) - Where d is the greatest depth that we have in nested arrays in the array
    public static int productSum(List<Object> array) {
        return productSum(array, 2);
    }

    private static int productSum(List<Object> array, int multiple) {
        int sum = 0;
        for(Object obj: array) {
            if(obj instanceof Integer) {
                sum += (Integer)obj;
            } else {
                sum += (multiple * productSum((List)obj, multiple + 1));
            }
        }

        return sum;
    }

}