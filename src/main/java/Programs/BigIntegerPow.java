package Programs;

import java.math.BigInteger;

public class BigIntegerPow {
    public static void main(String[] args) {
        System.out.println(pow(2,2));
    }

    public static BigInteger pow(int x, int n){
        if(n==0) return BigInteger.valueOf(1);

        BigInteger t = BigInteger.ONE;
        if (n/2 % 2 == 0){
            for (int i = 1; i<= n/2; i++){
                t = t.multiply(BigInteger.valueOf(x));
            }
        }else {
            BigInteger s = BigInteger.ONE;
            for (int i = 1; i<= n/2; i++){
                s = s.multiply(BigInteger.valueOf(x));
            }
            t = s.multiply(BigInteger.valueOf(x/2));
        }

        System.out.println(t);

        if(n % 2 == 0){
            return t.multiply(t);
        }else {
            return t.multiply(t).multiply(BigInteger.valueOf(x));
        }
    }
}
