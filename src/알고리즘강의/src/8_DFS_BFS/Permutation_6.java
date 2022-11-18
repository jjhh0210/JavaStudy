import java.util.Scanner;

public class Permutation_6 {
    static int[] pm, ch, arr;
    static int n, m;

    public static void DFS(int L) {
        if(L==m){
            for (int i = 0; i < m; i++) {
                System.out.print(pm[i] + " ");

            }
            System.out.println();
        }else{
            for (int i = 0; i < n; i++) {
                if(ch[i]==0){
                    ch[i]=1;
                    pm[L] = arr[i];
                    DFS(L + 1);
                    ch[i] = 0;  //리턴 후에는 0으로 다시 체크 풀어줌
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        m=kb.nextInt();
        arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=kb.nextInt();
        ch=new int[n];
        pm=new int[m];
        DFS(0);
    }
}
