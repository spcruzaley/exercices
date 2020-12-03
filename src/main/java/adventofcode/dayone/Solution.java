package adventofcode.dayone;

import utils.Misc;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        //int[] nums = new int[]{1721, 979, 366, 299, 675, 1456};
        int[] nums = Misc.getNumsFromFile("adventofcode/dayone/input");

        //int[] match = getProductFromTwo(nums, 2020);
        int[] match = getProductFromThree(nums, 2020);

        if(match.length > 0)
            System.out.println("Product: " + match[0] * match[1] * match[2]);
    }

    public static int[] getProductFromTwo(int[] nums, int sum) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            int possibleMatch = sum - nums[i];

            if(set.contains(possibleMatch)) {
                return new int[]{possibleMatch, nums[i]};
            } else {
                set.add(nums[i]);
            }
        }

        return new int[0];
    }

    public static int[] getProductFromThree(int[] nums, int sum) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                int possibleMatch_A = sum - nums[i] - nums[j];

                if(set.contains(possibleMatch_A)) {
                    return new int[]{possibleMatch_A, nums[i], nums[j]};
                } else {
                    set.add(nums[i]);
                    set.add(nums[j]);
                }
            }
        }

        return new int[0];
    }

}
