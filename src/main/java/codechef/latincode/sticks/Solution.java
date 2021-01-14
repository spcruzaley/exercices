package codechef.latincode.sticks;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        int[] ar = new int[]{1,2,3,3,6,8,3,8,2,0};
        System.out.println(getCoincidences(ar));

        Integer.sum(2, 2);
    }

    /*static int getCoincidences(int[] ar, int index, int current) {
        if(index < ar.length) {
            if(current != ar[index]) {
                return 1 + getCoincidences(ar, ++index, ar[index-1]);
            }
            return getCoincidences(ar, ++index, ar[index-1]);
        }
        return 0;
    }*/

    private static int getCoincidences(int[] arr) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0)
                set.add(arr[i]);
        }
        return set.size();
    }

}
