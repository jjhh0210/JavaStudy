public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time(12, 25, 30); //12시 25분 30초
        System.out.println(t);
//        t.hour = 13;    //hour은 private변수이므로 다른 클래스에서 접근 불가능
        t.setHour(t.getHour() + 1); //간접 접근 : 현재 hour값을 get으로 받아오고 +1 해서 다시 set
        System.out.println(t);
    }
}

class Time {
    //hour, minute, second에 값의 제한을 주어야 함
    //-> 멤버변수를 private이나 protexted로 제한하고 멤버변수의 값을 읽고 변경할 수 있는
    //public 메서드(getter, setter)를 통해 간접적으로 멤버변수 값을 다룰 수 있도록 함.
    private int hour,minute, second;

    Time(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if(hour < 0 || hour>23) return;
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if(minute <0 || minute > 59) return;
        this.minute = minute;

    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if(second < 0 || second > 59) return;
        this.second = second;
    }

    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}


