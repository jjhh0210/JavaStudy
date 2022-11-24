import java.util.Scanner;

public class Combination {
    static int[] combi;
    static int n,m; //n개중 m개 조합

    public static void DFS(int L, int S) {
        if (L == m) {
            //조합(combi배열) 출력
            for(int x : combi) System.out.print(x+" ");
            System.out.println();
        }else{
            for (int i = S; i <= n; i++) {
                combi[L] = i;   //L번째에 뽑는행위
                DFS(L + 1, i + 1);  //앞에서 뽑은거(i) 다음 부터 돌면서 뽑는다 ex) 1을 뽑았으면 2~4까지 뽑기 시작
            }
        }
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        combi = new int[m];
        DFS(0, 1);
    }
}
