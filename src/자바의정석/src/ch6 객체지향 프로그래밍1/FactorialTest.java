public class FactorialTest {
    public static void main(String[] args) {
        int n = 5;
        int result = factorial(n);
        System.out.println("recursive result = " + result);
        result = factorial2(n);
        System.out.println("iterative result = " + result);

    }

    static int factorial(int n) {
        //재귀 호출을 이용한 팩토리얼
        if (n <= 0 || n > 12) {
            return -1;  //매개변수 n의 유효성 검사 추가!
        }
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    static int factorial2(int n) {
        //반복문을 이용한 팩토리얼 - 사실상 효율 더 높고 빠름, 스택오버플로우 문제도 없음
        int result = 1;
        while (n != 0) {
            result *= n--;
        }
        return result;
    }
}
