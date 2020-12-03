package codesignal.sumInRange;

import utils.Misc;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        int[][] queries = new int[4][];
        int[] queryOne = new int[]{0,2};
        int[] queryTwo = new int[]{2,5};
        int[] queryThree = new int[]{0,5};
        int[] queryFour = new int[]{2,5};

        queries[0] = queryOne;
        queries[1] = queryTwo;
        queries[2] = queryThree;
        queries[3] = queryFour;

        int[] nums = new int[]{3, 0, -2, 6, -3, 2};

        Solution solution = new Solution();
        System.out.println(solution.sumInRange(nums, queries));
    }

    Map<String, Integer> memorizedData = new Hashtable<>();

    int sumInRange(int[] nums, int[][] queries) {
        int numsArraySummarized[] = fillNumsArray(nums);
        int numQueries = queries.length;
        int sum = 0, temp = 0;

        long start = System.currentTimeMillis();
        System.out.println(start);
        for (int i = 0; i < numQueries; i++) {
            int from = queries[i][0];
            int to = queries[i][1];
            Integer inMemory = getData(from, to);

            if(inMemory != null) {
                sum += inMemory;
            } else {
                if(from == 0) {
                    temp = numsArraySummarized[to];
                    sum += temp;
                } else {
                    temp = numsArraySummarized[to] - numsArraySummarized[from-1];
                    sum += temp;
                }
                memorization(from, to, temp);
            }
        }
        System.out.println("Time: " + (start - System.currentTimeMillis())/1000);

        if(sum <= 0) {
            sum += 1000000007;
        } else {
            sum %= 1000000007;
        }

        return sum;
    }

    private int[] fillNumsArray(int[] nums) {
        int[] numsSummarized = new int[nums.length];
        numsSummarized[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            numsSummarized[i] = numsSummarized[i-1] + nums[i];
        }

        return numsSummarized;
    }

    int sumInRangeOne(int[] nums, int[][] queries) {
        int numQueries = queries.length;
        int sum = 0;
        int temp = 0;

        for(int i = 0; i < numQueries; i++) {
            int from = queries[i][0];
            int to = queries[i][1];
            Integer inMemory = getData(from, to);

            if(inMemory != null) {
                sum += inMemory;
            } else {
                temp = getSumFromRange(from, to, nums);
                sum += temp;
                memorization(from, to, temp);
            }
        }

        if(sum <= 0) {
            sum += 1000000007;
        } else {
            sum %= 1000000007;
        }

        return sum;
    }

    int getSumFromRange(int from, int to, final int arr[]) {
        int sum = 0;
        for(int i = from; i <= to; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public void memorization(int from, int to, int sum) {
        String range = String.valueOf(from).concat(String.valueOf(to));
        memorizedData.put(range, sum);
    }

    public Integer getData(int from, int to) {
        String range = String.valueOf(from).concat(String.valueOf(to));
        return memorizedData.get(range);
    }

    int sumInRangeOld(int[] nums, int[][] queries) {
        int numQueries = queries.length;
        int sum = 0;
        int temp = 0;

        for(int i = 0; i < numQueries; i++) {
            int from = queries[i][0];
            int to = queries[i][1];
            temp = getSumFromRange(from, to, nums);
            sum += temp;
        }

        if(sum <= 0) {
            sum += 1000000007;
        } else {
            sum %= 1000000007;
        }

        return sum;
    }

}
