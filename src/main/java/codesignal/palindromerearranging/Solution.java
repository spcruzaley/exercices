package codesignal.palindromerearranging;

public class Solution {

    /**
     * Solution by user https://app.codesignal.com/profile/samantha_p5
     * @param inputString
     * @return
     */
    boolean palindromeRearranging(String inputString) {
        int map = 0;
        for(int i=0; i<inputString.length(); i++) {
            map ^= 1 << (inputString.charAt(i) - 'a');
        }
        return map == 0 || (map & -map) == map;
    }

}
