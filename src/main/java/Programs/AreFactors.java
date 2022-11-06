package Programs;

import java.awt.print.Book;
import java.util.Scanner;

public class AreFactors {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą");
        int a = scanner.nextInt();
        int factors [] = {2,7,6};
        Boolean areFactors = true;
        for(int f : factors){
            if (a % f != 0) {
                areFactors = false;

            }
        }
        System.out.println(areFactors);
    }
}
