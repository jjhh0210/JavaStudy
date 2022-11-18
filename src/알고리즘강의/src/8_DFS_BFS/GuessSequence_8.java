import java.util.Scanner;

public class GuessSequence_8 {
    static int[] b, p, ch;
    static int n, f;
    static boolean flag=false;
    static int[][] dy=new int[35][35];
    public static int combi(int n, int r){ //nCr 조합 구하는 메서드
        if(dy[n][r]>0) return dy[n][r];
        if(n==r || r==0) return 1;
        else return dy[n][r]=combi(n-1, r-1)+combi(n-1, r);
    }
    public static void DFS(int L, int sum) {
        if(flag) return;
        if(L==n){
            if(sum==f){
                for(int x : p) System.out.print(x + " ");
                flag = true;    //답 발견하면 다른 호출들 다 무조건 return 시키고 프로그램 종료시킴
            }

        }else{
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 0) {  //여기선 i 자체가 숫자 데이터!!
                    ch[i] = 1;
                    p[L] = i;
                    DFS(L + 1, sum + b[L] * p[L]);
                    ch[i] = 0;
                }
            }
        }

    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        f=kb.nextInt();
        b=new int[n];
        p=new int[n];
        ch=new int[n+1];
        for(int i=0; i<n; i++){
            b[i]=combi(n-1, i);
        }
        DFS(0, 0);
    }
}
