import java.util.Random;
import java.util.Scanner;

public class GuessNumber52 {
    public static void main(String[] args) {

            Random random =new Random();
            int randomNumber = random.nextInt(100)+1;
            Scanner scanner = new Scanner(System.in);

            System.out.println("Myślę o liczbie pomiędzy 1 a 100\n"+"Czy zgadniesz jaka to liczba?");
            System.out.println("Podaj liczbę ");
            int number = scanner.nextInt();

            for(int i =0; i < 3; i++) {
                System.out.println("Twoja propozycja to " + number);
                if (number > randomNumber) {
                    System.out.println("Liczba którą podełeś jest za duża\n" + "Sprubój jeszcze raz");
                    number = scanner.nextInt();
                } else if (number < randomNumber) {
                    System.out.println("Liczba którą podałeś jest za mała\n" + "Sprubój jeszcze raz");
                    number = scanner.nextInt();
                } else {
                    System.out.println("WYGRAŁEŚ");
                    return;
                }
            }
        System.out.println("Niestety miałeś tylko 3 próby");
        }
    }

