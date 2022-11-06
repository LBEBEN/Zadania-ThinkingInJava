package Programs;

import java.math.BigInteger;

public class MyExp {
    public static void main(String[] args) {
        System.out.println(myexp(2,7));
    }

    public static double myexp(int x, int n) {
        double result = 1.0;
        for (int i = 1; i < n; i++) {
            result = result + (Math.pow(x, i) / factorial(i));
        }
        return result;
    }

    public static int factorial(int x) {
        int factorial = 1;
        if (x != 0) {
            for (int i = 1; i <= x; i++) {
                factorial = factorial * i;
            }
        }
        return factorial;
    }
}
