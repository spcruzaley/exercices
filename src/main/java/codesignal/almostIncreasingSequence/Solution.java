package codesignal.almostIncreasingSequence;

import java.util.Arrays;

public class Solution {

    static int elementsRemoved = 0;

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 1, 2};
        boolean solution = almostIncreasingSequence(nums);
        System.out.println("Solution: " + solution);
    }

    static boolean almostIncreasingSequence(int[] sequence) {
        if(sequence.length == 1 || sequence.length == 2) return true;

        int nextToValidate = getNumToValidate(new int[]{sequence[0], sequence[1]});

        for(int i = 2; i < sequence.length; i++) {
            nextToValidate = getNumToValidate(new int[]{nextToValidate, sequence[i]});
            if(elementsRemoved > 1) return false;
        }

        return true;
    }

    static int[] validateThree(int[] elements) {
        System.out.println(Arrays.toString(elements));
        if(elements[0] < elements[1]) {
            if(elements[1] < elements[2]) {
                return new int[]{elements[0], elements[1]};
            } else {
                elementsRemoved++;
                return new int[]{elements[1], elements[2]};
            }
        } else if(elements[1] < elements[2]) {
            elementsRemoved++;
            return new int[]{elements[1], elements[2]};
        }

        return new int[0];
    }

    static int getNumToValidate(int[] elements) {
        System.out.println(Arrays.toString(elements));
        if(elements[0] < elements[1]) {
            return elements[1];
        } else {
            elementsRemoved++;
            return elements[0];
        }
    }

}
