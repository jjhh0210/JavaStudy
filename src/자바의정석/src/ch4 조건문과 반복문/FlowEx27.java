import java.util.Scanner;

public class FlowEx27 {
    public static void main(String[] args) {
        int num,sum=0;
        boolean flag = true;

        System.out.println("합계를 구할 숫자를 입력하세요. (끝내려면 0을 입력)");
        Scanner sc = new Scanner(System.in);
        while (flag) {
            num = sc.nextInt();
            if (num != 0) {
                sum += num;
            }else{
                flag = false;
            }
        }
        System.out.println("합계: " + sum);
    }
}
