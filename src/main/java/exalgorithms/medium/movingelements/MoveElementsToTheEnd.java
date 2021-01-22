package exalgorithms.medium.movingelements;

import java.util.Collections;
import java.util.List;

public class MoveElementsToTheEnd {

    //Solution 1 (Not good)
    //Time complexity O(n^2) - Where n is the array length, its n^2 due to the "rotation" method has to traverse all
    //                          the elements each time that we found a target
    //Space complexity O(n) - Where n is the array length, its due to the recursive method "getMaxOccurrences"
    public static int[] solution1(int[] array, int target) {
        return moveElements(array, target);
    }

    //Solution 2 (Best option)
    //Time complexity O(n) - Where n is the array length, due to we only need to swap target value with last different
    //                          value in array, thus in the worst case we'll to need to traverse the entire array.
    //Space complexity O(1) - In this case we don't need extra space.
    public static int[] solution2(int[] array, int target) {
        return moveElementsTwo(array, target);
    }

    /********************************************************************************************************/
    private static int[] moveElements(int[] array, int target) {
        int swaps = 0;
        int occurrences = getMaxOccurrences(array, target, 0, 0);

        int cont = 0;
        do {
            if(array[cont] == target) {
                rotation(array, cont);
                swaps++;
            } else {
                cont++;
            }
        } while(swaps < occurrences);

        return array;
    }

    public static int[] moveElementsTwo(int[] array, int target) {
        int leftPointer = 0;
        int rightPointer = array.length-1;

        while(leftPointer < rightPointer) {
            if(array[leftPointer] == target) {
                while(array[rightPointer] == target) {
                    rightPointer--;
                    if(rightPointer <= leftPointer) //Be sure we don't raise left pointer
                        break;
                }
                swap(array, leftPointer, rightPointer);
                rightPointer--;
            }
            leftPointer++;
        }

        return array;
    }

    public static List<Integer> moveElementsWithList(List<Integer> array, int target) {
        int leftPointer = 0;
        int rightPointer = array.size();

        while(leftPointer < rightPointer) {
            if(array.get(leftPointer) == target) {
                while(array.get(rightPointer) == target) {
                    rightPointer--;
                    if(rightPointer <= leftPointer) //Be sure we don't raise left pointer
                        break;
                }
                Collections.swap(array, leftPointer, rightPointer);
                rightPointer--;
            }
            leftPointer++;
        }

        return array;
    }

    public static int getMaxOccurrences(int[] array, int target, int index, int cont) {
        if(index == array.length)
            return cont;

        if(array[index] == target)
            cont++;

        return getMaxOccurrences(array, target, index+1, cont);
    }

    public static void rotation(int[] array, int from) {
        int tmp = array[from];

        for(int i = from; i < array.length - 1; i++) {
            array[i] = array[i+1];
        }
        array[array.length-1] = tmp;
    }

    public static void swap(int[] array, int a, int b) {
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }

}
