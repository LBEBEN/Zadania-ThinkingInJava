package Object.Rational;

import java.util.ArrayList;
import java.util.List;

public class Rational {

    private int licznik;
    private int mianownik;

    public Rational(){
        this.licznik=0;
        this.mianownik=1;
    }

    public Rational (int licznik, int mianownik){
        this.licznik=licznik;
        this.mianownik = mianownik;
    }

    public void negate(){
        double number = this.licznik/(double)this.mianownik;
      if(this.licznik > 0 && this.mianownik > 0){
          System.out.println(-number);
      }else if(this.licznik < 0 || this.mianownik < 0){
          System.out.println(-number);
      }
      else {
          System.out.println(0);
      }
    }

    public void invert(){
        int newLicznik = this.mianownik;
        int newMianownik = this.licznik;
        this.licznik = newLicznik;
        this.mianownik = newMianownik;
    }

    public static List<Integer> listOfD(int a){
        List<Integer> newList = new ArrayList<>();
        for(int i = 1; i <= a; i++){
            if(a%i == 0){
                newList.add(i);
            }
        }
        return newList;
    }

    public void reduce(){
        int nwd = 0;
       if(this.licznik > this.mianownik){
           nwd = nwd(this.licznik, this.mianownik);
       }else {
           nwd = nwd(this.mianownik, this.licznik);
       }
       this.mianownik = this.mianownik/nwd;
       this.licznik = this.licznik/nwd;
    }

    public static int nwd(int a, int b){
        int nwd = a; // wartość początkowa największego wspólnego dzielnika
        int reszta = b; // reszta z dzielenia
        while(reszta != 0){
            int temp = reszta;
            reszta = nwd%reszta;
            nwd = temp;
        }
        return nwd;
    }

    public void add(Rational rational){
        this.reduce();
        rational.reduce();
        this.licznik = this.licznik * rational.mianownik;
        rational.licznik = rational.licznik*this.mianownik;
        this.mianownik = this.mianownik* rational.mianownik;
        this.licznik += rational.licznik;
        this.reduce();
    }

    public void printRational(){
        System.out.printf("Mianownik to %d a licznik to %d" + "\n", this.mianownik,this.licznik);
    }

    @Override
    public String toString() {
        return "Rational licznik=" + licznik + ", mianownik=" + mianownik;
    }

    public static void main(String[] args) {
        Rational rational = new Rational(4,8);
        Rational rational1 = new Rational(14,10);

        rational.printRational();

        rational.add(rational1);

        rational.printRational();

    }
}

