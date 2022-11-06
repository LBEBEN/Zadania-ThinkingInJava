package Programs;

import java.util.Scanner;

public class squareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Podaj liczbę ");
        double a = scanner.nextDouble();
        double interwal = a;
        double result = a/2;
        while(interwal > 0.0001){
            result = (result+a/result)/2;
            interwal = interwal - result;
        }
        System.out.println(Math.abs(result));
    }
}
