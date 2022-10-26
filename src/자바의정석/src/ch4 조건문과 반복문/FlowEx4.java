import java.util.*;
public class FlowEx4 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';

        Scanner sc = new Scanner(System.in);

        System.out.println("점수를 입력하세요. >");
        score = sc.nextInt();

        while (score >= 0) {
            if (score >= 90) {
                grade = 'A';
            } else if (score >= 80) {
                grade = 'B';
            } else if (score >= 70) {
                grade = 'C';
            }else{
                grade = 'D';
            }

            System.out.println("당신의 학점은 " + grade + "입니다.\n");

            System.out.println("점수를 입력하세요. >");
            score = sc.nextInt();
        }
        System.out.println("종료되었습니다.");

    }
}
