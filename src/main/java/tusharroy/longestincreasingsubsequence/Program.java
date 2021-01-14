package tusharroy.longestincreasingsubsequence;

import java.util.Arrays;

public class Program {

    public static void main(String[] args) {
        //int[] arr = new int[]{3,4,-1,0,6,2,3};
        int[] arr = new int[]{3,4,-1,0,6,2,1};

        int max = longestSubsequence(arr);
        System.out.println("Max: " + max);
    }

    public static int longestSubsequence(int[] arr) {
        int[] longestArray = createArrayCopy(arr.length);

        for (int i = 1;i < arr.length; i++) {
            int next = arr[i];
            for (int j = 0; j < i; j++) {
                int current = arr[j];

                if(current < next) {
                    if(longestArray[j] <= longestArray[i]) {
                        longestArray[i] = longestArray[j] + 1;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(longestArray));

        return getIndexForMaxValue(longestArray);
    }

    private static int getIndexForMaxValue(int[] longestArray) {
        return getIndexForMaxValue(longestArray, 0, longestArray[0]);
    }

    private static int getIndexForMaxValue(int[] longestArray, int index, int max) {
        if(index == longestArray.length)
            return max;

        return getIndexForMaxValue(longestArray, index + 1, Math.max(longestArray[index], longestArray[max]));
    }

    private static int[] createArrayCopy(int length) {
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = 1;
        }

        return array;
    }



}
