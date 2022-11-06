package Programs;

import java.util.Scanner;

public class tringle {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scan = new Scanner(System.in);
        System.out.print ("Podaj długość boku a: ");
        a= propertyLenght(scan.nextInt());
        System.out.print ("Podaj długość boku b: ");
        b= propertyLenght(scan.nextInt());
        System.out.print ("Podaj długość boku c: ");
        c= propertyLenght(scan.nextInt());

        if ((a+b>c) && (a+c>b) && (b+c > a) ){
            System.out.println("Ale ładny trójkąt");
        }
        else {
            System.out.println("Z tego trójkąta nie będzie");
        }

    }
    public static int propertyLenght(int a){
        Scanner scanner = new Scanner(System.in);
        while(a <= 0){
            System.err.print("Długość boku musi być większa od zera: ");
            a = scanner.nextInt();
        }
        return a;
    }

}
