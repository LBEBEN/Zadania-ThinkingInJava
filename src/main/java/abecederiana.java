import java.util.Scanner;

public class abecederiana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz do sprawdzenia");
        String word = scanner.nextLine();
        System.out.println(isAbecedarian(word));
    }

    public static boolean isAbecedarian(String word){
        String alphabet = "abcdefghijklmnoperstuwxyz";
        char[] wordArr = word.toCharArray();
        boolean isAbc = true;
        for (int i = 0 ; i <= wordArr.length -2; i++) {
            if (alphabet.indexOf(wordArr[i]) > alphabet.indexOf(wordArr[i + 1])) {
                isAbc = false;
            }
        }
        return isAbc;
    }
}
