package three.zeros;

import java.util.HashSet;

public class ThreeZeros {

    public static void main(String[] args) {
        int[] arr = new int[]{0, -1, 2, -3, 1};
        secondApproach(arr);
    }

    public static void firstApproach(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if(arr[i] + arr[j] + arr[k] == 0)
                        System.out.println("(" + arr[i] + " " + arr[j] + " " + arr[k]+")");
                }
            }
        }
    }

    public static void secondApproach(int[] arr) {
        int x = 0;

        for (int i = 0; i < arr.length; i++) {
            HashSet<Integer> hash = new HashSet<Integer>();
            for (int j = i+1; j < arr.length; j++) {
                x = -(arr[i] + arr[j]);
                if(hash.contains(x)) {
                    System.out.println("(" + x + " " + arr[i] + " " + arr[j] +")");
                } else {
                    hash.add(arr[j]);
                }
            }
        }
    }

    public static void secondApproach2(int[] arr) {
        HashSet<Integer> hash = new HashSet<Integer>();
        int x = 0;

        for (int i = 0; i < arr.length - 1; i++)
        {
            // Find all pairs with sum equals to
            // "-arr[i]"
            HashSet<Integer> s = new HashSet<Integer>();
            for (int j = i + 1; j < arr.length; j++)
            {
                x = -(arr[i] + arr[j]);
                if (s.contains(x))
                {
                    System.out.printf("%d %d %d\n", x, arr[i], arr[j]);
                }
                else
                {
                    s.add(arr[j]);
                }
            }
        }
    }


}
