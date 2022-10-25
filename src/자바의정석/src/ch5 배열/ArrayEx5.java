import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("학생 수를 입력하세요.");
        int num = sc.nextInt();
        int[] score = new int[num]; //score.length == num
        System.out.println("학생들의 성적을 차례대로 입력하세요");
        for (int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt();
            sum += score[i];
        }
        System.out.println(Arrays.toString(score));
        System.out.println("sum = " + sum + ", avg = "+(double)sum/num);    //(double)(sum/num) 하면 ~~.0 출력됨 주의

    }
}

