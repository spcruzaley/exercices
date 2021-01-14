package algoexpert.medium;

import java.util.Arrays;

public class SmallestDifference {

    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        // Write your code here.
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);

        int pA = 0;
        int pB = 0;
        int min = Integer.MAX_VALUE;
        int[] minPair = new int[2];

        while(pA < arrayOne.length && pB < arrayTwo.length) {
            int vA = arrayOne[pA];
            int vB = arrayTwo[pB];

            if(vA == vB)
                return new int[]{vA, vB};

            int sum = getSum(vA, vB);
            if(sum < min) {
                min = sum;
                minPair[0] = vA;
                minPair[1] = vB;
            }

            if(vA < vB) {
                pA++;
            } else {
                pB++;
            }
        }

        return minPair;
    }

    public static int getSum(int a, int b) {
        if(a < 0 && b < 0) {
            a *= -1;
            b *= -1;
            return Math.max(a, b)-Math.min(a, b);
        }

        return Math.max(a, b)-Math.min(a, b);
    }

}
