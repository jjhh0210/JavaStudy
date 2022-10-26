import java.util.Scanner;

public class FlowEx28 {
    public static void main(String[] args) {
        int input = 0, answer = 0;
        Scanner sc = new Scanner(System.in);
        answer = (int) (Math.random() * 100) + 1;
        System.out.println("answer = " + answer);

        do {
            System.out.println("1과 100사이의 정수를 입력하세요.>");
            input = sc.nextInt();

            if (answer > input) {
                System.out.println("더 큰 값으로 다시 시도해보세요");
            } else if (answer < input) {
                System.out.println("더 작은 값으로 다시 시도해보세요");
            }
        } while (answer!=input);
        System.out.println("정답입니다.");
    }
}
