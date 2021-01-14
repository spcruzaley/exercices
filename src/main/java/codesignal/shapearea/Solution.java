package codesignal.shapearea;

public class Solution {

    public static void main(String[] args) {
        System.out.println(shapeArea(4));
    }

    static int shapeArea(int n) {
        if(n == 1) return 1;
        return (n*n) + ((n-1) * (n-1));
    }

}
