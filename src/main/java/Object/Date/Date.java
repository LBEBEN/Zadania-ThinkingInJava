package Object.Date;

public class Date {

    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return "Date{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    public Date(){
        this.year = 1984;
        this.month = 2;
        this.day = 25;




    }

    public static void main(String[] args) {

        Date birthday = new Date();

        System.out.println(birthday);

    }



}
