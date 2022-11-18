import java.util.Arrays;
import java.util.Scanner;

public class LoadPuppies_2 {
    static int answer=Integer.MIN_VALUE, c, n;
    public static void DFS(int L, int sum, int[] arr){
        if(sum>c) return;
        if (L == n) {
            //위에서 sum>c이면 걸렀으므로 당연히 sum<=c이다.
            answer = Math.max(answer,sum);
        }else{
            DFS(L + 1, sum + arr[L], arr);
            DFS(L + 1, sum, arr);
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        c=kb.nextInt();
        n=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        DFS(0, 0, arr);
        System.out.println(answer);
    }
}
