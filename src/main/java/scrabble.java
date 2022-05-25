import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class scrabble {
    public static void main(String[] args) {
        String letters = "quilubo";
        String word = "buulu";

        canSpell(letters,word);

    }

    public static void canSpell(String array, String word){
        String[] lettersArr = array.split("");
        List <String> lettersList = new ArrayList<String>(Arrays.asList(lettersArr));
        String[] wordArr = word.split("");
        StringBuilder myWord = new StringBuilder();
        for(String s : wordArr) {
            for (int i = 0 ; i < lettersList.size(); i++ ){
                if(s.equals(lettersList.get(i))){
                    myWord.append(lettersList.get(i));
                    lettersList.remove(lettersList.get(i));
                    break;
                }}
        }
        if (myWord.toString().equals(word)){
            System.out.println("Eureka");
        }else {
            System.out.println("H.j z tego ułoższysz" + " " + myWord);
        }
    }
}



