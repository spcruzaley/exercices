package algoexpert.easy.nthfibonacci;

public class Program {

    public static void main(String[] args) {
        /*int res = getNthFib(7);
        System.out.println(res);*/

        System.out.println(fibo(5));
    }

    public static int getNthFib(int n) {
        // Write your code here.
        if(n == 0)
            return 0;

        if(n == 1 || n == 2)
            return 1;

        int n1 = 0;
        int n2 = 1;
        int n3 = 0;

        for (int i = 2; i < n; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }

        return n3;
    }

    public static int fibo(int n) {
        if(n == 2) {
            return 1;
        } else if(n == 1) {
            return 0;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

}
