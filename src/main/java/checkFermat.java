import java.util.Scanner;

import static java.lang.Math.*;

public class checkFermat {
    public static void main(String[] args) {
        double n; // potęga
        double a,b,c; // wartości liczbowe



        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj wartość a: ");
        a = scan.nextDouble();
        System.out.print("Podaj wartość b: ");
        b = scan.nextDouble();
        System.out.print("Podaj wartość c: ");
        c = scan.nextDouble();

        System.out.print ("Podaj wartość potęgi n: ");
        n = scan.nextDouble();
        double powAdd = pow(a,n) + pow(b,n);

        if( (powAdd == pow(c,n)) && n<=2){
            System.out.println("Nie, to nie działa");
        }
        else {
            System.out.println(" Kurka , Fermet się mylił");
        }
        System.out.println(powAdd);
        System.out.println(pow(c,n));
    }
}
