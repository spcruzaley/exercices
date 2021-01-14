package crackingtecoding.capter1.isunique;

public class Solution {

    public static void main(String[] args) {
        String string="poiuytrgdfvxbswenmh";
        System.out.println(isUnique(string));
    }

    static boolean isUnique(String string) {
        char charsFromString[] = string.toCharArray();
        char[] arrayToValidate = new char[155];

        for (int i = 0; i < string.length(); i++) {
            int index = (int)charsFromString[i];
            if(arrayToValidate[index] == 0) {
                arrayToValidate[index] = charsFromString[i];
            } else {
                System.out.println("Char '" + charsFromString[i] + "' duplicated");
                return false;
            }
        }
        return true;
    }
}
