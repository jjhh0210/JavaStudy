import java.util.Scanner;

public class SequenceIntegerSum_5 {
    public static int solution(int n) {
        //two pointer 버전
        int answer = 0;
        int lt = 1;
        int sum = 0;
        int m = n / 2 + 1;   //n/2 + 1까지만 돌면 됨
        for (int rt = 1; rt <= m; rt++) {
            sum += rt;
            if (sum == n) {
                answer++;
            }
            while (sum >= n) {
                sum -= lt++;
                if (sum == n) {
                    answer++;
                }
            }
        }
        return answer;
    }
    public static int solution2(int n) {
        //수학버전
        int answer = 0;
        int cnt = 1;    //연속된 자연수의 개수
        n--;    //1 기본으로 빠짐
        while (n > 0) {
            cnt++;
            n=n-cnt; //2,3,...빠짐
            if (n % cnt == 0) { //나눠떨어지면 연속된 자연수의 합이 n이 되는게 가능
                answer++;
            }

        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        System.out.print(solution(n));
    }
}
