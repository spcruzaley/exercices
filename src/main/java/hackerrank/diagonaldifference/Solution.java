package hackerrank.diagonaldifference;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        List<List<Integer>> listA = new ArrayList<List<Integer>>();
        List<Integer> listB = new ArrayList<Integer>();
        listB.add(1);
        listB.add(2);
        listB.add(3);
        listA.add(listB);
        listB = new ArrayList<Integer>();
        listB.add(4);
        listB.add(5);
        listB.add(6);
        listA.add(listB);
        listB = new ArrayList<Integer>();
        listB.add(9);
        listB.add(8);
        listB.add(9);
        listA.add(listB);

        System.out.println(Result.diagonalDifference(listA));
    }

}
