import java.util.Scanner;

public class CtoFahrenheit {
    public static void main(String[] args) {
        double stCel;
        double stFah;
        double m = 9;
        double mn = 5;
        final double CEL_TO_FAH = m/mn;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj temperatura w stopniach Celsjusza: ");
        stCel = scanner.nextDouble();
        stFah = stCel*CEL_TO_FAH+32;
        System.out.println(stCel+" C = " + stFah +" F");
    }
}
