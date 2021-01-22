package exalgorithms.medium.longestpeak;

import java.util.Stack;

public class LongestPeak {

    public static int longestPeak(int[] array) {
        //Get all peaks
        Stack<Integer> stack = new Stack<>();
        for (int i = 1; i < array.length-1; i++) {
            if(array[i-1] < array[i] && array[i+1] < array[i]) {
                stack.add(i);
            }
        }

        //Get the longest peak
        int max = 0;
        while (!stack.isEmpty()) {
            int counter = 1;
            int pointer = stack.peek();
            int leftPointer = pointer-1;
            int rightPointer = pointer+1;

            while (leftPointer >= 0 && array[leftPointer] < array[pointer]) {
                counter++;
                leftPointer--;
                pointer--;
            }

            pointer = stack.pop();
            while (rightPointer < array.length && array[pointer] > array[rightPointer]) {
                counter++;
                rightPointer++;
                pointer++;
            }

            max = Math.max(max, counter);
        }

        return max;
    }

}
