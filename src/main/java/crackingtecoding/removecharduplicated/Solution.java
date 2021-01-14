package crackingtecoding.removecharduplicated;

public class Solution {

    public static void main(String[] args) {
        String str = "acfascfsdcfascdacacds";
        System.out.println(removeDuplicatedChars(str, "", 0));
    }

    private static String removeDuplicatedChars(String input, String uniques, int index) {
        if(input.length() <= index) return uniques;
        char c = input.charAt(index);
        if(!uniques.contains(String.valueOf(c)))
            uniques = uniques.concat(String.valueOf(c));
        return removeDuplicatedChars(input, uniques, ++index);
    }

}
