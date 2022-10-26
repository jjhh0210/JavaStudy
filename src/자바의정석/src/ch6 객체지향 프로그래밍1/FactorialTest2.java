import java.util.Scanner;

public class FactorialTest2 {
    public static void main(String[] args) {
        long result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요");
        int n = sc.nextInt();
        

        for (int i = 1; i <= n; i++) {
            result = fact(i);
            if (result == -1) {
                System.out.println("유효하지 않은 값입니다. 0<n<20:"+i);
                break;
            }
            System.out.printf("%2d!=%20d\n",i,result);
        }
    }

    static long fact(int n) {
        long result = 1;
        if (n <= 0 || n > 20) {
            return -1;  //매개변수 유효성 검사
        }   
        if (n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

}
