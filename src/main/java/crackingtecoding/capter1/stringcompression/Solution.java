package crackingtecoding.capter1.stringcompression;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        String string = "aaac";
        System.out.println(getCompressedString(string));
    }

    private static String getCompressedString(String string) {
        int counting = 1;
        for (int i = 0; i < string.length()-1; i++) {
            if(string.charAt(i) != string.charAt(i+1)) {
                counting++;
            }
        }
        System.out.println("Unique letters: " + counting);

        if(counting*2 > string.length()) {
            return string;
        }

        StringBuilder stringBuilder = new StringBuilder(counting*2);
        counting = 1;
        for (int i = 0; i < string.length(); i++) {
            if (i+1 < string.length()) {
                if(string.charAt(i) != string.charAt(i+1)) {
                    stringBuilder.append(string.charAt(i));
                    stringBuilder.append(counting);
                    counting = 1;
                } else {
                    counting++;
                }
            } else {
                stringBuilder.append(string.charAt(i));
                stringBuilder.append(counting);
            }
        }

        return stringBuilder.toString();
    }

}
