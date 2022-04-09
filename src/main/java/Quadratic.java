import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        double a,b,c,p1,p2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj zmienną a: ");
        a = scanner.nextDouble();

        while (a == 0){
            System.out.println("Zmienna nie może być zerem");
            System.out.print("Podaj zmienną a");
            a= scanner.nextDouble();
        }
        System.out.print("Podaj zmienną b: ");
        b = scanner.nextDouble();
        System.out.print("Podaj zmienną c: ");
        c = scanner.nextDouble();
        System.out.println();

        double delat = b*b - 4*a*c;
        if (delat > 0){
            p1 = (-b - Math.sqrt(delat))/(2*a);
            p2 = (-b + Math.sqrt(delat))/(2*a);
            System.out.format("p1 = %.2f\n",p1);
            System.out.format("p2 = %.2f ",p2);

        }
        else if (delat == 0){
            p1 = -b/(2*a);
            System.out.format("p0= %.2f ",p1);
        }
        else{
            System.out.println("Delta < 0, brak pierwiastków");}

    }
}
