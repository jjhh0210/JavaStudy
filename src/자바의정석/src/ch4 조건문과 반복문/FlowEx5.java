import java.util.Scanner;

public class FlowEx5 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';
        char opt;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("점수를 입력하세요.(범위:1~100, 종료:0)>");
            score = sc.nextInt();

            if (score == 0) {
                System.out.println("종료되었습니다");
                break;
            }else if(score<0||score>100){
                System.out.println("범위가 잘못되었습니다(범위:1~100)");
                continue;
            }

            System.out.println("당신의 점수는 "+score+"입니다.");
            opt = '0';

            if (score >= 90) {
                grade = 'A';
                if (score >= 98) {
                    opt = '+';
                } else if (score < 94) {
                    opt = '-';
                }
            } else if (score >= 80) {
                grade = 'B';
                if (score >= 88) {
                    opt = '+';
                } else if (score < 84) {
                    opt = '-';
                }
            } else if (score >= 70) {
                grade = 'C';
                if (score >= 78) {
                    opt = '+';
                } else if (score < 74) {
                    opt = '-';
                }
            }else{
                grade = 'D';
            }

            System.out.println("당신의 학점은 " + grade + opt+"입니다.\n");
        }

    }
}
