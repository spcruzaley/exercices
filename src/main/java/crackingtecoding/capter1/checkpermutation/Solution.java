package crackingtecoding.capter1.checkpermutation;

public class Solution {

    public static void main(String[] args) {
        String stringA = "abdc";
        String stringB = "cabd";
        System.out.println(isPermutation(stringA, stringB));
    }

    static boolean isPermutation(String stringA, String stringB) {
        int difference = 0;
        for (int i = 0; i < stringA.length(); i++) {
            difference += (stringA.charAt(i) - stringB.charAt(i));
        }
        return difference == 0;
    }

}
