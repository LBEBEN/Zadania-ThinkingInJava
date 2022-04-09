import java.util.Scanner;

public class gauss {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj wartość ");
        int a = scan.nextInt();
        System.out.print ("Podaj ilośc elemntów ciągu do obliczenia: ");
        int b = scan.nextInt();
        double result =0;
        double sum = 0;
        for (int i = 1; i <=b; i++){
            sum = sum + (((powOne(i))*(powX(a,i)))/factorial(i));
            }
        result = 1 + sum;
        System.out.println(result);
    }
    public static double powOne (int a){
        double pow = 1;
        for(int i = 1; i <=a; i++){
            pow = pow * (-1);
        }
        return pow;
    }

    public static double powX(int number, int a){
        double pow = 1;
        for(int i = 1; i <=2*a ; i ++){
            pow = pow*number;
        }
        return pow;
    }

    public static double factorial(int a){
        double factorial  = 1;
        for (int i = 1; i <=a; i++){
            factorial = factorial * i;
        }
        return factorial;
    }
}
