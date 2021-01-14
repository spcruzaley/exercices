package codesignal.palindrome;

public class Solution {

    public static void main(String[] args) {
        System.out.println(checkPalindrome("holaxlaloh"));
    }

    /**
     * Better solution in terms of time
     *
     * @param inputString
     * @return
     */
    public static boolean checkPalindrome(String inputString) {
        char[] chars = inputString.toCharArray();
        int middle = chars.length/2;

        for (int i = 0, j = inputString.length() - 1; i < middle; i++, j--) {
            if(chars[i] != chars[j])
                return false;
        }
        return true;
    }

    /**
     * Good solution using recursion, however with strings with a big length the time increase considerably
     * @param inputString
     * @return
     */
    public static boolean checkPalindromeOne(String inputString) {
        return inputString.equals(revert(inputString));
    }

    public static String revert(String string) {
        if(string.length() == 0)
            return string;

        return string.charAt(string.length()-1) + revert(string.substring(0, string.length()-1));
    }

}
