package Programs;

public class ArePrimeFactors {
    public static void main(String[] args) {
        int n = 41;
        int arr[] = {2,3,7};
        System.out.println(arePrimeFactors(n,arr));
    }
    public static boolean arePrimeFactors(int n, int arr[]){
    boolean primeFactors = true;
    for (int e : arr){
        if( e < 2) {
            primeFactors = false;
        }else if (e > 2){
            for(int i = 2; i < e;i++){
                if(e % i == 0){
                    primeFactors = false;
                }
            }
        }
    }

    if (primeFactors){
        int product = 1;
        for ( int e : arr){
           product = product*e;
        }
        if(product != n){
            primeFactors = false;
        }
    }
    return primeFactors;
    }
}
