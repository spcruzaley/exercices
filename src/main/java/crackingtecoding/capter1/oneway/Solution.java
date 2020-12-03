package crackingtecoding.capter1.oneway;

public class Solution {

    public static void main(String[] args) {
        String stringA = "pale";
        String stringB = "bake";
        System.out.println(oneway(stringA, stringB));
    }

    static boolean oneway(String stringA, String stringB) {
        if(stringA.equals(stringB)) return true;
        if(Math.abs(stringA.length() - stringB.length()) > 1) return false;

        int changes = 0;
        for (int i = 0; i < stringB.length(); i++) {
            if(stringA.indexOf(stringB.charAt(i), i) < 0) changes++;
            if(changes > 1) return false;
        }

        return true;
    }

}
