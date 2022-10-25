import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        //학생 수, 학생 성적 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.println("학생 수를 입력하세요.");
        int num = sc.nextInt();
        int[] score = new int[num]; //score.length == num
        System.out.println("학생들의 성적을 차례대로 입력하세요");
        for (int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(score));

        //max, min을 첫번째 원소로 초기화
        int max = score[0];
        int min = score[0];

        for (int i = 1; i < score.length; i++) {
//            if (score[i] > max) {
//                max = score[i];
//            }else if(score[i]<min){
//                min = score[i];
//            }
            max = score[i]>max ? score[i] : max;
            min = score[i]<min ? score[i] : min;
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
