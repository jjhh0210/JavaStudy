import java.util.Scanner;

public class PowerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x를 입력하세요:");
        int x = sc.nextInt();
        System.out.print("n을 입력하세요:");
        int n = sc.nextInt();
        int result = 0;
        for (int i = 1; i <=n ; i++) {
            result +=power(x,i);
        }
        System.out.println("result = "+result);
    }
    static long power(int x, int n) {
        if (n == 1) {
            return x;
        }
        return x*power(x,n-1);
    }
}
