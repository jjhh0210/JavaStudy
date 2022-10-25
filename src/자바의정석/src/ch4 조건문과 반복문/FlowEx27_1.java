import java.util.Scanner;

public class FlowEx27_1 {
    public static void main(String[] args) {
        int num,sum=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("합계를 구할 숫자를 입력하세요. (끝내려면 0을 입력)");

        do {
            num = sc.nextInt();
            if (num != 0) {
                sum += num;
            }

        } while (num!=0);

        System.out.println("합계: " + sum);
    }
}
