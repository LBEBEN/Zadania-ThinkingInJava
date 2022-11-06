package Programs;

import java.util.Random;
import java.util.Scanner;

public class GuessStarter {
    public static void main(String[] args) {
        Random random =new Random();
        int number = random.nextInt(100)+1;
        Scanner scanner = new Scanner(System.in);


        System.out.println("Myślę o liczbie pomiędzy 1 a 100\n"+"Czy zgadniesz jaka to liczba?");
        System.out.println("Podaj liczbę ");
        int i = scanner.nextInt();
        System.out.println("Twoja propozycja to " + i);
        System.out.println("Liczba o której myślałem to " + number);
        if(i != number){
            System.out.println("Pomyliłęś się o " + Math.abs(number-i));
        }
        else {
            System.out.println("WYGRAŁEŚ");
        }
    }
}
