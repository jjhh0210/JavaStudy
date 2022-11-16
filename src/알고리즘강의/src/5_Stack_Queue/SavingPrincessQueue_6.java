import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SavingPrincessQueue_6 {
    public static int solution(int n, int k){
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();
        for(int i=1; i<=n; i++) q.offer(i);

        while (q.size()>1){
            for (int i = 1; i < k; i++) {
                int item = q.poll();
                q.offer(item);
            }
            q.poll();
        }
        answer = q.peek();
        return answer;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int k=kb.nextInt();
        System.out.println(solution(n, k));
    }
}
