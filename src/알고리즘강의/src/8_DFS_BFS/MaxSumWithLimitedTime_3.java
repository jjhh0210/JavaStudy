import java.util.Scanner;

public class MaxSumWithLimitedTime_3 {
    static int answer=Integer.MIN_VALUE, n, m;
    //static boolean flag=false;
    public static void DFS(int L, int sum, int time, int[] ps, int[] pt){
        if(time>m) return;
        if (L == n) {
            answer = Math.max(sum, answer);
        } else {
            DFS(L + 1, sum + ps[L], time + pt[L], ps, pt);
            DFS(L + 1, sum, time, ps, pt);
        }
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        m=kb.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        for(int i=0; i<n; i++){
            a[i]=kb.nextInt();
            b[i]=kb.nextInt();
        }
        DFS(0, 0, 0, a, b);
        System.out.println(answer);
    }
}
