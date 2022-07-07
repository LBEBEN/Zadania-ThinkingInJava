package Programs;
import Programs.LetterHist;

public class Anagram {

    public static void main(String[] args) {
        String firstWord = "nart";
        String secondWord = "tyran";

        if(isAnagram(firstWord,secondWord)){
            System.out.println("Tak to anagram");
        }else {
            System.out.println("Nie to nie anagram");}
    }

    public static boolean isAnagram(String firstWord, String secondWord){
      int [] firstArr = LetterHist.histogram(firstWord); // wykorzystano tutaj metodę histogram(); zbudowaną w klasie LetterHist
      int [] secondArr = LetterHist.histogram(secondWord);
      boolean isAn = true;
      if(firstArr.length != secondArr.length){
          isAn = false;
      }else {
          for(int i = 0; i < firstArr.length; i++){
              if(firstArr[i] != secondArr[i]){
                  isAn = false;
              }
          }
      }
      return isAn;
    }
}
