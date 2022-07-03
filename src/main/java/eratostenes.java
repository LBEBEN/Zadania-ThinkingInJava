import java.util.Arrays;

public class eratostenes {
    public static void main(String[] args) {
        int n = 26;

        System.out.println(Arrays.toString(sieve(n)));

        }

        public static boolean[] sieve(int n){
            boolean[] isFirst = new boolean[n - 1];
            int[] primaryArr = new int[n - 1];
            for (int i = 0; i < primaryArr.length; i++) {
                primaryArr[i] = i + 2;
                isFirst[i] = false;
            }

            int[] secondArr = primaryArr.clone();

            while (secondArr.length >0){
                int value = secondArr[0];
                isFirst[number(value, primaryArr)] = true;
                int counter = 0;
                for(int i=1; i < secondArr.length; i++){
                    if(secondArr[i] % secondArr [0] == 0){
                        secondArr[i] = 0;
                        counter ++;
                    }
                }
                Arrays.sort(secondArr);
                secondArr = Arrays.copyOfRange(secondArr, counter+1, secondArr.length);}

            return isFirst;
        }

        public static int number( int value, int[] array) {
        int number = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == value){
                number = i;
            }
        }
        return number;
        }
    }
