package codesignal.firstNotRepeatingCharacter;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        String s = "ngrhhqbhnsipkcoqjyviikvxbxyphsnjpdxkhtadltsuxbfbrkof";
        firstNotRepeatingCharacter(s);
    }

    static char firstNotRepeatingCharacter(String s) {
        char[] array = s.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(char ch: array) {
            Integer charValue = map.get(ch);

            if(charValue != null) {
                map.replace(Character.valueOf(ch), ++charValue);
            } else {
                map.put(Character.valueOf(ch), 1);
            }
        }

        for(Map.Entry<Character, Integer> entry: map.entrySet()) {
            if(entry.getValue() == 1) {
                return Character.valueOf(entry.getKey());
            }
        }
        return '_';
    }

}
