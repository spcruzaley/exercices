package misc;

import java.util.Arrays;

public class ContainCommonElements {

    public static boolean containElementsIterative(char[] array1, char[] array2) {
        Arrays.sort(array1);
        Arrays.sort(array2);

        int pA = 0;
        int pB = 0;

        while(pA < array1.length && pB < array2.length) {
            if(array1[pA] == array2[pB]) {
                return true;
            } else if(array1[pA] < array2[pB]) {
                pA++;
            } else {
                pB++;
            }
        }

        return false;
    }

    public static boolean containElementsRecursive(char[] array1, char[] array2) {
        Arrays.sort(array1);
        Arrays.sort(array2);
        return containElementsRecursive(array1, array2, 0, 0);
    }

    public static boolean containElementsRecursive(char[] array1, char[] array2, int pA, int pB) {
        //base case
        if(pA >= array1.length || pB >= array2.length)
            return false;

        if(array1[pA] == array2[pB])
            return true;
        else if(array1[pA] < array2[pB])
            pA++;
        else
            pB++;

        return containElementsRecursive(array1, array2, pA, pB);
    }

}
