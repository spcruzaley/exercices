package hackerrank.MiniMaxSum;

import java.util.SortedSet;
import java.util.TreeSet;

public class Solution {

    public static void main(String[] args) {
        int[] ar = new int[]{10,20,30,40,5,48};
        miniMaxSum(ar);
    }

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        SortedSet<Integer> sortedSet = new TreeSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            sortedSet.add(arr[i]);
        }
        int min = sortedSet.first();
        int max = sortedSet.last();
        long sum = summarize(arr, 0);

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Sum: " + sum);
        System.out.println((sum - max) + " " + (sum - min));
    }

    private static long summarize(int[] arr, int index) {
        if(arr.length == index) return 0;
        return arr[index] + summarize(arr, ++index);
    }

}
