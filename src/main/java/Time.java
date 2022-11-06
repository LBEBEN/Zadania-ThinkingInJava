public class Time {
    private int hour;
    private int minute;
    private double second;

    public Time(){
        this.hour = 0;
        this.minute = 0;
        this.second = 0.0;
    }

    @Override
    public String toString() {
        return String.format("Time: %02d:%02d:%04.1f ", this.hour, this.minute, this.second) ;
    }
}
