package ch06;

public class Ex6_2_2{
    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time();
        Time t3 = new Time();

        t1.setHour(23);
        System.out.println(t1.getHour());
    }
}

class Time {
    private int hour;
    private int minute;
    private float second;

    public void setHour(int hour) {
        if(hour < 0 || hour > 23) return;
        this.hour = hour;
    }
    public int getHour() {
        return hour;
    }
    public void setMinute(int minute) {
        if(minute < 0 || minute > 59) return;
        this.minute = minute;
    }
    public int getMinute() {
        return minute;
    }
    public void setSecond(int second) {
        if(second < 0 || second > 59) return;
        this.second = second;
    }
    public float getSecond() {
        return second;
    }

}
