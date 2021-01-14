package algorithmsbook.permutations;

public class Permutations {

    public static void main(String[] args) {
        String str = "ab";

        /*for (int i = 0; i < str.length(); i++) {
            String rem = str.substring(0,i) + str.substring(i+1);
            System.out.println("rem: " + rem + ",  prefix: " + str.charAt(i));
        }*/
        permutation(str,"");
    }

    private static void permutation(String str, String prefix) {
        log("Str: " + str + " | " + "Prefix: " + prefix);
        if(str.length() == 0) {
            log(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                log("  str.substring(0,"+i+"): '" + str.substring(0,i) + "' + str.substring("+i+"+1): '" + str.substring(i+1)+"'");
                String rem = str.substring(0,i) + str.substring(i+1);
                permutation(rem, prefix + str.charAt(i));
            }
        }
    }

    private static void permutation1(String str, String prefix) {
        log("str -> " + str);
        if(str.length() == 2) {
            //swap(str);
        } else {
            for (int i = 0; i < str.length(); i++) {
                String auxPrefix = prefix + str.substring(i,i+1);
                log("Prefix: " + auxPrefix);
                //permutation(str.replaceFirst(auxPrefix, ""), auxPrefix);
                auxPrefix = auxPrefix.substring(0,auxPrefix.length()-1);
            }
        }
    }

    private static void log(String str) {
        System.out.println(str);
    }

}
