package codesignal.century;

public class Solution {

    public static void main(String[] args) {
        System.out.println(centuryFromYear(2020));
    }

    static int centuryFromYear(int year) {
        int century = (int)Math.ceil(year/100);

        if(year > century*100)
            century += 1;

        return century;
    }

}
