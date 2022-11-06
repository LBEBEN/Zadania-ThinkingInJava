import java.util.Arrays;

public class PowArray {
    public static void main(String[] args) {

        int [] arr = {2,3,7,9};
        System.out.println(Arrays.toString(powArray(arr,3)));

    }
    public static int[] powArray(int [] initialArr, int n){
        int [] changedArray = new int[initialArr.length];
        for (int i = 0; i < initialArr.length; i++){
            changedArray[i] = (int) Math.pow(initialArr[i],n);
        }
        return changedArray;
    }
}
