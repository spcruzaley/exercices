package hackerrank.extralongfactorial;

import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        int n = 25;
        extraLongFactorials(n);
    }

    // Complete the extraLongFactorials function below.
    static void extraLongFactorials(int n) {
        BigInteger bigInteger = BigInteger.valueOf(n);
        System.out.println(factorial(bigInteger));
    }

    static BigInteger factorial(BigInteger n){
        if(n.intValue() == 1) return BigInteger.ONE;
        return n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }

}
