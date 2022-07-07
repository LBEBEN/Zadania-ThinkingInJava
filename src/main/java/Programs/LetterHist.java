package Programs;

import java.util.Arrays;
import java.util.Locale;

public class LetterHist {
    public static void main(String[] args) {
        String word = "wiara";
        char [] abc = new char[26];
        int i =0;
        for (char c = 'a'; c <= 'z'; c++){
            abc[i] = c;
            i++;
        }

        System.out.println(Arrays.toString(abc));
        System.out.println(Arrays.toString(histogram(word)));
    }

    public static int [] histogram(String word){
        int [] hist = new int [26];
        word = word.toLowerCase(Locale.ROOT);
        for(char w : word.toCharArray()){
            switch (w){
                case 'a':
                    hist[0] ++;
                    break;
                case 'b':
                    hist[1] ++;
                    break;
                case 'c':
                    hist[2]++ ;
                    break;
                case 'd':
                    hist[3] ++;
                    break;
                case 'e':
                    hist[4]++;
                    break;
                case 'f':
                    hist[5]++;
                    break;
                case 'g':
                    hist[6]++;
                    break;
                case 'h':
                    hist[7]++;
                    break;
                case 'i':
                    hist[8]++;
                    break;
                case 'j':
                    hist[9]++;
                    break;
                case 'k':
                    hist[10]++;
                    break;
                case 'l':
                    hist[11]++;
                    break;
                case 'm':
                    hist[12]++;
                    break;
                case 'n':
                    hist[13]++;
                    break;
                case 'o':
                    hist[14]++;
                    break;
                case 'p':
                    hist[15]++;
                    break;
                case 'q':
                    hist[16]++;
                    break;
                case 'r':
                    hist[17]++;
                    break;
                case 's':
                    hist[18]++;
                    break;
                case 't':
                    hist[19]++;
                    break;
                case 'u':
                    hist[20]++;
                    break;
                case 'v':
                    hist[21]++;
                    break;
                case 'w':
                    hist[22]++;
                    break;
                case 'x':
                    hist[23]++;
                    break;
                case 'y':
                    hist[24]++;
                    break;
                case 'z':
                    hist[25]++;
                    break;
            }
        }
        return hist;
    }
}
