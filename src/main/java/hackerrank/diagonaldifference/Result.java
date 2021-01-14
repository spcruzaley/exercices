package hackerrank.diagonaldifference;

import java.util.List;

public class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     * URL https://www.hackerrank.com/challenges/diagonal-difference/problem
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        int ltr = fromLeftToRight(arr, 0, arr.size());
        int rtl = fromRightToLeft(arr, 0, arr.size());
        log("Left to right: " + ltr);
        log("Right to left: " + rtl);
        int result = ltr - rtl;
        return result * Integer.signum(result);
    }

    static private int fromLeftToRight(List<List<Integer>> list, int index, int size) {
        if(index < size) {
            return list.get(index).get(index) + fromLeftToRight(list, ++index, size);
        }

        return 0;
    }

    static private int fromRightToLeft(List<List<Integer>> list, int index, int size) {
        if(index < size) {
            return list.get(index).get(size - index - 1) + fromRightToLeft(list, ++index, size);
        }

        return 0;
    }

    static private void log(String string) {
        System.out.println(string);
    }

}
