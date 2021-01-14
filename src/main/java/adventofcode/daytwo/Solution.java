package adventofcode.daytwo;

import utils.Misc;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        //Elements from input
        List<String> elementsFromInput = Misc.getListFromInput("adventofcode/daytwo/input");
        List<PasswordElements> elements = buildPasswordMapRules(elementsFromInput);

        //Elements to test
        //elements = buildElementsForTest();

        // First Step
        /*int validPasswords = validPasswords(elements);
        System.out.println("validPasswords: " + validPasswords);*/

        int validPasswords = validPasswordsPartTwo(elements);
        System.out.println("validPasswords: " + validPasswords);
    }

    public static int validPasswordsPartTwo(List<PasswordElements> passwordElements) {
        int occurrences = 0;

        for (PasswordElements passwordElement : passwordElements) {
            occurrences += charOccurrencesTwo(passwordElement);
        }

        return occurrences;
    }

    private static int charOccurrencesTwo(PasswordElements passwordElements) {
        char[] chars = passwordElements.getPassword().toCharArray();
        boolean first = false, second = false;
        int cont = 0;

        if(chars[passwordElements.getMin()-1] == passwordElements.getC()) first = true;
        if(chars[passwordElements.getMax()-1] == passwordElements.getC()) second = true;

        if(first && !second) {
            cont++;
        } else if(!first && second) {
            cont++;
        }

        return cont;
    }

    public static int validPasswords(List<PasswordElements> passwordElements) {
        int validPassword = 0;

        for (PasswordElements passwordElement : passwordElements) {
            int occurrences = charOccurrences(passwordElement.getPassword(), passwordElement.getC());
            if(occurrences >= passwordElement.getMin() && occurrences <= passwordElement.getMax())
                validPassword++;
        }

        return validPassword;
    }

    private static int charOccurrences(String string, Character c) {
        char[] chars = string.toCharArray();
        int cont = 0;

        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == c) cont++;
        }

        return cont;
    }

    public static List<PasswordElements> buildPasswordMapRules(List<String> elements) {
        StringTokenizer entireTokens;
        StringTokenizer limitTokens;

        List<PasswordElements> passwordElementsList = new ArrayList<>();
        PasswordElements passwordElements;

        for (String element : elements) {
            entireTokens = new StringTokenizer(element, " ");
            limitTokens = new StringTokenizer((String)entireTokens.nextElement(), "-");

            passwordElements = new PasswordElements();
            passwordElements.setMin(Integer.parseInt(limitTokens.nextElement().toString()));
            passwordElements.setMax(Integer.parseInt(limitTokens.nextElement().toString()));
            passwordElements.setC(entireTokens.nextElement().toString().charAt(0));
            passwordElements.setPassword(entireTokens.nextElement().toString());
            passwordElementsList.add(passwordElements);
        }

        return passwordElementsList;
    }

    private static List<PasswordElements> buildElementsForTest() {
        List<PasswordElements> passwordElementsList = new ArrayList<>();

        passwordElementsList.add(new PasswordElements(1, 3, 'a', "abcde"));
        passwordElementsList.add(new PasswordElements(1,3, 'b', "cdefg"));
        passwordElementsList.add(new PasswordElements(2,9, 'c', "ccccccccc"));

        return passwordElementsList;
    }

}

class PasswordElements {
    private Integer min;
    private Integer max;
    private Character c;
    private String password;

    public PasswordElements() {
    }

    public PasswordElements(Integer min, Integer max, Character c, String password) {
        this.min = min;
        this.max = max;
        this.c = c;
        this.password = password;
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public Character getC() {
        return c;
    }

    public void setC(Character c) {
        this.c = c;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "PasswordElements{" +
                "min=" + min +
                ", max=" + max +
                ", c=" + c +
                ", password='" + password + '\'' +
                '}';
    }
}
