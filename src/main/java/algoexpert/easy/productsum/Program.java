package algoexpert.easy.productsum;

import java.util.ArrayList;
import java.util.List;

class Program {

    public static void main(String[] args) {
        // BuildList sum will return 21
        List<Object> list = buildList();
        System.out.println(productSum(list));
    }

    // Tip: You can use `element instanceof ArrayList` to check whether an item
    // is an array or an integer.
    public static int productSum(List<Object> array) {
        return productSum(array, 2);
    }

    public static int productSum(List<Object> array, int multiple) {
        // Write your code here.
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

    /*public static int productSum(List<Object> array) {
        // Write your code here.
        int sum = 0;
        for(Object obj: array) {
            if(obj instanceof Integer) {
                sum += (Integer)obj;
            } else {
                System.out.println("List - sum " + sum);
                sum += productSum((List)obj);
            }
        }

        return sum;
    }*/

    private static List<Object> buildList() {
        List<Object> rootList = new ArrayList<>();
        rootList.add(5);
        rootList.add(2);

        List<Object> subList = new ArrayList<>();
        subList.add(7);
        subList.add(-1);
        rootList.add(subList);

        rootList.add(3);

        subList = new ArrayList<>();
        subList.add(6);
        List<Integer> subList2 = new ArrayList<>();
        subList2.add(-13);
        subList2.add(8);
        subList.add(subList2);
        subList.add(4);
        rootList.add(subList);

        return rootList;
    }
}