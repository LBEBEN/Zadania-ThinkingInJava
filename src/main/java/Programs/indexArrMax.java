package Programs;

import com.sun.jdi.Value;

import java.util.Arrays;

public class indexArrMax {
    public static void main(String[] args) {
        int [] array = {77,1,2,5,7,4,66,4};
        System.out.println(indexOFMax(array));
    }

    public static int indexOFMax(int[] array){
        int maxValue = array[0];
        int index = 0;
        for(int i = 1; i < array.length; i++){
            if(maxValue<array[i]){
                maxValue = array[i];
                index = i;
            }
        }
        return index;
    }
}
