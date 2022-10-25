import java.util.Scanner;

public class PomodoroToHour {
    public static void main(String[] args) {
        //1 뽀모도로 = 25분
        //n 뽀모도로 = 25*n분 -> 몇시간 몇분?
        Scanner sc = new Scanner(System.in);
        int pom = sc.nextInt();
        int hour = (int) (pom * 25 / 60);
        int min = pom * 25 % 60;
        System.out.println(hour+"시간"+min+"분");
    }
}
