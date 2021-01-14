package exalgorithms.medium;

import java.util.*;

public class ThreeNumberSum {

    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        // Write your code here.
        List<Integer[]> list = new ArrayList<>();
        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            int currentNum = array[i];
            int l = i+1;
            int r = array.length - 1;

            while(l < r) {
                int sum = currentNum + array[l] + array[r];
                if(sum == targetSum) {
                    list.add(new Integer[]{currentNum, array[l], array[r]});
                    l++;
                    r--;
                } else {
                    if(sum < targetSum) {
                        l++;
                    } else {
                        r--;
                    }
                }
            }
        }

        return list;
    }

}
