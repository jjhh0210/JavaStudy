import java.util.Scanner;

public class Fibonacci_4 {
    public static int[] solution(int n) {
        int[] answer=new int[n];
        answer[0]=1;
        answer[1]=1;
        for(int i=2; i<n; i++){
            answer[i]=answer[i-2]+answer[i-1];
        }
        return answer;
    }

    public static void solution2(int n) {
        //만약 배열을 쓰지 말라고 한다면?
        int a=1,b=1,c;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a=b;
            b=c;
        }

    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
//        for(int x :solution(n)) System.out.print(x+" ");
        solution2(n);
    }
}
