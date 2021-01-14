package codesignal.reverseinparentheses;

public class Solution {

    public static void main(String[] args) {
        //String string = "foo(bar)baz";
        //String string = "foo(bar(baz))blim";
        //String string = "foo(bar(baz)xy)blim";
        String string = "(bar)";

        Solution solution = new Solution();
        System.out.println(solution.reverseInParentheses(string));
    }

    String reverseInParentheses(String inputString) {
        return solutionOne(inputString);
    }

    /**
     * Solution one
     */
    public int counter = 0;
    public String solutionOne(String str) {
        StringBuffer buff = new StringBuffer();
        int i;

        for(i = counter; i < str.length(); i++) {
            i += counter;
            if(i < str.length()) {
                if(str.charAt(i) == '(') {
                    counter = 0;
                    buff.append(solutionOne(str.substring(i+1))).toString();
                } else if(str.charAt(i) == ')') {
                    counter = i+1;
                    return reverseString(buff.toString());
                } else {
                    counter = 0;
                    buff.append(str.charAt(i)+"");
                }
            }
        }
        return buff.toString();
    }

    /**
     * Solution two
     */
    public String solutionTwo(String str, int counter) {
        StringBuffer buff = new StringBuffer();
        int i;

        for(i = counter; i < str.length(); i++) {
            i += counter;
            if(i < str.length()) {
                if(str.charAt(i) == '(') {
                    counter = 0;
                    buff.append(solutionTwo(str.substring(i+1), 0)).toString();
                } else if(str.charAt(i) == ')') {
                    counter = i+1;
                    return reverseString(buff.toString());
                } else {
                    counter = 0;
                    buff.append(str.charAt(i)+"");
                }
            }
        }
        return buff.toString();
    }

    /*
    public String goThruString(char[] chars, int index) {
        StringBuffer buff = new StringBuffer();

        for(int i = index+counter; i < chars.length; i++, counter++) {
            if(chars[i] == '(') {
                buff.append(goThruString(chars, i+1)).toString();
            } else if(chars[i] == ')') {
                return reverseString(buff.toString());
            } else {
                buff.append(chars[i]+"");
            }
        }
        return buff.toString();
    }
     */

    /*public String goThruStringOld(String str) {
        StringBuffer buff = new StringBuffer();

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '(') {
                buff.append(goThruStringOld(str.substring(i+1))).toString();
            } else if(str.charAt(i) == ')') {
                return reverseString(buff.toString());
            } else {
                buff.append(str.charAt(i)+"");
            }
        }
        return buff.toString();
    }*/

    public String reverseString(String string) {
        if(string.length() == 0)
            return "";

        return reverseString(string.substring(1)) + string.charAt(0);
    }

}
