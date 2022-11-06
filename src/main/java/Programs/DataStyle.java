package Programs;

public class DataStyle {
    public static void main(String[] args) {
        String dayName = "wtorek";
        int number = 23;
        String monthName = "czerwiec";
        int year = 2022;

        printAmerican(dayName,number,monthName,year);
        printEuropean(dayName,number,monthName,year);
    }

    public static void printAmerican(String dayName, int number, String monthName, int year){
        System.out.println(dayName+", "+ monthName + " " + number + ", " + year);
    }

    public static void printEuropean(String dayName, int number, String monthName, int year){
        System.out.println(dayName+", "+ number + " " + monthName + ", " + year);
    }
}
