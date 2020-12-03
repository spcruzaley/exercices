package codesignal.makeArrayConsecutive2;

import java.sql.SQLOutput;

public class Solution {

    public static void main(String[] args) {
        int[] nums = new int[]{6, 2, 3, 8};

        System.out.println(makeArrayConsecutive2(nums));
    }

    static int makeArrayConsecutive2(int[] statues) {
        int max = getMax(statues);
        int min = getMin(statues);
        int sizeBinaryArray = max - min + 1;

        int[] binaryArray = new int[sizeBinaryArray];

        for(int i = 0; i < statues.length; i++) {
            binaryArray[statues[i]-min] = 1;
        }

        int numAdditionalStatues = 0;
        for(int i = 0; i < binaryArray.length; i++) {
            if(binaryArray[i] == 0) {
                numAdditionalStatues++;
            }
        }

        return numAdditionalStatues;
    }

    static int getMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Maximum: " + max);
        return max;
    }

    static int getMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Minimum: " + min);
        return min;
    }

}
