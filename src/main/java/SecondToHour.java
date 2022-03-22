import java.util.Scanner;

public class SecondToHour {
    public static void main(String[] args) {
        int second ;
        int hours;
        int minuts;
        int leftseconds;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilość sekund: ");
        second = scanner.nextInt();
        leftseconds = (second%3600)%60;
        minuts = (second%3600)/60;
        hours = second/3600;
        System.out.println(second+" sekund = "+hours+" godzin," + minuts + " minut," + leftseconds+" sekund.");
    }
}
