public class dzielniki {
    public static void main(String[] args) {
        int number = 16;
        int[] factors ={2,4,8,7};
        System.out.println(areFactors(number,factors));

    }

    public static boolean areFactors(int number, int[] factors){
        boolean areFactors = true;
        for(int factor : factors){
            if(number % factor != 0){
                areFactors = false;
            }
        }
        return areFactors;
    }
}
