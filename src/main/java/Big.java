import java.math.BigDecimal;
import java.math.BigInteger;

public class Big {
    public static void main(String[] args) {

      for(int i = 0; i <=30; i++){
          factorial(i);
      }

    }
    public static void factorial(int x){
        BigInteger factorial = BigInteger.valueOf(1);
        if(x != 0){
        for(int i =1 ; i <= x; i++){
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.print("silnia " + x + " = " + factorial + "\n");
    }}
}
