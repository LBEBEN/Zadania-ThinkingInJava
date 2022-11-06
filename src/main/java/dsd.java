import java.math.BigInteger;

public class dsd {
    public static void main(String[] args) {
        System.out.println(factorial(3));
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
