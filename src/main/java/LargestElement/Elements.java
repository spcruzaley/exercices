package LargestElement;

import java.util.*;

public class Elements implements Comparator<Integer> {
    public int compare(Integer o1, Integer o2) {
        return (o1 < o2) ? o1 : o2;
    }
}

class Largest {
    public static void main(String[] args) {
        int[] arr = new int[]{12, 5, 787, 1, 23};
        int n = arr.length;
        int k = 2;
        firstApproach(arr, n, k);
    }

    static void firstApproach(int[] arr, int n, int k) {
        int max = arr[0];
        Set<Integer> set = new HashSet<Integer>();

        for (int j = 0; j < k; j++) {
            for (int i = 1; i < n; i++) {
                if(!set.contains(arr[i])) {
                    if(max < arr[i]) {
                        max = arr[i];
                    }
                }
            }
            set.add(max);
            max = arr[0];
        }

        System.out.println(set.toString());
    }
}