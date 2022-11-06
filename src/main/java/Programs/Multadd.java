package Programs;

public class Multadd {
    public static void main(String[] args) {
        double a = 1.0;
        double b = 2.0;
        double c = 3.0;
        double d = 7;
        System.out.println(multadd(a,b,c));
        System.out.println(multadd2());
        System.out.println(multadd3());
        System.out.println(expSum(a));
    }

    public static double multadd(double a, double b, double c){
        return a*b+c;
    }

    public static double multadd2(){
        double piBy4 = Math.PI/4;
        double result = Math.sin(piBy4) + (Math.cos(piBy4)/2);
        return result;
    }

    public static double multadd3(){
        return Math.log(10) + Math.log(20);
    }

    public static double expSum(double a){
        return a*multadd4(a) + Math.sqrt(1-multadd4(a));

    }
    public static double multadd4(double a){
        return Math.exp( - a);
    }
}
