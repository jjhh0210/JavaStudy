import java.util.Scanner;

public class FlowEx25 {
    public static void main(String[] args) {
        int sum=0;
        int num = 0;
        System.out.println("숫자를 입력하세요");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        num = Integer.parseInt(input);

        while (num > 0) {
            sum += num % 10;
            System.out.printf("sum = %d, num = %d\n",sum,num);
            num /= 10;
        }


    }
}
