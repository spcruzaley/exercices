package codesignal.alllongestatrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        String[] intputArray = new String[]{"aba", "aa", "ad", "vcd", "aba"};

        System.out.println(Arrays.toString(allLongestStrings(intputArray)));
    }

    static String[] allLongestStrings(String[] inputArray) {
        List<String> listStrings = new ArrayList<>();
        int maxLength = Integer.MIN_VALUE;

        for (String string : inputArray) {

            if(string.length() > maxLength) {
                maxLength = string.length();
                if(!listStrings.isEmpty()) {
                    listStrings.clear();
                }
                listStrings.add(string);
            } else if(string.length() == maxLength) {
                listStrings.add(string);
            }
        }

        return listStrings.toArray(new String[listStrings.size()]);
    }

}
