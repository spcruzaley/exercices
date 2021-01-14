package hackerrank.plusminus;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class Result {

    private static DecimalFormat df = new DecimalFormat("0.######");
    private static Map<Integer, Integer> values = new HashMap<>(3);

    public static void main(String[] args) {
        int[] arr = new int[]{1,1,0,-1,-1};
        plusMinus(arr);
    }

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                increaseData(0);
            } else if(arr[i] > 0) {
                increaseData(1);
            } else {
                increaseData(2);
            }
        }
        printData(0, arr.length);
        printData(1, arr.length);
        printData(2, arr.length);
    }

    private static void printData(int index, int length) {
        double data = (double) values.get(index) / (double) length;
        System.out.println(data);
    }

    private static void increaseData(int index) {
        if(values.get(index) != null)
            values.put(index, values.get(index) + 1);
        else
            values.put(index, 1);
    }

}
