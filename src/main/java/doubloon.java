import java.util.Locale;

public class doubloon {
    public static void main(String[] args) {
        String word = "Abra";

        isDoubloon(word);

    }

    public static void isDoubloon(String word){
        char[] wordArr = word.toLowerCase().toCharArray();
        String doublon = "Is doubloon";

        for(char c : wordArr){
            int counter = 0;
            for (int i = 0; i < wordArr.length; i ++){
                if(c == wordArr[i]){
                    counter ++;
                }}
            if (counter != 2){
                doublon = "Is not doubloon";
            }
        }
        System.out.println(doublon);
    }
}
